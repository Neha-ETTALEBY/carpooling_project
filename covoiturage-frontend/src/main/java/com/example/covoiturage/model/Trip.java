package com.example.covoiturage.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startPoint;
    private String destination;
    private LocalDateTime departureTime;
    private int availableSeats;

    @ManyToOne
    private User driver;

    // Getters and setters
}

