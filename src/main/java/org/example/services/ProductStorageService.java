package org.example.services;

import org.example.models.Gift;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductStorageService {

    private static final Logger logger = LoggerFactory.getLogger(ProductStorageService.class);
    
    public Gift checkAvailability(Gift gift) {
        logger.info("Checking availability of {} ", gift.getProductName());
        
        gift.setAvailable(Boolean.TRUE);

        return gift;
    }


}