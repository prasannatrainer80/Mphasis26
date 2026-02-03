package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employ;
import com.example.demo.service.EmployService;

@RestController
public class EmployController {

	@Autowired
	private EmployService employService;
	
	@PostMapping("/addEmploy")
    public ResponseEntity<String> addEmploy(@RequestBody Employ employ) {
        String saved = employService.addEmploy(employ);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @PutMapping("/updateEmploy")
    public ResponseEntity<String> updateEmploy(@RequestBody Employ employ) {
        String updated = employService.updateEmploy(employ);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/deleteEmploy/{empno}")
    public ResponseEntity<String> deleteEmploy(@PathVariable int empno) {
        
        return ResponseEntity.ok(employService.deleteEmploy(empno));
    }

    @GetMapping("/searchEmploy/{empno}")
    public ResponseEntity<Employ> searchEmploy(@PathVariable int empno) {
        return ResponseEntity.ok(employService.searchEmploy(empno));
    }


    @GetMapping("/showEmploy")
    public ResponseEntity<List<Employ>> showEmploy() {
        return ResponseEntity.ok(employService.showEmploy());
    }
}
