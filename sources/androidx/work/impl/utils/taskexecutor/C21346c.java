package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.C21352x;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.taskexecutor.c */
public class C21346c implements C21345b {

    /* renamed from: a */
    public final C21352x f55057a;

    /* renamed from: b */
    public final Handler f55058b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Executor f55059c = new C21347a();

    /* renamed from: androidx.work.impl.utils.taskexecutor.c$a */
    public class C21347a implements Executor {
        public C21347a() {
        }

        public void execute(@C0359n0 Runnable runnable) {
            C21346c.this.f55058b.post(runnable);
        }
    }

    public C21346c(@C0359n0 Executor executor) {
        this.f55057a = new C21352x(executor);
    }

    @C0359n0
    /* renamed from: a */
    public Executor mo63698a() {
        return this.f55059c;
    }

    @C0359n0
    /* renamed from: d */
    public C21352x mo63699b() {
        return this.f55057a;
    }
}
