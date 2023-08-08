package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
@Deprecated
/* renamed from: com.google.android.gms.common.stats.d */
public class C40956d {
    @C40473a
    @C0359n0
    /* renamed from: a */
    public static String m166556a(@C0359n0 PowerManager.WakeLock wakeLock, @C0359n0 String str) {
        String valueOf = String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock)));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(valueOf).concat(String.valueOf(str));
    }
}
