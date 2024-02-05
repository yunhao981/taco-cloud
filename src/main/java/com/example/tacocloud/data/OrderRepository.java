package com.example.tacocloud.data;

import com.example.tacocloud.Order;

public interface OrderRepository {
    Order save(Order order);
}
