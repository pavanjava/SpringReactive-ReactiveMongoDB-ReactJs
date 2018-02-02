package com.spark.api.repos;

import com.spark.api.pojo.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReactiveProductRepository extends ReactiveCrudRepository<Product, String> {
    Flux<Product> findByProductName(String name);
    Mono<Product> findByImeiNumber(String imeiNumber);
}
