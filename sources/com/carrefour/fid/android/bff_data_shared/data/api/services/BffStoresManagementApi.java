package com.carrefour.fid.android.bff_data_shared.data.api.services;

import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCategoryTreeResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDriveOmrAvailability;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffEligibilityDataResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilitiesSearchEnvelop;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityResponseEnvelope;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlotDetailsEnvelop;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlotExpressDataResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSlotsDataResponse;
import com.carrefour.fid.android.core.constants.C36187r;
import com.carrefour.fid.android.shared.constant.C28561l1;
import java.math.BigDecimal;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13027f;
import retrofit2.http.C13030i;
import retrofit2.http.C13040s;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JG\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJG\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J[\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ±\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010#\u001a\u0004\u0018\u00010 2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b)\u0010*Ji\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b,\u0010-JA\u0010/\u001a\u00020.2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b/\u0010\nJQ\u00100\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b0\u0010\u001f\u0002\u0004\n\u0002\b\u0019¨\u00061"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/services/BffStoresManagementApi;", "", "", "storeServices", "xSessionID", "xCorrelationID", "xForwardedFor", "Lretrofit2/w;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCategoryTreeResponse;", "getCategoryTreeWithStoreServices", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "storeId", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacilityResponseEnvelope;", "getStore", "longitude", "latitude", "radius", "", "serviceTypes", "page", "size", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacilitiesSearchEnvelop;", "searchStore", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "storeServiceId", "slotId", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlotDetailsEnvelop;", "getSlotDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlotExpressDataResponse;", "getSlotExpress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Ljava/math/BigDecimal;", "basketTotalAmount", "basketId", "maxDeliveryCost", "", "productCount", "isAvailable", "status", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSlotsDataResponse;", "getSlots", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffEligibilityDataResponse;", "getEligibility", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDriveOmrAvailability;", "getDriveAvailability", "getCategoryTree", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface BffStoresManagementApi {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getCategoryTree$default(BffStoresManagementApi bffStoresManagementApi, String str, String str2, String str3, String str4, String str5, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffStoresManagementApi.getCategoryTree(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCategoryTree");
        }

        public static /* synthetic */ Object getCategoryTreeWithStoreServices$default(BffStoresManagementApi bffStoresManagementApi, String str, String str2, String str3, String str4, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffStoresManagementApi.getCategoryTreeWithStoreServices(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCategoryTreeWithStoreServices");
        }

        public static /* synthetic */ Object getDriveAvailability$default(BffStoresManagementApi bffStoresManagementApi, String str, String str2, String str3, String str4, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffStoresManagementApi.getDriveAvailability(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDriveAvailability");
        }

        public static /* synthetic */ Object getEligibility$default(BffStoresManagementApi bffStoresManagementApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffStoresManagementApi.getEligibility(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEligibility");
        }

        public static /* synthetic */ Object getSlotDetails$default(BffStoresManagementApi bffStoresManagementApi, String str, String str2, String str3, String str4, String str5, String str6, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffStoresManagementApi.getSlotDetails(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSlotDetails");
        }

        public static /* synthetic */ Object getSlotExpress$default(BffStoresManagementApi bffStoresManagementApi, String str, String str2, String str3, String str4, String str5, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffStoresManagementApi.getSlotExpress(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSlotExpress");
        }

        public static /* synthetic */ Object getSlots$default(BffStoresManagementApi bffStoresManagementApi, String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, BigDecimal bigDecimal2, Integer num, String str6, String str7, String str8, String str9, String str10, C11045c cVar, int i, Object obj) {
            int i2 = i;
            if (obj == null) {
                return bffStoresManagementApi.getSlots(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : bigDecimal, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : bigDecimal2, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? C13758b.f33436b : str6, (i2 & 512) != 0 ? C36187r.f89350a : str7, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : str9, (i2 & 4096) != 0 ? null : str10, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSlots");
        }

        public static /* synthetic */ Object getStore$default(BffStoresManagementApi bffStoresManagementApi, String str, String str2, String str3, String str4, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffStoresManagementApi.getStore(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStore");
        }

        public static /* synthetic */ Object searchStore$default(BffStoresManagementApi bffStoresManagementApi, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, C11045c cVar, int i, Object obj) {
            String str9;
            List list2;
            String str10;
            String str11;
            String str12;
            String str13;
            int i2 = i;
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str9 = null;
                } else {
                    str9 = str3;
                }
                if ((i2 & 8) != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if ((i2 & 16) != 0) {
                    str10 = "0";
                } else {
                    str10 = str4;
                }
                String str14 = (i2 & 32) != 0 ? C28561l1.f69523p : str5;
                if ((i2 & 64) != 0) {
                    str11 = null;
                } else {
                    str11 = str6;
                }
                if ((i2 & 128) != 0) {
                    str12 = null;
                } else {
                    str12 = str7;
                }
                if ((i2 & 256) != 0) {
                    str13 = null;
                } else {
                    str13 = str8;
                }
                return bffStoresManagementApi.searchStore(str, str2, str9, list2, str10, str14, str11, str12, str13, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchStore");
        }
    }

    @C12580l
    @C13027f("{store_id}/services/{store_service_id}/categories")
    Object getCategoryTree(@C13040s("store_id") @C12579k String str, @C13040s("store_service_id") @C12579k String str2, @C12580l @C13030i("X-Session-ID") String str3, @C12580l @C13030i("X-Correlation-ID") String str4, @C12580l @C13030i("X-Forwarded-For") String str5, @C12579k C11045c<? super C13091w<BffCategoryTreeResponse>> cVar);

    @C12580l
    @C13027f("categories")
    Object getCategoryTreeWithStoreServices(@C13041t("store_services") @C12579k String str, @C12580l @C13030i("X-Session-ID") String str2, @C12580l @C13030i("X-Correlation-ID") String str3, @C12580l @C13030i("X-Forwarded-For") String str4, @C12579k C11045c<? super C13091w<BffCategoryTreeResponse>> cVar);

    @C12580l
    @C13027f("service/{store_service_id}/availability")
    Object getDriveAvailability(@C13040s("store_service_id") @C12579k String str, @C12580l @C13030i("X-Session-ID") String str2, @C12580l @C13030i("X-Correlation-ID") String str3, @C12580l @C13030i("X-Forwarded-For") String str4, @C12579k C11045c<? super BffDriveOmrAvailability> cVar);

    @C12580l
    @C13027f("{store_id}/services/{store_service_id}/eligibility")
    Object getEligibility(@C13040s("store_id") @C12579k String str, @C13040s("store_service_id") @C12579k String str2, @C12580l @C13041t("latitude") String str3, @C12580l @C13041t("longitude") String str4, @C12580l @C13030i("X-Session-ID") String str5, @C12580l @C13030i("X-Correlation-ID") String str6, @C12580l @C13030i("X-Forwarded-For") String str7, @C12579k C11045c<? super C13091w<BffEligibilityDataResponse>> cVar);

    @C12580l
    @C13027f("{store_id}/services/{store_service_id}/slots/{slot_id}")
    Object getSlotDetails(@C13040s("store_id") @C12579k String str, @C13040s("store_service_id") @C12579k String str2, @C13040s("slot_id") @C12579k String str3, @C12580l @C13030i("X-Session-ID") String str4, @C12580l @C13030i("X-Correlation-ID") String str5, @C12580l @C13030i("X-Forwarded-For") String str6, @C12579k C11045c<? super C13091w<BffSlotDetailsEnvelop>> cVar);

    @C12580l
    @C13027f("{store_id}/services/{store_service_id}/slot_express")
    Object getSlotExpress(@C13040s("store_id") @C12579k String str, @C13040s("store_service_id") @C12579k String str2, @C12580l @C13030i("X-Session-ID") String str3, @C12580l @C13030i("X-Correlation-ID") String str4, @C12580l @C13030i("X-Forwarded-For") String str5, @C12579k C11045c<? super C13091w<BffSlotExpressDataResponse>> cVar);

    @C12580l
    @C13027f("{store_id}/services/{store_service_id}/slots")
    Object getSlots(@C13040s("store_id") @C12579k String str, @C13040s("store_service_id") @C12579k String str2, @C12580l @C13041t("latitude") String str3, @C12580l @C13041t("longitude") String str4, @C12580l @C13041t("basket_total_amount") BigDecimal bigDecimal, @C12580l @C13041t("basket_id") String str5, @C12580l @C13041t("max_delivery_cost") BigDecimal bigDecimal2, @C12580l @C13041t("product_count") Integer num, @C12580l @C13041t("is_available") String str6, @C12580l @C13041t("status") String str7, @C12580l @C13030i("X-Session-ID") String str8, @C12580l @C13030i("X-Correlation-ID") String str9, @C12580l @C13030i("X-Forwarded-For") String str10, @C12579k C11045c<? super C13091w<BffSlotsDataResponse>> cVar);

    @C12580l
    @C13027f("{store_id}")
    Object getStore(@C13040s("store_id") @C12579k String str, @C12580l @C13030i("X-Session-ID") String str2, @C12580l @C13030i("X-Correlation-ID") String str3, @C12580l @C13030i("X-Forwarded-For") String str4, @C12579k C11045c<? super C13091w<BffFacilityResponseEnvelope>> cVar);

    @C12580l
    @C13027f
    Object searchStore(@C13041t("longitude") @C12579k String str, @C13041t("latitude") @C12579k String str2, @C12580l @C13041t("radius") String str3, @C12580l @C13041t("service_types") List<String> list, @C12580l @C13041t("page") String str4, @C12580l @C13041t("size") String str5, @C12580l @C13030i("X-Session-ID") String str6, @C12580l @C13030i("X-Correlation-ID") String str7, @C12580l @C13030i("X-Forwarded-For") String str8, @C12579k C11045c<? super C13091w<BffFacilitiesSearchEnvelop>> cVar);
}
