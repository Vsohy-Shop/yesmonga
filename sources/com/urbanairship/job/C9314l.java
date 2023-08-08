package com.urbanairship.job;

import androidx.annotation.C0359n0;
import androidx.work.C21091d;
import com.urbanairship.job.C9304f;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.urbanairship.job.l */
public abstract class C9314l {

    /* renamed from: a */
    public static final String f25415a = "action";

    /* renamed from: b */
    public static final String f25416b = "extras";

    /* renamed from: c */
    public static final String f25417c = "component";

    /* renamed from: d */
    public static final String f25418d = "network_required";

    /* renamed from: e */
    public static final String f25419e = "min_delay";

    /* renamed from: f */
    public static final String f25420f = "conflict_strategy";

    /* renamed from: g */
    public static final String f25421g = "initial_backoff";

    /* renamed from: h */
    public static final String f25422h = "rate_limit_ids";

    @C0359n0
    /* renamed from: a */
    public static C21091d m34946a(@C0359n0 C9304f fVar) {
        return new C21091d.C21092a().mo63188q("action", fVar.mo18712a()).mo63188q("extras", fVar.mo18715d().toString()).mo63188q(f25417c, fVar.mo18713b()).mo63176e(f25418d, fVar.mo18720h()).mo63186o(f25419e, fVar.mo18718f()).mo63186o(f25421g, fVar.mo18716e()).mo63184m(f25420f, fVar.mo18714c()).mo63188q(f25422h, JsonValue.m34975U(fVar.mo18719g()).toString()).mo63172a();
    }

    @C0359n0
    /* renamed from: b */
    public static C9304f m34947b(@C0359n0 C21091d dVar) throws JsonException {
        C9304f.C9306b o = C9304f.m34907i().mo18725k(dVar.mo63151A("action")).mo18729o(JsonValue.m34960C(dVar.mo63151A("extras")).mo18749A());
        long y = dVar.mo63170y(f25419e, 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C9304f.C9306b n = o.mo18731q(y, timeUnit).mo18730p(dVar.mo63170y(f25421g, 0), timeUnit).mo18732r(dVar.mo63158n(f25418d, false)).mo18727m(dVar.mo63151A(f25417c)).mo18728n(dVar.mo63167v(f25420f, 0));
        Iterator<JsonValue> it = JsonValue.m34960C(dVar.mo63151A(f25422h)).mo18784z().iterator();
        while (it.hasNext()) {
            n.mo18723i(it.next().mo18753F());
        }
        return n.mo18724j();
    }
}
