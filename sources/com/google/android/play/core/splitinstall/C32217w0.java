package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.listener.C32112c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.w0 */
public final class C32217w0 extends C32112c<C32167f> {
    @Nullable

    /* renamed from: j */
    public static C32217w0 f78558j;

    /* renamed from: g */
    public final Handler f78559g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public final C32176j0 f78560h;

    /* renamed from: i */
    public final Set<C32169g> f78561i = new LinkedHashSet();

    public C32217w0(Context context, C32176j0 j0Var) {
        super(new C32062k("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f78560h = j0Var;
    }

    /* renamed from: i */
    public static synchronized C32217w0 m130313i(Context context) {
        C32217w0 w0Var;
        synchronized (C32217w0.class) {
            if (f78558j == null) {
                f78558j = new C32217w0(context, C32179l.f78434a);
            }
            w0Var = f78558j;
        }
        return w0Var;
    }

    /* renamed from: a */
    public final void mo92414a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra != null) {
            C32167f f = C32167f.m130175f(bundleExtra);
            this.f78323a.mo92775a("ListenerRegistryBroadcastReceiver.onReceive: %s", f);
            C32178k0 a = this.f78560h.mo92977a();
            if (f.mo92965m() != 3 || a == null) {
                mo93010l(f);
            } else {
                a.mo92838a(f.mo92958d(), new C32213u0(this, f, intent, context));
            }
        }
    }

    /* renamed from: j */
    public final synchronized void mo93008j(C32169g gVar) {
        this.f78561i.add(gVar);
    }

    /* renamed from: k */
    public final synchronized void mo93009k(C32169g gVar) {
        this.f78561i.remove(gVar);
    }

    /* renamed from: l */
    public final synchronized void mo93010l(C32167f fVar) {
        Iterator it = new LinkedHashSet(this.f78561i).iterator();
        while (it.hasNext()) {
            ((C32169g) it.next()).mo92474a(fVar);
        }
        super.mo92853g(fVar);
    }
}
