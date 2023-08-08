package androidx.compose.p004ui.geometry;

import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8547h2;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n25#2,3:267\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n31#1:267,3\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.g */
public final class C15096g {
    @C8547h2
    /* renamed from: a */
    public static final long m64898a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return C15094f.m64871g((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    /* renamed from: b */
    public static final boolean m64899b(long j) {
        float p = C15094f.m64880p(j);
        if (!Float.isInfinite(p) && !Float.isNaN(p)) {
            float r = C15094f.m64882r(j);
            if (!Float.isInfinite(r) && !Float.isNaN(r)) {
                return true;
            }
        }
        return false;
    }

    @C8547h2
    /* renamed from: c */
    public static /* synthetic */ void m64900c(long j) {
    }

    /* renamed from: d */
    public static final boolean m64901d(long j) {
        return j != C15094f.f37256b.mo42247c();
    }

    @C8547h2
    /* renamed from: e */
    public static /* synthetic */ void m64902e(long j) {
    }

    /* renamed from: f */
    public static final boolean m64903f(long j) {
        return j == C15094f.f37256b.mo42247c();
    }

    @C8547h2
    /* renamed from: g */
    public static /* synthetic */ void m64904g(long j) {
    }

    @C8547h2
    /* renamed from: h */
    public static final long m64905h(long j, long j2, float f) {
        return m64898a(C16515d.m74781a(C15094f.m64880p(j), C15094f.m64880p(j2), f), C16515d.m74781a(C15094f.m64882r(j), C15094f.m64882r(j2), f));
    }

    /* renamed from: i */
    public static final long m64906i(long j, @C12579k C11289a<C15094f> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (m64901d(j)) {
            return j;
        }
        return aVar.invoke().mo42242A();
    }
}
