package Caso1_SusanEC.repository;

import Caso1_SusanEC.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Integer>{
    public List<Producto> findByActivoTrue();

}

