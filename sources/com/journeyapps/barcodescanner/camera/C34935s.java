package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.C34959u;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.journeyapps.barcodescanner.camera.s */
public abstract class C34935s {

    /* renamed from: a */
    public static final String f84988a = "s";

    /* renamed from: com.journeyapps.barcodescanner.camera.s$a */
    public class C34936a implements Comparator<C34959u> {

        /* renamed from: a */
        public final /* synthetic */ C34959u f84989a;

        public C34936a(C34959u uVar) {
            this.f84989a = uVar;
        }

        /* renamed from: a */
        public int compare(C34959u uVar, C34959u uVar2) {
            return Float.compare(C34935s.this.mo103483c(uVar2, this.f84989a), C34935s.this.mo103483c(uVar, this.f84989a));
        }
    }

    /* renamed from: a */
    public List<C34959u> mo103497a(List<C34959u> list, C34959u uVar) {
        if (uVar == null) {
            return list;
        }
        Collections.sort(list, new C34936a(uVar));
        return list;
    }

    /* renamed from: b */
    public C34959u mo103492b(List<C34959u> list, C34959u uVar) {
        List<C34959u> a = mo103497a(list, uVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Viewfinder size: ");
        sb.append(uVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Preview in order of preference: ");
        sb2.append(a);
        return a.get(0);
    }

    /* renamed from: c */
    public float mo103483c(C34959u uVar, C34959u uVar2) {
        return 0.5f;
    }

    /* renamed from: d */
    public abstract Rect mo103484d(C34959u uVar, C34959u uVar2);
}
