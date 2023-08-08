package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.rg */
public final class C41551rg extends C41310hg<String> {

    /* renamed from: b */
    public final String f104926b;

    /* renamed from: c */
    public final List<C41310hg<?>> f104927c;

    public C41551rg(String str, List<C41310hg<?>> list) {
        C40843u.m166203m(str, "Instruction name must be a string.");
        C40843u.m166202l(list);
        this.f104926b = str;
        this.f104927c = list;
    }

    /* renamed from: i */
    public final String mo135807i() {
        return this.f104926b;
    }

    /* renamed from: j */
    public final List<C41310hg<?>> mo135808j() {
        return this.f104927c;
    }

    /* renamed from: toString */
    public final String mo135436c() {
        String str = this.f104926b;
        String obj = this.f104927c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(obj).length());
        sb.append("*");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        return sb.toString();
    }
}
