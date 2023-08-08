package com.urbanairship.channel;

import android.net.Uri;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.config.C9061a;
import com.urbanairship.http.C9115b;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.C9119d;
import com.urbanairship.http.RequestException;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9664m0;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.urbanairship.channel.q */
public class C9046q {

    /* renamed from: f */
    public static final String f24356f = "api/channels/subscription_lists";

    /* renamed from: g */
    public static final String f24357g = "api/subscription_lists/channels";

    /* renamed from: h */
    public static final String f24358h = "android_channel";

    /* renamed from: i */
    public static final String f24359i = "amazon_channel";

    /* renamed from: j */
    public static final String f24360j = "audience";

    /* renamed from: k */
    public static final String f24361k = "subscription_lists";

    /* renamed from: l */
    public static final String f24362l = "list_ids";

    /* renamed from: a */
    public final C9061a f24363a;

    /* renamed from: b */
    public final C9115b f24364b;

    /* renamed from: c */
    public final Callable<String> f24365c;

    /* renamed from: d */
    public final String f24366d;

    /* renamed from: e */
    public final String f24367e;

    /* renamed from: com.urbanairship.channel.q$a */
    public class C9047a implements Callable<String> {

        /* renamed from: a */
        public final /* synthetic */ C9061a f24368a;

        public C9047a(C9061a aVar) {
            this.f24368a = aVar;
        }

        /* renamed from: a */
        public String call() {
            int b = this.f24368a.mo17959b();
            if (b == 1) {
                return "amazon_channel";
            }
            if (b == 2) {
                return "android_channel";
            }
            throw new IllegalStateException("Invalid platform");
        }
    }

    /* renamed from: com.urbanairship.channel.q$b */
    public class C9048b implements C9119d<Set<String>> {
        public C9048b() {
        }

        /* renamed from: b */
        public Set<String> mo17322a(int i, @C0363p0 Map<String, List<String>> map, @C0363p0 String str) throws Exception {
            if (!C9664m0.m36197d(i)) {
                return null;
            }
            JsonValue C = JsonValue.m34960C(str);
            HashSet hashSet = new HashSet();
            Iterator<JsonValue> it = C.mo18749A().mo18801A("list_ids").mo18784z().iterator();
            while (it.hasNext()) {
                String l = it.next().mo18769l();
                if (!C9669o0.m36224e(l)) {
                    hashSet.add(l);
                }
            }
            return hashSet;
        }
    }

    @C0344h1
    public C9046q(@C0359n0 C9061a aVar, @C0359n0 C9115b bVar, @C0359n0 Callable<String> callable, @C0359n0 String str, @C0359n0 String str2) {
        this.f24363a = aVar;
        this.f24364b = bVar;
        this.f24365c = callable;
        this.f24366d = str;
        this.f24367e = str2;
    }

    /* renamed from: a */
    public static C9046q m33682a(C9061a aVar) {
        return new C9046q(aVar, C9115b.f24644a, new C9047a(aVar), f24357g, f24356f);
    }

    @C0344h1
    /* renamed from: b */
    public String mo17896b() throws RequestException {
        try {
            return this.f24365c.call();
        } catch (Exception e) {
            throw new RequestException("Audience exception", e);
        }
    }

    @C0344h1
    /* renamed from: c */
    public String mo17897c(String str) {
        return String.format("%s/%s", new Object[]{this.f24366d, str});
    }

    @C0359n0
    /* renamed from: d */
    public C9116c<Set<String>> mo17898d(@C0359n0 String str) throws RequestException {
        return this.f24364b.mo18138a().mo18134l("GET", this.f24363a.mo17960c().mo17964d().mo17988a(mo17897c(str)).mo17991d()).mo18128f(this.f24363a).mo18130h(this.f24363a.mo17958a().f87128a, this.f24363a.mo17958a().f87129b).mo18127e().mo18125c(new C9048b());
    }

    @C0344h1
    /* renamed from: e */
    public String mo17899e() {
        return this.f24367e;
    }

    @C0359n0
    /* renamed from: f */
    public C9116c<Void> mo17900f(@C0359n0 String str, @C0359n0 List<C9051t> list) throws RequestException {
        Uri d = this.f24363a.mo17960c().mo17964d().mo17988a(this.f24367e).mo17991d();
        ArrayList arrayList = new ArrayList(list.size());
        for (C9051t q : list) {
            arrayList.add(q.mo17264q());
        }
        C9322a aVar = new C9322a(arrayList);
        C9323b a = C9323b.m35017y().mo18822f("subscription_lists", aVar).mo18822f("audience", C9323b.m35017y().mo18823g(mo17896b(), str).mo18817a()).mo18817a();
        C36059m.m148419o("Updating subscription lists for ID: %s with payload: %s", str, a);
        return this.f24364b.mo18138a().mo18134l("POST", d).mo18128f(this.f24363a).mo18130h(this.f24363a.mo17958a().f87128a, this.f24363a.mo17958a().f87129b).mo18135m(a).mo18127e().mo18124b();
    }
}
