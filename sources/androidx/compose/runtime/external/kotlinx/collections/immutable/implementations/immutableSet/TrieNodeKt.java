package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import kotlin.collections.C10956m;
import kotlin.jvm.functions.C11300l;

public final class TrieNodeKt {

    /* renamed from: a */
    public static final int f22890a = 32;

    /* renamed from: b */
    public static final int f22891b = 5;

    /* renamed from: c */
    public static final int f22892c = 31;

    /* renamed from: d */
    public static final int f22893d = 30;

    /* renamed from: c */
    public static final <E> Object[] m30784c(Object[] objArr, int i, E e) {
        Object[] objArr2 = new Object[(objArr.length + 1)];
        C10956m.m41237l1(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C10956m.m41183c1(objArr, objArr2, i + 1, i, objArr.length);
        objArr2[i] = e;
        return objArr2;
    }

    /* renamed from: d */
    public static final int m30785d(Object[] objArr, Object[] objArr2, int i, C11300l<Object, Boolean> lVar) {
        boolean z;
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            boolean z2 = true;
            if (i2 <= i3) {
                z = true;
            } else {
                z = false;
            }
            C8530a.m30952a(z);
            if (lVar.invoke(objArr[i3]).booleanValue()) {
                objArr2[i + i2] = objArr[i3];
                i2++;
                if (i + i2 > objArr2.length) {
                    z2 = false;
                }
                C8530a.m30952a(z2);
            }
        }
        return i2;
    }

    /* renamed from: e */
    public static /* synthetic */ int m30786e(Object[] objArr, Object[] objArr2, int i, C11300l lVar, int i2, Object obj) {
        boolean z;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            lVar = TrieNodeKt$filterTo$1.f22894f;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < objArr.length; i4++) {
            boolean z2 = true;
            if (i3 <= i4) {
                z = true;
            } else {
                z = false;
            }
            C8530a.m30952a(z);
            if (((Boolean) lVar.invoke(objArr[i4])).booleanValue()) {
                objArr2[i + i3] = objArr[i4];
                i3++;
                if (i + i3 > objArr2.length) {
                    z2 = false;
                }
                C8530a.m30952a(z2);
            }
        }
        return i3;
    }

    /* renamed from: f */
    public static final int m30787f(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* renamed from: g */
    public static final Object[] m30788g(Object[] objArr, int i) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        C10956m.m41237l1(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C10956m.m41183c1(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
