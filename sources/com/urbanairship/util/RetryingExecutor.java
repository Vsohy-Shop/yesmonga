package com.urbanairship.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36044d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RetryingExecutor implements Executor {

    /* renamed from: e */
    public static final C9635d f26391e = new C9635d(Status.FINISHED, -1, (C9632a) null);

    /* renamed from: f */
    public static final C9635d f26392f = new C9635d(Status.CANCEL, -1, (C9632a) null);

    /* renamed from: g */
    public static final long f26393g = 30000;

    /* renamed from: v */
    public static final long f26394v = 120000;

    /* renamed from: a */
    public final Handler f26395a;

    /* renamed from: b */
    public final Executor f26396b;

    /* renamed from: c */
    public boolean f26397c = false;

    /* renamed from: d */
    public final List<Runnable> f26398d = new ArrayList();

    public enum Status {
        FINISHED,
        RETRY,
        CANCEL
    }

    /* renamed from: com.urbanairship.util.RetryingExecutor$a */
    public class C9632a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9634c f26403a;

        /* renamed from: b */
        public final /* synthetic */ long f26404b;

        public C9632a(C9634c cVar, long j) {
            this.f26403a = cVar;
            this.f26404b = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m36109b(C9634c cVar, long j) {
            RetryingExecutor retryingExecutor = RetryingExecutor.this;
            retryingExecutor.mo19591k(cVar, retryingExecutor.mo19589h(j));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
            if (com.urbanairship.util.RetryingExecutor.C9635d.m36110a(r0) != com.urbanairship.util.RetryingExecutor.Status.f26400b) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
            if (com.urbanairship.util.RetryingExecutor.C9635d.m36111b(r0) < 0) goto L_0x0038;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
            r0 = com.urbanairship.util.RetryingExecutor.C9635d.m36111b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
            r0 = r7.f26404b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
            com.urbanairship.util.RetryingExecutor.m36095e(r7.f26405c).postAtTime(new com.urbanairship.util.C9659k0(r7, r7.f26403a, r0), com.urbanairship.util.RetryingExecutor.m36094d(r7.f26405c), android.os.SystemClock.uptimeMillis() + r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
            r0 = r7.f26403a.run();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                com.urbanairship.util.RetryingExecutor r0 = com.urbanairship.util.RetryingExecutor.this
                java.util.List r0 = r0.f26398d
                monitor-enter(r0)
                com.urbanairship.util.RetryingExecutor r1 = com.urbanairship.util.RetryingExecutor.this     // Catch:{ all -> 0x0056 }
                boolean r1 = r1.f26397c     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x001a
                com.urbanairship.util.RetryingExecutor r1 = com.urbanairship.util.RetryingExecutor.this     // Catch:{ all -> 0x0056 }
                java.util.List r1 = r1.f26398d     // Catch:{ all -> 0x0056 }
                r1.add(r7)     // Catch:{ all -> 0x0056 }
                monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                return
            L_0x001a:
                monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                com.urbanairship.util.RetryingExecutor$c r0 = r7.f26403a
                com.urbanairship.util.RetryingExecutor$d r0 = r0.run()
                com.urbanairship.util.RetryingExecutor$Status r1 = r0.f26408a
                com.urbanairship.util.RetryingExecutor$Status r2 = com.urbanairship.util.RetryingExecutor.Status.RETRY
                if (r1 != r2) goto L_0x0055
                long r1 = r0.f26409b
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L_0x0038
                long r0 = r0.f26409b
                goto L_0x003a
            L_0x0038:
                long r0 = r7.f26404b
            L_0x003a:
                com.urbanairship.util.RetryingExecutor r2 = com.urbanairship.util.RetryingExecutor.this
                android.os.Handler r2 = r2.f26395a
                com.urbanairship.util.RetryingExecutor$c r3 = r7.f26403a
                com.urbanairship.util.k0 r4 = new com.urbanairship.util.k0
                r4.<init>(r7, r3, r0)
                com.urbanairship.util.RetryingExecutor r3 = com.urbanairship.util.RetryingExecutor.this
                java.util.concurrent.Executor r3 = r3.f26396b
                long r5 = android.os.SystemClock.uptimeMillis()
                long r5 = r5 + r0
                r2.postAtTime(r4, r3, r5)
            L_0x0055:
                return
            L_0x0056:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.util.RetryingExecutor.C9632a.run():void");
        }
    }

    /* renamed from: com.urbanairship.util.RetryingExecutor$b */
    public class C9633b implements C9634c {

        /* renamed from: a */
        public final List<? extends C9634c> f26406a;

        public C9633b(@C0359n0 List<? extends C9634c> list) {
            this.f26406a = new ArrayList(list);
        }

        @C0359n0
        public C9635d run() {
            if (this.f26406a.isEmpty()) {
                return RetryingExecutor.m36098m();
            }
            C9635d run = ((C9634c) this.f26406a.get(0)).run();
            if (run.f26408a == Status.FINISHED) {
                this.f26406a.remove(0);
                RetryingExecutor.this.mo19590j(this);
            }
            return run;
        }
    }

    /* renamed from: com.urbanairship.util.RetryingExecutor$c */
    public interface C9634c {
        @C0359n0
        C9635d run();
    }

    /* renamed from: com.urbanairship.util.RetryingExecutor$d */
    public static class C9635d {

        /* renamed from: a */
        public final Status f26408a;

        /* renamed from: b */
        public final long f26409b;

        public /* synthetic */ C9635d(Status status, long j, C9632a aVar) {
            this(status, j);
        }

        public C9635d(Status status, long j) {
            this.f26408a = status;
            this.f26409b = j;
        }
    }

    public RetryingExecutor(@C0359n0 Handler handler, @C0359n0 Executor executor) {
        this.f26395a = handler;
        this.f26396b = executor;
    }

    /* renamed from: i */
    public static C9635d m36097i() {
        return f26392f;
    }

    /* renamed from: m */
    public static C9635d m36098m() {
        return f26391e;
    }

    /* renamed from: o */
    public static RetryingExecutor m36100o(Looper looper) {
        return new RetryingExecutor(new Handler(looper), C36044d.m148369a());
    }

    /* renamed from: p */
    public static C9635d m36101p() {
        return new C9635d(Status.RETRY, -1, (C9632a) null);
    }

    /* renamed from: q */
    public static C9635d m36102q(long j) {
        return new C9635d(Status.RETRY, j, (C9632a) null);
    }

    public void execute(@C0359n0 Runnable runnable) {
        mo19590j(new C9657j0(runnable));
    }

    /* renamed from: h */
    public final long mo19589h(long j) {
        if (j <= 0) {
            return 30000;
        }
        return Math.min(j * 2, f26394v);
    }

    /* renamed from: j */
    public void mo19590j(@C0359n0 C9634c cVar) {
        mo19591k(cVar, 30000);
    }

    /* renamed from: k */
    public void mo19591k(@C0359n0 C9634c cVar, long j) {
        this.f26396b.execute(new C9632a(cVar, j));
    }

    /* renamed from: l */
    public void mo19592l(@C0359n0 C9634c... cVarArr) {
        mo19590j(new C9633b(Arrays.asList(cVarArr)));
    }

    /* renamed from: r */
    public void mo19593r(boolean z) {
        if (z != this.f26397c) {
            synchronized (this.f26398d) {
                this.f26397c = z;
                if (!z && !this.f26398d.isEmpty()) {
                    ArrayList<Runnable> arrayList = new ArrayList<>(this.f26398d);
                    this.f26398d.clear();
                    for (Runnable execute : arrayList) {
                        this.f26396b.execute(execute);
                    }
                }
            }
        }
    }
}
