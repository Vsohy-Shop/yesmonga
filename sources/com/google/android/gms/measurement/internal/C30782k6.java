package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.measurement.zzcl;

@C40974d0
/* renamed from: com.google.android.gms.measurement.internal.k6 */
public final class C30782k6 {

    /* renamed from: a */
    public final Context f73673a;
    @C0363p0

    /* renamed from: b */
    public String f73674b;
    @C0363p0

    /* renamed from: c */
    public String f73675c;
    @C0363p0

    /* renamed from: d */
    public String f73676d;
    @C0363p0

    /* renamed from: e */
    public Boolean f73677e;

    /* renamed from: f */
    public long f73678f;
    @C0363p0

    /* renamed from: g */
    public zzcl f73679g;

    /* renamed from: h */
    public boolean f73680h = true;
    @C0363p0

    /* renamed from: i */
    public final Long f73681i;
    @C0363p0

    /* renamed from: j */
    public String f73682j;

    @C40974d0
    public C30782k6(Context context, @C0363p0 zzcl zzcl, @C0363p0 Long l) {
        C40843u.m166202l(context);
        Context applicationContext = context.getApplicationContext();
        C40843u.m166202l(applicationContext);
        this.f73673a = applicationContext;
        this.f73681i = l;
        if (zzcl != null) {
            this.f73679g = zzcl;
            this.f73674b = zzcl.f106685f;
            this.f73675c = zzcl.f106684e;
            this.f73676d = zzcl.f106683d;
            this.f73680h = zzcl.f106682c;
            this.f73678f = zzcl.f106681b;
            this.f73682j = zzcl.f106687v;
            Bundle bundle = zzcl.f106686g;
            if (bundle != null) {
                this.f73677e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
