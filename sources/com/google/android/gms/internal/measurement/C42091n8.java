package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.n8 */
public final class C42091n8 implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzka zzka = (zzka) obj;
        zzka zzka2 = (zzka) obj2;
        C42074m8 m8Var = new C42074m8(zzka);
        C42074m8 m8Var2 = new C42074m8(zzka2);
        while (m8Var.hasNext() && m8Var2.hasNext()) {
            int compareTo = Integer.valueOf(m8Var.zza() & 255).compareTo(Integer.valueOf(m8Var2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzka.mo137593i()).compareTo(Integer.valueOf(zzka2.mo137593i()));
    }
}
