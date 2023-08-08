package com.carrefour.fid.android.loyalty.domain.repositories;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.loyalty.data.models.entities.ClubsResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyBalanceResponse;
import com.carrefour.fid.android.loyalty.data.models.entities.PrimeMidFidBody;
import com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain;
import com.carrefour.fid.android.loyalty.domain.models.LoyaltyListTransactionsDomain;
import com.carrefour.fid.android.loyalty.domain.models.UserChannelsMediaDomain;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\u0007J2\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\u00042\u0006\u0010\r\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u0007J2\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b \u0010!J2\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b$\u0010!J:\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b'\u0010(J8\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00042\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020+H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b.\u0010/J0\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\t0\u00042\u0006\u00101\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b3\u0010\u0007\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/repositories/ILoyaltyRepository;", "", "", "cardFidNumber", "Lkotlin/Result;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyBalanceResponse;", "getLoyaltyBalance-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getLoyaltyBalance", "", "Lcom/carrefour/fid/android/loyalty/data/models/entities/ClubsResponse;", "getLoyaltyClubs-gIAlu-s", "getLoyaltyClubs", "loyaltyCardId", "Lcom/carrefour/fid/android/loyalty/data/models/entities/PrimeMidFidBody;", "primeMidFidBody", "putMidFidClub-0E7RQCE", "(Ljava/lang/String;Lcom/carrefour/fid/android/loyalty/data/models/entities/PrimeMidFidBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "putMidFidClub", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;", "body", "Lkotlin/d2;", "activeFidAdhesionEasy-0E7RQCE", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "activeFidAdhesionEasy", "createLoyaltyCard-gIAlu-s", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "createLoyaltyCard", "Lcom/carrefour/fid/android/loyalty/domain/models/UserChannelsMediaDomain;", "getUserChannels-gIAlu-s", "getUserChannels", "channelId", "getOtp-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "getOtp", "otpCode", "validationOtpCode-0E7RQCE", "validationOtpCode", "newSecretCode", "updateSecretCode-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "updateSecretCode", "storeRef", "", "isExpireDetail", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyListTransactionsDomain;", "getUserTransactions-0E7RQCE", "(Ljava/lang/String;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "getUserTransactions", "requestedDate", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyCardOperationHistoryDomain;", "getFidHistory-gIAlu-s", "getFidHistory", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface ILoyaltyRepository {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class DefaultImpls {
        /* renamed from: getUserTransactions-0E7RQCE$default  reason: not valid java name */
        public static /* synthetic */ Object m173088getUserTransactions0E7RQCE$default(ILoyaltyRepository iLoyaltyRepository, String str, boolean z, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = LoyaltyConstantsKt.LOYALTY_STORE_ID_HEADER_PARAMS;
                }
                if ((i & 2) != 0) {
                    z = true;
                }
                return iLoyaltyRepository.m173084getUserTransactions0E7RQCE(str, z, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserTransactions-0E7RQCE");
        }
    }

    @C12580l
    /* renamed from: activeFidAdhesionEasy-0E7RQCE  reason: not valid java name */
    Object m173077activeFidAdhesionEasy0E7RQCE(@C12580l BffCreateOrAttachCardBody bffCreateOrAttachCardBody, @C12579k String str, @C12579k C11045c<? super Result<C11079d2>> cVar);

    @C12580l
    /* renamed from: createLoyaltyCard-gIAlu-s  reason: not valid java name */
    Object m173078createLoyaltyCardgIAlus(@C12580l BffCreateOrAttachCardBody bffCreateOrAttachCardBody, @C12579k C11045c<? super Result<C11079d2>> cVar);

    @C12580l
    /* renamed from: getFidHistory-gIAlu-s  reason: not valid java name */
    Object m173079getFidHistorygIAlus(@C12579k String str, @C12579k C11045c<? super Result<? extends List<LoyaltyCardOperationHistoryDomain>>> cVar);

    @C12580l
    /* renamed from: getLoyaltyBalance-gIAlu-s  reason: not valid java name */
    Object m173080getLoyaltyBalancegIAlus(@C12579k String str, @C12579k C11045c<? super Result<LoyaltyBalanceResponse>> cVar);

    @C12580l
    /* renamed from: getLoyaltyClubs-gIAlu-s  reason: not valid java name */
    Object m173081getLoyaltyClubsgIAlus(@C12579k String str, @C12579k C11045c<? super Result<? extends List<ClubsResponse>>> cVar);

    @C12580l
    /* renamed from: getOtp-0E7RQCE  reason: not valid java name */
    Object m173082getOtp0E7RQCE(@C12579k String str, @C12579k String str2, @C12579k C11045c<? super Result<String>> cVar);

    @C12580l
    /* renamed from: getUserChannels-gIAlu-s  reason: not valid java name */
    Object m173083getUserChannelsgIAlus(@C12579k String str, @C12579k C11045c<? super Result<? extends List<UserChannelsMediaDomain>>> cVar);

    @C12580l
    /* renamed from: getUserTransactions-0E7RQCE  reason: not valid java name */
    Object m173084getUserTransactions0E7RQCE(@C12579k String str, boolean z, @C12579k C11045c<? super Result<LoyaltyListTransactionsDomain>> cVar);

    @C12580l
    /* renamed from: putMidFidClub-0E7RQCE  reason: not valid java name */
    Object m173085putMidFidClub0E7RQCE(@C12579k String str, @C12579k PrimeMidFidBody primeMidFidBody, @C12579k C11045c<? super Result<String>> cVar);

    @C12580l
    /* renamed from: updateSecretCode-BWLJW6A  reason: not valid java name */
    Object m173086updateSecretCodeBWLJW6A(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k C11045c<? super Result<String>> cVar);

    @C12580l
    /* renamed from: validationOtpCode-0E7RQCE  reason: not valid java name */
    Object m173087validationOtpCode0E7RQCE(@C12579k String str, @C12579k String str2, @C12579k C11045c<? super Result<String>> cVar);
}
