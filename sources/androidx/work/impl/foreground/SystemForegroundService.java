package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0380x0;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.C19391a0;
import androidx.work.C21377l;
import androidx.work.impl.foreground.C21186b;
import com.google.firebase.messaging.C33202j0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundService extends C19391a0 implements C21186b.C21188b {

    /* renamed from: f */
    public static final String f54648f = C21377l.m98584i("SystemFgService");
    @C0363p0

    /* renamed from: g */
    public static SystemForegroundService f54649g = null;

    /* renamed from: b */
    public Handler f54650b;

    /* renamed from: c */
    public boolean f54651c;

    /* renamed from: d */
    public C21186b f54652d;

    /* renamed from: e */
    public NotificationManager f54653e;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    public class C21180a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f54654a;

        /* renamed from: b */
        public final /* synthetic */ Notification f54655b;

        /* renamed from: c */
        public final /* synthetic */ int f54656c;

        public C21180a(int i, Notification notification, int i2) {
            this.f54654a = i;
            this.f54655b = notification;
            this.f54656c = i2;
        }

        public void run() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                C21184e.m97910a(SystemForegroundService.this, this.f54654a, this.f54655b, this.f54656c);
            } else if (i >= 29) {
                C21183d.m97909a(SystemForegroundService.this, this.f54654a, this.f54655b, this.f54656c);
            } else {
                SystemForegroundService.this.startForeground(this.f54654a, this.f54655b);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    public class C21181b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f54658a;

        /* renamed from: b */
        public final /* synthetic */ Notification f54659b;

        public C21181b(int i, Notification notification) {
            this.f54658a = i;
            this.f54659b = notification;
        }

        public void run() {
            SystemForegroundService.this.f54653e.notify(this.f54658a, this.f54659b);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    public class C21182c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f54661a;

        public C21182c(int i) {
            this.f54661a = i;
        }

        public void run() {
            SystemForegroundService.this.f54653e.cancel(this.f54661a);
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$d */
    public static class C21183d {
        @C0373u
        /* renamed from: a */
        public static void m97909a(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    @C0376v0(31)
    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$e */
    public static class C21184e {
        @C0373u
        /* renamed from: a */
        public static void m97910a(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                C21377l.m98582e().mo63783m(SystemForegroundService.f54648f, "Unable to start foreground service", e);
            }
        }
    }

    @C0363p0
    /* renamed from: f */
    public static SystemForegroundService m97904f() {
        return f54649g;
    }

    @C0380x0("android.permission.POST_NOTIFICATIONS")
    /* renamed from: a */
    public void mo63336a(int i, @C0359n0 Notification notification) {
        this.f54650b.post(new C21181b(i, notification));
    }

    /* renamed from: c */
    public void mo63337c(int i, int i2, @C0359n0 Notification notification) {
        this.f54650b.post(new C21180a(i, notification, i2));
    }

    /* renamed from: d */
    public void mo63338d(int i) {
        this.f54650b.post(new C21182c(i));
    }

    @C0353k0
    /* renamed from: g */
    public final void mo63339g() {
        this.f54650b = new Handler(Looper.getMainLooper());
        this.f54653e = (NotificationManager) getApplicationContext().getSystemService(C33202j0.f80718b);
        C21186b bVar = new C21186b(getApplicationContext());
        this.f54652d = bVar;
        bVar.mo63353o(this);
    }

    public void onCreate() {
        super.onCreate();
        f54649g = this;
        mo63339g();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f54652d.mo63351m();
    }

    public int onStartCommand(@C0363p0 Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f54651c) {
            C21377l.m98582e().mo63778f(f54648f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f54652d.mo63351m();
            mo63339g();
            this.f54651c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f54652d.mo63352n(intent);
        return 3;
    }

    @C0353k0
    public void stop() {
        this.f54651c = true;
        C21377l.m98582e().mo63774a(f54648f, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f54649g = null;
        stopSelf();
    }
}
