package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.browser.trusted.C0957i;
import androidx.browser.trusted.C0958j;
import androidx.compose.runtime.C8698y1;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.core.app.C17075f2;
import androidx.core.content.C17318d;
import com.google.android.gms.cloudmessaging.C40434a;
import com.google.firebase.messaging.C33180f;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.e */
public final class C33176e {

    /* renamed from: a */
    public static final String f80534a = "com.google.firebase.messaging.default_notification_color";

    /* renamed from: b */
    public static final String f80535b = "com.google.firebase.messaging.default_notification_icon";

    /* renamed from: c */
    public static final String f80536c = "com.google.firebase.messaging.default_notification_channel_id";

    /* renamed from: d */
    public static final String f80537d = "fcm_fallback_notification_channel";

    /* renamed from: e */
    public static final String f80538e = "fcm_fallback_notification_channel_label";

    /* renamed from: f */
    public static final String f80539f = "Misc";

    /* renamed from: g */
    public static final String f80540g = "com.google.firebase.MESSAGING_EVENT";

    /* renamed from: h */
    public static final int f80541h = 0;

    /* renamed from: i */
    public static final AtomicInteger f80542i = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.e$a */
    public static class C33177a {

        /* renamed from: a */
        public final C17075f2.C17092g f80543a;

        /* renamed from: b */
        public final String f80544b;

        /* renamed from: c */
        public final int f80545c;

        public C33177a(C17075f2.C17092g gVar, String str, int i) {
            this.f80543a = gVar;
            this.f80544b = str;
            this.f80545c = i;
        }
    }

    @C0363p0
    /* renamed from: a */
    public static PendingIntent m133817a(Context context, C33209l0 l0Var, String str, PackageManager packageManager) {
        Intent f = m133822f(str, l0Var, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(C8698y1.f23302n);
        f.putExtras(l0Var.mo96112A());
        if (m133833q(l0Var)) {
            f.putExtra(C33180f.C33183c.f80579E, l0Var.mo96133z());
        }
        return PendingIntent.getActivity(context, m133823g(), f, m133828l(1073741824));
    }

    @C0363p0
    /* renamed from: b */
    public static PendingIntent m133818b(Context context, Context context2, C33209l0 l0Var) {
        if (!m133833q(l0Var)) {
            return null;
        }
        return m133819c(context, context2, new Intent(C40434a.C40435a.f103053b).putExtras(l0Var.mo96133z()));
    }

    /* renamed from: c */
    public static PendingIntent m133819c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m133823g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m133828l(1073741824));
    }

    /* renamed from: d */
    public static C33177a m133820d(Context context, Context context2, C33209l0 l0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        C17075f2.C17092g gVar = new C17075f2.C17092g(context2, str);
        String n = l0Var.mo96125n(resources, packageName, C33180f.C33183c.f80588g);
        if (!TextUtils.isEmpty(n)) {
            gVar.mo51364P(n);
        }
        String n2 = l0Var.mo96125n(resources, packageName, C33180f.C33183c.f80589h);
        if (!TextUtils.isEmpty(n2)) {
            gVar.mo51363O(n2);
            gVar.mo51425z0(new C17075f2.C17087e().mo51319A(n2));
        }
        gVar.mo51414t0(m133829m(packageManager, resources, packageName, l0Var.mo96127p(C33180f.C33183c.f80590i), bundle));
        Uri n3 = m133830n(packageName, l0Var, resources);
        if (n3 != null) {
            gVar.mo51421x0(n3);
        }
        gVar.mo51362N(m133817a(context, l0Var, packageName, packageManager));
        PendingIntent b = m133818b(context, context2, l0Var);
        if (b != null) {
            gVar.mo51369U(b);
        }
        Integer h = m133824h(context2, l0Var.mo96127p(C33180f.C33183c.f80593l), bundle);
        if (h != null) {
            gVar.mo51358J(h.intValue());
        }
        gVar.mo51346D(!l0Var.mo96113a(C33180f.C33183c.f80596o));
        gVar.mo51384e0(l0Var.mo96113a(C33180f.C33183c.f80595n));
        String p = l0Var.mo96127p(C33180f.C33183c.f80594m);
        if (p != null) {
            gVar.mo51343B0(p);
        }
        Integer m = l0Var.mo96124m();
        if (m != null) {
            gVar.mo51396k0(m.intValue());
        }
        Integer r = l0Var.mo96129r();
        if (r != null) {
            gVar.mo51353G0(r.intValue());
        }
        Integer l = l0Var.mo96123l();
        if (l != null) {
            gVar.mo51390h0(l.intValue());
        }
        Long j = l0Var.mo96121j(C33180f.C33183c.f80605x);
        if (j != null) {
            gVar.mo51410r0(true);
            gVar.mo51355H0(j.longValue());
        }
        long[] q = l0Var.mo96128q();
        if (q != null) {
            gVar.mo51351F0(q);
        }
        int[] e = l0Var.mo96116e();
        if (e != null) {
            gVar.mo51382d0(e[0], e[1], e[2]);
        }
        gVar.mo51368T(m133825i(l0Var));
        return new C33177a(gVar, m133831o(l0Var), 0);
    }

    /* renamed from: e */
    public static C33177a m133821e(Context context, C33209l0 l0Var) {
        Bundle j = m133826j(context.getPackageManager(), context.getPackageName());
        return m133820d(context, context, l0Var, m133827k(context, l0Var.mo96122k(), j), j);
    }

    /* renamed from: f */
    public static Intent m133822f(String str, C33209l0 l0Var, PackageManager packageManager) {
        String p = l0Var.mo96127p(C33180f.C33183c.f80575A);
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f = l0Var.mo96117f();
        if (f == null) {
            return packageManager.getLaunchIntentForPackage(str);
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setPackage(str);
        intent2.setData(f);
        return intent2;
    }

    /* renamed from: g */
    public static int m133823g() {
        return f80542i.incrementAndGet();
    }

    /* renamed from: h */
    public static Integer m133824h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
            }
        }
        int i = bundle.getInt(f80534a, 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(C17318d.m79723f(context, i));
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: i */
    public static int m133825i(C33209l0 l0Var) {
        boolean a = l0Var.mo96113a(C33180f.C33183c.f80598q);
        if (l0Var.mo96113a(C33180f.C33183c.f80599r)) {
            a |= true;
        }
        return l0Var.mo96113a(C33180f.C33183c.f80600s) ? a | true ? 1 : 0 : a ? 1 : 0;
    }

    /* renamed from: j */
    public static Bundle m133826j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Couldn't get own application info: ");
            sb.append(e);
        }
        return Bundle.EMPTY;
    }

    @C0344h1
    @TargetApi(26)
    /* renamed from: k */
    public static String m133827k(Context context, String str, Bundle bundle) {
        String str2;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString(f80536c);
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            if (notificationManager.getNotificationChannel(f80537d) == null) {
                int identifier = context.getResources().getIdentifier(f80538e, C16717v.C16719b.f42182e, context.getPackageName());
                if (identifier == 0) {
                    str2 = f80539f;
                } else {
                    str2 = context.getString(identifier);
                }
                C0958j.m4306a();
                notificationManager.createNotificationChannel(C0957i.m4305a(f80537d, str2, 3));
            }
            return f80537d;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static int m133828l(int i) {
        return i | C8698y1.f23302n;
    }

    /* renamed from: m */
    public static int m133829m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m133832p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m133832p(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
        }
        int i = bundle.getInt(f80535b, 0);
        if (i == 0 || !m133832p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't get own application info: ");
                sb2.append(e);
            }
        }
        if (i == 0 || !m133832p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    public static Uri m133830n(String str, C33209l0 l0Var, Resources resources) {
        String o = l0Var.mo96126o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o);
    }

    /* renamed from: o */
    public static String m133831o(C33209l0 l0Var) {
        String p = l0Var.mo96127p(C33180f.C33183c.f80592k);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    /* renamed from: p */
    public static boolean m133832p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!C33173d.m133815a(resources.getDrawable(i, (Resources.Theme) null))) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m133833q(@C0359n0 C33209l0 l0Var) {
        return l0Var.mo96113a(C33180f.C33181a.f80565b);
    }
}
