package androidx.camera.camera2.interop;

import androidx.annotation.C0359n0;
import androidx.camera.core.C1635l;
import androidx.camera.core.C1641m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@C1298p
/* renamed from: androidx.camera.camera2.interop.k */
public final class C1290k {

    /* renamed from: androidx.camera.camera2.interop.k$a */
    public interface C1291a {
        @C0359n0
        /* renamed from: a */
        List<C1292l> mo4755a(@C0359n0 List<C1292l> list);
    }

    @C0359n0
    /* renamed from: b */
    public static C1635l m5302b(@C0359n0 C1291a aVar) {
        return new C1289j(aVar);
    }

    /* renamed from: c */
    public static /* synthetic */ List m5303c(C1291a aVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C1292l.m5306b((C1641m) it.next()));
        }
        List<C1292l> a = aVar.mo4755a(Collections.unmodifiableList(arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1641m mVar = (C1641m) it2.next();
            if (a.contains(C1292l.m5306b(mVar))) {
                arrayList2.add(mVar);
            }
        }
        return arrayList2;
    }
}
