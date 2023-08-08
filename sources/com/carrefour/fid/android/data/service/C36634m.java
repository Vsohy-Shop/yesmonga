package com.carrefour.fid.android.data.service;

import com.carrefour.fid.android.data.entities.ConfirmPaymentRequestBody;
import com.carrefour.fid.android.data.entities.ConfirmPaymentResponse;
import com.carrefour.fid.android.data.entities.CreateOrderBody;
import com.carrefour.fid.android.data.entities.InitPaymentResponse;
import com.carrefour.fid.android.data.entities.InitiatePaymentOrderBody;
import com.carrefour.fid.android.data.entities.OrderV3;
import com.carrefour.fid.android.data.entities.OrdersResponse;
import com.carrefour.fid.android.data.entities.UpdateAddressBody;
import com.carrefour.fid.android.data.entities.ValidatePaymentBody;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13022a;
import retrofit2.http.C13027f;
import retrofit2.http.C13031j;
import retrofit2.http.C13036o;
import retrofit2.http.C13037p;
import retrofit2.http.C13040s;

@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ9\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0010H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0013H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0017H§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/service/m;", "", "", "", "headers", "Lcom/carrefour/fid/android/data/entities/InitiatePaymentOrderBody;", "body", "Lretrofit2/w;", "Lcom/carrefour/fid/android/data/entities/InitPaymentResponse;", "f", "(Ljava/util/Map;Lcom/carrefour/fid/android/data/entities/InitiatePaymentOrderBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/entities/ConfirmPaymentRequestBody;", "Lcom/carrefour/fid/android/data/entities/ConfirmPaymentResponse;", "a", "(Ljava/util/Map;Lcom/carrefour/fid/android/data/entities/ConfirmPaymentRequestBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "orderId", "Lcom/carrefour/fid/android/data/entities/ValidatePaymentBody;", "d", "(Ljava/util/Map;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/ValidatePaymentBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/entities/CreateOrderBody;", "Lcom/carrefour/fid/android/data/entities/OrdersResponse;", "b", "(Ljava/util/Map;Lcom/carrefour/fid/android/data/entities/CreateOrderBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/entities/UpdateAddressBody;", "Lkotlin/d2;", "c", "(Ljava/util/Map;Lcom/carrefour/fid/android/data/entities/UpdateAddressBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/entities/OrderV3;", "e", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.data.service.m */
public interface C36634m {
    @C12580l
    @C13037p("retail/v3/mof/checkout_management/checkout/me/payments")
    /* renamed from: a */
    Object mo111655a(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a ConfirmPaymentRequestBody confirmPaymentRequestBody, @C12579k C11045c<? super C13091w<ConfirmPaymentResponse>> cVar);

    @C13036o("retail/v3/mof/one_orders/orders/me")
    @C12580l
    /* renamed from: b */
    Object mo111656b(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a CreateOrderBody createOrderBody, @C12579k C11045c<? super C13091w<OrdersResponse>> cVar);

    @C12580l
    @C13037p("retail/v3/mof/one_orders/orders/me/customer-contact")
    /* renamed from: c */
    Object mo111657c(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a UpdateAddressBody updateAddressBody, @C12579k C11045c<? super C13091w<C11079d2>> cVar);

    @C12580l
    @C13037p("retail/v3/mof/checkout_management/checkout/me/payments/{orderId}")
    /* renamed from: d */
    Object mo111658d(@C12579k @C13031j Map<String, String> map, @C13040s("orderId") @C12579k String str, @C12579k @C13022a ValidatePaymentBody validatePaymentBody, @C12579k C11045c<? super C13091w<ConfirmPaymentResponse>> cVar);

    @C12580l
    @C13027f("retail/v3/mof/one_orders/orders/me/{orderId}")
    /* renamed from: e */
    Object mo111659e(@C12579k @C13031j Map<String, String> map, @C13040s("orderId") @C12579k String str, @C12579k C11045c<? super C13091w<OrderV3>> cVar);

    @C13036o("retail/v3/mof/checkout_management/checkout/me/payments")
    @C12580l
    /* renamed from: f */
    Object mo111660f(@C12579k @C13031j Map<String, String> map, @C12579k @C13022a InitiatePaymentOrderBody initiatePaymentOrderBody, @C12579k C11045c<? super C13091w<InitPaymentResponse>> cVar);
}
