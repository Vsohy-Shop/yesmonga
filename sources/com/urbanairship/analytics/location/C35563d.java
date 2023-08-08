package com.urbanairship.analytics.location;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0386z0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.analytics.C35554i;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9654i;
import com.urbanairship.util.C9669o0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* renamed from: com.urbanairship.analytics.location.d */
public class C35563d extends C35554i implements C9333e {
    @C0359n0

    /* renamed from: P0 */
    public static final String f87829P0 = "region_event";
    @C0359n0

    /* renamed from: Q0 */
    public static final String f87830Q0 = "region_id";

    /* renamed from: R0 */
    public static final String f87831R0 = "source";

    /* renamed from: S0 */
    public static final String f87832S0 = "action";

    /* renamed from: T0 */
    public static final String f87833T0 = "latitude";

    /* renamed from: U0 */
    public static final String f87834U0 = "longitude";

    /* renamed from: V0 */
    public static final String f87835V0 = "proximity";

    /* renamed from: W0 */
    public static final String f87836W0 = "circular_region";

    /* renamed from: X0 */
    public static final String f87837X0 = "radius";

    /* renamed from: Y0 */
    public static final String f87838Y0 = "proximity_id";

    /* renamed from: Z0 */
    public static final String f87839Z0 = "major";

    /* renamed from: a1 */
    public static final String f87840a1 = "minor";

    /* renamed from: b1 */
    public static final String f87841b1 = "rssi";

    /* renamed from: c1 */
    public static final int f87842c1 = 1;

    /* renamed from: d1 */
    public static final int f87843d1 = 2;

    /* renamed from: e1 */
    public static final int f87844e1 = 255;

    /* renamed from: f1 */
    public static final double f87845f1 = 90.0d;

    /* renamed from: g1 */
    public static final double f87846g1 = -90.0d;

    /* renamed from: h1 */
    public static final double f87847h1 = 180.0d;

    /* renamed from: i1 */
    public static final double f87848i1 = -180.0d;

    /* renamed from: K0 */
    public final String f87849K0;

    /* renamed from: L0 */
    public final String f87850L0;

    /* renamed from: M0 */
    public final int f87851M0;

    /* renamed from: N0 */
    public final C35559a f87852N0;

    /* renamed from: O0 */
    public final C35562c f87853O0;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.analytics.location.d$b */
    public @interface C35565b {
    }

    /* renamed from: com.urbanairship.analytics.location.d$c */
    public static class C35566c {

        /* renamed from: a */
        public String f87854a;

        /* renamed from: b */
        public String f87855b;

        /* renamed from: c */
        public int f87856c;

        /* renamed from: d */
        public C35559a f87857d;

        /* renamed from: e */
        public C35562c f87858e;

        @C0359n0
        /* renamed from: f */
        public C35563d mo106539f() {
            boolean z;
            C9654i.m36166b(this.f87854a, "Region identifier must not be null");
            C9654i.m36166b(this.f87855b, "Region event source must not be null");
            C9654i.m36165a(!C9669o0.m36224e(this.f87854a), "Region identifier must be greater than 0 characters.");
            boolean z2 = false;
            if (this.f87854a.length() <= 255) {
                z = true;
            } else {
                z = false;
            }
            C9654i.m36165a(z, "Region identifier exceeds max identifier length: 255");
            C9654i.m36165a(!C9669o0.m36224e(this.f87855b), "Source must be greater than 0 characters.");
            if (this.f87855b.length() <= 255) {
                z2 = true;
            }
            C9654i.m36165a(z2, "Source exceeds max source length: 255");
            int i = this.f87856c;
            if (i >= 1 && i <= 2) {
                return new C35563d(this);
            }
            throw new IllegalArgumentException("The boundary event must either be an entrance (1) or an exit (2).");
        }

        @C0359n0
        /* renamed from: g */
        public C35566c mo106540g(int i) {
            this.f87856c = i;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C35566c mo106541h(@C0363p0 C35559a aVar) {
            this.f87857d = aVar;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C35566c mo106542i(@C0363p0 C35562c cVar) {
            this.f87858e = cVar;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C35566c mo106543j(@C0359n0 @C0386z0(max = 255, min = 1) String str) {
            this.f87854a = str;
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C35566c mo106544k(@C0359n0 @C0386z0(max = 255, min = 1) String str) {
            this.f87855b = str;
            return this;
        }

        public C35566c() {
        }
    }

    @C0359n0
    /* renamed from: o */
    public static C35566c m146755o() {
        return new C35566c();
    }

    /* renamed from: p */
    public static boolean m146756p(@C0359n0 String str) {
        return str.length() <= 255 && str.length() > 0;
    }

    /* renamed from: r */
    public static boolean m146757r(@C0359n0 Double d) {
        return d.doubleValue() <= 90.0d && d.doubleValue() >= -90.0d;
    }

    /* renamed from: s */
    public static boolean m146758s(@C0359n0 Double d) {
        return d.doubleValue() <= 180.0d && d.doubleValue() >= -180.0d;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public final C9323b mo18411e() {
        String str;
        C9323b.C9325b g = C9323b.m35017y().mo18823g("region_id", this.f87850L0).mo18823g("source", this.f87849K0);
        if (this.f87851M0 == 1) {
            str = "enter";
        } else {
            str = "exit";
        }
        C9323b.C9325b g2 = g.mo18823g("action", str);
        C35562c cVar = this.f87853O0;
        if (cVar != null && cVar.mo106535g()) {
            C9323b.C9325b j = C9323b.m35017y().mo18823g(f87838Y0, this.f87853O0.mo106533e()).mo18820d(f87839Z0, this.f87853O0.mo106531c()).mo18820d(f87840a1, this.f87853O0.mo106532d()).mo18826j(f87841b1, this.f87853O0.mo106534f());
            if (this.f87853O0.mo106529a() != null) {
                j.mo18823g(f87833T0, Double.toString(this.f87853O0.mo106529a().doubleValue()));
            }
            if (this.f87853O0.mo106530b() != null) {
                j.mo18823g(f87834U0, Double.toString(this.f87853O0.mo106530b().doubleValue()));
            }
            g2.mo18822f(f87835V0, j.mo18817a());
        }
        C35559a aVar = this.f87852N0;
        if (aVar != null && aVar.mo106528d()) {
            C9323b.C9325b y = C9323b.m35017y();
            Locale locale = Locale.US;
            g2.mo18822f(f87836W0, y.mo18823g(f87837X0, String.format(locale, "%.1f", new Object[]{Double.valueOf(this.f87852N0.mo106527c())})).mo18823g(f87833T0, String.format(locale, "%.7f", new Object[]{Double.valueOf(this.f87852N0.mo106525a())})).mo18823g(f87834U0, String.format(locale, "%.7f", new Object[]{Double.valueOf(this.f87852N0.mo106526b())})).mo18817a());
        }
        return g2.mo18817a();
    }

    /* renamed from: g */
    public int mo106520g() {
        return 2;
    }

    @C0359n0
    /* renamed from: j */
    public final String mo18412j() {
        return f87829P0;
    }

    /* renamed from: l */
    public boolean mo106481l() {
        String str = this.f87850L0;
        if (str == null || this.f87849K0 == null) {
            C36059m.m148409e("The region ID and source must not be null.", new Object[0]);
            return false;
        } else if (!m146756p(str)) {
            C36059m.m148409e("The region ID must not be greater than %s or less than %s characters in length.", 255, 1);
            return false;
        } else if (!m146756p(this.f87849K0)) {
            C36059m.m148409e("The source must not be greater than %s or less than %s characters in length.", 255, 1);
            return false;
        } else {
            int i = this.f87851M0;
            if (i >= 1 && i <= 2) {
                return true;
            }
            C36059m.m148409e("The boundary event must either be an entrance (%s) or an exit (%s).", 1, 2);
            return false;
        }
    }

    /* renamed from: n */
    public int mo106538n() {
        return this.f87851M0;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return mo18411e().mo17264q();
    }

    public C35563d(@C0359n0 C35566c cVar) {
        this.f87850L0 = cVar.f87854a;
        this.f87849K0 = cVar.f87855b;
        this.f87851M0 = cVar.f87856c;
        this.f87852N0 = cVar.f87857d;
        this.f87853O0 = cVar.f87858e;
    }
}
