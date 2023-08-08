package androidx.compose.foundation;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", mo22502f = "MutatorMutex.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {173, 160}, mo22505m = "invokeSuspend", mo22506n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, mo22507s = {"L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, mo22516d2 = {"T", "R", "Lkotlinx/coroutines/o0;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,167:1\n107#2,10:168\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n*L\n158#1:168,10\n*E\n"})
public final class MutatorMutex$mutateWith$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super R>, Object> {
    final /* synthetic */ C11304p<T, C11045c<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ T $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, C11304p<? super T, ? super C11045c<? super R>, ? extends Object> pVar, T t, C11045c<? super MutatorMutex$mutateWith$2> cVar) {
        super(2, cVar);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = pVar;
        this.$receiver = t;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, cVar);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x009e=Splitter:B:20:0x009e, B:26:0x00af=Splitter:B:26:0x00af} */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r9.L$2
            androidx.compose.foundation.MutatorMutex r0 = (androidx.compose.foundation.MutatorMutex) r0
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.sync.a r1 = (kotlinx.coroutines.sync.C12139a) r1
            java.lang.Object r2 = r9.L$0
            androidx.compose.foundation.MutatorMutex$a r2 = (androidx.compose.foundation.MutatorMutex.C2096a) r2
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0020 }
            goto L_0x009e
        L_0x0020:
            r10 = move-exception
            goto L_0x00af
        L_0x0023:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x002b:
            java.lang.Object r1 = r9.L$4
            androidx.compose.foundation.MutatorMutex r1 = (androidx.compose.foundation.MutatorMutex) r1
            java.lang.Object r3 = r9.L$3
            java.lang.Object r5 = r9.L$2
            kotlin.jvm.functions.p r5 = (kotlin.jvm.functions.C11304p) r5
            java.lang.Object r6 = r9.L$1
            kotlinx.coroutines.sync.a r6 = (kotlinx.coroutines.sync.C12139a) r6
            java.lang.Object r7 = r9.L$0
            androidx.compose.foundation.MutatorMutex$a r7 = (androidx.compose.foundation.MutatorMutex.C2096a) r7
            kotlin.C11661u0.m45747n(r10)
            r10 = r6
            goto L_0x0087
        L_0x0042:
            kotlin.C11661u0.m45747n(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.o0 r10 = (kotlinx.coroutines.C12074o0) r10
            androidx.compose.foundation.MutatorMutex$a r1 = new androidx.compose.foundation.MutatorMutex$a
            androidx.compose.foundation.MutatePriority r5 = r9.$priority
            kotlin.coroutines.CoroutineContext r10 = r10.getCoroutineContext()
            kotlinx.coroutines.c2$b r6 = kotlinx.coroutines.C11723c2.f29067w0
            kotlin.coroutines.CoroutineContext$a r10 = r10.mo7444b(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            kotlinx.coroutines.c2 r10 = (kotlinx.coroutines.C11723c2) r10
            r1.<init>(r5, r10)
            androidx.compose.foundation.MutatorMutex r10 = r9.this$0
            r10.mo7231h(r1)
            androidx.compose.foundation.MutatorMutex r10 = r9.this$0
            kotlinx.coroutines.sync.a r10 = r10.f5771b
            kotlin.jvm.functions.p<T, kotlin.coroutines.c<? super R>, java.lang.Object> r5 = r9.$block
            T r6 = r9.$receiver
            androidx.compose.foundation.MutatorMutex r7 = r9.this$0
            r9.L$0 = r1
            r9.L$1 = r10
            r9.L$2 = r5
            r9.L$3 = r6
            r9.L$4 = r7
            r9.label = r3
            java.lang.Object r3 = r10.mo24739f(r4, r9)
            if (r3 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r3 = r6
            r8 = r7
            r7 = r1
            r1 = r8
        L_0x0087:
            r9.L$0 = r7     // Catch:{ all -> 0x00a9 }
            r9.L$1 = r10     // Catch:{ all -> 0x00a9 }
            r9.L$2 = r1     // Catch:{ all -> 0x00a9 }
            r9.L$3 = r4     // Catch:{ all -> 0x00a9 }
            r9.L$4 = r4     // Catch:{ all -> 0x00a9 }
            r9.label = r2     // Catch:{ all -> 0x00a9 }
            java.lang.Object r2 = r5.invoke(r3, r9)     // Catch:{ all -> 0x00a9 }
            if (r2 != r0) goto L_0x009a
            return r0
        L_0x009a:
            r0 = r1
            r1 = r10
            r10 = r2
            r2 = r7
        L_0x009e:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f5770a     // Catch:{ all -> 0x00b7 }
            androidx.camera.view.C1814q.m7242a(r0, r2, r4)     // Catch:{ all -> 0x00b7 }
            r1.mo24740g(r4)
            return r10
        L_0x00a9:
            r0 = move-exception
            r2 = r7
            r8 = r1
            r1 = r10
            r10 = r0
            r0 = r8
        L_0x00af:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f5770a     // Catch:{ all -> 0x00b7 }
            androidx.camera.view.C1814q.m7242a(r0, r2, r4)     // Catch:{ all -> 0x00b7 }
            throw r10     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r10 = move-exception
            r1.mo24740g(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MutatorMutex$mutateWith$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super R> cVar) {
        return ((MutatorMutex$mutateWith$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
