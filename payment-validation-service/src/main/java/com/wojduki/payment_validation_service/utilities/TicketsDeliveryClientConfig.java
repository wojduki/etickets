package com.wojduki.payment_validation_service.utilities;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
@Configuration
public class TicketsDeliveryClientConfig {
    @Bean
    @LoadBalanced
    public RestClient.Builder getRestClient(){
        return RestClient.builder();
        //dodano load balanced, nadal nie widzi Ticket...
    }

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
