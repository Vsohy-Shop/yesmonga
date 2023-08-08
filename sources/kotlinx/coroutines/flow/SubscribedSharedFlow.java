package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;

public final class SubscribedSharedFlow<T> implements C11944n<T> {
    @C12579k

    /* renamed from: a */
    public final C11944n<T> f29461a;
    @C12579k

    /* renamed from: b */
    public final C11304p<C11908f<? super T>, C11045c<? super C11079d2>, Object> f29462b;

    public SubscribedSharedFlow(@C12579k C11944n<? extends T> nVar, @C12579k C11304p<? super C11908f<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        this.f29461a = nVar;
        this.f29462b = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(@org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11908f<? super T> r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = (kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = new kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0046
        L_0x0031:
            kotlin.C11661u0.m45747n(r7)
            kotlinx.coroutines.flow.n<T> r7 = r5.f29461a
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = new kotlinx.coroutines.flow.SubscribedFlowCollector
            kotlin.jvm.functions.p<kotlinx.coroutines.flow.f<? super T>, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r4 = r5.f29462b
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedSharedFlow.collect(kotlinx.coroutines.flow.f, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: d */
    public List<T> mo24203d() {
        return this.f29461a.mo24203d();
    }
}
