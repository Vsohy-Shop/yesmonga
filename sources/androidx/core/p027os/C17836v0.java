package androidx.core.p027os;

import android.os.UserHandle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@C0376v0(17)
/* renamed from: androidx.core.os.v0 */
public class C17836v0 {
    @C0363p0

    /* renamed from: a */
    public static Method f46214a;
    @C0363p0

    /* renamed from: b */
    public static Constructor<UserHandle> f46215b;

    @C0376v0(24)
    /* renamed from: androidx.core.os.v0$a */
    public static class C17837a {
        private C17837a() {
        }

        @C0359n0
        /* renamed from: a */
        public static UserHandle m81282a(int i) {
            return UserHandle.getUserHandleForUid(i);
        }
    }

    /* renamed from: a */
    public static Method m81279a() throws NoSuchMethodException {
        if (f46214a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", new Class[]{Integer.TYPE});
            f46214a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f46214a;
    }

    /* renamed from: b */
    public static Constructor<UserHandle> m81280b() throws NoSuchMethodException {
        if (f46215b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(new Class[]{Integer.TYPE});
            f46215b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f46215b;
    }

    @C0359n0
    /* renamed from: c */
    public static UserHandle m81281c(int i) {
        return C17837a.m81282a(i);
    }
}
