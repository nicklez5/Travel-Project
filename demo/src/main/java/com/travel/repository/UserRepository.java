package com.travel.repository;

public interface UserRepository extends CrudRepository<User,Long>{

    User getUserByEmail(String email);
}