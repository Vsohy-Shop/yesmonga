package com.urbanairship.remotedata;

import android.net.Uri;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36078w;
import com.urbanairship.UAirship;
import com.urbanairship.base.C9002b;
import com.urbanairship.config.C9061a;
import com.urbanairship.config.C9069f;
import com.urbanairship.http.C9113a;
import com.urbanairship.http.C9115b;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.RequestException;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.push.PushProvider;
import com.urbanairship.util.C9669o0;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.remotedata.l */
public class C9622l {

    /* renamed from: d */
    public static final String f26349d = "api/remote-data/app/";

    /* renamed from: e */
    public static final String f26350e = "sdk_version";

    /* renamed from: f */
    public static final String f26351f = "country";

    /* renamed from: g */
    public static final String f26352g = "language";

    /* renamed from: h */
    public static final String f26353h = "random_value";

    /* renamed from: i */
    public static final String f26354i = "manufacturer";

    /* renamed from: j */
    public static final String f26355j = "push_providers";

    /* renamed from: k */
    public static final List<String> f26356k = Collections.singletonList("huawei");

    /* renamed from: l */
    public static final String f26357l = "amazon";

    /* renamed from: m */
    public static final String f26358m = "android";

    /* renamed from: a */
    public final C9061a f26359a;

    /* renamed from: b */
    public final C9115b f26360b;

    /* renamed from: c */
    public final C9002b<C36078w> f26361c;

    /* renamed from: com.urbanairship.remotedata.l$a */
    public interface C9623a {
        /* renamed from: a */
        Set<C9625m> mo19539a(Map<String, List<String>> map, Uri uri, C9322a aVar);
    }

    /* renamed from: com.urbanairship.remotedata.l$b */
    public static class C9624b {
        @C0359n0

        /* renamed from: a */
        public final Uri f26362a;
        @C0359n0

        /* renamed from: b */
        public final Set<C9625m> f26363b;

        public C9624b(@C0359n0 Uri uri, @C0359n0 Set<C9625m> set) {
            this.f26362a = uri;
            this.f26363b = set;
        }
    }

    public C9622l(@C0359n0 C9061a aVar, C9002b<C36078w> bVar) {
        this(aVar, bVar, C9115b.f24644a);
    }

    @C0359n0
    /* renamed from: c */
    public static String m36046c() {
        String str = Build.MANUFACTURER;
        if (str == null) {
            return "";
        }
        return str.toLowerCase(Locale.US);
    }

    /* renamed from: f */
    public static /* synthetic */ C9624b m36047f(Uri uri, C9623a aVar, int i, Map map, String str) throws Exception {
        if (i != 200) {
            return null;
        }
        C9322a h = JsonValue.m34960C(str).mo18749A().mo18801A(C9628n.f26375e).mo18764h();
        if (h != null) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return new C9624b(uri, aVar.mo19539a(map, uri, h));
        }
        throw new JsonException("Response does not contain payloads");
    }

    @C0359n0
    /* renamed from: b */
    public C9116c<C9624b> mo19560b(@C0363p0 String str, @C0359n0 Locale locale, int i, @C0359n0 C9623a aVar) throws RequestException {
        Uri e = mo19562e(locale, i);
        C9113a h = this.f26360b.mo18138a().mo18134l("GET", e).mo18128f(this.f26359a).mo18130h(this.f26359a.mo17958a().f87128a, this.f26359a.mo17958a().f87129b);
        if (str != null) {
            h.mo18131i("If-Modified-Since", str);
        }
        return h.mo18125c(new C9621k(e, aVar));
    }

    @C0363p0
    /* renamed from: d */
    public final String mo19561d() {
        HashSet hashSet = new HashSet();
        C36078w wVar = this.f26361c.get();
        if (wVar != null) {
            for (PushProvider deliveryType : wVar.mo107881c()) {
                hashSet.add(deliveryType.getDeliveryType());
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return C9669o0.m36225f(hashSet, ",");
    }

    @C0363p0
    /* renamed from: e */
    public Uri mo19562e(@C0359n0 Locale locale, int i) {
        String str;
        C9069f b = this.f26359a.mo17960c().mo17970i().mo17988a(f26349d).mo17989b(this.f26359a.mo17958a().f87128a);
        if (this.f26359a.mo17959b() == 1) {
            str = "amazon";
        } else {
            str = "android";
        }
        C9069f c = b.mo17989b(str).mo17990c("sdk_version", UAirship.m146181I()).mo17990c(f26353h, String.valueOf(i));
        String c2 = m36046c();
        if (mo19563g(c2)) {
            c.mo17990c("manufacturer", c2);
        }
        String d = mo19561d();
        if (d != null) {
            c.mo17990c(f26355j, d);
        }
        if (!C9669o0.m36224e(locale.getLanguage())) {
            c.mo17990c("language", locale.getLanguage());
        }
        if (!C9669o0.m36224e(locale.getCountry())) {
            c.mo17990c("country", locale.getCountry());
        }
        return c.mo17991d();
    }

    /* renamed from: g */
    public final boolean mo19563g(@C0359n0 String str) {
        return f26356k.contains(str.toLowerCase());
    }

    @C0344h1
    public C9622l(@C0359n0 C9061a aVar, @C0359n0 C9002b<C36078w> bVar, @C0359n0 C9115b bVar2) {
        this.f26359a = aVar;
        this.f26361c = bVar;
        this.f26360b = bVar2;
    }
}
