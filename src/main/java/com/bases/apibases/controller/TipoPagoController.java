package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.TipoPago;
import com.bases.apibases.repository.TipoPagoRepository;

import java.util.List;

@RestController
@RequestMapping("/tipo_pago")
@CrossOrigin
public class TipoPagoController {

    @Autowired
    private TipoPagoRepository tipoPagoRepository;

    @GetMapping("/buscar")
    public List<TipoPago> getBuscar(@RequestParam(required = false) String param) {
        return tipoPagoRepository.findAll();
    }

    @PostMapping("/guardar")
    public TipoPago postGuardar(@RequestBody TipoPago tipoPago) {
        return tipoPagoRepository.save(tipoPago);
    }

    @DeleteMapping("/eliminar/{idTipoPago}")
    public void eliminar(@PathVariable("idTipoPago") int idTipoPago) {
        tipoPagoRepository.deleteById(idTipoPago);
    }
}

