package com.google.android.gms.common.api.internal;

import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.C40660j;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.r3 */
public final class C40618r3 {

    /* renamed from: a */
    public final C1866a f103552a = new C1866a();

    /* renamed from: b */
    public final C1866a f103553b = new C1866a();

    /* renamed from: c */
    public final C31049l f103554c = new C31049l();

    /* renamed from: d */
    public int f103555d;

    /* renamed from: e */
    public boolean f103556e = false;

    public C40618r3(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f103552a.put(((C40660j) it.next()).mo133714h(), null);
        }
        this.f103555d = this.f103552a.keySet().size();
    }

    /* renamed from: a */
    public final C31047k mo134020a() {
        return this.f103554c.mo87741a();
    }

    /* renamed from: b */
    public final Set mo134021b() {
        return this.f103552a.keySet();
    }

    /* renamed from: c */
    public final void mo134022c(C40525c cVar, ConnectionResult connectionResult, @C0363p0 String str) {
        this.f103552a.put(cVar, connectionResult);
        this.f103553b.put(cVar, str);
        this.f103555d--;
        if (!connectionResult.mo133595e0()) {
            this.f103556e = true;
        }
        if (this.f103555d != 0) {
            return;
        }
        if (this.f103556e) {
            this.f103554c.mo87742b(new AvailabilityException(this.f103552a));
            return;
        }
        this.f103554c.mo87743c(this.f103553b);
    }
}
