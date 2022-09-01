package io.finan.controller;

import io.finan.model.NewStock;
import io.finan.model.Stock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("stocks")
public class FinAnController {

    //ololo22
    @GetMapping
    public List<Stock> getStocks() {
        return List.of(new Stock("AAPL"), new Stock("GOOGL"),new NewStock("property"));
    }
}
