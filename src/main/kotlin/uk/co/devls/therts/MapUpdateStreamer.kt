package uk.co.devls.therts

import uk.co.devls.therts.usecase.StreamMapUpdates


class MapUpdateStreamer(val mapEventSource: MapEventSource ): StreamMapUpdates {

    override fun stream(presenter: () -> Unit) {
        mapEventSource.on {
            presenter();
        }
    }


}

interface MapEventSource {
    fun on(function: () -> Unit)

}

interface Presenter {

}
