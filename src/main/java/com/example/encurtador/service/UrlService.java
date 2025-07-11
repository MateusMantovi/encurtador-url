package com.example.encurtador.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.encurtador.model.Url;
import com.example.encurtador.repository.UrlRepository;

@Service // Marca esta classe como um serviço gerenciado pelo Spring
public class UrlService {

    private final UrlRepository urlRepository;

    // Injeção de dependência: O Spring nos dá uma instância do UrlRepository
    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public Url encurtarUrl(String originalUrl) {
        Url novaUrl = new Url();
        novaUrl.setOriginalUrl(originalUrl);
        // Lógica simples para gerar um código curto. Pega 8 caracteres aleatórios.
        novaUrl.setShortCode(UUID.randomUUID().toString().substring(0, 8));

        // Salva a nova URL no banco de dados e a retorna
        return urlRepository.save(novaUrl);
    }

    public String obterUrlOriginal(String shortCode) {
        // Busca no banco pelo código curto. Se não encontrar, retorna null.
        return urlRepository.findByShortCode(shortCode)
                .map(Url::getOriginalUrl) // Se encontrou, pega a URL original
                .orElse(null); // Se não, retorna nulo
    }
}