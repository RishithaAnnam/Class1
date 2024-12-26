package com.example.JFSDS12_SBJPA;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Service
public class StudentDAOClass implements StudentDAO{
     EntityManager em;
  @Override
  @PersistenceContext
  @Transactional
  public void insertStudent(Student std) {
    // TODO Auto-generated method stub
    em.persist(std);
  }

}