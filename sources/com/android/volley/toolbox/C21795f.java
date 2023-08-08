package com.android.volley.toolbox;

import android.os.SystemClock;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.android.volley.AuthFailureError;
import com.android.volley.C21715b;
import com.android.volley.C21759i;
import com.android.volley.C21762l;
import com.android.volley.C21770o;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.C21786c;
import com.android.volley.toolbox.C21831v;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.android.volley.toolbox.f */
public class C21795f extends C21715b {

    /* renamed from: d */
    public final C21786c f56374d;

    /* renamed from: e */
    public final C21801h f56375e;

    /* renamed from: com.android.volley.toolbox.f$a */
    public class C21796a implements C21786c.C21788b {

        /* renamed from: a */
        public final /* synthetic */ Request f56376a;

        /* renamed from: b */
        public final /* synthetic */ long f56377b;

        /* renamed from: c */
        public final /* synthetic */ C21715b.C21717b f56378c;

        public C21796a(Request request, long j, C21715b.C21717b bVar) {
            this.f56376a = request;
            this.f56377b = j;
            this.f56378c = bVar;
        }

        /* renamed from: a */
        public void mo64990a(C21813n nVar) {
            C21795f.this.mo64996n(this.f56376a, this.f56377b, nVar, this.f56378c);
        }

        /* renamed from: b */
        public void mo64991b(IOException iOException) {
            C21795f.this.mo64995m(this.f56376a, this.f56378c, iOException, this.f56377b, (C21813n) null, (byte[]) null);
        }

        /* renamed from: c */
        public void mo64992c(AuthFailureError authFailureError) {
            this.f56378c.mo64842a(authFailureError);
        }
    }

    /* renamed from: com.android.volley.toolbox.f$b */
    public static class C21797b {

        /* renamed from: c */
        public static final int f56380c = 4096;
        @C0359n0

        /* renamed from: a */
        public C21786c f56381a;

        /* renamed from: b */
        public C21801h f56382b = null;

        public C21797b(@C0359n0 C21786c cVar) {
            this.f56381a = cVar;
        }

        /* renamed from: a */
        public C21795f mo64998a() {
            if (this.f56382b == null) {
                this.f56382b = new C21801h(4096);
            }
            return new C21795f(this.f56381a, this.f56382b, (C21796a) null);
        }

        /* renamed from: b */
        public C21797b mo64999b(C21801h hVar) {
            this.f56382b = hVar;
            return this;
        }
    }

    /* renamed from: com.android.volley.toolbox.f$c */
    public class C21798c<T> extends C21770o<T> {

        /* renamed from: b */
        public final Request<T> f56383b;

        /* renamed from: c */
        public final C21831v.C21833b f56384c;

        /* renamed from: d */
        public final C21715b.C21717b f56385d;

        public C21798c(Request<T> request, C21831v.C21833b bVar, C21715b.C21717b bVar2) {
            super(request);
            this.f56383b = request;
            this.f56384c = bVar;
            this.f56385d = bVar2;
        }

        public void run() {
            try {
                C21831v.m100291a(this.f56383b, this.f56384c);
                C21795f.this.mo64838e(this.f56383b, this.f56385d);
            } catch (VolleyError e) {
                this.f56385d.mo64842a(e);
            }
        }
    }

    /* renamed from: com.android.volley.toolbox.f$d */
    public class C21799d<T> extends C21770o<T> {

        /* renamed from: b */
        public InputStream f56387b;

        /* renamed from: c */
        public C21813n f56388c;

        /* renamed from: d */
        public Request<T> f56389d;

        /* renamed from: e */
        public C21715b.C21717b f56390e;

        /* renamed from: f */
        public long f56391f;

        /* renamed from: g */
        public List<C21759i> f56392g;

        /* renamed from: v */
        public int f56393v;

        public C21799d(InputStream inputStream, C21813n nVar, Request<T> request, C21715b.C21717b bVar, long j, List<C21759i> list, int i) {
            super(request);
            this.f56387b = inputStream;
            this.f56388c = nVar;
            this.f56389d = request;
            this.f56390e = bVar;
            this.f56391f = j;
            this.f56392g = list;
            this.f56393v = i;
        }

        public void run() {
            try {
                C21795f.this.mo64997o(this.f56391f, this.f56393v, this.f56388c, this.f56389d, this.f56390e, this.f56392g, C21831v.m100293c(this.f56387b, this.f56388c.mo65026c(), C21795f.this.f56375e));
            } catch (IOException e) {
                C21795f.this.mo64995m(this.f56389d, this.f56390e, e, this.f56391f, this.f56388c, (byte[]) null);
            }
        }
    }

    public /* synthetic */ C21795f(C21786c cVar, C21801h hVar, C21796a aVar) {
        this(cVar, hVar);
    }

    /* renamed from: e */
    public void mo64838e(Request<?> request, C21715b.C21717b bVar) {
        if (mo64835b() != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f56374d.mo64881c(request, C21812m.m100213c(request.mo64796Z()), new C21796a(request, elapsedRealtime, bVar));
            return;
        }
        throw new IllegalStateException("mBlockingExecuter must be set before making a request");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public void mo64839f(ExecutorService executorService) {
        super.mo64839f(executorService);
        this.f56374d.mo64988f(executorService);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public void mo64840g(ExecutorService executorService) {
        super.mo64840g(executorService);
        this.f56374d.mo64989g(executorService);
    }

    /* renamed from: m */
    public final void mo64995m(Request<?> request, C21715b.C21717b bVar, IOException iOException, long j, @C0363p0 C21813n nVar, @C0363p0 byte[] bArr) {
        try {
            mo64835b().execute(new C21798c(request, C21831v.m100295e(request, iOException, j, nVar, bArr), bVar));
        } catch (VolleyError e) {
            bVar.mo64842a(e);
        }
    }

    /* renamed from: n */
    public final void mo64996n(Request<?> request, long j, C21813n nVar, C21715b.C21717b bVar) {
        int e = nVar.mo65028e();
        List<C21759i> d = nVar.mo65027d();
        if (e == 304) {
            Request<?> request2 = request;
            bVar.mo64843b(C21831v.m100292b(request, SystemClock.elapsedRealtime() - j, d));
            return;
        }
        Request<?> request3 = request;
        C21715b.C21717b bVar2 = bVar;
        byte[] b = nVar.mo65025b();
        if (b == null && nVar.mo65024a() == null) {
            b = new byte[0];
        }
        byte[] bArr = b;
        if (bArr != null) {
            mo64997o(j, e, nVar, request, bVar, d, bArr);
            return;
        }
        mo64835b().execute(new C21799d(nVar.mo65024a(), nVar, request, bVar, j, d, e));
    }

    /* renamed from: o */
    public final void mo64997o(long j, int i, C21813n nVar, Request<?> request, C21715b.C21717b bVar, List<C21759i> list, byte[] bArr) {
        int i2 = i;
        Request<?> request2 = request;
        C21831v.m100294d(SystemClock.elapsedRealtime() - j, request, bArr, i);
        if (i2 < 200 || i2 > 299) {
            C21715b.C21717b bVar2 = bVar;
            mo64995m(request, bVar, new IOException(), j, nVar, bArr);
            return;
        }
        C21762l lVar = new C21762l(i, bArr, false, SystemClock.elapsedRealtime() - j, list);
        C21715b.C21717b bVar3 = bVar;
        bVar.mo64843b(lVar);
    }

    public C21795f(C21786c cVar, C21801h hVar) {
        this.f56374d = cVar;
        this.f56375e = hVar;
    }
}
