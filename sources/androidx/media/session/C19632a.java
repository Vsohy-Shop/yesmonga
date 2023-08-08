package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p002v4.media.MediaBrowserCompat;
import android.support.p002v4.media.session.MediaControllerCompat;
import android.support.p002v4.media.session.MediaSessionCompat;
import android.support.p002v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.media.C19566d;
import java.util.List;

/* renamed from: androidx.media.session.a */
public class C19632a extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f50259a = "MediaButtonReceiver";

    /* renamed from: androidx.media.session.a$a */
    public static class C19633a extends MediaBrowserCompat.C0033b {

        /* renamed from: c */
        public final Context f50260c;

        /* renamed from: d */
        public final Intent f50261d;

        /* renamed from: e */
        public final BroadcastReceiver.PendingResult f50262e;

        /* renamed from: f */
        public MediaBrowserCompat f50263f;

        public C19633a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f50260c = context;
            this.f50261d = intent;
            this.f50262e = pendingResult;
        }

        /* renamed from: a */
        public void mo93a() {
            try {
                new MediaControllerCompat(this.f50260c, this.f50263f.mo70h()).mo254d((KeyEvent) this.f50261d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException unused) {
            }
            mo58009e();
        }

        /* renamed from: b */
        public void mo94b() {
            mo58009e();
        }

        /* renamed from: c */
        public void mo95c() {
            mo58009e();
        }

        /* renamed from: e */
        public final void mo58009e() {
            this.f50263f.mo64b();
            this.f50262e.finish();
        }

        /* renamed from: f */
        public void mo58010f(MediaBrowserCompat mediaBrowserCompat) {
            this.f50263f = mediaBrowserCompat;
        }
    }

    /* renamed from: a */
    public static PendingIntent m91255a(Context context, long j) {
        ComponentName c = m91257c(context);
        if (c == null) {
            return null;
        }
        return m91256b(context, c, j);
    }

    /* renamed from: b */
    public static PendingIntent m91256b(Context context, ComponentName componentName, long j) {
        if (componentName == null) {
            return null;
        }
        int o = PlaybackStateCompat.m893o(j);
        if (o == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot build a media button pending intent with the given action: ");
            sb.append(j);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, o));
        return PendingIntent.getBroadcast(context, o, intent, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public static ComponentName m91257c(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        queryBroadcastReceivers.size();
        return null;
    }

    /* renamed from: d */
    public static ComponentName m91258d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    /* renamed from: e */
    public static KeyEvent m91259e(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.mo378e().mo254d(keyEvent);
        return keyEvent;
    }

    /* renamed from: f */
    public static void m91260f(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            ComponentName unused = context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignore unsupported intent: ");
            sb.append(intent);
            return;
        }
        ComponentName d = m91258d(context, "android.intent.action.MEDIA_BUTTON");
        if (d != null) {
            intent.setComponent(d);
            m91260f(context, intent);
            return;
        }
        ComponentName d2 = m91258d(context, C19566d.f50115w);
        if (d2 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C19633a aVar = new C19633a(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, d2, aVar, (Bundle) null);
            aVar.mo58010f(mediaBrowserCompat);
            mediaBrowserCompat.mo63a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}
