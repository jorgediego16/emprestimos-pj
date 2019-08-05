package models;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Perfil extends Model implements Serializable {

    private static final long serialVersionUID = 877466631255720532L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePerfil;

    public Perfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    public Perfil () {}
}



