package com.hjy.dao;

import com.hjy.models.Emp;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository //扫描Dao
public class EmpDao{

    @Resource
    private JdbcTemplate template;//注入

    public void save(Emp emp) {
        String sql = "insert into emp " +
                "(name,salary,age) values (?,?,?)";
        Object[] params = {
                emp.getName(),
                emp.getSalary(),
                emp.getAge()
        };
        template.update(sql,params);
    }
    public void delete(int id) {
        String sql = "delete from emp " +
                "where id=?";
        Object[] params = {id};
        template.update(sql,params);
    }
}
