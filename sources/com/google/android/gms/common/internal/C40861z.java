package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.google.android.gms.common.C40924q;
import com.google.android.gms.common.annotation.C40473a;

@C40473a
/* renamed from: com.google.android.gms.common.internal.z */
public class C40861z {

    /* renamed from: a */
    public final Resources f103965a;

    /* renamed from: b */
    public final String f103966b;

    public C40861z(@C0359n0 Context context) {
        C40843u.m166202l(context);
        Resources resources = context.getResources();
        this.f103965a = resources;
        this.f103966b = resources.getResourcePackageName(C40924q.C40926b.common_google_play_services_unknown_issue);
    }

    @C0363p0
    @C40473a
    /* renamed from: a */
    public String mo134516a(@C0359n0 String str) {
        int identifier = this.f103965a.getIdentifier(str, C16717v.C16719b.f42182e, this.f103966b);
        if (identifier == 0) {
            return null;
        }
        return this.f103965a.getString(identifier);
    }
}
