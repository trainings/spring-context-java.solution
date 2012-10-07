package org.shop.config;

import org.shop.repository.ItemRepository;
import org.shop.repository.OrderRepository;
import org.shop.repository.ProductRepository;
import org.shop.repository.ProposalRepository;
import org.shop.repository.SellerRepository;
import org.shop.repository.map.ItemMapRepository;
import org.shop.repository.map.OrderMapRepository;
import org.shop.repository.map.ProductMapRepository;
import org.shop.repository.map.ProposalMapRepository;
import org.shop.repository.map.SellerMapRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopRepositoryConfig {
    
    @Bean
    public ItemRepository itemRepository() {
        return new ItemMapRepository();
    }
    
    @Bean
    public OrderRepository orderRepository() {
        return new OrderMapRepository();
    }
    
    @Bean
    public ProductRepository productRepository() {
        return new ProductMapRepository();
    }
    
    @Bean
    public ProposalRepository proposalRepository() {
        return new ProposalMapRepository();
    }
    
    @Bean
    public SellerRepository sellerRepository() {
        return new SellerMapRepository();
    }
}
