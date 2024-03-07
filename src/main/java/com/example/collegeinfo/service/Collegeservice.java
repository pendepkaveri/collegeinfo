package com.example.collegeinfo.service;

import com.example.collegeinfo.Repository.Collegerepo;
import com.example.collegeinfo.model.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Collegeservice {

    @Autowired
    private Collegerepo collegeRepository;

    public College saveCollege(College college) {
        return collegeRepository.save(college);
    }

    public List<College> findAllColleges() {
        return collegeRepository.findAll();
    }

    public College findCollegeById(Long id) {
        return collegeRepository.findById(id).orElseThrow(() -> new RuntimeException("College not found"));
    }

    public College updateCollegeName(Long id, String newName) {
        College college = findCollegeById(id);
        college.setName(newName);
        return collegeRepository.save(college);
    }

    public void deleteCollegeById(Long id) {
        collegeRepository.deleteById(id);
    }


}
