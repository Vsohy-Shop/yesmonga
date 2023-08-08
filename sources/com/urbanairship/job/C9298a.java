package com.urbanairship.job;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C17970d;

/* renamed from: com.urbanairship.job.a */
public final /* synthetic */ class C9298a implements C17970d {

    /* renamed from: a */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f25365a;

    public /* synthetic */ C9298a(CallbackToFutureAdapter.C16559a aVar) {
        this.f25365a = aVar;
    }

    public final void accept(Object obj) {
        AirshipWorker.m34880y(this.f25365a, (JobResult) obj);
    }
}
