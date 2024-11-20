package br.com.netcred.NetCredApi.model;

import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BillingInfo extends AbstractEntity {
    private String billingAddressNumber;

    private String billingAddressStreet;

    private String billingAddressDistrict;

    private String billingAddressCity;

    private String billingAddressState;

    private String billingAddressAdditionalDetails;

    private String billingAddressZipCode;

    private String shippingAddressNumber;

    private String shippingAddressStreet;

    private String shippingAddressDistrict;

    private String shippingAddressCity;

    private String shippingAddressState;

    private String shippingAddressAdditionalDetails;

    private String shippingAddressZipCode;

    private String customerName;

    private String customerEmail;

    private String customerDocumentType;

    private String customerDocument;

    private String customerPhone;

    private LocalDate customerBirthDate;

    private String customerGender;
}
