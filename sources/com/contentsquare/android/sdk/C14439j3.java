package com.contentsquare.android.sdk;

import android.os.SystemClock;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.j3 */
public abstract class C14439j3 {

    /* renamed from: l */
    public static C14453jf f35661l = new C14453jf();

    /* renamed from: a */
    public final String f35662a = UUID.randomUUID().toString();

    /* renamed from: b */
    public final int f35663b;

    /* renamed from: c */
    public final String f35664c;

    /* renamed from: d */
    public final int f35665d;

    /* renamed from: e */
    public final int f35666e;

    /* renamed from: f */
    public final String f35667f;

    /* renamed from: g */
    public final int f35668g;

    /* renamed from: h */
    public final JSONObject f35669h;

    /* renamed from: i */
    public final int f35670i;

    /* renamed from: j */
    public final long f35671j;

    /* renamed from: k */
    public final long f35672k;

    /* renamed from: com.contentsquare.android.sdk.j3$a */
    public static abstract class C14440a<T extends C14439j3> {

        /* renamed from: a */
        public int f35673a = 17;

        /* renamed from: b */
        public String f35674b = "";

        /* renamed from: c */
        public int f35675c = 0;

        /* renamed from: d */
        public int f35676d = 0;

        /* renamed from: e */
        public String f35677e = "";

        /* renamed from: f */
        public int f35678f;

        /* renamed from: g */
        public JSONObject f35679g = new JSONObject();

        /* renamed from: h */
        public int f35680h;

        /* renamed from: i */
        public long f35681i;

        /* renamed from: j */
        public long f35682j;

        public C14440a() {
            mo35597b(System.currentTimeMillis());
            mo35600f(SystemClock.uptimeMillis());
        }

        /* renamed from: a */
        public C14440a mo35596a(int i) {
            this.f35676d = i;
            return this;
        }

        /* renamed from: b */
        public C14440a mo35597b(long j) {
            this.f35681i = j;
            return this;
        }

        /* renamed from: c */
        public C14440a mo35598c(String str) {
            this.f35677e = str;
            return this;
        }

        /* renamed from: d */
        public C14440a mo35599d(JSONObject jSONObject) {
            this.f35679g = jSONObject;
            return this;
        }

        /* renamed from: e */
        public abstract T mo34709e();

        /* renamed from: f */
        public C14440a mo35600f(long j) {
            this.f35682j = j;
            return this;
        }

        /* renamed from: g */
        public C14440a mo35601g(String str) {
            this.f35674b = str;
            return this;
        }

        /* renamed from: h */
        public String mo35602h() {
            return this.f35677e;
        }

        /* renamed from: i */
        public void mo35603i(int i) {
            this.f35673a = i;
        }

        /* renamed from: j */
        public int mo35604j() {
            return this.f35676d;
        }

        /* renamed from: k */
        public C14440a mo35605k(int i) {
            this.f35678f = i;
            return this;
        }

        /* renamed from: l */
        public int mo35606l() {
            return this.f35673a;
        }

        /* renamed from: m */
        public C14440a mo35607m(int i) {
            this.f35675c = i;
            return this;
        }

        /* renamed from: n */
        public int mo35608n() {
            return this.f35678f;
        }

        /* renamed from: o */
        public C14440a mo35609o(int i) {
            this.f35680h = i;
            return this;
        }

        /* renamed from: p */
        public JSONObject mo35610p() {
            return this.f35679g;
        }

        /* renamed from: q */
        public int mo35611q() {
            return this.f35675c;
        }

        /* renamed from: r */
        public int mo35612r() {
            return this.f35680h;
        }

        /* renamed from: s */
        public long mo35613s() {
            return this.f35681i;
        }

        /* renamed from: t */
        public long mo35614t() {
            return this.f35682j;
        }

        /* renamed from: u */
        public String mo35615u() {
            return this.f35674b;
        }
    }

    public C14439j3(C14440a aVar) {
        this.f35663b = aVar.mo35606l();
        this.f35664c = aVar.mo35615u();
        this.f35665d = aVar.mo35611q();
        this.f35666e = aVar.mo35604j();
        this.f35667f = aVar.mo35602h();
        this.f35668g = aVar.mo35608n();
        this.f35669h = aVar.mo35610p();
        this.f35670i = aVar.mo35612r();
        this.f35671j = aVar.mo35613s();
        this.f35672k = aVar.mo35614t();
    }

    /* renamed from: a */
    public String mo35585a() {
        return this.f35667f;
    }

    /* renamed from: b */
    public int mo35586b() {
        return this.f35666e;
    }

    /* renamed from: c */
    public int mo35587c() {
        return this.f35663b;
    }

    /* renamed from: d */
    public int mo35588d() {
        return this.f35668g;
    }

    /* renamed from: e */
    public JSONObject mo35589e() {
        return this.f35669h;
    }

    /* renamed from: f */
    public int mo35590f() {
        return this.f35665d;
    }

    /* renamed from: g */
    public int mo35591g() {
        return this.f35670i;
    }

    /* renamed from: h */
    public long mo35592h() {
        return this.f35671j;
    }

    /* renamed from: i */
    public long mo35593i() {
        return this.f35672k;
    }

    /* renamed from: j */
    public String mo35594j() {
        return this.f35664c;
    }

    /* renamed from: k */
    public String mo35595k() {
        return this.f35662a;
    }

    /* renamed from: l */
    public abstract void mo34706l();
}
