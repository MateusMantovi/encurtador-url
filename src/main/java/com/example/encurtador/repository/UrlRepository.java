package com.example.encurtador.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.encurtador.model.Url;

// JpaRepository nos dá todos os comandos básicos de graça!
public interface UrlRepository extends JpaRepository<Url, Long> {
    // Spring Data JPA é inteligente! Só por escrever este método, ele já sabe
    // que queremos buscar um objeto 'Url' pelo seu campo 'shortCode'.
    Optional<Url> findByShortCode(String shortCode);
}