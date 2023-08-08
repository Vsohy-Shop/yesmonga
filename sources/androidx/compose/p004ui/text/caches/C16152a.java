package androidx.compose.p004ui.text.caches;

import kotlin.jvm.C11287e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.caches.a */
public final class C16152a {
    @C12579k
    @C11287e

    /* renamed from: a */
    public static final int[] f40153a = new int[0];
    @C12579k
    @C11287e

    /* renamed from: b */
    public static final Object[] f40154b = new Object[0];

    /* renamed from: a */
    public static final int m72680a(@C12579k int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
