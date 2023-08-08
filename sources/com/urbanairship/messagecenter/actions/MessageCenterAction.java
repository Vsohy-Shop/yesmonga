package com.urbanairship.messagecenter.actions;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.urbanairship.actions.C35487a;
import com.urbanairship.actions.C35489b;
import com.urbanairship.actions.C35495f;
import com.urbanairship.messagecenter.C9372h;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.C9638b;
import com.urbanairship.util.C9669o0;
import java.util.concurrent.Callable;

public class MessageCenterAction extends C35487a {
    @C0359n0

    /* renamed from: i */
    public static final String f25545i = "open_mc_action";
    @C0359n0

    /* renamed from: j */
    public static final String f25546j = "^mc";
    @C0359n0

    /* renamed from: k */
    public static final String f25547k = "auto";

    /* renamed from: h */
    public final Callable<C9372h> f25548h;

    public MessageCenterAction() {
        this(C9638b.m36121a(C9372h.class));
    }

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        int b = bVar.mo106348b();
        return b == 0 || b == 6 || b == 2 || b == 3 || b == 4;
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        try {
            C9372h call = this.f25548h.call();
            String g = bVar.mo106349c().mo106308g();
            if ("auto".equalsIgnoreCase(g)) {
                PushMessage pushMessage = (PushMessage) bVar.mo106347a().getParcelable(C35489b.f87516e);
                if (pushMessage != null && pushMessage.mo19189w() != null) {
                    g = pushMessage.mo19189w();
                } else if (bVar.mo106347a().containsKey(C35489b.f87515d)) {
                    g = bVar.mo106347a().getString(C35489b.f87515d);
                } else {
                    g = null;
                }
            }
            if (C9669o0.m36224e(g)) {
                call.mo19004I();
            } else {
                call.mo19005J(g);
            }
            return C35495f.m146456d();
        } catch (Exception e) {
            return C35495f.m146458f(e);
        }
    }

    /* renamed from: f */
    public boolean mo18905f() {
        return true;
    }

    @C0344h1
    public MessageCenterAction(@C0359n0 Callable<C9372h> callable) {
        this.f25548h = callable;
    }
}
