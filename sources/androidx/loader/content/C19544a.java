package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.p027os.OperationCanceledException;
import androidx.core.util.C17985h0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: androidx.loader.content.a */
public abstract class C19544a<D> extends C19547c<D> {

    /* renamed from: p */
    public static final String f49956p = "AsyncTaskLoader";

    /* renamed from: q */
    public static final boolean f49957q = false;

    /* renamed from: j */
    public final Executor f49958j;

    /* renamed from: k */
    public volatile C19544a<D>.a f49959k;

    /* renamed from: l */
    public volatile C19544a<D>.a f49960l;

    /* renamed from: m */
    public long f49961m;

    /* renamed from: n */
    public long f49962n;

    /* renamed from: o */
    public Handler f49963o;

    /* renamed from: androidx.loader.content.a$a */
    public final class C19545a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* renamed from: F0 */
        public final CountDownLatch f49964F0 = new CountDownLatch(1);

        /* renamed from: G0 */
        public boolean f49965G0;

        public C19545a() {
        }

        /* renamed from: m */
        public void mo57763m(D d) {
            try {
                C19544a.this.mo57775E(this, d);
            } finally {
                this.f49964F0.countDown();
            }
        }

        /* renamed from: n */
        public void mo57764n(D d) {
            try {
                C19544a.this.mo57776F(this, d);
            } finally {
                this.f49964F0.countDown();
            }
        }

        public void run() {
            this.f49965G0 = false;
            C19544a.this.mo57777G();
        }

        /* renamed from: u */
        public D mo57754b(Void... voidArr) {
            try {
                return C19544a.this.mo57781K();
            } catch (OperationCanceledException e) {
                if (mo57761k()) {
                    return null;
                }
                throw e;
            }
        }

        /* renamed from: v */
        public void mo57789v() {
            try {
                this.f49964F0.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public C19544a(@C0359n0 Context context) {
        this(context, ModernAsyncTask.f49939z);
    }

    /* renamed from: D */
    public void mo57774D() {
    }

    /* renamed from: E */
    public void mo57775E(C19544a<D>.a aVar, D d) {
        mo57780J(d);
        if (this.f49960l == aVar) {
            mo57827x();
            this.f49962n = SystemClock.uptimeMillis();
            this.f49960l = null;
            mo57814e();
            mo57777G();
        }
    }

    /* renamed from: F */
    public void mo57776F(C19544a<D>.a aVar, D d) {
        if (this.f49959k != aVar) {
            mo57775E(aVar, d);
        } else if (mo57818k()) {
            mo57780J(d);
        } else {
            mo57812c();
            this.f49962n = SystemClock.uptimeMillis();
            this.f49959k = null;
            mo57803f(d);
        }
    }

    /* renamed from: G */
    public void mo57777G() {
        if (this.f49960l == null && this.f49959k != null) {
            if (this.f49959k.f49965G0) {
                this.f49959k.f49965G0 = false;
                this.f49963o.removeCallbacks(this.f49959k);
            }
            if (this.f49961m <= 0 || SystemClock.uptimeMillis() >= this.f49962n + this.f49961m) {
                this.f49959k.mo57756e(this.f49958j, (Params[]) null);
                return;
            }
            this.f49959k.f49965G0 = true;
            this.f49963o.postAtTime(this.f49959k, this.f49962n + this.f49961m);
        }
    }

    /* renamed from: H */
    public boolean mo57778H() {
        return this.f49960l != null;
    }

    @C0363p0
    /* renamed from: I */
    public abstract D mo57779I();

    /* renamed from: J */
    public void mo57780J(@C0363p0 D d) {
    }

    @C0363p0
    /* renamed from: K */
    public D mo57781K() {
        return mo57779I();
    }

    /* renamed from: L */
    public void mo57782L(long j) {
        this.f49961m = j;
        if (j != 0) {
            this.f49963o = new Handler();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: M */
    public void mo57783M() {
        C19544a<D>.a aVar = this.f49959k;
        if (aVar != null) {
            aVar.mo57789v();
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo57784g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo57784g(str, fileDescriptor, printWriter, strArr);
        if (this.f49959k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f49959k);
            printWriter.print(" waiting=");
            printWriter.println(this.f49959k.f49965G0);
        }
        if (this.f49960l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f49960l);
            printWriter.print(" waiting=");
            printWriter.println(this.f49960l.f49965G0);
        }
        if (this.f49961m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C17985h0.m81709c(this.f49961m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C17985h0.m81708b(this.f49962n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* renamed from: o */
    public boolean mo57785o() {
        if (this.f49959k == null) {
            return false;
        }
        if (!this.f49979e) {
            this.f49982h = true;
        }
        if (this.f49960l != null) {
            if (this.f49959k.f49965G0) {
                this.f49959k.f49965G0 = false;
                this.f49963o.removeCallbacks(this.f49959k);
            }
            this.f49959k = null;
            return false;
        } else if (this.f49959k.f49965G0) {
            this.f49959k.f49965G0 = false;
            this.f49963o.removeCallbacks(this.f49959k);
            this.f49959k = null;
            return false;
        } else {
            boolean a = this.f49959k.mo57753a(false);
            if (a) {
                this.f49960l = this.f49959k;
                mo57774D();
            }
            this.f49959k = null;
            return a;
        }
    }

    /* renamed from: q */
    public void mo57786q() {
        super.mo57786q();
        mo57811b();
        this.f49959k = new C19545a();
        mo57777G();
    }

    public C19544a(@C0359n0 Context context, @C0359n0 Executor executor) {
        super(context);
        this.f49962n = -10000;
        this.f49958j = executor;
    }
}
