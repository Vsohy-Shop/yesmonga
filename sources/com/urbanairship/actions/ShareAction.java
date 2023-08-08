package com.urbanairship.actions;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import com.urbanairship.C36080x;
import com.urbanairship.UAirship;

public class ShareAction extends C35487a {
    @C0359n0

    /* renamed from: h */
    public static final String f87480h = "share_action";
    @C0359n0

    /* renamed from: i */
    public static final String f87481i = "^s";

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
        Context l = UAirship.m146200l();
        l.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", bVar.mo106349c().mo106308g()), l.getString(C36080x.C36094n.ua_share_dialog_title)).setFlags(268435456));
        return C35495f.m146456d();
    }

    /* renamed from: f */
    public boolean mo18905f() {
        return true;
    }
}
