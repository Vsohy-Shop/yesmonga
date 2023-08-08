package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.play.core.internal.t */
public final class C32089t implements ServiceConnection {

    /* renamed from: c */
    public final /* synthetic */ C32092u f78287c;

    public /* synthetic */ C32089t(C32092u uVar) {
        this.f78287c = uVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f78287c.f78293b.mo92778d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f78287c.mo92833r(new C32083r(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f78287c.f78293b.mo92778d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f78287c.mo92833r(new C32086s(this));
    }
}
