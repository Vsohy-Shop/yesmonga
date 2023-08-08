package com.urbanairship.job;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.C21372k;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.C32487a;
import com.urbanairship.C36059m;
import com.urbanairship.json.JsonException;
import java.util.UUID;

public class AirshipWorker extends C21372k {

    /* renamed from: com.urbanairship.job.AirshipWorker$a */
    public static /* synthetic */ class C9295a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25349a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.urbanairship.job.JobResult[] r0 = com.urbanairship.job.JobResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25349a = r0
                com.urbanairship.job.JobResult r1 = com.urbanairship.job.JobResult.RETRY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25349a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.urbanairship.job.JobResult r1 = com.urbanairship.job.JobResult.FAILURE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25349a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.urbanairship.job.JobResult r1 = com.urbanairship.job.JobResult.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.job.AirshipWorker.C9295a.<clinit>():void");
        }
    }

    public AirshipWorker(@C0359n0 Context context, @C0359n0 WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: y */
    public static /* synthetic */ void m34880y(CallbackToFutureAdapter.C16559a aVar, JobResult jobResult) {
        int i = C9295a.f25349a[jobResult.ordinal()];
        if (i == 1) {
            aVar.mo48125c(C21372k.C21373a.m98575d());
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            aVar.mo48125c(C21372k.C21373a.m98576e());
        }
        aVar.mo48125c(C21372k.C21373a.m98573a());
        aVar.mo48125c(C21372k.C21373a.m98576e());
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ Object m34881z(CallbackToFutureAdapter.C16559a aVar) throws Exception {
        C9304f A = mo18695A();
        if (A == null) {
            return Boolean.valueOf(aVar.mo48125c(C21372k.C21373a.m98573a()));
        }
        UUID e = mo63749e();
        int i = mo63752i();
        C36059m.m148419o("Running job: %s, work Id: %s run attempt: %s", A, e, Integer.valueOf(i));
        C9302e.m34896n(mo63747b()).mo18709j(A, (long) i, new C9298a(aVar));
        return A;
    }

    @C0363p0
    /* renamed from: A */
    public final C9304f mo18695A() {
        try {
            return C9314l.m34947b(mo63750g());
        } catch (JsonException e) {
            C36059m.m148411g(e, "Failed to parse jobInfo.", new Object[0]);
            return null;
        }
    }

    @C0359n0
    /* renamed from: u */
    public C32487a<C21372k.C21373a> mo18696u() {
        return CallbackToFutureAdapter.m74987a(new C9299b(this));
    }
}
