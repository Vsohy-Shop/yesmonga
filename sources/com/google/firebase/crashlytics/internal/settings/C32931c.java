package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.common.C32704l;
import com.google.firebase.crashlytics.internal.network.C32913a;
import com.google.firebase.crashlytics.internal.network.C32914b;
import com.google.firebase.crashlytics.internal.network.C32915c;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.internal.settings.c */
public class C32931c implements C32942k {

    /* renamed from: d */
    public static final String f79983d = "X-CRASHLYTICS-GOOGLE-APP-ID";

    /* renamed from: e */
    public static final String f79984e = "X-CRASHLYTICS-API-CLIENT-TYPE";

    /* renamed from: f */
    public static final String f79985f = "X-CRASHLYTICS-API-CLIENT-VERSION";

    /* renamed from: g */
    public static final String f79986g = "User-Agent";

    /* renamed from: h */
    public static final String f79987h = "Accept";

    /* renamed from: i */
    public static final String f79988i = "Crashlytics Android SDK/";

    /* renamed from: j */
    public static final String f79989j = "application/json";

    /* renamed from: k */
    public static final String f79990k = "android";

    /* renamed from: l */
    public static final String f79991l = "build_version";

    /* renamed from: m */
    public static final String f79992m = "display_version";

    /* renamed from: n */
    public static final String f79993n = "instance";

    /* renamed from: o */
    public static final String f79994o = "source";

    /* renamed from: p */
    public static final String f79995p = "X-CRASHLYTICS-DEVICE-MODEL";

    /* renamed from: q */
    public static final String f79996q = "X-CRASHLYTICS-OS-BUILD-VERSION";

    /* renamed from: r */
    public static final String f79997r = "X-CRASHLYTICS-OS-DISPLAY-VERSION";

    /* renamed from: s */
    public static final String f79998s = "X-CRASHLYTICS-INSTALLATION-ID";

    /* renamed from: a */
    public final String f79999a;

    /* renamed from: b */
    public final C32914b f80000b;

    /* renamed from: c */
    public final C32741f f80001c;

    public C32931c(String str, C32914b bVar) {
        this(str, bVar, C32741f.m132248f());
    }

    /* renamed from: a */
    public JSONObject mo95596a(C32941j jVar, boolean z) {
        if (z) {
            try {
                Map<String, String> f = mo95601f(jVar);
                C32913a b = mo95597b(mo95599d(f), jVar);
                C32741f fVar = this.f80001c;
                fVar.mo95052b("Requesting settings from " + this.f79999a);
                C32741f fVar2 = this.f80001c;
                fVar2.mo95060k("Settings query params were: " + f);
                return mo95602g(b.mo95533c());
            } catch (IOException e) {
                this.f80001c.mo95055e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* renamed from: b */
    public final C32913a mo95597b(C32913a aVar, C32941j jVar) {
        mo95598c(aVar, f79983d, jVar.f80052a);
        mo95598c(aVar, f79984e, "android");
        mo95598c(aVar, f79985f, C32704l.m132071m());
        mo95598c(aVar, "Accept", "application/json");
        mo95598c(aVar, f79995p, jVar.f80053b);
        mo95598c(aVar, f79996q, jVar.f80054c);
        mo95598c(aVar, f79997r, jVar.f80055d);
        mo95598c(aVar, f79998s, jVar.f80056e.mo95029a());
        return aVar;
    }

    /* renamed from: c */
    public final void mo95598c(C32913a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.mo95534d(str, str2);
        }
    }

    /* renamed from: d */
    public C32913a mo95599d(Map<String, String> map) {
        C32913a b = this.f80000b.mo95538b(this.f79999a, map);
        return b.mo95534d("User-Agent", f79988i + C32704l.m132071m()).mo95534d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: e */
    public final JSONObject mo95600e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C32741f fVar = this.f80001c;
            fVar.mo95063n("Failed to parse settings JSON from " + this.f79999a, e);
            C32741f fVar2 = this.f80001c;
            fVar2.mo95062m("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    public final Map<String, String> mo95601f(C32941j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(f79991l, jVar.f80059h);
        hashMap.put(f79992m, jVar.f80058g);
        hashMap.put("source", Integer.toString(jVar.f80060i));
        String str = jVar.f80057f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: g */
    public JSONObject mo95602g(C32915c cVar) {
        int b = cVar.mo95540b();
        C32741f fVar = this.f80001c;
        fVar.mo95060k("Settings response code was: " + b);
        if (mo95603h(b)) {
            return mo95600e(cVar.mo95539a());
        }
        C32741f fVar2 = this.f80001c;
        fVar2.mo95054d("Settings request failed; (status: " + b + ") from " + this.f79999a);
        return null;
    }

    /* renamed from: h */
    public boolean mo95603h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public C32931c(String str, C32914b bVar, C32741f fVar) {
        if (str != null) {
            this.f80001c = fVar;
            this.f80000b = bVar;
            this.f79999a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
