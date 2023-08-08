package androidx.compose.foundation.shape;

import androidx.compose.p004ui.platform.C15977u0;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.shape.m */
public final class C2692m implements C2684f, C15977u0 {

    /* renamed from: a */
    public final float f7055a;

    public C2692m(float f) {
        this.f7055a = f;
    }

    /* renamed from: f */
    public static /* synthetic */ C2692m m12150f(C2692m mVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = mVar.f7055a;
        }
        return mVar.mo9196d(f);
    }

    /* renamed from: a */
    public float mo9173a(long j, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return this.f7055a;
    }

    /* renamed from: c */
    public final float mo9195c() {
        return this.f7055a;
    }

    @C12579k
    /* renamed from: d */
    public final C2692m mo9196d(float f) {
        return new C2692m(f);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2692m) && Float.compare(this.f7055a, ((C2692m) obj).f7055a) == 0;
    }

    @C12579k
    /* renamed from: h */
    public String mo9174b() {
        return this.f7055a + "px";
    }

    public int hashCode() {
        return Float.hashCode(this.f7055a);
    }

    @C12579k
    public String toString() {
        return "CornerSize(size = " + this.f7055a + ".px)";
    }
}
