package com.contentsquare.android.sdk;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* renamed from: com.contentsquare.android.sdk.v7 */
public class C14795v7 {

    /* renamed from: a */
    public final C14642q6 f36688a;

    /* renamed from: b */
    public final ExecutorService f36689b;

    /* renamed from: c */
    public final C14410i0 f36690c;

    /* renamed from: d */
    public final C14841we<List<C14918z4>> f36691d;

    /* renamed from: e */
    public String f36692e;

    /* renamed from: com.contentsquare.android.sdk.v7$a */
    public class C14796a implements C14325f5 {

        /* renamed from: a */
        public final /* synthetic */ C14841we f36693a;

        /* renamed from: com.contentsquare.android.sdk.v7$a$a */
        public class C14797a implements Runnable {
            public C14797a() {
            }

            public void run() {
                C14795v7.this.f36690c.mo35513a();
            }
        }

        public C14796a(C14841we weVar) {
            this.f36693a = weVar;
        }

        /* renamed from: a */
        public void mo34402a() {
            if (C14795v7.this.mo36633d(this.f36693a)) {
                C14795v7 v7Var = C14795v7.this;
                v7Var.f36692e = null;
                v7Var.f36689b.submit(new C14797a());
            }
        }
    }

    public C14795v7(C14642q6 q6Var, ExecutorService executorService, C14410i0 i0Var, C14334f8 f8Var) {
        this.f36688a = q6Var;
        this.f36689b = executorService;
        this.f36690c = i0Var;
        C14841we<List<C14918z4>> j = f8Var.mo34469j(new String[]{"uid_config"});
        this.f36691d = j;
        mo36631b(j);
    }

    /* renamed from: a */
    public final String mo36630a() {
        String a = this.f36688a.mo36231a();
        if (!C14358g3.m61811e(a)) {
            return a;
        }
        String uuid = UUID.randomUUID().toString();
        this.f36688a.mo36232b(uuid);
        return uuid;
    }

    /* renamed from: b */
    public final void mo36631b(C14841we<List<C14918z4>> weVar) {
        weVar.mo34979d(new C14796a(weVar));
    }

    /* renamed from: c */
    public String mo36632c() {
        if (this.f36692e == null) {
            this.f36692e = mo36630a();
        }
        return this.f36692e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r3 = ((com.contentsquare.android.sdk.C14918z4) r3.get(0)).mo36944b();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36633d(com.contentsquare.android.sdk.C14841we<java.util.List<com.contentsquare.android.sdk.C14918z4>> r3) {
        /*
            r2 = this;
            java.lang.Object r3 = r3.mo34977c()
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0025
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r3 = r3.get(r1)
            com.contentsquare.android.sdk.z4 r3 = (com.contentsquare.android.sdk.C14918z4) r3
            com.contentsquare.android.sdk.z4$a r3 = r3.mo36944b()
            if (r3 == 0) goto L_0x0025
            int r3 = r3.f36988b
            r0 = 1
            if (r3 != r0) goto L_0x0025
            r1 = r0
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14795v7.mo36633d(com.contentsquare.android.sdk.we):boolean");
    }
}
