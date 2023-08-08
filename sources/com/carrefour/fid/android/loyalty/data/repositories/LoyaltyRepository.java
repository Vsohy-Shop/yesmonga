package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffMidFidApiService;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders;
import com.carrefour.fid.android.loyalty.data.services.MidFidApiService;
import com.carrefour.fid.android.loyalty.domain.repositories.ILoyaltyRepository;
import com.carrefour.fid.android.shared.network.C28812h;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bD\u0010EJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\u0007J2\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\u00042\u0006\u0010\r\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u0007J2\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b \u0010!J2\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b$\u0010!J:\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b'\u0010(J4\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00042\u0006\u0010*\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b.\u0010/J0\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\t0\u00042\u0006\u00101\u001a\u00020\u0002H@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b3\u0010\u0007R\u0014\u00106\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010C\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006F"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "Lcom/carrefour/fid/android/loyalty/domain/repositories/ILoyaltyRepository;", "", "cardFidNumber", "Lkotlin/Result;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyBalanceResponse;", "getLoyaltyBalance-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getLoyaltyBalance", "", "Lcom/carrefour/fid/android/loyalty/data/models/entities/ClubsResponse;", "getLoyaltyClubs-gIAlu-s", "getLoyaltyClubs", "loyaltyCardId", "Lcom/carrefour/fid/android/loyalty/data/models/entities/PrimeMidFidBody;", "primeMidFidBody", "putMidFidClub-0E7RQCE", "(Ljava/lang/String;Lcom/carrefour/fid/android/loyalty/data/models/entities/PrimeMidFidBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "putMidFidClub", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;", "body", "Lkotlin/d2;", "activeFidAdhesionEasy-0E7RQCE", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "activeFidAdhesionEasy", "createLoyaltyCard-gIAlu-s", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "createLoyaltyCard", "Lcom/carrefour/fid/android/loyalty/domain/models/UserChannelsMediaDomain;", "getUserChannels-gIAlu-s", "getUserChannels", "channelId", "getOtp-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getOtp", "otpCode", "validationOtpCode-0E7RQCE", "validationOtpCode", "newSecretCode", "updateSecretCode-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "updateSecretCode", "storeRef", "", "isExpireDetail", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyListTransactionsDomain;", "getUserTransactions-0E7RQCE", "(Ljava/lang/String;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "getUserTransactions", "requestedDate", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyCardOperationHistoryDomain;", "getFidHistory-gIAlu-s", "getFidHistory", "Lcom/carrefour/fid/android/loyalty/data/services/MidFidApiService;", "midFidApiService", "Lcom/carrefour/fid/android/loyalty/data/services/MidFidApiService;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/services/BffMidFidApiService;", "bffMidFidApiService", "Lcom/carrefour/fid/android/bff_data_shared/data/api/services/BffMidFidApiService;", "Lcom/carrefour/fid/android/loyalty/data/headers/LoyaltyHeaders;", "loyaltyHeaders", "Lcom/carrefour/fid/android/loyalty/data/headers/LoyaltyHeaders;", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "Lcom/carrefour/fid/android/shared/network/h;", "tokenProvider", "Lcom/carrefour/fid/android/shared/network/h;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/services/MidFidApiService;Lcom/carrefour/fid/android/bff_data_shared/data/api/services/BffMidFidApiService;Lcom/carrefour/fid/android/loyalty/data/headers/LoyaltyHeaders;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/shared/network/h;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLoyaltyRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyRepository.kt\ncom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,303:1\n97#2:304\n32#3:305\n80#4:306\n1549#5:307\n1620#5,3:308\n1549#5:311\n1620#5,3:312\n*S KotlinDebug\n*F\n+ 1 LoyaltyRepository.kt\ncom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository\n*L\n134#1:304\n134#1:305\n134#1:306\n157#1:307\n157#1:308,3\n292#1:311\n292#1:312,3\n*E\n"})
public final class LoyaltyRepository implements ILoyaltyRepository {
    @C12579k
    private final BffMidFidApiService bffMidFidApiService;
    /* access modifiers changed from: private */
    @C12579k
    public final LoyaltyHeaders loyaltyHeaders;
    @C12579k
    private final LoyaltyPreferencesStorage loyaltyPreferencesStorage;
    /* access modifiers changed from: private */
    @C12579k
    public final MidFidApiService midFidApiService;
    @C12579k
    private final C28812h tokenProvider;

    @Inject
    public LoyaltyRepository(@C12579k MidFidApiService midFidApiService2, @C12579k BffMidFidApiService bffMidFidApiService2, @C12579k LoyaltyHeaders loyaltyHeaders2, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage2, @C12579k C28812h hVar) {
        Intrinsics.checkNotNullParameter(midFidApiService2, "midFidApiService");
        Intrinsics.checkNotNullParameter(bffMidFidApiService2, "bffMidFidApiService");
        Intrinsics.checkNotNullParameter(loyaltyHeaders2, "loyaltyHeaders");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage2, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(hVar, "tokenProvider");
        this.midFidApiService = midFidApiService2;
        this.bffMidFidApiService = bffMidFidApiService2;
        this.loyaltyHeaders = loyaltyHeaders2;
        this.loyaltyPreferencesStorage = loyaltyPreferencesStorage2;
        this.tokenProvider = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064 A[Catch:{ all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[Catch:{ all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090 A[Catch:{ all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1 A[Catch:{ all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: activeFidAdhesionEasy-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173018activeFidAdhesionEasy0E7RQCE(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody r8, @org.jetbrains.annotations.C12579k java.lang.String r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$activeFidAdhesionEasy$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$activeFidAdhesionEasy$1 r0 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$activeFidAdhesionEasy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$activeFidAdhesionEasy$1 r0 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$activeFidAdhesionEasy$1
            r0.<init>(r7, r10)
        L_0x0018:
            r6 = r0
            java.lang.Object r10 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x004a
            if (r1 == r3) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x002d }
            goto L_0x007f
        L_0x002d:
            r8 = move-exception
            goto L_0x00a7
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            java.lang.Object r8 = r6.L$2
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r6.L$1
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody r8 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody) r8
            java.lang.Object r1 = r6.L$0
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository r1 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository) r1
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x002d }
        L_0x0048:
            r5 = r9
            goto L_0x0060
        L_0x004a:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.shared.network.h r10 = r7.tokenProvider     // Catch:{ all -> 0x002d }
            r6.L$0 = r7     // Catch:{ all -> 0x002d }
            r6.L$1 = r8     // Catch:{ all -> 0x002d }
            r6.L$2 = r9     // Catch:{ all -> 0x002d }
            r6.label = r3     // Catch:{ all -> 0x002d }
            java.lang.Object r10 = r10.mo83891a(r6)     // Catch:{ all -> 0x002d }
            if (r10 != r0) goto L_0x005e
            return r0
        L_0x005e:
            r1 = r7
            goto L_0x0048
        L_0x0060:
            com.carrefour.fid.android.shared.network.g r10 = (com.carrefour.fid.android.shared.network.C28811g) r10     // Catch:{ all -> 0x002d }
            if (r10 == 0) goto L_0x00a1
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffMidFidApiService r1 = r1.bffMidFidApiService     // Catch:{ all -> 0x002d }
            java.lang.String r3 = r10.mo83886e()     // Catch:{ all -> 0x002d }
            java.lang.String r4 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r10)     // Catch:{ all -> 0x002d }
            r9 = 0
            r6.L$0 = r9     // Catch:{ all -> 0x002d }
            r6.L$1 = r9     // Catch:{ all -> 0x002d }
            r6.L$2 = r9     // Catch:{ all -> 0x002d }
            r6.label = r2     // Catch:{ all -> 0x002d }
            r2 = r8
            java.lang.Object r10 = r1.attachLoyaltyCard(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x002d }
            if (r10 != r0) goto L_0x007f
            return r0
        L_0x007f:
            retrofit2.w r10 = (retrofit2.C13091w) r10     // Catch:{ all -> 0x002d }
            boolean r8 = r10.mo30576g()     // Catch:{ all -> 0x002d }
            if (r8 == 0) goto L_0x0090
            kotlin.Result$a r8 = kotlin.Result.f28060a     // Catch:{ all -> 0x002d }
            kotlin.d2 r8 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x002d }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x002d }
            goto L_0x00bf
        L_0x0090:
            kotlin.Result$a r8 = kotlin.Result.f28060a     // Catch:{ all -> 0x002d }
            java.lang.String r8 = "Error when create loyalty card fid"
            com.carrefour.fid.android.shared.io.ResponseThrowable r8 = com.carrefour.fid.android.shared.p046io.C28793b.m119158b(r10, r8)     // Catch:{ all -> 0x002d }
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)     // Catch:{ all -> 0x002d }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x002d }
            goto L_0x00bf
        L_0x00a1:
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r8 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable     // Catch:{ all -> 0x002d }
            r8.<init>()     // Catch:{ all -> 0x002d }
            throw r8     // Catch:{ all -> 0x002d }
        L_0x00a7:
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r1 = 0
            r3 = 0
            r4 = 5
            r5 = 0
            r2 = r8
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
            kotlin.Result$a r9 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r8 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r8)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00bf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository.m173018activeFidAdhesionEasy0E7RQCE(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b A[Catch:{ all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084 A[Catch:{ all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3 A[Catch:{ all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: createLoyaltyCard-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173019createLoyaltyCardgIAlus(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$createLoyaltyCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$createLoyaltyCard$1 r0 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$createLoyaltyCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$createLoyaltyCard$1 r0 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$createLoyaltyCard$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x002d }
            goto L_0x0072
        L_0x002d:
            r8 = move-exception
            goto L_0x00f9
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody r8 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository r2 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository) r2
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x002d }
            goto L_0x0057
        L_0x0044:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.shared.network.h r9 = r7.tokenProvider     // Catch:{ all -> 0x002d }
            r0.L$0 = r7     // Catch:{ all -> 0x002d }
            r0.L$1 = r8     // Catch:{ all -> 0x002d }
            r0.label = r4     // Catch:{ all -> 0x002d }
            java.lang.Object r9 = r9.mo83891a(r0)     // Catch:{ all -> 0x002d }
            if (r9 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r7
        L_0x0057:
            com.carrefour.fid.android.shared.network.g r9 = (com.carrefour.fid.android.shared.network.C28811g) r9     // Catch:{ all -> 0x002d }
            if (r9 == 0) goto L_0x00f3
            com.carrefour.fid.android.bff_data_shared.data.api.services.BffMidFidApiService r2 = r2.bffMidFidApiService     // Catch:{ all -> 0x002d }
            java.lang.String r6 = r9.mo83886e()     // Catch:{ all -> 0x002d }
            java.lang.String r9 = com.carrefour.fid.android.shared.network.C28813i.m119242a(r9)     // Catch:{ all -> 0x002d }
            r0.L$0 = r5     // Catch:{ all -> 0x002d }
            r0.L$1 = r5     // Catch:{ all -> 0x002d }
            r0.label = r3     // Catch:{ all -> 0x002d }
            java.lang.Object r9 = r2.createLoyaltyCard(r8, r6, r9, r0)     // Catch:{ all -> 0x002d }
            if (r9 != r1) goto L_0x0072
            return r1
        L_0x0072:
            retrofit2.w r9 = (retrofit2.C13091w) r9     // Catch:{ all -> 0x002d }
            boolean r8 = r9.mo30576g()     // Catch:{ all -> 0x002d }
            if (r8 == 0) goto L_0x0084
            kotlin.Result$a r8 = kotlin.Result.f28060a     // Catch:{ all -> 0x002d }
            kotlin.d2 r8 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x002d }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x002d }
            goto L_0x0111
        L_0x0084:
            okhttp3.ResponseBody r8 = r9.mo30574e()     // Catch:{ all -> 0x002d }
            if (r8 == 0) goto L_0x008f
            java.lang.String r8 = r8.string()     // Catch:{ all -> 0x002d }
            goto L_0x0090
        L_0x008f:
            r8 = r5
        L_0x0090:
            if (r8 != 0) goto L_0x00a4
            kotlin.Result$a r8 = kotlin.Result.f28060a     // Catch:{ all -> 0x002d }
            java.lang.Throwable r8 = new java.lang.Throwable     // Catch:{ all -> 0x002d }
            java.lang.String r9 = "Error during loyalty card creation"
            r8.<init>(r9)     // Catch:{ all -> 0x002d }
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)     // Catch:{ all -> 0x002d }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x002d }
            goto L_0x0111
        L_0x00a4:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$createLoyaltyCard$2$json$1 r9 = com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$createLoyaltyCard$2$json$1.INSTANCE     // Catch:{ all -> 0x002d }
            kotlinx.serialization.json.a r9 = kotlinx.serialization.json.C12412q.m50212b(r5, r9, r4, r5)     // Catch:{ all -> 0x002d }
            kotlinx.serialization.modules.e r0 = r9.mo25277a()     // Catch:{ all -> 0x002d }
            java.lang.Class<com.carrefour.fid.android.bff_data_shared.data.api.entities.BffErrorResponse> r1 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffErrorResponse.class
            kotlin.reflect.r r1 = kotlin.jvm.internal.C11342l0.m43538A(r1)     // Catch:{ all -> 0x002d }
            kotlinx.serialization.g r0 = kotlinx.serialization.C12442r.m50317h(r0, r1)     // Catch:{ all -> 0x002d }
            java.lang.Object r8 = r9.mo25278b(r0, r8)     // Catch:{ all -> 0x002d }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffErrorResponse r8 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffErrorResponse) r8     // Catch:{ all -> 0x002d }
            kotlin.Result$a r9 = kotlin.Result.f28060a     // Catch:{ all -> 0x002d }
            com.carrefour.fid.android.shared.io.CreateFidProcessThrowable r9 = new com.carrefour.fid.android.shared.io.CreateFidProcessThrowable     // Catch:{ all -> 0x002d }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.Errors r0 = r8.getErrors()     // Catch:{ all -> 0x002d }
            java.util.List r0 = r0.getCustomer()     // Catch:{ all -> 0x002d }
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x002d }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.CustomerError r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.CustomerError) r0     // Catch:{ all -> 0x002d }
            java.lang.String r0 = r0.getSub_code()     // Catch:{ all -> 0x002d }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.Errors r8 = r8.getErrors()     // Catch:{ all -> 0x002d }
            java.util.List r8 = r8.getCustomer()     // Catch:{ all -> 0x002d }
            java.lang.Object r8 = r8.get(r1)     // Catch:{ all -> 0x002d }
            com.carrefour.fid.android.bff_data_shared.data.api.entities.CustomerError r8 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.CustomerError) r8     // Catch:{ all -> 0x002d }
            java.lang.String r8 = r8.getReason()     // Catch:{ all -> 0x002d }
            r9.<init>(r0, r8)     // Catch:{ all -> 0x002d }
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r9)     // Catch:{ all -> 0x002d }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x002d }
            goto L_0x0111
        L_0x00f3:
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r8 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable     // Catch:{ all -> 0x002d }
            r8.<init>()     // Catch:{ all -> 0x002d }
            throw r8     // Catch:{ all -> 0x002d }
        L_0x00f9:
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r1 = 0
            r3 = 0
            r4 = 5
            r5 = 0
            r2 = r8
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
            kotlin.Result$a r9 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r8 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r8)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x0111:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository.m173019createLoyaltyCardgIAlus(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4 A[Catch:{ all -> 0x0113 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ee A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getFidHistory-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173020getFidHistorygIAlus(@org.jetbrains.annotations.C12579k java.lang.String r22, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain>>> r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            boolean r2 = r0 instanceof com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getFidHistory$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getFidHistory$1 r2 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getFidHistory$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getFidHistory$1 r2 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getFidHistory$1
            r2.<init>(r1, r0)
        L_0x001c:
            r8 = r2
            java.lang.Object r0 = r8.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r8.label
            r11 = 0
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 == r5) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r2 = r8.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0113 }
            goto L_0x00a7
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003f:
            java.lang.Object r3 = r8.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r8.L$0
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository r5 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository) r5
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0113 }
            goto L_0x0060
        L_0x004b:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r0 = r1.loyaltyPreferencesStorage     // Catch:{ all -> 0x0113 }
            r8.L$0 = r1     // Catch:{ all -> 0x0113 }
            r3 = r22
            r8.L$1 = r3     // Catch:{ all -> 0x0113 }
            r8.label = r5     // Catch:{ all -> 0x0113 }
            java.lang.Object r0 = r0.getLoyaltyCardNumber(r8)     // Catch:{ all -> 0x0113 }
            if (r0 != r2) goto L_0x005f
            return r2
        L_0x005f:
            r5 = r1
        L_0x0060:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0113 }
            com.carrefour.fid.android.loyalty.data.services.MidFidApiService r6 = r5.midFidApiService     // Catch:{ all -> 0x0113 }
            com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders r12 = r5.loyaltyHeaders     // Catch:{ all -> 0x0113 }
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 62
            r20 = 0
            r13 = r0
            java.util.HashMap r5 = com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders.getDefaultHeaders$default(r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0113 }
            r7 = 0
            r9 = 0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0113 }
            r10.<init>()     // Catch:{ all -> 0x0113 }
            java.lang.String r12 = "{statement_date:"
            r10.append(r12)     // Catch:{ all -> 0x0113 }
            r10.append(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = "}"
            r10.append(r3)     // Catch:{ all -> 0x0113 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0113 }
            r12 = 6
            r13 = 0
            r8.L$0 = r0     // Catch:{ all -> 0x0113 }
            r8.L$1 = r11     // Catch:{ all -> 0x0113 }
            r8.label = r4     // Catch:{ all -> 0x0113 }
            r3 = r6
            r4 = r5
            r5 = r7
            r6 = r9
            r7 = r10
            r9 = r12
            r10 = r13
            java.lang.Object r3 = com.carrefour.fid.android.loyalty.data.services.MidFidApiService.DefaultImpls.getFidHistory$default(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0113 }
            if (r3 != r2) goto L_0x00a5
            return r2
        L_0x00a5:
            r2 = r0
            r0 = r3
        L_0x00a7:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x0113 }
            boolean r3 = r0.mo30576g()     // Catch:{ all -> 0x0113 }
            if (r3 == 0) goto L_0x00ee
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x0113 }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x0113 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x00e3
            java.lang.String r2 = "body()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x0113 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0113 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0113 }
            r2 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r0, r2)     // Catch:{ all -> 0x0113 }
            r11.<init>(r2)     // Catch:{ all -> 0x0113 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0113 }
        L_0x00cf:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x00e3
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0113 }
            com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyCardOperationHistoryResponse r2 = (com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyCardOperationHistoryResponse) r2     // Catch:{ all -> 0x0113 }
            com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain r2 = com.carrefour.fid.android.loyalty.domain.extension.LoyaltyCardOperationHistoryDomainKt.toDomain((com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyCardOperationHistoryResponse) r2)     // Catch:{ all -> 0x0113 }
            r11.add(r2)     // Catch:{ all -> 0x0113 }
            goto L_0x00cf
        L_0x00e3:
            if (r11 != 0) goto L_0x00e9
            java.util.List r11 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()     // Catch:{ all -> 0x0113 }
        L_0x00e9:
            java.lang.Object r0 = kotlin.Result.m38702b(r11)     // Catch:{ all -> 0x0113 }
            goto L_0x012c
        L_0x00ee:
            kotlin.Result$a r3 = kotlin.Result.f28060a     // Catch:{ all -> 0x0113 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0113 }
            r3.<init>()     // Catch:{ all -> 0x0113 }
            java.lang.String r4 = "Error get loyalty transactions for card fid:'"
            r3.append(r4)     // Catch:{ all -> 0x0113 }
            r3.append(r2)     // Catch:{ all -> 0x0113 }
            java.lang.String r2 = "'"
            r3.append(r2)     // Catch:{ all -> 0x0113 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0113 }
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.shared.p046io.C28793b.m119158b(r0, r2)     // Catch:{ all -> 0x0113 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x0113 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0113 }
            goto L_0x012c
        L_0x0113:
            r0 = move-exception
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r3 = 0
            r5 = 0
            r6 = 5
            r7 = 0
            r4 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r2, r3, r4, r5, r6, r7)
            kotlin.Result$a r2 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r0)
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x012c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository.m173020getFidHistorygIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getLoyaltyBalance-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173021getLoyaltyBalancegIAlus(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyBalanceResponse>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyBalance$1 r0 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyBalance$1 r0 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyBalance$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyBalance$2 r6 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyBalance$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository.m173021getLoyaltyBalancegIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getLoyaltyClubs-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173022getLoyaltyClubsgIAlus(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.loyalty.data.models.entities.ClubsResponse>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyClubs$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyClubs$1 r0 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyClubs$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyClubs$1 r0 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyClubs$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyClubs$2 r6 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getLoyaltyClubs$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository.m173022getLoyaltyClubsgIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getOtp-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173023getOtp0E7RQCE(@org.jetbrains.annotations.C12579k java.lang.String r16, @org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r18
            boolean r2 = r0 instanceof com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getOtp$1
            if (r2 == 0) goto L_0x0016
            r2 = r0
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getOtp$1 r2 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getOtp$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getOtp$1 r2 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getOtp$1
            r2.<init>(r15, r0)
        L_0x001b:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x0038
            if (r4 != r5) goto L_0x0030
            java.lang.Object r2 = r2.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x0062
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0038:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.loyalty.data.services.MidFidApiService r0 = r1.midFidApiService     // Catch:{ all -> 0x00a0 }
            com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders r6 = r1.loyaltyHeaders     // Catch:{ all -> 0x00a0 }
            r8 = 0
            r9 = 0
            r10 = 1
            r11 = 0
            r12 = 0
            r13 = 54
            r14 = 0
            r7 = r16
            java.util.HashMap r4 = com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders.getDefaultHeaders$default(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00a0 }
            com.carrefour.fid.android.loyalty.data.models.body.GetOtpBody r6 = new com.carrefour.fid.android.loyalty.data.models.body.GetOtpBody     // Catch:{ all -> 0x00a0 }
            r7 = r17
            r6.<init>(r7)     // Catch:{ all -> 0x00a0 }
            r7 = r16
            r2.L$0 = r7     // Catch:{ all -> 0x00a0 }
            r2.label = r5     // Catch:{ all -> 0x00a0 }
            java.lang.Object r0 = r0.getOtp(r4, r6, r2)     // Catch:{ all -> 0x00a0 }
            if (r0 != r3) goto L_0x0061
            return r3
        L_0x0061:
            r2 = r7
        L_0x0062:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x00a0 }
            boolean r3 = r0.mo30576g()     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x007b
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x00a0 }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = ""
        L_0x0076:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x00b9
        L_0x007b:
            kotlin.Result$a r3 = kotlin.Result.f28060a     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r3.<init>()     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = "Failed to get otp for user with card fid:'"
            r3.append(r4)     // Catch:{ all -> 0x00a0 }
            r3.append(r2)     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = "'"
            r3.append(r2)     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00a0 }
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.shared.p046io.C28793b.m119158b(r0, r2)     // Catch:{ all -> 0x00a0 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x00a0 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x00b9
        L_0x00a0:
            r0 = move-exception
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r3 = 0
            r5 = 0
            r6 = 5
            r7 = 0
            r4 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r2, r3, r4, r5, r6, r7)
            kotlin.Result$a r2 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r0)
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository.m173023getOtp0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getUserChannels-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173024getUserChannelsgIAlus(@org.jetbrains.annotations.C12579k java.lang.String r14, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.loyalty.domain.models.UserChannelsMediaDomain>>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getUserChannels$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getUserChannels$1 r0 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getUserChannels$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getUserChannels$1 r0 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getUserChannels$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r14 = r0.L$0
            java.lang.String r14 = (java.lang.String) r14
            kotlin.C11661u0.m45747n(r15)     // Catch:{ all -> 0x00c6 }
            goto L_0x0059
        L_0x002d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0035:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.loyalty.data.services.MidFidApiService r15 = r13.midFidApiService     // Catch:{ all -> 0x00c6 }
            com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders r4 = r13.loyaltyHeaders     // Catch:{ all -> 0x00c6 }
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r2 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = r2.getPassCardNumber(r14)     // Catch:{ all -> 0x00c6 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 62
            r12 = 0
            java.util.HashMap r2 = com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders.getDefaultHeaders$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c6 }
            r0.L$0 = r14     // Catch:{ all -> 0x00c6 }
            r0.label = r3     // Catch:{ all -> 0x00c6 }
            java.lang.Object r15 = r15.getUserChannels(r2, r0)     // Catch:{ all -> 0x00c6 }
            if (r15 != r1) goto L_0x0059
            return r1
        L_0x0059:
            retrofit2.w r15 = (retrofit2.C13091w) r15     // Catch:{ all -> 0x00c6 }
            boolean r0 = r15.mo30576g()     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00a1
            kotlin.Result$a r14 = kotlin.Result.f28060a     // Catch:{ all -> 0x00c6 }
            java.lang.Object r14 = r15.mo30572a()     // Catch:{ all -> 0x00c6 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x00c6 }
            if (r14 == 0) goto L_0x0095
            java.lang.String r15 = "body()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)     // Catch:{ all -> 0x00c6 }
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch:{ all -> 0x00c6 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            r0 = 10
            int r0 = kotlin.collections.C10978t.m41495Y(r14, r0)     // Catch:{ all -> 0x00c6 }
            r15.<init>(r0)     // Catch:{ all -> 0x00c6 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x00c6 }
        L_0x0081:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x00c6 }
            com.carrefour.fid.android.loyalty.data.models.entities.UserChannelsMediaResponse r0 = (com.carrefour.fid.android.loyalty.data.models.entities.UserChannelsMediaResponse) r0     // Catch:{ all -> 0x00c6 }
            com.carrefour.fid.android.loyalty.domain.models.UserChannelsMediaDomain r0 = com.carrefour.fid.android.loyalty.domain.extension.UserChannelsMediaDomainKt.toUserChannelsMediaDomain(r0)     // Catch:{ all -> 0x00c6 }
            r15.add(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x0081
        L_0x0095:
            r15 = 0
        L_0x0096:
            if (r15 != 0) goto L_0x009c
            java.util.List r15 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()     // Catch:{ all -> 0x00c6 }
        L_0x009c:
            java.lang.Object r14 = kotlin.Result.m38702b(r15)     // Catch:{ all -> 0x00c6 }
            goto L_0x00df
        L_0x00a1:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x00c6 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = "Error fetching user channels for card fid:'"
            r0.append(r1)     // Catch:{ all -> 0x00c6 }
            r0.append(r14)     // Catch:{ all -> 0x00c6 }
            java.lang.String r14 = "'"
            r0.append(r14)     // Catch:{ all -> 0x00c6 }
            java.lang.String r14 = r0.toString()     // Catch:{ all -> 0x00c6 }
            com.carrefour.fid.android.shared.io.ResponseThrowable r14 = com.carrefour.fid.android.shared.p046io.C28793b.m119158b(r15, r14)     // Catch:{ all -> 0x00c6 }
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)     // Catch:{ all -> 0x00c6 }
            java.lang.Object r14 = kotlin.Result.m38702b(r14)     // Catch:{ all -> 0x00c6 }
            goto L_0x00df
        L_0x00c6:
            r14 = move-exception
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r1 = 0
            r3 = 0
            r4 = 5
            r5 = 0
            r2 = r14
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
            kotlin.Result$a r15 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r14 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r14)
            java.lang.Object r14 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r14 = kotlin.Result.m38702b(r14)
        L_0x00df:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository.m173024getUserChannelsgIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082 A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084 A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091 A[Catch:{ all -> 0x00dc }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092 A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7 A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: getUserTransactions-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173025getUserTransactions0E7RQCE(@org.jetbrains.annotations.C12579k java.lang.String r21, boolean r22, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.loyalty.domain.models.LoyaltyListTransactionsDomain>> r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r23
            boolean r2 = r0 instanceof com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getUserTransactions$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getUserTransactions$1 r2 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getUserTransactions$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getUserTransactions$1 r2 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$getUserTransactions$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0050
            if (r4 == r7) goto L_0x003d
            if (r4 != r6) goto L_0x0035
            java.lang.Object r2 = r2.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x00dc }
            goto L_0x0097
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003d:
            boolean r4 = r2.Z$0
            java.lang.Object r8 = r2.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.L$0
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository r9 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository) r9
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x00dc }
            r19 = r8
            r8 = r4
            r4 = r19
            goto L_0x0069
        L_0x0050:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r0 = r1.loyaltyPreferencesStorage     // Catch:{ all -> 0x00dc }
            r2.L$0 = r1     // Catch:{ all -> 0x00dc }
            r4 = r21
            r2.L$1 = r4     // Catch:{ all -> 0x00dc }
            r8 = r22
            r2.Z$0 = r8     // Catch:{ all -> 0x00dc }
            r2.label = r7     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r0.getLoyaltyCardNumber(r2)     // Catch:{ all -> 0x00dc }
            if (r0 != r3) goto L_0x0068
            return r3
        L_0x0068:
            r9 = r1
        L_0x0069:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00dc }
            com.carrefour.fid.android.loyalty.data.services.MidFidApiService r15 = r9.midFidApiService     // Catch:{ all -> 0x00dc }
            com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders r10 = r9.loyaltyHeaders     // Catch:{ all -> 0x00dc }
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = 0
            r16 = 0
            r17 = 62
            r18 = 0
            r11 = r0
            r7 = r15
            r15 = r9
            java.util.HashMap r9 = com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders.getDefaultHeaders$default(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00dc }
            if (r8 == 0) goto L_0x0084
            r8 = 1
            goto L_0x0085
        L_0x0084:
            r8 = 0
        L_0x0085:
            r2.L$0 = r0     // Catch:{ all -> 0x00dc }
            r2.L$1 = r5     // Catch:{ all -> 0x00dc }
            r2.label = r6     // Catch:{ all -> 0x00dc }
            java.lang.Object r2 = r7.getUserTransactions(r9, r4, r8, r2)     // Catch:{ all -> 0x00dc }
            if (r2 != r3) goto L_0x0092
            return r3
        L_0x0092:
            r19 = r2
            r2 = r0
            r0 = r19
        L_0x0097:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x00dc }
            boolean r3 = r0.mo30576g()     // Catch:{ all -> 0x00dc }
            if (r3 == 0) goto L_0x00b7
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x00dc }
            com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyListTransactionsResponse r0 = (com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyListTransactionsResponse) r0     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00b2
            java.lang.String r2 = "body()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x00dc }
            com.carrefour.fid.android.loyalty.domain.models.LoyaltyListTransactionsDomain r5 = com.carrefour.fid.android.loyalty.domain.extension.LoyaltyListTransactionsDomainKt.toDomain((com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyListTransactionsResponse) r0)     // Catch:{ all -> 0x00dc }
        L_0x00b2:
            java.lang.Object r0 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x00dc }
            goto L_0x00f5
        L_0x00b7:
            kotlin.Result$a r3 = kotlin.Result.f28060a     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r3.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r4 = "Error get loyalty transactions for card fid:'"
            r3.append(r4)     // Catch:{ all -> 0x00dc }
            r3.append(r2)     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = "'"
            r3.append(r2)     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00dc }
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.shared.p046io.C28793b.m119158b(r0, r2)     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x00dc }
            goto L_0x00f5
        L_0x00dc:
            r0 = move-exception
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r3 = 0
            r5 = 0
            r6 = 5
            r7 = 0
            r4 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r2, r3, r4, r5, r6, r7)
            kotlin.Result$a r2 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r0)
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository.m173025getUserTransactions0E7RQCE(java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: putMidFidClub-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173026putMidFidClub0E7RQCE(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.loyalty.data.models.entities.PrimeMidFidBody r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$putMidFidClub$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$putMidFidClub$1 r0 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$putMidFidClub$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$putMidFidClub$1 r0 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$putMidFidClub$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$putMidFidClub$2 r7 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$putMidFidClub$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository.m173026putMidFidClub0E7RQCE(java.lang.String, com.carrefour.fid.android.loyalty.data.models.entities.PrimeMidFidBody, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079 A[Catch:{ all -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b A[Catch:{ all -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: updateSecretCode-BWLJW6A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173027updateSecretCodeBWLJW6A(@org.jetbrains.annotations.C12579k java.lang.String r16, @org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r19) {
        /*
            r15 = this;
            r1 = r15
            r0 = r19
            boolean r2 = r0 instanceof com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$updateSecretCode$1
            if (r2 == 0) goto L_0x0016
            r2 = r0
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$updateSecretCode$1 r2 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$updateSecretCode$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$updateSecretCode$1 r2 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$updateSecretCode$1
            r2.<init>(r15, r0)
        L_0x001b:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003c
            if (r4 != r5) goto L_0x0034
            java.lang.Object r3 = r2.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0071
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003c:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.loyalty.data.services.MidFidApiService r0 = r1.midFidApiService     // Catch:{ all -> 0x0128 }
            com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders r6 = r1.loyaltyHeaders     // Catch:{ all -> 0x0128 }
            r8 = 0
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 58
            r14 = 0
            r7 = r16
            java.util.HashMap r4 = com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders.getDefaultHeaders$default(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0128 }
            com.carrefour.fid.android.loyalty.data.models.body.UpdateSecretCodeBody r12 = new com.carrefour.fid.android.loyalty.data.models.body.UpdateSecretCodeBody     // Catch:{ all -> 0x0128 }
            r8 = 0
            r10 = 2
            r11 = 0
            r6 = r12
            r7 = r18
            r9 = r17
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0128 }
            r6 = r16
            r2.L$0 = r6     // Catch:{ all -> 0x0128 }
            r7 = r18
            r2.L$1 = r7     // Catch:{ all -> 0x0128 }
            r2.label = r5     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = r0.updateSecretCode(r4, r12, r2)     // Catch:{ all -> 0x0128 }
            if (r0 != r3) goto L_0x006f
            return r3
        L_0x006f:
            r2 = r6
            r3 = r7
        L_0x0071:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x0128 }
            boolean r4 = r0.mo30576g()     // Catch:{ all -> 0x0128 }
            if (r4 == 0) goto L_0x008b
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0128 }
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = ""
        L_0x0085:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0141
        L_0x008b:
            int r4 = r0.mo30573b()     // Catch:{ all -> 0x0128 }
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 != r5) goto L_0x00a6
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0128 }
            com.carrefour.fid.android.loyalty.core.io.OTPLoyaltyBlockedCardThrowable r0 = new com.carrefour.fid.android.loyalty.core.io.OTPLoyaltyBlockedCardThrowable     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = "loyalty card is blocked"
            r0.<init>(r2)     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0141
        L_0x00a6:
            int r4 = r0.mo30573b()     // Catch:{ all -> 0x0128 }
            r5 = 124(0x7c, float:1.74E-43)
            if (r4 != r5) goto L_0x00d7
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0128 }
            com.carrefour.fid.android.loyalty.core.io.OTPLoyaltyInvalidCardOrSecretCodeThrowable r0 = new com.carrefour.fid.android.loyalty.core.io.OTPLoyaltyInvalidCardOrSecretCodeThrowable     // Catch:{ all -> 0x0128 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r4.<init>()     // Catch:{ all -> 0x0128 }
            java.lang.String r5 = "Invalid card : '"
            r4.append(r5)     // Catch:{ all -> 0x0128 }
            r4.append(r2)     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = "' or secret code :'"
            r4.append(r2)     // Catch:{ all -> 0x0128 }
            r4.append(r3)     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0128 }
            r0.<init>(r2)     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0141
        L_0x00d7:
            int r4 = r0.mo30573b()     // Catch:{ all -> 0x0128 }
            r5 = 603(0x25b, float:8.45E-43)
            java.lang.String r6 = "'"
            if (r4 != r5) goto L_0x0105
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0128 }
            com.carrefour.fid.android.loyalty.core.io.OTPLoyaltyCodeNotSecuredThrowable r0 = new com.carrefour.fid.android.loyalty.core.io.OTPLoyaltyCodeNotSecuredThrowable     // Catch:{ all -> 0x0128 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r2.<init>()     // Catch:{ all -> 0x0128 }
            java.lang.String r4 = "Secret code not secured : '"
            r2.append(r4)     // Catch:{ all -> 0x0128 }
            r2.append(r3)     // Catch:{ all -> 0x0128 }
            r2.append(r6)     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0128 }
            r0.<init>(r2)     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0141
        L_0x0105:
            kotlin.Result$a r3 = kotlin.Result.f28060a     // Catch:{ all -> 0x0128 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r3.<init>()     // Catch:{ all -> 0x0128 }
            java.lang.String r4 = "Failed to update secret code for user with card fid:'"
            r3.append(r4)     // Catch:{ all -> 0x0128 }
            r3.append(r2)     // Catch:{ all -> 0x0128 }
            r3.append(r6)     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0128 }
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.shared.p046io.C28793b.m119158b(r0, r2)     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0141
        L_0x0128:
            r0 = move-exception
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r3 = 0
            r5 = 0
            r6 = 5
            r7 = 0
            r4 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r2, r3, r4, r5, r6, r7)
            kotlin.Result$a r2 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r0)
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0141:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository.m173027updateSecretCodeBWLJW6A(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[Catch:{ all -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075 A[Catch:{ all -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: validationOtpCode-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173028validationOtpCode0E7RQCE(@org.jetbrains.annotations.C12579k java.lang.String r16, @org.jetbrains.annotations.C12579k java.lang.String r17, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r18
            boolean r2 = r0 instanceof com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$validationOtpCode$1
            if (r2 == 0) goto L_0x0016
            r2 = r0
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$validationOtpCode$1 r2 = (com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$validationOtpCode$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$validationOtpCode$1 r2 = new com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository$validationOtpCode$1
            r2.<init>(r15, r0)
        L_0x001b:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x0038
            if (r4 != r5) goto L_0x0030
            java.lang.Object r2 = r2.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x005c
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0038:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.loyalty.data.services.MidFidApiService r0 = r1.midFidApiService     // Catch:{ all -> 0x00b4 }
            com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders r6 = r1.loyaltyHeaders     // Catch:{ all -> 0x00b4 }
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 60
            r14 = 0
            r7 = r16
            r8 = r17
            java.util.HashMap r4 = com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders.getDefaultHeaders$default(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00b4 }
            r6 = r16
            r2.L$0 = r6     // Catch:{ all -> 0x00b4 }
            r2.label = r5     // Catch:{ all -> 0x00b4 }
            java.lang.Object r0 = r0.validationOtpCode(r4, r2)     // Catch:{ all -> 0x00b4 }
            if (r0 != r3) goto L_0x005b
            return r3
        L_0x005b:
            r2 = r6
        L_0x005c:
            retrofit2.w r0 = (retrofit2.C13091w) r0     // Catch:{ all -> 0x00b4 }
            boolean r3 = r0.mo30576g()     // Catch:{ all -> 0x00b4 }
            if (r3 == 0) goto L_0x0075
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x00b4 }
            java.lang.Object r0 = r0.mo30572a()     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = ""
        L_0x0070:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x00cd
        L_0x0075:
            int r3 = r0.mo30573b()     // Catch:{ all -> 0x00b4 }
            r4 = 602(0x25a, float:8.44E-43)
            if (r3 != r4) goto L_0x008f
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x00b4 }
            com.carrefour.fid.android.loyalty.core.io.OTPCodeThrowable r0 = new com.carrefour.fid.android.loyalty.core.io.OTPCodeThrowable     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = "The authentication code is incorrect"
            r0.<init>(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x00b4 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x00cd
        L_0x008f:
            kotlin.Result$a r3 = kotlin.Result.f28060a     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r3.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r4 = "Failed to validate code for user with card fid:'"
            r3.append(r4)     // Catch:{ all -> 0x00b4 }
            r3.append(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = "'"
            r3.append(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00b4 }
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.shared.p046io.C28793b.m119158b(r0, r2)     // Catch:{ all -> 0x00b4 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ all -> 0x00b4 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x00cd
        L_0x00b4:
            r0 = move-exception
            com.carrefour.fid.android.shared.util.i r2 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r3 = 0
            r5 = 0
            r6 = 5
            r7 = 0
            r4 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r2, r3, r4, r5, r6, r7)
            kotlin.Result$a r2 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.shared.data.entities.extension.C28639a.m118564c(r0)
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00cd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository.m173028validationOtpCode0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
