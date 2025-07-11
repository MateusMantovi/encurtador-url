package com.example.encurtador.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.encurtador.model.Url;
import com.example.encurtador.service.UrlService;

import jakarta.servlet.http.HttpServletResponse;

@RestController // Diz ao Spring que esta classe define endpoints da API
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    // Endpoint para criar uma nova URL curta
    @PostMapping("/api/v1/encurtar")
    public ResponseEntity<Url> encurtar(@RequestBody Map<String, String> request) {
        String originalUrl = request.get("originalUrl");
        Url urlEncurtada = urlService.encurtarUrl(originalUrl);
        return ResponseEntity.status(HttpStatus.CREATED).body(urlEncurtada);
    }

    // Endpoint para redirecionar
    @GetMapping("/{shortCode}")
    public void redirecionar(@PathVariable String shortCode, HttpServletResponse response) throws IOException {
        String originalUrl = urlService.obterUrlOriginal(shortCode);

        if (originalUrl != null) {
            // Se encontrou a URL, redireciona o navegador
            response.sendRedirect(originalUrl);
        } else {
            // Se não encontrou, retorna um erro 404 (Not Found)
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }
}