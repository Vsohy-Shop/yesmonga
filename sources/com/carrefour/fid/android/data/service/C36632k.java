package com.carrefour.fid.android.data.service;

import com.carrefour.fid.android.data.entities.APIMOrdersOfflineDetailsEntity;
import com.carrefour.fid.android.data.entities.APIMOrdersOfflineEntity;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13027f;
import retrofit2.http.C13031j;
import retrofit2.http.C13040s;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JM\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJQ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJM\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000bJM\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/service/k;", "", "", "", "headerMap", "orderGln", "orderKey", "dateKey", "Lretrofit2/w;", "Lcom/carrefour/fid/android/data/entities/APIMOrdersOfflineDetailsEntity;", "c", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "loyaltyCard", "scrollHash", "scrollPaging", "Lcom/carrefour/fid/android/data/entities/APIMOrdersOfflineEntity;", "b", "Lokhttp3/ResponseBody;", "a", "transactionKey", "d", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.data.service.k */
public interface C36632k {
    @C12580l
    @C13027f("retail/v2/mof/orders_history_management/orders/offline/me/stores/{orderGln}/transactions/{orderKey}.pdf")
    /* renamed from: a */
    Object mo111647a(@C12579k @C13031j Map<String, String> map, @C13040s("orderGln") @C12579k String str, @C13040s("orderKey") @C12579k String str2, @C13041t("dateKey") @C12579k String str3, @C12579k C11045c<? super C13091w<ResponseBody>> cVar);

    @C12580l
    @C13027f("retail/v1/mof/orders_history_management/digital/orders/offline/me")
    /* renamed from: b */
    Object mo111648b(@C12579k @C13031j Map<String, String> map, @C13041t("loyaltyCard") @C12579k String str, @C12580l @C13041t("scrollhash") String str2, @C12580l @C13041t("scrollpaging") String str3, @C12579k C11045c<? super C13091w<APIMOrdersOfflineEntity>> cVar);

    @C12580l
    @C13027f("retail/v1/mof/orders_history_management/digital/orders/offline/me/stores/{orderGln}/transactions/{orderKey}")
    /* renamed from: c */
    Object mo111649c(@C12579k @C13031j Map<String, String> map, @C13040s("orderGln") @C12579k String str, @C13040s("orderKey") @C12579k String str2, @C13041t("dateKey") @C12579k String str3, @C12579k C11045c<? super C13091w<APIMOrdersOfflineDetailsEntity>> cVar);

    @C12580l
    @C13027f("retail/v1/customers-management/customers/me/orders/offline/bankreceipt/stores/{gln}/transactions/{transaction_key}/pdf")
    /* renamed from: d */
    Object mo111650d(@C12579k @C13031j Map<String, String> map, @C13040s("gln") @C12579k String str, @C13040s("transaction_key") @C12579k String str2, @C13041t("date_key") @C12579k String str3, @C12579k C11045c<? super C13091w<ResponseBody>> cVar);
}
