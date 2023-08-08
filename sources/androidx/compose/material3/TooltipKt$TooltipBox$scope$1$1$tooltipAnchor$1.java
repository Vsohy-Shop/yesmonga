package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15472e0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11723c2;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1", mo22502f = "Tooltip.kt", mo22503i = {}, mo22504l = {212}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11289a<C11723c2> $onLongPress;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1", mo22502f = "Tooltip.kt", mo22503i = {0, 0, 0, 1, 1}, mo22504l = {217, 221, 229}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitEachGesture", "pass", "longPressTimeout", "$this$awaitEachGesture", "pass"}, mo22507s = {"L$0", "L$1", "J$0", "L$0", "L$1"})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C11363r0({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,770:1\n1855#2,2:771\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1\n*L\n230#1:771,2\n*E\n"})
    /* renamed from: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1 */
    public static final class C81591 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C81591 r0 = new C81591(aVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
            return ((C81591) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0099 A[LOOP:0: B:27:0x0093->B:29:0x0099, LOOP_END] */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r1 = r14.label
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x003b
                if (r1 == r4) goto L_0x002c
                if (r1 == r3) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                kotlin.C11661u0.m45747n(r15)
                goto L_0x0087
            L_0x0017:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x001f:
                java.lang.Object r1 = r14.L$1
                androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.p004ui.input.pointer.PointerEventPass) r1
                java.lang.Object r3 = r14.L$0
                androidx.compose.ui.input.pointer.c r3 = (androidx.compose.p004ui.input.pointer.C15465c) r3
                kotlin.C11661u0.m45747n(r15)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0075 }
                goto L_0x00a3
            L_0x002c:
                long r6 = r14.J$0
                java.lang.Object r1 = r14.L$1
                androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.p004ui.input.pointer.PointerEventPass) r1
                java.lang.Object r4 = r14.L$0
                androidx.compose.ui.input.pointer.c r4 = (androidx.compose.p004ui.input.pointer.C15465c) r4
                kotlin.C11661u0.m45747n(r15)
                r15 = r4
                goto L_0x0062
            L_0x003b:
                kotlin.C11661u0.m45747n(r15)
                java.lang.Object r15 = r14.L$0
                androidx.compose.ui.input.pointer.c r15 = (androidx.compose.p004ui.input.pointer.C15465c) r15
                androidx.compose.ui.platform.c4 r1 = r15.getViewConfiguration()
                long r12 = r1.mo44720c()
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p004ui.input.pointer.PointerEventPass.Initial
                r7 = 0
                r10 = 1
                r11 = 0
                r14.L$0 = r15
                r14.L$1 = r1
                r14.J$0 = r12
                r14.label = r4
                r6 = r15
                r8 = r1
                r9 = r14
                java.lang.Object r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9439f(r6, r7, r8, r9, r10, r11)
                if (r4 != r0) goto L_0x0061
                return r0
            L_0x0061:
                r6 = r12
            L_0x0062:
                androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1$1 r4 = new androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1$1     // Catch:{ PointerEventTimeoutCancellationException -> 0x0074 }
                r4.<init>(r1, r5)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0074 }
                r14.L$0 = r15     // Catch:{ PointerEventTimeoutCancellationException -> 0x0074 }
                r14.L$1 = r1     // Catch:{ PointerEventTimeoutCancellationException -> 0x0074 }
                r14.label = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x0074 }
                java.lang.Object r15 = r15.mo44006u2(r6, r4, r14)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0074 }
                if (r15 != r0) goto L_0x00a3
                return r0
            L_0x0074:
                r3 = r15
            L_0x0075:
                kotlin.jvm.functions.a<kotlinx.coroutines.c2> r15 = r3
                r15.invoke()
                r14.L$0 = r5
                r14.L$1 = r5
                r14.label = r2
                java.lang.Object r15 = r3.mo44003i3(r1, r14)
                if (r15 != r0) goto L_0x0087
                return r0
            L_0x0087:
                androidx.compose.ui.input.pointer.o r15 = (androidx.compose.p004ui.input.pointer.C15491o) r15
                java.util.List r15 = r15.mo44110e()
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.Iterator r15 = r15.iterator()
            L_0x0093:
                boolean r0 = r15.hasNext()
                if (r0 == 0) goto L_0x00a3
                java.lang.Object r0 = r15.next()
                androidx.compose.ui.input.pointer.w r0 = (androidx.compose.p004ui.input.pointer.C15507w) r0
                r0.mo44168a()
                goto L_0x0093
            L_0x00a3:
                kotlin.d2 r15 = kotlin.C11079d2.f28267a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1.C81591.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1(C11289a<? extends C11723c2> aVar, C11045c<? super TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1> cVar) {
        super(2, cVar);
        this.$onLongPress = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1 tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1 = new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1(this.$onLongPress, cVar);
        tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1.L$0 = obj;
        return tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C11289a<C11723c2> aVar = this.$onLongPress;
            C81591 r1 = new C81591((C11045c<? super C81591>) null);
            this.label = 1;
            if (ForEachGestureKt.m9336d((C15472e0) this.L$0, r1, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
