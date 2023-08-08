package androidx.compose.animation;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.animation.k */
public final class C2034k {

    /* renamed from: a */
    public final float f5672a;
    @C12579k

    /* renamed from: b */
    public final C16479d f5673b;

    /* renamed from: c */
    public final float f5674c;

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.animation.k$a */
    public static final class C2035a {

        /* renamed from: d */
        public static final int f5675d = 0;

        /* renamed from: a */
        public final float f5676a;

        /* renamed from: b */
        public final float f5677b;

        /* renamed from: c */
        public final long f5678c;

        public C2035a(float f, float f2, long j) {
            this.f5676a = f;
            this.f5677b = f2;
            this.f5678c = j;
        }

        /* renamed from: e */
        public static /* synthetic */ C2035a m8716e(C2035a aVar, float f, float f2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                f = aVar.f5676a;
            }
            if ((i & 2) != 0) {
                f2 = aVar.f5677b;
            }
            if ((i & 4) != 0) {
                j = aVar.f5678c;
            }
            return aVar.mo7051d(f, f2, j);
        }

        /* renamed from: a */
        public final float mo7048a() {
            return this.f5676a;
        }

        /* renamed from: b */
        public final float mo7049b() {
            return this.f5677b;
        }

        /* renamed from: c */
        public final long mo7050c() {
            return this.f5678c;
        }

        @C12579k
        /* renamed from: d */
        public final C2035a mo7051d(float f, float f2, long j) {
            return new C2035a(f, f2, j);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2035a)) {
                return false;
            }
            C2035a aVar = (C2035a) obj;
            return Float.compare(this.f5676a, aVar.f5676a) == 0 && Float.compare(this.f5677b, aVar.f5677b) == 0 && this.f5678c == aVar.f5678c;
        }

        /* renamed from: f */
        public final float mo7053f() {
            return this.f5677b;
        }

        /* renamed from: g */
        public final long mo7054g() {
            return this.f5678c;
        }

        /* renamed from: h */
        public final float mo7055h() {
            return this.f5676a;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f5676a) * 31) + Float.hashCode(this.f5677b)) * 31) + Long.hashCode(this.f5678c);
        }

        /* renamed from: i */
        public final float mo7057i(long j) {
            float f;
            long j2 = this.f5678c;
            if (j2 > 0) {
                f = ((float) j) / ((float) j2);
            } else {
                f = 1.0f;
            }
            return this.f5677b * Math.signum(this.f5676a) * C1913b.f5267a.mo6585b(f).mo6589e();
        }

        /* renamed from: j */
        public final float mo7058j(long j) {
            float f;
            long j2 = this.f5678c;
            if (j2 > 0) {
                f = ((float) j) / ((float) j2);
            } else {
                f = 1.0f;
            }
            return (((C1913b.f5267a.mo6585b(f).mo6591f() * Math.signum(this.f5676a)) * this.f5677b) / ((float) this.f5678c)) * 1000.0f;
        }

        @C12579k
        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f5676a + ", distance=" + this.f5677b + ", duration=" + this.f5678c + ')';
        }
    }

    public C2034k(float f, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        this.f5672a = f;
        this.f5673b = dVar;
        this.f5674c = mo7042a(dVar);
    }

    /* renamed from: a */
    public final float mo7042a(C16479d dVar) {
        return C2036l.m8728c(0.84f, dVar.getDensity());
    }

    /* renamed from: b */
    public final float mo7043b(float f) {
        double f2 = mo7047f(f);
        return (float) (((double) (this.f5672a * this.f5674c)) * Math.exp((((double) C2036l.f5681c) / (((double) C2036l.f5681c) - 1.0d)) * f2));
    }

    /* renamed from: c */
    public final long mo7044c(float f) {
        return (long) (Math.exp(mo7047f(f) / (((double) C2036l.f5681c) - 1.0d)) * 1000.0d);
    }

    @C12579k
    /* renamed from: d */
    public final C2035a mo7045d(float f) {
        double f2 = mo7047f(f);
        double b = ((double) C2036l.f5681c) - 1.0d;
        return new C2035a(f, (float) (((double) (this.f5672a * this.f5674c)) * Math.exp((((double) C2036l.f5681c) / b) * f2)), (long) (Math.exp(f2 / b) * 1000.0d));
    }

    @C12579k
    /* renamed from: e */
    public final C16479d mo7046e() {
        return this.f5673b;
    }

    /* renamed from: f */
    public final double mo7047f(float f) {
        return C1913b.f5267a.mo6584a(f, this.f5672a * this.f5674c);
    }
}
