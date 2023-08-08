package com.google.android.gms.internal.gtm;

import android.content.Context;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.common.util.C40985k;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.we */
public final class C41669we {

    /* renamed from: a */
    public final Context f105207a;

    /* renamed from: b */
    public final C41333if f105208b;

    /* renamed from: c */
    public final C40979g f105209c;
    @C40974d0

    /* renamed from: d */
    public final Map<String, C41645ve<C41550rf>> f105210d = new HashMap();

    /* renamed from: e */
    public final Map<String, C41502pf> f105211e;

    public C41669we(Context context) {
        HashMap hashMap = new HashMap();
        C41333if ifVar = new C41333if(context);
        C40979g d = C40985k.m166636d();
        this.f105207a = context.getApplicationContext();
        this.f105209c = d;
        this.f105208b = ifVar;
        this.f105211e = hashMap;
    }

    @C40974d0
    /* renamed from: b */
    public final void mo136024b(C41165bf bfVar, List<Integer> list, int i, C41597te teVar, @C0363p0 C41636v5 v5Var) {
        int i2;
        long j;
        String str;
        List<Integer> list2 = list;
        if (i == 0) {
            C41493p6.m168152d("Starting to fetch a new resource");
            i2 = 0;
        } else {
            i2 = i;
        }
        if (i2 >= list.size()) {
            String valueOf = String.valueOf(bfVar.mo135064a().mo135774b());
            if (valueOf.length() != 0) {
                str = "There is no valid resource for the container: ".concat(valueOf);
            } else {
                str = new String("There is no valid resource for the container: ");
            }
            C41493p6.m168152d(str);
            teVar.mo135681a(new C41213df(new Status(16, str), list2.get(i2 - 1).intValue(), (C41189cf) null, (C41142ag) null));
            return;
        }
        C41597te teVar2 = teVar;
        int intValue = list2.get(i2).intValue();
        if (intValue == 0) {
            C41525qe a = bfVar.mo135064a();
            C41645ve veVar = this.f105210d.get(a.mo135774b());
            if (!bfVar.mo135064a().mo135779g()) {
                if (veVar != null) {
                    j = veVar.mo135976a();
                } else {
                    j = this.f105208b.mo135491a(a.mo135774b());
                }
                if (j + 900000 >= this.f105209c.mo134768a()) {
                    mo136024b(bfVar, list, i2 + 1, teVar, v5Var);
                    return;
                }
            }
            C41502pf pfVar = this.f105211e.get(bfVar.mo135066c());
            if (pfVar == null) {
                pfVar = new C41502pf();
                this.f105211e.put(bfVar.mo135066c(), pfVar);
            }
            String b = a.mo135774b();
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 43);
            sb.append("Attempting to fetch container ");
            sb.append(b);
            sb.append(" from network");
            C41493p6.m168152d(sb.toString());
            pfVar.mo135716a(this.f105207a, bfVar, 0, new C41621ue(this, 0, bfVar, C41141af.f104437a, list, i2, teVar, v5Var));
        } else if (intValue == 1) {
            C41525qe a2 = bfVar.mo135064a();
            String b2 = a2.mo135774b();
            StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 52);
            sb2.append("Attempting to fetch container ");
            sb2.append(b2);
            sb2.append(" from a saved resource");
            C41493p6.m168152d(sb2.toString());
            this.f105208b.mo135495e(a2.mo135776d(), new C41621ue(this, 1, bfVar, C41141af.f104437a, list, i2, teVar, (C41636v5) null));
        } else if (intValue == 2) {
            C41525qe a3 = bfVar.mo135064a();
            String b3 = a3.mo135774b();
            StringBuilder sb3 = new StringBuilder(String.valueOf(b3).length() + 56);
            sb3.append("Attempting to fetch container ");
            sb3.append(b3);
            sb3.append(" from the default resource");
            C41493p6.m168152d(sb3.toString());
            this.f105208b.mo135493c(a3.mo135776d(), a3.mo135775c(), new C41621ue(this, 2, bfVar, C41141af.f104437a, list, i2, teVar, (C41636v5) null));
        } else {
            StringBuilder sb4 = new StringBuilder(36);
            sb4.append("Unknown fetching source: ");
            sb4.append(i2);
            throw new UnsupportedOperationException(sb4.toString());
        }
    }

    /* renamed from: c */
    public final void mo136025c(String str, @C0363p0 String str2, @C0363p0 String str3, List<Integer> list, C41597te teVar, C41636v5 v5Var) {
        boolean z;
        C40843u.m166191a(!list.isEmpty());
        C41165bf bfVar = new C41165bf();
        C41661w6 a = C41661w6.m168646a();
        if (a.mo136018d()) {
            String str4 = str;
            if (str.equals(a.mo136017c())) {
                z = true;
                bfVar.mo135065b(new C41525qe(str, str2, str3, z, C41661w6.m168646a().mo136016b(), ""));
                mo136024b(bfVar, Collections.unmodifiableList(list), 0, teVar, v5Var);
            }
        } else {
            String str5 = str;
        }
        z = false;
        bfVar.mo135065b(new C41525qe(str, str2, str3, z, C41661w6.m168646a().mo136016b(), ""));
        mo136024b(bfVar, Collections.unmodifiableList(list), 0, teVar, v5Var);
    }

    @C40974d0
    /* renamed from: d */
    public final void mo136026d(Status status, C41189cf cfVar) {
        String b = cfVar.mo135175b().mo135774b();
        C41550rf c = cfVar.mo135176c();
        if (this.f105210d.containsKey(b)) {
            C41645ve veVar = this.f105210d.get(b);
            veVar.mo135978c(this.f105209c.mo134768a());
            if (status == Status.f103184g) {
                veVar.mo135979d(status);
                veVar.mo135977b(c);
                return;
            }
            return;
        }
        this.f105210d.put(b, new C41645ve(status, c, this.f105209c.mo134768a()));
    }
}
