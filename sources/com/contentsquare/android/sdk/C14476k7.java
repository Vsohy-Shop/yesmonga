package com.contentsquare.android.sdk;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.autofill.C0861a;
import com.bumptech.glide.manager.C22509f;
import com.contentsquare.android.C14147n;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.k7 */
public class C14476k7 {

    /* renamed from: a */
    public final C14453jf f35771a = new C14453jf("DeviceInfo");

    /* renamed from: b */
    public final Application f35772b;

    /* renamed from: c */
    public final DisplayMetrics f35773c;

    /* renamed from: d */
    public final C14527ma f35774d;

    /* renamed from: e */
    public String f35775e;

    /* renamed from: f */
    public String f35776f;

    /* renamed from: g */
    public int f35777g;

    /* renamed from: h */
    public int f35778h;

    /* renamed from: i */
    public float f35779i;

    /* renamed from: j */
    public int f35780j;

    /* renamed from: k */
    public String f35781k;

    /* renamed from: l */
    public String f35782l;

    /* renamed from: m */
    public String f35783m;

    /* renamed from: n */
    public C14800v9 f35784n = new C14800v9();

    /* renamed from: o */
    public String f35785o;

    public C14476k7(Application application, DisplayMetrics displayMetrics) {
        this.f35772b = application;
        this.f35774d = new C14527ma(application);
        this.f35773c = displayMetrics;
        String str = Build.MANUFACTURER;
        this.f35775e = mo35752b(str, Build.MODEL);
        this.f35776f = mo35760j(str);
        mo35755e();
    }

    /* renamed from: a */
    public final int mo35751a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 11:
                return 2;
            case 3:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
                return 3;
            case 13:
            case 15:
                return 4;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public String mo35752b(String str, String str2) {
        if (C14358g3.m61811e(str2)) {
            return null;
        }
        if (C14358g3.m61811e(str)) {
            return str2;
        }
        Locale locale = Locale.ENGLISH;
        return (!str2.toLowerCase(locale).startsWith(str.toLowerCase(locale)) || str2.length() <= str.length()) ? C14358g3.m61807a(str2) : C14358g3.m61807a(str2.substring(str.length() + 1, str2.length()).trim());
    }

    /* renamed from: c */
    public JSONObject mo35753c(C14527ma maVar) {
        return mo35754d(maVar, new JSONObject());
    }

    /* renamed from: d */
    public JSONObject mo35754d(C14527ma maVar, JSONObject jSONObject) {
        try {
            jSONObject.put("sv", maVar.mo35917i());
            jSONObject.put("sb", maVar.mo35916h());
            jSONObject.put("av", maVar.mo35914e());
            jSONObject.put("ab", maVar.mo35915f());
        } catch (JSONException e) {
            this.f35771a.mo35678g(e, "Failed to get json version Origin for DeviceInfo.", new Object[0]);
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final void mo35755e() {
        this.f35771a.mo35676e("initiating the device info.");
        this.f35780j = mo35775y() ? 5 : 4;
        this.f35771a.mo35674c("DeviceType: %s", Integer.valueOf(this.f35780j));
        WindowManager windowManager = (WindowManager) this.f35772b.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getRealMetrics(this.f35773c);
            DisplayMetrics displayMetrics = this.f35773c;
            int i = displayMetrics.heightPixels;
            this.f35778h = i;
            this.f35777g = displayMetrics.widthPixels;
            this.f35779i = displayMetrics.density;
            this.f35771a.mo35674c("DeviceWidth: %d", Integer.valueOf(i));
            this.f35771a.mo35674c("DeviceHeight: %d", Integer.valueOf(this.f35777g));
            this.f35771a.mo35674c("DeviceScale: %s", Float.valueOf(this.f35779i));
        }
        String locale = Locale.getDefault().toString();
        this.f35782l = locale;
        this.f35771a.mo35674c("UserLanguage: %s", locale);
        String id = TimeZone.getDefault().getID();
        this.f35783m = id;
        this.f35771a.mo35674c("UserTimezone: %s", id);
        TelephonyManager telephonyManager = (TelephonyManager) this.f35772b.getSystemService(C0861a.f2705e);
        if (telephonyManager != null) {
            this.f35785o = telephonyManager.getNetworkOperatorName();
        }
    }

    /* renamed from: f */
    public boolean mo35756f(String str) {
        return this.f35772b.getApplicationContext().checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: g */
    public int mo35757g() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f35772b.getSystemService("connectivity");
        if (connectivityManager == null || !mo35756f(C22509f.f57696b) || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        if (!activeNetworkInfo.isConnectedOrConnecting()) {
            return -1;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 1;
        }
        return mo35751a(activeNetworkInfo.getSubtype());
    }

    /* renamed from: h */
    public String mo35758h(String str) {
        Matcher matcher = Pattern.compile("^[0-9]*|\\.[0-9]*").matcher(str.replaceFirst("^\\.", "0."));
        String str2 = "0";
        String replace = matcher.find() ? matcher.group(0).replace(".", "") : str2;
        String replace2 = matcher.find() ? matcher.group(0).replace(".", "") : str2;
        String replace3 = matcher.find() ? matcher.group(0).replace(".", "") : str2;
        StringBuilder sb = new StringBuilder();
        if (replace.length() <= 0) {
            replace = str2;
        }
        sb.append(replace);
        sb.append(".");
        if (replace2.length() <= 0) {
            replace2 = str2;
        }
        sb.append(replace2);
        sb.append(".");
        if (replace3.length() > 0) {
            str2 = replace3;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: i */
    public C14527ma mo35759i() {
        return this.f35774d;
    }

    /* renamed from: j */
    public String mo35760j(String str) {
        if (str == null) {
            return null;
        }
        return C14358g3.m61807a(str);
    }

    /* renamed from: k */
    public String mo35761k() {
        return this.f35785o;
    }

    /* renamed from: l */
    public int mo35762l() {
        return this.f35778h;
    }

    /* renamed from: m */
    public int mo35763m() {
        return this.f35780j;
    }

    /* renamed from: n */
    public String mo35764n() {
        return this.f35776f;
    }

    /* renamed from: o */
    public String mo35765o() {
        return this.f35775e;
    }

    /* renamed from: p */
    public String mo35766p() {
        if (this.f35781k == null) {
            String h = mo35758h(mo35770t());
            this.f35781k = h;
            this.f35771a.mo35674c("DeviceOS: %s", h);
        }
        return this.f35781k;
    }

    /* renamed from: q */
    public JSONObject mo35767q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f35777g);
            jSONObject.put("h", this.f35778h);
            jSONObject.put("d", (double) this.f35779i);
        } catch (JSONException e) {
            this.f35771a.mo35678g(e, "Failed to process device resolution for bundle.", new Object[0]);
        }
        return jSONObject;
    }

    /* renamed from: r */
    public float mo35768r() {
        return this.f35779i;
    }

    /* renamed from: s */
    public int mo35769s() {
        return this.f35777g;
    }

    /* renamed from: t */
    public String mo35770t() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: u */
    public int mo35771u() {
        return this.f35772b.getResources().getConfiguration().orientation == 2 ? 1 : 0;
    }

    /* renamed from: v */
    public JSONObject mo35772v() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("an", this.f35774d.mo35913a());
            jSONObject.put("st", "sdk-android");
            jSONObject.put("sf", this.f35784n.mo36635a() ? C10108c.f27780E : "release");
        } catch (JSONException e) {
            this.f35771a.mo35678g(e, "Failed to get Type Origin json for event.", new Object[0]);
        }
        return jSONObject;
    }

    /* renamed from: w */
    public String mo35773w() {
        return this.f35782l;
    }

    /* renamed from: x */
    public String mo35774x() {
        return this.f35783m;
    }

    /* renamed from: y */
    public boolean mo35775y() {
        return this.f35772b.getResources().getBoolean(C14147n.C14149b.contentsquare_isTablet);
    }
}
