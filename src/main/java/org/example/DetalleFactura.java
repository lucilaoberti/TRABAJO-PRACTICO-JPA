package org.example;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "detallefactura")
public class DetalleFactura implements Serializable {
    @Id
    @GeneratedValue
    private Long id ;
    private int cantidad ;
    private int subtotal ;

   @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="fk_articulo")
    private Articulo articulo;
   @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="fk_factura")
    private Factura factura ;
}
