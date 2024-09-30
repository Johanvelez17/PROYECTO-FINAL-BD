package com.pruebaApi.SegundaPruebaSB.REPOSITORIOS;

import com.pruebaApi.SegundaPruebaSB.MODELOS.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
}
