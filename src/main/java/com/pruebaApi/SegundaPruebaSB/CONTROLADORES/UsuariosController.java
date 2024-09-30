package com.pruebaApi.SegundaPruebaSB.CONTROLADORES;

import com.pruebaApi.SegundaPruebaSB.MODELOS.Usuarios;
import com.pruebaApi.SegundaPruebaSB.REPOSITORIOS.UsuariosRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuariosController {

    UsuariosRepository repositorio;

    @GetMapping("/api/crearUsuarios")
    public void crearUsuario(){
        Usuarios usuario1 = new Usuarios("Johan Velez", "johan54321@gmail.com","3005265313", "donante", "johan54321" );
        Usuarios usuario2 = new Usuarios ("Antonio Nariño", "Antonio1762@gmail.com", "3013562171", "donante", "Antony1786");
        Usuarios usuario3 = new Usuarios ("Francisco Santander", "Pacho8801@gmail.com", "3006732382", "administrador", "Pacho1779" );

        repositorio.save(usuario1);
        repositorio.save(usuario2);
        repositorio.save(usuario3);
    }

    @GetMapping("/api/Registrados")
    public List<Usuarios> clientesRegistrados(){
        return repositorio.findAll();
    }

}
