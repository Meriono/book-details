package com.graphqljava.tutorial.bookdetails.repos;

import com.graphqljava.tutorial.bookdetails.f2db.Fu;
import com.graphqljava.tutorial.bookdetails.f2db.FuDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface fuRepo extends JpaRepository<Fu, Long> {

    @Query(value = "select fuStatus, fuRegdat, fuResursext from Fu where fuObjnr = '01001020003'")
    Iterable<Fu> finding();
    //List<Object[]>}

    Iterable<FuDTO> findAllByFuObjnr(String fuObjnr);
}