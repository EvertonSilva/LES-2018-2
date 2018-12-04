package br.com.everton.les2018.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@Table(name = "overdue_fines")
public class OverdueFine extends DomainEntity {

    @OneToOne
    private BookLoan loan;

    @OneToOne
    private Payment payment;

    @Column
    private BigDecimal fee = new BigDecimal(1);

    public OverdueFine() {
    }

    public BookLoan getLoan() {
        return loan;
    }

    public void setLoan(BookLoan loan) {
        this.loan = loan;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @JsonGetter
    public BigDecimal calcFeeAmount() {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime dueDate = this.loan.getPeriod().getEndDate();
        long overdueDays = Duration.between(dueDate, today).toDays();

        return this.fee.multiply(new BigDecimal(overdueDays));
    }
}
