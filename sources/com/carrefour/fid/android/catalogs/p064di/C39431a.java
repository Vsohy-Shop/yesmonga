package com.carrefour.fid.android.catalogs.p064di;

import com.carrefour.fid.android.catalogs.data.api.services.C39401a;
import com.carrefour.fid.android.shared.p045di.annotation.C28667k;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13092x;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.catalogs.di.a */
public final class C39431a {
    @C10315i
    @C12579k
    /* renamed from: a */
    public final C39401a mo130487a(@C28667k @C12579k C13092x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "retrofit");
        Object g = xVar.mo30586g(C39401a.class);
        Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(CatalogApiService::class.java)");
        return (C39401a) g;
    }
}
