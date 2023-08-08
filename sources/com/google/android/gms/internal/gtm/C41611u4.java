package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.carrefour.fid.android.shared.util.C28951s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40990p;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.u4 */
public final class C41611u4 {
    /* renamed from: a */
    public static long m168465a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static C41630v m168466b(C41202d4 d4Var, String str) {
        String str2;
        C40843u.m166202l(d4Var);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "?".concat(valueOf);
            } else {
                str2 = new String("?");
            }
            Map<String, String> a = C40990p.m166661a(new URI(str2), "UTF-8");
            C41630v vVar = new C41630v();
            vVar.mo135943q(a.get(C28951s.f70972i));
            vVar.mo135949v(a.get(C28951s.f70970g));
            vVar.mo135950w(a.get(C28951s.f70971h));
            vVar.mo135951x(a.get(C28951s.f70969f));
            vVar.mo135948u(a.get("utm_term"));
            vVar.mo135946t(a.get("utm_id"));
            vVar.mo135942p(a.get("anid"));
            vVar.mo135945s(a.get("gclid"));
            vVar.mo135944r(a.get("dclid"));
            vVar.mo135941o(a.get(FirebaseAnalytics.C32532b.f78929Q));
            return vVar;
        } catch (URISyntaxException e) {
            d4Var.mo135763z("No valid campaign data found", e);
            return null;
        }
    }

    /* renamed from: c */
    public static String m168467c(boolean z) {
        return true != z ? "0" : "1";
    }

    /* renamed from: d */
    public static String m168468d(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(locale));
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static MessageDigest m168469e(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Map<String, String> m168470f(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        for (String split : str.split("&")) {
            String[] split2 = split.split("=", 3);
            int length = split2.length;
            String str3 = null;
            if (length > 1) {
                String str4 = split2[0];
                if (TextUtils.isEmpty(split2[1])) {
                    str2 = null;
                } else {
                    str2 = split2[1];
                }
                hashMap.put(str4, str2);
                if (length == 3 && !TextUtils.isEmpty(split2[1]) && !hashMap.containsKey(split2[1])) {
                    String str5 = split2[1];
                    if (!TextUtils.isEmpty(split2[2])) {
                        str3 = split2[2];
                    }
                    hashMap.put(str5, str3);
                }
            } else if (length == 1 && split2[0].length() != 0) {
                hashMap.put(split2[0], (Object) null);
            }
        }
        return hashMap;
    }

    /* renamed from: g */
    public static void m168471g(Map<String, String> map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    /* renamed from: h */
    public static void m168472h(Map<String, String> map, String str, Map<String, String> map2) {
        m168471g(map, str, map2.get(str));
    }

    /* renamed from: i */
    public static boolean m168473i(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo == null || !receiverInfo.enabled || (z && !receiverInfo.exported)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: j */
    public static boolean m168474j(double d, String str) {
        int i;
        if (d > 0.0d && d < 100.0d) {
            if (!TextUtils.isEmpty(str)) {
                i = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i = ((i << 6) & 65535) + charAt + (charAt << 14);
                    int i2 = i >> 21;
                    if ((266338304 & i) != 0) {
                        i ^= i2 & 127;
                    }
                }
            } else {
                i = 1;
            }
            if (((double) (i % 10000)) >= d * 100.0d) {
                return true;
            }
        }
        return false;
    }
}
