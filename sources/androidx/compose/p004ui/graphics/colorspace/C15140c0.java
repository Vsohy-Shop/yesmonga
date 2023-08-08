package androidx.compose.p004ui.graphics.colorspace;

import androidx.compose.p004ui.graphics.C15258l2;
import com.usabilla.sdk.ubform.net.C9851c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,79:1\n25#2,3:80\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n52#1:80,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.c0 */
public final class C15140c0 extends C15138c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15140c0(@C12579k String str, int i) {
        super(str, C15135b.f37394b.mo42572d(), i, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "name");
    }

    @C12579k
    /* renamed from: b */
    public float[] mo42507b(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, C9851c.f26937h);
        fArr[0] = mo42589p(fArr[0]);
        fArr[1] = mo42589p(fArr[1]);
        fArr[2] = mo42589p(fArr[2]);
        return fArr;
    }

    /* renamed from: e */
    public float mo42511e(int i) {
        return 2.0f;
    }

    /* renamed from: f */
    public float mo42514f(int i) {
        return -2.0f;
    }

    /* renamed from: j */
    public boolean mo42521j() {
        return true;
    }

    /* renamed from: k */
    public long mo42522k(float f, float f2, float f3) {
        float p = mo42589p(f);
        float p2 = mo42589p(f2);
        long floatToIntBits = (long) Float.floatToIntBits(p);
        return (((long) Float.floatToIntBits(p2)) & 4294967295L) | (floatToIntBits << 32);
    }

    @C12579k
    /* renamed from: m */
    public float[] mo42525m(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, C9851c.f26937h);
        fArr[0] = mo42589p(fArr[0]);
        fArr[1] = mo42589p(fArr[1]);
        fArr[2] = mo42589p(fArr[2]);
        return fArr;
    }

    /* renamed from: n */
    public float mo42526n(float f, float f2, float f3) {
        return mo42589p(f3);
    }

    /* renamed from: o */
    public long mo42527o(float f, float f2, float f3, float f4, @C12579k C15138c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "colorSpace");
        return C15258l2.m66176a(mo42589p(f), mo42589p(f2), mo42589p(f3), f4, cVar);
    }

    /* renamed from: p */
    public final float mo42589p(float f) {
        return C11479u.m44331H(f, -2.0f, 2.0f);
    }
}
