package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.tagmanager.C31011k;
import com.google.android.gms.tagmanager.C31020t;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.f7 */
public final class C41253f7 {

    /* renamed from: a */
    public final Context f104590a;

    /* renamed from: b */
    public final String f104591b;

    /* renamed from: c */
    public final C31020t f104592c;

    /* renamed from: d */
    public final C31011k f104593d;

    public C41253f7(Context context, C31020t tVar, C31011k kVar, String str) {
        this.f104590a = context.getApplicationContext();
        this.f104592c = tVar;
        this.f104593d = kVar;
        this.f104591b = str;
    }

    /* renamed from: a */
    public final C41205d7 mo135362a(C41550rf rfVar, C41142ag agVar) {
        return new C41205d7(this.f104590a, this.f104591b, rfVar, agVar, this.f104592c, this.f104593d);
    }
}
