package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14213b7;

/* renamed from: com.contentsquare.android.sdk.d5 */
public class C14267d5 implements C14213b7.C14214a {

    /* renamed from: a */
    public final C14213b7 f35226a;

    /* renamed from: b */
    public final C14320f3 f35227b;

    public C14267d5(C14213b7 b7Var, C14320f3 f3Var) {
        this.f35226a = b7Var;
        this.f35227b = f3Var;
        b7Var.mo34675g(this);
    }

    /* renamed from: a */
    public void mo34904a() {
        this.f35227b.mo35112a(true, false);
    }

    /* renamed from: d */
    public void mo34382d(String str) {
        if (C14477k8.SESSION_REPLAY_FORCE_START.mo35776b(str)) {
            this.f35227b.mo35112a(false, false);
        }
        C14477k8 k8Var = C14477k8.SCREEN_NUMBER;
        if (k8Var.mo35776b(str)) {
            this.f35227b.mo35112a(this.f35226a.mo34670b(k8Var, 0) == 1, false);
        }
        if (C14477k8.SESSION_ID.mo35776b(str) || C14477k8.RAW_CONFIGURATION_AS_JSON.mo35776b(str) || C14477k8.CLIENT_MODE_GOD_MODE.mo35776b(str) || C14477k8.TRACKING_ENABLE.mo35776b(str) || C14477k8.FORGET_ME.mo35776b(str) || C14477k8.LOCAL_SESSION_REPLAY_MODE.mo35776b(str)) {
            this.f35227b.mo35112a(true, true);
        }
    }
}
