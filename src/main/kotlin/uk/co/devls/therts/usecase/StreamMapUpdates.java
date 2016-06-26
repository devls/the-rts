package uk.co.devls.therts.usecase;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

public interface StreamMapUpdates {
    void stream(@NotNull Function0<Unit> presenter);
}
