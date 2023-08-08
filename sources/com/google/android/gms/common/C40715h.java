package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.runtime.C8698y1;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40768h2;
import com.google.android.gms.common.internal.C40781l;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.util.C40986l;
import com.google.android.gms.common.wrappers.C41008d;
import com.google.android.gms.internal.common.C41109k;

@C40473a
@C40858y
/* renamed from: com.google.android.gms.common.h */
public class C40715h {
    @C40473a

    /* renamed from: a */
    public static final int f103695a = C40864j.f103985a;
    @C40473a
    @C0359n0

    /* renamed from: b */
    public static final String f103696b = "com.google.android.gms";
    @C40473a
    @C0359n0

    /* renamed from: c */
    public static final String f103697c = "com.android.vending";
    @C40473a

    /* renamed from: d */
    public static final String f103698d = "d";
    @C40473a

    /* renamed from: e */
    public static final String f103699e = "n";

    /* renamed from: f */
    public static final C40715h f103700f = new C40715h();

    @C40473a
    @C0359n0
    /* renamed from: i */
    public static C40715h m165670i() {
        return f103700f;
    }

    @C40473a
    /* renamed from: a */
    public void mo134220a(@C0359n0 Context context) {
        C40864j.m166227a(context);
    }

    @C40473a
    @C40858y
    /* renamed from: b */
    public int mo134221b(@C0359n0 Context context) {
        return C40864j.m166230d(context);
    }

    @C40473a
    @C40858y
    /* renamed from: c */
    public int mo134204c(@C0359n0 Context context) {
        return C40864j.m166231e(context);
    }

    @C0363p0
    @C40858y
    @C40473a
    @Deprecated
    /* renamed from: d */
    public Intent mo134222d(int i) {
        return mo134205e((Context) null, i, (String) null);
    }

    @C0363p0
    @C40473a
    @C40858y
    /* renamed from: e */
    public Intent mo134205e(@C0363p0 Context context, int i, @C0363p0 String str) {
        if (i == 1 || i == 2) {
            if (context != null && C40986l.m166651l(context)) {
                return C40768h2.m165893a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f103695a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(C41008d.m166715a(context).mo134784f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C40768h2.m165894b("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C40768h2.m165895c("com.google.android.gms");
        }
    }

    @C0363p0
    @C40473a
    /* renamed from: f */
    public PendingIntent mo134206f(@C0359n0 Context context, int i, int i2) {
        return mo134223g(context, i, i2, (String) null);
    }

    @C0363p0
    @C40473a
    @C40858y
    /* renamed from: g */
    public PendingIntent mo134223g(@C0359n0 Context context, int i, int i2, @C0363p0 String str) {
        Intent e = mo134205e(context, i, str);
        if (e == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, e, C41109k.f104401a | C8698y1.f23301m);
    }

    @C40473a
    @C0359n0
    /* renamed from: h */
    public String mo134207h(int i) {
        return C40864j.m166233g(i);
    }

    @C40473a
    @C40781l
    /* renamed from: j */
    public int mo134208j(@C0359n0 Context context) {
        return mo134209k(context, f103695a);
    }

    @C40473a
    /* renamed from: k */
    public int mo134209k(@C0359n0 Context context, int i) {
        int m = C40864j.m166239m(context, i);
        if (C40864j.m166241o(context, m)) {
            return 18;
        }
        return m;
    }

    @C40473a
    @C40858y
    /* renamed from: l */
    public boolean mo134224l(@C0359n0 Context context, int i) {
        return C40864j.m166241o(context, i);
    }

    @C40473a
    @C40858y
    /* renamed from: m */
    public boolean mo134225m(@C0359n0 Context context, int i) {
        return C40864j.m166242p(context, i);
    }

    @C40473a
    /* renamed from: n */
    public boolean mo134226n(@C0359n0 Context context, @C0359n0 String str) {
        return C40864j.m166247u(context, str);
    }

    @C40473a
    /* renamed from: o */
    public boolean mo134210o(int i) {
        return C40864j.m166245s(i);
    }

    @C40473a
    /* renamed from: p */
    public void mo134227p(@C0359n0 Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        C40864j.m166229c(context, i);
    }
}
