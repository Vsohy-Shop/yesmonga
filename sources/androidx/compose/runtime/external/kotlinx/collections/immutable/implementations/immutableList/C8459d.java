package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8450g;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8534e;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.C10956m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.d */
public final class C8459d<E> extends AbstractPersistentList<E> implements C8450g<E> {
    @C12579k

    /* renamed from: b */
    public final Object[] f22823b;
    @C12579k

    /* renamed from: c */
    public final Object[] f22824c;

    /* renamed from: d */
    public final int f22825d;

    /* renamed from: e */
    public final int f22826e;

    public C8459d(@C12579k Object[] objArr, @C12579k Object[] objArr2, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(objArr, C10108c.f27819v);
        Intrinsics.checkNotNullParameter(objArr2, "tail");
        this.f22823b = objArr;
        this.f22824c = objArr2;
        this.f22825d = i;
        this.f22826e = i2;
        boolean z2 = true;
        if (size() > 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8530a.m30952a(size() - C8466j.m30639d(size()) > C11479u.m44313B(objArr2.length, 32) ? false : z2);
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    /* renamed from: H */
    public final C8459d<E> mo15745H(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f22826e;
        if (size <= (1 << i)) {
            return new C8459d<>(mo15746M(objArr, i, objArr2), objArr3, size() + 1, this.f22826e);
        }
        Object[] c = C8466j.m30638c(objArr);
        int i2 = this.f22826e + 5;
        return new C8459d<>(mo15746M(c, i2, objArr2), objArr3, size() + 1, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r4 == null) goto L_0x0019;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] mo15746M(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + -1
            int r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C8466j.m30636a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L_0x0019
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
            if (r4 != 0) goto L_0x001b
        L_0x0019:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L_0x001b:
            r1 = 5
            if (r5 != r1) goto L_0x0021
            r4[r0] = r6
            goto L_0x002c
        L_0x0021:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.mo15746M(r2, r5, r6)
            r4[r0] = r5
        L_0x002c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C8459d.mo15746M(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    /* renamed from: Q */
    public final Object[] mo15747Q(Object[] objArr, int i, int i2, C8458c cVar) {
        Object[] objArr2;
        int a = C8466j.m30636a(i2, i);
        int i3 = 31;
        if (i == 0) {
            if (a == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(this, newSize)");
            }
            C10956m.m41183c1(objArr, objArr2, a, a + 1, 32);
            objArr2[31] = cVar.mo15743a();
            cVar.mo15744b(objArr[a]);
            return objArr2;
        }
        if (objArr[31] == null) {
            i3 = C8466j.m30636a(mo15749X() - 1, i);
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int i4 = i - 5;
        int i5 = a + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj = copyOf[i3];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf[i3] = mo15747Q((Object[]) obj, i4, 0, cVar);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj2 = copyOf[a];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[a] = mo15747Q((Object[]) obj2, i4, i2, cVar);
        return copyOf;
    }

    /* renamed from: W */
    public final C8450g<E> mo15748W(Object[] objArr, int i, int i2, int i3) {
        boolean z;
        int size = size() - i;
        if (i3 < size) {
            z = true;
        } else {
            z = false;
        }
        C8530a.m30952a(z);
        if (size == 1) {
            return mo15757y(objArr, i, i2);
        }
        Object[] copyOf = Arrays.copyOf(this.f22824c, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int i4 = size - 1;
        if (i3 < i4) {
            C10956m.m41183c1(this.f22824c, copyOf, i3, i3 + 1, size);
        }
        copyOf[i4] = null;
        return new C8459d(objArr, copyOf, (i + size) - 1, i2);
    }

    /* renamed from: X */
    public final int mo15749X() {
        return C8466j.m30639d(size());
    }

    @C12579k
    /* renamed from: Z0 */
    public C8450g<E> mo15661Z0(int i) {
        C8534e.m30960a(i, size());
        int X = mo15749X();
        if (i >= X) {
            return mo15748W(this.f22823b, X, this.f22826e, i - X);
        }
        return mo15748W(mo15747Q(this.f22823b, this.f22826e, i, new C8458c(this.f22824c[0])), X, this.f22826e, 0);
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f22825d;
    }

    /* renamed from: e0 */
    public final Object[] mo15750e0(Object[] objArr, int i, int i2, Object obj) {
        int a = C8466j.m30636a(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        if (i == 0) {
            copyOf[a] = obj;
        } else {
            Object obj2 = copyOf[a];
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[a] = mo15750e0((Object[]) obj2, i - 5, i2, obj);
        }
        return copyOf;
    }

    public E get(int i) {
        C8534e.m30960a(i, size());
        return mo15751h(i)[i & 31];
    }

    /* renamed from: h */
    public final Object[] mo15751h(int i) {
        if (mo15749X() <= i) {
            return this.f22824c;
        }
        Object[] objArr = this.f22823b;
        for (int i2 = this.f22826e; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[C8466j.m30636a(i, i2)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @C12579k
    /* renamed from: i */
    public PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.f22823b, this.f22824c, this.f22826e);
    }

    @C12579k
    public ListIterator<E> listIterator(int i) {
        C8534e.m30961b(i, size());
        return new C8460e(this.f22823b, this.f22824c, i, size(), (this.f22826e / 5) + 1);
    }

    /* renamed from: q */
    public final Object[] mo15754q(Object[] objArr, int i, int i2, Object obj, C8458c cVar) {
        Object[] objArr2;
        Object[] objArr3 = objArr;
        int i3 = i;
        int a = C8466j.m30636a(i2, i3);
        if (i3 == 0) {
            if (a == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr3, 32);
                Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(this, newSize)");
            }
            C10956m.m41183c1(objArr3, objArr2, a + 1, a, 31);
            cVar.mo15744b(objArr3[31]);
            objArr2[a] = obj;
            return objArr2;
        }
        C8458c cVar2 = cVar;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int i4 = i3 - 5;
        Object obj2 = objArr3[a];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        Intrinsics.checkNotNull(obj2, str);
        copyOf[a] = mo15754q((Object[]) obj2, i4, i2, obj, cVar);
        int i5 = a + 1;
        while (i5 < 32 && copyOf[i5] != null) {
            Object obj3 = objArr3[i5];
            Intrinsics.checkNotNull(obj3, str);
            Object[] objArr4 = copyOf;
            objArr4[i5] = mo15754q((Object[]) obj3, i4, 0, cVar.mo15743a(), cVar);
            i5++;
            copyOf = objArr4;
            str = str;
        }
        return copyOf;
    }

    /* renamed from: r */
    public final C8459d<E> mo15755r(Object[] objArr, int i, Object obj) {
        int size = size() - mo15749X();
        Object[] copyOf = Arrays.copyOf(this.f22824c, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            C10956m.m41183c1(this.f22824c, copyOf, i + 1, i, size);
            copyOf[i] = obj;
            return new C8459d<>(objArr, copyOf, size() + 1, this.f22826e);
        }
        Object[] objArr2 = this.f22824c;
        Object obj2 = objArr2[31];
        C10956m.m41183c1(objArr2, copyOf, i + 1, i, size - 1);
        copyOf[i] = obj;
        return mo15745H(objArr, copyOf, C8466j.m30638c(obj2));
    }

    @C12579k
    public C8450g<E> set(int i, E e) {
        C8534e.m30960a(i, size());
        if (mo15749X() > i) {
            return new C8459d(mo15750e0(this.f22823b, this.f22826e, i, e), this.f22824c, size(), this.f22826e);
        }
        Object[] copyOf = Arrays.copyOf(this.f22824c, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[i & 31] = e;
        return new C8459d(this.f22823b, copyOf, size(), this.f22826e);
    }

    /* renamed from: w */
    public final Object[] mo15756w(Object[] objArr, int i, int i2, C8458c cVar) {
        Object[] objArr2;
        int a = C8466j.m30636a(i2, i);
        if (i == 5) {
            cVar.mo15744b(objArr[a]);
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[a];
            Intrinsics.checkNotNull(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = mo15756w(objArr3, i - 5, i2, cVar);
        }
        if (objArr2 == null && a == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[a] = objArr2;
        return copyOf;
    }

    /* renamed from: y */
    public final C8450g<E> mo15757y(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
            }
            return new C8463h(objArr);
        }
        C8458c cVar = new C8458c((Object) null);
        Object[] w = mo15756w(objArr, i2, i - 1, cVar);
        Intrinsics.checkNotNull(w);
        Object a = cVar.mo15743a();
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a;
        if (w[1] != null) {
            return new C8459d(w, objArr2, i, i2);
        }
        Object obj = w[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new C8459d((Object[]) obj, objArr2, i, i2 - 5);
    }

    @C12579k
    /* renamed from: D */
    public C8450g<E> m30606D(@C12579k C11300l<? super E, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        PersistentVectorBuilder i = builder();
        i.mo15679B0(lVar);
        return i.mo15660g();
    }

    @C12579k
    public C8450g<E> add(E e) {
        int size = size() - mo15749X();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.f22824c, 32);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[size] = e;
            return new C8459d(this.f22823b, copyOf, size() + 1, this.f22826e);
        }
        return mo15745H(this.f22823b, this.f22824c, C8466j.m30638c(e));
    }

    @C12579k
    public C8450g<E> add(int i, E e) {
        C8534e.m30961b(i, size());
        if (i == size()) {
            return add((Object) e);
        }
        int X = mo15749X();
        if (i >= X) {
            return mo15755r(this.f22823b, i - X, e);
        }
        C8458c cVar = new C8458c((Object) null);
        return mo15755r(mo15754q(this.f22823b, this.f22826e, i, e, cVar), 0, cVar.mo15743a());
    }
}
