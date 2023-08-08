package com.google.maps.android.data.geojson;

import com.google.maps.android.data.C33819c;
import com.google.maps.android.data.C33823f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.maps.android.data.geojson.h */
public class C33833h extends C33823f {
    public C33833h(List<C33838l> list) {
        super(list);
        mo98260f(C33834i.f82028t);
    }

    /* renamed from: g */
    public List<C33838l> mo98316g() {
        List<C33819c> e = mo98234d();
        ArrayList arrayList = new ArrayList();
        Iterator<C33819c> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add((C33838l) it.next());
        }
        return arrayList;
    }

    /* renamed from: h */
    public String mo98317h() {
        return mo98233a();
    }
}
