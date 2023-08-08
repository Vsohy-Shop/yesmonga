package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.view.View;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.o */
public final /* synthetic */ class C35165o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C35166p f86016a;

    /* renamed from: b */
    public final /* synthetic */ int f86017b;

    /* renamed from: c */
    public final /* synthetic */ JSONObject f86018c;

    public /* synthetic */ C35165o(C35166p pVar, int i, JSONObject jSONObject) {
        this.f86016a = pVar;
        this.f86017b = i;
        this.f86018c = jSONObject;
    }

    public final void onClick(View view) {
        this.f86016a.m144873p(this.f86017b, this.f86018c, view);
    }
}
