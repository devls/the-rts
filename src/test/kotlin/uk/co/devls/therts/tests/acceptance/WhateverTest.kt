package uk.co.devls.therts.tests.acceptance

import org.junit.Before
import org.junit.Test
import uk.co.devls.therts.UnitAdder
import uk.co.devls.therts.MapUpdateStreamer
import uk.co.devls.therts.tests.InMemoryMapState
import kotlin.test.assertEquals

class WhateverTest {

    private var mapUpdateCount: Int = 0

    private fun assertNumberOfMapUpdatesIsEqualTo() {
        assertEquals(1, mapUpdateCount);
    }

    private var mapState: InMemoryMapState = InMemoryMapState()
    private var mapStreamer: MapUpdateStreamer = MapUpdateStreamer(mapState)
    private var unitAdder: UnitAdder = UnitAdder(mapState)

    private fun listenToMapUpdates(mapStreamer: MapUpdateStreamer) {
        mapStreamer.stream {
            mapUpdateCount++;
        }
    }

    @Before
    fun setUp() {
        mapState = InMemoryMapState()
        mapStreamer = MapUpdateStreamer(mapState);
        unitAdder = UnitAdder(mapState);
    }

    @Test
    fun givenOneUnitIsAdded_ThenExpectAMapUpdateToOccur() {
        listenToMapUpdates(mapStreamer)
        unitAdder.addUnit();
        assertNumberOfMapUpdatesIsEqualTo()
    }

}

