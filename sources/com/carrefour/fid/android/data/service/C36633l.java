package com.carrefour.fid.android.data.service;

import com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsEntity;
import com.carrefour.fid.android.data.entities.OHMOrdersOnlineEntity;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13023b;
import retrofit2.http.C13027f;
import retrofit2.http.C13031j;
import retrofit2.http.C13037p;
import retrofit2.http.C13040s;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J9\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJG\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\tJC\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/service/l;", "", "", "", "headerMap", "orderId", "Lretrofit2/w;", "Lcom/carrefour/fid/android/data/entities/OHMOrdersOnlineDetailsEntity;", "c", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "scrollHash", "scrollPaging", "Lcom/carrefour/fid/android/data/entities/OHMOrdersOnlineEntity;", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/d2;", "d", "slotId", "b", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.data.service.l */
public interface C36633l {
    @C12580l
    @C13027f("retail/v1/mof/orders_history_management/digital/orders/online/me")
    /* renamed from: a */
    Object mo111651a(@C12579k @C13031j Map<String, String> map, @C12580l @C13041t("scrollhash") String str, @C12580l @C13041t("scrollpaging") String str2, @C12579k C11045c<? super C13091w<OHMOrdersOnlineEntity>> cVar);

    @C12580l
    @C13037p("retail/v1/mof/orders_history_management/digital/orders/me/{order_id}")
    /* renamed from: b */
    Object mo111652b(@C12579k @C13031j Map<String, String> map, @C13040s(encoded = true, value = "order_id") @C12579k String str, @C13041t("slot_id") @C12579k String str2, @C12579k C11045c<? super C13091w<C11079d2>> cVar);

    @C12580l
    @C13027f("retail/v1/mof/orders_history_management/digital/orders/online/me/{order_id}")
    /* renamed from: c */
    Object mo111653c(@C12579k @C13031j Map<String, String> map, @C13040s(encoded = true, value = "order_id") @C12579k String str, @C12579k C11045c<? super C13091w<OHMOrdersOnlineDetailsEntity>> cVar);

    @C12580l
    @C13023b("retail/v1/mof/orders_history_management/digital/orders/me/{order_id}")
    /* renamed from: d */
    Object mo111654d(@C12579k @C13031j Map<String, String> map, @C13040s(encoded = true, value = "order_id") @C12579k String str, @C12579k C11045c<? super C13091w<C11079d2>> cVar);
}
