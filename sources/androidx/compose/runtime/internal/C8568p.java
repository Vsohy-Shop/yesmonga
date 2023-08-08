package androidx.compose.runtime.internal;

import androidx.lifecycle.C19456p0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nThreadMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,111:1\n12904#2,3:112\n*S KotlinDebug\n*F\n+ 1 ThreadMap.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n42#1:112,3\n*E\n"})
/* renamed from: androidx.compose.runtime.internal.p */
public final class C8568p {

    /* renamed from: a */
    public final int f22998a;
    @C12579k

    /* renamed from: b */
    public final long[] f22999b;
    @C12579k

    /* renamed from: c */
    public final Object[] f23000c;

    public C8568p(int i, @C12579k long[] jArr, @C12579k Object[] objArr) {
        Intrinsics.checkNotNullParameter(jArr, "keys");
        Intrinsics.checkNotNullParameter(objArr, C19456p0.f49833g);
        this.f22998a = i;
        this.f22999b = jArr;
        this.f23000c = objArr;
    }

    /* renamed from: a */
    public final int mo16219a(long j) {
        int i = this.f22998a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i != 0) {
            while (i2 <= i) {
                int i3 = (i2 + i) >>> 1;
                int i4 = ((this.f22999b[i3] - j) > 0 ? 1 : ((this.f22999b[i3] - j) == 0 ? 0 : -1));
                if (i4 < 0) {
                    i2 = i3 + 1;
                } else if (i4 <= 0) {
                    return i3;
                } else {
                    i = i3 - 1;
                }
            }
            return -(i2 + 1);
        }
        long j2 = this.f22999b[0];
        if (j2 == j) {
            return 0;
        }
        if (j2 > j) {
            return -2;
        }
        return -1;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo16220b(long j) {
        int a = mo16219a(j);
        if (a >= 0) {
            return this.f23000c[a];
        }
        return null;
    }

    @C12579k
    /* renamed from: c */
    public final C8568p mo16221c(long j, @C12580l Object obj) {
        int i = this.f22998a;
        Object[] objArr = this.f23000c;
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= length) {
                break;
            }
            if (objArr[i3] == null) {
                z = false;
            }
            if (z) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (true) {
                if (i2 >= i5 || i6 >= i) {
                    break;
                }
                long j2 = this.f22999b[i6];
                Object obj2 = this.f23000c[i6];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j2;
                    objArr2[i2] = obj2;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                int i7 = i5 - 1;
                jArr[i7] = j;
                objArr2[i7] = obj;
            } else {
                while (i2 < i5) {
                    long j3 = this.f22999b[i6];
                    Object obj3 = this.f23000c[i6];
                    if (obj3 != null) {
                        jArr[i2] = j3;
                        objArr2[i2] = obj3;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = j;
            objArr2[0] = obj;
        }
        return new C8568p(i5, jArr, objArr2);
    }

    /* renamed from: d */
    public final boolean mo16222d(long j, @C12580l Object obj) {
        int a = mo16219a(j);
        if (a < 0) {
            return false;
        }
        this.f23000c[a] = obj;
        return true;
    }
}
