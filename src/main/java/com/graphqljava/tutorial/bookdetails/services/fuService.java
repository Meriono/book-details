package com.graphqljava.tutorial.bookdetails.services;

import com.graphqljava.tutorial.bookdetails.f2db.Fu;
import com.graphqljava.tutorial.bookdetails.f2db.FuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class fuService {

    @Autowired
    private com.graphqljava.tutorial.bookdetails.repos.fuRepo fuRepo;

    public Iterable<Fu> getAll(){ return fuRepo.finding();}
    public Iterable<FuDTO> getAlls(){ return fuRepo.findAllByFuObjnr("01001020003");}
}
