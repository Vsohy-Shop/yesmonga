package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.loyalty.C37696a;
import com.carrefour.fid.android.domain.interactors.loyalty.C37700d;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityGetCardFidAndBalanceNonFoodUseCase;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/a;", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/loyalty/a;", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/domain/interactors/loyalty/d;", "hasCardFidUseCase", "Lcom/carrefour/fid/android/domain/interactors/loyalty/d;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyCardNumberFromPreferencesUseCase;", "getLoyaltyCardNumberFromPreferencesUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyCardNumberFromPreferencesUseCase;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "getLoyaltyBalanceUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "getFacilityDetailsByAnabelKeyUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/loyalty/d;Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyCardNumberFromPreferencesUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;Lcom/carrefour/fid/android/domain/interactors/service/e;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFidelityGetCardFidAndBalanceNonFoodUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FidelityGetCardFidAndBalanceNonFoodUseCase.kt\ncom/carrefour/fid/android/loyalty/domain/interactors/FidelityGetCardFidAndBalanceNonFoodUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
public final class FidelityGetCardFidAndBalanceNonFoodUseCase implements C37696a {
    @C12579k
    private final C37816e getFacilityDetailsByAnabelKeyUseCase;
    @C12579k
    private final GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase;
    @C12579k
    private final GetLoyaltyCardNumberFromPreferencesUseCase getLoyaltyCardNumberFromPreferencesUseCase;
    @C12579k
    private final C37700d hasCardFidUseCase;

    @Inject
    public FidelityGetCardFidAndBalanceNonFoodUseCase(@C12579k C37700d dVar, @C12579k GetLoyaltyCardNumberFromPreferencesUseCase getLoyaltyCardNumberFromPreferencesUseCase2, @C12579k GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase2, @C12579k C37816e eVar) {
        Intrinsics.checkNotNullParameter(dVar, "hasCardFidUseCase");
        Intrinsics.checkNotNullParameter(getLoyaltyCardNumberFromPreferencesUseCase2, "getLoyaltyCardNumberFromPreferencesUseCase");
        Intrinsics.checkNotNullParameter(getLoyaltyBalanceUseCase2, "getLoyaltyBalanceUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getFacilityDetailsByAnabelKeyUseCase");
        this.hasCardFidUseCase = dVar;
        this.getLoyaltyCardNumberFromPreferencesUseCase = getLoyaltyCardNumberFromPreferencesUseCase2;
        this.getLoyaltyBalanceUseCase = getLoyaltyBalanceUseCase2;
        this.getFacilityDetailsByAnabelKeyUseCase = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0101 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173036invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.loyalty.C38044a>> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase$invoke$1
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0082
            if (r2 == r7) goto L_0x0074
            if (r2 == r6) goto L_0x0062
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            int r1 = r0.I$0
            boolean r2 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x0106
        L_0x0042:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x004a:
            boolean r2 = r0.Z$0
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase r6 = (com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase) r6
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            r10 = r5
            r5 = r2
            r2 = r10
            goto L_0x00d8
        L_0x0062:
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase r6 = (com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase) r6
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x00ae
        L_0x0074:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase r2 = (com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase) r2
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x0093
        L_0x0082:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyCardNumberFromPreferencesUseCase r12 = r11.getLoyaltyCardNumberFromPreferencesUseCase
            r0.L$0 = r11
            r0.label = r7
            java.lang.Object r12 = r12.m173042invokeIoAF18A(r0)
            if (r12 != r1) goto L_0x0092
            return r1
        L_0x0092:
            r2 = r11
        L_0x0093:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r12)
            if (r8 != 0) goto L_0x013d
            java.lang.String r12 = (java.lang.String) r12
            com.carrefour.fid.android.domain.interactors.loyalty.d r8 = r2.hasCardFidUseCase
            r0.L$0 = r2
            r0.L$1 = r12
            r0.label = r6
            java.lang.Object r6 = r8.m172965invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            r10 = r2
            r2 = r12
            r12 = r6
            r6 = r10
        L_0x00ae:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r12)
            if (r8 != 0) goto L_0x0132
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            com.carrefour.fid.android.domain.interactors.service.e r8 = r6.getFacilityDetailsByAnabelKeyUseCase
            java.lang.String r9 = "A1QD"
            java.lang.String r9 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158072b(r9)
            com.carrefour.fid.android.domain.models.service.models.a r9 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158071a(r9)
            r0.L$0 = r6
            r0.L$1 = r2
            r0.Z$0 = r12
            r0.label = r5
            java.lang.Object r5 = r8.m172966invokegIAlus(r9, r0)
            if (r5 != r1) goto L_0x00d5
            return r1
        L_0x00d5:
            r10 = r5
            r5 = r12
            r12 = r10
        L_0x00d8:
            boolean r8 = kotlin.Result.m38709i(r12)
            r9 = 0
            if (r8 == 0) goto L_0x00e0
            r12 = r9
        L_0x00e0:
            com.carrefour.fid.android.domain.models.service.models.l r12 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r12
            if (r12 == 0) goto L_0x00e9
            boolean r12 = r12.mo119369M()
            goto L_0x00ea
        L_0x00e9:
            r12 = r3
        L_0x00ea:
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase r6 = r6.getLoyaltyBalanceUseCase
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params r8 = new com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params
            r8.<init>(r2)
            r0.L$0 = r2
            r0.L$1 = r9
            r0.Z$0 = r5
            r0.I$0 = r12
            r0.label = r4
            java.lang.Object r0 = r6.m173041invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase.Params) r8, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Double>>) r0)
            if (r0 != r1) goto L_0x0102
            return r1
        L_0x0102:
            r1 = r12
            r12 = r0
            r0 = r2
            r2 = r5
        L_0x0106:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r12)
            if (r4 != 0) goto L_0x0127
            java.lang.Number r12 = (java.lang.Number) r12
            double r4 = r12.doubleValue()
            kotlin.Result$a r12 = kotlin.Result.f28060a
            if (r2 == 0) goto L_0x0119
            if (r1 == 0) goto L_0x0119
            r3 = r7
        L_0x0119:
            java.lang.String r12 = java.lang.String.valueOf(r4)
            com.carrefour.fid.android.domain.models.loyalty.a r1 = new com.carrefour.fid.android.domain.models.loyalty.a
            r1.<init>(r0, r3, r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r1)
            return r12
        L_0x0127:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            return r12
        L_0x0132:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            return r12
        L_0x013d:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase.m173036invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
