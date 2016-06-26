package uk.co.devls.therts.tests.unit

import org.junit.Test

import org.junit.Assert.*
import uk.co.devls.therts.MapEventSource
import uk.co.devls.therts.MapUpdateStreamer

class MapUpdateStreamerTest : MapEventSource {

    private var function: () -> Unit = {};

    private fun emitEvent() {
        function(  );
    }

    override fun on(function: () -> Unit) {
        this.function = function;
    }

    @Test
    fun GivenOneUpdatesToMap_ThenPresenterIsCalled() {

        val streamer = MapUpdateStreamer(this)

        var a = false;
        streamer.stream {
            a = true;
        }

        emitEvent();

        assertTrue( a );

    }

    @Test
    fun given() {

    }


}