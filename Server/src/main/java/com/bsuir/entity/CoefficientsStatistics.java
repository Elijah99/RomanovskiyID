package com.bsuir.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "t_coefficients_statistics")
public class CoefficientsStatistics  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(targetEntity = CompanyStatistics.class)
    private CompanyStatistics companyStatistics;

    @Column
    private Float accounts_receivable_turnover; // Коэффициент оборачиваемости дебиторской задолженности

    @Column
    private Float accounts_payable_turnover; //Коэффициент оборачиваемости кредиторской задолженности

    @Column
    private Float inventory_turnover; //Коэффициент оборачиваемости запасов

    @Column
    private Float return_on_assets; //Рентабельность активов

    @Column
    private Float return_on_equity; // Рентабельность собственного капитала

    @Column
    private Float return_on_sales; //Рентабельность продаж

    @Column
    private Float current_liquidity; //Коэффициент текущей ликвидности

    @Column
    private Float absolute_liquidity; // Коэффициент абсолютной ликвидности

    @Column
    private Float quick_liquidity; //Коэффициент быстрой ликвидности

    @Column
    private Float autonomy; //Коэффициент автономии

    @Column
    private Float capitalization; //Коэффициент капитализации

    @Column
    private Float provision_with_own_assets; //Коэффициент обеспеченности собственными оборотными средствами

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CompanyStatistics getCompanyStatistics() {
        return companyStatistics;
    }

    public CoefficientsStatistics() {
    }

    public CoefficientsStatistics(Long id, CompanyStatistics companyStatistics, Float accounts_receivable_turnover, Float accounts_payable_turnover, Float inventory_turnover, Float return_on_assets, Float return_on_equity, Float return_on_sales, Float current_liquidity, Float absolute_liquidity, Float quick_liquidity, Float autonomy, Float capitalization, Float provision_with_own_assets) {
        this.id = id;
        this.companyStatistics = companyStatistics;
        this.accounts_receivable_turnover = accounts_receivable_turnover;
        this.accounts_payable_turnover = accounts_payable_turnover;
        this.inventory_turnover = inventory_turnover;
        this.return_on_assets = return_on_assets;
        this.return_on_equity = return_on_equity;
        this.return_on_sales = return_on_sales;
        this.current_liquidity = current_liquidity;
        this.absolute_liquidity = absolute_liquidity;
        this.quick_liquidity = quick_liquidity;
        this.autonomy = autonomy;
        this.capitalization = capitalization;
        this.provision_with_own_assets = provision_with_own_assets;
    }

    public CoefficientsStatistics(Float current_liquidity, Float absolute_liquidity, Float quick_liquidity) {
        this.current_liquidity = current_liquidity;
        this.absolute_liquidity = absolute_liquidity;
        this.quick_liquidity = quick_liquidity;
    }

    public void setCompanyStatistics(CompanyStatistics companyStatistics) {
        this.companyStatistics = companyStatistics;
    }

    public Float getAccounts_receivable_turnover() {
        return accounts_receivable_turnover;
    }

    public void setAccounts_receivable_turnover(Float accounts_receivable_turnover) {
        this.accounts_receivable_turnover = accounts_receivable_turnover;
    }

    public Float getAccounts_payable_turnover() {
        return accounts_payable_turnover;
    }

    public void setAccounts_payable_turnover(Float accounts_payable_turnover) {
        this.accounts_payable_turnover = accounts_payable_turnover;
    }

    public Float getInventory_turnover() {
        return inventory_turnover;
    }

    public void setInventory_turnover(Float inventory_turnover) {
        this.inventory_turnover = inventory_turnover;
    }

    public Float getReturn_on_assets() {
        return return_on_assets;
    }

    public void setReturn_on_assets(Float return_on_assets) {
        this.return_on_assets = return_on_assets;
    }

    public Float getReturn_on_equity() {
        return return_on_equity;
    }

    public void setReturn_on_equity(Float return_on_equity) {
        this.return_on_equity = return_on_equity;
    }

    public Float getReturn_on_sales() {
        return return_on_sales;
    }

    public void setReturn_on_sales(Float return_on_sales) {
        this.return_on_sales = return_on_sales;
    }

    public Float getCurrent_liquidity() {
        return current_liquidity;
    }

    public void setCurrent_liquidity(Float current_liquidity) {
        this.current_liquidity = current_liquidity;
    }

    public Float getAbsolute_liquidity() {
        return absolute_liquidity;
    }

    public void setAbsolute_liquidity(Float absolute_liquidity) {
        this.absolute_liquidity = absolute_liquidity;
    }

    public Float getQuick_liquidity() {
        return quick_liquidity;
    }

    public void setQuick_liquidity(Float quick_liquidity) {
        this.quick_liquidity = quick_liquidity;
    }

    public Float getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(Float autonomy) {
        this.autonomy = autonomy;
    }

    public Float getCapitalization() {
        return capitalization;
    }

    public void setCapitalization(Float capitalization) {
        this.capitalization = capitalization;
    }

    public Float getProvision_with_own_assets() {
        return provision_with_own_assets;
    }

    public void setProvision_with_own_assets(Float provision_with_own_assets) {
        this.provision_with_own_assets = provision_with_own_assets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoefficientsStatistics that = (CoefficientsStatistics) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(companyStatistics, that.companyStatistics) &&
                Objects.equals(accounts_receivable_turnover, that.accounts_receivable_turnover) &&
                Objects.equals(accounts_payable_turnover, that.accounts_payable_turnover) &&
                Objects.equals(inventory_turnover, that.inventory_turnover) &&
                Objects.equals(return_on_assets, that.return_on_assets) &&
                Objects.equals(return_on_equity, that.return_on_equity) &&
                Objects.equals(return_on_sales, that.return_on_sales) &&
                Objects.equals(current_liquidity, that.current_liquidity) &&
                Objects.equals(absolute_liquidity, that.absolute_liquidity) &&
                Objects.equals(quick_liquidity, that.quick_liquidity) &&
                Objects.equals(autonomy, that.autonomy) &&
                Objects.equals(capitalization, that.capitalization) &&
                Objects.equals(provision_with_own_assets, that.provision_with_own_assets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyStatistics, accounts_receivable_turnover, accounts_payable_turnover, inventory_turnover, return_on_assets, return_on_equity, return_on_sales, current_liquidity, absolute_liquidity, quick_liquidity, autonomy, capitalization, provision_with_own_assets);
    }

    @Override
    public String toString() {
        return "CoefficientsStatistics{" +
                "id=" + id +
                ", companyStatistics=" + companyStatistics +
                ", accounts_receivable_turnover=" + accounts_receivable_turnover +
                ", accounts_payable_turnover=" + accounts_payable_turnover +
                ", inventory_turnover=" + inventory_turnover +
                ", return_on_assets=" + return_on_assets +
                ", return_on_equity=" + return_on_equity +
                ", return_on_sales=" + return_on_sales +
                ", current_liquidity=" + current_liquidity +
                ", absolute_liquidity=" + absolute_liquidity +
                ", quick_liquidity=" + quick_liquidity +
                ", autonomy=" + autonomy +
                ", capitalization=" + capitalization +
                ", provision_with_own_assets=" + provision_with_own_assets +
                '}';
    }
}
