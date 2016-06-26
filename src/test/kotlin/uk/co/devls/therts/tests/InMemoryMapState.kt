package uk.co.devls.therts.tests

import uk.co.devls.therts.MapEventSource
import uk.co.devls.therts.MapGateway
import uk.co.devls.therts.entity.GameUnit
import java.util.*

class InMemoryMapState : MapEventSource, MapGateway {
    val allUnits: MutableList<GameUnit> =  ArrayList()

    var function: () -> Unit = {}

    override fun addGameUnit(gameUnit: GameUnit) {
        allUnits.add(gameUnit);
    }

    override fun on(function: () -> Unit) {
        this.function = function;
    }

}
