package com.carrefour.fid.android.core.p056di.module.apis;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.data.service.C36628g;
import com.carrefour.fid.android.shared.network.GenericNetworkService;
import com.carrefour.fid.android.shared.network.interceptors.C28816c;
import com.carrefour.fid.android.shared.network.interceptors.C28818d;
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
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.di.module.apis.o */
public final class C36226o {

    /* renamed from: a */
    public static final int f89491a = 0;

    @C10315i
    @C12579k
    /* renamed from: a */
    public final C36628g mo108191a(@C10255b @C12579k Context context, @C12579k AppEnvironment appEnvironment, @C12579k C36151f fVar, @C12579k TokenAuthenticator tokenAuthenticator, @C12579k C28826i iVar, @C12579k LogMInterceptor logMInterceptor, @C12579k C28833m mVar, @C12579k C28818d dVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        Intrinsics.checkNotNullParameter(fVar, "tokenInterceptor");
        Intrinsics.checkNotNullParameter(tokenAuthenticator, "tokenAuthenticator");
        Intrinsics.checkNotNullParameter(iVar, "loggingInterceptor");
        Intrinsics.checkNotNullParameter(logMInterceptor, "logMInterceptor");
        Intrinsics.checkNotNullParameter(mVar, "networkStatusInterceptor");
        Intrinsics.checkNotNullParameter(dVar, "emptyBodyInterceptor");
        Object g = new GenericNetworkService.Builder(context, (C28835a) null, (C28816c) null, 6, (DefaultConstructorMarker) null).mo83857i(appEnvironment.mo84167g()).mo83855g(CollectionsKt__CollectionsKt.m40448L(iVar, logMInterceptor, fVar, mVar, dVar)).mo83850b(tokenAuthenticator).mo83853e().mo83854f(new Pair[0]).mo83869v(true).mo83859k("com.carrefour.fid.android").mo30586g(C36628g.class);
        Intrinsics.checkNotNullExpressionValue(g, "Builder(context)\n       …stApiService::class.java)");
        return (C36628g) g;
    }
}
