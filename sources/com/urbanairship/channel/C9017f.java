package com.urbanairship.channel;

import android.net.Uri;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.config.C9061a;
import com.urbanairship.http.C9115b;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.RequestException;
import com.urbanairship.json.C9323b;
import java.util.List;

/* renamed from: com.urbanairship.channel.f */
public class C9017f {

    /* renamed from: d */
    public static final String f24242d = "api/channels/";

    /* renamed from: e */
    public static final String f24243e = "api/named_users/";

    /* renamed from: f */
    public static final String f24244f = "api/contacts/";

    /* renamed from: g */
    public static final String f24245g = "attributes";

    /* renamed from: h */
    public static final String f24246h = "platform";

    /* renamed from: i */
    public static final String f24247i = "attributes";

    /* renamed from: j */
    public static final String f24248j = "android";

    /* renamed from: k */
    public static final String f24249k = "amazon";
    @C0344h1

    /* renamed from: l */
    public static final C9021d f24250l = new C9018a();
    @C0344h1

    /* renamed from: m */
    public static final C9021d f24251m = new C9019b();
    @C0344h1

    /* renamed from: n */
    public static final C9021d f24252n = new C9020c();

    /* renamed from: a */
    public final C9061a f24253a;

    /* renamed from: b */
    public final C9115b f24254b;

    /* renamed from: c */
    public final C9021d f24255c;

    /* renamed from: com.urbanairship.channel.f$a */
    public class C9018a implements C9021d {
        @C0363p0
        /* renamed from: a */
        public Uri mo17827a(@C0359n0 C9061a aVar, @C0359n0 String str) {
            return aVar.mo17960c().mo17964d().mo17988a(C9017f.f24243e).mo17989b(str).mo17989b("attributes").mo17991d();
        }
    }

    /* renamed from: com.urbanairship.channel.f$b */
    public class C9019b implements C9021d {
        @C0363p0
        /* renamed from: a */
        public Uri mo17827a(@C0359n0 C9061a aVar, @C0359n0 String str) {
            String str2;
            if (aVar.mo17959b() == 1) {
                str2 = "amazon";
            } else {
                str2 = "android";
            }
            return aVar.mo17960c().mo17964d().mo17988a("api/channels/").mo17989b(str).mo17989b("attributes").mo17990c("platform", str2).mo17991d();
        }
    }

    /* renamed from: com.urbanairship.channel.f$c */
    public class C9020c implements C9021d {
        @C0363p0
        /* renamed from: a */
        public Uri mo17827a(@C0359n0 C9061a aVar, @C0359n0 String str) {
            return aVar.mo17960c().mo17964d().mo17988a("api/contacts/").mo17989b(str).mo17989b("attributes").mo17991d();
        }
    }

    @C0344h1
    /* renamed from: com.urbanairship.channel.f$d */
    public interface C9021d {
        @C0363p0
        /* renamed from: a */
        Uri mo17827a(@C0359n0 C9061a aVar, @C0359n0 String str);
    }

    @C0344h1
    public C9017f(@C0359n0 C9061a aVar, @C0359n0 C9115b bVar, @C0359n0 C9021d dVar) {
        this.f24253a = aVar;
        this.f24254b = bVar;
        this.f24255c = dVar;
    }

    /* renamed from: a */
    public static C9017f m33577a(C9061a aVar) {
        return new C9017f(aVar, C9115b.f24644a, f24251m);
    }

    /* renamed from: b */
    public static C9017f m33578b(C9061a aVar) {
        return new C9017f(aVar, C9115b.f24644a, f24252n);
    }

    /* renamed from: c */
    public static C9017f m33579c(C9061a aVar) {
        return new C9017f(aVar, C9115b.f24644a, f24250l);
    }

    @C0359n0
    /* renamed from: d */
    public C9116c<Void> mo17826d(@C0359n0 String str, @C0359n0 List<C9025i> list) throws RequestException {
        Uri a = this.f24255c.mo17827a(this.f24253a, str);
        C9323b a2 = C9323b.m35017y().mo18826j("attributes", list).mo18817a();
        C36059m.m148419o("Updating attributes for Id:%s with payload: %s", str, a2);
        return this.f24254b.mo18138a().mo18134l("POST", a).mo18128f(this.f24253a).mo18130h(this.f24253a.mo17958a().f87128a, this.f24253a.mo17958a().f87129b).mo18135m(a2).mo18127e().mo18124b();
    }
}
