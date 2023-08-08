package androidx.compose.foundation.pager;

import androidx.compose.foundation.layout.C2365i;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$Pager$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,781:1\n83#2,3:782\n36#2:791\n1114#3,6:785\n1114#3,3:792\n1117#3,3:796\n1#4:795\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$Pager$4\n*L\n299#1:782,3\n322#1:791\n299#1:785,6\n322#1:792,3\n322#1:796,3\n*E\n"})
public final class PagerKt$Pager$4 extends Lambda implements C11305q<C2365i, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ float $calculatedContentPaddings;
    final /* synthetic */ C2366i0 $contentPadding;
    final /* synthetic */ C16479d $density;
    final /* synthetic */ C8734c.C8736b $horizontalAlignment;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ C11300l<Integer, Object> $key;
    final /* synthetic */ C11305q<Integer, C8592o, Integer, C11079d2> $pageContent;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ C15446a $pageNestedScrollConnection;
    final /* synthetic */ C2651b $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ PagerWrapperFlingBehavior $pagerFlingBehavior;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ C8734c.C8737c $verticalAlignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerKt$Pager$4(boolean z, C16479d dVar, float f, float f2, boolean z2, PagerState pagerState, int i, C2366i0 i0Var, PagerWrapperFlingBehavior pagerWrapperFlingBehavior, boolean z3, int i2, C8734c.C8736b bVar, C8734c.C8737c cVar, int i3, C2651b bVar2, int i4, C11300l<? super Integer, ? extends Object> lVar, C15446a aVar, C11305q<? super Integer, ? super C8592o, ? super Integer, C11079d2> qVar) {
        super(3);
        this.$isVertical = z;
        this.$density = dVar;
        this.$pageSpacing = f;
        this.$calculatedContentPaddings = f2;
        this.$reverseLayout = z2;
        this.$state = pagerState;
        this.$$dirty = i;
        this.$contentPadding = i0Var;
        this.$pagerFlingBehavior = pagerWrapperFlingBehavior;
        this.$userScrollEnabled = z3;
        this.$beyondBoundsPageCount = i2;
        this.$horizontalAlignment = bVar;
        this.$verticalAlignment = cVar;
        this.$$dirty1 = i3;
        this.$pageSize = bVar2;
        this.$pageCount = i4;
        this.$key = lVar;
        this.$pageNestedScrollConnection = aVar;
        this.$pageContent = qVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0104, code lost:
        if (r6 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x0106;
     */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9058a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.C2365i r26, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r27, int r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r14 = r27
            r2 = r28
            java.lang.String r3 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = r2 & 14
            r4 = 4
            r5 = 2
            if (r3 != 0) goto L_0x001e
            boolean r3 = r14.mo15006n0(r1)
            if (r3 == 0) goto L_0x001b
            r3 = r4
            goto L_0x001c
        L_0x001b:
            r3 = r5
        L_0x001c:
            r3 = r3 | r2
            goto L_0x001f
        L_0x001e:
            r3 = r2
        L_0x001f:
            r3 = r3 & 91
            r6 = 18
            if (r3 != r6) goto L_0x0031
            boolean r3 = r27.mo15011p()
            if (r3 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            r27.mo14958a0()
            goto L_0x01af
        L_0x0031:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0040
            r3 = -1
            java.lang.String r6 = "androidx.compose.foundation.pager.Pager.<anonymous> (Pager.kt:295)"
            r7 = -1677736225(0xffffffff9bffc6df, float:-4.2314729E-22)
            androidx.compose.runtime.ComposerKt.m29845w0(r7, r2, r3, r6)
        L_0x0040:
            boolean r2 = r0.$isVertical
            if (r2 == 0) goto L_0x004d
            long r1 = r26.mo8086b()
            int r1 = androidx.compose.p004ui.unit.C16476b.m74361o(r1)
            goto L_0x0055
        L_0x004d:
            long r1 = r26.mo8086b()
            int r1 = androidx.compose.p004ui.unit.C16476b.m74362p(r1)
        L_0x0055:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            androidx.compose.ui.unit.d r3 = r0.$density
            r6 = 0
            r2[r6] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r7 = 1
            r2[r7] = r3
            float r3 = r0.$pageSpacing
            androidx.compose.ui.unit.g r3 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            r2[r5] = r3
            float r3 = r0.$calculatedContentPaddings
            androidx.compose.ui.unit.g r3 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            r5 = 3
            r2[r5] = r3
            androidx.compose.ui.unit.d r3 = r0.$density
            float r5 = r0.$pageSpacing
            float r7 = r0.$calculatedContentPaddings
            androidx.compose.foundation.pager.b r8 = r0.$pageSize
            r9 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r14.mo14918M(r9)
            r9 = r6
        L_0x0083:
            if (r6 >= r4) goto L_0x008f
            r10 = r2[r6]
            boolean r10 = r14.mo15006n0(r10)
            r9 = r9 | r10
            int r6 = r6 + 1
            goto L_0x0083
        L_0x008f:
            java.lang.Object r2 = r27.mo14921N()
            if (r9 != 0) goto L_0x009d
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r4.mo16277a()
            if (r2 != r4) goto L_0x00bd
        L_0x009d:
            int r2 = r3.mo7429n2(r5)
            int r4 = r3.mo7429n2(r7)
            int r1 = r1 - r4
            int r1 = r8.mo9111a(r3, r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            float r1 = r3.mo7416L(r1)
            androidx.compose.ui.unit.g r2 = androidx.compose.p004ui.unit.C16483g.m74451w(r1)
            r14.mo14893C(r2)
        L_0x00bd:
            r27.mo15002m0()
            androidx.compose.ui.unit.g r2 = (androidx.compose.p004ui.unit.C16483g) r2
            float r15 = r2.mo47823t0()
            boolean r1 = r0.$reverseLayout
            if (r1 != 0) goto L_0x00d1
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r1 = r1.mo17072u()
            goto L_0x00d7
        L_0x00d1:
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r1 = r1.mo17071s()
        L_0x00d7:
            r3 = r1
            boolean r1 = r0.$reverseLayout
            if (r1 != 0) goto L_0x00e3
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r1 = r1.mo17073w()
            goto L_0x00e9
        L_0x00e3:
            androidx.compose.ui.c$a r1 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r1 = r1.mo17062a()
        L_0x00e9:
            r4 = r1
            androidx.compose.foundation.pager.PagerState r1 = r0.$state
            androidx.compose.ui.unit.d r2 = r0.$density
            r5 = 1157296644(0x44faf204, float:2007.563)
            r14.mo14918M(r5)
            boolean r5 = r14.mo15006n0(r1)
            java.lang.Object r6 = r27.mo14921N()
            if (r5 != 0) goto L_0x0106
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r6 != r5) goto L_0x0123
        L_0x0106:
            int r2 = r2.mo7429n2(r15)
            float r2 = (float) r2
            float r5 = r1.mo9068C()
            float r2 = r2 * r5
            androidx.compose.foundation.lazy.LazyListState r6 = new androidx.compose.foundation.lazy.LazyListState
            int r5 = r1.mo9067B()
            int r2 = kotlin.math.C11409d.m43851L0(r2)
            r6.<init>(r5, r2)
            r1.mo9082Q(r6)
            r14.mo14893C(r6)
        L_0x0123:
            r27.mo15002m0()
            r2 = r6
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.f6010a
            float r6 = r0.$pageSpacing
            androidx.compose.foundation.layout.Arrangement$d r12 = r5.mo7619A(r6, r3)
            float r3 = r0.$pageSpacing
            androidx.compose.foundation.layout.Arrangement$l r10 = r5.mo7620B(r3, r4)
            androidx.compose.foundation.layout.i0 r3 = r0.$contentPadding
            boolean r4 = r0.$reverseLayout
            boolean r13 = r0.$isVertical
            r5 = r13
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r6 = r0.$pagerFlingBehavior
            boolean r7 = r0.$userScrollEnabled
            int r8 = r0.$beyondBoundsPageCount
            androidx.compose.ui.c$b r9 = r0.$horizontalAlignment
            androidx.compose.ui.c$c r11 = r0.$verticalAlignment
            androidx.compose.foundation.pager.PagerKt$Pager$4$1 r16 = new androidx.compose.foundation.pager.PagerKt$Pager$4$1
            r18 = r13
            r13 = r16
            int r14 = r0.$pageCount
            r26 = r1
            kotlin.jvm.functions.l<java.lang.Integer, java.lang.Object> r1 = r0.$key
            r28 = r2
            androidx.compose.ui.input.nestedscroll.a r2 = r0.$pageNestedScrollConnection
            r23 = r3
            kotlin.jvm.functions.q<java.lang.Integer, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2> r3 = r0.$pageContent
            r24 = r4
            int r4 = r0.$$dirty1
            r19 = r15
            r15 = r16
            r16 = r14
            r17 = r1
            r20 = r2
            r21 = r3
            r22 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            int r1 = r0.$$dirty
            int r2 = r1 >> 21
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | 6
            int r3 = r0.$$dirty1
            int r4 = r3 << 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r3 = r3 << 15
            r4 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r4
            r2 = r2 | r3
            int r3 = r1 << 3
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r4
            r2 = r2 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r1
            r15 = r2 | r3
            int r1 = r1 >> 21
            r16 = r1 & 14
            r17 = 0
            r14 = r27
            r1 = r26
            r2 = r28
            r3 = r23
            r4 = r24
            androidx.compose.foundation.lazy.LazyListKt.m10800a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x01af
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt$Pager$4.mo9058a(androidx.compose.foundation.layout.i, androidx.compose.runtime.o, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo9058a((C2365i) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
