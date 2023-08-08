package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8450g;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8534e;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8535f;
import androidx.vectordrawable.graphics.drawable.C20729i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.C10928d;
import kotlin.collections.C10956m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11333h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,992:1\n26#2:993\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n623#1:993\n*E\n"})
public final class PersistentVectorBuilder<E> extends C10928d<E> implements C8450g.C8451a<E> {
    @C12579k

    /* renamed from: a */
    public C8450g<? extends E> f22811a;
    @C12580l

    /* renamed from: b */
    public Object[] f22812b;
    @C12579k

    /* renamed from: c */
    public Object[] f22813c;

    /* renamed from: d */
    public int f22814d;
    @C12579k

    /* renamed from: e */
    public C8535f f22815e = new C8535f();
    @C12580l

    /* renamed from: f */
    public Object[] f22816f = this.f22812b;
    @C12579k

    /* renamed from: g */
    public Object[] f22817g = this.f22813c;

    /* renamed from: v */
    public int f22818v = this.f22811a.size();

    public PersistentVectorBuilder(@C12579k C8450g<? extends E> gVar, @C12580l Object[] objArr, @C12579k Object[] objArr2, int i) {
        Intrinsics.checkNotNullParameter(gVar, C20729i.f53485E0);
        Intrinsics.checkNotNullParameter(objArr2, "vectorTail");
        this.f22811a = gVar;
        this.f22812b = objArr;
        this.f22813c = objArr2;
        this.f22814d = i;
    }

    /* renamed from: A0 */
    public final int mo15678A0(C11300l<? super E, Boolean> lVar, int i, C8458c cVar) {
        boolean z;
        int y0 = mo15725y0(lVar, this.f22817g, i, cVar);
        if (y0 == i) {
            if (cVar.mo15743a() == this.f22817g) {
                z = true;
            } else {
                z = false;
            }
            C8530a.m30952a(z);
            return i;
        }
        Object a = cVar.mo15743a();
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a;
        C10956m.m41251n2(objArr, null, y0, i);
        this.f22817g = objArr;
        this.f22818v = size() - (i - y0);
        return y0;
    }

    /* renamed from: B0 */
    public final boolean mo15679B0(@C12579k C11300l<? super E, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        boolean z0 = mo15726z0(lVar);
        if (z0) {
            this.modCount++;
        }
        return z0;
    }

    /* renamed from: C0 */
    public final Object[] mo15680C0(Object[] objArr, int i, int i2, C8458c cVar) {
        int a = C8466j.m30636a(i2, i);
        int i3 = 31;
        if (i == 0) {
            Object obj = objArr[a];
            Object[] c1 = C10956m.m41183c1(objArr, mo15701f0(objArr), a, a + 1, 32);
            c1[31] = cVar.mo15743a();
            cVar.mo15744b(obj);
            return c1;
        }
        if (objArr[31] == null) {
            i3 = C8466j.m30636a(mo15684H0() - 1, i);
        }
        Object[] f0 = mo15701f0(objArr);
        int i4 = i - 5;
        int i5 = a + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj2 = f0[i3];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                f0[i3] = mo15680C0((Object[]) obj2, i4, 0, cVar);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj3 = f0[a];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        f0[a] = mo15680C0((Object[]) obj3, i4, i2, cVar);
        return f0;
    }

    /* renamed from: F0 */
    public final Object mo15681F0(Object[] objArr, int i, int i2, int i3) {
        boolean z;
        int size = size() - i;
        if (i3 < size) {
            z = true;
        } else {
            z = false;
        }
        C8530a.m30952a(z);
        if (size == 1) {
            Object obj = this.f22817g[0];
            mo15715r0(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.f22817g;
        Object obj2 = objArr2[i3];
        Object[] c1 = C10956m.m41183c1(objArr2, mo15701f0(objArr2), i3, i3 + 1, size);
        c1[size - 1] = null;
        this.f22816f = objArr;
        this.f22817g = c1;
        this.f22818v = (i + size) - 1;
        this.f22814d = i2;
        return obj2;
    }

    /* renamed from: G0 */
    public final Object[] mo15682G0(Object[] objArr, int i) {
        boolean z;
        if ((i & 31) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i == 0) {
            this.f22814d = 0;
            return null;
        } else {
            int i2 = i - 1;
            while (true) {
                int i3 = this.f22814d;
                if ((i2 >> i3) != 0) {
                    return mo15711o0(objArr, i2, i3);
                }
                this.f22814d = i3 - 5;
                Object[] objArr2 = objArr[0];
                Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = objArr2;
            }
        }
    }

    @C12579k
    /* renamed from: H */
    public final Object[] mo15683H() {
        return this.f22817g;
    }

    /* renamed from: H0 */
    public final int mo15684H0() {
        if (size() <= 32) {
            return 0;
        }
        return C8466j.m30639d(size());
    }

    /* renamed from: I0 */
    public final Object[] mo15685I0(Object[] objArr, int i, int i2, E e, C8458c cVar) {
        int a = C8466j.m30636a(i2, i);
        Object[] f0 = mo15701f0(objArr);
        if (i == 0) {
            if (f0 != objArr) {
                this.modCount++;
            }
            cVar.mo15744b(f0[a]);
            f0[a] = e;
            return f0;
        }
        Object obj = f0[a];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        f0[a] = mo15685I0((Object[]) obj, i - 5, i2, e, cVar);
        return f0;
    }

    /* renamed from: J0 */
    public final void mo15686J0(int i) {
        this.f22814d = i;
    }

    /* renamed from: K0 */
    public final Object[] mo15687K0(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f22816f != null) {
            ListIterator<Object[]> e0 = mo15700e0(mo15684H0() >> 5);
            while (e0.previousIndex() != i) {
                Object[] previous = e0.previous();
                C10956m.m41183c1(previous, objArr2, 0, 32 - i2, 32);
                objArr2 = mo15706l0(previous, i2);
                i3--;
                objArr[i3] = objArr2;
            }
            return e0.previous();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: L0 */
    public final void mo15688L0(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        boolean z;
        Object[] objArr4;
        if (i3 >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] f0 = mo15701f0(objArr);
            objArr2[0] = f0;
            int i4 = i & 31;
            int size = ((i + collection.size()) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                C10956m.m41183c1(f0, objArr3, size + 1, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    objArr4 = f0;
                } else {
                    objArr4 = mo15709m0();
                    i3--;
                    objArr2[i3] = objArr4;
                }
                int i7 = i2 - i6;
                C10956m.m41183c1(f0, objArr3, 0, i7, i2);
                C10956m.m41183c1(f0, objArr4, size + 1, i4, i7);
                objArr3 = objArr4;
            }
            Iterator<? extends E> it = collection.iterator();
            mo15713q(f0, i4, it);
            for (int i8 = 1; i8 < i3; i8++) {
                objArr2[i8] = mo15713q(mo15709m0(), 0, it);
            }
            mo15713q(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: M */
    public final void mo15689M(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f22816f != null) {
            int i4 = i >> 5;
            Object[] K0 = mo15687K0(i4, i2, objArr, i3, objArr2);
            int H0 = i3 - (((mo15684H0() >> 5) - 1) - i4);
            if (H0 < i3) {
                objArr2 = objArr[H0];
                Intrinsics.checkNotNull(objArr2);
            }
            mo15688L0(collection, i, K0, 32, objArr, H0, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: M0 */
    public final int mo15690M0() {
        return mo15691N0(size());
    }

    /* renamed from: N0 */
    public final int mo15691N0(int i) {
        return i <= 32 ? i : i - C8466j.m30639d(i);
    }

    /* renamed from: Q */
    public final Object[] mo15692Q(Object[] objArr, int i, int i2, Object obj, C8458c cVar) {
        Object obj2;
        int a = C8466j.m30636a(i2, i);
        if (i == 0) {
            cVar.mo15744b(objArr[31]);
            Object[] c1 = C10956m.m41183c1(objArr, mo15701f0(objArr), a + 1, a, 31);
            c1[a] = obj;
            return c1;
        }
        Object[] f0 = mo15701f0(objArr);
        int i3 = i - 5;
        Object obj3 = f0[a];
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        f0[a] = mo15692Q((Object[]) obj3, i3, i2, obj, cVar);
        while (true) {
            a++;
            if (a >= 32 || (obj2 = f0[a]) == null) {
                return f0;
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            f0[a] = mo15692Q((Object[]) obj2, i3, 0, cVar.mo15743a(), cVar);
        }
        return f0;
    }

    /* renamed from: W */
    public final void mo15693W(Object[] objArr, int i, E e) {
        int M0 = mo15690M0();
        Object[] f0 = mo15701f0(this.f22817g);
        if (M0 < 32) {
            C10956m.m41183c1(this.f22817g, f0, i + 1, i, M0);
            f0[i] = e;
            this.f22816f = objArr;
            this.f22817g = f0;
            this.f22818v = size() + 1;
            return;
        }
        Object[] objArr2 = this.f22817g;
        Object obj = objArr2[31];
        C10956m.m41183c1(objArr2, f0, i + 1, i, 31);
        f0[i] = e;
        mo15720u0(objArr, f0, mo15710n0(obj));
    }

    /* renamed from: X */
    public final boolean mo15694X(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f22815e;
    }

    public boolean add(E e) {
        this.modCount++;
        int M0 = mo15690M0();
        if (M0 < 32) {
            Object[] f0 = mo15701f0(this.f22817g);
            f0[M0] = e;
            this.f22817g = f0;
            this.f22818v = size() + 1;
        } else {
            mo15720u0(this.f22816f, this.f22817g, mo15710n0(e));
        }
        return true;
    }

    public boolean addAll(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int M0 = mo15690M0();
        Iterator<? extends E> it = collection.iterator();
        if (32 - M0 >= collection.size()) {
            this.f22817g = mo15713q(mo15701f0(this.f22817g), M0, it);
            this.f22818v = size() + collection.size();
        } else {
            int size = ((collection.size() + M0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = mo15713q(mo15701f0(this.f22817g), M0, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = mo15713q(mo15709m0(), 0, it);
            }
            this.f22816f = mo15719t0(this.f22816f, mo15684H0(), objArr);
            this.f22817g = mo15713q(mo15709m0(), 0, it);
            this.f22818v = size() + collection.size();
        }
        return true;
    }

    /* renamed from: e */
    public int mo15699e() {
        return this.f22818v;
    }

    /* renamed from: e0 */
    public final ListIterator<Object[]> mo15700e0(int i) {
        if (this.f22816f != null) {
            int H0 = mo15684H0() >> 5;
            C8534e.m30961b(i, H0);
            int i2 = this.f22814d;
            if (i2 == 0) {
                Object[] objArr = this.f22816f;
                Intrinsics.checkNotNull(objArr);
                return new C8462g(objArr, i);
            }
            Object[] objArr2 = this.f22816f;
            Intrinsics.checkNotNull(objArr2);
            return new C8465i(objArr2, i, H0, i2 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: f0 */
    public final Object[] mo15701f0(Object[] objArr) {
        if (objArr == null) {
            return mo15709m0();
        }
        if (mo15694X(objArr)) {
            return objArr;
        }
        return C10956m.m41237l1(objArr, mo15709m0(), 0, 0, C11479u.m44313B(objArr.length, 32), 6, (Object) null);
    }

    public E get(int i) {
        C8534e.m30960a(i, size());
        return mo15704i(i)[i & 31];
    }

    /* renamed from: h */
    public E mo15703h(int i) {
        C8534e.m30960a(i, size());
        this.modCount++;
        int H0 = mo15684H0();
        if (i >= H0) {
            return mo15681F0(this.f22816f, H0, this.f22814d, i - H0);
        }
        C8458c cVar = new C8458c(this.f22817g[0]);
        Object[] objArr = this.f22816f;
        Intrinsics.checkNotNull(objArr);
        mo15681F0(mo15680C0(objArr, this.f22814d, i, cVar), H0, this.f22814d, 0);
        return cVar.mo15743a();
    }

    /* renamed from: i */
    public final Object[] mo15704i(int i) {
        if (mo15684H0() <= i) {
            return this.f22817g;
        }
        Object[] objArr = this.f22816f;
        Intrinsics.checkNotNull(objArr);
        for (int i2 = this.f22814d; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[C8466j.m30636a(i, i2)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @C12579k
    public Iterator<E> iterator() {
        return listIterator();
    }

    /* renamed from: l0 */
    public final Object[] mo15706l0(Object[] objArr, int i) {
        if (mo15694X(objArr)) {
            return C10956m.m41183c1(objArr, objArr, i, 0, 32 - i);
        }
        return C10956m.m41183c1(objArr, mo15709m0(), i, 0, 32 - i);
    }

    @C12579k
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: m0 */
    public final Object[] mo15709m0() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f22815e;
        return objArr;
    }

    /* renamed from: n0 */
    public final Object[] mo15710n0(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f22815e;
        return objArr;
    }

    /* renamed from: o0 */
    public final Object[] mo15711o0(Object[] objArr, int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i2 == 0) {
            return objArr;
        } else {
            int a = C8466j.m30636a(i, i2);
            Object[] objArr2 = objArr[a];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object o0 = mo15711o0(objArr2, i, i2 - 5);
            if (a < 31) {
                int i3 = a + 1;
                if (objArr[i3] != null) {
                    if (mo15694X(objArr)) {
                        C10956m.m41251n2(objArr, null, i3, 32);
                    }
                    objArr = C10956m.m41183c1(objArr, mo15709m0(), 0, 0, i3);
                }
            }
            if (o0 == objArr[a]) {
                return objArr;
            }
            Object[] f0 = mo15701f0(objArr);
            f0[a] = o0;
            return f0;
        }
    }

    /* renamed from: p0 */
    public final Object[] mo15712p0(Object[] objArr, int i, int i2, C8458c cVar) {
        Object[] objArr2;
        int a = C8466j.m30636a(i2 - 1, i);
        if (i == 5) {
            cVar.mo15744b(objArr[a]);
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[a];
            Intrinsics.checkNotNull(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = mo15712p0(objArr3, i - 5, i2, cVar);
        }
        if (objArr2 == null && a == 0) {
            return null;
        }
        Object[] f0 = mo15701f0(objArr);
        f0[a] = objArr2;
        return f0;
    }

    /* renamed from: q */
    public final Object[] mo15713q(Object[] objArr, int i, Iterator<? extends Object> it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    /* renamed from: r */
    public final int mo15714r() {
        return this.modCount;
    }

    /* renamed from: r0 */
    public final void mo15715r0(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f22816f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f22817g = objArr;
            this.f22818v = i;
            this.f22814d = i2;
            return;
        }
        C8458c cVar = new C8458c((Object) null);
        Intrinsics.checkNotNull(objArr);
        Object[] p0 = mo15712p0(objArr, i2, i, cVar);
        Intrinsics.checkNotNull(p0);
        Object a = cVar.mo15743a();
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f22817g = (Object[]) a;
        this.f22818v = i;
        if (p0[1] == null) {
            this.f22816f = (Object[]) p0[0];
            this.f22814d = i2 - 5;
            return;
        }
        this.f22816f = p0;
        this.f22814d = i2;
    }

    public boolean removeAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return mo15679B0(new PersistentVectorBuilder$removeAll$1(collection));
    }

    /* renamed from: s0 */
    public final Object[] mo15717s0(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        boolean z;
        if (it.hasNext()) {
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (i2 == 0) {
                return it.next();
            } else {
                Object[] f0 = mo15701f0(objArr);
                int a = C8466j.m30636a(i, i2);
                int i3 = i2 - 5;
                f0[a] = mo15717s0((Object[]) f0[a], i, i3, it);
                while (true) {
                    a++;
                    if (a >= 32 || !it.hasNext()) {
                        return f0;
                    }
                    f0[a] = mo15717s0((Object[]) f0[a], 0, i3, it);
                }
                return f0;
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public E set(int i, E e) {
        C8534e.m30960a(i, size());
        if (mo15684H0() <= i) {
            E[] f0 = mo15701f0(this.f22817g);
            if (f0 != this.f22817g) {
                this.modCount++;
            }
            int i2 = i & 31;
            E e2 = f0[i2];
            f0[i2] = e;
            this.f22817g = f0;
            return e2;
        }
        C8458c cVar = new C8458c((Object) null);
        Object[] objArr = this.f22816f;
        Intrinsics.checkNotNull(objArr);
        this.f22816f = mo15685I0(objArr, this.f22814d, i, e, cVar);
        return cVar.mo15743a();
    }

    /* renamed from: t0 */
    public final Object[] mo15719t0(Object[] objArr, int i, Object[][] objArr2) {
        Object[] objArr3;
        Iterator a = C11333h.m43500a(objArr2);
        int i2 = i >> 5;
        int i3 = this.f22814d;
        if (i2 < (1 << i3)) {
            objArr3 = mo15717s0(objArr, i, i3, a);
        } else {
            objArr3 = mo15701f0(objArr);
        }
        while (a.hasNext()) {
            this.f22814d += 5;
            objArr3 = mo15710n0(objArr3);
            int i4 = this.f22814d;
            mo15717s0(objArr3, 1 << i4, i4, a);
        }
        return objArr3;
    }

    /* renamed from: u0 */
    public final void mo15720u0(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f22814d;
        if (size > (1 << i)) {
            this.f22816f = mo15721v0(mo15710n0(objArr), objArr2, this.f22814d + 5);
            this.f22817g = objArr3;
            this.f22814d += 5;
            this.f22818v = size() + 1;
        } else if (objArr == null) {
            this.f22816f = objArr2;
            this.f22817g = objArr3;
            this.f22818v = size() + 1;
        } else {
            this.f22816f = mo15721v0(objArr, objArr2, i);
            this.f22817g = objArr3;
            this.f22818v = size() + 1;
        }
    }

    /* renamed from: v0 */
    public final Object[] mo15721v0(Object[] objArr, Object[] objArr2, int i) {
        int a = C8466j.m30636a(size() - 1, i);
        Object[] f0 = mo15701f0(objArr);
        if (i == 5) {
            f0[a] = objArr2;
        } else {
            f0[a] = mo15721v0((Object[]) f0[a], objArr2, i - 5);
        }
        return f0;
    }

    @C12580l
    /* renamed from: w */
    public final Object[] mo15722w() {
        return this.f22816f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo15723w0(kotlin.jvm.functions.C11300l<? super E, java.lang.Boolean> r7, java.lang.Object[] r8, int r9, int r10, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C8458c r11, java.util.List<java.lang.Object[]> r12, java.util.List<java.lang.Object[]> r13) {
        /*
            r6 = this;
            boolean r0 = r6.mo15694X(r8)
            if (r0 == 0) goto L_0x0009
            r12.add(r8)
        L_0x0009:
            java.lang.Object r0 = r11.mo15743a()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0017:
            if (r2 >= r9) goto L_0x0051
            r4 = r8[r2]
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x004e
            r5 = 32
            if (r10 != r5) goto L_0x0049
            r10 = r12
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ 1
            if (r10 == 0) goto L_0x0043
            int r10 = r12.size()
            int r10 = r10 + -1
            java.lang.Object r10 = r12.remove(r10)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            goto L_0x0047
        L_0x0043:
            java.lang.Object[] r10 = r6.mo15709m0()
        L_0x0047:
            r3 = r10
            r10 = r1
        L_0x0049:
            int r5 = r10 + 1
            r3[r10] = r4
            r10 = r5
        L_0x004e:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0051:
            r11.mo15744b(r3)
            java.lang.Object r7 = r11.mo15743a()
            if (r0 == r7) goto L_0x005d
            r13.add(r0)
        L_0x005d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.mo15723w0(kotlin.jvm.functions.l, java.lang.Object[], int, int, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c, java.util.List, java.util.List):int");
    }

    /* renamed from: y */
    public final int mo15724y() {
        return this.f22814d;
    }

    /* renamed from: y0 */
    public final int mo15725y0(C11300l<? super E, Boolean> lVar, Object[] objArr, int i, C8458c cVar) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z) {
                    objArr2 = mo15701f0(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        cVar.mo15744b(objArr2);
        return i2;
    }

    /* renamed from: z0 */
    public final boolean mo15726z0(C11300l<? super E, Boolean> lVar) {
        Object[] objArr;
        C11300l<? super E, Boolean> lVar2 = lVar;
        int M0 = mo15690M0();
        C8458c cVar = new C8458c((Object) null);
        if (this.f22816f != null) {
            ListIterator<Object[]> e0 = mo15700e0(0);
            int i = 32;
            while (i == 32 && e0.hasNext()) {
                i = mo15725y0(lVar2, e0.next(), 32, cVar);
            }
            if (i == 32) {
                C8530a.m30952a(!e0.hasNext());
                int A0 = mo15678A0(lVar2, M0, cVar);
                if (A0 == 0) {
                    mo15715r0(this.f22816f, size(), this.f22814d);
                }
                if (A0 != M0) {
                    return true;
                }
                return false;
            }
            int previousIndex = e0.previousIndex() << 5;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = i;
            while (e0.hasNext()) {
                i2 = mo15723w0(lVar, e0.next(), 32, i2, cVar, arrayList2, arrayList);
                previousIndex = previousIndex;
            }
            int i3 = previousIndex;
            int w0 = mo15723w0(lVar, this.f22817g, M0, i2, cVar, arrayList2, arrayList);
            Object a = cVar.mo15743a();
            Intrinsics.checkNotNull(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) a;
            C10956m.m41251n2(objArr2, null, w0, 32);
            if (arrayList.isEmpty()) {
                objArr = this.f22816f;
                Intrinsics.checkNotNull(objArr);
            } else {
                objArr = mo15717s0(this.f22816f, i3, this.f22814d, arrayList.iterator());
            }
            int size = i3 + (arrayList.size() << 5);
            this.f22816f = mo15682G0(objArr, size);
            this.f22817g = objArr2;
            this.f22818v = size + w0;
            return true;
        } else if (mo15678A0(lVar2, M0, cVar) != M0) {
            return true;
        } else {
            return false;
        }
    }

    @C12579k
    /* renamed from: g */
    public C8450g<E> m30576g() {
        C8450g<? extends E> gVar;
        if (this.f22816f == this.f22812b && this.f22817g == this.f22813c) {
            gVar = this.f22811a;
        } else {
            this.f22815e = new C8535f();
            Object[] objArr = this.f22816f;
            this.f22812b = objArr;
            Object[] objArr2 = this.f22817g;
            this.f22813c = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    gVar = C8466j.m30637b();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.f22817g, size());
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    gVar = new C8463h<>(copyOf);
                }
            } else {
                Object[] objArr3 = this.f22816f;
                Intrinsics.checkNotNull(objArr3);
                gVar = new C8459d<>(objArr3, this.f22817g, size(), this.f22814d);
            }
        }
        this.f22811a = gVar;
        return gVar;
    }

    @C12579k
    public ListIterator<E> listIterator(int i) {
        C8534e.m30961b(i, size());
        return new C8461f(this, i);
    }

    public void add(int i, E e) {
        C8534e.m30961b(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        this.modCount++;
        int H0 = mo15684H0();
        if (i >= H0) {
            mo15693W(this.f22816f, i - H0, e);
            return;
        }
        C8458c cVar = new C8458c((Object) null);
        Object[] objArr = this.f22816f;
        Intrinsics.checkNotNull(objArr);
        mo15693W(mo15692Q(objArr, this.f22814d, i, e, cVar), 0, cVar.mo15743a());
    }

    public boolean addAll(int i, @C12579k Collection<? extends E> collection) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(collection, "elements");
        C8534e.m30961b(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            if (i >= mo15684H0()) {
                z = true;
            }
            C8530a.m30952a(z);
            int i3 = i & 31;
            Object[] objArr2 = this.f22817g;
            Object[] c1 = C10956m.m41183c1(objArr2, mo15701f0(objArr2), (((i + collection.size()) - 1) & 31) + 1, i3, mo15690M0());
            mo15713q(c1, i3, collection.iterator());
            this.f22817g = c1;
            this.f22818v = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int M0 = mo15690M0();
        int N0 = mo15691N0(size() + collection.size());
        if (i >= mo15684H0()) {
            objArr = mo15709m0();
            mo15688L0(collection, i, this.f22817g, M0, objArr3, size, objArr);
        } else if (N0 > M0) {
            int i4 = N0 - M0;
            objArr = mo15706l0(this.f22817g, i4);
            mo15689M(collection, i, i4, objArr3, size, objArr);
        } else {
            int i5 = M0 - N0;
            objArr = C10956m.m41183c1(this.f22817g, mo15709m0(), 0, i5, M0);
            int i6 = 32 - i5;
            Object[] l0 = mo15706l0(this.f22817g, i6);
            int i7 = size - 1;
            objArr3[i7] = l0;
            mo15689M(collection, i, i6, objArr3, i7, l0);
        }
        this.f22816f = mo15719t0(this.f22816f, i2, objArr3);
        this.f22817g = objArr;
        this.f22818v = size() + collection.size();
        return true;
    }
}
