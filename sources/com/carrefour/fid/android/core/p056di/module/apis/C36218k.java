package com.carrefour.fid.android.core.p056di.module.apis;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.service.C36625e;
import com.carrefour.fid.android.shared.p045di.annotation.C28660d;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.k */
public final class C36218k {

    /* renamed from: a */
    public static final int f89468a = 0;

    @C10315i
    @C12579k
    /* renamed from: a */
    public final C36625e mo108182a(@C28660d @C12579k C13092x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "retrofit");
        Object g = xVar.mo30586g(C36625e.class);
        Intrinsics.checkNotNullExpressionValue(g, "retrofit\n            .cr…nsApiService::class.java)");
        return (C36625e) g;
    }
}
