package androidx.work;

import androidx.annotation.C0376v0;
import androidx.exifinterface.media.C19135a;
import androidx.work.C21403p;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p073j$.time.Duration;

/* renamed from: androidx.work.q */
public final class C21406q {
    /* renamed from: a */
    public static final /* synthetic */ <W extends C21372k> C21403p.C21404a m98693a(long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "repeatIntervalTimeUnit");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48841T4);
        return new C21403p.C21404a((Class<? extends C21372k>) C21372k.class, j, timeUnit);
    }

    /* renamed from: b */
    public static final /* synthetic */ <W extends C21372k> C21403p.C21404a m98694b(long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        Intrinsics.checkNotNullParameter(timeUnit, "repeatIntervalTimeUnit");
        Intrinsics.checkNotNullParameter(timeUnit2, "flexTimeIntervalUnit");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48841T4);
        return new C21403p.C21404a(C21372k.class, j, timeUnit, j2, timeUnit2);
    }

    @C0376v0(26)
    /* renamed from: c */
    public static final /* synthetic */ <W extends C21372k> C21403p.C21404a m98695c(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "repeatInterval");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48841T4);
        return new C21403p.C21404a(C21372k.class, duration);
    }

    @C0376v0(26)
    /* renamed from: d */
    public static final /* synthetic */ <W extends C21372k> C21403p.C21404a m98696d(Duration duration, Duration duration2) {
        Intrinsics.checkNotNullParameter(duration, "repeatInterval");
        Intrinsics.checkNotNullParameter(duration2, "flexTimeInterval");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48841T4);
        return new C21403p.C21404a((Class<? extends C21372k>) C21372k.class, duration, duration2);
    }
}
