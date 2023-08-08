package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.C0376v0;
import androidx.compose.foundation.layout.C2401q1;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.unit.C16509w;
import androidx.compose.p004ui.unit.C16511x;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C0376v0(30)
/* renamed from: androidx.compose.foundation.layout.x0 */
public interface C2420x0 {
    @C12579k

    /* renamed from: a */
    public static final C2421a f6370a = C2421a.f6371a;

    /* renamed from: androidx.compose.foundation.layout.x0$a */
    public static final class C2421a {

        /* renamed from: a */
        public static final /* synthetic */ C2421a f6371a = new C2421a();
        @C12579k

        /* renamed from: b */
        public static final C2423b f6372b = new C2423b();
        @C12579k

        /* renamed from: c */
        public static final C2425d f6373c = new C2425d();
        @C12579k

        /* renamed from: d */
        public static final C2424c f6374d = new C2424c();
        @C12579k

        /* renamed from: e */
        public static final C2422a f6375e = new C2422a();

        /* renamed from: androidx.compose.foundation.layout.x0$a$a */
        public static final class C2422a implements C2420x0 {
            /* renamed from: b */
            public float mo8232b(float f, float f2) {
                return -f2;
            }

            @C12579k
            /* renamed from: c */
            public Insets mo8233c(@C12579k Insets insets, int i) {
                Intrinsics.checkNotNullParameter(insets, "oldInsets");
                Insets a = Insets.of(insets.left, insets.top, insets.right, i);
                Intrinsics.checkNotNullExpressionValue(a, "of(oldInsets.left, oldIn…ldInsets.right, newValue)");
                return a;
            }

            /* renamed from: e */
            public int mo8235e(@C12579k Insets insets) {
                Intrinsics.checkNotNullParameter(insets, "insets");
                return insets.bottom;
            }

            /* renamed from: f */
            public long mo8236f(long j) {
                return C15096g.m64898a(0.0f, C15094f.m64882r(j));
            }

            /* renamed from: g */
            public long mo8237g(long j, float f) {
                return C16511x.m74763a(0.0f, C16509w.m74752n(j) + f);
            }
        }

        /* renamed from: androidx.compose.foundation.layout.x0$a$b */
        public static final class C2423b implements C2420x0 {
            /* renamed from: b */
            public float mo8232b(float f, float f2) {
                return f;
            }

            @C12579k
            /* renamed from: c */
            public Insets mo8233c(@C12579k Insets insets, int i) {
                Intrinsics.checkNotNullParameter(insets, "oldInsets");
                Insets a = Insets.of(i, insets.top, insets.right, insets.bottom);
                Intrinsics.checkNotNullExpressionValue(a, "of(newValue, oldInsets.t….right, oldInsets.bottom)");
                return a;
            }

            /* renamed from: e */
            public int mo8235e(@C12579k Insets insets) {
                Intrinsics.checkNotNullParameter(insets, "insets");
                return insets.left;
            }

            /* renamed from: f */
            public long mo8236f(long j) {
                return C15096g.m64898a(C15094f.m64880p(j), 0.0f);
            }

            /* renamed from: g */
            public long mo8237g(long j, float f) {
                return C16511x.m74763a(C16509w.m74750l(j) - f, 0.0f);
            }
        }

        /* renamed from: androidx.compose.foundation.layout.x0$a$c */
        public static final class C2424c implements C2420x0 {
            /* renamed from: b */
            public float mo8232b(float f, float f2) {
                return -f;
            }

            @C12579k
            /* renamed from: c */
            public Insets mo8233c(@C12579k Insets insets, int i) {
                Intrinsics.checkNotNullParameter(insets, "oldInsets");
                Insets a = Insets.of(insets.left, insets.top, i, insets.bottom);
                Intrinsics.checkNotNullExpressionValue(a, "of(oldInsets.left, oldIn…wValue, oldInsets.bottom)");
                return a;
            }

            /* renamed from: e */
            public int mo8235e(@C12579k Insets insets) {
                Intrinsics.checkNotNullParameter(insets, "insets");
                return insets.right;
            }

            /* renamed from: f */
            public long mo8236f(long j) {
                return C15096g.m64898a(C15094f.m64880p(j), 0.0f);
            }

            /* renamed from: g */
            public long mo8237g(long j, float f) {
                return C16511x.m74763a(C16509w.m74750l(j) + f, 0.0f);
            }
        }

        /* renamed from: androidx.compose.foundation.layout.x0$a$d */
        public static final class C2425d implements C2420x0 {
            /* renamed from: b */
            public float mo8232b(float f, float f2) {
                return f2;
            }

            @C12579k
            /* renamed from: c */
            public Insets mo8233c(@C12579k Insets insets, int i) {
                Intrinsics.checkNotNullParameter(insets, "oldInsets");
                Insets a = Insets.of(insets.left, i, insets.right, insets.bottom);
                Intrinsics.checkNotNullExpressionValue(a, "of(oldInsets.left, newVa….right, oldInsets.bottom)");
                return a;
            }

            /* renamed from: e */
            public int mo8235e(@C12579k Insets insets) {
                Intrinsics.checkNotNullParameter(insets, "insets");
                return insets.top;
            }

            /* renamed from: f */
            public long mo8236f(long j) {
                return C15096g.m64898a(0.0f, C15094f.m64882r(j));
            }

            /* renamed from: g */
            public long mo8237g(long j, float f) {
                return C16511x.m74763a(0.0f, C16509w.m74752n(j) - f);
            }
        }

        @C12579k
        /* renamed from: a */
        public final C2420x0 mo8238a(int i, @C12579k LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            C2401q1.C2402a aVar = C2401q1.f6318b;
            if (C2401q1.m10552p(i, aVar.mo8147h())) {
                return f6372b;
            }
            if (C2401q1.m10552p(i, aVar.mo8150k())) {
                return f6373c;
            }
            if (C2401q1.m10552p(i, aVar.mo8148i())) {
                return f6374d;
            }
            if (C2401q1.m10552p(i, aVar.mo8144e())) {
                return f6375e;
            }
            if (C2401q1.m10552p(i, aVar.mo8149j())) {
                if (layoutDirection == LayoutDirection.Ltr) {
                    return f6372b;
                }
                return f6374d;
            } else if (!C2401q1.m10552p(i, aVar.mo8145f())) {
                throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
            } else if (layoutDirection == LayoutDirection.Ltr) {
                return f6374d;
            } else {
                return f6372b;
            }
        }
    }

    /* renamed from: a */
    float mo8231a(float f, float f2) {
        return C11479u.m44444t(mo8232b(f, f2), 0.0f);
    }

    /* renamed from: b */
    float mo8232b(float f, float f2);

    @C12579k
    /* renamed from: c */
    Insets mo8233c(@C12579k Insets insets, int i);

    /* renamed from: d */
    float mo8234d(float f, float f2) {
        return C11479u.m44310A(mo8232b(f, f2), 0.0f);
    }

    /* renamed from: e */
    int mo8235e(@C12579k Insets insets);

    /* renamed from: f */
    long mo8236f(long j);

    /* renamed from: g */
    long mo8237g(long j, float f);
}
