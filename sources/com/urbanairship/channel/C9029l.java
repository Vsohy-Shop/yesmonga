package com.urbanairship.channel;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17992m;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.channel.l */
public class C9029l implements C9333e {
    @C0359n0

    /* renamed from: K0 */
    public static final String f24282K0 = "android";
    @C0359n0

    /* renamed from: L0 */
    public static final String f24283L0 = "amazon";

    /* renamed from: M0 */
    public static final String f24284M0 = "channel";

    /* renamed from: N0 */
    public static final String f24285N0 = "device_type";

    /* renamed from: O0 */
    public static final String f24286O0 = "opt_in";

    /* renamed from: P0 */
    public static final String f24287P0 = "background";

    /* renamed from: Q0 */
    public static final String f24288Q0 = "push_address";

    /* renamed from: R0 */
    public static final String f24289R0 = "set_tags";

    /* renamed from: S0 */
    public static final String f24290S0 = "tags";

    /* renamed from: T0 */
    public static final String f24291T0 = "tag_changes";

    /* renamed from: U0 */
    public static final String f24292U0 = "add";

    /* renamed from: V0 */
    public static final String f24293V0 = "remove";

    /* renamed from: W0 */
    public static final String f24294W0 = "identity_hints";

    /* renamed from: X0 */
    public static final String f24295X0 = "user_id";

    /* renamed from: Y0 */
    public static final String f24296Y0 = "timezone";

    /* renamed from: Z0 */
    public static final String f24297Z0 = "locale_language";

    /* renamed from: a1 */
    public static final String f24298a1 = "locale_country";

    /* renamed from: b1 */
    public static final String f24299b1 = "location_settings";

    /* renamed from: c1 */
    public static final String f24300c1 = "app_version";

    /* renamed from: d1 */
    public static final String f24301d1 = "sdk_version";

    /* renamed from: e1 */
    public static final String f24302e1 = "device_model";

    /* renamed from: f1 */
    public static final String f24303f1 = "android_api_version";

    /* renamed from: g1 */
    public static final String f24304g1 = "carrier";

    /* renamed from: h1 */
    public static final String f24305h1 = "accengage_device_id";

    /* renamed from: i1 */
    public static final String f24306i1 = "contact_id";

    /* renamed from: j1 */
    public static final String f24307j1 = "android";

    /* renamed from: k1 */
    public static final String f24308k1 = "delivery_type";

    /* renamed from: l1 */
    public static final String f24309l1 = "is_activity";

    /* renamed from: E0 */
    public final Integer f24310E0;

    /* renamed from: F0 */
    public final String f24311F0;

    /* renamed from: G0 */
    public final String f24312G0;

    /* renamed from: H0 */
    public final String f24313H0;

    /* renamed from: I0 */
    public final String f24314I0;

    /* renamed from: J0 */
    public final boolean f24315J0;

    /* renamed from: X */
    public final String f24316X;

    /* renamed from: Y */
    public final String f24317Y;

    /* renamed from: Z */
    public final String f24318Z;

    /* renamed from: a */
    public final boolean f24319a;

    /* renamed from: b */
    public final boolean f24320b;

    /* renamed from: c */
    public final String f24321c;

    /* renamed from: d */
    public final String f24322d;

    /* renamed from: e */
    public final boolean f24323e;

    /* renamed from: f */
    public final Set<String> f24324f;

    /* renamed from: g */
    public final C9323b f24325g;

    /* renamed from: v */
    public final String f24326v;

    /* renamed from: w */
    public final String f24327w;

    /* renamed from: x */
    public final String f24328x;

    /* renamed from: y */
    public final String f24329y;

    /* renamed from: z */
    public final Boolean f24330z;

    /* renamed from: com.urbanairship.channel.l$b */
    public static class C9031b {

        /* renamed from: a */
        public boolean f24331a;

        /* renamed from: b */
        public boolean f24332b;

        /* renamed from: c */
        public String f24333c;

        /* renamed from: d */
        public String f24334d;

        /* renamed from: e */
        public boolean f24335e;

        /* renamed from: f */
        public Set<String> f24336f;

        /* renamed from: g */
        public C9323b f24337g;

        /* renamed from: h */
        public String f24338h;

        /* renamed from: i */
        public String f24339i;

        /* renamed from: j */
        public String f24340j;

        /* renamed from: k */
        public String f24341k;

        /* renamed from: l */
        public Boolean f24342l;

        /* renamed from: m */
        public String f24343m;

        /* renamed from: n */
        public String f24344n;

        /* renamed from: o */
        public String f24345o;

        /* renamed from: p */
        public Integer f24346p;

        /* renamed from: q */
        public String f24347q;

        /* renamed from: r */
        public String f24348r;

        /* renamed from: s */
        public String f24349s;

        /* renamed from: t */
        public String f24350t;

        /* renamed from: u */
        public boolean f24351u;

        public C9031b() {
        }

        @C0359n0
        /* renamed from: A */
        public C9031b mo17858A(boolean z) {
            this.f24332b = z;
            return this;
        }

        @C0359n0
        /* renamed from: B */
        public C9031b mo17859B(@C0363p0 String str) {
            this.f24347q = str;
            return this;
        }

        @C0359n0
        /* renamed from: C */
        public C9031b mo17860C(@C0363p0 String str) {
            this.f24350t = str;
            return this;
        }

        @C0359n0
        /* renamed from: D */
        public C9031b mo17861D(@C0363p0 String str) {
            this.f24341k = str;
            return this;
        }

        @C0359n0
        /* renamed from: E */
        public C9031b mo17862E(@C0363p0 String str) {
            this.f24349s = str;
            return this;
        }

        @C0359n0
        /* renamed from: F */
        public C9031b mo17863F(@C0363p0 String str) {
            this.f24345o = str;
            return this;
        }

        @C0359n0
        /* renamed from: G */
        public C9031b mo17864G(@C0363p0 String str) {
            this.f24333c = str;
            return this;
        }

        @C0359n0
        /* renamed from: H */
        public C9031b mo17865H(boolean z) {
            this.f24351u = z;
            return this;
        }

        @C0359n0
        /* renamed from: I */
        public C9031b mo17866I(@C0363p0 String str) {
            this.f24340j = str;
            return this;
        }

        @C0359n0
        /* renamed from: J */
        public C9031b mo17867J(@C0363p0 Boolean bool) {
            this.f24342l = bool;
            return this;
        }

        @C0359n0
        /* renamed from: K */
        public C9031b mo17868K(boolean z) {
            this.f24331a = z;
            return this;
        }

        @C0359n0
        /* renamed from: L */
        public C9031b mo17869L(@C0363p0 String str) {
            this.f24334d = str;
            return this;
        }

        @C0359n0
        /* renamed from: M */
        public C9031b mo17870M(@C0363p0 String str) {
            this.f24344n = str;
            return this;
        }

        @C0359n0
        /* renamed from: N */
        public final C9031b mo17871N(@C0363p0 C9323b bVar) {
            this.f24337g = bVar;
            return this;
        }

        @C0359n0
        /* renamed from: O */
        public C9031b mo17872O(boolean z, @C0363p0 Set<String> set) {
            this.f24335e = z;
            this.f24336f = set;
            return this;
        }

        @C0359n0
        /* renamed from: P */
        public C9031b mo17873P(@C0363p0 String str) {
            this.f24339i = str;
            return this;
        }

        @C0359n0
        /* renamed from: Q */
        public C9031b mo17874Q(@C0363p0 String str) {
            if (C9669o0.m36224e(str)) {
                str = null;
            }
            this.f24338h = str;
            return this;
        }

        @C0359n0
        /* renamed from: w */
        public C9029l mo17875w() {
            return new C9029l(this);
        }

        @C0359n0
        /* renamed from: x */
        public C9031b mo17876x(@C0363p0 String str) {
            this.f24348r = str;
            return this;
        }

        @C0359n0
        /* renamed from: y */
        public C9031b mo17877y(@C0363p0 Integer num) {
            this.f24346p = num;
            return this;
        }

        @C0359n0
        /* renamed from: z */
        public C9031b mo17878z(@C0363p0 String str) {
            this.f24343m = str;
            return this;
        }

        public C9031b(@C0359n0 C9029l lVar) {
            this.f24331a = lVar.f24319a;
            this.f24332b = lVar.f24320b;
            this.f24333c = lVar.f24321c;
            this.f24334d = lVar.f24322d;
            this.f24335e = lVar.f24323e;
            this.f24336f = lVar.f24324f;
            this.f24337g = lVar.f24325g;
            this.f24338h = lVar.f24326v;
            this.f24339i = lVar.f24327w;
            this.f24340j = lVar.f24328x;
            this.f24341k = lVar.f24329y;
            this.f24342l = lVar.f24330z;
            this.f24343m = lVar.f24316X;
            this.f24344n = lVar.f24317Y;
            this.f24345o = lVar.f24318Z;
            this.f24346p = lVar.f24310E0;
            this.f24347q = lVar.f24311F0;
            this.f24348r = lVar.f24312G0;
            this.f24349s = lVar.f24313H0;
            this.f24350t = lVar.f24314I0;
            this.f24351u = lVar.f24315J0;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.channel.l$c */
    public @interface C9032c {
    }

    /* renamed from: b */
    public static C9029l m33616b(JsonValue jsonValue) throws JsonException {
        Boolean bool;
        Integer num;
        C9323b A = jsonValue.mo18749A();
        C9323b A2 = A.mo18801A("channel").mo18749A();
        C9323b A3 = A.mo18801A(f24294W0).mo18749A();
        if (!A2.isEmpty() || !A3.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator<JsonValue> it = A2.mo18801A("tags").mo18784z().iterator();
            while (it.hasNext()) {
                JsonValue next = it.next();
                if (next.mo18783y()) {
                    hashSet.add(next.mo18769l());
                } else {
                    throw new JsonException("Invalid tag: " + next);
                }
            }
            C9323b A4 = A2.mo18801A(f24291T0).mo18749A();
            if (A2.mo18805e(f24299b1)) {
                bool = Boolean.valueOf(A2.mo18801A(f24299b1).mo18757c(false));
            } else {
                bool = null;
            }
            if (A2.mo18805e(f24303f1)) {
                num = Integer.valueOf(A2.mo18801A(f24303f1).mo18762f(-1));
            } else {
                num = null;
            }
            String l = A2.mo18801A("android").mo18749A().mo18801A(f24308k1).mo18769l();
            C9031b O = new C9031b().mo17868K(A2.mo18801A("opt_in").mo18757c(false)).mo17858A(A2.mo18801A("background").mo18757c(false)).mo17864G(A2.mo18801A("device_type").mo18769l()).mo17869L(A2.mo18801A(f24288Q0).mo18769l()).mo17866I(A2.mo18801A("locale_language").mo18769l()).mo17861D(A2.mo18801A("locale_country").mo18769l()).mo17873P(A2.mo18801A("timezone").mo18769l()).mo17872O(A2.mo18801A(f24289R0).mo18757c(false), hashSet);
            if (A4.isEmpty()) {
                A4 = null;
            }
            return O.mo17871N(A4).mo17874Q(A3.mo18801A("user_id").mo18769l()).mo17876x(A3.mo18801A(f24305h1).mo18769l()).mo17867J(bool).mo17878z(A2.mo18801A("app_version").mo18769l()).mo17870M(A2.mo18801A("sdk_version").mo18769l()).mo17863F(A2.mo18801A(f24302e1).mo18769l()).mo17877y(num).mo17859B(A2.mo18801A("carrier").mo18769l()).mo17862E(l).mo17860C(A2.mo18801A("contact_id").mo18769l()).mo17865H(A2.mo18801A(f24309l1).mo18757c(false)).mo17875w();
        }
        throw new JsonException("Invalid channel payload: " + jsonValue);
    }

    /* renamed from: a */
    public boolean mo17852a(@C0363p0 C9029l lVar, boolean z) {
        if (lVar == null) {
            return false;
        }
        if ((!z || lVar.f24315J0 == this.f24315J0) && this.f24319a == lVar.f24319a && this.f24320b == lVar.f24320b && this.f24323e == lVar.f24323e && C17992m.m81740a(this.f24321c, lVar.f24321c) && C17992m.m81740a(this.f24322d, lVar.f24322d) && C17992m.m81740a(this.f24324f, lVar.f24324f) && C17992m.m81740a(this.f24325g, lVar.f24325g) && C17992m.m81740a(this.f24326v, lVar.f24326v) && C17992m.m81740a(this.f24327w, lVar.f24327w) && C17992m.m81740a(this.f24328x, lVar.f24328x) && C17992m.m81740a(this.f24329y, lVar.f24329y) && C17992m.m81740a(this.f24330z, lVar.f24330z) && C17992m.m81740a(this.f24316X, lVar.f24316X) && C17992m.m81740a(this.f24317Y, lVar.f24317Y) && C17992m.m81740a(this.f24318Z, lVar.f24318Z) && C17992m.m81740a(this.f24310E0, lVar.f24310E0) && C17992m.m81740a(this.f24311F0, lVar.f24311F0) && C17992m.m81740a(this.f24312G0, lVar.f24312G0) && C17992m.m81740a(this.f24313H0, lVar.f24313H0) && C17992m.m81740a(this.f24314I0, lVar.f24314I0)) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: c */
    public final C9323b mo17853c(@C0359n0 Set<String> set) throws JsonException {
        HashSet hashSet = new HashSet();
        for (String next : this.f24324f) {
            if (!set.contains(next)) {
                hashSet.add(next);
            }
        }
        HashSet hashSet2 = new HashSet();
        for (String next2 : set) {
            if (!this.f24324f.contains(next2)) {
                hashSet2.add(next2);
            }
        }
        C9323b.C9325b y = C9323b.m35017y();
        if (!hashSet.isEmpty()) {
            y.mo18822f("add", JsonValue.m34966L(hashSet));
        }
        if (!hashSet2.isEmpty()) {
            y.mo18822f("remove", JsonValue.m34966L(hashSet2));
        }
        return y.mo18817a();
    }

    @C0359n0
    /* renamed from: d */
    public C9029l mo17854d(@C0363p0 C9029l lVar) {
        Set<String> set;
        if (lVar == null) {
            return this;
        }
        C9031b bVar = new C9031b(this);
        bVar.mo17874Q((String) null);
        bVar.mo17876x((String) null);
        if (lVar.f24323e && this.f24323e && (set = lVar.f24324f) != null) {
            if (set.equals(this.f24324f)) {
                bVar.mo17872O(false, (Set<String>) null);
            } else {
                try {
                    C9031b unused = bVar.mo17871N(mo17853c(lVar.f24324f));
                } catch (JsonException e) {
                    C36059m.m148407c(e, "ChannelRegistrationPayload - Failed to wrap tag changes to JsonMap", new Object[0]);
                }
            }
        }
        String str = this.f24314I0;
        if (str == null || C9669o0.m36223d(lVar.f24314I0, str)) {
            if (C9669o0.m36223d(lVar.f24329y, this.f24329y)) {
                bVar.mo17861D((String) null);
            }
            if (C9669o0.m36223d(lVar.f24328x, this.f24328x)) {
                bVar.mo17866I((String) null);
            }
            if (C9669o0.m36223d(lVar.f24327w, this.f24327w)) {
                bVar.mo17873P((String) null);
            }
            Boolean bool = lVar.f24330z;
            if (bool != null && bool.equals(this.f24330z)) {
                bVar.mo17867J((Boolean) null);
            }
            if (C9669o0.m36223d(lVar.f24316X, this.f24316X)) {
                bVar.mo17878z((String) null);
            }
            if (C9669o0.m36223d(lVar.f24317Y, this.f24317Y)) {
                bVar.mo17870M((String) null);
            }
            if (C9669o0.m36223d(lVar.f24318Z, this.f24318Z)) {
                bVar.mo17863F((String) null);
            }
            if (C9669o0.m36223d(lVar.f24311F0, this.f24311F0)) {
                bVar.mo17859B((String) null);
            }
            Integer num = lVar.f24310E0;
            if (num != null && num.equals(this.f24310E0)) {
                bVar.mo17877y((Integer) null);
            }
        }
        return bVar.mo17875w();
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return mo17852a((C9029l) obj, true);
    }

    public int hashCode() {
        return C17992m.m81741b(Boolean.valueOf(this.f24319a), Boolean.valueOf(this.f24320b), this.f24321c, this.f24322d, Boolean.valueOf(this.f24323e), this.f24324f, this.f24325g, this.f24326v, this.f24327w, this.f24328x, this.f24329y, this.f24330z, this.f24316X, this.f24317Y, this.f24318Z, this.f24310E0, this.f24311F0, this.f24312G0, this.f24313H0, this.f24314I0);
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        C9323b bVar;
        Set<String> set;
        C9323b.C9325b h = C9323b.m35017y().mo18823g("device_type", this.f24321c).mo18824h(f24289R0, this.f24323e).mo18824h("opt_in", this.f24319a).mo18823g(f24288Q0, this.f24322d).mo18824h("background", this.f24320b).mo18823g("timezone", this.f24327w).mo18823g("locale_language", this.f24328x).mo18823g("locale_country", this.f24329y).mo18823g("app_version", this.f24316X).mo18823g("sdk_version", this.f24317Y).mo18823g(f24302e1, this.f24318Z).mo18823g("carrier", this.f24311F0).mo18823g("contact_id", this.f24314I0).mo18824h(f24309l1, this.f24315J0);
        if ("android".equals(this.f24321c) && this.f24313H0 != null) {
            h.mo18822f("android", C9323b.m35017y().mo18823g(f24308k1, this.f24313H0).mo18817a());
        }
        Boolean bool = this.f24330z;
        if (bool != null) {
            h.mo18824h(f24299b1, bool.booleanValue());
        }
        Integer num = this.f24310E0;
        if (num != null) {
            h.mo18820d(f24303f1, num.intValue());
        }
        if (this.f24323e && (set = this.f24324f) != null) {
            h.mo18822f("tags", JsonValue.m34975U(set).mo18764h());
        }
        if (this.f24323e && (bVar = this.f24325g) != null) {
            h.mo18822f(f24291T0, JsonValue.m34975U(bVar).mo18767j());
        }
        C9323b.C9325b g = C9323b.m35017y().mo18823g("user_id", this.f24326v).mo18823g(f24305h1, this.f24312G0);
        C9323b.C9325b f = C9323b.m35017y().mo18822f("channel", h.mo18817a());
        C9323b a = g.mo18817a();
        if (!a.isEmpty()) {
            f.mo18822f(f24294W0, a);
        }
        return f.mo18817a().mo17264q();
    }

    @C0359n0
    public String toString() {
        return "ChannelRegistrationPayload{optIn=" + this.f24319a + ", backgroundEnabled=" + this.f24320b + ", deviceType='" + this.f24321c + '\'' + ", pushAddress='" + this.f24322d + '\'' + ", setTags=" + this.f24323e + ", tags=" + this.f24324f + ", tagChanges=" + this.f24325g + ", userId='" + this.f24326v + '\'' + ", timezone='" + this.f24327w + '\'' + ", language='" + this.f24328x + '\'' + ", country='" + this.f24329y + '\'' + ", locationSettings=" + this.f24330z + ", appVersion='" + this.f24316X + '\'' + ", sdkVersion='" + this.f24317Y + '\'' + ", deviceModel='" + this.f24318Z + '\'' + ", apiVersion=" + this.f24310E0 + ", carrier='" + this.f24311F0 + '\'' + ", accengageDeviceId='" + this.f24312G0 + '\'' + ", deliveryType='" + this.f24313H0 + '\'' + ", contactId='" + this.f24314I0 + '\'' + ", isActive=" + this.f24315J0 + C12361b.f30259j;
    }

    public C9029l(C9031b bVar) {
        this.f24319a = bVar.f24331a;
        this.f24320b = bVar.f24332b;
        this.f24321c = bVar.f24333c;
        this.f24322d = bVar.f24334d;
        this.f24323e = bVar.f24335e;
        this.f24324f = bVar.f24335e ? bVar.f24336f : null;
        this.f24325g = bVar.f24337g;
        this.f24326v = bVar.f24338h;
        this.f24327w = bVar.f24339i;
        this.f24328x = bVar.f24340j;
        this.f24329y = bVar.f24341k;
        this.f24330z = bVar.f24342l;
        this.f24316X = bVar.f24343m;
        this.f24317Y = bVar.f24344n;
        this.f24318Z = bVar.f24345o;
        this.f24310E0 = bVar.f24346p;
        this.f24311F0 = bVar.f24347q;
        this.f24312G0 = bVar.f24348r;
        this.f24313H0 = bVar.f24349s;
        this.f24314I0 = bVar.f24350t;
        this.f24315J0 = bVar.f24351u;
    }
}
