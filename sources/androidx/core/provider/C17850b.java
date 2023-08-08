package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;

/* renamed from: androidx.core.provider.b */
public class C17850b {
    @C0359n0
    /* renamed from: a */
    public static Handler m81317a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
