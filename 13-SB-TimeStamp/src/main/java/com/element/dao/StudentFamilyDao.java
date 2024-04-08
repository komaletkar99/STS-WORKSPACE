package com.element.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.element.entity.Student;
import com.element.entity.StudentFamily;

public interface StudentFamilyDao extends  JpaRepository<StudentFamily, Integer>{


}
