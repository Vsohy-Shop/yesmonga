package com.contentsquare.android.sdk;

import androidx.collection.C1879j;

/* renamed from: com.contentsquare.android.sdk.b4 */
public class C14208b4 {

    /* renamed from: a */
    public final C1879j<String, Boolean> f35097a = new C14209a(131072);

    /* renamed from: com.contentsquare.android.sdk.b4$a */
    public class C14209a extends C1879j<String, Boolean> {
        public C14209a(int i) {
            super(i);
        }

        /* renamed from: s */
        public int mo6135p(String str, Boolean bool) {
            return (str.length() * 2) + 16;
        }
    }

    /* renamed from: a */
    public void mo34649a() {
        this.f35097a.mo6244d();
    }

    /* renamed from: b */
    public void mo34650b(String str) {
        this.f35097a.mo6250j(str, Boolean.TRUE);
    }

    /* renamed from: c */
    public boolean mo34651c(String str) {
        return this.f35097a.mo6246f(str) != null;
    }
}
