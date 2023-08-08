package com.contentsquare.android.sdk;

import android.net.Uri;
import com.carrefour.fid.android.airship.util.C13758b;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.contentsquare.android.sdk.gg */
public class C14383gg {

    /* renamed from: a */
    public long f35562a = 1;

    /* renamed from: b */
    public long f35563b = 0;

    /* renamed from: c */
    public long f35564c;

    /* renamed from: d */
    public final C14397h7 f35565d;

    /* renamed from: e */
    public String f35566e;

    /* renamed from: f */
    public int f35567f;

    /* renamed from: g */
    public int f35568g;

    /* renamed from: h */
    public String f35569h;

    /* renamed from: i */
    public final String f35570i;

    /* renamed from: j */
    public final C14213b7 f35571j;

    /* renamed from: k */
    public final C14771u6 f35572k;

    /* renamed from: l */
    public final HashMap<String, String> f35573l;

    public C14383gg(C14213b7 b7Var, C14771u6 u6Var) {
        this.f35571j = b7Var;
        this.f35572k = u6Var;
        this.f35570i = "5";
        C14397h7 h7Var = new C14397h7(b7Var);
        this.f35565d = h7Var;
        this.f35566e = h7Var.mo35500a();
        this.f35569h = "4.14.0";
        this.f35567f = 1;
        this.f35573l = new HashMap<>();
    }

    /* renamed from: a */
    public String mo35398a() {
        this.f35573l.clear();
        mo35405h();
        mo35404g();
        return mo35407j();
    }

    /* renamed from: b */
    public void mo35399b(C14753te teVar) {
        this.f35562a = teVar.mo36536d();
        this.f35563b = teVar.mo36535c();
        this.f35566e = this.f35565d.mo35500a();
        if (teVar.mo36537e() || teVar.mo36533a()) {
            this.f35564c = this.f35563b - 1;
            this.f35568g = this.f35567f + 1;
            this.f35567f = 1;
        }
    }

    /* renamed from: c */
    public synchronized String mo35400c() {
        this.f35573l.clear();
        mo35405h();
        return mo35407j();
    }

    /* renamed from: d */
    public final String mo35401d() {
        String e = this.f35571j.mo34673e(C14477k8.DEVELOPER_SESSION_REPLAY_URL, "from_configuration");
        return "from_configuration".equals(e) ? mo35402e() : e == null ? "INVALID_URL" : e;
    }

    /* renamed from: e */
    public final String mo35402e() {
        C14466k4 c = this.f35572k.mo36561c();
        if (c == null) {
            return "INVALID_URL";
        }
        String c2 = new C14922z7().mo36945a(c, this.f35571j.mo34676h(C14477k8.CLIENT_MODE_GOD_MODE, false)).mo35730h().mo35738c();
        return !c2.isEmpty() ? c2 : "INVALID_URL";
    }

    /* renamed from: f */
    public synchronized void mo35403f() {
        this.f35567f++;
    }

    /* renamed from: g */
    public final void mo35404g() {
        this.f35573l.put("pn", String.valueOf(this.f35564c));
        this.f35573l.put("ri", String.valueOf(this.f35568g));
        this.f35573l.put("hlm", C13758b.f33436b);
    }

    /* renamed from: h */
    public final void mo35405h() {
        this.f35573l.put("pid", String.valueOf(mo35406i()));
        this.f35573l.put("uu", this.f35566e);
        this.f35573l.put("sn", String.valueOf(this.f35562a));
        this.f35573l.put("pn", String.valueOf(this.f35563b));
        this.f35573l.put("ri", String.valueOf(this.f35567f));
        this.f35573l.put(C9851c.f26937h, this.f35569h);
        this.f35573l.put("rt", this.f35570i);
    }

    /* renamed from: i */
    public final int mo35406i() {
        C14466k4 c = this.f35572k.mo36561c();
        if (c != null) {
            return c.mo35709a();
        }
        return 0;
    }

    /* renamed from: j */
    public final String mo35407j() {
        String d = mo35401d();
        Uri.Builder buildUpon = Uri.parse(d + "/v2/recording-mobile").buildUpon();
        for (Map.Entry next : this.f35573l.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return buildUpon.toString();
    }
}
