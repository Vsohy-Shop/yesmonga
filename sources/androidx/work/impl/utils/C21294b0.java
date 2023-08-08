package androidx.work.impl.utils;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.b0 */
public class C21294b0 implements Executor {
    public void execute(@C0359n0 Runnable runnable) {
        runnable.run();
    }
}
