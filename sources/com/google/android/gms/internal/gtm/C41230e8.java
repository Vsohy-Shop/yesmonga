package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.C40974d0;
import java.io.IOException;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.e8 */
public final class C41230e8 {

    /* renamed from: a */
    public final Context f104565a;

    public C41230e8(Context context) {
        this.f104565a = context;
    }

    /* renamed from: a */
    public final String[] mo135338a() throws IOException {
        return this.f104565a.getAssets().list("");
    }

    /* renamed from: b */
    public final String[] mo135339b(String str) throws IOException {
        return this.f104565a.getAssets().list("containers");
    }
}
