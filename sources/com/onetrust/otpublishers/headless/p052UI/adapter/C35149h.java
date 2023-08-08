package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.widget.CompoundButton;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35160l;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.h */
public final /* synthetic */ class C35149h implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C35160l f85919a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f85920b;

    /* renamed from: c */
    public final /* synthetic */ C35160l.C35162b f85921c;

    public /* synthetic */ C35149h(C35160l lVar, JSONObject jSONObject, C35160l.C35162b bVar) {
        this.f85919a = lVar;
        this.f85920b = jSONObject;
        this.f85921c = bVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f85919a.m144830C(this.f85920b, this.f85921c, compoundButton, z);
    }
}
