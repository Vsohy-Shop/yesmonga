package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.datatransport.C40041c;
import com.google.android.datatransport.C40083d;
import com.google.android.datatransport.C40087h;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.C33033f;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.installations.C33084j;
import com.google.firebase.installations.C33124s;
import com.google.firebase.messaging.C33180f;
import com.google.firebase.messaging.reporting.C33227a;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.maps.android.data.kml.C33866p;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.firebase.messaging.j0 */
public class C33202j0 {

    /* renamed from: a */
    public static final String f80717a = "Firebase";

    /* renamed from: b */
    public static final String f80718b = "notification";

    /* renamed from: c */
    public static final String f80719c = "com.google.firebase.messaging";

    /* renamed from: d */
    public static final String f80720d = "export_to_big_query";

    /* renamed from: e */
    public static final String f80721e = "delivery_metrics_exported_to_big_query_enabled";

    @C0344h1
    /* renamed from: A */
    public static void m133912A(String str, Bundle bundle) {
        try {
            C33033f.m133333p();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d = m133921d(bundle);
            if (d != null) {
                bundle2.putString(C33180f.C33186f.f80645r, d);
            }
            String e = m133922e(bundle);
            if (e != null) {
                bundle2.putString(C33180f.C33186f.f80634g, e);
            }
            String i = m133926i(bundle);
            if (!TextUtils.isEmpty(i)) {
                bundle2.putString("label", i);
            }
            String g = m133924g(bundle);
            if (!TextUtils.isEmpty(g)) {
                bundle2.putString(C33180f.C33186f.f80637j, g);
            }
            String r = m133935r(bundle);
            if (r != null) {
                bundle2.putString(C33180f.C33186f.f80632e, r);
            }
            String l = m133929l(bundle);
            if (l != null) {
                try {
                    bundle2.putInt(C33180f.C33186f.f80635h, Integer.parseInt(l));
                } catch (NumberFormatException unused) {
                }
            }
            String t = m133937t(bundle);
            if (t != null) {
                try {
                    bundle2.putInt(C33180f.C33186f.f80636i, Integer.parseInt(t));
                } catch (NumberFormatException unused2) {
                }
            }
            String n = m133931n(bundle);
            if (C33180f.C33186f.f80640m.equals(str) || C33180f.C33186f.f80643p.equals(str)) {
                bundle2.putString(C33180f.C33186f.f80638k, n);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Logging to scion event=");
                sb.append(str);
                sb.append(" scionPayload=");
                sb.append(bundle2);
            }
            C32537a aVar = (C32537a) C33033f.m133333p().mo95720l(C32537a.class);
            if (aVar != null) {
                aVar.mo94646b("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    /* renamed from: B */
    public static void m133913B(boolean z) {
        C33033f.m133333p().mo95721n().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean(f80720d, z).apply();
    }

    /* renamed from: C */
    public static void m133914C(Bundle bundle) {
        C32537a aVar;
        if (bundle != null && "1".equals(bundle.getString(C33180f.C33181a.f80570g)) && (aVar = (C32537a) C33033f.m133333p().mo95720l(C32537a.class)) != null) {
            String string = bundle.getString(C33180f.C33181a.f80566c);
            aVar.mo94647c("fcm", C33180f.C33186f.f80644q, string);
            Bundle bundle2 = new Bundle();
            bundle2.putString("source", f80717a);
            bundle2.putString("medium", f80718b);
            bundle2.putString("campaign", string);
            aVar.mo94646b("fcm", C33180f.C33186f.f80639l, bundle2);
        }
    }

    /* renamed from: D */
    public static boolean m133915D(Intent intent) {
        if (intent == null || m133938u(intent)) {
            return false;
        }
        return m133918a();
    }

    /* renamed from: E */
    public static boolean m133916E(Intent intent) {
        if (intent == null || m133938u(intent)) {
            return false;
        }
        return m133917F(intent.getExtras());
    }

    /* renamed from: F */
    public static boolean m133917F(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(C33180f.C33181a.f80565b));
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m133918a() {
        /*
            java.lang.String r0 = "delivery_metrics_exported_to_big_query_enabled"
            r1 = 0
            com.google.firebase.C33033f.m133333p()     // Catch:{ IllegalStateException -> 0x0044 }
            com.google.firebase.f r2 = com.google.firebase.C33033f.m133333p()
            android.content.Context r2 = r2.mo95721n()
            java.lang.String r3 = "com.google.firebase.messaging"
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r1)
            java.lang.String r4 = "export_to_big_query"
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L_0x0021
            boolean r0 = r3.getBoolean(r4, r1)
            return r0
        L_0x0021:
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{  }
            if (r3 == 0) goto L_0x0044
            java.lang.String r2 = r2.getPackageName()     // Catch:{  }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{  }
            if (r2 == 0) goto L_0x0044
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            if (r3 == 0) goto L_0x0044
            boolean r3 = r3.containsKey(r0)     // Catch:{  }
            if (r3 == 0) goto L_0x0044
            android.os.Bundle r2 = r2.metaData     // Catch:{  }
            boolean r0 = r2.getBoolean(r0, r1)     // Catch:{  }
            return r0
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C33202j0.m133918a():boolean");
    }

    /* renamed from: b */
    public static MessagingClientEvent m133919b(MessagingClientEvent.C33225Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        MessagingClientEvent.C33226a j = MessagingClientEvent.m134037q().mo96186p(m133936s(extras)).mo96177g(event).mo96178h(m133923f(extras)).mo96181k(m133932o()).mo96184n(MessagingClientEvent.SDKPlatform.ANDROID).mo96180j(m133930m(extras));
        String h = m133925h(extras);
        if (h != null) {
            j.mo96179i(h);
        }
        String r = m133935r(extras);
        if (r != null) {
            j.mo96185o(r);
        }
        String c = m133920c(extras);
        if (c != null) {
            j.mo96175e(c);
        }
        String i = m133926i(extras);
        if (i != null) {
            j.mo96172b(i);
        }
        String e = m133922e(extras);
        if (e != null) {
            j.mo96176f(e);
        }
        long q = m133934q(extras);
        if (q > 0) {
            j.mo96183m(q);
        }
        return j.mo96171a();
    }

    @C0363p0
    /* renamed from: c */
    public static String m133920c(Bundle bundle) {
        return bundle.getString(C33180f.C33184d.f80612e);
    }

    @C0363p0
    /* renamed from: d */
    public static String m133921d(Bundle bundle) {
        return bundle.getString(C33180f.C33181a.f80566c);
    }

    @C0363p0
    /* renamed from: e */
    public static String m133922e(Bundle bundle) {
        return bundle.getString(C33180f.C33181a.f80567d);
    }

    @C0359n0
    /* renamed from: f */
    public static String m133923f(Bundle bundle) {
        String string = bundle.getString(C33180f.C33184d.f80614g);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) C31053n.m124519a(C33084j.m133441v(C33033f.m133333p()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @C0363p0
    /* renamed from: g */
    public static String m133924g(Bundle bundle) {
        return bundle.getString(C33180f.C33181a.f80573j);
    }

    @C0363p0
    /* renamed from: h */
    public static String m133925h(Bundle bundle) {
        String string = bundle.getString(C33180f.C33184d.f80615h);
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    @C0363p0
    /* renamed from: i */
    public static String m133926i(Bundle bundle) {
        return bundle.getString(C33180f.C33181a.f80572i);
    }

    @C0359n0
    /* renamed from: j */
    public static int m133927j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if (C33866p.f82157i.equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: k */
    public static int m133928k(Bundle bundle) {
        int p = m133933p(bundle);
        if (p == 2) {
            return 5;
        }
        return p == 1 ? 10 : 0;
    }

    @C0363p0
    /* renamed from: l */
    public static String m133929l(Bundle bundle) {
        return bundle.getString(C33180f.C33181a.f80568e);
    }

    @C0359n0
    /* renamed from: m */
    public static MessagingClientEvent.MessageType m133930m(Bundle bundle) {
        if (bundle == null || !C33209l0.m133960v(bundle)) {
            return MessagingClientEvent.MessageType.DATA_MESSAGE;
        }
        return MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
    }

    @C0359n0
    /* renamed from: n */
    public static String m133931n(Bundle bundle) {
        return (bundle == null || !C33209l0.m133960v(bundle)) ? "data" : "display";
    }

    @C0359n0
    /* renamed from: o */
    public static String m133932o() {
        return C33033f.m133333p().mo95721n().getPackageName();
    }

    @C0359n0
    /* renamed from: p */
    public static int m133933p(Bundle bundle) {
        String string = bundle.getString(C33180f.C33184d.f80619l);
        if (string == null) {
            if ("1".equals(bundle.getString(C33180f.C33184d.f80621n))) {
                return 2;
            }
            string = bundle.getString(C33180f.C33184d.f80620m);
        }
        return m133927j(string);
    }

    @C0363p0
    /* renamed from: q */
    public static long m133934q(Bundle bundle) {
        if (bundle.containsKey(C33180f.C33184d.f80623p)) {
            try {
                return Long.parseLong(bundle.getString(C33180f.C33184d.f80623p));
            } catch (NumberFormatException unused) {
            }
        }
        C33033f p = C33033f.m133333p();
        String m = p.mo95723s().mo96251m();
        if (m != null) {
            try {
                return Long.parseLong(m);
            } catch (NumberFormatException unused2) {
            }
        }
        String j = p.mo95723s().mo96248j();
        if (!j.startsWith("1:")) {
            try {
                return Long.parseLong(j);
            } catch (NumberFormatException unused3) {
                return 0;
            }
        } else {
            String[] split = j.split(C33124s.f80355c);
            if (split.length < 2) {
                return 0;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0;
            }
            return Long.parseLong(str);
        }
    }

    @C0363p0
    /* renamed from: r */
    public static String m133935r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @C0359n0
    /* renamed from: s */
    public static int m133936s(Bundle bundle) {
        Object obj = bundle.get(C33180f.C33184d.f80616i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid TTL: ");
            sb.append(obj);
            return 0;
        }
    }

    @C0363p0
    /* renamed from: t */
    public static String m133937t(Bundle bundle) {
        if (bundle.containsKey(C33180f.C33181a.f80569f)) {
            return bundle.getString(C33180f.C33181a.f80569f);
        }
        return null;
    }

    /* renamed from: u */
    public static boolean m133938u(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* renamed from: v */
    public static void m133939v(Intent intent) {
        m133912A(C33180f.C33186f.f80642o, intent.getExtras());
    }

    /* renamed from: w */
    public static void m133940w(Intent intent) {
        m133912A(C33180f.C33186f.f80643p, intent.getExtras());
    }

    /* renamed from: x */
    public static void m133941x(Bundle bundle) {
        m133914C(bundle);
        m133912A(C33180f.C33186f.f80641n, bundle);
    }

    /* renamed from: y */
    public static void m133942y(Intent intent) {
        if (m133916E(intent)) {
            m133912A(C33180f.C33186f.f80640m, intent.getExtras());
        }
        if (m133915D(intent)) {
            m133943z(MessagingClientEvent.C33225Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.m133655A());
        }
    }

    /* renamed from: z */
    public static void m133943z(MessagingClientEvent.C33225Event event, Intent intent, @C0363p0 C40087h hVar) {
        MessagingClientEvent b;
        if (hVar != null && (b = m133919b(event, intent)) != null) {
            try {
                hVar.mo132669b(C33180f.C33182b.f80574a, C33227a.class, C40041c.m163048b("proto"), new C33198i0()).mo132667b(C40083d.m163240e(C33227a.m134070d().mo96192b(b).mo96191a()));
            } catch (RuntimeException unused) {
            }
        }
    }
}
