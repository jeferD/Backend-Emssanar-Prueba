package com.backend.emssanar.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.emssanar.backend.models.Afiliado; // Agrega esta importación
import com.backend.emssanar.backend.repository.AfiliadoRepository;

import java.util.List; // Agrega esta importación para List

@RestController
@RequestMapping("/api/afiliados")
public class AfiliadoController {

    @Autowired
    private AfiliadoRepository afiliadoRepository;

    // Maneja las solicitudes GET a /api/afiliados
    @GetMapping
    public List<Afiliado> obtenerAfiliados() {
        // Utiliza el método findAll() proporcionado por el AfiliadoRepository
        // para obtener todos los afiliados de la base de datos
        return afiliadoRepository.findAll();
    }

    @PostMapping
    public Afiliado agregarAfiliado(@RequestBody Afiliado afiliado) {
        return afiliadoRepository.save(afiliado);
    }

    // Maneja las solicitudes PUT a /api/afiliados/{id}
    // para editar un afiliado existente
    @PatchMapping("/{id}")
    public ResponseEntity<Afiliado> actualizarAfiliado(@PathVariable Long id, @RequestBody Afiliado nuevoAfiliado) {
        Afiliado afiliadoExistente = afiliadoRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException(id));

        // Actualizar solo los campos proporcionados en el nuevo afiliado
        if (nuevoAfiliado.getNombre() != null) {
            afiliadoExistente.setNombre(nuevoAfiliado.getNombre());
        }
        if (nuevoAfiliado.getFechaNacimiento() != null) {
            afiliadoExistente.setFechaNacimiento(nuevoAfiliado.getFechaNacimiento());
        }
        if (nuevoAfiliado.getDireccion() != null) {
            afiliadoExistente.setDireccion(nuevoAfiliado.getDireccion());
        }
        if (nuevoAfiliado.getTelefono() != null) {
            afiliadoExistente.setTelefono(nuevoAfiliado.getTelefono());
        }
        if (nuevoAfiliado.getGenero() != null) {
            afiliadoExistente.setGenero(nuevoAfiliado.getGenero());
        }

        Afiliado afiliadoActualizado = afiliadoRepository.save(afiliadoExistente);
        return ResponseEntity.ok(afiliadoActualizado);
    }


    // Maneja las solicitudes DELETE a /api/afiliados/{id}
    // para eliminar un afiliado existente
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarAfiliado(@PathVariable Long id) {
        Afiliado afiliadoExistente = afiliadoRepository.findById(id)
            .orElseThrow(() -> new RecursoNoEncontradoException(id));

        afiliadoRepository.delete(afiliadoExistente);
        return ResponseEntity.ok().build();
    }
}


// {
//     "nombre": "Nuevo Afiliado",
//     "fechaNacimiento": "2000-01-01",
//     "direccion": "Calle Principal",
//     "telefono": "123456789",
//     "genero": "Masculino"
//   }
  