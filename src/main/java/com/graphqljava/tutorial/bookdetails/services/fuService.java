package com.graphqljava.tutorial.bookdetails.services;

import com.graphqljava.tutorial.bookdetails.f2db.Fu;
import com.graphqljava.tutorial.bookdetails.f2db.SmallFuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class fuService {

    @Autowired
    private com.graphqljava.tutorial.bookdetails.repos.fuRepo fuRepo;

    public Iterable<Object[]> getAllByObjnr(String objnr){ return fuRepo.findAllByFuObjnr(objnr);}
}
