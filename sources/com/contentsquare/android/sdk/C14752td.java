package com.contentsquare.android.sdk;

import android.net.Uri;

/* renamed from: com.contentsquare.android.sdk.td */
public class C14752td {

    /* renamed from: a */
    public final C14213b7 f36519a;

    /* renamed from: b */
    public final C14771u6 f36520b;

    /* renamed from: c */
    public final C14397h7 f36521c;

    public C14752td(C14213b7 b7Var, C14771u6 u6Var) {
        this.f36519a = b7Var;
        this.f36520b = u6Var;
        this.f36521c = new C14397h7(b7Var);
    }

    /* renamed from: a */
    public synchronized String mo36531a() {
        Uri.Builder buildUpon;
        buildUpon = Uri.parse("https://app.contentsquare.com/quick-playback/index.html").buildUpon();
        buildUpon.appendQueryParameter("uu", this.f36521c.mo35500a());
        buildUpon.appendQueryParameter("recordingType", "cs");
        buildUpon.appendQueryParameter("pid", String.valueOf(mo36532b()));
        buildUpon.appendQueryParameter("sn", Integer.toString(this.f36519a.mo34670b(C14477k8.SESSION_ID, 1)));
        return buildUpon.build().toString();
    }

    /* renamed from: b */
    public final int mo36532b() {
        C14466k4 c = this.f36520b.mo36561c();
        if (c != null) {
            return c.mo35709a();
        }
        return 0;
    }
}
