package kotlinx.coroutines.flow;

import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Ref;

public final class FlowKt__TransformKt$runningFold$1$1<T> implements C11908f {

    /* renamed from: a */
    public final /* synthetic */ Ref.ObjectRef<R> f29413a;

    /* renamed from: b */
    public final /* synthetic */ C11305q<R, T, C11045c<? super R>, Object> f29414b;

    /* renamed from: c */
    public final /* synthetic */ C11908f<R> f29415c;

    public FlowKt__TransformKt$runningFold$1$1(Ref.ObjectRef<R> objectRef, C11305q<? super R, ? super T, ? super C11045c<? super R>, ? extends Object> qVar, C11908f<? super R> fVar) {
        this.f29413a = objectRef;
        this.f29414b = qVar;
        this.f29415c = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0070
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1) r2
            kotlin.C11661u0.m45747n(r9)
            goto L_0x005a
        L_0x0040:
            kotlin.C11661u0.m45747n(r9)
            kotlin.jvm.internal.Ref$ObjectRef<R> r9 = r7.f29413a
            kotlin.jvm.functions.q<R, T, kotlin.coroutines.c<? super R>, java.lang.Object> r2 = r7.f29414b
            T r5 = r9.element
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r8 = r2.invoke(r5, r8, r0)
            if (r8 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x005a:
            r8.element = r9
            kotlinx.coroutines.flow.f<R> r8 = r2.f29415c
            kotlin.jvm.internal.Ref$ObjectRef<R> r9 = r2.f29413a
            T r9 = r9.element
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L_0x0070
            return r1
        L_0x0070:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
