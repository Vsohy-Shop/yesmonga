package com.contentsquare.android.sdk;

import android.app.Application;
import android.util.DisplayMetrics;
import com.contentsquare.android.sdk.C14466k4;

/* renamed from: com.contentsquare.android.sdk.t7 */
public class C14740t7 {

    /* renamed from: a */
    public final C14213b7 f36490a;

    /* renamed from: b */
    public final C14476k7 f36491b;

    /* renamed from: c */
    public final C14922z7 f36492c = new C14922z7();

    /* renamed from: d */
    public final C14890y9 f36493d;

    /* renamed from: e */
    public final C14527ma f36494e;

    /* renamed from: f */
    public final C14771u6 f36495f;

    public C14740t7(Application application) {
        this.f36490a = C14549na.m62703a(application.getApplicationContext()).mo35986g();
        this.f36495f = C14549na.m62703a(application.getApplicationContext()).mo35983c();
        this.f36491b = new C14476k7(application, new DisplayMetrics());
        this.f36494e = new C14527ma(application);
        this.f36493d = new C14890y9();
    }

    /* renamed from: a */
    public final C14466k4.C14471e mo36494a(C14466k4 k4Var) {
        return this.f36492c.mo36945a(k4Var, this.f36490a.mo34676h(C14477k8.CLIENT_MODE_GOD_MODE, false));
    }

    /* renamed from: b */
    public Boolean mo36495b() {
        return Boolean.valueOf(this.f36490a.mo34676h(C14477k8.CLIENT_MODE_ACTIVATION_STATE, false));
    }

    /* renamed from: c */
    public void mo36496c(boolean z) {
        this.f36490a.mo34683o(C14477k8.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL, z);
        if (!z) {
            this.f36490a.mo34679k(C14477k8.DEVELOPER_SESSION_REPLAY_FPS_VALUE, mo36503j());
        }
    }

    /* renamed from: d */
    public Boolean mo36497d() {
        return Boolean.valueOf(this.f36490a.mo34676h(C14477k8.DEVELOPER_MODE_ACTIVATION_STATE, false));
    }

    /* renamed from: e */
    public void mo36498e(boolean z) {
        this.f36490a.mo34683o(C14477k8.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL, z);
        if (!z) {
            this.f36490a.mo34679k(C14477k8.DEVELOPER_SESSION_REPLAY_IMAGE_QUALITY_VALUE, mo36504k());
        }
    }

    /* renamed from: f */
    public Boolean mo36499f() {
        C14466k4 c = this.f36495f.mo36561c();
        if (c != null) {
            for (C14466k4.C14468b next : mo36494a(c).mo35727e()) {
                if ("session_recording".equals(next.mo35717c())) {
                    return Boolean.valueOf(next.mo35718d() && this.f36493d.mo36932a(next, this.f36494e));
                }
            }
        }
        return Boolean.FALSE;
    }

    /* renamed from: g */
    public Boolean mo36500g() {
        return Boolean.valueOf(this.f36490a.mo34676h(C14477k8.LOCAL_LOG_VISUALIZER_MODE, false));
    }

    /* renamed from: h */
    public final String mo36501h() {
        C14466k4 c = this.f36495f.mo36561c();
        if (c == null) {
            return C14923z8.f36995g;
        }
        C14466k4.C14472f h = mo36494a(c).mo35730h();
        return this.f36491b.mo35757g() == 1 ? h.mo35740e() : h.mo35739d();
    }

    /* renamed from: i */
    public Boolean mo36502i() {
        return Boolean.valueOf(this.f36490a.mo34676h(C14477k8.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL, false));
    }

    /* renamed from: j */
    public int mo36503j() {
        return C14923z8.m64202b(mo36501h()).mo36947q();
    }

    /* renamed from: k */
    public int mo36504k() {
        return C14923z8.m64202b(mo36501h()).ordinal();
    }

    /* renamed from: l */
    public int mo36505l() {
        return this.f36490a.mo34670b(C14477k8.DEVELOPER_SESSION_REPLAY_MAXIMUM_USAGE_ON_UI_THREAD_IN_MILLI_SEC, 40);
    }

    /* renamed from: m */
    public String mo36506m() {
        String a = new C14397h7(this.f36490a).mo35500a();
        return a.length() > 6 ? a.substring(a.length() - 6) : a;
    }
}
