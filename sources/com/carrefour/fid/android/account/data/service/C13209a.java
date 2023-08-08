package com.carrefour.fid.android.account.data.service;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.UpdateUserAccessBody;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UserAccountResponse;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13022a;
import retrofit2.http.C13031j;
import retrofit2.http.C13036o;
import retrofit2.http.C13037p;
import retrofit2.http.C13040s;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J9\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJC\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/data/service/a;", "", "", "login", "", "headers", "Lretrofit2/w;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountResponse;", "b", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateUserAccessBody;", "body", "a", "(Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateUserAccessBody;Ljava/util/Map;Lkotlin/coroutines/c;)Ljava/lang/Object;", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.data.service.a */
public interface C13209a {
    @C12580l
    @C13037p("api/v2/customers/account/{uid_iam}")
    /* renamed from: a */
    Object mo31365a(@C13040s("uid_iam") @C12579k String str, @C12579k @C13022a UpdateUserAccessBody updateUserAccessBody, @C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<UserAccountResponse>> cVar);

    @C13036o("api/v2/customers/account/{login}/resetpassword")
    @C12580l
    /* renamed from: b */
    Object mo31366b(@C13040s("login") @C12579k String str, @C12579k @C13031j Map<String, String> map, @C12579k C11045c<? super C13091w<UserAccountResponse>> cVar);
}
