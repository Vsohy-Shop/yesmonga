package com.onetrust.otpublishers.headless.Internal.Preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Preferences.a */
public class C35011a {

    /* renamed from: a */
    public SharedPreferences f85168a;

    public C35011a(@C0359n0 Context context) {
        this.f85168a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* renamed from: a */
    public void mo103957a(@C0359n0 String str, @C0363p0 String str2) {
        this.f85168a.edit().putString(str, str2).apply();
    }
}
