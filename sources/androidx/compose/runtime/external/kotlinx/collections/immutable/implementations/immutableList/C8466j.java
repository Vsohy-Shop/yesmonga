package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8450g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.j */
public final class C8466j {

    /* renamed from: a */
    public static final int f22840a = 32;

    /* renamed from: b */
    public static final int f22841b = 5;

    /* renamed from: c */
    public static final int f22842c = 31;

    /* renamed from: d */
    public static final int f22843d = 33;

    /* renamed from: a */
    public static final int m30636a(int i, int i2) {
        return (i >> i2) & 31;
    }

    @C12579k
    /* renamed from: b */
    public static final <E> C8450g<E> m30637b() {
        return C8463h.f22834c.mo15768a();
    }

    @C12579k
    /* renamed from: c */
    public static final Object[] m30638c(@C12580l Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    /* renamed from: d */
    public static final int m30639d(int i) {
        return (i - 1) & -32;
    }
}
