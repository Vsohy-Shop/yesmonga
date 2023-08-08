package com.carrefour.fid.android.shared.network.interceptors;

import com.urbanairship.wallet.C9700d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C12451Response;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.network.interceptors.g */
public final class C28822g {

    @C11363r0({"SMAP\nHeaderInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderInterceptor.kt\ncom/carrefour/fid/android/shared/network/interceptors/HeaderInterceptorKt$makeHeaderInterceptor$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n442#2:25\n392#2:26\n442#2:31\n392#2:32\n1238#3,4:27\n1238#3,4:33\n*S KotlinDebug\n*F\n+ 1 HeaderInterceptor.kt\ncom/carrefour/fid/android/shared/network/interceptors/HeaderInterceptorKt$makeHeaderInterceptor$1\n*L\n14#1:25\n14#1:26\n16#1:31\n16#1:32\n14#1:27,4\n16#1:33,4\n*E\n"})
    /* renamed from: com.carrefour.fid.android.shared.network.interceptors.g$a */
    public static final class C28823a implements Interceptor {

        /* renamed from: a */
        public final /* synthetic */ Map<String, String> f70619a;

        public C28823a(Map<String, String> map) {
            this.f70619a = map;
        }

        @C12579k
        public final C12451Response intercept(@C12579k Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            Request request = chain.request();
            Map<String, String> map = this.f70619a;
            Request.Builder newBuilder = request.newBuilder();
            Headers.Companion companion = Headers.Companion;
            Map<String, List<String>> multimap = request.headers().toMultimap();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C10975r0.m41400j(multimap.size()));
            for (Map.Entry entry : multimap.entrySet()) {
                linkedHashMap.put(entry.getKey(), (String) CollectionsKt___CollectionsKt.m40479B2((List) entry.getValue()));
            }
            Map<String, String> n0 = C10977s0.m41473n0(linkedHashMap, map);
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

    @C12579k
    /* renamed from: a */
    public static final Interceptor m119250a(@C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, C9700d.f26570q);
        return new C28823a(map);
    }
}
