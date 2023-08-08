package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8547h2;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n130#1:201\n25#2,3:198\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n144#1:201\n31#1:198,3\n*E\n"})
/* renamed from: androidx.compose.ui.layout.e1 */
public final class C15558e1 {
    @C8547h2
    /* renamed from: a */
    public static final long m69150a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return C15554d1.m69123e((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    @C8547h2
    /* renamed from: c */
    public static final long m69152c(long j, long j2) {
        return C15106n.m65033a(C15104m.m65023t(j) / C15554d1.m69131m(j2), C15104m.m65016m(j) / C15554d1.m69133o(j2));
    }

    /* renamed from: d */
    public static final boolean m69153d(long j) {
        return j != C15554d1.f38709b.mo44385a();
    }

    @C8547h2
    /* renamed from: e */
    public static /* synthetic */ void m69154e(long j) {
    }

    /* renamed from: f */
    public static final boolean m69155f(long j) {
        return j == C15554d1.f38709b.mo44385a();
    }

    @C8547h2
    /* renamed from: g */
    public static /* synthetic */ void m69156g(long j) {
    }

    @C8547h2
    /* renamed from: h */
    public static final long m69157h(long j, long j2, float f) {
        return m69150a(C16515d.m74781a(C15554d1.m69131m(j), C15554d1.m69131m(j2), f), C16515d.m74781a(C15554d1.m69133o(j), C15554d1.m69133o(j2), f));
    }

    /* renamed from: i */
    public static final float m69158i(float f) {
        float f2 = (float) 10;
        float f3 = f * f2;
        int i = (int) f3;
        if (f3 - ((float) i) >= 0.5f) {
            i++;
        }
        return ((float) i) / f2;
    }

    /* renamed from: j */
    public static final long m69159j(long j, @C12579k C11289a<C15554d1> aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (j != C15554d1.f38709b.mo44385a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        return aVar.invoke().mo44383s();
    }

    @C8547h2
    /* renamed from: k */
    public static final long m69160k(long j, long j2) {
        return C15106n.m65033a(C15104m.m65023t(j) * C15554d1.m69131m(j2), C15104m.m65016m(j) * C15554d1.m69133o(j2));
    }

    @C8547h2
    /* renamed from: l */
    public static final long m69161l(long j, long j2) {
        return m69160k(j2, j);
    }
}
