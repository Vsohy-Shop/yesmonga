package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.view.m0 */
public final class C18306m0 {

    /* renamed from: a */
    public static final int f46959a = 8388608;

    /* renamed from: b */
    public static final int f46960b = 8388611;

    /* renamed from: c */
    public static final int f46961c = 8388613;

    /* renamed from: d */
    public static final int f46962d = 8388615;

    @C0376v0(17)
    /* renamed from: androidx.core.view.m0$a */
    public static class C18307a {
        @C0373u
        /* renamed from: a */
        public static void m82992a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        @C0373u
        /* renamed from: b */
        public static void m82993b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        @C0373u
        /* renamed from: c */
        public static void m82994c(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    /* renamed from: a */
    public static void m82988a(int i, int i2, int i3, @C0359n0 Rect rect, int i4, int i5, @C0359n0 Rect rect2, int i6) {
        C18307a.m82992a(i, i2, i3, rect, i4, i5, rect2, i6);
    }

    /* renamed from: b */
    public static void m82989b(int i, int i2, int i3, @C0359n0 Rect rect, @C0359n0 Rect rect2, int i4) {
        C18307a.m82993b(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: c */
    public static void m82990c(int i, @C0359n0 Rect rect, @C0359n0 Rect rect2, int i2) {
        C18307a.m82994c(i, rect, rect2, i2);
    }

    /* renamed from: d */
    public static int m82991d(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
