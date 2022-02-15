package com.graphqljava.tutorial.bookdetails;

import com.graphqljava.tutorial.bookdetails.f2db.SmallFuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/db")
public class ControllerTestingDB {
    @Autowired
    GraphQLProvider graphQLProvider;

    @Autowired
    private com.graphqljava.tutorial.bookdetails.services.fuService fuService;


    @GetMapping(path = "/fu/all")
    public @ResponseBody Iterable<Object[]> getAllFu(){
        return fuService.getAllByObjnr("01001020003");
    }

    @GetMapping(path = "/fu/alls")
    public @ResponseBody Iterable<SmallFuInfo> getAllFus(){
        List<SmallFuInfo> dbSmallFu = new ArrayList<>();

        Iterable<Object[]> o = fuService.getAllByObjnr("01001020003");

        o.forEach(objects ->
                dbSmallFu.add(new SmallFuInfo(objects[0].toString(), objects[1].toString(), objects[2].toString(), objects[3].toString()))
        );
        return dbSmallFu;
    }


    @GetMapping(path = "/testing")
    public @ResponseBody String getTest(@PathParam("objnr") String objnr){
        graphQLProvider.printGraphQL(objnr);
        return "hello";
    }
}
