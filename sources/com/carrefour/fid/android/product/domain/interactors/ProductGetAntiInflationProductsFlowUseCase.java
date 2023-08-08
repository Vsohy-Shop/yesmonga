package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37753d;
import com.carrefour.fid.android.domain.interactors.product.C37756f;
import com.carrefour.fid.android.domain.interactors.product.C37761i;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ProductGetAntiInflationProductsFlowUseCase implements C37753d {
    @C12579k

    /* renamed from: a */
    public final C37756f f66815a;
    @C12579k

    /* renamed from: b */
    public final C37761i f66816b;
    @C12579k

    /* renamed from: c */
    public final C37823k f66817c;

    /* renamed from: com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$a */
    public static final class C27521a implements C11908f<Result<? extends List<? extends C38114b>>> {

        /* renamed from: a */
        public final /* synthetic */ C11908f<Result<? extends List<C38114b>>> f66818a;

        public C27521a(C11908f<? super Result<? extends List<C38114b>>> fVar) {
            this.f66818a = fVar;
        }

        @C12580l
        public final Object emit(@C12579k Object obj, @C12579k C11045c<? super C11079d2> cVar) {
            Object emit = this.f66818a.emit(obj, cVar);
            return emit == C11063b.m42612h() ? emit : C11079d2.f28267a;
        }
    }

    @Inject
    public ProductGetAntiInflationProductsFlowUseCase(@C12579k C37756f fVar, @C12579k C37761i iVar, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(fVar, "getConsolidatedAlternativeProductsFlowUseCase");
        Intrinsics.checkNotNullParameter(iVar, "getConsolidatedProductFlowUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        this.f66815a = fVar;
        this.f66816b = iVar;
        this.f66817c = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79943c(kotlinx.coroutines.flow.C11908f<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.product.plp.C38114b>>> r10, com.carrefour.fid.android.domain.interactors.product.C37753d.C37754a r11, com.carrefour.fid.android.domain.models.service.models.C38162k r12, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.product.domain.interactors.C27522xdefd7183
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$combineProductsUseCaseFlowsAndEmitResult$1 r0 = (com.carrefour.fid.android.product.domain.interactors.C27522xdefd7183) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$combineProductsUseCaseFlowsAndEmitResult$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$combineProductsUseCaseFlowsAndEmitResult$1
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.C11661u0.m45747n(r13)
            goto L_0x00bb
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0039:
            java.lang.Object r10 = r0.L$1
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.C11907e) r10
            java.lang.Object r11 = r0.L$0
            kotlinx.coroutines.flow.f r11 = (kotlinx.coroutines.flow.C11908f) r11
            kotlin.C11661u0.m45747n(r13)
            goto L_0x009e
        L_0x0045:
            java.lang.Object r10 = r0.L$2
            com.carrefour.fid.android.domain.interactors.product.f$a r10 = (com.carrefour.fid.android.domain.interactors.product.C37756f.C37757a) r10
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.flow.f r11 = (kotlinx.coroutines.flow.C11908f) r11
            java.lang.Object r12 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase r12 = (com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase) r12
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0088
        L_0x0055:
            kotlin.C11661u0.m45747n(r13)
            java.lang.String r13 = r11.mo115013d()
            java.lang.String r2 = com.carrefour.fid.android.shared.extension.C28762j0.m119068a(r12)
            com.carrefour.fid.android.domain.interactors.product.r$a r7 = new com.carrefour.fid.android.domain.interactors.product.r$a
            r7.<init>(r2, r13, r6)
            com.carrefour.fid.android.domain.interactors.product.f$a r13 = new com.carrefour.fid.android.domain.interactors.product.f$a
            java.lang.String r11 = r11.mo115013d()
            java.lang.String r12 = com.carrefour.fid.android.shared.extension.C28762j0.m119068a(r12)
            r13.<init>(r11, r12, r6)
            com.carrefour.fid.android.domain.interactors.product.i r11 = r9.f66816b
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r13
            r0.label = r5
            java.lang.Object r11 = r11.invoke(r7, r0)
            if (r11 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r12 = r9
            r8 = r11
            r11 = r10
            r10 = r13
            r13 = r8
        L_0x0088:
            kotlinx.coroutines.flow.e r13 = (kotlinx.coroutines.flow.C11907e) r13
            com.carrefour.fid.android.domain.interactors.product.f r12 = r12.f66815a
            r0.L$0 = r11
            r0.L$1 = r13
            r0.L$2 = r6
            r0.label = r4
            java.lang.Object r10 = r12.invoke(r10, r0)
            if (r10 != r1) goto L_0x009b
            return r1
        L_0x009b:
            r8 = r13
            r13 = r10
            r10 = r8
        L_0x009e:
            kotlinx.coroutines.flow.e r13 = (kotlinx.coroutines.flow.C11907e) r13
            com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$combineProductsUseCaseFlowsAndEmitResult$2 r12 = new com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$combineProductsUseCaseFlowsAndEmitResult$2
            r12.<init>(r6)
            kotlinx.coroutines.flow.e r10 = kotlinx.coroutines.flow.C11909g.m47357D(r10, r13, r12)
            com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$a r12 = new com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$a
            r12.<init>(r11)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r10 = r10.collect(r12, r0)
            if (r10 != r1) goto L_0x00bb
            return r1
        L_0x00bb:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase.mo79943c(kotlinx.coroutines.flow.f, com.carrefour.fid.android.domain.interactors.product.d$a, com.carrefour.fid.android.domain.models.service.models.k, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: d */
    public Object invoke(@C12579k C37753d.C37754a aVar, @C12579k C11045c<? super C11907e<? extends Result<? extends List<C38114b>>>> cVar) {
        return C11909g.m47376J0(new ProductGetAntiInflationProductsFlowUseCase$invoke$2(this, aVar, (C11045c<? super ProductGetAntiInflationProductsFlowUseCase$invoke$2>) null));
    }
}
