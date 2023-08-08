package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref;

public final class FlowKt__LimitKt$take$2$1<T> implements C11908f {

    /* renamed from: a */
    public final /* synthetic */ Ref.IntRef f29347a;

    /* renamed from: b */
    public final /* synthetic */ int f29348b;

    /* renamed from: c */
    public final /* synthetic */ C11908f<T> f29349c;

    public FlowKt__LimitKt$take$2$1(Ref.IntRef intRef, int i, C11908f<? super T> fVar) {
        this.f29347a = intRef;
        this.f29348b = i;
        this.f29349c = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)
            goto L_0x005f
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0051
        L_0x0038:
            kotlin.C11661u0.m45747n(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f29347a
            int r2 = r7.element
            int r2 = r2 + r4
            r7.element = r2
            int r7 = r5.f29348b
            if (r2 >= r7) goto L_0x0054
            kotlinx.coroutines.flow.f<T> r7 = r5.f29349c
            r0.label = r4
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        L_0x0054:
            kotlinx.coroutines.flow.f<T> r7 = r5.f29349c
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt__LimitKt.m47079f(r7, r6, r0)
            if (r6 != r1) goto L_0x005f
            return r1
        L_0x005f:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
