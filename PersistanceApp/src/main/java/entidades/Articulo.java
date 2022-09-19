package entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "articulo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Audited
public class Articulo implements Serializable {

    @Column(name="cantidad")
    @NonNull private int cantidad;

    @Column(name="denominacion")
    @NonNull private String denominacion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "precio")
    @NonNull private int precio;

    @OneToMany(mappedBy = "articulo")
    private List<DetalleFactura> detfactura = new ArrayList<DetalleFactura>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable
            (name = "articulo_categoria",
                    joinColumns = @JoinColumn(name = "articulo_id"),
                    inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private List<Categoria> categorias = new ArrayList<Categoria>();

}
