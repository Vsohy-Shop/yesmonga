package com.urbanairship.app;

import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.urbanairship.app.f */
public class C36034f implements C36031c {

    /* renamed from: a */
    public final List<C36031c> f89020a = new ArrayList();

    /* renamed from: a */
    public void mo17410a(long j) {
        Iterator it = new ArrayList(this.f89020a).iterator();
        while (it.hasNext()) {
            ((C36031c) it.next()).mo17410a(j);
        }
    }

    /* renamed from: b */
    public void mo17411b(long j) {
        Iterator it = new ArrayList(this.f89020a).iterator();
        while (it.hasNext()) {
            ((C36031c) it.next()).mo17411b(j);
        }
    }

    /* renamed from: c */
    public void mo107776c(@C0359n0 C36031c cVar) {
        synchronized (this.f89020a) {
            this.f89020a.add(cVar);
        }
    }

    /* renamed from: d */
    public void mo107777d(@C0359n0 C36031c cVar) {
        synchronized (this.f89020a) {
            this.f89020a.remove(cVar);
        }
    }
}
