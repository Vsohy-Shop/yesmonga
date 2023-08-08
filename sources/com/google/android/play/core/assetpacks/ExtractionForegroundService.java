package com.google.android.play.core.assetpacks;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.Nullable;
import androidx.browser.trusted.C0957i;
import androidx.browser.trusted.C0958j;
import androidx.core.app.C17192o3;
import androidx.core.app.C17201p3;
import com.google.android.play.core.internal.C32062k;
import com.google.firebase.messaging.C33202j0;

public class ExtractionForegroundService extends Service {

    /* renamed from: a */
    public final C32062k f77789a = new C32062k("ExtractionForegroundService");

    /* renamed from: b */
    public Context f77790b;

    /* renamed from: c */
    public C31984s2 f77791c;

    /* renamed from: d */
    public NotificationManager f77792d;

    /* renamed from: a */
    public final synchronized void mo92468a(Intent intent) {
        Notification.Builder builder;
        String stringExtra = intent.getStringExtra("notification_title");
        String stringExtra2 = intent.getStringExtra("notification_subtext");
        long longExtra = intent.getLongExtra("notification_timeout", 600000);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("notification_on_click_intent");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            C17201p3.m79495a();
            builder = C17192o3.m79482a(this.f77790b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(longExtra);
        } else {
            builder = new Notification.Builder(this.f77790b).setPriority(-2);
        }
        if (pendingIntent != null) {
            builder.setContentIntent(pendingIntent);
        }
        Notification.Builder contentTitle = builder.setSmallIcon(17301633).setOngoing(false).setContentTitle(stringExtra == null ? "Downloading additional file" : stringExtra);
        if (stringExtra2 == null) {
            stringExtra = "Transferring";
        }
        contentTitle.setSubText(stringExtra);
        int intExtra = intent.getIntExtra("notification_color", 0);
        if (intExtra != 0) {
            builder.setColor(intExtra).setVisibility(-1);
        }
        Notification build = builder.build();
        this.f77789a.mo92778d("Starting foreground installation service.", new Object[0]);
        this.f77791c.mo92677l(true);
        if (i >= 26) {
            mo92470c(intent.getStringExtra("notification_channel_name"));
        }
        startForeground(-1883842196, build);
    }

    /* renamed from: b */
    public final synchronized void mo92469b() {
        this.f77789a.mo92778d("Stopping service.", new Object[0]);
        this.f77791c.mo92677l(false);
        stopForeground(true);
        stopSelf();
    }

    @TargetApi(26)
    /* renamed from: c */
    public final synchronized void mo92470c(@Nullable String str) {
        if (str == null) {
            str = "File downloads by Play";
        }
        C0958j.m4306a();
        this.f77792d.createNotificationChannel(C0957i.m4305a("playcore-assetpacks-service-notification-channel", str, 2));
    }

    @Nullable
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        C31987t1.m129675j(getApplicationContext()).mo92560b(this);
        this.f77792d = (NotificationManager) this.f77790b.getSystemService(C33202j0.f80718b);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        mo92468a(intent);
        int intExtra = intent.getIntExtra("action_type", 0);
        if (intExtra == 2) {
            mo92469b();
        } else {
            this.f77789a.mo92776b("Unknown action type received: %d", Integer.valueOf(intExtra));
        }
        return 2;
    }
}
