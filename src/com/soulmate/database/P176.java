package com.soulmate.database;

public class P176 {
    String sql="select max(salary) SecondHighestSalary from employee a where a.salary < (select max(salary) from employee)";
    String better="select ifnull((select distinct salary from employee order by salary desc limit 1,1),null) as SecondHighestSalary";
}
