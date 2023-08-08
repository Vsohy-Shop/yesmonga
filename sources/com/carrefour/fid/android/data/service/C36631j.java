package com.carrefour.fid.android.data.service;

import com.carrefour.fid.android.data.entities.luckycart.LuckyCartBannerDetailsEntity;
import com.carrefour.fid.android.data.entities.luckycart.LuckyCartBannersEntity;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13027f;
import retrofit2.http.C13040s;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJY\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/service/j;", "", "", "authKey", "userId", "store", "storeType", "Lretrofit2/w;", "Lcom/carrefour/fid/android/data/entities/luckycart/LuckyCartBannersEntity;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "pageName", "bannerType", "Lcom/carrefour/fid/android/data/entities/luckycart/LuckyCartBannerDetailsEntity;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.data.service.j */
public interface C36631j {
    @C12580l
    @C13027f("{auth_key}/{user_id}/banners/mobile/list")
    /* renamed from: a */
    Object mo111645a(@C13040s("auth_key") @C12579k String str, @C13040s("user_id") @C12579k String str2, @C12580l @C13041t("store") String str3, @C12580l @C13041t("storeType") String str4, @C12579k C11045c<? super C13091w<LuckyCartBannersEntity>> cVar);

    @C12580l
    @C13027f("{auth_key}/{user_id}/banner/mobile/{page_name}/{banner_type}")
    /* renamed from: b */
    Object mo111646b(@C13040s("auth_key") @C12579k String str, @C13040s("user_id") @C12579k String str2, @C13040s("page_name") @C12579k String str3, @C13040s("banner_type") @C12579k String str4, @C12580l @C13041t("store") String str5, @C12580l @C13041t("storeType") String str6, @C12579k C11045c<? super C13091w<LuckyCartBannerDetailsEntity>> cVar);
}
