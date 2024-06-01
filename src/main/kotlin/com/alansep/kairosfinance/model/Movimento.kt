package com.alansep.kairosfinance.model

import com.alansep.kairosfinance.model.enums.TipoMovimento

import java.math.BigDecimal

class Movimento(val valor: BigDecimal, val tipo: TipoMovimento)