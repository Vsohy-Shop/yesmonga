package androidx.datastore.core;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.datastore.core.SimpleActor$offer$2", mo22502f = "SimpleActor.kt", mo22503i = {}, mo22504l = {122, 122}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SimpleActor$offer$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<T> simpleActor, C11045c<? super SimpleActor$offer$2> cVar) {
        super(2, cVar);
        this.this$0 = simpleActor;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SimpleActor$offer$2(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            kotlin.C11661u0.m45747n(r8)
            r8 = r7
            goto L_0x006e
        L_0x0013:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001b:
            java.lang.Object r1 = r7.L$0
            kotlin.jvm.functions.p r1 = (kotlin.jvm.functions.C11304p) r1
            kotlin.C11661u0.m45747n(r8)
            r4 = r1
            r1 = r0
            r0 = r7
            goto L_0x0060
        L_0x0026:
            kotlin.C11661u0.m45747n(r8)
            androidx.datastore.core.SimpleActor<T> r8 = r7.this$0
            java.util.concurrent.atomic.AtomicInteger r8 = r8.f47393d
            int r8 = r8.get()
            if (r8 <= 0) goto L_0x0037
            r8 = r3
            goto L_0x0038
        L_0x0037:
            r8 = 0
        L_0x0038:
            if (r8 == 0) goto L_0x007d
            r8 = r7
        L_0x003b:
            androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
            kotlinx.coroutines.o0 r1 = r1.f47390a
            kotlinx.coroutines.C12079p0.m48269j(r1)
            androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
            kotlin.jvm.functions.p r1 = r1.f47391b
            androidx.datastore.core.SimpleActor<T> r4 = r8.this$0
            kotlinx.coroutines.channels.g r4 = r4.f47392c
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r4 = r4.mo23824c0(r8)
            if (r4 != r0) goto L_0x005b
            return r0
        L_0x005b:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r1
            r1 = r6
        L_0x0060:
            r5 = 0
            r0.L$0 = r5
            r0.label = r2
            java.lang.Object r8 = r4.invoke(r8, r0)
            if (r8 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r8 = r0
            r0 = r1
        L_0x006e:
            androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f47393d
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L_0x003b
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        L_0x007d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SimpleActor$offer$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
