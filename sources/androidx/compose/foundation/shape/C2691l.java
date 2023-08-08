package androidx.compose.foundation.shape;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.platform.C15977u0;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.shape.l */
public final class C2691l implements C2684f, C15977u0 {

    /* renamed from: a */
    public final float f7054a;

    public C2691l(float f) {
        this.f7054a = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    /* renamed from: f */
    public static /* synthetic */ C2691l m12144f(C2691l lVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = lVar.f7054a;
        }
        return lVar.mo9190d(f);
    }

    /* renamed from: a */
    public float mo9173a(long j, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return C15104m.m65020q(j) * (this.f7054a / 100.0f);
    }

    /* renamed from: c */
    public final float mo9189c() {
        return this.f7054a;
    }

    @C12579k
    /* renamed from: d */
    public final C2691l mo9190d(float f) {
        return new C2691l(f);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2691l) && Float.compare(this.f7054a, ((C2691l) obj).f7054a) == 0;
    }

    @C12579k
    /* renamed from: h */
    public String mo9174b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7054a);
        sb.append('%');
        return sb.toString();
    }

    public int hashCode() {
        return Float.hashCode(this.f7054a);
    }

    @C12579k
    public String toString() {
        return "CornerSize(size = " + this.f7054a + "%)";
    }
}
