package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.widget.CompoundButton;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35160l;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.i */
public final /* synthetic */ class C35152i implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C35160l f85935a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f85936b;

    /* renamed from: c */
    public final /* synthetic */ C35160l.C35162b f85937c;

    public /* synthetic */ C35152i(C35160l lVar, JSONObject jSONObject, C35160l.C35162b bVar) {
        this.f85935a = lVar;
        this.f85936b = jSONObject;
        this.f85937c = bVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f85935a.m144832I(this.f85936b, this.f85937c, compoundButton, z);
    }
}
