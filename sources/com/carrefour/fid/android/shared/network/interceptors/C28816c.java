package com.carrefour.fid.android.shared.network.interceptors;

import androidx.compose.runtime.internal.C8567o;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.network.interceptors.c */
public final class C28816c implements CookieJar {
    @C12579k

    /* renamed from: a */
    public static final C28817a f70613a = new C28817a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f70614b = 0;
    @C12579k

    /* renamed from: c */
    public static final HashMap<String, List<Cookie>> f70615c = new HashMap<>();

    /* renamed from: com.carrefour.fid.android.shared.network.interceptors.c$a */
    public static final class C28817a {
        public /* synthetic */ C28817a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28817a() {
        }
    }

    @C12579k
    public List<Cookie> loadForRequest(@C12579k HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "url");
        List<Cookie> list = f70615c.get(httpUrl.host());
        if (list == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return list;
    }

    public void saveFromResponse(@C12579k HttpUrl httpUrl, @C12579k List<Cookie> list) {
        Intrinsics.checkNotNullParameter(httpUrl, "url");
        Intrinsics.checkNotNullParameter(list, "cookies");
        f70615c.put(httpUrl.host(), CollectionsKt___CollectionsKt.m40572T5(list));
    }
}
