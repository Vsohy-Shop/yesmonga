package kotlinx.coroutines.flow.internal;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", mo22502f = "Combine.kt", mo22503i = {0}, mo22504l = {126}, mo22505m = "invokeSuspend", mo22506n = {"second"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H@"}, mo22516d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CombineKt$zipImpl$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11907e<T1> $flow;
    final /* synthetic */ C11907e<T2> $flow2;
    final /* synthetic */ C11908f<R> $this_unsafeFlow;
    final /* synthetic */ C11305q<T1, T2, C11045c<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(C11908f<? super R> fVar, C11907e<? extends T2> eVar, C11907e<? extends T1> eVar2, C11305q<? super T1, ? super T2, ? super C11045c<? super R>, ? extends Object> qVar, C11045c<? super CombineKt$zipImpl$1$1> cVar) {
        super(2, cVar);
        this.$this_unsafeFlow = fVar;
        this.$flow2 = eVar;
        this.$flow = eVar2;
        this.$transform = qVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$this_unsafeFlow, this.$flow2, this.$flow, this.$transform, cVar);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: kotlinx.coroutines.channels.ReceiveChannel} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r20) {
        /*
            r19 = this;
            r8 = r19
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L_0x0026
            if (r1 != r9) goto L_0x001e
            java.lang.Object r0 = r8.L$0
            r1 = r0
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            kotlin.C11661u0.m45747n(r20)     // Catch:{ AbortFlowException -> 0x001b }
            goto L_0x008b
        L_0x0018:
            r0 = move-exception
            goto L_0x00a3
        L_0x001b:
            r0 = move-exception
            goto L_0x009a
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            kotlin.C11661u0.m45747n(r20)
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.o0 r1 = (kotlinx.coroutines.C12074o0) r1
            r3 = 0
            r4 = 0
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r5 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            kotlinx.coroutines.flow.e<T2> r2 = r8.$flow2
            r5.<init>(r2, r10)
            r6 = 3
            r7 = 0
            r2 = r1
            kotlinx.coroutines.channels.ReceiveChannel r7 = kotlinx.coroutines.channels.ProduceKt.m46530f(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.a0 r2 = kotlinx.coroutines.C11968h2.m47683c(r10, r9, r10)
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r3)
            r3 = r7
            kotlinx.coroutines.channels.t r3 = (kotlinx.coroutines.channels.C11763t) r3
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1 r4 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1
            kotlinx.coroutines.flow.f<R> r5 = r8.$this_unsafeFlow
            r4.<init>(r2, r5)
            r3.mo23779H(r4)
            kotlin.coroutines.CoroutineContext r13 = r1.getCoroutineContext()     // Catch:{ AbortFlowException -> 0x0097, all -> 0x0093 }
            java.lang.Object r14 = kotlinx.coroutines.internal.ThreadContextKt.m47767b(r13)     // Catch:{ AbortFlowException -> 0x0097, all -> 0x0093 }
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()     // Catch:{ AbortFlowException -> 0x0097, all -> 0x0093 }
            kotlin.coroutines.CoroutineContext r1 = r1.mo7443Q(r2)     // Catch:{ AbortFlowException -> 0x0097, all -> 0x0093 }
            kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ AbortFlowException -> 0x0097, all -> 0x0093 }
            r3 = 0
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r4 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch:{ AbortFlowException -> 0x0097, all -> 0x0093 }
            kotlinx.coroutines.flow.e<T1> r12 = r8.$flow     // Catch:{ AbortFlowException -> 0x0097, all -> 0x0093 }
            kotlinx.coroutines.flow.f<R> r5 = r8.$this_unsafeFlow     // Catch:{ AbortFlowException -> 0x0097, all -> 0x0093 }
            kotlin.jvm.functions.q<T1, T2, kotlin.coroutines.c<? super R>, java.lang.Object> r6 = r8.$transform     // Catch:{ AbortFlowException -> 0x0097, all -> 0x0093 }
            r18 = 0
            r11 = r4
            r15 = r7
            r16 = r5
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ AbortFlowException -> 0x0097, all -> 0x0093 }
            r6 = 4
            r11 = 0
            r8.L$0 = r7     // Catch:{ AbortFlowException -> 0x0097, all -> 0x0093 }
            r8.label = r9     // Catch:{ AbortFlowException -> 0x0097, all -> 0x0093 }
            r5 = r19
            r12 = r7
            r7 = r11
            java.lang.Object r1 = kotlinx.coroutines.flow.internal.C11927d.m47586d(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ AbortFlowException -> 0x0091, all -> 0x008f }
            if (r1 != r0) goto L_0x008a
            return r0
        L_0x008a:
            r1 = r12
        L_0x008b:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.m46545b(r1, r10, r9, r10)
            goto L_0x00a0
        L_0x008f:
            r0 = move-exception
            goto L_0x0095
        L_0x0091:
            r0 = move-exception
            goto L_0x0099
        L_0x0093:
            r0 = move-exception
            r12 = r7
        L_0x0095:
            r1 = r12
            goto L_0x00a3
        L_0x0097:
            r0 = move-exception
            r12 = r7
        L_0x0099:
            r1 = r12
        L_0x009a:
            kotlinx.coroutines.flow.f<R> r2 = r8.$this_unsafeFlow     // Catch:{ all -> 0x0018 }
            kotlinx.coroutines.flow.internal.C11931h.m47597b(r0, r2)     // Catch:{ all -> 0x0018 }
            goto L_0x008b
        L_0x00a0:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x00a3:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.m46545b(r1, r10, r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CombineKt$zipImpl$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
