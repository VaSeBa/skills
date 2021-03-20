package ru.vaseba.skills.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vaseba.skills.entity.Test;
import ru.vaseba.skills.repository.TestRepository;


import java.util.List;
import java.util.Optional;

@Service
public class TestService{

    private TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public Test save(Test test) {
        return testRepository.save(test);
    }

    public Optional<Test> findById(Long id) {
        return testRepository.findById(id);
    }

    public List<Test> findAll() {
        return testRepository.findAll();
    }

}
