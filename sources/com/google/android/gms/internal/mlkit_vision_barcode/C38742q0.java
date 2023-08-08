package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.q0 */
public class C38742q0<E> extends C38755r0<E> {

    /* renamed from: a */
    public Object[] f98108a = new Object[4];

    /* renamed from: b */
    public int f98109b = 0;

    /* renamed from: c */
    public boolean f98110c;

    public C38742q0(int i) {
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C38755r0 mo122468a(Object obj) {
        throw null;
    }

    /* renamed from: b */
    public final C38742q0<E> mo122469b(E e) {
        e.getClass();
        mo122471d(this.f98109b + 1);
        Object[] objArr = this.f98108a;
        int i = this.f98109b;
        this.f98109b = i + 1;
        objArr[i] = e;
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable<? extends E>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.mlkit_vision_barcode.C38755r0<E> mo122470c(java.lang.Iterable<? extends E> r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0020
            int r0 = r2.f98109b
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.mo122471d(r0)
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzbx
            if (r0 != 0) goto L_0x0013
            goto L_0x0020
        L_0x0013:
            com.google.android.gms.internal.mlkit_vision_barcode.zzbx r3 = (com.google.android.gms.internal.mlkit_vision_barcode.zzbx) r3
            java.lang.Object[] r0 = r2.f98108a
            int r1 = r2.f98109b
            int r3 = r3.mo122629e(r0, r1)
            r2.f98109b = r3
            return r2
        L_0x0020:
            java.util.Iterator r3 = r3.iterator()
        L_0x0024:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r3.next()
            r2.mo122468a(r0)
            goto L_0x0024
        L_0x0032:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode.C38742q0.mo122470c(java.lang.Iterable):com.google.android.gms.internal.mlkit_vision_barcode.r0");
    }

    /* renamed from: d */
    public final void mo122471d(int i) {
        Object[] objArr = this.f98108a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.f98108a = Arrays.copyOf(objArr, i2);
            this.f98110c = false;
        } else if (this.f98110c) {
            this.f98108a = (Object[]) objArr.clone();
            this.f98110c = false;
        }
    }
}
