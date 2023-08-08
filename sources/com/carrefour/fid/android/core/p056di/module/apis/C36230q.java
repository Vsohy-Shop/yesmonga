package com.carrefour.fid.android.core.p056di.module.apis;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.service.C36629h;
import com.carrefour.fid.android.shared.p045di.annotation.C28669m;
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
/* renamed from: com.carrefour.fid.android.core.di.module.apis.q */
public final class C36230q {

    /* renamed from: a */
    public static final int f89510a = 0;

    @C10315i
    @C12579k
    /* renamed from: a */
    public final C36629h mo108195a(@C12579k @C28669m C13092x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "retrofit");
        Object g = xVar.mo30586g(C36629h.class);
        Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(DlvService::class.java)");
        return (C36629h) g;
    }
}
