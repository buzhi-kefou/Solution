package com.soulmate.database;

public class P175 {
    String sql="select FirstName,LastName,City,State from Person a left join Address b on a.PersonId = b.PersonId";
}
