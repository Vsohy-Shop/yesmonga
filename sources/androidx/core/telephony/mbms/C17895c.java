package androidx.core.telephony.mbms;

import android.content.Context;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import java.util.Locale;
import java.util.Set;

/* renamed from: androidx.core.telephony.mbms.c */
public final class C17895c {

    @C0376v0(28)
    /* renamed from: androidx.core.telephony.mbms.c$a */
    public static class C17896a {
        /* renamed from: a */
        public static CharSequence m81416a(Context context, ServiceInfo serviceInfo) {
            Set a = serviceInfo.getNamedContentLocales();
            if (a.isEmpty()) {
                return null;
            }
            String[] strArr = new String[a.size()];
            int i = 0;
            for (Locale languageTag : serviceInfo.getNamedContentLocales()) {
                strArr[i] = languageTag.toLanguageTag();
                i++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }

    @C0363p0
    /* renamed from: a */
    public static CharSequence m81415a(@C0359n0 Context context, @C0359n0 ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17896a.m81416a(context, serviceInfo);
        }
        return null;
    }
}
