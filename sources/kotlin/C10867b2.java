package kotlin;

import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.b2 */
public final class C10867b2 {
    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: a */
    public static final short[] m38750a(int i, C11300l<? super Integer, C11679z1> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "init");
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = lVar.invoke(Integer.valueOf(i2)).mo23548e2();
        }
        return C10857a2.m38736q(sArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: b */
    public static final short[] m38751b(short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, "elements");
        return sArr;
    }
}
