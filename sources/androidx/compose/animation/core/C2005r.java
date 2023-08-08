package androidx.compose.animation.core;

import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,112:1\n35#1,2:113\n66#1,3:115\n40#1,3:118\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n46#1:113,2\n50#1:115,3\n50#1:118,3\n*E\n"})
/* renamed from: androidx.compose.animation.core.r */
public final class C2005r {

    /* renamed from: a */
    public double f5593a;

    /* renamed from: b */
    public double f5594b;

    public C2005r(double d, double d2) {
        this.f5593a = d;
        this.f5594b = d2;
    }

    /* renamed from: h */
    public static /* synthetic */ C2005r m8591h(C2005r rVar, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = rVar.f5593a;
        }
        if ((i & 2) != 0) {
            d2 = rVar.f5594b;
        }
        return rVar.mo6960g(d, d2);
    }

    /* renamed from: e */
    public final double mo6957e() {
        return this.f5593a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2005r)) {
            return false;
        }
        C2005r rVar = (C2005r) obj;
        return Double.compare(this.f5593a, rVar.f5593a) == 0 && Double.compare(this.f5594b, rVar.f5594b) == 0;
    }

    /* renamed from: f */
    public final double mo6959f() {
        return this.f5594b;
    }

    @C12579k
    /* renamed from: g */
    public final C2005r mo6960g(double d, double d2) {
        return new C2005r(d, d2);
    }

    public int hashCode() {
        return (Double.hashCode(this.f5593a) * 31) + Double.hashCode(this.f5594b);
    }

    @C12579k
    /* renamed from: i */
    public final C2005r mo6962i(double d) {
        this.f5593a = this.f5593a / d;
        this.f5594b = this.f5594b / d;
        return this;
    }

    /* renamed from: j */
    public final double mo6963j() {
        return this.f5594b;
    }

    /* renamed from: k */
    public final double mo6964k() {
        return this.f5593a;
    }

    @C12579k
    /* renamed from: l */
    public final C2005r mo6965l(double d) {
        this.f5593a = this.f5593a + (-d);
        return this;
    }

    @C12579k
    /* renamed from: m */
    public final C2005r mo6966m(@C12579k C2005r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "other");
        double d = (double) -1;
        rVar.f5593a = rVar.f5593a * d;
        rVar.f5594b = rVar.f5594b * d;
        this.f5593a = this.f5593a + rVar.mo6964k();
        this.f5594b = this.f5594b + rVar.mo6963j();
        return this;
    }

    @C12579k
    /* renamed from: n */
    public final C2005r mo6967n(double d) {
        this.f5593a = this.f5593a + d;
        return this;
    }

    @C12579k
    /* renamed from: o */
    public final C2005r mo6968o(@C12579k C2005r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "other");
        this.f5593a = this.f5593a + rVar.mo6964k();
        this.f5594b = this.f5594b + rVar.mo6963j();
        return this;
    }

    @C12579k
    /* renamed from: p */
    public final C2005r mo6969p(double d) {
        this.f5593a = this.f5593a * d;
        this.f5594b = this.f5594b * d;
        return this;
    }

    @C12579k
    /* renamed from: q */
    public final C2005r mo6970q(@C12579k C2005r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "other");
        this.f5593a = (mo6964k() * rVar.mo6964k()) - (mo6963j() * rVar.mo6963j());
        this.f5594b = (mo6964k() * rVar.mo6963j()) + (rVar.mo6964k() * mo6963j());
        return this;
    }

    @C12579k
    /* renamed from: r */
    public final C2005r mo6971r() {
        double d = (double) -1;
        this.f5593a = this.f5593a * d;
        this.f5594b = this.f5594b * d;
        return this;
    }

    @C12579k
    public String toString() {
        return "ComplexDouble(_real=" + this.f5593a + ", _imaginary=" + this.f5594b + ')';
    }
}
