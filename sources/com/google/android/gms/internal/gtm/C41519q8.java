package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.gtm.q8 */
public final class C41519q8 {

    /* renamed from: a */
    public static volatile ExecutorService f104898a;

    /* renamed from: a */
    public static ExecutorService m168244a(Context context) {
        if (f104898a == null) {
            synchronized (C41519q8.class) {
                if (f104898a == null) {
                    f104898a = new C41156b6(context, 1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C41495p8());
                }
            }
        }
        return f104898a;
    }
}
