package kotlin.collections;

import com.usabilla.sdk.ubform.net.parser.C9874a;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C11079d2;
import kotlin.C11097g2;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.4")
@C11097g2(markerClass = {C11429q.class})
@C11363r0({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,583:1\n467#1,51:586\n467#1,51:637\n37#2,2:584\n26#3:688\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:586,51\n464#1:637,51\n47#1:584,2\n562#1:688\n*E\n"})
/* renamed from: kotlin.collections.i */
public final class C10944i<E> extends C10928d<E> {
    @C12579k

    /* renamed from: d */
    public static final C10945a f28171d = new C10945a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final Object[] f28172e = new Object[0];

    /* renamed from: f */
    public static final int f28173f = 2147483639;

    /* renamed from: g */
    public static final int f28174g = 10;

    /* renamed from: a */
    public int f28175a;
    @C12579k

    /* renamed from: b */
    public Object[] f28176b;

    /* renamed from: c */
    public int f28177c;

    /* renamed from: kotlin.collections.i$a */
    public static final class C10945a {
        public /* synthetic */ C10945a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo22321a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }

        public C10945a() {
        }
    }

    public C10944i(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f28172e;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.f28176b = objArr;
    }

    /* renamed from: H */
    public final void mo22284H(int i) {
        if (i >= 0) {
            Object[] objArr = this.f28176b;
            if (i > objArr.length) {
                if (objArr == f28172e) {
                    this.f28176b = new Object[C11479u.m44447u(i, 10)];
                } else {
                    mo22319w(f28171d.mo22321a(objArr.length, i));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo22285M(kotlin.jvm.functions.C11300l<? super E, java.lang.Boolean> r12) {
        /*
            r11 = this;
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x00a0
            java.lang.Object[] r0 = r11.f28176b
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x000f
            r0 = r2
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            if (r0 == 0) goto L_0x0014
            goto L_0x00a0
        L_0x0014:
            int r0 = r11.f28175a
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.mo22305n0(r0)
            int r3 = r11.f28175a
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x0025:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.f28176b
            r6 = r6[r3]
            java.lang.Object r7 = r12.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.f28176b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = r2
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0043:
            java.lang.Object[] r12 = r11.f28176b
            kotlin.collections.C10956m.m41251n2(r12, r4, r5, r0)
            goto L_0x0095
        L_0x0049:
            java.lang.Object[] r5 = r11.f28176b
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004e:
            if (r3 >= r5) goto L_0x006e
            java.lang.Object[] r8 = r11.f28176b
            r9 = r8[r3]
            r8[r3] = r4
            java.lang.Object r8 = r12.invoke(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x006a
            java.lang.Object[] r8 = r11.f28176b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x006b
        L_0x006a:
            r7 = r2
        L_0x006b:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x006e:
            int r3 = r11.mo22305n0(r6)
            r5 = r3
        L_0x0073:
            if (r1 >= r0) goto L_0x0094
            java.lang.Object[] r3 = r11.f28176b
            r6 = r3[r1]
            r3[r1] = r4
            java.lang.Object r3 = r12.invoke(r6)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0090
            java.lang.Object[] r3 = r11.f28176b
            r3[r5] = r6
            int r5 = r11.mo22287W(r5)
            goto L_0x0091
        L_0x0090:
            r7 = r2
        L_0x0091:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x0094:
            r1 = r7
        L_0x0095:
            if (r1 == 0) goto L_0x00a0
            int r12 = r11.f28175a
            int r5 = r5 - r12
            int r12 = r11.mo22304m0(r5)
            r11.f28177c = r12
        L_0x00a0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C10944i.mo22285M(kotlin.jvm.functions.l):boolean");
    }

    @C12580l
    /* renamed from: Q */
    public final E mo22286Q() {
        if (isEmpty()) {
            return null;
        }
        return this.f28176b[this.f28175a];
    }

    /* renamed from: W */
    public final int mo22287W(int i) {
        if (i == ArraysKt___ArraysKt.m39523Xe(this.f28176b)) {
            return 0;
        }
        return i + 1;
    }

    @C11110f
    /* renamed from: X */
    public final E mo22288X(int i) {
        return this.f28176b[i];
    }

    public boolean add(E e) {
        mo22308q(e);
        return true;
    }

    public boolean addAll(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        mo22284H(size() + collection.size());
        mo22309r(mo22305n0(this.f28175a + size()), collection);
        return true;
    }

    public void clear() {
        int n0 = mo22305n0(this.f28175a + size());
        int i = this.f28175a;
        if (i < n0) {
            C10956m.m41251n2(this.f28176b, null, i, n0);
        } else if (!isEmpty()) {
            Object[] objArr = this.f28176b;
            C10956m.m41251n2(objArr, null, this.f28175a, objArr.length);
            C10956m.m41251n2(this.f28176b, null, 0, n0);
        }
        this.f28175a = 0;
        this.f28177c = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public int mo15699e() {
        return this.f28177c;
    }

    @C11110f
    /* renamed from: e0 */
    public final int mo22294e0(int i) {
        return mo22305n0(this.f28175a + i);
    }

    /* renamed from: f0 */
    public final void mo22295f0(@C12579k C11304p<? super Integer, ? super Object[], C11079d2> pVar) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(pVar, C9874a.f27053J);
        int n0 = mo22305n0(this.f28175a + size());
        if (isEmpty() || (i2 = this.f28175a) < n0) {
            i = this.f28175a;
        } else {
            i = i2 - this.f28176b.length;
        }
        pVar.invoke(Integer.valueOf(i), toArray());
    }

    public final E first() {
        if (!isEmpty()) {
            return this.f28176b[this.f28175a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public E get(int i) {
        C10904b.f28138a.mo22056b(i, size());
        return this.f28176b[mo22305n0(this.f28175a + i)];
    }

    /* renamed from: h */
    public E mo15703h(int i) {
        C10904b.f28138a.mo22056b(i, size());
        if (i == CollectionsKt__CollectionsKt.m40443G(this)) {
            return mo22310r0();
        }
        if (i == 0) {
            return mo22306o0();
        }
        int n0 = mo22305n0(this.f28175a + i);
        E e = this.f28176b[n0];
        if (i < (size() >> 1)) {
            int i2 = this.f28175a;
            if (n0 >= i2) {
                Object[] objArr = this.f28176b;
                C10956m.m41183c1(objArr, objArr, i2 + 1, i2, n0);
            } else {
                Object[] objArr2 = this.f28176b;
                C10956m.m41183c1(objArr2, objArr2, 1, 0, n0);
                Object[] objArr3 = this.f28176b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f28175a;
                C10956m.m41183c1(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f28176b;
            int i4 = this.f28175a;
            objArr4[i4] = null;
            this.f28175a = mo22287W(i4);
        } else {
            int n02 = mo22305n0(this.f28175a + CollectionsKt__CollectionsKt.m40443G(this));
            if (n0 <= n02) {
                Object[] objArr5 = this.f28176b;
                C10956m.m41183c1(objArr5, objArr5, n0, n0 + 1, n02 + 1);
            } else {
                Object[] objArr6 = this.f28176b;
                C10956m.m41183c1(objArr6, objArr6, n0, n0 + 1, objArr6.length);
                Object[] objArr7 = this.f28176b;
                objArr7[objArr7.length - 1] = objArr7[0];
                C10956m.m41183c1(objArr7, objArr7, 0, 1, n02 + 1);
            }
            this.f28176b[n02] = null;
        }
        this.f28177c = size() - 1;
        return e;
    }

    /* renamed from: i */
    public final void mo22298i(E e) {
        mo22284H(size() + 1);
        int y = mo22320y(this.f28175a);
        this.f28175a = y;
        this.f28176b[y] = e;
        this.f28177c = size() + 1;
    }

    public int indexOf(Object obj) {
        int i;
        int n0 = mo22305n0(this.f28175a + size());
        int i2 = this.f28175a;
        if (i2 < n0) {
            while (i2 < n0) {
                if (Intrinsics.areEqual(obj, this.f28176b[i2])) {
                    i = this.f28175a;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < n0) {
            return -1;
        } else {
            int length = this.f28176b.length;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (i3 < n0) {
                        if (Intrinsics.areEqual(obj, this.f28176b[i3])) {
                            i2 = i3 + this.f28176b.length;
                            i = this.f28175a;
                        } else {
                            i3++;
                        }
                    }
                    return -1;
                } else if (Intrinsics.areEqual(obj, this.f28176b[i2])) {
                    i = this.f28175a;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @C12580l
    /* renamed from: l0 */
    public final E mo22301l0() {
        if (isEmpty()) {
            return null;
        }
        return this.f28176b[mo22305n0(this.f28175a + CollectionsKt__CollectionsKt.m40443G(this))];
    }

    public final E last() {
        if (!isEmpty()) {
            return this.f28176b[mo22305n0(this.f28175a + CollectionsKt__CollectionsKt.m40443G(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public int lastIndexOf(Object obj) {
        int i;
        int i2;
        int n0 = mo22305n0(this.f28175a + size());
        int i3 = this.f28175a;
        if (i3 < n0) {
            i = n0 - 1;
            if (i3 <= i) {
                while (!Intrinsics.areEqual(obj, this.f28176b[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.f28175a;
            }
            return -1;
        }
        if (i3 > n0) {
            int i4 = n0 - 1;
            while (true) {
                if (-1 >= i4) {
                    int Xe = ArraysKt___ArraysKt.m39523Xe(this.f28176b);
                    int i5 = this.f28175a;
                    if (i5 <= Xe) {
                        while (!Intrinsics.areEqual(obj, this.f28176b[i])) {
                            if (i != i5) {
                                Xe = i - 1;
                            }
                        }
                        i2 = this.f28175a;
                    }
                } else if (Intrinsics.areEqual(obj, this.f28176b[i4])) {
                    i = i4 + this.f28176b.length;
                    i2 = this.f28175a;
                    break;
                } else {
                    i4--;
                }
            }
        }
        return -1;
        return i - i2;
    }

    /* renamed from: m0 */
    public final int mo22304m0(int i) {
        return i < 0 ? i + this.f28176b.length : i;
    }

    /* renamed from: n0 */
    public final int mo22305n0(int i) {
        Object[] objArr = this.f28176b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* renamed from: o0 */
    public final E mo22306o0() {
        if (!isEmpty()) {
            E[] eArr = this.f28176b;
            int i = this.f28175a;
            E e = eArr[i];
            eArr[i] = null;
            this.f28175a = mo22287W(i);
            this.f28177c = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @C12580l
    /* renamed from: p0 */
    public final E mo22307p0() {
        if (isEmpty()) {
            return null;
        }
        return mo22306o0();
    }

    /* renamed from: q */
    public final void mo22308q(E e) {
        mo22284H(size() + 1);
        this.f28176b[mo22305n0(this.f28175a + size())] = e;
        this.f28177c = size() + 1;
    }

    /* renamed from: r */
    public final void mo22309r(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f28176b.length;
        while (i < length && it.hasNext()) {
            this.f28176b[i] = it.next();
            i++;
        }
        int i2 = this.f28175a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f28176b[i3] = it.next();
        }
        this.f28177c = size() + collection.size();
    }

    /* renamed from: r0 */
    public final E mo22310r0() {
        if (!isEmpty()) {
            int n0 = mo22305n0(this.f28175a + CollectionsKt__CollectionsKt.m40443G(this));
            E[] eArr = this.f28176b;
            E e = eArr[n0];
            eArr[n0] = null;
            this.f28177c = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(@org.jetbrains.annotations.C12579k java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.f28176b
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.f28175a
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.mo22305n0(r0)
            int r3 = r11.f28175a
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.f28176b
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.f28176b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = r2
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0043:
            java.lang.Object[] r12 = r11.f28176b
            kotlin.collections.C10956m.m41251n2(r12, r4, r5, r0)
            goto L_0x008b
        L_0x0049:
            java.lang.Object[] r5 = r11.f28176b
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004e:
            if (r3 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.f28176b
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.f28176b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = r2
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0069:
            int r3 = r11.mo22305n0(r6)
            r5 = r3
        L_0x006e:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.f28176b
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.f28176b
            r3[r5] = r6
            int r5 = r11.mo22287W(r5)
            goto L_0x0087
        L_0x0086:
            r7 = r2
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.f28175a
            int r5 = r5 - r12
            int r12 = r11.mo22304m0(r5)
            r11.f28177c = r12
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C10944i.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(@org.jetbrains.annotations.C12579k java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f28176b
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.f28175a
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.mo22305n0(r0)
            int r3 = r11.f28175a
            r4 = 0
            if (r3 >= r0) goto L_0x0048
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0042
            java.lang.Object[] r6 = r11.f28176b
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003e
            java.lang.Object[] r7 = r11.f28176b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0042:
            java.lang.Object[] r12 = r11.f28176b
            kotlin.collections.C10956m.m41251n2(r12, r4, r5, r0)
            goto L_0x0088
        L_0x0048:
            java.lang.Object[] r5 = r11.f28176b
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004d:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f28176b
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f28176b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = r2
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0067:
            int r3 = r11.mo22305n0(r6)
            r5 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0087
            java.lang.Object[] r3 = r11.f28176b
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r3 = r11.f28176b
            r3[r5] = r6
            int r5 = r11.mo22287W(r5)
            goto L_0x0084
        L_0x0083:
            r7 = r2
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0087:
            r1 = r7
        L_0x0088:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f28175a
            int r5 = r5 - r12
            int r12 = r11.mo22304m0(r5)
            r11.f28177c = r12
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C10944i.retainAll(java.util.Collection):boolean");
    }

    @C12580l
    /* renamed from: s0 */
    public final E mo22314s0() {
        if (isEmpty()) {
            return null;
        }
        return mo22310r0();
    }

    public E set(int i, E e) {
        C10904b.f28138a.mo22056b(i, size());
        int n0 = mo22305n0(this.f28175a + i);
        E[] eArr = this.f28176b;
        E e2 = eArr[n0];
        eArr[n0] = e;
        return e2;
    }

    @C12579k
    /* renamed from: t0 */
    public final Object[] mo22315t0() {
        return toArray();
    }

    @C12579k
    public <T> T[] toArray(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        if (tArr.length < size()) {
            tArr = C10952k.m40997a(tArr, size());
        }
        int n0 = mo22305n0(this.f28175a + size());
        int i = this.f28175a;
        if (i < n0) {
            C10956m.m41237l1(this.f28176b, tArr, 0, i, n0, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f28176b;
            C10956m.m41183c1(objArr, tArr, 0, this.f28175a, objArr.length);
            Object[] objArr2 = this.f28176b;
            C10956m.m41183c1(objArr2, tArr, objArr2.length - this.f28175a, 0, n0);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    @C12579k
    /* renamed from: u0 */
    public final <T> T[] mo22318u0(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return toArray(tArr);
    }

    /* renamed from: w */
    public final void mo22319w(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f28176b;
        C10956m.m41183c1(objArr2, objArr, 0, this.f28175a, objArr2.length);
        Object[] objArr3 = this.f28176b;
        int length = objArr3.length;
        int i2 = this.f28175a;
        C10956m.m41183c1(objArr3, objArr, length - i2, 0, i2);
        this.f28175a = 0;
        this.f28176b = objArr;
    }

    /* renamed from: y */
    public final int mo22320y(int i) {
        return i == 0 ? ArraysKt___ArraysKt.m39523Xe(this.f28176b) : i - 1;
    }

    public void add(int i, E e) {
        C10904b.f28138a.mo22057c(i, size());
        if (i == size()) {
            mo22308q(e);
        } else if (i == 0) {
            mo22298i(e);
        } else {
            mo22284H(size() + 1);
            int n0 = mo22305n0(this.f28175a + i);
            if (i < ((size() + 1) >> 1)) {
                int y = mo22320y(n0);
                int y2 = mo22320y(this.f28175a);
                int i2 = this.f28175a;
                if (y >= i2) {
                    Object[] objArr = this.f28176b;
                    objArr[y2] = objArr[i2];
                    C10956m.m41183c1(objArr, objArr, i2, i2 + 1, y + 1);
                } else {
                    Object[] objArr2 = this.f28176b;
                    C10956m.m41183c1(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f28176b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C10956m.m41183c1(objArr3, objArr3, 0, 1, y + 1);
                }
                this.f28176b[y] = e;
                this.f28175a = y2;
            } else {
                int n02 = mo22305n0(this.f28175a + size());
                if (n0 < n02) {
                    Object[] objArr4 = this.f28176b;
                    C10956m.m41183c1(objArr4, objArr4, n0 + 1, n0, n02);
                } else {
                    Object[] objArr5 = this.f28176b;
                    C10956m.m41183c1(objArr5, objArr5, 1, 0, n02);
                    Object[] objArr6 = this.f28176b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C10956m.m41183c1(objArr6, objArr6, n0 + 1, n0, objArr6.length - 1);
                }
                this.f28176b[n0] = e;
            }
            this.f28177c = size() + 1;
        }
    }

    public boolean addAll(int i, @C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        C10904b.f28138a.mo22057c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        mo22284H(size() + collection.size());
        int n0 = mo22305n0(this.f28175a + size());
        int n02 = mo22305n0(this.f28175a + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f28175a;
            int i3 = i2 - size;
            if (n02 < i2) {
                Object[] objArr = this.f28176b;
                C10956m.m41183c1(objArr, objArr, i3, i2, objArr.length);
                if (size >= n02) {
                    Object[] objArr2 = this.f28176b;
                    C10956m.m41183c1(objArr2, objArr2, objArr2.length - size, 0, n02);
                } else {
                    Object[] objArr3 = this.f28176b;
                    C10956m.m41183c1(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f28176b;
                    C10956m.m41183c1(objArr4, objArr4, 0, size, n02);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f28176b;
                C10956m.m41183c1(objArr5, objArr5, i3, i2, n02);
            } else {
                Object[] objArr6 = this.f28176b;
                i3 += objArr6.length;
                int i4 = n02 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    C10956m.m41183c1(objArr6, objArr6, i3, i2, n02);
                } else {
                    C10956m.m41183c1(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f28176b;
                    C10956m.m41183c1(objArr7, objArr7, 0, this.f28175a + length, n02);
                }
            }
            this.f28175a = i3;
            mo22309r(mo22304m0(n02 - size), collection);
        } else {
            int i5 = n02 + size;
            if (n02 < n0) {
                int i6 = size + n0;
                Object[] objArr8 = this.f28176b;
                if (i6 <= objArr8.length) {
                    C10956m.m41183c1(objArr8, objArr8, i5, n02, n0);
                } else if (i5 >= objArr8.length) {
                    C10956m.m41183c1(objArr8, objArr8, i5 - objArr8.length, n02, n0);
                } else {
                    int length2 = n0 - (i6 - objArr8.length);
                    C10956m.m41183c1(objArr8, objArr8, 0, length2, n0);
                    Object[] objArr9 = this.f28176b;
                    C10956m.m41183c1(objArr9, objArr9, i5, n02, length2);
                }
            } else {
                Object[] objArr10 = this.f28176b;
                C10956m.m41183c1(objArr10, objArr10, size, 0, n0);
                Object[] objArr11 = this.f28176b;
                if (i5 >= objArr11.length) {
                    C10956m.m41183c1(objArr11, objArr11, i5 - objArr11.length, n02, objArr11.length);
                } else {
                    C10956m.m41183c1(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f28176b;
                    C10956m.m41183c1(objArr12, objArr12, i5, n02, objArr12.length - size);
                }
            }
            mo22309r(n02, collection);
        }
        return true;
    }

    public C10944i() {
        this.f28176b = f28172e;
    }

    public C10944i(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        boolean z = false;
        Object[] array = collection.toArray(new Object[0]);
        this.f28176b = array;
        this.f28177c = array.length;
        if (array.length == 0 ? true : z) {
            this.f28176b = f28172e;
        }
    }

    @C12579k
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
