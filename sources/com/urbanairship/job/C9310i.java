package com.urbanairship.job;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.core.util.C17970d;
import com.urbanairship.C36040b;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.util.C9669o0;
import java.util.concurrent.Executor;

@C0344h1
/* renamed from: com.urbanairship.job.i */
public interface C9310i {

    /* renamed from: com.urbanairship.job.i$a */
    public static class C9311a implements C9310i {

        /* renamed from: b */
        public static final long f25411b = 5000;

        /* renamed from: a */
        public final Executor f25412a = C36044d.m148369a();

        /* renamed from: e */
        public static /* synthetic */ void m34937e(C36040b bVar, UAirship uAirship, C9304f fVar, C17970d dVar) {
            JobResult x = bVar.mo17814x(uAirship, fVar);
            C36059m.m148419o("Finished: %s with result: %s", fVar, x);
            dVar.accept(x);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m34938f(C9304f fVar, C17970d dVar) {
            UAirship e0 = UAirship.m146195e0(5000);
            if (e0 == null) {
                C36059m.m148409e("UAirship not ready. Rescheduling job: %s", fVar);
                dVar.accept(JobResult.RETRY);
                return;
            }
            C36040b d = mo18736d(e0, fVar.mo18713b());
            if (d == null) {
                C36059m.m148409e("Unavailable to find airship components for jobInfo: %s", fVar);
                dVar.accept(JobResult.SUCCESS);
            } else if (!d.mo107787s()) {
                C36059m.m148406b("Component disabled. Dropping jobInfo: %s", fVar);
                dVar.accept(JobResult.SUCCESS);
            } else {
                d.mo18048q(fVar).execute(new C9309h(d, e0, fVar, dVar));
            }
        }

        /* renamed from: a */
        public void mo18735a(@C0359n0 C9304f fVar, @C0359n0 C17970d<JobResult> dVar) {
            this.f25412a.execute(new C9308g(this, fVar, dVar));
        }

        /* renamed from: d */
        public final C36040b mo18736d(@C0359n0 UAirship uAirship, String str) {
            if (C9669o0.m36224e(str)) {
                return null;
            }
            for (C36040b next : uAirship.mo106226q()) {
                if (next.getClass().getName().equals(str)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    void mo18735a(@C0359n0 C9304f fVar, @C0359n0 C17970d<JobResult> dVar);
}
