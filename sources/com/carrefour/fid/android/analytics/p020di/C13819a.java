package com.carrefour.fid.android.analytics.p020di;

import com.appsflyer.AppsFlyerLib;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.analytics.di.a */
public final class C13819a {
    @Singleton
    @C10315i
    @C12579k
    /* renamed from: a */
    public final AppsFlyerLib mo32743a() {
        AppsFlyerLib instance = AppsFlyerLib.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "getInstance()");
        return instance;
    }
}
