package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16485h;
import androidx.compose.p004ui.unit.C16491k;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.C16507v;
import androidx.compose.runtime.C8547h2;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C2855v
@C11363r0({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,147:1\n1#2:148\n174#3:149\n174#3:150\n473#3:151\n152#4:152\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n70#1:149\n73#1:150\n85#1:151\n92#1:152\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.layout.k */
public interface C2552k extends C15568h0 {
    @C8547h2
    /* renamed from: L */
    float mo7416L(int i) {
        return C16483g.m74435M(((float) i) / getDensity());
    }

    @C8547h2
    /* renamed from: M */
    float mo7418M(float f) {
        return C16483g.m74435M(f / getDensity());
    }

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
    /* renamed from: q */
    float mo7430q(long j) {
        if (C16507v.m74732g(C16504t.m74686m(j), C16507v.f40911b.mo47909b())) {
            return C16483g.m74435M(C16504t.m74687n(j) * mo7419R4());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @C12579k
    /* renamed from: s1 */
    List<C15611w0> mo8740s1(int i, long j);

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
}
