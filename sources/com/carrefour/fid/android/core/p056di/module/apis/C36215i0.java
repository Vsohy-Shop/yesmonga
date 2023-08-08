package com.carrefour.fid.android.core.p056di.module.apis;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.provider.headers.C36558a;
import com.carrefour.fid.android.data.provider.headers.C36569k;
import com.carrefour.fid.android.data.repositories.PaymentRepository;
import com.carrefour.fid.android.data.service.C36634m;
import com.carrefour.fid.android.shared.p045di.annotation.C28660d;
import com.carrefour.fid.android.shared.util.C28909d;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13092x;

@C10159h
@C10267e({C10265a.class})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.di.module.apis.i0 */
public final class C36215i0 {

    /* renamed from: a */
    public static final int f89460a = 0;

    @Singleton
    @C10315i
    @C12579k
    /* renamed from: a */
    public final PaymentRepository mo108178a(@C12579k C36634m mVar, @C12579k C36558a aVar, @C12579k C36569k kVar, @C12579k C28909d dVar) {
        Intrinsics.checkNotNullParameter(mVar, "service");
        Intrinsics.checkNotNullParameter(aVar, "checkoutHeaders");
        Intrinsics.checkNotNullParameter(kVar, "ordersHeaders");
        Intrinsics.checkNotNullParameter(dVar, "applicationBuildInfo");
        return new PaymentRepository(mVar, aVar, kVar, dVar);
    }

    @C10315i
    @C12579k
    /* renamed from: b */
    public final C36634m mo108179b(@C28660d @C12579k C13092x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "retrofit");
        Object g = xVar.mo30586g(C36634m.class);
        Intrinsics.checkNotNullExpressionValue(g, "retrofit\n            .cr…ntApiService::class.java)");
        return (C36634m) g;
    }
}
