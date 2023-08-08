package com.carrefour.fid.android.domain.interactors.checkout;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37836s;
import com.carrefour.fid.android.domain.interactors.service.C37841v;
import com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutCheckDeliveryEligibilityUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutCheckDeliveryEligibilityUseCase.kt\ncom/carrefour/fid/android/domain/interactors/checkout/CheckoutCheckDeliveryEligibilityUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n288#2,2:88\n*S KotlinDebug\n*F\n+ 1 CheckoutCheckDeliveryEligibilityUseCase.kt\ncom/carrefour/fid/android/domain/interactors/checkout/CheckoutCheckDeliveryEligibilityUseCase\n*L\n50#1:88,2\n*E\n"})
public final class CheckoutCheckDeliveryEligibilityUseCase implements C37679f<String, C11079d2> {

    /* renamed from: f */
    public static final int f94367f = 8;
    @C12579k

    /* renamed from: a */
    public final CheckStoreEligibilityUseCase f94368a;
    @C12579k

    /* renamed from: b */
    public final C37841v f94369b;
    @C12579k

    /* renamed from: c */
    public final C37816e f94370c;
    @C12579k

    /* renamed from: d */
    public final C37836s f94371d;
    @C12579k

    /* renamed from: e */
    public final C37578j0 f94372e;

    @Inject
    public CheckoutCheckDeliveryEligibilityUseCase(@C12579k CheckStoreEligibilityUseCase checkStoreEligibilityUseCase, @C12579k C37841v vVar, @C12579k C37816e eVar, @C12579k C37836s sVar, @C12579k C37578j0 j0Var) {
        Intrinsics.checkNotNullParameter(checkStoreEligibilityUseCase, "checkStoreEligibilityUseCase");
        Intrinsics.checkNotNullParameter(vVar, "updateStoreServiceUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getFacilityDetailsByAnabelKeyUseCase");
        Intrinsics.checkNotNullParameter(sVar, "setServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(j0Var, "switchFacilityServiceInBasketUseCase");
        this.f94368a = checkStoreEligibilityUseCase;
        this.f94369b = vVar;
        this.f94370c = eVar;
        this.f94371d = sVar;
        this.f94372e = j0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0203  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172944invokegIAlus(@org.jetbrains.annotations.C12580l java.lang.String r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase$invoke$1 r2 = (com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase$invoke$1 r2 = new com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L_0x0092
            if (r4 == r9) goto L_0x0080
            if (r4 == r8) goto L_0x0073
            if (r4 == r7) goto L_0x005e
            if (r4 == r6) goto L_0x004b
            if (r4 != r5) goto L_0x0043
            java.lang.Object r2 = r2.L$0
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x01fd
        L_0x0043:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004b:
            java.lang.Object r4 = r2.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r2.L$0
            com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase r6 = (com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase) r6
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x01d8
        L_0x005e:
            java.lang.Object r4 = r2.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r2.L$1
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase r8 = (com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase) r8
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0191
        L_0x0073:
            java.lang.Object r2 = r2.L$0
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x013e
        L_0x0080:
            java.lang.Object r4 = r2.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r11 = r2.L$0
            com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase r11 = (com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase) r11
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00a7
        L_0x0092:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase r1 = r0.f94368a
            r2.L$0 = r0
            r4 = r18
            r2.L$1 = r4
            r2.label = r9
            java.lang.Object r1 = r1.m173011invokeIoAF18A(r2)
            if (r1 != r3) goto L_0x00a6
            return r3
        L_0x00a6:
            r11 = r0
        L_0x00a7:
            boolean r12 = kotlin.Result.m38710j(r1)
            if (r12 == 0) goto L_0x0273
            r12 = r1
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffEligibilityDataResponseData r12 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffEligibilityDataResponseData) r12
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffEligibility r13 = r12.getEligibility()
            if (r13 != 0) goto L_0x00c6
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable r1 = new com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x00c6:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffEligibility r13 = r12.getEligibility()
            if (r13 == 0) goto L_0x00d7
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFallback r13 = r13.getFallback()
            if (r13 == 0) goto L_0x00d7
            java.lang.String r13 = r13.getFacilityServiceId()
            goto L_0x00d8
        L_0x00d7:
            r13 = r10
        L_0x00d8:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffEligibility r14 = r12.getEligibility()
            if (r14 == 0) goto L_0x00eb
            java.lang.Boolean r14 = r14.getEligibility()
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r9)
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r15)
            goto L_0x00ec
        L_0x00eb:
            r14 = 0
        L_0x00ec:
            if (r14 == 0) goto L_0x00f7
            kotlin.Result$a r1 = kotlin.Result.f28060a
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x00f7:
            if (r13 == 0) goto L_0x0101
            boolean r14 = kotlin.text.C11622t.isBlank(r13)
            if (r14 == 0) goto L_0x0100
            goto L_0x0101
        L_0x0100:
            r9 = 0
        L_0x0101:
            if (r9 != 0) goto L_0x0263
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffEligibilityStore r9 = r12.getEligibilityStore()
            if (r9 == 0) goto L_0x0114
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonDetailedFacility r9 = r9.getDetailedFacilityService()
            if (r9 == 0) goto L_0x0114
            com.carrefour.fid.android.domain.models.service.models.StoreService r9 = com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.toDomain((com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonDetailedFacility) r9)
            goto L_0x0115
        L_0x0114:
            r9 = r10
        L_0x0115:
            if (r9 == 0) goto L_0x0168
            java.lang.String r12 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r13)
            java.lang.String r12 = com.carrefour.fid.android.shared.extension.C28789y.m119118a(r12)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r12)
            if (r4 == 0) goto L_0x0168
            com.carrefour.fid.android.domain.interactors.service.v r4 = r11.f94369b
            com.carrefour.fid.android.domain.interactors.service.v$a r5 = new com.carrefour.fid.android.domain.interactors.service.v$a
            r5.<init>(r9)
            r2.L$0 = r1
            r2.L$1 = r10
            r2.label = r8
            java.lang.Object r2 = r4.m172966invokegIAlus(r5, r2)
            if (r2 != r3) goto L_0x0139
            return r3
        L_0x0139:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x013e:
            boolean r3 = kotlin.Result.m38710j(r1)
            if (r3 == 0) goto L_0x014f
            com.carrefour.fid.android.domain.models.service.models.k r1 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r1
            kotlin.Result$a r1 = kotlin.Result.f28060a
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x014f:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x0165
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x0165:
            r1 = r2
            goto L_0x0273
        L_0x0168:
            com.carrefour.fid.android.domain.interactors.service.e r4 = r11.f94370c
            java.lang.String r8 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r13)
            java.lang.String r8 = com.carrefour.fid.android.shared.extension.C28789y.m119118a(r8)
            if (r8 != 0) goto L_0x0176
            java.lang.String r8 = ""
        L_0x0176:
            java.lang.String r8 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158072b(r8)
            com.carrefour.fid.android.domain.models.service.models.a r8 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158071a(r8)
            r2.L$0 = r11
            r2.L$1 = r1
            r2.L$2 = r13
            r2.label = r7
            java.lang.Object r4 = r4.m172966invokegIAlus(r8, r2)
            if (r4 != r3) goto L_0x018d
            return r3
        L_0x018d:
            r7 = r1
            r1 = r4
            r8 = r11
            r4 = r13
        L_0x0191:
            boolean r9 = kotlin.Result.m38710j(r1)
            if (r9 == 0) goto L_0x024b
            r9 = r1
            com.carrefour.fid.android.domain.models.service.models.l r9 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r9
            java.util.List r11 = r9.mo119367K()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x01a4:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01bc
            java.lang.Object r12 = r11.next()
            r13 = r12
            com.carrefour.fid.android.domain.models.service.models.StoreService r13 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r13
            java.lang.String r13 = r13.mo119163G()
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r4)
            if (r13 == 0) goto L_0x01a4
            goto L_0x01bd
        L_0x01bc:
            r12 = r10
        L_0x01bd:
            com.carrefour.fid.android.domain.models.service.models.StoreService r12 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r12
            if (r12 == 0) goto L_0x024b
            com.carrefour.fid.android.domain.interactors.service.s r1 = r8.f94371d
            com.carrefour.fid.android.domain.interactors.service.s$a r7 = new com.carrefour.fid.android.domain.interactors.service.s$a
            r7.<init>(r9, r12)
            r2.L$0 = r8
            r2.L$1 = r4
            r2.L$2 = r10
            r2.label = r6
            java.lang.Object r1 = r1.m172966invokegIAlus(r7, r2)
            if (r1 != r3) goto L_0x01d7
            return r3
        L_0x01d7:
            r6 = r8
        L_0x01d8:
            boolean r7 = kotlin.Result.m38710j(r1)
            if (r7 == 0) goto L_0x0225
            r7 = r1
            kotlin.d2 r7 = (kotlin.C11079d2) r7
            com.carrefour.fid.android.domain.interactors.basket.j0 r6 = r6.f94372e
            java.lang.String r4 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r4)
            com.carrefour.fid.android.domain.models.service.models.FacilityServiceId r4 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(r4)
            r2.L$0 = r1
            r2.L$1 = r10
            r2.label = r5
            java.lang.Object r2 = r6.m172966invokegIAlus(r4, r2)
            if (r2 != r3) goto L_0x01f8
            return r3
        L_0x01f8:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x01fd:
            boolean r3 = kotlin.Result.m38710j(r1)
            if (r3 == 0) goto L_0x020e
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            kotlin.Result$a r1 = kotlin.Result.f28060a
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x020e:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x0224
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable r1 = new com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x0224:
            r1 = r2
        L_0x0225:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x023b
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x023b:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable r1 = new com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x024b:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x0261
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable r1 = new com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x0261:
            r1 = r7
            goto L_0x0273
        L_0x0263:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable r1 = new com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        L_0x0273:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x0298
            boolean r2 = r1 instanceof com.carrefour.fid.android.shared.p046io.AddressNotAvailableThrowable
            if (r2 == 0) goto L_0x028d
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable r1 = new com.carrefour.fid.android.core.io.CheckStoreEligibilityThrowable
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            goto L_0x0297
        L_0x028d:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
        L_0x0297:
            return r1
        L_0x0298:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.Object r1 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.checkout.CheckoutCheckDeliveryEligibilityUseCase.m172944invokegIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
