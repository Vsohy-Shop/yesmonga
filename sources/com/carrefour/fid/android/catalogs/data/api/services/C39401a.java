package com.carrefour.fid.android.catalogs.data.api.services;

import com.carrefour.fid.android.catalogs.data.api.entities.responses.CatalogDetailsResponse;
import com.carrefour.fid.android.catalogs.data.api.entities.responses.CatalogResponse;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;
import retrofit2.http.C13027f;
import retrofit2.http.C13040s;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/data/api/services/a;", "", "Lretrofit2/w;", "Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/CatalogResponse;", "a", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "id", "Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/CatalogDetailsResponse;", "b", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.catalogs.data.api.services.a */
public interface C39401a {
    @C12580l
    @C13027f("services/a4249fb70251deff5a061033bc6984c3f428ac55/catalogs")
    /* renamed from: a */
    Object mo130440a(@C12579k C11045c<? super C13091w<CatalogResponse>> cVar);

    @C12580l
    @C13027f("services/a4249fb70251deff5a061033bc6984c3f428ac55/catalog/{id}")
    /* renamed from: b */
    Object mo130441b(@C13040s("id") @C12579k String str, @C12579k C11045c<? super C13091w<CatalogDetailsResponse>> cVar);
}
