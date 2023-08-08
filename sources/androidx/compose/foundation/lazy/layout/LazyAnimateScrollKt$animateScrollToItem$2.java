package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.C2201l;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", mo22502f = "LazyAnimateScroll.kt", mo22503i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, mo22504l = {137, 233}, mo22505m = "invokeSuspend", mo22506n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/foundation/gestures/l;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,264:1\n1#2:265\n40#3,4:266\n40#3,4:270\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n*L\n129#1:266,4\n230#1:270,4\n*E\n"})
public final class LazyAnimateScrollKt$animateScrollToItem$2 extends SuspendLambda implements C11304p<C2201l, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ C2542e $this_animateScrollToItem;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyAnimateScrollKt$animateScrollToItem$2(int i, C2542e eVar, int i2, C11045c<? super LazyAnimateScrollKt$animateScrollToItem$2> cVar) {
        super(2, cVar);
        this.$index = i;
        this.$this_animateScrollToItem = eVar;
        this.$scrollOffset = i2;
    }

    /* renamed from: i */
    public static final boolean m11330i(boolean z, C2542e eVar, int i, int i2) {
        if (z) {
            if (eVar.mo8392i() <= i && (eVar.mo8392i() != i || eVar.mo8391h() <= i2)) {
                return false;
            }
        } else if (eVar.mo8392i() >= i && (eVar.mo8392i() != i || eVar.mo8391h() >= i2)) {
            return false;
        }
        return true;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.$index, this.$this_animateScrollToItem, this.$scrollOffset, cVar);
        lazyAnimateScrollKt$animateScrollToItem$2.L$0 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    @C12580l
    /* renamed from: h */
    public final Object invoke(@C12579k C2201l lVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) create(lVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: androidx.compose.foundation.gestures.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f1 A[SYNTHETIC, Splitter:B:35:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0140 A[Catch:{ ItemFoundInScroll -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0142 A[Catch:{ ItemFoundInScroll -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0145 A[Catch:{ ItemFoundInScroll -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0148 A[Catch:{ ItemFoundInScroll -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0152 A[Catch:{ ItemFoundInScroll -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0155 A[Catch:{ ItemFoundInScroll -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0249 A[RETURN] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r38) {
        /*
            r37 = this;
            r1 = r37
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r1.label
            r3 = 2
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 == r6) goto L_0x0022
            if (r0 != r3) goto L_0x001a
            java.lang.Object r0 = r1.L$0
            androidx.compose.foundation.gestures.l r0 = (androidx.compose.foundation.gestures.C2201l) r0
            kotlin.C11661u0.m45747n(r38)
            goto L_0x024a
        L_0x001a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0022:
            int r0 = r1.I$0
            float r7 = r1.F$2
            float r8 = r1.F$1
            float r9 = r1.F$0
            java.lang.Object r10 = r1.L$3
            kotlin.jvm.internal.Ref$IntRef r10 = (kotlin.jvm.internal.Ref.IntRef) r10
            java.lang.Object r11 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r12 = r1.L$1
            kotlin.jvm.internal.Ref$BooleanRef r12 = (kotlin.jvm.internal.Ref.BooleanRef) r12
            java.lang.Object r13 = r1.L$0
            androidx.compose.foundation.gestures.l r13 = (androidx.compose.foundation.gestures.C2201l) r13
            kotlin.C11661u0.m45747n(r38)     // Catch:{ ItemFoundInScroll -> 0x004c }
            r15 = r8
            r14 = r9
            r9 = r1
            r35 = r13
            r13 = r10
            r10 = r35
            r36 = r12
            r12 = r11
            r11 = r36
            goto L_0x01b7
        L_0x004c:
            r0 = move-exception
            r3 = r0
            r0 = r13
            goto L_0x01ed
        L_0x0051:
            kotlin.C11661u0.m45747n(r38)
            java.lang.Object r0 = r1.L$0
            r7 = r0
            androidx.compose.foundation.gestures.l r7 = (androidx.compose.foundation.gestures.C2201l) r7
            int r0 = r1.$index
            float r8 = (float) r0
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x0062
            r8 = r6
            goto L_0x0063
        L_0x0062:
            r8 = 0
        L_0x0063:
            if (r8 == 0) goto L_0x0256
            androidx.compose.foundation.lazy.layout.e r0 = r1.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            androidx.compose.ui.unit.d r0 = r0.getDensity()     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            float r8 = androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.f6687a     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            float r0 = r0.mo7425g5(r8)     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            androidx.compose.foundation.lazy.layout.e r8 = r1.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            androidx.compose.ui.unit.d r8 = r8.getDensity()     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            float r9 = androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.f6688b     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            float r8 = r8.mo7425g5(r9)     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            androidx.compose.foundation.lazy.layout.e r9 = r1.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            androidx.compose.ui.unit.d r9 = r9.getDensity()     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            float r10 = androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.f6689c     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            float r9 = r9.mo7425g5(r10)     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            kotlin.jvm.internal.Ref$BooleanRef r10 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            r10.<init>()     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            r10.element = r6     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            r11.<init>()     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r19 = 30
            r20 = 0
            androidx.compose.animation.core.i r12 = androidx.compose.animation.core.C1980j.m8428c(r12, r13, r14, r16, r18, r19, r20)     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            r11.element = r12     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            androidx.compose.foundation.lazy.layout.e r12 = r1.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            int r13 = r1.$index     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            java.lang.Integer r12 = r12.mo8387e(r13)     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            if (r12 != 0) goto L_0x01da
            int r12 = r1.$index     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            androidx.compose.foundation.lazy.layout.e r13 = r1.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            int r13 = r13.mo8392i()     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            if (r12 <= r13) goto L_0x00c3
            r12 = r6
            goto L_0x00c4
        L_0x00c3:
            r12 = 0
        L_0x00c4:
            kotlin.jvm.internal.Ref$IntRef r13 = new kotlin.jvm.internal.Ref$IntRef     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            r13.<init>()     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            r13.element = r6     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            r14 = r0
            r15 = r8
            r0 = r12
            r12 = r11
            r11 = r10
            r10 = r7
            r7 = r9
            r9 = r1
        L_0x00d3:
            boolean r8 = r11.element     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            if (r8 == 0) goto L_0x0253
            androidx.compose.foundation.lazy.layout.e r8 = r9.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            int r8 = r8.mo8383a()     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            if (r8 <= 0) goto L_0x0253
            androidx.compose.foundation.lazy.layout.e r8 = r9.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            int r5 = r9.$index     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            int r3 = r9.$scrollOffset     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            float r3 = r8.mo8386d(r5, r3)     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            float r5 = java.lang.Math.abs(r3)     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 >= 0) goto L_0x00fe
            float r3 = java.lang.Math.abs(r3)     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            float r3 = java.lang.Math.max(r3, r7)     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            if (r0 == 0) goto L_0x00fc
            goto L_0x0103
        L_0x00fc:
            float r3 = -r3
            goto L_0x0103
        L_0x00fe:
            if (r0 == 0) goto L_0x0102
            r3 = r14
            goto L_0x0103
        L_0x0102:
            float r3 = -r14
        L_0x0103:
            T r5 = r12.element     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            r25 = r5
            androidx.compose.animation.core.i r25 = (androidx.compose.animation.core.C1976i) r25     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r33 = 30
            r34 = 0
            androidx.compose.animation.core.i r5 = androidx.compose.animation.core.C1980j.m8432g(r25, r26, r27, r28, r30, r32, r33, r34)     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            r12.element = r5     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            kotlin.jvm.internal.Ref$FloatRef r5 = new kotlin.jvm.internal.Ref$FloatRef     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            r5.<init>()     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            T r8 = r12.element     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            r20 = r8
            androidx.compose.animation.core.i r20 = (androidx.compose.animation.core.C1976i) r20     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            java.lang.Float r21 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r3)     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            r22 = 0
            T r8 = r12.element     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            androidx.compose.animation.core.i r8 = (androidx.compose.animation.core.C1976i) r8     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            java.lang.Object r8 = r8.mo6848i()     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            java.lang.Number r8 = (java.lang.Number) r8     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            float r8 = r8.floatValue()     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0142
            r8 = r6
            goto L_0x0143
        L_0x0142:
            r8 = 0
        L_0x0143:
            if (r8 != 0) goto L_0x0148
            r23 = r6
            goto L_0x014a
        L_0x0148:
            r23 = 0
        L_0x014a:
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$3 r25 = new androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$3     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            androidx.compose.foundation.lazy.layout.e r8 = r9.$this_animateScrollToItem     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            int r4 = r9.$index     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            if (r0 == 0) goto L_0x0155
            r16 = r6
            goto L_0x0157
        L_0x0155:
            r16 = 0
        L_0x0157:
            int r6 = r9.$scrollOffset     // Catch:{ ItemFoundInScroll -> 0x01d3 }
            r17 = r8
            r8 = r25
            r1 = r9
            r9 = r17
            r38 = r10
            r10 = r4
            r4 = r11
            r11 = r3
            r3 = r12
            r12 = r5
            r5 = r13
            r13 = r38
            r28 = r2
            r2 = r14
            r14 = r4
            r29 = r15
            r15 = r16
            r16 = r29
            r17 = r5
            r18 = r6
            r19 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ ItemFoundInScroll -> 0x01cb }
            r6 = 2
            r8 = 0
            r9 = r38
            r1.L$0 = r9     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r1.L$1 = r4     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r1.L$2 = r3     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r1.L$3 = r5     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r1.F$0 = r2     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r10 = r29
            r1.F$1 = r10     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r1.F$2 = r7     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r1.I$0 = r0     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r11 = 1
            r1.label = r11     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r16 = r20
            r17 = r21
            r18 = r22
            r19 = r23
            r20 = r25
            r21 = r1
            r22 = r6
            r23 = r8
            java.lang.Object r6 = androidx.compose.animation.core.SuspendAnimationKt.m8086m(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ ItemFoundInScroll -> 0x01c9 }
            r8 = r28
            if (r6 != r8) goto L_0x01af
            return r8
        L_0x01af:
            r14 = r2
            r12 = r3
            r11 = r4
            r13 = r5
            r2 = r8
            r15 = r10
            r10 = r9
            r9 = r1
        L_0x01b7:
            int r1 = r13.element     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r3 = 1
            int r1 = r1 + r3
            r13.element = r1     // Catch:{ ItemFoundInScroll -> 0x01c4 }
            r1 = r37
            r3 = 2
            r4 = 0
            r6 = 1
            goto L_0x00d3
        L_0x01c4:
            r0 = move-exception
            r3 = r0
            r1 = r9
            r0 = r10
            goto L_0x01ed
        L_0x01c9:
            r0 = move-exception
            goto L_0x01ce
        L_0x01cb:
            r0 = move-exception
            r9 = r38
        L_0x01ce:
            r8 = r28
            r3 = r0
            r2 = r8
            goto L_0x01d8
        L_0x01d3:
            r0 = move-exception
            r8 = r2
            r1 = r9
            r9 = r10
            r3 = r0
        L_0x01d8:
            r0 = r9
            goto L_0x01ed
        L_0x01da:
            androidx.compose.foundation.lazy.layout.ItemFoundInScroll r0 = new androidx.compose.foundation.lazy.layout.ItemFoundInScroll     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            int r1 = r12.intValue()     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            T r3 = r11.element     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            androidx.compose.animation.core.i r3 = (androidx.compose.animation.core.C1976i) r3     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            r0.<init>(r1, r3)     // Catch:{ ItemFoundInScroll -> 0x01e8 }
            throw r0     // Catch:{ ItemFoundInScroll -> 0x01e8 }
        L_0x01e8:
            r0 = move-exception
            r1 = r37
            r3 = r0
            r0 = r7
        L_0x01ed:
            androidx.compose.animation.core.i r4 = r3.mo8673b()
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 30
            r13 = 0
            androidx.compose.animation.core.i r4 = androidx.compose.animation.core.C1980j.m8432g(r4, r5, r6, r7, r9, r11, r12, r13)
            int r3 = r3.mo8672a()
            int r5 = r1.$scrollOffset
            int r3 = r3 + r5
            float r3 = (float) r3
            kotlin.jvm.internal.Ref$FloatRef r5 = new kotlin.jvm.internal.Ref$FloatRef
            r5.<init>()
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r3)
            r7 = 0
            java.lang.Object r8 = r4.mo6848i()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0223
            r24 = 1
            goto L_0x0225
        L_0x0223:
            r24 = 0
        L_0x0225:
            r8 = 1
            r8 = r24 ^ 1
            androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$5 r9 = new androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$5
            r9.<init>(r3, r5, r0)
            r10 = 2
            r11 = 0
            r1.L$0 = r0
            r3 = 0
            r1.L$1 = r3
            r1.L$2 = r3
            r1.L$3 = r3
            r3 = 2
            r1.label = r3
            r3 = r4
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r1
            r9 = r10
            r10 = r11
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.m8086m(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r3 != r2) goto L_0x024a
            return r2
        L_0x024a:
            androidx.compose.foundation.lazy.layout.e r2 = r1.$this_animateScrollToItem
            int r3 = r1.$index
            int r1 = r1.$scrollOffset
            r2.mo8384b(r0, r3, r1)
        L_0x0253:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x0256:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index should be non-negative ("
            r1.append(r2)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
