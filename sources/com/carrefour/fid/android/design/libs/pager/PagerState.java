package com.carrefour.fid.android.design.libs.pager;

import androidx.annotation.C0337f0;
import androidx.annotation.C0379x;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2014v0;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.foundation.gestures.C2203n;
import androidx.compose.foundation.interaction.C2241e;
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
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\ncom/carrefour/fid/android/design/libs/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n76#2:332\n102#2,2:333\n76#2:341\n76#2:342\n76#2:343\n102#2,2:344\n76#2:346\n102#2,2:347\n533#3,6:335\n288#3,2:349\n223#3,2:351\n1#4:353\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\ncom/carrefour/fid/android/design/libs/pager/PagerState\n*L\n58#1:332\n58#1:333,2\n84#1:341\n108#1:342\n121#1:343\n121#1:344,2\n123#1:346\n123#1:347,2\n62#1:335,6\n191#1:349,2\n209#1:351,2\n*E\n"})
public final class PagerState implements C2203n {
    @C12579k

    /* renamed from: g */
    public static final C37463a f94082g = new C37463a((DefaultConstructorMarker) null);

    /* renamed from: h */
    public static final int f94083h = 0;
    @C12579k

    /* renamed from: i */
    public static final C8628e<PagerState, ?> f94084i = ListSaverKt.m31335a(PagerState$Companion$Saver$1.f94091f, PagerState$Companion$Saver$2.f94092f);
    @C12579k

    /* renamed from: a */
    public final LazyListState f94085a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f94086b;
    @C12579k

    /* renamed from: c */
    public final C8578k2 f94087c;
    @C12579k

    /* renamed from: d */
    public final C8578k2 f94088d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f94089e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f94090f;

    /* renamed from: com.carrefour.fid.android.design.libs.pager.PagerState$a */
    public static final class C37463a {
        public /* synthetic */ C37463a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<PagerState, ?> mo114123a() {
            return PagerState.f94084i;
        }

        public C37463a() {
        }
    }

    public PagerState() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: E */
    public static /* synthetic */ Object m153678E(PagerState pagerState, int i, float f, C11045c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.mo114103D(i, f, cVar);
    }

    /* renamed from: n */
    public static /* synthetic */ Object m153682n(PagerState pagerState, int i, float f, C1968g gVar, float f2, boolean z, C11045c cVar, int i2, Object obj) {
        float f3;
        C2014v0 v0Var;
        float f4;
        boolean z2;
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if ((i2 & 4) != 0) {
            v0Var = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
        } else {
            v0Var = gVar;
        }
        if ((i2 & 8) != 0) {
            f4 = 0.0f;
        } else {
            f4 = f2;
        }
        if ((i2 & 16) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        return pagerState.mo114109l(i, f3, v0Var, f4, z2, cVar);
    }

    /* renamed from: o */
    public static /* synthetic */ Object m153683o(PagerState pagerState, int i, float f, C11045c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.mo114110m(i, f, cVar);
    }

    /* renamed from: A */
    public final void mo114100A() {
        mo114108J();
        mo114104F((Integer) null);
    }

    /* renamed from: B */
    public final void mo114101B(int i, String str) {
        boolean z = true;
        if (mo114120x() == 0) {
            if (i != 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException((str + " must be 0 when pageCount is 0").toString());
            }
            return;
        }
        if (i < 0 || i >= mo114120x()) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException((str + "[" + i + "] must be >= 0 and < pageCount").toString());
        }
    }

    /* renamed from: C */
    public final void mo114102C(float f, String str) {
        boolean z = true;
        if (mo114120x() == 0) {
            if (f != 0.0f) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException((str + " must be 0f when pageCount is 0").toString());
            }
            return;
        }
        if (0.0f > f || f > 1.0f) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException((str + " must be >= 0 and <= 1").toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114103D(@androidx.annotation.C0337f0(from = 0) int r10, @androidx.annotation.C0379x(from = 0.0d, mo1016to = 1.0d) float r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.design.libs.pager.PagerState$scrollToPage$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.design.libs.pager.PagerState$scrollToPage$1 r0 = (com.carrefour.fid.android.design.libs.pager.PagerState$scrollToPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.design.libs.pager.PagerState$scrollToPage$1 r0 = new com.carrefour.fid.android.design.libs.pager.PagerState$scrollToPage$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r0.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0044
            if (r1 == r2) goto L_0x0038
            if (r1 != r8) goto L_0x0030
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.design.libs.pager.PagerState r10 = (com.carrefour.fid.android.design.libs.pager.PagerState) r10
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x008a
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            float r11 = r0.F$0
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.design.libs.pager.PagerState r10 = (com.carrefour.fid.android.design.libs.pager.PagerState) r10
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x006d
        L_0x0042:
            r11 = move-exception
            goto L_0x0092
        L_0x0044:
            kotlin.C11661u0.m45747n(r12)
            java.lang.String r12 = "page"
            r9.mo114101B(r10, r12)
            java.lang.String r12 = "pageOffset"
            r9.mo114102C(r11, r12)
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r10)     // Catch:{ all -> 0x0090 }
            r9.mo114104F(r12)     // Catch:{ all -> 0x0090 }
            androidx.compose.foundation.lazy.LazyListState r1 = r9.f94085a     // Catch:{ all -> 0x0090 }
            r3 = 0
            r5 = 2
            r6 = 0
            r0.L$0 = r9     // Catch:{ all -> 0x0090 }
            r0.F$0 = r11     // Catch:{ all -> 0x0090 }
            r0.label = r2     // Catch:{ all -> 0x0090 }
            r2 = r10
            r4 = r0
            java.lang.Object r10 = androidx.compose.foundation.lazy.LazyListState.m10849H(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0090 }
            if (r10 != r7) goto L_0x006c
            return r7
        L_0x006c:
            r10 = r9
        L_0x006d:
            r12 = 953267991(0x38d1b717, float:1.0E-4)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x008a
            r2 = 0
            com.carrefour.fid.android.design.libs.pager.PagerState$scrollToPage$2 r3 = new com.carrefour.fid.android.design.libs.pager.PagerState$scrollToPage$2     // Catch:{ all -> 0x0042 }
            r12 = 0
            r3.<init>(r10, r11, r12)     // Catch:{ all -> 0x0042 }
            r5 = 1
            r6 = 0
            r0.L$0 = r10     // Catch:{ all -> 0x0042 }
            r0.label = r8     // Catch:{ all -> 0x0042 }
            r1 = r10
            r4 = r0
            java.lang.Object r11 = androidx.compose.foundation.gestures.C2203n.m9563c(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0042 }
            if (r11 != r7) goto L_0x008a
            return r7
        L_0x008a:
            r10.mo114100A()
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x0090:
            r11 = move-exception
            r10 = r9
        L_0x0092:
            r10.mo114100A()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.libs.pager.PagerState.mo114103D(int, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: F */
    public final void mo114104F(Integer num) {
        this.f94089e.setValue(num);
    }

    /* renamed from: G */
    public final void mo114105G(int i) {
        if (i != mo114122z()) {
            mo114107I(i);
        }
    }

    /* renamed from: H */
    public final void mo114106H(@C12580l C11289a<Integer> aVar) {
        this.f94090f.setValue(aVar);
    }

    /* renamed from: I */
    public final void mo114107I(int i) {
        this.f94086b.setValue(Integer.valueOf(i));
    }

    /* renamed from: J */
    public final void mo114108J() {
        C2517l q = mo114112q();
        mo114105G(q != null ? q.getIndex() : 0);
    }

    /* renamed from: b */
    public float mo7250b(float f) {
        return this.f94085a.mo7250b(f);
    }

    /* renamed from: e */
    public boolean mo7251e() {
        return this.f94085a.mo7251e();
    }

    @C12580l
    /* renamed from: g */
    public Object mo7253g(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2201l, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = this.f94085a.mo7253g(mutatePriority, pVar, cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C11395k(message = "Replaced with animateScrollToPage(page, pageOffset)", replaceWith = @C11587t0(expression = "animateScrollToPage(page = page, pageOffset = pageOffset)", imports = {}))
    @C12580l
    /* renamed from: l */
    public final Object mo114109l(@C0337f0(from = 0) int i, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C12579k C1968g<Float> gVar, float f2, boolean z, @C12579k C11045c<? super C11079d2> cVar) {
        Object m = mo114110m(i, f, cVar);
        return m == C11063b.m42612h() ? m : C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.carrefour.fid.android.design.libs.pager.PagerState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.carrefour.fid.android.design.libs.pager.PagerState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: com.carrefour.fid.android.design.libs.pager.PagerState} */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df A[SYNTHETIC, Splitter:B:49:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f9 A[Catch:{ all -> 0x00f5, all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017b A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:78:0x0165=Splitter:B:78:0x0165, B:23:0x0066=Splitter:B:23:0x0066} */
    @org.jetbrains.annotations.C12580l
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114110m(@androidx.annotation.C0337f0(from = 0) int r19, @androidx.annotation.C0379x(from = 0.0d, mo1016to = 1.0d) float r20, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof com.carrefour.fid.android.design.libs.pager.PagerState$animateScrollToPage$2
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.carrefour.fid.android.design.libs.pager.PagerState$animateScrollToPage$2 r4 = (com.carrefour.fid.android.design.libs.pager.PagerState$animateScrollToPage$2) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            com.carrefour.fid.android.design.libs.pager.PagerState$animateScrollToPage$2 r4 = new com.carrefour.fid.android.design.libs.pager.PagerState$animateScrollToPage$2
            r4.<init>(r1, r3)
        L_0x0020:
            java.lang.Object r3 = r4.result
            java.lang.Object r11 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r5 = r4.label
            r13 = 5
            r14 = 4
            r15 = 2
            r10 = 1
            r9 = 3
            if (r5 == 0) goto L_0x008b
            if (r5 == r10) goto L_0x0074
            if (r5 == r15) goto L_0x006b
            if (r5 == r9) goto L_0x0061
            if (r5 == r14) goto L_0x0047
            if (r5 != r13) goto L_0x003f
            java.lang.Object r0 = r4.L$0
            r2 = r0
            com.carrefour.fid.android.design.libs.pager.PagerState r2 = (com.carrefour.fid.android.design.libs.pager.PagerState) r2
            goto L_0x0066
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0047:
            int r0 = r4.I$1
            float r2 = r4.F$0
            int r5 = r4.I$0
            java.lang.Object r6 = r4.L$0
            com.carrefour.fid.android.design.libs.pager.PagerState r6 = (com.carrefour.fid.android.design.libs.pager.PagerState) r6
            kotlin.C11661u0.m45747n(r3)     // Catch:{ all -> 0x005d }
            r3 = r10
            r17 = r5
            r5 = r2
            r2 = r6
            r6 = r17
            goto L_0x0165
        L_0x005d:
            r0 = move-exception
            r2 = r6
            goto L_0x01bf
        L_0x0061:
            java.lang.Object r0 = r4.L$0
            r2 = r0
            com.carrefour.fid.android.design.libs.pager.PagerState r2 = (com.carrefour.fid.android.design.libs.pager.PagerState) r2
        L_0x0066:
            kotlin.C11661u0.m45747n(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x01ac
        L_0x006b:
            java.lang.Object r0 = r4.L$0
            r2 = r0
            com.carrefour.fid.android.design.libs.pager.PagerState r2 = (com.carrefour.fid.android.design.libs.pager.PagerState) r2
            goto L_0x0066
        L_0x0071:
            r0 = move-exception
            goto L_0x01bf
        L_0x0074:
            float r0 = r4.F$0
            int r2 = r4.I$0
            java.lang.Object r5 = r4.L$0
            com.carrefour.fid.android.design.libs.pager.PagerState r5 = (com.carrefour.fid.android.design.libs.pager.PagerState) r5
            kotlin.C11661u0.m45747n(r3)     // Catch:{ all -> 0x0087 }
            r12 = r9
            r3 = r10
            r17 = r2
            r2 = r0
            r0 = r17
            goto L_0x00d1
        L_0x0087:
            r0 = move-exception
            r2 = r5
            goto L_0x01bf
        L_0x008b:
            kotlin.C11661u0.m45747n(r3)
            java.lang.String r3 = "page"
            r1.mo114101B(r0, r3)
            java.lang.String r3 = "pageOffset"
            r1.mo114102C(r2, r3)
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r19)     // Catch:{ all -> 0x01bd }
            r1.mo114104F(r3)     // Catch:{ all -> 0x01bd }
            androidx.compose.foundation.lazy.LazyListState r3 = r1.f94085a     // Catch:{ all -> 0x01bd }
            int r3 = r3.mo8339q()     // Catch:{ all -> 0x01bd }
            int r5 = r0 - r3
            int r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x01bd }
            if (r5 <= r9) goto L_0x00d4
            androidx.compose.foundation.lazy.LazyListState r5 = r1.f94085a     // Catch:{ all -> 0x01bd }
            if (r0 <= r3) goto L_0x00b4
            int r3 = r0 + -3
            goto L_0x00b6
        L_0x00b4:
            int r3 = r0 + 3
        L_0x00b6:
            r6 = r3
            r7 = 0
            r3 = 2
            r16 = 0
            r4.L$0 = r1     // Catch:{ all -> 0x01bd }
            r4.I$0 = r0     // Catch:{ all -> 0x01bd }
            r4.F$0 = r2     // Catch:{ all -> 0x01bd }
            r4.label = r10     // Catch:{ all -> 0x01bd }
            r8 = r4
            r12 = r9
            r9 = r3
            r3 = r10
            r10 = r16
            java.lang.Object r5 = androidx.compose.foundation.lazy.LazyListState.m10849H(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01bd }
            if (r5 != r11) goto L_0x00d0
            return r11
        L_0x00d0:
            r5 = r1
        L_0x00d1:
            r6 = r0
            r10 = r5
            goto L_0x00d8
        L_0x00d4:
            r12 = r9
            r3 = r10
            r6 = r0
            r10 = r1
        L_0x00d8:
            r0 = 1000593162(0x3ba3d70a, float:0.005)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00f9
            androidx.compose.foundation.lazy.LazyListState r5 = r10.f94085a     // Catch:{ all -> 0x00f5 }
            r7 = 0
            r9 = 2
            r0 = 0
            r4.L$0 = r10     // Catch:{ all -> 0x00f5 }
            r4.label = r15     // Catch:{ all -> 0x00f5 }
            r8 = r4
            r15 = r10
            r10 = r0
            java.lang.Object r0 = androidx.compose.foundation.lazy.LazyListState.m10852l(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01ba }
            if (r0 != r11) goto L_0x00f2
            return r11
        L_0x00f2:
            r2 = r15
            goto L_0x01ac
        L_0x00f5:
            r0 = move-exception
            r15 = r10
            goto L_0x01bb
        L_0x00f9:
            r15 = r10
            androidx.compose.foundation.lazy.LazyListState r0 = r15.f94085a     // Catch:{ all -> 0x01ba }
            androidx.compose.foundation.lazy.o r0 = r0.mo8343u()     // Catch:{ all -> 0x01ba }
            java.util.List r0 = r0.mo8378i()     // Catch:{ all -> 0x01ba }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x01ba }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01ba }
        L_0x010a:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x01ba }
            if (r5 == 0) goto L_0x0123
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x01ba }
            r7 = r5
            androidx.compose.foundation.lazy.l r7 = (androidx.compose.foundation.lazy.C2517l) r7     // Catch:{ all -> 0x01ba }
            int r7 = r7.getIndex()     // Catch:{ all -> 0x01ba }
            if (r7 != r6) goto L_0x011f
            r10 = r3
            goto L_0x0120
        L_0x011f:
            r10 = 0
        L_0x0120:
            if (r10 == 0) goto L_0x010a
            goto L_0x0124
        L_0x0123:
            r5 = 0
        L_0x0124:
            androidx.compose.foundation.lazy.l r5 = (androidx.compose.foundation.lazy.C2517l) r5     // Catch:{ all -> 0x01ba }
            if (r5 == 0) goto L_0x013f
            androidx.compose.foundation.lazy.LazyListState r0 = r15.f94085a     // Catch:{ all -> 0x01ba }
            int r3 = r5.getSize()     // Catch:{ all -> 0x01ba }
            float r3 = (float) r3     // Catch:{ all -> 0x01ba }
            float r3 = r3 * r2
            int r2 = kotlin.math.C11409d.m43851L0(r3)     // Catch:{ all -> 0x01ba }
            r4.L$0 = r15     // Catch:{ all -> 0x01ba }
            r4.label = r12     // Catch:{ all -> 0x01ba }
            java.lang.Object r0 = r0.mo8334k(r6, r2, r4)     // Catch:{ all -> 0x01ba }
            if (r0 != r11) goto L_0x00f2
            return r11
        L_0x013f:
            androidx.compose.foundation.lazy.l r0 = r15.mo114112q()     // Catch:{ all -> 0x01ba }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ all -> 0x01ba }
            int r0 = r0.getSize()     // Catch:{ all -> 0x01ba }
            androidx.compose.foundation.lazy.LazyListState r5 = r15.f94085a     // Catch:{ all -> 0x01ba }
            float r7 = (float) r0     // Catch:{ all -> 0x01ba }
            float r7 = r7 * r2
            int r7 = kotlin.math.C11409d.m43851L0(r7)     // Catch:{ all -> 0x01ba }
            r4.L$0 = r15     // Catch:{ all -> 0x01ba }
            r4.I$0 = r6     // Catch:{ all -> 0x01ba }
            r4.F$0 = r2     // Catch:{ all -> 0x01ba }
            r4.I$1 = r0     // Catch:{ all -> 0x01ba }
            r4.label = r14     // Catch:{ all -> 0x01ba }
            java.lang.Object r5 = r5.mo8334k(r6, r7, r4)     // Catch:{ all -> 0x01ba }
            if (r5 != r11) goto L_0x0163
            return r11
        L_0x0163:
            r5 = r2
            r2 = r15
        L_0x0165:
            androidx.compose.foundation.lazy.LazyListState r7 = r2.f94085a     // Catch:{ all -> 0x0071 }
            androidx.compose.foundation.lazy.o r7 = r7.mo8343u()     // Catch:{ all -> 0x0071 }
            java.util.List r7 = r7.mo8378i()     // Catch:{ all -> 0x0071 }
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x0071 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0071 }
        L_0x0175:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0071 }
            if (r8 == 0) goto L_0x01b2
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0071 }
            r9 = r8
            androidx.compose.foundation.lazy.l r9 = (androidx.compose.foundation.lazy.C2517l) r9     // Catch:{ all -> 0x0071 }
            int r9 = r9.getIndex()     // Catch:{ all -> 0x0071 }
            if (r9 != r6) goto L_0x018a
            r10 = r3
            goto L_0x018b
        L_0x018a:
            r10 = 0
        L_0x018b:
            if (r10 == 0) goto L_0x0175
            androidx.compose.foundation.lazy.l r8 = (androidx.compose.foundation.lazy.C2517l) r8     // Catch:{ all -> 0x0071 }
            int r3 = r8.getSize()     // Catch:{ all -> 0x0071 }
            if (r3 == r0) goto L_0x01ac
            androidx.compose.foundation.lazy.LazyListState r0 = r2.f94085a     // Catch:{ all -> 0x0071 }
            int r3 = r8.getSize()     // Catch:{ all -> 0x0071 }
            float r3 = (float) r3     // Catch:{ all -> 0x0071 }
            float r3 = r3 * r5
            int r3 = kotlin.math.C11409d.m43851L0(r3)     // Catch:{ all -> 0x0071 }
            r4.L$0 = r2     // Catch:{ all -> 0x0071 }
            r4.label = r13     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.mo8334k(r6, r3, r4)     // Catch:{ all -> 0x0071 }
            if (r0 != r11) goto L_0x01ac
            return r11
        L_0x01ac:
            r2.mo114100A()
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x01b2:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = "Collection contains no element matching the predicate."
            r0.<init>(r3)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x01ba:
            r0 = move-exception
        L_0x01bb:
            r2 = r15
            goto L_0x01bf
        L_0x01bd:
            r0 = move-exception
            r2 = r1
        L_0x01bf:
            r2.mo114100A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.libs.pager.PagerState.mo114110m(int, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: p */
    public final Integer mo114111p() {
        return (Integer) this.f94089e.getValue();
    }

    @C12580l
    /* renamed from: q */
    public final C2517l mo114112q() {
        Object obj;
        C2517l lVar;
        boolean z;
        C2517l lVar2 = null;
        try {
            Result.C10852a aVar = Result.f28060a;
            List<C2517l> i = this.f94085a.mo8343u().mo8378i();
            ListIterator<C2517l> listIterator = i.listIterator(i.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    lVar = null;
                    break;
                }
                lVar = listIterator.previous();
                if (lVar.getOffset() <= 0) {
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
            obj = Result.m38702b(lVar);
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        if (!Result.m38709i(obj)) {
            lVar2 = obj;
        }
        return lVar2;
    }

    /* renamed from: r */
    public final float mo114113r() {
        C2517l q = mo114112q();
        if (q != null) {
            return C11479u.m44331H(((float) (-q.getOffset())) / ((float) q.getSize()), 0.0f, 1.0f);
        }
        return 0.0f;
    }

    @C0337f0(from = 0)
    /* renamed from: s */
    public final int mo114114s() {
        return mo114122z();
    }

    /* renamed from: t */
    public final float mo114115t() {
        return ((Number) this.f94088d.getValue()).floatValue();
    }

    @C12579k
    public String toString() {
        int x = mo114120x();
        int s = mo114114s();
        float t = mo114115t();
        return "PagerState(pageCount=" + x + ", currentPage=" + s + ", currentPageOffset=" + t + ")";
    }

    @C12580l
    /* renamed from: u */
    public final C11289a<Integer> mo114117u() {
        return (C11289a) this.f94090f.getValue();
    }

    @C12579k
    /* renamed from: v */
    public final C2241e mo114118v() {
        return this.f94085a.mo8341s();
    }

    @C12579k
    /* renamed from: w */
    public final LazyListState mo114119w() {
        return this.f94085a;
    }

    @C0337f0(from = 0)
    /* renamed from: x */
    public final int mo114120x() {
        return ((Number) this.f94087c.getValue()).intValue();
    }

    /* renamed from: y */
    public final int mo114121y() {
        Integer p = mo114111p();
        if (p == null) {
            C11289a<Integer> u = mo114117u();
            if (u != null) {
                p = u.invoke();
            } else {
                p = null;
            }
            if (p == null) {
                if (!mo7251e()) {
                    return mo114114s();
                }
                if (Math.abs(mo114115t()) < 0.001f) {
                    return mo114114s();
                }
                if (mo114115t() < 0.0f) {
                    return C11479u.m44447u(mo114114s() - 1, 0);
                }
                return C11479u.m44313B(mo114114s() + 1, mo114120x() - 1);
            }
        }
        return p.intValue();
    }

    /* renamed from: z */
    public final int mo114122z() {
        return ((Number) this.f94086b.getValue()).intValue();
    }

    public PagerState(@C0337f0(from = 0) int i) {
        this.f94085a = new LazyListState(i, 0, 2, (DefaultConstructorMarker) null);
        this.f94086b = C8539f2.m30981g(Integer.valueOf(i), (C8410b2) null, 2, (Object) null);
        this.f94087c = C8415c2.m30235d(new PagerState$pageCount$2(this));
        this.f94088d = C8415c2.m30235d(new PagerState$currentPageOffset$2(this));
        this.f94089e = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f94090f = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagerState(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
