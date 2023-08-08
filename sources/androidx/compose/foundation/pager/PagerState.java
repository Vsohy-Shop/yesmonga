package androidx.compose.foundation.pager;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1972h;
import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.foundation.gestures.C2203n;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.C2517l;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.ListSaverKt;
import java.util.List;
import java.util.ListIterator;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C2855v
@C11363r0({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,455:1\n76#2:456\n102#2,2:457\n76#2:459\n102#2,2:460\n76#2:462\n102#2,2:463\n76#2:484\n76#2:485\n102#2,2:486\n76#2:488\n102#2,2:489\n76#2:491\n76#2:492\n76#2:493\n171#3,13:465\n533#4,6:478\n452#5,4:494\n452#5,4:498\n452#5,4:502\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n96#1:456\n96#1:457,2\n98#1:459\n98#1:460,2\n100#1:462\n100#1:463,2\n177#1:484\n179#1:485\n179#1:486,2\n181#1:488\n181#1:489,2\n191#1:491\n204#1:492\n238#1:493\n133#1:465,13\n144#1:478,6\n262#1:494,4\n312#1:498,4\n328#1:502,4\n*E\n"})
public final class PagerState implements C2203n {
    @C12579k

    /* renamed from: m */
    public static final C2646a f6984m = new C2646a((DefaultConstructorMarker) null);

    /* renamed from: n */
    public static final int f6985n = 0;
    @C12579k

    /* renamed from: o */
    public static final C8628e<PagerState, ?> f6986o = ListSaverKt.m31335a(PagerState$Companion$Saver$1.f6999f, PagerState$Companion$Saver$2.f7000f);

    /* renamed from: a */
    public final int f6987a;

    /* renamed from: b */
    public final float f6988b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f6989c;
    @C12579k

    /* renamed from: d */
    public final C8700z0 f6990d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f6991e;
    @C12579k

    /* renamed from: f */
    public final AwaitLazyListStateSet f6992f;
    @C12579k

    /* renamed from: g */
    public final C8578k2 f6993g;
    @C12579k

    /* renamed from: h */
    public final C8700z0 f6994h;
    @C12579k

    /* renamed from: i */
    public final C8700z0 f6995i;
    @C12579k

    /* renamed from: j */
    public final C8578k2 f6996j;
    @C12579k

    /* renamed from: k */
    public final C8578k2 f6997k;
    @C12579k

    /* renamed from: l */
    public final C8578k2 f6998l;

    /* renamed from: androidx.compose.foundation.pager.PagerState$a */
    public static final class C2646a {
        public /* synthetic */ C2646a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<PagerState, ?> mo9099a() {
            return PagerState.f6986o;
        }

        public C2646a() {
        }
    }

    public PagerState() {
        this(0, 0.0f, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: S */
    public static /* synthetic */ Object m11919S(PagerState pagerState, int i, float f, C11045c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.mo9083R(i, f, cVar);
    }

    /* renamed from: r */
    public static /* synthetic */ Object m11928r(PagerState pagerState, int i, float f, C1968g gVar, C11045c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            gVar = C1972h.m8390o(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        return pagerState.mo9090q(i, f, gVar, cVar);
    }

    @C12580l
    /* renamed from: A */
    public final C2517l mo9066A() {
        C2517l lVar;
        boolean z;
        List<C2517l> P = mo9081P();
        ListIterator<C2517l> listIterator = P.listIterator(P.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lVar = null;
                break;
            }
            lVar = listIterator.previous();
            if (LazyListSnapLayoutInfoProviderKt.m9586c(mo9097y(), mo9070E(), lVar, PagerStateKt.m11978h()) <= 0.0f) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return lVar;
    }

    /* renamed from: B */
    public final int mo9067B() {
        return this.f6987a;
    }

    /* renamed from: C */
    public final float mo9068C() {
        return this.f6988b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.mo8341s();
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.interaction.C2241e mo9069D() {
        /*
            r1 = this;
            androidx.compose.foundation.lazy.LazyListState r0 = r1.mo9071F()
            if (r0 == 0) goto L_0x000c
            androidx.compose.foundation.interaction.e r0 = r0.mo8341s()
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            androidx.compose.foundation.pager.PagerStateKt$a r0 = androidx.compose.foundation.pager.PagerStateKt.f7008h
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.mo9069D():androidx.compose.foundation.interaction.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.mo8343u();
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.C2570o mo9070E() {
        /*
            r1 = this;
            androidx.compose.foundation.lazy.LazyListState r0 = r1.mo9071F()
            if (r0 == 0) goto L_0x000c
            androidx.compose.foundation.lazy.o r0 = r0.mo8343u()
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            androidx.compose.foundation.pager.PagerStateKt$b r0 = androidx.compose.foundation.pager.PagerStateKt.f7006f
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.mo9070E():androidx.compose.foundation.lazy.o");
    }

    /* renamed from: F */
    public final LazyListState mo9071F() {
        return (LazyListState) this.f6990d.getValue();
    }

    /* renamed from: G */
    public final int mo9072G() {
        return mo9074I() + mo9075J();
    }

    /* renamed from: H */
    public final int mo9073H() {
        return mo9070E().mo8374e();
    }

    /* renamed from: I */
    public final int mo9074I() {
        C2517l lVar = (C2517l) CollectionsKt___CollectionsKt.m40479B2(mo9081P());
        if (lVar != null) {
            return lVar.getSize();
        }
        return 0;
    }

    /* renamed from: J */
    public final int mo9075J() {
        return ((Number) this.f6991e.getValue()).intValue();
    }

    /* renamed from: K */
    public final float mo9076K() {
        return Math.min(mo9097y().mo7425g5(PagerStateKt.m11977g()), ((float) mo9074I()) / 2.0f) / ((float) mo9074I());
    }

    /* renamed from: L */
    public final int mo9077L() {
        return ((Number) this.f6996j.getValue()).intValue();
    }

    /* renamed from: M */
    public final int mo9078M() {
        return ((Number) this.f6995i.getValue()).intValue();
    }

    /* renamed from: N */
    public final float mo9079N() {
        return ((Number) this.f6989c.getValue()).floatValue();
    }

    /* renamed from: O */
    public final int mo9080O() {
        return ((Number) this.f6997k.getValue()).intValue();
    }

    /* renamed from: P */
    public final List<C2517l> mo9081P() {
        return mo9070E().mo8378i();
    }

    /* renamed from: Q */
    public final void mo9082Q(@C12579k LazyListState lazyListState) {
        Intrinsics.checkNotNullParameter(lazyListState, "newState");
        mo9085U(lazyListState);
        this.f6992f.mo9050a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9083R(int r11, float r12, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.pager.PagerState$scrollToPage$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            androidx.compose.foundation.pager.PagerState$scrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState$scrollToPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.pager.PagerState$scrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$scrollToPage$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0085
        L_0x002c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0034:
            float r12 = r0.F$0
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0053
        L_0x0040:
            kotlin.C11661u0.m45747n(r13)
            r0.L$0 = r10
            r0.I$0 = r11
            r0.F$0 = r12
            r0.label = r4
            java.lang.Object r13 = r10.mo9091s(r0)
            if (r13 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r10
        L_0x0053:
            double r5 = (double) r12
            r7 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r13 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r7 = 0
            if (r13 > 0) goto L_0x0062
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 > 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r4 = r7
        L_0x0063:
            if (r4 == 0) goto L_0x0094
            int r11 = r2.mo9092t(r11)
            int r13 = r2.mo9072G()
            float r13 = (float) r13
            float r13 = r13 * r12
            int r12 = kotlin.math.C11409d.m43851L0(r13)
            androidx.compose.foundation.lazy.LazyListState r13 = r2.mo9071F()
            if (r13 == 0) goto L_0x0088
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r11 = r13.mo8324G(r11, r12, r0)
            if (r11 != r1) goto L_0x0085
            return r1
        L_0x0085:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        L_0x0088:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Required value was null."
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0094:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "pageOffsetFraction "
            r11.append(r13)
            r11.append(r12)
            java.lang.String r12 = " is not within the range -0.5 to 0.5"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.mo9083R(int, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: T */
    public final void mo9084T(int i) {
        this.f6994h.setValue(Integer.valueOf(i));
    }

    /* renamed from: U */
    public final void mo9085U(LazyListState lazyListState) {
        this.f6990d.setValue(lazyListState);
    }

    /* renamed from: V */
    public final void mo9086V(int i) {
        this.f6991e.setValue(Integer.valueOf(i));
    }

    /* renamed from: W */
    public final void mo9087W(int i) {
        this.f6995i.setValue(Integer.valueOf(i));
    }

    /* renamed from: X */
    public final void mo9088X(float f) {
        this.f6989c.setValue(Float.valueOf(f));
    }

    /* renamed from: Y */
    public final void mo9089Y() {
        mo9087W(mo9095w());
    }

    /* renamed from: a */
    public boolean mo7249a() {
        LazyListState F = mo9071F();
        if (F != null) {
            return F.mo7249a();
        }
        return true;
    }

    /* renamed from: b */
    public float mo7250b(float f) {
        LazyListState F = mo9071F();
        if (F != null) {
            return F.mo7250b(f);
        }
        return 0.0f;
    }

    /* renamed from: e */
    public boolean mo7251e() {
        LazyListState F = mo9071F();
        if (F != null) {
            return F.mo7251e();
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo7252f() {
        LazyListState F = mo9071F();
        if (F != null) {
            return F.mo7252f();
        }
        return true;
    }

    @C12580l
    /* renamed from: g */
    public Object mo7253g(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2201l, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        LazyListState F = mo9071F();
        if (F == null) {
            return C11079d2.f28267a;
        }
        Object g = F.mo7253g(mutatePriority, pVar, cVar);
        if (g == C11063b.m42612h()) {
            return g;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9090q(int r18, float r19, @org.jetbrains.annotations.C12579k androidx.compose.animation.core.C1968g<java.lang.Float> r20, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r21
            boolean r3 = r2 instanceof androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r3 = (androidx.compose.foundation.pager.PagerState$animateScrollToPage$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r3 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r10 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r3.label
            java.lang.String r11 = "Required value was null."
            r5 = 2
            r12 = 3
            r6 = 1
            if (r4 == 0) goto L_0x006b
            if (r4 == r6) goto L_0x0057
            if (r4 == r5) goto L_0x0044
            if (r4 != r12) goto L_0x003c
            java.lang.Object r1 = r3.L$0
            androidx.compose.foundation.pager.PagerState r1 = (androidx.compose.foundation.pager.PagerState) r1
            kotlin.C11661u0.m45747n(r2)
            goto L_0x0164
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            int r1 = r3.I$1
            int r4 = r3.I$0
            float r5 = r3.F$0
            java.lang.Object r6 = r3.L$1
            androidx.compose.animation.core.g r6 = (androidx.compose.animation.core.C1968g) r6
            java.lang.Object r7 = r3.L$0
            androidx.compose.foundation.pager.PagerState r7 = (androidx.compose.foundation.pager.PagerState) r7
            kotlin.C11661u0.m45747n(r2)
            goto L_0x0127
        L_0x0057:
            float r1 = r3.F$0
            int r4 = r3.I$0
            java.lang.Object r7 = r3.L$1
            androidx.compose.animation.core.g r7 = (androidx.compose.animation.core.C1968g) r7
            java.lang.Object r8 = r3.L$0
            androidx.compose.foundation.pager.PagerState r8 = (androidx.compose.foundation.pager.PagerState) r8
            kotlin.C11661u0.m45747n(r2)
            r2 = r1
            r1 = r4
            r13 = r7
            r14 = r8
            goto L_0x008f
        L_0x006b:
            kotlin.C11661u0.m45747n(r2)
            int r2 = r17.mo9095w()
            if (r1 != r2) goto L_0x0077
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0077:
            r3.L$0 = r0
            r2 = r20
            r3.L$1 = r2
            r3.I$0 = r1
            r4 = r19
            r3.F$0 = r4
            r3.label = r6
            java.lang.Object r7 = r0.mo9091s(r3)
            if (r7 != r10) goto L_0x008c
            return r10
        L_0x008c:
            r14 = r0
            r13 = r2
            r2 = r4
        L_0x008f:
            double r7 = (double) r2
            r15 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r4 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            r9 = 0
            if (r4 > 0) goto L_0x009e
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r4 > 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r6 = r9
        L_0x009f:
            if (r6 == 0) goto L_0x0175
            int r4 = r14.mo9095w()
            int r15 = r14.mo9092t(r1)
            r14.mo9084T(r15)
            java.util.List r6 = r14.mo9081P()
            java.lang.Object r6 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r6)
            androidx.compose.foundation.lazy.l r6 = (androidx.compose.foundation.lazy.C2517l) r6
            int r6 = r6.getIndex()
            java.util.List r7 = r14.mo9081P()
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40653k3(r7)
            androidx.compose.foundation.lazy.l r7 = (androidx.compose.foundation.lazy.C2517l) r7
            int r7 = r7.getIndex()
            int r8 = r14.mo9095w()
            if (r1 <= r8) goto L_0x00d0
            if (r1 > r7) goto L_0x00d8
        L_0x00d0:
            int r7 = r14.mo9095w()
            if (r1 >= r7) goto L_0x0137
            if (r1 >= r6) goto L_0x0137
        L_0x00d8:
            int r6 = r14.mo9095w()
            int r6 = r1 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r6 < r12) goto L_0x0137
            int r6 = r14.mo9095w()
            if (r1 <= r6) goto L_0x00f8
            java.util.List r6 = r14.mo9081P()
            int r6 = r6.size()
            int r1 = r1 - r6
            int r1 = kotlin.ranges.C11479u.m44447u(r1, r4)
            goto L_0x0105
        L_0x00f8:
            java.util.List r6 = r14.mo9081P()
            int r6 = r6.size()
            int r4 = kotlin.ranges.C11479u.m44313B(r6, r4)
            int r1 = r1 + r4
        L_0x0105:
            androidx.compose.foundation.lazy.LazyListState r4 = r14.mo9071F()
            if (r4 == 0) goto L_0x012d
            r6 = 0
            r8 = 2
            r9 = 0
            r3.L$0 = r14
            r3.L$1 = r13
            r3.F$0 = r2
            r3.I$0 = r15
            r3.I$1 = r1
            r3.label = r5
            r5 = r1
            r7 = r3
            java.lang.Object r4 = androidx.compose.foundation.lazy.LazyListState.m10849H(r4, r5, r6, r7, r8, r9)
            if (r4 != r10) goto L_0x0123
            return r10
        L_0x0123:
            r5 = r2
            r6 = r13
            r7 = r14
            r4 = r15
        L_0x0127:
            r15 = r4
            r2 = r5
            r13 = r6
            r4 = r1
            r1 = r7
            goto L_0x0138
        L_0x012d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r11.toString()
            r1.<init>(r2)
            throw r1
        L_0x0137:
            r1 = r14
        L_0x0138:
            int r5 = r1.mo9072G()
            int r15 = r15 * r5
            int r5 = r1.mo9072G()
            int r4 = r4 * r5
            float r5 = r1.mo9098z()
            int r6 = r1.mo9072G()
            float r6 = (float) r6
            float r2 = r2 * r6
            float r5 = r5 + r2
            int r15 = r15 - r4
            float r2 = (float) r15
            float r2 = r2 + r5
            androidx.compose.foundation.lazy.LazyListState r4 = r1.mo9071F()
            if (r4 == 0) goto L_0x016b
            r3.L$0 = r1
            r5 = 0
            r3.L$1 = r5
            r3.label = r12
            java.lang.Object r2 = androidx.compose.foundation.gestures.ScrollExtensionsKt.m9367a(r4, r2, r13, r3)
            if (r2 != r10) goto L_0x0164
            return r10
        L_0x0164:
            r2 = -1
            r1.mo9084T(r2)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x016b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r11.toString()
            r1.<init>(r2)
            throw r1
        L_0x0175:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "pageOffsetFraction "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = " is not within the range -0.5 to 0.5"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.mo9090q(int, float, androidx.compose.animation.core.g, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9091s(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 r0 = (androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1 r0 = new androidx.compose.foundation.pager.PagerState$awaitScrollDependencies$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0063
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.pager.PagerState r2 = (androidx.compose.foundation.pager.PagerState) r2
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004d
        L_0x003c:
            kotlin.C11661u0.m45747n(r6)
            androidx.compose.foundation.pager.AwaitLazyListStateSet r6 = r5.f6992f
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.mo9051b(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            androidx.compose.foundation.lazy.LazyListState r6 = r2.mo9071F()
            if (r6 == 0) goto L_0x0066
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r6 = r6.mo8337o()
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.mo8242a(r0)
            if (r6 != r1) goto L_0x0063
            return r1
        L_0x0063:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        L_0x0066:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.mo9091s(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: t */
    public final int mo9092t(int i) {
        if (mo9073H() > 0) {
            return C11479u.m44334I(i, 0, mo9073H() - 1);
        }
        return 0;
    }

    /* renamed from: u */
    public final int mo9093u() {
        return ((Number) this.f6994h.getValue()).intValue();
    }

    /* renamed from: v */
    public final C2517l mo9094v() {
        C2517l lVar;
        List<C2517l> P = mo9081P();
        if (P.isEmpty()) {
            lVar = null;
        } else {
            C2517l lVar2 = P.get(0);
            float f = -Math.abs(LazyListSnapLayoutInfoProviderKt.m9586c(mo9097y(), mo9070E(), lVar2, PagerStateKt.m11978h()));
            int G = CollectionsKt__CollectionsKt.m40443G(P);
            int i = 1;
            if (1 <= G) {
                while (true) {
                    C2517l lVar3 = P.get(i);
                    float f2 = -Math.abs(LazyListSnapLayoutInfoProviderKt.m9586c(mo9097y(), mo9070E(), lVar3, PagerStateKt.m11978h()));
                    if (Float.compare(f, f2) < 0) {
                        lVar2 = lVar3;
                        f = f2;
                    }
                    if (i == G) {
                        break;
                    }
                    i++;
                }
            }
            lVar = lVar2;
        }
        return lVar;
    }

    /* renamed from: w */
    public final int mo9095w() {
        return ((Number) this.f6993g.getValue()).intValue();
    }

    /* renamed from: x */
    public final float mo9096x() {
        return ((Number) this.f6998l.getValue()).floatValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.mo8338p();
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.unit.C16479d mo9097y() {
        /*
            r1 = this;
            androidx.compose.foundation.lazy.LazyListState r0 = r1.mo9071F()
            if (r0 == 0) goto L_0x000c
            androidx.compose.ui.unit.d r0 = r0.mo8338p()
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            androidx.compose.foundation.pager.PagerStateKt$c r0 = androidx.compose.foundation.pager.PagerStateKt.f7007g
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.mo9097y():androidx.compose.ui.unit.d");
    }

    /* renamed from: z */
    public final float mo9098z() {
        C2517l v = mo9094v();
        if (v != null) {
            return LazyListSnapLayoutInfoProviderKt.m9586c(mo9097y(), mo9070E(), v, PagerStateKt.m11978h());
        }
        return 0.0f;
    }

    public PagerState(int i, float f) {
        this.f6987a = i;
        this.f6988b = f;
        double d = (double) f;
        if (-0.5d <= d && d <= 0.5d) {
            this.f6989c = C8539f2.m30981g(Float.valueOf(0.0f), (C8410b2) null, 2, (Object) null);
            this.f6990d = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
            this.f6991e = C8539f2.m30981g(0, (C8410b2) null, 2, (Object) null);
            this.f6992f = new AwaitLazyListStateSet();
            this.f6993g = C8415c2.m30235d(new PagerState$currentPage$2(this));
            this.f6994h = C8539f2.m30981g(-1, (C8410b2) null, 2, (Object) null);
            this.f6995i = C8539f2.m30981g(Integer.valueOf(i), (C8410b2) null, 2, (Object) null);
            this.f6996j = C8415c2.m30235d(new PagerState$settledPage$2(this));
            this.f6997k = C8415c2.m30235d(new PagerState$targetPage$2(this));
            this.f6998l = C8415c2.m30235d(new PagerState$currentPageOffsetFraction$2(this));
            return;
        }
        throw new IllegalArgumentException(("initialPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagerState(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }
}
