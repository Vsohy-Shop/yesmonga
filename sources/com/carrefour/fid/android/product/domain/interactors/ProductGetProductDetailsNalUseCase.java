package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.GetProductDetailsNalUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.product.detail.C38106a;
import com.carrefour.fid.android.domain.models.product.detail.C38110e;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import com.carrefour.fid.android.performance.C38328d;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProductGetProductDetailsNalUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductGetProductDetailsNalUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetProductDetailsNalUseCase\n+ 2 ResultL.kt\ncom/carrefour/fid/android/core/types/ResultL\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n57#2,5:83\n288#3,2:88\n288#3,2:90\n*S KotlinDebug\n*F\n+ 1 ProductGetProductDetailsNalUseCase.kt\ncom/carrefour/fid/android/product/domain/interactors/ProductGetProductDetailsNalUseCase\n*L\n44#1:83,5\n76#1:88,2\n78#1:90,2\n*E\n"})
public final class ProductGetProductDetailsNalUseCase implements GetProductDetailsNalUseCase {
    @C12579k

    /* renamed from: a */
    public final ProductGetProductDetailUseCase f66883a;
    @C12579k

    /* renamed from: b */
    public final C37823k f66884b;
    @C12579k

    /* renamed from: c */
    public final C38328d f66885c;

    @Inject
    public ProductGetProductDetailsNalUseCase(@C12579k ProductGetProductDetailUseCase productGetProductDetailUseCase, @C12579k C37823k kVar, @C12579k C38328d dVar) {
        Intrinsics.checkNotNullParameter(productGetProductDetailUseCase, "productGetProductDetailUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(dVar, "performance");
        this.f66883a = productGetProductDetailUseCase;
        this.f66884b = kVar;
        this.f66885c = dVar;
    }

    /* renamed from: a */
    public final boolean mo79988a(C38110e eVar) {
        if (eVar.mo118720b().size() != 1 || ((OfferDetail) CollectionsKt___CollectionsKt.m40706w2(eVar.mo118720b())).mo118700s() == OfferDetail.ChannelType.HOME_DELIVERY_NAL) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172816invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.GetProductDetailsNalUseCase.Param r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.product.detail.C38106a>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase$invoke$1 r0 = (com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase$invoke$1 r0 = new com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0058
            if (r2 == r5) goto L_0x0046
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase r9 = (com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase) r9
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00e4
        L_0x0035:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003d:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase r9 = (com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase) r9
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00d2
        L_0x0046:
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.interactors.product.GetProductDetailsNalUseCase$Param r9 = (com.carrefour.fid.android.domain.interactors.product.GetProductDetailsNalUseCase.Param) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase r2 = (com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0072
        L_0x0058:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.performance.d r10 = r8.f66885c
            java.lang.String r2 = "get_nal_product"
            r10.mo121195d(r2)
            com.carrefour.fid.android.domain.interactors.service.k r10 = r8.f66884b
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.m172965invokeIoAF18A(r0)
            if (r10 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r2 = r8
        L_0x0072:
            boolean r5 = kotlin.Result.m38709i(r10)
            if (r5 == 0) goto L_0x008e
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Throwable r9 = kotlin.Result.m38705e(r10)
            if (r9 != 0) goto L_0x0085
            java.lang.Throwable r9 = new java.lang.Throwable
            r9.<init>()
        L_0x0085:
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        L_0x008e:
            boolean r5 = kotlin.Result.m38709i(r10)
            if (r5 == 0) goto L_0x0096
            r5 = r6
            goto L_0x0097
        L_0x0096:
            r5 = r10
        L_0x0097:
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            if (r5 != 0) goto L_0x00b1
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Throwable r9 = kotlin.Result.m38705e(r10)
            if (r9 != 0) goto L_0x00a8
            java.lang.Throwable r9 = new java.lang.Throwable
            r9.<init>()
        L_0x00a8:
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        L_0x00b1:
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailUseCase r10 = r2.f66883a
            java.lang.String r9 = r9.mo114971d()
            java.lang.String r5 = com.carrefour.fid.android.shared.extension.C28762j0.m119068a(r5)
            java.lang.String r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r5)
            com.carrefour.fid.android.domain.interactors.product.GetProductDetailUseCase$Param r7 = new com.carrefour.fid.android.domain.interactors.product.GetProductDetailUseCase$Param
            r7.<init>(r5, r9, r6)
            r0.L$0 = r2
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r10 = r10.invoke(r7, r0)
            if (r10 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            r9 = r2
        L_0x00d2:
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.C11907e) r10
            com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase$invoke$productResult$1 r2 = new com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase$invoke$productResult$1
            r2.<init>(r6)
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r10 = kotlinx.coroutines.flow.C11909g.m47498v0(r10, r2, r0)
            if (r10 != r1) goto L_0x00e4
            return r1
        L_0x00e4:
            com.carrefour.fid.android.core.types.a r10 = (com.carrefour.fid.android.core.types.C36371a) r10
            boolean r0 = r10.mo108616c()
            if (r0 == 0) goto L_0x0107
            com.carrefour.fid.android.performance.d r9 = r9.f66885c
            r9.mo121196e()
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Throwable r9 = r10.mo108614a()
            if (r9 != 0) goto L_0x00fe
            java.lang.Throwable r9 = new java.lang.Throwable
            r9.<init>()
        L_0x00fe:
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        L_0x0107:
            boolean r0 = r10 instanceof com.carrefour.fid.android.core.types.C36371a.C36373b
            if (r0 == 0) goto L_0x010c
            goto L_0x011b
        L_0x010c:
            boolean r0 = r10 instanceof com.carrefour.fid.android.core.types.C36371a.C36374c
            if (r0 == 0) goto L_0x0111
            goto L_0x011b
        L_0x0111:
            boolean r0 = r10 instanceof com.carrefour.fid.android.core.types.C36371a.C36375d
            if (r0 == 0) goto L_0x0148
            com.carrefour.fid.android.core.types.a$d r10 = (com.carrefour.fid.android.core.types.C36371a.C36375d) r10
            java.lang.Object r6 = r10.mo108633i()
        L_0x011b:
            com.carrefour.fid.android.domain.models.product.detail.b r6 = (com.carrefour.fid.android.domain.models.product.detail.C38107b) r6
            boolean r10 = r6 instanceof com.carrefour.fid.android.domain.models.product.detail.C38110e
            if (r10 == 0) goto L_0x0133
            com.carrefour.fid.android.performance.d r10 = r9.f66885c
            r10.mo121196e()
            kotlin.Result$a r10 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.product.detail.e r6 = (com.carrefour.fid.android.domain.models.product.detail.C38110e) r6
            com.carrefour.fid.android.domain.models.product.detail.a r9 = r9.mo79991d(r6)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            goto L_0x0147
        L_0x0133:
            com.carrefour.fid.android.performance.d r9 = r9.f66885c
            r9.mo121196e()
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Throwable r9 = new java.lang.Throwable
            r9.<init>()
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
        L_0x0147:
            return r9
        L_0x0148:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase.m172816invokegIAlus(com.carrefour.fid.android.domain.interactors.product.GetProductDetailsNalUseCase$Param, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.carrefour.fid.android.domain.models.product.detail.OfferDetail} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.domain.models.product.detail.OfferDetail mo79990c(com.carrefour.fid.android.domain.models.product.detail.C38110e r9) {
        /*
            r8 = this;
            java.util.List r0 = r9.mo118720b()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            r5 = r1
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r5 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r5
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r6 = r5.mo118700s()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r7 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.HOME_DELIVERY_NAL
            if (r6 == r7) goto L_0x002c
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r5 = com.carrefour.fid.android.product.presentation.models.extensions.C27658b.m116360a(r5)
            com.carrefour.fid.android.product.presentation.models.OfferAvailability r6 = com.carrefour.fid.android.product.presentation.models.OfferAvailability.Available
            if (r5 != r6) goto L_0x002c
            r5 = r2
            goto L_0x002d
        L_0x002c:
            r5 = r3
        L_0x002d:
            if (r5 == 0) goto L_0x000a
            goto L_0x0031
        L_0x0030:
            r1 = r4
        L_0x0031:
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r1 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r1
            if (r1 != 0) goto L_0x006a
            java.util.List r0 = r9.mo118720b()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x003f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            r5 = r1
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r5 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r5
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r5 = r5.mo118700s()
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r6 = com.carrefour.fid.android.domain.models.product.detail.OfferDetail.ChannelType.HOME_DELIVERY_NAL
            if (r5 != r6) goto L_0x0056
            r5 = r2
            goto L_0x0057
        L_0x0056:
            r5 = r3
        L_0x0057:
            if (r5 == 0) goto L_0x003f
            r4 = r1
        L_0x005a:
            r1 = r4
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r1 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r1
            if (r1 != 0) goto L_0x006a
            java.util.List r9 = r9.mo118720b()
            java.lang.Object r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r9)
            r1 = r9
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r1 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r1
        L_0x006a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.ProductGetProductDetailsNalUseCase.mo79990c(com.carrefour.fid.android.domain.models.product.detail.e):com.carrefour.fid.android.domain.models.product.detail.OfferDetail");
    }

    /* renamed from: d */
    public final C38106a mo79991d(C38110e eVar) {
        return new C38106a(eVar, mo79990c(eVar), mo79988a(eVar));
    }
}
