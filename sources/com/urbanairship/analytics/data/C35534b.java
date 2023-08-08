package com.urbanairship.analytics.data;

import android.net.Uri;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0386z0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.config.C9061a;
import com.urbanairship.http.C9113a;
import com.urbanairship.http.C9115b;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.C9119d;
import com.urbanairship.http.RequestException;
import com.urbanairship.json.JsonValue;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.analytics.data.b */
public class C35534b {

    /* renamed from: c */
    public static final String f87660c = "warp9/";

    /* renamed from: a */
    public final C9115b f87661a;

    /* renamed from: b */
    public final C9061a f87662b;

    /* renamed from: com.urbanairship.analytics.data.b$a */
    public class C35535a implements C9119d<C35546g> {
        public C35535a() {
        }

        /* renamed from: b */
        public C35546g mo17322a(int i, @C0363p0 Map<String, List<String>> map, @C0363p0 String str) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return new C35546g(map);
        }
    }

    public C35534b(@C0359n0 C9061a aVar) {
        this(aVar, C9115b.f24644a);
    }

    @C0359n0
    /* renamed from: a */
    public C9116c<C35546g> mo106453a(@C0359n0 List<JsonValue> list, @C0359n0 @C0386z0(min = 1) Map<String, String> map) throws RequestException {
        Uri d = this.f87662b.mo17960c().mo17961a().mo17988a(f87660c).mo17991d();
        C9113a a = this.f87661a.mo18138a().mo18134l("POST", d).mo18136n(JsonValue.m34975U(list).toString(), "application/json").mo18129g(true).mo18131i("X-UA-Sent-At", String.format(Locale.US, "%.3f", new Object[]{Double.valueOf(((double) System.currentTimeMillis()) / 1000.0d)})).mo18128f(this.f87662b).mo18123a(map);
        C36059m.m148406b("Sending analytics events. Request: %s Events: %s", a, list);
        C9116c<C35546g> c = a.mo18125c(new C35535a());
        C36059m.m148406b("Analytics event response: %s", c);
        return c;
    }

    @C0344h1
    public C35534b(@C0359n0 C9061a aVar, @C0359n0 C9115b bVar) {
        this.f87662b = aVar;
        this.f87661a = bVar;
    }
}
