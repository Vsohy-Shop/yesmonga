package androidx.compose.p004ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.geometry.C15092d;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15112a3;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15125c2;
import androidx.compose.p004ui.graphics.C15208f0;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.C15271n0;
import androidx.compose.p004ui.graphics.C15283o4;
import androidx.compose.p004ui.graphics.C15321t3;
import androidx.compose.p004ui.graphics.C15329u3;
import androidx.compose.p004ui.layout.C15572i;
import androidx.compose.p004ui.node.C15672b1;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11079d2;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(23)
@C11363r0({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,378:1\n1#2:379\n*E\n"})
/* renamed from: androidx.compose.ui.platform.RenderNodeLayer */
public final class RenderNodeLayer implements C15672b1, C15572i {
    @C12579k

    /* renamed from: X */
    public static final C15801a f39370X = new C15801a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: Y */
    public static final C11304p<C15939o0, Matrix, C11079d2> f39371Y = RenderNodeLayer$Companion$getMatrix$1.f39385f;
    @C12579k

    /* renamed from: a */
    public final AndroidComposeView f39372a;
    @C12580l

    /* renamed from: b */
    public C11300l<? super C15118b2, C11079d2> f39373b;
    @C12580l

    /* renamed from: c */
    public C11289a<C11079d2> f39374c;

    /* renamed from: d */
    public boolean f39375d;
    @C12579k

    /* renamed from: e */
    public final C15886g1 f39376e;

    /* renamed from: f */
    public boolean f39377f;

    /* renamed from: g */
    public boolean f39378g;
    @C12580l

    /* renamed from: v */
    public C15211f3 f39379v;
    @C12579k

    /* renamed from: w */
    public final C16004z0<C15939o0> f39380w = new C16004z0<>(f39371Y);
    @C12579k

    /* renamed from: x */
    public final C15125c2 f39381x = new C15125c2();

    /* renamed from: y */
    public long f39382y = C15283o4.f37618b.mo42933a();
    @C12579k

    /* renamed from: z */
    public final C15939o0 f39383z;

    /* renamed from: androidx.compose.ui.platform.RenderNodeLayer$a */
    public static final class C15801a {
        public /* synthetic */ C15801a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15801a() {
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.compose.ui.platform.RenderNodeLayer$b */
    public static final class C15802b {
        @C12579k

        /* renamed from: a */
        public static final C15802b f39384a = new C15802b();

        @C0373u
        @C11384m
        /* renamed from: a */
        public static final long m71089a(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            return view.getUniqueDrawingId();
        }
    }

    public RenderNodeLayer(@C12579k AndroidComposeView androidComposeView, @C12579k C11300l<? super C15118b2, C11079d2> lVar, @C12579k C11289a<C11079d2> aVar) {
        C15939o0 o0Var;
        Intrinsics.checkNotNullParameter(androidComposeView, "ownerView");
        Intrinsics.checkNotNullParameter(lVar, "drawBlock");
        Intrinsics.checkNotNullParameter(aVar, "invalidateParentLayer");
        this.f39372a = androidComposeView;
        this.f39373b = lVar;
        this.f39374c = aVar;
        this.f39376e = new C15886g1(androidComposeView.getDensity());
        if (Build.VERSION.SDK_INT >= 29) {
            o0Var = new C15927m3(androidComposeView);
        } else {
            o0Var = new C15892h1(androidComposeView);
        }
        o0Var.mo45744A(true);
        this.f39383z = o0Var;
    }

    /* renamed from: a */
    public void mo44939a(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "matrix");
        C15112a3.m65171u(fArr, this.f39380w.mo45984b(this.f39383z));
    }

    /* renamed from: b */
    public void mo44940b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, @C12579k C15218g4 g4Var, boolean z, @C12580l C15329u3 u3Var, long j2, long j3, int i, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar) {
        C11289a<C11079d2> aVar;
        C15218g4 g4Var2 = g4Var;
        Intrinsics.checkNotNullParameter(g4Var2, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f39382y = j;
        boolean z2 = true;
        boolean z3 = this.f39383z.mo45806y() && !this.f39376e.mo45732d();
        float f11 = f;
        this.f39383z.mo45805x(f);
        float f12 = f2;
        this.f39383z.mo45753J(f2);
        float f13 = f3;
        this.f39383z.mo45780g(f3);
        this.f39383z.mo45762S(f4);
        this.f39383z.mo45796o(f5);
        this.f39383z.mo45789j(f6);
        this.f39383z.mo45764U(C15258l2.m66193r(j2));
        this.f39383z.mo45768Y(C15258l2.m66193r(j3));
        this.f39383z.mo45752I(f9);
        this.f39383z.mo45748E(f7);
        this.f39383z.mo45749F(f8);
        this.f39383z.mo45747D(f10);
        this.f39383z.mo45756M(C15283o4.m66379k(j) * ((float) this.f39383z.getWidth()));
        this.f39383z.mo45758O(C15283o4.m66380l(j) * ((float) this.f39383z.getHeight()));
        this.f39383z.mo45765V(z && g4Var2 != C15321t3.m66567a());
        this.f39383z.mo45778f(z && g4Var2 == C15321t3.m66567a());
        this.f39383z.mo45745B(u3Var);
        this.f39383z.mo45799r(i);
        boolean g = this.f39376e.mo45735g(g4Var, this.f39383z.getAlpha(), this.f39383z.mo45806y(), this.f39383z.mo45769Z(), layoutDirection, dVar);
        this.f39383z.mo45763T(this.f39376e.mo45731c());
        if (!this.f39383z.mo45806y() || this.f39376e.mo45732d()) {
            z2 = false;
        }
        if (z3 != z2 || (z2 && g)) {
            invalidate();
        } else {
            mo45560q();
        }
        if (!this.f39378g && this.f39383z.mo45769Z() > 0.0f && (aVar = this.f39374c) != null) {
            aVar.invoke();
        }
        this.f39380w.mo45985c();
    }

    /* renamed from: c */
    public long mo44941c(long j, boolean z) {
        if (!z) {
            return C15112a3.m65160j(this.f39380w.mo45984b(this.f39383z), j);
        }
        float[] a = this.f39380w.mo45983a(this.f39383z);
        if (a != null) {
            return C15112a3.m65160j(a, j);
        }
        return C15094f.f37256b.mo42246a();
    }

    /* renamed from: d */
    public void mo44942d(long j) {
        int m = C16500q.m74662m(j);
        int j2 = C16500q.m74659j(j);
        float f = (float) m;
        this.f39383z.mo45756M(C15283o4.m66379k(this.f39382y) * f);
        float f2 = (float) j2;
        this.f39383z.mo45758O(C15283o4.m66380l(this.f39382y) * f2);
        C15939o0 o0Var = this.f39383z;
        if (o0Var.mo45785h(o0Var.mo45770a(), this.f39383z.mo45801t(), this.f39383z.mo45770a() + m, this.f39383z.mo45801t() + j2)) {
            this.f39376e.mo45736h(C15106n.m65033a(f, f2));
            this.f39383z.mo45763T(this.f39376e.mo45731c());
            invalidate();
            this.f39380w.mo45985c();
        }
    }

    /* renamed from: e */
    public void mo44943e(@C12579k C15092d dVar, boolean z) {
        Intrinsics.checkNotNullParameter(dVar, "rect");
        if (z) {
            float[] a = this.f39380w.mo45983a(this.f39383z);
            if (a == null) {
                dVar.mo42236k(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                C15112a3.m65162l(a, dVar);
            }
        } else {
            C15112a3.m65162l(this.f39380w.mo45984b(this.f39383z), dVar);
        }
    }

    /* renamed from: f */
    public void mo44944f(@C12579k C15118b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        Canvas d = C15208f0.m65929d(b2Var);
        boolean z = false;
        if (d.isHardwareAccelerated()) {
            mo44951m();
            if (this.f39383z.mo45769Z() > 0.0f) {
                z = true;
            }
            this.f39378g = z;
            if (z) {
                b2Var.mo42445u();
            }
            this.f39383z.mo45776e(d);
            if (this.f39378g) {
                b2Var.mo42423F();
                return;
            }
            return;
        }
        float a = (float) this.f39383z.mo45770a();
        float t = (float) this.f39383z.mo45801t();
        float b = (float) this.f39383z.mo45771b();
        float L = (float) this.f39383z.mo45755L();
        if (this.f39383z.getAlpha() < 1.0f) {
            C15211f3 f3Var = this.f39379v;
            if (f3Var == null) {
                f3Var = C15271n0.m66286a();
                this.f39379v = f3Var;
            }
            f3Var.mo42753g(this.f39383z.getAlpha());
            d.saveLayer(a, t, b, L, f3Var.mo42764q());
        } else {
            b2Var.mo42422E();
        }
        b2Var.mo42433e(a, t);
        b2Var.mo42424G(this.f39380w.mo45984b(this.f39383z));
        mo45557n(b2Var);
        C11300l<? super C15118b2, C11079d2> lVar = this.f39373b;
        if (lVar != null) {
            lVar.invoke(b2Var);
        }
        b2Var.mo42443q();
        mo45559p(false);
    }

    /* renamed from: g */
    public void mo44945g(@C12579k C11300l<? super C15118b2, C11079d2> lVar, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(lVar, "drawBlock");
        Intrinsics.checkNotNullParameter(aVar, "invalidateParentLayer");
        mo45559p(false);
        this.f39377f = false;
        this.f39378g = false;
        this.f39382y = C15283o4.f37618b.mo42933a();
        this.f39373b = lVar;
        this.f39374c = aVar;
    }

    public long getLayerId() {
        return this.f39383z.mo45772c();
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C15802b.m71089a(this.f39372a);
        }
        return -1;
    }

    /* renamed from: h */
    public void mo44946h() {
        if (this.f39383z.mo45794m()) {
            this.f39383z.mo45787i();
        }
        this.f39373b = null;
        this.f39374c = null;
        this.f39377f = true;
        mo45559p(false);
        this.f39372a.mo45362y0();
        this.f39372a.mo45360w0(this);
    }

    /* renamed from: i */
    public boolean mo44947i(long j) {
        float p = C15094f.m64880p(j);
        float r = C15094f.m64882r(j);
        if (this.f39383z.mo45798q()) {
            if (0.0f > p || p >= ((float) this.f39383z.getWidth()) || 0.0f > r || r >= ((float) this.f39383z.getHeight())) {
                return false;
            }
            return true;
        } else if (this.f39383z.mo45806y()) {
            return this.f39376e.mo45733e(j);
        } else {
            return true;
        }
    }

    public void invalidate() {
        if (!this.f39375d && !this.f39377f) {
            this.f39372a.invalidate();
            mo45559p(true);
        }
    }

    /* renamed from: k */
    public void mo44949k(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "matrix");
        float[] a = this.f39380w.mo45983a(this.f39383z);
        if (a != null) {
            C15112a3.m65171u(fArr, a);
        }
    }

    /* renamed from: l */
    public void mo44950l(long j) {
        int a = this.f39383z.mo45770a();
        int t = this.f39383z.mo45801t();
        int m = C16494m.m74581m(j);
        int o = C16494m.m74583o(j);
        if (a != m || t != o) {
            this.f39383z.mo45754K(m - a);
            this.f39383z.mo45791k(o - t);
            mo45560q();
            this.f39380w.mo45985c();
        }
    }

    /* renamed from: m */
    public void mo44951m() {
        C15231i3 i3Var;
        if (this.f39375d || !this.f39383z.mo45794m()) {
            mo45559p(false);
            if (!this.f39383z.mo45806y() || this.f39376e.mo45732d()) {
                i3Var = null;
            } else {
                i3Var = this.f39376e.mo45730b();
            }
            C11300l<? super C15118b2, C11079d2> lVar = this.f39373b;
            if (lVar != null) {
                this.f39383z.mo45766W(this.f39381x, i3Var, lVar);
            }
        }
    }

    /* renamed from: n */
    public final void mo45557n(C15118b2 b2Var) {
        if (this.f39383z.mo45806y() || this.f39383z.mo45798q()) {
            this.f39376e.mo45729a(b2Var);
        }
    }

    @C12579k
    /* renamed from: o */
    public final AndroidComposeView mo45558o() {
        return this.f39372a;
    }

    /* renamed from: p */
    public final void mo45559p(boolean z) {
        if (z != this.f39375d) {
            this.f39375d = z;
            this.f39372a.mo45352s0(this, z);
        }
    }

    /* renamed from: q */
    public final void mo45560q() {
        if (Build.VERSION.SDK_INT >= 26) {
            C15949p4.f39655a.mo45928a(this.f39372a);
        } else {
            this.f39372a.invalidate();
        }
    }
}
