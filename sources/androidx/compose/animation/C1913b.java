package androidx.compose.animation;

import androidx.compose.runtime.internal.C8567o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.animation.b */
public final class C1913b {
    @C12579k

    /* renamed from: a */
    public static final C1913b f5267a = new C1913b();

    /* renamed from: b */
    public static final int f5268b = 100;
    @C12579k

    /* renamed from: c */
    public static final float[] f5269c;
    @C12579k

    /* renamed from: d */
    public static final float[] f5270d;

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.animation.b$a */
    public static final class C1914a {

        /* renamed from: c */
        public static final int f5271c = 0;

        /* renamed from: a */
        public final float f5272a;

        /* renamed from: b */
        public final float f5273b;

        public C1914a(float f, float f2) {
            this.f5272a = f;
            this.f5273b = f2;
        }

        /* renamed from: d */
        public static /* synthetic */ C1914a m7926d(C1914a aVar, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = aVar.f5272a;
            }
            if ((i & 2) != 0) {
                f2 = aVar.f5273b;
            }
            return aVar.mo6588c(f, f2);
        }

        /* renamed from: a */
        public final float mo6586a() {
            return this.f5272a;
        }

        /* renamed from: b */
        public final float mo6587b() {
            return this.f5273b;
        }

        @C12579k
        /* renamed from: c */
        public final C1914a mo6588c(float f, float f2) {
            return new C1914a(f, f2);
        }

        /* renamed from: e */
        public final float mo6589e() {
            return this.f5272a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1914a)) {
                return false;
            }
            C1914a aVar = (C1914a) obj;
            return Float.compare(this.f5272a, aVar.f5272a) == 0 && Float.compare(this.f5273b, aVar.f5273b) == 0;
        }

        /* renamed from: f */
        public final float mo6591f() {
            return this.f5273b;
        }

        public int hashCode() {
            return (Float.hashCode(this.f5272a) * 31) + Float.hashCode(this.f5273b);
        }

        @C12579k
        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f5272a + ", velocityCoefficient=" + this.f5273b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f5269c = fArr;
        float[] fArr2 = new float[101];
        f5270d = fArr2;
        C2044t.m8756b(fArr, fArr2, 100);
    }

    /* renamed from: a */
    public final double mo6584a(float f, float f2) {
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) f2));
    }

    @C12579k
    /* renamed from: b */
    public final C1914a mo6585b(float f) {
        float f2;
        float f3;
        float f4 = (float) 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = ((float) i) / f4;
            int i2 = i + 1;
            float f6 = ((float) i2) / f4;
            float[] fArr = f5269c;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = f7 + ((f - f5) * f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new C1914a(f2, f3);
    }
}
