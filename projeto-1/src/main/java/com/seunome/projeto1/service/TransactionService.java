package com.seunome.projeto1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.seunome.projeto1.entity.Transaction;
import com.seunome.projeto1.repository.TransactionRepository;

@Service
public class TransactionService {

    private final TransactionRepository repository;

    // Construtor
    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    // LISTAR TODAS
    public List<Transaction> listar() {
        return repository.findAll();
    }

    // CRIAR
    public Transaction criar(Transaction transaction) {
        return repository.save(transaction);
    }

    // DELETAR
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}