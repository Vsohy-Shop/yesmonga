package com.google.maps.android.data.kml;

import com.google.maps.android.data.C33819c;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.maps.android.data.kml.i */
public class C33857i extends C33856h {
    public C33857i(ArrayList<C33867q> arrayList) {
        super(m136285h(arrayList));
    }

    /* renamed from: h */
    public static ArrayList<C33819c> m136285h(ArrayList<C33867q> arrayList) {
        ArrayList<C33819c> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            Iterator<C33867q> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next());
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("Tracks cannot be null");
    }
}
