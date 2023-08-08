package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C8585m0
/* renamed from: androidx.compose.material3.t0 */
public final class C8282t0 implements C8201f3 {

    /* renamed from: a */
    public final float f20477a;

    public /* synthetic */ C8282t0(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: d */
    public static /* synthetic */ C8282t0 m27550d(C8282t0 t0Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = t0Var.f20477a;
        }
        return t0Var.mo13005c(f);
    }

    /* renamed from: a */
    public float mo12601a(@C12579k C16479d dVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return f + (dVar.mo7425g5(this.f20477a) * Math.signum(f2 - f));
    }

    /* renamed from: b */
    public final float mo13004b() {
        return this.f20477a;
    }

    @C12579k
    /* renamed from: c */
    public final C8282t0 mo13005c(float f) {
        return new C8282t0(f, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8282t0) && C16483g.m74440e0(this.f20477a, ((C8282t0) obj).f20477a);
    }

    public int hashCode() {
        return C16483g.m74442h0(this.f20477a);
    }

    @C12579k
    public String toString() {
        return "FixedThreshold(offset=" + C16483g.m74447o0(this.f20477a) + ')';
    }

    public C8282t0(float f) {
        this.f20477a = f;
    }
}
