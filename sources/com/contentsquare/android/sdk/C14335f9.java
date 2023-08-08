package com.contentsquare.android.sdk;

import androidx.core.util.C17994n;
import com.carrefour.fid.android.airship.util.C13758b;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.f9 */
public class C14335f9 {

    /* renamed from: a */
    public final ExecutorService f35392a;

    /* renamed from: b */
    public final C14347ff f35393b;

    /* renamed from: c */
    public final C14925z9 f35394c;

    /* renamed from: d */
    public final C14453jf f35395d = new C14453jf("BucketsDispatcher");

    /* renamed from: e */
    public final C14870xf f35396e;

    /* renamed from: f */
    public C14213b7 f35397f;

    /* renamed from: g */
    public String f35398g;

    /* renamed from: com.contentsquare.android.sdk.f9$a */
    public static final class C14336a implements Callable<C17994n<Boolean, String>> {

        /* renamed from: a */
        public final C14340c f35399a;

        /* renamed from: b */
        public final C14347ff f35400b;

        /* renamed from: c */
        public final C14925z9 f35401c;

        /* renamed from: d */
        public final String f35402d;

        /* renamed from: e */
        public final C14453jf f35403e;

        /* renamed from: f */
        public final C14339b f35404f;

        /* renamed from: g */
        public final C14870xf f35405g;

        /* renamed from: h */
        public C14213b7 f35406h;

        /* renamed from: com.contentsquare.android.sdk.f9$a$a */
        public class C14337a implements C14340c {
            /* renamed from: a */
            public void mo34817a() {
            }
        }

        /* renamed from: com.contentsquare.android.sdk.f9$a$b */
        public class C14338b implements C14339b {
            /* renamed from: a */
            public void mo34902a() {
            }
        }

        public C14336a(C14347ff ffVar, C14925z9 z9Var, C14453jf jfVar, String str, C14340c cVar, C14339b bVar, C14870xf xfVar, C14213b7 b7Var) {
            this.f35400b = ffVar;
            this.f35401c = z9Var;
            this.f35403e = jfVar;
            this.f35402d = str;
            this.f35399a = cVar;
            this.f35404f = bVar;
            this.f35405g = xfVar;
            this.f35406h = b7Var;
        }

        /* renamed from: a */
        public C17994n<Boolean, String> call() {
            C14485ke.m62427a();
            try {
                this.f35403e.mo35676e("Fetching the unsent buckets...");
                if (mo35175c()) {
                    this.f35399a.mo34817a();
                    return new C17994n<>(Boolean.TRUE, "All buckets were processed");
                }
                this.f35404f.mo34902a();
                return new C17994n<>(Boolean.FALSE, "The process was interrupted due to a problem in the chain");
            } catch (Exception e) {
                this.f35403e.mo35678g(e, "An exception was thrown while trying to send the buckets: ", new Object[0]);
                this.f35404f.mo34902a();
                return new C17994n<>(Boolean.FALSE, e.getMessage());
            }
        }

        /* renamed from: b */
        public final boolean mo35174b(List<JSONObject> list) {
            JSONObject a = C14886y6.m64137a(this.f35405g.mo36862a().mo34994a(list).mo34995b());
            this.f35403e.mo35674c("Calling HTTP request for bucket of %d items", Integer.valueOf(list.size()));
            HashMap hashMap = new HashMap();
            if (this.f35406h.mo34676h(C14477k8.LOCAL_LOG_VISUALIZER_MODE, false)) {
                hashMap.put("cs-log-request", C13758b.f33436b);
            }
            return this.f35401c.mo36953d(this.f35402d, a, hashMap).mo36972k();
        }

        /* renamed from: c */
        public final boolean mo35175c() {
            for (C17994n next : this.f35400b.mo35261n()) {
                Integer num = (Integer) next.f46482a;
                Integer num2 = (Integer) next.f46483b;
                List<JSONObject> i = this.f35400b.mo35256i(num.intValue(), num2.intValue());
                if (i.isEmpty()) {
                    this.f35403e.mo35674c("Skipping the bucket: %d for session: %d because it was empty.", num2, num);
                } else if (mo35174b(i)) {
                    this.f35403e.mo35674c("The bucket: %d for session: %d with size %d was successfully sent.", num2, num, Integer.valueOf(i.size()));
                } else {
                    this.f35403e.mo35677f("Could not send the bucket: %d for session %d with payload: %s. Breaking the chain in order to retry later.", num2, num, i);
                    return false;
                }
                this.f35400b.mo35250c(num.intValue(), num2.intValue());
            }
            return true;
        }

        public C14336a(C14347ff ffVar, C14925z9 z9Var, C14453jf jfVar, String str, C14870xf xfVar, C14213b7 b7Var) {
            this(ffVar, z9Var, jfVar, str, new C14337a(), new C14338b(), xfVar, b7Var);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.f9$b */
    public interface C14339b {
        /* renamed from: a */
        void mo34902a();
    }

    /* renamed from: com.contentsquare.android.sdk.f9$c */
    public interface C14340c {
        /* renamed from: a */
        void mo34817a();
    }

    public C14335f9(ExecutorService executorService, C14347ff ffVar, C14925z9 z9Var, String str, C14870xf xfVar, C14213b7 b7Var) {
        this.f35392a = executorService;
        this.f35393b = ffVar;
        this.f35394c = z9Var;
        this.f35398g = str;
        this.f35396e = xfVar;
        this.f35397f = b7Var;
    }

    /* renamed from: a */
    public Future<C17994n<Boolean, String>> mo35170a() {
        return this.f35392a.submit(new C14336a(this.f35393b, this.f35394c, this.f35395d, this.f35398g, this.f35396e, this.f35397f));
    }

    /* renamed from: b */
    public Future<C17994n<Boolean, String>> mo35171b(C14340c cVar, C14339b bVar) {
        return this.f35392a.submit(new C14336a(this.f35393b, this.f35394c, this.f35395d, this.f35398g, cVar, bVar, this.f35396e, this.f35397f));
    }

    /* renamed from: c */
    public void mo35172c(String str) {
        this.f35398g = str;
    }
}
