package com.urbanairship.automation;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.analytics.C35551h;
import com.urbanairship.json.C9326c;
import com.urbanairship.json.C9329d;
import com.urbanairship.json.C9335g;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;
import com.urbanairship.util.C9674q0;

/* renamed from: com.urbanairship.automation.h0 */
public class C8893h0 {

    /* renamed from: com.urbanairship.automation.h0$b */
    public static class C8895b {

        /* renamed from: a */
        public double f23849a;

        @C0359n0
        /* renamed from: a */
        public Trigger mo17517a() {
            return new Trigger(9, this.f23849a, (C9329d) null);
        }

        @C0359n0
        /* renamed from: b */
        public C8895b mo17518b(double d) {
            this.f23849a = d;
            return this;
        }

        public C8895b() {
            this.f23849a = 1.0d;
        }
    }

    /* renamed from: com.urbanairship.automation.h0$c */
    public static class C8896c {

        /* renamed from: a */
        public double f23850a;

        /* renamed from: b */
        public int f23851b;

        /* renamed from: c */
        public String f23852c;

        @C0359n0
        /* renamed from: a */
        public Trigger mo17519a() {
            if (C9669o0.m36224e(this.f23852c)) {
                return new Trigger(this.f23851b, this.f23850a, (C9329d) null);
            }
            return new Trigger(this.f23851b, this.f23850a, C9329d.m35054c().mo18842f("and").mo18839c(C9326c.m35039b().mo18832g(C35551h.f87728V0).mo18835j(C9335g.m35076i(JsonValue.m34968N(this.f23852c))).mo18830e()).mo18841e());
        }

        @C0359n0
        /* renamed from: b */
        public C8896c mo17520b(double d) {
            this.f23851b = 5;
            this.f23850a = d;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C8896c mo17521c(@C0363p0 String str) {
            this.f23852c = str;
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C8896c mo17522d(double d) {
            this.f23851b = 6;
            this.f23850a = d;
            return this;
        }

        public C8896c() {
            this.f23850a = 1.0d;
            this.f23851b = 5;
        }
    }

    /* renamed from: com.urbanairship.automation.h0$d */
    public static class C8897d {

        /* renamed from: a */
        public double f23853a;

        /* renamed from: b */
        public final int f23854b;

        @C0359n0
        /* renamed from: a */
        public Trigger mo17523a() {
            return new Trigger(this.f23854b, this.f23853a, (C9329d) null);
        }

        @C0359n0
        /* renamed from: b */
        public C8897d mo17524b(double d) {
            this.f23853a = d;
            return this;
        }

        public C8897d(int i) {
            this.f23853a = 1.0d;
            this.f23854b = i;
        }
    }

    /* renamed from: com.urbanairship.automation.h0$e */
    public static class C8898e {

        /* renamed from: a */
        public final int f23855a;

        /* renamed from: b */
        public double f23856b;

        /* renamed from: c */
        public String f23857c;

        @C0359n0
        /* renamed from: a */
        public Trigger mo17525a() {
            C9329d dVar;
            if (C9669o0.m36224e(this.f23857c)) {
                dVar = null;
            } else {
                dVar = C9329d.m35054c().mo18839c(C9326c.m35039b().mo18832g("region_id").mo18835j(C9335g.m35076i(JsonValue.m34968N(this.f23857c))).mo18830e()).mo18841e();
            }
            return new Trigger(this.f23855a, this.f23856b, dVar);
        }

        @C0359n0
        /* renamed from: b */
        public C8898e mo17526b(double d) {
            this.f23856b = d;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C8898e mo17527c(@C0363p0 String str) {
            this.f23857c = str;
            return this;
        }

        public C8898e(int i) {
            this.f23856b = 1.0d;
            this.f23855a = i;
        }
    }

    /* renamed from: com.urbanairship.automation.h0$f */
    public static class C8899f {

        /* renamed from: a */
        public double f23858a;

        /* renamed from: b */
        public String f23859b;

        @C0359n0
        /* renamed from: a */
        public Trigger mo17528a() {
            C9329d dVar;
            if (C9669o0.m36224e(this.f23859b)) {
                dVar = null;
            } else {
                dVar = C9329d.m35054c().mo18839c(C9326c.m35039b().mo18835j(C9335g.m35076i(JsonValue.m34968N(this.f23859b))).mo18830e()).mo18841e();
            }
            return new Trigger(7, this.f23858a, dVar);
        }

        @C0359n0
        /* renamed from: b */
        public C8899f mo17529b(double d) {
            this.f23858a = d;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C8899f mo17530c(@C0363p0 String str) {
            this.f23859b = str;
            return this;
        }

        public C8899f() {
            this.f23858a = 1.0d;
        }
    }

    /* renamed from: com.urbanairship.automation.h0$g */
    public static class C8900g {

        /* renamed from: a */
        public double f23860a;

        /* renamed from: b */
        public final C9335g f23861b;

        @C0359n0
        /* renamed from: a */
        public Trigger mo17531a() {
            C9329d dVar;
            C9335g gVar = this.f23861b;
            if (gVar != null) {
                dVar = C9674q0.m36238c(gVar);
            } else {
                dVar = null;
            }
            return new Trigger(10, this.f23860a, dVar);
        }

        @C0359n0
        /* renamed from: b */
        public C8900g mo17532b(double d) {
            this.f23860a = d;
            return this;
        }

        public C8900g(@C0363p0 C9335g gVar) {
            this.f23860a = 1.0d;
            this.f23861b = gVar;
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C8895b m33012a() {
        return new C8895b();
    }

    @C0359n0
    /* renamed from: b */
    public static C8897d m33013b() {
        return new C8897d(8);
    }

    @C0359n0
    /* renamed from: c */
    public static C8897d m33014c() {
        return new C8897d(2);
    }

    @C0359n0
    /* renamed from: d */
    public static C8896c m33015d() {
        return new C8896c();
    }

    @C0359n0
    /* renamed from: e */
    public static C8898e m33016e() {
        return new C8898e(3);
    }

    @C0359n0
    /* renamed from: f */
    public static C8898e m33017f() {
        return new C8898e(4);
    }

    @C0359n0
    /* renamed from: g */
    public static C8897d m33018g() {
        return new C8897d(1);
    }

    @C0359n0
    /* renamed from: h */
    public static C8899f m33019h() {
        return new C8899f();
    }

    @C0359n0
    /* renamed from: i */
    public static C8900g m33020i(@C0363p0 C9335g gVar) {
        return new C8900g(gVar);
    }
}
