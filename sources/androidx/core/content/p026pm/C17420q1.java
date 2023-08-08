package androidx.core.content.p026pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0696c;
import androidx.core.content.p026pm.C17428s0;
import androidx.core.content.p026pm.C17432t0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.C18001r;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: androidx.core.content.pm.q1 */
public class C17420q1 {

    /* renamed from: a */
    public static final int f45653a = 1;

    /* renamed from: b */
    public static final int f45654b = 2;

    /* renamed from: c */
    public static final int f45655c = 4;

    /* renamed from: d */
    public static final int f45656d = 8;
    @C0344h1

    /* renamed from: e */
    public static final String f45657e = "com.android.launcher.action.INSTALL_SHORTCUT";
    @C0344h1

    /* renamed from: f */
    public static final String f45658f = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* renamed from: g */
    public static final int f45659g = 96;

    /* renamed from: h */
    public static final int f45660h = 48;

    /* renamed from: i */
    public static final String f45661i = "android.intent.extra.shortcut.ID";

    /* renamed from: j */
    public static volatile C17432t0<?> f45662j = null;

    /* renamed from: k */
    public static volatile List<C17388g> f45663k = null;

    /* renamed from: l */
    public static final String f45664l = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* renamed from: m */
    public static final String f45665m = "androidx.core.content.pm.shortcut_listener_impl";

    /* renamed from: androidx.core.content.pm.q1$a */
    public class C17421a extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ IntentSender f45666a;

        public C17421a(IntentSender intentSender) {
            this.f45666a = intentSender;
        }

        public void onReceive(Context context, Intent intent) {
            try {
                this.f45666a.sendIntent(context, 0, (Intent) null, (IntentSender.OnFinished) null, (Handler) null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    @C0376v0(25)
    /* renamed from: androidx.core.content.pm.q1$b */
    public static class C17422b {
        /* renamed from: a */
        public static String m79997a(@C0359n0 List<ShortcutInfo> list) {
            int i = -1;
            String str = null;
            for (ShortcutInfo a : list) {
                ShortcutInfo a2 = C17424r.m79998a(a);
                if (a2.getRank() > i) {
                    String a3 = a2.getId();
                    str = a3;
                    i = a2.getRank();
                }
            }
            return str;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.pm.q1$c */
    public @interface C17423c {
    }

    @C0344h1
    /* renamed from: A */
    public static void m79968A(List<C17388g> list) {
        f45663k = list;
    }

    @C0344h1
    /* renamed from: B */
    public static void m79969B(C17432t0<Void> t0Var) {
        f45662j = t0Var;
    }

    /* renamed from: C */
    public static boolean m79970C(@C0359n0 Context context, @C0359n0 List<C17428s0> list) {
        List<C17428s0> w = m79993w(list, 1);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            m79973c(context, w);
        }
        if (i >= 25) {
            ArrayList arrayList = new ArrayList();
            for (C17428s0 H : w) {
                arrayList.add(H.mo51815H());
            }
            if (!C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
                return false;
            }
        }
        m79985o(context).mo51860a(w);
        for (C17388g d : m79984n(context)) {
            d.mo51805d(list);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m79971a(@C0359n0 Context context, @C0359n0 List<C17428s0> list) {
        List<C17428s0> w = m79993w(list, 1);
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            m79973c(context, w);
        }
        if (i >= 25) {
            ArrayList arrayList = new ArrayList();
            for (C17428s0 H : w) {
                arrayList.add(H.mo51815H());
            }
            if (!C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        m79985o(context).mo51860a(w);
        for (C17388g b : m79984n(context)) {
            b.mo51803b(list);
        }
        return true;
    }

    @C0344h1
    /* renamed from: b */
    public static boolean m79972b(@C0359n0 Context context, @C0359n0 C17428s0 s0Var) {
        Bitmap decodeStream;
        IconCompat iconCompat;
        IconCompat iconCompat2 = s0Var.f45689i;
        if (iconCompat2 == null) {
            return false;
        }
        int i = iconCompat2.f45891a;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream E = iconCompat2.mo51932E(context);
        if (E == null || (decodeStream = BitmapFactory.decodeStream(E)) == null) {
            return false;
        }
        if (i == 6) {
            iconCompat = IconCompat.m80393o(decodeStream);
        } else {
            iconCompat = IconCompat.m80396r(decodeStream);
        }
        s0Var.f45689i = iconCompat;
        return true;
    }

    @C0344h1
    /* renamed from: c */
    public static void m79973c(@C0359n0 Context context, @C0359n0 List<C17428s0> list) {
        for (C17428s0 s0Var : new ArrayList(list)) {
            if (!m79972b(context, s0Var)) {
                list.remove(s0Var);
            }
        }
    }

    @C0359n0
    /* renamed from: d */
    public static Intent m79974d(@C0359n0 Context context, @C0359n0 C17428s0 s0Var) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 26) {
            intent = C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(s0Var.mo51815H());
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = new Intent();
        }
        return s0Var.mo51816a(intent);
    }

    /* renamed from: e */
    public static void m79975e(@C0359n0 Context context, @C0359n0 List<String> list, @C0363p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 25) {
            C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).disableShortcuts(list, charSequence);
        }
        m79985o(context).mo51863d(list);
        for (C17388g c : m79984n(context)) {
            c.mo51804c(list);
        }
    }

    /* renamed from: f */
    public static void m79976f(@C0359n0 Context context, @C0359n0 List<C17428s0> list) {
        List<C17428s0> w = m79993w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C17428s0 s0Var : w) {
                arrayList.add(s0Var.f45682b);
            }
            C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        }
        m79985o(context).mo51860a(w);
        for (C17388g b : m79984n(context)) {
            b.mo51803b(list);
        }
    }

    @C0359n0
    /* renamed from: g */
    public static List<C17428s0> m79977g(@C0359n0 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<Object> a = C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(a.size());
            for (Object a2 : a) {
                arrayList.add(new C17428s0.C17429a(context, C17424r.m79998a(a2)).mo51839c());
            }
            return arrayList;
        }
        try {
            return m79985o(context).mo51861b();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* renamed from: h */
    public static int m79978h(@C0359n0 Context context, boolean z) {
        boolean z2;
        int i;
        float f;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C0696c.f2306r);
        if (activityManager == null || activityManager.isLowRamDevice()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i = 48;
        } else {
            i = 96;
        }
        int max = Math.max(1, i);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            f = displayMetrics.xdpi;
        } else {
            f = displayMetrics.ydpi;
        }
        return (int) (((float) max) * (f / 160.0f));
    }

    /* renamed from: i */
    public static int m79979i(@C0359n0 Context context) {
        C18001r.m81775l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).getIconMaxHeight();
        }
        return m79978h(context, false);
    }

    /* renamed from: j */
    public static int m79980j(@C0359n0 Context context) {
        C18001r.m81775l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).getIconMaxWidth();
        }
        return m79978h(context, true);
    }

    /* renamed from: k */
    public static int m79981k(@C0359n0 Context context) {
        C18001r.m81775l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    @C0344h1
    /* renamed from: l */
    public static List<C17388g> m79982l() {
        return f45663k;
    }

    /* renamed from: m */
    public static String m79983m(@C0359n0 List<C17428s0> list) {
        int i = -1;
        String str = null;
        for (C17428s0 next : list) {
            if (next.mo51832v() > i) {
                String k = next.mo51825k();
                str = k;
                i = next.mo51832v();
            }
        }
        return str;
    }

    /* renamed from: n */
    public static List<C17388g> m79984n(Context context) {
        Bundle bundle;
        String string;
        if (f45663k == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(f45664l);
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString(f45665m)) == null)) {
                    try {
                        arrayList.add((C17388g) Class.forName(string, false, C17420q1.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f45663k == null) {
                f45663k = arrayList;
            }
        }
        return f45663k;
    }

    /* renamed from: o */
    public static C17432t0<?> m79985o(Context context) {
        if (f45662j == null) {
            try {
                f45662j = (C17432t0) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C17420q1.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            } catch (Exception unused) {
            }
            if (f45662j == null) {
                f45662j = new C17432t0.C17433a();
            }
        }
        return f45662j;
    }

    @C0359n0
    /* renamed from: p */
    public static List<C17428s0> m79986p(@C0359n0 Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            return C17428s0.m80006c(context, C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).getShortcuts(i));
        }
        if (i2 >= 25) {
            ShortcutManager a = C17435u0.m80075a(context.getSystemService(ShortcutManager.class));
            ArrayList arrayList = new ArrayList();
            if ((i & 1) != 0) {
                arrayList.addAll(a.getManifestShortcuts());
            }
            if ((i & 2) != 0) {
                arrayList.addAll(a.getDynamicShortcuts());
            }
            if ((i & 4) != 0) {
                arrayList.addAll(a.getPinnedShortcuts());
            }
            return C17428s0.m80006c(context, arrayList);
        }
        if ((i & 2) != 0) {
            try {
                return m79985o(context).mo51861b();
            } catch (Exception unused) {
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: q */
    public static boolean m79987q(@C0359n0 Context context) {
        C18001r.m81775l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).isRateLimitingActive();
        }
        if (m79986p(context, 3).size() == m79981k(context)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m79988r(@androidx.annotation.C0359n0 android.content.Context r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0015
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r4 = r4.getSystemService(r0)
            android.content.pm.ShortcutManager r4 = androidx.core.content.p026pm.C17435u0.m80075a(r4)
            boolean r4 = r4.isRequestPinShortcutSupported()
            return r4
        L_0x0015:
            java.lang.String r0 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r1 = androidx.core.content.C17318d.m79718a(r4, r0)
            r2 = 0
            if (r1 == 0) goto L_0x001f
            return r2
        L_0x001f:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r1.<init>(r3)
            java.util.List r4 = r4.queryBroadcastReceivers(r1, r2)
            java.util.Iterator r4 = r4.iterator()
        L_0x0032:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0050
            java.lang.Object r1 = r4.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.permission
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x004e
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0032
        L_0x004e:
            r4 = 1
            return r4
        L_0x0050:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p026pm.C17420q1.m79988r(android.content.Context):boolean");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: s */
    public static boolean m79989s(@androidx.annotation.C0359n0 android.content.Context r6, @androidx.annotation.C0359n0 androidx.core.content.p026pm.C17428s0 r7) {
        /*
            androidx.core.util.C18001r.m81775l(r6)
            androidx.core.util.C18001r.m81775l(r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 1
            if (r0 > r1) goto L_0x0030
            boolean r1 = r7.mo51812E(r2)
            if (r1 == 0) goto L_0x0030
            java.util.List r6 = m79984n(r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x001b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r6.next()
            androidx.core.content.pm.g r0 = (androidx.core.content.p026pm.C17388g) r0
            java.util.List r1 = java.util.Collections.singletonList(r7)
            r0.mo51803b(r1)
            goto L_0x001b
        L_0x002f:
            return r2
        L_0x0030:
            int r1 = m79981k(r6)
            r3 = 0
            if (r1 != 0) goto L_0x0038
            return r3
        L_0x0038:
            r4 = 29
            if (r0 > r4) goto L_0x003f
            m79972b(r6, r7)
        L_0x003f:
            r4 = 30
            if (r0 < r4) goto L_0x0055
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r6.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = androidx.core.content.p026pm.C17435u0.m80075a(r0)
            android.content.pm.ShortcutInfo r4 = r7.mo51815H()
            r0.pushDynamicShortcut(r4)
            goto L_0x0092
        L_0x0055:
            r4 = 25
            if (r0 < r4) goto L_0x0092
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r6.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = androidx.core.content.p026pm.C17435u0.m80075a(r0)
            boolean r4 = r0.isRateLimitingActive()
            if (r4 == 0) goto L_0x006a
            return r3
        L_0x006a:
            java.util.List r4 = r0.getDynamicShortcuts()
            int r5 = r4.size()
            if (r5 < r1) goto L_0x0083
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r4 = androidx.core.content.p026pm.C17420q1.C17422b.m79997a(r4)
            r5[r3] = r4
            java.util.List r4 = java.util.Arrays.asList(r5)
            r0.removeDynamicShortcuts(r4)
        L_0x0083:
            android.content.pm.ShortcutInfo[] r4 = new android.content.pm.ShortcutInfo[r2]
            android.content.pm.ShortcutInfo r5 = r7.mo51815H()
            r4[r3] = r5
            java.util.List r4 = java.util.Arrays.asList(r4)
            boolean unused = r0.addDynamicShortcuts(r4)
        L_0x0092:
            androidx.core.content.pm.t0 r0 = m79985o(r6)
            java.util.List r4 = r0.mo51861b()     // Catch:{ Exception -> 0x0103, all -> 0x00de }
            int r5 = r4.size()     // Catch:{ Exception -> 0x0103, all -> 0x00de }
            if (r5 < r1) goto L_0x00af
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0103, all -> 0x00de }
            java.lang.String r4 = m79983m(r4)     // Catch:{ Exception -> 0x0103, all -> 0x00de }
            r1[r3] = r4     // Catch:{ Exception -> 0x0103, all -> 0x00de }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x0103, all -> 0x00de }
            r0.mo51863d(r1)     // Catch:{ Exception -> 0x0103, all -> 0x00de }
        L_0x00af:
            androidx.core.content.pm.s0[] r1 = new androidx.core.content.p026pm.C17428s0[r2]     // Catch:{ Exception -> 0x0103, all -> 0x00de }
            r1[r3] = r7     // Catch:{ Exception -> 0x0103, all -> 0x00de }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x0103, all -> 0x00de }
            r0.mo51860a(r1)     // Catch:{ Exception -> 0x0103, all -> 0x00de }
            java.util.List r0 = m79984n(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x00c2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d6
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.g r1 = (androidx.core.content.p026pm.C17388g) r1
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r1.mo51803b(r3)
            goto L_0x00c2
        L_0x00d6:
            java.lang.String r7 = r7.mo51825k()
            m79994x(r6, r7)
            return r2
        L_0x00de:
            r0 = move-exception
            java.util.List r1 = m79984n(r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x00e7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r2 = r1.next()
            androidx.core.content.pm.g r2 = (androidx.core.content.p026pm.C17388g) r2
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r2.mo51803b(r3)
            goto L_0x00e7
        L_0x00fb:
            java.lang.String r7 = r7.mo51825k()
            m79994x(r6, r7)
            throw r0
        L_0x0103:
            java.util.List r0 = m79984n(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x010b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011f
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.g r1 = (androidx.core.content.p026pm.C17388g) r1
            java.util.List r2 = java.util.Collections.singletonList(r7)
            r1.mo51803b(r2)
            goto L_0x010b
        L_0x011f:
            java.lang.String r7 = r7.mo51825k()
            m79994x(r6, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p026pm.C17420q1.m79989s(android.content.Context, androidx.core.content.pm.s0):boolean");
    }

    /* renamed from: t */
    public static void m79990t(@C0359n0 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        m79985o(context).mo51862c();
        for (C17388g a : m79984n(context)) {
            a.mo51802a();
        }
    }

    /* renamed from: u */
    public static void m79991u(@C0359n0 Context context, @C0359n0 List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        m79985o(context).mo51863d(list);
        for (C17388g c : m79984n(context)) {
            c.mo51804c(list);
        }
    }

    /* renamed from: v */
    public static void m79992v(@C0359n0 Context context, @C0359n0 List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            m79991u(context, list);
            return;
        }
        C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list);
        m79985o(context).mo51863d(list);
        for (C17388g c : m79984n(context)) {
            c.mo51804c(list);
        }
    }

    @C0359n0
    /* renamed from: w */
    public static List<C17428s0> m79993w(@C0359n0 List<C17428s0> list, int i) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 31) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (C17428s0 next : list) {
            if (next.mo51812E(i)) {
                arrayList.remove(next);
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    public static void m79994x(@C0359n0 Context context, @C0359n0 String str) {
        C18001r.m81775l(context);
        C18001r.m81775l(str);
        if (Build.VERSION.SDK_INT >= 25) {
            C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        }
        for (C17388g e : m79984n(context)) {
            e.mo51806e(Collections.singletonList(str));
        }
    }

    /* renamed from: y */
    public static boolean m79995y(@C0359n0 Context context, @C0359n0 C17428s0 s0Var, @C0363p0 IntentSender intentSender) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 31 && s0Var.mo51812E(1)) {
            return false;
        }
        if (i >= 26) {
            return C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).requestPinShortcut(s0Var.mo51815H(), intentSender);
        }
        if (!m79988r(context)) {
            return false;
        }
        Intent a = s0Var.mo51816a(new Intent(f45657e));
        if (intentSender == null) {
            context.sendBroadcast(a);
            return true;
        }
        context.sendOrderedBroadcast(a, (String) null, new C17421a(intentSender), (Handler) null, -1, (String) null, (Bundle) null);
        return true;
    }

    /* renamed from: z */
    public static boolean m79996z(@C0359n0 Context context, @C0359n0 List<C17428s0> list) {
        C18001r.m81775l(context);
        C18001r.m81775l(list);
        List<C17428s0> w = m79993w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(w.size());
            for (C17428s0 H : w) {
                arrayList.add(H.mo51815H());
            }
            if (!C17435u0.m80075a(context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        m79985o(context).mo51862c();
        m79985o(context).mo51860a(w);
        for (C17388g next : m79984n(context)) {
            next.mo51802a();
            next.mo51803b(list);
        }
        return true;
    }
}
