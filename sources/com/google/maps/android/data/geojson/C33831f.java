package com.google.maps.android.data.geojson;

import com.google.maps.android.data.C33819c;
import com.google.maps.android.data.C33823f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.maps.android.data.geojson.f */
public class C33831f extends C33823f {
    public C33831f(List<C33829d> list) {
        super(list);
        mo98260f(C33834i.f82026r);
    }

    /* renamed from: g */
    public List<C33829d> mo98312g() {
        List<C33819c> e = mo98234d();
        ArrayList arrayList = new ArrayList();
        Iterator<C33819c> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add((C33829d) it.next());
        }
        return arrayList;
    }

    /* renamed from: h */
    public String mo98313h() {
        return mo98233a();
    }
}
