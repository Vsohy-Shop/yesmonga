package com.urbanairship.iam;

import android.graphics.Color;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.iam.banner.C9156c;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.C9654i;
import com.urbanairship.util.C9668o;
import com.urbanairship.util.C9669o0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: com.urbanairship.iam.x */
public class C9259x {

    /* renamed from: A */
    public static final String f25228A = "^mc";

    /* renamed from: l */
    public static final String f25229l = "banner";

    /* renamed from: m */
    public static final String f25230m = "display";

    /* renamed from: n */
    public static final String f25231n = "actions";

    /* renamed from: o */
    public static final String f25232o = "type";

    /* renamed from: p */
    public static final String f25233p = "extra";

    /* renamed from: q */
    public static final String f25234q = "alert";

    /* renamed from: r */
    public static final String f25235r = "primary_color";

    /* renamed from: s */
    public static final String f25236s = "secondary_color";

    /* renamed from: t */
    public static final String f25237t = "duration";

    /* renamed from: u */
    public static final String f25238u = "expiry";

    /* renamed from: v */
    public static final String f25239v = "position";

    /* renamed from: w */
    public static final String f25240w = "on_click";

    /* renamed from: x */
    public static final String f25241x = "button_group";

    /* renamed from: y */
    public static final String f25242y = "button_actions";

    /* renamed from: z */
    public static final long f25243z = 2592000000L;

    /* renamed from: a */
    public final long f25244a;

    /* renamed from: b */
    public final String f25245b;

    /* renamed from: c */
    public final Long f25246c;

    /* renamed from: d */
    public final Integer f25247d;

    /* renamed from: e */
    public final Integer f25248e;

    /* renamed from: f */
    public final String f25249f;

    /* renamed from: g */
    public final String f25250g;

    /* renamed from: h */
    public final String f25251h;

    /* renamed from: i */
    public final Map<String, JsonValue> f25252i;

    /* renamed from: j */
    public final C9323b f25253j;

    /* renamed from: k */
    public final Map<String, Map<String, JsonValue>> f25254k;

    /* renamed from: com.urbanairship.iam.x$b */
    public static class C9261b {
        @C0359n0

        /* renamed from: a */
        public final Map<String, JsonValue> f25255a;

        /* renamed from: b */
        public String f25256b;
        @C0363p0

        /* renamed from: c */
        public C9323b f25257c;
        @C0359n0

        /* renamed from: d */
        public final Map<String, Map<String, JsonValue>> f25258d;

        /* renamed from: e */
        public String f25259e;

        /* renamed from: f */
        public String f25260f;

        /* renamed from: g */
        public Long f25261g;

        /* renamed from: h */
        public Long f25262h;

        /* renamed from: i */
        public Integer f25263i;

        /* renamed from: j */
        public Integer f25264j;
        @C0359n0

        /* renamed from: k */
        public String f25265k;

        @C0359n0
        /* renamed from: l */
        public C9259x mo18625l() {
            boolean z;
            Long l = this.f25262h;
            if (l == null || l.longValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            C9654i.m36165a(z, "Duration must be greater than 0");
            return new C9259x(this);
        }

        @C0359n0
        /* renamed from: m */
        public C9261b mo18626m(@C0363p0 String str) {
            this.f25260f = str;
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C9261b mo18627n(@C0359n0 String str, @C0363p0 Map<String, JsonValue> map) {
            if (map == null) {
                this.f25258d.remove(str);
            } else {
                this.f25258d.put(str, new HashMap(map));
            }
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C9261b mo18628o(@C0363p0 String str) {
            this.f25259e = str;
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C9261b mo18629p(@C0363p0 Map<String, JsonValue> map) {
            this.f25255a.clear();
            if (map != null) {
                this.f25255a.putAll(map);
            }
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C9261b mo18630q(@C0363p0 Long l) {
            this.f25262h = l;
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C9261b mo18631r(@C0363p0 Long l) {
            this.f25261g = l;
            return this;
        }

        @C0359n0
        /* renamed from: s */
        public C9261b mo18632s(@C0363p0 C9323b bVar) {
            this.f25257c = bVar;
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public C9261b mo18633t(@C0363p0 String str) {
            this.f25256b = str;
            return this;
        }

        @C0359n0
        /* renamed from: u */
        public C9261b mo18634u(@C0359n0 String str) {
            this.f25265k = str;
            return this;
        }

        @C0359n0
        /* renamed from: v */
        public C9261b mo18635v(@C0363p0 Integer num) {
            this.f25263i = num;
            return this;
        }

        @C0359n0
        /* renamed from: w */
        public C9261b mo18636w(@C0363p0 Integer num) {
            this.f25264j = num;
            return this;
        }

        public C9261b() {
            this.f25255a = new HashMap();
            this.f25258d = new HashMap();
            this.f25265k = C9156c.f24821Y;
        }
    }

    @C0363p0
    /* renamed from: a */
    public static C9259x m34755a(@C0359n0 PushMessage pushMessage) throws JsonException {
        if (!pushMessage.mo19167b(PushMessage.f25826T0)) {
            return null;
        }
        JsonValue C = JsonValue.m34960C(pushMessage.mo19176j(PushMessage.f25826T0, ""));
        C9323b A = C.mo18749A().mo18801A("display").mo18749A();
        C9323b A2 = C.mo18749A().mo18801A("actions").mo18749A();
        if ("banner".equals(A.mo18801A("type").mo18769l())) {
            C9261b m = m34756m();
            m.mo18632s(C.mo18749A().mo18801A("extra").mo18749A()).mo18626m(A.mo18801A("alert").mo18769l());
            if (A.mo18805e(f25235r)) {
                try {
                    m.mo18635v(Integer.valueOf(Color.parseColor(A.mo18801A(f25235r).mo18750B())));
                } catch (IllegalArgumentException e) {
                    throw new JsonException("Invalid primary color: " + A.mo18801A(f25235r), e);
                }
            }
            if (A.mo18805e(f25236s)) {
                try {
                    m.mo18636w(Integer.valueOf(Color.parseColor(A.mo18801A(f25236s).mo18750B())));
                } catch (IllegalArgumentException e2) {
                    throw new JsonException("Invalid secondary color: " + A.mo18801A(f25236s), e2);
                }
            }
            if (A.mo18805e("duration")) {
                m.mo18630q(Long.valueOf(TimeUnit.SECONDS.toMillis(A.mo18801A("duration").mo18766i(0))));
            }
            long currentTimeMillis = System.currentTimeMillis() + 2592000000L;
            if (C.mo18749A().mo18805e(f25238u)) {
                m.mo18631r(Long.valueOf(C9668o.m36219c(C.mo18749A().mo18801A(f25238u).mo18750B(), currentTimeMillis)));
            } else {
                m.mo18631r(Long.valueOf(currentTimeMillis));
            }
            if (C9156c.f24820X.equalsIgnoreCase(A.mo18801A(f25239v).mo18769l())) {
                m.mo18634u(C9156c.f24820X);
            } else {
                m.mo18634u(C9156c.f24821Y);
            }
            Map<String, JsonValue> r = A2.mo18801A(f25240w).mo18749A().mo18813r();
            if (!C9669o0.m36224e(pushMessage.mo19189w())) {
                r.put("^mc", JsonValue.m34968N(pushMessage.mo19189w()));
            }
            m.mo18629p(r);
            m.mo18628o(A2.mo18801A("button_group").mo18769l());
            C9323b A3 = A2.mo18801A(f25242y).mo18749A();
            for (Map.Entry<String, JsonValue> key : A3.mo18809i()) {
                String str = (String) key.getKey();
                m.mo18627n(str, A3.mo18801A(str).mo18749A().mo18813r());
            }
            m.mo18633t(pushMessage.mo19191x());
            try {
                return m.mo18625l();
            } catch (IllegalArgumentException e3) {
                throw new JsonException("Invalid legacy in-app message" + C, e3);
            }
        } else {
            throw new JsonException("Only banner types are supported.");
        }
    }

    @C0359n0
    /* renamed from: m */
    public static C9261b m34756m() {
        return new C9261b();
    }

    @C0363p0
    /* renamed from: b */
    public String mo18614b() {
        return this.f25245b;
    }

    @C0363p0
    /* renamed from: c */
    public Map<String, JsonValue> mo18615c(@C0359n0 String str) {
        Map map = this.f25254k.get(str);
        if (map != null) {
            return Collections.unmodifiableMap(map);
        }
        return null;
    }

    @C0363p0
    /* renamed from: d */
    public String mo18616d() {
        return this.f25249f;
    }

    @C0359n0
    /* renamed from: e */
    public Map<String, JsonValue> mo18617e() {
        return Collections.unmodifiableMap(this.f25252i);
    }

    @C0363p0
    /* renamed from: f */
    public Long mo18618f() {
        return this.f25246c;
    }

    /* renamed from: g */
    public long mo18619g() {
        return this.f25244a;
    }

    @C0359n0
    /* renamed from: h */
    public C9323b mo18620h() {
        return this.f25253j;
    }

    @C0359n0
    /* renamed from: i */
    public String mo18621i() {
        return this.f25250g;
    }

    @C0359n0
    /* renamed from: j */
    public String mo18622j() {
        return this.f25251h;
    }

    @C0363p0
    /* renamed from: k */
    public Integer mo18623k() {
        return this.f25247d;
    }

    @C0363p0
    /* renamed from: l */
    public Integer mo18624l() {
        return this.f25248e;
    }

    public C9259x(@C0359n0 C9261b bVar) {
        this.f25244a = bVar.f25261g == null ? System.currentTimeMillis() + 2592000000L : bVar.f25261g.longValue();
        this.f25253j = bVar.f25257c == null ? C9323b.f25440b : bVar.f25257c;
        this.f25245b = bVar.f25260f;
        this.f25246c = bVar.f25262h;
        this.f25249f = bVar.f25259e;
        this.f25254k = bVar.f25258d;
        this.f25252i = bVar.f25255a;
        this.f25251h = bVar.f25265k;
        this.f25247d = bVar.f25263i;
        this.f25248e = bVar.f25264j;
        this.f25250g = bVar.f25256b == null ? UUID.randomUUID().toString() : bVar.f25256b;
    }
}
