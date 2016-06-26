package uk.co.devls.therts.usecase

public interface StreamMapUpdates {
    fun stream(presenter: () -> Unit)

}