package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15558e1;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.node.C15693i;
import androidx.compose.p004ui.node.C15740w;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16502r;
import com.urbanairship.iam.C9168d0;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterModifierNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,366:1\n152#2:367\n120#3,4:368\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterModifierNode\n*L\n170#1:367\n345#1:368,4\n*E\n"})
/* renamed from: androidx.compose.ui.draw.PainterModifierNode */
public final class PainterModifierNode extends C8767m.C8772d implements C15740w, C15693i {

    /* renamed from: E0 */
    public float f23433E0;
    @C12580l

    /* renamed from: F0 */
    public C15249k2 f23434F0;

    /* renamed from: X */
    public boolean f23435X;
    @C12579k

    /* renamed from: Y */
    public C8734c f23436Y;
    @C12579k

    /* renamed from: Z */
    public C15541c f23437Z;
    @C12579k

    /* renamed from: z */
    public Painter f23438z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PainterModifierNode(Painter painter, boolean z, C8734c cVar, C15541c cVar2, float f, C15249k2 k2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z, (i & 4) != 0 ? C8734c.f23406a.mo17066i() : cVar, (i & 8) != 0 ? C15541c.f38696a.mo44374k() : cVar2, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : k2Var);
    }

    /* renamed from: C */
    public void mo17117C(@C12579k C15184c cVar) {
        float f;
        float f2;
        boolean z;
        long j;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        long l = this.f23438z.mo42949l();
        if (mo17132s0(l)) {
            f = C15104m.m65023t(l);
        } else {
            f = C15104m.m65023t(cVar.mo42718b());
        }
        if (mo17131r0(l)) {
            f2 = C15104m.m65016m(l);
        } else {
            f2 = C15104m.m65016m(cVar.mo42718b());
        }
        long a = C15106n.m65033a(f, f2);
        boolean z2 = true;
        if (C15104m.m65023t(cVar.mo42718b()) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (C15104m.m65016m(cVar.mo42718b()) != 0.0f) {
                z2 = false;
            }
            if (!z2) {
                j = C15558e1.m69160k(a, this.f23437Z.mo44368a(a, cVar.mo42718b()));
                long j2 = j;
                long a2 = this.f23436Y.mo17059a(C16502r.m74668a(C11409d.m43851L0(C15104m.m65023t(j2)), C11409d.m43851L0(C15104m.m65016m(j2))), C16502r.m74668a(C11409d.m43851L0(C15104m.m65023t(cVar.mo42718b())), C11409d.m43851L0(C15104m.m65016m(cVar.mo42718b()))), cVar.getLayoutDirection());
                float m = (float) C16494m.m74581m(a2);
                float o = (float) C16494m.m74583o(a2);
                cVar.mo42683q5().mo42703a().mo42712e(m, o);
                this.f23438z.mo42948j(cVar, j2, this.f23433E0, this.f23434F0);
                cVar.mo42683q5().mo42703a().mo42712e(-m, -o);
                cVar.mo42716g6();
            }
        }
        j = C15104m.f37280b.mo42317c();
        long j22 = j;
        long a22 = this.f23436Y.mo17059a(C16502r.m74668a(C11409d.m43851L0(C15104m.m65023t(j22)), C11409d.m43851L0(C15104m.m65016m(j22))), C16502r.m74668a(C11409d.m43851L0(C15104m.m65023t(cVar.mo42718b())), C11409d.m43851L0(C15104m.m65016m(cVar.mo42718b()))), cVar.getLayoutDirection());
        float m2 = (float) C16494m.m74581m(a22);
        float o2 = (float) C16494m.m74583o(a22);
        cVar.mo42683q5().mo42703a().mo42712e(m2, o2);
        this.f23438z.mo42948j(cVar, j22, this.f23433E0, this.f23434F0);
        cVar.mo42683q5().mo42703a().mo42712e(-m2, -o2);
        cVar.mo42716g6();
    }

    /* renamed from: c */
    public int mo17118c(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        if (!mo17130q0()) {
            return lVar.mo44320d(i);
        }
        long t0 = mo17133t0(C16478c.m74377b(0, i, 0, 0, 13, (Object) null));
        return Math.max(C16476b.m74363q(t0), lVar.mo44320d(i));
    }

    /* renamed from: d */
    public int mo17119d(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        if (!mo17130q0()) {
            return lVar.mo44317a0(i);
        }
        long t0 = mo17133t0(C16478c.m74377b(0, i, 0, 0, 13, (Object) null));
        return Math.max(C16476b.m74363q(t0), lVar.mo44317a0(i));
    }

    /* renamed from: f */
    public int mo17120f(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        if (!mo17130q0()) {
            return lVar.mo44322o0(i);
        }
        long t0 = mo17133t0(C16478c.m74377b(0, 0, 0, i, 7, (Object) null));
        return Math.max(C16476b.m74364r(t0), lVar.mo44322o0(i));
    }

    /* renamed from: h */
    public int mo17121h(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        if (!mo17130q0()) {
            return lVar.mo44323p0(i);
        }
        long t0 = mo17133t0(C16478c.m74377b(0, 0, 0, i, 7, (Object) null));
        return Math.max(C16476b.m74364r(t0), lVar.mo44323p0(i));
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo17122i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(mo17133t0(j));
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new PainterModifierNode$measure$1(t0), 4, (Object) null);
    }

    /* renamed from: j0 */
    public final long mo17123j0(long j) {
        float f;
        float f2;
        boolean z;
        if (!mo17130q0()) {
            return j;
        }
        if (!mo17132s0(this.f23438z.mo42949l())) {
            f = C15104m.m65023t(j);
        } else {
            f = C15104m.m65023t(this.f23438z.mo42949l());
        }
        if (!mo17131r0(this.f23438z.mo42949l())) {
            f2 = C15104m.m65016m(j);
        } else {
            f2 = C15104m.m65016m(this.f23438z.mo42949l());
        }
        long a = C15106n.m65033a(f, f2);
        boolean z2 = true;
        if (C15104m.m65023t(j) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (C15104m.m65016m(j) != 0.0f) {
                z2 = false;
            }
            if (!z2) {
                return C15558e1.m69160k(a, this.f23437Z.mo44368a(a, j));
            }
        }
        return C15104m.f37280b.mo42317c();
    }

    @C12579k
    /* renamed from: k0 */
    public final C8734c mo17124k0() {
        return this.f23436Y;
    }

    /* renamed from: l0 */
    public final float mo17125l0() {
        return this.f23433E0;
    }

    @C12580l
    /* renamed from: m0 */
    public final C15249k2 mo17126m0() {
        return this.f23434F0;
    }

    @C12579k
    /* renamed from: n0 */
    public final C15541c mo17127n0() {
        return this.f23437Z;
    }

    @C12579k
    /* renamed from: o0 */
    public final Painter mo17128o0() {
        return this.f23438z;
    }

    /* renamed from: p0 */
    public final boolean mo17129p0() {
        return this.f23435X;
    }

    /* renamed from: q0 */
    public final boolean mo17130q0() {
        boolean z;
        if (!this.f23435X) {
            return false;
        }
        if (this.f23438z.mo42949l() != C15104m.f37280b.mo42316a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    public final boolean mo17131r0(long j) {
        if (C15104m.m65014k(j, C15104m.f37280b.mo42316a())) {
            return false;
        }
        float m = C15104m.m65016m(j);
        return !Float.isInfinite(m) && !Float.isNaN(m);
    }

    /* renamed from: s0 */
    public final boolean mo17132s0(long j) {
        if (C15104m.m65014k(j, C15104m.f37280b.mo42316a())) {
            return false;
        }
        float t = C15104m.m65023t(j);
        return !Float.isInfinite(t) && !Float.isNaN(t);
    }

    /* renamed from: t0 */
    public final long mo17133t0(long j) {
        boolean z;
        int i;
        int i2;
        boolean z2 = true;
        if (!C16476b.m74356j(j) || !C16476b.m74355i(j)) {
            z = false;
        } else {
            z = true;
        }
        if (!C16476b.m74360n(j) || !C16476b.m74358l(j)) {
            z2 = false;
        }
        if ((mo17130q0() || !z) && !z2) {
            long l = this.f23438z.mo42949l();
            if (mo17132s0(l)) {
                i = C11409d.m43851L0(C15104m.m65023t(l));
            } else {
                i = C16476b.m74364r(j);
            }
            if (mo17131r0(l)) {
                i2 = C11409d.m43851L0(C15104m.m65016m(l));
            } else {
                i2 = C16476b.m74363q(j);
            }
            long j0 = mo17123j0(C15106n.m65033a((float) C16478c.m74382g(j, i), (float) C16478c.m74381f(j, i2)));
            return C16476b.m74351e(j, C16478c.m74382g(j, C11409d.m43851L0(C15104m.m65023t(j0))), 0, C16478c.m74381f(j, C11409d.m43851L0(C15104m.m65016m(j0))), 0, 10, (Object) null);
        }
        return C16476b.m74351e(j, C16476b.m74362p(j), 0, C16476b.m74361o(j), 0, 10, (Object) null);
    }

    @C12579k
    public String toString() {
        return "PainterModifier(painter=" + this.f23438z + ", sizeToIntrinsics=" + this.f23435X + ", alignment=" + this.f23436Y + ", alpha=" + this.f23433E0 + ", colorFilter=" + this.f23434F0 + ')';
    }

    /* renamed from: u0 */
    public final void mo17135u0(@C12579k C8734c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f23436Y = cVar;
    }

    /* renamed from: v0 */
    public final void mo17136v0(float f) {
        this.f23433E0 = f;
    }

    /* renamed from: w0 */
    public final void mo17137w0(@C12580l C15249k2 k2Var) {
        this.f23434F0 = k2Var;
    }

    /* renamed from: x0 */
    public final void mo17138x0(@C12579k C15541c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f23437Z = cVar;
    }

    /* renamed from: y0 */
    public final void mo17139y0(@C12579k Painter painter) {
        Intrinsics.checkNotNullParameter(painter, "<set-?>");
        this.f23438z = painter;
    }

    /* renamed from: z0 */
    public final void mo17140z0(boolean z) {
        this.f23435X = z;
    }

    public PainterModifierNode(@C12579k Painter painter, boolean z, @C12579k C8734c cVar, @C12579k C15541c cVar2, float f, @C12580l C15249k2 k2Var) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        Intrinsics.checkNotNullParameter(cVar2, "contentScale");
        this.f23438z = painter;
        this.f23435X = z;
        this.f23436Y = cVar;
        this.f23437Z = cVar2;
        this.f23433E0 = f;
        this.f23434F0 = k2Var;
    }
}
