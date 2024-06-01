package com.alansep.kairosfinance.controller

import com.alansep.kairosfinance.model.Movimento
import com.alansep.kairosfinance.model.enums.TipoMovimento
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
@RequestMapping("/movementos")
class MovementosController {

    @GetMapping
    fun retornarMovimentos(@RequestParam valores: List<Float>): List<Movimento> {
        return valores.map { Movimento(BigDecimal(it.toDouble()), if (it > 0) TipoMovimento.ENTRADA else TipoMovimento.SAIDA) }
    }

}