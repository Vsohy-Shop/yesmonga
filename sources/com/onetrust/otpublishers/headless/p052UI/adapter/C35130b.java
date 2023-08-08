package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.b */
public final /* synthetic */ class C35130b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C35132c f85828a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f85829b;

    /* renamed from: c */
    public final /* synthetic */ SwitchCompat f85830c;

    public /* synthetic */ C35130b(C35132c cVar, JSONObject jSONObject, SwitchCompat switchCompat) {
        this.f85828a = cVar;
        this.f85829b = jSONObject;
        this.f85830c = switchCompat;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f85828a.m144698A(this.f85829b, this.f85830c, compoundButton, z);
    }
}
