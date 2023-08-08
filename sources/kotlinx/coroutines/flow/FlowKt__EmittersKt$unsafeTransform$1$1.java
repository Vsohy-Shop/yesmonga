package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n*L\n1#1,222:1\n*E\n"})
public final class FlowKt__EmittersKt$unsafeTransform$1$1<T> implements C11908f {

    /* renamed from: a */
    public final /* synthetic */ C11305q<C11908f<? super R>, T, C11045c<? super C11079d2>, Object> f29320a;

    /* renamed from: b */
    public final /* synthetic */ C11908f<R> f29321b;

    public FlowKt__EmittersKt$unsafeTransform$1$1(C11305q<? super C11908f<? super R>, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar, C11908f<? super R> fVar) {
        this.f29320a = qVar;
        this.f29321b = fVar;
    }

    @C12580l
    /* renamed from: c */
    public final Object mo24106c(T t, @C12579k C11045c<? super C11079d2> cVar) {
        C11322b0.m43482e(4);
        new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, cVar);
        C11322b0.m43482e(5);
        this.f29320a.invoke(this.f29321b, t, cVar);
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.jvm.functions.q<kotlinx.coroutines.flow.f<? super R>, T, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r6 = r4.f29320a
            kotlinx.coroutines.flow.f<R> r2 = r4.f29321b
            r0.label = r3
            java.lang.Object r5 = r6.invoke(r2, r5, r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
