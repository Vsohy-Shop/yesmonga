package kotlin.time;

import kotlin.C11665v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11646k
@C11665v0(version = "1.3")
/* renamed from: kotlin.time.s */
public final class C11659s<T> {

    /* renamed from: a */
    public final T f28972a;

    /* renamed from: b */
    public final long f28973b;

    public /* synthetic */ C11659s(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j);
    }

    /* renamed from: d */
    public static /* synthetic */ C11659s m45728d(C11659s sVar, T t, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            t = sVar.f28972a;
        }
        if ((i & 2) != 0) {
            j = sVar.f28973b;
        }
        return sVar.mo23504c(t, j);
    }

    /* renamed from: a */
    public final T mo23502a() {
        return this.f28972a;
    }

    /* renamed from: b */
    public final long mo23503b() {
        return this.f28973b;
    }

    @C12579k
    /* renamed from: c */
    public final C11659s<T> mo23504c(T t, long j) {
        return new C11659s<>(t, j, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public final long mo23505e() {
        return this.f28973b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11659s)) {
            return false;
        }
        C11659s sVar = (C11659s) obj;
        return Intrinsics.areEqual((Object) this.f28972a, (Object) sVar.f28972a) && C11636e.m45474h0(this.f28973b, sVar.f28973b);
    }

    /* renamed from: f */
    public final T mo23507f() {
        return this.f28972a;
    }

    public int hashCode() {
        T t = this.f28972a;
        return ((t == null ? 0 : t.hashCode()) * 31) + C11636e.m45452L1(this.f28973b);
    }

    @C12579k
    public String toString() {
        return "TimedValue(value=" + this.f28972a + ", duration=" + C11636e.m45500t2(this.f28973b) + ')';
    }

    public C11659s(T t, long j) {
        this.f28972a = t;
        this.f28973b = j;
    }
}
