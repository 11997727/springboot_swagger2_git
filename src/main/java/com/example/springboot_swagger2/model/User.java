package com.example.springboot_swagger2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private Integer id;
  private String account;
  private String password;
  private String name;
  private Integer age;
}
