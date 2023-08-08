package androidx.core.p027os;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.os.s */
public final class C17828s {

    /* renamed from: a */
    public static boolean f46212a = true;

    /* renamed from: b */
    public static boolean f46213b = true;

    @C0376v0(22)
    /* renamed from: androidx.core.os.s$a */
    public static class C17829a {
        @C0373u
        /* renamed from: a */
        public static boolean m81271a(Message message) {
            return message.isAsynchronous();
        }

        @C0373u
        /* renamed from: b */
        public static void m81272b(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m81269a(@C0359n0 Message message) {
        return C17829a.m81271a(message);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m81270b(@C0359n0 Message message, boolean z) {
        C17829a.m81272b(message, z);
    }
}
