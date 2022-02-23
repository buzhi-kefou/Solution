package com.soulmate.database;

public class P184 {

    String sql="select d.name department,c.name employee,c.salary from " +
            "(select name,salary,temp,max from (employee a left join " +
            "(select departmentId temp, max(salary) max from employee a group by departmentId) b on a.departmentId=b.temp))c " +
            "left join department d on c.temp=d.id where salary=max";
}
