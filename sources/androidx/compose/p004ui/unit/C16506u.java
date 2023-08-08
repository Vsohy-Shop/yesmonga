package androidx.compose.p004ui.unit;

import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8547h2;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,388:1\n250#1:389\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n264#1:389\n*E\n"})
/* renamed from: androidx.compose.ui.unit.u */
public final class C16506u {

    /* renamed from: a */
    public static final long f40907a = 1095216660480L;

    /* renamed from: b */
    public static final long f40908b = 0;

    /* renamed from: c */
    public static final long f40909c = 4294967296L;

    /* renamed from: d */
    public static final long f40910d = 8589934592L;

    /* renamed from: a */
    public static final long m74700a(float f, long j) {
        return m74721v(j, f);
    }

    @C11532s0
    /* renamed from: b */
    public static final void m74701b(long j) {
        if (!(!m74718s(j))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    @C11532s0
    /* renamed from: c */
    public static final void m74702c(long j, long j2) {
        boolean z;
        if (m74718s(j) || m74718s(j2)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        } else if (!C16507v.m74732g(C16504t.m74686m(j), C16504t.m74686m(j2))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + C16507v.m74734i(C16504t.m74686m(j)) + " and " + C16507v.m74734i(C16504t.m74686m(j2))).toString());
        }
    }

    @C11532s0
    /* renamed from: d */
    public static final void m74703d(long j, long j2, long j3) {
        boolean z;
        boolean z2 = true;
        if (m74718s(j) || m74718s(j2) || m74718s(j3)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (!C16507v.m74732g(C16504t.m74686m(j), C16504t.m74686m(j2)) || !C16507v.m74732g(C16504t.m74686m(j2), C16504t.m74686m(j3))) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("Cannot perform operation for " + C16507v.m74734i(C16504t.m74686m(j)) + " and " + C16507v.m74734i(C16504t.m74686m(j2))).toString());
            }
            return;
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    /* renamed from: e */
    public static final long m74704e(double d) {
        return m74721v(8589934592L, (float) d);
    }

    /* renamed from: f */
    public static final long m74705f(float f) {
        return m74721v(8589934592L, f);
    }

    /* renamed from: g */
    public static final long m74706g(int i) {
        return m74721v(8589934592L, (float) i);
    }

    @C8547h2
    /* renamed from: h */
    public static /* synthetic */ void m74707h(double d) {
    }

    @C8547h2
    /* renamed from: i */
    public static /* synthetic */ void m74708i(float f) {
    }

    @C8547h2
    /* renamed from: j */
    public static /* synthetic */ void m74709j(int i) {
    }

    /* renamed from: k */
    public static final long m74710k(double d) {
        return m74721v(4294967296L, (float) d);
    }

    /* renamed from: l */
    public static final long m74711l(float f) {
        return m74721v(4294967296L, f);
    }

    /* renamed from: m */
    public static final long m74712m(int i) {
        return m74721v(4294967296L, (float) i);
    }

    @C8547h2
    /* renamed from: n */
    public static /* synthetic */ void m74713n(double d) {
    }

    @C8547h2
    /* renamed from: o */
    public static /* synthetic */ void m74714o(float f) {
    }

    @C8547h2
    /* renamed from: p */
    public static /* synthetic */ void m74715p(int i) {
    }

    /* renamed from: q */
    public static final boolean m74716q(long j) {
        return !m74718s(j);
    }

    @C8547h2
    /* renamed from: r */
    public static /* synthetic */ void m74717r(long j) {
    }

    /* renamed from: s */
    public static final boolean m74718s(long j) {
        return C16504t.m74685l(j) == 0;
    }

    @C8547h2
    /* renamed from: t */
    public static /* synthetic */ void m74719t(long j) {
    }

    @C8547h2
    /* renamed from: u */
    public static final long m74720u(long j, long j2, float f) {
        m74702c(j, j2);
        return m74721v(C16504t.m74685l(j), C16515d.m74781a(C16504t.m74687n(j), C16504t.m74687n(j2), f));
    }

    @C11532s0
    /* renamed from: v */
    public static final long m74721v(long j, float f) {
        return C16504t.m74678e(j | (((long) Float.floatToIntBits(f)) & 4294967295L));
    }

    /* renamed from: w */
    public static final long m74722w(long j, @C12579k C11289a<C16504t> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (!m74718s(j)) {
            return j;
        }
        return aVar.invoke().mo47901w();
    }

    @C8547h2
    /* renamed from: x */
    public static final long m74723x(double d, long j) {
        m74701b(j);
        return m74721v(C16504t.m74685l(j), ((float) d) * C16504t.m74687n(j));
    }

    @C8547h2
    /* renamed from: y */
    public static final long m74724y(float f, long j) {
        m74701b(j);
        return m74721v(C16504t.m74685l(j), f * C16504t.m74687n(j));
    }

    @C8547h2
    /* renamed from: z */
    public static final long m74725z(int i, long j) {
        m74701b(j);
        return m74721v(C16504t.m74685l(j), ((float) i) * C16504t.m74687n(j));
    }
}
