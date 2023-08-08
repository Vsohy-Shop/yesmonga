package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C21377l;
import com.urbanairship.iam.events.C9175a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "WakeLocks")
/* renamed from: androidx.work.impl.utils.c0 */
public final class C21300c0 {
    @C12579k

    /* renamed from: a */
    public static final String f54961a;

    static {
        String i = C21377l.m98584i("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(i, "tagWithPrefix(\"WakeLocks\")");
        f54961a = i;
    }

    /* renamed from: a */
    public static final void m98370a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C21302d0 d0Var = C21302d0.f54962a;
        synchronized (d0Var) {
            linkedHashMap.putAll(d0Var.mo63636a());
            C11079d2 d2Var = C11079d2.f28267a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            boolean z = false;
            if (wakeLock != null && wakeLock.isHeld()) {
                z = true;
            }
            if (z) {
                C21377l.m98582e().mo63782l(f54961a, "WakeLock held for " + str);
            }
        }
    }

    @C12579k
    /* renamed from: b */
    public static final PowerManager.WakeLock m98371b(@C12579k Context context, @C12579k String str) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        C21302d0 d0Var = C21302d0.f54962a;
        synchronized (d0Var) {
            String put = d0Var.mo63636a().put(newWakeLock, str2);
        }
        Intrinsics.checkNotNullExpressionValue(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
