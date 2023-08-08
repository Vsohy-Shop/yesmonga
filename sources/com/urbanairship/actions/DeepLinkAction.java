package com.urbanairship.actions;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.base.C9002b;
import com.urbanairship.push.C9537t;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.C9654i;

public class DeepLinkAction extends C35487a {
    @C0359n0

    /* renamed from: i */
    public static final String f87426i = "deep_link_action";
    @C0359n0

    /* renamed from: j */
    public static final String f87427j = "^d";

    /* renamed from: h */
    public final C9002b<UAirship> f87428h;

    /* renamed from: com.urbanairship.actions.DeepLinkAction$a */
    public class C35477a implements C9002b<UAirship> {
        /* renamed from: a */
        public UAirship get() {
            return UAirship.m146188Y();
        }
    }

    public DeepLinkAction() {
        this(new C35477a());
    }

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        int b = bVar.mo106348b();
        if ((b == 0 || b == 6 || b == 2 || b == 3 || b == 4) && bVar.mo106349c().mo106308g() != null) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        String g = bVar.mo106349c().mo106308g();
        UAirship uAirship = this.f87428h.get();
        C9654i.m36166b(g, "Missing feature.");
        C9654i.m36166b(uAirship, "Missing airship.");
        C36059m.m148413i("Deep linking: %s", g);
        if (!uAirship.mo106216b(g)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(g)).addFlags(268435456).setPackage(UAirship.m146180A());
            PushMessage pushMessage = (PushMessage) bVar.mo106347a().getParcelable(C35489b.f87516e);
            if (pushMessage != null) {
                intent.putExtra(C9537t.f26070J, pushMessage.mo19188v());
            }
            UAirship.m146200l().startActivity(intent);
        }
        return C35495f.m146459g(bVar.mo106349c());
    }

    /* renamed from: f */
    public boolean mo18905f() {
        return true;
    }

    @C0344h1
    public DeepLinkAction(@C0359n0 C9002b<UAirship> bVar) {
        this.f87428h = bVar;
    }
}
