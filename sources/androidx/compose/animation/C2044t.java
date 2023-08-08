package androidx.compose.animation;

import androidx.compose.animation.core.C2013v;
import androidx.compose.animation.core.C2017x;
import androidx.compose.p004ui.unit.C16479d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.t */
public final class C2044t {

    /* renamed from: a */
    public static final float f5690a = 0.35f;

    /* renamed from: b */
    public static final float f5691b = 0.5f;

    /* renamed from: c */
    public static final float f5692c = 1.0f;

    /* renamed from: d */
    public static final float f5693d = 0.175f;

    /* renamed from: e */
    public static final float f5694e = 0.35000002f;

    /* renamed from: b */
    public static final void m8756b(float[] fArr, float[] fArr2, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i2 = i;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float f11 = ((float) i3) / ((float) i2);
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
            fArr[i3] = (f3 * ((f2 * 0.5f) + f)) + f4;
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
            fArr2[i3] = (f7 * ((f6 * 0.175f) + (f5 * 0.35000002f))) + f8;
        }
        fArr2[i2] = 1.0f;
        fArr[i2] = 1.0f;
    }

    @C12579k
    /* renamed from: c */
    public static final <T> C2013v<T> m8757c(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return C2017x.m8658e(new C2045u(dVar));
    }
}
