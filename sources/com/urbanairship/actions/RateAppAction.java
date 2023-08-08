package com.urbanairship.actions;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import com.urbanairship.UAirship;
import com.urbanairship.json.C9323b;
import com.urbanairship.util.C9646e;

public class RateAppAction extends C35487a {
    @C0359n0

    /* renamed from: h */
    public static final String f87463h = "rate_app_action";
    @C0359n0

    /* renamed from: i */
    public static final String f87464i = "^ra";
    @C0359n0

    /* renamed from: j */
    public static final String f87465j = "show_link_prompt";
    @C0359n0

    /* renamed from: k */
    public static final String f87466k = "title";
    @C0359n0

    /* renamed from: l */
    public static final String f87467l = "body";
    @C0359n0

    /* renamed from: m */
    public static final String f87468m = "com.urbanairship.actions.SHOW_RATE_APP_INTENT_ACTION";

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        int b = bVar.mo106348b();
        return b == 0 || b == 6 || b == 2 || b == 3 || b == 4;
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        if (bVar.mo106349c().mo17264q().mo18749A().mo18801A(f87465j).mo18757c(false)) {
            mo106326g(bVar);
        } else {
            UAirship Y = UAirship.m146188Y();
            UAirship.m146200l().startActivity(C9646e.m36140a(UAirship.m146200l(), Y.mo106201C(), Y.mo106220f()).setFlags(268435456));
        }
        return C35495f.m146456d();
    }

    /* renamed from: f */
    public boolean mo18905f() {
        return true;
    }

    /* renamed from: g */
    public final void mo106326g(@C0359n0 C35489b bVar) {
        Context l = UAirship.m146200l();
        C9323b A = bVar.mo106349c().mo17264q().mo18749A();
        Intent intent = new Intent(f87468m).addFlags(805306368).setPackage(UAirship.m146180A());
        if (A.mo18801A("title").mo18783y()) {
            intent.putExtra("title", A.mo18801A("title").mo18769l());
        }
        if (A.mo18801A("body").mo18783y()) {
            intent.putExtra("body", A.mo18801A("body").mo18769l());
        }
        l.startActivity(intent);
    }
}
