package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14174a7;
import com.contentsquare.android.sdk.C14213b7;
import com.contentsquare.android.sdk.C14466k4;
import java.util.Locale;

/* renamed from: com.contentsquare.android.sdk.l */
public class C14487l implements C14213b7.C14214a, C14174a7.C14176b {

    /* renamed from: a */
    public final C14453jf f35825a;

    /* renamed from: b */
    public final C14604p1 f35826b;

    /* renamed from: c */
    public final C14213b7 f35827c;

    /* renamed from: d */
    public final C14771u6 f35828d;

    /* renamed from: e */
    public final C14922z7 f35829e;

    /* renamed from: f */
    public final C14806ve f35830f;

    /* renamed from: g */
    public final C14476k7 f35831g;

    /* renamed from: h */
    public int f35832h;

    /* renamed from: i */
    public int f35833i;

    /* renamed from: j */
    public C14923z8 f35834j;

    /* renamed from: k */
    public String f35835k;

    /* renamed from: l */
    public int f35836l;

    public C14487l(C14604p1 p1Var, C14213b7 b7Var, C14771u6 u6Var, C14922z7 z7Var, C14476k7 k7Var, C14174a7 a7Var, C14806ve veVar) {
        C14453jf jfVar = new C14453jf("QualitySettings");
        this.f35825a = jfVar;
        String str = C14923z8.f36995g;
        this.f35834j = C14923z8.m64202b(str);
        this.f35835k = str;
        this.f35826b = p1Var;
        this.f35827c = b7Var;
        b7Var.mo34675g(this);
        this.f35828d = u6Var;
        this.f35829e = z7Var;
        this.f35831g = k7Var;
        this.f35836l = k7Var.mo35757g();
        this.f35830f = veVar;
        a7Var.mo34497b(this);
        mo35786f();
        veVar.mo36650f(C14923z8.values()[this.f35833i]);
        jfVar.mo35676e("Parameters at instantiation:\nIs forced quality: " + mo35794n() + "\nFPS: " + this.f35832h + "\nImage quality: " + this.f35833i + "\nMax millisecond ui thread usage: " + mo35792l() + "\nSample number: " + 10);
    }

    /* renamed from: a */
    public void mo34499a() {
        this.f35836l = this.f35831g.mo35757g();
        mo35785e(C14889y8.NETWORK_CHANGED);
    }

    /* renamed from: b */
    public final C14466k4.C14472f mo35783b(C14466k4 k4Var) {
        return this.f35829e.mo36945a(k4Var, this.f35827c.mo34676h(C14477k8.CLIENT_MODE_GOD_MODE, false)).mo35730h();
    }

    /* renamed from: c */
    public final void mo35784c(long j) {
        String str;
        C14453jf jfVar;
        this.f35825a.mo35676e("Session Replay quality performance was " + j + "ms. Forced Quality: " + mo35794n());
        if (mo35794n()) {
            this.f35832h = mo35789i();
            this.f35833i = mo35790j();
            return;
        }
        if (j >= ((long) mo35792l())) {
            int ordinal = this.f35834j.ordinal();
            if (ordinal <= 0) {
                C14731t1.m63480i();
                jfVar = this.f35825a;
                str = "Session Replay stopped due to too much performance impact on UI thread";
            } else {
                C14923z8 z8Var = C14923z8.values()[ordinal - 1];
                this.f35834j = z8Var;
                this.f35832h = z8Var.mo36947q();
                this.f35833i = this.f35834j.ordinal();
                mo35787g(C14889y8.CPU_USAGE);
                this.f35825a.mo35676e("Session Replay quality reduced from " + C14923z8.values()[ordinal] + " to " + this.f35834j);
                this.f35826b.mo36129a();
            }
        } else {
            C14923z8 b = C14923z8.m64202b(this.f35835k);
            if (this.f35834j.ordinal() < b.ordinal()) {
                this.f35834j = b;
                this.f35832h = b.mo36947q();
                this.f35833i = this.f35834j.ordinal();
                mo35787g(C14889y8.CPU_USAGE);
                jfVar = this.f35825a;
                str = "Session Replay quality increased to " + this.f35834j;
            } else {
                return;
            }
        }
        jfVar.mo35676e(str);
        this.f35826b.mo36129a();
    }

    /* renamed from: d */
    public void mo34382d(String str) {
        if (!mo35794n() && C14477k8.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL.mo35776b(str)) {
            mo35785e(C14889y8.CONFIG_APPLIED);
        }
        if (C14477k8.DEVELOPER_SESSION_REPLAY_IMAGE_QUALITY_VALUE.mo35776b(str) || C14477k8.DEVELOPER_SESSION_REPLAY_FPS_VALUE.mo35776b(str) || C14477k8.RAW_CONFIGURATION_AS_JSON.mo35776b(str)) {
            mo35785e(C14889y8.CONFIG_APPLIED);
        }
    }

    /* renamed from: e */
    public final void mo35785e(C14889y8 y8Var) {
        mo35786f();
        mo35787g(y8Var);
    }

    /* renamed from: f */
    public final void mo35786f() {
        int i;
        if (mo35794n()) {
            this.f35832h = mo35789i();
            i = mo35790j();
        } else {
            String m = mo35793m();
            this.f35835k = m;
            C14923z8 b = C14923z8.m64202b(m);
            this.f35834j = b;
            this.f35832h = b.mo36947q();
            i = this.f35834j.ordinal();
        }
        this.f35833i = i;
        mo35795o();
    }

    /* renamed from: g */
    public final void mo35787g(C14889y8 y8Var) {
        this.f35830f.mo36648d(y8Var, this.f35834j, this.f35836l);
    }

    /* renamed from: h */
    public float mo35788h() {
        return C14923z8.values()[this.f35833i].mo36946g();
    }

    /* renamed from: i */
    public final int mo35789i() {
        return this.f35827c.mo34670b(C14477k8.DEVELOPER_SESSION_REPLAY_FPS_VALUE, C14923z8.MEDIUM.mo36947q());
    }

    /* renamed from: j */
    public final int mo35790j() {
        return this.f35827c.mo34670b(C14477k8.DEVELOPER_SESSION_REPLAY_IMAGE_QUALITY_VALUE, C14923z8.MEDIUM.ordinal());
    }

    /* renamed from: k */
    public long mo35791k() {
        return (long) (1000 / this.f35832h);
    }

    /* renamed from: l */
    public final int mo35792l() {
        return this.f35827c.mo34670b(C14477k8.DEVELOPER_SESSION_REPLAY_MAXIMUM_USAGE_ON_UI_THREAD_IN_MILLI_SEC, 40);
    }

    /* renamed from: m */
    public final String mo35793m() {
        C14466k4 c = this.f35828d.mo36561c();
        if (c == null) {
            return C14923z8.f36995g;
        }
        C14466k4.C14472f b = mo35783b(c);
        this.f35836l = this.f35831g.mo35757g();
        boolean z = true;
        if (this.f35831g.mo35757g() != 1) {
            z = false;
        }
        return z ? b.mo35740e() : b.mo35739d();
    }

    /* renamed from: n */
    public final boolean mo35794n() {
        return this.f35827c.mo34676h(C14477k8.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL, false);
    }

    /* renamed from: o */
    public final void mo35795o() {
        String name = C14923z8.HIGH.name();
        String str = this.f35835k;
        Locale locale = Locale.ROOT;
        String str2 = name.equals(str.toUpperCase(locale)) ? "Best quality" : C14923z8.MEDIUM.name().equals(this.f35835k.toUpperCase(locale)) ? "Standard" : C14923z8.LOW.name().equals(this.f35835k.toUpperCase(locale)) ? "Optimized" : "UNKNOWN";
        C14453jf jfVar = this.f35825a;
        StringBuilder sb = new StringBuilder();
        sb.append("Session Replay quality settings applied: ");
        sb.append(this.f35831g.mo35757g() == 1 ? "Wifi" : "Cellular");
        sb.append(" - Data usage ");
        sb.append(str2);
        sb.append(" (Image: ");
        sb.append(this.f35833i);
        sb.append(" - FPS: ");
        sb.append(this.f35832h);
        sb.append(")");
        jfVar.mo35679i(sb.toString(), new Object[0]);
    }

    /* renamed from: p */
    public void mo35796p() {
        this.f35826b.mo36131c();
    }

    /* renamed from: q */
    public void mo35797q() {
        this.f35826b.mo36132d();
        long b = this.f35826b.mo36130b();
        if (b != -1) {
            mo35784c(b);
        }
    }

    public C14487l(C14213b7 b7Var, C14771u6 u6Var, C14476k7 k7Var, C14174a7 a7Var, C14806ve veVar) {
        this(new C14604p1(new C14370g7(), 10), b7Var, u6Var, new C14922z7(), k7Var, a7Var, veVar);
    }
}
