package com.carrefour.fid.android.bff_data_shared.data.api.services;

import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCarouselResponseEnvelop;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLegalPagesEnvelop;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLoyaltyPrimeTypesResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffMobilePagesResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPointDataResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSearchSuggestionsResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSecureTokenResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSponsoredItemsResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSpotLightEnvelope;
import com.carrefour.fid.android.shared.constant.C28561l1;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13027f;
import retrofit2.http.C13030i;
import retrofit2.http.C13031j;
import retrofit2.http.C13040s;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JQ\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJU\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000bJO\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\u0010\b\u0003\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000fJs\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\b\b\u0001\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b \u0010!JQ\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\b2\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u000bJ×\u0001\u00102\u001a\b\u0012\u0004\u0012\u0002010\b2\u0014\b\u0001\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b2\u00103JQ\u00106\u001a\b\u0012\u0004\u0012\u0002050\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u00104\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b6\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u00067"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/services/BffUtilitiesManagementApi;", "", "", "longitude", "latitude", "xSessionID", "xCorrelationID", "xForwardedFor", "Lretrofit2/w;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPointDataResponse;", "getAllPickupPoints", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "metiRef", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCarouselResponseEnvelop;", "getCmsCarousel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "slug", "page", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLegalPagesEnvelop;", "getCmsLegalPages", "", "id", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLoyaltyPrimeTypesResponse;", "getCmsLoyaltyPrimeTypes", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffMobilePagesResponse;", "getCmsMobilePages", "storeService", "store", "text", "size", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSearchSuggestionsResponse;", "getSearchSuggestion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "accessToken", "partner", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSecureTokenResponse;", "getSecureTokenSTS", "", "criteoHeaders", "authorization", "luckycartCustomerId", "luckycartPageId", "luckycartBannerId", "luckycartStore", "luckycartStoreType", "criteo", "luckycart", "availabilitySlot", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSponsoredItemsResponse;", "getSponsoredItems", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "version", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSpotLightEnvelope;", "getSpotLight", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface BffUtilitiesManagementApi {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getAllPickupPoints$default(BffUtilitiesManagementApi bffUtilitiesManagementApi, String str, String str2, String str3, String str4, String str5, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffUtilitiesManagementApi.getAllPickupPoints(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllPickupPoints");
        }

        public static /* synthetic */ Object getCmsCarousel$default(BffUtilitiesManagementApi bffUtilitiesManagementApi, String str, String str2, String str3, String str4, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffUtilitiesManagementApi.getCmsCarousel(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCmsCarousel");
        }

        public static /* synthetic */ Object getCmsLegalPages$default(BffUtilitiesManagementApi bffUtilitiesManagementApi, String str, String str2, String str3, String str4, String str5, C11045c cVar, int i, Object obj) {
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == null) {
                if ((i & 1) != 0) {
                    str6 = null;
                } else {
                    str6 = str;
                }
                if ((i & 2) != 0) {
                    str7 = "0";
                } else {
                    str7 = str2;
                }
                if ((i & 4) != 0) {
                    str8 = null;
                } else {
                    str8 = str3;
                }
                if ((i & 8) != 0) {
                    str9 = null;
                } else {
                    str9 = str4;
                }
                if ((i & 16) != 0) {
                    str10 = null;
                } else {
                    str10 = str5;
                }
                return bffUtilitiesManagementApi.getCmsLegalPages(str6, str7, str8, str9, str10, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCmsLegalPages");
        }

        public static /* synthetic */ Object getCmsLoyaltyPrimeTypes$default(BffUtilitiesManagementApi bffUtilitiesManagementApi, List list, String str, String str2, String str3, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffUtilitiesManagementApi.getCmsLoyaltyPrimeTypes((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCmsLoyaltyPrimeTypes");
        }

        public static /* synthetic */ Object getCmsMobilePages$default(BffUtilitiesManagementApi bffUtilitiesManagementApi, String str, String str2, String str3, String str4, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffUtilitiesManagementApi.getCmsMobilePages(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCmsMobilePages");
        }

        public static /* synthetic */ Object getSearchSuggestion$default(BffUtilitiesManagementApi bffUtilitiesManagementApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C11045c cVar, int i, Object obj) {
            String str9;
            String str10;
            String str11;
            String str12;
            int i2 = i;
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    str9 = "0";
                } else {
                    str9 = str4;
                }
                String str13 = (i2 & 16) != 0 ? C28561l1.f69523p : str5;
                if ((i2 & 32) != 0) {
                    str10 = null;
                } else {
                    str10 = str6;
                }
                if ((i2 & 64) != 0) {
                    str11 = null;
                } else {
                    str11 = str7;
                }
                if ((i2 & 128) != 0) {
                    str12 = null;
                } else {
                    str12 = str8;
                }
                return bffUtilitiesManagementApi.getSearchSuggestion(str, str2, str3, str9, str13, str10, str11, str12, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchSuggestion");
        }

        public static /* synthetic */ Object getSecureTokenSTS$default(BffUtilitiesManagementApi bffUtilitiesManagementApi, String str, String str2, String str3, String str4, String str5, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffUtilitiesManagementApi.getSecureTokenSTS(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSecureTokenSTS");
        }

        public static /* synthetic */ Object getSponsoredItems$default(BffUtilitiesManagementApi bffUtilitiesManagementApi, Map map, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, C11045c cVar, int i, Object obj) {
            int i2 = i;
            if (obj == null) {
                return bffUtilitiesManagementApi.getSponsoredItems(map, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? null : str9, (i2 & 1024) != 0 ? C13758b.f33438c : str10, (i2 & 2048) != 0 ? C13758b.f33438c : str11, (i2 & 4096) != 0 ? null : str12, (i2 & 8192) != 0 ? null : str13, (i2 & 16384) != 0 ? null : str14, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSponsoredItems");
        }

        public static /* synthetic */ Object getSpotLight$default(BffUtilitiesManagementApi bffUtilitiesManagementApi, String str, String str2, String str3, String str4, String str5, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffUtilitiesManagementApi.getSpotLight(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSpotLight");
        }
    }

    @C12580l
    @C13027f("utilities/pickup_points")
    Object getAllPickupPoints(@C13041t("longitude") @C12579k String str, @C13041t("latitude") @C12579k String str2, @C12580l @C13030i("X-Session-ID") String str3, @C12580l @C13030i("X-Correlation-ID") String str4, @C12580l @C13030i("X-Forwarded-For") String str5, @C12579k C11045c<? super C13091w<BffPickupPointDataResponse>> cVar);

    @C12580l
    @C13027f("utilities/carousel/{meti_ref}")
    Object getCmsCarousel(@C13040s("meti_ref") @C12579k String str, @C12580l @C13030i("X-Session-ID") String str2, @C12580l @C13030i("X-Correlation-ID") String str3, @C12580l @C13030i("X-Forwarded-For") String str4, @C12579k C11045c<? super C13091w<BffCarouselResponseEnvelop>> cVar);

    @C12580l
    @C13027f("utilities/legal_pages")
    Object getCmsLegalPages(@C12580l @C13041t("slug") String str, @C12580l @C13041t("page") String str2, @C12580l @C13030i("X-Session-ID") String str3, @C12580l @C13030i("X-Correlation-ID") String str4, @C12580l @C13030i("X-Forwarded-For") String str5, @C12579k C11045c<? super C13091w<BffLegalPagesEnvelop>> cVar);

    @C12580l
    @C13027f("utilities/loyalty_prime_types")
    Object getCmsLoyaltyPrimeTypes(@C12580l @C13041t("id") List<String> list, @C12580l @C13030i("X-Session-ID") String str, @C12580l @C13030i("X-Correlation-ID") String str2, @C12580l @C13030i("X-Forwarded-For") String str3, @C12579k C11045c<? super C13091w<BffLoyaltyPrimeTypesResponse>> cVar);

    @C12580l
    @C13027f("utilities/mobile_pages/{meti_ref}")
    Object getCmsMobilePages(@C13040s("meti_ref") @C12579k String str, @C12580l @C13030i("X-Session-ID") String str2, @C12580l @C13030i("X-Correlation-ID") String str3, @C12580l @C13030i("X-Forwarded-For") String str4, @C12579k C11045c<? super C13091w<BffMobilePagesResponse>> cVar);

    @C12580l
    @C13027f("utilities/search_suggestions")
    Object getSearchSuggestion(@C13041t("store_service") @C12579k String str, @C13041t("store") @C12579k String str2, @C13041t("text") @C12579k String str3, @C12580l @C13041t("page") String str4, @C12580l @C13041t("size") String str5, @C12580l @C13030i("X-Session-ID") String str6, @C12580l @C13030i("X-Correlation-ID") String str7, @C12580l @C13030i("X-Forwarded-For") String str8, @C12579k C11045c<? super C13091w<BffSearchSuggestionsResponse>> cVar);

    @C12580l
    @C13027f("utilities/secure_token")
    Object getSecureTokenSTS(@C12579k @C13030i("access-token") String str, @C13041t("partner") @C12579k String str2, @C12580l @C13030i("X-Session-ID") String str3, @C12580l @C13030i("X-Correlation-ID") String str4, @C12580l @C13030i("X-Forwarded-For") String str5, @C12579k C11045c<? super C13091w<BffSecureTokenResponse>> cVar);

    @C12580l
    @C13027f("utilities/sponsored_items")
    Object getSponsoredItems(@C12579k @C13031j Map<String, String> map, @C12580l @C13030i("Authorization") String str, @C12580l @C13030i("X-Session-ID") String str2, @C12580l @C13030i("X-Correlation-ID") String str3, @C12580l @C13030i("X-Forwarded-For") String str4, @C12580l @C13030i("luckycart-customer-id") String str5, @C12580l @C13030i("luckycart-page-id") String str6, @C12580l @C13030i("luckycart-banner-id") String str7, @C12580l @C13030i("luckycart-store") String str8, @C12580l @C13030i("luckycart-store-type") String str9, @C12580l @C13041t("criteo") String str10, @C12580l @C13041t("luckycart") String str11, @C12580l @C13041t("availability_slot") String str12, @C12580l @C13041t("store_service") String str13, @C12580l @C13041t("store") String str14, @C12579k C11045c<? super C13091w<BffSponsoredItemsResponse>> cVar);

    @C12580l
    @C13027f("utilities/spotlight/{meti_ref}")
    Object getSpotLight(@C13040s("meti_ref") @C12579k String str, @C12579k @C13030i("version") String str2, @C12580l @C13030i("X-Session-ID") String str3, @C12580l @C13030i("X-Correlation-ID") String str4, @C12580l @C13030i("X-Forwarded-For") String str5, @C12579k C11045c<? super C13091w<BffSpotLightEnvelope>> cVar);
}
