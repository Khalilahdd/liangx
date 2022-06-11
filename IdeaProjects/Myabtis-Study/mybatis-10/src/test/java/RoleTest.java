import com.kuang.dao.RoleMapper;
import com.kuang.pojo.Role;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class RoleTest {

    @Test
    public void getRoleList() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        List<Role> roleList = mapper.getRoleList();
        for (com.kuang.pojo.Role role : roleList) {
            System.out.println(role);
        }
        sqlSession.close();

    }

    @Test
    public void add() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        Role role = new Role();
        role.setId(4);
        role.setRoleCode("zz");
        role.setRoleName("张Boss");
        mapper.add(role);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteRoleById() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        mapper.deleteRoleById("4");//字符串类型和整形都可以？
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void modify() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        Role role = new Role();
        role.setRoleCode("zpBoss");
        role.setRoleName("张Boss大大");
        role.setId(4);
        mapper.modify(role);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getRoleById()throws Exception{
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        Role role = mapper.getRoleById(1);
        System.out.println(role);
        sqlSession.close();
    }

    @Test
    public void roleCodeIsExist()throws Exception{
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
        int cout = mapper.roleCodeIsExist("SMBMS_ADMIN");
        System.out.println(cout);
        sqlSession.close();
    }
}
