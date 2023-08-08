package com.google.accompanist.pager;

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
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C11479u;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of Insets is Pager.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n", replaceWith = @C11587t0(expression = "PagerState(currentPage = currentPage)", imports = {"androidx.compose.foundation.pager.PagerState"}))
@C8547h2
@C11363r0({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\ncom/google/accompanist/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n76#2:391\n102#2,2:392\n76#2:408\n102#2,2:409\n76#2:417\n76#2:418\n76#2:419\n102#2,2:420\n76#2:422\n102#2,2:423\n1963#3,14:394\n533#3,6:411\n288#3,2:425\n288#3,2:427\n1#4:429\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\ncom/google/accompanist/pager/PagerState\n*L\n100#1:391\n100#1:392,2\n116#1:408\n116#1:409,2\n136#1:417\n163#1:418\n172#1:419\n172#1:420,2\n174#1:422\n174#1:423,2\n106#1:394,14\n119#1:411,6\n250#1:425,2\n268#1:427,2\n*E\n"})
public final class PagerState implements C2203n {
    @C12579k

    /* renamed from: h */
    public static final C15026a f37138h = new C15026a((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final int f37139i = 0;
    @C12579k

    /* renamed from: j */
    public static final C8628e<PagerState, ?> f37140j = ListSaverKt.m31335a(PagerState$Companion$Saver$1.f37148f, PagerState$Companion$Saver$2.f37149f);
    @C12579k

    /* renamed from: a */
    public final LazyListState f37141a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f37142b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f37143c;
    @C12579k

    /* renamed from: d */
    public final C8578k2 f37144d;
    @C12579k

    /* renamed from: e */
    public final C8578k2 f37145e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f37146f;
    @C12579k

    /* renamed from: g */
    public final C8700z0 f37147g;

    /* renamed from: com.google.accompanist.pager.PagerState$a */
    public static final class C15026a {
        public /* synthetic */ C15026a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<PagerState, ?> mo42021a() {
            return PagerState.f37140j;
        }

        public C15026a() {
        }
    }

    public PagerState() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    @C11395k(message = "targetPage is deprecated in favor of currentPage as currentPage property isnow being updated right after we over scrolled the half of the previous current page.If you still think that you need targetPage, not currentPage please file a bug as we are planning to remove this property in future.", replaceWith = @C11587t0(expression = "currentPage", imports = {}))
    /* renamed from: A */
    public static /* synthetic */ void m64374A() {
    }

    /* renamed from: G */
    public static /* synthetic */ Object m64375G(PagerState pagerState, int i, float f, C11045c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.mo42000F(i, f, cVar);
    }

    /* renamed from: m */
    public static /* synthetic */ Object m64378m(PagerState pagerState, int i, float f, C1968g gVar, float f2, boolean z, C11045c cVar, int i2, Object obj) {
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
        return pagerState.mo42007k(i, f3, v0Var, f4, z2, cVar);
    }

    /* renamed from: n */
    public static /* synthetic */ Object m64379n(PagerState pagerState, int i, float f, C11045c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.mo42008l(i, f, cVar);
    }

    @C11395k(message = "pageCount is deprecated, use androidx.compose.foundation.pager.PagerState.canScrollForward or androidx.compose.foundation.pager.PagerState.canScrollBackward")
    /* renamed from: y */
    public static /* synthetic */ void m64380y() {
    }

    /* renamed from: B */
    public final int mo41996B() {
        return ((Number) this.f37142b.getValue()).intValue();
    }

    /* renamed from: C */
    public final void mo41997C() {
        mo42001H((Integer) null);
    }

    /* renamed from: D */
    public final void mo41998D(int i, String str) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException((str + C12361b.f30260k + i + "] must be >= 0").toString());
        }
    }

    /* renamed from: E */
    public final void mo41999E(float f, String str) {
        boolean z = false;
        if (-1.0f <= f && f <= 1.0f) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException((str + " must be >= -1 and <= 1").toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42000F(@androidx.annotation.C0337f0(from = 0) int r10, @androidx.annotation.C0379x(from = -1.0d, mo1016to = 1.0d) float r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.google.accompanist.pager.PagerState$scrollToPage$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.accompanist.pager.PagerState$scrollToPage$1 r0 = (com.google.accompanist.pager.PagerState$scrollToPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.google.accompanist.pager.PagerState$scrollToPage$1 r0 = new com.google.accompanist.pager.PagerState$scrollToPage$1
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
            com.google.accompanist.pager.PagerState r10 = (com.google.accompanist.pager.PagerState) r10
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x0097
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            float r11 = r0.F$0
            java.lang.Object r10 = r0.L$0
            com.google.accompanist.pager.PagerState r10 = (com.google.accompanist.pager.PagerState) r10
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x006d
        L_0x0042:
            r11 = move-exception
            goto L_0x009f
        L_0x0044:
            kotlin.C11661u0.m45747n(r12)
            java.lang.String r12 = "page"
            r9.mo41998D(r10, r12)
            java.lang.String r12 = "pageOffset"
            r9.mo41999E(r11, r12)
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r10)     // Catch:{ all -> 0x009d }
            r9.mo42001H(r12)     // Catch:{ all -> 0x009d }
            androidx.compose.foundation.lazy.LazyListState r1 = r9.f37141a     // Catch:{ all -> 0x009d }
            r3 = 0
            r5 = 2
            r6 = 0
            r0.L$0 = r9     // Catch:{ all -> 0x009d }
            r0.F$0 = r11     // Catch:{ all -> 0x009d }
            r0.label = r2     // Catch:{ all -> 0x009d }
            r2 = r10
            r4 = r0
            java.lang.Object r10 = androidx.compose.foundation.lazy.LazyListState.m10849H(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x009d }
            if (r10 != r7) goto L_0x006c
            return r7
        L_0x006c:
            r10 = r9
        L_0x006d:
            r10.mo42006M()     // Catch:{ all -> 0x0042 }
            float r12 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0042 }
            r1 = 953267991(0x38d1b717, float:1.0E-4)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x0097
            androidx.compose.foundation.lazy.l r12 = r10.mo42011q()     // Catch:{ all -> 0x0042 }
            if (r12 == 0) goto L_0x0097
            r2 = 0
            com.google.accompanist.pager.PagerState$scrollToPage$2$1 r3 = new com.google.accompanist.pager.PagerState$scrollToPage$2$1     // Catch:{ all -> 0x0042 }
            r1 = 0
            r3.<init>(r12, r10, r11, r1)     // Catch:{ all -> 0x0042 }
            r5 = 1
            r6 = 0
            r0.L$0 = r10     // Catch:{ all -> 0x0042 }
            r0.label = r8     // Catch:{ all -> 0x0042 }
            r1 = r10
            r4 = r0
            java.lang.Object r11 = androidx.compose.foundation.gestures.C2203n.m9563c(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0042 }
            if (r11 != r7) goto L_0x0097
            return r7
        L_0x0097:
            r10.mo41997C()
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x009d:
            r11 = move-exception
            r10 = r9
        L_0x009f:
            r10.mo41997C()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.PagerState.mo42000F(int, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: H */
    public final void mo42001H(Integer num) {
        this.f37146f.setValue(num);
    }

    /* renamed from: I */
    public final void mo42002I(int i) {
        if (i != mo41996B()) {
            mo42005L(i);
        }
    }

    /* renamed from: J */
    public final void mo42003J(@C12580l C11289a<Integer> aVar) {
        this.f37147g.setValue(aVar);
    }

    /* renamed from: K */
    public final void mo42004K(int i) {
        this.f37143c.setValue(Integer.valueOf(i));
    }

    /* renamed from: L */
    public final void mo42005L(int i) {
        this.f37142b.setValue(Integer.valueOf(i));
    }

    /* renamed from: M */
    public final void mo42006M() {
        C2517l w = mo42018w();
        if (w != null) {
            mo42002I(w.getIndex());
        }
    }

    /* renamed from: b */
    public float mo7250b(float f) {
        return this.f37141a.mo7250b(f);
    }

    /* renamed from: e */
    public boolean mo7251e() {
        return this.f37141a.mo7251e();
    }

    @C12580l
    /* renamed from: g */
    public Object mo7253g(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2201l, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = this.f37141a.mo7253g(mutatePriority, pVar, cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C11395k(message = "Replaced with animateScrollToPage(page, pageOffset)", replaceWith = @C11587t0(expression = "animateScrollToPage(page = page, pageOffset = pageOffset)", imports = {}))
    @C12580l
    /* renamed from: k */
    public final Object mo42007k(@C0337f0(from = 0) int i, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C12579k C1968g<Float> gVar, float f2, boolean z, @C12579k C11045c<? super C11079d2> cVar) {
        Object l = mo42008l(i, f, cVar);
        return l == C11063b.m42612h() ? l : C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: androidx.compose.foundation.lazy.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: androidx.compose.foundation.lazy.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.compose.foundation.lazy.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: androidx.compose.foundation.lazy.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.accompanist.pager.PagerState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.google.accompanist.pager.PagerState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: com.google.accompanist.pager.PagerState} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        kotlin.C11661u0.m45747n(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cc, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d8, code lost:
        if (java.lang.Math.abs(r2) > 0.005f) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        r5 = r3.f37141a;
        r4.L$0 = r3;
        r4.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        if (androidx.compose.foundation.lazy.LazyListState.m10852l(r5, r0, 0, r4, 2, (java.lang.Object) null) != r11) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ec, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ed, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
        r5 = r3.f37141a;
        r7 = new com.google.accompanist.pager.PagerState$animateScrollToPage$3((kotlin.coroutines.C11045c<? super com.google.accompanist.pager.PagerState$animateScrollToPage$3>) null);
        r4.L$0 = r3;
        r4.I$0 = r0;
        r4.F$0 = r2;
        r4.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0107, code lost:
        if (androidx.compose.foundation.gestures.C2203n.m9563c(r5, (androidx.compose.foundation.MutatePriority) null, r7, r4, 1, (java.lang.Object) null) != r11) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0109, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010a, code lost:
        r5 = r0;
        r0 = r2;
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r3 = r2.f37141a.mo8343u();
        r6 = r3.mo8378i().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0121, code lost:
        if (r6.hasNext() == false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0123, code lost:
        r7 = r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012e, code lost:
        if (((androidx.compose.foundation.lazy.C2517l) r7).getIndex() != r5) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0130, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0132, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0133, code lost:
        if (r8 == false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0136, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0137, code lost:
        r7 = (androidx.compose.foundation.lazy.C2517l) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0139, code lost:
        if (r7 == null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013b, code lost:
        r3 = r2.f37141a;
        r0 = kotlin.math.C11409d.m43851L0(((float) (r7.getSize() + r2.mo42016u())) * r0);
        r4.L$0 = r2;
        r4.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0155, code lost:
        if (r3.mo8334k(r5, r0, r4) != r11) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0157, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0163, code lost:
        if ((!r3.mo8378i().isEmpty()) == false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0165, code lost:
        r3 = ((androidx.compose.foundation.lazy.C2517l) kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r3.mo8378i())).getSize() + r2.mo42016u();
        r6 = r2.f37141a;
        r7 = kotlin.math.C11409d.m43851L0(((float) r3) * r0);
        r4.L$0 = r2;
        r4.I$0 = r5;
        r4.F$0 = r0;
        r4.I$1 = r3;
        r4.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018f, code lost:
        if (r6.mo8334k(r5, r7, r4) != r11) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0191, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0192, code lost:
        r16 = r3;
        r3 = r0;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0197, code lost:
        r6 = r2.f37141a.mo8343u().mo8378i().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ab, code lost:
        if (r6.hasNext() == false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ad, code lost:
        r7 = r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b8, code lost:
        if (r7.getIndex() != r5) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ba, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bc, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01bd, code lost:
        if (r8 == false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bf, code lost:
        r13 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c0, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c2, code lost:
        if (r13 == null) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cd, code lost:
        if ((r13.getSize() + r2.mo42016u()) == r0) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01cf, code lost:
        r0 = r2.f37141a;
        r3 = kotlin.math.C11409d.m43851L0(((float) (r13.getSize() + r2.mo42016u())) * r3);
        r4.L$0 = r2;
        r4.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e9, code lost:
        if (r0.mo8334k(r5, r3, r4) != r11) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01eb, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ec, code lost:
        r2.mo41997C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f1, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f3, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0057=Splitter:B:18:0x0057, B:57:0x010d=Splitter:B:57:0x010d} */
    @org.jetbrains.annotations.C12580l
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42008l(@androidx.annotation.C0337f0(from = 0) int r18, @androidx.annotation.C0379x(from = -1.0d, mo1016to = 1.0d) float r19, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r3 instanceof com.google.accompanist.pager.PagerState$animateScrollToPage$2
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.google.accompanist.pager.PagerState$animateScrollToPage$2 r4 = (com.google.accompanist.pager.PagerState$animateScrollToPage$2) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            com.google.accompanist.pager.PagerState$animateScrollToPage$2 r4 = new com.google.accompanist.pager.PagerState$animateScrollToPage$2
            r4.<init>(r1, r3)
        L_0x0020:
            java.lang.Object r3 = r4.result
            java.lang.Object r11 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r5 = r4.label
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 3
            switch(r5) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0077;
                case 2: goto L_0x006e;
                case 3: goto L_0x005c;
                case 4: goto L_0x0052;
                case 5: goto L_0x003d;
                case 6: goto L_0x0037;
                default: goto L_0x002f;
            }
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0037:
            java.lang.Object r0 = r4.L$0
            r2 = r0
            com.google.accompanist.pager.PagerState r2 = (com.google.accompanist.pager.PagerState) r2
            goto L_0x0057
        L_0x003d:
            int r0 = r4.I$1
            float r2 = r4.F$0
            int r5 = r4.I$0
            java.lang.Object r6 = r4.L$0
            com.google.accompanist.pager.PagerState r6 = (com.google.accompanist.pager.PagerState) r6
            kotlin.C11661u0.m45747n(r3)     // Catch:{ all -> 0x004e }
            r3 = r2
            r2 = r6
            goto L_0x0197
        L_0x004e:
            r0 = move-exception
            r2 = r6
            goto L_0x01f7
        L_0x0052:
            java.lang.Object r0 = r4.L$0
            r2 = r0
            com.google.accompanist.pager.PagerState r2 = (com.google.accompanist.pager.PagerState) r2
        L_0x0057:
            kotlin.C11661u0.m45747n(r3)     // Catch:{ all -> 0x0074 }
            goto L_0x01ec
        L_0x005c:
            float r0 = r4.F$0
            int r2 = r4.I$0
            java.lang.Object r5 = r4.L$0
            com.google.accompanist.pager.PagerState r5 = (com.google.accompanist.pager.PagerState) r5
            kotlin.C11661u0.m45747n(r3)     // Catch:{ all -> 0x0088 }
            r16 = r5
            r5 = r2
            r2 = r16
            goto L_0x010d
        L_0x006e:
            java.lang.Object r0 = r4.L$0
            r2 = r0
            com.google.accompanist.pager.PagerState r2 = (com.google.accompanist.pager.PagerState) r2
            goto L_0x0057
        L_0x0074:
            r0 = move-exception
            goto L_0x01f7
        L_0x0077:
            float r0 = r4.F$0
            int r2 = r4.I$0
            java.lang.Object r5 = r4.L$0
            com.google.accompanist.pager.PagerState r5 = (com.google.accompanist.pager.PagerState) r5
            kotlin.C11661u0.m45747n(r3)     // Catch:{ all -> 0x0088 }
            r16 = r2
            r2 = r0
            r0 = r16
            goto L_0x00cc
        L_0x0088:
            r0 = move-exception
            r2 = r5
            goto L_0x01f7
        L_0x008c:
            kotlin.C11661u0.m45747n(r3)
            java.lang.String r3 = "page"
            r1.mo41998D(r0, r3)
            java.lang.String r3 = "pageOffset"
            r1.mo41999E(r2, r3)
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r18)     // Catch:{ all -> 0x01f5 }
            r1.mo42001H(r3)     // Catch:{ all -> 0x01f5 }
            androidx.compose.foundation.lazy.LazyListState r3 = r1.f37141a     // Catch:{ all -> 0x01f5 }
            int r3 = r3.mo8339q()     // Catch:{ all -> 0x01f5 }
            int r5 = r0 - r3
            int r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x01f5 }
            if (r5 <= r15) goto L_0x00ce
            androidx.compose.foundation.lazy.LazyListState r5 = r1.f37141a     // Catch:{ all -> 0x01f5 }
            if (r0 <= r3) goto L_0x00b5
            int r3 = r0 + -3
            goto L_0x00b7
        L_0x00b5:
            int r3 = r0 + 3
        L_0x00b7:
            r6 = r3
            r7 = 0
            r9 = 2
            r10 = 0
            r4.L$0 = r1     // Catch:{ all -> 0x01f5 }
            r4.I$0 = r0     // Catch:{ all -> 0x01f5 }
            r4.F$0 = r2     // Catch:{ all -> 0x01f5 }
            r4.label = r14     // Catch:{ all -> 0x01f5 }
            r8 = r4
            java.lang.Object r3 = androidx.compose.foundation.lazy.LazyListState.m10849H(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01f5 }
            if (r3 != r11) goto L_0x00cb
            return r11
        L_0x00cb:
            r5 = r1
        L_0x00cc:
            r3 = r5
            goto L_0x00cf
        L_0x00ce:
            r3 = r1
        L_0x00cf:
            float r5 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x01f2 }
            r6 = 1000593162(0x3ba3d70a, float:0.005)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x00f0
            androidx.compose.foundation.lazy.LazyListState r5 = r3.f37141a     // Catch:{ all -> 0x01f2 }
            r7 = 0
            r9 = 2
            r10 = 0
            r4.L$0 = r3     // Catch:{ all -> 0x01f2 }
            r2 = 2
            r4.label = r2     // Catch:{ all -> 0x01f2 }
            r6 = r0
            r8 = r4
            java.lang.Object r0 = androidx.compose.foundation.lazy.LazyListState.m10852l(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01f2 }
            if (r0 != r11) goto L_0x00ed
            return r11
        L_0x00ed:
            r2 = r3
            goto L_0x01ec
        L_0x00f0:
            androidx.compose.foundation.lazy.LazyListState r5 = r3.f37141a     // Catch:{ all -> 0x01f2 }
            r6 = 0
            com.google.accompanist.pager.PagerState$animateScrollToPage$3 r7 = new com.google.accompanist.pager.PagerState$animateScrollToPage$3     // Catch:{ all -> 0x01f2 }
            r7.<init>(r13)     // Catch:{ all -> 0x01f2 }
            r9 = 1
            r10 = 0
            r4.L$0 = r3     // Catch:{ all -> 0x01f2 }
            r4.I$0 = r0     // Catch:{ all -> 0x01f2 }
            r4.F$0 = r2     // Catch:{ all -> 0x01f2 }
            r4.label = r15     // Catch:{ all -> 0x01f2 }
            r8 = r4
            java.lang.Object r5 = androidx.compose.foundation.gestures.C2203n.m9563c(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01f2 }
            if (r5 != r11) goto L_0x010a
            return r11
        L_0x010a:
            r5 = r0
            r0 = r2
            r2 = r3
        L_0x010d:
            androidx.compose.foundation.lazy.LazyListState r3 = r2.f37141a     // Catch:{ all -> 0x0074 }
            androidx.compose.foundation.lazy.o r3 = r3.mo8343u()     // Catch:{ all -> 0x0074 }
            java.util.List r6 = r3.mo8378i()     // Catch:{ all -> 0x0074 }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x0074 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0074 }
        L_0x011d:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0136
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0074 }
            r8 = r7
            androidx.compose.foundation.lazy.l r8 = (androidx.compose.foundation.lazy.C2517l) r8     // Catch:{ all -> 0x0074 }
            int r8 = r8.getIndex()     // Catch:{ all -> 0x0074 }
            if (r8 != r5) goto L_0x0132
            r8 = r14
            goto L_0x0133
        L_0x0132:
            r8 = r12
        L_0x0133:
            if (r8 == 0) goto L_0x011d
            goto L_0x0137
        L_0x0136:
            r7 = r13
        L_0x0137:
            androidx.compose.foundation.lazy.l r7 = (androidx.compose.foundation.lazy.C2517l) r7     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0158
            androidx.compose.foundation.lazy.LazyListState r3 = r2.f37141a     // Catch:{ all -> 0x0074 }
            int r6 = r7.getSize()     // Catch:{ all -> 0x0074 }
            int r7 = r2.mo42016u()     // Catch:{ all -> 0x0074 }
            int r6 = r6 + r7
            float r6 = (float) r6     // Catch:{ all -> 0x0074 }
            float r6 = r6 * r0
            int r0 = kotlin.math.C11409d.m43851L0(r6)     // Catch:{ all -> 0x0074 }
            r4.L$0 = r2     // Catch:{ all -> 0x0074 }
            r6 = 4
            r4.label = r6     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r3.mo8334k(r5, r0, r4)     // Catch:{ all -> 0x0074 }
            if (r0 != r11) goto L_0x01ec
            return r11
        L_0x0158:
            java.util.List r6 = r3.mo8378i()     // Catch:{ all -> 0x0074 }
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x0074 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0074 }
            r6 = r6 ^ r14
            if (r6 == 0) goto L_0x01ec
            java.util.List r3 = r3.mo8378i()     // Catch:{ all -> 0x0074 }
            java.lang.Object r3 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r3)     // Catch:{ all -> 0x0074 }
            androidx.compose.foundation.lazy.l r3 = (androidx.compose.foundation.lazy.C2517l) r3     // Catch:{ all -> 0x0074 }
            int r3 = r3.getSize()     // Catch:{ all -> 0x0074 }
            int r6 = r2.mo42016u()     // Catch:{ all -> 0x0074 }
            int r3 = r3 + r6
            androidx.compose.foundation.lazy.LazyListState r6 = r2.f37141a     // Catch:{ all -> 0x0074 }
            float r7 = (float) r3     // Catch:{ all -> 0x0074 }
            float r7 = r7 * r0
            int r7 = kotlin.math.C11409d.m43851L0(r7)     // Catch:{ all -> 0x0074 }
            r4.L$0 = r2     // Catch:{ all -> 0x0074 }
            r4.I$0 = r5     // Catch:{ all -> 0x0074 }
            r4.F$0 = r0     // Catch:{ all -> 0x0074 }
            r4.I$1 = r3     // Catch:{ all -> 0x0074 }
            r8 = 5
            r4.label = r8     // Catch:{ all -> 0x0074 }
            java.lang.Object r6 = r6.mo8334k(r5, r7, r4)     // Catch:{ all -> 0x0074 }
            if (r6 != r11) goto L_0x0192
            return r11
        L_0x0192:
            r16 = r3
            r3 = r0
            r0 = r16
        L_0x0197:
            androidx.compose.foundation.lazy.LazyListState r6 = r2.f37141a     // Catch:{ all -> 0x0074 }
            androidx.compose.foundation.lazy.o r6 = r6.mo8343u()     // Catch:{ all -> 0x0074 }
            java.util.List r6 = r6.mo8378i()     // Catch:{ all -> 0x0074 }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x0074 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0074 }
        L_0x01a7:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x01c0
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0074 }
            r8 = r7
            androidx.compose.foundation.lazy.l r8 = (androidx.compose.foundation.lazy.C2517l) r8     // Catch:{ all -> 0x0074 }
            int r8 = r8.getIndex()     // Catch:{ all -> 0x0074 }
            if (r8 != r5) goto L_0x01bc
            r8 = r14
            goto L_0x01bd
        L_0x01bc:
            r8 = r12
        L_0x01bd:
            if (r8 == 0) goto L_0x01a7
            r13 = r7
        L_0x01c0:
            androidx.compose.foundation.lazy.l r13 = (androidx.compose.foundation.lazy.C2517l) r13     // Catch:{ all -> 0x0074 }
            if (r13 == 0) goto L_0x01ec
            int r6 = r13.getSize()     // Catch:{ all -> 0x0074 }
            int r7 = r2.mo42016u()     // Catch:{ all -> 0x0074 }
            int r6 = r6 + r7
            if (r6 == r0) goto L_0x01ec
            androidx.compose.foundation.lazy.LazyListState r0 = r2.f37141a     // Catch:{ all -> 0x0074 }
            int r6 = r13.getSize()     // Catch:{ all -> 0x0074 }
            int r7 = r2.mo42016u()     // Catch:{ all -> 0x0074 }
            int r6 = r6 + r7
            float r6 = (float) r6     // Catch:{ all -> 0x0074 }
            float r6 = r6 * r3
            int r3 = kotlin.math.C11409d.m43851L0(r6)     // Catch:{ all -> 0x0074 }
            r4.L$0 = r2     // Catch:{ all -> 0x0074 }
            r6 = 6
            r4.label = r6     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.mo8334k(r5, r3, r4)     // Catch:{ all -> 0x0074 }
            if (r0 != r11) goto L_0x01ec
            return r11
        L_0x01ec:
            r2.mo41997C()
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x01f2:
            r0 = move-exception
            r2 = r3
            goto L_0x01f7
        L_0x01f5:
            r0 = move-exception
            r2 = r1
        L_0x01f7:
            r2.mo41997C()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.PagerState.mo42008l(int, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: o */
    public final Integer mo42009o() {
        return (Integer) this.f37146f.getValue();
    }

    @C0337f0(from = 0)
    /* renamed from: p */
    public final int mo42010p() {
        return mo41996B();
    }

    /* renamed from: q */
    public final C2517l mo42011q() {
        C2517l lVar;
        boolean z;
        List<C2517l> i = this.f37141a.mo8343u().mo8378i();
        ListIterator<C2517l> listIterator = i.listIterator(i.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lVar = null;
                break;
            }
            lVar = listIterator.previous();
            if (lVar.getIndex() == mo42010p()) {
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

    /* renamed from: r */
    public final float mo42012r() {
        return ((Number) this.f37145e.getValue()).floatValue();
    }

    @C12580l
    /* renamed from: s */
    public final C11289a<Integer> mo42013s() {
        return (C11289a) this.f37147g.getValue();
    }

    @C12579k
    /* renamed from: t */
    public final C2241e mo42014t() {
        return this.f37141a.mo8341s();
    }

    @C12579k
    public String toString() {
        return "PagerState(pageCount=" + mo42019x() + ", currentPage=" + mo42010p() + ", currentPageOffset=" + mo42012r() + ')';
    }

    /* renamed from: u */
    public final int mo42016u() {
        return ((Number) this.f37143c.getValue()).intValue();
    }

    @C12579k
    /* renamed from: v */
    public final LazyListState mo42017v() {
        return this.f37141a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: androidx.compose.foundation.lazy.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.C2517l mo42018w() {
        /*
            r10 = this;
            androidx.compose.foundation.lazy.LazyListState r0 = r10.f37141a
            androidx.compose.foundation.lazy.o r0 = r0.mo8343u()
            java.util.List r1 = r0.mo8378i()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L_0x0018
            r0 = 0
            goto L_0x0078
        L_0x0018:
            java.lang.Object r2 = r1.next()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L_0x0024
        L_0x0022:
            r0 = r2
            goto L_0x0078
        L_0x0024:
            r3 = r2
            androidx.compose.foundation.lazy.l r3 = (androidx.compose.foundation.lazy.C2517l) r3
            int r4 = r3.getOffset()
            r5 = 0
            int r4 = java.lang.Math.max(r4, r5)
            int r6 = r3.getOffset()
            int r3 = r3.getSize()
            int r6 = r6 + r3
            int r3 = r0.mo8373d()
            int r7 = r0.mo8372c()
            int r3 = r3 - r7
            int r3 = java.lang.Math.min(r6, r3)
            int r3 = r3 - r4
        L_0x0047:
            java.lang.Object r4 = r1.next()
            r6 = r4
            androidx.compose.foundation.lazy.l r6 = (androidx.compose.foundation.lazy.C2517l) r6
            int r7 = r6.getOffset()
            int r7 = java.lang.Math.max(r7, r5)
            int r8 = r6.getOffset()
            int r6 = r6.getSize()
            int r8 = r8 + r6
            int r6 = r0.mo8373d()
            int r9 = r0.mo8372c()
            int r6 = r6 - r9
            int r6 = java.lang.Math.min(r8, r6)
            int r6 = r6 - r7
            if (r3 >= r6) goto L_0x0071
            r2 = r4
            r3 = r6
        L_0x0071:
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L_0x0047
            goto L_0x0022
        L_0x0078:
            androidx.compose.foundation.lazy.l r0 = (androidx.compose.foundation.lazy.C2517l) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.pager.PagerState.mo42018w():androidx.compose.foundation.lazy.l");
    }

    @C0337f0(from = 0)
    /* renamed from: x */
    public final int mo42019x() {
        return ((Number) this.f37144d.getValue()).intValue();
    }

    /* renamed from: z */
    public final int mo42020z() {
        Integer o = mo42009o();
        if (o == null) {
            C11289a<Integer> s = mo42013s();
            if (s != null) {
                o = s.invoke();
            } else {
                o = null;
            }
            if (o == null) {
                if (!mo7251e()) {
                    return mo42010p();
                }
                if (Math.abs(mo42012r()) < 0.001f) {
                    return mo42010p();
                }
                if (mo42012r() < 0.0f) {
                    return C11479u.m44447u(mo42010p() - 1, 0);
                }
                return C11479u.m44313B(mo42010p() + 1, mo42019x() - 1);
            }
        }
        return o.intValue();
    }

    public PagerState(@C0337f0(from = 0) int i) {
        this.f37141a = new LazyListState(i, 0, 2, (DefaultConstructorMarker) null);
        this.f37142b = C8539f2.m30981g(Integer.valueOf(i), (C8410b2) null, 2, (Object) null);
        this.f37143c = C8539f2.m30981g(0, (C8410b2) null, 2, (Object) null);
        this.f37144d = C8415c2.m30235d(new PagerState$pageCount$2(this));
        this.f37145e = C8415c2.m30235d(new PagerState$currentPageOffset$2(this));
        this.f37146f = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
        this.f37147g = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagerState(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
