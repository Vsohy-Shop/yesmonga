package com.carrefour.fid.android.core.network;

import android.content.Context;
import com.carrefour.fid.android.core.auth.C36151f;
import com.carrefour.fid.android.core.auth.TokenAuthenticator;
import com.carrefour.fid.android.core.interceptors.LogMInterceptor;
import com.carrefour.fid.android.shared.data.serialization.C28649a;
import com.carrefour.fid.android.shared.network.GenericNetworkService;
import com.carrefour.fid.android.shared.network.interceptors.C28816c;
import com.carrefour.fid.android.shared.network.interceptors.C28818d;
import com.carrefour.fid.android.shared.network.interceptors.C28822g;
import com.carrefour.fid.android.shared.network.interceptors.C28826i;
import com.carrefour.fid.android.shared.network.interceptors.C28833m;
import com.carrefour.fid.android.shared.network.pinStorage.C28835a;
import com.jakewharton.retrofit2.converter.kotlinx.serialization.C34891c;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.wallet.C9700d;
import dagger.hilt.android.qualifiers.C10255b;
import java.math.BigDecimal;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.C12412q;
import kotlinx.serialization.modules.C12435f;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13092x;

@C11363r0({"SMAP\nRetrofitFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetrofitFactory.kt\ncom/carrefour/fid/android/core/network/RetrofitFactory\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,120:1\n31#2,2:121\n231#2:123\n33#2:124\n*S KotlinDebug\n*F\n+ 1 RetrofitFactory.kt\ncom/carrefour/fid/android/core/network/RetrofitFactory\n*L\n61#1:121,2\n62#1:123\n61#1:124\n*E\n"})
public final class RetrofitFactory {
    @C12579k

    /* renamed from: a */
    public final Context f89720a;
    @C12579k

    /* renamed from: b */
    public final C36151f f89721b;
    @C12579k

    /* renamed from: c */
    public final TokenAuthenticator f89722c;
    @C12579k

    /* renamed from: d */
    public final C28826i f89723d;
    @C12579k

    /* renamed from: e */
    public final LogMInterceptor f89724e;
    @C12579k

    /* renamed from: f */
    public final C28833m f89725f;
    @C12579k

    /* renamed from: g */
    public final C28818d f89726g;

    @Inject
    public RetrofitFactory(@C10255b @C12579k Context context, @C12579k C36151f fVar, @C12579k TokenAuthenticator tokenAuthenticator, @C12579k C28826i iVar, @C12579k LogMInterceptor logMInterceptor, @C12579k C28833m mVar, @C12579k C28818d dVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(fVar, "tokenInterceptor");
        Intrinsics.checkNotNullParameter(tokenAuthenticator, "tokenAuthenticator");
        Intrinsics.checkNotNullParameter(iVar, "loggingInterceptor");
        Intrinsics.checkNotNullParameter(logMInterceptor, "logMInterceptor");
        Intrinsics.checkNotNullParameter(mVar, "networkStatusInterceptor");
        Intrinsics.checkNotNullParameter(dVar, "emptyBodyInterceptor");
        this.f89720a = context;
        this.f89721b = fVar;
        this.f89722c = tokenAuthenticator;
        this.f89723d = iVar;
        this.f89724e = logMInterceptor;
        this.f89725f = mVar;
        this.f89726g = dVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C13092x m149028b(RetrofitFactory retrofitFactory, String str, Map map, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            map = C10977s0.m41492z();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return retrofitFactory.mo108377a(str, map, z, z2);
    }

    /* renamed from: d */
    public static /* synthetic */ C13092x m149029d(RetrofitFactory retrofitFactory, String str, Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            map = C10977s0.m41492z();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return retrofitFactory.mo108378c(str, map, z);
    }

    /* renamed from: g */
    public static /* synthetic */ GenericNetworkService.Builder m149030g(RetrofitFactory retrofitFactory, String str, Interceptor interceptor, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            interceptor = null;
        }
        Interceptor interceptor2 = interceptor;
        boolean z4 = (i & 4) != 0 ? true : z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return retrofitFactory.mo108380f(str, interceptor2, z4, z2, (i & 16) != 0 ? true : z3);
    }

    @C12579k
    /* renamed from: a */
    public final C13092x mo108377a(@C12579k String str, @C12579k Map<String, String> map, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "baseUrl");
        Intrinsics.checkNotNullParameter(map, C9700d.f26570q);
        return m149030g(this, str, C28822g.m119250a(map), false, z, z2, 4, (Object) null).mo83859k("com.carrefour.fid.android");
    }

    @C12579k
    /* renamed from: c */
    public final C13092x mo108378c(@C12579k String str, @C12579k Map<String, String> map, boolean z) {
        Intrinsics.checkNotNullParameter(str, "baseUrl");
        Intrinsics.checkNotNullParameter(map, C9700d.f26570q);
        C12435f fVar = new C12435f();
        fVar.mo25478c(C11342l0.m43547d(BigDecimal.class), C28649a.f70246a);
        RetrofitFactory$createKotlinxSerializationRetrofit$json$1 retrofitFactory$createKotlinxSerializationRetrofit$json$1 = new RetrofitFactory$createKotlinxSerializationRetrofit$json$1(fVar.mo25583g());
        C36151f fVar2 = null;
        C12341a b = C12412q.m50212b((C12341a) null, retrofitFactory$createKotlinxSerializationRetrofit$json$1, 1, (Object) null);
        GenericNetworkService.Builder i = new GenericNetworkService.Builder(this.f89720a, (C28835a) null, (C28816c) null, 6, (DefaultConstructorMarker) null).mo83857i(str);
        Interceptor[] interceptorArr = new Interceptor[6];
        if (z) {
            fVar2 = this.f89721b;
        }
        interceptorArr[0] = fVar2;
        interceptorArr[1] = C28822g.m119250a(map);
        interceptorArr[2] = this.f89723d;
        interceptorArr[3] = this.f89724e;
        interceptorArr[4] = this.f89725f;
        interceptorArr[5] = this.f89726g;
        GenericNetworkService.Builder g = i.mo83855g(CollectionsKt__CollectionsKt.m40450N(interceptorArr));
        g.mo83850b(this.f89722c);
        return g.mo83852d(C34891c.m142609b(b, MediaType.Companion.get("application/json"))).mo83869v(true).mo83859k("com.carrefour.fid.android");
    }

    @C12579k
    /* renamed from: e */
    public final C13092x mo108379e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "baseUrl");
        return m149030g(this, str, (Interceptor) null, false, false, false, 26, (Object) null).mo83859k("com.carrefour.fid.android");
    }

    /* renamed from: f */
    public final GenericNetworkService.Builder mo108380f(String str, Interceptor interceptor, boolean z, boolean z2, boolean z3) {
        C36151f fVar;
        GenericNetworkService.Builder i = new GenericNetworkService.Builder(this.f89720a, (C28835a) null, (C28816c) null, 6, (DefaultConstructorMarker) null).mo83857i(str);
        Interceptor[] interceptorArr = new Interceptor[6];
        if (z3) {
            fVar = this.f89721b;
        } else {
            fVar = null;
        }
        interceptorArr[0] = fVar;
        interceptorArr[1] = interceptor;
        interceptorArr[2] = this.f89723d;
        interceptorArr[3] = this.f89724e;
        interceptorArr[4] = this.f89725f;
        interceptorArr[5] = this.f89726g;
        GenericNetworkService.Builder g = i.mo83855g(CollectionsKt__CollectionsKt.m40450N(interceptorArr));
        if (z) {
            g.mo83850b(this.f89722c);
        }
        if (z2) {
            g.mo83865r();
        }
        return g.mo83854f(new Pair[0]).mo83869v(true);
    }
}
