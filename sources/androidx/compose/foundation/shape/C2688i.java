package androidx.compose.foundation.shape;

import androidx.compose.p004ui.unit.C16483g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,198:1\n154#2:199\n154#2:200\n154#2:201\n154#2:202\n*S KotlinDebug\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n*L\n145#1:199\n146#1:200\n147#1:201\n148#1:202\n*E\n"})
/* renamed from: androidx.compose.foundation.shape.i */
public final class C2688i {
    @C12579k
    /* renamed from: a */
    public static final C2687h m12127a(float f) {
        return m12131e(C2685g.m12116a(f));
    }

    @C12579k
    /* renamed from: b */
    public static final C2687h m12128b(float f, float f2, float f3, float f4) {
        return new C2687h(C2685g.m12116a(f), C2685g.m12116a(f2), C2685g.m12116a(f3), C2685g.m12116a(f4));
    }

    @C12579k
    /* renamed from: c */
    public static final C2687h m12129c(int i) {
        return m12131e(C2685g.m12117b(i));
    }

    @C12579k
    /* renamed from: d */
    public static final C2687h m12130d(int i, int i2, int i3, int i4) {
        return new C2687h(C2685g.m12117b(i), C2685g.m12117b(i2), C2685g.m12117b(i3), C2685g.m12117b(i4));
    }

    @C12579k
    /* renamed from: e */
    public static final C2687h m12131e(@C12579k C2684f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "corner");
        return new C2687h(fVar, fVar, fVar, fVar);
    }

    /* renamed from: f */
    public static /* synthetic */ C2687h m12132f(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return m12128b(f, f2, f3, f4);
    }

    /* renamed from: g */
    public static /* synthetic */ C2687h m12133g(int i, int i2, int i3, int i4, int i5, Object obj) {
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
        return m12130d(i, i2, i3, i4);
    }

    @C12579k
    /* renamed from: h */
    public static final C2687h m12134h(float f) {
        return m12131e(C2685g.m12118c(f));
    }

    @C12579k
    /* renamed from: i */
    public static final C2687h m12135i(float f, float f2, float f3, float f4) {
        return new C2687h(C2685g.m12118c(f), C2685g.m12118c(f2), C2685g.m12118c(f3), C2685g.m12118c(f4));
    }

    /* renamed from: j */
    public static /* synthetic */ C2687h m12136j(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return m12135i(f, f2, f3, f4);
    }
}
