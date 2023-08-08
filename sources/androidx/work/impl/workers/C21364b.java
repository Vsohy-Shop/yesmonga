package androidx.work.impl.workers;

import com.google.common.util.concurrent.C32487a;

/* renamed from: androidx.work.impl.workers.b */
public final /* synthetic */ class C21364b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConstraintTrackingWorker f55093a;

    /* renamed from: b */
    public final /* synthetic */ C32487a f55094b;

    public /* synthetic */ C21364b(ConstraintTrackingWorker constraintTrackingWorker, C32487a aVar) {
        this.f55093a = constraintTrackingWorker;
        this.f55094b = aVar;
    }

    public final void run() {
        ConstraintTrackingWorker.m98510A(this.f55093a, this.f55094b);
    }
}
