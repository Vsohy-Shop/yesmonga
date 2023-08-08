package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$$inlined$map$1 */
public final class C27527x2295cc47 implements C11907e<C36328a<C38114b>> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f66838a;

    /* renamed from: b */
    public final /* synthetic */ boolean f66839b;

    /* renamed from: c */
    public final /* synthetic */ boolean f66840c;

    public C27527x2295cc47(C11907e eVar, boolean z, boolean z2) {
        this.f66838a = eVar;
        this.f66839b = z;
        this.f66840c = z2;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.f66838a;
        final boolean z = this.f66839b;
        final boolean z2 = this.f66840c;
        Object collect = eVar.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.carrefour.fid.android.product.domain.interactors.C27527x2295cc47.C275282.C275291
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.product.domain.interactors.C27527x2295cc47.C275282.C275291) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r8)
                    goto L_0x004e
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    kotlin.C11661u0.m45747n(r8)
                    kotlinx.coroutines.flow.f r8 = r5
                    com.carrefour.fid.android.core.paging.a r7 = (com.carrefour.fid.android.core.paging.C36328a) r7
                    com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$2$1 r2 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$2$1
                    boolean r4 = r2
                    boolean r5 = r3
                    r2.<init>(r4, r5)
                    com.carrefour.fid.android.core.paging.a r7 = com.carrefour.fid.android.shared.paging.C28851c.m119328a(r7, r2)
                    r0.label = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x004e
                    return r1
                L_0x004e:
                    kotlin.d2 r7 = kotlin.C11079d2.f28267a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.C27527x2295cc47.C275282.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
