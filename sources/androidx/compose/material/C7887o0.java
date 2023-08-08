package androidx.compose.material;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C3044g0
@C8585m0
/* renamed from: androidx.compose.material.o0 */
public final class C7887o0 implements C7941v1 {

    /* renamed from: b */
    public static final int f18891b = 0;

    /* renamed from: a */
    public final float f18892a;

    public C7887o0(float f) {
        this.f18892a = f;
    }

    /* renamed from: d */
    public static /* synthetic */ C7887o0 m25079d(C7887o0 o0Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = o0Var.f18892a;
        }
        return o0Var.mo10896c(f);
    }

    /* renamed from: a */
    public float mo10871a(@C12579k C16479d dVar, float f, float f2) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return C16515d.m74781a(f, f2, this.f18892a);
    }

    /* renamed from: b */
    public final float mo10895b() {
        return this.f18892a;
    }

    @C12579k
    /* renamed from: c */
    public final C7887o0 mo10896c(float f) {
        return new C7887o0(f);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7887o0) && Float.compare(this.f18892a, ((C7887o0) obj).f18892a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f18892a);
    }

    @C12579k
    public String toString() {
        return "FractionalThreshold(fraction=" + this.f18892a + ')';
    }
}
