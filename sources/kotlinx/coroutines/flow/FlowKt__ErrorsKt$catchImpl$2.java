package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref;

public final class FlowKt__ErrorsKt$catchImpl$2<T> implements C11908f {

    /* renamed from: a */
    public final /* synthetic */ C11908f<T> f29326a;

    /* renamed from: b */
    public final /* synthetic */ Ref.ObjectRef<Throwable> f29327b;

    public FlowKt__ErrorsKt$catchImpl$2(C11908f<? super T> fVar, Ref.ObjectRef<Throwable> objectRef) {
        this.f29326a = fVar;
        this.f29327b = objectRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2) r5
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x002d }
            goto L_0x0047
        L_0x002d:
            r6 = move-exception
            goto L_0x004c
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            kotlinx.coroutines.flow.f<T> r6 = r4.f29326a     // Catch:{ all -> 0x004a }
            r0.L$0 = r4     // Catch:{ all -> 0x004a }
            r0.label = r3     // Catch:{ all -> 0x004a }
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch:{ all -> 0x004a }
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        L_0x004a:
            r6 = move-exception
            r5 = r4
        L_0x004c:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.f29327b
            r5.element = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
