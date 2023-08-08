package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.widget.CompoundButton;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35166p;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.n */
public final /* synthetic */ class C35164n implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C35166p f86013a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f86014b;

    /* renamed from: c */
    public final /* synthetic */ C35166p.C35167a f86015c;

    public /* synthetic */ C35164n(C35166p pVar, JSONObject jSONObject, C35166p.C35167a aVar) {
        this.f86013a = pVar;
        this.f86014b = jSONObject;
        this.f86015c = aVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f86013a.m144875w(this.f86014b, this.f86015c, compoundButton, z);
    }
}
