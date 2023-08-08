package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
public final class FlowKt__TransformKt$map$$inlined$unsafeTransform$1 implements C11907e<R> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f29398a;

    /* renamed from: b */
    public final /* synthetic */ C11304p f29399b;

    public FlowKt__TransformKt$map$$inlined$unsafeTransform$1(C11907e eVar, C11304p pVar) {
        this.f29398a = eVar;
        this.f29399b = pVar;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.f29398a;
        final C11304p pVar = this.f29399b;
        Object collect = eVar.collect(new C11908f() {
            @C12580l
            /* renamed from: c */
            public final Object mo24132c(Object obj, @C12579k C11045c cVar) {
                C11322b0.m43482e(4);
                new ContinuationImpl(this, cVar) {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C118702 this$0;

                    {
                        this.this$0 = r1;
                    }

                    @C12580l
                    public final Object invokeSuspend(@C12579k Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                };
                C11322b0.m43482e(5);
                C11908f fVar = r4;
                Object invoke = r2.invoke(obj, cVar);
                C11322b0.m43482e(0);
                fVar.emit(invoke, cVar);
                C11322b0.m43482e(1);
                return C11079d2.f28267a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.C118702.C118711
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.C118702.C118711) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    kotlin.C11661u0.m45747n(r8)
                    goto L_0x005d
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.L$0
                    kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.C11908f) r7
                    kotlin.C11661u0.m45747n(r8)
                    goto L_0x0051
                L_0x003c:
                    kotlin.C11661u0.m45747n(r8)
                    kotlinx.coroutines.flow.f r8 = r4
                    kotlin.jvm.functions.p r2 = r2
                    r0.L$0 = r8
                    r0.label = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L_0x004e
                    return r1
                L_0x004e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0051:
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    kotlin.d2 r7 = kotlin.C11079d2.f28267a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.C118702.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: g */
    public Object mo24131g(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11322b0.m43482e(4);
        new ContinuationImpl(this, cVar) {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ FlowKt__TransformKt$map$$inlined$unsafeTransform$1 this$0;

            {
                this.this$0 = r1;
            }

            @C12580l
            public final Object invokeSuspend(@C12579k Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.collect((C11908f) null, this);
            }
        };
        C11322b0.m43482e(5);
        C11907e eVar = this.f29398a;
        final C11304p pVar = this.f29399b;
        C118702 r1 = new C11908f() {
            @C12580l
            /* renamed from: c */
            public final Object mo24132c(Object obj, @C12579k C11045c cVar) {
                C11322b0.m43482e(4);
                new ContinuationImpl(this, cVar) {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C118702 this$0;

                    {
                        this.this$0 = r1;
                    }

                    @C12580l
                    public final Object invokeSuspend(@C12579k Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                };
                C11322b0.m43482e(5);
                C11908f fVar = fVar;
                Object invoke = pVar.invoke(obj, cVar);
                C11322b0.m43482e(0);
                fVar.emit(invoke, cVar);
                C11322b0.m43482e(1);
                return C11079d2.f28267a;
            }

            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.C118702.C118711
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.C118702.C118711) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    kotlin.C11661u0.m45747n(r8)
                    goto L_0x005d
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.L$0
                    kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.C11908f) r7
                    kotlin.C11661u0.m45747n(r8)
                    goto L_0x0051
                L_0x003c:
                    kotlin.C11661u0.m45747n(r8)
                    kotlinx.coroutines.flow.f r8 = r4
                    kotlin.jvm.functions.p r2 = r2
                    r0.L$0 = r8
                    r0.label = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L_0x004e
                    return r1
                L_0x004e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0051:
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    kotlin.d2 r7 = kotlin.C11079d2.f28267a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.C118702.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        };
        C11322b0.m43482e(0);
        eVar.collect(r1, cVar);
        C11322b0.m43482e(1);
        return C11079d2.f28267a;
    }
}
