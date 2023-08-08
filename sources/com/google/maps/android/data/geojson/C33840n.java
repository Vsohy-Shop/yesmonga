package com.google.maps.android.data.geojson;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.C30412c;
import com.google.maps.android.collections.C33791b;
import com.google.maps.android.collections.C33796d;
import com.google.maps.android.collections.C33798e;
import com.google.maps.android.collections.C33800f;
import com.google.maps.android.data.C33818b;
import com.google.maps.android.data.C33845k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.google.maps.android.data.geojson.n */
public class C33840n extends C33845k implements Observer {

    /* renamed from: x */
    public static final Object f82041x = null;

    public C33840n(C30412c cVar, HashMap<C33825a, Object> hashMap, C33796d dVar, C33798e eVar, C33800f fVar, C33791b bVar) {
        super(cVar, hashMap, dVar, eVar, fVar, bVar);
    }

    /* renamed from: m0 */
    public void mo98375m0(C30412c cVar) {
        super.mo98375m0(cVar);
        Iterator<C33818b> it = super.mo98390H().iterator();
        while (it.hasNext()) {
            mo98379t0((C33825a) it.next(), cVar);
        }
    }

    /* renamed from: q0 */
    public void mo98376q0(@C0359n0 C33825a aVar) {
        super.mo98409e(aVar);
        if (mo98399R()) {
            aVar.addObserver(this);
        }
    }

    /* renamed from: r0 */
    public void mo98377r0() {
        if (!mo98399R()) {
            mo98424l0(true);
            Iterator<C33818b> it = super.mo98390H().iterator();
            while (it.hasNext()) {
                mo98376q0((C33825a) it.next());
            }
        }
    }

    /* renamed from: s0 */
    public final void mo98378s0(C33825a aVar) {
        mo98379t0(aVar, mo98392J());
    }

    /* renamed from: t0 */
    public final void mo98379t0(C33825a aVar, C30412c cVar) {
        mo98410e0(mo98440y().get(aVar));
        mo98402X(aVar, f82041x);
        if (cVar != null && aVar.mo98227f()) {
            mo98402X(aVar, mo98411f(aVar, aVar.mo98222a()));
        }
    }

    /* renamed from: u0 */
    public void mo98380u0(C33825a aVar) {
        super.mo98406b0(aVar);
        if (super.mo98390H().contains(aVar)) {
            aVar.deleteObserver(this);
        }
    }

    public void update(Observable observable, Object obj) {
        boolean z;
        if (observable instanceof C33825a) {
            C33825a aVar = (C33825a) observable;
            Object obj2 = mo98440y().get(aVar);
            Object obj3 = f82041x;
            if (obj2 != obj3) {
                z = true;
            } else {
                z = false;
            }
            if (z && aVar.mo98227f()) {
                mo98378s0(aVar);
            } else if (z && !aVar.mo98227f()) {
                mo98410e0(mo98440y().get(aVar));
                mo98402X(aVar, obj3);
            } else if (!z && aVar.mo98227f()) {
                mo98376q0(aVar);
            }
        }
    }

    /* renamed from: v0 */
    public void mo98382v0() {
        if (mo98399R()) {
            for (C33818b next : super.mo98390H()) {
                mo98410e0(super.mo98440y().get(next));
                next.deleteObserver(this);
            }
            mo98424l0(false);
        }
    }
}
