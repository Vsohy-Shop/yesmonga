package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.util.C40974d0;
import com.urbanairship.analytics.C35557k;
import java.util.HashMap;
import java.util.Map;

@C40858y
@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.o6 */
public final class C41469o6 {

    /* renamed from: a */
    public static String f104829a;
    @C40974d0

    /* renamed from: b */
    public static final Map<String, String> f104830b = new HashMap();

    /* renamed from: a */
    public static String m168101a(String str, String str2) {
        String str3;
        if (str2 != null) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3 = "http://hostname/?".concat(valueOf);
            } else {
                str3 = new String("http://hostname/?");
            }
            return Uri.parse(str3).getQueryParameter(str2);
        } else if (str.length() > 0) {
            return str;
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public static String m168102b(Context context, String str) {
        if (f104829a == null) {
            synchronized (C41469o6.class) {
                if (f104829a == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    if (sharedPreferences != null) {
                        f104829a = sharedPreferences.getString(C35557k.f87781a, "");
                    } else {
                        f104829a = "";
                    }
                }
            }
        }
        return m168101a(f104829a, str);
    }
}
