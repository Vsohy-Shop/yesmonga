package com.carrefour.fid.android.shared.network.interceptors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.headers.C28644e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
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

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBaseHeadersInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseHeadersInterceptor.kt\ncom/carrefour/fid/android/shared/network/interceptors/BaseHeadersInterceptor\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n442#2:29\n392#2:30\n442#2:35\n392#2:36\n1238#3,4:31\n1238#3,4:37\n*S KotlinDebug\n*F\n+ 1 BaseHeadersInterceptor.kt\ncom/carrefour/fid/android/shared/network/interceptors/BaseHeadersInterceptor\n*L\n19#1:29\n19#1:30\n21#1:35\n21#1:36\n19#1:31,4\n21#1:37,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.network.interceptors.a */
public final class C28814a implements Interceptor {

    /* renamed from: b */
    public static final int f70610b = 8;
    @C12579k

    /* renamed from: a */
    public final C28644e f70611a;

    @Inject
    public C28814a(@C12579k C28644e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "headerProvider");
        this.f70611a = eVar;
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
        Map<String, String> n0 = C10977s0.m41473n0(linkedHashMap, this.f70611a.mo83566a());
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
