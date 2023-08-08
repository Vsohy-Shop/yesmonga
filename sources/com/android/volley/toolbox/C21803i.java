package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.C21751e;
import com.android.volley.C21762l;
import com.android.volley.C21771p;
import com.android.volley.Request;

/* renamed from: com.android.volley.toolbox.i */
public class C21803i extends Request<Object> {

    /* renamed from: H0 */
    public final C21751e f56404H0;

    /* renamed from: I0 */
    public final Runnable f56405I0;

    public C21803i(C21751e eVar, Runnable runnable) {
        super(0, (String) null, (C21771p.C21772a) null);
        this.f56404H0 = eVar;
        this.f56405I0 = runnable;
    }

    /* renamed from: O0 */
    public boolean mo64791O0() {
        this.f56404H0.clear();
        if (this.f56405I0 == null) {
            return true;
        }
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.f56405I0);
        return true;
    }

    /* renamed from: k1 */
    public C21771p<Object> mo20305k1(C21762l lVar) {
        return null;
    }

    /* renamed from: u0 */
    public Request.Priority mo64816u0() {
        return Request.Priority.IMMEDIATE;
    }

    /* renamed from: y */
    public void mo20306y(Object obj) {
    }
}
