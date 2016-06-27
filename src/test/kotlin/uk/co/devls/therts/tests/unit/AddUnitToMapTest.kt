package uk.co.devls.therts.tests.unit

import org.amshove.kluent.`should equal`
import org.junit.Test
import uk.co.devls.therts.UnitAdder
import uk.co.devls.therts.tests.InMemoryMapState

class AddUnitToMapTest {
    @Test
    fun givenIAddAUnitToTheMap_TheMapContainsOneUnit() {
        val mapState = InMemoryMapState();
        val unitAdder = UnitAdder(mapState)

        unitAdder.addUnit()

        mapState.allUnits.size `should equal` 1
    }
}