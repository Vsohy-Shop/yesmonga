package com.bumptech.glide.load.model;

import com.bumptech.glide.load.C22098a;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.t */
public class C22358t implements C22098a<InputStream> {

    /* renamed from: b */
    public static final String f57399b = "StreamEncoder";

    /* renamed from: a */
    public final C22157b f57400a;

    public C22358t(C22157b bVar) {
        this.f57400a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003b A[SYNTHETIC, Splitter:B:22:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0046 A[SYNTHETIC, Splitter:B:27:0x0046] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo65770a(@androidx.annotation.C0359n0 java.io.InputStream r4, @androidx.annotation.C0359n0 java.io.File r5, @androidx.annotation.C0359n0 com.bumptech.glide.load.C22277f r6) {
        /*
            r3 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.b r6 = r3.f57400a
            r0 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r6 = r6.mo65932c(r0, r1)
            byte[] r6 = (byte[]) r6
            r0 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0032 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0032 }
        L_0x0013:
            int r5 = r4.read(r6)     // Catch:{ IOException -> 0x002e, all -> 0x002b }
            r1 = -1
            if (r5 == r1) goto L_0x001e
            r2.write(r6, r0, r5)     // Catch:{ IOException -> 0x002e, all -> 0x002b }
            goto L_0x0013
        L_0x001e:
            r2.close()     // Catch:{ IOException -> 0x002e, all -> 0x002b }
            r2.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            com.bumptech.glide.load.engine.bitmap_recycle.b r4 = r3.f57400a
            r4.mo65934e(r6)
            r0 = 1
            goto L_0x0043
        L_0x002b:
            r4 = move-exception
            r1 = r2
            goto L_0x0044
        L_0x002e:
            r1 = r2
            goto L_0x0032
        L_0x0030:
            r4 = move-exception
            goto L_0x0044
        L_0x0032:
            java.lang.String r4 = "StreamEncoder"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            com.bumptech.glide.load.engine.bitmap_recycle.b r4 = r3.f57400a
            r4.mo65934e(r6)
        L_0x0043:
            return r0
        L_0x0044:
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            com.bumptech.glide.load.engine.bitmap_recycle.b r5 = r3.f57400a
            r5.mo65934e(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.model.C22358t.mo65770a(java.io.InputStream, java.io.File, com.bumptech.glide.load.f):boolean");
    }
}
