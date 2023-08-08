package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.C40123a;
import com.google.android.datatransport.runtime.dagger.C40132h;
import com.google.android.datatransport.runtime.dagger.C40133i;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40227e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40246x;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.C40255d;
import com.google.android.datatransport.runtime.time.C40309a;
import com.google.android.datatransport.runtime.time.C40310b;

@C40132h
/* renamed from: com.google.android.datatransport.runtime.scheduling.h */
public abstract class C40216h {
    @C40133i
    /* renamed from: b */
    public static C40246x m163545b(Context context, C40255d dVar, SchedulerConfig schedulerConfig, @C40310b C40309a aVar) {
        return new C40227e(context, dVar, schedulerConfig);
    }

    @C40123a
    /* renamed from: a */
    public abstract C40213e mo132858a(C40211c cVar);
}
