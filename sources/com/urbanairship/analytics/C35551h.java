package com.urbanairship.analytics;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0386z0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.C9669o0;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.urbanairship.analytics.h */
public class C35551h extends C35554i implements C9333e {

    /* renamed from: S0 */
    public static final String f87725S0 = "enhanced_custom_event";
    @C0359n0

    /* renamed from: T0 */
    public static final String f87726T0 = "interaction_id";
    @C0359n0

    /* renamed from: U0 */
    public static final String f87727U0 = "interaction_type";
    @C0359n0

    /* renamed from: V0 */
    public static final String f87728V0 = "event_name";
    @C0359n0

    /* renamed from: W0 */
    public static final String f87729W0 = "event_value";
    @C0359n0

    /* renamed from: X0 */
    public static final String f87730X0 = "transaction_id";
    @C0359n0

    /* renamed from: Y0 */
    public static final String f87731Y0 = "ua_mcrap";
    @C0359n0

    /* renamed from: Z0 */
    public static final String f87732Z0 = "conversion_send_id";
    @C0359n0

    /* renamed from: a1 */
    public static final String f87733a1 = "conversion_metadata";
    @C0359n0

    /* renamed from: b1 */
    public static final String f87734b1 = "last_received_metadata";
    @C0359n0

    /* renamed from: c1 */
    public static final String f87735c1 = "template_type";
    @C0359n0

    /* renamed from: d1 */
    public static final String f87736d1 = "properties";

    /* renamed from: e1 */
    public static final BigDecimal f87737e1 = new BigDecimal(Integer.MAX_VALUE);

    /* renamed from: f1 */
    public static final BigDecimal f87738f1 = new BigDecimal(Integer.MIN_VALUE);

    /* renamed from: g1 */
    public static final int f87739g1 = 255;

    /* renamed from: h1 */
    public static final int f87740h1 = 65536;
    @C0359n0

    /* renamed from: K0 */
    public final String f87741K0;
    @C0363p0

    /* renamed from: L0 */
    public final BigDecimal f87742L0;
    @C0363p0

    /* renamed from: M0 */
    public final String f87743M0;
    @C0363p0

    /* renamed from: N0 */
    public final String f87744N0;
    @C0363p0

    /* renamed from: O0 */
    public final String f87745O0;
    @C0363p0

    /* renamed from: P0 */
    public final String f87746P0;
    @C0363p0

    /* renamed from: Q0 */
    public final String f87747Q0;
    @C0359n0

    /* renamed from: R0 */
    public final C9323b f87748R0;

    /* renamed from: com.urbanairship.analytics.h$b */
    public static class C35553b {
        @C0359n0

        /* renamed from: a */
        public final String f87749a;
        @C0363p0

        /* renamed from: b */
        public BigDecimal f87750b;
        @C0363p0

        /* renamed from: c */
        public String f87751c;
        @C0363p0

        /* renamed from: d */
        public String f87752d;
        @C0363p0

        /* renamed from: e */
        public String f87753e;
        @C0363p0

        /* renamed from: f */
        public String f87754f;
        @C0363p0

        /* renamed from: g */
        public String f87755g;
        @C0359n0

        /* renamed from: h */
        public Map<String, JsonValue> f87756h = new HashMap();

        public C35553b(@C0359n0 @C0386z0(max = 255, min = 1) String str) {
            this.f87749a = str;
        }

        @C0359n0
        /* renamed from: i */
        public C35553b mo106498i(@C0359n0 @C0386z0(min = 1) String str, double d) {
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new NumberFormatException("Infinity or NaN: " + d);
            }
            this.f87756h.put(str, JsonValue.m34962H(d));
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C35553b mo106499j(@C0359n0 @C0386z0(min = 1) String str, int i) {
            this.f87756h.put(str, JsonValue.m34963I(i));
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C35553b mo106500k(@C0359n0 @C0386z0(min = 1) String str, long j) {
            this.f87756h.put(str, JsonValue.m34964J(j));
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C35553b mo106501l(@C0359n0 @C0386z0(min = 1) String str, @C0359n0 C9333e eVar) {
            this.f87756h.put(str, eVar.mo17264q());
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C35553b mo106502m(@C0359n0 @C0386z0(min = 1) String str, @C0359n0 @C0386z0(min = 1) String str2) {
            this.f87756h.put(str, JsonValue.m34968N(str2));
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C35553b mo106503n(@C0359n0 @C0386z0(min = 1) String str, boolean z) {
            this.f87756h.put(str, JsonValue.m34969O(z));
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C35551h mo106504o() {
            return new C35551h(this);
        }

        @C0359n0
        /* renamed from: p */
        public C35553b mo106505p(@C0363p0 PushMessage pushMessage) {
            if (pushMessage != null) {
                this.f87754f = pushMessage.mo19191x();
            }
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C35553b mo106506q(double d) {
            return mo106509t(BigDecimal.valueOf(d));
        }

        @C0359n0
        /* renamed from: r */
        public C35553b mo106507r(int i) {
            return mo106509t(new BigDecimal(i));
        }

        @C0359n0
        /* renamed from: s */
        public C35553b mo106508s(@C0363p0 String str) {
            if (!C9669o0.m36224e(str)) {
                return mo106509t(new BigDecimal(str));
            }
            this.f87750b = null;
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public C35553b mo106509t(@C0363p0 BigDecimal bigDecimal) {
            if (bigDecimal == null) {
                this.f87750b = null;
                return this;
            }
            this.f87750b = bigDecimal;
            return this;
        }

        @C0359n0
        /* renamed from: u */
        public C35553b mo106510u(@C0363p0 @C0386z0(max = 255, min = 1) String str, @C0363p0 @C0386z0(max = 255, min = 1) String str2) {
            this.f87753e = str2;
            this.f87752d = str;
            return this;
        }

        @C0359n0
        /* renamed from: v */
        public C35553b mo106511v(@C0359n0 String str) {
            this.f87752d = C35551h.f87731Y0;
            this.f87753e = str;
            return this;
        }

        @C0359n0
        /* renamed from: w */
        public C35553b mo106512w(@C0363p0 C9323b bVar) {
            if (bVar == null) {
                this.f87756h.clear();
                return this;
            }
            this.f87756h = bVar.mo18813r();
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: x */
        public C35553b mo106513x(@C0386z0(max = 255, min = 1) String str) {
            this.f87755g = str;
            return this;
        }

        @C0359n0
        /* renamed from: y */
        public C35553b mo106514y(@C0363p0 @C0386z0(max = 255, min = 1) String str) {
            this.f87751c = str;
            return this;
        }
    }

    @C0359n0
    /* renamed from: u */
    public static C35553b m146685u(@C0359n0 String str) {
        return new C35553b(str);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public final C9323b mo18411e() {
        C9323b.C9325b y = C9323b.m35017y();
        String S = UAirship.m146188Y().mo106221g().mo106432S();
        String R = UAirship.m146188Y().mo106221g().mo106431R();
        y.mo18823g(f87728V0, this.f87741K0);
        y.mo18823g(f87726T0, this.f87745O0);
        y.mo18823g(f87727U0, this.f87744N0);
        y.mo18823g("transaction_id", this.f87743M0);
        y.mo18823g(f87735c1, this.f87747Q0);
        BigDecimal bigDecimal = this.f87742L0;
        if (bigDecimal != null) {
            y.mo18821e("event_value", bigDecimal.movePointRight(6).longValue());
        }
        if (!C9669o0.m36224e(this.f87746P0)) {
            y.mo18823g("conversion_send_id", this.f87746P0);
        } else {
            y.mo18823g("conversion_send_id", S);
        }
        if (R != null) {
            y.mo18823g("conversion_metadata", R);
        } else {
            y.mo18823g(f87734b1, UAirship.m146188Y().mo106203E().mo19415Z());
        }
        if (this.f87748R0.mo18813r().size() > 0) {
            y.mo18822f("properties", this.f87748R0);
        }
        return y.mo18817a();
    }

    @C0359n0
    /* renamed from: j */
    public final String mo18412j() {
        return f87725S0;
    }

    /* renamed from: l */
    public boolean mo106481l() {
        boolean z;
        if (C9669o0.m36224e(this.f87741K0) || this.f87741K0.length() > 255) {
            C36059m.m148409e("Event name must not be null, empty, or larger than %s characters.", 255);
            z = false;
        } else {
            z = true;
        }
        BigDecimal bigDecimal = this.f87742L0;
        if (bigDecimal != null) {
            BigDecimal bigDecimal2 = f87737e1;
            if (bigDecimal.compareTo(bigDecimal2) > 0) {
                C36059m.m148409e("Event value is bigger than %s", bigDecimal2);
            } else {
                BigDecimal bigDecimal3 = this.f87742L0;
                BigDecimal bigDecimal4 = f87738f1;
                if (bigDecimal3.compareTo(bigDecimal4) < 0) {
                    C36059m.m148409e("Event value is smaller than %s", bigDecimal4);
                }
            }
            z = false;
        }
        String str = this.f87743M0;
        if (str != null && str.length() > 255) {
            C36059m.m148409e("Transaction ID is larger than %s characters.", 255);
            z = false;
        }
        String str2 = this.f87745O0;
        if (str2 != null && str2.length() > 255) {
            C36059m.m148409e("Interaction ID is larger than %s characters.", 255);
            z = false;
        }
        String str3 = this.f87744N0;
        if (str3 != null && str3.length() > 255) {
            C36059m.m148409e("Interaction type is larger than %s characters.", 255);
            z = false;
        }
        String str4 = this.f87747Q0;
        if (str4 != null && str4.length() > 255) {
            C36059m.m148409e("Template type is larger than %s characters.", 255);
            z = false;
        }
        int length = this.f87748R0.mo17264q().toString().getBytes().length;
        if (length <= 65536) {
            return z;
        }
        C36059m.m148409e("Total custom properties size (%s bytes) exceeds maximum size of %s bytes.", Integer.valueOf(length), 65536);
        return false;
    }

    @C0359n0
    /* renamed from: n */
    public String mo106491n() {
        return this.f87741K0;
    }

    @C0363p0
    /* renamed from: o */
    public BigDecimal mo106492o() {
        return this.f87742L0;
    }

    @C0363p0
    /* renamed from: p */
    public String mo106493p() {
        return this.f87745O0;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        C9323b.C9325b f = C9323b.m35017y().mo18823g(f87728V0, this.f87741K0).mo18823g(f87726T0, this.f87745O0).mo18823g(f87727U0, this.f87744N0).mo18823g("transaction_id", this.f87743M0).mo18822f("properties", JsonValue.m34975U(this.f87748R0));
        BigDecimal bigDecimal = this.f87742L0;
        if (bigDecimal != null) {
            f.mo18826j("event_value", Double.valueOf(bigDecimal.doubleValue()));
        }
        return f.mo18817a().mo17264q();
    }

    @C0363p0
    /* renamed from: r */
    public String mo106494r() {
        return this.f87744N0;
    }

    @C0359n0
    /* renamed from: s */
    public C9323b mo106495s() {
        return this.f87748R0;
    }

    @C0363p0
    /* renamed from: t */
    public String mo106496t() {
        return this.f87743M0;
    }

    @C0359n0
    /* renamed from: v */
    public C35551h mo106497v() {
        UAirship.m146188Y().mo106221g().mo106423J(this);
        return this;
    }

    public C35551h(@C0359n0 C35553b bVar) {
        this.f87741K0 = bVar.f87749a;
        this.f87742L0 = bVar.f87750b;
        String str = null;
        this.f87743M0 = C9669o0.m36224e(bVar.f87751c) ? null : bVar.f87751c;
        this.f87744N0 = C9669o0.m36224e(bVar.f87752d) ? null : bVar.f87752d;
        this.f87745O0 = !C9669o0.m36224e(bVar.f87753e) ? bVar.f87753e : str;
        this.f87746P0 = bVar.f87754f;
        this.f87747Q0 = bVar.f87755g;
        this.f87748R0 = new C9323b(bVar.f87756h);
    }
}
