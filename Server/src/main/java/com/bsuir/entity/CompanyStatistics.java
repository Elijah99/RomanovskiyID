package com.bsuir.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "t_company_statistics")
public class CompanyStatistics implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date date;

    @Column
    private Float long_term_duties;

    @Column
    private Float assets;

    @Column
    private Float equity;

    @Column
    private Float short_term_obligations;

    @Column
    private Float fixed_assets;

    @Column
    private Float current_assets;

    @Column
    private Float cash;

    @Column
    private Float financial_investments;

    @Column
    private Float net_profit;

    @Column
    private Float revenue;

    @Column
    private Float sales_proceeds;

    @Column
    private Float average_receivables;

    @Column
    private Float average_accounts_payable;

    @Column
    private Float average_stocks;

    @ManyToOne(targetEntity = Company.class)
    private Company company;

    public CompanyStatistics() {
    }

    public CompanyStatistics(Long id, Date date, Float long_term_duties, Float assets, Float equity, Float short_term_obligations, Float fixed_assets, Float current_assets, Float cash, Float financial_investments, Float net_profit, Float revenue, Float sales_proceeds, Float average_receivables, Float average_accounts_payable, Float average_stocks, Company company) {
        this.id = id;
        this.date = date;
        this.long_term_duties = long_term_duties;
        this.assets = assets;
        this.equity = equity;
        this.short_term_obligations = short_term_obligations;
        this.fixed_assets = fixed_assets;
        this.current_assets = current_assets;
        this.cash = cash;
        this.financial_investments = financial_investments;
        this.net_profit = net_profit;
        this.revenue = revenue;
        this.sales_proceeds = sales_proceeds;
        this.average_receivables = average_receivables;
        this.average_accounts_payable = average_accounts_payable;
        this.average_stocks = average_stocks;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getLong_term_duties() {
        return long_term_duties;
    }

    public void setLong_term_duties(Float long_term_duties) {
        this.long_term_duties = long_term_duties;
    }

    public Float getAssets() {
        return assets;
    }

    public void setAssets(Float assets) {
        this.assets = assets;
    }

    public Float getEquity() {
        return equity;
    }

    public void setEquity(Float equity) {
        this.equity = equity;
    }

    public Float getShort_term_obligations() {
        return short_term_obligations;
    }

    public void setShort_term_obligations(Float short_term_obligations) {
        this.short_term_obligations = short_term_obligations;
    }

    public Float getFixed_assets() {
        return fixed_assets;
    }

    public void setFixed_assets(Float fixed_assets) {
        this.fixed_assets = fixed_assets;
    }

    public Float getCurrent_assets() {
        return current_assets;
    }

    public void setCurrent_assets(Float current_assets) {
        this.current_assets = current_assets;
    }

    public Float getCash() {
        return cash;
    }

    public void setCash(Float cash) {
        this.cash = cash;
    }

    public Float getFinancial_investments() {
        return financial_investments;
    }

    public void setFinancial_investments(Float financial_investments) {
        this.financial_investments = financial_investments;
    }

    public Float getNet_profit() {
        return net_profit;
    }

    public void setNet_profit(Float net_profit) {
        this.net_profit = net_profit;
    }

    public Float getRevenue() {
        return revenue;
    }

    public void setRevenue(Float revenue) {
        this.revenue = revenue;
    }

    public Float getSales_proceeds() {
        return sales_proceeds;
    }

    public void setSales_proceeds(Float sales_proceeds) {
        this.sales_proceeds = sales_proceeds;
    }

    public Float getAverage_receivables() {
        return average_receivables;
    }

    public void setAverage_receivables(Float average_receivables) {
        this.average_receivables = average_receivables;
    }

    public Float getAverage_accounts_payable() {
        return average_accounts_payable;
    }

    public void setAverage_accounts_payable(Float average_accounts_payable) {
        this.average_accounts_payable = average_accounts_payable;
    }

    public Float getAverage_stocks() {
        return average_stocks;
    }

    public void setAverage_stocks(Float average_stocks) {
        this.average_stocks = average_stocks;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
