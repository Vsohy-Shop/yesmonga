package com.urbanairship.actions;

import androidx.annotation.C0359n0;
import com.urbanairship.C36059m;
import com.urbanairship.actions.C35492e;
import com.urbanairship.analytics.C35551h;
import com.urbanairship.json.C9323b;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.C9654i;

public class AddCustomEventAction extends C35487a {
    @C0359n0

    /* renamed from: h */
    public static final String f87421h = "add_custom_event_action";

    public static class AddCustomEventActionPredicate implements C35492e.C35494b {
        /* renamed from: a */
        public boolean mo106318a(@C0359n0 C35489b bVar) {
            return 1 != bVar.mo106348b();
        }
    }

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        if (bVar.mo106349c().mo106307f() == null) {
            C36059m.m148409e("CustomEventAction requires a map of event data.", new Object[0]);
            return false;
        } else if (bVar.mo106349c().mo106307f().mo18812k(C35551h.f87728V0) != null) {
            return true;
        } else {
            C36059m.m148409e("CustomEventAction requires an event name in the event data.", new Object[0]);
            return false;
        }
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        String string;
        C9323b A = bVar.mo106349c().mo17264q().mo18749A();
        String l = A.mo18801A(C35551h.f87728V0).mo18769l();
        C9654i.m36166b(l, "Missing event name");
        String l2 = A.mo18801A("event_value").mo18769l();
        double d = A.mo18801A("event_value").mo18758d(0.0d);
        String l3 = A.mo18801A("transaction_id").mo18769l();
        String l4 = A.mo18801A(C35551h.f87727U0).mo18769l();
        String l5 = A.mo18801A(C35551h.f87726T0).mo18769l();
        C9323b j = A.mo18801A("properties").mo18767j();
        C35551h.C35553b u = C35551h.m146685u(l).mo106514y(l3).mo106505p((PushMessage) bVar.mo106347a().getParcelable(C35489b.f87516e)).mo106510u(l4, l5);
        if (l2 != null) {
            u.mo106508s(l2);
        } else {
            u.mo106506q(d);
        }
        if (l5 == null && l4 == null && (string = bVar.mo106347a().getString(C35489b.f87515d)) != null) {
            u.mo106511v(string);
        }
        if (j != null) {
            u.mo106512w(j);
        }
        C35551h o = u.mo106504o();
        o.mo106497v();
        if (o.mo106481l()) {
            return C35495f.m146456d();
        }
        return C35495f.m146458f(new IllegalArgumentException("Unable to add custom event. Event is invalid."));
    }
}
