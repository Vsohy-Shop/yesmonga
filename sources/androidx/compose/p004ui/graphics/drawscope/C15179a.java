package androidx.compose.p004ui.graphics.drawscope;

import android.graphics.Shader;
import androidx.compose.p004ui.geometry.C15088a;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.graphics.C15223h3;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15253k4;
import androidx.compose.p004ui.graphics.C15271n0;
import androidx.compose.p004ui.graphics.C15299q2;
import androidx.compose.p004ui.graphics.C15325u1;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.iam.C9127a0;
import java.util.List;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11532s0;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,804:1\n1#2:805\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.drawscope.a */
public final class C15179a implements C15187e {
    @C12579k

    /* renamed from: a */
    public final C15180a f37488a = new C15180a((C16479d) null, (LayoutDirection) null, (C15118b2) null, 0, 15, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: b */
    public final C15186d f37489b = new C15181b(this);
    @C12580l

    /* renamed from: c */
    public C15211f3 f37490c;
    @C12580l

    /* renamed from: d */
    public C15211f3 f37491d;

    @C11532s0
    /* renamed from: androidx.compose.ui.graphics.drawscope.a$a */
    public static final class C15180a {
        @C12579k

        /* renamed from: a */
        public C16479d f37492a;
        @C12579k

        /* renamed from: b */
        public LayoutDirection f37493b;
        @C12579k

        /* renamed from: c */
        public C15118b2 f37494c;

        /* renamed from: d */
        public long f37495d;

        public /* synthetic */ C15180a(C16479d dVar, LayoutDirection layoutDirection, C15118b2 b2Var, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, layoutDirection, b2Var, j);
        }

        /* renamed from: f */
        public static /* synthetic */ C15180a m65623f(C15180a aVar, C16479d dVar, LayoutDirection layoutDirection, C15118b2 b2Var, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                dVar = aVar.f37492a;
            }
            if ((i & 2) != 0) {
                layoutDirection = aVar.f37493b;
            }
            LayoutDirection layoutDirection2 = layoutDirection;
            if ((i & 4) != 0) {
                b2Var = aVar.f37494c;
            }
            C15118b2 b2Var2 = b2Var;
            if ((i & 8) != 0) {
                j = aVar.f37495d;
            }
            return aVar.mo42691e(dVar, layoutDirection2, b2Var2, j);
        }

        @C12579k
        /* renamed from: a */
        public final C16479d mo42687a() {
            return this.f37492a;
        }

        @C12579k
        /* renamed from: b */
        public final LayoutDirection mo42688b() {
            return this.f37493b;
        }

        @C12579k
        /* renamed from: c */
        public final C15118b2 mo42689c() {
            return this.f37494c;
        }

        /* renamed from: d */
        public final long mo42690d() {
            return this.f37495d;
        }

        @C12579k
        /* renamed from: e */
        public final C15180a mo42691e(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection, @C12579k C15118b2 b2Var, long j) {
            Intrinsics.checkNotNullParameter(dVar, "density");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(b2Var, "canvas");
            return new C15180a(dVar, layoutDirection, b2Var, j, (DefaultConstructorMarker) null);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15180a)) {
                return false;
            }
            C15180a aVar = (C15180a) obj;
            return Intrinsics.areEqual((Object) this.f37492a, (Object) aVar.f37492a) && this.f37493b == aVar.f37493b && Intrinsics.areEqual((Object) this.f37494c, (Object) aVar.f37494c) && C15104m.m65014k(this.f37495d, aVar.f37495d);
        }

        @C12579k
        /* renamed from: g */
        public final C15118b2 mo42693g() {
            return this.f37494c;
        }

        @C12579k
        /* renamed from: h */
        public final C16479d mo42694h() {
            return this.f37492a;
        }

        public int hashCode() {
            return (((((this.f37492a.hashCode() * 31) + this.f37493b.hashCode()) * 31) + this.f37494c.hashCode()) * 31) + C15104m.m65024u(this.f37495d);
        }

        @C12579k
        /* renamed from: i */
        public final LayoutDirection mo42696i() {
            return this.f37493b;
        }

        /* renamed from: j */
        public final long mo42697j() {
            return this.f37495d;
        }

        /* renamed from: k */
        public final void mo42698k(@C12579k C15118b2 b2Var) {
            Intrinsics.checkNotNullParameter(b2Var, "<set-?>");
            this.f37494c = b2Var;
        }

        /* renamed from: l */
        public final void mo42699l(@C12579k C16479d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
            this.f37492a = dVar;
        }

        /* renamed from: m */
        public final void mo42700m(@C12579k LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            this.f37493b = layoutDirection;
        }

        /* renamed from: n */
        public final void mo42701n(long j) {
            this.f37495d = j;
        }

        @C12579k
        public String toString() {
            return "DrawParams(density=" + this.f37492a + ", layoutDirection=" + this.f37493b + ", canvas=" + this.f37494c + ", size=" + C15104m.m65027x(this.f37495d) + ')';
        }

        public C15180a(C16479d dVar, LayoutDirection layoutDirection, C15118b2 b2Var, long j) {
            this.f37492a = dVar;
            this.f37493b = layoutDirection;
            this.f37494c = b2Var;
            this.f37495d = j;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C15180a(C16479d dVar, LayoutDirection layoutDirection, C15118b2 b2Var, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C15182b.f37498a : dVar, (i & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 4) != 0 ? new C15196k() : b2Var, (i & 8) != 0 ? C15104m.f37280b.mo42317c() : j, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: androidx.compose.ui.graphics.drawscope.a$b */
    public static final class C15181b implements C15186d {
        @C12579k

        /* renamed from: a */
        public final C15193i f37496a = C15182b.m65643c(this);

        /* renamed from: b */
        public final /* synthetic */ C15179a f37497b;

        public C15181b(C15179a aVar) {
            this.f37497b = aVar;
        }

        @C12579k
        /* renamed from: a */
        public C15193i mo42703a() {
            return this.f37496a;
        }

        /* renamed from: b */
        public long mo42704b() {
            return this.f37497b.mo42656A().mo42697j();
        }

        @C12579k
        /* renamed from: c */
        public C15118b2 mo42705c() {
            return this.f37497b.mo42656A().mo42693g();
        }

        /* renamed from: d */
        public void mo42706d(long j) {
            this.f37497b.mo42656A().mo42701n(j);
        }
    }

    @C11532s0
    /* renamed from: C */
    public static /* synthetic */ void m65587C() {
    }

    /* renamed from: d */
    public static /* synthetic */ C15211f3 m65588d(C15179a aVar, long j, C15192h hVar, float f, C15249k2 k2Var, int i, int i2, int i3, Object obj) {
        int i4;
        if ((i3 & 32) != 0) {
            i4 = C15187e.f37500l.mo42720b();
        } else {
            i4 = i2;
        }
        return aVar.mo42672c(j, hVar, f, k2Var, i, i4);
    }

    /* renamed from: h */
    public static /* synthetic */ C15211f3 m65589h(C15179a aVar, C15421z1 z1Var, C15192h hVar, float f, C15249k2 k2Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = C15187e.f37500l.mo42720b();
        }
        return aVar.mo42674f(z1Var, hVar, f, k2Var, i, i2);
    }

    /* renamed from: j */
    public static /* synthetic */ C15211f3 m65590j(C15179a aVar, long j, float f, float f2, int i, int i2, C15242j3 j3Var, float f3, C15249k2 k2Var, int i3, int i4, int i5, Object obj) {
        int i6;
        if ((i5 & 512) != 0) {
            i6 = C15187e.f37500l.mo42720b();
        } else {
            i6 = i4;
        }
        return aVar.mo42677i(j, f, f2, i, i2, j3Var, f3, k2Var, i3, i6);
    }

    /* renamed from: p */
    public static /* synthetic */ C15211f3 m65591p(C15179a aVar, C15421z1 z1Var, float f, float f2, int i, int i2, C15242j3 j3Var, float f3, C15249k2 k2Var, int i3, int i4, int i5, Object obj) {
        int i6;
        if ((i5 & 512) != 0) {
            i6 = C15187e.f37500l.mo42720b();
        } else {
            i6 = i4;
        }
        return aVar.mo42678k(z1Var, f, f2, i, i2, j3Var, f3, k2Var, i3, i6);
    }

    @C12579k
    /* renamed from: A */
    public final C15180a mo42656A() {
        return this.f37488a;
    }

    /* renamed from: A2 */
    public void mo42657A2(long j, long j2, long j3, long j4, @C12579k C15192h hVar, float f, @C12580l C15249k2 k2Var, int i) {
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f37488a.mo42693g().mo42430P(C15094f.m64880p(j2), C15094f.m64882r(j2), C15094f.m64880p(j2) + C15104m.m65023t(j3), C15094f.m64882r(j2) + C15104m.m65016m(j3), C15088a.m64833m(j4), C15088a.m64835o(j4), m65588d(this, j, hVar2, f, k2Var, i, 0, 32, (Object) null));
    }

    /* renamed from: D3 */
    public void mo42658D3(long j, long j2, long j3, float f, int i, @C12580l C15242j3 j3Var, float f2, @C12580l C15249k2 k2Var, int i2) {
        this.f37488a.mo42693g().mo42448y(j2, j3, m65590j(this, j, f, 4.0f, i, C15253k4.f37575b.mo42880b(), j3Var, f2, k2Var, i2, 0, 512, (Object) null));
    }

    /* renamed from: F1 */
    public void mo42659F1(@C12579k C15231i3 i3Var, @C12579k C15421z1 z1Var, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15231i3 i3Var2 = i3Var;
        Intrinsics.checkNotNullParameter(i3Var, "path");
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f37488a.mo42693g().mo42427J(i3Var, m65589h(this, z1Var, hVar2, f, k2Var, i, 0, 32, (Object) null));
    }

    /* renamed from: F3 */
    public void mo42660F3(@C12579k C15421z1 z1Var, float f, float f2, boolean z, long j, long j2, float f3, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15421z1 z1Var2 = z1Var;
        Intrinsics.checkNotNullParameter(z1Var2, "brush");
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f37488a.mo42693g().mo42444t(C15094f.m64880p(j), C15094f.m64882r(j), C15094f.m64880p(j) + C15104m.m65023t(j2), C15094f.m64882r(j) + C15104m.m65016m(j2), f, f2, z, m65589h(this, z1Var2, hVar2, f3, k2Var, i, 0, 32, (Object) null));
    }

    /* renamed from: G3 */
    public void mo42661G3(@C12579k C15231i3 i3Var, long j, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15231i3 i3Var2 = i3Var;
        Intrinsics.checkNotNullParameter(i3Var, "path");
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f37488a.mo42693g().mo42427J(i3Var, m65588d(this, j, hVar2, f, k2Var, i, 0, 32, (Object) null));
    }

    /* renamed from: I5 */
    public void mo42662I5(@C12579k C15421z1 z1Var, float f, long j, float f2, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        C15118b2 g = this.f37488a.mo42693g();
        C15211f3 h = m65589h(this, z1Var, hVar2, f2, k2Var, i, 0, 32, (Object) null);
        float f3 = f;
        long j2 = j;
        g.mo42429M(j, f, h);
    }

    /* renamed from: J3 */
    public void mo42663J3(long j, long j2, long j3, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f37488a.mo42693g().mo42435g(C15094f.m64880p(j2), C15094f.m64882r(j2), C15094f.m64880p(j2) + C15104m.m65023t(j3), C15094f.m64882r(j2) + C15104m.m65016m(j3), m65588d(this, j, hVar2, f, k2Var, i, 0, 32, (Object) null));
    }

    /* renamed from: K */
    public final long mo42664K(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        return C15240j2.m66080w(j, C15240j2.m66047A(j) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    /* renamed from: K5 */
    public void mo42665K5(@C12579k C15403w2 w2Var, long j, long j2, long j3, long j4, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(w2Var, C9127a0.f24709d);
        Intrinsics.checkNotNullParameter(hVar, "style");
        C15118b2 g = this.f37488a.mo42693g();
        C15118b2 b2Var = g;
        b2Var.mo42438j(w2Var, j, j2, j3, j4, mo42674f((C15421z1) null, hVar, f, k2Var, i, i2));
    }

    /* renamed from: N */
    public final C15211f3 mo42666N() {
        C15211f3 f3Var = this.f37490c;
        if (f3Var != null) {
            return f3Var;
        }
        C15211f3 a = C15271n0.m66286a();
        a.mo42771x(C15223h3.f37530b.mo42779a());
        this.f37490c = a;
        return a;
    }

    /* renamed from: O */
    public final C15211f3 mo42667O() {
        C15211f3 f3Var = this.f37491d;
        if (f3Var != null) {
            return f3Var;
        }
        C15211f3 a = C15271n0.m66286a();
        a.mo42771x(C15223h3.f37530b.mo42780b());
        this.f37491d = a;
        return a;
    }

    /* renamed from: O4 */
    public void mo42668O4(@C12579k C15421z1 z1Var, long j, long j2, long j3, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15421z1 z1Var2 = z1Var;
        Intrinsics.checkNotNullParameter(z1Var2, "brush");
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f37488a.mo42693g().mo42430P(C15094f.m64880p(j), C15094f.m64882r(j), C15094f.m64880p(j) + C15104m.m65023t(j2), C15094f.m64882r(j) + C15104m.m65016m(j2), C15088a.m64833m(j3), C15088a.m64835o(j3), m65589h(this, z1Var2, hVar2, f, k2Var, i, 0, 32, (Object) null));
    }

    /* renamed from: R4 */
    public float mo7419R4() {
        return this.f37488a.mo42694h().mo7419R4();
    }

    /* renamed from: T */
    public final C15211f3 mo42669T(C15192h hVar) {
        boolean z;
        if (Intrinsics.areEqual((Object) hVar, (Object) C15197l.f37504a)) {
            return mo42666N();
        }
        if (hVar instanceof C15198m) {
            C15211f3 O = mo42667O();
            C15198m mVar = (C15198m) hVar;
            boolean z2 = true;
            if (O.mo42773z() == mVar.mo42726g()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                O.mo42772y(mVar.mo42726g());
            }
            if (!C15244j4.m66129g(O.mo42756i(), mVar.mo42721c())) {
                O.mo42749c(mVar.mo42721c());
            }
            if (O.mo42763p() != mVar.mo42723e()) {
                z2 = false;
            }
            if (!z2) {
                O.mo42768u(mVar.mo42723e());
            }
            if (!C15253k4.m66165g(O.mo42762o(), mVar.mo42722d())) {
                O.mo42758k(mVar.mo42722d());
            }
            if (!Intrinsics.areEqual((Object) O.mo42760m(), (Object) mVar.mo42725f())) {
                O.mo42757j(mVar.mo42725f());
            }
            return O;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: Z3 */
    public void mo42670Z3(long j, float f, long j2, float f2, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        float f3 = f;
        this.f37488a.mo42693g().mo42429M(j2, f, m65588d(this, j, hVar2, f2, k2Var, i, 0, 32, (Object) null));
    }

    /* renamed from: b5 */
    public void mo42671b5(@C12579k C15421z1 z1Var, long j, long j2, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15421z1 z1Var2 = z1Var;
        Intrinsics.checkNotNullParameter(z1Var2, "brush");
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f37488a.mo42693g().mo42436h(C15094f.m64880p(j), C15094f.m64882r(j), C15094f.m64880p(j) + C15104m.m65023t(j2), C15094f.m64882r(j) + C15104m.m65016m(j2), m65589h(this, z1Var2, hVar2, f, k2Var, i, 0, 32, (Object) null));
    }

    /* renamed from: c */
    public final C15211f3 mo42672c(long j, C15192h hVar, float f, C15249k2 k2Var, int i, int i2) {
        C15211f3 T = mo42669T(hVar);
        long K = mo42664K(j, f);
        if (!C15240j2.m66082y(T.mo42747a(), K)) {
            T.mo42759l(K);
        }
        if (T.mo42766s() != null) {
            T.mo42765r((Shader) null);
        }
        if (!Intrinsics.areEqual((Object) T.mo42752f(), (Object) k2Var)) {
            T.mo42767t(k2Var);
        }
        if (!C15325u1.m66580G(T.mo42761n(), i)) {
            T.mo42751e(i);
        }
        if (!C15299q2.m66448h(T.mo42769v(), i2)) {
            T.mo42755h(i2);
        }
        return T;
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @C11587t0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: e3 */
    public /* synthetic */ void mo42673e3(C15403w2 w2Var, long j, long j2, long j3, long j4, float f, C15192h hVar, C15249k2 k2Var, int i) {
        Intrinsics.checkNotNullParameter(w2Var, C9127a0.f24709d);
        Intrinsics.checkNotNullParameter(hVar, "style");
        C15118b2 g = this.f37488a.mo42693g();
        C15118b2 b2Var = g;
        b2Var.mo42438j(w2Var, j, j2, j3, j4, m65589h(this, (C15421z1) null, hVar, f, k2Var, i, 0, 32, (Object) null));
    }

    /* renamed from: f */
    public final C15211f3 mo42674f(C15421z1 z1Var, C15192h hVar, float f, C15249k2 k2Var, int i, int i2) {
        boolean z;
        C15211f3 T = mo42669T(hVar);
        if (z1Var != null) {
            z1Var.mo42495a(mo42718b(), T, f);
        } else {
            if (T.getAlpha() == f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                T.mo42753g(f);
            }
        }
        if (!Intrinsics.areEqual((Object) T.mo42752f(), (Object) k2Var)) {
            T.mo42767t(k2Var);
        }
        if (!C15325u1.m66580G(T.mo42761n(), i)) {
            T.mo42751e(i);
        }
        if (!C15299q2.m66448h(T.mo42769v(), i2)) {
            T.mo42755h(i2);
        }
        return T;
    }

    /* renamed from: g4 */
    public void mo42675g4(long j, long j2, long j3, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f37488a.mo42693g().mo42436h(C15094f.m64880p(j2), C15094f.m64882r(j2), C15094f.m64880p(j2) + C15104m.m65023t(j3), C15094f.m64882r(j2) + C15104m.m65016m(j3), m65588d(this, j, hVar2, f, k2Var, i, 0, 32, (Object) null));
    }

    public float getDensity() {
        return this.f37488a.mo42694h().getDensity();
    }

    @C12579k
    public LayoutDirection getLayoutDirection() {
        return this.f37488a.mo42696i();
    }

    /* renamed from: i */
    public final C15211f3 mo42677i(long j, float f, float f2, int i, int i2, C15242j3 j3Var, float f3, C15249k2 k2Var, int i3, int i4) {
        boolean z;
        C15211f3 O = mo42667O();
        long K = mo42664K(j, f3);
        if (!C15240j2.m66082y(O.mo42747a(), K)) {
            O.mo42759l(K);
        }
        if (O.mo42766s() != null) {
            O.mo42765r((Shader) null);
        }
        if (!Intrinsics.areEqual((Object) O.mo42752f(), (Object) k2Var)) {
            O.mo42767t(k2Var);
        }
        if (!C15325u1.m66580G(O.mo42761n(), i3)) {
            O.mo42751e(i3);
        }
        boolean z2 = true;
        if (O.mo42773z() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            O.mo42772y(f);
        }
        if (O.mo42763p() != f2) {
            z2 = false;
        }
        if (!z2) {
            O.mo42768u(f2);
        }
        if (!C15244j4.m66129g(O.mo42756i(), i)) {
            O.mo42749c(i);
        }
        if (!C15253k4.m66165g(O.mo42762o(), i2)) {
            O.mo42758k(i2);
        }
        if (!Intrinsics.areEqual((Object) O.mo42760m(), (Object) j3Var)) {
            O.mo42757j(j3Var);
        }
        if (!C15299q2.m66448h(O.mo42769v(), i4)) {
            O.mo42755h(i4);
        }
        return O;
    }

    /* renamed from: k */
    public final C15211f3 mo42678k(C15421z1 z1Var, float f, float f2, int i, int i2, C15242j3 j3Var, float f3, C15249k2 k2Var, int i3, int i4) {
        boolean z;
        boolean z2;
        C15211f3 O = mo42667O();
        boolean z3 = true;
        if (z1Var != null) {
            z1Var.mo42495a(mo42718b(), O, f3);
        } else {
            if (O.getAlpha() == f3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                O.mo42753g(f3);
            }
        }
        if (!Intrinsics.areEqual((Object) O.mo42752f(), (Object) k2Var)) {
            O.mo42767t(k2Var);
        }
        if (!C15325u1.m66580G(O.mo42761n(), i3)) {
            O.mo42751e(i3);
        }
        if (O.mo42773z() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            O.mo42772y(f);
        }
        if (O.mo42763p() != f2) {
            z3 = false;
        }
        if (!z3) {
            O.mo42768u(f2);
        }
        if (!C15244j4.m66129g(O.mo42756i(), i)) {
            O.mo42749c(i);
        }
        if (!C15253k4.m66165g(O.mo42762o(), i2)) {
            O.mo42758k(i2);
        }
        if (!Intrinsics.areEqual((Object) O.mo42760m(), (Object) j3Var)) {
            O.mo42757j(j3Var);
        }
        if (!C15299q2.m66448h(O.mo42769v(), i4)) {
            O.mo42755h(i4);
        }
        return O;
    }

    /* renamed from: l5 */
    public void mo42679l5(@C12579k List<C15094f> list, int i, long j, float f, int i2, @C12580l C15242j3 j3Var, float f2, @C12580l C15249k2 k2Var, int i3) {
        List<C15094f> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "points");
        this.f37488a.mo42693g().mo42437i(i, list2, m65590j(this, j, f, 4.0f, i2, C15253k4.f37575b.mo42880b(), j3Var, f2, k2Var, i3, 0, 512, (Object) null));
    }

    /* renamed from: n1 */
    public void mo42680n1(@C12579k List<C15094f> list, int i, @C12579k C15421z1 z1Var, float f, int i2, @C12580l C15242j3 j3Var, float f2, @C12580l C15249k2 k2Var, int i3) {
        List<C15094f> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "points");
        C15421z1 z1Var2 = z1Var;
        Intrinsics.checkNotNullParameter(z1Var2, "brush");
        this.f37488a.mo42693g().mo42437i(i, list2, m65591p(this, z1Var2, f, 4.0f, i2, C15253k4.f37575b.mo42880b(), j3Var, f2, k2Var, i3, 0, 512, (Object) null));
    }

    /* renamed from: n3 */
    public void mo42681n3(@C12579k C15403w2 w2Var, long j, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15403w2 w2Var2 = w2Var;
        Intrinsics.checkNotNullParameter(w2Var, C9127a0.f24709d);
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        long j2 = j;
        this.f37488a.mo42693g().mo42439k(w2Var, j, m65589h(this, (C15421z1) null, hVar2, f, k2Var, i, 0, 32, (Object) null));
    }

    /* renamed from: p4 */
    public void mo42682p4(long j, float f, float f2, boolean z, long j2, long j3, float f3, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f37488a.mo42693g().mo42444t(C15094f.m64880p(j2), C15094f.m64882r(j2), C15094f.m64880p(j2) + C15104m.m65023t(j3), C15094f.m64882r(j2) + C15104m.m65016m(j3), f, f2, z, m65588d(this, j, hVar2, f3, k2Var, i, 0, 32, (Object) null));
    }

    @C12579k
    /* renamed from: q5 */
    public C15186d mo42683q5() {
        return this.f37489b;
    }

    /* renamed from: t5 */
    public void mo42684t5(@C12579k C15421z1 z1Var, long j, long j2, float f, int i, @C12580l C15242j3 j3Var, float f2, @C12580l C15249k2 k2Var, int i2) {
        C15421z1 z1Var2 = z1Var;
        Intrinsics.checkNotNullParameter(z1Var2, "brush");
        this.f37488a.mo42693g().mo42448y(j, j2, m65591p(this, z1Var2, f, 4.0f, i, C15253k4.f37575b.mo42880b(), j3Var, f2, k2Var, i2, 0, 512, (Object) null));
    }

    /* renamed from: w */
    public final void mo42685w(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection, @C12579k C15118b2 b2Var, long j, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15180a A = mo42656A();
        C16479d a = A.mo42687a();
        LayoutDirection b = A.mo42688b();
        C15118b2 c = A.mo42689c();
        long d = A.mo42690d();
        C15180a A2 = mo42656A();
        A2.mo42699l(dVar);
        A2.mo42700m(layoutDirection);
        A2.mo42698k(b2Var);
        A2.mo42701n(j);
        b2Var.mo42422E();
        lVar.invoke(this);
        b2Var.mo42443q();
        C15180a A3 = mo42656A();
        A3.mo42699l(a);
        A3.mo42700m(b);
        A3.mo42698k(c);
        A3.mo42701n(d);
    }

    /* renamed from: y3 */
    public void mo42686y3(@C12579k C15421z1 z1Var, long j, long j2, float f, @C12579k C15192h hVar, @C12580l C15249k2 k2Var, int i) {
        C15421z1 z1Var2 = z1Var;
        Intrinsics.checkNotNullParameter(z1Var2, "brush");
        C15192h hVar2 = hVar;
        Intrinsics.checkNotNullParameter(hVar2, "style");
        this.f37488a.mo42693g().mo42435g(C15094f.m64880p(j), C15094f.m64882r(j), C15094f.m64880p(j) + C15104m.m65023t(j2), C15094f.m64882r(j) + C15104m.m65016m(j2), m65589h(this, z1Var2, hVar2, f, k2Var, i, 0, 32, (Object) null));
    }
}
