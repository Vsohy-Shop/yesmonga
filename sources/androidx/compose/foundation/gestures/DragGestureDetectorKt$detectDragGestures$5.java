package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15507w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", mo22502f = "DragGestureDetector.kt", mo22503i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, mo22504l = {176, 890, 940, 193}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, mo22507s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "F$0", "F$1", "F$2"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n658#2,18:874\n676#2,4:901\n680#2,58:912\n116#3,2:892\n33#3,6:894\n118#3:900\n33#3,6:905\n118#3:911\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n*L\n180#1:874,18\n180#1:901,4\n180#1:912,58\n180#1:892,2\n180#1:894,6\n180#1:900\n180#1:905,6\n180#1:911\n*E\n"})
public final class DragGestureDetectorKt$detectDragGestures$5 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<C15507w, C15094f, C11079d2> $onDrag;
    final /* synthetic */ C11289a<C11079d2> $onDragCancel;
    final /* synthetic */ C11289a<C11079d2> $onDragEnd;
    final /* synthetic */ C11300l<C15094f, C11079d2> $onDragStart;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$5(C11300l<? super C15094f, C11079d2> lVar, C11304p<? super C15507w, ? super C15094f, C11079d2> pVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11045c<? super DragGestureDetectorKt$detectDragGestures$5> cVar) {
        super(2, cVar);
        this.$onDragStart = lVar;
        this.$onDrag = pVar;
        this.$onDragCancel = aVar;
        this.$onDragEnd = aVar2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, cVar);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: androidx.compose.ui.input.pointer.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: androidx.compose.ui.input.pointer.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: androidx.compose.ui.input.pointer.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: androidx.compose.ui.input.pointer.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: androidx.compose.ui.input.pointer.PointerEventPass} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014a A[SYNTHETIC] */
    @org.jetbrains.annotations.C12580l
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r23) {
        /*
            r22 = this;
            r6 = r22
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r6.label
            r8 = 4
            r9 = 3
            r10 = 2
            r13 = 1
            r14 = 0
            if (r0 == 0) goto L_0x009c
            if (r0 == r13) goto L_0x0091
            if (r0 == r10) goto L_0x0060
            if (r0 == r9) goto L_0x0027
            if (r0 != r8) goto L_0x001f
            kotlin.C11661u0.m45747n(r23)
            r0 = r23
            r2 = r6
            goto L_0x0292
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0027:
            float r0 = r6.F$2
            float r1 = r6.F$1
            float r2 = r6.F$0
            int r3 = r6.I$0
            java.lang.Object r4 = r6.L$6
            androidx.compose.ui.input.pointer.w r4 = (androidx.compose.p004ui.input.pointer.C15507w) r4
            java.lang.Object r5 = r6.L$5
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref.LongRef) r5
            java.lang.Object r15 = r6.L$4
            androidx.compose.foundation.gestures.i r15 = (androidx.compose.foundation.gestures.C2197i) r15
            java.lang.Object r11 = r6.L$3
            androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p004ui.input.pointer.C15465c) r11
            java.lang.Object r12 = r6.L$2
            kotlin.jvm.internal.Ref$LongRef r12 = (kotlin.jvm.internal.Ref.LongRef) r12
            java.lang.Object r8 = r6.L$1
            androidx.compose.ui.input.pointer.w r8 = (androidx.compose.p004ui.input.pointer.C15507w) r8
            java.lang.Object r9 = r6.L$0
            androidx.compose.ui.input.pointer.c r9 = (androidx.compose.p004ui.input.pointer.C15465c) r9
            kotlin.C11661u0.m45747n(r23)
            r10 = 3
            r20 = r1
            r1 = r0
            r0 = r8
            r8 = r11
            r11 = r15
            r15 = r3
            r3 = r20
            r21 = r5
            r5 = r2
            r2 = r12
            r12 = r21
            goto L_0x01f9
        L_0x0060:
            float r0 = r6.F$2
            float r1 = r6.F$1
            float r2 = r6.F$0
            int r3 = r6.I$0
            java.lang.Object r4 = r6.L$5
            kotlin.jvm.internal.Ref$LongRef r4 = (kotlin.jvm.internal.Ref.LongRef) r4
            java.lang.Object r5 = r6.L$4
            androidx.compose.foundation.gestures.i r5 = (androidx.compose.foundation.gestures.C2197i) r5
            java.lang.Object r8 = r6.L$3
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.p004ui.input.pointer.C15465c) r8
            java.lang.Object r9 = r6.L$2
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref.LongRef) r9
            java.lang.Object r11 = r6.L$1
            androidx.compose.ui.input.pointer.w r11 = (androidx.compose.p004ui.input.pointer.C15507w) r11
            java.lang.Object r12 = r6.L$0
            androidx.compose.ui.input.pointer.c r12 = (androidx.compose.p004ui.input.pointer.C15465c) r12
            kotlin.C11661u0.m45747n(r23)
            r10 = r23
            r15 = r3
            r3 = r1
            r1 = r0
            r0 = r11
            r11 = r5
            r5 = r2
            r2 = r9
            r9 = r12
            r12 = r4
            r4 = r6
            goto L_0x0115
        L_0x0091:
            java.lang.Object r0 = r6.L$0
            androidx.compose.ui.input.pointer.c r0 = (androidx.compose.p004ui.input.pointer.C15465c) r0
            kotlin.C11661u0.m45747n(r23)
            r8 = r0
            r0 = r23
            goto L_0x00b6
        L_0x009c:
            kotlin.C11661u0.m45747n(r23)
            java.lang.Object r0 = r6.L$0
            r8 = r0
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.p004ui.input.pointer.C15465c) r8
            r1 = 0
            r2 = 0
            r4 = 2
            r5 = 0
            r6.L$0 = r8
            r6.label = r13
            r0 = r8
            r3 = r22
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9439f(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x00b6
            return r7
        L_0x00b6:
            androidx.compose.ui.input.pointer.w r0 = (androidx.compose.p004ui.input.pointer.C15507w) r0
            kotlin.jvm.internal.Ref$LongRef r1 = new kotlin.jvm.internal.Ref$LongRef
            r1.<init>()
            androidx.compose.ui.geometry.f$a r2 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r2 = r2.mo42248e()
            r1.element = r2
            r2 = r6
        L_0x00c6:
            long r3 = r0.mo44176p()
            int r5 = r0.mo44185y()
            androidx.compose.foundation.gestures.i r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9268z()
            androidx.compose.ui.input.pointer.o r11 = r8.mo44004j3()
            boolean r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9239C(r11, r3)
            if (r11 == 0) goto L_0x00df
            r6 = r14
            goto L_0x0244
        L_0x00df:
            androidx.compose.ui.platform.c4 r11 = r8.getViewConfiguration()
            float r5 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9240D(r11, r5)
            kotlin.jvm.internal.Ref$LongRef r11 = new kotlin.jvm.internal.Ref$LongRef
            r11.<init>()
            r11.element = r3
            r4 = r2
            r12 = r11
            r3 = 0
            r15 = 0
            r2 = r1
            r11 = r9
            r1 = 0
            r9 = r8
        L_0x00f6:
            r4.L$0 = r9
            r4.L$1 = r0
            r4.L$2 = r2
            r4.L$3 = r8
            r4.L$4 = r11
            r4.L$5 = r12
            r4.L$6 = r14
            r4.I$0 = r15
            r4.F$0 = r5
            r4.F$1 = r3
            r4.F$2 = r1
            r4.label = r10
            java.lang.Object r10 = androidx.compose.p004ui.input.pointer.C15465c.m68462X0(r8, r14, r4, r13, r14)
            if (r10 != r7) goto L_0x0115
            return r7
        L_0x0115:
            androidx.compose.ui.input.pointer.o r10 = (androidx.compose.p004ui.input.pointer.C15491o) r10
            java.util.List r13 = r10.mo44110e()
            int r14 = r13.size()
            r6 = 0
        L_0x0120:
            if (r6 >= r14) goto L_0x014a
            java.lang.Object r16 = r13.get(r6)
            r17 = r16
            androidx.compose.ui.input.pointer.w r17 = (androidx.compose.p004ui.input.pointer.C15507w) r17
            r23 = r13
            r18 = r14
            long r13 = r17.mo44176p()
            r17 = r7
            r19 = r8
            long r7 = r12.element
            boolean r7 = androidx.compose.p004ui.input.pointer.C15506v.m68789d(r13, r7)
            if (r7 == 0) goto L_0x013f
            goto L_0x0150
        L_0x013f:
            int r6 = r6 + 1
            r13 = r23
            r7 = r17
            r14 = r18
            r8 = r19
            goto L_0x0120
        L_0x014a:
            r17 = r7
            r19 = r8
            r16 = 0
        L_0x0150:
            r6 = r16
            androidx.compose.ui.input.pointer.w r6 = (androidx.compose.p004ui.input.pointer.C15507w) r6
            if (r6 != 0) goto L_0x015d
        L_0x0156:
            r1 = r2
            r2 = r4
            r8 = r9
            r7 = r17
            goto L_0x0202
        L_0x015d:
            boolean r7 = r6.mo44167A()
            if (r7 == 0) goto L_0x0164
            goto L_0x0156
        L_0x0164:
            boolean r7 = androidx.compose.p004ui.input.pointer.C15492p.m68685e(r6)
            if (r7 == 0) goto L_0x019d
            java.util.List r6 = r10.mo44110e()
            int r7 = r6.size()
            r8 = 0
        L_0x0173:
            if (r8 >= r7) goto L_0x0186
            java.lang.Object r10 = r6.get(r8)
            r13 = r10
            androidx.compose.ui.input.pointer.w r13 = (androidx.compose.p004ui.input.pointer.C15507w) r13
            boolean r13 = r13.mo44178r()
            if (r13 == 0) goto L_0x0183
            goto L_0x0187
        L_0x0183:
            int r8 = r8 + 1
            goto L_0x0173
        L_0x0186:
            r10 = 0
        L_0x0187:
            androidx.compose.ui.input.pointer.w r10 = (androidx.compose.p004ui.input.pointer.C15507w) r10
            if (r10 != 0) goto L_0x018c
            goto L_0x0156
        L_0x018c:
            long r6 = r10.mo44176p()
            r12.element = r6
            r6 = r22
            r7 = r17
            r8 = r19
        L_0x0198:
            r10 = 2
            r13 = 1
            r14 = 0
            goto L_0x00f6
        L_0x019d:
            long r7 = r6.mo44177q()
            long r13 = r6.mo44181u()
            float r10 = r11.mo7369a(r7)
            float r16 = r11.mo7369a(r13)
            float r10 = r10 - r16
            float r7 = r11.mo7371c(r7)
            float r8 = r11.mo7371c(r13)
            float r7 = r7 - r8
            float r3 = r3 + r10
            float r1 = r1 + r7
            if (r15 == 0) goto L_0x01c1
            float r7 = java.lang.Math.abs(r3)
            goto L_0x01c9
        L_0x01c1:
            long r7 = r11.mo7370b(r3, r1)
            float r7 = androidx.compose.p004ui.geometry.C15094f.m64877m(r7)
        L_0x01c9:
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x020c
            androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.p004ui.input.pointer.PointerEventPass.Final
            r4.L$0 = r9
            r4.L$1 = r0
            r4.L$2 = r2
            r8 = r19
            r4.L$3 = r8
            r4.L$4 = r11
            r4.L$5 = r12
            r4.L$6 = r6
            r4.I$0 = r15
            r4.F$0 = r5
            r4.F$1 = r3
            r4.F$2 = r1
            r10 = 3
            r4.label = r10
            java.lang.Object r7 = r8.mo44003i3(r7, r4)
            r13 = r17
            if (r7 != r13) goto L_0x01f3
            return r13
        L_0x01f3:
            r7 = r13
            r20 = r6
            r6 = r4
            r4 = r20
        L_0x01f9:
            boolean r4 = r4.mo44167A()
            if (r4 == 0) goto L_0x0204
            r1 = r2
            r2 = r6
            r8 = r9
        L_0x0202:
            r6 = 0
            goto L_0x0244
        L_0x0204:
            r4 = r6
            r10 = 2
            r13 = 1
            r14 = 0
            r6 = r22
            goto L_0x00f6
        L_0x020c:
            r13 = r17
            r8 = r19
            r10 = 3
            if (r15 == 0) goto L_0x0220
            float r7 = java.lang.Math.signum(r3)
            float r7 = r7 * r5
            float r3 = r3 - r7
            long r16 = r11.mo7370b(r3, r1)
            r14 = r0
            r3 = r11
            goto L_0x0232
        L_0x0220:
            r14 = r0
            long r0 = r11.mo7370b(r3, r1)
            r3 = r11
            long r10 = androidx.compose.p004ui.geometry.C15094f.m64874j(r0, r7)
            long r10 = androidx.compose.p004ui.geometry.C15094f.m64888x(r10, r5)
            long r16 = androidx.compose.p004ui.geometry.C15094f.m64885u(r0, r10)
        L_0x0232:
            r0 = r16
            r6.mo44168a()
            r2.element = r0
            boolean r0 = r6.mo44167A()
            if (r0 == 0) goto L_0x02a8
            r1 = r2
            r2 = r4
            r8 = r9
            r7 = r13
            r0 = r14
        L_0x0244:
            if (r6 == 0) goto L_0x0254
            boolean r3 = r6.mo44167A()
            if (r3 == 0) goto L_0x024d
            goto L_0x0254
        L_0x024d:
            r6 = r22
            r10 = 2
            r13 = 1
            r14 = 0
            goto L_0x00c6
        L_0x0254:
            if (r6 == 0) goto L_0x02a5
            kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r0 = r2.$onDragStart
            long r3 = r6.mo44177q()
            androidx.compose.ui.geometry.f r3 = androidx.compose.p004ui.geometry.C15094f.m64868d(r3)
            r0.invoke(r3)
            kotlin.jvm.functions.p<androidx.compose.ui.input.pointer.w, androidx.compose.ui.geometry.f, kotlin.d2> r0 = r2.$onDrag
            long r3 = r1.element
            androidx.compose.ui.geometry.f r1 = androidx.compose.p004ui.geometry.C15094f.m64868d(r3)
            r0.invoke(r6, r1)
            long r0 = r6.mo44176p()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$2 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$2
            kotlin.jvm.functions.p<androidx.compose.ui.input.pointer.w, androidx.compose.ui.geometry.f, kotlin.d2> r4 = r2.$onDrag
            r3.<init>(r4)
            r6 = 0
            r2.L$0 = r6
            r2.L$1 = r6
            r2.L$2 = r6
            r2.L$3 = r6
            r2.L$4 = r6
            r2.L$5 = r6
            r2.L$6 = r6
            r10 = 4
            r2.label = r10
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9267y(r8, r0, r3, r2)
            if (r0 != r7) goto L_0x0292
            return r7
        L_0x0292:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x02a0
            kotlin.jvm.functions.a<kotlin.d2> r0 = r2.$onDragCancel
            r0.invoke()
            goto L_0x02a5
        L_0x02a0:
            kotlin.jvm.functions.a<kotlin.d2> r0 = r2.$onDragEnd
            r0.invoke()
        L_0x02a5:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x02a8:
            r6 = r22
            r11 = r3
            r7 = r13
            r0 = r14
            r1 = 0
            r3 = 0
            goto L_0x0198
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
