package androidx.compose.p004ui.geometry;

import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8547h2;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,225:1\n152#1:229\n25#2,3:226\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n166#1:229\n33#1:226,3\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.n */
public final class C15106n {
    @C8547h2
    /* renamed from: a */
    public static final long m65033a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return C15104m.m65009f((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    /* renamed from: b */
    public static final long m65034b(long j) {
        return C15096g.m64898a(C15104m.m65023t(j) / 2.0f, C15104m.m65016m(j) / 2.0f);
    }

    @C8547h2
    /* renamed from: c */
    public static /* synthetic */ void m65035c(long j) {
    }

    /* renamed from: d */
    public static final boolean m65036d(long j) {
        return j != C15104m.f37280b.mo42316a();
    }

    @C8547h2
    /* renamed from: e */
    public static /* synthetic */ void m65037e(long j) {
    }

    /* renamed from: f */
    public static final boolean m65038f(long j) {
        return j == C15104m.f37280b.mo42316a();
    }

    @C8547h2
    /* renamed from: g */
    public static /* synthetic */ void m65039g(long j) {
    }

    @C8547h2
    /* renamed from: h */
    public static final long m65040h(long j, long j2, float f) {
        return m65033a(C16515d.m74781a(C15104m.m65023t(j), C15104m.m65023t(j2), f), C16515d.m74781a(C15104m.m65016m(j), C15104m.m65016m(j2), f));
    }

    /* renamed from: i */
    public static final long m65041i(long j, @C12579k C11289a<C15104m> aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (j != C15104m.f37280b.mo42316a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        return aVar.invoke().mo42315y();
    }

    @C8547h2
    /* renamed from: j */
    public static final long m65042j(double d, long j) {
        return C15104m.m65026w(j, (float) d);
    }

    @C8547h2
    /* renamed from: k */
    public static final long m65043k(float f, long j) {
        return C15104m.m65026w(j, f);
    }

    @C8547h2
    /* renamed from: l */
    public static final long m65044l(int i, long j) {
        return C15104m.m65026w(j, (float) i);
    }

    @C8547h2
    @C12579k
    /* renamed from: m */
    public static final C15098i m65045m(long j) {
        return C15100j.m64956c(C15094f.f37256b.mo42248e(), j);
    }
}
