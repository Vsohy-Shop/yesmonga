package androidx.compose.p004ui.graphics.vector;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8598p;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.C8676t;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,420:1\n76#2:421\n102#2,2:422\n76#2:424\n102#2,2:425\n76#2:427\n102#2,2:428\n281#3:430\n282#3:448\n173#4,6:431\n261#4,11:437\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n178#1:421\n178#1:422,2\n180#1:424\n180#1:425,2\n219#1:427\n219#1:428,2\n255#1:430\n255#1:448\n255#1:431,6\n255#1:437,11\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter */
public final class VectorPainter extends Painter {

    /* renamed from: Y */
    public static final int f37795Y = 8;
    @C12580l

    /* renamed from: X */
    public C15249k2 f37796X;
    @C12579k

    /* renamed from: g */
    public final C8700z0 f37797g = C8539f2.m30981g(C15104m.m65006c(C15104m.f37280b.mo42317c()), (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: v */
    public final C8700z0 f37798v = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: w */
    public final VectorComponent f37799w;
    @C12580l

    /* renamed from: x */
    public C8598p f37800x;
    @C12579k

    /* renamed from: y */
    public final C8700z0 f37801y;

    /* renamed from: z */
    public float f37802z;

    public VectorPainter() {
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.mo43088o(new VectorPainter$vector$1$1(this));
        this.f37799w = vectorComponent;
        this.f37801y = C8539f2.m30981g(Boolean.TRUE, (C8410b2) null, 2, (Object) null);
        this.f37802z = 1.0f;
    }

    /* renamed from: a */
    public boolean mo42942a(float f) {
        this.f37802z = f;
        return true;
    }

    /* renamed from: b */
    public boolean mo42943b(@C12580l C15249k2 k2Var) {
        this.f37796X = k2Var;
        return true;
    }

    /* renamed from: l */
    public long mo42949l() {
        return mo43125u();
    }

    /* renamed from: n */
    public void mo42951n(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        VectorComponent vectorComponent = this.f37799w;
        C15249k2 k2Var = this.f37796X;
        if (k2Var == null) {
            k2Var = vectorComponent.mo43081h();
        }
        if (!mo43123s() || eVar.getLayoutDirection() != LayoutDirection.Rtl) {
            vectorComponent.mo43080g(eVar, this.f37802z, k2Var);
        } else {
            long U = eVar.mo42717U();
            C15186d q5 = eVar.mo42683q5();
            long b = q5.mo42704b();
            q5.mo42705c().mo42422E();
            q5.mo42703a().mo42713j(-1.0f, 1.0f, U);
            vectorComponent.mo43080g(eVar, this.f37802z, k2Var);
            q5.mo42705c().mo42443q();
            q5.mo42706d(b);
        }
        if (mo43126v()) {
            mo43128x(false);
        }
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: o */
    public final void mo43121o(@C12579k String str, float f, float f2, @C12579k C11306r<? super Float, ? super Float, ? super C8592o, ? super Integer, C11079d2> rVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(rVar, "content");
        C8592o o = oVar.mo15009o(1264894527);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1264894527, i, -1, "androidx.compose.ui.graphics.vector.VectorPainter.RenderVector (VectorPainter.kt:221)");
        }
        VectorComponent vectorComponent = this.f37799w;
        vectorComponent.mo43089p(str);
        vectorComponent.mo43091r(f);
        vectorComponent.mo43090q(f2);
        C8598p r = mo43122r(ComposablesKt.m29526u(o, 0), rVar);
        EffectsKt.m29891c(r, new VectorPainter$RenderVector$2(r), o, 8);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new VectorPainter$RenderVector$3(this, str, f, f2, rVar, i));
        }
    }

    @C8544h(scheme = "[0[0]]")
    /* renamed from: r */
    public final C8598p mo43122r(C8602q qVar, C11306r<? super Float, ? super Float, ? super C8592o, ? super Integer, C11079d2> rVar) {
        C8598p pVar = this.f37800x;
        if (pVar == null || pVar.mo16285h()) {
            pVar = C8676t.m31865a(new C15374j(this.f37799w.mo43084k()), qVar);
        }
        this.f37800x = pVar;
        pVar.mo16286j(C8553b.m31049c(-1916507005, true, new VectorPainter$composeVector$1(rVar, this)));
        return pVar;
    }

    /* renamed from: s */
    public final boolean mo43123s() {
        return ((Boolean) this.f37798v.getValue()).booleanValue();
    }

    @C12580l
    /* renamed from: t */
    public final C15249k2 mo43124t() {
        return this.f37799w.mo43081h();
    }

    /* renamed from: u */
    public final long mo43125u() {
        return ((C15104m) this.f37797g.getValue()).mo42315y();
    }

    /* renamed from: v */
    public final boolean mo43126v() {
        return ((Boolean) this.f37801y.getValue()).booleanValue();
    }

    /* renamed from: w */
    public final void mo43127w(boolean z) {
        this.f37798v.setValue(Boolean.valueOf(z));
    }

    /* renamed from: x */
    public final void mo43128x(boolean z) {
        this.f37801y.setValue(Boolean.valueOf(z));
    }

    /* renamed from: y */
    public final void mo43129y(@C12580l C15249k2 k2Var) {
        this.f37799w.mo43087n(k2Var);
    }

    /* renamed from: z */
    public final void mo43130z(long j) {
        this.f37797g.setValue(C15104m.m65006c(j));
    }
}
