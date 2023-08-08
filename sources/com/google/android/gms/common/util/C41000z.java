package com.google.android.gms.common.util;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C40843u;
import java.util.Set;

@C40473a
/* renamed from: com.google.android.gms.common.util.z */
public final class C41000z {
    @C40473a
    @C0359n0
    /* renamed from: a */
    public static String[] m166698a(@C0359n0 Set<Scope> set) {
        C40843u.m166203m(set, "scopes can't be null.");
        Scope[] scopeArr = (Scope[]) set.toArray(new Scope[set.size()]);
        C40843u.m166203m(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i = 0; i < scopeArr.length; i++) {
            strArr[i] = scopeArr[i].mo133640M();
        }
        return strArr;
    }
}
