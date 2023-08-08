package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* renamed from: com.google.android.play.core.assetpacks.x */
public final /* synthetic */ class C32001x implements Runnable {

    /* renamed from: a */
    public final C32009z f78173a;

    /* renamed from: b */
    public final Bundle f78174b;

    /* renamed from: c */
    public final AssetPackState f78175c;

    public C32001x(C32009z zVar, Bundle bundle, AssetPackState assetPackState) {
        this.f78173a = zVar;
        this.f78174b = bundle;
        this.f78175c = assetPackState;
    }

    public final void run() {
        this.f78173a.mo92710k(this.f78174b, this.f78175c);
    }
}
