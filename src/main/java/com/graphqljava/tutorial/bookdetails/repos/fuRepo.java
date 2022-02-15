package com.graphqljava.tutorial.bookdetails.repos;

import com.graphqljava.tutorial.bookdetails.f2db.Fu;
import com.graphqljava.tutorial.bookdetails.f2db.SmallFuInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;

@Repository
public interface fuRepo extends JpaRepository<Fu, Long> {

    @Query(value = "select fuStatus, fuRegdat, fuResursext, fuObjnr from Fu where fuObjnr = :objnr")
    Iterable<Object[]> findAllByFuObjnr(String objnr);


}