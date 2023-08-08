package com.urbanairship.actions;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.C0359n0;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.util.C9672p0;

public class OpenExternalUrlAction extends C35487a {
    @C0359n0

    /* renamed from: h */
    public static final String f87442h = "open_external_url_action";
    @C0359n0

    /* renamed from: i */
    public static final String f87443i = "^u";

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        int b = bVar.mo106348b();
        if ((b == 0 || b == 6 || b == 2 || b == 3 || b == 4) && C9672p0.m36235b(bVar.mo106349c().mo106308g()) != null) {
            return UAirship.m146188Y().mo106206H().mo18743g(bVar.mo106349c().mo106308g(), 2);
        }
        return false;
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        Uri b = C9672p0.m36235b(bVar.mo106349c().mo106308g());
        C36059m.m148413i("Opening URI: %s", b);
        Intent intent = new Intent("android.intent.action.VIEW", b);
        intent.addFlags(268435456);
        UAirship.m146200l().startActivity(intent);
        return C35495f.m146459g(bVar.mo106349c());
    }

    /* renamed from: f */
    public boolean mo18905f() {
        return true;
    }
}
