package com.carrefour.fid.android.shared.extension;

import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
public final class FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1 implements C11907e<C11079d2> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f70369a;

    /* renamed from: b */
    public final /* synthetic */ C11300l f70370b;

    public FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1(C11907e eVar, C11300l lVar) {
        this.f70369a = eVar;
        this.f70370b = lVar;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.f70369a;
        final C11300l lVar = this.f70370b;
        Object collect = eVar.collect(new C11908f() {
            @C12580l
            /* renamed from: c */
            public final Object mo83689c(Object obj, @C12579k C11045c cVar) {
                C11322b0.m43482e(4);
                new ContinuationImpl(this, cVar) {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C287182 this$0;

                    {
                        this.this$0 = r1;
                    }

                    @C12580l
                    public final Object invokeSuspend(@C12579k Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit((Object) null, this);
                    }
                };
                C11322b0.m43482e(5);
                C11908f fVar = r4;
                r2.invoke((C28505u.C28509d) obj);
                C11079d2 d2Var = C11079d2.f28267a;
                C11322b0.m43482e(0);
                fVar.emit(d2Var, cVar);
                C11322b0.m43482e(1);
                return d2Var;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1.C287182.C287191
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1.C287182.C287191) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r6)
                    goto L_0x0048
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.C11661u0.m45747n(r6)
                    kotlinx.coroutines.flow.f r6 = r4
                    com.carrefour.fid.android.shared.base.u$d r5 = (com.carrefour.fid.android.shared.base.C28505u.C28509d) r5
                    kotlin.jvm.functions.l r2 = r2
                    r2.invoke(r5)
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1.C287182.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: g */
    public Object mo83688g(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11322b0.m43482e(4);
        new ContinuationImpl(this, cVar) {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1 this$0;

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
        C11907e eVar = this.f70369a;
        final C11300l lVar = this.f70370b;
        C287182 r1 = new C11908f() {
            @C12580l
            /* renamed from: c */
            public final Object mo83689c(Object obj, @C12579k C11045c cVar) {
                C11322b0.m43482e(4);
                new ContinuationImpl(this, cVar) {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C287182 this$0;

                    {
                        this.this$0 = r1;
                    }

                    @C12580l
                    public final Object invokeSuspend(@C12579k Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit((Object) null, this);
                    }
                };
                C11322b0.m43482e(5);
                C11908f fVar = fVar;
                lVar.invoke((C28505u.C28509d) obj);
                C11079d2 d2Var = C11079d2.f28267a;
                C11322b0.m43482e(0);
                fVar.emit(d2Var, cVar);
                C11322b0.m43482e(1);
                return d2Var;
            }

            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.C11045c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1.C287182.C287191
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1.C287182.C287191) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r6)
                    goto L_0x0048
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.C11661u0.m45747n(r6)
                    kotlinx.coroutines.flow.f r6 = r4
                    com.carrefour.fid.android.shared.base.u$d r5 = (com.carrefour.fid.android.shared.base.C28505u.C28509d) r5
                    kotlin.jvm.functions.l r2 = r2
                    r2.invoke(r5)
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.extension.FragmentKt$processState$1$1$invokeSuspend$$inlined$map$1.C287182.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        };
        C11322b0.m43482e(0);
        eVar.collect(r1, cVar);
        C11322b0.m43482e(1);
        return C11079d2.f28267a;
    }
}
