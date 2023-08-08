package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.google.firebase.messaging.C33180f;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.l0 */
public class C33209l0 {

    /* renamed from: b */
    public static final int f80740b = -16777216;

    /* renamed from: c */
    public static final int f80741c = 1;

    /* renamed from: d */
    public static final int f80742d = -1;

    /* renamed from: e */
    public static final int f80743e = 1;

    /* renamed from: f */
    public static final String f80744f = "NotificationParams";
    @C0359n0

    /* renamed from: a */
    public final Bundle f80745a;

    public C33209l0(@C0359n0 Bundle bundle) {
        if (bundle != null) {
            this.f80745a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: B */
    public static String m133957B(String str) {
        if (str.startsWith(C33180f.C33183c.f80583b)) {
            return str.substring(6);
        }
        return str;
    }

    /* renamed from: d */
    public static int m133958d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: t */
    public static boolean m133959t(String str) {
        if (str.startsWith(C33180f.C33181a.f80564a) || str.equals("from")) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static boolean m133960v(Bundle bundle) {
        if ("1".equals(bundle.getString(C33180f.C33183c.f80585d)) || "1".equals(bundle.getString(m133962x(C33180f.C33183c.f80585d)))) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m133961w(String str) {
        if (str.startsWith(C33180f.C33184d.f80622o) || str.startsWith(C33180f.C33183c.f80583b) || str.startsWith(C33180f.C33183c.f80584c)) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static String m133962x(String str) {
        if (!str.startsWith(C33180f.C33183c.f80583b)) {
            return str;
        }
        return str.replace(C33180f.C33183c.f80583b, C33180f.C33183c.f80584c);
    }

    /* renamed from: A */
    public Bundle mo96112A() {
        Bundle bundle = new Bundle(this.f80745a);
        for (String next : this.f80745a.keySet()) {
            if (m133961w(next)) {
                bundle.remove(next);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public boolean mo96113a(String str) {
        String p = mo96127p(str);
        if ("1".equals(p) || Boolean.parseBoolean(p)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Integer mo96114b(String str) {
        String p = mo96127p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Couldn't parse value of ");
            sb.append(m133957B(str));
            sb.append("(");
            sb.append(p);
            sb.append(") into an int");
            return null;
        }
    }

    @C0363p0
    /* renamed from: c */
    public JSONArray mo96115c(String str) {
        String p = mo96127p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Malformed JSON for key ");
            sb.append(m133957B(str));
            sb.append(": ");
            sb.append(p);
            sb.append(", falling back to default");
            return null;
        }
    }

    @C0363p0
    /* renamed from: e */
    public int[] mo96116e() {
        JSONArray c = mo96115c(C33180f.C33183c.f80604w);
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = m133958d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("LightSettings is invalid: ");
            sb.append(c);
            sb.append(". Skipping setting LightSettings");
            return null;
        } catch (IllegalArgumentException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("LightSettings is invalid: ");
            sb2.append(c);
            sb2.append(". ");
            sb2.append(e.getMessage());
            sb2.append(". Skipping setting LightSettings");
            return null;
        }
    }

    @C0363p0
    /* renamed from: f */
    public Uri mo96117f() {
        String p = mo96127p(C33180f.C33183c.f80577C);
        if (TextUtils.isEmpty(p)) {
            p = mo96127p(C33180f.C33183c.f80576B);
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    @C0363p0
    /* renamed from: g */
    public Object[] mo96118g(String str) {
        JSONArray c = mo96115c(str + C33180f.C33183c.f80581G);
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    @C0363p0
    /* renamed from: h */
    public String mo96119h(String str) {
        return mo96127p(str + C33180f.C33183c.f80580F);
    }

    @C0363p0
    /* renamed from: i */
    public String mo96120i(Resources resources, String str, String str2) {
        String h = mo96119h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, C16717v.C16719b.f42182e, str);
        if (identifier == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(m133957B(str2 + C33180f.C33183c.f80580F));
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            return null;
        }
        Object[] g = mo96118g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing format argument for ");
            sb2.append(m133957B(str2));
            sb2.append(": ");
            sb2.append(Arrays.toString(g));
            sb2.append(" Default value will be used.");
            return null;
        }
    }

    /* renamed from: j */
    public Long mo96121j(String str) {
        String p = mo96127p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Couldn't parse value of ");
            sb.append(m133957B(str));
            sb.append("(");
            sb.append(p);
            sb.append(") into a long");
            return null;
        }
    }

    /* renamed from: k */
    public String mo96122k() {
        return mo96127p(C33180f.C33183c.f80578D);
    }

    @C0363p0
    /* renamed from: l */
    public Integer mo96123l() {
        Integer b = mo96114b(C33180f.C33183c.f80601t);
        if (b == null) {
            return null;
        }
        if (b.intValue() >= 0) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("notificationCount is invalid: ");
        sb.append(b);
        sb.append(". Skipping setting notificationCount.");
        return null;
    }

    @C0363p0
    /* renamed from: m */
    public Integer mo96124m() {
        Integer b = mo96114b(C33180f.C33183c.f80597p);
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("notificationPriority is invalid ");
        sb.append(b);
        sb.append(". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String mo96125n(Resources resources, String str, String str2) {
        String p = mo96127p(str2);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return mo96120i(resources, str, str2);
    }

    @C0363p0
    /* renamed from: o */
    public String mo96126o() {
        String p = mo96127p(C33180f.C33183c.f80606y);
        if (TextUtils.isEmpty(p)) {
            return mo96127p(C33180f.C33183c.f80607z);
        }
        return p;
    }

    /* renamed from: p */
    public String mo96127p(String str) {
        return this.f80745a.getString(mo96132y(str));
    }

    @C0363p0
    /* renamed from: q */
    public long[] mo96128q() {
        JSONArray c = mo96115c(C33180f.C33183c.f80603v);
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(c);
            sb.append(". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* renamed from: r */
    public Integer mo96129r() {
        Integer b = mo96114b(C33180f.C33183c.f80602u);
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("visibility is invalid: ");
        sb.append(b);
        sb.append(". Skipping setting visibility.");
        return null;
    }

    /* renamed from: s */
    public boolean mo96130s() {
        return !TextUtils.isEmpty(mo96127p(C33180f.C33183c.f80591j));
    }

    /* renamed from: u */
    public boolean mo96131u() {
        return mo96113a(C33180f.C33183c.f80585d);
    }

    /* renamed from: y */
    public final String mo96132y(String str) {
        if (!this.f80745a.containsKey(str) && str.startsWith(C33180f.C33183c.f80583b)) {
            String x = m133962x(str);
            if (this.f80745a.containsKey(x)) {
                return x;
            }
        }
        return str;
    }

    /* renamed from: z */
    public Bundle mo96133z() {
        Bundle bundle = new Bundle(this.f80745a);
        for (String next : this.f80745a.keySet()) {
            if (!m133959t(next)) {
                bundle.remove(next);
            }
        }
        return bundle;
    }
}
