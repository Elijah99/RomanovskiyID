package com.bsuir.calculator;

import com.bsuir.entity.CoefficientsStatistics;
import com.bsuir.entity.CompanyStatistics;

public interface Calculator {
    CoefficientsStatistics calculate(CompanyStatistics statistics) throws CalculatorException;
}
