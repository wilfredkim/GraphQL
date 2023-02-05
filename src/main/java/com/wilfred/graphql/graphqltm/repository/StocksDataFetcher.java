package com.wilfred.graphql.graphqltm.repository;

import com.wilfred.graphql.graphqltm.models.StockDetails;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StocksDataFetcher implements DataFetcher<List<StockDetails>> {
    @Override
    public List<StockDetails> get(DataFetchingEnvironment dataFetchingEnvironment) {
        StockDetails stockDetails = new StockDetails();
        stockDetails.setTicker("001");
        stockDetails.setStockValue("100KG");
        stockDetails.setVolume("100KG");
        stockDetails.setAverageVolume("50KG");
        stockDetails.setPE_Ratio("5:5");
        stockDetails.setEPS("2.5.8");
        stockDetails.setDividend("2.3");
        stockDetails.setMarketCap("2");
        stockDetails.setPreviousOpen("2");
        stockDetails.setPreviousClose("2");
        List<StockDetails> stockDetailsList = new ArrayList<>();
        stockDetailsList.add(stockDetails);
        return stockDetailsList;


    }
}
