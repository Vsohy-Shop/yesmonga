package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0368r0;
import androidx.annotation.C0373u;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0696c;
import androidx.autofill.C0861a;
import androidx.core.app.C17075f2;
import androidx.core.app.C17180n4;
import androidx.core.content.res.C17465i;
import androidx.core.p027os.C17772a;
import androidx.core.p027os.C17792h;
import androidx.core.util.C17992m;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.google.firebase.messaging.C33202j0;
import com.urbanairship.analytics.C35517a;
import com.urbanairship.push.C9489i;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.content.d */
public class C17318d {

    /* renamed from: a */
    public static final String f45584a = "ContextCompat";

    /* renamed from: b */
    public static final Object f45585b = new Object();

    /* renamed from: c */
    public static final Object f45586c = new Object();

    /* renamed from: d */
    public static TypedValue f45587d = null;

    /* renamed from: e */
    public static final String f45588e = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";

    /* renamed from: f */
    public static final int f45589f = 1;

    /* renamed from: g */
    public static final int f45590g = 2;

    /* renamed from: h */
    public static final int f45591h = 4;

    @C0376v0(16)
    /* renamed from: androidx.core.content.d$a */
    public static class C17319a {
        @C0373u
        /* renamed from: a */
        public static void m79742a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @C0373u
        /* renamed from: b */
        public static void m79743b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.core.content.d$b */
    public static class C17320b {
        @C0373u
        /* renamed from: a */
        public static File[] m79744a(Context context) {
            return context.getExternalCacheDirs();
        }

        @C0373u
        /* renamed from: b */
        public static File[] m79745b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @C0373u
        /* renamed from: c */
        public static File[] m79746c(Context context) {
            return context.getObbDirs();
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.content.d$c */
    public static class C17321c {
        @C0373u
        /* renamed from: a */
        public static File m79747a(Context context) {
            return context.getCodeCacheDir();
        }

        @C0373u
        /* renamed from: b */
        public static Drawable m79748b(Context context, int i) {
            return context.getDrawable(i);
        }

        @C0373u
        /* renamed from: c */
        public static File m79749c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.content.d$d */
    public static class C17322d {
        @C0373u
        /* renamed from: a */
        public static int m79750a(Context context, int i) {
            return context.getColor(i);
        }

        @C0373u
        /* renamed from: b */
        public static <T> T m79751b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        @C0373u
        /* renamed from: c */
        public static String m79752c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.content.d$e */
    public static class C17323e {
        @C0373u
        /* renamed from: a */
        public static Context m79753a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @C0373u
        /* renamed from: b */
        public static File m79754b(Context context) {
            return context.getDataDir();
        }

        @C0373u
        /* renamed from: c */
        public static boolean m79755c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.core.content.d$f */
    public static class C17324f {
        @C0373u
        /* renamed from: a */
        public static Intent m79756a(Context context, @C0363p0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, C17318d.m79735r(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }

        @C0373u
        /* renamed from: b */
        public static ComponentName m79757b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.content.d$g */
    public static class C17325g {
        @C0373u
        /* renamed from: a */
        public static Executor m79758a(Context context) {
            return context.getMainExecutor();
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.content.d$h */
    public static class C17326h {
        @C0373u
        /* renamed from: a */
        public static String m79759a(Context context) {
            return context.getAttributionTag();
        }
    }

    @C0376v0(33)
    /* renamed from: androidx.core.content.d$i */
    public static class C17327i {
        @C0373u
        /* renamed from: a */
        public static Intent m79760a(Context context, @C0363p0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    /* renamed from: androidx.core.content.d$j */
    public static final class C17328j {

        /* renamed from: a */
        public static final HashMap<Class<?>, String> f45592a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f45592a = hashMap;
            hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
            hashMap.put(UsageStatsManager.class, "usagestats");
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, C38212b.f96784D);
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, C35517a.f87583g);
            hashMap.put(ActivityManager.class, C0696c.f2306r);
            hashMap.put(AlarmManager.class, C17075f2.f45116w0);
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, C33202j0.f80718b);
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, C0861a.f2705e);
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.d$k */
    public @interface C17329k {
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: a */
    public static int m79718a(@C0359n0 Context context, @C0359n0 String str) {
        C17992m.m81744e(str, "permission must be non-null");
        if (C17772a.m81155k() || !TextUtils.equals(C9489i.f25911h, str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        if (C17180n4.m79433p(context).mo51601a()) {
            return 0;
        }
        return -1;
    }

    @C0363p0
    /* renamed from: b */
    public static Context m79719b(@C0359n0 Context context) {
        return C17323e.m79753a(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return r3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File m79720c(java.io.File r3) {
        /*
            java.lang.Object r0 = f45586c
            monitor-enter(r0)
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r3.mkdirs()     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0011:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "Unable to create files subdir "
            r1.append(r2)     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = r3.getPath()     // Catch:{ all -> 0x0024 }
            r1.append(r2)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0024:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.C17318d.m79720c(java.io.File):java.io.File");
    }

    @C0363p0
    /* renamed from: d */
    public static String m79721d(@C0359n0 Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C17326h.m79759a(context);
        }
        return null;
    }

    @C0359n0
    /* renamed from: e */
    public static File m79722e(@C0359n0 Context context) {
        return C17321c.m79747a(context);
    }

    @C0354l
    /* renamed from: f */
    public static int m79723f(@C0359n0 Context context, @C0358n int i) {
        return C17322d.m79750a(context, i);
    }

    @C0363p0
    /* renamed from: g */
    public static ColorStateList m79724g(@C0359n0 Context context, @C0358n int i) {
        return C17465i.m80174f(context.getResources(), i, context.getTheme());
    }

    @C0363p0
    /* renamed from: h */
    public static File m79725h(@C0359n0 Context context) {
        return C17323e.m79754b(context);
    }

    @C0363p0
    /* renamed from: i */
    public static Drawable m79726i(@C0359n0 Context context, @C0375v int i) {
        return C17321c.m79748b(context, i);
    }

    @C0359n0
    /* renamed from: j */
    public static File[] m79727j(@C0359n0 Context context) {
        return C17320b.m79744a(context);
    }

    @C0359n0
    /* renamed from: k */
    public static File[] m79728k(@C0359n0 Context context, @C0363p0 String str) {
        return C17320b.m79745b(context, str);
    }

    @C0359n0
    /* renamed from: l */
    public static Executor m79729l(@C0359n0 Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17325g.m79758a(context);
        }
        return C17792h.m81182a(new Handler(context.getMainLooper()));
    }

    @C0363p0
    /* renamed from: m */
    public static File m79730m(@C0359n0 Context context) {
        return C17321c.m79749c(context);
    }

    @C0359n0
    /* renamed from: n */
    public static File[] m79731n(@C0359n0 Context context) {
        return C17320b.m79746c(context);
    }

    @C0363p0
    /* renamed from: o */
    public static <T> T m79732o(@C0359n0 Context context, @C0359n0 Class<T> cls) {
        return C17322d.m79751b(context, cls);
    }

    @C0363p0
    /* renamed from: p */
    public static String m79733p(@C0359n0 Context context, @C0359n0 Class<?> cls) {
        return C17322d.m79752c(context, cls);
    }

    /* renamed from: q */
    public static boolean m79734q(@C0359n0 Context context) {
        return C17323e.m79755c(context);
    }

    /* renamed from: r */
    public static String m79735r(Context context) {
        String str = context.getPackageName() + f45588e;
        if (C17490t0.m80263d(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    @C0363p0
    /* renamed from: s */
    public static Intent m79736s(@C0359n0 Context context, @C0363p0 BroadcastReceiver broadcastReceiver, @C0359n0 IntentFilter intentFilter, int i) {
        return m79737t(context, broadcastReceiver, intentFilter, (String) null, (Handler) null, i);
    }

    @C0363p0
    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: t */
    public static Intent m79737t(@C0359n0 Context context, @C0363p0 BroadcastReceiver broadcastReceiver, @C0359n0 IntentFilter intentFilter, @C0363p0 String str, @C0363p0 Handler handler, int i) {
        int i2 = i & 1;
        if (i2 == 0 || (i & 4) == 0) {
            if (i2 != 0) {
                i |= 2;
            }
            int i3 = i;
            int i4 = i3 & 2;
            if (i4 == 0 && (i3 & 4) == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            } else if (i4 != 0 && (i3 & 4) != 0) {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            } else if (C17772a.m81155k()) {
                return C17327i.m79760a(context, broadcastReceiver, intentFilter, str, handler, i3);
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    return C17324f.m79756a(context, broadcastReceiver, intentFilter, str, handler, i3);
                }
                if ((i3 & 4) == 0 || str != null) {
                    return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
                }
                return context.registerReceiver(broadcastReceiver, intentFilter, m79735r(context), handler);
            }
        } else {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
    }

    /* renamed from: u */
    public static boolean m79738u(@C0359n0 Context context, @C0359n0 Intent[] intentArr) {
        return m79739v(context, intentArr, (Bundle) null);
    }

    /* renamed from: v */
    public static boolean m79739v(@C0359n0 Context context, @C0359n0 Intent[] intentArr, @C0363p0 Bundle bundle) {
        C17319a.m79742a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: w */
    public static void m79740w(@C0359n0 Context context, @C0359n0 Intent intent, @C0363p0 Bundle bundle) {
        C17319a.m79743b(context, intent, bundle);
    }

    /* renamed from: x */
    public static void m79741x(@C0359n0 Context context, @C0359n0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C17324f.m79757b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
