package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.C40407s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@C40858y
/* renamed from: com.google.android.gms.internal.gtm.y */
public final class C41702y extends C40407s<C41702y> {

    /* renamed from: a */
    public final Map<String, Object> f105281a = new HashMap();

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo133444c(C40407s sVar) {
        C41702y yVar = (C41702y) sVar;
        C40843u.m166202l(yVar);
        yVar.f105281a.putAll(this.f105281a);
    }

    /* renamed from: e */
    public final Map<String, Object> mo136087e() {
        return Collections.unmodifiableMap(this.f105281a);
    }

    /* renamed from: f */
    public final void mo136088f(String str, String str2) {
        C40843u.m166198h(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        C40843u.m166199i(str, "Name can not be empty or \"&\"");
        this.f105281a.put(str, str2);
    }

    public final String toString() {
        return C40407s.m164503a(this.f105281a);
    }
}
