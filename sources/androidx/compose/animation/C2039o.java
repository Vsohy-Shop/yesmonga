package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.p004ui.graphics.C15283o4;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.animation.o */
public final class C2039o {

    /* renamed from: a */
    public final float f5682a;

    /* renamed from: b */
    public final long f5683b;
    @C12579k

    /* renamed from: c */
    public final C1956d0<Float> f5684c;

    public /* synthetic */ C2039o(float f, long j, C1956d0 d0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, d0Var);
    }

    /* renamed from: e */
    public static /* synthetic */ C2039o m8733e(C2039o oVar, float f, long j, C1956d0<Float> d0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = oVar.f5682a;
        }
        if ((i & 2) != 0) {
            j = oVar.f5683b;
        }
        if ((i & 4) != 0) {
            d0Var = oVar.f5684c;
        }
        return oVar.mo7067d(f, j, d0Var);
    }

    /* renamed from: a */
    public final float mo7064a() {
        return this.f5682a;
    }

    /* renamed from: b */
    public final long mo7065b() {
        return this.f5683b;
    }

    @C12579k
    /* renamed from: c */
    public final C1956d0<Float> mo7066c() {
        return this.f5684c;
    }

    @C12579k
    /* renamed from: d */
    public final C2039o mo7067d(float f, long j, @C12579k C1956d0<Float> d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        return new C2039o(f, j, d0Var, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2039o)) {
            return false;
        }
        C2039o oVar = (C2039o) obj;
        return Float.compare(this.f5682a, oVar.f5682a) == 0 && C15283o4.m66377i(this.f5683b, oVar.f5683b) && Intrinsics.areEqual((Object) this.f5684c, (Object) oVar.f5684c);
    }

    @C12579k
    /* renamed from: f */
    public final C1956d0<Float> mo7069f() {
        return this.f5684c;
    }

    /* renamed from: g */
    public final float mo7070g() {
        return this.f5682a;
    }

    /* renamed from: h */
    public final long mo7071h() {
        return this.f5683b;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f5682a) * 31) + C15283o4.m66381m(this.f5683b)) * 31) + this.f5684c.hashCode();
    }

    @C12579k
    public String toString() {
        return "Scale(scale=" + this.f5682a + ", transformOrigin=" + C15283o4.m66382n(this.f5683b) + ", animationSpec=" + this.f5684c + ')';
    }

    public C2039o(float f, long j, C1956d0<Float> d0Var) {
        this.f5682a = f;
        this.f5683b = j;
        this.f5684c = d0Var;
    }
}
