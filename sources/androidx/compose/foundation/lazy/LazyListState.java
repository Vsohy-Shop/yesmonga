package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C2203n;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.interaction.C2242f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.lazy.layout.C2555n;
import androidx.compose.foundation.lazy.layout.C2557o;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.p004ui.layout.C15540b1;
import androidx.compose.p004ui.layout.C15550c1;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16482f;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.ListSaverKt;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,457:1\n76#2:458\n102#2,2:459\n76#2:461\n102#2,2:462\n76#2:464\n102#2,2:465\n76#2:467\n102#2,2:468\n76#2:470\n102#2,2:471\n76#2:473\n102#2,2:474\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n*L\n158#1:458\n158#1:459,2\n199#1:461\n199#1:462,2\n217#1:464\n217#1:465,2\n222#1:467\n222#1:468,2\n277#1:470\n277#1:471,2\n279#1:473\n279#1:474,2\n*E\n"})
public final class LazyListState implements C2203n {
    @C12579k

    /* renamed from: v */
    public static final C2449a f6426v = new C2449a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f6427w = 0;
    @C12579k

    /* renamed from: x */
    public static final C8628e<LazyListState, ?> f6428x = ListSaverKt.m31335a(LazyListState$Companion$Saver$1.f6451f, LazyListState$Companion$Saver$2.f6452f);
    @C12579k

    /* renamed from: a */
    public final C2575s f6429a;
    @C12579k

    /* renamed from: b */
    public final C2457f f6430b;
    @C12579k

    /* renamed from: c */
    public final C8700z0<C2570o> f6431c;
    @C12579k

    /* renamed from: d */
    public final C2243g f6432d;

    /* renamed from: e */
    public float f6433e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f6434f;
    @C12579k

    /* renamed from: g */
    public final C2203n f6435g;

    /* renamed from: h */
    public int f6436h;

    /* renamed from: i */
    public boolean f6437i;

    /* renamed from: j */
    public int f6438j;
    @C12580l

    /* renamed from: k */
    public C2557o.C2558a f6439k;

    /* renamed from: l */
    public boolean f6440l;
    @C12579k

    /* renamed from: m */
    public final C8700z0 f6441m;
    @C12579k

    /* renamed from: n */
    public final C15550c1 f6442n;
    @C12579k

    /* renamed from: o */
    public final AwaitFirstLayoutModifier f6443o;
    @C12579k

    /* renamed from: p */
    public final C8700z0 f6444p;
    @C12579k

    /* renamed from: q */
    public final C8700z0 f6445q;
    @C12579k

    /* renamed from: r */
    public final C2555n f6446r;
    @C12579k

    /* renamed from: s */
    public final C8700z0 f6447s;
    @C12579k

    /* renamed from: t */
    public final C8700z0 f6448t;
    @C12579k

    /* renamed from: u */
    public final C2557o f6449u;

    /* renamed from: androidx.compose.foundation.lazy.LazyListState$a */
    public static final class C2449a {
        public /* synthetic */ C2449a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<LazyListState, ?> mo8349a() {
            return LazyListState.f6428x;
        }

        public C2449a() {
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyListState$b */
    public static final class C2450b implements C15550c1 {

        /* renamed from: a */
        public final /* synthetic */ LazyListState f6450a;

        public C2450b(LazyListState lazyListState) {
            this.f6450a = lazyListState;
        }

        /* renamed from: D2 */
        public void mo8350D2(@C12579k C15540b1 b1Var) {
            Intrinsics.checkNotNullParameter(b1Var, "remeasurement");
            this.f6450a.mo8331O(b1Var);
        }
    }

    public LazyListState() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: H */
    public static /* synthetic */ Object m10849H(LazyListState lazyListState, int i, int i2, C11045c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.mo8324G(i, i2, cVar);
    }

    /* renamed from: l */
    public static /* synthetic */ Object m10852l(LazyListState lazyListState, int i, int i2, C11045c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.mo8334k(i, i2, cVar);
    }

    /* renamed from: A */
    public final long mo8318A() {
        return ((C16476b) this.f6445q.getValue()).mo47807x();
    }

    @C12580l
    /* renamed from: B */
    public final C15540b1 mo8319B() {
        return (C15540b1) this.f6441m.getValue();
    }

    @C12579k
    /* renamed from: C */
    public final C15550c1 mo8320C() {
        return this.f6442n;
    }

    /* renamed from: D */
    public final float mo8321D() {
        return this.f6433e;
    }

    /* renamed from: E */
    public final void mo8322E(float f) {
        boolean z;
        int i;
        C2557o.C2558a aVar;
        if (this.f6437i) {
            C2570o u = mo8343u();
            boolean z2 = true;
            if (!u.mo8378i().isEmpty()) {
                if (f < 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = ((C2517l) CollectionsKt___CollectionsKt.m40653k3(u.mo8378i())).getIndex() + 1;
                } else {
                    i = ((C2517l) CollectionsKt___CollectionsKt.m40706w2(u.mo8378i())).getIndex() - 1;
                }
                if (i != this.f6438j) {
                    if (i < 0 || i >= u.mo8374e()) {
                        z2 = false;
                    }
                    if (z2) {
                        if (!(this.f6440l == z || (aVar = this.f6439k) == null)) {
                            aVar.cancel();
                        }
                        this.f6440l = z;
                        this.f6438j = i;
                        this.f6439k = this.f6449u.mo8794b(i, mo8318A());
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public final float mo8323F(float f) {
        boolean z;
        if ((f < 0.0f && !mo7249a()) || (f > 0.0f && !mo7252f())) {
            return 0.0f;
        }
        if (Math.abs(this.f6433e) <= 0.5f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f2 = this.f6433e + f;
            this.f6433e = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = this.f6433e;
                C15540b1 B = mo8319B();
                if (B != null) {
                    B.mo44367e();
                }
                if (this.f6437i) {
                    mo8322E(f3 - this.f6433e);
                }
            }
            if (Math.abs(this.f6433e) <= 0.5f) {
                return f;
            }
            float f4 = f - this.f6433e;
            this.f6433e = 0.0f;
            return f4;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f6433e).toString());
    }

    @C12580l
    /* renamed from: G */
    public final Object mo8324G(int i, int i2, @C12579k C11045c<? super C11079d2> cVar) {
        Object c = C2203n.m9563c(this, (MutatePriority) null, new LazyListState$scrollToItem$2(this, i, i2, (C11045c<? super LazyListState$scrollToItem$2>) null), cVar, 1, (Object) null);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    /* renamed from: I */
    public final void mo8325I(boolean z) {
        this.f6448t.setValue(Boolean.valueOf(z));
    }

    /* renamed from: J */
    public final void mo8326J(boolean z) {
        this.f6447s.setValue(Boolean.valueOf(z));
    }

    /* renamed from: K */
    public final void mo8327K(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f6434f.setValue(dVar);
    }

    /* renamed from: L */
    public final void mo8328L(@C12580l LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
        this.f6444p.setValue(lazyListItemPlacementAnimator);
    }

    /* renamed from: M */
    public final void mo8329M(boolean z) {
        this.f6437i = z;
    }

    /* renamed from: N */
    public final void mo8330N(long j) {
        this.f6445q.setValue(C16476b.m74348b(j));
    }

    /* renamed from: O */
    public final void mo8331O(C15540b1 b1Var) {
        this.f6441m.setValue(b1Var);
    }

    /* renamed from: P */
    public final void mo8332P(int i, int i2) {
        this.f6429a.mo8833c(C2452b.m10906c(i), i2);
        LazyListItemPlacementAnimator x = mo8346x();
        if (x != null) {
            x.mo8279h();
        }
        C15540b1 B = mo8319B();
        if (B != null) {
            B.mo44367e();
        }
    }

    /* renamed from: Q */
    public final void mo8333Q(@C12579k C2569n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "itemProvider");
        this.f6429a.mo8838h(nVar);
    }

    /* renamed from: a */
    public boolean mo7249a() {
        return ((Boolean) this.f6447s.getValue()).booleanValue();
    }

    /* renamed from: b */
    public float mo7250b(float f) {
        return this.f6435g.mo7250b(f);
    }

    /* renamed from: e */
    public boolean mo7251e() {
        return this.f6435g.mo7251e();
    }

    /* renamed from: f */
    public boolean mo7252f() {
        return ((Boolean) this.f6448t.getValue()).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlin.jvm.functions.p<? super androidx.compose.foundation.gestures.l, ? super kotlin.coroutines.c<? super kotlin.d2>, ? extends java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7253g(@org.jetbrains.annotations.C12579k androidx.compose.foundation.MutatePriority r6, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.foundation.gestures.C2201l, ? super kotlin.coroutines.C11045c<? super kotlin.C11079d2>, ? extends java.lang.Object> r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r8)
            goto L_0x006c
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            kotlin.jvm.functions.p r7 = (kotlin.jvm.functions.C11304p) r7
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x005a
        L_0x0045:
            kotlin.C11661u0.m45747n(r8)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r8 = r5.f6443o
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.mo8242a(r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r5
        L_0x005a:
            androidx.compose.foundation.gestures.n r8 = r2.f6435g
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.mo7253g(r6, r7, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.mo7253g(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.p, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: k */
    public final Object mo8334k(int i, int i2, @C12579k C11045c<? super C11079d2> cVar) {
        Object d = LazyAnimateScrollKt.m11327d(this.f6430b, i, i2, cVar);
        return d == C11063b.m42612h() ? d : C11079d2.f28267a;
    }

    /* renamed from: m */
    public final void mo8335m(@C12579k C2572p pVar) {
        int i;
        Intrinsics.checkNotNullParameter(pVar, "result");
        this.f6429a.mo8837g(pVar);
        this.f6433e -= pVar.mo8818r();
        this.f6431c.setValue(pVar);
        mo8326J(pVar.mo8817q());
        C2620u s = pVar.mo8819s();
        boolean z = false;
        if (s != null) {
            i = s.mo9028b();
        } else {
            i = 0;
        }
        if (!(i == 0 && pVar.mo8820t() == 0)) {
            z = true;
        }
        mo8325I(z);
        this.f6436h++;
        mo8336n(pVar);
    }

    /* renamed from: n */
    public final void mo8336n(C2570o oVar) {
        int i;
        if (this.f6438j != -1 && (!oVar.mo8378i().isEmpty())) {
            if (this.f6440l) {
                i = ((C2517l) CollectionsKt___CollectionsKt.m40653k3(oVar.mo8378i())).getIndex() + 1;
            } else {
                i = ((C2517l) CollectionsKt___CollectionsKt.m40706w2(oVar.mo8378i())).getIndex() - 1;
            }
            if (this.f6438j != i) {
                this.f6438j = -1;
                C2557o.C2558a aVar = this.f6439k;
                if (aVar != null) {
                    aVar.cancel();
                }
                this.f6439k = null;
            }
        }
    }

    @C12579k
    /* renamed from: o */
    public final AwaitFirstLayoutModifier mo8337o() {
        return this.f6443o;
    }

    @C12579k
    /* renamed from: p */
    public final C16479d mo8338p() {
        return (C16479d) this.f6434f.getValue();
    }

    /* renamed from: q */
    public final int mo8339q() {
        return this.f6429a.mo8831a();
    }

    /* renamed from: r */
    public final int mo8340r() {
        return this.f6429a.mo8832b();
    }

    @C12579k
    /* renamed from: s */
    public final C2241e mo8341s() {
        return this.f6432d;
    }

    @C12579k
    /* renamed from: t */
    public final C2243g mo8342t() {
        return this.f6432d;
    }

    @C12579k
    /* renamed from: u */
    public final C2570o mo8343u() {
        return this.f6431c.getValue();
    }

    /* renamed from: v */
    public final int mo8344v() {
        return this.f6436h;
    }

    @C12579k
    /* renamed from: w */
    public final C2555n mo8345w() {
        return this.f6446r;
    }

    @C12580l
    /* renamed from: x */
    public final LazyListItemPlacementAnimator mo8346x() {
        return (LazyListItemPlacementAnimator) this.f6444p.getValue();
    }

    @C12579k
    /* renamed from: y */
    public final C2557o mo8347y() {
        return this.f6449u;
    }

    /* renamed from: z */
    public final boolean mo8348z() {
        return this.f6437i;
    }

    public LazyListState(int i, int i2) {
        this.f6429a = new C2575s(i, i2);
        this.f6430b = new C2457f(this);
        this.f6431c = C8539f2.m30981g(C2453c.f6458a, (C8410b2) null, 2, (Object) null);
        this.f6432d = C2242f.m9684a();
        this.f6434f = C8539f2.m30981g(C16482f.m74433a(1.0f, 1.0f), (C8410b2) null, 2, (Object) null);
        this.f6435g = ScrollableStateKt.m9405a(new LazyListState$scrollableState$1(this));
        this.f6437i = true;
        this.f6438j = -1;
        this.f6441m = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f6442n = new C2450b(this);
        this.f6443o = new AwaitFirstLayoutModifier();
        this.f6444p = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f6445q = C8539f2.m30981g(C16476b.m74348b(C16478c.m74377b(0, 0, 0, 0, 15, (Object) null)), (C8410b2) null, 2, (Object) null);
        this.f6446r = new C2555n();
        Boolean bool = Boolean.FALSE;
        this.f6447s = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f6448t = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f6449u = new C2557o();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyListState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
