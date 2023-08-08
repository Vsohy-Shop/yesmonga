package androidx.compose.foundation.shape;

import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAbsoluteRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,195:1\n154#2:196\n154#2:197\n154#2:198\n154#2:199\n*S KotlinDebug\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n*L\n142#1:196\n143#1:197\n144#1:198\n145#1:199\n*E\n"})
/* renamed from: androidx.compose.foundation.shape.d */
public final class C2682d {
    @C12579k
    /* renamed from: a */
    public static final C2681c m12096a(float f) {
        return m12100e(C2685g.m12116a(f));
    }

    @C12579k
    /* renamed from: b */
    public static final C2681c m12097b(float f, float f2, float f3, float f4) {
        return new C2681c(C2685g.m12116a(f), C2685g.m12116a(f2), C2685g.m12116a(f3), C2685g.m12116a(f4));
    }

    @C12579k
    /* renamed from: c */
    public static final C2681c m12098c(int i) {
        return m12100e(C2685g.m12117b(i));
    }

    @C12579k
    /* renamed from: d */
    public static final C2681c m12099d(int i, int i2, int i3, int i4) {
        return new C2681c(C2685g.m12117b(i), C2685g.m12117b(i2), C2685g.m12117b(i3), C2685g.m12117b(i4));
    }

    @C12579k
    /* renamed from: e */
    public static final C2681c m12100e(@C12579k C2684f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "corner");
        return new C2681c(fVar, fVar, fVar, fVar);
    }

    /* renamed from: f */
    public static /* synthetic */ C2681c m12101f(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return m12097b(f, f2, f3, f4);
    }

    /* renamed from: g */
    public static /* synthetic */ C2681c m12102g(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return m12099d(i, i2, i3, i4);
    }

    @C12579k
    /* renamed from: h */
    public static final C2681c m12103h(float f) {
        return m12100e(C2685g.m12118c(f));
    }

    @C12579k
    /* renamed from: i */
    public static final C2681c m12104i(float f, float f2, float f3, float f4) {
        return new C2681c(C2685g.m12118c(f), C2685g.m12118c(f2), C2685g.m12118c(f3), C2685g.m12118c(f4));
    }

    /* renamed from: j */
    public static /* synthetic */ C2681c m12105j(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.m74435M((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C16483g.m74435M((float) 0);
        }
        if ((i & 4) != 0) {
            f3 = C16483g.m74435M((float) 0);
        }
        if ((i & 8) != 0) {
            f4 = C16483g.m74435M((float) 0);
        }
        return m12104i(f, f2, f3, f4);
    }
}
