package com.android.volley;

import android.os.Handler;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.concurrent.Executor;

/* renamed from: com.android.volley.h */
public class C21756h implements C21774q {

    /* renamed from: a */
    public final Executor f56284a;

    /* renamed from: com.android.volley.h$a */
    public class C21757a implements Executor {

        /* renamed from: a */
        public final /* synthetic */ Handler f56285a;

        public C21757a(Handler handler) {
            this.f56285a = handler;
        }

        public void execute(Runnable runnable) {
            this.f56285a.post(runnable);
        }
    }

    /* renamed from: com.android.volley.h$b */
    public static class C21758b implements Runnable {

        /* renamed from: a */
        public final Request f56287a;

        /* renamed from: b */
        public final C21771p f56288b;

        /* renamed from: c */
        public final Runnable f56289c;

        public C21758b(Request request, C21771p pVar, Runnable runnable) {
            this.f56287a = request;
            this.f56288b = pVar;
            this.f56289c = runnable;
        }

        public void run() {
            if (this.f56287a.mo64791O0()) {
                this.f56287a.mo64792Q("canceled-at-delivery");
                return;
            }
            if (this.f56288b.mo64960b()) {
                this.f56287a.mo20306y(this.f56288b.f56324a);
            } else {
                this.f56287a.mo64817w(this.f56288b.f56326c);
            }
            if (this.f56288b.f56327d) {
                this.f56287a.mo64801g("intermediate-response");
            } else {
                this.f56287a.mo64792Q(C9851c.f26941l);
            }
            Runnable runnable = this.f56289c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C21756h(Handler handler) {
        this.f56284a = new C21757a(handler);
    }

    /* renamed from: a */
    public void mo64929a(Request<?> request, C21771p<?> pVar) {
        mo64930b(request, pVar, (Runnable) null);
    }

    /* renamed from: b */
    public void mo64930b(Request<?> request, C21771p<?> pVar, Runnable runnable) {
        request.mo64793R0();
        request.mo64801g("post-response");
        this.f56284a.execute(new C21758b(request, pVar, runnable));
    }

    /* renamed from: c */
    public void mo64931c(Request<?> request, VolleyError volleyError) {
        request.mo64801g("post-error");
        this.f56284a.execute(new C21758b(request, C21771p.m100086a(volleyError), (Runnable) null));
    }

    public C21756h(Executor executor) {
        this.f56284a = executor;
    }
}
