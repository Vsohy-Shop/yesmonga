package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.gms.dynamic.m */
public final class C41026m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f104311a;

    /* renamed from: b */
    public final /* synthetic */ Intent f104312b;

    public C41026m(Context context, Intent intent) {
        this.f104311a = context;
        this.f104312b = intent;
    }

    public final void onClick(View view) {
        try {
            this.f104311a.startActivity(this.f104312b);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
