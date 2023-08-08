package org.joda.time.convert;

import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.C12709i;
import org.joda.time.C12711k;

/* renamed from: org.joda.time.convert.n */
public class C12635n extends C12621a implements C12628g, C12634m {

    /* renamed from: a */
    public static final C12635n f31114a = new C12635n();

    /* renamed from: c */
    public long mo29025c(Object obj) {
        return ((C12711k) obj).mo28667k();
    }

    /* renamed from: i */
    public void mo29028i(C12709i iVar, Object obj, C12589a aVar) {
        int[] n = C12641d.m53370e(aVar).mo28648n(iVar, ((C12711k) obj).mo28667k());
        for (int i = 0; i < n.length; i++) {
            iVar.mo28347b(i, n[i]);
        }
    }

    /* renamed from: j */
    public Class<?> mo28992j() {
        return C12711k.class;
    }
}
