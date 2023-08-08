package androidx.core.content.p026pm;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.content.pm.f */
public final class C17382f {

    @C0376v0(28)
    /* renamed from: androidx.core.content.pm.f$a */
    public static class C17383a {
        @C0373u
        /* renamed from: a */
        public static int m79928a(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @C0373u
        /* renamed from: b */
        public static int m79929b(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.pm.f$b */
    public @interface C17384b {
    }

    @SuppressLint({"UniqueConstants"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.pm.f$c */
    public @interface C17385c {
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public static int m79926a(@C0359n0 PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17383a.m79928a(permissionInfo);
        }
        return permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public static int m79927b(@C0359n0 PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17383a.m79929b(permissionInfo);
        }
        return permissionInfo.protectionLevel & -16;
    }
}
