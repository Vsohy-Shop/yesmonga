package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40764g2;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40996v;
import com.google.android.gms.common.wrappers.C41008d;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

@C40473a
/* renamed from: com.google.android.gms.common.stats.b */
public class C40954b {

    /* renamed from: b */
    public static final Object f104196b = new Object();
    @Nullable

    /* renamed from: c */
    public static volatile C40954b f104197c;
    @C0359n0
    @C40974d0

    /* renamed from: a */
    public ConcurrentHashMap f104198a = new ConcurrentHashMap();

    @C40473a
    @C0359n0
    /* renamed from: b */
    public static C40954b m166547b() {
        if (f104197c == null) {
            synchronized (f104196b) {
                if (f104197c == null) {
                    f104197c = new C40954b();
                }
            }
        }
        C40954b bVar = f104197c;
        C40843u.m166202l(bVar);
        return bVar;
    }

    /* renamed from: f */
    public static void m166548f(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: h */
    public static boolean m166549h(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof C40764g2);
    }

    /* renamed from: i */
    public static final boolean m166550i(Context context, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        if (!C40996v.m166691p() || executor == null) {
            return context.bindService(intent, serviceConnection, i);
        }
        return context.bindService(intent, i, executor, serviceConnection);
    }

    @C40473a
    /* renamed from: a */
    public boolean mo134751a(@C0359n0 Context context, @C0359n0 Intent intent, @C0359n0 ServiceConnection serviceConnection, int i) {
        return mo134755g(context, context.getClass().getName(), intent, serviceConnection, i, true, (Executor) null);
    }

    @C40473a
    /* renamed from: c */
    public void mo134752c(@C0359n0 Context context, @C0359n0 ServiceConnection serviceConnection) {
        if (!m166549h(serviceConnection) || !this.f104198a.containsKey(serviceConnection)) {
            m166548f(context, serviceConnection);
            return;
        }
        try {
            m166548f(context, (ServiceConnection) this.f104198a.get(serviceConnection));
        } finally {
            this.f104198a.remove(serviceConnection);
        }
    }

    @C40473a
    /* renamed from: d */
    public void mo134753d(@C0359n0 Context context, @C0359n0 ServiceConnection serviceConnection) {
        try {
            mo134752c(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: e */
    public final boolean mo134754e(@C0359n0 Context context, @C0359n0 String str, @C0359n0 Intent intent, @C0359n0 ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        return mo134755g(context, str, intent, serviceConnection, i, true, executor);
    }

    /* renamed from: g */
    public final boolean mo134755g(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C41008d.m166715a(context).mo134781c(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m166549h(serviceConnection)) {
            return m166550i(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f104198a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()});
        }
        try {
            boolean i2 = m166550i(context, intent, serviceConnection, i, executor);
            if (i2) {
                return i2;
            }
            return false;
        } finally {
            this.f104198a.remove(serviceConnection, serviceConnection);
        }
    }
}
