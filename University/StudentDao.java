package com.springboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentDao extends CrudRepository<Student, String> {

}
