package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(17)
/* renamed from: androidx.window.layout.e */
public final class C21043e {
    @C12579k

    /* renamed from: a */
    public static final C21043e f54273a = new C21043e();

    /* renamed from: a */
    public final void mo62965a(@C12579k Display display, @C12579k Point point) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(point, "point");
        display.getRealSize(point);
    }
}
