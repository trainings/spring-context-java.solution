package org.shop.config;

import org.shop.DataInitializer;
import org.shop.ProductInitializer;
import org.shop.ProposalInitializer;
import org.shop.api.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopInitializerConfig {

    @Autowired
    private ProductService productService;
    
    @Bean
    public DataInitializer dataInitializer() {
        return new DataInitializer();
    }
    
    @Bean
    public ProductInitializer productInitializer() {
        return new ProductInitializer(productService);
    }
    
    @Bean
    public ProposalInitializer proposalInitializer() {
        return new ProposalInitializer();
    }
}
