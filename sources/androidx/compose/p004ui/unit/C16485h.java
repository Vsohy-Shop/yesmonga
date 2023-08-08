package androidx.compose.p004ui.unit;

import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8547h2;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n130#1:558\n337#1:562\n473#1:566\n544#1:570\n550#1:572\n25#2,3:559\n25#2,3:563\n71#3:567\n58#3:568\n58#3:569\n58#3:571\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n144#1:558\n351#1:562\n487#1:566\n556#1:570\n556#1:572\n254#1:559,3\n372#1:563,3\n495#1:567\n544#1:568\n550#1:569\n556#1:571\n*E\n"})
/* renamed from: androidx.compose.ui.unit.h */
public final class C16485h {
    @C8547h2
    /* renamed from: A */
    public static /* synthetic */ void m74462A(long j) {
    }

    /* renamed from: B */
    public static final boolean m74463B(float f) {
        return Float.isNaN(f);
    }

    @C8547h2
    /* renamed from: C */
    public static /* synthetic */ void m74464C(float f) {
    }

    /* renamed from: D */
    public static final boolean m74465D(long j) {
        return j == C16491k.f40886b.mo47851a();
    }

    @C8547h2
    /* renamed from: E */
    public static /* synthetic */ void m74466E(long j) {
    }

    /* renamed from: F */
    public static final boolean m74467F(long j) {
        return j == C16486i.f40876b.mo47833a();
    }

    @C8547h2
    /* renamed from: G */
    public static /* synthetic */ void m74468G(long j) {
    }

    @C8547h2
    /* renamed from: H */
    public static final long m74469H(long j, long j2, float f) {
        return m74483b(m74470I(C16491k.m74558p(j), C16491k.m74558p(j2), f), m74470I(C16491k.m74555m(j), C16491k.m74555m(j2), f));
    }

    @C8547h2
    /* renamed from: I */
    public static final float m74470I(float f, float f2, float f3) {
        return C16483g.m74435M(C16515d.m74781a(f, f2, f3));
    }

    @C8547h2
    /* renamed from: J */
    public static final long m74471J(long j, long j2, float f) {
        return m74482a(m74470I(C16486i.m74517j(j), C16486i.m74517j(j2), f), m74470I(C16486i.m74519l(j), C16486i.m74519l(j2), f));
    }

    @C8547h2
    /* renamed from: K */
    public static final float m74472K(float f, float f2) {
        return C16483g.m74435M(Math.max(f, f2));
    }

    @C8547h2
    /* renamed from: L */
    public static final float m74473L(float f, float f2) {
        return C16483g.m74435M(Math.min(f, f2));
    }

    /* renamed from: M */
    public static final float m74474M(float f, @C12579k C11289a<C16483g> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (!Float.isNaN(f)) {
            return f;
        }
        return aVar.invoke().mo47823t0();
    }

    /* renamed from: N */
    public static final long m74475N(long j, @C12579k C11289a<C16486i> aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (j != C16486i.f40876b.mo47833a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        return aVar.invoke().mo47831r();
    }

    /* renamed from: O */
    public static final long m74476O(long j, @C12579k C11289a<C16491k> aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (j != C16491k.f40886b.mo47851a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        return aVar.invoke().mo47850x();
    }

    @C8547h2
    /* renamed from: P */
    public static final float m74477P(double d, float f) {
        return C16483g.m74435M(((float) d) * f);
    }

    @C8547h2
    /* renamed from: Q */
    public static final float m74478Q(float f, float f2) {
        return C16483g.m74435M(f * f2);
    }

    @C8547h2
    /* renamed from: R */
    public static final float m74479R(int i, float f) {
        return C16483g.m74435M(((float) i) * f);
    }

    @C8547h2
    /* renamed from: S */
    public static final long m74480S(float f, long j) {
        return C16491k.m74563u(j, f);
    }

    @C8547h2
    /* renamed from: T */
    public static final long m74481T(int i, long j) {
        return C16491k.m74564v(j, i);
    }

    @C8547h2
    /* renamed from: a */
    public static final long m74482a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return C16486i.m74511d((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    @C8547h2
    /* renamed from: b */
    public static final long m74483b(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return C16491k.m74548f((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    @C8547h2
    /* renamed from: c */
    public static final float m74484c(float f, float f2) {
        return C16483g.m74435M(C11479u.m44444t(f, f2));
    }

    @C8547h2
    /* renamed from: d */
    public static final float m74485d(float f, float f2) {
        return C16483g.m74435M(C11479u.m44310A(f, f2));
    }

    @C8547h2
    /* renamed from: e */
    public static final float m74486e(float f, float f2, float f3) {
        return C16483g.m74435M(C11479u.m44331H(f, f2, f3));
    }

    /* renamed from: f */
    public static final long m74487f(long j) {
        return m74482a(C16483g.m74435M(C16491k.m74558p(j) / 2.0f), C16483g.m74435M(C16491k.m74555m(j) / 2.0f));
    }

    @C8547h2
    /* renamed from: g */
    public static /* synthetic */ void m74488g(long j) {
    }

    /* renamed from: h */
    public static final float m74489h(double d) {
        return C16483g.m74435M((float) d);
    }

    /* renamed from: i */
    public static final float m74490i(float f) {
        return C16483g.m74435M(f);
    }

    /* renamed from: j */
    public static final float m74491j(int i) {
        return C16483g.m74435M((float) i);
    }

    @C8547h2
    /* renamed from: k */
    public static /* synthetic */ void m74492k(double d) {
    }

    @C8547h2
    /* renamed from: l */
    public static /* synthetic */ void m74493l(float f) {
    }

    @C8547h2
    /* renamed from: m */
    public static /* synthetic */ void m74494m(int i) {
    }

    /* renamed from: n */
    public static final float m74495n(@C12579k C16489j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return C16483g.m74435M(jVar.mo47841g() - jVar.mo47845m());
    }

    @C8547h2
    /* renamed from: o */
    public static /* synthetic */ void m74496o(C16489j jVar) {
    }

    /* renamed from: p */
    public static final long m74497p(@C12579k C16489j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return m74483b(C16483g.m74435M(jVar.mo47844k() - jVar.mo47843i()), C16483g.m74435M(jVar.mo47841g() - jVar.mo47845m()));
    }

    @C8547h2
    /* renamed from: q */
    public static /* synthetic */ void m74498q(C16489j jVar) {
    }

    /* renamed from: r */
    public static final float m74499r(@C12579k C16489j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return C16483g.m74435M(jVar.mo47844k() - jVar.mo47843i());
    }

    @C8547h2
    /* renamed from: s */
    public static /* synthetic */ void m74500s(C16489j jVar) {
    }

    /* renamed from: t */
    public static final boolean m74501t(float f) {
        return !(f == Float.POSITIVE_INFINITY);
    }

    @C8547h2
    /* renamed from: u */
    public static /* synthetic */ void m74502u(float f) {
    }

    /* renamed from: v */
    public static final boolean m74503v(float f) {
        return !Float.isNaN(f);
    }

    @C8547h2
    /* renamed from: w */
    public static /* synthetic */ void m74504w(float f) {
    }

    /* renamed from: x */
    public static final boolean m74505x(long j) {
        return j != C16491k.f40886b.mo47851a();
    }

    @C8547h2
    /* renamed from: y */
    public static /* synthetic */ void m74506y(long j) {
    }

    /* renamed from: z */
    public static final boolean m74507z(long j) {
        return j != C16486i.f40876b.mo47833a();
    }
}
