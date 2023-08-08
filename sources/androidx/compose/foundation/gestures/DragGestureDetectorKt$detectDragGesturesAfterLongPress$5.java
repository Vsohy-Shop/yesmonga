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

@C11067d(mo22501c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", mo22502f = "DragGestureDetector.kt", mo22503i = {0, 1, 2}, mo22504l = {235, 236, 241}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, mo22507s = {"L$0", "L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n33#2,6:874\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n*L\n247#1:874,6\n*E\n"})
public final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<C15507w, C15094f, C11079d2> $onDrag;
    final /* synthetic */ C11289a<C11079d2> $onDragCancel;
    final /* synthetic */ C11289a<C11079d2> $onDragEnd;
    final /* synthetic */ C11300l<C15094f, C11079d2> $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(C11300l<? super C15094f, C11079d2> lVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11304p<? super C15507w, ? super C15094f, C11079d2> pVar, C11045c<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> cVar) {
        super(2, cVar);
        this.$onDragStart = lVar;
        this.$onDragEnd = aVar;
        this.$onDragCancel = aVar2;
        this.$onDrag = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, cVar);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.ui.input.pointer.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[Catch:{ CancellationException -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e A[Catch:{ CancellationException -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5 A[Catch:{ CancellationException -> 0x0031 }] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 == r4) goto L_0x0029
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r0 = r11.L$0
            androidx.compose.ui.input.pointer.c r0 = (androidx.compose.p004ui.input.pointer.C15465c) r0
            kotlin.C11661u0.m45747n(r12)     // Catch:{ CancellationException -> 0x0031 }
            goto L_0x0086
        L_0x0019:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0021:
            java.lang.Object r1 = r11.L$0
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
            kotlin.C11661u0.m45747n(r12)     // Catch:{ CancellationException -> 0x0031 }
            goto L_0x005e
        L_0x0029:
            java.lang.Object r1 = r11.L$0
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
            kotlin.C11661u0.m45747n(r12)     // Catch:{ CancellationException -> 0x0031 }
            goto L_0x004d
        L_0x0031:
            r12 = move-exception
            goto L_0x00bd
        L_0x0034:
            kotlin.C11661u0.m45747n(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r11.L$0 = r1     // Catch:{ CancellationException -> 0x0031 }
            r11.label = r4     // Catch:{ CancellationException -> 0x0031 }
            r5 = r1
            r8 = r11
            java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9439f(r5, r6, r7, r8, r9, r10)     // Catch:{ CancellationException -> 0x0031 }
            if (r12 != r0) goto L_0x004d
            return r0
        L_0x004d:
            androidx.compose.ui.input.pointer.w r12 = (androidx.compose.p004ui.input.pointer.C15507w) r12     // Catch:{ CancellationException -> 0x0031 }
            long r4 = r12.mo44176p()     // Catch:{ CancellationException -> 0x0031 }
            r11.L$0 = r1     // Catch:{ CancellationException -> 0x0031 }
            r11.label = r3     // Catch:{ CancellationException -> 0x0031 }
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9249g(r1, r4, r11)     // Catch:{ CancellationException -> 0x0031 }
            if (r12 != r0) goto L_0x005e
            return r0
        L_0x005e:
            androidx.compose.ui.input.pointer.w r12 = (androidx.compose.p004ui.input.pointer.C15507w) r12     // Catch:{ CancellationException -> 0x0031 }
            if (r12 == 0) goto L_0x00ba
            kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r3 = r11.$onDragStart     // Catch:{ CancellationException -> 0x0031 }
            long r4 = r12.mo44177q()     // Catch:{ CancellationException -> 0x0031 }
            androidx.compose.ui.geometry.f r4 = androidx.compose.p004ui.geometry.C15094f.m64868d(r4)     // Catch:{ CancellationException -> 0x0031 }
            r3.invoke(r4)     // Catch:{ CancellationException -> 0x0031 }
            long r3 = r12.mo44176p()     // Catch:{ CancellationException -> 0x0031 }
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1 r12 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1     // Catch:{ CancellationException -> 0x0031 }
            kotlin.jvm.functions.p<androidx.compose.ui.input.pointer.w, androidx.compose.ui.geometry.f, kotlin.d2> r5 = r11.$onDrag     // Catch:{ CancellationException -> 0x0031 }
            r12.<init>(r5)     // Catch:{ CancellationException -> 0x0031 }
            r11.L$0 = r1     // Catch:{ CancellationException -> 0x0031 }
            r11.label = r2     // Catch:{ CancellationException -> 0x0031 }
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9267y(r1, r3, r12, r11)     // Catch:{ CancellationException -> 0x0031 }
            if (r12 != r0) goto L_0x0085
            return r0
        L_0x0085:
            r0 = r1
        L_0x0086:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ CancellationException -> 0x0031 }
            boolean r12 = r12.booleanValue()     // Catch:{ CancellationException -> 0x0031 }
            if (r12 == 0) goto L_0x00b5
            androidx.compose.ui.input.pointer.o r12 = r0.mo44004j3()     // Catch:{ CancellationException -> 0x0031 }
            java.util.List r12 = r12.mo44110e()     // Catch:{ CancellationException -> 0x0031 }
            int r0 = r12.size()     // Catch:{ CancellationException -> 0x0031 }
            r1 = 0
        L_0x009b:
            if (r1 >= r0) goto L_0x00af
            java.lang.Object r2 = r12.get(r1)     // Catch:{ CancellationException -> 0x0031 }
            androidx.compose.ui.input.pointer.w r2 = (androidx.compose.p004ui.input.pointer.C15507w) r2     // Catch:{ CancellationException -> 0x0031 }
            boolean r3 = androidx.compose.p004ui.input.pointer.C15492p.m68684d(r2)     // Catch:{ CancellationException -> 0x0031 }
            if (r3 == 0) goto L_0x00ac
            r2.mo44168a()     // Catch:{ CancellationException -> 0x0031 }
        L_0x00ac:
            int r1 = r1 + 1
            goto L_0x009b
        L_0x00af:
            kotlin.jvm.functions.a<kotlin.d2> r12 = r11.$onDragEnd     // Catch:{ CancellationException -> 0x0031 }
            r12.invoke()     // Catch:{ CancellationException -> 0x0031 }
            goto L_0x00ba
        L_0x00b5:
            kotlin.jvm.functions.a<kotlin.d2> r12 = r11.$onDragCancel     // Catch:{ CancellationException -> 0x0031 }
            r12.invoke()     // Catch:{ CancellationException -> 0x0031 }
        L_0x00ba:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        L_0x00bd:
            kotlin.jvm.functions.a<kotlin.d2> r0 = r11.$onDragCancel
            r0.invoke()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
