package com.wojduki.payment_validation_service.utilities;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

public class TicketsDeliveryClientConfig {

    @Bean
    public TicketsDeliveryClient createticketsDeliveryClient() {
        RestClient restClient = RestClient.builder()
                .baseUrl("http://TICKETS-DELIVERY-SERVICE")
                .build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(TicketsDeliveryClient.class);
    }
}
