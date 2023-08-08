package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0380x0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.telephony.c */
public class C17887c {

    /* renamed from: a */
    public static Method f46315a;

    /* renamed from: b */
    public static Method f46316b;

    @C0376v0(23)
    /* renamed from: androidx.core.telephony.c$a */
    public static class C17888a {
        @C0363p0
        @C0380x0("android.permission.READ_PHONE_STATE")
        @SuppressLint({"MissingPermission"})
        @C0373u
        /* renamed from: a */
        public static String m81408a(TelephonyManager telephonyManager, int i) {
            return telephonyManager.getDeviceId(i);
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.core.telephony.c$b */
    public static class C17889b {
        @C0363p0
        @C0380x0("android.permission.READ_PHONE_STATE")
        @SuppressLint({"MissingPermission"})
        @C0373u
        /* renamed from: a */
        public static String m81409a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    @C0376v0(30)
    /* renamed from: androidx.core.telephony.c$c */
    public static class C17890c {
        @C0373u
        /* renamed from: a */
        public static int m81410a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    @C0363p0
    @C0380x0("android.permission.READ_PHONE_STATE")
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static String m81406a(@C0359n0 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17889b.m81409a(telephonyManager);
        }
        int b = m81407b(telephonyManager);
        if (b == Integer.MAX_VALUE || b == -1) {
            return telephonyManager.getDeviceId();
        }
        return C17888a.m81408a(telephonyManager, C17885b.m81404a(b));
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: b */
    public static int m81407b(@C0359n0 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C17890c.m81410a(telephonyManager);
        }
        try {
            if (f46316b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
                f46316b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f46316b.invoke(telephonyManager, new Object[0]);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
