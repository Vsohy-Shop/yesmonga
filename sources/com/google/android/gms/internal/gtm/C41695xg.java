package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.C41671wg;
import com.google.android.gms.internal.gtm.C41695xg;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.gtm.xg */
public abstract class C41695xg<MessageType extends C41695xg<MessageType, BuilderType>, BuilderType extends C41671wg<MessageType, BuilderType>> implements C41627uk {
    protected int zzb = 0;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable<T>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void m168717g(java.lang.Iterable<T> r3, java.util.List<? super T> r4) {
        /*
            com.google.android.gms.internal.gtm.C41650vj.m168603e(r3)
            boolean r0 = r4 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0016
            r0 = r4
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r4.size()
            int r2 = r3.size()
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
        L_0x0016:
            int r0 = r4.size()
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r3.next()
            if (r1 != 0) goto L_0x0059
            int r3 = r4.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 37
            r1.<init>(r2)
            java.lang.String r2 = "Element at index "
            r1.append(r2)
            int r3 = r3 - r0
            r1.append(r3)
            java.lang.String r3 = " is null."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            int r1 = r4.size()
        L_0x004b:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x0053
            r4.remove(r1)
            goto L_0x004b
        L_0x0053:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r3)
            throw r4
        L_0x0059:
            r4.add(r1)
            goto L_0x001e
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41695xg.m168717g(java.lang.Iterable, java.util.List):void");
    }

    /* renamed from: a */
    public int mo135622a() {
        throw null;
    }

    /* renamed from: j */
    public final zztd mo135930j() {
        try {
            int b = mo135623b();
            zztd zztd = zztd.f105744a;
            byte[] bArr = new byte[b];
            C41144ai f = C41144ai.m167096f(bArr);
            mo135624c(f);
            f.mo135007g();
            return new zzta(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: k */
    public void mo135629k(int i) {
        throw null;
    }
}
