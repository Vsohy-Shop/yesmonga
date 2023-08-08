package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.C0696c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(30)
/* renamed from: androidx.window.layout.d */
public final class C21042d {
    @C12579k

    /* renamed from: a */
    public static final C21042d f54272a = new C21042d();

    @C12579k
    /* renamed from: a */
    public final Rect mo62963a(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Rect a = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        Intrinsics.checkNotNullExpressionValue(a, "activity.windowManager.currentWindowMetrics.bounds");
        return a;
    }

    @C12579k
    /* renamed from: b */
    public final Rect mo62964b(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Rect a = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        Intrinsics.checkNotNullExpressionValue(a, "activity.windowManager.maximumWindowMetrics.bounds");
        return a;
    }
}
