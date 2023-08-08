package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.view.View;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35160l;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.j */
public final /* synthetic */ class C35154j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C35160l f85941a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f85942b;

    /* renamed from: c */
    public final /* synthetic */ int f85943c;

    /* renamed from: d */
    public final /* synthetic */ C35160l.C35162b f85944d;

    public /* synthetic */ C35154j(C35160l lVar, JSONObject jSONObject, int i, C35160l.C35162b bVar) {
        this.f85941a = lVar;
        this.f85942b = jSONObject;
        this.f85943c = i;
        this.f85944d = bVar;
    }

    public final void onClick(View view) {
        this.f85941a.m144829B(this.f85942b, this.f85943c, this.f85944d, view);
    }
}
