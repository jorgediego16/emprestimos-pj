package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePerfil;

    public Perfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    public Perfil () {}
}



