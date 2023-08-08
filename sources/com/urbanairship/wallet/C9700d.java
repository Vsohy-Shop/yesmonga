package com.urbanairship.wallet;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0386z0;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.config.C9069f;
import com.urbanairship.http.C9113a;
import com.urbanairship.http.C9115b;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.C9119d;
import com.urbanairship.http.RequestException;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9664m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.urbanairship.wallet.d */
public class C9700d {

    /* renamed from: k */
    public static final Executor f26564k = C36044d.m148369a();

    /* renamed from: l */
    public static final String f26565l = "v1/pass";

    /* renamed from: m */
    public static final String f26566m = "api_key";

    /* renamed from: n */
    public static final String f26567n = "Api-Revision";

    /* renamed from: o */
    public static final String f26568o = "1.2";

    /* renamed from: p */
    public static final String f26569p = "fields";

    /* renamed from: q */
    public static final String f26570q = "headers";

    /* renamed from: r */
    public static final String f26571r = "publicURL";

    /* renamed from: s */
    public static final String f26572s = "type";

    /* renamed from: t */
    public static final String f26573t = "tag";

    /* renamed from: u */
    public static final String f26574u = "externalId";

    /* renamed from: a */
    public final String f26575a;

    /* renamed from: b */
    public final String f26576b;

    /* renamed from: c */
    public final String f26577c;

    /* renamed from: d */
    public final Collection<C9698c> f26578d;

    /* renamed from: e */
    public final Collection<C9698c> f26579e;

    /* renamed from: f */
    public final String f26580f;

    /* renamed from: g */
    public final String f26581g;

    /* renamed from: h */
    public final C9115b f26582h;

    /* renamed from: i */
    public final Executor f26583i;

    /* renamed from: j */
    public C9697b f26584j;

    /* renamed from: com.urbanairship.wallet.d$a */
    public class C9701a implements Runnable {

        /* renamed from: com.urbanairship.wallet.d$a$a */
        public class C9702a implements C9119d<Pass> {
            public C9702a() {
            }

            /* renamed from: b */
            public Pass mo17322a(int i, @C0363p0 Map<String, List<String>> map, @C0363p0 String str) throws Exception {
                if (C9664m0.m36197d(i)) {
                    return Pass.m36274c(JsonValue.m34960C(str));
                }
                return null;
            }
        }

        public C9701a() {
        }

        public void run() {
            C9323b bVar;
            C36059m.m148413i("Requesting pass %s", C9700d.this.f26577c);
            Uri m = C9700d.this.mo19686m();
            if (m == null) {
                C36059m.m148409e("PassRequest - Invalid pass URL", new Object[0]);
                C9700d.this.f26584j.mo19675i(-1, (Pass) null);
                return;
            }
            C9323b.C9325b y = C9323b.m35017y();
            for (C9698c cVar : C9700d.this.f26578d) {
                y.mo18826j(cVar.mo19676a(), cVar.mo17264q());
            }
            if (!C9700d.this.f26579e.isEmpty()) {
                C9323b.C9325b y2 = C9323b.m35017y();
                for (C9698c cVar2 : C9700d.this.f26579e) {
                    y2.mo18826j(cVar2.mo19676a(), cVar2.mo17264q());
                }
                bVar = y2.mo18817a();
            } else {
                bVar = null;
            }
            C9323b a = C9323b.m35017y().mo18826j(C9700d.f26570q, bVar).mo18822f("fields", y.mo18817a()).mo18826j("tag", C9700d.this.f26580f).mo18822f(C9700d.f26571r, C9323b.m35017y().mo18823g("type", "multiple").mo18817a()).mo18826j(C9700d.f26574u, C9700d.this.f26581g).mo18817a();
            C9113a n = C9700d.this.f26582h.mo18138a().mo18134l("POST", m).mo18128f(UAirship.m146188Y().mo106205G()).mo18131i(C9700d.f26567n, C9700d.f26568o).mo18136n(a.toString(), "application/json");
            if (C9700d.this.f26575a != null) {
                n.mo18130h(C9700d.this.f26575a, C9700d.this.f26576b);
            }
            C36059m.m148406b("Requesting pass %s with payload: %s", m, a);
            try {
                C9116c c = n.mo18125c(new C9702a());
                C36059m.m148406b("Pass %s request finished with status %s", C9700d.this.f26577c, Integer.valueOf(c.mo18147i()));
                C9700d.this.f26584j.mo19675i(c.mo18147i(), (Pass) c.mo18144f());
            } catch (RequestException e) {
                C36059m.m148411g(e, "PassRequest - Request failed", new Object[0]);
                C9700d.this.f26584j.mo19675i(-1, (Pass) null);
            }
            C9700d.this.f26584j.run();
        }
    }

    /* renamed from: com.urbanairship.wallet.d$b */
    public static class C9703b {

        /* renamed from: a */
        public String f26587a;

        /* renamed from: b */
        public String f26588b;

        /* renamed from: c */
        public final List<C9698c> f26589c = new ArrayList();

        /* renamed from: d */
        public final List<C9698c> f26590d = new ArrayList();

        /* renamed from: e */
        public String f26591e;

        /* renamed from: f */
        public String f26592f;

        /* renamed from: g */
        public String f26593g;

        @C0359n0
        /* renamed from: h */
        public C9703b mo19690h(@C0359n0 C9698c cVar) {
            this.f26589c.add(cVar);
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C9700d mo19691i() {
            if (!TextUtils.isEmpty(this.f26587a) && !TextUtils.isEmpty(this.f26588b)) {
                return new C9700d(this);
            }
            throw new IllegalStateException("The apiKey or templateId is missing.");
        }

        @C0359n0
        /* renamed from: j */
        public C9703b mo19692j(@C0359n0 String str, @C0359n0 String str2) {
            this.f26587a = str2;
            this.f26593g = str;
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C9703b mo19693k(@C0359n0 String str, @C0359n0 String str2) {
            this.f26590d.add(C9698c.m36285b().mo19680f("barcodeAltText").mo19682h(str).mo19679e(str2).mo19678d());
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C9703b mo19694l(@C0359n0 String str, @C0359n0 String str2) {
            this.f26590d.add(C9698c.m36285b().mo19680f("barcode_value").mo19682h(str).mo19679e(str2).mo19678d());
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C9703b mo19695m(@C0359n0 String str, @C0359n0 String str2) {
            this.f26590d.add(C9698c.m36285b().mo19680f("expirationDate").mo19682h(str).mo19679e(str2).mo19678d());
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C9703b mo19696n(@C0363p0 String str) {
            this.f26592f = str;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C9703b mo19697o(@C0363p0 String str) {
            this.f26591e = str;
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C9703b mo19698p(@C0359n0 @C0386z0(min = 1) String str) {
            this.f26588b = str;
            return this;
        }
    }

    public C9700d(@C0359n0 C9703b bVar, @C0359n0 C9115b bVar2, @C0359n0 Executor executor) {
        this.f26576b = bVar.f26587a;
        this.f26575a = bVar.f26593g;
        this.f26577c = bVar.f26588b;
        this.f26578d = bVar.f26589c;
        this.f26579e = bVar.f26590d;
        this.f26580f = bVar.f26591e;
        this.f26581g = bVar.f26592f;
        this.f26582h = bVar2;
        this.f26583i = executor;
    }

    @C0359n0
    /* renamed from: n */
    public static C9703b m36305n() {
        return new C9703b();
    }

    /* renamed from: j */
    public void mo19683j() {
        C9697b bVar = this.f26584j;
        if (bVar != null) {
            bVar.cancel();
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: k */
    public void mo19684k(@C0359n0 C9696a aVar) {
        mo19685l(aVar, (Looper) null);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: l */
    public void mo19685l(@C0359n0 C9696a aVar, @C0363p0 Looper looper) {
        if (this.f26584j == null) {
            this.f26584j = new C9697b(aVar, looper);
            this.f26583i.execute(new C9701a());
            return;
        }
        throw new IllegalStateException("PassRequest can only be executed once.");
    }

    @C0363p0
    /* renamed from: m */
    public Uri mo19686m() {
        C9069f a = UAirship.m146188Y().mo106205G().mo17960c().mo17971j().mo17988a(f26565l).mo17988a(this.f26577c);
        if (this.f26575a == null) {
            a.mo17990c(f26566m, this.f26576b);
        }
        return a.mo17991d();
    }

    @C0359n0
    public String toString() {
        return "PassRequest{ templateId: " + this.f26577c + ", fields: " + this.f26578d + ", tag: " + this.f26580f + ", externalId: " + this.f26581g + ", headers: " + this.f26579e + " }";
    }

    public C9700d(@C0359n0 C9703b bVar) {
        this(bVar, C9115b.f24644a, f26564k);
    }
}
