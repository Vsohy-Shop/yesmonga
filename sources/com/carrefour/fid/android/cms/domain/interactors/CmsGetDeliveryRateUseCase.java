package com.carrefour.fid.android.cms.domain.interactors;

import com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository;
import com.carrefour.fid.android.domain.interactors.user.GetDeliveryRateUseCase;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/interactors/CmsGetDeliveryRateUseCase;", "Lcom/carrefour/fid/android/domain/interactors/user/GetDeliveryRateUseCase;", "Lcom/carrefour/fid/android/domain/interactors/user/GetDeliveryRateUseCase$a;", "param", "Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/h;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/domain/interactors/user/GetDeliveryRateUseCase$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/cms/domain/repositories/DeliveryRateRepository;", "repository", "Lcom/carrefour/fid/android/cms/domain/repositories/DeliveryRateRepository;", "<init>", "(Lcom/carrefour/fid/android/cms/domain/repositories/DeliveryRateRepository;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class CmsGetDeliveryRateUseCase implements GetDeliveryRateUseCase {
    @C12579k
    private final DeliveryRateRepository repository;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.domain.interactors.user.GetDeliveryRateUseCase$DeliveryType[] r0 = com.carrefour.fid.android.domain.interactors.user.GetDeliveryRateUseCase.DeliveryType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.interactors.user.GetDeliveryRateUseCase$DeliveryType r1 = com.carrefour.fid.android.domain.interactors.user.GetDeliveryRateUseCase.DeliveryType.Clcv     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.interactors.user.GetDeliveryRateUseCase$DeliveryType r1 = com.carrefour.fid.android.domain.interactors.user.GetDeliveryRateUseCase.DeliveryType.H1h3     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.interactors.CmsGetDeliveryRateUseCase.WhenMappings.<clinit>():void");
        }
    }

    @Inject
    public CmsGetDeliveryRateUseCase(@C12579k DeliveryRateRepository deliveryRateRepository) {
        Intrinsics.checkNotNullParameter(deliveryRateRepository, "repository");
        this.repository = deliveryRateRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173119invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.user.GetDeliveryRateUseCase.C37872a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<? extends com.carrefour.fid.android.domain.models.C38038h>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.cms.domain.interactors.CmsGetDeliveryRateUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.cms.domain.interactors.CmsGetDeliveryRateUseCase$invoke$1 r0 = (com.carrefour.fid.android.cms.domain.interactors.CmsGetDeliveryRateUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.interactors.CmsGetDeliveryRateUseCase$invoke$1 r0 = new com.carrefour.fid.android.cms.domain.interactors.CmsGetDeliveryRateUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0056
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            kotlin.C11661u0.m45747n(r7)
            goto L_0x006a
        L_0x0038:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.user.GetDeliveryRateUseCase$DeliveryType r6 = r6.mo115353d()
            int[] r7 = com.carrefour.fid.android.cms.domain.interactors.CmsGetDeliveryRateUseCase.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r7[r6]
            if (r6 == r4) goto L_0x005f
            if (r6 != r3) goto L_0x0059
            com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository r6 = r5.repository
            r0.label = r3
            java.lang.Object r7 = r6.fetchH1h3DeliveryRate(r0)
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x0056:
            java.util.List r7 = (java.util.List) r7
            goto L_0x006c
        L_0x0059:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x005f:
            com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository r6 = r5.repository
            r0.label = r4
            java.lang.Object r7 = r6.fetchClcvDeliveryRate(r0)
            if (r7 != r1) goto L_0x006a
            return r1
        L_0x006a:
            java.util.List r7 = (java.util.List) r7
        L_0x006c:
            if (r7 == 0) goto L_0x0075
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
            goto L_0x0086
        L_0x0075:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r7 = "Error while fetching delivery rate"
            r6.<init>(r7)
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0086:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.interactors.CmsGetDeliveryRateUseCase.m173119invokegIAlus(com.carrefour.fid.android.domain.interactors.user.GetDeliveryRateUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
