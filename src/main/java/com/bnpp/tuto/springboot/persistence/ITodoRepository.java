package com.bnpp.tuto.springboot.persistence;

import com.bnpp.tuto.springboot.business.Todo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.repository.CrudRepository;

@Configuration
@EnableJdbcRepositories("com.bnpp.tuto.springboot.business")
public interface ITodoRepository extends CrudRepository<Todo, Integer>{

}
