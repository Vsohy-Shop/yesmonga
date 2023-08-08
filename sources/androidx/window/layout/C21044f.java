package androidx.window.layout;

import android.view.DisplayCutout;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(28)
/* renamed from: androidx.window.layout.f */
public final class C21044f {
    @C12579k

    /* renamed from: a */
    public static final C21044f f54274a = new C21044f();

    /* renamed from: a */
    public final int mo62966a(@C12579k DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: b */
    public final int mo62967b(@C12579k DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: c */
    public final int mo62968c(@C12579k DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: d */
    public final int mo62969d(@C12579k DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
