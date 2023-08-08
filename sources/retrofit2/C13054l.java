package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.C12451Response;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.C12465c0;
import okio.C12500m;
import okio.C12507o;
import okio.C12510p0;
import okio.C12516r0;
import okio.C12522u;

/* renamed from: retrofit2.l */
public final class C13054l<T> implements C12983b<T> {

    /* renamed from: a */
    public final C13089v f32041a;

    /* renamed from: b */
    public final Object[] f32042b;

    /* renamed from: c */
    public final Call.Factory f32043c;

    /* renamed from: d */
    public final C13015f<ResponseBody, T> f32044d;

    /* renamed from: e */
    public volatile boolean f32045e;
    @GuardedBy("this")
    @Nullable

    /* renamed from: f */
    public Call f32046f;
    @GuardedBy("this")
    @Nullable

    /* renamed from: g */
    public Throwable f32047g;
    @GuardedBy("this")

    /* renamed from: v */
    public boolean f32048v;

    /* renamed from: retrofit2.l$a */
    public class C13055a implements Callback {

        /* renamed from: a */
        public final /* synthetic */ C13008d f32049a;

        public C13055a(C13008d dVar) {
            this.f32049a = dVar;
        }

        /* renamed from: a */
        public final void mo30531a(Throwable th) {
            try {
                this.f32049a.mo30434a(C13054l.this, th);
            } catch (Throwable th2) {
                C12984b0.m56301s(th2);
                th2.printStackTrace();
            }
        }

        public void onFailure(Call call, IOException iOException) {
            mo30531a(iOException);
        }

        public void onResponse(Call call, C12451Response response) {
            try {
                try {
                    this.f32049a.mo30435b(C13054l.this, C13054l.this.mo30530f(response));
                } catch (Throwable th) {
                    C12984b0.m56301s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C12984b0.m56301s(th2);
                mo30531a(th2);
            }
        }
    }

    /* renamed from: retrofit2.l$b */
    public static final class C13056b extends ResponseBody {

        /* renamed from: a */
        public final ResponseBody f32051a;

        /* renamed from: b */
        public final C12507o f32052b;
        @Nullable

        /* renamed from: c */
        public IOException f32053c;

        /* renamed from: retrofit2.l$b$a */
        public class C13057a extends C12522u {
            public C13057a(C12510p0 p0Var) {
                super(p0Var);
            }

            public long read(C12500m mVar, long j) throws IOException {
                try {
                    return super.read(mVar, j);
                } catch (IOException e) {
                    C13056b.this.f32053c = e;
                    throw e;
                }
            }
        }

        public C13056b(ResponseBody responseBody) {
            this.f32051a = responseBody;
            this.f32052b = C12465c0.m50481d(new C13057a(responseBody.source()));
        }

        /* renamed from: a */
        public void mo30532a() throws IOException {
            IOException iOException = this.f32053c;
            if (iOException != null) {
                throw iOException;
            }
        }

        public void close() {
            this.f32051a.close();
        }

        public long contentLength() {
            return this.f32051a.contentLength();
        }

        public MediaType contentType() {
            return this.f32051a.contentType();
        }

        public C12507o source() {
            return this.f32052b;
        }
    }

    /* renamed from: retrofit2.l$c */
    public static final class C13058c extends ResponseBody {
        @Nullable

        /* renamed from: a */
        public final MediaType f32055a;

        /* renamed from: b */
        public final long f32056b;

        public C13058c(@Nullable MediaType mediaType, long j) {
            this.f32055a = mediaType;
            this.f32056b = j;
        }

        public long contentLength() {
            return this.f32056b;
        }

        public MediaType contentType() {
            return this.f32055a;
        }

        public C12507o source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C13054l(C13089v vVar, Object[] objArr, Call.Factory factory, C13015f<ResponseBody, T> fVar) {
        this.f32041a = vVar;
        this.f32042b = objArr;
        this.f32043c = factory;
        this.f32044d = fVar;
    }

    /* renamed from: b */
    public C13054l<T> clone() {
        return new C13054l<>(this.f32041a, this.f32042b, this.f32043c, this.f32044d);
    }

    /* renamed from: c */
    public final Call mo30528c() throws IOException {
        Call newCall = this.f32043c.newCall(this.f32041a.mo30563a(this.f32042b));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public void cancel() {
        Call call;
        this.f32045e = true;
        synchronized (this) {
            call = this.f32046f;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @GuardedBy("this")
    /* renamed from: e */
    public final Call mo30529e() throws IOException {
        Call call = this.f32046f;
        if (call != null) {
            return call;
        }
        Throwable th = this.f32047g;
        if (th == null) {
            try {
                Call c = mo30528c();
                this.f32046f = c;
                return c;
            } catch (IOException | Error | RuntimeException e) {
                C12984b0.m56301s(e);
                this.f32047g = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public C13091w<T> execute() throws IOException {
        Call e;
        synchronized (this) {
            if (!this.f32048v) {
                this.f32048v = true;
                e = mo30529e();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f32045e) {
            e.cancel();
        }
        return mo30530f(FirebasePerfOkHttpClient.execute(e));
    }

    /* renamed from: f */
    public C13091w<T> mo30530f(C12451Response response) throws IOException {
        ResponseBody body = response.body();
        C12451Response build = response.newBuilder().body(new C13058c(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return C13091w.m56445d(C12984b0.m56283a(body), build);
            } finally {
                body.close();
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return C13091w.m56449m(null, build);
        } else {
            C13056b bVar = new C13056b(body);
            try {
                return C13091w.m56449m(this.f32044d.convert(bVar), build);
            } catch (RuntimeException e) {
                bVar.mo30532a();
                throw e;
            }
        }
    }

    public boolean isCanceled() {
        boolean z = true;
        if (this.f32045e) {
            return true;
        }
        synchronized (this) {
            Call call = this.f32046f;
            if (call == null || !call.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    public synchronized boolean isExecuted() {
        return this.f32048v;
    }

    /* renamed from: k1 */
    public void mo30458k1(C13008d<T> dVar) {
        Call call;
        Throwable th;
        Objects.requireNonNull(dVar, "callback == null");
        synchronized (this) {
            if (!this.f32048v) {
                this.f32048v = true;
                call = this.f32046f;
                th = this.f32047g;
                if (call == null && th == null) {
                    try {
                        Call c = mo30528c();
                        this.f32046f = c;
                        call = c;
                    } catch (Throwable th2) {
                        th = th2;
                        C12984b0.m56301s(th);
                        this.f32047g = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.mo30434a(this, th);
            return;
        }
        if (this.f32045e) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new C13055a(dVar));
    }

    public synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return mo30529e().request();
    }

    public synchronized C12516r0 timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return mo30529e().timeout();
    }
}
