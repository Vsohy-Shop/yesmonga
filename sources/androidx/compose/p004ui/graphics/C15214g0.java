package androidx.compose.p004ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.g0 */
public final class C15214g0 {
    @C12579k
    /* renamed from: a */
    public static final C15249k2 m65960a(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "colorMatrix");
        return new C15249k2(new ColorMatrixColorFilter(fArr));
    }

    @C12579k
    /* renamed from: b */
    public static final C15249k2 m65961b(long j, long j2) {
        return new C15249k2(new LightingColorFilter(C15258l2.m66193r(j), C15258l2.m66193r(j2)));
    }

    @C12579k
    /* renamed from: c */
    public static final C15249k2 m65962c(long j, int i) {
        ColorFilter colorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            colorFilter = C15409x1.f38096a.mo43570a(j, i);
        } else {
            colorFilter = new PorterDuffColorFilter(C15258l2.m66193r(j), C15171d0.m65561c(i));
        }
        return new C15249k2(colorFilter);
    }

    @C12579k
    /* renamed from: d */
    public static final ColorFilter m65963d(@C12579k C15249k2 k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        return k2Var.mo42865a();
    }

    @C12579k
    /* renamed from: e */
    public static final C15249k2 m65964e(@C12579k ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(colorFilter, "<this>");
        return new C15249k2(colorFilter);
    }
}
