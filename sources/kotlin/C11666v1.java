package kotlin;

import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.v1 */
public final class C11666v1 {
    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: a */
    public static final long[] m45769a(int i, C11300l<? super Integer, C11588t1> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "init");
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = lVar.invoke(Integer.valueOf(i2)).mo23301j2();
        }
        return C11662u1.m45760q(jArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: b */
    public static final long[] m45770b(long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "elements");
        return jArr;
    }
}
