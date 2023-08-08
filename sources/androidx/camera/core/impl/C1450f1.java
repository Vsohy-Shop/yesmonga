package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.core.impl.f1 */
public class C1450f1 {
    @C0359n0

    /* renamed from: a */
    public final List<C1447e1> f4207a;

    public C1450f1(@C0359n0 List<C1447e1> list) {
        this.f4207a = new ArrayList(list);
    }

    /* renamed from: a */
    public boolean mo5219a(@C0359n0 Class<? extends C1447e1> cls) {
        for (C1447e1 e1Var : this.f4207a) {
            if (cls.isAssignableFrom(e1Var.getClass())) {
                return true;
            }
        }
        return false;
    }

    @C0363p0
    /* renamed from: b */
    public <T extends C1447e1> T mo5220b(@C0359n0 Class<T> cls) {
        Iterator<C1447e1> it = this.f4207a.iterator();
        while (it.hasNext()) {
            T t = (C1447e1) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }
}
