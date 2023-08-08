package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.animation.j */
public final class C2033j {

    /* renamed from: a */
    public final float f5670a;
    @C12579k

    /* renamed from: b */
    public final C1956d0<Float> f5671b;

    public C2033j(float f, @C12579k C1956d0<Float> d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        this.f5670a = f;
        this.f5671b = d0Var;
    }

    /* renamed from: d */
    public static /* synthetic */ C2033j m8704d(C2033j jVar, float f, C1956d0<Float> d0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = jVar.f5670a;
        }
        if ((i & 2) != 0) {
            d0Var = jVar.f5671b;
        }
        return jVar.mo7036c(f, d0Var);
    }

    /* renamed from: a */
    public final float mo7034a() {
        return this.f5670a;
    }

    @C12579k
    /* renamed from: b */
    public final C1956d0<Float> mo7035b() {
        return this.f5671b;
    }

    @C12579k
    /* renamed from: c */
    public final C2033j mo7036c(float f, @C12579k C1956d0<Float> d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        return new C2033j(f, d0Var);
    }

    /* renamed from: e */
    public final float mo7037e() {
        return this.f5670a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2033j)) {
            return false;
        }
        C2033j jVar = (C2033j) obj;
        return Float.compare(this.f5670a, jVar.f5670a) == 0 && Intrinsics.areEqual((Object) this.f5671b, (Object) jVar.f5671b);
    }

    @C12579k
    /* renamed from: f */
    public final C1956d0<Float> mo7039f() {
        return this.f5671b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f5670a) * 31) + this.f5671b.hashCode();
    }

    @C12579k
    public String toString() {
        return "Fade(alpha=" + this.f5670a + ", animationSpec=" + this.f5671b + ')';
    }
}
