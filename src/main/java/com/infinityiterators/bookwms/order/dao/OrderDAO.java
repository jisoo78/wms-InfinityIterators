package com.infinityiterators.bookwms.order.dao;

import com.infinityiterators.bookwms.order.dto.OrderDTO;
import com.infinityiterators.bookwms.order.dto.OrderItemDTO;
import com.infinityiterators.bookwms.order.mapper.OrderMapper;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.infinityiterators.bookwms.utils.database.MyBatisTemplate.getSqlSession;

public class OrderDAO {

    public int insertOrder(OrderDTO order) {
        try (SqlSession sqlSession = getSqlSession()) {
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            int result = orderMapper.insertOrder(order);
            sqlSession.commit();
            return result;
        }
    }

    public OrderDTO selectOrderById(int orderId) {
        try (SqlSession sqlSession = getSqlSession()) {
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            return orderMapper.selectOrderById(orderId);
        }
    }

    public List<OrderDTO> selectAllOrders() {
        try (SqlSession sqlSession = getSqlSession()) {
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            return orderMapper.selectAllOrders();
        }
    }

    public int updateOrder(OrderDTO order) {
        try (SqlSession sqlSession = getSqlSession()) {
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            int result = orderMapper.updateOrder(order);
            sqlSession.commit();
            return result;
        }
    }

    public int deleteOrder(int orderId) {
        try (SqlSession sqlSession = getSqlSession()) {
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            int result = orderMapper.deleteOrder(orderId);
            sqlSession.commit();
            return result;
        }
    }

    public int insertOrderItem(OrderItemDTO orderItem) {
        try (SqlSession sqlSession = getSqlSession()) {
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            int result = orderMapper.insertOrderItem(orderItem);
            sqlSession.commit();
            return result;
        }
    }
}