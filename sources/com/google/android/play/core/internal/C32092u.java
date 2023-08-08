package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.internal.u */
public final class C32092u<T extends IInterface> {

    /* renamed from: l */
    public static final Map<String, Handler> f78291l = new HashMap();

    /* renamed from: a */
    public final Context f78292a;

    /* renamed from: b */
    public final C32062k f78293b;

    /* renamed from: c */
    public final String f78294c;

    /* renamed from: d */
    public final List<C32065l> f78295d = new ArrayList();

    /* renamed from: e */
    public boolean f78296e;

    /* renamed from: f */
    public final Intent f78297f;

    /* renamed from: g */
    public final C32080q<T> f78298g;

    /* renamed from: h */
    public final WeakReference<C32077p> f78299h;

    /* renamed from: i */
    public final IBinder.DeathRecipient f78300i = new C32068m(this);
    @Nullable

    /* renamed from: j */
    public ServiceConnection f78301j;
    @Nullable

    /* renamed from: k */
    public T f78302k;

    public C32092u(Context context, C32062k kVar, String str, Intent intent, C32080q<T> qVar) {
        this.f78292a = context;
        this.f78293b = kVar;
        this.f78294c = str;
        this.f78297f = intent;
        this.f78298g = qVar;
        this.f78299h = new WeakReference<>((Object) null);
    }

    /* renamed from: d */
    public static /* synthetic */ void m129939d(C32092u uVar, C32065l lVar) {
        if (uVar.f78302k == null && !uVar.f78296e) {
            uVar.f78293b.mo92778d("Initiate binding to the service.", new Object[0]);
            uVar.f78295d.add(lVar);
            C32089t tVar = new C32089t(uVar);
            uVar.f78301j = tVar;
            uVar.f78296e = true;
            if (!uVar.f78292a.bindService(uVar.f78297f, tVar, 1)) {
                uVar.f78293b.mo92778d("Failed to bind to the service.", new Object[0]);
                uVar.f78296e = false;
                for (C32065l b : uVar.f78295d) {
                    b.mo92784b(new C32031ar());
                }
                uVar.f78295d.clear();
            }
        } else if (uVar.f78296e) {
            uVar.f78293b.mo92778d("Waiting to bind to the service.", new Object[0]);
            uVar.f78295d.add(lVar);
        } else {
            lVar.run();
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m129945j(C32092u uVar) {
        uVar.f78293b.mo92778d("linkToDeath", new Object[0]);
        try {
            uVar.f78302k.asBinder().linkToDeath(uVar.f78300i, 0);
        } catch (RemoteException e) {
            uVar.f78293b.mo92777c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m129948m(C32092u uVar) {
        uVar.f78293b.mo92778d("unlinkToDeath", new Object[0]);
        uVar.f78302k.asBinder().unlinkToDeath(uVar.f78300i, 0);
    }

    /* renamed from: a */
    public final void mo92829a(C32065l lVar) {
        mo92833r(new C32071n(this, lVar.mo92785c(), lVar));
    }

    /* renamed from: b */
    public final void mo92830b() {
        mo92833r(new C32074o(this));
    }

    @Nullable
    /* renamed from: c */
    public final T mo92831c() {
        return this.f78302k;
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void mo92832n() {
        this.f78293b.mo92778d("reportBinderDeath", new Object[0]);
        C32077p pVar = this.f78299h.get();
        if (pVar == null) {
            this.f78293b.mo92778d("%s : Binder has died.", this.f78294c);
            for (C32065l b : this.f78295d) {
                b.mo92784b(new RemoteException(String.valueOf(this.f78294c).concat(" : Binder has died.")));
            }
            this.f78295d.clear();
            return;
        }
        this.f78293b.mo92778d("calling onBinderDied", new Object[0]);
        pVar.mo92800a();
    }

    /* renamed from: r */
    public final void mo92833r(C32065l lVar) {
        Handler handler;
        Map<String, Handler> map = f78291l;
        synchronized (map) {
            if (!map.containsKey(this.f78294c)) {
                HandlerThread handlerThread = new HandlerThread(this.f78294c, 10);
                handlerThread.start();
                map.put(this.f78294c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f78294c);
        }
        handler.post(lVar);
    }
}
