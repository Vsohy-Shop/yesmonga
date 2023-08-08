package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.k0 */
public final class C40778k0 extends C40792n0 {

    /* renamed from: a */
    public final /* synthetic */ Intent f103895a;

    /* renamed from: b */
    public final /* synthetic */ Activity f103896b;

    /* renamed from: c */
    public final /* synthetic */ int f103897c;

    public C40778k0(Intent intent, Activity activity, int i) {
        this.f103895a = intent;
        this.f103896b = activity;
        this.f103897c = i;
    }

    /* renamed from: a */
    public final void mo134447a() {
        Intent intent = this.f103895a;
        if (intent != null) {
            this.f103896b.startActivityForResult(intent, this.f103897c);
        }
    }
}
