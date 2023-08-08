package kotlinx.coroutines.flow;

import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,222:1\n106#2:223\n106#2:224\n106#2:225\n106#2:226\n75#3:227\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n50#1:223\n76#1:224\n146#1:225\n181#1:226\n218#1:227\n*E\n"})
public final /* synthetic */ class FlowKt__EmittersKt {
    /* renamed from: b */
    public static final void m47053b(@C12579k C11908f<?> fVar) {
        if (fVar instanceof C11955x) {
            throw ((C11955x) fVar).f29541a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m47054c(kotlinx.coroutines.flow.C11908f<? super T> r4, kotlin.jvm.functions.C11305q<? super kotlinx.coroutines.flow.C11908f<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.C11045c<? super kotlin.C11079d2>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.L$0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0047 }
            goto L_0x0044
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r6     // Catch:{ all -> 0x0047 }
            r0.label = r3     // Catch:{ all -> 0x0047 }
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch:{ all -> 0x0047 }
            if (r4 != r1) goto L_0x0044
            return r1
        L_0x0044:
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            return r4
        L_0x0047:
            r4 = move-exception
            if (r6 == 0) goto L_0x004f
            if (r6 == r4) goto L_0x004f
            kotlin.C11414o.m43942a(r4, r6)
        L_0x004f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.m47054c(kotlinx.coroutines.flow.f, kotlin.jvm.functions.q, java.lang.Throwable, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: d */
    public static final <T> C11907e<T> m47055d(@C12579k C11907e<? extends T> eVar, @C12579k C11305q<? super C11908f<? super T>, ? super Throwable, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(eVar, qVar);
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C11907e<T> m47056e(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super C11908f<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(eVar, pVar);
    }

    @C12579k
    /* renamed from: f */
    public static final <T> C11907e<T> m47057f(@C12579k C11907e<? extends T> eVar, @C12579k C11304p<? super C11908f<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pVar, eVar);
    }

    @C12579k
    /* renamed from: g */
    public static final <T, R> C11907e<R> m47058g(@C12579k C11907e<? extends T> eVar, @C12579k @C10863b C11305q<? super C11908f<? super R>, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        return C11909g.m47376J0(new FlowKt__EmittersKt$transform$1(eVar, qVar, (C11045c<? super FlowKt__EmittersKt$transform$1>) null));
    }

    @C12579k
    @C11532s0
    /* renamed from: h */
    public static final <T, R> C11907e<R> m47059h(@C12579k C11907e<? extends T> eVar, @C12579k @C10863b C11305q<? super C11908f<? super R>, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(eVar, qVar);
    }
}
