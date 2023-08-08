package com.urbanairship.automation.actions;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.urbanairship.actions.ActionValue;
import com.urbanairship.actions.C35487a;
import com.urbanairship.actions.C35489b;
import com.urbanairship.actions.C35495f;
import com.urbanairship.automation.C8814b;
import com.urbanairship.automation.C8928r;
import com.urbanairship.automation.C8996y;
import com.urbanairship.automation.ScheduleDelay;
import com.urbanairship.automation.Trigger;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9638b;
import com.urbanairship.util.C9668o;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ScheduleAction extends C35487a {
    @C0359n0

    /* renamed from: i */
    public static final String f23551i = "schedule_actions";
    @C0359n0

    /* renamed from: j */
    public static final String f23552j = "^sa";

    /* renamed from: k */
    public static final String f23553k = "actions";

    /* renamed from: l */
    public static final String f23554l = "limit";

    /* renamed from: m */
    public static final String f23555m = "priority";

    /* renamed from: n */
    public static final String f23556n = "group";

    /* renamed from: o */
    public static final String f23557o = "end";

    /* renamed from: p */
    public static final String f23558p = "start";

    /* renamed from: q */
    public static final String f23559q = "delay";

    /* renamed from: r */
    public static final String f23560r = "triggers";

    /* renamed from: s */
    public static final String f23561s = "interval";

    /* renamed from: t */
    public static final String f23562t = "audience";

    /* renamed from: h */
    public final Callable<C8928r> f23563h;

    public ScheduleAction() {
        this(C9638b.m36121a(C8928r.class));
    }

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        int b = bVar.mo106348b();
        if (b == 0 || b == 1 || b == 3 || b == 6) {
            return bVar.mo106349c().mo17264q().mo18778u();
        }
        return false;
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        try {
            C8928r call = this.f23563h.call();
            try {
                C8996y<C8801a> g = mo17303g(bVar.mo106349c().mo17264q());
                Boolean bool = call.mo17613i(g).get();
                if (bool == null || !bool.booleanValue()) {
                    return C35495f.m146456d();
                }
                return C35495f.m146459g(ActionValue.m146328o(g.mo17733B()));
            } catch (JsonException | InterruptedException | ExecutionException e) {
                return C35495f.m146458f(e);
            }
        } catch (Exception e2) {
            return C35495f.m146458f(e2);
        }
    }

    @C0359n0
    /* renamed from: g */
    public C8996y<C8801a> mo17303g(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        C8996y.C8998b<C8801a> A2 = C8996y.m33416L(new C8801a(A.mo18801A("actions").mo18749A())).mo17757D(A.mo18801A("limit").mo18762f(1)).mo17759F(A.mo18801A("priority").mo18762f(0)).mo17754A(A.mo18801A("group").mo18769l());
        if (A.mo18805e("end")) {
            A2.mo17770y(C9668o.m36219c(A.mo18801A("end").mo18750B(), -1));
        }
        if (A.mo18805e("start")) {
            A2.mo17761H(C9668o.m36219c(A.mo18801A("start").mo18750B(), -1));
        }
        Iterator<JsonValue> it = A.mo18801A("triggers").mo18784z().iterator();
        while (it.hasNext()) {
            A2.mo17763r(Trigger.m32681c(it.next()));
        }
        if (A.mo18805e("delay")) {
            A2.mo17768w(ScheduleDelay.m32656a(A.mo18801A("delay")));
        }
        if (A.mo18805e("interval")) {
            A2.mo17756C(A.mo18801A("interval").mo18766i(0), TimeUnit.SECONDS);
        }
        JsonValue k = A.mo18801A("audience").mo18749A().mo18812k("audience");
        if (k != null) {
            A2.mo17766u(C8814b.m32733a(k));
        }
        try {
            return A2.mo17765t();
        } catch (IllegalArgumentException e) {
            throw new JsonException("Invalid schedule info", e);
        }
    }

    @C0344h1
    public ScheduleAction(@C0359n0 Callable<C8928r> callable) {
        this.f23563h = callable;
    }
}
