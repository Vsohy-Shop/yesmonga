package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.android.volley.toolbox.h */
public class C21801h {

    /* renamed from: e */
    public static final Comparator<byte[]> f56399e = new C21802a();

    /* renamed from: a */
    public final List<byte[]> f56400a = new ArrayList();

    /* renamed from: b */
    public final List<byte[]> f56401b = new ArrayList(64);

    /* renamed from: c */
    public int f56402c = 0;

    /* renamed from: d */
    public final int f56403d;

    /* renamed from: com.android.volley.toolbox.h$a */
    public class C21802a implements Comparator<byte[]> {
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public C21801h(int i) {
        this.f56403d = i;
    }

    /* renamed from: a */
    public synchronized byte[] mo65002a(int i) {
        for (int i2 = 0; i2 < this.f56401b.size(); i2++) {
            byte[] bArr = this.f56401b.get(i2);
            if (bArr.length >= i) {
                this.f56402c -= bArr.length;
                this.f56401b.remove(i2);
                this.f56400a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo65003b(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f56403d     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f56400a     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f56401b     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f56399e     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f56401b     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f56402c     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f56402c = r0     // Catch:{ all -> 0x002b }
            r2.mo65004c()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C21801h.mo65003b(byte[]):void");
    }

    /* renamed from: c */
    public final synchronized void mo65004c() {
        while (this.f56402c > this.f56403d) {
            byte[] remove = this.f56400a.remove(0);
            this.f56401b.remove(remove);
            this.f56402c -= remove.length;
        }
    }
}
