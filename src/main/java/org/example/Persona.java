package org.example;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Persona")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    // Constructor, getters y setters


  /*  public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persona() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/
}