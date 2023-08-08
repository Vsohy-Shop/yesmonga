package androidx.core.p027os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.os.w0 */
public class C17842w0 {

    @C0376v0(24)
    /* renamed from: androidx.core.os.w0$a */
    public static class C17843a {
        @C0373u
        /* renamed from: a */
        public static boolean m81310a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* renamed from: a */
    public static boolean m81309a(@C0359n0 Context context) {
        return C17843a.m81310a(context);
    }
}
