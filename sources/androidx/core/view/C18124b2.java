package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.view.b2 */
public final class C18124b2 {

    /* renamed from: b */
    public static final int f46723b = 0;

    /* renamed from: c */
    public static final int f46724c = 1000;

    /* renamed from: d */
    public static final int f46725d = 1001;

    /* renamed from: e */
    public static final int f46726e = 1002;

    /* renamed from: f */
    public static final int f46727f = 1003;

    /* renamed from: g */
    public static final int f46728g = 1004;

    /* renamed from: h */
    public static final int f46729h = 1006;

    /* renamed from: i */
    public static final int f46730i = 1007;

    /* renamed from: j */
    public static final int f46731j = 1008;

    /* renamed from: k */
    public static final int f46732k = 1009;

    /* renamed from: l */
    public static final int f46733l = 1010;

    /* renamed from: m */
    public static final int f46734m = 1011;

    /* renamed from: n */
    public static final int f46735n = 1012;

    /* renamed from: o */
    public static final int f46736o = 1013;

    /* renamed from: p */
    public static final int f46737p = 1014;

    /* renamed from: q */
    public static final int f46738q = 1015;

    /* renamed from: r */
    public static final int f46739r = 1016;

    /* renamed from: s */
    public static final int f46740s = 1017;

    /* renamed from: t */
    public static final int f46741t = 1018;

    /* renamed from: u */
    public static final int f46742u = 1019;

    /* renamed from: v */
    public static final int f46743v = 1020;

    /* renamed from: w */
    public static final int f46744w = 1021;

    /* renamed from: x */
    public static final int f46745x = 1000;

    /* renamed from: a */
    public final PointerIcon f46746a;

    @C0376v0(24)
    /* renamed from: androidx.core.view.b2$a */
    public static class C18125a {
        @C0373u
        /* renamed from: a */
        public static PointerIcon m82290a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        @C0373u
        /* renamed from: b */
        public static PointerIcon m82291b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        @C0373u
        /* renamed from: c */
        public static PointerIcon m82292c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    public C18124b2(PointerIcon pointerIcon) {
        this.f46746a = pointerIcon;
    }

    @C0359n0
    /* renamed from: a */
    public static C18124b2 m82286a(@C0359n0 Bitmap bitmap, float f, float f2) {
        return new C18124b2(C18125a.m82290a(bitmap, f, f2));
    }

    @C0359n0
    /* renamed from: c */
    public static C18124b2 m82287c(@C0359n0 Context context, int i) {
        return new C18124b2(C18125a.m82291b(context, i));
    }

    @C0359n0
    /* renamed from: d */
    public static C18124b2 m82288d(@C0359n0 Resources resources, int i) {
        return new C18124b2(C18125a.m82292c(resources, i));
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public Object mo52794b() {
        return this.f46746a;
    }
}
