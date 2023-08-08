package androidx.window.layout;

import android.app.Activity;
import androidx.appcompat.widget.C0696c;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class WindowInfoTrackerImpl implements C21069q {
    @C12579k

    /* renamed from: d */
    public static final C21038a f54262d = new C21038a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f54263e = 10;
    @C12579k

    /* renamed from: b */
    public final WindowMetricsCalculator f54264b;
    @C12579k

    /* renamed from: c */
    public final C21068p f54265c;

    /* renamed from: androidx.window.layout.WindowInfoTrackerImpl$a */
    public static final class C21038a {
        public /* synthetic */ C21038a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C21038a() {
        }
    }

    public WindowInfoTrackerImpl(@C12579k WindowMetricsCalculator windowMetricsCalculator, @C12579k C21068p pVar) {
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(pVar, "windowBackend");
        this.f54264b = windowMetricsCalculator;
        this.f54265c = pVar;
    }

    @C12579k
    /* renamed from: c */
    public C11907e<C21073t> mo62952c(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        return C11909g.m47376J0(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, (C11045c<? super WindowInfoTrackerImpl$windowLayoutInfo$1>) null));
    }
}
