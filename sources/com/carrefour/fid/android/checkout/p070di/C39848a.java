package com.carrefour.fid.android.checkout.p070di;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.checkout.data.api.services.C39837a;
import com.carrefour.fid.android.checkout.data.api.services.C39838b;
import com.carrefour.fid.android.shared.p045di.annotation.C28657a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13092x;

@C10159h
@C10267e({C10265a.class})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.checkout.di.a */
public final class C39848a {

    /* renamed from: a */
    public static final int f101651a = 0;

    @C10315i
    @C12579k
    /* renamed from: a */
    public final C39837a mo131403a(@C12579k @C28657a C13092x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "retrofit");
        Object g = xVar.mo30586g(C39837a.class);
        Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(PaymentService::class.java)");
        return (C39837a) g;
    }

    @C10315i
    @C12579k
    /* renamed from: b */
    public final C39838b mo131404b(@C12579k @C28657a C13092x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "retrofit");
        Object g = xVar.mo30586g(C39838b.class);
        Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(SlotApiService::class.java)");
        return (C39838b) g;
    }
}
