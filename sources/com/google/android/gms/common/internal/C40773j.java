package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.util.C40974d0;
import java.util.concurrent.Executor;

@C40473a
/* renamed from: com.google.android.gms.common.internal.j */
public abstract class C40773j {

    /* renamed from: a */
    public static int f103886a = 4225;

    /* renamed from: b */
    public static final Object f103887b = new Object();
    @C0363p0

    /* renamed from: c */
    public static C40760f2 f103888c = null;
    @C0363p0
    @C40974d0

    /* renamed from: d */
    public static HandlerThread f103889d = null;

    /* renamed from: e */
    public static boolean f103890e = false;

    @C40473a
    /* renamed from: c */
    public static int m165913c() {
        return f103886a;
    }

    @C40473a
    @C0359n0
    /* renamed from: d */
    public static C40773j m165914d(@C0359n0 Context context) {
        Looper looper;
        synchronized (f103887b) {
            if (f103888c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f103890e) {
                    looper = m165915e().getLooper();
                } else {
                    looper = context.getMainLooper();
                }
                f103888c = new C40760f2(applicationContext, looper);
            }
        }
        return f103888c;
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public static HandlerThread m165915e() {
        synchronized (f103887b) {
            HandlerThread handlerThread = f103889d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f103889d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f103889d;
            return handlerThread3;
        }
    }

    @C40473a
    /* renamed from: f */
    public static void m165916f() {
        synchronized (f103887b) {
            C40760f2 f2Var = f103888c;
            if (f2Var != null && !f103890e) {
                f2Var.mo134407q(m165915e().getLooper());
            }
            f103890e = true;
        }
    }

    @C40473a
    /* renamed from: a */
    public boolean mo134423a(@C0359n0 ComponentName componentName, @C0359n0 ServiceConnection serviceConnection, @C0359n0 String str) {
        return mo134406k(new C40732a2(componentName, m165913c()), serviceConnection, str, (Executor) null);
    }

    @C40473a
    /* renamed from: b */
    public boolean mo134424b(@C0359n0 String str, @C0359n0 ServiceConnection serviceConnection, @C0359n0 String str2) {
        return mo134406k(new C40732a2(str, m165913c(), false), serviceConnection, str2, (Executor) null);
    }

    @C40473a
    /* renamed from: g */
    public void mo134425g(@C0359n0 ComponentName componentName, @C0359n0 ServiceConnection serviceConnection, @C0359n0 String str) {
        mo134405i(new C40732a2(componentName, m165913c()), serviceConnection, str);
    }

    @C40473a
    /* renamed from: h */
    public void mo134426h(@C0359n0 String str, @C0359n0 ServiceConnection serviceConnection, @C0359n0 String str2) {
        mo134405i(new C40732a2(str, m165913c(), false), serviceConnection, str2);
    }

    /* renamed from: i */
    public abstract void mo134405i(C40732a2 a2Var, ServiceConnection serviceConnection, String str);

    /* renamed from: j */
    public final void mo134427j(@C0359n0 String str, @C0359n0 String str2, int i, @C0359n0 ServiceConnection serviceConnection, @C0359n0 String str3, boolean z) {
        mo134405i(new C40732a2(str, str2, i, z), serviceConnection, str3);
    }

    /* renamed from: k */
    public abstract boolean mo134406k(C40732a2 a2Var, ServiceConnection serviceConnection, String str, @C0363p0 Executor executor);
}
