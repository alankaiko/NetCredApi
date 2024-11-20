package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Address;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
public class PaymentProfile extends AbstractEntity {
    private String method;

    private boolean isActive;

    private Company company;

    private Customer customer;

    private Address billingAddress;

    private Address shippingAddress;

    private String cardNumber;
    private int expiryMonth;


    private int expiryYear;

    private String brand;

    private String cardHolderName;

    private String token;

    private LocalDateTime voidAt;

    private String rejectedReason;
}
