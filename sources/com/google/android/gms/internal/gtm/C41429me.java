package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.urbanairship.wallet.C9700d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.gtm.me */
public final class C41429me extends C41159b9 {

    /* renamed from: b */
    public static final Set<String> f104795b = new HashSet(Arrays.asList(new String[]{"GET", "HEAD", "POST", "PUT"}));

    /* renamed from: a */
    public final C41228e6 f104796a;

    public C41429me(C41228e6 e6Var) {
        this.f104796a = e6Var;
    }

    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        HashMap hashMap;
        boolean z4;
        C40843u.m166191a(true);
        if (hgVarArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41527qg);
        C41310hg<?> b = hgVarArr[0].mo135435b("url");
        C40843u.m166191a(b instanceof C41599tg);
        String k = ((C41599tg) b).mo135863k();
        C41310hg<?> b2 = hgVarArr[0].mo135435b(FirebaseAnalytics.C32532b.f78973v);
        C41431mg mgVar = C41431mg.f104800h;
        if (b2 == mgVar) {
            b2 = new C41599tg("GET");
        }
        C40843u.m166191a(b2 instanceof C41599tg);
        String k2 = ((C41599tg) b2).mo135863k();
        C40843u.m166191a(f104795b.contains(k2));
        C41310hg<?> b3 = hgVarArr[0].mo135435b("uniqueId");
        if (b3 == mgVar || b3 == C41431mg.f104799g || (b3 instanceof C41599tg)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40843u.m166191a(z2);
        String str2 = null;
        if (b3 == mgVar || b3 == C41431mg.f104799g) {
            str = null;
        } else {
            str = ((C41599tg) b3).mo135863k();
        }
        C41310hg<?> b4 = hgVarArr[0].mo135435b(C9700d.f26570q);
        if (b4 == mgVar || (b4 instanceof C41527qg)) {
            z3 = true;
        } else {
            z3 = false;
        }
        C40843u.m166191a(z3);
        HashMap hashMap2 = new HashMap();
        if (b4 == mgVar) {
            hashMap = null;
        } else {
            for (Map.Entry next : ((C41527qg) b4).mo135785i().entrySet()) {
                String str3 = (String) next.getKey();
                C41310hg hgVar = (C41310hg) next.getValue();
                if (!(hgVar instanceof C41599tg)) {
                    C41493p6.m168153e(String.format("Ignore the non-string value of header key %s.", new Object[]{str3}));
                } else {
                    hashMap2.put(str3, ((C41599tg) hgVar).mo135863k());
                }
            }
            hashMap = hashMap2;
        }
        C41310hg<?> b5 = hgVarArr[0].mo135435b("body");
        C41431mg mgVar2 = C41431mg.f104800h;
        if (b5 == mgVar2 || (b5 instanceof C41599tg)) {
            z4 = true;
        } else {
            z4 = false;
        }
        C40843u.m166191a(z4);
        if (b5 != mgVar2) {
            str2 = ((C41599tg) b5).mo135863k();
        }
        String str4 = str2;
        if ((k2.equals("GET") || k2.equals("HEAD")) && str4 != null) {
            C41493p6.m168153e(String.format("Body of %s hit will be ignored: %s.", new Object[]{k2, str4}));
        }
        this.f104796a.mo135337a(k, k2, str, hashMap, str4);
        C41493p6.m168152d(String.format("QueueRequest:\n  url = %s,\n  method = %s,\n  uniqueId = %s,\n  headers = %s,\n  body = %s", new Object[]{k, k2, str, hashMap, str4}));
        return mgVar2;
    }
}
