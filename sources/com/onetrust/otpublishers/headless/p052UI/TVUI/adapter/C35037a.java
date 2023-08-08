package com.onetrust.otpublishers.headless.p052UI.TVUI.adapter;

import android.view.View;
import com.onetrust.otpublishers.headless.p052UI.TVUI.adapter.C35039c;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35113m;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.a */
public final /* synthetic */ class C35037a implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C35039c f85284a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f85285b;

    /* renamed from: c */
    public final /* synthetic */ C35039c.C35041b f85286c;

    /* renamed from: d */
    public final /* synthetic */ C35113m f85287d;

    public /* synthetic */ C35037a(C35039c cVar, JSONObject jSONObject, C35039c.C35041b bVar, C35113m mVar) {
        this.f85284a = cVar;
        this.f85285b = jSONObject;
        this.f85286c = bVar;
        this.f85287d = mVar;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f85284a.m143811p(this.f85285b, this.f85286c, this.f85287d, view, z);
    }
}
