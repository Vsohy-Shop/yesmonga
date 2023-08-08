package com.urbanairship.util;

import android.net.TrafficStats;
import android.os.HandlerThread;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.c */
public class C9641c extends HandlerThread {
    public C9641c(@C0359n0 String str) {
        super(str);
    }

    public void run() {
        TrafficStats.setThreadStatsTag(C9643d.f26420b);
        super.run();
    }
}
