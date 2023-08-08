package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.foundation.gestures.C2203n;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.interaction.C2242f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.lazy.layout.C2549h;
import androidx.compose.foundation.lazy.layout.C2555n;
import androidx.compose.foundation.lazy.layout.C2557o;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.p004ui.layout.C15540b1;
import androidx.compose.p004ui.layout.C15550c1;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16482f;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.ListSaverKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.collections.C10956m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,477:1\n76#2:478\n76#2:479\n76#2:480\n102#2,2:481\n76#2:483\n102#2,2:484\n1855#3,2:486\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n101#1:478\n115#1:479\n152#1:480\n152#1:481,2\n154#1:483\n154#1:484,2\n408#1:486,2\n*E\n"})
public final class LazyStaggeredGridState implements C2203n {
    @C12579k

    /* renamed from: x */
    public static final C2590a f6821x = new C2590a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f6822y = 8;
    @C12579k

    /* renamed from: z */
    public static final C8628e<LazyStaggeredGridState, Object> f6823z = ListSaverKt.m31335a(LazyStaggeredGridState$Companion$Saver$1.f6848f, LazyStaggeredGridState$Companion$Saver$2.f6849f);
    @C12579k

    /* renamed from: a */
    public final C8578k2 f6824a;
    @C12579k

    /* renamed from: b */
    public final C8578k2 f6825b;
    @C12579k

    /* renamed from: c */
    public final C2608p f6826c;
    @C12579k

    /* renamed from: d */
    public final C8700z0<C2600i> f6827d;
    @C12579k

    /* renamed from: e */
    public final LazyStaggeredGridLaneInfo f6828e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f6829f;
    @C12579k

    /* renamed from: g */
    public final C8700z0 f6830g;
    @C12579k

    /* renamed from: h */
    public final C2593b f6831h;
    @C12580l

    /* renamed from: i */
    public C15540b1 f6832i;
    @C12579k

    /* renamed from: j */
    public final C15550c1 f6833j;

    /* renamed from: k */
    public boolean f6834k;
    @C12579k

    /* renamed from: l */
    public final C2557o f6835l;
    @C12579k

    /* renamed from: m */
    public final C2203n f6836m;

    /* renamed from: n */
    public float f6837n;

    /* renamed from: o */
    public int f6838o;

    /* renamed from: p */
    public boolean f6839p;
    @C12579k

    /* renamed from: q */
    public int[] f6840q;
    @C12580l

    /* renamed from: r */
    public C2611r f6841r;

    /* renamed from: s */
    public int f6842s;
    @C12579k

    /* renamed from: t */
    public final Map<Integer, C2557o.C2558a> f6843t;
    @C12579k

    /* renamed from: u */
    public C16479d f6844u;
    @C12579k

    /* renamed from: v */
    public final C2243g f6845v;
    @C12579k

    /* renamed from: w */
    public final C2555n f6846w;

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$a */
    public static final class C2590a {
        public /* synthetic */ C2590a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<LazyStaggeredGridState, Object> mo8934a() {
            return LazyStaggeredGridState.f6823z;
        }

        public C2590a() {
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$b */
    public static final class C2591b implements C15550c1 {

        /* renamed from: a */
        public final /* synthetic */ LazyStaggeredGridState f6847a;

        public C2591b(LazyStaggeredGridState lazyStaggeredGridState) {
            this.f6847a = lazyStaggeredGridState;
        }

        /* renamed from: D2 */
        public void mo8350D2(@C12579k C15540b1 b1Var) {
            Intrinsics.checkNotNullParameter(b1Var, "remeasurement");
            this.f6847a.f6832i = b1Var;
        }
    }

    public /* synthetic */ LazyStaggeredGridState(int[] iArr, int[] iArr2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2);
    }

    /* renamed from: N */
    public static /* synthetic */ Object m11676N(LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, C11045c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.mo8910M(i, i2, cVar);
    }

    /* renamed from: n */
    public static /* synthetic */ Object m11681n(LazyStaggeredGridState lazyStaggeredGridState, int i, int i2, C11045c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyStaggeredGridState.mo8921m(i, i2, cVar);
    }

    /* renamed from: A */
    public final int mo8898A() {
        return this.f6838o;
    }

    @C12579k
    /* renamed from: B */
    public final C2243g mo8899B() {
        return this.f6845v;
    }

    @C12579k
    /* renamed from: C */
    public final C2555n mo8900C() {
        return this.f6846w;
    }

    @C12579k
    /* renamed from: D */
    public final C2557o mo8901D() {
        return this.f6835l;
    }

    /* renamed from: E */
    public final boolean mo8902E() {
        return this.f6834k;
    }

    @C12579k
    /* renamed from: F */
    public final C15550c1 mo8903F() {
        return this.f6833j;
    }

    @C12579k
    /* renamed from: G */
    public final C2608p mo8904G() {
        return this.f6826c;
    }

    /* renamed from: H */
    public final float mo8905H() {
        return this.f6837n;
    }

    @C12580l
    /* renamed from: I */
    public final C2611r mo8906I() {
        return this.f6841r;
    }

    /* renamed from: J */
    public final boolean mo8907J() {
        return this.f6839p;
    }

    /* renamed from: K */
    public final void mo8908K(float f) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        long j;
        int f2;
        C2600i value = this.f6827d.getValue();
        if (!value.mo8949i().isEmpty()) {
            if (f < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = ((C2596e) CollectionsKt___CollectionsKt.m40653k3(value.mo8949i())).getIndex();
            } else {
                i = ((C2596e) CollectionsKt___CollectionsKt.m40706w2(value.mo8949i())).getIndex();
            }
            if (i != this.f6842s) {
                this.f6842s = i;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int length = this.f6840q.length;
                for (int i5 = 0; i5 < length; i5++) {
                    if (z) {
                        f2 = this.f6828e.mo8872e(i, i5);
                    } else {
                        f2 = this.f6828e.mo8873f(i, i5);
                    }
                    if (i < 0 || i >= value.mo8945e()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2 || linkedHashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    linkedHashSet.add(Integer.valueOf(i));
                    if (!this.f6843t.containsKey(Integer.valueOf(i))) {
                        C2611r rVar = this.f6841r;
                        if (rVar == null || !rVar.mo9013b(i)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            i2 = 0;
                        } else {
                            i2 = i5;
                        }
                        if (z3) {
                            i3 = mo8930w();
                        } else {
                            i3 = 1;
                        }
                        int[] iArr = this.f6840q;
                        int i6 = iArr[(i3 + i2) - 1];
                        if (i2 == 0) {
                            i4 = 0;
                        } else {
                            i4 = iArr[i2 - 1];
                        }
                        int i7 = i6 - i4;
                        if (this.f6839p) {
                            j = C16476b.f40850b.mo47812e(i7);
                        } else {
                            j = C16476b.f40850b.mo47811d(i7);
                        }
                        this.f6843t.put(Integer.valueOf(i), this.f6835l.mo8794b(i, j));
                    }
                }
                mo8924q(linkedHashSet);
            }
        }
    }

    /* renamed from: L */
    public final float mo8909L(float f) {
        boolean z;
        if ((f < 0.0f && !mo7249a()) || (f > 0.0f && !mo7252f())) {
            return 0.0f;
        }
        if (Math.abs(this.f6837n) <= 0.5f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f2 = this.f6837n + f;
            this.f6837n = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = this.f6837n;
                C15540b1 b1Var = this.f6832i;
                if (b1Var != null) {
                    b1Var.mo44367e();
                }
                if (this.f6834k) {
                    mo8908K(f3 - this.f6837n);
                }
            }
            if (Math.abs(this.f6837n) <= 0.5f) {
                return f;
            }
            float f4 = f - this.f6837n;
            this.f6837n = 0.0f;
            return f4;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f6837n).toString());
    }

    @C12580l
    /* renamed from: M */
    public final Object mo8910M(int i, int i2, @C12579k C11045c<? super C11079d2> cVar) {
        Object c = C2203n.m9563c(this, (MutatePriority) null, new LazyStaggeredGridState$scrollToItem$2(this, i, i2, (C11045c<? super LazyStaggeredGridState$scrollToItem$2>) null), cVar, 1, (Object) null);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    /* renamed from: O */
    public final void mo8911O(boolean z) {
        this.f6830g.setValue(Boolean.valueOf(z));
    }

    /* renamed from: P */
    public final void mo8912P(boolean z) {
        this.f6829f.setValue(Boolean.valueOf(z));
    }

    /* renamed from: Q */
    public final void mo8913Q(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f6844u = dVar;
    }

    /* renamed from: R */
    public final void mo8914R(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f6840q = iArr;
    }

    /* renamed from: S */
    public final void mo8915S(int i) {
        this.f6838o = i;
    }

    /* renamed from: T */
    public final void mo8916T(boolean z) {
        this.f6834k = z;
    }

    /* renamed from: U */
    public final void mo8917U(@C12580l C2611r rVar) {
        this.f6841r = rVar;
    }

    /* renamed from: V */
    public final void mo8918V(boolean z) {
        this.f6839p = z;
    }

    /* renamed from: W */
    public final void mo8919W(@C12579k C2201l lVar, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        C2596e a = LazyStaggeredGridMeasureResultKt.m11664a(mo8933z(), i);
        if (a != null) {
            boolean z = this.f6839p;
            long b = a.mo8953b();
            if (z) {
                i3 = C16494m.m74583o(b);
            } else {
                i3 = C16494m.m74581m(b);
            }
            lVar.mo7360a((float) (i3 + i2));
            return;
        }
        this.f6826c.mo9006c(i, i2);
        C15540b1 b1Var = this.f6832i;
        if (b1Var != null) {
            b1Var.mo44367e();
        }
    }

    /* renamed from: X */
    public final void mo8920X(@C12579k C2549h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "itemProvider");
        this.f6826c.mo9011h(hVar);
    }

    /* renamed from: a */
    public boolean mo7249a() {
        return ((Boolean) this.f6829f.getValue()).booleanValue();
    }

    /* renamed from: b */
    public float mo7250b(float f) {
        return this.f6836m.mo7250b(f);
    }

    /* renamed from: e */
    public boolean mo7251e() {
        return this.f6836m.mo7251e();
    }

    /* renamed from: f */
    public boolean mo7252f() {
        return ((Boolean) this.f6830g.getValue()).booleanValue();
    }

    @C12580l
    /* renamed from: g */
    public Object mo7253g(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2201l, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = this.f6836m.mo7253g(mutatePriority, pVar, cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: m */
    public final Object mo8921m(int i, int i2, @C12579k C11045c<? super C11079d2> cVar) {
        Object d = LazyAnimateScrollKt.m11327d(this.f6831h, i, i2, cVar);
        return d == C11063b.m42612h() ? d : C11079d2.f28267a;
    }

    /* renamed from: o */
    public final void mo8922o(@C12579k C2604l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "result");
        this.f6837n -= lVar.mo8982l();
        mo8911O(lVar.mo8980j());
        mo8912P(lVar.mo8981k());
        this.f6827d.setValue(lVar);
        mo8923p(lVar);
        this.f6826c.mo9010g(lVar);
        this.f6838o++;
    }

    /* renamed from: p */
    public final void mo8923p(C2600i iVar) {
        List<C2596e> i = iVar.mo8949i();
        if (this.f6842s != -1) {
            boolean z = true;
            if (!i.isEmpty()) {
                int index = ((C2596e) CollectionsKt___CollectionsKt.m40706w2(i)).getIndex();
                int index2 = ((C2596e) CollectionsKt___CollectionsKt.m40653k3(i)).getIndex();
                int i2 = this.f6842s;
                if (index > i2 || i2 > index2) {
                    z = false;
                }
                if (!z) {
                    this.f6842s = -1;
                    for (C2557o.C2558a cancel : this.f6843t.values()) {
                        cancel.cancel();
                    }
                    this.f6843t.clear();
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo8924q(Set<Integer> set) {
        Iterator<Map.Entry<Integer, C2557o.C2558a>> it = this.f6843t.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!set.contains(next.getKey())) {
                ((C2557o.C2558a) next.getValue()).cancel();
                it.remove();
            }
        }
    }

    /* renamed from: r */
    public final int[] mo8925r(int i, int i2) {
        boolean z;
        int[] iArr = new int[i2];
        C2611r rVar = this.f6841r;
        int i3 = 0;
        if (rVar == null || !rVar.mo9013b(i)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C10956m.m41300u2(iArr, i, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.f6828e.mo8871d(i + i2);
        int h = this.f6828e.mo8875h(i);
        if (h != -1) {
            i3 = Math.min(h, i2);
        }
        int i4 = i3;
        int i5 = i4 - 1;
        int i6 = i;
        while (true) {
            if (-1 >= i5) {
                break;
            }
            i6 = this.f6828e.mo8873f(i6, i5);
            iArr[i5] = i6;
            if (i6 == -1) {
                C10956m.m41300u2(iArr, -1, 0, i5, 2, (Object) null);
                break;
            }
            i5--;
        }
        iArr[i4] = i;
        for (int i7 = i4 + 1; i7 < i2; i7++) {
            i = this.f6828e.mo8872e(i, i7);
            iArr[i7] = i;
        }
        return iArr;
    }

    @C12579k
    /* renamed from: s */
    public final C16479d mo8926s() {
        return this.f6844u;
    }

    /* renamed from: t */
    public final int mo8927t() {
        return ((Number) this.f6824a.getValue()).intValue();
    }

    /* renamed from: u */
    public final int mo8928u() {
        return ((Number) this.f6825b.getValue()).intValue();
    }

    @C12579k
    /* renamed from: v */
    public final C2241e mo8929v() {
        return this.f6845v;
    }

    /* renamed from: w */
    public final int mo8930w() {
        return this.f6840q.length;
    }

    @C12579k
    /* renamed from: x */
    public final LazyStaggeredGridLaneInfo mo8931x() {
        return this.f6828e;
    }

    @C12579k
    /* renamed from: y */
    public final int[] mo8932y() {
        return this.f6840q;
    }

    @C12579k
    /* renamed from: z */
    public final C2600i mo8933z() {
        return this.f6827d.getValue();
    }

    public LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        this.f6824a = C8415c2.m30234c(C8415c2.m30254w(), new LazyStaggeredGridState$firstVisibleItemIndex$2(this));
        this.f6825b = C8415c2.m30234c(C8415c2.m30254w(), new LazyStaggeredGridState$firstVisibleItemScrollOffset$2(this));
        this.f6826c = new C2608p(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.f6827d = C8539f2.m30981g(C2592a.f6850a, (C8410b2) null, 2, (Object) null);
        this.f6828e = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        this.f6829f = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f6830g = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f6831h = new C2593b(this);
        this.f6833j = new C2591b(this);
        this.f6834k = true;
        this.f6835l = new C2557o();
        this.f6836m = ScrollableStateKt.m9405a(new LazyStaggeredGridState$scrollableState$1(this));
        this.f6840q = new int[0];
        this.f6842s = -1;
        this.f6843t = new LinkedHashMap();
        this.f6844u = C16482f.m74433a(1.0f, 1.0f);
        this.f6845v = C2242f.m9684a();
        this.f6846w = new C2555n();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyStaggeredGridState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public LazyStaggeredGridState(int i, int i2) {
        this(new int[]{i}, new int[]{i2});
    }
}
