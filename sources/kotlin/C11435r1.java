package kotlin;

import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.r1 */
public final class C11435r1 {
    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: a */
    public static final int[] m44066a(int i, C11300l<? super Integer, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "init");
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = lVar.invoke(Integer.valueOf(i2)).mo22930j2();
        }
        return C11431q1.m44054q(iArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: b */
    public static final int[] m44067b(int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "elements");
        return iArr;
    }
}
