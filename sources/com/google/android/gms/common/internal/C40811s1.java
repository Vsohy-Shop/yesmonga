package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.util.C40974d0;

@C40974d0
/* renamed from: com.google.android.gms.common.internal.s1 */
public final class C40811s1 implements ServiceConnection {

    /* renamed from: c */
    public final int f103933c;

    /* renamed from: d */
    public final /* synthetic */ C40747e f103934d;

    public C40811s1(C40747e eVar, int i) {
        this.f103934d = eVar;
        this.f103933c = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C40798p pVar;
        C40747e eVar = this.f103934d;
        if (iBinder == null) {
            C40747e.m165796l0(eVar, 16);
            return;
        }
        synchronized (eVar.f103828p) {
            C40747e eVar2 = this.f103934d;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C40798p)) {
                pVar = new C40767h1(iBinder);
            } else {
                pVar = (C40798p) queryLocalInterface;
            }
            eVar2.f103829q = pVar;
        }
        this.f103934d.mo134363m0(0, (Bundle) null, this.f103933c);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f103934d.f103828p) {
            this.f103934d.f103829q = null;
        }
        Handler handler = this.f103934d.f103826n;
        handler.sendMessage(handler.obtainMessage(6, this.f103933c, 1));
    }
}
