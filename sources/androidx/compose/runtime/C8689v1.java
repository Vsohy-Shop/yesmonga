package androidx.compose.runtime;

import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3443:1\n1#2:3444\n4513#3,5:3445\n4513#3,5:3450\n4513#3,5:3455\n4513#3,5:3460\n4513#3,5:3465\n3323#4,6:3470\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n949#1:3445,5\n959#1:3450,5\n967#1:3455,5\n986#1:3460,5\n1000#1:3465,5\n1051#1:3470,6\n*E\n"})
/* renamed from: androidx.compose.runtime.v1 */
public final class C8689v1 {
    @C12579k

    /* renamed from: a */
    public final C8692w1 f23253a;
    @C12579k

    /* renamed from: b */
    public final int[] f23254b;

    /* renamed from: c */
    public final int f23255c;
    @C12579k

    /* renamed from: d */
    public final Object[] f23256d;

    /* renamed from: e */
    public final int f23257e;

    /* renamed from: f */
    public boolean f23258f;

    /* renamed from: g */
    public int f23259g;

    /* renamed from: h */
    public int f23260h;

    /* renamed from: i */
    public int f23261i = -1;

    /* renamed from: j */
    public int f23262j;

    /* renamed from: k */
    public int f23263k;

    /* renamed from: l */
    public int f23264l;

    public C8689v1(@C12579k C8692w1 w1Var) {
        Intrinsics.checkNotNullParameter(w1Var, "table");
        this.f23253a = w1Var;
        this.f23254b = w1Var.mo16859p0();
        int r0 = w1Var.mo16860r0();
        this.f23255c = r0;
        this.f23256d = w1Var.mo16861s0();
        this.f23257e = w1Var.mo16847W();
        this.f23260h = r0;
    }

    /* renamed from: b */
    public static /* synthetic */ C8412c m31922b(C8689v1 v1Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = v1Var.f23259g;
        }
        return v1Var.mo16802a(i);
    }

    /* renamed from: A */
    public final int mo16776A() {
        return this.f23255c;
    }

    /* renamed from: B */
    public final int mo16777B() {
        return this.f23263k - C8698y1.m32109m0(this.f23254b, this.f23261i);
    }

    @C12579k
    /* renamed from: C */
    public final C8692w1 mo16778C() {
        return this.f23253a;
    }

    @C12580l
    /* renamed from: D */
    public final Object mo16779D(int i) {
        return mo16805c(this.f23254b, i);
    }

    /* renamed from: E */
    public final int mo16780E(int i) {
        return i + C8698y1.m32074Q(this.f23254b, i);
    }

    @C12580l
    /* renamed from: F */
    public final Object mo16781F(int i) {
        return mo16782G(this.f23259g, i);
    }

    @C12580l
    /* renamed from: G */
    public final Object mo16782G(int i, int i2) {
        int i3;
        int z = C8698y1.m32109m0(this.f23254b, i);
        int i4 = i + 1;
        if (i4 < this.f23255c) {
            i3 = C8698y1.m32069L(this.f23254b, i4);
        } else {
            i3 = this.f23257e;
        }
        int i5 = z + i2;
        if (i5 < i3) {
            return this.f23256d[i5];
        }
        return C8592o.f23032a.mo16277a();
    }

    /* renamed from: H */
    public final int mo16783H(int i) {
        return C8698y1.m32082Y(this.f23254b, i);
    }

    /* renamed from: I */
    public final int mo16784I(@C12579k C8412c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "anchor");
        if (cVar.mo15339b()) {
            return C8698y1.m32082Y(this.f23254b, this.f23253a.mo16848X(cVar));
        }
        return 0;
    }

    @C12580l
    /* renamed from: J */
    public final Object mo16785J(int i) {
        return mo16796U(this.f23254b, i);
    }

    /* renamed from: K */
    public final int mo16786K(int i) {
        return C8698y1.m32074Q(this.f23254b, i);
    }

    /* renamed from: L */
    public final boolean mo16787L(int i) {
        return C8698y1.m32078U(this.f23254b, i);
    }

    /* renamed from: M */
    public final boolean mo16788M(int i) {
        return C8698y1.m32079V(this.f23254b, i);
    }

    /* renamed from: N */
    public final boolean mo16789N() {
        return mo16827w() || this.f23259g == this.f23260h;
    }

    /* renamed from: O */
    public final boolean mo16790O() {
        return C8698y1.m32081X(this.f23254b, this.f23259g);
    }

    /* renamed from: P */
    public final boolean mo16791P(int i) {
        return C8698y1.m32081X(this.f23254b, i);
    }

    @C12580l
    /* renamed from: Q */
    public final Object mo16792Q() {
        int i;
        if (this.f23262j > 0 || (i = this.f23263k) >= this.f23264l) {
            return C8592o.f23032a.mo16277a();
        }
        Object[] objArr = this.f23256d;
        this.f23263k = i + 1;
        return objArr[i];
    }

    @C12580l
    /* renamed from: R */
    public final Object mo16793R(int i) {
        if (C8698y1.m32081X(this.f23254b, i)) {
            return mo16794S(this.f23254b, i);
        }
        return null;
    }

    /* renamed from: S */
    public final Object mo16794S(int[] iArr, int i) {
        if (C8698y1.m32081X(iArr, i)) {
            return this.f23256d[C8698y1.m32095f0(iArr, i)];
        }
        return C8592o.f23032a.mo16277a();
    }

    /* renamed from: T */
    public final int mo16795T(int i) {
        return C8698y1.m32089c0(this.f23254b, i);
    }

    /* renamed from: U */
    public final Object mo16796U(int[] iArr, int i) {
        if (C8698y1.m32079V(iArr, i)) {
            return this.f23256d[C8698y1.m32097g0(iArr, i)];
        }
        return null;
    }

    /* renamed from: V */
    public final int mo16797V(int i) {
        return C8698y1.m32099h0(this.f23254b, i);
    }

    /* renamed from: W */
    public final int mo16798W(int i) {
        boolean z;
        if (i < 0 || i >= this.f23255c) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return C8698y1.m32099h0(this.f23254b, i);
        }
        throw new IllegalArgumentException(("Invalid group index " + i).toString());
    }

    /* renamed from: X */
    public final void mo16799X(int i) {
        boolean z;
        int i2;
        if (this.f23262j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f23259g = i;
            if (i < this.f23255c) {
                i2 = C8698y1.m32099h0(this.f23254b, i);
            } else {
                i2 = -1;
            }
            this.f23261i = i2;
            if (i2 < 0) {
                this.f23260h = this.f23255c;
            } else {
                this.f23260h = i2 + C8698y1.m32074Q(this.f23254b, i2);
            }
            this.f23263k = 0;
            this.f23264l = 0;
            return;
        }
        ComposerKt.m29774A("Cannot reposition while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: Y */
    public final void mo16800Y(int i) {
        boolean z;
        int i2 = C8698y1.m32074Q(this.f23254b, i) + i;
        int i3 = this.f23259g;
        if (i3 < i || i3 > i2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f23261i = i;
            this.f23260h = i2;
            this.f23263k = 0;
            this.f23264l = 0;
            return;
        }
        ComposerKt.m29774A(("Index " + i + " is not a parent of " + i3).toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: Z */
    public final int mo16801Z() {
        boolean z;
        int i = 1;
        if (this.f23262j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!C8698y1.m32081X(this.f23254b, this.f23259g)) {
                i = C8698y1.m32089c0(this.f23254b, this.f23259g);
            }
            int i2 = this.f23259g;
            this.f23259g = i2 + C8698y1.m32074Q(this.f23254b, i2);
            return i;
        }
        ComposerKt.m29774A("Cannot skip while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: a */
    public final C8412c mo16802a(int i) {
        ArrayList<C8412c> o0 = this.f23253a.mo16858o0();
        int y = C8698y1.m32105k0(o0, i, this.f23255c);
        if (y < 0) {
            C8412c cVar = new C8412c(i);
            o0.add(-(y + 1), cVar);
            return cVar;
        }
        C8412c cVar2 = o0.get(y);
        Intrinsics.checkNotNullExpressionValue(cVar2, "get(location)");
        return cVar2;
    }

    /* renamed from: a0 */
    public final void mo16803a0() {
        boolean z;
        if (this.f23262j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f23259g = this.f23260h;
        } else {
            ComposerKt.m29774A("Cannot skip the enclosing group while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: b0 */
    public final void mo16804b0() {
        boolean z;
        int i;
        if (this.f23262j <= 0) {
            if (C8698y1.m32099h0(this.f23254b, this.f23259g) == this.f23261i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = this.f23259g;
                this.f23261i = i2;
                this.f23260h = i2 + C8698y1.m32074Q(this.f23254b, i2);
                int i3 = this.f23259g;
                int i4 = i3 + 1;
                this.f23259g = i4;
                this.f23263k = C8698y1.m32109m0(this.f23254b, i3);
                if (i3 >= this.f23255c - 1) {
                    i = this.f23257e;
                } else {
                    i = C8698y1.m32069L(this.f23254b, i4);
                }
                this.f23264l = i;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    /* renamed from: c */
    public final Object mo16805c(int[] iArr, int i) {
        if (C8698y1.m32077T(iArr, i)) {
            return this.f23256d[C8698y1.m32065H(iArr, i)];
        }
        return C8592o.f23032a.mo16277a();
    }

    /* renamed from: c0 */
    public final void mo16806c0() {
        if (this.f23262j > 0) {
            return;
        }
        if (C8698y1.m32081X(this.f23254b, this.f23259g)) {
            mo16804b0();
            return;
        }
        throw new IllegalArgumentException("Expected a node group".toString());
    }

    /* renamed from: d */
    public final void mo16807d() {
        this.f23262j++;
    }

    /* renamed from: e */
    public final void mo16808e() {
        this.f23258f = true;
        this.f23253a.mo16850f0(this);
    }

    /* renamed from: f */
    public final boolean mo16809f(int i) {
        return C8698y1.m32067J(this.f23254b, i);
    }

    /* renamed from: g */
    public final void mo16810g() {
        boolean z;
        int i = this.f23262j;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f23262j = i - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    /* renamed from: h */
    public final void mo16811h() {
        boolean z;
        int i;
        if (this.f23262j == 0) {
            if (this.f23259g == this.f23260h) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int w = C8698y1.m32099h0(this.f23254b, this.f23261i);
                this.f23261i = w;
                if (w < 0) {
                    i = this.f23255c;
                } else {
                    i = w + C8698y1.m32074Q(this.f23254b, w);
                }
                this.f23260h = i;
                return;
            }
            ComposerKt.m29774A("endGroup() not called at the end of a group".toString());
            throw new KotlinNothingValueException();
        }
    }

    @C12579k
    /* renamed from: i */
    public final List<C8615s0> mo16812i() {
        int i;
        ArrayList arrayList = new ArrayList();
        if (this.f23262j > 0) {
            return arrayList;
        }
        int i2 = this.f23259g;
        int i3 = 0;
        while (i2 < this.f23260h) {
            int p = C8698y1.m32082Y(this.f23254b, i2);
            Object U = mo16796U(this.f23254b, i2);
            if (C8698y1.m32081X(this.f23254b, i2)) {
                i = 1;
            } else {
                i = C8698y1.m32089c0(this.f23254b, i2);
            }
            arrayList.add(new C8615s0(p, U, i2, i, i3));
            i2 += C8698y1.m32074Q(this.f23254b, i2);
            i3++;
        }
        return arrayList;
    }

    /* renamed from: j */
    public final void mo16813j(int i, @C12579k C11304p<? super Integer, Object, C11079d2> pVar) {
        int i2;
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        int z = C8698y1.m32109m0(this.f23254b, i);
        int i3 = i + 1;
        if (i3 < this.f23253a.mo16860r0()) {
            i2 = C8698y1.m32069L(this.f23253a.mo16859p0(), i3);
        } else {
            i2 = this.f23253a.mo16847W();
        }
        for (int i4 = z; i4 < i2; i4++) {
            pVar.invoke(Integer.valueOf(i4 - z), this.f23256d[i4]);
        }
    }

    @C12580l
    /* renamed from: k */
    public final Object mo16814k(int i) {
        int i2 = this.f23263k + i;
        if (i2 < this.f23264l) {
            return this.f23256d[i2];
        }
        return C8592o.f23032a.mo16277a();
    }

    /* renamed from: l */
    public final boolean mo16815l() {
        return this.f23258f;
    }

    /* renamed from: m */
    public final int mo16816m() {
        return this.f23260h;
    }

    /* renamed from: n */
    public final int mo16817n() {
        return this.f23259g;
    }

    @C12580l
    /* renamed from: o */
    public final Object mo16818o() {
        int i = this.f23259g;
        if (i < this.f23260h) {
            return mo16805c(this.f23254b, i);
        }
        return 0;
    }

    /* renamed from: p */
    public final int mo16819p() {
        return this.f23260h;
    }

    /* renamed from: q */
    public final int mo16820q() {
        int i = this.f23259g;
        if (i < this.f23260h) {
            return C8698y1.m32082Y(this.f23254b, i);
        }
        return 0;
    }

    @C12580l
    /* renamed from: r */
    public final Object mo16821r() {
        int i = this.f23259g;
        if (i < this.f23260h) {
            return mo16794S(this.f23254b, i);
        }
        return null;
    }

    @C12580l
    /* renamed from: s */
    public final Object mo16822s() {
        int i = this.f23259g;
        if (i < this.f23260h) {
            return mo16796U(this.f23254b, i);
        }
        return null;
    }

    /* renamed from: t */
    public final int mo16823t() {
        return C8698y1.m32074Q(this.f23254b, this.f23259g);
    }

    @C12579k
    public String toString() {
        return "SlotReader(current=" + this.f23259g + ", key=" + mo16820q() + ", parent=" + this.f23261i + ", end=" + this.f23260h + ')';
    }

    /* renamed from: u */
    public final int mo16825u() {
        int i;
        int i2 = this.f23259g;
        int z = C8698y1.m32109m0(this.f23254b, i2);
        int i3 = i2 + 1;
        if (i3 < this.f23255c) {
            i = C8698y1.m32069L(this.f23254b, i3);
        } else {
            i = this.f23257e;
        }
        return i - z;
    }

    /* renamed from: v */
    public final int mo16826v() {
        return this.f23263k - C8698y1.m32109m0(this.f23254b, this.f23261i);
    }

    /* renamed from: w */
    public final boolean mo16827w() {
        return this.f23262j > 0;
    }

    /* renamed from: x */
    public final int mo16828x() {
        return C8698y1.m32089c0(this.f23254b, this.f23259g);
    }

    /* renamed from: y */
    public final int mo16829y() {
        return this.f23261i;
    }

    /* renamed from: z */
    public final int mo16830z() {
        int i = this.f23261i;
        if (i >= 0) {
            return C8698y1.m32089c0(this.f23254b, i);
        }
        return 0;
    }
}
