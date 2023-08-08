package com.contentsquare.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.contentsquare.android.sdk.C14918z4;

/* renamed from: com.contentsquare.android.sdk.f8 */
public class C14334f8 extends C14162a<C14918z4> {
    public C14334f8(Context context, String str) {
        super(context, str);
    }

    /* renamed from: b */
    public C14918z4 mo34461b(String str) {
        C14918z4.C14919a aVar;
        Object obj = mo34462c().get(str);
        if (obj == null) {
            aVar = new C14918z4.C14919a(Boolean.FALSE, 1);
        }
        return new C14918z4(str, aVar);
    }

    /* renamed from: f */
    public C14918z4 mo34465f() {
        return new C14775ua();
    }

    /* renamed from: h */
    public String mo34467h(String str) {
        return C14559nf.m62762g(str);
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ C14841we mo34469j(String[] strArr) {
        return super.mo34469j(strArr);
    }

    public /* bridge */ /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        super.onSharedPreferenceChanged(sharedPreferences, str);
    }
}
