package com.bitcamp.web.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Customer
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@ToString
@Table(name = "customers")
public class Customer implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name="customer_id") private String custumerId; //대소문자 구분
    @Column(name="customer_name") private String customerName;
    @Column(name="password") private String password; 
    @Column(name="ssn") private String ssn; 
    @Column(name="phone") private String phone; 
    @Column(name="city") private String city; 
    @Column(name="address") private String address; 
    @Column(name="postalcode") private String postalcode;
    @Column(name="photo") private String photo;

    public String toString(){
        return String.format("고객정보 No: %d\n"
        +" ID: %s", id, custumerId); //숫자면 NO로 들어가고 문자면 ID로 들어감
    }
    @Builder
    private Customer(String customerId, //순서도 중요
                    String customerName,
                    String password, 
                    String ssn, 
                    String phone, 
                    String city, 
                    String address, 
                    String postalcode, 
                    String photo
    ){
        this.custumerId   = customerId;
        this.customerName = customerName;
        this.password     = password;
        this.ssn          = ssn;
        this.phone        = phone;
        this.city         = city;
        this.address      = address;
        this.postalcode   = postalcode;
        this.photo        = photo;
    }

}