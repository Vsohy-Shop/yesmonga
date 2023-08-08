package com.urbanairship.actions;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.C0359n0;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;

public class WalletAction extends OpenExternalUrlAction {
    @C0359n0

    /* renamed from: j */
    public static final String f87499j = "wallet_action";
    @C0359n0

    /* renamed from: k */
    public static final String f87500k = "^w";

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        if (UAirship.m146188Y().mo106201C() != 2) {
            return false;
        }
        return super.mo17301a(bVar);
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        C36059m.m148413i("Processing Wallet adaptive link.", new Object[0]);
        Intent intent = new Intent(UAirship.m146200l(), WalletLoadingActivity.class);
        intent.addFlags(268435456);
        intent.setData(Uri.parse(bVar.mo106349c().mo106308g()));
        UAirship.m146200l().startActivity(intent);
        return C35495f.m146456d();
    }
}
