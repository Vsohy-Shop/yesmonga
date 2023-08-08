package androidx.work.impl.utils;

import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import p073j$.time.Duration;

@C0376v0(26)
@C11314h(name = "DurationApi26Impl")
/* renamed from: androidx.work.impl.utils.d */
public final class C21301d {
    @C0373u
    /* renamed from: a */
    public static final long m98372a(@C12579k Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        return duration.toMillis();
    }
}
