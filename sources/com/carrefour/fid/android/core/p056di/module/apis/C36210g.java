package com.carrefour.fid.android.core.p056di.module.apis;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffMidFidApiService;
import com.carrefour.fid.android.shared.p045di.annotation.C28662f;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13092x;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.core.di.module.apis.g */
public final class C36210g {
    @C10315i
    @C12579k
    /* renamed from: a */
    public final BffMidFidApiService mo108173a(@C28662f @C12579k C13092x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "retrofit");
        Object g = xVar.mo30586g(BffMidFidApiService.class);
        Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(BffMidFidApiService::class.java)");
        return (BffMidFidApiService) g;
    }
}
