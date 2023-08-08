package com.carrefour.fid.android.bff_data_shared.data.api.services;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffComplementaryProductsResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFrequentlyPurchasedResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPdpResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPlpResponseV2;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSubstitutedProductsResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSuggestedProducts;
import com.carrefour.fid.android.shared.constant.C28561l1;
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

@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JA\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ}\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018Jñ\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00072\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\u0010\b\u0003\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014H§@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"Jq\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b)\u0010*Ju\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00072\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u0002\u0004\n\u0002\b\u0019¨\u0006."}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/services/BffProductsManagementApi;", "", "", "authorization", "accessToken", "storeService", "complementaryTo", "Lretrofit2/w;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffComplementaryProductsResponse;", "getComplementaryProductsResponse", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFrequentlyPurchasedResponse;", "getFrequentlyPurchasedProducts", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "xSessionID", "xCorrelationID", "xForwardedFor", "gtin", "availabilitySlot", "store", "", "storeServices", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPdpResponse;", "getPdpProducts", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "query", "queryGroup", "page", "size", "filter", "text", "sort", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPlpResponseV2;", "getPlpProducts", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "substituteFor", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSubstitutedProductsResponse;", "getSubstitutedProduct", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "loyaltyCardId", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSuggestedProducts;", "getSuggestedProducts", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPlpResponse;", "getAlternativeProducts", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public interface BffProductsManagementApi {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getAlternativeProducts$default(BffProductsManagementApi bffProductsManagementApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C11045c cVar, int i, Object obj) {
            int i2 = i;
            if (obj == null) {
                return bffProductsManagementApi.getAlternativeProducts((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, str3, str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : str8, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAlternativeProducts");
        }

        public static /* synthetic */ Object getPdpProducts$default(BffProductsManagementApi bffProductsManagementApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, C11045c cVar, int i, Object obj) {
            int i2 = i;
            if (obj == null) {
                return bffProductsManagementApi.getPdpProducts((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : list, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPdpProducts");
        }

        public static /* synthetic */ Object getPlpProducts$default(BffProductsManagementApi bffProductsManagementApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, String str12, List list2, List list3, List list4, C11045c cVar, int i, Object obj) {
            int i2 = i;
            if (obj == null) {
                return bffProductsManagementApi.getPlpProducts((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? null : str8, (i2 & 256) != 0 ? "0" : str9, (i2 & 512) != 0 ? C28561l1.f69523p : str10, (i2 & 1024) != 0 ? null : list, (i2 & 2048) != 0 ? null : str11, (i2 & 4096) != 0 ? null : str12, (i2 & 8192) != 0 ? null : list2, (i2 & 16384) != 0 ? null : list3, (i2 & 32768) != 0 ? null : list4, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlpProducts");
        }

        public static /* synthetic */ Object getSubstitutedProduct$default(BffProductsManagementApi bffProductsManagementApi, String str, String str2, String str3, String str4, String str5, List list, String str6, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                return bffProductsManagementApi.getSubstitutedProduct((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str6, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSubstitutedProduct");
        }

        public static /* synthetic */ Object getSuggestedProducts$default(BffProductsManagementApi bffProductsManagementApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, C11045c cVar, int i, Object obj) {
            int i2 = i;
            if (obj == null) {
                return bffProductsManagementApi.getSuggestedProducts(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, str6, str7, list, (i2 & 256) != 0 ? null : str8, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSuggestedProducts");
        }
    }

    @C12580l
    @C13027f("products/{gtin}/alternatives")
    Object getAlternativeProducts(@C12580l @C13030i("authorization") String str, @C12580l @C13030i("access-token") String str2, @C13040s("gtin") @C12579k String str3, @C13041t("store_service") @C12579k String str4, @C12580l @C13030i("X-Session-ID") String str5, @C12580l @C13030i("X-Correlation-ID") String str6, @C12580l @C13030i("X-Forwarded-For") String str7, @C12580l @C13041t("size") String str8, @C12579k C11045c<? super C13091w<BffPlpResponse>> cVar);

    @C12580l
    @C13027f("products/complementary_products")
    Object getComplementaryProductsResponse(@C12579k @C13030i("authorization") String str, @C12579k @C13030i("access-token") String str2, @C13041t("store_service") @C12579k String str3, @C13041t("complementary_to") @C12579k String str4, @C12579k C11045c<? super C13091w<BffComplementaryProductsResponse>> cVar);

    @C12580l
    @C13027f("products/frequently_purchased_products")
    Object getFrequentlyPurchasedProducts(@C12579k @C13030i("authorization") String str, @C12579k @C13030i("access-token") String str2, @C13041t("store_service") @C12579k String str3, @C12579k C11045c<? super C13091w<BffFrequentlyPurchasedResponse>> cVar);

    @C12580l
    @C13027f("products/{gtin}")
    Object getPdpProducts(@C12580l @C13030i("X-Session-ID") String str, @C12580l @C13030i("X-Correlation-ID") String str2, @C12580l @C13030i("X-Forwarded-For") String str3, @C13040s("gtin") @C12579k String str4, @C12580l @C13041t("availability_slot") String str5, @C12580l @C13041t("store_service") String str6, @C12580l @C13041t("store") String str7, @C12580l @C13041t("store_services") List<String> list, @C12579k C11045c<? super C13091w<BffPdpResponse>> cVar);

    @C12580l
    @C13027f("products/search")
    Object getPlpProducts(@C12580l @C13030i("Authorization") String str, @C12580l @C13030i("X-Session-ID") String str2, @C12580l @C13030i("X-Correlation-ID") String str3, @C12580l @C13030i("X-Forwarded-For") String str4, @C12580l @C13041t("store") String str5, @C12580l @C13041t("store_service") String str6, @C12580l @C13041t("query") String str7, @C12580l @C13041t("query_group") String str8, @C12580l @C13041t("page") String str9, @C12580l @C13041t("size") String str10, @C12580l @C13041t("filter") List<String> list, @C12580l @C13041t("availability_slot") String str11, @C12580l @C13041t("text") String str12, @C12580l @C13041t("sort") List<String> list2, @C12580l @C13041t("gtin") List<String> list3, @C12580l @C13041t("store_services") List<String> list4, @C12579k C11045c<? super C13091w<BffPlpResponseV2>> cVar);

    @C12580l
    @C13027f("products/substituted_products")
    Object getSubstitutedProduct(@C12580l @C13030i("X-Session-ID") String str, @C12580l @C13030i("X-Correlation-ID") String str2, @C12580l @C13030i("X-Forwarded-For") String str3, @C13041t("store_service") @C12579k String str4, @C12580l @C13041t("store") String str5, @C12580l @C13041t("substitute_for") List<String> list, @C12580l @C13041t("availability_slot") String str6, @C12579k C11045c<? super C13091w<BffSubstitutedProductsResponse>> cVar);

    @C12580l
    @C13027f("products/suggested_products")
    Object getSuggestedProducts(@C12579k @C13030i("access-token") String str, @C12580l @C13030i("Loyalty-card-Id") String str2, @C12580l @C13030i("X-Session-ID") String str3, @C12580l @C13030i("X-Correlation-ID") String str4, @C12580l @C13030i("X-Forwarded-For") String str5, @C13041t("store_service") @C12579k String str6, @C13041t("store") @C12579k String str7, @C13041t("text") @C12579k List<String> list, @C12580l @C13041t("availability_slot") String str8, @C12579k C11045c<? super C13091w<BffSuggestedProducts>> cVar);
}
