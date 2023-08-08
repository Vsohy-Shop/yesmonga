package com.google.android.play.core.listener;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.Nullable;
import com.google.android.play.core.internal.C32028a0;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.splitcompat.C32150r;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.play.core.listener.c */
public abstract class C32112c<StateT> {

    /* renamed from: a */
    public final C32062k f78323a;

    /* renamed from: b */
    public final IntentFilter f78324b;

    /* renamed from: c */
    public final Context f78325c;

    /* renamed from: d */
    public final Set<C32110a<StateT>> f78326d = new HashSet();
    @Nullable

    /* renamed from: e */
    public C32111b f78327e = null;

    /* renamed from: f */
    public volatile boolean f78328f = false;

    public C32112c(C32062k kVar, IntentFilter intentFilter, Context context) {
        this.f78323a = kVar;
        this.f78324b = intentFilter;
        this.f78325c = C32150r.m130103c(context);
    }

    /* renamed from: a */
    public abstract void mo92414a(Context context, Intent intent);

    /* renamed from: b */
    public final void mo92848b() {
        C32111b bVar;
        if ((this.f78328f || !this.f78326d.isEmpty()) && this.f78327e == null) {
            C32111b bVar2 = new C32111b(this);
            this.f78327e = bVar2;
            this.f78325c.registerReceiver(bVar2, this.f78324b);
        }
        if (!this.f78328f && this.f78326d.isEmpty() && (bVar = this.f78327e) != null) {
            this.f78325c.unregisterReceiver(bVar);
            this.f78327e = null;
        }
    }

    /* renamed from: c */
    public final synchronized void mo92849c(boolean z) {
        this.f78328f = z;
        mo92848b();
    }

    /* renamed from: d */
    public final synchronized void mo92850d(C32110a<StateT> aVar) {
        this.f78323a.mo92778d("registerListener", new Object[0]);
        C32028a0.m129764d(aVar, "Registered Play Core listener should not be null.");
        this.f78326d.add(aVar);
        mo92848b();
    }

    /* renamed from: e */
    public final synchronized void mo92851e(C32110a<StateT> aVar) {
        this.f78323a.mo92778d("unregisterListener", new Object[0]);
        C32028a0.m129764d(aVar, "Unregistered Play Core listener should not be null.");
        this.f78326d.remove(aVar);
        mo92848b();
    }

    /* renamed from: f */
    public final synchronized void mo92852f() {
        this.f78323a.mo92778d("clearListeners", new Object[0]);
        this.f78326d.clear();
        mo92848b();
    }

    /* renamed from: g */
    public final synchronized void mo92853g(StateT statet) {
        Iterator it = new HashSet(this.f78326d).iterator();
        while (it.hasNext()) {
            ((C32110a) it.next()).mo92474a(statet);
        }
    }

    /* renamed from: h */
    public final synchronized boolean mo92854h() {
        return this.f78327e != null;
    }
}
