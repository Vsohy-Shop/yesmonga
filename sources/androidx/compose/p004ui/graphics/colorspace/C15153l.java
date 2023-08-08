package androidx.compose.p004ui.graphics.colorspace;

import androidx.compose.p004ui.graphics.C15258l2;
import com.usabilla.sdk.ubform.net.C9851c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,172:1\n25#2,3:173\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n78#1:173,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.l */
public final class C15153l extends C15138c {
    @C12579k

    /* renamed from: g */
    public static final C15154a f37461g = new C15154a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: h */
    public static final float[] f37462h;
    @C12579k

    /* renamed from: i */
    public static final float[] f37463i;
    @C12579k

    /* renamed from: j */
    public static final float[] f37464j;
    @C12579k

    /* renamed from: k */
    public static final float[] f37465k;

    /* renamed from: androidx.compose.ui.graphics.colorspace.l$a */
    public static final class C15154a {
        public /* synthetic */ C15154a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15154a() {
        }
    }

    static {
        float[] d = C15129a.f37382b.mo42544a().mo42540d();
        C15150j jVar = C15150j.f37445a;
        float[] m = C15141d.m65443m(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C15141d.m65436f(d, jVar.mo42630d().mo42579g(), jVar.mo42634h().mo42579g()));
        f37462h = m;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f37463i = fArr;
        f37464j = C15141d.m65442l(m);
        f37465k = C15141d.m65442l(fArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15153l(@C12579k String str, int i) {
        super(str, C15135b.f37394b.mo42570b(), i, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "name");
    }

    @C12579k
    /* renamed from: b */
    public float[] mo42507b(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, C9851c.f26937h);
        C15141d.m65445o(f37462h, fArr);
        double d = (double) 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow((double) Math.abs(fArr[0]), d));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow((double) Math.abs(fArr[1]), d));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow((double) Math.abs(fArr[2]), d));
        C15141d.m65445o(f37463i, fArr);
        return fArr;
    }

    /* renamed from: e */
    public float mo42511e(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    /* renamed from: f */
    public float mo42514f(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    /* renamed from: j */
    public boolean mo42521j() {
        return true;
    }

    /* renamed from: k */
    public long mo42522k(float f, float f2, float f3) {
        float H = C11479u.m44331H(f, 0.0f, 1.0f);
        float H2 = C11479u.m44331H(f2, -0.5f, 0.5f);
        float H3 = C11479u.m44331H(f3, -0.5f, 0.5f);
        float[] fArr = f37465k;
        float p = C15141d.m65446p(fArr, H, H2, H3);
        float q = C15141d.m65447q(fArr, H, H2, H3);
        float r = C15141d.m65448r(fArr, H, H2, H3);
        float f4 = p * p * p;
        float f5 = q * q * q;
        float f6 = r * r * r;
        float[] fArr2 = f37464j;
        return (((long) Float.floatToIntBits(C15141d.m65446p(fArr2, f4, f5, f6))) << 32) | (((long) Float.floatToIntBits(C15141d.m65447q(fArr2, f4, f5, f6))) & 4294967295L);
    }

    @C12579k
    /* renamed from: m */
    public float[] mo42525m(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, C9851c.f26937h);
        fArr[0] = C11479u.m44331H(fArr[0], 0.0f, 1.0f);
        fArr[1] = C11479u.m44331H(fArr[1], -0.5f, 0.5f);
        fArr[2] = C11479u.m44331H(fArr[2], -0.5f, 0.5f);
        C15141d.m65445o(f37465k, fArr);
        float f = fArr[0];
        fArr[0] = f * f * f;
        float f2 = fArr[1];
        fArr[1] = f2 * f2 * f2;
        float f3 = fArr[2];
        fArr[2] = f3 * f3 * f3;
        C15141d.m65445o(f37464j, fArr);
        return fArr;
    }

    /* renamed from: n */
    public float mo42526n(float f, float f2, float f3) {
        float H = C11479u.m44331H(f, 0.0f, 1.0f);
        float H2 = C11479u.m44331H(f2, -0.5f, 0.5f);
        float H3 = C11479u.m44331H(f3, -0.5f, 0.5f);
        float[] fArr = f37465k;
        float p = C15141d.m65446p(fArr, H, H2, H3);
        float q = C15141d.m65447q(fArr, H, H2, H3);
        float r = C15141d.m65448r(fArr, H, H2, H3);
        float f4 = r * r * r;
        return C15141d.m65448r(f37464j, p * p * p, q * q * q, f4);
    }

    /* renamed from: o */
    public long mo42527o(float f, float f2, float f3, float f4, @C12579k C15138c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "colorSpace");
        float[] fArr = f37462h;
        float p = C15141d.m65446p(fArr, f, f2, f3);
        float q = C15141d.m65447q(fArr, f, f2, f3);
        float r = C15141d.m65448r(fArr, f, f2, f3);
        double d = (double) 0.33333334f;
        float signum = Math.signum(p) * ((float) Math.pow((double) Math.abs(p), d));
        float signum2 = Math.signum(q) * ((float) Math.pow((double) Math.abs(q), d));
        float signum3 = Math.signum(r) * ((float) Math.pow((double) Math.abs(r), d));
        float[] fArr2 = f37463i;
        return C15258l2.m66176a(C15141d.m65446p(fArr2, signum, signum2, signum3), C15141d.m65447q(fArr2, signum, signum2, signum3), C15141d.m65448r(fArr2, signum, signum2, signum3), f4, cVar);
    }
}
