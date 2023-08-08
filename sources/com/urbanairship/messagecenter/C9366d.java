package com.urbanairship.messagecenter;

import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.config.C9061a;
import com.urbanairship.config.C9062b;
import com.urbanairship.config.C9069f;
import com.urbanairship.http.C9115b;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.C9119d;
import com.urbanairship.http.RequestException;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9664m0;
import com.urbanairship.util.C9669o0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.urbanairship.messagecenter.d */
public class C9366d {

    /* renamed from: c */
    public static final String f25590c = "api/user/";

    /* renamed from: d */
    public static final String f25591d = "messages/delete/";

    /* renamed from: e */
    public static final String f25592e = "messages/unread/";

    /* renamed from: f */
    public static final String f25593f = "messages/";

    /* renamed from: g */
    public static final String f25594g = "messages";

    /* renamed from: h */
    public static final String f25595h = "X-UA-Channel-ID";

    /* renamed from: i */
    public static final String f25596i = "amazon_channels";

    /* renamed from: j */
    public static final String f25597j = "android_channels";

    /* renamed from: k */
    public static final String f25598k = "add";

    /* renamed from: a */
    public final C9061a f25599a;

    /* renamed from: b */
    public final C9115b f25600b;

    /* renamed from: com.urbanairship.messagecenter.d$a */
    public class C9367a implements C9119d<C9322a> {
        public C9367a() {
        }

        /* renamed from: b */
        public C9322a mo17322a(int i, @C0363p0 Map<String, List<String>> map, @C0363p0 String str) throws Exception {
            if (!C9664m0.m36197d(i)) {
                return null;
            }
            C9322a h = JsonValue.m34960C(str).mo18749A().mo18801A("messages").mo18764h();
            if (h != null) {
                return h;
            }
            throw new JsonException("Invalid response, missing messages.");
        }
    }

    /* renamed from: com.urbanairship.messagecenter.d$b */
    public class C9368b implements C9119d<C9351a0> {
        public C9368b() {
        }

        /* renamed from: b */
        public C9351a0 mo17322a(int i, @C0363p0 Map<String, List<String>> map, @C0363p0 String str) throws Exception {
            if (!C9664m0.m36197d(i)) {
                return null;
            }
            C9323b j = JsonValue.m34960C(str).mo18767j();
            if (j != null) {
                String l = j.mo18801A("user_id").mo18769l();
                String l2 = j.mo18801A("password").mo18769l();
                if (!C9669o0.m36224e(l) && !C9669o0.m36224e(l2)) {
                    return new C9351a0(l, l2);
                }
                throw new JsonException("InboxApiClient - Invalid response, missing credentials.");
            }
            throw new JsonException("InboxApiClient - Invalid response, missing credentials.");
        }
    }

    public C9366d(@C0359n0 C9061a aVar) {
        this(aVar, C9115b.f24644a);
    }

    /* renamed from: a */
    public final String mo18953a(@C0359n0 String str) throws RequestException {
        HashMap hashMap = new HashMap();
        hashMap.put(mo18957e(), Collections.singletonList(str));
        return JsonValue.m34975U(hashMap).toString();
    }

    /* renamed from: b */
    public final String mo18954b(@C0359n0 String str) throws RequestException {
        HashMap hashMap = new HashMap();
        hashMap.put("add", Collections.singletonList(str));
        HashMap hashMap2 = new HashMap();
        hashMap2.put(mo18957e(), hashMap);
        return JsonValue.m34975U(hashMap2).toString();
    }

    /* renamed from: c */
    public C9116c<C9351a0> mo18955c(@C0359n0 String str) throws RequestException {
        Uri f = mo18958f(this.f25599a.mo17960c(), new String[0]);
        String a = mo18953a(str);
        C36059m.m148419o("Creating Rich Push user with payload: %s", a);
        return this.f25600b.mo18138a().mo18134l("POST", f).mo18130h(this.f25599a.mo17958a().f87128a, this.f25599a.mo17958a().f87129b).mo18136n(a, "application/json").mo18127e().mo18128f(this.f25599a).mo18125c(new C9368b());
    }

    @C0359n0
    /* renamed from: d */
    public C9116c<C9322a> mo18956d(@C0359n0 C9420z zVar, @C0359n0 String str, long j) throws RequestException {
        return this.f25600b.mo18138a().mo18134l("GET", mo18958f(this.f25599a.mo17960c(), zVar.mo19088d(), f25593f)).mo18130h(zVar.mo19088d(), zVar.mo19089e()).mo18127e().mo18128f(this.f25599a).mo18131i(f25595h, str).mo18132j(j).mo18125c(new C9367a());
    }

    @C0359n0
    /* renamed from: e */
    public final String mo18957e() throws RequestException {
        int b = this.f25599a.mo17959b();
        if (b == 1) {
            return f25596i;
        }
        if (b == 2) {
            return f25597j;
        }
        throw new RequestException("Invalid platform");
    }

    @C0363p0
    /* renamed from: f */
    public final Uri mo18958f(@C0359n0 C9062b bVar, String... strArr) {
        C9069f a = bVar.mo17964d().mo17988a(f25590c);
        for (String str : strArr) {
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            a.mo17988a(str);
        }
        return a.mo17991d();
    }

    /* renamed from: g */
    public C9116c<Void> mo18959g(@C0359n0 C9420z zVar, @C0359n0 String str, @C0359n0 List<JsonValue> list) throws RequestException {
        Uri f = mo18958f(this.f25599a.mo17960c(), zVar.mo19088d(), f25591d);
        C9323b a = C9323b.m35017y().mo18822f("messages", JsonValue.m34975U(list)).mo18817a();
        C36059m.m148419o("Deleting inbox messages with payload: %s", a);
        return this.f25600b.mo18138a().mo18134l("POST", f).mo18130h(zVar.mo19088d(), zVar.mo19089e()).mo18136n(a.toString(), "application/json").mo18131i(f25595h, str).mo18127e().mo18128f(this.f25599a).mo18124b();
    }

    /* renamed from: h */
    public C9116c<Void> mo18960h(@C0359n0 C9420z zVar, @C0359n0 String str, @C0359n0 List<JsonValue> list) throws RequestException {
        Uri f = mo18958f(this.f25599a.mo17960c(), zVar.mo19088d(), f25592e);
        C9323b a = C9323b.m35017y().mo18822f("messages", JsonValue.m34975U(list)).mo18817a();
        C36059m.m148419o("Marking inbox messages read request with payload: %s", a);
        return this.f25600b.mo18138a().mo18134l("POST", f).mo18130h(zVar.mo19088d(), zVar.mo19089e()).mo18136n(a.toString(), "application/json").mo18131i(f25595h, str).mo18131i("Accept", "application/vnd.urbanairship+json; version=3;").mo18124b();
    }

    /* renamed from: i */
    public C9116c<Void> mo18961i(@C0359n0 C9420z zVar, @C0359n0 String str) throws RequestException {
        Uri f = mo18958f(this.f25599a.mo17960c(), zVar.mo19088d());
        String b = mo18954b(str);
        C36059m.m148419o("Updating user with payload: %s", b);
        return this.f25600b.mo18138a().mo18134l("POST", f).mo18130h(zVar.mo19088d(), zVar.mo19089e()).mo18136n(b, "application/json").mo18127e().mo18128f(this.f25599a).mo18124b();
    }

    public C9366d(@C0359n0 C9061a aVar, @C0359n0 C9115b bVar) {
        this.f25599a = aVar;
        this.f25600b = bVar;
    }
}
