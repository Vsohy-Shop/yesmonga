package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$2\n*L\n1#1,172:1\n*E\n"})
public final class FlowKt__ReduceKt$fold$2<T> implements C11908f {

    /* renamed from: a */
    public final /* synthetic */ Ref.ObjectRef<R> f29372a;

    /* renamed from: b */
    public final /* synthetic */ C11305q<R, T, C11045c<? super R>, Object> f29373b;

    public FlowKt__ReduceKt$fold$2(Ref.ObjectRef<R> objectRef, C11305q<? super R, ? super T, ? super C11045c<? super R>, ? extends Object> qVar) {
        this.f29372a = objectRef;
        this.f29373b = qVar;
    }

    @C12580l
    /* renamed from: c */
    public final Object mo24120c(T t, @C12579k C11045c<? super C11079d2> cVar) {
        C11322b0.m43482e(4);
        new FlowKt__ReduceKt$fold$2$emit$1(this, cVar);
        C11322b0.m43482e(5);
        Ref.ObjectRef<R> objectRef = this.f29372a;
        objectRef.element = this.f29373b.invoke(objectRef.element, t, cVar);
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            kotlin.C11661u0.m45747n(r8)
            goto L_0x004c
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            kotlin.C11661u0.m45747n(r8)
            kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r6.f29372a
            kotlin.jvm.functions.q<R, T, kotlin.coroutines.c<? super R>, java.lang.Object> r2 = r6.f29373b
            T r4 = r8.element
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = r2.invoke(r4, r7, r0)
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x004c:
            r7.element = r8
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
