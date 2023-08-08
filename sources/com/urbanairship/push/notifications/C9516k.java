package com.urbanairship.push.notifications;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0351j1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.firebase.messaging.C33202j0;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.C36062p;
import com.urbanairship.C36080x;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.urbanairship.push.notifications.k */
public class C9516k {

    /* renamed from: e */
    public static final String f26003e = "ua_notification_channel_registry.db";
    @C0344h1

    /* renamed from: a */
    public final C9522l f26004a;

    /* renamed from: b */
    public final Executor f26005b;

    /* renamed from: c */
    public final Context f26006c;

    /* renamed from: d */
    public final NotificationManager f26007d;

    /* renamed from: com.urbanairship.push.notifications.k$a */
    public class C9517a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f26008a;

        /* renamed from: b */
        public final /* synthetic */ C36062p f26009b;

        public C9517a(String str, C36062p pVar) {
            this.f26008a = str;
            this.f26009b = pVar;
        }

        public void run() {
            C9515j jVar;
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel a = C9516k.this.f26007d.getNotificationChannel(this.f26008a);
                if (a != null) {
                    jVar = new C9515j(a);
                } else {
                    C9515j w = C9516k.this.f26004a.mo19367w(this.f26008a);
                    if (w == null) {
                        w = C9516k.this.mo19355i(this.f26008a);
                    }
                    jVar = w;
                    if (jVar != null) {
                        C9516k.this.f26007d.createNotificationChannel(jVar.mo19325D());
                    }
                }
            } else {
                jVar = C9516k.this.f26004a.mo19367w(this.f26008a);
                if (jVar == null) {
                    jVar = C9516k.this.mo19355i(this.f26008a);
                }
            }
            this.f26009b.mo107828g(jVar);
        }
    }

    /* renamed from: com.urbanairship.push.notifications.k$b */
    public class C9518b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f26011a;

        public C9518b(String str) {
            this.f26011a = str;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 26) {
                C9516k.this.f26007d.deleteNotificationChannel(this.f26011a);
            }
            C9516k.this.f26004a.mo19364t(this.f26011a);
        }
    }

    /* renamed from: com.urbanairship.push.notifications.k$c */
    public class C9519c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9515j f26013a;

        public C9519c(C9515j jVar) {
            this.f26013a = jVar;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 26) {
                C9516k.this.f26007d.createNotificationChannel(this.f26013a.mo19325D());
            }
            C9516k.this.f26004a.mo19363s(this.f26013a);
        }
    }

    /* renamed from: com.urbanairship.push.notifications.k$d */
    public class C9520d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9515j f26015a;

        public C9520d(C9515j jVar) {
            this.f26015a = jVar;
        }

        public void run() {
            C9516k.this.f26004a.mo19363s(this.f26015a);
        }
    }

    /* renamed from: com.urbanairship.push.notifications.k$e */
    public class C9521e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f26017a;

        public C9521e(int i) {
            this.f26017a = i;
        }

        public void run() {
            for (C9515j next : C9515j.m35674d(C9516k.this.f26006c, this.f26017a)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    C9516k.this.f26007d.createNotificationChannel(next.mo19325D());
                }
                C9516k.this.f26004a.mo19363s(next);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9516k(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions) {
        this(context, new C9522l(context, airshipConfigOptions.f87128a, f26003e), C36044d.m148369a());
    }

    /* renamed from: e */
    public void mo19351e(@C0359n0 C9515j jVar) {
        this.f26005b.execute(new C9520d(jVar));
    }

    /* renamed from: f */
    public void mo19352f(@C0359n0 C9515j jVar) {
        this.f26005b.execute(new C9519c(jVar));
    }

    /* renamed from: g */
    public void mo19353g(@C0351j1 int i) {
        this.f26005b.execute(new C9521e(i));
    }

    /* renamed from: h */
    public void mo19354h(@C0359n0 String str) {
        this.f26005b.execute(new C9518b(str));
    }

    @C0348i1
    /* renamed from: i */
    public final C9515j mo19355i(@C0359n0 String str) {
        for (C9515j next : C9515j.m35674d(this.f26006c, C36080x.C36097q.ua_default_channels)) {
            if (str.equals(next.mo19332h())) {
                this.f26004a.mo19363s(next);
                return next;
            }
        }
        return null;
    }

    @C0359n0
    /* renamed from: j */
    public C36062p<C9515j> mo19356j(@C0359n0 String str) {
        C36062p<C9515j> pVar = new C36062p<>();
        this.f26005b.execute(new C9517a(str, pVar));
        return pVar;
    }

    @C0348i1
    @C0363p0
    /* renamed from: k */
    public C9515j mo19357k(@C0359n0 String str) {
        try {
            return mo19356j(str).get();
        } catch (InterruptedException e) {
            C36059m.m148411g(e, "Failed to get notification channel.", new Object[0]);
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e2) {
            C36059m.m148411g(e2, "Failed to get notification channel.", new Object[0]);
            return null;
        }
    }

    @C0344h1
    public C9516k(@C0359n0 Context context, @C0359n0 C9522l lVar, @C0359n0 Executor executor) {
        this.f26006c = context;
        this.f26004a = lVar;
        this.f26005b = executor;
        this.f26007d = (NotificationManager) context.getSystemService(C33202j0.f80718b);
    }
}
