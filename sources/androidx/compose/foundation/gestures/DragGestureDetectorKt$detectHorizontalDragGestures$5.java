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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", mo22502f = "DragGestureDetector.kt", mo22503i = {0, 1, 1}, mo22504l = {539, 541, 552}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, mo22507s = {"L$0", "L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DragGestureDetectorKt$detectHorizontalDragGestures$5 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11289a<C11079d2> $onDragCancel;
    final /* synthetic */ C11289a<C11079d2> $onDragEnd;
    final /* synthetic */ C11300l<C15094f, C11079d2> $onDragStart;
    final /* synthetic */ C11304p<C15507w, Float, C11079d2> $onHorizontalDrag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectHorizontalDragGestures$5(C11300l<? super C15094f, C11079d2> lVar, C11304p<? super C15507w, ? super Float, C11079d2> pVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11045c<? super DragGestureDetectorKt$detectHorizontalDragGestures$5> cVar) {
        super(2, cVar);
        this.$onDragStart = lVar;
        this.$onHorizontalDrag = pVar;
        this.$onDragEnd = aVar;
        this.$onDragCancel = aVar2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$5 = new DragGestureDetectorKt$detectHorizontalDragGestures$5(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, cVar);
        dragGestureDetectorKt$detectHorizontalDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectHorizontalDragGestures$5;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
        return ((DragGestureDetectorKt$detectHorizontalDragGestures$5) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 == r4) goto L_0x002a
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            kotlin.C11661u0.m45747n(r13)
            goto L_0x00a7
        L_0x0016:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001e:
            java.lang.Object r1 = r12.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r3 = r12.L$0
            androidx.compose.ui.input.pointer.c r3 = (androidx.compose.p004ui.input.pointer.C15465c) r3
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0072
        L_0x002a:
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
            kotlin.C11661u0.m45747n(r13)
            goto L_0x004d
        L_0x0032:
            kotlin.C11661u0.m45747n(r13)
            java.lang.Object r13 = r12.L$0
            androidx.compose.ui.input.pointer.c r13 = (androidx.compose.p004ui.input.pointer.C15465c) r13
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r12.L$0 = r13
            r12.label = r4
            r5 = r13
            r8 = r12
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9439f(r5, r6, r7, r8, r9, r10)
            if (r1 != r0) goto L_0x004a
            return r0
        L_0x004a:
            r11 = r1
            r1 = r13
            r13 = r11
        L_0x004d:
            androidx.compose.ui.input.pointer.w r13 = (androidx.compose.p004ui.input.pointer.C15507w) r13
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            long r5 = r13.mo44176p()
            int r7 = r13.mo44185y()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 r8 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
            r8.<init>(r10)
            r12.L$0 = r1
            r12.L$1 = r10
            r12.label = r3
            r4 = r1
            r9 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9247e(r4, r5, r7, r8, r9)
            if (r13 != r0) goto L_0x0070
            return r0
        L_0x0070:
            r3 = r1
            r1 = r10
        L_0x0072:
            androidx.compose.ui.input.pointer.w r13 = (androidx.compose.p004ui.input.pointer.C15507w) r13
            if (r13 == 0) goto L_0x00ba
            kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r4 = r12.$onDragStart
            long r5 = r13.mo44177q()
            androidx.compose.ui.geometry.f r5 = androidx.compose.p004ui.geometry.C15094f.m64868d(r5)
            r4.invoke(r5)
            kotlin.jvm.functions.p<androidx.compose.ui.input.pointer.w, java.lang.Float, kotlin.d2> r4 = r12.$onHorizontalDrag
            float r1 = r1.element
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r1)
            r4.invoke(r13, r1)
            long r4 = r13.mo44176p()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1
            kotlin.jvm.functions.p<androidx.compose.ui.input.pointer.w, java.lang.Float, kotlin.d2> r1 = r12.$onHorizontalDrag
            r13.<init>(r1)
            r1 = 0
            r12.L$0 = r1
            r12.L$1 = r1
            r12.label = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9238B(r3, r4, r13, r12)
            if (r13 != r0) goto L_0x00a7
            return r0
        L_0x00a7:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x00b5
            kotlin.jvm.functions.a<kotlin.d2> r13 = r12.$onDragEnd
            r13.invoke()
            goto L_0x00ba
        L_0x00b5:
            kotlin.jvm.functions.a<kotlin.d2> r13 = r12.$onDragCancel
            r13.invoke()
        L_0x00ba:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
