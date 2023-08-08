package androidx.compose.p004ui.graphics.painter;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15100j;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15271n0;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,217:1\n66#2,2:218\n245#2:220\n68#2,2:228\n111#3,7:221\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n195#1:218,2\n206#1:220\n195#1:228,2\n207#1:221,7\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.painter.Painter */
public abstract class Painter {
    @C12580l

    /* renamed from: a */
    public C15211f3 f37627a;

    /* renamed from: b */
    public boolean f37628b;
    @C12580l

    /* renamed from: c */
    public C15249k2 f37629c;

    /* renamed from: d */
    public float f37630d = 1.0f;
    @C12579k

    /* renamed from: e */
    public LayoutDirection f37631e = LayoutDirection.Ltr;
    @C12579k

    /* renamed from: f */
    public final C11300l<C15187e, C11079d2> f37632f = new Painter$drawLambda$1(this);

    /* renamed from: k */
    public static /* synthetic */ void m66402k(Painter painter, C15187e eVar, long j, float f, C15249k2 k2Var, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = 1.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                k2Var = null;
            }
            painter.mo42948j(eVar, j, f2, k2Var);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
    }

    /* renamed from: a */
    public boolean mo42942a(float f) {
        return false;
    }

    /* renamed from: b */
    public boolean mo42943b(@C12580l C15249k2 k2Var) {
        return false;
    }

    /* renamed from: c */
    public boolean mo42944c(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return false;
    }

    /* renamed from: f */
    public final void mo42945f(float f) {
        boolean z;
        boolean z2;
        if (this.f37630d == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!mo42942a(f)) {
                if (f == 1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    C15211f3 f3Var = this.f37627a;
                    if (f3Var != null) {
                        f3Var.mo42753g(f);
                    }
                    this.f37628b = false;
                } else {
                    mo42950m().mo42753g(f);
                    this.f37628b = true;
                }
            }
            this.f37630d = f;
        }
    }

    /* renamed from: h */
    public final void mo42946h(C15249k2 k2Var) {
        if (!Intrinsics.areEqual((Object) this.f37629c, (Object) k2Var)) {
            if (!mo42943b(k2Var)) {
                if (k2Var == null) {
                    C15211f3 f3Var = this.f37627a;
                    if (f3Var != null) {
                        f3Var.mo42767t((C15249k2) null);
                    }
                    this.f37628b = false;
                } else {
                    mo42950m().mo42767t(k2Var);
                    this.f37628b = true;
                }
            }
            this.f37629c = k2Var;
        }
    }

    /* renamed from: i */
    public final void mo42947i(LayoutDirection layoutDirection) {
        if (this.f37631e != layoutDirection) {
            mo42944c(layoutDirection);
            this.f37631e = layoutDirection;
        }
    }

    /* renamed from: j */
    public final void mo42948j(@C12579k C15187e eVar, long j, float f, @C12580l C15249k2 k2Var) {
        Intrinsics.checkNotNullParameter(eVar, "$this$draw");
        mo42945f(f);
        mo42946h(k2Var);
        mo42947i(eVar.getLayoutDirection());
        float t = C15104m.m65023t(eVar.mo42718b()) - C15104m.m65023t(j);
        float m = C15104m.m65016m(eVar.mo42718b()) - C15104m.m65016m(j);
        eVar.mo42683q5().mo42703a().mo42715n(0.0f, 0.0f, t, m);
        if (f > 0.0f && C15104m.m65023t(j) > 0.0f && C15104m.m65016m(j) > 0.0f) {
            if (this.f37628b) {
                C15098i c = C15100j.m64956c(C15094f.f37256b.mo42248e(), C15106n.m65033a(C15104m.m65023t(j), C15104m.m65016m(j)));
                C15118b2 c2 = eVar.mo42683q5().mo42705c();
                try {
                    c2.mo42447x(c, mo42950m());
                    mo42951n(eVar);
                } finally {
                    c2.mo42443q();
                }
            } else {
                mo42951n(eVar);
            }
        }
        eVar.mo42683q5().mo42703a().mo42715n(-0.0f, -0.0f, -t, -m);
    }

    /* renamed from: l */
    public abstract long mo42949l();

    /* renamed from: m */
    public final C15211f3 mo42950m() {
        C15211f3 f3Var = this.f37627a;
        if (f3Var != null) {
            return f3Var;
        }
        C15211f3 a = C15271n0.m66286a();
        this.f37627a = a;
        return a;
    }

    /* renamed from: n */
    public abstract void mo42951n(@C12579k C15187e eVar);
}
