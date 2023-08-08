package com.google.maps.android.data.geojson;

import com.google.maps.android.data.C33819c;
import com.google.maps.android.data.C33823f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.maps.android.data.geojson.g */
public class C33832g extends C33823f {
    public C33832g(List<C33836j> list) {
        super(list);
        mo98260f(C33834i.f82024p);
    }

    /* renamed from: g */
    public List<C33836j> mo98314g() {
        List<C33819c> e = mo98234d();
        ArrayList arrayList = new ArrayList();
        Iterator<C33819c> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add((C33836j) it.next());
        }
        return arrayList;
    }

    /* renamed from: h */
    public String mo98315h() {
        return mo98233a();
    }
}
