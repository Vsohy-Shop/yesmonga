package com.google.android.gms.common.providers;

import com.google.android.gms.common.providers.C40921a;
import com.google.android.gms.internal.common.C41113o;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.common.providers.b */
public final class C40923b implements C40921a.C40922a {
    /* renamed from: a */
    public final ScheduledExecutorService mo134613a() {
        C41113o.m166989a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
