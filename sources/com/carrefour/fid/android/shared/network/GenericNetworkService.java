package com.carrefour.fid.android.shared.network;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.network.certificate.C28804a;
import com.carrefour.fid.android.shared.network.converters.C28806b;
import com.carrefour.fid.android.shared.network.interceptors.C28816c;
import com.carrefour.fid.android.shared.network.interceptors.C28824h;
import com.carrefour.fid.android.shared.network.interceptors.C28830k;
import com.carrefour.fid.android.shared.network.pinStorage.C28835a;
import com.carrefour.fid.android.shared.network.pinStorage.C28836b;
import com.carrefour.fid.android.shared.network.ssl.C28837a;
import com.carrefour.sslpinning.C22849c;
import com.carrefour.sslpinning.decrypt.C22851a;
import com.chuckerteam.chucker.api.C22870c;
import com.google.gson.C33614e;
import com.google.gson.C33621f;
import com.urbanairship.iam.events.C9175a;
import java.io.File;
import java.lang.reflect.Type;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.Pair;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Authenticator;
import okhttp3.Cache;
import okhttp3.CertificatePinner;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C12988c;
import retrofit2.C13015f;
import retrofit2.C13092x;
import retrofit2.converter.gson.C12991a;

@C8567o(parameters = 0)
public final class GenericNetworkService {
    @C12579k

    /* renamed from: a */
    public static final C28798a f70571a = new C28798a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f70572b = 0;

    /* renamed from: c */
    public static final long f70573c = 10;

    /* renamed from: d */
    public static final long f70574d = 10;

    /* renamed from: e */
    public static final long f70575e = 10485760;

    /* renamed from: f */
    public static final long f70576f = Long.MAX_VALUE;

    @C8567o(parameters = 0)
    @C11363r0({"SMAP\nGenericNetworkService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GenericNetworkService.kt\ncom/carrefour/fid/android/shared/network/GenericNetworkService$Builder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,275:1\n13579#2,2:276\n1#3:278\n1855#4,2:279\n*S KotlinDebug\n*F\n+ 1 GenericNetworkService.kt\ncom/carrefour/fid/android/shared/network/GenericNetworkService$Builder\n*L\n138#1:276,2\n258#1:279,2\n*E\n"})
    public static final class Builder {

        /* renamed from: r */
        public static final int f70577r = 8;
        @C12579k

        /* renamed from: a */
        public final Context f70578a;
        @C12579k

        /* renamed from: b */
        public final C28835a f70579b;
        @C12579k

        /* renamed from: c */
        public final C28816c f70580c;
        @C12579k

        /* renamed from: d */
        public final C13092x.C13094b f70581d;
        @C12579k

        /* renamed from: e */
        public final List<C12988c.C12989a> f70582e;
        @C12579k

        /* renamed from: f */
        public final C11677z f70583f;
        @C12580l

        /* renamed from: g */
        public OkHttpClient.Builder f70584g;

        /* renamed from: h */
        public boolean f70585h;

        /* renamed from: i */
        public boolean f70586i;
        @C12579k

        /* renamed from: j */
        public List<? extends Interceptor> f70587j;
        @C12580l

        /* renamed from: k */
        public Authenticator f70588k;
        @C12580l

        /* renamed from: l */
        public X509TrustManager f70589l;
        @C12579k

        /* renamed from: m */
        public C22851a f70590m;

        /* renamed from: n */
        public long f70591n;
        @C12579k

        /* renamed from: o */
        public TimeUnit f70592o;

        /* renamed from: p */
        public long f70593p;
        @C12579k

        /* renamed from: q */
        public TimeUnit f70594q;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        @C11315i
        public Builder(@C12579k Context context) {
            this(context, (C28835a) null, (C28816c) null, 6, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        }

        /* renamed from: m */
        public static final boolean m119194m(String str, SSLSession sSLSession) {
            return true;
        }

        @C12579k
        /* renamed from: b */
        public final Builder mo83850b(@C12579k Authenticator authenticator) {
            Intrinsics.checkNotNullParameter(authenticator, "authenticator");
            this.f70588k = authenticator;
            return this;
        }

        @C12579k
        /* renamed from: c */
        public final Builder mo83851c(@C12579k C12988c.C12989a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "factory");
            this.f70582e.add(aVar);
            return this;
        }

        @C12579k
        /* renamed from: d */
        public final Builder mo83852d(@C12579k C13015f.C13016a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "factory");
            this.f70581d.mo30598b(aVar);
            return this;
        }

        @C12579k
        /* renamed from: e */
        public final Builder mo83853e() {
            C13092x.C13094b bVar = this.f70581d;
            C33614e d = mo83868u().mo97505d();
            Intrinsics.checkNotNullExpressionValue(d, "gsonBuilder.create()");
            bVar.mo30598b(new C28806b(d));
            return this;
        }

        @C12579k
        /* renamed from: f */
        public final Builder mo83854f(@C12579k Pair<? extends Type, ? extends Object>... pairArr) {
            boolean z;
            Intrinsics.checkNotNullParameter(pairArr, "typeAdapters");
            C13092x.C13094b bVar = this.f70581d;
            C33621f u = mo83868u();
            if (pairArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                for (Pair<? extends Type, ? extends Object> pair : pairArr) {
                    u.mo97512k((Type) pair.mo21849e(), pair.mo21851f());
                }
            }
            bVar.mo30598b(C12991a.m56309g(u.mo97523v().mo97505d()));
            return this;
        }

        @C12579k
        /* renamed from: g */
        public final Builder mo83855g(@C12579k List<? extends Interceptor> list) {
            Intrinsics.checkNotNullParameter(list, "interceptors");
            this.f70587j = CollectionsKt___CollectionsKt.m40718y4(this.f70587j, list);
            return this;
        }

        @C12579k
        /* renamed from: h */
        public final Builder mo83856h(@C12579k X509TrustManager x509TrustManager) {
            Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
            this.f70589l = x509TrustManager;
            return this;
        }

        @C12579k
        /* renamed from: i */
        public final Builder mo83857i(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "baseUrl");
            this.f70581d.mo30599c(str);
            return this;
        }

        @C12579k
        /* renamed from: j */
        public final Builder mo83858j(@C12579k HttpUrl httpUrl) {
            Intrinsics.checkNotNullParameter(httpUrl, "baseUrl");
            this.f70581d.mo30601e(httpUrl);
            return this;
        }

        @C12579k
        /* renamed from: k */
        public final C13092x mo83859k(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "applicationId");
            for (C12988c.C12989a a : this.f70582e) {
                this.f70581d.mo30597a(a);
            }
            OkHttpClient l = mo83860l(str);
            if (l != null) {
                this.f70581d.mo30604h(l);
            }
            C13092x f = this.f70581d.mo30602f();
            Intrinsics.checkNotNullExpressionValue(f, "this.retrofitBuilder.build()");
            return f;
        }

        /* renamed from: l */
        public final OkHttpClient mo83860l(String str) {
            OkHttpClient.Builder builder = this.f70584g;
            if (builder == null) {
                builder = new OkHttpClient.Builder();
            }
            C28837a aVar = new C28837a();
            builder.sslSocketFactory(mo83871x(new X509TrustManager[]{aVar}), aVar);
            builder.addInterceptor(new C28824h(this.f70585h));
            builder.interceptors().addAll(this.f70587j);
            Authenticator authenticator = this.f70588k;
            if (authenticator != null) {
                builder.authenticator(authenticator);
            }
            if (this.f70586i) {
                File cacheDir = this.f70578a.getCacheDir();
                Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
                builder.cache(new Cache(cacheDir, 10485760));
                builder.networkInterceptors().add(new C28830k());
            }
            builder.connectTimeout(this.f70591n, this.f70592o);
            builder.readTimeout(this.f70593p, this.f70594q);
            builder.hostnameVerifier(new C28809e());
            this.f70584g = builder;
            builder.cookieJar(this.f70580c);
            OkHttpClient.Builder builder2 = this.f70584g;
            if (builder2 != null) {
                return builder2.build();
            }
            return null;
        }

        /* renamed from: n */
        public final CertificatePinner mo83861n() {
            return new C22849c(this.f70590m, this.f70578a, this.f70579b.mo83899a()).mo67312a();
        }

        @C12579k
        /* renamed from: o */
        public final Builder mo83862o(@C12579k OkHttpClient.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "client");
            this.f70584g = builder;
            return this;
        }

        @C12579k
        /* renamed from: p */
        public final Builder mo83863p(long j, @C12579k TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "connectTimeoutUnit");
            this.f70591n = j;
            this.f70592o = timeUnit;
            return this;
        }

        /* renamed from: q */
        public final /* synthetic */ <API_SERVICE> API_SERVICE mo83864q(C13092x xVar) {
            Intrinsics.checkNotNullParameter(xVar, "<this>");
            Intrinsics.reifiedOperationMarker(4, "API_SERVICE");
            return xVar.mo30586g(Object.class);
        }

        @C12579k
        /* renamed from: r */
        public final Builder mo83865r() {
            this.f70586i = true;
            return this;
        }

        @C12579k
        /* renamed from: s */
        public final Builder mo83866s(boolean z) {
            OkHttpClient.Builder builder = this.f70584g;
            if (builder != null) {
                builder.followRedirects(z);
            }
            return this;
        }

        @C12579k
        /* renamed from: t */
        public final Builder mo83867t(boolean z) {
            OkHttpClient.Builder builder = this.f70584g;
            if (builder != null) {
                builder.followSslRedirects(z);
            }
            return this;
        }

        /* renamed from: u */
        public final C33621f mo83868u() {
            return (C33621f) this.f70583f.getValue();
        }

        @C12579k
        /* renamed from: v */
        public final Builder mo83869v(boolean z) {
            this.f70585h = z;
            return this;
        }

        @C12579k
        /* renamed from: w */
        public final Builder mo83870w(long j, @C12579k TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "readTimeoutUnit");
            this.f70593p = j;
            this.f70594q = timeUnit;
            return this;
        }

        /* renamed from: x */
        public final SSLSocketFactory mo83871x(X509TrustManager[] x509TrustManagerArr) {
            SSLContext instance = SSLContext.getInstance("SSL");
            instance.init((KeyManager[]) null, (TrustManager[]) x509TrustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = instance.getSocketFactory();
            Intrinsics.checkNotNull(socketFactory, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
            return socketFactory;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        @C11315i
        public Builder(@C12579k Context context, @C12579k C28835a aVar) {
            this(context, aVar, (C28816c) null, 4, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(aVar, "store");
        }

        @C11315i
        public Builder(@C12579k Context context, @C12579k C28835a aVar, @C12579k C28816c cVar) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(aVar, "store");
            Intrinsics.checkNotNullParameter(cVar, "cookieJarInterceptor");
            this.f70578a = context;
            this.f70579b = aVar;
            this.f70580c = cVar;
            this.f70581d = new C13092x.C13094b();
            this.f70582e = new LinkedList();
            this.f70583f = C10864b0.m38748c(GenericNetworkService$Builder$gsonBuilder$2.f70595f);
            this.f70585h = true;
            this.f70587j = C10976s.m41419k(new C22870c.C22871a(context).mo67331d(Long.MAX_VALUE).mo67329b());
            this.f70590m = new C28804a();
            this.f70591n = 10;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f70592o = timeUnit;
            this.f70593p = 10;
            this.f70594q = timeUnit;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(Context context, C28835a aVar, C28816c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i & 2) != 0 ? new C28836b() : aVar, (i & 4) != 0 ? new C28816c() : cVar);
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.network.GenericNetworkService$a */
    public static final class C28798a {
        public /* synthetic */ C28798a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28798a() {
        }
    }
}
