package com.android.volley.toolbox;

import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.android.volley.AuthFailureError;
import com.android.volley.C21776s;
import com.android.volley.Request;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.android.volley.toolbox.c */
public abstract class C21786c extends C21794e {

    /* renamed from: a */
    public ExecutorService f56363a;

    /* renamed from: b */
    public ExecutorService f56364b;

    /* renamed from: com.android.volley.toolbox.c$a */
    public class C21787a implements C21788b {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f56365a;

        /* renamed from: b */
        public final /* synthetic */ CountDownLatch f56366b;

        public C21787a(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f56365a = atomicReference;
            this.f56366b = countDownLatch;
        }

        /* renamed from: a */
        public void mo64990a(C21813n nVar) {
            this.f56365a.set(new C21789c(nVar, (IOException) null, (AuthFailureError) null, (C21787a) null));
            this.f56366b.countDown();
        }

        /* renamed from: b */
        public void mo64991b(IOException iOException) {
            this.f56365a.set(new C21789c((C21813n) null, iOException, (AuthFailureError) null, (C21787a) null));
            this.f56366b.countDown();
        }

        /* renamed from: c */
        public void mo64992c(AuthFailureError authFailureError) {
            this.f56365a.set(new C21789c((C21813n) null, (IOException) null, authFailureError, (C21787a) null));
            this.f56366b.countDown();
        }
    }

    /* renamed from: com.android.volley.toolbox.c$b */
    public interface C21788b {
        /* renamed from: a */
        void mo64990a(C21813n nVar);

        /* renamed from: b */
        void mo64991b(IOException iOException);

        /* renamed from: c */
        void mo64992c(AuthFailureError authFailureError);
    }

    /* renamed from: com.android.volley.toolbox.c$c */
    public static class C21789c {

        /* renamed from: a */
        public C21813n f56368a;

        /* renamed from: b */
        public IOException f56369b;

        /* renamed from: c */
        public AuthFailureError f56370c;

        public /* synthetic */ C21789c(C21813n nVar, IOException iOException, AuthFailureError authFailureError, C21787a aVar) {
            this(nVar, iOException, authFailureError);
        }

        public C21789c(@C0363p0 C21813n nVar, @C0363p0 IOException iOException, @C0363p0 AuthFailureError authFailureError) {
            this.f56368a = nVar;
            this.f56369b = iOException;
            this.f56370c = authFailureError;
        }
    }

    /* renamed from: b */
    public final C21813n mo64980b(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        mo64881c(request, map, new C21787a(atomicReference, countDownLatch));
        try {
            countDownLatch.await();
            C21789c cVar = (C21789c) atomicReference.get();
            C21813n nVar = cVar.f56368a;
            if (nVar != null) {
                return nVar;
            }
            IOException iOException = cVar.f56369b;
            if (iOException != null) {
                throw iOException;
            }
            throw cVar.f56370c;
        } catch (InterruptedException e) {
            C21776s.m100100d(e, "while waiting for CountDownLatch", new Object[0]);
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(e.toString());
        }
    }

    /* renamed from: c */
    public abstract void mo64881c(Request<?> request, Map<String, String> map, C21788b bVar);

    /* renamed from: d */
    public ExecutorService mo64986d() {
        return this.f56363a;
    }

    /* renamed from: e */
    public ExecutorService mo64987e() {
        return this.f56364b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public void mo64988f(ExecutorService executorService) {
        this.f56363a = executorService;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public void mo64989g(ExecutorService executorService) {
        this.f56364b = executorService;
    }
}
