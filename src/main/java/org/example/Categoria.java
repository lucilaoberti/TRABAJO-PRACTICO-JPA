package org.example;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id ;
    private String demonacion ;

    @ManyToMany(mappedBy = "categorias")
    @Builder.Default
    private List<Articulo> articulos=new ArrayList<Articulo>();

}
