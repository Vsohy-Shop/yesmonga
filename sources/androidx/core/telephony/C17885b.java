package androidx.core.telephony;

import android.os.Build;
import android.telephony.SubscriptionManager;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@C0376v0(22)
/* renamed from: androidx.core.telephony.b */
public class C17885b {

    /* renamed from: a */
    public static Method f46314a;

    @C0376v0(29)
    /* renamed from: androidx.core.telephony.b$a */
    public static class C17886a {
        @C0373u
        /* renamed from: a */
        public static int m81405a(int i) {
            return SubscriptionManager.getSlotIndex(i);
        }
    }

    /* renamed from: a */
    public static int m81404a(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            return C17886a.m81405a(i);
        }
        try {
            if (f46314a == null) {
                Class<SubscriptionManager> cls = SubscriptionManager.class;
                if (i2 >= 26) {
                    f46314a = cls.getDeclaredMethod("getSlotIndex", new Class[]{Integer.TYPE});
                } else {
                    f46314a = cls.getDeclaredMethod("getSlotId", new Class[]{Integer.TYPE});
                }
                f46314a.setAccessible(true);
            }
            Integer num = (Integer) f46314a.invoke((Object) null, new Object[]{Integer.valueOf(i)});
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
