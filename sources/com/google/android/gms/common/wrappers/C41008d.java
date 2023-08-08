package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.util.C40974d0;

@C40473a
/* renamed from: com.google.android.gms.common.wrappers.d */
public class C41008d {

    /* renamed from: b */
    public static C41008d f104270b = new C41008d();
    @C0363p0

    /* renamed from: a */
    public C41007c f104271a = null;

    @C40473a
    @C0359n0
    /* renamed from: a */
    public static C41007c m166715a(@C0359n0 Context context) {
        return f104270b.mo134787b(context);
    }

    @C0359n0
    @C40974d0
    /* renamed from: b */
    public final synchronized C41007c mo134787b(@C0359n0 Context context) {
        if (this.f104271a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f104271a = new C41007c(context);
        }
        return this.f104271a;
    }
}
