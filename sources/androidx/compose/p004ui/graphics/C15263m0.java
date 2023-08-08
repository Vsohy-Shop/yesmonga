package androidx.compose.p004ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.m0 */
public final class C15263m0 implements C15211f3 {
    @C12579k

    /* renamed from: a */
    public Paint f37583a;

    /* renamed from: b */
    public int f37584b;
    @C12580l

    /* renamed from: c */
    public Shader f37585c;
    @C12580l

    /* renamed from: d */
    public C15249k2 f37586d;
    @C12580l

    /* renamed from: e */
    public C15242j3 f37587e;

    public C15263m0(@C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "internalPaint");
        this.f37583a = paint;
        this.f37584b = C15325u1.f37708b.mo43015B();
    }

    /* renamed from: a */
    public long mo42747a() {
        return C15271n0.m66289d(this.f37583a);
    }

    /* renamed from: b */
    public void mo42748b(boolean z) {
        C15271n0.m66298m(this.f37583a, z);
    }

    /* renamed from: c */
    public void mo42749c(int i) {
        C15271n0.m66305t(this.f37583a, i);
    }

    /* renamed from: d */
    public int mo42750d() {
        return C15271n0.m66295j(this.f37583a);
    }

    /* renamed from: e */
    public void mo42751e(int i) {
        if (!C15325u1.m66580G(this.f37584b, i)) {
            this.f37584b = i;
            C15271n0.m66299n(this.f37583a, i);
        }
    }

    @C12580l
    /* renamed from: f */
    public C15249k2 mo42752f() {
        return this.f37586d;
    }

    /* renamed from: g */
    public void mo42753g(float f) {
        C15271n0.m66297l(this.f37583a, f);
    }

    public float getAlpha() {
        return C15271n0.m66287b(this.f37583a);
    }

    /* renamed from: h */
    public void mo42755h(int i) {
        C15271n0.m66302q(this.f37583a, i);
    }

    /* renamed from: i */
    public int mo42756i() {
        return C15271n0.m66291f(this.f37583a);
    }

    /* renamed from: j */
    public void mo42757j(@C12580l C15242j3 j3Var) {
        C15271n0.m66303r(this.f37583a, j3Var);
        this.f37587e = j3Var;
    }

    /* renamed from: k */
    public void mo42758k(int i) {
        C15271n0.m66306u(this.f37583a, i);
    }

    /* renamed from: l */
    public void mo42759l(long j) {
        C15271n0.m66300o(this.f37583a, j);
    }

    @C12580l
    /* renamed from: m */
    public C15242j3 mo42760m() {
        return this.f37587e;
    }

    /* renamed from: n */
    public int mo42761n() {
        return this.f37584b;
    }

    /* renamed from: o */
    public int mo42762o() {
        return C15271n0.m66292g(this.f37583a);
    }

    /* renamed from: p */
    public float mo42763p() {
        return C15271n0.m66293h(this.f37583a);
    }

    @C12579k
    /* renamed from: q */
    public Paint mo42764q() {
        return this.f37583a;
    }

    /* renamed from: r */
    public void mo42765r(@C12580l Shader shader) {
        this.f37585c = shader;
        C15271n0.m66304s(this.f37583a, shader);
    }

    @C12580l
    /* renamed from: s */
    public Shader mo42766s() {
        return this.f37585c;
    }

    /* renamed from: t */
    public void mo42767t(@C12580l C15249k2 k2Var) {
        this.f37586d = k2Var;
        C15271n0.m66301p(this.f37583a, k2Var);
    }

    /* renamed from: u */
    public void mo42768u(float f) {
        C15271n0.m66307v(this.f37583a, f);
    }

    /* renamed from: v */
    public int mo42769v() {
        return C15271n0.m66290e(this.f37583a);
    }

    /* renamed from: w */
    public boolean mo42770w() {
        return C15271n0.m66288c(this.f37583a);
    }

    /* renamed from: x */
    public void mo42771x(int i) {
        C15271n0.m66309x(this.f37583a, i);
    }

    /* renamed from: y */
    public void mo42772y(float f) {
        C15271n0.m66308w(this.f37583a, f);
    }

    /* renamed from: z */
    public float mo42773z() {
        return C15271n0.m66294i(this.f37583a);
    }

    public C15263m0() {
        this(C15271n0.m66296k());
    }
}
