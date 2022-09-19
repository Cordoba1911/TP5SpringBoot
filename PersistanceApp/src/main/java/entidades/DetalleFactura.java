package entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detalleFac")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
@Audited
public class DetalleFactura implements Serializable {

    @Column(name = "cantidad")
    private int cantidad;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "subtotal")
    private int subtotal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_articulo")
    private Articulo articulo;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "detalle_fk_factura")
    private Factura factura;
}
