package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C40587m;

/* renamed from: com.google.android.gms.common.internal.m0 */
public final class C40787m0 extends C40792n0 {

    /* renamed from: a */
    public final /* synthetic */ Intent f103905a;

    /* renamed from: b */
    public final /* synthetic */ C40587m f103906b;

    public C40787m0(Intent intent, C40587m mVar, int i) {
        this.f103905a = intent;
        this.f103906b = mVar;
    }

    /* renamed from: a */
    public final void mo134447a() {
        Intent intent = this.f103905a;
        if (intent != null) {
            this.f103906b.startActivityForResult(intent, 2);
        }
    }
}
