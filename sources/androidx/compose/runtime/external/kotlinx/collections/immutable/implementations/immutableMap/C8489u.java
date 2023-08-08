package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8531b;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8535f;
import java.util.Arrays;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11463j;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,887:1\n10#2,9:888\n10#2,9:897\n10#2,9:906\n83#3:915\n1#4:916\n26#5:917\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n619#1:888,9\n636#1:897,9\n640#1:906,9\n688#1:915\n688#1:916\n885#1:917\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u */
public final class C8489u<K, V> {
    @C12579k

    /* renamed from: e */
    public static final C8490a f22873e = new C8490a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final C8489u f22874f = new C8489u(0, 0, new Object[0]);

    /* renamed from: a */
    public int f22875a;

    /* renamed from: b */
    public int f22876b;
    @C12580l

    /* renamed from: c */
    public final C8535f f22877c;
    @C12579k

    /* renamed from: d */
    public Object[] f22878d;

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u$a */
    public static final class C8490a {
        public /* synthetic */ C8490a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8489u mo15910a() {
            return C8489u.f22874f;
        }

        public C8490a() {
        }
    }

    @C11363r0({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,887:1\n1#2:888\n*E\n"})
    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u$b */
    public static final class C8491b<K, V> {
        @C12579k

        /* renamed from: a */
        public C8489u<K, V> f22879a;

        /* renamed from: b */
        public final int f22880b;

        public C8491b(@C12579k C8489u<K, V> uVar, int i) {
            Intrinsics.checkNotNullParameter(uVar, "node");
            this.f22879a = uVar;
            this.f22880b = i;
        }

        @C12579k
        /* renamed from: a */
        public final C8489u<K, V> mo15911a() {
            return this.f22879a;
        }

        /* renamed from: b */
        public final int mo15912b() {
            return this.f22880b;
        }

        @C12579k
        /* renamed from: c */
        public final C8491b<K, V> mo15913c(@C12579k C11300l<? super C8489u<K, V>, C8489u<K, V>> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "operation");
            mo15914d(lVar.invoke(mo15911a()));
            return this;
        }

        /* renamed from: d */
        public final void mo15914d(@C12579k C8489u<K, V> uVar) {
            Intrinsics.checkNotNullParameter(uVar, "<set-?>");
            this.f22879a = uVar;
        }
    }

    public C8489u(int i, int i2, @C12579k Object[] objArr, @C12580l C8535f fVar) {
        Intrinsics.checkNotNullParameter(objArr, "buffer");
        this.f22875a = i;
        this.f22876b = i2;
        this.f22877c = fVar;
        this.f22878d = objArr;
    }

    /* renamed from: A */
    public final C8489u<K, V> mo15858A(C8489u<K, V> uVar, C8531b bVar, C8535f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f22876b == 0) {
            z = true;
        } else {
            z = false;
        }
        C8530a.m30952a(z);
        if (this.f22875a == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C8530a.m30952a(z2);
        if (uVar.f22876b == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C8530a.m30952a(z3);
        if (uVar.f22875a == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C8530a.m30952a(z4);
        Object[] objArr = this.f22878d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + uVar.f22878d.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int length = this.f22878d.length;
        C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, uVar.f22878d.length), 2);
        int r = B1.mo23049r();
        int w = B1.mo23051w();
        int y = B1.mo23052y();
        if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
            while (true) {
                if (!mo15891h(uVar.f22878d[r])) {
                    Object[] objArr2 = uVar.f22878d;
                    copyOf[length] = objArr2[r];
                    copyOf[length + 1] = objArr2[r + 1];
                    length += 2;
                } else {
                    bVar.mo16118f(bVar.mo16115d() + 1);
                }
                if (r == w) {
                    break;
                }
                r += y;
            }
        }
        if (length == this.f22878d.length) {
            return this;
        }
        if (length == uVar.f22878d.length) {
            return uVar;
        }
        if (length == copyOf.length) {
            return new C8489u<>(0, 0, copyOf, fVar);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return new C8489u<>(0, 0, copyOf2, fVar);
    }

    /* renamed from: B */
    public final C8489u<K, V> mo15859B(K k, C8474f<K, V> fVar) {
        C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, this.f22878d.length), 2);
        int r = B1.mo23049r();
        int w = B1.mo23051w();
        int y = B1.mo23052y();
        if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
            while (!Intrinsics.areEqual((Object) k, mo15906w(r))) {
                if (r != w) {
                    r += y;
                }
            }
            return mo15861D(r, fVar);
        }
        return this;
    }

    /* renamed from: C */
    public final C8489u<K, V> mo15860C(K k, V v, C8474f<K, V> fVar) {
        C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, this.f22878d.length), 2);
        int r = B1.mo23049r();
        int w = B1.mo23051w();
        int y = B1.mo23052y();
        if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
            while (true) {
                if (!Intrinsics.areEqual((Object) k, mo15906w(r)) || !Intrinsics.areEqual((Object) v, mo15885a0(r))) {
                    if (r == w) {
                        break;
                    }
                    r += y;
                } else {
                    return mo15861D(r, fVar);
                }
            }
        }
        return this;
    }

    /* renamed from: D */
    public final C8489u<K, V> mo15861D(int i, C8474f<K, V> fVar) {
        fVar.mo15829o(fVar.size() - 1);
        fVar.mo15828n(mo15885a0(i));
        if (this.f22878d.length == 2) {
            return null;
        }
        if (this.f22877c != fVar.mo15825j()) {
            return new C8489u<>(0, 0, C8495y.m30777h(this.f22878d, i), fVar.mo15825j());
        }
        this.f22878d = C8495y.m30777h(this.f22878d, i);
        return this;
    }

    /* renamed from: E */
    public final C8489u<K, V> mo15862E(int i, K k, V v, C8535f fVar) {
        int q = mo15900q(i);
        if (this.f22877c == fVar) {
            this.f22878d = C8495y.m30776g(this.f22878d, q, k, v);
            this.f22875a = i | this.f22875a;
            return this;
        }
        return new C8489u<>(i | this.f22875a, this.f22876b, C8495y.m30776g(this.f22878d, q, k, v), fVar);
    }

    /* renamed from: F */
    public final C8489u<K, V> mo15863F(int i, int i2, int i3, K k, V v, int i4, C8535f fVar) {
        if (this.f22877c == fVar) {
            this.f22878d = mo15889f(i, i2, i3, k, v, i4, fVar);
            this.f22875a ^= i2;
            this.f22876b |= i2;
            return this;
        }
        return new C8489u<>(this.f22875a ^ i2, i2 | this.f22876b, mo15889f(i, i2, i3, k, v, i4, fVar), fVar);
    }

    @C12579k
    /* renamed from: G */
    public final C8489u<K, V> mo15864G(int i, K k, V v, int i2, @C12579k C8474f<K, V> fVar) {
        C8489u<K, V> uVar;
        Intrinsics.checkNotNullParameter(fVar, "mutator");
        int f = 1 << C8495y.m30775f(i, i2);
        if (mo15903t(f)) {
            int q = mo15900q(f);
            if (Intrinsics.areEqual((Object) k, mo15906w(q))) {
                fVar.mo15828n(mo15885a0(q));
                if (mo15885a0(q) == v) {
                    return this;
                }
                return mo15873P(q, v, fVar);
            }
            fVar.mo15829o(fVar.size() + 1);
            return mo15863F(q, f, i, k, v, i2, fVar.mo15825j());
        } else if (mo15904u(f)) {
            int R = mo15875R(f);
            C8489u<K, V> Q = mo15874Q(R);
            if (i2 == 30) {
                uVar = Q.mo15909z(k, v, fVar);
            } else {
                uVar = Q.mo15864G(i, k, v, i2 + 5, fVar);
            }
            if (Q == uVar) {
                return this;
            }
            return mo15872O(R, uVar, fVar.mo15825j());
        } else {
            fVar.mo15829o(fVar.size() + 1);
            return mo15862E(f, k, v, fVar.mo15825j());
        }
    }

    @C12579k
    /* renamed from: H */
    public final C8489u<K, V> mo15865H(@C12579k C8489u<K, V> uVar, int i, @C12579k C8531b bVar, @C12579k C8474f<K, V> fVar) {
        boolean z;
        C8489u uVar2;
        C8489u<K, V> uVar3 = uVar;
        C8531b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(uVar3, "otherNode");
        Intrinsics.checkNotNullParameter(bVar2, "intersectionCounter");
        Intrinsics.checkNotNullParameter(fVar, "mutator");
        if (this == uVar3) {
            bVar2.mo16116e(mo15890g());
            return this;
        } else if (i > 30) {
            return mo15858A(uVar3, bVar2, fVar.mo15825j());
        } else {
            int i2 = this.f22876b | uVar3.f22876b;
            int i3 = this.f22875a;
            int i4 = uVar3.f22875a;
            int i5 = i3 & i4;
            int i6 = (i3 ^ i4) & (~i2);
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                if (Intrinsics.areEqual(mo15906w(mo15900q(lowestOneBit)), (Object) uVar3.mo15906w(uVar3.mo15900q(lowestOneBit)))) {
                    i6 |= lowestOneBit;
                } else {
                    i2 |= lowestOneBit;
                }
                i5 ^= lowestOneBit;
            }
            int i7 = 0;
            if ((i2 & i6) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (Intrinsics.areEqual((Object) this.f22877c, (Object) fVar.mo15825j()) && this.f22875a == i6 && this.f22876b == i2) {
                    uVar2 = this;
                } else {
                    uVar2 = new C8489u(i6, i2, new Object[((Integer.bitCount(i6) * 2) + Integer.bitCount(i2))]);
                }
                int i8 = i2;
                int i9 = 0;
                while (i8 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i8);
                    Object[] objArr = uVar2.f22878d;
                    objArr[(objArr.length - 1) - i9] = mo15866I(uVar, lowestOneBit2, i, bVar, fVar);
                    i9++;
                    i8 ^= lowestOneBit2;
                }
                while (i6 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i6);
                    int i10 = i7 * 2;
                    if (!uVar3.mo15903t(lowestOneBit3)) {
                        int q = mo15900q(lowestOneBit3);
                        uVar2.f22878d[i10] = mo15906w(q);
                        uVar2.f22878d[i10 + 1] = mo15885a0(q);
                    } else {
                        int q2 = uVar3.mo15900q(lowestOneBit3);
                        uVar2.f22878d[i10] = uVar3.mo15906w(q2);
                        uVar2.f22878d[i10 + 1] = uVar3.mo15885a0(q2);
                        if (mo15903t(lowestOneBit3)) {
                            bVar2.mo16118f(bVar.mo16115d() + 1);
                        }
                    }
                    i7++;
                    i6 ^= lowestOneBit3;
                }
                if (mo15898o(uVar2)) {
                    return this;
                }
                if (uVar3.mo15898o(uVar2)) {
                    return uVar3;
                }
                return uVar2;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: I */
    public final C8489u<K, V> mo15866I(C8489u<K, V> uVar, int i, int i2, C8531b bVar, C8474f<K, V> fVar) {
        int i3;
        int i4;
        C8489u<K, V> uVar2 = uVar;
        int i5 = i;
        C8531b bVar2 = bVar;
        int i6 = 0;
        if (mo15904u(i5)) {
            C8489u<K, V> Q = mo15874Q(mo15875R(i5));
            if (uVar.mo15904u(i)) {
                return Q.mo15865H(uVar2.mo15874Q(uVar.mo15875R(i)), i2 + 5, bVar2, fVar);
            }
            C8474f<K, V> fVar2 = fVar;
            if (!uVar.mo15903t(i)) {
                return Q;
            }
            int q = uVar.mo15900q(i);
            K w = uVar2.mo15906w(q);
            V a0 = uVar2.mo15885a0(q);
            int size = fVar.size();
            if (w != null) {
                i6 = w.hashCode();
            }
            C8489u<K, V> G = Q.mo15864G(i6, w, a0, i2 + 5, fVar);
            if (fVar.size() != size) {
                return G;
            }
            bVar2.mo16118f(bVar.mo16115d() + 1);
            return G;
        }
        C8474f<K, V> fVar3 = fVar;
        if (uVar.mo15904u(i)) {
            C8489u<K, V> Q2 = uVar2.mo15874Q(uVar.mo15875R(i));
            if (mo15903t(i5)) {
                int q2 = mo15900q(i5);
                Object w2 = mo15906w(q2);
                if (w2 != null) {
                    i4 = w2.hashCode();
                } else {
                    i4 = 0;
                }
                int i7 = i2 + 5;
                if (Q2.mo15897n(i4, w2, i7)) {
                    bVar2.mo16118f(bVar.mo16115d() + 1);
                } else {
                    Object a02 = mo15885a0(q2);
                    if (w2 != null) {
                        i6 = w2.hashCode();
                    }
                    return Q2.mo15864G(i6, w2, a02, i7, fVar);
                }
            }
            return Q2;
        }
        int q3 = mo15900q(i5);
        Object w3 = mo15906w(q3);
        Object a03 = mo15885a0(q3);
        int q4 = uVar.mo15900q(i);
        K w4 = uVar2.mo15906w(q4);
        V a04 = uVar2.mo15885a0(q4);
        if (w3 != null) {
            i3 = w3.hashCode();
        } else {
            i3 = 0;
        }
        if (w4 != null) {
            i6 = w4.hashCode();
        }
        return mo15907x(i3, w3, a03, i6, w4, a04, i2 + 5, fVar.mo15825j());
    }

    @C12580l
    /* renamed from: J */
    public final C8489u<K, V> mo15867J(int i, K k, int i2, @C12579k C8474f<K, V> fVar) {
        C8489u<K, V> uVar;
        Intrinsics.checkNotNullParameter(fVar, "mutator");
        int f = 1 << C8495y.m30775f(i, i2);
        if (mo15903t(f)) {
            int q = mo15900q(f);
            if (Intrinsics.areEqual((Object) k, mo15906w(q))) {
                return mo15869L(q, f, fVar);
            }
            return this;
        } else if (!mo15904u(f)) {
            return this;
        } else {
            int R = mo15875R(f);
            C8489u Q = mo15874Q(R);
            if (i2 == 30) {
                uVar = Q.mo15859B(k, fVar);
            } else {
                uVar = Q.mo15867J(i, k, i2 + 5, fVar);
            }
            return mo15871N(Q, uVar, R, f, fVar.mo15825j());
        }
    }

    @C12580l
    /* renamed from: K */
    public final C8489u<K, V> mo15868K(int i, K k, V v, int i2, @C12579k C8474f<K, V> fVar) {
        C8489u<K, V> uVar;
        K k2 = k;
        V v2 = v;
        int i3 = i2;
        C8474f<K, V> fVar2 = fVar;
        Intrinsics.checkNotNullParameter(fVar2, "mutator");
        int i4 = i;
        int f = 1 << C8495y.m30775f(i, i2);
        if (mo15903t(f)) {
            int q = mo15900q(f);
            if (!Intrinsics.areEqual((Object) k, mo15906w(q)) || !Intrinsics.areEqual((Object) v, mo15885a0(q))) {
                return this;
            }
            return mo15869L(q, f, fVar2);
        } else if (!mo15904u(f)) {
            return this;
        } else {
            int R = mo15875R(f);
            C8489u Q = mo15874Q(R);
            if (i3 == 30) {
                uVar = Q.mo15860C(k, v, fVar2);
            } else {
                uVar = Q.mo15868K(i, k, v, i3 + 5, fVar);
            }
            return mo15871N(Q, uVar, R, f, fVar.mo15825j());
        }
    }

    /* renamed from: L */
    public final C8489u<K, V> mo15869L(int i, int i2, C8474f<K, V> fVar) {
        fVar.mo15829o(fVar.size() - 1);
        fVar.mo15828n(mo15885a0(i));
        if (this.f22878d.length == 2) {
            return null;
        }
        if (this.f22877c == fVar.mo15825j()) {
            this.f22878d = C8495y.m30777h(this.f22878d, i);
            this.f22875a ^= i2;
            return this;
        }
        return new C8489u<>(i2 ^ this.f22875a, this.f22876b, C8495y.m30777h(this.f22878d, i), fVar.mo15825j());
    }

    /* renamed from: M */
    public final C8489u<K, V> mo15870M(int i, int i2, C8535f fVar) {
        Object[] objArr = this.f22878d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f22877c == fVar) {
            this.f22878d = C8495y.m30778i(objArr, i);
            this.f22876b ^= i2;
            return this;
        }
        return new C8489u<>(this.f22875a, i2 ^ this.f22876b, C8495y.m30778i(objArr, i), fVar);
    }

    /* renamed from: N */
    public final C8489u<K, V> mo15871N(C8489u<K, V> uVar, C8489u<K, V> uVar2, int i, int i2, C8535f fVar) {
        if (uVar2 == null) {
            return mo15870M(i, i2, fVar);
        }
        if (this.f22877c == fVar || uVar != uVar2) {
            return mo15872O(i, uVar2, fVar);
        }
        return this;
    }

    /* renamed from: O */
    public final C8489u<K, V> mo15872O(int i, C8489u<K, V> uVar, C8535f fVar) {
        Object[] objArr = this.f22878d;
        if (objArr.length == 1 && uVar.f22878d.length == 2 && uVar.f22876b == 0) {
            uVar.f22875a = this.f22876b;
            return uVar;
        } else if (this.f22877c == fVar) {
            objArr[i] = uVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[i] = uVar;
            return new C8489u<>(this.f22875a, this.f22876b, copyOf, fVar);
        }
    }

    /* renamed from: P */
    public final C8489u<K, V> mo15873P(int i, V v, C8474f<K, V> fVar) {
        if (this.f22877c == fVar.mo15825j()) {
            this.f22878d[i + 1] = v;
            return this;
        }
        fVar.mo15826l(fVar.mo15821f() + 1);
        Object[] objArr = this.f22878d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = v;
        return new C8489u<>(this.f22875a, this.f22876b, copyOf, fVar.mo15825j());
    }

    @C12579k
    /* renamed from: Q */
    public final C8489u<K, V> mo15874Q(int i) {
        Object obj = this.f22878d[i];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C8489u) obj;
    }

    /* renamed from: R */
    public final int mo15875R(int i) {
        return (this.f22878d.length - 1) - Integer.bitCount((i - 1) & this.f22876b);
    }

    @C12580l
    /* renamed from: S */
    public final C8491b<K, V> mo15876S(int i, K k, V v, int i2) {
        C8491b<K, V> bVar;
        int f = 1 << C8495y.m30775f(i, i2);
        if (mo15903t(f)) {
            int q = mo15900q(f);
            if (!Intrinsics.areEqual((Object) k, mo15906w(q))) {
                return mo15908y(q, f, i, k, v, i2).mo15887d();
            }
            if (mo15885a0(q) == v) {
                return null;
            }
            return mo15883Z(q, v).mo15888e();
        } else if (!mo15904u(f)) {
            return mo15905v(f, k, v).mo15887d();
        } else {
            int R = mo15875R(f);
            C8489u Q = mo15874Q(R);
            if (i2 == 30) {
                bVar = Q.mo15893j(k, v);
                if (bVar == null) {
                    return null;
                }
            } else {
                bVar = Q.mo15876S(i, k, v, i2 + 5);
                if (bVar == null) {
                    return null;
                }
            }
            bVar.mo15914d(mo15882Y(R, f, bVar.mo15911a()));
            return bVar;
        }
    }

    @C12580l
    /* renamed from: T */
    public final C8489u<K, V> mo15877T(int i, K k, int i2) {
        C8489u uVar;
        int f = 1 << C8495y.m30775f(i, i2);
        if (mo15903t(f)) {
            int q = mo15900q(f);
            if (Intrinsics.areEqual((Object) k, mo15906w(q))) {
                return mo15879V(q, f);
            }
            return this;
        } else if (!mo15904u(f)) {
            return this;
        } else {
            int R = mo15875R(f);
            C8489u Q = mo15874Q(R);
            if (i2 == 30) {
                uVar = Q.mo15894k(k);
            } else {
                uVar = Q.mo15877T(i, k, i2 + 5);
            }
            return mo15881X(Q, uVar, R, f);
        }
    }

    @C12580l
    /* renamed from: U */
    public final C8489u<K, V> mo15878U(int i, K k, V v, int i2) {
        C8489u uVar;
        int f = 1 << C8495y.m30775f(i, i2);
        if (mo15903t(f)) {
            int q = mo15900q(f);
            if (!Intrinsics.areEqual((Object) k, mo15906w(q)) || !Intrinsics.areEqual((Object) v, mo15885a0(q))) {
                return this;
            }
            return mo15879V(q, f);
        } else if (!mo15904u(f)) {
            return this;
        } else {
            int R = mo15875R(f);
            C8489u Q = mo15874Q(R);
            if (i2 == 30) {
                uVar = Q.mo15895l(k, v);
            } else {
                uVar = Q.mo15878U(i, k, v, i2 + 5);
            }
            return mo15881X(Q, uVar, R, f);
        }
    }

    /* renamed from: V */
    public final C8489u<K, V> mo15879V(int i, int i2) {
        Object[] objArr = this.f22878d;
        if (objArr.length == 2) {
            return null;
        }
        return new C8489u<>(i2 ^ this.f22875a, this.f22876b, C8495y.m30777h(objArr, i));
    }

    /* renamed from: W */
    public final C8489u<K, V> mo15880W(int i, int i2) {
        Object[] objArr = this.f22878d;
        if (objArr.length == 1) {
            return null;
        }
        return new C8489u<>(this.f22875a, i2 ^ this.f22876b, C8495y.m30778i(objArr, i));
    }

    /* renamed from: X */
    public final C8489u<K, V> mo15881X(C8489u<K, V> uVar, C8489u<K, V> uVar2, int i, int i2) {
        if (uVar2 == null) {
            return mo15880W(i, i2);
        }
        if (uVar != uVar2) {
            return mo15882Y(i, i2, uVar2);
        }
        return this;
    }

    /* renamed from: Y */
    public final C8489u<K, V> mo15882Y(int i, int i2, C8489u<K, V> uVar) {
        Object[] objArr = uVar.f22878d;
        if (objArr.length != 2 || uVar.f22876b != 0) {
            Object[] objArr2 = this.f22878d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[i] = uVar;
            return new C8489u<>(this.f22875a, this.f22876b, copyOf);
        } else if (this.f22878d.length == 1) {
            uVar.f22875a = this.f22876b;
            return uVar;
        } else {
            return new C8489u<>(this.f22875a ^ i2, i2 ^ this.f22876b, C8495y.m30780k(this.f22878d, i, mo15900q(i2), objArr[0], objArr[1]));
        }
    }

    /* renamed from: Z */
    public final C8489u<K, V> mo15883Z(int i, V v) {
        Object[] objArr = this.f22878d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = v;
        return new C8489u<>(this.f22875a, this.f22876b, copyOf);
    }

    /* renamed from: a */
    public final void mo15884a(C11307s<? super C8489u<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, C11079d2> sVar, int i, int i2) {
        sVar.mo7709v5(this, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f22875a), Integer.valueOf(this.f22876b));
        int i3 = this.f22876b;
        while (i3 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i3);
            mo15874Q(mo15875R(lowestOneBit)).mo15884a(sVar, (Integer.numberOfTrailingZeros(lowestOneBit) << i2) + i, i2 + 5);
            i3 -= lowestOneBit;
        }
    }

    /* renamed from: a0 */
    public final V mo15885a0(int i) {
        return this.f22878d[i + 1];
    }

    /* renamed from: b */
    public final void mo15886b(@C12579k C11307s<? super C8489u<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, C11079d2> sVar) {
        Intrinsics.checkNotNullParameter(sVar, "visitor");
        mo15884a(sVar, 0, 0);
    }

    /* renamed from: d */
    public final C8491b<K, V> mo15887d() {
        return new C8491b<>(this, 1);
    }

    /* renamed from: e */
    public final C8491b<K, V> mo15888e() {
        return new C8491b<>(this, 0);
    }

    /* renamed from: f */
    public final Object[] mo15889f(int i, int i2, int i3, K k, V v, int i4, C8535f fVar) {
        int i5;
        Object w = mo15906w(i);
        if (w != null) {
            i5 = w.hashCode();
        } else {
            i5 = 0;
        }
        C8489u x = mo15907x(i5, w, mo15885a0(i), i3, k, v, i4 + 5, fVar);
        int i6 = i2;
        int i7 = i;
        return C8495y.m30779j(this.f22878d, i, mo15875R(i2) + 1, x);
    }

    /* renamed from: g */
    public final int mo15890g() {
        if (this.f22876b == 0) {
            return this.f22878d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f22875a);
        int length = this.f22878d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += mo15874Q(i).mo15890g();
        }
        return bitCount;
    }

    /* renamed from: h */
    public final boolean mo15891h(K k) {
        C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, this.f22878d.length), 2);
        int r = B1.mo23049r();
        int w = B1.mo23051w();
        int y = B1.mo23052y();
        if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
            while (!Intrinsics.areEqual((Object) k, this.f22878d[r])) {
                if (r != w) {
                    r += y;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final V mo15892i(K k) {
        C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, this.f22878d.length), 2);
        int r = B1.mo23049r();
        int w = B1.mo23051w();
        int y = B1.mo23052y();
        if ((y <= 0 || r > w) && (y >= 0 || w > r)) {
            return null;
        }
        while (!Intrinsics.areEqual((Object) k, mo15906w(r))) {
            if (r == w) {
                return null;
            }
            r += y;
        }
        return mo15885a0(r);
    }

    /* renamed from: j */
    public final C8491b<K, V> mo15893j(K k, V v) {
        C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, this.f22878d.length), 2);
        int r = B1.mo23049r();
        int w = B1.mo23051w();
        int y = B1.mo23052y();
        if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
            while (!Intrinsics.areEqual((Object) k, mo15906w(r))) {
                if (r != w) {
                    r += y;
                }
            }
            if (v == mo15885a0(r)) {
                return null;
            }
            Object[] objArr = this.f22878d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[r + 1] = v;
            return new C8489u(0, 0, copyOf).mo15888e();
        }
        return new C8489u(0, 0, C8495y.m30776g(this.f22878d, 0, k, v)).mo15887d();
    }

    /* renamed from: k */
    public final C8489u<K, V> mo15894k(K k) {
        C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, this.f22878d.length), 2);
        int r = B1.mo23049r();
        int w = B1.mo23051w();
        int y = B1.mo23052y();
        if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
            while (!Intrinsics.areEqual((Object) k, mo15906w(r))) {
                if (r != w) {
                    r += y;
                }
            }
            return mo15896m(r);
        }
        return this;
    }

    /* renamed from: l */
    public final C8489u<K, V> mo15895l(K k, V v) {
        C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, this.f22878d.length), 2);
        int r = B1.mo23049r();
        int w = B1.mo23051w();
        int y = B1.mo23052y();
        if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
            while (true) {
                if (!Intrinsics.areEqual((Object) k, mo15906w(r)) || !Intrinsics.areEqual((Object) v, mo15885a0(r))) {
                    if (r == w) {
                        break;
                    }
                    r += y;
                } else {
                    return mo15896m(r);
                }
            }
        }
        return this;
    }

    /* renamed from: m */
    public final C8489u<K, V> mo15896m(int i) {
        Object[] objArr = this.f22878d;
        if (objArr.length == 2) {
            return null;
        }
        return new C8489u<>(0, 0, C8495y.m30777h(objArr, i));
    }

    /* renamed from: n */
    public final boolean mo15897n(int i, K k, int i2) {
        int f = 1 << C8495y.m30775f(i, i2);
        if (mo15903t(f)) {
            return Intrinsics.areEqual((Object) k, mo15906w(mo15900q(f)));
        }
        if (!mo15904u(f)) {
            return false;
        }
        C8489u Q = mo15874Q(mo15875R(f));
        if (i2 == 30) {
            return Q.mo15891h(k);
        }
        return Q.mo15897n(i, k, i2 + 5);
    }

    /* renamed from: o */
    public final boolean mo15898o(C8489u<K, V> uVar) {
        if (this == uVar) {
            return true;
        }
        if (this.f22876b != uVar.f22876b || this.f22875a != uVar.f22875a) {
            return false;
        }
        int length = this.f22878d.length;
        for (int i = 0; i < length; i++) {
            if (this.f22878d[i] != uVar.f22878d[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public final int mo15899p() {
        return Integer.bitCount(this.f22875a);
    }

    /* renamed from: q */
    public final int mo15900q(int i) {
        return Integer.bitCount((i - 1) & this.f22875a) * 2;
    }

    @C12580l
    /* renamed from: r */
    public final V mo15901r(int i, K k, int i2) {
        int f = 1 << C8495y.m30775f(i, i2);
        if (mo15903t(f)) {
            int q = mo15900q(f);
            if (Intrinsics.areEqual((Object) k, mo15906w(q))) {
                return mo15885a0(q);
            }
            return null;
        } else if (!mo15904u(f)) {
            return null;
        } else {
            C8489u Q = mo15874Q(mo15875R(f));
            if (i2 == 30) {
                return Q.mo15892i(k);
            }
            return Q.mo15901r(i, k, i2 + 5);
        }
    }

    @C12579k
    /* renamed from: s */
    public final Object[] mo15902s() {
        return this.f22878d;
    }

    /* renamed from: t */
    public final boolean mo15903t(int i) {
        return (i & this.f22875a) != 0;
    }

    /* renamed from: u */
    public final boolean mo15904u(int i) {
        return (i & this.f22876b) != 0;
    }

    /* renamed from: v */
    public final C8489u<K, V> mo15905v(int i, K k, V v) {
        return new C8489u<>(i | this.f22875a, this.f22876b, C8495y.m30776g(this.f22878d, mo15900q(i), k, v));
    }

    /* renamed from: w */
    public final K mo15906w(int i) {
        return this.f22878d[i];
    }

    /* renamed from: x */
    public final C8489u<K, V> mo15907x(int i, K k, V v, int i2, K k2, V v2, int i3, C8535f fVar) {
        int i4 = i3;
        C8535f fVar2 = fVar;
        if (i4 > 30) {
            return new C8489u<>(0, 0, new Object[]{k, v, k2, v2}, fVar2);
        }
        int i5 = i;
        int f = C8495y.m30775f(i, i4);
        int f2 = C8495y.m30775f(i2, i4);
        if (f != f2) {
            return new C8489u<>((1 << f) | (1 << f2), 0, f < f2 ? new Object[]{k, v, k2, v2} : new Object[]{k2, v2, k, v}, fVar2);
        }
        return new C8489u<>(0, 1 << f, new Object[]{mo15907x(i, k, v, i2, k2, v2, i4 + 5, fVar)}, fVar2);
    }

    /* renamed from: y */
    public final C8489u<K, V> mo15908y(int i, int i2, int i3, K k, V v, int i4) {
        return new C8489u<>(this.f22875a ^ i2, i2 | this.f22876b, mo15889f(i, i2, i3, k, v, i4, (C8535f) null));
    }

    /* renamed from: z */
    public final C8489u<K, V> mo15909z(K k, V v, C8474f<K, V> fVar) {
        C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, this.f22878d.length), 2);
        int r = B1.mo23049r();
        int w = B1.mo23051w();
        int y = B1.mo23052y();
        if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
            while (!Intrinsics.areEqual((Object) k, mo15906w(r))) {
                if (r != w) {
                    r += y;
                }
            }
            fVar.mo15828n(mo15885a0(r));
            if (this.f22877c == fVar.mo15825j()) {
                this.f22878d[r + 1] = v;
                return this;
            }
            fVar.mo15826l(fVar.mo15821f() + 1);
            Object[] objArr = this.f22878d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[r + 1] = v;
            return new C8489u<>(0, 0, copyOf, fVar.mo15825j());
        }
        fVar.mo15829o(fVar.size() + 1);
        return new C8489u<>(0, 0, C8495y.m30776g(this.f22878d, 0, k, v), fVar.mo15825j());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8489u(int i, int i2, @C12579k Object[] objArr) {
        this(i, i2, objArr, (C8535f) null);
        Intrinsics.checkNotNullParameter(objArr, "buffer");
    }
}
