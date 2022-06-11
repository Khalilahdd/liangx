import com.kuang.dao.BillMapper;
import com.kuang.pojo.Bill;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class BillTest {

    //根据供应商Id查询订单数量
    @Test
    public void getBillCountByProviderId(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        int count = mapper.getBillCountByProviderId(3);
        System.out.println("供应商Id为：3的供应"+count+"种商品");
        sqlSession.close();
    }

    //增加订单
    @Test
    public void add(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Bill bill = new Bill();
        bill.setId(19);
        bill.setBillCode("BILL2016_019");
        mapper.add(bill);
        sqlSession.commit();
        sqlSession.close();
    }

    //通过条件查询，查询供货商数量,模糊查询
    @Test
    public void getBillList()throws Exception{
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
       /* Bill bill = new Bill();
        bill.setProductName("油");
        bill.setBillCode("1");
        bill.setProviderId(2);*/
        List<Bill> billList = mapper.getBillList("油", "1", "1",
                0, 2);
        for (Bill bill : billList) {
            System.out.println(bill);
        }
        sqlSession.close();
    }

    //    通过id,删除
    @Test
    public void deleteBillById()throws Exception{
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        mapper.deleteBillById(19);
        sqlSession.commit();
        sqlSession.close();

    }

    //通过billId获取Bill
    @Test
    public void getBillById() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Bill bill = mapper.getBillById(2);
        System.out.println(bill);
        sqlSession.close();

    }

    //修改订单信息
    @Test
    public void modify()throws Exception{
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Bill bill = new Bill();
        bill.setProductName("爽歪歪");
        bill.setId(18);
        mapper.modify(bill);
        sqlSession.commit();
        sqlSession.close();
    }
}
