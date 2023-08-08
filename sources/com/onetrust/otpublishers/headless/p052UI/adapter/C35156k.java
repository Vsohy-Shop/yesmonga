package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.widget.CompoundButton;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35160l;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.k */
public final /* synthetic */ class C35156k implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C35160l f85947a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f85948b;

    /* renamed from: c */
    public final /* synthetic */ C35160l.C35162b f85949c;

    public /* synthetic */ C35156k(C35160l lVar, JSONObject jSONObject, C35160l.C35162b bVar) {
        this.f85947a = lVar;
        this.f85948b = jSONObject;
        this.f85949c = bVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f85947a.m144833L(this.f85948b, this.f85949c, compoundButton, z);
    }
}
