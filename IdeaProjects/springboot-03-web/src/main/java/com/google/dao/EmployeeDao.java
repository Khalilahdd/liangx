package com.google.dao;

import com.google.pojo.Department;
import com.google.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//员工Dao
@Repository
public class EmployeeDao {

    //模拟数据库中的数据
    private static Map<Integer, Employee> employees = null;

    //员工有所属的部门
    @Autowired
    private DepartmentDao departmentDao;

    static {

        employees = new HashMap<Integer, Employee>();//创建一个部门表

        employees.put(1001, new Employee(1001, "AA", "A124124515@qq.com", 0, new Department(105, "小卖部")));
        employees.put(1002, new Employee(1002, "CC", "B124124515@qq.com", 1, new Department(105, "小卖部")));
        employees.put(1003, new Employee(1003, "BB", "C124124515@qq.com", 0, new Department(105, "小卖部")));
        employees.put(1004, new Employee(1004, "EE", "D124124515@qq.com", 1, new Department(105, "小卖部")));
        employees.put(1005, new Employee(1005, "DD", "E124124515@qq.com", 0, new Department(105, "小卖部")));

    }

    //主键自增
    private static Integer initId = 1006;

    //增加一个员工
    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }

        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));

        employees.put(employee.getId(),employee);

    }

    //查询全部员工信息
    public Collection<Employee> getAll() {
        return employees.values();
    }

    //通过id查询员工
    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }

    //删除员工通过id
    public void delete(Integer id){
        employees.remove(id);
    }

}
