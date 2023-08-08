package com.urbanairship.actions;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.annotation.C0359n0;
import com.urbanairship.UAirship;

public class ClipboardAction extends C35487a {
    @C0359n0

    /* renamed from: h */
    public static final String f87422h = "clipboard_action";
    @C0359n0

    /* renamed from: i */
    public static final String f87423i = "^c";
    @C0359n0

    /* renamed from: j */
    public static final String f87424j = "label";
    @C0359n0

    /* renamed from: k */
    public static final String f87425k = "text";

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        int b = bVar.mo106348b();
        if (b != 0 && b != 2 && b != 3 && b != 4 && b != 5 && b != 6) {
            return false;
        }
        if (bVar.mo106349c().mo106307f() != null) {
            return bVar.mo106349c().mo106307f().mo18801A("text").mo18783y();
        }
        if (bVar.mo106349c().mo106308g() != null) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        String str;
        String str2;
        if (bVar.mo106349c().mo106307f() != null) {
            str2 = bVar.mo106349c().mo106307f().mo18801A("text").mo18769l();
            str = bVar.mo106349c().mo106307f().mo18801A("label").mo18769l();
        } else {
            str2 = bVar.mo106349c().mo106308g();
            str = null;
        }
        ((ClipboardManager) UAirship.m146200l().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str2));
        return C35495f.m146459g(bVar.mo106349c());
    }

    /* renamed from: f */
    public boolean mo18905f() {
        return false;
    }
}
