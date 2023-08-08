package androidx.compose.runtime;

import androidx.compose.runtime.tooling.C8679a;
import androidx.compose.runtime.tooling.C8680b;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.automation.actions.CancelSchedulesAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3443:1\n146#1,8:3486\n162#1,4:3494\n167#1,3:3504\n4513#2,5:3444\n4513#2,5:3449\n4513#2,5:3454\n4513#2,5:3466\n4513#2,5:3471\n4513#2,5:3476\n4513#2,5:3481\n1#3:3459\n3323#4,6:3460\n33#5,6:3498\n33#5,6:3507\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n310#1:3486,8\n338#1:3494,4\n338#1:3504,3\n190#1:3444,5\n191#1:3449,5\n207#1:3454,5\n221#1:3466,5\n241#1:3471,5\n242#1:3476,5\n251#1:3481,5\n209#1:3460,6\n340#1:3498,6\n477#1:3507,6\n*E\n"})
/* renamed from: androidx.compose.runtime.w1 */
public final class C8692w1 implements C8679a, Iterable<C8680b>, C11345a {
    @C12579k

    /* renamed from: a */
    public int[] f23268a = new int[0];

    /* renamed from: b */
    public int f23269b;
    @C12579k

    /* renamed from: c */
    public Object[] f23270c = new Object[0];

    /* renamed from: d */
    public int f23271d;

    /* renamed from: e */
    public int f23272e;

    /* renamed from: f */
    public boolean f23273f;

    /* renamed from: g */
    public int f23274g;
    @C12579k

    /* renamed from: v */
    public ArrayList<C8412c> f23275v = new ArrayList<>();

    /* renamed from: P0 */
    public static final int m31982P0(Ref.IntRef intRef, C8692w1 w1Var, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i4 = intRef.element;
        int i5 = i4 + 1;
        intRef.element = i5;
        int w = C8698y1.m32099h0(w1Var.f23268a, i4);
        boolean z11 = false;
        if (w == i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i6 = C8698y1.m32074Q(w1Var.f23268a, i4) + i4;
            if (i6 <= w1Var.f23269b) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i6 <= i2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    int f = C8698y1.m32069L(w1Var.f23268a, i4);
                    if (i4 >= w1Var.f23269b - 1) {
                        i3 = w1Var.f23271d;
                    } else {
                        i3 = C8698y1.m32069L(w1Var.f23268a, i5);
                    }
                    if (i3 <= w1Var.f23270c.length) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (f <= i3) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (C8698y1.m32109m0(w1Var.f23268a, i4) <= i3) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (i3 - f >= (C8698y1.m32081X(w1Var.f23268a, i4) ? 1 : 0) + (C8698y1.m32079V(w1Var.f23268a, i4) ? 1 : 0) + (C8698y1.m32077T(w1Var.f23268a, i4) ? 1 : 0)) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    boolean o = C8698y1.m32081X(w1Var.f23268a, i4);
                                    if (!o || w1Var.f23270c[C8698y1.m32095f0(w1Var.f23268a, i4)] != null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        int i7 = 0;
                                        while (intRef.element < i6) {
                                            i7 += m31982P0(intRef, w1Var, i4, i6);
                                        }
                                        int s = C8698y1.m32089c0(w1Var.f23268a, i4);
                                        int i8 = C8698y1.m32074Q(w1Var.f23268a, i4);
                                        if (s == i7) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (z9) {
                                            int i9 = intRef.element - i4;
                                            if (i8 == i9) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                if (C8698y1.m32066I(w1Var.f23268a, i4)) {
                                                    if (i4 <= 0 || C8698y1.m32067J(w1Var.f23268a, i)) {
                                                        z11 = true;
                                                    }
                                                    if (!z11) {
                                                        throw new IllegalStateException(("Expected group " + i + " to record it contains a mark because " + i4 + " does").toString());
                                                    }
                                                }
                                                if (o) {
                                                    return 1;
                                                }
                                                return i7;
                                            }
                                            throw new IllegalStateException(("Incorrect slot count detected at " + i4 + ", expected " + i8 + ", received " + i9).toString());
                                        }
                                        throw new IllegalStateException(("Incorrect node count detected at " + i4 + ", expected " + s + ", received " + i7).toString());
                                    }
                                    throw new IllegalStateException(("No node recorded for a node group at " + i4).toString());
                                }
                                throw new IllegalStateException(("Not enough slots added for group " + i4).toString());
                            }
                            throw new IllegalStateException(("Slots start out of range at " + i4).toString());
                        }
                        throw new IllegalStateException(("Invalid data anchor at " + i4).toString());
                    }
                    throw new IllegalStateException(("Slots for " + i4 + " extend past the end of the slot table").toString());
                }
                throw new IllegalStateException(("A group extends past its parent group at " + i4).toString());
            }
            throw new IllegalStateException(("A group extends past the end of the table at " + i4).toString());
        }
        throw new IllegalStateException(("Invalid parent index detected at " + i4 + ", expected parent index to be " + i + " found " + w).toString());
    }

    /* renamed from: m0 */
    public static final int m31983m0(C8692w1 w1Var, int i) {
        return i >= w1Var.f23269b ? w1Var.f23271d : C8698y1.m32069L(w1Var.f23268a, i);
    }

    /* renamed from: z0 */
    public static final void m31984z0(C8689v1 v1Var, int i, List<C8412c> list, Ref.BooleanRef booleanRef, C8692w1 w1Var, List<RecomposeScopeImpl> list2) {
        if (v1Var.mo16820q() == i) {
            list.add(C8689v1.m31922b(v1Var, 0, 1, (Object) null));
            if (booleanRef.element) {
                RecomposeScopeImpl n0 = w1Var.mo16857n0(v1Var.mo16817n());
                if (n0 != null) {
                    list2.add(n0);
                } else {
                    booleanRef.element = false;
                    list2.clear();
                }
            }
            v1Var.mo16801Z();
            return;
        }
        v1Var.mo16804b0();
        while (!v1Var.mo16789N()) {
            m31984z0(v1Var, i, list, booleanRef, w1Var, list2);
        }
        v1Var.mo16811h();
    }

    /* JADX INFO: finally extract failed */
    @C12580l
    /* renamed from: A0 */
    public final List<RecomposeScopeImpl> mo16833A0(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        C8689v1 F0 = mo16836F0();
        try {
            m31984z0(F0, i, arrayList, booleanRef, this, arrayList2);
            C11079d2 d2Var = C11079d2.f28267a;
            F0.mo16808e();
            C8701z1 G0 = mo16837G0();
            try {
                G0.mo16958h1();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C8412c cVar = (C8412c) arrayList.get(i2);
                    if (cVar.mo15342e(G0) >= G0.mo16940Y()) {
                        G0.mo16937W0(cVar);
                        G0.mo16902F();
                    }
                }
                G0.mo16947b1();
                G0.mo16926R();
                G0.mo16908I();
                if (booleanRef.element) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                G0.mo16908I();
                throw th;
            }
        } catch (Throwable th2) {
            F0.mo16808e();
            throw th2;
        }
    }

    /* renamed from: B0 */
    public final List<Integer> mo16834B0() {
        return C8698y1.m32083Z(this.f23268a, this.f23269b * 5);
    }

    /* renamed from: C0 */
    public final List<Integer> mo16835C0() {
        return C8698y1.m32091d0(this.f23268a, this.f23269b * 5);
    }

    @C12579k
    /* renamed from: F0 */
    public final C8689v1 mo16836F0() {
        if (!this.f23273f) {
            this.f23272e++;
            return new C8689v1(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    @C12579k
    /* renamed from: G0 */
    public final C8701z1 mo16837G0() {
        boolean z;
        if (!this.f23273f) {
            if (this.f23272e <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f23273f = true;
                this.f23274g++;
                return new C8701z1(this);
            }
            ComposerKt.m29774A("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.m29774A("Cannot start a writer when another writer is pending".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: H0 */
    public final boolean mo16838H0(@C12579k C8412c cVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        if (!cVar.mo15339b()) {
            return false;
        }
        int y = C8698y1.m32105k0(this.f23275v, cVar.mo15338a(), this.f23269b);
        if (y < 0 || !Intrinsics.areEqual((Object) this.f23275v.get(y), (Object) cVar)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: I0 */
    public final List<Integer> mo16839I0() {
        return C8698y1.m32101i0(this.f23268a, this.f23269b * 5);
    }

    /* renamed from: J0 */
    public final <T> T mo16840J0(@C12579k C11300l<? super C8689v1, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C8689v1 F0 = mo16836F0();
        try {
            return lVar.invoke(F0);
        } finally {
            C11322b0.m43481d(1);
            F0.mo16808e();
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: K0 */
    public final void mo16841K0(@C12579k ArrayList<C8412c> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.f23275v = arrayList;
    }

    /* renamed from: L0 */
    public final void mo16842L0(@C12579k int[] iArr, int i, @C12579k Object[] objArr, int i2, @C12579k ArrayList<C8412c> arrayList) {
        Intrinsics.checkNotNullParameter(iArr, CancelSchedulesAction.f23547k);
        Intrinsics.checkNotNullParameter(objArr, "slots");
        Intrinsics.checkNotNullParameter(arrayList, "anchors");
        this.f23268a = iArr;
        this.f23269b = i;
        this.f23270c = objArr;
        this.f23271d = i2;
        this.f23275v = arrayList;
    }

    /* renamed from: M0 */
    public final void mo16843M0(int i) {
        this.f23274g = i;
    }

    @C12579k
    /* renamed from: N0 */
    public final List<Object> mo16844N0(int i) {
        int i2;
        int f = C8698y1.m32069L(this.f23268a, i);
        int i3 = i + 1;
        if (i3 < this.f23269b) {
            i2 = C8698y1.m32069L(this.f23268a, i3);
        } else {
            i2 = this.f23270c.length;
        }
        return ArraysKt___ArraysKt.m39955kz(this.f23270c).subList(f, i2);
    }

    /* renamed from: O0 */
    public final void mo16845O0() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        Ref.IntRef intRef = new Ref.IntRef();
        int i3 = -1;
        if (this.f23269b > 0) {
            while (true) {
                i = intRef.element;
                i2 = this.f23269b;
                if (i >= i2) {
                    break;
                }
                m31982P0(intRef, this, -1, i + C8698y1.m32074Q(this.f23268a, i));
            }
            if (i == i2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalStateException(("Incomplete group at root " + intRef.element + " expected to be " + this.f23269b).toString());
            }
        }
        ArrayList<C8412c> arrayList = this.f23275v;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int d = arrayList.get(i4).mo15341d(this);
            if (d < 0 || d > this.f23269b) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (i3 < d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i4++;
                    i3 = d;
                } else {
                    throw new IllegalArgumentException("Anchor is out of order".toString());
                }
            } else {
                throw new IllegalArgumentException("Invalid anchor, location out of bound".toString());
            }
        }
    }

    /* renamed from: R0 */
    public final <T> T mo16846R0(@C12579k C11300l<? super C8701z1, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C8701z1 G0 = mo16837G0();
        try {
            return lVar.invoke(G0);
        } finally {
            C11322b0.m43481d(1);
            G0.mo16908I();
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: W */
    public final int mo16847W() {
        return this.f23271d;
    }

    /* renamed from: X */
    public final int mo16848X(@C12579k C8412c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        if (!(!this.f23273f)) {
            ComposerKt.m29774A("Use active SlotWriter to determine anchor location instead".toString());
            throw new KotlinNothingValueException();
        } else if (cVar.mo15339b()) {
            return cVar.mo15338a();
        } else {
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
    }

    @C12580l
    /* renamed from: e */
    public C8680b mo16758e(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "identityToFind");
        return new C8695x1(this, 0, 0, 4, (DefaultConstructorMarker) null).mo16758e(obj);
    }

    @C12579k
    /* renamed from: e0 */
    public final String mo16849e0() {
        if (this.f23273f) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(10);
        int i = this.f23269b;
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                i2 += mo16856l0(sb, i2, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: f0 */
    public final void mo16850f0(@C12579k C8689v1 v1Var) {
        boolean z;
        Intrinsics.checkNotNullParameter(v1Var, "reader");
        if (v1Var.mo16778C() != this || this.f23272e <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f23272e--;
        } else {
            ComposerKt.m29774A("Unexpected reader close()".toString());
            throw new KotlinNothingValueException();
        }
    }

    @C12579k
    /* renamed from: h */
    public Iterable<C8680b> mo16759h() {
        return this;
    }

    /* renamed from: h0 */
    public final void mo16851h0(@C12579k C8701z1 z1Var, @C12579k int[] iArr, int i, @C12579k Object[] objArr, int i2, @C12579k ArrayList<C8412c> arrayList) {
        boolean z;
        Intrinsics.checkNotNullParameter(z1Var, "writer");
        Intrinsics.checkNotNullParameter(iArr, CancelSchedulesAction.f23547k);
        Intrinsics.checkNotNullParameter(objArr, "slots");
        Intrinsics.checkNotNullParameter(arrayList, "anchors");
        if (z1Var.mo16946b0() != this || !this.f23273f) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f23273f = false;
            mo16842L0(iArr, i, objArr, i2, arrayList);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    @C12579k
    /* renamed from: i */
    public final C8412c mo16852i(int i) {
        if (!this.f23273f) {
            boolean z = false;
            if (i >= 0 && i < this.f23269b) {
                z = true;
            }
            if (z) {
                ArrayList<C8412c> arrayList = this.f23275v;
                int y = C8698y1.m32105k0(arrayList, i, this.f23269b);
                if (y < 0) {
                    C8412c cVar = new C8412c(i);
                    arrayList.add(-(y + 1), cVar);
                    return cVar;
                }
                C8412c cVar2 = arrayList.get(y);
                Intrinsics.checkNotNullExpressionValue(cVar2, "get(location)");
                return cVar2;
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ComposerKt.m29774A("use active SlotWriter to create an anchor location instead ".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: i0 */
    public final boolean mo16853i0() {
        return this.f23269b > 0 && C8698y1.m32067J(this.f23268a, 0);
    }

    public boolean isEmpty() {
        return this.f23269b == 0;
    }

    @C12579k
    public Iterator<C8680b> iterator() {
        return new C8571j0(this, 0, this.f23269b);
    }

    /* renamed from: j0 */
    public final List<Integer> mo16855j0() {
        return C8698y1.m32070M(this.f23268a, this.f23269b * 5);
    }

    /* renamed from: l0 */
    public final int mo16856l0(StringBuilder sb, int i, int i2) {
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i);
        sb.append(") key=");
        sb.append(C8698y1.m32082Y(this.f23268a, i));
        int i4 = C8698y1.m32074Q(this.f23268a, i);
        sb.append(", nodes=");
        sb.append(C8698y1.m32089c0(this.f23268a, i));
        sb.append(", size=");
        sb.append(i4);
        if (C8698y1.m32078U(this.f23268a, i)) {
            sb.append(", mark");
        }
        if (C8698y1.m32067J(this.f23268a, i)) {
            sb.append(", contains mark");
        }
        int m0 = m31983m0(this, i);
        int i5 = i + 1;
        int m02 = m31983m0(this, i5);
        if (m0 >= 0 && m0 <= m02) {
            z = true;
        }
        if (!z || m02 > this.f23271d) {
            sb.append(", *invalid data offsets " + m0 + '-' + m02 + '*');
        } else {
            if (C8698y1.m32079V(this.f23268a, i)) {
                sb.append(" objectKey=" + this.f23270c[C8698y1.m32097g0(this.f23268a, i)]);
            }
            if (C8698y1.m32081X(this.f23268a, i)) {
                sb.append(" node=" + this.f23270c[C8698y1.m32095f0(this.f23268a, i)]);
            }
            if (C8698y1.m32077T(this.f23268a, i)) {
                sb.append(" aux=" + this.f23270c[C8698y1.m32065H(this.f23268a, i)]);
            }
            int z2 = C8698y1.m32109m0(this.f23268a, i);
            if (z2 < m02) {
                sb.append(", slots=[");
                sb.append(z2);
                sb.append(": ");
                for (int i6 = z2; i6 < m02; i6++) {
                    if (i6 != z2) {
                        sb.append(", ");
                    }
                    sb.append(String.valueOf(this.f23270c[i6]));
                }
                sb.append("]");
            }
        }
        sb.append(10);
        int i7 = i + i4;
        while (i5 < i7) {
            i5 += mo16856l0(sb, i5, i2 + 1);
        }
        return i4;
    }

    /* renamed from: n0 */
    public final RecomposeScopeImpl mo16857n0(int i) {
        while (i > 0) {
            Iterator<Object> it = new C8699z(this, i).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    return (RecomposeScopeImpl) next;
                }
            }
            i = C8698y1.m32099h0(this.f23268a, i);
        }
        return null;
    }

    @C12579k
    /* renamed from: o0 */
    public final ArrayList<C8412c> mo16858o0() {
        return this.f23275v;
    }

    @C12579k
    /* renamed from: p0 */
    public final int[] mo16859p0() {
        return this.f23268a;
    }

    /* renamed from: r0 */
    public final int mo16860r0() {
        return this.f23269b;
    }

    @C12579k
    /* renamed from: s0 */
    public final Object[] mo16861s0() {
        return this.f23270c;
    }

    /* renamed from: t0 */
    public final int mo16862t0() {
        return this.f23274g;
    }

    /* renamed from: u0 */
    public final boolean mo16863u0() {
        return this.f23273f;
    }

    /* renamed from: v0 */
    public final boolean mo16864v0(int i, @C12579k C8412c cVar) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        if (!this.f23273f) {
            if (i < 0 || i >= this.f23269b) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (mo16838H0(cVar)) {
                    int i2 = C8698y1.m32074Q(this.f23268a, i) + i;
                    int a = cVar.mo15338a();
                    if (i > a || a >= i2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        return true;
                    }
                }
                return false;
            }
            ComposerKt.m29774A("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.m29774A("Writer is active".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: w0 */
    public final List<Integer> mo16865w0() {
        return C8698y1.m32075R(this.f23268a, this.f23269b * 5);
    }

    /* renamed from: y0 */
    public final boolean mo16866y0(int i) {
        while (i >= 0) {
            Iterator<Object> it = new C8699z(this, i).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    recomposeScopeImpl.mo15197D(true);
                    if (recomposeScopeImpl.mo15217t((Object) null) != InvalidationResult.IGNORED) {
                        return true;
                    }
                    return false;
                }
            }
            i = C8698y1.m32099h0(this.f23268a, i);
        }
        return false;
    }
}
