package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.annotation.C0376v0;
import androidx.core.p027os.C17812o;
import java.util.LinkedHashSet;
import java.util.Locale;

@C0376v0(24)
/* renamed from: androidx.appcompat.app.x */
public final class C0503x {
    /* renamed from: a */
    public static C17812o m2336a(C17812o oVar, C17812o oVar2) {
        Locale locale;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < oVar.mo52239l() + oVar2.mo52239l(); i++) {
            if (i < oVar.mo52239l()) {
                locale = oVar.mo52233d(i);
            } else {
                locale = oVar2.mo52233d(i - oVar.mo52239l());
            }
            if (locale != null) {
                linkedHashSet.add(locale);
            }
        }
        return C17812o.m81209a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* renamed from: b */
    public static C17812o m2337b(LocaleList localeList, LocaleList localeList2) {
        if (localeList == null || localeList.isEmpty()) {
            return C17812o.m81214g();
        }
        return m2336a(C17812o.m81216o(localeList), C17812o.m81216o(localeList2));
    }

    /* renamed from: c */
    public static C17812o m2338c(C17812o oVar, C17812o oVar2) {
        if (oVar == null || oVar.mo52238j()) {
            return C17812o.m81214g();
        }
        return m2336a(oVar, oVar2);
    }
}
