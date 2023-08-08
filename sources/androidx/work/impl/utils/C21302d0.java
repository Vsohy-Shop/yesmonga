package androidx.work.impl.utils;

import android.os.PowerManager;
import java.util.WeakHashMap;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.utils.d0 */
public final class C21302d0 {
    @C12579k

    /* renamed from: a */
    public static final C21302d0 f54962a = new C21302d0();
    @C12579k

    /* renamed from: b */
    public static final WeakHashMap<PowerManager.WakeLock, String> f54963b = new WeakHashMap<>();

    @C12579k
    /* renamed from: a */
    public final WeakHashMap<PowerManager.WakeLock, String> mo63636a() {
        return f54963b;
    }
}
