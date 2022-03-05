package com.example.MarchPracticeTutorial14.repo;

import java.util.List;

import com.example.MarchPracticeTutorial14.model.Contact;

import org.springframework.stereotype.Repository;

@Repository
public interface RedisRepo {
    public void save(final Contact ctc);
    public Contact findById(final String contactId);
    public List<Contact> findAll(int startIndex);
}
