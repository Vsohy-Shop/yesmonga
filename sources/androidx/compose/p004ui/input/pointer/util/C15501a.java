package androidx.compose.p004ui.input.pointer.util;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.input.pointer.util.a */
public final class C15501a {

    /* renamed from: a */
    public long f38555a;

    /* renamed from: b */
    public float f38556b;

    public C15501a(long j, float f) {
        this.f38555a = j;
        this.f38556b = f;
    }

    /* renamed from: d */
    public static /* synthetic */ C15501a m68757d(C15501a aVar, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.f38555a;
        }
        if ((i & 2) != 0) {
            f = aVar.f38556b;
        }
        return aVar.mo44140c(j, f);
    }

    /* renamed from: a */
    public final long mo44138a() {
        return this.f38555a;
    }

    /* renamed from: b */
    public final float mo44139b() {
        return this.f38556b;
    }

    @C12579k
    /* renamed from: c */
    public final C15501a mo44140c(long j, float f) {
        return new C15501a(j, f);
    }

    /* renamed from: e */
    public final float mo44141e() {
        return this.f38556b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15501a)) {
            return false;
        }
        C15501a aVar = (C15501a) obj;
        return this.f38555a == aVar.f38555a && Float.compare(this.f38556b, aVar.f38556b) == 0;
    }

    /* renamed from: f */
    public final long mo44143f() {
        return this.f38555a;
    }

    /* renamed from: g */
    public final void mo44144g(float f) {
        this.f38556b = f;
    }

    /* renamed from: h */
    public final void mo44145h(long j) {
        this.f38555a = j;
    }

    public int hashCode() {
        return (Long.hashCode(this.f38555a) * 31) + Float.hashCode(this.f38556b);
    }

    @C12579k
    public String toString() {
        return "DataPointAtTime(time=" + this.f38555a + ", dataPoint=" + this.f38556b + ')';
    }
}
