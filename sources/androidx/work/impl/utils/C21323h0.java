package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21091d;
import androidx.work.C21377l;
import androidx.work.C21407r;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C21242q;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.utils.futures.C21317a;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.carrefour.fid.android.core.extension.C36306e;
import com.google.common.util.concurrent.C32487a;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.h0 */
public class C21323h0 implements C21407r {

    /* renamed from: c */
    public static final String f55017c = C21377l.m98584i("WorkProgressUpdater");

    /* renamed from: a */
    public final WorkDatabase f55018a;

    /* renamed from: b */
    public final C21345b f55019b;

    /* renamed from: androidx.work.impl.utils.h0$a */
    public class C21324a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ UUID f55020a;

        /* renamed from: b */
        public final /* synthetic */ C21091d f55021b;

        /* renamed from: c */
        public final /* synthetic */ C21317a f55022c;

        public C21324a(UUID uuid, C21091d dVar, C21317a aVar) {
            this.f55020a = uuid;
            this.f55021b = dVar;
            this.f55022c = aVar;
        }

        public void run() {
            String uuid = this.f55020a.toString();
            C21377l e = C21377l.m98582e();
            String str = C21323h0.f55017c;
            e.mo63774a(str, "Updating progress for " + this.f55020a + C36306e.f89637a + this.f55021b + ")");
            C21323h0.this.f55018a.mo60905e();
            try {
                C21249u l = C21323h0.this.f55018a.mo63207X().mo63539l(uuid);
                if (l != null) {
                    if (l.f54805b == WorkInfo.State.f54360b) {
                        C21323h0.this.f55018a.mo63206W().mo63451d(new C21242q(uuid, this.f55021b));
                    } else {
                        C21377l e2 = C21377l.m98582e();
                        e2.mo63782l(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid + ") is not in a RUNNING state.");
                    }
                    this.f55022c.mo63659p(null);
                    C21323h0.this.f55018a.mo60901O();
                    C21323h0.this.f55018a.mo60908k();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            } catch (Throwable th) {
                C21323h0.this.f55018a.mo60908k();
                throw th;
            }
        }
    }

    public C21323h0(@C0359n0 WorkDatabase workDatabase, @C0359n0 C21345b bVar) {
        this.f55018a = workDatabase;
        this.f55019b = bVar;
    }

    @C0359n0
    /* renamed from: a */
    public C32487a<Void> mo63677a(@C0359n0 Context context, @C0359n0 UUID uuid, @C0359n0 C21091d dVar) {
        C21317a v = C21317a.m98425v();
        this.f55019b.mo63700c(new C21324a(uuid, dVar, v));
        return v;
    }
}
