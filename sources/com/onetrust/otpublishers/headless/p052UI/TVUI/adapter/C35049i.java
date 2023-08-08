package com.onetrust.otpublishers.headless.p052UI.TVUI.adapter;

import android.widget.CompoundButton;
import com.onetrust.otpublishers.headless.p052UI.TVUI.adapter.C35050j;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.adapter.i */
public final /* synthetic */ class C35049i implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C35050j f85319a;

    /* renamed from: b */
    public final /* synthetic */ C35050j.C35052b f85320b;

    /* renamed from: c */
    public final /* synthetic */ String f85321c;

    /* renamed from: d */
    public final /* synthetic */ String f85322d;

    public /* synthetic */ C35049i(C35050j jVar, C35050j.C35052b bVar, String str, String str2) {
        this.f85319a = jVar;
        this.f85320b = bVar;
        this.f85321c = str;
        this.f85322d = str2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f85319a.m143839s(this.f85320b, this.f85321c, this.f85322d, compoundButton, z);
    }
}
