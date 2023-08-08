package com.urbanairship.actions;

import android.widget.Toast;
import androidx.annotation.C0359n0;
import com.urbanairship.UAirship;

public class ToastAction extends C35487a {
    @C0359n0

    /* renamed from: h */
    public static final String f87496h = "toast_action";
    @C0359n0

    /* renamed from: i */
    public static final String f87497i = "text";
    @C0359n0

    /* renamed from: j */
    public static final String f87498j = "length";

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
        int i;
        if (bVar.mo106349c().mo106307f() != null) {
            i = bVar.mo106349c().mo106307f().mo18801A(f87498j).mo18762f(0);
            str = bVar.mo106349c().mo106307f().mo18801A("text").mo18769l();
        } else {
            str = bVar.mo106349c().mo106308g();
            i = 0;
        }
        if (i == 1) {
            Toast.makeText(UAirship.m146200l(), str, 1).show();
        } else {
            Toast.makeText(UAirship.m146200l(), str, 0).show();
        }
        return C35495f.m146459g(bVar.mo106349c());
    }

    /* renamed from: f */
    public boolean mo18905f() {
        return true;
    }
}
