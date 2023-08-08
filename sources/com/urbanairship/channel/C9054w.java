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
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: com.urbanairship.channel.w */
public class C9054w {

    /* renamed from: e */
    public static final String f24390e = "api/channels/tags/";

    /* renamed from: f */
    public static final String f24391f = "api/named_users/tags/";

    /* renamed from: g */
    public static final String f24392g = "api/contacts/tags/";

    /* renamed from: h */
    public static final String f24393h = "android_channel";

    /* renamed from: i */
    public static final String f24394i = "amazon_channel";

    /* renamed from: j */
    public static final String f24395j = "named_user_id";

    /* renamed from: k */
    public static final String f24396k = "contact_id";

    /* renamed from: l */
    public static final String f24397l = "audience";

    /* renamed from: a */
    public final C9061a f24398a;

    /* renamed from: b */
    public final C9115b f24399b;

    /* renamed from: c */
    public Callable<String> f24400c;

    /* renamed from: d */
    public final String f24401d;

    /* renamed from: com.urbanairship.channel.w$a */
    public class C9055a implements Callable<String> {
        /* renamed from: a */
        public String call() throws Exception {
            return "named_user_id";
        }
    }

    /* renamed from: com.urbanairship.channel.w$b */
    public class C9056b implements Callable<String> {

        /* renamed from: a */
        public final /* synthetic */ C9061a f24402a;

        public C9056b(C9061a aVar) {
            this.f24402a = aVar;
        }

        /* renamed from: a */
        public String call() throws Exception {
            int b = this.f24402a.mo17959b();
            if (b == 1) {
                return "amazon_channel";
            }
            if (b == 2) {
                return "android_channel";
            }
            throw new IllegalStateException("Invalid platform");
        }
    }

    /* renamed from: com.urbanairship.channel.w$c */
    public class C9057c implements Callable<String> {
        /* renamed from: a */
        public String call() throws Exception {
            return "contact_id";
        }
    }

    @C0344h1
    public C9054w(@C0359n0 C9061a aVar, @C0359n0 C9115b bVar, @C0359n0 Callable<String> callable, @C0359n0 String str) {
        this.f24398a = aVar;
        this.f24399b = bVar;
        this.f24400c = callable;
        this.f24401d = str;
    }

    /* renamed from: a */
    public static C9054w m33727a(C9061a aVar) {
        return new C9054w(aVar, C9115b.f24644a, new C9056b(aVar), f24390e);
    }

    /* renamed from: b */
    public static C9054w m33728b(C9061a aVar) {
        return new C9054w(aVar, C9115b.f24644a, new C9057c(), f24392g);
    }

    /* renamed from: f */
    public static C9054w m33729f(C9061a aVar) {
        return new C9054w(aVar, C9115b.f24644a, new C9055a(), f24391f);
    }

    @C0344h1
    /* renamed from: c */
    public String mo17935c() throws RequestException {
        try {
            return this.f24400c.call();
        } catch (Exception e) {
            throw new RequestException("Audience exception", e);
        }
    }

    @C0344h1
    /* renamed from: d */
    public String mo17936d() {
        return this.f24401d;
    }

    /* renamed from: e */
    public final void mo17937e(@C0363p0 C9116c cVar) {
        if (cVar != null && cVar.mo18141c() != null) {
            try {
                JsonValue C = JsonValue.m34960C(cVar.mo18141c());
                if (C.mo18778u()) {
                    if (C.mo18749A().mo18805e("warnings")) {
                        Iterator<JsonValue> it = C.mo18749A().mo18801A("warnings").mo18784z().iterator();
                        while (it.hasNext()) {
                            C36059m.m148421q("Tag Groups warnings: %s", it.next());
                        }
                    }
                    if (C.mo18749A().mo18805e("error")) {
                        C36059m.m148409e("Tag Groups error: %s", C.mo18749A().mo18812k("error"));
                    }
                }
            } catch (JsonException e) {
                C36059m.m148411g(e, "Unable to parse tag group response", new Object[0]);
            }
        }
    }

    @C0359n0
    /* renamed from: g */
    public C9116c<Void> mo17938g(@C0359n0 String str, @C0359n0 C9004a0 a0Var) throws RequestException {
        Uri d = this.f24398a.mo17960c().mo17964d().mo17988a(this.f24401d).mo17991d();
        C9323b a = C9323b.m35017y().mo18825i(a0Var.mo17264q().mo18749A()).mo18822f("audience", C9323b.m35017y().mo18823g(mo17935c(), str).mo18817a()).mo18817a();
        C36059m.m148419o("Updating tag groups with path: %s, payload: %s", this.f24401d, a);
        C9116c<Void> b = this.f24399b.mo18138a().mo18134l("POST", d).mo18130h(this.f24398a.mo17958a().f87128a, this.f24398a.mo17958a().f87129b).mo18135m(a).mo18127e().mo18128f(this.f24398a).mo18124b();
        mo17937e(b);
        return b;
    }
}
