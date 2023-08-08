package com.carrefour.fid.android.account.p016di;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi;
import com.carrefour.fid.android.shared.p045di.annotation.C28661e;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13092x;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.account.di.c */
public final class C13236c {
    @C10315i
    @C12579k
    /* renamed from: a */
    public final BffCustomersManagementApi mo31413a(@C12579k @C28661e C13092x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "retrofit");
        Object g = xVar.mo30586g(BffCustomersManagementApi.class);
        Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(BffCusto…anagementApi::class.java)");
        return (BffCustomersManagementApi) g;
    }
}
