package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.app.n */
public final class C17172n {

    /* renamed from: a */
    public static final int f45401a = 0;

    /* renamed from: b */
    public static final int f45402b = 1;

    /* renamed from: c */
    public static final int f45403c = 2;

    /* renamed from: d */
    public static final int f45404d = 3;

    @C0376v0(19)
    /* renamed from: androidx.core.app.n$a */
    public static class C17173a {
        @C0373u
        /* renamed from: a */
        public static int m79419a(AppOpsManager appOpsManager, String str, int i, String str2) {
            return appOpsManager.noteOp(str, i, str2);
        }

        @C0373u
        /* renamed from: b */
        public static int m79420b(AppOpsManager appOpsManager, String str, int i, String str2) {
            return appOpsManager.noteOpNoThrow(str, i, str2);
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.app.n$b */
    public static class C17174b {
        @C0373u
        /* renamed from: a */
        public static <T> T m79421a(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        @C0373u
        /* renamed from: b */
        public static int m79422b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @C0373u
        /* renamed from: c */
        public static int m79423c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @C0373u
        /* renamed from: d */
        public static String m79424d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.core.app.n$c */
    public static class C17175c {
        @C0373u
        /* renamed from: a */
        public static int m79425a(@C0363p0 AppOpsManager appOpsManager, @C0359n0 String str, int i, @C0359n0 String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        @C0359n0
        @C0373u
        /* renamed from: b */
        public static String m79426b(@C0359n0 Context context) {
            return context.getOpPackageName();
        }

        @C0363p0
        @C0373u
        /* renamed from: c */
        public static AppOpsManager m79427c(@C0359n0 Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m79413a(@C0359n0 Context context, int i, @C0359n0 String str, @C0359n0 String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m79417e(context, str, str2);
        }
        AppOpsManager c = C17175c.m79427c(context);
        int a = C17175c.m79425a(c, str, Binder.getCallingUid(), str2);
        if (a != 0) {
            return a;
        }
        return C17175c.m79425a(c, str, i, C17175c.m79426b(context));
    }

    /* renamed from: b */
    public static int m79414b(@C0359n0 Context context, @C0359n0 String str, int i, @C0359n0 String str2) {
        return C17173a.m79419a((AppOpsManager) context.getSystemService("appops"), str, i, str2);
    }

    /* renamed from: c */
    public static int m79415c(@C0359n0 Context context, @C0359n0 String str, int i, @C0359n0 String str2) {
        return C17173a.m79420b((AppOpsManager) context.getSystemService("appops"), str, i, str2);
    }

    /* renamed from: d */
    public static int m79416d(@C0359n0 Context context, @C0359n0 String str, @C0359n0 String str2) {
        return C17174b.m79422b((AppOpsManager) C17174b.m79421a(context, AppOpsManager.class), str, str2);
    }

    /* renamed from: e */
    public static int m79417e(@C0359n0 Context context, @C0359n0 String str, @C0359n0 String str2) {
        return C17174b.m79423c((AppOpsManager) C17174b.m79421a(context, AppOpsManager.class), str, str2);
    }

    @C0363p0
    /* renamed from: f */
    public static String m79418f(@C0359n0 String str) {
        return C17174b.m79424d(str);
    }
}
