package com.urbanairship.contacts;

import android.net.Uri;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.channel.C9004a0;
import com.urbanairship.channel.C9025i;
import com.urbanairship.config.C9061a;
import com.urbanairship.config.C9069f;
import com.urbanairship.http.C9115b;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.RequestException;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9651g0;
import com.urbanairship.util.C9654i;
import com.urbanairship.util.C9664m0;
import com.urbanairship.util.C9668o;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public class ContactApiClient {

    /* renamed from: A */
    public static final String f24436A = "locale_language";

    /* renamed from: B */
    public static final String f24437B = "msisdn";

    /* renamed from: C */
    public static final String f24438C = "sender";

    /* renamed from: D */
    public static final String f24439D = "opted_in";

    /* renamed from: E */
    public static final String f24440E = "opt_in_mode";

    /* renamed from: F */
    public static final String f24441F = "classic";

    /* renamed from: G */
    public static final String f24442G = "double";

    /* renamed from: H */
    public static final String f24443H = "type";

    /* renamed from: I */
    public static final String f24444I = "opt_in";

    /* renamed from: J */
    public static final String f24445J = "open";

    /* renamed from: K */
    public static final String f24446K = "open_platform_name";

    /* renamed from: L */
    public static final String f24447L = "identifiers";

    /* renamed from: M */
    public static final String f24448M = "associate";

    /* renamed from: N */
    public static final String f24449N = "commercial_opted_in";

    /* renamed from: O */
    public static final String f24450O = "transactional_opted_in";

    /* renamed from: P */
    public static final String f24451P = "properties";

    /* renamed from: c */
    public static final String f24452c = "api/contacts/resolve/";

    /* renamed from: d */
    public static final String f24453d = "api/contacts/identify/";

    /* renamed from: e */
    public static final String f24454e = "api/contacts/reset/";

    /* renamed from: f */
    public static final String f24455f = "api/contacts/";

    /* renamed from: g */
    public static final String f24456g = "api/channels/restricted/email/";

    /* renamed from: h */
    public static final String f24457h = "api/channels/restricted/sms/";

    /* renamed from: i */
    public static final String f24458i = "api/channels/restricted/open/";

    /* renamed from: j */
    public static final String f24459j = "api/subscription_lists/contacts/";

    /* renamed from: k */
    public static final String f24460k = "subscription_lists";

    /* renamed from: l */
    public static final String f24461l = "scope";

    /* renamed from: m */
    public static final String f24462m = "list_ids";

    /* renamed from: n */
    public static final String f24463n = "named_user_id";

    /* renamed from: o */
    public static final String f24464o = "channel_id";

    /* renamed from: p */
    public static final String f24465p = "channel";

    /* renamed from: q */
    public static final String f24466q = "device_type";

    /* renamed from: r */
    public static final String f24467r = "type";

    /* renamed from: s */
    public static final String f24468s = "contact_id";

    /* renamed from: t */
    public static final String f24469t = "is_anonymous";

    /* renamed from: u */
    public static final String f24470u = "tags";

    /* renamed from: v */
    public static final String f24471v = "attributes";

    /* renamed from: w */
    public static final String f24472w = "subscription_lists";

    /* renamed from: x */
    public static final String f24473x = "timezone";

    /* renamed from: y */
    public static final String f24474y = "address";

    /* renamed from: z */
    public static final String f24475z = "locale_country";

    /* renamed from: a */
    public final C9061a f24476a;

    /* renamed from: b */
    public final C9115b f24477b;

    public enum EmailType {
        COMMERCIAL_OPTED_IN,
        COMMERCIAL_OPTED_OUT,
        TRANSACTIONAL_OPTED_IN,
        TRANSACTIONAL_OPTED_OUT
    }

    public ContactApiClient(@C0359n0 C9061a aVar) {
        this(aVar, C9115b.f24644a);
    }

    /* renamed from: k */
    public static /* synthetic */ C9070a m33800k(String str, ChannelType channelType, int i, Map map, String str2) throws Exception {
        C36059m.m148419o("Update contact response status: %s body: %s", Integer.valueOf(i), str2);
        if (i == 200) {
            return new C9070a(str, channelType);
        }
        return null;
    }

    /* renamed from: l */
    public static /* synthetic */ Map m33801l(int i, Map map, String str) throws Exception {
        C36059m.m148419o("Fetch contact subscription list status: %s body: %s", Integer.valueOf(i), str);
        if (!C9664m0.m36197d(i)) {
            return null;
        }
        JsonValue C = JsonValue.m34960C(str);
        HashMap hashMap = new HashMap();
        Iterator<JsonValue> it = C.mo18752E().mo18801A("subscription_lists").mo18784z().iterator();
        while (it.hasNext()) {
            JsonValue next = it.next();
            Scope b = Scope.m33817b(next.mo18749A().mo18801A("scope"));
            Iterator<JsonValue> it2 = next.mo18749A().mo18801A("list_ids").mo18784z().iterator();
            while (it2.hasNext()) {
                String F = it2.next().mo18753F();
                Set set = (Set) hashMap.get(F);
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(F, set);
                }
                set.add(b);
            }
        }
        return hashMap;
    }

    /* renamed from: m */
    public static /* synthetic */ C9090p m33802m(String str, int i, Map map, String str2) throws Exception {
        if (C9664m0.m36197d(i)) {
            return new C9090p(JsonValue.m34960C(str2).mo18749A().mo18801A("contact_id").mo18769l(), false, str);
        }
        return null;
    }

    /* renamed from: n */
    public static /* synthetic */ String m33803n(int i, Map map, String str) throws Exception {
        if (C9664m0.m36197d(i)) {
            return JsonValue.m34960C(str).mo18749A().mo18801A("channel_id").mo18753F();
        }
        return null;
    }

    /* renamed from: o */
    public static /* synthetic */ C9090p m33804o(int i, Map map, String str) throws Exception {
        if (C9664m0.m36197d(i)) {
            return new C9090p(JsonValue.m34960C(str).mo18749A().mo18801A("contact_id").mo18769l(), true, (String) null);
        }
        return null;
    }

    /* renamed from: p */
    public static /* synthetic */ C9090p m33805p(int i, Map map, String str) throws Exception {
        if (!C9664m0.m36197d(i)) {
            return null;
        }
        String l = JsonValue.m34960C(str).mo18749A().mo18801A("contact_id").mo18769l();
        C9654i.m36166b(l, "Missing contact ID");
        return new C9090p(l, JsonValue.m34960C(str).mo18749A().mo18801A("is_anonymous").mo18757c(false), (String) null);
    }

    /* renamed from: h */
    public C9116c<C9070a> mo17992h(@C0359n0 String str, @C0359n0 String str2, @C0359n0 ChannelType channelType) throws RequestException {
        C9069f d = this.f24476a.mo17960c().mo17964d();
        Uri d2 = d.mo17988a("api/contacts/" + str).mo17991d();
        return this.f24477b.mo18138a().mo18134l("POST", d2).mo18130h(this.f24476a.mo17958a().f87128a, this.f24476a.mo17958a().f87129b).mo18135m(C9323b.m35017y().mo18822f(f24448M, JsonValue.m34975U(Collections.singleton(C9323b.m35017y().mo18823g("channel_id", str2).mo18823g("device_type", channelType.toString().toLowerCase(Locale.ROOT)).mo18817a()))).mo18817a()).mo18127e().mo18128f(this.f24476a).mo18125c(new C9080f(str2, channelType));
    }

    @C0359n0
    /* renamed from: i */
    public C9116c<Map<String, Set<Scope>>> mo17993i(@C0359n0 String str) throws RequestException {
        C9069f d = this.f24476a.mo17960c().mo17964d();
        return this.f24477b.mo18138a().mo18134l("GET", d.mo17988a(f24459j + str).mo17991d()).mo18128f(this.f24476a).mo18130h(this.f24476a.mo17958a().f87128a, this.f24476a.mo17958a().f87129b).mo18127e().mo18125c(new C9086l());
    }

    @C0359n0
    /* renamed from: j */
    public C9116c<C9090p> mo17994j(@C0359n0 String str, @C0359n0 String str2, @C0363p0 String str3) throws RequestException {
        Uri d = this.f24476a.mo17960c().mo17964d().mo17988a(f24453d).mo17991d();
        C9323b.C9325b g = C9323b.m35017y().mo18823g("named_user_id", str).mo18823g("channel_id", str2).mo18823g("device_type", C9651g0.m36157b(this.f24476a.mo17959b()));
        if (str3 != null) {
            g.mo18823g("contact_id", str3);
        }
        return this.f24477b.mo18138a().mo18134l("POST", d).mo18130h(this.f24476a.mo17958a().f87128a, this.f24476a.mo17958a().f87129b).mo18135m(g.mo18817a()).mo18127e().mo18128f(this.f24476a).mo18125c(new C9085k(str));
    }

    /* renamed from: r */
    public final C9116c<C9070a> mo17995r(@C0359n0 String str, @C0363p0 Uri uri, @C0359n0 C9333e eVar, @C0359n0 ChannelType channelType) throws RequestException {
        C9116c c = this.f24477b.mo18138a().mo18134l("POST", uri).mo18130h(this.f24476a.mo17958a().f87128a, this.f24476a.mo17958a().f87129b).mo18135m(eVar).mo18127e().mo18128f(this.f24476a).mo18125c(new C9081g());
        if (c.mo18150l()) {
            return mo17992h(str, (String) c.mo18144f(), channelType);
        }
        return new C9116c.C9118b(c.mo18147i()).mo18153f();
    }

    @C0359n0
    /* renamed from: s */
    public C9116c<C9070a> mo17996s(@C0359n0 String str, @C0359n0 String str2, @C0359n0 C9099r rVar) throws RequestException {
        String str3;
        Uri d = this.f24476a.mo17960c().mo17964d().mo17988a(f24456g).mo17991d();
        C9323b.C9325b g = C9323b.m35017y().mo18823g("type", "email").mo18823g("address", str2).mo18823g("timezone", TimeZone.getDefault().getID()).mo18823g("locale_language", Locale.getDefault().getLanguage()).mo18823g("locale_country", Locale.getDefault().getCountry());
        if (rVar.mo18088c() > 0) {
            g.mo18823g("commercial_opted_in", C9668o.m36217a(rVar.mo18088c()));
        }
        if (rVar.mo18090e() > 0) {
            g.mo18823g("transactional_opted_in", C9668o.m36217a(rVar.mo18090e()));
        }
        C9323b.C9325b f = C9323b.m35017y().mo18822f("channel", g.mo18817a());
        if (rVar.mo18091f()) {
            str3 = f24442G;
        } else {
            str3 = f24441F;
        }
        return mo17995r(str, d, f.mo18823g(f24440E, str3).mo18822f("properties", rVar.mo18089d()).mo18817a(), ChannelType.EMAIL);
    }

    @C0359n0
    /* renamed from: t */
    public C9116c<C9070a> mo17997t(@C0359n0 String str, @C0359n0 String str2, @C0359n0 C9100s sVar) throws RequestException {
        Uri d = this.f24476a.mo17960c().mo17964d().mo17988a(f24458i).mo17991d();
        C9323b.C9325b g = C9323b.m35017y().mo18823g("type", "open").mo18824h("opt_in", true).mo18823g("address", str2).mo18823g("timezone", TimeZone.getDefault().getID()).mo18823g("locale_language", Locale.getDefault().getLanguage()).mo18823g("locale_country", Locale.getDefault().getCountry());
        C9323b.C9325b j = C9323b.m35017y().mo18823g(f24446K, sVar.mo18093c()).mo18826j("identifiers", sVar.mo18092b());
        if (sVar.mo18092b() != null) {
            C9323b.C9325b y = C9323b.m35017y();
            for (Map.Entry next : sVar.mo18092b().entrySet()) {
                y.mo18823g((String) next.getKey(), (String) next.getValue());
            }
            j.mo18822f("identifiers", y.mo18817a());
        }
        g.mo18822f("open", j.mo18817a());
        return mo17995r(str, d, C9323b.m35017y().mo18822f("channel", g.mo18817a()).mo18817a(), ChannelType.OPEN);
    }

    @C0359n0
    /* renamed from: u */
    public C9116c<C9070a> mo17998u(@C0359n0 String str, @C0359n0 String str2, @C0359n0 C9103v vVar) throws RequestException {
        return mo17995r(str, this.f24476a.mo17960c().mo17964d().mo17988a(f24457h).mo17991d(), C9323b.m35017y().mo18823g(f24437B, str2).mo18823g("sender", vVar.mo18108b()).mo18823g("timezone", TimeZone.getDefault().getID()).mo18823g("locale_language", Locale.getDefault().getLanguage()).mo18823g("locale_country", Locale.getDefault().getCountry()).mo18817a(), ChannelType.SMS);
    }

    @C0359n0
    /* renamed from: v */
    public C9116c<C9090p> mo17999v(@C0359n0 String str) throws RequestException {
        Uri d = this.f24476a.mo17960c().mo17964d().mo17988a(f24454e).mo17991d();
        return this.f24477b.mo18138a().mo18134l("POST", d).mo18130h(this.f24476a.mo17958a().f87128a, this.f24476a.mo17958a().f87129b).mo18135m(C9323b.m35017y().mo18823g("channel_id", str).mo18823g("device_type", C9651g0.m36157b(this.f24476a.mo17959b())).mo18817a()).mo18127e().mo18128f(this.f24476a).mo18125c(new C9083i());
    }

    @C0359n0
    /* renamed from: w */
    public C9116c<C9090p> mo18000w(@C0359n0 String str) throws RequestException {
        Uri d = this.f24476a.mo17960c().mo17964d().mo17988a(f24452c).mo17991d();
        return this.f24477b.mo18138a().mo18134l("POST", d).mo18130h(this.f24476a.mo17958a().f87128a, this.f24476a.mo17958a().f87129b).mo18135m(C9323b.m35017y().mo18823g("channel_id", str).mo18823g("device_type", C9651g0.m36157b(this.f24476a.mo17959b())).mo18817a()).mo18127e().mo18128f(this.f24476a).mo18125c(new C9082h());
    }

    @C0359n0
    /* renamed from: x */
    public C9116c<Void> mo18001x(@C0359n0 String str, @C0363p0 List<C9004a0> list, @C0363p0 List<C9025i> list2, @C0363p0 List<C9102u> list3) throws RequestException {
        C9069f d = this.f24476a.mo17960c().mo17964d();
        Uri d2 = d.mo17988a("api/contacts/" + str).mo17991d();
        C9323b.C9325b y = C9323b.m35017y();
        if (list != null && !list.isEmpty()) {
            C9323b.C9325b y2 = C9323b.m35017y();
            for (C9004a0 next : C9004a0.m33497b(list)) {
                if (next.mo17264q().mo18778u()) {
                    y2.mo18825i(next.mo17264q().mo18749A());
                }
            }
            y.mo18822f("tags", y2.mo18817a());
        }
        if (list2 != null && !list2.isEmpty()) {
            y.mo18826j("attributes", C9025i.m33597a(list2));
        }
        if (list3 != null && !list3.isEmpty()) {
            y.mo18826j("subscription_lists", C9102u.m33981b(list3));
        }
        return this.f24477b.mo18138a().mo18134l("POST", d2).mo18130h(this.f24476a.mo17958a().f87128a, this.f24476a.mo17958a().f87129b).mo18135m(y.mo18817a()).mo18127e().mo18128f(this.f24476a).mo18125c(new C9084j());
    }

    @C0344h1
    public ContactApiClient(@C0359n0 C9061a aVar, @C0359n0 C9115b bVar) {
        this.f24476a = aVar;
        this.f24477b = bVar;
    }
}
