package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22139e;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22279h;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e */
public class C22405e implements C22279h<Bitmap> {

    /* renamed from: b */
    public static final C22139e<Integer> f57519b = C22139e.m100836g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final C22139e<Bitmap.CompressFormat> f57520c = C22139e.m100835f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: d */
    public static final String f57521d = "BitmapEncoder";
    @C0363p0

    /* renamed from: a */
    public final C22157b f57522a;

    public C22405e(@C0359n0 C22157b bVar) {
        this.f57522a = bVar;
    }

    @C0359n0
    /* renamed from: b */
    public EncodeStrategy mo66238b(@C0359n0 C22277f fVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:22|(2:40|41)|42|43) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00b1 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[SYNTHETIC, Splitter:B:28:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069 A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ae A[SYNTHETIC, Splitter:B:40:0x00ae] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo65770a(@androidx.annotation.C0359n0 com.bumptech.glide.load.engine.C22270s<android.graphics.Bitmap> r8, @androidx.annotation.C0359n0 java.io.File r9, @androidx.annotation.C0359n0 com.bumptech.glide.load.C22277f r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.mo66418d(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            com.bumptech.glide.util.pool.C22647b.m102679e(r4, r2, r3, r1)
            long r2 = com.bumptech.glide.util.C22628i.m102603b()     // Catch:{ all -> 0x00b2 }
            com.bumptech.glide.load.e<java.lang.Integer> r4 = f57519b     // Catch:{ all -> 0x00b2 }
            java.lang.Object r4 = r10.mo66232c(r4)     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00b2 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00b2 }
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0057 }
            r6.<init>(r9)     // Catch:{ IOException -> 0x0057 }
            com.bumptech.glide.load.engine.bitmap_recycle.b r9 = r7.f57522a     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            if (r9 == 0) goto L_0x0044
            com.bumptech.glide.load.data.c r9 = new com.bumptech.glide.load.data.c     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            com.bumptech.glide.load.engine.bitmap_recycle.b r5 = r7.f57522a     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            r9.<init>(r6, r5)     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            r5 = r9
            goto L_0x0045
        L_0x0044:
            r5 = r6
        L_0x0045:
            r8.compress(r1, r4, r5)     // Catch:{ IOException -> 0x0057 }
            r5.close()     // Catch:{ IOException -> 0x0057 }
            r5.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            r9 = 1
            goto L_0x0062
        L_0x0050:
            r8 = move-exception
            r5 = r6
            goto L_0x00ac
        L_0x0053:
            r5 = r6
            goto L_0x0057
        L_0x0055:
            r8 = move-exception
            goto L_0x00ac
        L_0x0057:
            r9 = 3
            boolean r9 = android.util.Log.isLoggable(r0, r9)     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x0061
            r5.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            r9 = 0
        L_0x0062:
            r4 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00a8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r0.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = "Compressed with type: "
            r0.append(r4)     // Catch:{ all -> 0x00b2 }
            r0.append(r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = " of size "
            r0.append(r1)     // Catch:{ all -> 0x00b2 }
            int r1 = com.bumptech.glide.util.C22635o.m102633h(r8)     // Catch:{ all -> 0x00b2 }
            r0.append(r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = " in "
            r0.append(r1)     // Catch:{ all -> 0x00b2 }
            double r1 = com.bumptech.glide.util.C22628i.m102602a(r2)     // Catch:{ all -> 0x00b2 }
            r0.append(r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = ", options format: "
            r0.append(r1)     // Catch:{ all -> 0x00b2 }
            com.bumptech.glide.load.e<android.graphics.Bitmap$CompressFormat> r1 = f57520c     // Catch:{ all -> 0x00b2 }
            java.lang.Object r10 = r10.mo66232c(r1)     // Catch:{ all -> 0x00b2 }
            r0.append(r10)     // Catch:{ all -> 0x00b2 }
            java.lang.String r10 = ", hasAlpha: "
            r0.append(r10)     // Catch:{ all -> 0x00b2 }
            boolean r8 = r8.hasAlpha()     // Catch:{ all -> 0x00b2 }
            r0.append(r8)     // Catch:{ all -> 0x00b2 }
        L_0x00a8:
            com.bumptech.glide.util.pool.C22647b.m102680f()
            return r9
        L_0x00ac:
            if (r5 == 0) goto L_0x00b1
            r5.close()     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            throw r8     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r8 = move-exception
            com.bumptech.glide.util.pool.C22647b.m102680f()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C22405e.mo65770a(com.bumptech.glide.load.engine.s, java.io.File, com.bumptech.glide.load.f):boolean");
    }

    /* renamed from: d */
    public final Bitmap.CompressFormat mo66418d(Bitmap bitmap, C22277f fVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) fVar.mo66232c(f57520c);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Deprecated
    public C22405e() {
        this.f57522a = null;
    }
}
