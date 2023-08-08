package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.y */
public final class C8495y {

    /* renamed from: a */
    public static final int f22884a = 32;

    /* renamed from: b */
    public static final int f22885b = 5;

    /* renamed from: c */
    public static final int f22886c = 31;

    /* renamed from: d */
    public static final int f22887d = 2;

    /* renamed from: e */
    public static final int f22888e = 30;

    /* renamed from: f */
    public static final int m30775f(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* renamed from: g */
    public static final <K, V> Object[] m30776g(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[(objArr.length + 2)];
        C10956m.m41237l1(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C10956m.m41183c1(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    /* renamed from: h */
    public static final Object[] m30777h(Object[] objArr, int i) {
        Object[] objArr2 = new Object[(objArr.length - 2)];
        C10956m.m41237l1(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C10956m.m41183c1(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* renamed from: i */
    public static final Object[] m30778i(Object[] objArr, int i) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        C10956m.m41237l1(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C10956m.m41183c1(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    /* renamed from: j */
    public static final Object[] m30779j(Object[] objArr, int i, int i2, C8489u<?, ?> uVar) {
        int i3 = i2 - 2;
        Object[] objArr2 = new Object[((objArr.length - 2) + 1)];
        C10956m.m41237l1(objArr, objArr2, 0, 0, i, 6, (Object) null);
        C10956m.m41183c1(objArr, objArr2, i, i + 2, i2);
        objArr2[i3] = uVar;
        C10956m.m41183c1(objArr, objArr2, i3 + 1, i2, objArr.length);
        return objArr2;
    }

    /* renamed from: k */
    public static final <K, V> Object[] m30780k(Object[] objArr, int i, int i2, K k, V v) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        C10956m.m41183c1(copyOf, copyOf, i + 2, i + 1, objArr.length);
        C10956m.m41183c1(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = k;
        copyOf[i2 + 1] = v;
        return copyOf;
    }
}
