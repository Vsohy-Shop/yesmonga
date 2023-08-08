package org.joda.time.convert;

import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.C12714n;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.convert.q */
public class C12638q extends C12621a implements C12633l {

    /* renamed from: a */
    public static final C12638q f31117a = new C12638q();

    /* renamed from: a */
    public C12589a mo28984a(Object obj, C12589a aVar) {
        if (aVar == null) {
            return C12641d.m53370e(((C12714n) obj).mo27982m());
        }
        return aVar;
    }

    /* renamed from: b */
    public C12589a mo28985b(Object obj, DateTimeZone dateTimeZone) {
        return mo28984a(obj, (C12589a) null).mo27835R(dateTimeZone);
    }

    /* renamed from: e */
    public int[] mo28987e(C12714n nVar, Object obj, C12589a aVar) {
        C12714n nVar2 = (C12714n) obj;
        int size = nVar.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = nVar2.mo27959T(nVar.mo28207t(i));
        }
        aVar.mo28625K(nVar, iArr);
        return iArr;
    }

    /* renamed from: j */
    public Class<?> mo28992j() {
        return C12714n.class;
    }
}
