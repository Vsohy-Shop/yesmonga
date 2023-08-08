package com.google.android.play.core.internal;

import android.content.Context;
import android.os.LocaleList;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.play.core.internal.q0 */
public final class C32081q0 {

    /* renamed from: a */
    public final Context f78282a;

    public C32081q0(Context context) {
        this.f78282a = context;
    }

    /* renamed from: b */
    public static String m129913b(Locale locale) {
        String str;
        String valueOf = String.valueOf(locale.getLanguage());
        if (locale.getCountry().isEmpty()) {
            str = "";
        } else {
            String valueOf2 = String.valueOf(locale.getCountry());
            str = valueOf2.length() != 0 ? C32920e.f79928l.concat(valueOf2) : new String(C32920e.f79928l);
        }
        String valueOf3 = String.valueOf(str);
        return valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf);
    }

    /* renamed from: a */
    public final List<String> mo92813a() {
        LocaleList locales = this.f78282a.getResources().getConfiguration().getLocales();
        ArrayList arrayList = new ArrayList(locales.size());
        for (int i = 0; i < locales.size(); i++) {
            arrayList.add(m129913b(locales.get(i)));
        }
        return arrayList;
    }
}
