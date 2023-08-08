package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.widget.CompoundButton;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35139e;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.d */
public final /* synthetic */ class C35136d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C35139e f85859a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f85860b;

    /* renamed from: c */
    public final /* synthetic */ C35139e.C35141b f85861c;

    public /* synthetic */ C35136d(C35139e eVar, JSONObject jSONObject, C35139e.C35141b bVar) {
        this.f85859a = eVar;
        this.f85860b = jSONObject;
        this.f85861c = bVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f85859a.m144747x(this.f85860b, this.f85861c, compoundButton, z);
    }
}
