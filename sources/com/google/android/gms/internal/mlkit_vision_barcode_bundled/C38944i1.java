package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.i1 */
public final class C38944i1 implements Comparator<zzdc> {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzdc zzdc = (zzdc) obj;
        zzdc zzdc2 = (zzdc) obj2;
        C38964k1 e0 = zzdc.iterator();
        C38964k1 e02 = zzdc2.iterator();
        while (e0.hasNext() && e02.hasNext()) {
            int a = C38934h1.m160521a(e0.zza() & 255, e02.zza() & 255);
            if (a != 0) {
                return a;
            }
        }
        return C38934h1.m160521a(zzdc.mo123184k(), zzdc2.mo123184k());
    }
}
