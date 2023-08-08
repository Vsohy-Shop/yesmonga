package com.google.firebase.tracing;

import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32584h;
import com.google.firebase.components.C32594m;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.firebase.tracing.b */
public class C33591b implements C32594m {
    /* renamed from: c */
    public static /* synthetic */ Object m135330c(String str, C32580g gVar, C32584h hVar) {
        try {
            C33592c.m135333b(str);
            return gVar.mo94684k().mo94629a(hVar);
        } finally {
            C33592c.m135332a();
        }
    }

    /* renamed from: a */
    public List<C32580g<?>> mo94719a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C32580g next : componentRegistrar.getComponents()) {
            String l = next.mo94685l();
            if (l != null) {
                next = next.mo94682E(new C33590a(l, next));
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
