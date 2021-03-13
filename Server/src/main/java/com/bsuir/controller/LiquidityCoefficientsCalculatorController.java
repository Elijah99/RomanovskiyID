package com.bsuir.controller;

import com.bsuir.calculator.Calculator;
import com.bsuir.calculator.CalculatorException;
import com.bsuir.calculator.LiquidityCalculator;
import com.bsuir.entity.CoefficientsStatistics;
import com.bsuir.entity.CompanyStatistics;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class LiquidityCoefficientsCalculatorController {

    @GetMapping(value = "/calculate-liquidity/{date}/{current_assets}" +
            "/{short_term_obligations}/{cash}/{financial_investments}/")
    public String calculateLiquidity(@PathVariable("date") Date date,
                                     @PathVariable("current_assets") Float current_assets,
                                     @PathVariable("short_term_obligations") Float short_term_obligations,
                                     @PathVariable("cash") Float cash,
                                     @PathVariable("financial_investments") Float financial_investments) throws CalculatorException {
        CompanyStatistics statistics= new CompanyStatistics();
        statistics.setDate(date);
        statistics.setCurrent_assets(current_assets);
        statistics.setShort_term_obligations(short_term_obligations);
        statistics.setCash(cash);
        statistics.setFinancial_investments(financial_investments);

        Calculator calculator= new LiquidityCalculator();
        CoefficientsStatistics result = calculator.calculate(statistics);

        Gson gson = new Gson();
        String coeffJson = gson.toJson(result);
        return coeffJson;
    }
}
