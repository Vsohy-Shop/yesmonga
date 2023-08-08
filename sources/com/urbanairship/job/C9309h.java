package com.urbanairship.job;

import androidx.core.util.C17970d;
import com.urbanairship.C36040b;
import com.urbanairship.UAirship;
import com.urbanairship.job.C9310i;

/* renamed from: com.urbanairship.job.h */
public final /* synthetic */ class C9309h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C36040b f25407a;

    /* renamed from: b */
    public final /* synthetic */ UAirship f25408b;

    /* renamed from: c */
    public final /* synthetic */ C9304f f25409c;

    /* renamed from: d */
    public final /* synthetic */ C17970d f25410d;

    public /* synthetic */ C9309h(C36040b bVar, UAirship uAirship, C9304f fVar, C17970d dVar) {
        this.f25407a = bVar;
        this.f25408b = uAirship;
        this.f25409c = fVar;
        this.f25410d = dVar;
    }

    public final void run() {
        C9310i.C9311a.m34937e(this.f25407a, this.f25408b, this.f25409c, this.f25410d);
    }
}
