package androidx.lifecycle;

import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import p073j$.time.Duration;

@C0376v0(26)
/* renamed from: androidx.lifecycle.c */
public final class C19396c {
    @C12579k

    /* renamed from: a */
    public static final C19396c f49778a = new C19396c();

    /* renamed from: a */
    public final long mo57560a(@C12579k Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "timeout");
        return duration.toMillis();
    }
}
