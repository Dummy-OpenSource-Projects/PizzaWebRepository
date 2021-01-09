/*
 * This is belong to Dummy Organization
 * 
 * 
 */
package com.dummycodings.dummyfoods.order.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dummycodings.dummyfoods.order.management.entity.Orders;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author KarthickRaj.R at Dummy Organization
 */
public interface OrdersManageRepository extends JpaRepository<Orders, String>, JpaSpecificationExecutor<Orders> {

}
