package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l4 */
public final class C38977l4 {

    /* renamed from: a */
    public final ArrayDeque<zzdc> f98890a = new ArrayDeque<>();

    public C38977l4() {
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ zzdc m160591a(C38977l4 l4Var, zzdc zzdc, zzdc zzdc2) {
        l4Var.mo122953b(zzdc);
        l4Var.mo122953b(zzdc2);
        zzdc pop = l4Var.f98890a.pop();
        while (!l4Var.f98890a.isEmpty()) {
            pop = new zzgh(l4Var.f98890a.pop(), pop);
        }
        return pop;
    }

    /* renamed from: c */
    public static final int m160592c(int i) {
        int binarySearch = Arrays.binarySearch(zzgh.f99145d, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* renamed from: b */
    public final void mo122953b(zzdc zzdc) {
        if (zzdc.mo123189w()) {
            int c = m160592c(zzdc.mo123184k());
            int u0 = zzgh.m161117u0(c + 1);
            if (this.f98890a.isEmpty() || this.f98890a.peek().mo123184k() >= u0) {
                this.f98890a.push(zzdc);
                return;
            }
            int u02 = zzgh.m161117u0(c);
            zzdc pop = this.f98890a.pop();
            while (!this.f98890a.isEmpty() && this.f98890a.peek().mo123184k() < u02) {
                pop = new zzgh(this.f98890a.pop(), pop);
            }
            zzgh zzgh = new zzgh(pop, zzdc);
            while (!this.f98890a.isEmpty() && this.f98890a.peek().mo123184k() < zzgh.m161117u0(m160592c(zzgh.mo123184k()) + 1)) {
                zzgh = new zzgh(this.f98890a.pop(), zzgh);
            }
            this.f98890a.push(zzgh);
        } else if (zzdc instanceof zzgh) {
            zzgh zzgh2 = (zzgh) zzdc;
            mo122953b(zzgh2.zzd);
            mo122953b(zzgh2.zze);
        } else {
            String valueOf = String.valueOf(zzdc.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
            sb.append("Has a new type of ByteString been created? Found ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public /* synthetic */ C38977l4(C38967k4 k4Var) {
    }
}
