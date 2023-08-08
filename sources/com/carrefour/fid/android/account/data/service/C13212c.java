package com.carrefour.fid.android.account.data.service;

import com.carrefour.fid.android.account.data.entities.LoginResponse;
import com.carrefour.fid.android.account.data.entities.RevokeTokenResponse;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13025d;
import retrofit2.http.C13026e;
import retrofit2.http.C13031j;
import retrofit2.http.C13036o;
import retrofit2.http.C13041t;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JO\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJO\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJC\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/data/service/c;", "", "", "", "fieldMap", "headers", "token", "Lretrofit2/w;", "Lcom/carrefour/fid/android/account/data/entities/LoginResponse;", "b", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "c", "token_type_hint", "Lcom/carrefour/fid/android/account/data/entities/RevokeTokenResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.data.service.c */
public interface C13212c {

    /* renamed from: com.carrefour.fid.android.account.data.service.c$a */
    public static final class C13213a {
        /* renamed from: a */
        public static /* synthetic */ Object m57261a(C13212c cVar, Map map, Map map2, String str, C11045c cVar2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str = FirebaseAnalytics.C32531a.f78899m;
                }
                return cVar.mo31371b(map, map2, str, cVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m57262b(C13212c cVar, Map map, Map map2, String str, C11045c cVar2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str = "refresh";
                }
                return cVar.mo31372c(map, map2, str, cVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshToken");
        }
    }

    @C13036o("iam/oauth2/CarrefourConnect/token/revoke")
    @C12580l
    /* renamed from: a */
    Object mo31370a(@C13041t("token") @C12579k String str, @C13041t("token_type_hint") @C12579k String str2, @C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<RevokeTokenResponse>> cVar);

    @C13036o("iam/oauth2/CarrefourConnect/access_token")
    @C12580l
    @C13026e
    /* renamed from: b */
    Object mo31371b(@C13025d(encoded = true) @C12579k Map<String, String> map, @C12579k @C13031j Map<String, String> map2, @C13041t("q") @C12579k String str, @C12579k C11045c<? super C13091w<LoginResponse>> cVar);

    @C13036o("iam/oauth2/CarrefourConnect/access_token")
    @C12580l
    @C13026e
    /* renamed from: c */
    Object mo31372c(@C13025d(encoded = true) @C12579k Map<String, String> map, @C12579k @C13031j Map<String, String> map2, @C13041t("q") @C12579k String str, @C12579k C11045c<? super C13091w<LoginResponse>> cVar);
}
