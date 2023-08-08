package com.carrefour.fid.android.basket.data.api.services;

import com.carrefour.fid.android.basket.data.api.entities.p022v4.request.AddPromoRequest;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.request.BasketYieldFeesRequest;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.request.BookUnBookSlotRequest;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.request.FacilityServiceRequest;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.request.ShippingTypeRequest;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.request.SwitchFacilityServiceRequest;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.request.SynchronizeBasketRequest;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.request.UpdateOfferRequest;
import com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketListResponse;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13022a;
import retrofit2.http.C13023b;
import retrofit2.http.C13027f;
import retrofit2.http.C13031j;
import retrofit2.http.C13036o;
import retrofit2.http.C13037p;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\u0013H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JM\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\u001fH§@ø\u0001\u0000¢\u0006\u0004\b \u0010!J9\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\"H§@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J9\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0012J/\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b&\u0010\bJ9\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020'H§@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J9\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020*H§@ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/services/a;", "", "", "", "headerMap", "Lretrofit2/w;", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketListResponse;", "g", "(Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/FacilityServiceRequest;", "body", "j", "(Ljava/util/Map;Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/FacilityServiceRequest;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/SynchronizeBasketRequest;", "a", "(Ljava/util/Map;Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/SynchronizeBasketRequest;Lkotlin/coroutines/c;)Ljava/lang/Object;", "subBasketIds", "h", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/UpdateOfferRequest;", "k", "(Ljava/util/Map;Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/UpdateOfferRequest;Lkotlin/coroutines/c;)Ljava/lang/Object;", "gtin", "subBasketId", "", "synchronize", "f", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/BookUnBookSlotRequest;", "e", "(Ljava/util/Map;Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/BookUnBookSlotRequest;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/SwitchFacilityServiceRequest;", "d", "(Ljava/util/Map;Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/SwitchFacilityServiceRequest;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/AddPromoRequest;", "m", "(Ljava/util/Map;Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/AddPromoRequest;Lkotlin/coroutines/c;)Ljava/lang/Object;", "c", "i", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/BasketYieldFeesRequest;", "l", "(Ljava/util/Map;Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/BasketYieldFeesRequest;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/ShippingTypeRequest;", "b", "(Ljava/util/Map;Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/ShippingTypeRequest;Lkotlin/coroutines/c;)Ljava/lang/Object;", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.basket.data.api.services.a */
public interface C13881a {
    @C12580l
    @C13037p("retail/v4/mof/basket_management/baskets/me")
    /* renamed from: a */
    Object mo33208a(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a SynchronizeBasketRequest synchronizeBasketRequest, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);

    @C12580l
    @C13037p("retail/v4/mof/basket_management/baskets/me/shipping_types")
    /* renamed from: b */
    Object mo33209b(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a ShippingTypeRequest shippingTypeRequest, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);

    @C12580l
    @C13023b("retail/v4/mof/basket_management/baskets/me/promo_code")
    /* renamed from: c */
    Object mo33210c(@C12579k @C13031j Map<String, String> map, @C13041t("sub_basket_id") @C12579k String str, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);

    @C12580l
    @C13037p("retail/v4/mof/basket_management/baskets/me/facility_service")
    /* renamed from: d */
    Object mo33211d(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a SwitchFacilityServiceRequest switchFacilityServiceRequest, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);

    @C12580l
    @C13037p("retail/v4/mof/basket_management/baskets/me/slot")
    /* renamed from: e */
    Object mo33212e(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a BookUnBookSlotRequest bookUnBookSlotRequest, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);

    @C12580l
    @C13023b("retail/v4/mof/basket_management/baskets/me/offers")
    /* renamed from: f */
    Object mo33213f(@C12579k @C13031j Map<String, String> map, @C13041t("gtin") @C12579k String str, @C13041t("sub_basket_id") @C12579k String str2, @C13041t("synchronize") boolean z, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);

    @C12580l
    @C13027f("retail/v4/mof/basket_management/baskets/me")
    /* renamed from: g */
    Object mo33214g(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);

    @C12580l
    @C13023b("retail/v4/mof/basket_management/baskets/me")
    /* renamed from: h */
    Object mo33215h(@C12579k @C13031j Map<String, String> map, @C13041t("sub_basket_ids") @C12579k String str, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);

    @C12580l
    @C13023b("retail/v4/mof/basket_management/baskets/me/yield_fees")
    /* renamed from: i */
    Object mo33216i(@C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);

    @C13036o("retail/v4/mof/basket_management/baskets/me")
    @C12580l
    /* renamed from: j */
    Object mo33217j(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a FacilityServiceRequest facilityServiceRequest, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);

    @C12580l
    @C13037p("retail/v4/mof/basket_management/baskets/me/offers")
    /* renamed from: k */
    Object mo33218k(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a UpdateOfferRequest updateOfferRequest, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);

    @C12580l
    @C13037p("retail/v4/mof/basket_management/baskets/me/yield_fees")
    /* renamed from: l */
    Object mo33219l(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a BasketYieldFeesRequest basketYieldFeesRequest, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);

    @C12580l
    @C13037p("retail/v4/mof/basket_management/baskets/me/promo_code")
    /* renamed from: m */
    Object mo33220m(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a AddPromoRequest addPromoRequest, @C12579k C11045c<? super C13091w<BasketListResponse>> cVar);
}
