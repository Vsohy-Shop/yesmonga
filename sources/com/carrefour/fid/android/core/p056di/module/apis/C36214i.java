package com.carrefour.fid.android.core.p056di.module.apis;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.cms.data.services.C40023a;
import com.carrefour.fid.android.shared.p045di.annotation.C28673q;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.i */
public final class C36214i {

    /* renamed from: a */
    public static final int f89459a = 0;

    @C10315i
    @C12579k
    /* renamed from: a */
    public final C40023a mo108177a(@C12579k @C28673q C13092x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "retrofit");
        Object g = xVar.mo30586g(C40023a.class);
        Intrinsics.checkNotNullExpressionValue(g, "retrofit\n        .create…msApiService::class.java)");
        return (C40023a) g;
    }
}
