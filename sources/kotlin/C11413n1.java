package kotlin;

import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.n1 */
public final class C11413n1 {
    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: a */
    public static final byte[] m43940a(int i, C11300l<? super Integer, C11400l1> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "init");
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = lVar.invoke(Integer.valueOf(i2)).mo22897e2();
        }
        return C11404m1.m43818q(bArr);
    }

    @C11531s
    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: b */
    public static final byte[] m43941b(byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "elements");
        return bArr;
    }
}
