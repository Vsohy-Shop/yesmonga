package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C2203n;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.interaction.C2242f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.lazy.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.C2555n;
import androidx.compose.foundation.lazy.layout.C2557o;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.p004ui.layout.C15540b1;
import androidx.compose.p004ui.layout.C15550c1;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16482f;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.collection.C8423g;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.ListSaverKt;
import java.util.List;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,460:1\n1182#2:461\n1161#2,2:462\n76#3:464\n102#3,2:465\n76#3:467\n102#3,2:468\n76#3:470\n102#3,2:471\n76#3:473\n102#3,2:474\n76#3:476\n102#3,2:477\n76#3:479\n102#3,2:480\n76#3:482\n102#3,2:483\n76#3:485\n102#3,2:486\n460#4,11:488\n460#4,11:505\n33#5,6:499\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n191#1:461\n191#1:462,2\n151#1:464\n151#1:465,2\n156#1:467\n156#1:468,2\n161#1:470\n161#1:471,2\n203#1:473\n203#1:474,2\n224#1:476\n224#1:477,2\n226#1:479\n226#1:480,2\n283#1:482\n283#1:483,2\n285#1:485\n285#1:486,2\n354#1:488,11\n381#1:505,11\n359#1:499,6\n*E\n"})
public final class LazyGridState implements C2203n {
    @C12579k

    /* renamed from: x */
    public static final C2480a f6540x = new C2480a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f6541y = 0;
    @C12579k

    /* renamed from: z */
    public static final C8628e<LazyGridState, ?> f6542z = ListSaverKt.m31335a(LazyGridState$Companion$Saver$1.f6567f, LazyGridState$Companion$Saver$2.f6568f);
    @C12579k

    /* renamed from: a */
    public final C2504s f6543a;
    @C12579k

    /* renamed from: b */
    public final C8700z0<C2498m> f6544b;
    @C12579k

    /* renamed from: c */
    public final C2243g f6545c;

    /* renamed from: d */
    public float f6546d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f6547e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f6548f;
    @C12579k

    /* renamed from: g */
    public final C8700z0 f6549g;
    @C12579k

    /* renamed from: h */
    public final C2203n f6550h;

    /* renamed from: i */
    public int f6551i;

    /* renamed from: j */
    public boolean f6552j;

    /* renamed from: k */
    public int f6553k;
    @C12579k

    /* renamed from: l */
    public final C8423g<C2557o.C2558a> f6554l;

    /* renamed from: m */
    public boolean f6555m;
    @C12579k

    /* renamed from: n */
    public final C8700z0 f6556n;
    @C12579k

    /* renamed from: o */
    public final C15550c1 f6557o;
    @C12579k

    /* renamed from: p */
    public final AwaitFirstLayoutModifier f6558p;
    @C12579k

    /* renamed from: q */
    public final C8700z0 f6559q;
    @C12579k

    /* renamed from: r */
    public final C8700z0 f6560r;
    @C12579k

    /* renamed from: s */
    public final LazyGridAnimateScrollScope f6561s;
    @C12579k

    /* renamed from: t */
    public final C2555n f6562t;
    @C12579k

    /* renamed from: u */
    public final C8700z0 f6563u;
    @C12579k

    /* renamed from: v */
    public final C8700z0 f6564v;
    @C12579k

    /* renamed from: w */
    public final C2557o f6565w;

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$a */
    public static final class C2480a {
        public /* synthetic */ C2480a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<LazyGridState, ?> mo8529a() {
            return LazyGridState.f6542z;
        }

        public C2480a() {
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$b */
    public static final class C2481b implements C15550c1 {

        /* renamed from: a */
        public final /* synthetic */ LazyGridState f6566a;

        public C2481b(LazyGridState lazyGridState) {
            this.f6566a = lazyGridState;
        }

        /* renamed from: D2 */
        public void mo8350D2(@C12579k C15540b1 b1Var) {
            Intrinsics.checkNotNullParameter(b1Var, "remeasurement");
            this.f6566a.mo8509Q(b1Var);
        }
    }

    public LazyGridState() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: J */
    public static /* synthetic */ Object m11081J(LazyGridState lazyGridState, int i, int i2, C11045c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.mo8502I(i, i2, cVar);
    }

    /* renamed from: l */
    public static /* synthetic */ Object m11084l(LazyGridState lazyGridState, int i, int i2, C11045c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.mo8514k(i, i2, cVar);
    }

    /* renamed from: A */
    public final boolean mo8494A() {
        return this.f6552j;
    }

    /* renamed from: B */
    public final C15540b1 mo8495B() {
        return (C15540b1) this.f6556n.getValue();
    }

    @C12579k
    /* renamed from: C */
    public final C15550c1 mo8496C() {
        return this.f6557o;
    }

    /* renamed from: D */
    public final float mo8497D() {
        return this.f6546d;
    }

    /* renamed from: E */
    public final int mo8498E() {
        return ((Number) this.f6547e.getValue()).intValue();
    }

    /* renamed from: F */
    public final boolean mo8499F() {
        return ((Boolean) this.f6549g.getValue()).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5 A[LOOP:1: B:36:0x00c3->B:37:0x00c5, LOOP_END] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8500G(float r9) {
        /*
            r8 = this;
            androidx.compose.foundation.lazy.layout.o r0 = r8.f6565w
            boolean r1 = r8.f6552j
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.compose.foundation.lazy.grid.m r1 = r8.mo8523u()
            java.util.List r2 = r1.mo8554i()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00eb
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r2 = 0
            if (r9 >= 0) goto L_0x0021
            r9 = r3
            goto L_0x0022
        L_0x0021:
            r9 = r2
        L_0x0022:
            if (r9 == 0) goto L_0x004e
            java.util.List r4 = r1.mo8554i()
            java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40653k3(r4)
            androidx.compose.foundation.lazy.grid.h r4 = (androidx.compose.foundation.lazy.grid.C2492h) r4
            boolean r5 = r8.mo8499F()
            if (r5 == 0) goto L_0x0039
            int r4 = r4.mo8583c()
            goto L_0x003d
        L_0x0039:
            int r4 = r4.mo8584d()
        L_0x003d:
            int r4 = r4 + r3
            java.util.List r5 = r1.mo8554i()
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40653k3(r5)
            androidx.compose.foundation.lazy.grid.h r5 = (androidx.compose.foundation.lazy.grid.C2492h) r5
            int r5 = r5.getIndex()
            int r5 = r5 + r3
            goto L_0x0078
        L_0x004e:
            java.util.List r4 = r1.mo8554i()
            java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r4)
            androidx.compose.foundation.lazy.grid.h r4 = (androidx.compose.foundation.lazy.grid.C2492h) r4
            boolean r5 = r8.mo8499F()
            if (r5 == 0) goto L_0x0063
            int r4 = r4.mo8583c()
            goto L_0x0067
        L_0x0063:
            int r4 = r4.mo8584d()
        L_0x0067:
            int r4 = r4 + -1
            java.util.List r5 = r1.mo8554i()
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r5)
            androidx.compose.foundation.lazy.grid.h r5 = (androidx.compose.foundation.lazy.grid.C2492h) r5
            int r5 = r5.getIndex()
            int r5 = r5 - r3
        L_0x0078:
            int r6 = r8.f6553k
            if (r4 == r6) goto L_0x00eb
            if (r5 < 0) goto L_0x0086
            int r1 = r1.mo8550e()
            if (r5 >= r1) goto L_0x0086
            r1 = r3
            goto L_0x0087
        L_0x0086:
            r1 = r2
        L_0x0087:
            if (r1 == 0) goto L_0x00eb
            boolean r1 = r8.f6555m
            if (r1 == r9) goto L_0x00a4
            androidx.compose.runtime.collection.g<androidx.compose.foundation.lazy.layout.o$a> r1 = r8.f6554l
            int r5 = r1.mo15469h0()
            if (r5 <= 0) goto L_0x00a4
            java.lang.Object[] r1 = r1.mo15462d0()
            r6 = r2
        L_0x009a:
            r7 = r1[r6]
            androidx.compose.foundation.lazy.layout.o$a r7 = (androidx.compose.foundation.lazy.layout.C2557o.C2558a) r7
            r7.cancel()
            int r6 = r6 + r3
            if (r6 < r5) goto L_0x009a
        L_0x00a4:
            r8.f6555m = r9
            r8.f6553k = r4
            androidx.compose.runtime.collection.g<androidx.compose.foundation.lazy.layout.o$a> r9 = r8.f6554l
            r9.mo15490w()
            kotlin.jvm.functions.l r9 = r8.mo8527y()
            int r1 = androidx.compose.foundation.lazy.grid.C2510x.m11278c(r4)
            androidx.compose.foundation.lazy.grid.x r1 = androidx.compose.foundation.lazy.grid.C2510x.m11276a(r1)
            java.lang.Object r9 = r9.invoke(r1)
            java.util.List r9 = (java.util.List) r9
            int r1 = r9.size()
        L_0x00c3:
            if (r2 >= r1) goto L_0x00eb
            java.lang.Object r3 = r9.get(r2)
            kotlin.Pair r3 = (kotlin.Pair) r3
            androidx.compose.runtime.collection.g<androidx.compose.foundation.lazy.layout.o$a> r4 = r8.f6554l
            java.lang.Object r5 = r3.mo21849e()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r3 = r3.mo21851f()
            androidx.compose.ui.unit.b r3 = (androidx.compose.p004ui.unit.C16476b) r3
            long r6 = r3.mo47807x()
            androidx.compose.foundation.lazy.layout.o$a r3 = r0.mo8794b(r5, r6)
            r4.mo15463e(r3)
            int r2 = r2 + 1
            goto L_0x00c3
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.mo8500G(float):void");
    }

    /* renamed from: H */
    public final float mo8501H(float f) {
        boolean z;
        if ((f < 0.0f && !mo7249a()) || (f > 0.0f && !mo7252f())) {
            return 0.0f;
        }
        if (Math.abs(this.f6546d) <= 0.5f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f2 = this.f6546d + f;
            this.f6546d = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = this.f6546d;
                C15540b1 B = mo8495B();
                if (B != null) {
                    B.mo44367e();
                }
                if (this.f6552j) {
                    mo8500G(f3 - this.f6546d);
                }
            }
            if (Math.abs(this.f6546d) <= 0.5f) {
                return f;
            }
            float f4 = f - this.f6546d;
            this.f6546d = 0.0f;
            return f4;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f6546d).toString());
    }

    @C12580l
    /* renamed from: I */
    public final Object mo8502I(int i, int i2, @C12579k C11045c<? super C11079d2> cVar) {
        Object c = C2203n.m9563c(this, (MutatePriority) null, new LazyGridState$scrollToItem$2(this, i, i2, (C11045c<? super LazyGridState$scrollToItem$2>) null), cVar, 1, (Object) null);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }

    /* renamed from: K */
    public final void mo8503K(boolean z) {
        this.f6564v.setValue(Boolean.valueOf(z));
    }

    /* renamed from: L */
    public final void mo8504L(boolean z) {
        this.f6563u.setValue(Boolean.valueOf(z));
    }

    /* renamed from: M */
    public final void mo8505M(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f6548f.setValue(dVar);
    }

    /* renamed from: N */
    public final void mo8506N(@C12580l LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        this.f6560r.setValue(lazyGridItemPlacementAnimator);
    }

    /* renamed from: O */
    public final void mo8507O(@C12579k C11300l<? super C2510x, ? extends List<Pair<Integer, C16476b>>> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f6559q.setValue(lVar);
    }

    /* renamed from: P */
    public final void mo8508P(boolean z) {
        this.f6552j = z;
    }

    /* renamed from: Q */
    public final void mo8509Q(C15540b1 b1Var) {
        this.f6556n.setValue(b1Var);
    }

    /* renamed from: R */
    public final void mo8510R(int i) {
        this.f6547e.setValue(Integer.valueOf(i));
    }

    /* renamed from: S */
    public final void mo8511S(boolean z) {
        this.f6549g.setValue(Boolean.valueOf(z));
    }

    /* renamed from: T */
    public final void mo8512T(int i, int i2) {
        this.f6543a.mo8621c(C2489e.m11167c(i), i2);
        LazyGridItemPlacementAnimator x = mo8526x();
        if (x != null) {
            x.mo8438i();
        }
        C15540b1 B = mo8495B();
        if (B != null) {
            B.mo44367e();
        }
    }

    /* renamed from: U */
    public final void mo8513U(@C12579k C2495j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "itemProvider");
        this.f6543a.mo8626h(jVar);
    }

    /* renamed from: a */
    public boolean mo7249a() {
        return ((Boolean) this.f6563u.getValue()).booleanValue();
    }

    /* renamed from: b */
    public float mo7250b(float f) {
        return this.f6550h.mo7250b(f);
    }

    /* renamed from: e */
    public boolean mo7251e() {
        return this.f6550h.mo7251e();
    }

    /* renamed from: f */
    public boolean mo7252f() {
        return ((Boolean) this.f6564v.getValue()).booleanValue();
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
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
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x005a
        L_0x0045:
            kotlin.C11661u0.m45747n(r8)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r8 = r5.f6558p
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
            androidx.compose.foundation.gestures.n r8 = r2.f6550h
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.mo7253g(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.p, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: k */
    public final Object mo8514k(int i, int i2, @C12579k C11045c<? super C11079d2> cVar) {
        Object d = LazyAnimateScrollKt.m11327d(this.f6561s, i, i2, cVar);
        return d == C11063b.m42612h() ? d : C11079d2.f28267a;
    }

    /* renamed from: m */
    public final void mo8515m(@C12579k C2499n nVar) {
        int i;
        Intrinsics.checkNotNullParameter(nVar, "result");
        this.f6543a.mo8625g(nVar);
        this.f6546d -= nVar.mo8590l();
        this.f6544b.setValue(nVar);
        mo8504L(nVar.mo8589k());
        C2501p m = nVar.mo8591m();
        boolean z = false;
        if (m != null) {
            i = m.mo8603a();
        } else {
            i = 0;
        }
        if (!(i == 0 && nVar.mo8592n() == 0)) {
            z = true;
        }
        mo8503K(z);
        this.f6551i++;
        mo8516n(nVar);
    }

    /* renamed from: n */
    public final void mo8516n(C2498m mVar) {
        int i;
        int i2;
        int i3;
        if (this.f6553k != -1 && (!mVar.mo8554i().isEmpty())) {
            if (this.f6555m) {
                C2492h hVar = (C2492h) CollectionsKt___CollectionsKt.m40653k3(mVar.mo8554i());
                if (mo8499F()) {
                    i3 = hVar.mo8583c();
                } else {
                    i3 = hVar.mo8584d();
                }
                i = i3 + 1;
            } else {
                C2492h hVar2 = (C2492h) CollectionsKt___CollectionsKt.m40706w2(mVar.mo8554i());
                if (mo8499F()) {
                    i2 = hVar2.mo8583c();
                } else {
                    i2 = hVar2.mo8584d();
                }
                i = i2 - 1;
            }
            if (this.f6553k != i) {
                this.f6553k = -1;
                C8423g<C2557o.C2558a> gVar = this.f6554l;
                int h0 = gVar.mo15469h0();
                if (h0 > 0) {
                    Object[] d0 = gVar.mo15462d0();
                    int i4 = 0;
                    do {
                        ((C2557o.C2558a) d0[i4]).cancel();
                        i4++;
                    } while (i4 < h0);
                }
                this.f6554l.mo15490w();
            }
        }
    }

    @C12579k
    /* renamed from: o */
    public final AwaitFirstLayoutModifier mo8517o() {
        return this.f6558p;
    }

    @C12579k
    /* renamed from: p */
    public final C16479d mo8518p() {
        return (C16479d) this.f6548f.getValue();
    }

    /* renamed from: q */
    public final int mo8519q() {
        return this.f6543a.mo8619a();
    }

    /* renamed from: r */
    public final int mo8520r() {
        return this.f6543a.mo8620b();
    }

    @C12579k
    /* renamed from: s */
    public final C2241e mo8521s() {
        return this.f6545c;
    }

    @C12579k
    /* renamed from: t */
    public final C2243g mo8522t() {
        return this.f6545c;
    }

    @C12579k
    /* renamed from: u */
    public final C2498m mo8523u() {
        return this.f6544b.getValue();
    }

    /* renamed from: v */
    public final int mo8524v() {
        return this.f6551i;
    }

    @C12579k
    /* renamed from: w */
    public final C2555n mo8525w() {
        return this.f6562t;
    }

    @C12580l
    /* renamed from: x */
    public final LazyGridItemPlacementAnimator mo8526x() {
        return (LazyGridItemPlacementAnimator) this.f6560r.getValue();
    }

    @C12579k
    /* renamed from: y */
    public final C11300l<C2510x, List<Pair<Integer, C16476b>>> mo8527y() {
        return (C11300l) this.f6559q.getValue();
    }

    @C12579k
    /* renamed from: z */
    public final C2557o mo8528z() {
        return this.f6565w;
    }

    public LazyGridState(int i, int i2) {
        this.f6543a = new C2504s(i, i2);
        this.f6544b = C8539f2.m30981g(C2484b.f6575a, (C8410b2) null, 2, (Object) null);
        this.f6545c = C2242f.m9684a();
        this.f6547e = C8539f2.m30981g(0, (C8410b2) null, 2, (Object) null);
        this.f6548f = C8539f2.m30981g(C16482f.m74433a(1.0f, 1.0f), (C8410b2) null, 2, (Object) null);
        this.f6549g = C8539f2.m30981g(Boolean.TRUE, (C8410b2) null, 2, (Object) null);
        this.f6550h = ScrollableStateKt.m9405a(new LazyGridState$scrollableState$1(this));
        this.f6552j = true;
        this.f6553k = -1;
        this.f6554l = new C8423g<>(new C2557o.C2558a[16], 0);
        this.f6556n = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f6557o = new C2481b(this);
        this.f6558p = new AwaitFirstLayoutModifier();
        this.f6559q = C8539f2.m30981g(LazyGridState$prefetchInfoRetriever$2.f6569f, (C8410b2) null, 2, (Object) null);
        this.f6560r = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f6561s = new LazyGridAnimateScrollScope(this);
        this.f6562t = new C2555n();
        Boolean bool = Boolean.FALSE;
        this.f6563u = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f6564v = C8539f2.m30981g(bool, (C8410b2) null, 2, (Object) null);
        this.f6565w = new C2557o();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyGridState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
