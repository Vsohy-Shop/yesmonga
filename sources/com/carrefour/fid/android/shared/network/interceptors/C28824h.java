package com.carrefour.fid.android.shared.network.interceptors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.util.C28954v;
import com.carrefour.fid.android.shared.util.C28956w;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C12451Response;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nHeaderRequestInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderRequestInterceptor.kt\ncom/carrefour/fid/android/shared/network/interceptors/HeaderRequestInterceptor\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n442#2:48\n392#2:49\n442#2:54\n392#2:55\n1238#3,4:50\n1238#3,4:56\n*S KotlinDebug\n*F\n+ 1 HeaderRequestInterceptor.kt\ncom/carrefour/fid/android/shared/network/interceptors/HeaderRequestInterceptor\n*L\n25#1:48\n25#1:49\n27#1:54\n27#1:55\n25#1:50,4\n27#1:56,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.network.interceptors.h */
public final class C28824h implements Interceptor {
    @C12579k

    /* renamed from: b */
    public static final C28825a f70620b = new C28825a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f70621c = 0;
    @C12579k

    /* renamed from: d */
    public static final String f70622d = "X-Request-Id";
    @C12579k

    /* renamed from: e */
    public static final String f70623e = "X-Correlation-Id";

    /* renamed from: a */
    public final boolean f70624a;

    /* renamed from: com.carrefour.fid.android.shared.network.interceptors.h$a */
    public static final class C28825a {
        public /* synthetic */ C28825a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28825a() {
        }
    }

    public C28824h(boolean z) {
        this.f70624a = z;
    }

    /* renamed from: a */
    public final Map<String, String> mo83894a() {
        String a = C28956w.f70984a.mo84288a();
        HashMap M = C10977s0.m41446M(C11078d1.m42659a("X-Correlation-Id", C28954v.f70982a.mo84287a(a)));
        if (this.f70624a) {
            M.put("X-Request-Id", a);
        }
        return M;
    }

    @C12579k
    public C12451Response intercept(@C12579k Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        Headers.Companion companion = Headers.Companion;
        Map<String, List<String>> multimap = request.headers().toMultimap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10975r0.m41400j(multimap.size()));
        for (Map.Entry entry : multimap.entrySet()) {
            linkedHashMap.put(entry.getKey(), (String) CollectionsKt___CollectionsKt.m40479B2((List) entry.getValue()));
        }
        Map<String, String> n0 = C10977s0.m41473n0(linkedHashMap, mo83894a());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C10975r0.m41400j(n0.size()));
        for (Map.Entry entry2 : n0.entrySet()) {
            Object key = entry2.getKey();
            String str = (String) entry2.getValue();
            if (str == null) {
                str = "";
            }
            linkedHashMap2.put(key, str);
        }
        return chain.proceed(newBuilder.headers(companion.mo25939of((Map<String, String>) linkedHashMap2)).build());
    }
}
