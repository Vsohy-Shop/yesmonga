package okio;

import android.support.p002v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.q0 */
public final class C12512q0 {

    /* renamed from: a */
    public long f30491a;

    /* renamed from: b */
    public long f30492b;

    /* renamed from: c */
    public long f30493c;

    /* renamed from: d */
    public long f30494d;

    /* renamed from: okio.q0$a */
    public static final class C12513a extends C12521t {

        /* renamed from: a */
        public final /* synthetic */ C12512q0 f30495a;

        /* renamed from: b */
        public final /* synthetic */ C12506n0 f30496b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12513a(C12512q0 q0Var, C12506n0 n0Var, C12506n0 n0Var2) {
            super(n0Var2);
            this.f30495a = q0Var;
            this.f30496b = n0Var;
        }

        public void write(@C12579k C12500m mVar, long j) throws IOException {
            Intrinsics.checkNotNullParameter(mVar, "source");
            while (j > 0) {
                try {
                    long j2 = this.f30495a.mo27425j(j);
                    super.write(mVar, j2);
                    j -= j2;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }
    }

    /* renamed from: okio.q0$b */
    public static final class C12514b extends C12522u {

        /* renamed from: a */
        public final /* synthetic */ C12512q0 f30497a;

        /* renamed from: b */
        public final /* synthetic */ C12510p0 f30498b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12514b(C12512q0 q0Var, C12510p0 p0Var, C12510p0 p0Var2) {
            super(p0Var2);
            this.f30497a = q0Var;
            this.f30498b = p0Var;
        }

        public long read(@C12579k C12500m mVar, long j) {
            Intrinsics.checkNotNullParameter(mVar, "sink");
            try {
                return super.read(mVar, this.f30497a.mo27425j(j));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }

    public C12512q0(long j) {
        this.f30494d = j;
        this.f30492b = PlaybackStateCompat.f473O0;
        this.f30493c = PlaybackStateCompat.f478T0;
    }

    /* renamed from: e */
    public static /* synthetic */ void m51040e(C12512q0 q0Var, long j, long j2, long j3, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = q0Var.f30492b;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = q0Var.f30493c;
        }
        q0Var.mo27420d(j, j4, j3);
    }

    /* renamed from: a */
    public final long mo27417a(long j, long j2) {
        if (this.f30491a == 0) {
            return j2;
        }
        long max = Math.max(this.f30494d - j, 0);
        long g = this.f30493c - mo27422g(max);
        if (g >= j2) {
            this.f30494d = j + max + mo27421f(j2);
            return j2;
        }
        long j3 = this.f30492b;
        if (g >= j3) {
            this.f30494d = j + mo27421f(this.f30493c);
            return g;
        }
        long min = Math.min(j3, j2);
        long f = max + mo27421f(min - this.f30493c);
        if (f != 0) {
            return -f;
        }
        this.f30494d = j + mo27421f(this.f30493c);
        return min;
    }

    @C11315i
    /* renamed from: b */
    public final void mo27418b(long j) {
        m51040e(this, j, 0, 0, 6, (Object) null);
    }

    @C11315i
    /* renamed from: c */
    public final void mo27419c(long j, long j2) {
        m51040e(this, j, j2, 0, 4, (Object) null);
    }

    @C11315i
    /* renamed from: d */
    public final void mo27420d(long j, long j2, long j3) {
        boolean z;
        boolean z2;
        synchronized (this) {
            boolean z3 = true;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (j2 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (j3 < j2) {
                        z3 = false;
                    }
                    if (z3) {
                        this.f30491a = j;
                        this.f30492b = j2;
                        this.f30493c = j3;
                        notifyAll();
                        C11079d2 d2Var = C11079d2.f28267a;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    /* renamed from: f */
    public final long mo27421f(long j) {
        return (j * 1000000000) / this.f30491a;
    }

    /* renamed from: g */
    public final long mo27422g(long j) {
        return (j * this.f30491a) / 1000000000;
    }

    @C12579k
    /* renamed from: h */
    public final C12506n0 mo27423h(@C12579k C12506n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "sink");
        return new C12513a(this, n0Var, n0Var);
    }

    @C12579k
    /* renamed from: i */
    public final C12510p0 mo27424i(@C12579k C12510p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "source");
        return new C12514b(this, p0Var, p0Var);
    }

    /* renamed from: j */
    public final long mo27425j(long j) {
        boolean z;
        long a;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            synchronized (this) {
                while (true) {
                    a = mo27417a(System.nanoTime(), j);
                    if (a < 0) {
                        mo27426k(-a);
                    }
                }
            }
            return a;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: k */
    public final void mo27426k(long j) {
        long j2 = j / 1000000;
        wait(j2, (int) (j - (1000000 * j2)));
    }

    public C12512q0() {
        this(System.nanoTime());
    }
}
