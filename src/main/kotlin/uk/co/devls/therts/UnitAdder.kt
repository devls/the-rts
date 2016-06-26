package uk.co.devls.therts

import uk.co.devls.therts.entity.GameUnit
import uk.co.devls.therts.usecase.AddUnitToMap

class UnitAdder(val mapGateway: MapGateway ) : AddUnitToMap {
    override fun addUnit() {
        mapGateway.addGameUnit(GameUnit())
    }
}

interface MapGateway {
    fun addGameUnit(gameUnit: GameUnit)
}
