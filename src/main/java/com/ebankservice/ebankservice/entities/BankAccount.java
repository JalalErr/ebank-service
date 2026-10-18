package com.ebankservice.ebankservice.entities;

import com.ebankservice.ebankservice.enums.AccountType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import javax.annotation.processing.Generated;
import java.util.Date;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder
public class BankAccount {

    @Id
    private String id;
    private String currency;
    private double balance;
    private Date createdAt;
    private AccountType type;
}
