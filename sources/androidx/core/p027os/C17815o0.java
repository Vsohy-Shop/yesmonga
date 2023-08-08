package androidx.core.p027os;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.C0376v0;
import java.lang.reflect.Method;

/* renamed from: androidx.core.os.o0 */
public final class C17815o0 {

    @C0376v0(16)
    /* renamed from: androidx.core.os.o0$a */
    public static class C17816a {

        /* renamed from: a */
        public static final Object f46193a = new Object();

        /* renamed from: b */
        public static Method f46194b;

        /* renamed from: c */
        public static boolean f46195c;

        @SuppressLint({"PrivateApi"})
        /* renamed from: a */
        public static boolean m81232a(int i) {
            try {
                synchronized (f46193a) {
                    if (!f46195c) {
                        f46195c = true;
                        f46194b = Class.forName("android.os.UserId").getDeclaredMethod("isApp", new Class[]{Integer.TYPE});
                    }
                }
                Method method = f46194b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke((Object) null, new Object[]{Integer.valueOf(i)});
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    @C0376v0(17)
    /* renamed from: androidx.core.os.o0$b */
    public static class C17817b {

        /* renamed from: a */
        public static final Object f46196a = new Object();

        /* renamed from: b */
        public static Method f46197b;

        /* renamed from: c */
        public static boolean f46198c;

        @SuppressLint({"DiscouragedPrivateApi"})
        /* renamed from: a */
        public static boolean m81233a(int i) {
            try {
                synchronized (f46196a) {
                    if (!f46198c) {
                        f46198c = true;
                        f46197b = UserHandle.class.getDeclaredMethod("isApp", new Class[]{Integer.TYPE});
                    }
                }
                Method method = f46197b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke((Object) null, new Object[]{Integer.valueOf(i)});
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.os.o0$c */
    public static class C17818c {
        /* renamed from: a */
        public static boolean m81234a(int i) {
            return Process.isApplicationUid(i);
        }
    }

    /* renamed from: a */
    public static boolean m81231a(int i) {
        return C17818c.m81234a(i);
    }
}
