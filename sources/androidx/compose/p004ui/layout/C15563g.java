package androidx.compose.p004ui.layout;

import androidx.compose.runtime.C8585m0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.layout.g */
public final class C15563g implements C15541c {

    /* renamed from: c */
    public static final int f38716c = 0;

    /* renamed from: b */
    public final float f38717b;

    public C15563g(float f) {
        this.f38717b = f;
    }

    /* renamed from: d */
    public static /* synthetic */ C15563g m69178d(C15563g gVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = gVar.f38717b;
        }
        return gVar.mo44390c(f);
    }

    /* renamed from: a */
    public long mo44368a(long j, long j2) {
        float f = this.f38717b;
        return C15558e1.m69150a(f, f);
    }

    /* renamed from: b */
    public final float mo44389b() {
        return this.f38717b;
    }

    @C12579k
    /* renamed from: c */
    public final C15563g mo44390c(float f) {
        return new C15563g(f);
    }

    /* renamed from: e */
    public final float mo44391e() {
        return this.f38717b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15563g) && Float.compare(this.f38717b, ((C15563g) obj).f38717b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f38717b);
    }

    @C12579k
    public String toString() {
        return "FixedScale(value=" + this.f38717b + ')';
    }
}
