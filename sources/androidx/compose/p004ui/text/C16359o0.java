package androidx.compose.p004ui.text;

import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,128:1\n48#2:129\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:129\n*E\n"})
/* renamed from: androidx.compose.ui.text.o0 */
public final class C16359o0 {
    /* renamed from: a */
    public static final long m73779a(int i) {
        return m73780b(i, i);
    }

    /* renamed from: b */
    public static final long m73780b(int i, int i2) {
        return C16356n0.m73731c(m73782d(i, i2));
    }

    /* renamed from: c */
    public static final long m73781c(long j, int i, int i2) {
        int I = C11479u.m44334I(C16356n0.m73742n(j), i, i2);
        int I2 = C11479u.m44334I(C16356n0.m73737i(j), i, i2);
        if (I == C16356n0.m73742n(j) && I2 == C16356n0.m73737i(j)) {
            return j;
        }
        return m73780b(I, I2);
    }

    /* renamed from: d */
    public static final long m73782d(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 < 0) {
                z2 = false;
            }
            if (z2) {
                return (((long) i2) & 4294967295L) | (((long) i) << 32);
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + C12361b.f30261l).toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + C12361b.f30261l).toString());
    }

    @C12579k
    /* renamed from: e */
    public static final String m73783e(@C12579k CharSequence charSequence, long j) {
        Intrinsics.checkNotNullParameter(charSequence, "$this$substring");
        return charSequence.subSequence(C16356n0.m73740l(j), C16356n0.m73739k(j)).toString();
    }
}
