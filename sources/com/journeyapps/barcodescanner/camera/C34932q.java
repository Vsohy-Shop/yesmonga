package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.C34959u;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.journeyapps.barcodescanner.camera.q */
public class C34932q extends C34935s {

    /* renamed from: b */
    public static final String f84985b = "q";

    /* renamed from: com.journeyapps.barcodescanner.camera.q$a */
    public class C34933a implements Comparator<C34959u> {

        /* renamed from: a */
        public final /* synthetic */ C34959u f84986a;

        public C34933a(C34959u uVar) {
            this.f84986a = uVar;
        }

        /* renamed from: a */
        public int compare(C34959u uVar, C34959u uVar2) {
            int i = C34932q.m142868e(uVar, this.f84986a).f85046a - uVar.f85046a;
            int i2 = C34932q.m142868e(uVar2, this.f84986a).f85046a - uVar2.f85046a;
            if (i == 0 && i2 == 0) {
                return uVar.compareTo(uVar2);
            }
            if (i == 0) {
                return -1;
            }
            if (i2 == 0) {
                return 1;
            }
            if (i < 0 && i2 < 0) {
                return uVar.compareTo(uVar2);
            }
            if (i > 0 && i2 > 0) {
                return -uVar.compareTo(uVar2);
            }
            if (i < 0) {
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: e */
    public static C34959u m142868e(C34959u uVar, C34959u uVar2) {
        C34959u r;
        if (!uVar2.mo103553g(uVar)) {
            do {
                C34959u r2 = uVar.mo103556r(3, 2);
                uVar = uVar.mo103556r(2, 1);
                if (uVar2.mo103553g(r2)) {
                    return r2;
                }
            } while (!uVar2.mo103553g(uVar));
            return uVar;
        }
        while (true) {
            r = uVar.mo103556r(2, 3);
            C34959u r3 = uVar.mo103556r(1, 2);
            if (!uVar2.mo103553g(r3)) {
                break;
            }
            uVar = r3;
        }
        if (uVar2.mo103553g(r)) {
            return r;
        }
        return uVar;
    }

    /* renamed from: b */
    public C34959u mo103492b(List<C34959u> list, C34959u uVar) {
        if (uVar == null) {
            return list.get(0);
        }
        Collections.sort(list, new C34933a(uVar));
        StringBuilder sb = new StringBuilder();
        sb.append("Viewfinder size: ");
        sb.append(uVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Preview in order of preference: ");
        sb2.append(list);
        return list.get(0);
    }

    /* renamed from: d */
    public Rect mo103484d(C34959u uVar, C34959u uVar2) {
        C34959u e = m142868e(uVar, uVar2);
        StringBuilder sb = new StringBuilder();
        sb.append("Preview: ");
        sb.append(uVar);
        sb.append("; Scaled: ");
        sb.append(e);
        sb.append("; Want: ");
        sb.append(uVar2);
        int i = (e.f85046a - uVar2.f85046a) / 2;
        int i2 = (e.f85047b - uVar2.f85047b) / 2;
        return new Rect(-i, -i2, e.f85046a - i, e.f85047b - i2);
    }
}
