package com.google.android.gms.internal.gtm;

import com.google.android.datatransport.cct.C40042a;
import com.google.android.gms.common.internal.C40843u;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.gtm.pd */
public final class C41500pd extends C41159b9 {
    /* renamed from: c */
    public static final void m168173c(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    /* renamed from: d */
    public static final String m168174d(String str, int i, Set<Character> set) {
        String str2;
        if (i == 1) {
            try {
                return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return str;
            }
        } else if (i != 2) {
            return str;
        } else {
            String replace = str.replace(C40042a.f102078h, "\\\\");
            for (Character ch : set) {
                String ch2 = ch.toString();
                String valueOf = String.valueOf(ch2);
                if (valueOf.length() != 0) {
                    str2 = C40042a.f102078h.concat(valueOf);
                } else {
                    str2 = new String(C40042a.f102078h);
                }
                replace = replace.replace(ch2, str2);
            }
            return replace;
        }
    }

    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C41431mg mgVar;
        String str;
        C41431mg mgVar2;
        C41431mg mgVar3;
        boolean z2 = true;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C41503pg pgVar = hgVarArr[0];
        if (length > 1) {
            mgVar = hgVarArr[1];
        } else {
            mgVar = C41431mg.f104800h;
        }
        int i = 2;
        if (length <= 2 || (mgVar3 = hgVarArr[2]) == C41431mg.f104800h) {
            str = "";
        } else {
            str = C41135a9.m167070d(mgVar3);
        }
        String str2 = "=";
        if (length > 3 && (mgVar2 = hgVarArr[3]) != C41431mg.f104800h) {
            str2 = C41135a9.m167070d(mgVar2);
        }
        HashSet hashSet = null;
        if (mgVar != C41431mg.f104800h) {
            C40843u.m166191a(mgVar instanceof C41599tg);
            if ("url".equals(mgVar.mo135436c())) {
                i = 1;
            } else if (!"backslash".equals(mgVar.mo135436c())) {
                return new C41599tg("");
            } else {
                hashSet = new HashSet();
                m168173c(hashSet, str);
                m168173c(hashSet, str2);
                hashSet.remove('\\');
            }
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        if (pgVar instanceof C41503pg) {
            for (C41310hg next : pgVar.mo135719k()) {
                if (!z2) {
                    sb.append(str);
                }
                sb.append(m168174d(C41135a9.m167070d(next), i, hashSet));
                z2 = false;
            }
        } else if (pgVar instanceof C41527qg) {
            Map<String, C41310hg<?>> i2 = ((C41527qg) pgVar).mo135785i();
            for (String next2 : i2.keySet()) {
                if (!z2) {
                    sb.append(str);
                }
                String d = C41135a9.m167070d(i2.get(next2));
                sb.append(m168174d(next2, i, hashSet));
                sb.append(str2);
                sb.append(m168174d(d, i, hashSet));
                z2 = false;
            }
        } else {
            sb.append(m168174d(C41135a9.m167070d(pgVar), i, hashSet));
        }
        return new C41599tg(sb.toString());
    }
}
