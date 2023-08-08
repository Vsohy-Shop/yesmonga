package androidx.compose.foundation.layout;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n25#2,3:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n684#1:709,3\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.e */
public final class C2351e {
    @C12579k

    /* renamed from: a */
    public static final C2351e f6256a = new C2351e();

    /* renamed from: b */
    public static final int f6257b = 100;
    @C12579k

    /* renamed from: c */
    public static final float[] f6258c = new float[101];
    @C12579k

    /* renamed from: d */
    public static final float[] f6259d = new float[101];

    @C11288f
    @C11363r0({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n34#2:709\n41#2:710\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n701#1:709\n706#1:710\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.e$a */
    public static final class C2352a {

        /* renamed from: a */
        public final long f6260a;

        public /* synthetic */ C2352a(long j) {
            this.f6260a = j;
        }

        /* renamed from: a */
        public static final /* synthetic */ C2352a m10361a(long j) {
            return new C2352a(j);
        }

        /* renamed from: b */
        public static long m10362b(long j) {
            return j;
        }

        /* renamed from: c */
        public static boolean m10363c(long j, Object obj) {
            return (obj instanceof C2352a) && j == ((C2352a) obj).mo8048i();
        }

        /* renamed from: d */
        public static final boolean m10364d(long j, long j2) {
            return j == j2;
        }

        /* renamed from: e */
        public static final float m10365e(long j) {
            C11377x xVar = C11377x.f28521a;
            return Float.intBitsToFloat((int) (j >> 32));
        }

        /* renamed from: f */
        public static final float m10366f(long j) {
            C11377x xVar = C11377x.f28521a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }

        /* renamed from: g */
        public static int m10367g(long j) {
            return Long.hashCode(j);
        }

        /* renamed from: h */
        public static String m10368h(long j) {
            return "FlingResult(packedValue=" + j + ')';
        }

        public boolean equals(Object obj) {
            return m10363c(this.f6260a, obj);
        }

        public int hashCode() {
            return m10367g(this.f6260a);
        }

        /* renamed from: i */
        public final /* synthetic */ long mo8048i() {
            return this.f6260a;
        }

        public String toString() {
            return m10368h(this.f6260a);
        }
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f11 = ((float) i) / ((float) 100);
            float f12 = 1.0f;
            while (true) {
                f = ((f12 - f9) / 2.0f) + f9;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f13 = (((f2 * 0.175f) + (f * 0.35000002f)) * f3) + f4;
                if (((double) Math.abs(f13 - f11)) < 1.0E-5d) {
                    break;
                } else if (f13 > f11) {
                    f12 = f;
                } else {
                    f9 = f;
                }
            }
            float f14 = 0.5f;
            f6258c[i] = (f3 * ((f2 * 0.5f) + f)) + f4;
            float f15 = 1.0f;
            while (true) {
                f5 = ((f15 - f10) / 2.0f) + f10;
                f6 = 1.0f - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f16 = (((f6 * f14) + f5) * f7) + f8;
                if (((double) Math.abs(f16 - f11)) < 1.0E-5d) {
                    break;
                }
                if (f16 > f11) {
                    f15 = f5;
                } else {
                    f10 = f5;
                }
                f14 = 0.5f;
            }
            f6259d[i] = (f7 * ((f6 * 0.175f) + (f5 * 0.35000002f))) + f8;
        }
        f6259d[100] = 1.0f;
        f6258c[100] = 1.0f;
    }

    /* renamed from: a */
    public final double mo8044a(float f, float f2) {
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) f2));
    }

    /* renamed from: b */
    public final long mo8045b(float f) {
        float f2;
        float f3;
        float f4 = (float) 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = ((float) i) / f4;
            int i2 = i + 1;
            float f6 = ((float) i2) / f4;
            float[] fArr = f6258c;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = f7 + ((f - f5) * f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        long floatToIntBits = (long) Float.floatToIntBits(f2);
        return C2352a.m10362b((((long) Float.floatToIntBits(f3)) & 4294967295L) | (floatToIntBits << 32));
    }
}
