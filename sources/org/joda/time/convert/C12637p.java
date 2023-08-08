package org.joda.time.convert;

import org.joda.time.C12589a;
import org.joda.time.C12641d;
import org.joda.time.C12708h;
import org.joda.time.C12709i;
import org.joda.time.C12713m;

/* renamed from: org.joda.time.convert.p */
public class C12637p extends C12621a implements C12630i, C12628g, C12634m {

    /* renamed from: a */
    public static final C12637p f31116a = new C12637p();

    /* renamed from: c */
    public long mo29025c(Object obj) {
        return ((C12713m) obj).mo28772e();
    }

    /* renamed from: f */
    public void mo29026f(C12708h hVar, Object obj, C12589a aVar) {
        C12713m mVar = (C12713m) obj;
        hVar.mo28320h(mVar);
        if (aVar != null) {
            hVar.mo28314H(aVar);
        } else {
            hVar.mo28314H(mVar.mo28675m());
        }
    }

    /* renamed from: g */
    public boolean mo28988g(Object obj, C12589a aVar) {
        return true;
    }

    /* renamed from: i */
    public void mo29028i(C12709i iVar, Object obj, C12589a aVar) {
        C12713m mVar = (C12713m) obj;
        if (aVar == null) {
            aVar = C12641d.m53377l(mVar);
        }
        int[] o = aVar.mo28649o(iVar, mVar.mo28676v(), mVar.mo28673K());
        for (int i = 0; i < o.length; i++) {
            iVar.mo28347b(i, o[i]);
        }
    }

    /* renamed from: j */
    public Class<?> mo28992j() {
        return C12713m.class;
    }
}
