package com.demsscash.shopapi.service;

import com.demsscash.shopapi.entity.ProductInOrder;
import com.demsscash.shopapi.entity.User;

/**
 * Created By Zhu Lin on 1/3/2019.
 */
public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
