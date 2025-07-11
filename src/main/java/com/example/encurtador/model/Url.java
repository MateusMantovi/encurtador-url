package com.example.encurtador.model;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity // Diz ao JPA que esta classe é uma tabela no banco
@Table(name = "urls") // Nome da tabela
@Getter // Lombok cria os métodos get...() para nós
@Setter // Lombok cria os métodos set...() para nós
public class Url {

    @Id // Marca este campo como a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco de dados vai gerar o valor do ID
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT") // A URL original não pode ser nula
    private String originalUrl;

    @Column(nullable = false, unique = true) // O código curto não pode ser nulo e tem que ser único
    private String shortCode;

    @Column(nullable = false)
    private Instant createdAt;

    // Este método é executado automaticamente antes de salvar um novo objeto
    @PrePersist
    protected void onCreate() {
        this.createdAt = Instant.now();
    }
}