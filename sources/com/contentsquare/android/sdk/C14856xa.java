package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14898ye;
import com.contentsquare.android.sdk.C14925z9;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.xa */
public class C14856xa {

    /* renamed from: a */
    public final C14400ha f36840a;

    /* renamed from: b */
    public final C14925z9 f36841b = new C14925z9();

    /* renamed from: c */
    public final C14533md<C14898ye.C14899a> f36842c;

    /* renamed from: com.contentsquare.android.sdk.xa$a */
    public static class C14857a implements Callable<Boolean> {

        /* renamed from: a */
        public final C14453jf f36843a = new C14453jf("ScreenRecordProcessorHandler");

        /* renamed from: b */
        public final C14858a f36844b;

        /* renamed from: c */
        public final C14925z9 f36845c;

        /* renamed from: d */
        public final C14533md<C14898ye.C14899a> f36846d;

        /* renamed from: com.contentsquare.android.sdk.xa$a$a */
        public static final class C14858a {

            /* renamed from: a */
            public final C14647qa f36847a;

            /* renamed from: b */
            public final String f36848b;

            public C14858a(C14647qa qaVar, String str) {
                this.f36847a = qaVar;
                this.f36848b = str;
            }
        }

        public C14857a(C14858a aVar, C14925z9 z9Var, C14533md<C14898ye.C14899a> mdVar) {
            this.f36845c = z9Var;
            this.f36844b = aVar;
            this.f36846d = mdVar;
        }

        /* renamed from: a */
        public Boolean call() {
            return mo36822b(this.f36844b);
        }

        /* renamed from: b */
        public final Boolean mo36822b(C14858a aVar) {
            this.f36846d.mo34827b(C14898ye.C14899a.C14907e.f36967a);
            String a = aVar.f36847a.mo36235a();
            JSONObject c = mo36823c(aVar.f36847a);
            if (c != null) {
                C14925z9.C14926a c2 = this.f36845c.mo36952c(aVar.f36848b, c);
                if (c2.mo36972k()) {
                    this.f36846d.mo34827b(new C14898ye.C14899a.C14909g(a));
                    return Boolean.TRUE;
                }
                Throwable f = c2.mo36967f();
                if (f != null) {
                    this.f36843a.mo35678g(f, "Failed to sent the screengraph data to the following service path: %s", aVar.f36848b);
                } else {
                    this.f36843a.mo35677f("Failed to sent the screengraph data to the following service path: %s", aVar.f36848b);
                }
                this.f36846d.mo34827b(new C14898ye.C14899a.C14900a(C14898ye.C14899a.C14901b.C14904c.f36964a, a));
            } else {
                this.f36846d.mo34827b(new C14898ye.C14899a.C14900a(C14898ye.C14899a.C14901b.C14904c.f36964a, a));
                this.f36843a.mo35677f("Problems serializing the ScreenCapture object", new Object[0]);
            }
            return Boolean.FALSE;
        }

        /* renamed from: c */
        public final JSONObject mo36823c(C14647qa qaVar) {
            try {
                return qaVar.mo36241g();
            } catch (JSONException e) {
                this.f36843a.mo35678g(e, e.getMessage(), new Object[0]);
                return null;
            }
        }
    }

    public C14856xa(C14400ha haVar, C14533md<C14898ye.C14899a> mdVar) {
        this.f36840a = haVar;
        this.f36842c = mdVar;
    }

    /* renamed from: a */
    public Future<Boolean> mo36820a(C14647qa qaVar, String str) {
        return this.f36840a.mo35502a(new C14857a(new C14857a.C14858a(qaVar, str), this.f36841b, this.f36842c));
    }
}
