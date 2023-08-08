package androidx.compose.material;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C3044g0
@C8585m0
/* renamed from: androidx.compose.material.l0 */
public final class C7878l0 implements C7941v1 {

    /* renamed from: b */
    public static final int f18875b = 0;

    /* renamed from: a */
    public final float f18876a;

    public /* synthetic */ C7878l0(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: d */
    public static /* synthetic */ C7878l0 m25057d(C7878l0 l0Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = l0Var.f18876a;
        }
        return l0Var.mo10873c(f);
    }

    /* renamed from: a */
    public float mo10871a(@C12579k C16479d dVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return f + (dVar.mo7425g5(this.f18876a) * Math.signum(f2 - f));
    }

    /* renamed from: b */
    public final float mo10872b() {
        return this.f18876a;
    }

    @C12579k
    /* renamed from: c */
    public final C7878l0 mo10873c(float f) {
        return new C7878l0(f, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7878l0) && C16483g.m74440e0(this.f18876a, ((C7878l0) obj).f18876a);
    }

    public int hashCode() {
        return C16483g.m74442h0(this.f18876a);
    }

    @C12579k
    public String toString() {
        return "FixedThreshold(offset=" + C16483g.m74447o0(this.f18876a) + ')';
    }

    public C7878l0(float f) {
        this.f18876a = f;
    }
}
