package androidx.compose.p004ui.graphics.colorspace;

import androidx.compose.p004ui.graphics.colorspace.C15135b;
import androidx.compose.p004ui.graphics.colorspace.C15145h;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.colorspace.d */
public final class C15141d {
    /* renamed from: a */
    public static final double m65431a(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d;
        return Math.copySign(m65449s(d7 < 0.0d ? -d7 : d7, d2, d3, d4, d5, d6), d7);
    }

    /* renamed from: b */
    public static final double m65432b(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d;
        return Math.copySign(m65451u(d7 < 0.0d ? -d7 : d7, d2, d3, d4, d5, d6), d7);
    }

    @C12579k
    @C11315i
    /* renamed from: c */
    public static final C15138c m65433c(@C12579k C15138c cVar, @C12579k C15137b0 b0Var) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(b0Var, "whitePoint");
        return m65435e(cVar, b0Var, (C15129a) null, 2, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: d */
    public static final C15138c m65434d(@C12579k C15138c cVar, @C12579k C15137b0 b0Var, @C12579k C15129a aVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(b0Var, "whitePoint");
        Intrinsics.checkNotNullParameter(aVar, "adaptation");
        if (!C15135b.m65390h(cVar.mo42585g(), C15135b.f37394b.mo42571c())) {
            return cVar;
        }
        Rgb rgb = (Rgb) cVar;
        if (m65438h(rgb.mo42520i0(), b0Var)) {
            return cVar;
        }
        return new Rgb(rgb, m65443m(m65436f(aVar.mo42540d(), rgb.mo42520i0().mo42579g(), b0Var.mo42579g()), rgb.mo42517h0()), b0Var);
    }

    /* renamed from: e */
    public static /* synthetic */ C15138c m65435e(C15138c cVar, C15137b0 b0Var, C15129a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = C15129a.f37382b.mo42544a();
        }
        return m65434d(cVar, b0Var, aVar);
    }

    @C12579k
    /* renamed from: f */
    public static final float[] m65436f(@C12579k float[] fArr, @C12579k float[] fArr2, @C12579k float[] fArr3) {
        Intrinsics.checkNotNullParameter(fArr, "matrix");
        Intrinsics.checkNotNullParameter(fArr2, "srcWhitePoint");
        Intrinsics.checkNotNullParameter(fArr3, "dstWhitePoint");
        float[] o = m65445o(fArr, fArr2);
        float[] o2 = m65445o(fArr, fArr3);
        return m65443m(m65442l(fArr), m65444n(new float[]{o2[0] / o[0], o2[1] / o[1], o2[2] / o[2]}, fArr));
    }

    /* renamed from: g */
    public static final boolean m65437g(@C12579k C15134a0 a0Var, @C12580l C15134a0 a0Var2) {
        Intrinsics.checkNotNullParameter(a0Var, "a");
        if (a0Var2 == null || Math.abs(a0Var.mo42557j() - a0Var2.mo42557j()) >= 0.001d || Math.abs(a0Var.mo42558k() - a0Var2.mo42558k()) >= 0.001d || Math.abs(a0Var.mo42559l() - a0Var2.mo42559l()) >= 0.001d || Math.abs(a0Var.mo42560m() - a0Var2.mo42560m()) >= 0.002d || Math.abs(a0Var.mo42561n() - a0Var2.mo42561n()) >= 0.001d || Math.abs(a0Var.mo42562o() - a0Var2.mo42562o()) >= 0.001d || Math.abs(a0Var.mo42563p() - a0Var2.mo42563p()) >= 0.001d) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final boolean m65438h(@C12579k C15137b0 b0Var, @C12579k C15137b0 b0Var2) {
        Intrinsics.checkNotNullParameter(b0Var, "a");
        Intrinsics.checkNotNullParameter(b0Var2, "b");
        if (b0Var == b0Var2) {
            return true;
        }
        if (Math.abs(b0Var.mo42576e() - b0Var2.mo42576e()) >= 0.001f || Math.abs(b0Var.mo42578f() - b0Var2.mo42578f()) >= 0.001f) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static final boolean m65439i(@C12579k float[] fArr, @C12579k float[] fArr2) {
        Intrinsics.checkNotNullParameter(fArr, "a");
        Intrinsics.checkNotNullParameter(fArr2, "b");
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    @C12579k
    /* renamed from: j */
    public static final C15145h m65440j(@C12579k C15138c cVar, @C12579k C15138c cVar2, int i) {
        Intrinsics.checkNotNullParameter(cVar, "$this$connect");
        Intrinsics.checkNotNullParameter(cVar2, FirebaseAnalytics.C32532b.f78977z);
        C15144g gVar = C15144g.f37408a;
        if (cVar == gVar.mo42612x()) {
            if (cVar2 == gVar.mo42612x()) {
                return C15145h.f37432g.mo42623d();
            }
            if (cVar2 == gVar.mo42609u() && C15155m.m65537h(i, C15155m.f37466b.mo42642b())) {
                return C15145h.f37432g.mo42624e();
            }
        } else if (cVar == gVar.mo42609u() && cVar2 == gVar.mo42612x() && C15155m.m65537h(i, C15155m.f37466b.mo42642b())) {
            return C15145h.f37432g.mo42622c();
        }
        if (cVar == cVar2) {
            return C15145h.f37432g.mo42625f(cVar);
        }
        long g = cVar.mo42585g();
        C15135b.C15136a aVar = C15135b.f37394b;
        if (!C15135b.m65390h(g, aVar.mo42571c()) || !C15135b.m65390h(cVar2.mo42585g(), aVar.mo42571c())) {
            return new C15145h(cVar, cVar2, i, (DefaultConstructorMarker) null);
        }
        return new C15145h.C15148b((Rgb) cVar, (Rgb) cVar2, i, (DefaultConstructorMarker) null);
    }

    /* renamed from: k */
    public static /* synthetic */ C15145h m65441k(C15138c cVar, C15138c cVar2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cVar2 = C15144g.f37408a.mo42612x();
        }
        if ((i2 & 2) != 0) {
            i = C15155m.f37466b.mo42642b();
        }
        return m65440j(cVar, cVar2, i);
    }

    @C12579k
    /* renamed from: l */
    public static final float[] m65442l(@C12579k float[] fArr) {
        float[] fArr2 = fArr;
        Intrinsics.checkNotNullParameter(fArr2, "m");
        float f = fArr2[0];
        float f2 = fArr2[3];
        float f3 = fArr2[6];
        float f4 = fArr2[1];
        float f5 = fArr2[4];
        float f6 = fArr2[7];
        float f7 = fArr2[2];
        float f8 = fArr2[5];
        float f9 = fArr2[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr3 = new float[fArr2.length];
        fArr3[0] = f10 / f13;
        fArr3[1] = f11 / f13;
        fArr3[2] = f12 / f13;
        fArr3[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr3[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr3[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr3[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr3[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr3[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr3;
    }

    @C12579k
    /* renamed from: m */
    public static final float[] m65443m(@C12579k float[] fArr, @C12579k float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        Intrinsics.checkNotNullParameter(fArr3, "lhs");
        Intrinsics.checkNotNullParameter(fArr4, "rhs");
        float f = fArr3[3];
        float f2 = fArr4[1];
        float f3 = fArr3[6];
        float f4 = fArr4[2];
        float f5 = fArr3[1];
        float f6 = fArr4[0];
        float f7 = fArr3[4];
        float f8 = fArr3[7];
        float f9 = fArr3[5];
        float f10 = fArr3[8];
        float f11 = fArr3[0];
        float f12 = fArr4[4];
        float f13 = (fArr4[3] * f11) + (f * f12);
        float f14 = fArr4[5];
        float f15 = fArr3[1];
        float f16 = fArr4[3];
        float f17 = fArr3[2];
        float f18 = f11 * fArr4[6];
        float f19 = fArr3[3];
        float f20 = fArr4[7];
        float f21 = f18 + (f19 * f20);
        float f22 = fArr4[8];
        float f23 = fArr4[6];
        return new float[]{(fArr3[0] * fArr4[0]) + (f * f2) + (f3 * f4), (f5 * f6) + (f2 * f7) + (f8 * f4), (fArr3[2] * f6) + (fArr4[1] * f9) + (f4 * f10), f13 + (f3 * f14), (f15 * f16) + (f7 * f12) + (f8 * f14), (f16 * f17) + (f9 * fArr4[4]) + (f14 * f10), f21 + (f3 * f22), (f15 * f23) + (fArr3[4] * f20) + (f8 * f22), (f17 * f23) + (fArr3[5] * fArr4[7]) + (f10 * f22)};
    }

    @C12579k
    /* renamed from: n */
    public static final float[] m65444n(@C12579k float[] fArr, @C12579k float[] fArr2) {
        Intrinsics.checkNotNullParameter(fArr, "lhs");
        Intrinsics.checkNotNullParameter(fArr2, "rhs");
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f, fArr2[4] * f2, fArr2[5] * f3, f * fArr2[6], f2 * fArr2[7], f3 * fArr2[8]};
    }

    @C12579k
    /* renamed from: o */
    public static final float[] m65445o(@C12579k float[] fArr, @C12579k float[] fArr2) {
        Intrinsics.checkNotNullParameter(fArr, "lhs");
        Intrinsics.checkNotNullParameter(fArr2, "rhs");
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }

    /* renamed from: p */
    public static final float m65446p(@C12579k float[] fArr, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(fArr, "lhs");
        return (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
    }

    /* renamed from: q */
    public static final float m65447q(@C12579k float[] fArr, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(fArr, "lhs");
        return (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
    }

    /* renamed from: r */
    public static final float m65448r(@C12579k float[] fArr, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(fArr, "lhs");
        return (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    /* renamed from: s */
    public static final double m65449s(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    /* renamed from: t */
    public static final double m65450t(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 * d4 ? (Math.pow(d - d6, 1.0d / d8) - d3) / d2 : (d - d7) / d4;
    }

    /* renamed from: u */
    public static final double m65451u(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d * d4;
    }

    /* renamed from: v */
    public static final double m65452v(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }
}
