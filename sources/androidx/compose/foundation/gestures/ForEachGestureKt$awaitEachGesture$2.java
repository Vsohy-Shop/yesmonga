package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.input.pointer.C15465c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", mo22502f = "ForEachGesture.kt", mo22503i = {0, 1, 2}, mo22504l = {104, 107, 112}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, mo22507s = {"L$0", "L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<C15465c, C11045c<? super C11079d2>, Object> $block;
    final /* synthetic */ CoroutineContext $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(CoroutineContext coroutineContext, C11304p<? super C15465c, ? super C11045c<? super C11079d2>, ? extends Object> pVar, C11045c<? super ForEachGestureKt$awaitEachGesture$2> cVar) {
        super(2, cVar);
        this.$currentContext = coroutineContext;
        this.$block = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, cVar);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[SYNTHETIC, Splitter:B:22:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r4) goto L_0x002a
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0028
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0021:
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
            kotlin.C11661u0.m45747n(r9)     // Catch:{ CancellationException -> 0x0033 }
        L_0x0028:
            r9 = r1
            goto L_0x003e
        L_0x002a:
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
            kotlin.C11661u0.m45747n(r9)     // Catch:{ CancellationException -> 0x0033 }
            r9 = r8
            goto L_0x0057
        L_0x0033:
            r9 = move-exception
            r5 = r1
            r1 = r8
            goto L_0x0070
        L_0x0037:
            kotlin.C11661u0.m45747n(r9)
            java.lang.Object r9 = r8.L$0
            androidx.compose.ui.input.pointer.c r9 = (androidx.compose.p004ui.input.pointer.C15465c) r9
        L_0x003e:
            r1 = r8
        L_0x003f:
            kotlin.coroutines.CoroutineContext r5 = r1.$currentContext
            boolean r5 = kotlinx.coroutines.C11804f2.m46952C(r5)
            if (r5 == 0) goto L_0x0086
            kotlin.jvm.functions.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r5 = r1.$block     // Catch:{ CancellationException -> 0x006c }
            r1.L$0 = r9     // Catch:{ CancellationException -> 0x006c }
            r1.label = r4     // Catch:{ CancellationException -> 0x006c }
            java.lang.Object r5 = r5.invoke(r9, r1)     // Catch:{ CancellationException -> 0x006c }
            if (r5 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0057:
            r9.L$0 = r1     // Catch:{ CancellationException -> 0x0066 }
            r9.label = r3     // Catch:{ CancellationException -> 0x0066 }
            java.lang.Object r5 = androidx.compose.foundation.gestures.ForEachGestureKt.m9334b(r1, r9)     // Catch:{ CancellationException -> 0x0066 }
            if (r5 != r0) goto L_0x0062
            return r0
        L_0x0062:
            r7 = r1
            r1 = r9
            r9 = r7
            goto L_0x003f
        L_0x0066:
            r5 = move-exception
            r7 = r1
            r1 = r9
            r9 = r5
            r5 = r7
            goto L_0x0070
        L_0x006c:
            r5 = move-exception
            r7 = r5
            r5 = r9
            r9 = r7
        L_0x0070:
            kotlin.coroutines.CoroutineContext r6 = r1.$currentContext
            boolean r6 = kotlinx.coroutines.C11804f2.m46952C(r6)
            if (r6 == 0) goto L_0x0085
            r1.L$0 = r5
            r1.label = r2
            java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.m9334b(r5, r1)
            if (r9 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r9 = r5
            goto L_0x003f
        L_0x0085:
            throw r9
        L_0x0086:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
