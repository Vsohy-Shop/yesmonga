package com.urbanairship.automation.actions;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.urbanairship.actions.C35487a;
import com.urbanairship.actions.C35489b;
import com.urbanairship.actions.C35495f;
import com.urbanairship.automation.C8928r;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9638b;
import java.util.Iterator;
import java.util.concurrent.Callable;

public class CancelSchedulesAction extends C35487a {
    @C0359n0

    /* renamed from: i */
    public static final String f23545i = "cancel_scheduled_actions";
    @C0359n0

    /* renamed from: j */
    public static final String f23546j = "^csa";
    @C0359n0

    /* renamed from: k */
    public static final String f23547k = "groups";
    @C0359n0

    /* renamed from: l */
    public static final String f23548l = "ids";
    @C0359n0

    /* renamed from: m */
    public static final String f23549m = "all";

    /* renamed from: h */
    public final Callable<C8928r> f23550h;

    public CancelSchedulesAction() {
        this(C9638b.m36121a(C8928r.class));
    }

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        int b = bVar.mo106348b();
        if (b != 0 && b != 1 && b != 3 && b != 6) {
            return false;
        }
        if (bVar.mo106349c().mo17264q().mo18783y()) {
            return "all".equalsIgnoreCase(bVar.mo106349c().mo106308g());
        }
        return bVar.mo106349c().mo17264q().mo18778u();
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        try {
            C8928r call = this.f23550h.call();
            JsonValue q = bVar.mo106349c().mo17264q();
            if (!q.mo18783y() || !"all".equalsIgnoreCase(q.mo18769l())) {
                JsonValue A = q.mo18749A().mo18801A(f23547k);
                if (A.mo18783y()) {
                    call.mo17615k(A.mo18750B());
                } else if (A.mo18776t()) {
                    Iterator<JsonValue> it = A.mo18784z().iterator();
                    while (it.hasNext()) {
                        JsonValue next = it.next();
                        if (next.mo18783y()) {
                            call.mo17615k(next.mo18750B());
                        }
                    }
                }
                JsonValue A2 = q.mo18749A().mo18801A(f23548l);
                if (A2.mo18783y()) {
                    call.mo17610f(A2.mo18750B());
                } else if (A2.mo18776t()) {
                    Iterator<JsonValue> it2 = A2.mo18784z().iterator();
                    while (it2.hasNext()) {
                        JsonValue next2 = it2.next();
                        if (next2.mo18783y()) {
                            call.mo17610f(next2.mo18750B());
                        }
                    }
                }
                return C35495f.m146456d();
            }
            call.mo17592P("actions");
            return C35495f.m146456d();
        } catch (Exception e) {
            return C35495f.m146458f(e);
        }
    }

    @C0344h1
    public CancelSchedulesAction(@C0359n0 Callable<C8928r> callable) {
        this.f23550h = callable;
    }
}
