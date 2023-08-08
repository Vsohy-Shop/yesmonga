package androidx.compose.p004ui.graphics.colorspace;

import androidx.compose.p004ui.graphics.C15258l2;
import com.usabilla.sdk.ubform.net.C9851c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,140:1\n25#2,3:141\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:141,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.k */
public final class C15151k extends C15138c {
    @C12579k

    /* renamed from: g */
    public static final C15152a f37456g = new C15152a((DefaultConstructorMarker) null);

    /* renamed from: h */
    public static final float f37457h = 0.008856452f;

    /* renamed from: i */
    public static final float f37458i = 7.787037f;

    /* renamed from: j */
    public static final float f37459j = 0.13793103f;

    /* renamed from: k */
    public static final float f37460k = 0.20689656f;

    /* renamed from: androidx.compose.ui.graphics.colorspace.k$a */
    public static final class C15152a {
        public /* synthetic */ C15152a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15152a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15151k(@C12579k String str, int i) {
        super(str, C15135b.f37394b.mo42570b(), i, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "name");
    }

    @C12579k
    /* renamed from: b */
    public float[] mo42507b(@C12579k float[] fArr) {
        float f;
        float f2;
        float f3;
        float[] fArr2 = fArr;
        Intrinsics.checkNotNullParameter(fArr2, C9851c.f26937h);
        float f4 = fArr2[0];
        C15150j jVar = C15150j.f37445a;
        float f5 = f4 / jVar.mo42631e()[0];
        float f6 = fArr2[1] / jVar.mo42631e()[1];
        float f7 = fArr2[2] / jVar.mo42631e()[2];
        if (f5 > 0.008856452f) {
            f = (float) Math.pow((double) f5, (double) 0.33333334f);
        } else {
            f = (f5 * 7.787037f) + 0.13793103f;
        }
        if (f6 > 0.008856452f) {
            f2 = (float) Math.pow((double) f6, (double) 0.33333334f);
        } else {
            f2 = (f6 * 7.787037f) + 0.13793103f;
        }
        if (f7 > 0.008856452f) {
            f3 = (float) Math.pow((double) f7, (double) 0.33333334f);
        } else {
            f3 = (f7 * 7.787037f) + 0.13793103f;
        }
        fArr2[0] = C11479u.m44331H((116.0f * f2) - 16.0f, 0.0f, 100.0f);
        fArr2[1] = C11479u.m44331H((f - f2) * 500.0f, -128.0f, 128.0f);
        fArr2[2] = C11479u.m44331H((f2 - f3) * 200.0f, -128.0f, 128.0f);
        return fArr2;
    }

    /* renamed from: e */
    public float mo42511e(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    /* renamed from: f */
    public float mo42514f(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    /* renamed from: j */
    public boolean mo42521j() {
        return true;
    }

    /* renamed from: k */
    public long mo42522k(float f, float f2, float f3) {
        float f4;
        float f5;
        float H = (C11479u.m44331H(f, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float H2 = (C11479u.m44331H(f, -128.0f, 128.0f) * 0.002f) + H;
        if (H2 > 0.20689656f) {
            f4 = H2 * H2 * H2;
        } else {
            f4 = (H2 - 0.13793103f) * 0.12841855f;
        }
        if (H > 0.20689656f) {
            f5 = H * H * H;
        } else {
            f5 = (H - 0.13793103f) * 0.12841855f;
        }
        C15150j jVar = C15150j.f37445a;
        return (((long) Float.floatToIntBits(f4 * jVar.mo42631e()[0])) << 32) | (((long) Float.floatToIntBits(f5 * jVar.mo42631e()[1])) & 4294967295L);
    }

    @C12579k
    /* renamed from: m */
    public float[] mo42525m(@C12579k float[] fArr) {
        float f;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(fArr, C9851c.f26937h);
        fArr[0] = C11479u.m44331H(fArr[0], 0.0f, 100.0f);
        fArr[1] = C11479u.m44331H(fArr[1], -128.0f, 128.0f);
        float H = C11479u.m44331H(fArr[2], -128.0f, 128.0f);
        fArr[2] = H;
        float f4 = (fArr[0] + 16.0f) / 116.0f;
        float f5 = (fArr[1] * 0.002f) + f4;
        float f6 = f4 - (H * 0.005f);
        if (f5 > 0.20689656f) {
            f = f5 * f5 * f5;
        } else {
            f = (f5 - 0.13793103f) * 0.12841855f;
        }
        if (f4 > 0.20689656f) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = (f4 - 0.13793103f) * 0.12841855f;
        }
        if (f6 > 0.20689656f) {
            f3 = f6 * f6 * f6;
        } else {
            f3 = (f6 - 0.13793103f) * 0.12841855f;
        }
        C15150j jVar = C15150j.f37445a;
        fArr[0] = f * jVar.mo42631e()[0];
        fArr[1] = f2 * jVar.mo42631e()[1];
        fArr[2] = f3 * jVar.mo42631e()[2];
        return fArr;
    }

    /* renamed from: n */
    public float mo42526n(float f, float f2, float f3) {
        float f4;
        float H = ((C11479u.m44331H(f, 0.0f, 100.0f) + 16.0f) / 116.0f) - (C11479u.m44331H(f3, -128.0f, 128.0f) * 0.005f);
        if (H > 0.20689656f) {
            f4 = H * H * H;
        } else {
            f4 = 0.12841855f * (H - 0.13793103f);
        }
        return f4 * C15150j.f37445a.mo42631e()[2];
    }

    /* renamed from: o */
    public long mo42527o(float f, float f2, float f3, float f4, @C12579k C15138c cVar) {
        float f5;
        float f6;
        float f7;
        Intrinsics.checkNotNullParameter(cVar, "colorSpace");
        C15150j jVar = C15150j.f37445a;
        float f8 = f / jVar.mo42631e()[0];
        float f9 = f2 / jVar.mo42631e()[1];
        float f10 = f3 / jVar.mo42631e()[2];
        if (f8 > 0.008856452f) {
            f5 = (float) Math.pow((double) f8, (double) 0.33333334f);
        } else {
            f5 = (f8 * 7.787037f) + 0.13793103f;
        }
        if (f9 > 0.008856452f) {
            f6 = (float) Math.pow((double) f9, (double) 0.33333334f);
        } else {
            f6 = (f9 * 7.787037f) + 0.13793103f;
        }
        if (f10 > 0.008856452f) {
            f7 = (float) Math.pow((double) f10, (double) 0.33333334f);
        } else {
            f7 = (f10 * 7.787037f) + 0.13793103f;
        }
        return C15258l2.m66176a(C11479u.m44331H((116.0f * f6) - 16.0f, 0.0f, 100.0f), C11479u.m44331H((f5 - f6) * 500.0f, -128.0f, 128.0f), C11479u.m44331H((f6 - f7) * 200.0f, -128.0f, 128.0f), f4, cVar);
    }
}
