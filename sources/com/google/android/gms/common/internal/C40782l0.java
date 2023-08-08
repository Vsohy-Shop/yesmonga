package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: com.google.android.gms.common.internal.l0 */
public final class C40782l0 extends C40792n0 {

    /* renamed from: a */
    public final /* synthetic */ Intent f103898a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f103899b;

    /* renamed from: c */
    public final /* synthetic */ int f103900c;

    public C40782l0(Intent intent, Fragment fragment, int i) {
        this.f103898a = intent;
        this.f103899b = fragment;
        this.f103900c = i;
    }

    /* renamed from: a */
    public final void mo134447a() {
        Intent intent = this.f103898a;
        if (intent != null) {
            this.f103899b.startActivityForResult(intent, this.f103900c);
        }
    }
}
