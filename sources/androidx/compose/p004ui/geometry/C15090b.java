package androidx.compose.p004ui.geometry;

import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n25#2,3:165\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n33#1:165,3\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.b */
public final class C15090b {
    @C8547h2
    /* renamed from: a */
    public static final long m64845a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return C15088a.m64825e((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }

    /* renamed from: b */
    public static /* synthetic */ long m64846b(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return m64845a(f, f2);
    }

    @C8547h2
    /* renamed from: c */
    public static final long m64847c(long j, long j2, float f) {
        return m64845a(C16515d.m74781a(C15088a.m64833m(j), C15088a.m64833m(j2), f), C16515d.m74781a(C15088a.m64835o(j), C15088a.m64835o(j2), f));
    }
}
