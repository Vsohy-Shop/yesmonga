package com.google.android.gms.common.providers;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import java.util.concurrent.ScheduledExecutorService;

@C40473a
@Deprecated
/* renamed from: com.google.android.gms.common.providers.a */
public class C40921a {

    /* renamed from: a */
    public static C40922a f104099a;

    /* renamed from: com.google.android.gms.common.providers.a$a */
    public interface C40922a {
        @C40473a
        @C0359n0
        @Deprecated
        /* renamed from: a */
        ScheduledExecutorService mo134613a();
    }

    @C40473a
    @C0359n0
    @Deprecated
    /* renamed from: a */
    public static synchronized C40922a m166374a() {
        C40922a aVar;
        synchronized (C40921a.class) {
            if (f104099a == null) {
                f104099a = new C40923b();
            }
            aVar = f104099a;
        }
        return aVar;
    }
}
