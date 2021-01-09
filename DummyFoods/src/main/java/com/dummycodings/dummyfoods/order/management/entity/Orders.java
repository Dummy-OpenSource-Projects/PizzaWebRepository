/*
 * This is belong to Dummy Organization
 * 
 * 
 */
package com.dummycodings.dummyfoods.order.management.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author KarthickRaj.R at Dummy Organization
 */
@Data
@Entity
@Table(name = "dc_orderdetails")
public class Orders implements Serializable {

    @Id
    @Column(name = "ORDER_ID", nullable = false)
    private String orderId;
    @Column(name = "USER_ID", nullable = false)
    private String userId;
    @Column(name = "EMAIL_ID", nullable = false)
    private String emailId;
    @Column(name = "PHONE_NUMBER", nullable = false)
    private String phone;
    @Column(name = "ADDRESS", nullable = false)
    private String address;
    @Column(name = "COUPON")
    private String coupon;
    @Column(name = "DISCOUNT")
    private int discount;
    @Column(name = "STATUS", nullable = false)
    private String status;
    @Column(name = "CREATED_AT", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "UPDATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
}
