package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", mo22502f = "Emitters.kt", mo22503i = {}, mo22504l = {40}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, mo22516d2 = {"T", "R", "Lkotlinx/coroutines/flow/f;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,222:1\n*E\n"})
public final class FlowKt__EmittersKt$transform$1 extends SuspendLambda implements C11304p<C11908f<? super R>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11907e<T> $this_transform;
    final /* synthetic */ C11305q<C11908f<? super R>, T, C11045c<? super C11079d2>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$transform$1(C11907e<? extends T> eVar, C11305q<? super C11908f<? super R>, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar, C11045c<? super FlowKt__EmittersKt$transform$1> cVar) {
        super(2, cVar);
        this.$this_transform = eVar;
        this.$transform = qVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FlowKt__EmittersKt$transform$1 flowKt__EmittersKt$transform$1 = new FlowKt__EmittersKt$transform$1(this.$this_transform, this.$transform, cVar);
        flowKt__EmittersKt$transform$1.L$0 = obj;
        return flowKt__EmittersKt$transform$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super R> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FlowKt__EmittersKt$transform$1) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    /* renamed from: h */
    public final Object mo24104h(@C12579k Object obj) {
        final C11908f fVar = (C11908f) this.L$0;
        C11907e<T> eVar = this.$this_transform;
        final C11305q<C11908f<? super R>, T, C11045c<? super C11079d2>, Object> qVar = this.$transform;
        C118271 r1 = new C11908f() {
            @C12580l
            /* renamed from: c */
            public final Object mo24105c(T t, @C12579k C11045c<? super C11079d2> cVar) {
                C11322b0.m43482e(4);
                new FlowKt__EmittersKt$transform$1$1$emit$1(this, cVar);
                C11322b0.m43482e(5);
                r4.invoke(r6, t, cVar);
                return C11079d2.f28267a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
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
                    kotlin.jvm.functions.q<kotlinx.coroutines.flow.f<? super R>, T, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r6 = r4
                    kotlinx.coroutines.flow.f<R> r2 = r6
                    r0.label = r3
                    java.lang.Object r5 = r6.invoke(r2, r5, r0)
                    if (r5 != r1) goto L_0x0041
                    return r1
                L_0x0041:
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1.C118271.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        };
        C11322b0.m43482e(0);
        eVar.collect(r1, this);
        C11322b0.m43482e(1);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C11908f fVar = (C11908f) this.L$0;
            C11907e<T> eVar = this.$this_transform;
            final C11305q<C11908f<? super R>, T, C11045c<? super C11079d2>, Object> qVar = this.$transform;
            C118271 r3 = new C11908f() {
                @C12580l
                /* renamed from: c */
                public final Object mo24105c(T t, @C12579k C11045c<? super C11079d2> cVar) {
                    C11322b0.m43482e(4);
                    new FlowKt__EmittersKt$transform$1$1$emit$1(this, cVar);
                    C11322b0.m43482e(5);
                    qVar.invoke(fVar, t, cVar);
                    return C11079d2.f28267a;
                }

                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(T r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
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
                        kotlin.jvm.functions.q<kotlinx.coroutines.flow.f<? super R>, T, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r6 = r4
                        kotlinx.coroutines.flow.f<R> r2 = r6
                        r0.label = r3
                        java.lang.Object r5 = r6.invoke(r2, r5, r0)
                        if (r5 != r1) goto L_0x0041
                        return r1
                    L_0x0041:
                        kotlin.d2 r5 = kotlin.C11079d2.f28267a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1.C118271.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            };
            this.label = 1;
            if (eVar.collect(r3, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
