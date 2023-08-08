package kotlinx.coroutines.flow;

import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Ref;

public final class FlowKt__TransformKt$runningReduce$1$1<T> implements C11908f {

    /* renamed from: a */
    public final /* synthetic */ Ref.ObjectRef<Object> f29416a;

    /* renamed from: b */
    public final /* synthetic */ C11305q<T, T, C11045c<? super T>, Object> f29417b;

    /* renamed from: c */
    public final /* synthetic */ C11908f<T> f29418c;

    public FlowKt__TransformKt$runningReduce$1$1(Ref.ObjectRef<Object> objectRef, C11305q<? super T, ? super T, ? super C11045c<? super T>, ? extends Object> qVar, C11908f<? super T> fVar) {
        this.f29416a = objectRef;
        this.f29417b = qVar;
        this.f29418c = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
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
            goto L_0x0079
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1) r2
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0060
        L_0x0040:
            kotlin.C11661u0.m45747n(r9)
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r7.f29416a
            T r2 = r9.element
            kotlinx.coroutines.internal.o0 r5 = kotlinx.coroutines.flow.internal.C11936l.f29516a
            if (r2 != r5) goto L_0x004d
            r2 = r7
            goto L_0x0063
        L_0x004d:
            kotlin.jvm.functions.q<T, T, kotlin.coroutines.c<? super T>, java.lang.Object> r5 = r7.f29417b
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r8 = r5.invoke(r2, r8, r0)
            if (r8 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0060:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0063:
            r9.element = r8
            kotlinx.coroutines.flow.f<T> r8 = r2.f29418c
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r2.f29416a
            T r9 = r9.element
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L_0x0079
            return r1
        L_0x0079:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
