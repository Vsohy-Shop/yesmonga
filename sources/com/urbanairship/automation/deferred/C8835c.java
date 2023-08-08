package com.urbanairship.automation.deferred;

import android.content.pm.PackageInfo;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.UAirship;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import com.urbanairship.push.C9537t;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.urbanairship.automation.deferred.c */
public class C8835c implements C9333e {

    /* renamed from: f */
    public static final String f23695f = "app_version";

    /* renamed from: g */
    public static final String f23696g = "sdk_version";

    /* renamed from: v */
    public static final String f23697v = "notification_opt_in";

    /* renamed from: w */
    public static final String f23698w = "locale_language";

    /* renamed from: x */
    public static final String f23699x = "locale_country";

    /* renamed from: a */
    public final String f23700a;

    /* renamed from: b */
    public final String f23701b;

    /* renamed from: c */
    public final boolean f23702c;

    /* renamed from: d */
    public final String f23703d;

    /* renamed from: e */
    public final String f23704e;

    @C0344h1
    public C8835c(String str, @C0359n0 String str2, boolean z, @C0359n0 Locale locale) {
        this.f23700a = str;
        this.f23701b = str2;
        this.f23702c = z;
        this.f23703d = locale.getLanguage();
        this.f23704e = locale.getCountry();
    }

    @C0359n0
    /* renamed from: a */
    public static C8835c m32863a() {
        String str;
        C9537t E = UAirship.m146188Y().mo106203E();
        Locale u = UAirship.m146188Y().mo106230u();
        PackageInfo y = UAirship.m146201y();
        if (y != null) {
            str = y.versionName;
        } else {
            str = "";
        }
        return new C8835c(str, UAirship.m146181I(), E.mo19425j0(), u);
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g("app_version", this.f23700a).mo18823g("sdk_version", this.f23701b).mo18824h("notification_opt_in", this.f23702c).mo18823g("locale_language", this.f23703d).mo18823g("locale_country", this.f23704e).mo18817a().mo17264q();
    }
}
