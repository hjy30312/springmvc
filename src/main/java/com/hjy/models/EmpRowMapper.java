package com.hjy.models;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 将Emp记录封装成Emp对象
 */
public class EmpRowMapper implements RowMapper<Emp> {

    public Emp mapRow(
            ResultSet resultSet, int i) throws SQLException {
        Emp emp = new Emp();
        emp.setId(resultSet.getInt("id"));
        emp.setName(resultSet.getString("name"));
        emp.setSalary(resultSet.getDouble("salary"));
        emp.setAge(resultSet.getInt("age"));

        return emp;
    }
}
