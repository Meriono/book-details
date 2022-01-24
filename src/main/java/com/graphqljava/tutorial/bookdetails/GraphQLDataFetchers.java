package com.graphqljava.tutorial.bookdetails;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.graphqljava.tutorial.bookdetails.f2db.SmallFuInfo;
import com.graphqljava.tutorial.bookdetails.services.fuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import graphql.schema.DataFetcher;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class GraphQLDataFetchers {

    @Autowired
    private fuService fuService2;

    Type type = new TypeToken<Map<String, String>>() {}.getType();


    private List<Map<String, String>> getSmallFu(String objnr) {
        List<SmallFuInfo> dbSmallFu = new ArrayList<>();

        Iterable<Object[]> o = fuService2.getAllByObjnr(objnr);

        o.forEach(objects ->
                dbSmallFu.add(new SmallFuInfo(objects))
                );

        List<Map<String, String>> smallFu = new ArrayList<>();

        dbSmallFu.forEach((fus1 -> {
            Gson gson = new Gson();
            String json = gson.toJson(fus1);
            Map<String, String> myMap = gson.fromJson(json, type);

            smallFu.add(myMap);

        }));

        return smallFu;
    }


    public DataFetcher getFuByObjnrDataFetcher() {
        return dataFetchingEnvironment -> {
            String objnr = dataFetchingEnvironment.getArgument("objnr");
            return getSmallFu(objnr);

        };
    }
}
