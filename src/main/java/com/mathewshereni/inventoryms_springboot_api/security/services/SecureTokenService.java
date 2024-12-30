package com.mathewshereni.inventoryms_springboot_api.security.services;

import com.mathewshereni.inventoryms_springboot_api.security.models.SecureToken;
import com.mathewshereni.inventoryms_springboot_api.security.repositories.SecureTokenRepository;
import org.springframework.stereotype.Service;


public interface SecureTokenService {

    SecureToken createSecureToken();

    void saveSecureToken(SecureToken secureToken);

    SecureToken findByToken(String token);

    void removeToken(SecureToken token);

}