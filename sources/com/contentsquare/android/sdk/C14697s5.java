package com.contentsquare.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.contentsquare.android.sdk.C14466k4;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.s5 */
public class C14697s5 extends C14162a<C14645q8> implements C14616pa {

    /* renamed from: d */
    public final C14453jf f36379d = new C14453jf(C14697s5.class.getCanonicalName());

    public C14697s5(Context context) {
        super(context, "cs_feature_flags");
    }

    /* renamed from: l */
    public static /* synthetic */ void m63374l(List list, SharedPreferences.Editor editor) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14466k4.C14468b bVar = (C14466k4.C14468b) it.next();
            editor.putBoolean(bVar.mo35717c(), bVar.mo35718d());
        }
    }

    /* renamed from: W */
    public void mo36159W(List<C14466k4.C14468b> list) {
        mo36378k(new C14666r5(list));
    }

    /* renamed from: k */
    public final void mo36378k(C14373g9<SharedPreferences.Editor> g9Var) {
        SharedPreferences.Editor edit = this.f35022a.edit();
        g9Var.mo34337b(edit);
        edit.apply();
    }

    /* renamed from: m */
    public C14645q8 mo34465f() {
        return new C14251ca();
    }

    /* renamed from: n */
    public final boolean mo36380n(String str) {
        Object obj = mo34462c().get(str);
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            this.f36379d.mo35680j(e, "Only boolean values should be stored in this file, The value of %s key is not boolean", str);
            return false;
        }
    }

    /* renamed from: o */
    public C14645q8 mo34461b(String str) {
        return new C14645q8(str, Boolean.valueOf(mo36380n(str)));
    }

    public /* bridge */ /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        super.onSharedPreferenceChanged(sharedPreferences, str);
    }
}
