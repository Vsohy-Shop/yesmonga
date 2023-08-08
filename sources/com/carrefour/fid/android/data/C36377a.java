package com.carrefour.fid.android.data;

import androidx.compose.runtime.internal.C8567o;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractMap;
import kotlin.collections.C10978t;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nProxyRetrofitQueryMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProxyRetrofitQueryMap.kt\ncom/carrefour/fid/android/data/ProxyRetrofitQueryMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,12:1\n1360#2:13\n1446#2,2:14\n1549#2:16\n1620#2,3:17\n1448#2,3:20\n*S KotlinDebug\n*F\n+ 1 ProxyRetrofitQueryMap.kt\ncom/carrefour/fid/android/data/ProxyRetrofitQueryMap\n*L\n10#1:13\n10#1:14,2\n10#1:16\n10#1:17,3\n10#1:20,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.a */
public final class C36377a extends AbstractMap<String, String> {

    /* renamed from: e */
    public static final int f89979e = 8;
    @C12579k

    /* renamed from: d */
    public final Map<String, List<String>> f89980d;

    public C36377a(@C12579k Map<String, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(map, "original");
        this.f89980d = map;
    }

    @C12579k
    /* renamed from: c */
    public Set<Map.Entry<String, String>> mo15788c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f89980d.entrySet()) {
            String str = (String) entry.getKey();
            Iterable<String> iterable = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (String simpleEntry : iterable) {
                arrayList2.add(new AbstractMap.SimpleEntry(str, simpleEntry));
            }
            C10994x.m42360n0(arrayList, arrayList2);
        }
        return CollectionsKt___CollectionsKt.m40582V5(arrayList);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return mo108637l((String) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return mo108638m((String) obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return mo108640o((String) obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : mo108642q((String) obj, (String) obj2);
    }

    /* renamed from: l */
    public /* bridge */ boolean mo108637l(String str) {
        return super.containsKey(str);
    }

    /* renamed from: m */
    public /* bridge */ boolean mo108638m(String str) {
        return super.containsValue(str);
    }

    /* renamed from: n */
    public final /* bridge */ String mo108639n(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return mo108640o((String) obj);
    }

    /* renamed from: o */
    public /* bridge */ String mo108640o(String str) {
        return (String) super.get(str);
    }

    /* renamed from: p */
    public final /* bridge */ String mo108641p(Object obj, String str) {
        return !(obj instanceof String) ? str : mo108642q((String) obj, str);
    }

    /* renamed from: q */
    public /* bridge */ String mo108642q(String str, String str2) {
        return (String) super.getOrDefault(str, str2);
    }

    @C12579k
    /* renamed from: r */
    public final Map<String, List<String>> mo108643r() {
        return this.f89980d;
    }
}
