package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.account.C37517c;
import com.carrefour.fid.android.domain.interactors.basket.C37599t;
import com.carrefour.fid.android.domain.interactors.category.C37620b;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
import com.carrefour.fid.android.domain.interactors.service.C37812b;
import com.carrefour.fid.android.domain.interactors.service.C37817f;
import com.carrefour.fid.android.domain.interactors.service.C37818g;
import com.carrefour.fid.android.domain.interactors.service.C37836s;
import com.carrefour.fid.android.domain.interactors.service.C37838t;
import com.carrefour.fid.android.domain.interactors.service.C37841v;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fHBø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/domain/interactors/ServiceSwitchToStandardPromiseUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/t;", "Lcom/carrefour/fid/android/domain/models/service/models/m;", "storeFacility", "Lkotlin/d2;", "switchStandardLadPromise", "(Lcom/carrefour/fid/android/domain/models/service/models/m;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/category/a;", "promise", "switchStandardDrivePromise", "(Lcom/carrefour/fid/android/domain/models/category/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "fsid", "initBasket", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Result;", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetServiceSelectionUseCase;", "getServiceSelectionUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetServiceSelectionUseCase;", "Lcom/carrefour/fid/android/domain/interactors/account/c;", "getCachedUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/account/c;", "Lcom/carrefour/fid/android/domain/interactors/service/b;", "fetchDeliveryStoresUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/b;", "Lcom/carrefour/fid/android/domain/interactors/service/g;", "getPromiseUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/g;", "Lcom/carrefour/fid/android/domain/interactors/category/b;", "getDrivePromiseUseCase", "Lcom/carrefour/fid/android/domain/interactors/category/b;", "Lcom/carrefour/fid/android/domain/interactors/service/f;", "getMirrorDriveServiceUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/f;", "Lcom/carrefour/fid/android/domain/interactors/service/s;", "setServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/s;", "Lcom/carrefour/fid/android/domain/interactors/service/v;", "updateStoreServiceUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/v;", "Lcom/carrefour/fid/android/domain/interactors/basket/t;", "initBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/t;", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "clearServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "<init>", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetServiceSelectionUseCase;Lcom/carrefour/fid/android/domain/interactors/account/c;Lcom/carrefour/fid/android/domain/interactors/service/b;Lcom/carrefour/fid/android/domain/interactors/service/g;Lcom/carrefour/fid/android/domain/interactors/category/b;Lcom/carrefour/fid/android/domain/interactors/service/f;Lcom/carrefour/fid/android/domain/interactors/service/s;Lcom/carrefour/fid/android/domain/interactors/service/v;Lcom/carrefour/fid/android/domain/interactors/basket/t;Lcom/carrefour/fid/android/domain/interactors/service/a;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ServiceSwitchToStandardPromiseUseCase implements C37838t {
    @C12579k
    private final C37811a clearServiceSelectionUseCase;
    @C12579k
    private final C37812b fetchDeliveryStoresUseCase;
    @C12579k
    private final C37517c getCachedUserInfoUseCase;
    @C12579k
    private final C37620b getDrivePromiseUseCase;
    @C12579k
    private final C37817f getMirrorDriveServiceUseCase;
    @C12579k
    private final C37818g getPromiseUseCase;
    @C12579k
    private final ServiceGetServiceSelectionUseCase getServiceSelectionUseCase;
    @C12579k
    private final C37599t initBasketUseCase;
    @C12579k
    private final C37836s setServiceSelectionUseCase;
    @C12579k
    private final C37841v updateStoreServiceUseCase;

    @Inject
    public ServiceSwitchToStandardPromiseUseCase(@C12579k ServiceGetServiceSelectionUseCase serviceGetServiceSelectionUseCase, @C12579k C37517c cVar, @C12579k C37812b bVar, @C12579k C37818g gVar, @C12579k C37620b bVar2, @C12579k C37817f fVar, @C12579k C37836s sVar, @C12579k C37841v vVar, @C12579k C37599t tVar, @C12579k C37811a aVar) {
        Intrinsics.checkNotNullParameter(serviceGetServiceSelectionUseCase, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(cVar, "getCachedUserInfoUseCase");
        Intrinsics.checkNotNullParameter(bVar, "fetchDeliveryStoresUseCase");
        Intrinsics.checkNotNullParameter(gVar, "getPromiseUseCase");
        Intrinsics.checkNotNullParameter(bVar2, "getDrivePromiseUseCase");
        Intrinsics.checkNotNullParameter(fVar, "getMirrorDriveServiceUseCase");
        Intrinsics.checkNotNullParameter(sVar, "setServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(vVar, "updateStoreServiceUseCase");
        Intrinsics.checkNotNullParameter(tVar, "initBasketUseCase");
        Intrinsics.checkNotNullParameter(aVar, "clearServiceSelectionUseCase");
        this.getServiceSelectionUseCase = serviceGetServiceSelectionUseCase;
        this.getCachedUserInfoUseCase = cVar;
        this.fetchDeliveryStoresUseCase = bVar;
        this.getPromiseUseCase = gVar;
        this.getDrivePromiseUseCase = bVar2;
        this.getMirrorDriveServiceUseCase = fVar;
        this.setServiceSelectionUseCase = sVar;
        this.updateStoreServiceUseCase = vVar;
        this.initBasketUseCase = tVar;
        this.clearServiceSelectionUseCase = aVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object initBasket(java.lang.String r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$initBasket$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$initBasket$1 r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$initBasket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$initBasket$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$initBasket$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.basket.t r6 = r4.initBasketUseCase
            java.lang.String r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r5)
            com.carrefour.fid.android.domain.models.service.models.FacilityServiceId r5 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(r5)
            r0.label = r3
            java.lang.Object r5 = r6.m172966invokegIAlus(r5, r0)
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            kotlin.C11661u0.m45747n(r5)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase.initBasket(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object switchStandardDrivePromise(com.carrefour.fid.android.domain.models.category.C37992a r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.service.domain.interactors.C28357xc70930b6
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$switchStandardDrivePromise$1 r0 = (com.carrefour.fid.android.service.domain.interactors.C28357xc70930b6) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$switchStandardDrivePromise$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$switchStandardDrivePromise$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r7 = r0.L$0
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0086
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase r7 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x006b
        L_0x004d:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.models.category.PromiseType r8 = r7.mo117312f()
            com.carrefour.fid.android.domain.models.category.PromiseType r2 = com.carrefour.fid.android.domain.models.category.PromiseType.Standard
            if (r8 != r2) goto L_0x0098
            com.carrefour.fid.android.domain.interactors.service.f r8 = r6.getMirrorDriveServiceUseCase
            java.lang.String r7 = r7.mo117310e()
            r0.L$0 = r6
            r0.label = r4
            r2 = 0
            java.lang.Object r7 = r8.m173004invokeCkRE9Mk(r7, r2, r0)
            if (r7 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r8 = r6
        L_0x006b:
            boolean r2 = kotlin.Result.m38710j(r7)
            if (r2 == 0) goto L_0x0089
            r2 = r7
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r2
            com.carrefour.fid.android.domain.interactors.service.v r8 = r8.updateStoreServiceUseCase
            com.carrefour.fid.android.domain.interactors.service.v$a r4 = new com.carrefour.fid.android.domain.interactors.service.v$a
            r4.<init>(r2)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.m172966invokegIAlus(r4, r0)
            if (r8 != r1) goto L_0x0086
            return r1
        L_0x0086:
            kotlin.C11661u0.m45747n(r8)
        L_0x0089:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 != 0) goto L_0x0090
            goto L_0x0098
        L_0x0090:
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "Error while getting standard service"
            r7.<init>(r8)
            throw r7
        L_0x0098:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase.switchStandardDrivePromise(com.carrefour.fid.android.domain.models.category.a, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object switchStandardLadPromise(com.carrefour.fid.android.domain.models.service.models.C38166m r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$switchStandardLadPromise$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$switchStandardLadPromise$1 r0 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$switchStandardLadPromise$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$switchStandardLadPromise$1 r0 = new com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$switchStandardLadPromise$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x00a1
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase r8 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase) r8
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0062
        L_0x0049:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.service.g r9 = r7.getPromiseUseCase
            com.carrefour.fid.android.domain.interactors.service.g$a r2 = new com.carrefour.fid.android.domain.interactors.service.g$a
            r5 = 0
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Clcv r6 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE
            r2.<init>(r8, r5, r6)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r9 = r9.m172966invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r8 = r7
        L_0x0062:
            boolean r2 = kotlin.Result.m38709i(r9)
            r4 = 0
            if (r2 == 0) goto L_0x006a
            r9 = r4
        L_0x006a:
            com.carrefour.fid.android.domain.models.service.models.k r9 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r9
            if (r9 == 0) goto L_0x00a7
            com.carrefour.fid.android.domain.models.service.models.l r2 = r9.mo119352e()
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = r9.mo119354f()
            if (r2 == 0) goto L_0x0080
            if (r9 == 0) goto L_0x0080
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r2, r9)
            goto L_0x0081
        L_0x0080:
            r5 = r4
        L_0x0081:
            if (r5 == 0) goto L_0x00a7
            com.carrefour.fid.android.domain.interactors.service.s r8 = r8.setServiceSelectionUseCase
            com.carrefour.fid.android.domain.interactors.service.s$a r9 = new com.carrefour.fid.android.domain.interactors.service.s$a
            java.lang.Object r2 = r5.mo21849e()
            com.carrefour.fid.android.domain.models.service.models.l r2 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r2
            java.lang.Object r5 = r5.mo21851f()
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r5
            r9.<init>(r2, r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r8 = r8.m172966invokegIAlus(r9, r0)
            if (r8 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            kotlin.C11661u0.m45747n(r8)
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        L_0x00a7:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "No standard promise found"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase.switchStandardLadPromise(com.carrefour.fid.android.domain.models.service.models.m, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r6 = kotlin.Result.f28060a;
        r0 = (com.carrefour.fid.android.domain.models.category.C37992a) r0;
        r2.L$0 = r4;
        r2.L$1 = r0;
        r2.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d2, code lost:
        if (r4.switchStandardDrivePromise(r0, r2) != r3) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01d4, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d5, code lost:
        r0 = r0.mo117310e();
        r2.L$0 = r4;
        r2.L$1 = null;
        r2.label = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01e5, code lost:
        if (r4.initBasket(r0, r2) != r3) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e7, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e8, code lost:
        r0 = kotlin.Result.m38702b(kotlin.C11079d2.f28267a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01fe, code lost:
        r0 = kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0205, code lost:
        if (r6 != null) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0209, code lost:
        throw com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x020f, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0212, code lost:
        throw com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (kotlin.Result.m38710j(r0) == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r6 = kotlin.Result.f28060a;
        r0 = ((com.carrefour.fid.android.domain.models.service.models.C38162k) r0).mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
        if (r0 == null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ea, code lost:
        r6 = r0.mo119176T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f4, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE) == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fa, code lost:
        if (r0.mo119183a0() != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0102, code lost:
        return kotlin.Result.m38702b(kotlin.C11079d2.f28267a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0103, code lost:
        r6 = r4.getCachedUserInfoUseCase;
        r2.L$0 = r4;
        r2.L$1 = r0;
        r2.label = 2;
        r6 = r6.mo31418a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0110, code lost:
        if (r6 != r3) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0112, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0113, code lost:
        r21 = r6;
        r6 = r0;
        r0 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0118, code lost:
        r0 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011a, code lost:
        if (r0 == null) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011c, code lost:
        r0 = com.carrefour.fid.android.domain.models.account.extension.C37949a.m155956b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0120, code lost:
        if (r0 == null) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0122, code lost:
        r7 = r4.fetchDeliveryStoresUseCase;
        r8 = new com.carrefour.fid.android.domain.interactors.service.C37812b.C37813a(r0.mo116691P(), r0.mo116693R(), true, 0, 0, 0, true, false, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        r2.L$0 = r4;
        r2.L$1 = r6;
        r2.label = 3;
        r0 = r7.m172966invokegIAlus(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014a, code lost:
        if (r0 != r3) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014c, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0151, code lost:
        if (kotlin.Result.m38710j(r0) == false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r7 = kotlin.Result.f28060a;
        r2.L$0 = r4;
        r2.L$1 = r6;
        r2.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0162, code lost:
        if (r4.switchStandardLadPromise((com.carrefour.fid.android.domain.models.service.models.C38166m) r0, r2) != r3) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0164, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0165, code lost:
        r0 = r6.mo119163G();
        r2.L$0 = r4;
        r2.L$1 = null;
        r2.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0174, code lost:
        if (r4.initBasket(r0, r2) != r3) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0176, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0177, code lost:
        r0 = kotlin.Result.m38702b(kotlin.C11079d2.f28267a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0195, code lost:
        throw new java.lang.Exception("No address");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x019c, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) com.carrefour.fid.android.domain.models.service.models.StoreServiceType.H1h3.INSTANCE) == false) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019e, code lost:
        r0 = kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a7, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive.INSTANCE) == false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ad, code lost:
        if (r0.mo119187c0() == false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01af, code lost:
        r0 = r4.getDrivePromiseUseCase;
        r2.L$0 = r4;
        r2.label = 6;
        r0 = r0.m172965invokeIoAF18A(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ba, code lost:
        if (r0 != r3) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01bc, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c1, code lost:
        if (kotlin.Result.m38710j(r0) == false) goto L_0x01f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:82:0x017e=Splitter:B:82:0x017e, B:108:0x01ef=Splitter:B:108:0x01ef} */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172865invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            boolean r2 = r0 instanceof com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$invoke$1 r2 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$invoke$1 r2 = new com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$invoke$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 0
            switch(r4) {
                case 0: goto L_0x00c8;
                case 1: goto L_0x00ba;
                case 2: goto L_0x00a5;
                case 3: goto L_0x008d;
                case 4: goto L_0x0077;
                case 5: goto L_0x006b;
                case 6: goto L_0x0059;
                case 7: goto L_0x0046;
                case 8: goto L_0x003a;
                case 9: goto L_0x0030;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0030:
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            r0.mo21858l()
            goto L_0x0234
        L_0x003a:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase r4 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase) r4
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0043 }
            goto L_0x01e8
        L_0x0043:
            r0 = move-exception
            goto L_0x01ef
        L_0x0046:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.models.category.a r4 = (com.carrefour.fid.android.domain.models.category.C37992a) r4
            java.lang.Object r6 = r2.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase r6 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase) r6
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0055 }
            r0 = r4
            r4 = r6
            goto L_0x01d5
        L_0x0055:
            r0 = move-exception
            r4 = r6
            goto L_0x01ef
        L_0x0059:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase r4 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase) r4
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0068 }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x0068 }
            goto L_0x01bd
        L_0x0068:
            r0 = move-exception
            goto L_0x0213
        L_0x006b:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase r4 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase) r4
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0074 }
            goto L_0x0177
        L_0x0074:
            r0 = move-exception
            goto L_0x017e
        L_0x0077:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreService r4 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r4
            java.lang.Object r6 = r2.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase r6 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase) r6
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0089 }
            r21 = r6
            r6 = r4
            r4 = r21
            goto L_0x0165
        L_0x0089:
            r0 = move-exception
            r4 = r6
            goto L_0x017e
        L_0x008d:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreService r4 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r4
            java.lang.Object r6 = r2.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase r6 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase) r6
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x00b6 }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x00b6 }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x00b6 }
            r21 = r6
            r6 = r4
            r4 = r21
            goto L_0x014d
        L_0x00a5:
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreService r4 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r4
            java.lang.Object r6 = r2.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase r6 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase) r6
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x00b6 }
            r21 = r6
            r6 = r4
            r4 = r21
            goto L_0x0118
        L_0x00b6:
            r0 = move-exception
            r4 = r6
            goto L_0x0213
        L_0x00ba:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase r4 = (com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase) r4
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x00da
        L_0x00c8:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.service.domain.interactors.ServiceGetServiceSelectionUseCase r0 = r1.getServiceSelectionUseCase
            r2.L$0 = r1
            r4 = 1
            r2.label = r4
            java.lang.Object r0 = r0.m172855invokeIoAF18A(r2)
            if (r0 != r3) goto L_0x00d9
            return r3
        L_0x00d9:
            r4 = r1
        L_0x00da:
            boolean r6 = kotlin.Result.m38710j(r0)
            if (r6 == 0) goto L_0x0219
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0068 }
            com.carrefour.fid.android.domain.models.service.models.k r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0     // Catch:{ all -> 0x0068 }
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r0.mo119354f()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0210
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r6 = r0.mo119176T()     // Catch:{ all -> 0x0068 }
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Clcv r7 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE     // Catch:{ all -> 0x0068 }
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0196
            boolean r6 = r0.mo119183a0()     // Catch:{ all -> 0x0068 }
            if (r6 != 0) goto L_0x0103
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0068 }
            return r0
        L_0x0103:
            com.carrefour.fid.android.domain.interactors.account.c r6 = r4.getCachedUserInfoUseCase     // Catch:{ all -> 0x0068 }
            r2.L$0 = r4     // Catch:{ all -> 0x0068 }
            r2.L$1 = r0     // Catch:{ all -> 0x0068 }
            r7 = 2
            r2.label = r7     // Catch:{ all -> 0x0068 }
            java.lang.Object r6 = r6.mo31418a(r2)     // Catch:{ all -> 0x0068 }
            if (r6 != r3) goto L_0x0113
            return r3
        L_0x0113:
            r21 = r6
            r6 = r0
            r0 = r21
        L_0x0118:
            com.carrefour.fid.android.domain.models.account.AccountInfo r0 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r0     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x018e
            com.carrefour.fid.android.domain.models.account.Address r0 = com.carrefour.fid.android.domain.models.account.extension.C37949a.m155956b(r0)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x018e
            com.carrefour.fid.android.domain.interactors.service.b r7 = r4.fetchDeliveryStoresUseCase     // Catch:{ all -> 0x0068 }
            double r9 = r0.mo116691P()     // Catch:{ all -> 0x0068 }
            double r11 = r0.mo116693R()     // Catch:{ all -> 0x0068 }
            com.carrefour.fid.android.domain.interactors.service.b$a r0 = new com.carrefour.fid.android.domain.interactors.service.b$a     // Catch:{ all -> 0x0068 }
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
            r19 = 56
            r20 = 0
            r8 = r0
            r8.<init>(r9, r11, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0068 }
            r2.L$0 = r4     // Catch:{ all -> 0x0068 }
            r2.L$1 = r6     // Catch:{ all -> 0x0068 }
            r8 = 3
            r2.label = r8     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = r7.m172966invokegIAlus(r0, r2)     // Catch:{ all -> 0x0068 }
            if (r0 != r3) goto L_0x014d
            return r3
        L_0x014d:
            boolean r7 = kotlin.Result.m38710j(r0)     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0184
            kotlin.Result$a r7 = kotlin.Result.f28060a     // Catch:{ all -> 0x0074 }
            com.carrefour.fid.android.domain.models.service.models.m r0 = (com.carrefour.fid.android.domain.models.service.models.C38166m) r0     // Catch:{ all -> 0x0074 }
            r2.L$0 = r4     // Catch:{ all -> 0x0074 }
            r2.L$1 = r6     // Catch:{ all -> 0x0074 }
            r7 = 4
            r2.label = r7     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r4.switchStandardLadPromise(r0, r2)     // Catch:{ all -> 0x0074 }
            if (r0 != r3) goto L_0x0165
            return r3
        L_0x0165:
            java.lang.String r0 = r6.mo119163G()     // Catch:{ all -> 0x0074 }
            r2.L$0 = r4     // Catch:{ all -> 0x0074 }
            r2.L$1 = r5     // Catch:{ all -> 0x0074 }
            r6 = 5
            r2.label = r6     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r4.initBasket(r0, r2)     // Catch:{ all -> 0x0074 }
            if (r0 != r3) goto L_0x0177
            return r3
        L_0x0177:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0074 }
            goto L_0x0188
        L_0x017e:
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x0068 }
        L_0x0184:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0068 }
        L_0x0188:
            kotlin.Result r0 = kotlin.Result.m38701a(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x0200
        L_0x018e:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x0068 }
            java.lang.String r6 = "No address"
            r0.<init>(r6)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0196:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$H1h3 r7 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.H1h3.INSTANCE     // Catch:{ all -> 0x0068 }
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x01a1
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0068 }
            goto L_0x0200
        L_0x01a1:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Drive r7 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive.INSTANCE     // Catch:{ all -> 0x0068 }
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0205
            boolean r0 = r0.mo119187c0()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x01fe
            com.carrefour.fid.android.domain.interactors.category.b r0 = r4.getDrivePromiseUseCase     // Catch:{ all -> 0x0068 }
            r2.L$0 = r4     // Catch:{ all -> 0x0068 }
            r6 = 6
            r2.label = r6     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = r0.m172965invokeIoAF18A(r2)     // Catch:{ all -> 0x0068 }
            if (r0 != r3) goto L_0x01bd
            return r3
        L_0x01bd:
            boolean r6 = kotlin.Result.m38710j(r0)     // Catch:{ all -> 0x0068 }
            if (r6 == 0) goto L_0x01f5
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0043 }
            com.carrefour.fid.android.domain.models.category.a r0 = (com.carrefour.fid.android.domain.models.category.C37992a) r0     // Catch:{ all -> 0x0043 }
            r2.L$0 = r4     // Catch:{ all -> 0x0043 }
            r2.L$1 = r0     // Catch:{ all -> 0x0043 }
            r6 = 7
            r2.label = r6     // Catch:{ all -> 0x0043 }
            java.lang.Object r6 = r4.switchStandardDrivePromise(r0, r2)     // Catch:{ all -> 0x0043 }
            if (r6 != r3) goto L_0x01d5
            return r3
        L_0x01d5:
            java.lang.String r0 = r0.mo117310e()     // Catch:{ all -> 0x0043 }
            r2.L$0 = r4     // Catch:{ all -> 0x0043 }
            r2.L$1 = r5     // Catch:{ all -> 0x0043 }
            r6 = 8
            r2.label = r6     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r4.initBasket(r0, r2)     // Catch:{ all -> 0x0043 }
            if (r0 != r3) goto L_0x01e8
            return r3
        L_0x01e8:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0043 }
            goto L_0x01f9
        L_0x01ef:
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x0068 }
        L_0x01f5:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0068 }
        L_0x01f9:
            kotlin.Result r0 = kotlin.Result.m38701a(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x0200
        L_0x01fe:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0068 }
        L_0x0200:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x021d
        L_0x0205:
            if (r6 != 0) goto L_0x020a
            com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable r0 = com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x020a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0068 }
            r0.<init>()     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0210:
            com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable r0 = com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0213:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
        L_0x0219:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x021d:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r0)
            if (r6 == 0) goto L_0x0234
            com.carrefour.fid.android.domain.interactors.service.a r4 = r4.clearServiceSelectionUseCase
            r2.L$0 = r0
            r2.L$1 = r5
            r0 = 9
            r2.label = r0
            java.lang.Object r0 = r4.m172965invokeIoAF18A(r2)
            if (r0 != r3) goto L_0x0234
            return r3
        L_0x0234:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase.m172865invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
