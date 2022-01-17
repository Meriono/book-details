package com.graphqljava.tutorial.bookdetails.repos;

import com.graphqljava.tutorial.bookdetails.f2db.Fu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface fuRepo extends JpaRepository<Fu, Long> {

}
