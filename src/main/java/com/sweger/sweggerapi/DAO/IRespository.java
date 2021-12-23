package com.sweger.sweggerapi.DAO;

import com.sweger.sweggerapi.Model.MyClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRespository extends CrudRepository<MyClass,Long> {
}
