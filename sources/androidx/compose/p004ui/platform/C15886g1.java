package androidx.compose.p004ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.p004ui.geometry.C15088a;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15101k;
import androidx.compose.p004ui.geometry.C15103l;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15279o0;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.graphics.C15321t3;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,356:1\n1#2:357\n35#3,5:358\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n330#1:358,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.g1 */
public final class C15886g1 {
    @C12579k

    /* renamed from: a */
    public C16479d f39567a;

    /* renamed from: b */
    public boolean f39568b = true;
    @C12579k

    /* renamed from: c */
    public final Outline f39569c;

    /* renamed from: d */
    public long f39570d;
    @C12579k

    /* renamed from: e */
    public C15218g4 f39571e;
    @C12580l

    /* renamed from: f */
    public C15231i3 f39572f;
    @C12580l

    /* renamed from: g */
    public C15231i3 f39573g;

    /* renamed from: h */
    public boolean f39574h;

    /* renamed from: i */
    public boolean f39575i;
    @C12580l

    /* renamed from: j */
    public C15231i3 f39576j;
    @C12580l

    /* renamed from: k */
    public C15101k f39577k;

    /* renamed from: l */
    public float f39578l;

    /* renamed from: m */
    public long f39579m;

    /* renamed from: n */
    public long f39580n;

    /* renamed from: o */
    public boolean f39581o;
    @C12579k

    /* renamed from: p */
    public LayoutDirection f39582p;
    @C12580l

    /* renamed from: q */
    public C15231i3 f39583q;
    @C12580l

    /* renamed from: r */
    public C15231i3 f39584r;
    @C12580l

    /* renamed from: s */
    public C15174d3 f39585s;

    public C15886g1(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f39567a = dVar;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f39569c = outline;
        C15104m.C15105a aVar = C15104m.f37280b;
        this.f39570d = aVar.mo42317c();
        this.f39571e = C15321t3.m66567a();
        this.f39579m = C15094f.f37256b.mo42248e();
        this.f39580n = aVar.mo42317c();
        this.f39582p = LayoutDirection.Ltr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (mo45734f(r1, r7.f39579m, r7.f39580n, r6) == false) goto L_0x0030;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45729a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.C15118b2 r21) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            androidx.compose.ui.graphics.i3 r0 = r20.mo45730b()
            r9 = 0
            r10 = 0
            r11 = 2
            if (r0 == 0) goto L_0x0017
            androidx.compose.p004ui.graphics.C15118b2.m65190r(r8, r0, r9, r11, r10)
            goto L_0x00a9
        L_0x0017:
            float r6 = r7.f39578l
            r12 = 0
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            androidx.compose.ui.graphics.i3 r13 = r7.f39576j
            androidx.compose.ui.geometry.k r1 = r7.f39577k
            if (r13 == 0) goto L_0x0030
            long r2 = r7.f39579m
            long r4 = r7.f39580n
            r0 = r20
            boolean r0 = r0.mo45734f(r1, r2, r4, r6)
            if (r0 != 0) goto L_0x0074
        L_0x0030:
            long r0 = r7.f39579m
            float r14 = androidx.compose.p004ui.geometry.C15094f.m64880p(r0)
            long r0 = r7.f39579m
            float r15 = androidx.compose.p004ui.geometry.C15094f.m64882r(r0)
            long r0 = r7.f39579m
            float r0 = androidx.compose.p004ui.geometry.C15094f.m64880p(r0)
            long r1 = r7.f39580n
            float r1 = androidx.compose.p004ui.geometry.C15104m.m65023t(r1)
            float r16 = r0 + r1
            long r0 = r7.f39579m
            float r0 = androidx.compose.p004ui.geometry.C15094f.m64882r(r0)
            long r1 = r7.f39580n
            float r1 = androidx.compose.p004ui.geometry.C15104m.m65016m(r1)
            float r17 = r0 + r1
            float r0 = r7.f39578l
            long r18 = androidx.compose.p004ui.geometry.C15090b.m64846b(r0, r12, r11, r10)
            androidx.compose.ui.geometry.k r0 = androidx.compose.p004ui.geometry.C15103l.m64989e(r14, r15, r16, r17, r18)
            if (r13 != 0) goto L_0x006a
            androidx.compose.ui.graphics.i3 r1 = androidx.compose.p004ui.graphics.C15318t0.m66550a()
            r13 = r1
            goto L_0x006d
        L_0x006a:
            r13.reset()
        L_0x006d:
            r13.mo42817r(r0)
            r7.f39577k = r0
            r7.f39576j = r13
        L_0x0074:
            androidx.compose.p004ui.graphics.C15118b2.m65190r(r8, r13, r9, r11, r10)
            goto L_0x00a9
        L_0x0078:
            long r0 = r7.f39579m
            float r9 = androidx.compose.p004ui.geometry.C15094f.m64880p(r0)
            long r0 = r7.f39579m
            float r10 = androidx.compose.p004ui.geometry.C15094f.m64882r(r0)
            long r0 = r7.f39579m
            float r0 = androidx.compose.p004ui.geometry.C15094f.m64880p(r0)
            long r1 = r7.f39580n
            float r1 = androidx.compose.p004ui.geometry.C15104m.m65023t(r1)
            float r11 = r0 + r1
            long r0 = r7.f39579m
            float r0 = androidx.compose.p004ui.geometry.C15094f.m64882r(r0)
            long r1 = r7.f39580n
            float r1 = androidx.compose.p004ui.geometry.C15104m.m65016m(r1)
            float r12 = r0 + r1
            r13 = 0
            r14 = 16
            r15 = 0
            r8 = r21
            androidx.compose.p004ui.graphics.C15118b2.m65192w(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.C15886g1.mo45729a(androidx.compose.ui.graphics.b2):void");
    }

    @C12580l
    /* renamed from: b */
    public final C15231i3 mo45730b() {
        mo45737i();
        return this.f39573g;
    }

    @C12580l
    /* renamed from: c */
    public final Outline mo45731c() {
        mo45737i();
        if (!this.f39581o || !this.f39568b) {
            return null;
        }
        return this.f39569c;
    }

    /* renamed from: d */
    public final boolean mo45732d() {
        return !this.f39575i;
    }

    /* renamed from: e */
    public final boolean mo45733e(long j) {
        C15174d3 d3Var;
        if (this.f39581o && (d3Var = this.f39585s) != null) {
            return C15986v3.m71783b(d3Var, C15094f.m64880p(j), C15094f.m64882r(j), this.f39583q, this.f39584r);
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo45734f(C15101k kVar, long j, long j2, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (kVar == null || !C15103l.m65001q(kVar)) {
            return false;
        }
        if (kVar.mo42302q() == C15094f.m64880p(j)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (kVar.mo42304s() == C15094f.m64882r(j)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (kVar.mo42303r() == C15094f.m64880p(j) + C15104m.m65023t(j2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (kVar.mo42298m() == C15094f.m64882r(j) + C15104m.m65016m(j2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (C15088a.m64833m(kVar.mo42305t()) == f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo45735g(@C12579k C15218g4 g4Var, float f, boolean z, float f2, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar) {
        boolean z2;
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f39569c.setAlpha(f);
        boolean z3 = !Intrinsics.areEqual((Object) this.f39571e, (Object) g4Var);
        if (z3) {
            this.f39571e = g4Var;
            this.f39574h = true;
        }
        if (z || f2 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f39581o != z2) {
            this.f39581o = z2;
            this.f39574h = true;
        }
        if (this.f39582p != layoutDirection) {
            this.f39582p = layoutDirection;
            this.f39574h = true;
        }
        if (!Intrinsics.areEqual((Object) this.f39567a, (Object) dVar)) {
            this.f39567a = dVar;
            this.f39574h = true;
        }
        return z3;
    }

    /* renamed from: h */
    public final void mo45736h(long j) {
        if (!C15104m.m65014k(this.f39570d, j)) {
            this.f39570d = j;
            this.f39574h = true;
        }
    }

    /* renamed from: i */
    public final void mo45737i() {
        if (this.f39574h) {
            this.f39579m = C15094f.f37256b.mo42248e();
            long j = this.f39570d;
            this.f39580n = j;
            this.f39578l = 0.0f;
            this.f39573g = null;
            this.f39574h = false;
            this.f39575i = false;
            if (!this.f39581o || C15104m.m65023t(j) <= 0.0f || C15104m.m65016m(this.f39570d) <= 0.0f) {
                this.f39569c.setEmpty();
                return;
            }
            this.f39568b = true;
            C15174d3 a = this.f39571e.mo7615a(this.f39570d, this.f39582p, this.f39567a);
            this.f39585s = a;
            if (a instanceof C15174d3.C15176b) {
                mo45739k(((C15174d3.C15176b) a).mo42649b());
            } else if (a instanceof C15174d3.C15177c) {
                mo45740l(((C15174d3.C15177c) a).mo42652b());
            } else if (a instanceof C15174d3.C15175a) {
                mo45738j(((C15174d3.C15175a) a).mo42646b());
            }
        }
    }

    /* renamed from: j */
    public final void mo45738j(C15231i3 i3Var) {
        if (Build.VERSION.SDK_INT > 28 || i3Var.mo42799a()) {
            Outline outline = this.f39569c;
            if (i3Var instanceof C15279o0) {
                outline.setConvexPath(((C15279o0) i3Var).mo42922y());
                this.f39575i = !this.f39569c.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.f39568b = false;
            this.f39569c.setEmpty();
            this.f39575i = true;
        }
        this.f39573g = i3Var;
    }

    /* renamed from: k */
    public final void mo45739k(C15098i iVar) {
        this.f39579m = C15096g.m64898a(iVar.mo42279t(), iVar.mo42249B());
        this.f39580n = C15106n.m65033a(iVar.mo42253G(), iVar.mo42278r());
        this.f39569c.setRect(C11409d.m43851L0(iVar.mo42279t()), C11409d.m43851L0(iVar.mo42249B()), C11409d.m43851L0(iVar.mo42283x()), C11409d.m43851L0(iVar.mo42271j()));
    }

    /* renamed from: l */
    public final void mo45740l(C15101k kVar) {
        float m = C15088a.m64833m(kVar.mo42305t());
        this.f39579m = C15096g.m64898a(kVar.mo42302q(), kVar.mo42304s());
        this.f39580n = C15106n.m65033a(kVar.mo42308v(), kVar.mo42301p());
        if (C15103l.m65001q(kVar)) {
            this.f39569c.setRoundRect(C11409d.m43851L0(kVar.mo42302q()), C11409d.m43851L0(kVar.mo42304s()), C11409d.m43851L0(kVar.mo42303r()), C11409d.m43851L0(kVar.mo42298m()), m);
            this.f39578l = m;
            return;
        }
        C15231i3 i3Var = this.f39572f;
        if (i3Var == null) {
            i3Var = C15318t0.m66550a();
            this.f39572f = i3Var;
        }
        i3Var.reset();
        i3Var.mo42817r(kVar);
        mo45738j(i3Var);
    }
}
