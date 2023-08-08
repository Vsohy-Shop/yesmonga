package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.common.util.concurrent.C32487a;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.a1 */
public interface C1432a1<T> {

    /* renamed from: androidx.camera.core.impl.a1$a */
    public interface C1433a<T> {
        /* renamed from: a */
        void mo5189a(@C0363p0 T t);

        void onError(@C0359n0 Throwable th);
    }

    @C0359n0
    /* renamed from: a */
    C32487a<T> mo5186a();

    /* renamed from: b */
    void mo5187b(@C0359n0 Executor executor, @C0359n0 C1433a<T> aVar);

    /* renamed from: c */
    void mo5188c(@C0359n0 C1433a<T> aVar);
}
