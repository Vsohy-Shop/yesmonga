package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.fy */
public final class C29243fy implements Comparator<zbwp> {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zbwp zbwp = (zbwp) obj;
        zbwp zbwp2 = (zbwp) obj2;
        C29169dy dyVar = new C29169dy(zbwp);
        C29169dy dyVar2 = new C29169dy(zbwp2);
        while (dyVar.hasNext() && dyVar2.hasNext()) {
            int a = C29206ey.m120368a(dyVar.mo84589i() & 255, dyVar2.mo84589i() & 255);
            if (a != 0) {
                return a;
            }
        }
        return C29206ey.m120368a(zbwp.mo84991i(), zbwp2.mo84991i());
    }
}
