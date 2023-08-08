package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.C0696c;
import androidx.core.app.C17075f2;
import com.google.android.gms.common.util.C40996v;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.messaging.C33176e;
import com.google.firebase.messaging.C33180f;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.g */
public class C33191g {

    /* renamed from: d */
    public static final int f80695d = 5;

    /* renamed from: a */
    public final ExecutorService f80696a;

    /* renamed from: b */
    public final Context f80697b;

    /* renamed from: c */
    public final C33209l0 f80698c;

    public C33191g(Context context, C33209l0 l0Var, ExecutorService executorService) {
        this.f80696a = executorService;
        this.f80697b = context;
        this.f80698c = l0Var;
    }

    /* renamed from: a */
    public boolean mo96082a() {
        if (this.f80698c.mo96113a(C33180f.C33183c.f80587f)) {
            return true;
        }
        if (mo96083b()) {
            return false;
        }
        C33195h0 d = mo96085d();
        C33176e.C33177a e = C33176e.m133821e(this.f80697b, this.f80698c);
        mo96086e(e.f80543a, d);
        mo96084c(e);
        return true;
    }

    /* renamed from: b */
    public final boolean mo96083b() {
        if (((KeyguardManager) this.f80697b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C40996v.m166685j()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f80697b.getSystemService(C0696c.f2306r)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                if (next.importance == 100) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo96084c(C33176e.C33177a aVar) {
        ((NotificationManager) this.f80697b.getSystemService(C33202j0.f80718b)).notify(aVar.f80544b, aVar.f80545c, aVar.f80543a.mo51389h());
    }

    @C0363p0
    /* renamed from: d */
    public final C33195h0 mo96085d() {
        C33195h0 d = C33195h0.m133888d(this.f80698c.mo96127p(C33180f.C33183c.f80591j));
        if (d != null) {
            d.mo96093i(this.f80696a);
        }
        return d;
    }

    /* renamed from: e */
    public final void mo96086e(C17075f2.C17092g gVar, @C0363p0 C33195h0 h0Var) {
        if (h0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) C31053n.m124520b(h0Var.mo96092f(), 5, TimeUnit.SECONDS);
                gVar.mo51380c0(bitmap);
                gVar.mo51425z0(new C17075f2.C17083d().mo51309C(bitmap).mo51308B((Bitmap) null));
            } catch (ExecutionException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to download image: ");
                sb.append(e.getCause());
            } catch (InterruptedException unused) {
                h0Var.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                h0Var.close();
            }
        }
    }
}
