package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C2198j;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", mo22502f = "Clickable.kt", mo22503i = {0, 1, 2}, mo22504l = {445, 447, 454, 455, 464}, mo22505m = "invokeSuspend", mo22506n = {"delayJob", "success", "releaseInteraction"}, mo22507s = {"L$0", "Z$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ClickableKt$handlePressInteraction$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C8578k2<C11289a<Boolean>> $delayPressInteraction;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ long $pressPoint;
    final /* synthetic */ C8700z0<C2245i.C2247b> $pressedInteraction;
    final /* synthetic */ C2198j $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2(C2198j jVar, long j, C2243g gVar, C8700z0<C2245i.C2247b> z0Var, C8578k2<? extends C11289a<Boolean>> k2Var, C11045c<? super ClickableKt$handlePressInteraction$2> cVar) {
        super(2, cVar);
        this.$this_handlePressInteraction = jVar;
        this.$pressPoint = j;
        this.$interactionSource = gVar;
        this.$pressedInteraction = z0Var;
        this.$delayPressInteraction = k2Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.$this_handlePressInteraction, this.$pressPoint, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, cVar);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4 A[RETURN] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r7) goto L_0x0037
            if (r2 == r6) goto L_0x0031
            if (r2 == r5) goto L_0x0028
            if (r2 == r4) goto L_0x0023
            if (r2 != r3) goto L_0x001b
            goto L_0x0023
        L_0x001b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0023:
            kotlin.C11661u0.m45747n(r20)
            goto L_0x00da
        L_0x0028:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.interaction.i$c r2 = (androidx.compose.foundation.interaction.C2245i.C2248c) r2
            kotlin.C11661u0.m45747n(r20)
            goto L_0x00a8
        L_0x0031:
            boolean r2 = r0.Z$0
            kotlin.C11661u0.m45747n(r20)
            goto L_0x008c
        L_0x0037:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.c2 r2 = (kotlinx.coroutines.C11723c2) r2
            kotlin.C11661u0.m45747n(r20)
            r3 = r20
            goto L_0x0072
        L_0x0041:
            kotlin.C11661u0.m45747n(r20)
            java.lang.Object r2 = r0.L$0
            r9 = r2
            kotlinx.coroutines.o0 r9 = (kotlinx.coroutines.C12074o0) r9
            r10 = 0
            r11 = 0
            androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1 r2 = new androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1
            androidx.compose.runtime.k2<kotlin.jvm.functions.a<java.lang.Boolean>> r13 = r0.$delayPressInteraction
            long r14 = r0.$pressPoint
            androidx.compose.foundation.interaction.g r12 = r0.$interactionSource
            androidx.compose.runtime.z0<androidx.compose.foundation.interaction.i$b> r3 = r0.$pressedInteraction
            r18 = 0
            r16 = r12
            r12 = r2
            r17 = r3
            r12.<init>(r13, r14, r16, r17, r18)
            r13 = 3
            r14 = 0
            kotlinx.coroutines.c2 r2 = kotlinx.coroutines.C12038j.m48061f(r9, r10, r11, r12, r13, r14)
            androidx.compose.foundation.gestures.j r3 = r0.$this_handlePressInteraction
            r0.L$0 = r2
            r0.label = r7
            java.lang.Object r3 = r3.mo7434x2(r0)
            if (r3 != r1) goto L_0x0072
            return r1
        L_0x0072:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r7 = r2.mo23627d()
            if (r7 == 0) goto L_0x00b5
            r0.L$0 = r8
            r0.Z$0 = r3
            r0.label = r6
            java.lang.Object r2 = kotlinx.coroutines.C11804f2.m46964l(r2, r0)
            if (r2 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r2 = r3
        L_0x008c:
            if (r2 == 0) goto L_0x00da
            androidx.compose.foundation.interaction.i$b r2 = new androidx.compose.foundation.interaction.i$b
            long r6 = r0.$pressPoint
            r2.<init>(r6, r8)
            androidx.compose.foundation.interaction.i$c r3 = new androidx.compose.foundation.interaction.i$c
            r3.<init>(r2)
            androidx.compose.foundation.interaction.g r6 = r0.$interactionSource
            r0.L$0 = r3
            r0.label = r5
            java.lang.Object r2 = r6.mo7604a(r2, r0)
            if (r2 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            r2 = r3
        L_0x00a8:
            androidx.compose.foundation.interaction.g r3 = r0.$interactionSource
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r2 = r3.mo7604a(r2, r0)
            if (r2 != r1) goto L_0x00da
            return r1
        L_0x00b5:
            androidx.compose.runtime.z0<androidx.compose.foundation.interaction.i$b> r2 = r0.$pressedInteraction
            java.lang.Object r2 = r2.getValue()
            androidx.compose.foundation.interaction.i$b r2 = (androidx.compose.foundation.interaction.C2245i.C2247b) r2
            if (r2 == 0) goto L_0x00da
            androidx.compose.foundation.interaction.g r4 = r0.$interactionSource
            if (r3 == 0) goto L_0x00c9
            androidx.compose.foundation.interaction.i$c r3 = new androidx.compose.foundation.interaction.i$c
            r3.<init>(r2)
            goto L_0x00ce
        L_0x00c9:
            androidx.compose.foundation.interaction.i$a r3 = new androidx.compose.foundation.interaction.i$a
            r3.<init>(r2)
        L_0x00ce:
            r0.L$0 = r8
            r2 = 5
            r0.label = r2
            java.lang.Object r2 = r4.mo7604a(r3, r0)
            if (r2 != r1) goto L_0x00da
            return r1
        L_0x00da:
            androidx.compose.runtime.z0<androidx.compose.foundation.interaction.i$b> r1 = r0.$pressedInteraction
            r1.setValue(r8)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$handlePressInteraction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ClickableKt$handlePressInteraction$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
