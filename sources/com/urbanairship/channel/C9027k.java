package com.urbanairship.channel;

import android.net.Uri;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.config.C9061a;
import com.urbanairship.config.C9069f;
import com.urbanairship.http.C9115b;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.C9119d;
import com.urbanairship.http.RequestException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9664m0;
import java.util.List;
import java.util.Map;

/* renamed from: com.urbanairship.channel.k */
public class C9027k {

    /* renamed from: c */
    public static final String f24277c = "api/channels/";

    /* renamed from: d */
    public static final String f24278d = "channel_id";

    /* renamed from: a */
    public final C9115b f24279a;

    /* renamed from: b */
    public final C9061a f24280b;

    /* renamed from: com.urbanairship.channel.k$a */
    public class C9028a implements C9119d<String> {
        public C9028a() {
        }

        /* renamed from: b */
        public String mo17322a(int i, @C0363p0 Map<String, List<String>> map, @C0363p0 String str) throws Exception {
            if (C9664m0.m36197d(i)) {
                return JsonValue.m34960C(str).mo18749A().mo18801A("channel_id").mo18769l();
            }
            return null;
        }
    }

    public C9027k(@C0359n0 C9061a aVar) {
        this(aVar, C9115b.f24644a);
    }

    @C0359n0
    /* renamed from: a */
    public C9116c<String> mo17847a(@C0359n0 C9029l lVar) throws RequestException {
        C36059m.m148419o("Creating channel with payload: %s", lVar);
        return this.f24279a.mo18138a().mo18134l("POST", mo17848b((String) null)).mo18130h(this.f24280b.mo17958a().f87128a, this.f24280b.mo17958a().f87129b).mo18135m(lVar).mo18127e().mo18128f(this.f24280b).mo18125c(new C9028a());
    }

    @C0363p0
    /* renamed from: b */
    public final Uri mo17848b(@C0363p0 String str) {
        C9069f a = this.f24280b.mo17960c().mo17964d().mo17988a("api/channels/");
        if (str != null) {
            a.mo17989b(str);
        }
        return a.mo17991d();
    }

    /* renamed from: c */
    public boolean mo17849c() {
        return this.f24280b.mo17960c().mo17968g();
    }

    @C0359n0
    /* renamed from: d */
    public C9116c<Void> mo17850d(@C0359n0 String str, @C0359n0 C9029l lVar) throws RequestException {
        C36059m.m148419o("Updating channel with payload: %s", lVar);
        return this.f24279a.mo18138a().mo18134l("PUT", mo17848b(str)).mo18130h(this.f24280b.mo17958a().f87128a, this.f24280b.mo17958a().f87129b).mo18135m(lVar).mo18127e().mo18128f(this.f24280b).mo18124b();
    }

    @C0344h1
    public C9027k(@C0359n0 C9061a aVar, @C0359n0 C9115b bVar) {
        this.f24280b = aVar;
        this.f24279a = bVar;
    }
}
