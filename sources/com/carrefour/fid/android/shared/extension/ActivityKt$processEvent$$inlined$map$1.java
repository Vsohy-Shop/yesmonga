package com.carrefour.fid.android.shared.extension;

import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
public final class ActivityKt$processEvent$$inlined$map$1 implements C11907e<C11079d2> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f70311a;

    /* renamed from: b */
    public final /* synthetic */ C11300l f70312b;

    public ActivityKt$processEvent$$inlined$map$1(C11907e eVar, C11300l lVar) {
        this.f70311a = eVar;
        this.f70312b = lVar;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.f70311a;
        Intrinsics.needClassReification();
        final C11300l lVar = this.f70312b;
        Object collect = eVar.collect(new C11908f() {
            @C12580l
            /* renamed from: c */
            public final Object mo83644c(Object obj, @C12579k C11045c cVar) {
                C11322b0.m43482e(4);
                new ContinuationImpl(this, cVar) {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C286952 this$0;

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
                C11300l lVar = r2;
                Intrinsics.reifiedOperationMarker(1, "E");
                lVar.invoke((C28505u.C28506a) obj);
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
            public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.carrefour.fid.android.shared.extension.ActivityKt$processEvent$$inlined$map$1.C286952.C286961
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.carrefour.fid.android.shared.extension.ActivityKt$processEvent$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.shared.extension.ActivityKt$processEvent$$inlined$map$1.C286952.C286961) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.shared.extension.ActivityKt$processEvent$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.shared.extension.ActivityKt$processEvent$$inlined$map$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r7)
                    goto L_0x004d
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    kotlin.C11661u0.m45747n(r7)
                    kotlinx.coroutines.flow.f r7 = r4
                    com.carrefour.fid.android.shared.base.u$a r6 = (com.carrefour.fid.android.shared.base.C28505u.C28506a) r6
                    kotlin.jvm.functions.l r2 = r2
                    java.lang.String r4 = "E"
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r3, r4)
                    r2.invoke(r6)
                    kotlin.d2 r6 = kotlin.C11079d2.f28267a
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    kotlin.d2 r6 = kotlin.C11079d2.f28267a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.extension.ActivityKt$processEvent$$inlined$map$1.C286952.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: g */
    public Object mo83643g(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11322b0.m43482e(4);
        new ContinuationImpl(this, cVar) {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ ActivityKt$processEvent$$inlined$map$1 this$0;

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
        C11907e eVar = this.f70311a;
        Intrinsics.needClassReification();
        final C11300l lVar = this.f70312b;
        C286952 r1 = new C11908f() {
            @C12580l
            /* renamed from: c */
            public final Object mo83644c(Object obj, @C12579k C11045c cVar) {
                C11322b0.m43482e(4);
                new ContinuationImpl(this, cVar) {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C286952 this$0;

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
                C11300l lVar = lVar;
                Intrinsics.reifiedOperationMarker(1, "E");
                lVar.invoke((C28505u.C28506a) obj);
                C11079d2 d2Var = C11079d2.f28267a;
                C11322b0.m43482e(0);
                fVar.emit(d2Var, cVar);
                C11322b0.m43482e(1);
                return d2Var;
            }

            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.C11045c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.carrefour.fid.android.shared.extension.ActivityKt$processEvent$$inlined$map$1.C286952.C286961
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    com.carrefour.fid.android.shared.extension.ActivityKt$processEvent$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.shared.extension.ActivityKt$processEvent$$inlined$map$1.C286952.C286961) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.shared.extension.ActivityKt$processEvent$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.shared.extension.ActivityKt$processEvent$$inlined$map$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r7)
                    goto L_0x004d
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    kotlin.C11661u0.m45747n(r7)
                    kotlinx.coroutines.flow.f r7 = r4
                    com.carrefour.fid.android.shared.base.u$a r6 = (com.carrefour.fid.android.shared.base.C28505u.C28506a) r6
                    kotlin.jvm.functions.l r2 = r2
                    java.lang.String r4 = "E"
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r3, r4)
                    r2.invoke(r6)
                    kotlin.d2 r6 = kotlin.C11079d2.f28267a
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    kotlin.d2 r6 = kotlin.C11079d2.f28267a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.extension.ActivityKt$processEvent$$inlined$map$1.C286952.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        };
        C11322b0.m43482e(0);
        eVar.collect(r1, cVar);
        C11322b0.m43482e(1);
        return C11079d2.f28267a;
    }
}
