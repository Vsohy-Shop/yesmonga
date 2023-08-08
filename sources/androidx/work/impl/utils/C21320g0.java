package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.C21094f;
import androidx.work.C21095g;
import androidx.work.C21377l;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C21185a;
import androidx.work.impl.foreground.C21186b;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21253v;
import androidx.work.impl.model.C21273x;
import androidx.work.impl.utils.futures.C21317a;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.google.common.util.concurrent.C32487a;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.g0 */
public class C21320g0 implements C21095g {

    /* renamed from: d */
    public static final String f55008d = C21377l.m98584i("WMFgUpdater");

    /* renamed from: a */
    public final C21345b f55009a;

    /* renamed from: b */
    public final C21185a f55010b;

    /* renamed from: c */
    public final C21253v f55011c;

    /* renamed from: androidx.work.impl.utils.g0$a */
    public class C21321a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C21317a f55012a;

        /* renamed from: b */
        public final /* synthetic */ UUID f55013b;

        /* renamed from: c */
        public final /* synthetic */ C21094f f55014c;

        /* renamed from: d */
        public final /* synthetic */ Context f55015d;

        public C21321a(C21317a aVar, UUID uuid, C21094f fVar, Context context) {
            this.f55012a = aVar;
            this.f55013b = uuid;
            this.f55014c = fVar;
            this.f55015d = context;
        }

        public void run() {
            try {
                if (!this.f55012a.isCancelled()) {
                    String uuid = this.f55013b.toString();
                    C21249u l = C21320g0.this.f55011c.mo63539l(uuid);
                    if (l == null || l.f54805b.mo63047q()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C21320g0.this.f55010b.mo63346c(uuid, this.f55014c);
                    this.f55015d.startService(C21186b.m97916e(this.f55015d, C21273x.m98280a(l), this.f55014c));
                }
                this.f55012a.mo63659p(null);
            } catch (Throwable th) {
                this.f55012a.mo63660r(th);
            }
        }
    }

    public C21320g0(@C0359n0 WorkDatabase workDatabase, @C0359n0 C21185a aVar, @C0359n0 C21345b bVar) {
        this.f55010b = aVar;
        this.f55009a = bVar;
        this.f55011c = workDatabase.mo63207X();
    }

    @C0359n0
    /* renamed from: a */
    public C32487a<Void> mo63199a(@C0359n0 Context context, @C0359n0 UUID uuid, @C0359n0 C21094f fVar) {
        C21317a v = C21317a.m98425v();
        this.f55009a.mo63700c(new C21321a(v, uuid, fVar, context));
        return v;
    }
}
