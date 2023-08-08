package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.util.C40974d0;
import com.google.errorprone.annotations.C32488a;

@C40473a
/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public class C40423a {
    @C40974d0

    /* renamed from: b */
    public static int f103041b = 31;

    /* renamed from: a */
    public int f103042a = 1;

    @C40473a
    @C0359n0
    @C32488a
    /* renamed from: a */
    public C40423a mo133507a(@C0363p0 Object obj) {
        this.f103042a = (f103041b * this.f103042a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @C40473a
    /* renamed from: b */
    public int mo133508b() {
        return this.f103042a;
    }

    @C0359n0
    @C32488a
    /* renamed from: c */
    public final C40423a mo133509c(boolean z) {
        this.f103042a = (f103041b * this.f103042a) + (z ? 1 : 0);
        return this;
    }
}
