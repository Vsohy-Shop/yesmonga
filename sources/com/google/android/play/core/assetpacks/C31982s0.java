package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C32040c1;
import com.google.android.play.core.internal.C32062k;
import java.io.File;

/* renamed from: com.google.android.play.core.assetpacks.s0 */
public final class C31982s0 {

    /* renamed from: f */
    public static final C32062k f78077f = new C32062k("ExtractChunkTaskHandler");

    /* renamed from: a */
    public final byte[] f78078a = new byte[8192];

    /* renamed from: b */
    public final C31906c0 f78079b;

    /* renamed from: c */
    public final C32040c1<C31914d3> f78080c;

    /* renamed from: d */
    public final C32040c1<C32009z> f78081d;

    /* renamed from: e */
    public final C31998w0 f78082e;

    public C31982s0(C31906c0 c0Var, C32040c1<C31914d3> c1Var, C32040c1<C32009z> c1Var2, C31998w0 w0Var) {
        this.f78079b = c0Var;
        this.f78080c = c1Var;
        this.f78081d = c1Var2;
        this.f78082e = w0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017d A[Catch:{ all -> 0x032f, all -> 0x0335, IOException -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a2 A[Catch:{ all -> 0x032f, all -> 0x0335, IOException -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d6 A[Catch:{ all -> 0x032f, all -> 0x0335, IOException -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0291 A[SYNTHETIC, Splitter:B:93:0x0291] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92668a(com.google.android.play.core.assetpacks.C31978r0 r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            com.google.android.play.core.assetpacks.i2 r0 = new com.google.android.play.core.assetpacks.i2
            com.google.android.play.core.assetpacks.c0 r4 = r1.f78079b
            java.lang.String r5 = r2.f77956b
            int r6 = r2.f78061c
            long r7 = r2.f78062d
            java.lang.String r9 = r2.f78063e
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r9)
            com.google.android.play.core.assetpacks.c0 r10 = r1.f78079b
            java.lang.String r11 = r2.f77956b
            int r12 = r2.f78061c
            long r13 = r2.f78062d
            java.lang.String r15 = r2.f78063e
            java.io.File r3 = r10.mo92501E(r11, r12, r13, r15)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x002b
            r3.mkdirs()
        L_0x002b:
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            java.io.InputStream r3 = r2.f78069k     // Catch:{ IOException -> 0x033b }
            int r4 = r2.f78064f     // Catch:{ IOException -> 0x033b }
            if (r4 == r13) goto L_0x0037
            r15 = r3
            goto L_0x003f
        L_0x0037:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x033b }
            r5 = 8192(0x2000, float:1.14794E-41)
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x033b }
            r15 = r4
        L_0x003f:
            int r3 = r2.f78065g     // Catch:{ all -> 0x032f }
            if (r3 <= 0) goto L_0x017a
            com.google.android.play.core.assetpacks.h2 r3 = r0.mo92585e()     // Catch:{ all -> 0x032f }
            int r4 = r3.mo92574e()     // Catch:{ all -> 0x032f }
            int r5 = r2.f78065g     // Catch:{ all -> 0x032f }
            int r6 = r5 + -1
            if (r4 != r6) goto L_0x015a
            int r4 = r3.mo92570a()     // Catch:{ all -> 0x032f }
            r16 = 0
            if (r4 == r13) goto L_0x00d8
            if (r4 == r12) goto L_0x009b
            if (r4 != r11) goto L_0x0081
            com.google.android.play.core.internal.k r4 = f78077f     // Catch:{ all -> 0x032f }
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r4.mo92775a(r5, r6)     // Catch:{ all -> 0x032f }
            long r3 = r3.mo92572c()     // Catch:{ all -> 0x032f }
            r0.mo92586f(r15, r3)     // Catch:{ all -> 0x032f }
            boolean r3 = r23.mo92666a()     // Catch:{ all -> 0x032f }
            if (r3 == 0) goto L_0x0077
        L_0x0073:
            r4 = r16
            goto L_0x017b
        L_0x0077:
            com.google.android.play.core.assetpacks.bk r0 = new com.google.android.play.core.assetpacks.bk     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.f77955a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x0081:
            com.google.android.play.core.assetpacks.bk r0 = new com.google.android.play.core.assetpacks.bk     // Catch:{ all -> 0x032f }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x032f }
            int r3 = r3.mo92570a()     // Catch:{ all -> 0x032f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032f }
            r4[r14] = r3     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x032f }
            int r4 = r2.f77955a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x009b:
            com.google.android.play.core.internal.k r3 = f78077f     // Catch:{ all -> 0x032f }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r3.mo92775a(r4, r5)     // Catch:{ all -> 0x032f }
            com.google.android.play.core.assetpacks.c0 r3 = r1.f78079b     // Catch:{ all -> 0x032f }
            java.lang.String r4 = r2.f77956b     // Catch:{ all -> 0x032f }
            int r5 = r2.f78061c     // Catch:{ all -> 0x032f }
            long r6 = r2.f78062d     // Catch:{ all -> 0x032f }
            java.lang.String r8 = r2.f78063e     // Catch:{ all -> 0x032f }
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            java.io.File r3 = r16.mo92500D(r17, r18, r19, r21)     // Catch:{ all -> 0x032f }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x032f }
            if (r4 == 0) goto L_0x00ce
            java.io.SequenceInputStream r4 = new java.io.SequenceInputStream     // Catch:{ all -> 0x032f }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x032f }
            r5.<init>(r3)     // Catch:{ all -> 0x032f }
            r4.<init>(r5, r15)     // Catch:{ all -> 0x032f }
            goto L_0x017b
        L_0x00ce:
            com.google.android.play.core.assetpacks.bk r0 = new com.google.android.play.core.assetpacks.bk     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.f77955a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x00d8:
            com.google.android.play.core.internal.k r4 = f78077f     // Catch:{ all -> 0x032f }
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x032f }
            java.lang.String r6 = r3.mo92571b()     // Catch:{ all -> 0x032f }
            r5[r14] = r6     // Catch:{ all -> 0x032f }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.mo92775a(r6, r5)     // Catch:{ all -> 0x032f }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032f }
            java.lang.String r5 = r3.mo92571b()     // Catch:{ all -> 0x032f }
            r4.<init>(r5)     // Catch:{ all -> 0x032f }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x032f }
            if (r5 == 0) goto L_0x0150
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x032f }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x032f }
            long r6 = r3.mo92572c()     // Catch:{ all -> 0x032f }
            r5.seek(r6)     // Catch:{ all -> 0x032f }
            long r6 = r3.mo92573d()     // Catch:{ all -> 0x032f }
        L_0x0108:
            r8 = 8192(0x2000, double:4.0474E-320)
            long r8 = java.lang.Math.min(r6, r8)     // Catch:{ all -> 0x032f }
            int r3 = (int) r8     // Catch:{ all -> 0x032f }
            byte[] r8 = r1.f78078a     // Catch:{ all -> 0x032f }
            int r8 = r15.read(r8, r14, r3)     // Catch:{ all -> 0x032f }
            int r8 = java.lang.Math.max(r8, r14)     // Catch:{ all -> 0x032f }
            if (r8 <= 0) goto L_0x0120
            byte[] r9 = r1.f78078a     // Catch:{ all -> 0x032f }
            r5.write(r9, r14, r8)     // Catch:{ all -> 0x032f }
        L_0x0120:
            long r10 = (long) r8     // Catch:{ all -> 0x032f }
            long r9 = r6 - r10
            r6 = 0
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x012f
            if (r8 > 0) goto L_0x012c
            goto L_0x012f
        L_0x012c:
            r6 = r9
            r11 = 3
            goto L_0x0108
        L_0x012f:
            long r6 = r5.length()     // Catch:{ all -> 0x032f }
            r5.close()     // Catch:{ all -> 0x032f }
            if (r8 == r3) goto L_0x017a
            com.google.android.play.core.internal.k r3 = f78077f     // Catch:{ all -> 0x032f }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r3.mo92775a(r5, r8)     // Catch:{ all -> 0x032f }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032f }
            int r11 = r2.f78065g     // Catch:{ all -> 0x032f }
            r3 = r0
            r5 = r6
            r7 = r9
            r9 = r11
            r3.mo92581a(r4, r5, r7, r9)     // Catch:{ all -> 0x032f }
            goto L_0x0073
        L_0x0150:
            com.google.android.play.core.assetpacks.bk r0 = new com.google.android.play.core.assetpacks.bk     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.f77955a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x015a:
            com.google.android.play.core.assetpacks.bk r0 = new com.google.android.play.core.assetpacks.bk     // Catch:{ all -> 0x032f }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x032f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x032f }
            r6[r14] = r5     // Catch:{ all -> 0x032f }
            int r3 = r3.mo92574e()     // Catch:{ all -> 0x032f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032f }
            r6[r13] = r3     // Catch:{ all -> 0x032f }
            java.lang.String r3 = java.lang.String.format(r4, r6)     // Catch:{ all -> 0x032f }
            int r4 = r2.f77955a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x017a:
            r4 = r15
        L_0x017b:
            if (r4 == 0) goto L_0x0288
            com.google.android.play.core.assetpacks.m0 r3 = new com.google.android.play.core.assetpacks.m0     // Catch:{ all -> 0x032f }
            r3.<init>(r4)     // Catch:{ all -> 0x032f }
            java.io.File r5 = r22.mo92669b(r23)     // Catch:{ all -> 0x032f }
        L_0x0186:
            com.google.android.play.core.assetpacks.o2 r6 = r3.mo92621a()     // Catch:{ all -> 0x032f }
            boolean r7 = r6.mo92656g()     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x01dd
            boolean r7 = r3.mo92623c()     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x01dd
            boolean r7 = r6.mo92651c()     // Catch:{ all -> 0x032f }
            if (r7 == 0) goto L_0x01d6
            boolean r7 = r6.mo92650b()     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x01d6
            byte[] r7 = r6.mo92659i()     // Catch:{ all -> 0x032f }
            r0.mo92587g(r7)     // Catch:{ all -> 0x032f }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x032f }
            java.lang.String r8 = r6.mo92652d()     // Catch:{ all -> 0x032f }
            r7.<init>(r5, r8)     // Catch:{ all -> 0x032f }
            java.io.File r8 = r7.getParentFile()     // Catch:{ all -> 0x032f }
            r8.mkdirs()     // Catch:{ all -> 0x032f }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x032f }
            r8.<init>(r7)     // Catch:{ all -> 0x032f }
            byte[] r7 = r1.f78078a     // Catch:{ all -> 0x032f }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032f }
        L_0x01c4:
            if (r7 <= 0) goto L_0x01d2
            byte[] r9 = r1.f78078a     // Catch:{ all -> 0x032f }
            r8.write(r9, r14, r7)     // Catch:{ all -> 0x032f }
            byte[] r7 = r1.f78078a     // Catch:{ all -> 0x032f }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032f }
            goto L_0x01c4
        L_0x01d2:
            r8.close()     // Catch:{ all -> 0x032f }
            goto L_0x01dd
        L_0x01d6:
            byte[] r7 = r6.mo92659i()     // Catch:{ all -> 0x032f }
            r0.mo92588h(r7, r3)     // Catch:{ all -> 0x032f }
        L_0x01dd:
            boolean r7 = r3.mo92622b()     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x01e9
            boolean r7 = r3.mo92623c()     // Catch:{ all -> 0x032f }
            if (r7 == 0) goto L_0x0186
        L_0x01e9:
            boolean r5 = r3.mo92623c()     // Catch:{ all -> 0x032f }
            if (r5 == 0) goto L_0x01ff
            com.google.android.play.core.internal.k r5 = f78077f     // Catch:{ all -> 0x032f }
            java.lang.String r7 = "Writing central directory metadata."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r5.mo92775a(r7, r8)     // Catch:{ all -> 0x032f }
            byte[] r5 = r6.mo92659i()     // Catch:{ all -> 0x032f }
            r0.mo92588h(r5, r4)     // Catch:{ all -> 0x032f }
        L_0x01ff:
            boolean r4 = r23.mo92666a()     // Catch:{ all -> 0x032f }
            if (r4 != 0) goto L_0x0288
            boolean r4 = r6.mo92656g()     // Catch:{ all -> 0x032f }
            if (r4 == 0) goto L_0x021e
            com.google.android.play.core.internal.k r3 = f78077f     // Catch:{ all -> 0x032f }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r3.mo92775a(r4, r5)     // Catch:{ all -> 0x032f }
            byte[] r3 = r6.mo92659i()     // Catch:{ all -> 0x032f }
            int r4 = r2.f78065g     // Catch:{ all -> 0x032f }
            r0.mo92582b(r3, r4)     // Catch:{ all -> 0x032f }
            goto L_0x0288
        L_0x021e:
            boolean r4 = r3.mo92623c()     // Catch:{ all -> 0x032f }
            if (r4 == 0) goto L_0x0233
            com.google.android.play.core.internal.k r3 = f78077f     // Catch:{ all -> 0x032f }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r3.mo92775a(r4, r5)     // Catch:{ all -> 0x032f }
            int r3 = r2.f78065g     // Catch:{ all -> 0x032f }
            r0.mo92583c(r3)     // Catch:{ all -> 0x032f }
            goto L_0x0288
        L_0x0233:
            int r4 = r6.mo92655f()     // Catch:{ all -> 0x032f }
            if (r4 != 0) goto L_0x0269
            com.google.android.play.core.internal.k r4 = f78077f     // Catch:{ all -> 0x032f }
            java.lang.String r5 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r4.mo92775a(r5, r7)     // Catch:{ all -> 0x032f }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032f }
            java.io.File r5 = r22.mo92669b(r23)     // Catch:{ all -> 0x032f }
            java.lang.String r7 = r6.mo92652d()     // Catch:{ all -> 0x032f }
            r4.<init>(r5, r7)     // Catch:{ all -> 0x032f }
            long r5 = r6.mo92653e()     // Catch:{ all -> 0x032f }
            long r7 = r3.mo92624d()     // Catch:{ all -> 0x032f }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x032f }
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0261
            goto L_0x027a
        L_0x0261:
            com.google.android.play.core.assetpacks.bk r0 = new com.google.android.play.core.assetpacks.bk     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x0269:
            com.google.android.play.core.internal.k r4 = f78077f     // Catch:{ all -> 0x032f }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r4.mo92775a(r5, r6)     // Catch:{ all -> 0x032f }
            java.io.File r4 = r0.mo92590j()     // Catch:{ all -> 0x032f }
            long r5 = r4.length()     // Catch:{ all -> 0x032f }
        L_0x027a:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032f }
            long r7 = r3.mo92624d()     // Catch:{ all -> 0x032f }
            int r9 = r2.f78065g     // Catch:{ all -> 0x032f }
            r3 = r0
            r3.mo92581a(r4, r5, r7, r9)     // Catch:{ all -> 0x032f }
        L_0x0288:
            r15.close()     // Catch:{ IOException -> 0x033b }
            boolean r3 = r23.mo92666a()
            if (r3 == 0) goto L_0x02b1
            int r3 = r2.f78065g     // Catch:{ IOException -> 0x0297 }
            r0.mo92584d(r3)     // Catch:{ IOException -> 0x0297 }
            goto L_0x02b1
        L_0x0297:
            r0 = move-exception
            com.google.android.play.core.internal.k r3 = f78077f
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r3.mo92776b(r5, r4)
            com.google.android.play.core.assetpacks.bk r3 = new com.google.android.play.core.assetpacks.bk
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            int r2 = r2.f77955a
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x02b1:
            com.google.android.play.core.internal.k r0 = f78077f
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r2.f78065g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r14] = r4
            java.lang.String r4 = r2.f78063e
            r3[r13] = r4
            java.lang.String r4 = r2.f77956b
            r3[r12] = r4
            int r4 = r2.f77955a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.mo92778d(r4, r3)
            com.google.android.play.core.internal.c1<com.google.android.play.core.assetpacks.d3> r0 = r1.f78080c
            java.lang.Object r0 = r0.mo92734a()
            com.google.android.play.core.assetpacks.d3 r0 = (com.google.android.play.core.assetpacks.C31914d3) r0
            int r3 = r2.f77955a
            java.lang.String r4 = r2.f77956b
            java.lang.String r5 = r2.f78063e
            int r6 = r2.f78065g
            r0.mo92542c(r3, r4, r5, r6)
            java.io.InputStream r0 = r2.f78069k     // Catch:{ IOException -> 0x02ed }
            r0.close()     // Catch:{ IOException -> 0x02ed }
            goto L_0x0307
        L_0x02ed:
            com.google.android.play.core.internal.k r0 = f78077f
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.f78065g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r14] = r3
            java.lang.String r3 = r2.f78063e
            r4[r13] = r3
            java.lang.String r3 = r2.f77956b
            r4[r12] = r3
            java.lang.String r3 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.mo92779e(r3, r4)
        L_0x0307:
            int r0 = r2.f78068j
            r3 = 3
            if (r0 != r3) goto L_0x032e
            com.google.android.play.core.internal.c1<com.google.android.play.core.assetpacks.z> r0 = r1.f78081d
            java.lang.Object r0 = r0.mo92734a()
            com.google.android.play.core.assetpacks.z r0 = (com.google.android.play.core.assetpacks.C32009z) r0
            java.lang.String r3 = r2.f77956b
            long r7 = r2.f78067i
            r4 = 3
            r5 = 0
            com.google.android.play.core.assetpacks.w0 r6 = r1.f78082e
            double r9 = r6.mo92704c(r3, r2)
            r11 = 1
            java.lang.String r12 = ""
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            com.google.android.play.core.assetpacks.AssetPackState r2 = com.google.android.play.core.assetpacks.AssetPackState.m129378d(r2, r3, r4, r5, r7, r9, r11, r12)
            r0.mo92708i(r2)
        L_0x032e:
            return
        L_0x032f:
            r0 = move-exception
            r3 = r0
            r15.close()     // Catch:{ all -> 0x0335 }
            goto L_0x033a
        L_0x0335:
            r0 = move-exception
            r4 = r0
            com.google.android.play.core.internal.C32029a1.m129765a(r3, r4)     // Catch:{ IOException -> 0x033b }
        L_0x033a:
            throw r3     // Catch:{ IOException -> 0x033b }
        L_0x033b:
            r0 = move-exception
            com.google.android.play.core.internal.k r3 = f78077f
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "IOException during extraction %s."
            r3.mo92776b(r5, r4)
            com.google.android.play.core.assetpacks.bk r3 = new com.google.android.play.core.assetpacks.bk
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r2.f78065g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r14] = r5
            java.lang.String r5 = r2.f78063e
            r4[r13] = r5
            java.lang.String r5 = r2.f77956b
            r4[r12] = r5
            int r5 = r2.f77955a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.f77955a
            r3.<init>(r4, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C31982s0.mo92668a(com.google.android.play.core.assetpacks.r0):void");
    }

    /* renamed from: b */
    public final File mo92669b(C31978r0 r0Var) {
        File x = this.f78079b.mo92530x(r0Var.f77956b, r0Var.f78061c, r0Var.f78062d, r0Var.f78063e);
        if (!x.exists()) {
            x.mkdirs();
        }
        return x;
    }
}
