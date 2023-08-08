package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.product.ProductListParam;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$withMarketingElements$$inlined$map$1 */
public final class C27530x100d1a06 implements C11907e<C36328a<C38184v>> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f66844a;

    /* renamed from: b */
    public final /* synthetic */ ProductGetConsolidatedPlpFlowUseCase f66845b;

    /* renamed from: c */
    public final /* synthetic */ ProductListParam f66846c;

    public C27530x100d1a06(C11907e eVar, ProductGetConsolidatedPlpFlowUseCase productGetConsolidatedPlpFlowUseCase, ProductListParam productListParam) {
        this.f66844a = eVar;
        this.f66845b = productGetConsolidatedPlpFlowUseCase;
        this.f66846c = productListParam;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.f66844a;
        final ProductGetConsolidatedPlpFlowUseCase productGetConsolidatedPlpFlowUseCase = this.f66845b;
        final ProductListParam productListParam = this.f66846c;
        Object collect = eVar.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r19, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r20) {
                /*
                    r18 = this;
                    r0 = r18
                    r1 = r20
                    boolean r2 = r1 instanceof com.carrefour.fid.android.product.domain.interactors.C27530x100d1a06.C275312.C275321
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$withMarketingElements$$inlined$map$1$2$1 r2 = (com.carrefour.fid.android.product.domain.interactors.C27530x100d1a06.C275312.C275321) r2
                    int r3 = r2.label
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.label = r3
                    goto L_0x001c
                L_0x0017:
                    com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$withMarketingElements$$inlined$map$1$2$1 r2 = new com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$withMarketingElements$$inlined$map$1$2$1
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.result
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r4 = r2.label
                    r5 = 2
                    r6 = 1
                    if (r4 == 0) goto L_0x004b
                    if (r4 == r6) goto L_0x0039
                    if (r4 != r5) goto L_0x0031
                    kotlin.C11661u0.m45747n(r1)
                    goto L_0x00a3
                L_0x0031:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0039:
                    java.lang.Object r4 = r2.L$1
                    com.carrefour.fid.android.core.paging.a r4 = (com.carrefour.fid.android.core.paging.C36328a) r4
                    java.lang.Object r6 = r2.L$0
                    kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.C11908f) r6
                    kotlin.C11661u0.m45747n(r1)
                    kotlin.Result r1 = (kotlin.Result) r1
                    java.lang.Object r1 = r1.mo21858l()
                    goto L_0x0073
                L_0x004b:
                    kotlin.C11661u0.m45747n(r1)
                    kotlinx.coroutines.flow.f r1 = r5
                    r4 = r19
                    com.carrefour.fid.android.core.paging.a r4 = (com.carrefour.fid.android.core.paging.C36328a) r4
                    com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase r7 = r2
                    com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase r7 = r7.f66833b
                    com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$a r8 = new com.carrefour.fid.android.product.domain.interactors.AddMarketingElementsToPlpUseCase$a
                    com.carrefour.fid.android.domain.models.product.ProductListParam r9 = r3
                    r8.<init>(r4, r9)
                    r2.L$0 = r1
                    r2.L$1 = r4
                    r2.label = r6
                    java.lang.Object r6 = r7.m172814invokegIAlus(r8, r2)
                    if (r6 != r3) goto L_0x006e
                    return r3
                L_0x006e:
                    r17 = r6
                    r6 = r1
                    r1 = r17
                L_0x0073:
                    boolean r7 = kotlin.Result.m38709i(r1)
                    r8 = 0
                    if (r7 == 0) goto L_0x007b
                    r1 = r8
                L_0x007b:
                    java.util.List r1 = (java.util.List) r1
                    if (r1 != 0) goto L_0x0083
                    java.util.List r1 = r4.mo108395h()
                L_0x0083:
                    r10 = r1
                    com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$withMarketingElements$1$1 r1 = com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase$withMarketingElements$1$1.f66852f
                    com.carrefour.fid.android.core.paging.a r9 = com.carrefour.fid.android.shared.paging.C28851c.m119328a(r4, r1)
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 30
                    r16 = 0
                    com.carrefour.fid.android.core.paging.a r1 = com.carrefour.fid.android.core.paging.C36328a.m149051g(r9, r10, r11, r12, r13, r14, r15, r16)
                    r2.L$0 = r8
                    r2.L$1 = r8
                    r2.label = r5
                    java.lang.Object r1 = r6.emit(r1, r2)
                    if (r1 != r3) goto L_0x00a3
                    return r3
                L_0x00a3:
                    kotlin.d2 r1 = kotlin.C11079d2.f28267a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.C27530x100d1a06.C275312.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
