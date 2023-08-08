package androidx.compose.foundation;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.MutatorMutex$mutate$2", mo22502f = "MutatorMutex.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {173, 119}, mo22505m = "invokeSuspend", mo22506n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, mo22507s = {"L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"R", "Lkotlinx/coroutines/o0;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,167:1\n107#2,10:168\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n*L\n117#1:168,10\n*E\n"})
public final class MutatorMutex$mutate$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super R>, Object> {
    final /* synthetic */ C11300l<C11045c<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, C11300l<? super C11045c<? super R>, ? extends Object> lVar, C11045c<? super MutatorMutex$mutate$2> cVar) {
        super(2, cVar);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, cVar);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0096=Splitter:B:20:0x0096, B:26:0x00a7=Splitter:B:26:0x00a7} */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0040
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r8.L$2
            androidx.compose.foundation.MutatorMutex r0 = (androidx.compose.foundation.MutatorMutex) r0
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.sync.a r1 = (kotlinx.coroutines.sync.C12139a) r1
            java.lang.Object r2 = r8.L$0
            androidx.compose.foundation.MutatorMutex$a r2 = (androidx.compose.foundation.MutatorMutex.C2096a) r2
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0020 }
            goto L_0x0096
        L_0x0020:
            r9 = move-exception
            goto L_0x00a7
        L_0x0023:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x002b:
            java.lang.Object r1 = r8.L$3
            androidx.compose.foundation.MutatorMutex r1 = (androidx.compose.foundation.MutatorMutex) r1
            java.lang.Object r3 = r8.L$2
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            java.lang.Object r5 = r8.L$1
            kotlinx.coroutines.sync.a r5 = (kotlinx.coroutines.sync.C12139a) r5
            java.lang.Object r6 = r8.L$0
            androidx.compose.foundation.MutatorMutex$a r6 = (androidx.compose.foundation.MutatorMutex.C2096a) r6
            kotlin.C11661u0.m45747n(r9)
            r9 = r5
            goto L_0x0081
        L_0x0040:
            kotlin.C11661u0.m45747n(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.o0 r9 = (kotlinx.coroutines.C12074o0) r9
            androidx.compose.foundation.MutatorMutex$a r1 = new androidx.compose.foundation.MutatorMutex$a
            androidx.compose.foundation.MutatePriority r5 = r8.$priority
            kotlin.coroutines.CoroutineContext r9 = r9.getCoroutineContext()
            kotlinx.coroutines.c2$b r6 = kotlinx.coroutines.C11723c2.f29067w0
            kotlin.coroutines.CoroutineContext$a r9 = r9.mo7444b(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            kotlinx.coroutines.c2 r9 = (kotlinx.coroutines.C11723c2) r9
            r1.<init>(r5, r9)
            androidx.compose.foundation.MutatorMutex r9 = r8.this$0
            r9.mo7231h(r1)
            androidx.compose.foundation.MutatorMutex r9 = r8.this$0
            kotlinx.coroutines.sync.a r9 = r9.f5771b
            kotlin.jvm.functions.l<kotlin.coroutines.c<? super R>, java.lang.Object> r5 = r8.$block
            androidx.compose.foundation.MutatorMutex r6 = r8.this$0
            r8.L$0 = r1
            r8.L$1 = r9
            r8.L$2 = r5
            r8.L$3 = r6
            r8.label = r3
            java.lang.Object r3 = r9.mo24739f(r4, r8)
            if (r3 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r3 = r5
            r7 = r6
            r6 = r1
            r1 = r7
        L_0x0081:
            r8.L$0 = r6     // Catch:{ all -> 0x00a1 }
            r8.L$1 = r9     // Catch:{ all -> 0x00a1 }
            r8.L$2 = r1     // Catch:{ all -> 0x00a1 }
            r8.L$3 = r4     // Catch:{ all -> 0x00a1 }
            r8.label = r2     // Catch:{ all -> 0x00a1 }
            java.lang.Object r2 = r3.invoke(r8)     // Catch:{ all -> 0x00a1 }
            if (r2 != r0) goto L_0x0092
            return r0
        L_0x0092:
            r0 = r1
            r1 = r9
            r9 = r2
            r2 = r6
        L_0x0096:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f5770a     // Catch:{ all -> 0x00af }
            androidx.camera.view.C1814q.m7242a(r0, r2, r4)     // Catch:{ all -> 0x00af }
            r1.mo24740g(r4)
            return r9
        L_0x00a1:
            r0 = move-exception
            r2 = r6
            r7 = r1
            r1 = r9
            r9 = r0
            r0 = r7
        L_0x00a7:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f5770a     // Catch:{ all -> 0x00af }
            androidx.camera.view.C1814q.m7242a(r0, r2, r4)     // Catch:{ all -> 0x00af }
            throw r9     // Catch:{ all -> 0x00af }
        L_0x00af:
            r9 = move-exception
            r1.mo24740g(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MutatorMutex$mutate$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super R> cVar) {
        return ((MutatorMutex$mutate$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
