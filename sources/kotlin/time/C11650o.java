package kotlin.time;

import kotlin.C11665v0;
import kotlin.time.C11654r;
import org.jetbrains.annotations.C12579k;

@C11646k
@C11665v0(version = "1.3")
/* renamed from: kotlin.time.o */
public final class C11650o implements C11654r.C11658c {
    @C12579k

    /* renamed from: b */
    public static final C11650o f28965b = new C11650o();

    /* renamed from: c */
    public static final long f28966c = System.nanoTime();

    /* renamed from: b */
    public final long mo23487b(long j, long j2) {
        return C11654r.C11656b.C11657a.m45714z(C11647l.m45665c(j, j2));
    }

    /* renamed from: c */
    public final long mo23488c(long j, long j2) {
        return C11647l.m45669g(j, j2);
    }

    /* renamed from: d */
    public final long mo23489d(long j) {
        return C11647l.m45667e(mo23491f(), j);
    }

    /* renamed from: e */
    public long mo23490e() {
        return C11654r.C11656b.C11657a.m45714z(mo23491f());
    }

    /* renamed from: f */
    public final long mo23491f() {
        return System.nanoTime() - f28966c;
    }

    @C12579k
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
