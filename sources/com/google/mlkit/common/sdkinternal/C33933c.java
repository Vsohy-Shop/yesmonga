package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40777k;
import com.google.android.gms.common.util.C40996v;
import java.util.Locale;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.c */
public class C33933c {

    /* renamed from: a */
    public static final C40777k f82346a = new C40777k("CommonUtils", "");

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public static String m136569a(@RecentlyNonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            C40777k kVar = f82346a;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 48);
            sb.append("Exception thrown when trying to get app version ");
            sb.append(valueOf);
            kVar.mo134432e("CommonUtils", sb.toString());
            return "";
        }
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public static String m136570b(@RecentlyNonNull Locale locale) {
        if (C40996v.m166685j()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append("-");
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
