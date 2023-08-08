package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15465c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", mo22502f = "TransformGestureDetector.kt", mo22503i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, mo22504l = {59, 61}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, mo22507s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n101#2,2:256\n33#2,6:258\n103#2:264\n33#2,6:265\n101#2,2:271\n33#2,6:273\n103#2:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n62#1:256,2\n62#1:258,6\n62#1:264\n96#1:265,6\n103#1:271,2\n103#1:273,6\n103#1:279\n*E\n"})
public final class TransformGestureDetectorKt$detectTransformGestures$2 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11306r<C15094f, C15094f, Float, Float, C11079d2> $onGesture;
    final /* synthetic */ boolean $panZoomLock;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformGestureDetectorKt$detectTransformGestures$2(boolean z, C11306r<? super C15094f, ? super C15094f, ? super Float, ? super Float, C11079d2> rVar, C11045c<? super TransformGestureDetectorKt$detectTransformGestures$2> cVar) {
        super(2, cVar);
        this.$panZoomLock = z;
        this.$onGesture = rVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.$panZoomLock, this.$onGesture, cVar);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: androidx.compose.ui.input.pointer.c} */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0157, code lost:
        if (androidx.compose.p004ui.geometry.C15094f.m64876l(r11, androidx.compose.p004ui.geometry.C15094f.f37256b.mo42248e()) == false) goto L_0x0161;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00c0 A[SYNTHETIC] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r26) {
        /*
            r25 = this;
            r6 = r25
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r6.label
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 2
            r10 = 0
            r11 = 0
            r12 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 == r12) goto L_0x0034
            if (r0 != r9) goto L_0x002c
            int r0 = r6.I$1
            float r1 = r6.F$2
            int r2 = r6.I$0
            long r3 = r6.J$0
            float r5 = r6.F$1
            float r13 = r6.F$0
            java.lang.Object r14 = r6.L$0
            androidx.compose.ui.input.pointer.c r14 = (androidx.compose.p004ui.input.pointer.C15465c) r14
            kotlin.C11661u0.m45747n(r26)
            r9 = r26
            r15 = r6
            goto L_0x00a2
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            int r0 = r6.I$1
            float r1 = r6.F$2
            int r2 = r6.I$0
            long r3 = r6.J$0
            float r5 = r6.F$1
            float r13 = r6.F$0
            java.lang.Object r14 = r6.L$0
            androidx.compose.ui.input.pointer.c r14 = (androidx.compose.p004ui.input.pointer.C15465c) r14
            kotlin.C11661u0.m45747n(r26)
            goto L_0x0089
        L_0x0048:
            kotlin.C11661u0.m45747n(r26)
            java.lang.Object r0 = r6.L$0
            r14 = r0
            androidx.compose.ui.input.pointer.c r14 = (androidx.compose.p004ui.input.pointer.C15465c) r14
            androidx.compose.ui.geometry.f$a r0 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r4 = r0.mo42248e()
            androidx.compose.ui.platform.c4 r0 = r14.getViewConfiguration()
            float r13 = r0.mo44722f()
            r1 = 0
            r2 = 0
            r15 = 2
            r16 = 0
            r6.L$0 = r14
            r6.F$0 = r10
            r6.F$1 = r8
            r6.J$0 = r4
            r6.I$0 = r11
            r6.F$2 = r13
            r6.I$1 = r11
            r6.label = r12
            r0 = r14
            r3 = r25
            r17 = r4
            r4 = r15
            r5 = r16
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9439f(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x0082
            return r7
        L_0x0082:
            r5 = r8
            r0 = r11
            r2 = r0
            r1 = r13
            r3 = r17
            r13 = r10
        L_0x0089:
            r15 = r6
        L_0x008a:
            r15.L$0 = r14
            r15.F$0 = r13
            r15.F$1 = r5
            r15.J$0 = r3
            r15.I$0 = r2
            r15.F$2 = r1
            r15.I$1 = r0
            r15.label = r9
            r9 = 0
            java.lang.Object r9 = androidx.compose.p004ui.input.pointer.C15465c.m68462X0(r14, r9, r15, r12, r9)
            if (r9 != r7) goto L_0x00a2
            return r7
        L_0x00a2:
            androidx.compose.ui.input.pointer.o r9 = (androidx.compose.p004ui.input.pointer.C15491o) r9
            java.util.List r8 = r9.mo44110e()
            int r10 = r8.size()
            r12 = r11
        L_0x00ad:
            if (r12 >= r10) goto L_0x00c0
            java.lang.Object r20 = r8.get(r12)
            androidx.compose.ui.input.pointer.w r20 = (androidx.compose.p004ui.input.pointer.C15507w) r20
            boolean r20 = r20.mo44167A()
            if (r20 == 0) goto L_0x00bd
            r8 = 1
            goto L_0x00c1
        L_0x00bd:
            int r12 = r12 + 1
            goto L_0x00ad
        L_0x00c0:
            r8 = r11
        L_0x00c1:
            if (r8 != 0) goto L_0x019c
            float r10 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.m9463h(r9)
            float r12 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.m9462g(r9)
            r26 = r12
            long r11 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.m9461f(r9)
            if (r2 != 0) goto L_0x011e
            float r5 = r5 * r10
            float r13 = r13 + r26
            long r3 = androidx.compose.p004ui.geometry.C15094f.m64886v(r3, r11)
            r21 = r0
            r0 = 0
            float r22 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.m9459d(r9, r0)
            r19 = r2
            r0 = 1
            float r2 = (float) r0
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 * r22
            r23 = 1078530011(0x40490fdb, float:3.1415927)
            float r23 = r23 * r13
            float r23 = r23 * r22
            r22 = 1127481344(0x43340000, float:180.0)
            float r23 = r23 / r22
            float r22 = java.lang.Math.abs(r23)
            float r23 = androidx.compose.p004ui.geometry.C15094f.m64877m(r3)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x010f
            int r2 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x010f
            int r2 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r2 = r19
            goto L_0x0123
        L_0x010f:
            boolean r2 = r15.$panZoomLock
            if (r2 == 0) goto L_0x0119
            int r2 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0119
            r2 = r0
            goto L_0x011a
        L_0x0119:
            r2 = 0
        L_0x011a:
            r21 = r2
            r2 = r0
            goto L_0x0123
        L_0x011e:
            r21 = r0
            r19 = r2
            r0 = 1
        L_0x0123:
            if (r2 == 0) goto L_0x0193
            r0 = 0
            long r19 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.m9457b(r9, r0)
            if (r21 == 0) goto L_0x012f
            r18 = 0
            goto L_0x0131
        L_0x012f:
            r18 = r26
        L_0x0131:
            r23 = 0
            int r24 = (r18 > r23 ? 1 : (r18 == r23 ? 0 : -1))
            if (r24 != 0) goto L_0x013a
            r24 = 1
            goto L_0x013c
        L_0x013a:
            r24 = r0
        L_0x013c:
            if (r24 == 0) goto L_0x015d
            r17 = 1065353216(0x3f800000, float:1.0)
            int r24 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r24 != 0) goto L_0x0147
            r24 = 1
            goto L_0x0149
        L_0x0147:
            r24 = r0
        L_0x0149:
            if (r24 == 0) goto L_0x015a
            androidx.compose.ui.geometry.f$a r24 = androidx.compose.p004ui.geometry.C15094f.f37256b
            r26 = r1
            long r0 = r24.mo42248e()
            boolean r0 = androidx.compose.p004ui.geometry.C15094f.m64876l(r11, r0)
            if (r0 != 0) goto L_0x0176
            goto L_0x0161
        L_0x015a:
            r26 = r1
            goto L_0x0161
        L_0x015d:
            r26 = r1
            r17 = 1065353216(0x3f800000, float:1.0)
        L_0x0161:
            kotlin.jvm.functions.r<androidx.compose.ui.geometry.f, androidx.compose.ui.geometry.f, java.lang.Float, java.lang.Float, kotlin.d2> r0 = r15.$onGesture
            androidx.compose.ui.geometry.f r1 = androidx.compose.p004ui.geometry.C15094f.m64868d(r19)
            androidx.compose.ui.geometry.f r11 = androidx.compose.p004ui.geometry.C15094f.m64868d(r11)
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r10)
            java.lang.Float r12 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r18)
            r0.invoke(r1, r11, r10, r12)
        L_0x0176:
            java.util.List r0 = r9.mo44110e()
            int r1 = r0.size()
            r10 = 0
        L_0x017f:
            if (r10 >= r1) goto L_0x0199
            java.lang.Object r11 = r0.get(r10)
            androidx.compose.ui.input.pointer.w r11 = (androidx.compose.p004ui.input.pointer.C15507w) r11
            boolean r12 = androidx.compose.p004ui.input.pointer.C15492p.m68696p(r11)
            if (r12 == 0) goto L_0x0190
            r11.mo44168a()
        L_0x0190:
            int r10 = r10 + 1
            goto L_0x017f
        L_0x0193:
            r26 = r1
            r17 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
        L_0x0199:
            r0 = r21
            goto L_0x01a6
        L_0x019c:
            r21 = r0
            r26 = r1
            r19 = r2
            r17 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
        L_0x01a6:
            if (r8 != 0) goto L_0x01d3
            java.util.List r1 = r9.mo44110e()
            int r8 = r1.size()
            r9 = 0
        L_0x01b1:
            if (r9 >= r8) goto L_0x01c4
            java.lang.Object r10 = r1.get(r9)
            androidx.compose.ui.input.pointer.w r10 = (androidx.compose.p004ui.input.pointer.C15507w) r10
            boolean r10 = r10.mo44178r()
            if (r10 == 0) goto L_0x01c1
            r1 = 1
            goto L_0x01c5
        L_0x01c1:
            int r9 = r9 + 1
            goto L_0x01b1
        L_0x01c4:
            r1 = 0
        L_0x01c5:
            if (r1 != 0) goto L_0x01c8
            goto L_0x01d3
        L_0x01c8:
            r1 = r26
            r8 = r17
            r10 = r23
            r9 = 2
            r11 = 0
            r12 = 1
            goto L_0x008a
        L_0x01d3:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
