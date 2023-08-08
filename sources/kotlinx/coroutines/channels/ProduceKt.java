package kotlinx.coroutines.channels;

import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.C12177y1;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,151:1\n1#2:152\n314#3,11:153\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n48#1:153,11\n*E\n"})
public final class ProduceKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: kotlin.jvm.functions.a<kotlin.d2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m46525a(@org.jetbrains.annotations.C12579k kotlinx.coroutines.channels.C11760r<?> r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.L$1
            r5 = r4
            kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.r r4 = (kotlinx.coroutines.channels.C11760r) r4
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x007a
        L_0x0032:
            r4 = move-exception
            goto L_0x0080
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            kotlin.C11661u0.m45747n(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            kotlinx.coroutines.c2$b r2 = kotlinx.coroutines.C11723c2.f29067w0
            kotlin.coroutines.CoroutineContext$a r6 = r6.mo7444b(r2)
            if (r6 != r4) goto L_0x004d
            r6 = r3
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 == 0) goto L_0x0084
            r0.L$0 = r4     // Catch:{ all -> 0x0032 }
            r0.L$1 = r5     // Catch:{ all -> 0x0032 }
            r0.label = r3     // Catch:{ all -> 0x0032 }
            kotlinx.coroutines.p r6 = new kotlinx.coroutines.p     // Catch:{ all -> 0x0032 }
            kotlin.coroutines.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r0)     // Catch:{ all -> 0x0032 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0032 }
            r6.mo24537e0()     // Catch:{ all -> 0x0032 }
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r2 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch:{ all -> 0x0032 }
            r2.<init>(r6)     // Catch:{ all -> 0x0032 }
            r4.mo23779H(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r6.mo24572y()     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = kotlin.coroutines.intrinsics.C11063b.m42612h()     // Catch:{ all -> 0x0032 }
            if (r4 != r6) goto L_0x0077
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r0)     // Catch:{ all -> 0x0032 }
        L_0x0077:
            if (r4 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r5.invoke()
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            return r4
        L_0x0080:
            r5.invoke()
            throw r4
        L_0x0084:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.m46525a(kotlinx.coroutines.channels.r, kotlin.jvm.functions.a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public static /* synthetic */ Object m46526b(C11760r rVar, C11289a aVar, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = ProduceKt$awaitClose$2.f29148f;
        }
        return m46525a(rVar, aVar, cVar);
    }

    @C12095s1
    @C12579k
    /* renamed from: c */
    public static final <E> ReceiveChannel<E> m46527c(@C12579k C12074o0 o0Var, @C12579k CoroutineContext coroutineContext, int i, @C12579k @C10863b C11304p<? super C11760r<? super E>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return m46529e(o0Var, coroutineContext, i, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, (C11300l<? super Throwable, C11079d2>) null, pVar);
    }

    @C12177y1
    @C12579k
    /* renamed from: d */
    public static final <E> ReceiveChannel<E> m46528d(@C12579k C12074o0 o0Var, @C12579k CoroutineContext coroutineContext, int i, @C12579k CoroutineStart coroutineStart, @C12580l C11300l<? super Throwable, C11079d2> lVar, @C12579k @C10863b C11304p<? super C11760r<? super E>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return m46529e(o0Var, coroutineContext, i, BufferOverflow.SUSPEND, coroutineStart, lVar, pVar);
    }

    @C12579k
    /* renamed from: e */
    public static final <E> ReceiveChannel<E> m46529e(@C12579k C12074o0 o0Var, @C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow, @C12579k CoroutineStart coroutineStart, @C12580l C11300l<? super Throwable, C11079d2> lVar, @C12579k @C10863b C11304p<? super C11760r<? super E>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        C11759q qVar = new C11759q(CoroutineContextKt.m45901e(o0Var, coroutineContext), C11748i.m46625d(i, bufferOverflow, (C11300l) null, 4, (Object) null));
        if (lVar != null) {
            qVar.mo23589D(lVar);
        }
        qVar.mo23695R1(coroutineStart, qVar, pVar);
        return qVar;
    }

    /* renamed from: f */
    public static /* synthetic */ ReceiveChannel m46530f(C12074o0 o0Var, CoroutineContext coroutineContext, int i, C11304p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m46527c(o0Var, coroutineContext, i, pVar);
    }

    /* renamed from: g */
    public static /* synthetic */ ReceiveChannel m46531g(C12074o0 o0Var, CoroutineContext coroutineContext, int i, CoroutineStart coroutineStart, C11300l lVar, C11304p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        return m46528d(o0Var, coroutineContext2, i3, coroutineStart2, lVar, pVar);
    }

    /* renamed from: h */
    public static /* synthetic */ ReceiveChannel m46532h(C12074o0 o0Var, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, C11300l lVar, C11304p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if ((i2 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i2 & 16) != 0) {
            lVar = null;
        }
        return m46529e(o0Var, coroutineContext2, i3, bufferOverflow2, coroutineStart2, lVar, pVar);
    }
}
