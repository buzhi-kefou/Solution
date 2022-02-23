package com.soulmate.database;

public class P185 {
    String sql="select d.`name` department, c.name employee, c.salary from " +
            "(select name,salary,departmentId,(select count(distinct salary) from " +
            "employee b where b.departmentId=a.departmentId and b.salary>a.salary ) as `rank` " +
            "from employee a) c left join department d on c.departmentId=d.id where c.`rank`<3";

    String better="select department,employee,salary from (" +
            "select b.name department,a.name employee,salary,departmentId," +
            "if(@`D` = departmentId,if(@`S` > salary,@`R` := @`R`+1,@`R`),@`R` := 1) `rank`,@`D` := a.departmentId prevD,@`S` := a.salary prevS " +
            "from (select @`R` := 0, @`D` := null, @`S` := null,name,salary,departmentId from employee ORDER BY departmentId,salary desc) a " +
            "left join department b on a.departmentId=b.id ) c " +
            "where c.`rank` <= 3";
}
