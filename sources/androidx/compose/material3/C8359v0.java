package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C8585m0
/* renamed from: androidx.compose.material3.v0 */
public final class C8359v0 implements C8201f3 {

    /* renamed from: a */
    public final float f22438a;

    public C8359v0(float f) {
        this.f22438a = f;
    }

    /* renamed from: d */
    public static /* synthetic */ C8359v0 m29351d(C8359v0 v0Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = v0Var.f22438a;
        }
        return v0Var.mo14736c(f);
    }

    /* renamed from: a */
    public float mo12601a(@C12579k C16479d dVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return C16515d.m74781a(f, f2, this.f22438a);
    }

    /* renamed from: b */
    public final float mo14735b() {
        return this.f22438a;
    }

    @C12579k
    /* renamed from: c */
    public final C8359v0 mo14736c(float f) {
        return new C8359v0(f);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8359v0) && Float.compare(this.f22438a, ((C8359v0) obj).f22438a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f22438a);
    }

    @C12579k
    public String toString() {
        return "FractionalThreshold(fraction=" + this.f22438a + ')';
    }
}
