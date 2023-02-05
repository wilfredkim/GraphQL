package com.wilfred.graphql.graphqltm.controllers;

import com.wilfred.graphql.graphqltm.services.GraphQLService;
import graphql.ExecutionResult;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GraphQLController {
    @Autowired
    private GraphQLService graphQLService;




    @RequestMapping(value = "/stockData")
    public String getStockDataDetails(@RequestBody String query) {
        ExecutionResult executionResult = graphQLService.initiateGraphQL().execute(query);
        Map<String, String> map = executionResult.getData();
        org.json.JSONObject jsonObject = new JSONObject(map);
        return jsonObject.toString();
    }

}
