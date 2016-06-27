package uk.co.devls.therts.tests.unit

import org.amshove.kluent.shouldBe
import org.junit.Test
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

        var streamerCallbackCalled = false;
        streamer.stream {
            streamerCallbackCalled = true;
        }

        emitEvent();

        streamerCallbackCalled shouldBe true
    }

}