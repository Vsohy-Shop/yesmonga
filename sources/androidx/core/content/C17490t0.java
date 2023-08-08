package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17172n;
import androidx.core.util.C17992m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.content.t0 */
public final class C17490t0 {

    /* renamed from: a */
    public static final int f45792a = 0;

    /* renamed from: b */
    public static final int f45793b = -1;

    /* renamed from: c */
    public static final int f45794c = -2;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.t0$a */
    public @interface C17491a {
    }

    /* renamed from: a */
    public static int m80260a(@C0359n0 Context context, @C0359n0 String str) {
        String str2;
        if (Binder.getCallingPid() == Process.myPid()) {
            str2 = context.getPackageName();
        } else {
            str2 = null;
        }
        return m80262c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    /* renamed from: b */
    public static int m80261b(@C0359n0 Context context, @C0359n0 String str, @C0363p0 String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return m80262c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    /* renamed from: c */
    public static int m80262c(@C0359n0 Context context, @C0359n0 String str, int i, int i2, @C0363p0 String str2) {
        boolean z;
        int i3;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String f = C17172n.m79418f(str);
        if (f == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid != i2 || !C17992m.m81740a(packageName, str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i3 = C17172n.m79413a(context, i2, f, str2);
        } else {
            i3 = C17172n.m79417e(context, f, str2);
        }
        if (i3 == 0) {
            return 0;
        }
        return -2;
    }

    /* renamed from: d */
    public static int m80263d(@C0359n0 Context context, @C0359n0 String str) {
        return m80262c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
