package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.y8 */
public final class C41711y8 extends C41159b9 {

    /* renamed from: a */
    public C41277g7 f105300a = null;

    /* renamed from: b */
    public final String f105301b;

    /* renamed from: c */
    public final List<String> f105302c;

    /* renamed from: d */
    public final List<C41551rg> f105303d;

    public C41711y8(C41277g7 g7Var, String str, List<String> list, List<C41551rg> list2) {
        this.f105301b = str;
        this.f105302c = list;
        this.f105303d = list2;
    }

    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        try {
            C41277g7 a = this.f105300a.mo135406a();
            for (int i = 0; i < this.f105302c.size(); i++) {
                if (hgVarArr.length > i) {
                    a.mo135408c(this.f105302c.get(i), hgVarArr[i]);
                } else {
                    a.mo135408c(this.f105302c.get(i), C41431mg.f104800h);
                }
            }
            a.mo135408c("arguments", new C41503pg(Arrays.asList(hgVarArr)));
            for (C41551rg d : this.f105303d) {
                C41310hg d2 = C41623ug.m168492d(a, d);
                if (d2 instanceof C41431mg) {
                    C41431mg mgVar = (C41431mg) d2;
                    if (mgVar.mo135643j()) {
                        return mgVar.mo135642i();
                    }
                }
            }
        } catch (RuntimeException e) {
            String str = this.f105301b;
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(message).length());
            sb.append("Internal error - Function call: ");
            sb.append(str);
            sb.append("\n");
            sb.append(message);
            C41493p6.m168149a(sb.toString());
        }
        return C41431mg.f104800h;
    }

    /* renamed from: c */
    public final String mo136101c() {
        return this.f105301b;
    }

    /* renamed from: d */
    public final void mo136102d(C41277g7 g7Var) {
        this.f105300a = g7Var;
    }

    public final String toString() {
        String str = this.f105301b;
        String obj = this.f105302c.toString();
        String obj2 = this.f105303d.toString();
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(obj).length() + String.valueOf(obj2).length());
        sb.append(str);
        sb.append("\n\tparams: ");
        sb.append(obj);
        sb.append("\n\t: statements: ");
        sb.append(obj2);
        return sb.toString();
    }
}
