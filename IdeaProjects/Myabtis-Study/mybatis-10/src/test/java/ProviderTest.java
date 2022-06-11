import com.kuang.dao.ProviderMapper;
import com.kuang.pojo.Provider;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ProviderTest {

    @Test
    public void add() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider = new Provider();
        provider.setId(16);
        provider.setProCode("新添加的");
        provider.setProName("张朋");
        provider.setProDesc("主营app");
        mapper.add(provider);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getProviderList()throws Exception{
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        /*Provider provider = new Provider();
        provider.setProName("张");
        provider.setProCode("新");*/
        List<Provider> providerList = mapper.getProviderList("张","新");
        for (Provider provider : providerList) {
            System.out.println(provider);
        }
        sqlSession.close();
    }

    @Test
    public void deleteProviderById()throws Exception{
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        mapper.deleteProviderById(16);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void  getProviderById()throws Exception{
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider = mapper.getProviderById("1");
        System.out.println(provider);
        sqlSession.close();
    }

    @Test
    public void modify()throws Exception{
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider = new Provider();
        provider.setProCode("修改proCode");
        provider.setProName("修改proName");
        provider.setId(1);
        mapper.modify(provider);
        sqlSession.commit();
        sqlSession.close();
    }
}
