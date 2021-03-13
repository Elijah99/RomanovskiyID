package com.bsuir.calculator;

import com.bsuir.entity.CoefficientsStatistics;
import com.bsuir.entity.CompanyStatistics;

public class LiquidityCalculator implements Calculator {

    @Override
    public CoefficientsStatistics calculate(CompanyStatistics statistics) throws CalculatorException {
        CoefficientsStatistics result = new CoefficientsStatistics();
        try {
            float currentLiquidity = statistics.getCurrent_assets() / statistics.getShort_term_obligations();
            float absoluteLiquidity = statistics.getCash() / statistics.getShort_term_obligations();
            float quickLiquidity = (statistics.getCurrent_assets() - statistics.getFinancial_investments()) /
                    statistics.getShort_term_obligations();

            result.setCurrent_liquidity(currentLiquidity);
            result.setAbsolute_liquidity(absoluteLiquidity);
            result.setQuick_liquidity(quickLiquidity);
        } catch (Exception e) {
            throw new CalculatorException("Calculator exception", e);
        }
        return result;
    }
}
