package com.example.appliances.service;


import com.example.appliances.entity.Order;
import com.example.appliances.model.request.OrderRequest;
import com.example.appliances.model.request.SaleItemElementRequest;
import com.example.appliances.model.response.OrderResponse;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface OrderService {

    public OrderResponse createOrder(OrderRequest orderRequest);

    public OrderResponse getOrder(Long orderId);

    public void doneOrder(Long orderId);

    public OrderResponse updateOrder(Long orderId, OrderRequest orderRequest);

    public void deleteOrder(Long orderId) ;

    public List<Order> getAllFiltered(LocalDateTime startDate, LocalDateTime endDate, Long status);



//    public OrderResponse createCart(OrderRequest orderRequest);
//
//    public void convertCartToOrder(Long orderId);

    public byte[] generateOrderPdf(Map<String, Object> orderData);

    public Page<OrderResponse> getAll(int page,
                                      int size,
                                      Optional<Boolean> sortOrder,
                                      String sortBy);



    public Page<OrderResponse> getAllByUser(int page,
                                            int size,
                                            Optional<Boolean> sortOrder,
                                            String sortBy);

    public void rejectOrder(Long queueEntryId, SaleItemElementRequest request);

    public void doneOrder(Long saleItemId, SaleItemElementRequest request);

    public void sendOrder(Long saleItemId, SaleItemElementRequest request);

    public Long countAllOrders();

    public Long countSuccessfulOrders();

    public Long countUnsuccessfulOrders();
}
