package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.errorprone.annotations.C32489b;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.Set;
import javax.annotation.Nullable;

@C40858y
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@C40473a
@C32489b
/* renamed from: com.google.android.gms.common.k */
public class C40866k {
    @Nullable

    /* renamed from: c */
    public static C40866k f103996c;
    @Nullable

    /* renamed from: d */
    public static volatile Set f103997d;

    /* renamed from: a */
    public final Context f103998a;

    /* renamed from: b */
    public volatile String f103999b;

    public C40866k(@C0359n0 Context context) {
        this.f103998a = context.getApplicationContext();
    }

    @C40473a
    @C0359n0
    /* renamed from: a */
    public static C40866k m166252a(@C0359n0 Context context) {
        C40843u.m166202l(context);
        synchronized (C40866k.class) {
            if (f103996c == null) {
                C40916n0.m166364e(context);
                f103996c = new C40866k(context);
            }
        }
        return f103996c;
    }

    @Nullable
    /* renamed from: e */
    public static final C40865j0 m166253e(PackageInfo packageInfo, C40865j0... j0VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        C40867k0 k0Var = new C40867k0(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < j0VarArr.length; i++) {
            if (j0VarArr[i].equals(k0Var)) {
                return j0VarArr[i];
            }
        }
        return null;
    }

    /* renamed from: f */
    public static final boolean m166254f(@C0359n0 PackageInfo packageInfo, boolean z) {
        C40865j0 j0Var;
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                j0Var = m166253e(packageInfo, C40872m0.f104007a);
            } else {
                j0Var = m166253e(packageInfo, C40872m0.f104007a[0]);
            }
            if (j0Var != null) {
                return true;
            }
        }
        return false;
    }

    @C40473a
    /* renamed from: b */
    public boolean mo134533b(@C0359n0 PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m166254f(packageInfo, false)) {
            return true;
        }
        if (!m166254f(packageInfo, true) || !C40864j.m166237k(this.f103998a)) {
            return false;
        }
        return true;
    }

    @C40473a
    @C40858y
    /* renamed from: c */
    public boolean mo134534c(@C0359n0 String str) {
        C40962u0 g = mo134536g(str, false, false);
        g.mo134763e();
        return g.f104205a;
    }

    @C40473a
    @C40858y
    /* renamed from: d */
    public boolean mo134535d(int i) {
        C40962u0 u0Var;
        int length;
        String[] packagesForUid = this.f103998a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            u0Var = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    C40843u.m166202l(u0Var);
                    break;
                }
                u0Var = mo134536g(packagesForUid[i2], false, false);
                if (u0Var.f104205a) {
                    break;
                }
                i2++;
            }
        } else {
            u0Var = C40962u0.m166566c("no pkgs");
        }
        u0Var.mo134763e();
        return u0Var.f104205a;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: g */
    public final C40962u0 mo134536g(String str, boolean z, boolean z2) {
        C40962u0 u0Var;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C40962u0.m166566c("null pkg");
        }
        if (str.equals(this.f103999b)) {
            return C40962u0.m166565b();
        }
        if (C40916n0.m166366g()) {
            u0Var = C40916n0.m166361b(str, C40864j.m166237k(this.f103998a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f103998a.getPackageManager().getPackageInfo(str, 64);
                boolean k = C40864j.m166237k(this.f103998a);
                if (packageInfo == null) {
                    u0Var = C40962u0.m166566c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        u0Var = C40962u0.m166566c("single cert required");
                    } else {
                        C40867k0 k0Var = new C40867k0(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        C40962u0 a = C40916n0.m166360a(str2, k0Var, k, false);
                        if (!a.f104205a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !C40916n0.m166360a(str2, k0Var, false, true).f104205a) {
                            u0Var = a;
                        } else {
                            u0Var = C40962u0.m166566c("debuggable release cert app rejected");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                return C40962u0.m166567d("no pkg ".concat(str), e);
            }
        }
        if (u0Var.f104205a) {
            this.f103999b = str;
        }
        return u0Var;
    }
}
