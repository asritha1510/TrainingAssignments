package com.example.demojpa;

import com.example.demojpa.Entity.Candidate;
import com.example.demojpa.Entity.Guardian;
import com.example.demojpa.repository.CandidateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CandidateRepositoryTest {
    @Autowired
    private CandidateRepository candidateRepository;
    //Test, autowire, perform operation
    @Test
    public void saveCandidate(){
        Candidate candidate= Candidate.builder().name("Ani").marks(55).department("ece").guardian(Guardian.builder().name("Sirish").email("Sirish@gmail.com").mobile("845678").build()).build();
        candidateRepository.save(candidate);
    }

    @Test
    public void ListAllCandidiates(){
        List<Candidate> list=candidateRepository.findAll();
        System.out.println(list);
    }

}
