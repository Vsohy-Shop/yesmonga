package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.C31031c;
import com.google.android.gms.tasks.C31047k;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.firebase.crashlytics.internal.common.o0 */
public final /* synthetic */ class C32715o0 implements C31031c {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f79429a;

    public /* synthetic */ C32715o0(CountDownLatch countDownLatch) {
        this.f79429a = countDownLatch;
    }

    /* renamed from: a */
    public final Object mo85756a(C31047k kVar) {
        return this.f79429a.countDown();
    }
}
