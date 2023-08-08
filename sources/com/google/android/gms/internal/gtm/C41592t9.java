package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.gtm.t9 */
public final class C41592t9 implements Comparator<C41310hg<?>> {

    /* renamed from: a */
    public final /* synthetic */ C41383kg f105012a;

    /* renamed from: b */
    public final /* synthetic */ C41277g7 f105013b;

    public C41592t9(C41664w9 w9Var, C41383kg kgVar, C41277g7 g7Var) {
        this.f105012a = kgVar;
        this.f105013b = g7Var;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C41310hg hgVar = (C41310hg) obj;
        C41310hg hgVar2 = (C41310hg) obj2;
        if (hgVar == null) {
            if (hgVar2 != null) {
                return 1;
            }
            return 0;
        } else if (hgVar2 == null) {
            return -1;
        } else {
            C41310hg<?> a = this.f105012a.mo135582i().mo135005a(this.f105013b, hgVar, hgVar2);
            C40843u.m166208r(a instanceof C41358jg);
            return (int) ((C41358jg) a).mo135515i().doubleValue();
        }
    }
}
