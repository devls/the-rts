package uk.co.devls.therts.tests.unit

import org.junit.Assert.*
import org.junit.Test
import uk.co.devls.therts.UnitAdder
import uk.co.devls.therts.tests.InMemoryMapState

class AddUnitToMapTest {
    @Test
    fun givenIAddAUnitToTheMap_TheMapContainsOneUnit() {
        val mapState = InMemoryMapState();
        val unitAdder = UnitAdder(mapState)

        unitAdder.addUnit()

        assertEquals(1, mapState.allUnits.size)
    }
}