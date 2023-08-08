package com.google.android.gms.common;

import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;

@C40473a
@C40858y
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: com.google.android.gms.common.e */
public class C40709e {

    /* renamed from: a */
    public static final C41010y f103684a;

    /* renamed from: b */
    public static final C41010y f103685b;

    /* renamed from: c */
    public static final HashMap f103686c = new HashMap();

    static {
        C41004w0 w0Var = new C41004w0();
        w0Var.mo134777d("com.google.android.gms");
        w0Var.mo134774a(204200000);
        C40869l0 l0Var = C40916n0.f104090d;
        w0Var.mo134776c(zzag.m167019X(l0Var.mo134530T6(), C40916n0.f104088b.mo134530T6()));
        C40869l0 l0Var2 = C40916n0.f104089c;
        w0Var.mo134775b(zzag.m167019X(l0Var2.mo134530T6(), C40916n0.f104087a.mo134530T6()));
        f103684a = w0Var.mo134778e();
        C41004w0 w0Var2 = new C41004w0();
        w0Var2.mo134777d("com.android.vending");
        w0Var2.mo134774a(82240000);
        w0Var2.mo134776c(zzag.m167018W(l0Var.mo134530T6()));
        w0Var2.mo134775b(zzag.m167018W(l0Var2.mo134530T6()));
        f103685b = w0Var2.mo134778e();
    }
}
