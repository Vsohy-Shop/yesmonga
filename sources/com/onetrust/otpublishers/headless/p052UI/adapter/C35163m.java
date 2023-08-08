package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.view.View;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35166p;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.m */
public final /* synthetic */ class C35163m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C35166p f86009a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f86010b;

    /* renamed from: c */
    public final /* synthetic */ C35166p.C35167a f86011c;

    /* renamed from: d */
    public final /* synthetic */ String f86012d;

    public /* synthetic */ C35163m(C35166p pVar, JSONObject jSONObject, C35166p.C35167a aVar, String str) {
        this.f86009a = pVar;
        this.f86010b = jSONObject;
        this.f86011c = aVar;
        this.f86012d = str;
    }

    public final void onClick(View view) {
        this.f86009a.m144876x(this.f86010b, this.f86011c, this.f86012d, view);
    }
}
