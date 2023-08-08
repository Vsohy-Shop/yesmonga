package androidx.work;

import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.work.C21372k;
import androidx.work.impl.utils.futures.C21317a;
import com.google.common.util.concurrent.C32487a;

public abstract class Worker extends C21372k {

    /* renamed from: e */
    public C21317a<C21372k.C21373a> f54371e;

    /* renamed from: androidx.work.Worker$a */
    public class C21079a implements Runnable {
        public C21079a() {
        }

        public void run() {
            try {
                Worker.this.f54371e.mo63659p(Worker.this.mo63077w());
            } catch (Throwable th) {
                Worker.this.f54371e.mo63660r(th);
            }
        }
    }

    /* renamed from: androidx.work.Worker$b */
    public class C21080b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C21317a f54373a;

        public C21080b(C21317a aVar) {
            this.f54373a = aVar;
        }

        public void run() {
            try {
                this.f54373a.mo63659p(Worker.this.mo63078x());
            } catch (Throwable th) {
                this.f54373a.mo63660r(th);
            }
        }
    }

    public Worker(@C0359n0 Context context, @C0359n0 WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @C0359n0
    /* renamed from: d */
    public C32487a<C21094f> mo63076d() {
        C21317a v = C21317a.m98425v();
        mo63748c().execute(new C21080b(v));
        return v;
    }

    @C0359n0
    /* renamed from: u */
    public final C32487a<C21372k.C21373a> mo18696u() {
        this.f54371e = C21317a.m98425v();
        mo63748c().execute(new C21079a());
        return this.f54371e;
    }

    @C0348i1
    @C0359n0
    /* renamed from: w */
    public abstract C21372k.C21373a mo63077w();

    @C0348i1
    @C0359n0
    /* renamed from: x */
    public C21094f mo63078x() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
