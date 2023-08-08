package androidx.core.p027os;

import android.os.Handler;
import androidx.annotation.C0359n0;
import androidx.core.util.C18001r;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.core.os.h */
public final class C17792h {

    /* renamed from: androidx.core.os.h$a */
    public static class C17793a implements Executor {

        /* renamed from: a */
        public final Handler f46183a;

        public C17793a(@C0359n0 Handler handler) {
            this.f46183a = (Handler) C18001r.m81775l(handler);
        }

        public void execute(@C0359n0 Runnable runnable) {
            if (!this.f46183a.post((Runnable) C18001r.m81775l(runnable))) {
                throw new RejectedExecutionException(this.f46183a + " is shutting down");
            }
        }
    }

    @C0359n0
    /* renamed from: a */
    public static Executor m81182a(@C0359n0 Handler handler) {
        return new C17793a(handler);
    }
}
