package com.onetrust.otpublishers.headless.p052UI.adapter;

import android.widget.CompoundButton;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35157k0;

/* renamed from: com.onetrust.otpublishers.headless.UI.adapter.i0 */
public final /* synthetic */ class C35153i0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C35157k0 f85938a;

    /* renamed from: b */
    public final /* synthetic */ C35157k0.C35159b f85939b;

    /* renamed from: c */
    public final /* synthetic */ String f85940c;

    public /* synthetic */ C35153i0(C35157k0 k0Var, C35157k0.C35159b bVar, String str) {
        this.f85938a = k0Var;
        this.f85939b = bVar;
        this.f85940c = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f85938a.m144802w(this.f85939b, this.f85940c, compoundButton, z);
    }
}
