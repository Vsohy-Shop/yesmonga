package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1946b;
import androidx.compose.animation.core.C1983k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8749h;
import androidx.compose.p004ui.focus.C15061e;
import androidx.compose.p004ui.focus.C15087z;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15229i2;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11965h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,417:1\n76#2:418\n102#2,2:419\n76#2:421\n102#2,2:422\n76#2:424\n102#2,2:425\n76#2:427\n102#2,2:428\n76#2:430\n102#2,2:431\n76#2:433\n214#3,8:434\n261#3,8:442\n115#3,9:450\n269#3,3:459\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifier\n*L\n191#1:418\n191#1:419,2\n192#1:421\n192#1:422,2\n193#1:424\n193#1:425,2\n194#1:427\n194#1:428,2\n195#1:430\n195#1:431,2\n199#1:433\n235#1:434,8\n235#1:442,8\n245#1:450,9\n235#1:459,3\n*E\n"})
public final class MarqueeModifier implements C8767m.C8770c, C15603u, C8749h, C15061e {
    @C12579k

    /* renamed from: X */
    public final C8578k2 f5752X;

    /* renamed from: a */
    public final int f5753a;

    /* renamed from: b */
    public final int f5754b;

    /* renamed from: c */
    public final int f5755c;

    /* renamed from: d */
    public final float f5756d;
    @C12579k

    /* renamed from: e */
    public final C16479d f5757e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f5758f;
    @C12579k

    /* renamed from: g */
    public final C8700z0 f5759g;
    @C12579k

    /* renamed from: v */
    public final C8700z0 f5760v;
    @C12579k

    /* renamed from: w */
    public final C8700z0 f5761w;
    @C12579k

    /* renamed from: x */
    public final C8700z0 f5762x;
    @C12579k

    /* renamed from: y */
    public final Animatable<Float, C1983k> f5763y;

    /* renamed from: z */
    public final float f5764z;

    public /* synthetic */ MarqueeModifier(int i, int i2, int i3, float f, C16479d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, f, dVar);
    }

    @C12580l
    /* renamed from: B */
    public final Object mo7211B(@C12579k C11045c<? super C11079d2> cVar) {
        if (this.f5753a <= 0) {
            return C11079d2.f28267a;
        }
        Object h = C11965h.m47673h(C2858w.f7487a, new MarqueeModifier$runAnimation$2(this, (C11045c<? super MarqueeModifier$runAnimation$2>) null), cVar);
        if (h == C11063b.m42612h()) {
            return h;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: C */
    public void mo7212C(@C12579k C15184c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        float floatValue = this.f5763y.mo6613u().floatValue();
        float f = this.f5764z;
        float f2 = floatValue * f;
        boolean z5 = true;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z ? this.f5763y.mo6613u().floatValue() >= ((float) mo7220u()) : this.f5763y.mo6613u().floatValue() >= ((float) mo7221v())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f5764z == 1.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 ? this.f5763y.mo6613u().floatValue() <= ((float) mo7224z()) : this.f5763y.mo6613u().floatValue() <= ((float) ((mo7221v() + mo7224z()) - mo7220u()))) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.f5764z != 1.0f) {
            z5 = false;
        }
        if (z5) {
            i = mo7221v() + mo7224z();
        } else {
            i = (-mo7221v()) - mo7224z();
        }
        float f3 = (float) i;
        float u = f2 + ((float) mo7220u());
        float m = C15104m.m65016m(cVar.mo42718b());
        int b = C15229i2.f37536b.mo42798b();
        C15186d q5 = cVar.mo42683q5();
        long b2 = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42710c(f2, 0.0f, u, m, b);
        if (z2) {
            cVar.mo42716g6();
        }
        if (z4) {
            cVar.mo42683q5().mo42703a().mo42712e(f3, 0.0f);
            cVar.mo42716g6();
            cVar.mo42683q5().mo42703a().mo42712e(-f3, -0.0f);
        }
        q5.mo42705c().mo42443q();
        q5.mo42706d(b2);
    }

    /* renamed from: D */
    public final void mo7213D(int i) {
        this.f5762x.setValue(C2120f0.m9146c(i));
    }

    /* renamed from: E */
    public final void mo7214E(int i) {
        this.f5759g.setValue(Integer.valueOf(i));
    }

    /* renamed from: F */
    public final void mo7215F(int i) {
        this.f5758f.setValue(Integer.valueOf(i));
    }

    /* renamed from: G */
    public final void mo7216G(boolean z) {
        this.f5760v.setValue(Boolean.valueOf(z));
    }

    /* renamed from: H */
    public final void mo7217H(@C12579k C2124g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<set-?>");
        this.f5761w.setValue(g0Var);
    }

    /* renamed from: W */
    public void mo7218W(@C12579k C15087z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "focusState");
        mo7216G(zVar.mo42158r());
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(C16476b.m74351e(j, 0, Integer.MAX_VALUE, 0, 0, 13, (Object) null));
        mo7214E(C16478c.m74382g(j, t0.mo44471K0()));
        mo7215F(t0.mo44471K0());
        return C15568h0.m69206r2(h0Var, mo7220u(), t0.mo44468G0(), (Map) null, new MarqueeModifier$measure$1(t0, this), 4, (Object) null);
    }

    /* renamed from: t */
    public final int mo7219t() {
        return ((C2120f0) this.f5762x.getValue()).mo7305i();
    }

    /* renamed from: u */
    public final int mo7220u() {
        return ((Number) this.f5759g.getValue()).intValue();
    }

    /* renamed from: v */
    public final int mo7221v() {
        return ((Number) this.f5758f.getValue()).intValue();
    }

    /* renamed from: x */
    public final boolean mo7222x() {
        return ((Boolean) this.f5760v.getValue()).booleanValue();
    }

    @C12579k
    /* renamed from: y */
    public final C2124g0 mo7223y() {
        return (C2124g0) this.f5761w.getValue();
    }

    /* renamed from: z */
    public final int mo7224z() {
        return ((Number) this.f5752X.getValue()).intValue();
    }

    public MarqueeModifier(int i, int i2, int i3, float f, C16479d dVar) {
        this.f5753a = i;
        this.f5754b = i2;
        this.f5755c = i3;
        this.f5756d = f;
        this.f5757e = dVar;
        this.f5758f = C8539f2.m30981g(0, (C8410b2) null, 2, (Object) null);
        this.f5759g = C8539f2.m30981g(0, (C8410b2) null, 2, (Object) null);
        this.f5760v = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
        this.f5761w = C8539f2.m30981g(BasicMarqueeKt.m8837j(), (C8410b2) null, 2, (Object) null);
        this.f5762x = C8539f2.m30981g(C2120f0.m9146c(C2120f0.f5809b.mo7307a()), (C8410b2) null, 2, (Object) null);
        this.f5763y = C1946b.m8288b(0.0f, 0.0f, 2, (Object) null);
        this.f5764z = Math.signum(f);
        this.f5752X = C8415c2.m30235d(new MarqueeModifier$spacingPx$2(this));
    }
}
