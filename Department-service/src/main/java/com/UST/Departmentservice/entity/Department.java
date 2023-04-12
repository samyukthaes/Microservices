package com.UST.Departmentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long departmentId;
        private String departmentname;
        private String departmentAddress;
        private String departmentCode;

    }


