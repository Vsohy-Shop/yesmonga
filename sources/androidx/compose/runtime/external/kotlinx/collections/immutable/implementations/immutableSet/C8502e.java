package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8531b;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8535f;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12541#6,2:963\n26#7:974\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n849#1:974\n*E\n"})
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e */
public final class C8502e<E> {
    @C12579k

    /* renamed from: d */
    public static final C8503a f22911d = new C8503a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: e */
    public static final C8502e f22912e = new C8502e(0, new Object[0]);

    /* renamed from: a */
    public int f22913a;
    @C12579k

    /* renamed from: b */
    public Object[] f22914b;
    @C12580l

    /* renamed from: c */
    public C8535f f22915c;

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e$a */
    public static final class C8503a {
        public /* synthetic */ C8503a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8502e mo16002a() {
            return C8502e.f22912e;
        }

        public C8503a() {
        }
    }

    public C8502e(int i, @C12579k Object[] objArr, @C12580l C8535f fVar) {
        Intrinsics.checkNotNullParameter(objArr, "buffer");
        this.f22913a = i;
        this.f22914b = objArr;
        this.f22915c = fVar;
    }

    /* renamed from: A */
    public final Object mo15961A(C8502e<E> eVar, C8531b bVar, C8535f fVar) {
        Object[] objArr;
        boolean z;
        if (this == eVar) {
            bVar.mo16116e(this.f22914b.length);
            return f22912e;
        }
        if (Intrinsics.areEqual((Object) fVar, (Object) this.f22915c)) {
            objArr = this.f22914b;
        } else {
            objArr = new Object[this.f22914b.length];
        }
        Object[] objArr2 = this.f22914b;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i >= objArr2.length) {
                break;
            }
            if (i2 <= i) {
                z = true;
            } else {
                z = false;
            }
            C8530a.m30952a(z);
            if (!eVar.mo15981f(objArr2[i])) {
                objArr[0 + i2] = objArr2[i];
                i2++;
                if (0 + i2 > objArr.length) {
                    z2 = false;
                }
                C8530a.m30952a(z2);
            }
            i++;
        }
        bVar.mo16116e(this.f22914b.length - i2);
        if (i2 == 0) {
            return f22912e;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.f22914b.length) {
            return this;
        }
        if (i2 == objArr.length) {
            return new C8502e(0, objArr, fVar);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return new C8502e(0, copyOf, fVar);
    }

    /* renamed from: B */
    public final C8502e<E> mo15962B(int i, C8535f fVar) {
        if (this.f22915c != fVar) {
            return new C8502e<>(0, TrieNodeKt.m30788g(this.f22914b, i), fVar);
        }
        this.f22914b = TrieNodeKt.m30788g(this.f22914b, i);
        return this;
    }

    /* renamed from: C */
    public final Object mo15963C(C8502e<E> eVar, C8531b bVar, C8535f fVar) {
        Object[] objArr;
        boolean z;
        if (this == eVar) {
            bVar.mo16116e(this.f22914b.length);
            return this;
        }
        if (Intrinsics.areEqual((Object) fVar, (Object) this.f22915c)) {
            objArr = this.f22914b;
        } else {
            objArr = new Object[Math.min(this.f22914b.length, eVar.f22914b.length)];
        }
        Object[] objArr2 = this.f22914b;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i >= objArr2.length) {
                break;
            }
            if (i2 <= i) {
                z = true;
            } else {
                z = false;
            }
            C8530a.m30952a(z);
            if (eVar.mo15981f(objArr2[i])) {
                objArr[0 + i2] = objArr2[i];
                i2++;
                if (0 + i2 > objArr.length) {
                    z2 = false;
                }
                C8530a.m30952a(z2);
            }
            i++;
        }
        bVar.mo16116e(i2);
        if (i2 == 0) {
            return f22912e;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.f22914b.length) {
            return this;
        }
        if (i2 == eVar.f22914b.length) {
            return eVar;
        }
        if (i2 == objArr.length) {
            return new C8502e(0, objArr, fVar);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return new C8502e(0, copyOf, fVar);
    }

    /* renamed from: D */
    public final C8502e<E> mo15964D(int i, int i2, E e, int i3, C8535f fVar) {
        if (this.f22915c == fVar) {
            this.f22914b[i] = mo15994s(i, i2, e, i3, fVar);
            return this;
        }
        Object[] objArr = this.f22914b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = mo15994s(i, i2, e, i3, fVar);
        return new C8502e<>(this.f22913a, copyOf, fVar);
    }

    @C12579k
    /* renamed from: E */
    public final C8502e<E> mo15965E(int i, E e, int i2, @C12579k C8499b<?> bVar) {
        C8502e<?> eVar;
        Intrinsics.checkNotNullParameter(bVar, "mutator");
        int f = 1 << TrieNodeKt.m30787f(i, i2);
        if (mo15991p(f)) {
            return this;
        }
        int q = mo15992q(f);
        Object obj = this.f22914b[q];
        if (obj instanceof C8502e) {
            C8502e<?> J = mo15970J(q);
            if (i2 == 30) {
                eVar = J.mo16001z(e, bVar);
            } else {
                eVar = J.mo15965E(i, e, i2 + 5, bVar);
            }
            if (this.f22915c == bVar.mo15944r() || J != eVar) {
                return mo15969I(q, eVar, bVar.mo15944r());
            }
            return this;
        } else if (!Intrinsics.areEqual((Object) e, obj)) {
            return this;
        } else {
            bVar.mo15948w(bVar.size() - 1);
            return mo15967G(q, f, bVar.mo15944r());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c0, code lost:
        if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e) == false) goto L_0x00ef;
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo15966F(@org.jetbrains.annotations.C12579k androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e<E> r17, int r18, @org.jetbrains.annotations.C12579k androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8531b r19, @org.jetbrains.annotations.C12579k androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8499b<?> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            java.lang.String r5 = "otherNode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "intersectionSizeRef"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "mutator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            if (r0 != r1) goto L_0x0025
            int r1 = r16.mo15979d()
            r3.mo16116e(r1)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r1 = f22912e
            return r1
        L_0x0025:
            r5 = 30
            if (r2 <= r5) goto L_0x0032
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f r2 = r20.mo15944r()
            java.lang.Object r1 = r0.mo15961A(r1, r3, r2)
            return r1
        L_0x0032:
            int r5 = r0.f22913a
            int r6 = r1.f22913a
            r5 = r5 & r6
            if (r5 != 0) goto L_0x003a
            return r0
        L_0x003a:
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f r6 = r0.f22915c
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f r7 = r20.mo15944r()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0048
            r6 = r0
            goto L_0x005f
        L_0x0048:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r6 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e
            int r7 = r0.f22913a
            java.lang.Object[] r8 = r0.f22914b
            int r9 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            java.lang.String r9 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f r9 = r20.mo15944r()
            r6.<init>(r7, r8, r9)
        L_0x005f:
            int r7 = r0.f22913a
        L_0x0061:
            if (r5 == 0) goto L_0x00fb
            int r10 = java.lang.Integer.lowestOneBit(r5)
            int r11 = r0.mo15992q(r10)
            int r12 = r1.mo15992q(r10)
            java.lang.Object[] r13 = r0.f22914b
            r13 = r13[r11]
            java.lang.Object[] r14 = r1.f22914b
            r12 = r14[r12]
            boolean r14 = r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e
            boolean r15 = r12 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e
            java.lang.String r8 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>"
            if (r14 == 0) goto L_0x0092
            if (r15 == 0) goto L_0x0092
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13, r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r13 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e) r13
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12, r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r12 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e) r12
            int r8 = r2 + 5
            java.lang.Object r13 = r13.mo15966F(r12, r8, r3, r4)
            goto L_0x00ef
        L_0x0092:
            if (r14 == 0) goto L_0x00c5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13, r8)
            r8 = r13
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r8 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e) r8
            int r14 = r20.size()
            if (r12 == 0) goto L_0x00a5
            int r15 = r12.hashCode()
            goto L_0x00a6
        L_0x00a5:
            r15 = 0
        L_0x00a6:
            int r9 = r2 + 5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r8 = r8.mo15965E(r15, r12, r9, r4)
            int r9 = r20.size()
            if (r14 == r9) goto L_0x00ef
            r9 = 1
            r3.mo16116e(r9)
            java.lang.Object[] r12 = r8.f22914b
            int r13 = r12.length
            if (r13 != r9) goto L_0x00c3
            r9 = 0
            r13 = r12[r9]
            boolean r9 = r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e
            if (r9 != 0) goto L_0x00c3
            goto L_0x00ef
        L_0x00c3:
            r13 = r8
            goto L_0x00ef
        L_0x00c5:
            if (r15 == 0) goto L_0x00e3
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12, r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r12 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e) r12
            if (r13 == 0) goto L_0x00d3
            int r8 = r13.hashCode()
            goto L_0x00d4
        L_0x00d3:
            r8 = 0
        L_0x00d4:
            int r9 = r2 + 5
            boolean r8 = r12.mo15984i(r8, r13, r9)
            if (r8 == 0) goto L_0x00ef
            r8 = 1
            r3.mo16116e(r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r13 = f22912e
            goto L_0x00ef
        L_0x00e3:
            r8 = 1
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r12)
            if (r9 == 0) goto L_0x00ef
            r3.mo16116e(r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r13 = f22912e
        L_0x00ef:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r8 = f22912e
            if (r13 != r8) goto L_0x00f4
            r7 = r7 ^ r10
        L_0x00f4:
            java.lang.Object[] r8 = r6.f22914b
            r8[r11] = r13
            r5 = r5 ^ r10
            goto L_0x0061
        L_0x00fb:
            int r1 = java.lang.Integer.bitCount(r7)
            if (r7 != 0) goto L_0x0105
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r6 = f22912e
            goto L_0x0174
        L_0x0105:
            int r3 = r0.f22913a
            if (r7 != r3) goto L_0x0112
            boolean r1 = r6.mo15987l(r0)
            if (r1 == 0) goto L_0x0174
            r6 = r0
            goto L_0x0174
        L_0x0112:
            r9 = 1
            if (r1 != r9) goto L_0x0133
            if (r2 == 0) goto L_0x0133
            java.lang.Object[] r1 = r6.f22914b
            int r2 = r6.mo15992q(r7)
            r6 = r1[r2]
            boolean r1 = r6 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e
            if (r1 == 0) goto L_0x0174
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r1 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r3 = 0
            r2[r3] = r6
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f r3 = r20.mo15944r()
            r1.<init>(r7, r2, r3)
            r6 = r1
            goto L_0x0174
        L_0x0133:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object[] r3 = r6.f22914b
            r5 = 0
            r6 = 0
        L_0x0139:
            int r8 = r3.length
            if (r5 >= r8) goto L_0x016b
            if (r6 > r5) goto L_0x0140
            r8 = r9
            goto L_0x0141
        L_0x0140:
            r8 = 0
        L_0x0141:
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a.m30952a(r8)
            r8 = r3[r5]
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e$a r10 = f22911d
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r10 = r10.mo16002a()
            if (r8 == r10) goto L_0x0150
            r8 = r9
            goto L_0x0151
        L_0x0150:
            r8 = 0
        L_0x0151:
            if (r8 == 0) goto L_0x0167
            r8 = 0
            int r10 = r8 + r6
            r11 = r3[r5]
            r2[r10] = r11
            int r6 = r6 + 1
            int r10 = r8 + r6
            if (r10 > r1) goto L_0x0162
            r10 = r9
            goto L_0x0163
        L_0x0162:
            r10 = r8
        L_0x0163:
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a.m30952a(r10)
            goto L_0x0168
        L_0x0167:
            r8 = 0
        L_0x0168:
            int r5 = r5 + 1
            goto L_0x0139
        L_0x016b:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r6 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f r1 = r20.mo15944r()
            r6.<init>(r7, r2, r1)
        L_0x0174:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e.mo15966F(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b):java.lang.Object");
    }

    /* renamed from: G */
    public final C8502e<E> mo15967G(int i, int i2, C8535f fVar) {
        if (this.f22915c == fVar) {
            this.f22914b = TrieNodeKt.m30788g(this.f22914b, i);
            this.f22913a ^= i2;
            return this;
        }
        return new C8502e<>(i2 ^ this.f22913a, TrieNodeKt.m30788g(this.f22914b, i), fVar);
    }

    @C12580l
    /* renamed from: H */
    public final Object mo15968H(@C12579k C8502e<E> eVar, int i, @C12579k C8531b bVar, @C12579k C8499b<?> bVar2) {
        C8502e eVar2;
        C8502e eVar3;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        C8502e<E> eVar4 = eVar;
        int i4 = i;
        C8531b bVar3 = bVar;
        C8499b<?> bVar4 = bVar2;
        Intrinsics.checkNotNullParameter(eVar4, "otherNode");
        Intrinsics.checkNotNullParameter(bVar3, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(bVar4, "mutator");
        if (this == eVar4) {
            bVar3.mo16116e(mo15979d());
            return this;
        } else if (i4 > 30) {
            return mo15963C(eVar4, bVar3, bVar2.mo15944r());
        } else {
            int i5 = this.f22913a & eVar4.f22913a;
            if (i5 == 0) {
                return f22912e;
            }
            if (!Intrinsics.areEqual((Object) this.f22915c, (Object) bVar2.mo15944r()) || i5 != this.f22913a) {
                eVar2 = new C8502e(i5, new Object[Integer.bitCount(i5)], bVar2.mo15944r());
            } else {
                eVar2 = this;
            }
            int i6 = i5;
            int i7 = 0;
            int i8 = 0;
            while (i6 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i6);
                int q = mo15992q(lowestOneBit);
                int q2 = eVar4.mo15992q(lowestOneBit);
                Object obj = this.f22914b[q];
                Object obj2 = eVar4.f22914b[q2];
                boolean z4 = obj instanceof C8502e;
                boolean z5 = obj2 instanceof C8502e;
                if (z4 && z5) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    obj = ((C8502e) obj).mo15968H((C8502e) obj2, i4 + 5, bVar3, bVar4);
                } else if (z4) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    C8502e eVar5 = (C8502e) obj;
                    if (obj2 != null) {
                        i3 = obj2.hashCode();
                    } else {
                        i3 = 0;
                    }
                    if (eVar5.mo15984i(i3, obj2, i4 + 5)) {
                        bVar3.mo16116e(1);
                        obj = obj2;
                    } else {
                        obj = f22912e;
                    }
                } else if (z5) {
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    C8502e eVar6 = (C8502e) obj2;
                    if (obj != null) {
                        i2 = obj.hashCode();
                    } else {
                        i2 = 0;
                    }
                    if (eVar6.mo15984i(i2, obj, i4 + 5)) {
                        bVar3.mo16116e(1);
                    } else {
                        obj = f22912e;
                    }
                } else if (Intrinsics.areEqual(obj, obj2)) {
                    bVar3.mo16116e(1);
                } else {
                    obj = f22912e;
                }
                if (obj != f22912e) {
                    i7 |= lowestOneBit;
                }
                eVar2.f22914b[i8] = obj;
                i8++;
                i6 ^= lowestOneBit;
            }
            int bitCount = Integer.bitCount(i7);
            if (i7 == 0) {
                return f22912e;
            }
            if (i7 != i5) {
                if (bitCount != 1 || i4 == 0) {
                    Object[] objArr = new Object[bitCount];
                    Object[] objArr2 = eVar2.f22914b;
                    int i9 = 0;
                    for (int i10 = 0; i10 < objArr2.length; i10++) {
                        if (i9 <= i10) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C8530a.m30952a(z);
                        if (objArr2[i10] != f22911d.mo16002a()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            objArr[0 + i9] = objArr2[i10];
                            i9++;
                            if (0 + i9 <= bitCount) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            C8530a.m30952a(z3);
                        }
                    }
                    eVar3 = new C8502e(i7, objArr, bVar2.mo15944r());
                } else {
                    Object obj3 = eVar2.f22914b[eVar2.mo15992q(i7)];
                    if (!(obj3 instanceof C8502e)) {
                        return obj3;
                    }
                    eVar3 = new C8502e(i7, new Object[]{obj3}, bVar2.mo15944r());
                }
                return eVar3;
            } else if (eVar2.mo15987l(this)) {
                return this;
            } else {
                if (eVar2.mo15987l(eVar4)) {
                    return eVar4;
                }
                return eVar2;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e<E> mo15969I(int r4, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e<E> r5, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8535f r6) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r5.f22914b
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x0018
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e
            if (r1 != 0) goto L_0x0018
            java.lang.Object[] r1 = r3.f22914b
            int r1 = r1.length
            if (r1 != r2) goto L_0x0017
            int r4 = r3.f22913a
            r5.f22913a = r4
            return r5
        L_0x0017:
            r5 = r0
        L_0x0018:
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f r0 = r3.f22915c
            if (r0 != r6) goto L_0x0021
            java.lang.Object[] r6 = r3.f22914b
            r6[r4] = r5
            return r3
        L_0x0021:
            java.lang.Object[] r0 = r3.f22914b
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0[r4] = r5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r4 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e
            int r5 = r3.f22913a
            r4.<init>(r5, r0, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e.mo15969I(int, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e");
    }

    /* renamed from: J */
    public final C8502e<E> mo15970J(int i) {
        Object obj = this.f22914b[i];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (C8502e) obj;
    }

    @C12579k
    /* renamed from: K */
    public final C8502e<E> mo15971K(int i, E e, int i2) {
        C8502e eVar;
        int f = 1 << TrieNodeKt.m30787f(i, i2);
        if (mo15991p(f)) {
            return this;
        }
        int q = mo15992q(f);
        Object obj = this.f22914b[q];
        if (obj instanceof C8502e) {
            C8502e J = mo15970J(q);
            if (i2 == 30) {
                eVar = J.mo15982g(e);
            } else {
                eVar = J.mo15971K(i, e, i2 + 5);
            }
            if (J == eVar) {
                return this;
            }
            return mo15976P(q, eVar);
        } else if (Intrinsics.areEqual((Object) e, obj)) {
            return mo15972L(q, f);
        } else {
            return this;
        }
    }

    /* renamed from: L */
    public final C8502e<E> mo15972L(int i, int i2) {
        return new C8502e<>(i2 ^ this.f22913a, TrieNodeKt.m30788g(this.f22914b, i));
    }

    /* renamed from: M */
    public final void mo15973M(int i) {
        this.f22913a = i;
    }

    /* renamed from: N */
    public final void mo15974N(@C12579k Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f22914b = objArr;
    }

    /* renamed from: O */
    public final void mo15975O(@C12580l C8535f fVar) {
        this.f22915c = fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e<E> mo15976P(int r4, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e<E> r5) {
        /*
            r3 = this;
            java.lang.Object[] r0 = r5.f22914b
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x0018
            r1 = 0
            r0 = r0[r1]
            boolean r1 = r0 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e
            if (r1 != 0) goto L_0x0018
            java.lang.Object[] r1 = r3.f22914b
            int r1 = r1.length
            if (r1 != r2) goto L_0x0017
            int r4 = r3.f22913a
            r5.f22913a = r4
            return r5
        L_0x0017:
            r5 = r0
        L_0x0018:
            java.lang.Object[] r0 = r3.f22914b
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0[r4] = r5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r4 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e
            int r5 = r3.f22913a
            r4.<init>(r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e.mo15976P(int, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e");
    }

    @C12579k
    /* renamed from: b */
    public final C8502e<E> mo15977b(int i, E e, int i2) {
        C8502e eVar;
        int f = 1 << TrieNodeKt.m30787f(i, i2);
        if (mo15991p(f)) {
            return mo15978c(f, e);
        }
        int q = mo15992q(f);
        Object obj = this.f22914b[q];
        if (obj instanceof C8502e) {
            C8502e J = mo15970J(q);
            if (i2 == 30) {
                eVar = J.mo15980e(e);
            } else {
                eVar = J.mo15977b(i, e, i2 + 5);
            }
            if (J == eVar) {
                return this;
            }
            return mo15976P(q, eVar);
        } else if (Intrinsics.areEqual((Object) e, obj)) {
            return this;
        } else {
            return mo15995t(q, i, e, i2);
        }
    }

    /* renamed from: c */
    public final C8502e<E> mo15978c(int i, E e) {
        return new C8502e<>(i | this.f22913a, TrieNodeKt.m30784c(this.f22914b, mo15992q(i), e));
    }

    /* renamed from: d */
    public final int mo15979d() {
        int i;
        if (this.f22913a == 0) {
            return this.f22914b.length;
        }
        int i2 = 0;
        for (Object obj : this.f22914b) {
            if (obj instanceof C8502e) {
                i = ((C8502e) obj).mo15979d();
            } else {
                i = 1;
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: e */
    public final C8502e<E> mo15980e(E e) {
        if (mo15981f(e)) {
            return this;
        }
        return new C8502e<>(0, TrieNodeKt.m30784c(this.f22914b, 0, e));
    }

    /* renamed from: f */
    public final boolean mo15981f(E e) {
        return ArraysKt___ArraysKt.m39388T8(this.f22914b, e);
    }

    /* renamed from: g */
    public final C8502e<E> mo15982g(E e) {
        int jg = ArraysKt___ArraysKt.m39905jg(this.f22914b, e);
        if (jg != -1) {
            return mo15983h(jg);
        }
        return this;
    }

    /* renamed from: h */
    public final C8502e<E> mo15983h(int i) {
        return new C8502e<>(0, TrieNodeKt.m30788g(this.f22914b, i));
    }

    /* renamed from: i */
    public final boolean mo15984i(int i, E e, int i2) {
        int f = 1 << TrieNodeKt.m30787f(i, i2);
        if (mo15991p(f)) {
            return false;
        }
        int q = mo15992q(f);
        Object obj = this.f22914b[q];
        if (!(obj instanceof C8502e)) {
            return Intrinsics.areEqual((Object) e, obj);
        }
        C8502e J = mo15970J(q);
        if (i2 == 30) {
            return J.mo15981f(e);
        }
        return J.mo15984i(i, e, i2 + 5);
    }

    /* renamed from: j */
    public final boolean mo15985j(@C12579k C8502e<E> eVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(eVar, "otherNode");
        if (this == eVar) {
            return true;
        }
        if (i > 30) {
            for (Object T8 : eVar.f22914b) {
                if (!ArraysKt___ArraysKt.m39388T8(this.f22914b, T8)) {
                    return false;
                }
            }
            return true;
        }
        int i3 = this.f22913a;
        int i4 = eVar.f22913a;
        int i5 = i3 & i4;
        if (i5 != i4) {
            return false;
        }
        while (i5 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i5);
            int q = mo15992q(lowestOneBit);
            int q2 = eVar.mo15992q(lowestOneBit);
            Object obj = this.f22914b[q];
            Object obj2 = eVar.f22914b[q2];
            boolean z = obj instanceof C8502e;
            boolean z2 = obj2 instanceof C8502e;
            if (z && z2) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((C8502e) obj).mo15985j((C8502e) obj2, i + 5)) {
                    return false;
                }
            } else if (z) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                C8502e eVar2 = (C8502e) obj;
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                if (!eVar2.mo15984i(i2, obj2, i + 5)) {
                    return false;
                }
            } else if (z2 || !Intrinsics.areEqual(obj, obj2)) {
                return false;
            }
            i5 ^= lowestOneBit;
        }
        return true;
    }

    /* renamed from: k */
    public final E mo15986k(int i) {
        return this.f22914b[i];
    }

    /* renamed from: l */
    public final boolean mo15987l(C8502e<E> eVar) {
        if (this == eVar) {
            return true;
        }
        if (this.f22913a != eVar.f22913a) {
            return false;
        }
        int length = this.f22914b.length;
        for (int i = 0; i < length; i++) {
            if (this.f22914b[i] != eVar.f22914b[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final int mo15988m() {
        return this.f22913a;
    }

    @C12579k
    /* renamed from: n */
    public final Object[] mo15989n() {
        return this.f22914b;
    }

    @C12580l
    /* renamed from: o */
    public final C8535f mo15990o() {
        return this.f22915c;
    }

    /* renamed from: p */
    public final boolean mo15991p(int i) {
        return (i & this.f22913a) == 0;
    }

    /* renamed from: q */
    public final int mo15992q(int i) {
        return Integer.bitCount((i - 1) & this.f22913a);
    }

    /* renamed from: r */
    public final C8502e<E> mo15993r(int i, E e, int i2, E e2, int i3, C8535f fVar) {
        int i4 = i3;
        C8535f fVar2 = fVar;
        if (i4 > 30) {
            return new C8502e<>(0, new Object[]{e, e2}, fVar2);
        }
        int i5 = i;
        int f = TrieNodeKt.m30787f(i, i4);
        int i6 = i2;
        int f2 = TrieNodeKt.m30787f(i2, i4);
        if (f != f2) {
            return new C8502e<>((1 << f) | (1 << f2), f < f2 ? new Object[]{e, e2} : new Object[]{e2, e}, fVar2);
        }
        return new C8502e<>(1 << f, new Object[]{mo15993r(i, e, i2, e2, i4 + 5, fVar)}, fVar2);
    }

    /* renamed from: s */
    public final C8502e<E> mo15994s(int i, int i2, E e, int i3, C8535f fVar) {
        int i4;
        Object k = mo15986k(i);
        if (k != null) {
            i4 = k.hashCode();
        } else {
            i4 = 0;
        }
        return mo15993r(i4, k, i2, e, i3 + 5, fVar);
    }

    /* renamed from: t */
    public final C8502e<E> mo15995t(int i, int i2, E e, int i3) {
        Object[] objArr = this.f22914b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = mo15994s(i, i2, e, i3, (C8535f) null);
        return new C8502e<>(this.f22913a, copyOf);
    }

    @C12579k
    /* renamed from: u */
    public final C8502e<E> mo15996u(int i, E e, int i2, @C12579k C8499b<?> bVar) {
        C8502e<?> eVar;
        Intrinsics.checkNotNullParameter(bVar, "mutator");
        int f = 1 << TrieNodeKt.m30787f(i, i2);
        if (mo15991p(f)) {
            bVar.mo15948w(bVar.size() + 1);
            return mo15998w(f, e, bVar.mo15944r());
        }
        int q = mo15992q(f);
        Object obj = this.f22914b[q];
        if (obj instanceof C8502e) {
            C8502e<?> J = mo15970J(q);
            if (i2 == 30) {
                eVar = J.mo15999x(e, bVar);
            } else {
                eVar = J.mo15996u(i, e, i2 + 5, bVar);
            }
            if (J == eVar) {
                return this;
            }
            return mo15969I(q, eVar, bVar.mo15944r());
        } else if (Intrinsics.areEqual((Object) e, obj)) {
            return this;
        } else {
            bVar.mo15948w(bVar.size() + 1);
            return mo15964D(q, i, e, i2, bVar.mo15944r());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b<?>} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e<E> mo15997v(@org.jetbrains.annotations.C12579k androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e<E> r20, int r21, @org.jetbrains.annotations.C12579k androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8531b r22, @org.jetbrains.annotations.C12579k androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8499b<?> r23) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            java.lang.String r0 = "otherNode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "intersectionSizeRef"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "mutator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            if (r7 != r8) goto L_0x0028
            int r0 = r22.mo16115d()
            int r1 = r19.mo15979d()
            int r0 = r0 + r1
            r10.mo16118f(r0)
            return r7
        L_0x0028:
            r0 = 30
            if (r9 <= r0) goto L_0x0035
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f r0 = r23.mo15944r()
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r0 = r7.mo16000y(r8, r10, r0)
            return r0
        L_0x0035:
            int r0 = r7.f22913a
            int r1 = r8.f22913a
            r1 = r1 | r0
            if (r1 != r0) goto L_0x004a
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f r0 = r7.f22915c
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f r2 = r23.mo15944r()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x004a
            r12 = r7
            goto L_0x005a
        L_0x004a:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r0 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e
            int r2 = java.lang.Integer.bitCount(r1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f r3 = r23.mo15944r()
            r0.<init>(r1, r2, r3)
            r12 = r0
        L_0x005a:
            r13 = 0
            r14 = r1
            r15 = r13
        L_0x005d:
            if (r14 == 0) goto L_0x0144
            int r6 = java.lang.Integer.lowestOneBit(r14)
            int r0 = r7.mo15992q(r6)
            int r1 = r8.mo15992q(r6)
            java.lang.Object[] r5 = r12.f22914b
            boolean r2 = r7.mo15991p(r6)
            if (r2 == 0) goto L_0x007d
            java.lang.Object[] r0 = r8.f22914b
            r0 = r0[r1]
        L_0x0077:
            r18 = r5
            r16 = r6
            goto L_0x013c
        L_0x007d:
            boolean r2 = r8.mo15991p(r6)
            if (r2 == 0) goto L_0x0088
            java.lang.Object[] r1 = r7.f22914b
            r0 = r1[r0]
            goto L_0x0077
        L_0x0088:
            java.lang.Object[] r2 = r7.f22914b
            r2 = r2[r0]
            java.lang.Object[] r0 = r8.f22914b
            r4 = r0[r1]
            boolean r0 = r2 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e
            boolean r1 = r4 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>"
            if (r0 == 0) goto L_0x00ab
            if (r1 == 0) goto L_0x00ab
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r2 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e) r2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r3)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r4 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e) r4
            int r0 = r9 + 5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r0 = r2.mo15997v(r4, r0, r10, r11)
            goto L_0x0077
        L_0x00ab:
            if (r0 == 0) goto L_0x00d7
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r2 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e) r2
            int r0 = r23.size()
            if (r4 == 0) goto L_0x00bd
            int r1 = r4.hashCode()
            goto L_0x00be
        L_0x00bd:
            r1 = r13
        L_0x00be:
            int r3 = r9 + 5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r1 = r2.mo15996u(r1, r4, r3, r11)
            int r2 = r23.size()
            if (r2 != r0) goto L_0x00d3
            int r0 = r22.mo16115d()
            int r0 = r0 + 1
            r10.mo16118f(r0)
        L_0x00d3:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
        L_0x00d5:
            r0 = r1
            goto L_0x0077
        L_0x00d7:
            if (r1 == 0) goto L_0x0102
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r3)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r4 = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e) r4
            int r0 = r23.size()
            if (r2 == 0) goto L_0x00e9
            int r1 = r2.hashCode()
            goto L_0x00ea
        L_0x00e9:
            r1 = r13
        L_0x00ea:
            int r3 = r9 + 5
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r1 = r4.mo15996u(r1, r2, r3, r11)
            int r2 = r23.size()
            if (r2 != r0) goto L_0x00ff
            int r0 = r22.mo16115d()
            int r0 = r0 + 1
            r10.mo16118f(r0)
        L_0x00ff:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x00d5
        L_0x0102:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r0 == 0) goto L_0x0116
            int r0 = r22.mo16115d()
            int r0 = r0 + 1
            r10.mo16118f(r0)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            r0 = r2
            goto L_0x0077
        L_0x0116:
            if (r2 == 0) goto L_0x011e
            int r0 = r2.hashCode()
            r1 = r0
            goto L_0x011f
        L_0x011e:
            r1 = r13
        L_0x011f:
            if (r4 == 0) goto L_0x0127
            int r0 = r4.hashCode()
            r3 = r0
            goto L_0x0128
        L_0x0127:
            r3 = r13
        L_0x0128:
            int r16 = r9 + 5
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.f r17 = r23.mo15944r()
            r0 = r19
            r18 = r5
            r5 = r16
            r16 = r6
            r6 = r17
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e r0 = r0.mo15993r(r1, r2, r3, r4, r5, r6)
        L_0x013c:
            r18[r15] = r0
            int r15 = r15 + 1
            r14 = r14 ^ r16
            goto L_0x005d
        L_0x0144:
            boolean r0 = r7.mo15987l(r12)
            if (r0 == 0) goto L_0x014c
            r12 = r7
            goto L_0x0153
        L_0x014c:
            boolean r0 = r8.mo15987l(r12)
            if (r0 == 0) goto L_0x0153
            r12 = r8
        L_0x0153:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.C8502e.mo15997v(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.b, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e");
    }

    /* renamed from: w */
    public final C8502e<E> mo15998w(int i, E e, C8535f fVar) {
        int q = mo15992q(i);
        if (this.f22915c == fVar) {
            this.f22914b = TrieNodeKt.m30784c(this.f22914b, q, e);
            this.f22913a = i | this.f22913a;
            return this;
        }
        return new C8502e<>(i | this.f22913a, TrieNodeKt.m30784c(this.f22914b, q, e), fVar);
    }

    /* renamed from: x */
    public final C8502e<E> mo15999x(E e, C8499b<?> bVar) {
        if (mo15981f(e)) {
            return this;
        }
        bVar.mo15948w(bVar.size() + 1);
        if (this.f22915c != bVar.mo15944r()) {
            return new C8502e<>(0, TrieNodeKt.m30784c(this.f22914b, 0, e), bVar.mo15944r());
        }
        this.f22914b = TrieNodeKt.m30784c(this.f22914b, 0, e);
        return this;
    }

    /* renamed from: y */
    public final C8502e<E> mo16000y(C8502e<E> eVar, C8531b bVar, C8535f fVar) {
        boolean z;
        if (this == eVar) {
            bVar.mo16116e(this.f22914b.length);
            return this;
        }
        Object[] objArr = this.f22914b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + eVar.f22914b.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        Object[] objArr2 = eVar.f22914b;
        int length = this.f22914b.length;
        int i = 0;
        for (int i2 = 0; i2 < objArr2.length; i2++) {
            boolean z2 = true;
            if (i <= i2) {
                z = true;
            } else {
                z = false;
            }
            C8530a.m30952a(z);
            if (!mo15981f(objArr2[i2])) {
                copyOf[length + i] = objArr2[i2];
                i++;
                if (length + i > copyOf.length) {
                    z2 = false;
                }
                C8530a.m30952a(z2);
            }
        }
        int length2 = i + this.f22914b.length;
        bVar.mo16116e(copyOf.length - length2);
        if (length2 == this.f22914b.length) {
            return this;
        }
        if (length2 == eVar.f22914b.length) {
            return eVar;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        }
        if (!Intrinsics.areEqual((Object) this.f22915c, (Object) fVar)) {
            return new C8502e<>(0, copyOf, fVar);
        }
        this.f22914b = copyOf;
        return this;
    }

    /* renamed from: z */
    public final C8502e<E> mo16001z(E e, C8499b<?> bVar) {
        int jg = ArraysKt___ArraysKt.m39905jg(this.f22914b, e);
        if (jg == -1) {
            return this;
        }
        bVar.mo15948w(bVar.size() - 1);
        return mo15962B(jg, bVar.mo15944r());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8502e(int i, @C12579k Object[] objArr) {
        this(i, objArr, (C8535f) null);
        Intrinsics.checkNotNullParameter(objArr, "buffer");
    }
}
