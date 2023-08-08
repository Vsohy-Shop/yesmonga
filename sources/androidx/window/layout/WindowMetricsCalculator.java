package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.window.core.C20994d;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public interface WindowMetricsCalculator {
    @C12579k

    /* renamed from: a */
    public static final Companion f54266a = Companion.f54267a;

    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f54267a = new Companion();
        @C12579k

        /* renamed from: b */
        public static C11300l<? super WindowMetricsCalculator, ? extends WindowMetricsCalculator> f54268b = WindowMetricsCalculator$Companion$decorator$1.f54269f;

        @C12579k
        @C11384m
        /* renamed from: a */
        public final WindowMetricsCalculator mo62956a() {
            return (WindowMetricsCalculator) f54268b.invoke(C21077x.f54327b);
        }

        @C20994d
        @RestrictTo({RestrictTo.Scope.TESTS})
        @C11384m
        /* renamed from: b */
        public final void mo62957b(@C12579k C21078y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "overridingDecorator");
            f54268b = new WindowMetricsCalculator$Companion$overrideDecorator$1(yVar);
        }

        @C20994d
        @RestrictTo({RestrictTo.Scope.TESTS})
        @C11384m
        /* renamed from: c */
        public final void mo62958c() {
            f54268b = WindowMetricsCalculator$Companion$reset$1.f54270f;
        }
    }

    @C20994d
    @RestrictTo({RestrictTo.Scope.TESTS})
    @C11384m
    /* renamed from: a */
    static void m97357a(@C12579k C21078y yVar) {
        f54266a.mo62957b(yVar);
    }

    @C12579k
    @C11384m
    /* renamed from: b */
    static WindowMetricsCalculator m97358b() {
        return f54266a.mo62956a();
    }

    @C20994d
    @RestrictTo({RestrictTo.Scope.TESTS})
    @C11384m
    static void reset() {
        f54266a.mo62958c();
    }

    @C12579k
    /* renamed from: c */
    C21074u mo62954c(@C12579k Activity activity);

    @C12579k
    /* renamed from: d */
    C21074u mo62955d(@C12579k Activity activity);
}
