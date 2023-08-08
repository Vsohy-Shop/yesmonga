package com.carrefour.fid.android.product.presentation.viewmodel.list;

import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.product.Facet;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
public final class PlpFlowProvider$getProductFlow$2$invokeSuspend$$inlined$map$1 implements C11907e<C36328a<C38184v>> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f68221a;

    /* renamed from: b */
    public final /* synthetic */ Facet f68222b;

    public PlpFlowProvider$getProductFlow$2$invokeSuspend$$inlined$map$1(C11907e eVar, Facet facet) {
        this.f68221a = eVar;
        this.f68222b = facet;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        C11907e eVar = this.f68221a;
        final Facet facet = this.f68222b;
        Object collect = eVar.collect(new C11908f() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider$getProductFlow$2$invokeSuspend$$inlined$map$1.C281682.C281691
                    if (r0 == 0) goto L_0x0013
                    r0 = r14
                    com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider$getProductFlow$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider$getProductFlow$2$invokeSuspend$$inlined$map$1.C281682.C281691) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider$getProductFlow$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider$getProductFlow$2$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r12, r14)
                L_0x0018:
                    java.lang.Object r14 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r14)
                    goto L_0x007d
                L_0x0029:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L_0x0031:
                    kotlin.C11661u0.m45747n(r14)
                    kotlinx.coroutines.flow.f r14 = r4
                    r4 = r13
                    com.carrefour.fid.android.core.paging.a r4 = (com.carrefour.fid.android.core.paging.C36328a) r4
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    com.carrefour.fid.android.domain.models.product.Facet r13 = r2
                    java.util.List r13 = r13.mo118343h()
                    java.lang.Iterable r13 = (java.lang.Iterable) r13
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r13 = r13.iterator()
                L_0x004d:
                    boolean r8 = r13.hasNext()
                    if (r8 == 0) goto L_0x0064
                    java.lang.Object r8 = r13.next()
                    r9 = r8
                    com.carrefour.fid.android.domain.models.product.Filter r9 = (com.carrefour.fid.android.domain.models.product.Filter) r9
                    boolean r9 = r9.isSelected()
                    if (r9 == 0) goto L_0x004d
                    r2.add(r8)
                    goto L_0x004d
                L_0x0064:
                    int r13 = r2.size()
                    java.lang.Integer r8 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r13)
                    r9 = 0
                    r10 = 23
                    r11 = 0
                    com.carrefour.fid.android.core.paging.a r13 = com.carrefour.fid.android.core.paging.C36328a.m149051g(r4, r5, r6, r7, r8, r9, r10, r11)
                    r0.label = r3
                    java.lang.Object r13 = r14.emit(r13, r0)
                    if (r13 != r1) goto L_0x007d
                    return r1
                L_0x007d:
                    kotlin.d2 r13 = kotlin.C11079d2.f28267a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.list.PlpFlowProvider$getProductFlow$2$invokeSuspend$$inlined$map$1.C281682.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
