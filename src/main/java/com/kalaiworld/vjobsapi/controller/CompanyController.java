package com.kalaiworld.vjobsapi.controller;

import com.kalaiworld.vjobsapi.dto.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/company")
@Slf4j
public class CompanyController {

  @Autowired
  private Company company;

  @GetMapping(value = "/all",
      produces = "application/json")
  public Company getCompanies() {
    log.info("Logger works!");
    company.setName("Mastercard");
    company.setDescription(
        "Priceline.com's success as one of the biggest players in online travel is all thanks to our incredible, dedicated team of over 500 people. We're a diverse group of creative, self-motivated individuals with a passion for making travel easier, more affordable and more rewarding for our customers.\n"
            + "\n"
            + "Our culture feeds on collaboration. Individuals work in small, multi-disciplinary teams where we encourage experimentation, communication and teamwork. ");
    return company;
  }

}