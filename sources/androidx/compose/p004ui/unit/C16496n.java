package androidx.compose.p004ui.unit;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.C11363r0;
import kotlin.math.C11409d;

@C11363r0({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,179:1\n48#2:180\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n39#1:180\n*E\n"})
/* renamed from: androidx.compose.ui.unit.n */
public final class C16496n {
    @C8547h2
    /* renamed from: a */
    public static final long m74593a(int i, int i2) {
        return C16494m.m74573e((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    @C8547h2
    /* renamed from: b */
    public static final long m74594b(long j, long j2, float f) {
        return m74593a(C16515d.m74782b(C16494m.m74581m(j), C16494m.m74581m(j2), f), C16515d.m74782b(C16494m.m74583o(j), C16494m.m74583o(j2), f));
    }

    @C8547h2
    /* renamed from: c */
    public static final long m74595c(long j, long j2) {
        return C15096g.m64898a(C15094f.m64880p(j) - ((float) C16494m.m74581m(j2)), C15094f.m64882r(j) - ((float) C16494m.m74583o(j2)));
    }

    @C8547h2
    /* renamed from: d */
    public static final long m74596d(long j, long j2) {
        return C15096g.m64898a(((float) C16494m.m74581m(j)) - C15094f.m64880p(j2), ((float) C16494m.m74583o(j)) - C15094f.m64882r(j2));
    }

    @C8547h2
    /* renamed from: e */
    public static final long m74597e(long j, long j2) {
        return C15096g.m64898a(C15094f.m64880p(j) + ((float) C16494m.m74581m(j2)), C15094f.m64882r(j) + ((float) C16494m.m74583o(j2)));
    }

    @C8547h2
    /* renamed from: f */
    public static final long m74598f(long j, long j2) {
        return C15096g.m64898a(((float) C16494m.m74581m(j)) + C15094f.m64880p(j2), ((float) C16494m.m74583o(j)) + C15094f.m64882r(j2));
    }

    @C8547h2
    /* renamed from: g */
    public static final long m74599g(long j) {
        return m74593a(C11409d.m43851L0(C15094f.m64880p(j)), C11409d.m43851L0(C15094f.m64882r(j)));
    }

    @C8547h2
    /* renamed from: h */
    public static final long m74600h(long j) {
        return C15096g.m64898a((float) C16494m.m74581m(j), (float) C16494m.m74583o(j));
    }
}
