package androidx.compose.animation.core;

import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.C11744g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", mo22502f = "AnimateAsState.kt", mo22503i = {0}, mo22504l = {419}, mo22505m = "invokeSuspend", mo22506n = {"$this$LaunchedEffect"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AnimateAsStateKt$animateValueAsState$3 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C8578k2<C1968g<T>> $animSpec$delegate;
    final /* synthetic */ Animatable<T, V> $animatable;
    final /* synthetic */ C11744g<T> $channel;
    final /* synthetic */ C8578k2<C11300l<T, C11079d2>> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$3(C11744g<T> gVar, Animatable<T, V> animatable, C8578k2<? extends C1968g<T>> k2Var, C8578k2<? extends C11300l<? super T, C11079d2>> k2Var2, C11045c<? super AnimateAsStateKt$animateValueAsState$3> cVar) {
        super(2, cVar);
        this.$channel = gVar;
        this.$animatable = animatable;
        this.$animSpec$delegate = k2Var;
        this.$listener$delegate = k2Var2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3 = new AnimateAsStateKt$animateValueAsState$3(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, cVar);
        animateAsStateKt$animateValueAsState$3.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0024
            if (r2 != r3) goto L_0x001c
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.o0 r4 = (kotlinx.coroutines.C12074o0) r4
            kotlin.C11661u0.m45747n(r18)
            r6 = r18
            r5 = r0
            goto L_0x0044
        L_0x001c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0024:
            kotlin.C11661u0.m45747n(r18)
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.o0 r2 = (kotlinx.coroutines.C12074o0) r2
            kotlinx.coroutines.channels.g<T> r4 = r0.$channel
            kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
            r5 = r0
            r16 = r4
            r4 = r2
            r2 = r16
        L_0x0037:
            r5.L$0 = r4
            r5.L$1 = r2
            r5.label = r3
            java.lang.Object r6 = r2.mo23863c(r5)
            if (r6 != r1) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0078
            java.lang.Object r6 = r2.next()
            kotlinx.coroutines.channels.g<T> r7 = r5.$channel
            java.lang.Object r7 = r7.mo23811W()
            java.lang.Object r7 = kotlinx.coroutines.channels.C11749j.m46637h(r7)
            if (r7 != 0) goto L_0x005e
            r9 = r6
            goto L_0x005f
        L_0x005e:
            r9 = r7
        L_0x005f:
            r6 = 0
            r14 = 0
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r15 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            androidx.compose.animation.core.Animatable<T, V> r10 = r5.$animatable
            androidx.compose.runtime.k2<androidx.compose.animation.core.g<T>> r11 = r5.$animSpec$delegate
            androidx.compose.runtime.k2<kotlin.jvm.functions.l<T, kotlin.d2>> r12 = r5.$listener$delegate
            r13 = 0
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r11 = 3
            r12 = 0
            r7 = r4
            r8 = r6
            r9 = r14
            r10 = r15
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r7, r8, r9, r10, r11, r12)
            goto L_0x0037
        L_0x0078:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AnimateAsStateKt$animateValueAsState$3) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
