package com.carrefour.fid.android.data.service;

import com.carrefour.fid.android.data.entities.C36454f;
import com.carrefour.fid.android.data.entities.coupons.C36425c;
import com.carrefour.fid.android.data.entities.coupons.CouponEntity;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13022a;
import retrofit2.http.C13027f;
import retrofit2.http.C13031j;
import retrofit2.http.C13037p;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ?\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00062\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/service/e;", "", "", "", "headers", "couponChannel", "Lretrofit2/w;", "", "Lcom/carrefour/fid/android/data/entities/coupons/CouponEntity;", "a", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/data/entities/coupons/c;", "body", "Lcom/carrefour/fid/android/data/entities/f;", "b", "(Lcom/carrefour/fid/android/data/entities/coupons/c;Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.data.service.e */
public interface C36625e {

    /* renamed from: com.carrefour.fid.android.data.service.e$a */
    public static final class C36626a {
        /* renamed from: a */
        public static /* synthetic */ Object m150247a(C36625e eVar, Map map, String str, C11045c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = C28534f.f69155g0;
                }
                return eVar.mo111637a(map, str, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchAllCoupons");
        }
    }

    @C12580l
    @C13027f("retail/v1/mof/coupons_validity/loyalty_cards/my/secured_coupons")
    /* renamed from: a */
    Object mo111637a(@C12579k @C13031j Map<String, String> map, @C13041t("coupon_channel") @C12579k String str, @C12579k C11045c<? super C13091w<List<CouponEntity>>> cVar);

    @C12580l
    @C13037p("retail/v1/mof/coupons_validity/secured_coupons")
    /* renamed from: b */
    Object mo111638b(@C12579k @C13022a C36425c cVar, @C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<List<C36454f>>> cVar2);
}
