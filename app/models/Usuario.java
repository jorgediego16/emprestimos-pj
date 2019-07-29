package models;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Usuario extends Model{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @ManyToOne
    private Perfil perfil;

    public Usuario (){}

    public Usuario(String username, String password, Perfil perfil) {
        this.username = username;
        this.password = password;
        this.perfil = perfil;
    }
}
