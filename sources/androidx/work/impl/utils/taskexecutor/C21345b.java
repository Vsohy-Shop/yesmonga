package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.taskexecutor.b */
public interface C21345b {
    @C0359n0
    /* renamed from: a */
    Executor mo63698a();

    @C0359n0
    /* renamed from: b */
    C21344a mo63699b();

    /* renamed from: c */
    void mo63700c(@C0359n0 Runnable runnable) {
        mo63699b().execute(runnable);
    }
}
