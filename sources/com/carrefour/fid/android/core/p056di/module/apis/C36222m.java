package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.core.util.CriteoFormatRenderingTypeAdapter;
import com.carrefour.fid.android.data.entities.CriteoFormatRendering;
import com.carrefour.fid.android.data.service.C36627f;
import com.carrefour.fid.android.shared.network.GenericNetworkService;
import com.carrefour.fid.android.shared.network.interceptors.C28816c;
import com.carrefour.fid.android.shared.network.interceptors.C28826i;
import com.carrefour.fid.android.shared.network.interceptors.C28833m;
import com.carrefour.fid.android.shared.network.pinStorage.C28835a;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.urbanairship.iam.events.C9175a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.android.qualifiers.C10255b;
import dagger.hilt.components.C10265a;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.di.module.apis.m */
public final class C36222m {

    /* renamed from: a */
    public static final int f89474a = 0;

    @C10315i
    @C12579k
    /* renamed from: a */
    public final C36627f mo108186a(@C10255b @C12579k Context context, @C12579k AppEnvironment appEnvironment, @C12579k C28826i iVar, @C12579k LogMInterceptor logMInterceptor, @C12579k C28833m mVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        Intrinsics.checkNotNullParameter(iVar, "loggingInterceptor");
        Intrinsics.checkNotNullParameter(logMInterceptor, "logMInterceptor");
        Intrinsics.checkNotNullParameter(mVar, "networkStatusInterceptor");
        GenericNetworkService.Builder f = new GenericNetworkService.Builder(context, (C28835a) null, (C28816c) null, 6, (DefaultConstructorMarker) null).mo83857i(appEnvironment.mo84178r()).mo83855g(CollectionsKt__CollectionsKt.m40448L(iVar, logMInterceptor, mVar)).mo83854f(new Pair(CriteoFormatRendering.class, new CriteoFormatRenderingTypeAdapter()));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Object g = f.mo83863p(250, timeUnit).mo83870w(250, timeUnit).mo83869v(false).mo83859k("com.carrefour.fid.android").mo30586g(C36627f.class);
        Intrinsics.checkNotNullExpressionValue(g, "Builder(context)\n       …eoApiService::class.java)");
        return (C36627f) g;
    }
}
