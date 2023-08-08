package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16483g;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingModifier\n*L\n338#1:437\n339#1:438\n340#1:439\n341#1:440\n*E\n"})
public final class PaddingModifier extends C15988w0 implements C15603u {

    /* renamed from: d */
    public final float f6134d;

    /* renamed from: e */
    public final float f6135e;

    /* renamed from: f */
    public final float f6136f;

    /* renamed from: g */
    public final float f6137g;

    /* renamed from: v */
    public final boolean f6138v;

    public /* synthetic */ PaddingModifier(float f, float f2, float f3, float f4, boolean z, C11300l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, lVar);
    }

    public boolean equals(@C12580l Object obj) {
        PaddingModifier paddingModifier;
        if (obj instanceof PaddingModifier) {
            paddingModifier = (PaddingModifier) obj;
        } else {
            paddingModifier = null;
        }
        if (paddingModifier != null && C16483g.m74440e0(this.f6134d, paddingModifier.f6134d) && C16483g.m74440e0(this.f6135e, paddingModifier.f6135e) && C16483g.m74440e0(this.f6136f, paddingModifier.f6136f) && C16483g.m74440e0(this.f6137g, paddingModifier.f6137g) && this.f6138v == paddingModifier.f6138v) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((C16483g.m74442h0(this.f6134d) * 31) + C16483g.m74442h0(this.f6135e)) * 31) + C16483g.m74442h0(this.f6136f)) * 31) + C16483g.m74442h0(this.f6137g)) * 31) + Boolean.hashCode(this.f6138v);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        int n2 = h0Var.mo7429n2(this.f6134d) + h0Var.mo7429n2(this.f6136f);
        int n22 = h0Var.mo7429n2(this.f6135e) + h0Var.mo7429n2(this.f6137g);
        C15611w0 t0 = e0Var.mo44324t0(C16478c.m74384i(j, -n2, -n22));
        return C15568h0.m69206r2(h0Var, C16478c.m74382g(j, t0.mo44471K0() + n2), C16478c.m74381f(j, t0.mo44468G0() + n22), (Map) null, new PaddingModifier$measure$1(this, t0, h0Var), 4, (Object) null);
    }

    /* renamed from: r */
    public final float mo7828r() {
        return this.f6137g;
    }

    /* renamed from: s */
    public final float mo7829s() {
        return this.f6136f;
    }

    /* renamed from: t */
    public final boolean mo7830t() {
        return this.f6138v;
    }

    /* renamed from: u */
    public final float mo7831u() {
        return this.f6134d;
    }

    /* renamed from: v */
    public final float mo7832v() {
        return this.f6135e;
    }

    public PaddingModifier(float f, float f2, float f3, float f4, boolean z, C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        this.f6134d = f;
        this.f6135e = f2;
        this.f6136f = f3;
        this.f6137g = f4;
        this.f6138v = z;
        if (!((f >= 0.0f || C16483g.m74440e0(f, C16483g.f40871b.mo47828e())) && (f2 >= 0.0f || C16483g.m74440e0(f2, C16483g.f40871b.mo47828e())) && ((f3 >= 0.0f || C16483g.m74440e0(f3, C16483g.f40871b.mo47828e())) && (f4 >= 0.0f || C16483g.m74440e0(f4, C16483g.f40871b.mo47828e()))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaddingModifier(float f, float f2, float f3, float f4, boolean z, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C16483g.m74435M((float) 0) : f, (i & 2) != 0 ? C16483g.m74435M((float) 0) : f2, (i & 4) != 0 ? C16483g.m74435M((float) 0) : f3, (i & 8) != 0 ? C16483g.m74435M((float) 0) : f4, z, lVar, (DefaultConstructorMarker) null);
    }
}
