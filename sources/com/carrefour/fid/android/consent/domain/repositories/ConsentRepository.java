package com.carrefour.fid.android.consent.domain.repositories;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi;
import com.carrefour.fid.android.shared.network.C28812h;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJX\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/domain/repositories/ConsentRepository;", "", "", "loyaltyCardId", "Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/consent/ConsentOptIn;", "getConsents-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getConsents", "email", "phoneNumber", "customerId", "consentOptIns", "Lkotlin/d2;", "updateConsents-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "updateConsents", "Lcom/carrefour/fid/android/bff_data_shared/data/api/services/BffCustomersManagementApi;", "service", "Lcom/carrefour/fid/android/bff_data_shared/data/api/services/BffCustomersManagementApi;", "Lcom/carrefour/fid/android/shared/network/h;", "tokenProvider", "Lcom/carrefour/fid/android/shared/network/h;", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/services/BffCustomersManagementApi;Lcom/carrefour/fid/android/shared/network/h;)V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ConsentRepository {
    @C12579k
    private final BffCustomersManagementApi service;
    @C12579k
    private final C28812h tokenProvider;

    @Inject
    public ConsentRepository(@C12579k BffCustomersManagementApi bffCustomersManagementApi, @C12579k C28812h hVar) {
        Intrinsics.checkNotNullParameter(bffCustomersManagementApi, "service");
        Intrinsics.checkNotNullParameter(hVar, "tokenProvider");
        this.service = bffCustomersManagementApi;
        this.tokenProvider = hVar;
    }

    /* renamed from: getConsents-gIAlu-s$default  reason: not valid java name */
    public static /* synthetic */ Object m172926getConsentsgIAlus$default(ConsentRepository consentRepository, String str, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return consentRepository.m172927getConsentsgIAlus(str, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092 A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1 A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getConsents-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172927getConsentsgIAlus(@org.jetbrains.annotations.C12580l java.lang.String r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.consent.ConsentOptIn>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.consent.domain.repositories.ConsentRepository$getConsents$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.consent.domain.repositories.ConsentRepository$getConsents$1 r0 = (com.carrefour.fid.android.consent.domain.repositories.ConsentRepository$getConsents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.consent.domain.repositories.ConsentRepository$getConsents$1 r0 = new com.carrefour.fid.android.consent.domain.repositories.ConsentRepository$getConsents$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            java.lang.String r3 = "Error getting consent list"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0043
            if (r2 == r5) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x00a7 }
            goto L_0x0071
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.consent.domain.repositories.ConsentRepository r2 = (com.carrefour.fid.android.consent.domain.repositories.ConsentRepository) r2
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x00a7 }
            goto L_0x0056
        L_0x0043:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.shared.network.h r9 = r7.tokenProvider     // Catch:{ all -> 0x00a7 }
            r0.L$0 = r7     // Catch:{ all -> 0x00a7 }
            r0.L$1 = r8     // Catch:{ all -> 0x00a7 }
            r0.label = r5     // Catch:{ all -> 0x00a7 }
            java.lang.Object r9 = r9.mo83891a(r0)     // Catch:{ all -> 0x00a7 }
            if (r9 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r2 = r7
        L_0x0056:
            com.carrefour.fid.android.shared.network.g r9 = (com.carrefour.fid.android.shared.network.C28811g) r9     // Catch:{ all -> 0x00a7 }
            if (r9 == 0) goto L_0x00a1
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi r2 = r2.service     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = r9.mo83886e()     // Catch:{ all -> 0x00a7 }
            java.lang.String r9 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r9)     // Catch:{ all -> 0x00a7 }
            r0.L$0 = r6     // Catch:{ all -> 0x00a7 }
            r0.L$1 = r6     // Catch:{ all -> 0x00a7 }
            r0.label = r4     // Catch:{ all -> 0x00a7 }
            java.lang.Object r9 = r2.getConsents(r5, r9, r8, r0)     // Catch:{ all -> 0x00a7 }
            if (r9 != r1) goto L_0x0071
            return r1
        L_0x0071:
            retrofit2.w r9 = (retrofit2.C13091w) r9     // Catch:{ all -> 0x00a7 }
            boolean r8 = r9.mo30576g()     // Catch:{ all -> 0x00a7 }
            if (r8 == 0) goto L_0x0092
            kotlin.Result$a r8 = kotlin.Result.f28060a     // Catch:{ all -> 0x00a7 }
            java.lang.Object r8 = r9.mo30572a()     // Catch:{ all -> 0x00a7 }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentsResponse r8 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentsResponse) r8     // Catch:{ all -> 0x00a7 }
            if (r8 == 0) goto L_0x0087
            java.util.List r6 = com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.toDomain((com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentsResponse) r8)     // Catch:{ all -> 0x00a7 }
        L_0x0087:
            if (r6 != 0) goto L_0x008d
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()     // Catch:{ all -> 0x00a7 }
        L_0x008d:
            java.lang.Object r8 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x00a7 }
            goto L_0x00b6
        L_0x0092:
            kotlin.Result$a r8 = kotlin.Result.f28060a     // Catch:{ all -> 0x00a7 }
            com.carrefour.fid.android.shared.io.ResponseThrowable r8 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118565d(r9, r3)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x00a7 }
            goto L_0x00b6
        L_0x00a1:
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r8 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable     // Catch:{ all -> 0x00a7 }
            r8.<init>()     // Catch:{ all -> 0x00a7 }
            throw r8     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>(r3)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00b6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.domain.repositories.ConsentRepository.m172927getConsentsgIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: updateConsents-hUnOzRk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m172928updateConsentshUnOzRk(@org.jetbrains.annotations.C12580l java.lang.String r6, @org.jetbrains.annotations.C12580l java.lang.String r7, @org.jetbrains.annotations.C12580l java.lang.String r8, @org.jetbrains.annotations.C12580l java.lang.String r9, @org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.domain.models.consent.ConsentOptIn> r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r11) {
        /*
            r5 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.consent.domain.repositories.ConsentRepository$updateConsents$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.consent.domain.repositories.ConsentRepository$updateConsents$1 r0 = (com.carrefour.fid.android.consent.domain.repositories.ConsentRepository$updateConsents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.consent.domain.repositories.ConsentRepository$updateConsents$1 r0 = new com.carrefour.fid.android.consent.domain.repositories.ConsentRepository$updateConsents$1
            r0.<init>(r5, r11)
        L_0x0018:
            r11 = r0
            java.lang.Object r0 = r11.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r11.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.C11661u0.m45747n(r0)
            goto L_0x0092
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            java.lang.Object r6 = r11.L$2
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUpdateConsentsBody r6 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUpdateConsentsBody) r6
            java.lang.Object r7 = r11.L$1
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r11.L$0
            com.carrefour.fid.android.consent.domain.repositories.ConsentRepository r7 = (com.carrefour.fid.android.consent.domain.repositories.ConsentRepository) r7
            kotlin.C11661u0.m45747n(r0)
        L_0x0045:
            r10 = r6
            goto L_0x0074
        L_0x0047:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUpdateConsentsBody r6 = com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.toBffUpdateConsentsBody(r10, r6, r7, r8, r9)
            java.util.List r7 = r6.getConsents()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0061
            kotlin.Result$a r6 = kotlin.Result.f28060a
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x00b6
        L_0x0061:
            com.carrefour.fid.android.shared.network.h r7 = r5.tokenProvider
            r11.L$0 = r5
            r11.L$1 = r9
            r11.L$2 = r6
            r11.label = r4
            java.lang.Object r0 = r7.mo83891a(r11)
            if (r0 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r7 = r5
            goto L_0x0045
        L_0x0074:
            com.carrefour.fid.android.shared.network.g r0 = (com.carrefour.fid.android.shared.network.C28811g) r0
            if (r0 == 0) goto L_0x00b7
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi r6 = r7.service
            java.lang.String r7 = r0.mo83886e()
            java.lang.String r8 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r0)
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.L$2 = r0
            r11.label = r3
            java.lang.Object r0 = r6.updateConsents(r7, r8, r9, r10, r11)
            if (r0 != r1) goto L_0x0092
            return r1
        L_0x0092:
            retrofit2.w r0 = (retrofit2.C13091w) r0
            boolean r6 = r0.mo30576g()
            if (r6 == 0) goto L_0x00a3
            kotlin.Result$a r6 = kotlin.Result.f28060a
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x00b6
        L_0x00a3:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r7 = r0.mo30577h()
            r6.<init>(r7)
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x00b6:
            return r6
        L_0x00b7:
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r6 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.domain.repositories.ConsentRepository.m172928updateConsentshUnOzRk(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }
}
