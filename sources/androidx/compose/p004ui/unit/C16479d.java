package androidx.compose.p004ui.unit;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C8585m0
@C11363r0({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,163:1\n1#2:164\n174#3:165\n174#3:166\n473#3:167\n152#4:168\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n114#1:165\n124#1:166\n147#1:167\n157#1:168\n*E\n"})
/* renamed from: androidx.compose.ui.unit.d */
public interface C16479d {

    /* renamed from: androidx.compose.ui.unit.d$a */
    public static final class C16480a {
        @C8547h2
        /* renamed from: a */
        public static /* synthetic */ void m74413a() {
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m74414b() {
        }

        @C8547h2
        @Deprecated
        /* renamed from: c */
        public static int m74415c(@C12579k C16479d dVar, long j) {
            return C16479d.super.mo7433u5(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: d */
        public static int m74416d(@C12579k C16479d dVar, float f) {
            return C16479d.super.mo7429n2(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: e */
        public static float m74417e(@C12579k C16479d dVar, long j) {
            return C16479d.super.mo7430q(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: f */
        public static float m74418f(@C12579k C16479d dVar, float f) {
            return C16479d.super.mo7418M(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: g */
        public static float m74419g(@C12579k C16479d dVar, int i) {
            return C16479d.super.mo7416L(i);
        }

        @C8547h2
        @Deprecated
        /* renamed from: h */
        public static long m74420h(@C12579k C16479d dVar, long j) {
            return C16479d.super.mo7428n(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: i */
        public static float m74421i(@C12579k C16479d dVar, long j) {
            return C16479d.super.mo7415C2(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: j */
        public static float m74422j(@C12579k C16479d dVar, float f) {
            return C16479d.super.mo7425g5(f);
        }

        @C8547h2
        @Deprecated
        @C12579k
        /* renamed from: k */
        public static C15098i m74423k(@C12579k C16479d dVar, @C12579k C16489j jVar) {
            Intrinsics.checkNotNullParameter(jVar, "$receiver");
            return C16479d.super.mo7417L4(jVar);
        }

        @C8547h2
        @Deprecated
        /* renamed from: l */
        public static long m74424l(@C12579k C16479d dVar, long j) {
            return C16479d.super.mo7420V(j);
        }

        @C8547h2
        @Deprecated
        /* renamed from: m */
        public static long m74425m(@C12579k C16479d dVar, float f) {
            return C16479d.super.mo7427m(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: n */
        public static long m74426n(@C12579k C16479d dVar, float f) {
            return C16479d.super.mo7432u(f);
        }

        @C8547h2
        @Deprecated
        /* renamed from: o */
        public static long m74427o(@C12579k C16479d dVar, int i) {
            return C16479d.super.mo7431t(i);
        }
    }

    @C8547h2
    /* renamed from: C2 */
    float mo7415C2(long j) {
        if (C16507v.m74732g(C16504t.m74686m(j), C16507v.f40911b.mo47909b())) {
            return C16504t.m74687n(j) * mo7419R4() * getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @C8547h2
    /* renamed from: L */
    float mo7416L(int i) {
        return C16483g.m74435M(((float) i) / getDensity());
    }

    @C8547h2
    @C12579k
    /* renamed from: L4 */
    C15098i mo7417L4(@C12579k C16489j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new C15098i(mo7425g5(jVar.mo47843i()), mo7425g5(jVar.mo47845m()), mo7425g5(jVar.mo47844k()), mo7425g5(jVar.mo47841g()));
    }

    @C8547h2
    /* renamed from: M */
    float mo7418M(float f) {
        return C16483g.m74435M(f / getDensity());
    }

    /* renamed from: R4 */
    float mo7419R4();

    @C8547h2
    /* renamed from: V */
    long mo7420V(long j) {
        boolean z;
        if (j != C16491k.f40886b.mo47851a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C15106n.m65033a(mo7425g5(C16491k.m74558p(j)), mo7425g5(C16491k.m74555m(j)));
        }
        return C15104m.f37280b.mo42316a();
    }

    @C8547h2
    /* renamed from: g5 */
    float mo7425g5(float f) {
        return f * getDensity();
    }

    float getDensity();

    @C8547h2
    /* renamed from: m */
    long mo7427m(float f) {
        return C16506u.m74711l(f / mo7419R4());
    }

    @C8547h2
    /* renamed from: n */
    long mo7428n(long j) {
        boolean z;
        if (j != C15104m.f37280b.mo42316a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C16485h.m74483b(mo7418M(C15104m.m65023t(j)), mo7418M(C15104m.m65016m(j)));
        }
        return C16491k.f40886b.mo47851a();
    }

    @C8547h2
    /* renamed from: n2 */
    int mo7429n2(float f) {
        float g5 = mo7425g5(f);
        if (Float.isInfinite(g5)) {
            return Integer.MAX_VALUE;
        }
        return C11409d.m43851L0(g5);
    }

    @C8547h2
    /* renamed from: q */
    float mo7430q(long j) {
        if (C16507v.m74732g(C16504t.m74686m(j), C16507v.f40911b.mo47909b())) {
            return C16483g.m74435M(C16504t.m74687n(j) * mo7419R4());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @C8547h2
    /* renamed from: t */
    long mo7431t(int i) {
        return C16506u.m74711l(((float) i) / (mo7419R4() * getDensity()));
    }

    @C8547h2
    /* renamed from: u */
    long mo7432u(float f) {
        return C16506u.m74711l(f / (mo7419R4() * getDensity()));
    }

    @C8547h2
    /* renamed from: u5 */
    int mo7433u5(long j) {
        return C11409d.m43851L0(mo7415C2(j));
    }
}
