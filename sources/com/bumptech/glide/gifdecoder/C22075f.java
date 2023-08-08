package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.gifdecoder.C22068a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.gifdecoder.f */
public class C22075f implements C22068a {

    /* renamed from: A */
    public static final String f56695A = "f";

    /* renamed from: B */
    public static final int f56696B = 4096;

    /* renamed from: C */
    public static final int f56697C = -1;

    /* renamed from: D */
    public static final int f56698D = -1;

    /* renamed from: E */
    public static final int f56699E = 4;

    /* renamed from: F */
    public static final int f56700F = 255;
    @C0354l

    /* renamed from: G */
    public static final int f56701G = 0;
    @C0354l

    /* renamed from: f */
    public int[] f56702f;
    @C0354l

    /* renamed from: g */
    public final int[] f56703g;

    /* renamed from: h */
    public final C22068a.C22069a f56704h;

    /* renamed from: i */
    public ByteBuffer f56705i;

    /* renamed from: j */
    public byte[] f56706j;

    /* renamed from: k */
    public C22073d f56707k;

    /* renamed from: l */
    public short[] f56708l;

    /* renamed from: m */
    public byte[] f56709m;

    /* renamed from: n */
    public byte[] f56710n;

    /* renamed from: o */
    public byte[] f56711o;
    @C0354l

    /* renamed from: p */
    public int[] f56712p;

    /* renamed from: q */
    public int f56713q;

    /* renamed from: r */
    public C22072c f56714r;

    /* renamed from: s */
    public Bitmap f56715s;

    /* renamed from: t */
    public boolean f56716t;

    /* renamed from: u */
    public int f56717u;

    /* renamed from: v */
    public int f56718v;

    /* renamed from: w */
    public int f56719w;

    /* renamed from: x */
    public int f56720x;
    @C0363p0

    /* renamed from: y */
    public Boolean f56721y;
    @C0359n0

    /* renamed from: z */
    public Bitmap.Config f56722z;

    public C22075f(@C0359n0 C22068a.C22069a aVar, C22072c cVar, ByteBuffer byteBuffer) {
        this(aVar, cVar, byteBuffer, 1);
    }

    /* renamed from: a */
    public int mo65606a(@C0363p0 InputStream inputStream, int i) {
        int i2;
        if (inputStream != null) {
            if (i > 0) {
                i2 = i + 4096;
            } else {
                i2 = 16384;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
            }
        } else {
            this.f56717u = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        return this.f56717u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        return null;
     */
    @androidx.annotation.C0363p0
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo65607b() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.bumptech.glide.gifdecoder.c r0 = r8.f56714r     // Catch:{ all -> 0x00cf }
            int r0 = r0.f56660c     // Catch:{ all -> 0x00cf }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f56713q     // Catch:{ all -> 0x00cf }
            if (r0 >= 0) goto L_0x0032
        L_0x000d:
            java.lang.String r0 = f56695A     // Catch:{ all -> 0x00cf }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x0030
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = "Unable to decode frame, frameCount="
            r0.append(r3)     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.gifdecoder.c r3 = r8.f56714r     // Catch:{ all -> 0x00cf }
            int r3 = r3.f56660c     // Catch:{ all -> 0x00cf }
            r0.append(r3)     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = ", framePointer="
            r0.append(r3)     // Catch:{ all -> 0x00cf }
            int r3 = r8.f56713q     // Catch:{ all -> 0x00cf }
            r0.append(r3)     // Catch:{ all -> 0x00cf }
        L_0x0030:
            r8.f56717u = r2     // Catch:{ all -> 0x00cf }
        L_0x0032:
            int r0 = r8.f56717u     // Catch:{ all -> 0x00cf }
            r3 = 0
            if (r0 == r2) goto L_0x00b6
            r4 = 2
            if (r0 != r4) goto L_0x003c
            goto L_0x00b6
        L_0x003c:
            r0 = 0
            r8.f56717u = r0     // Catch:{ all -> 0x00cf }
            byte[] r5 = r8.f56706j     // Catch:{ all -> 0x00cf }
            if (r5 != 0) goto L_0x004d
            com.bumptech.glide.gifdecoder.a$a r5 = r8.f56704h     // Catch:{ all -> 0x00cf }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.mo65629b(r6)     // Catch:{ all -> 0x00cf }
            r8.f56706j = r5     // Catch:{ all -> 0x00cf }
        L_0x004d:
            com.bumptech.glide.gifdecoder.c r5 = r8.f56714r     // Catch:{ all -> 0x00cf }
            java.util.List<com.bumptech.glide.gifdecoder.b> r5 = r5.f56662e     // Catch:{ all -> 0x00cf }
            int r6 = r8.f56713q     // Catch:{ all -> 0x00cf }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.gifdecoder.b r5 = (com.bumptech.glide.gifdecoder.C22071b) r5     // Catch:{ all -> 0x00cf }
            int r6 = r8.f56713q     // Catch:{ all -> 0x00cf }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0069
            com.bumptech.glide.gifdecoder.c r7 = r8.f56714r     // Catch:{ all -> 0x00cf }
            java.util.List<com.bumptech.glide.gifdecoder.b> r7 = r7.f56662e     // Catch:{ all -> 0x00cf }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.gifdecoder.b r6 = (com.bumptech.glide.gifdecoder.C22071b) r6     // Catch:{ all -> 0x00cf }
            goto L_0x006a
        L_0x0069:
            r6 = r3
        L_0x006a:
            int[] r7 = r5.f56655k     // Catch:{ all -> 0x00cf }
            if (r7 == 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            com.bumptech.glide.gifdecoder.c r7 = r8.f56714r     // Catch:{ all -> 0x00cf }
            int[] r7 = r7.f56658a     // Catch:{ all -> 0x00cf }
        L_0x0073:
            r8.f56702f = r7     // Catch:{ all -> 0x00cf }
            if (r7 != 0) goto L_0x0092
            java.lang.String r0 = f56695A     // Catch:{ all -> 0x00cf }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x008e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "No valid color table found for frame #"
            r0.append(r1)     // Catch:{ all -> 0x00cf }
            int r1 = r8.f56713q     // Catch:{ all -> 0x00cf }
            r0.append(r1)     // Catch:{ all -> 0x00cf }
        L_0x008e:
            r8.f56717u = r2     // Catch:{ all -> 0x00cf }
            monitor-exit(r8)
            return r3
        L_0x0092:
            boolean r1 = r5.f56650f     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00b0
            int[] r1 = r8.f56703g     // Catch:{ all -> 0x00cf }
            int r2 = r7.length     // Catch:{ all -> 0x00cf }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00cf }
            int[] r1 = r8.f56703g     // Catch:{ all -> 0x00cf }
            r8.f56702f = r1     // Catch:{ all -> 0x00cf }
            int r2 = r5.f56652h     // Catch:{ all -> 0x00cf }
            r1[r2] = r0     // Catch:{ all -> 0x00cf }
            int r0 = r5.f56651g     // Catch:{ all -> 0x00cf }
            if (r0 != r4) goto L_0x00b0
            int r0 = r8.f56713q     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x00b0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00cf }
            r8.f56721y = r0     // Catch:{ all -> 0x00cf }
        L_0x00b0:
            android.graphics.Bitmap r0 = r8.mo65666y(r5, r6)     // Catch:{ all -> 0x00cf }
            monitor-exit(r8)
            return r0
        L_0x00b6:
            java.lang.String r0 = f56695A     // Catch:{ all -> 0x00cf }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00cd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "Unable to decode frame, status="
            r0.append(r1)     // Catch:{ all -> 0x00cf }
            int r1 = r8.f56717u     // Catch:{ all -> 0x00cf }
            r0.append(r1)     // Catch:{ all -> 0x00cf }
        L_0x00cd:
            monitor-exit(r8)
            return r3
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.C22075f.mo65607b():android.graphics.Bitmap");
    }

    /* renamed from: c */
    public void mo65608c() {
        this.f56713q = (this.f56713q + 1) % this.f56714r.f56660c;
    }

    public void clear() {
        this.f56714r = null;
        byte[] bArr = this.f56711o;
        if (bArr != null) {
            this.f56704h.mo65632e(bArr);
        }
        int[] iArr = this.f56712p;
        if (iArr != null) {
            this.f56704h.mo65633f(iArr);
        }
        Bitmap bitmap = this.f56715s;
        if (bitmap != null) {
            this.f56704h.mo65628a(bitmap);
        }
        this.f56715s = null;
        this.f56705i = null;
        this.f56721y = null;
        byte[] bArr2 = this.f56706j;
        if (bArr2 != null) {
            this.f56704h.mo65632e(bArr2);
        }
    }

    /* renamed from: d */
    public int mo65610d() {
        return this.f56714r.f56660c;
    }

    /* renamed from: e */
    public void mo65611e(@C0359n0 Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f56722z = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: f */
    public int mo65612f(int i) {
        if (i >= 0) {
            C22072c cVar = this.f56714r;
            if (i < cVar.f56660c) {
                return cVar.f56662e.get(i).f56653i;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public int mo65613g() {
        int i = this.f56714r.f56670m;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    @C0359n0
    public ByteBuffer getData() {
        return this.f56705i;
    }

    public int getHeight() {
        return this.f56714r.f56664g;
    }

    public int getStatus() {
        return this.f56717u;
    }

    public int getWidth() {
        return this.f56714r.f56663f;
    }

    @Deprecated
    /* renamed from: h */
    public int mo65618h() {
        int i = this.f56714r.f56670m;
        if (i == -1) {
            return 1;
        }
        return i;
    }

    /* renamed from: i */
    public synchronized void mo65619i(@C0359n0 C22072c cVar, @C0359n0 byte[] bArr) {
        mo65622l(cVar, ByteBuffer.wrap(bArr));
    }

    /* renamed from: j */
    public int mo65620j() {
        int i;
        if (this.f56714r.f56660c <= 0 || (i = this.f56713q) < 0) {
            return 0;
        }
        return mo65612f(i);
    }

    /* renamed from: k */
    public void mo65621k() {
        this.f56713q = -1;
    }

    /* renamed from: l */
    public synchronized void mo65622l(@C0359n0 C22072c cVar, @C0359n0 ByteBuffer byteBuffer) {
        mo65624n(cVar, byteBuffer, 1);
    }

    /* renamed from: m */
    public int mo65623m() {
        return this.f56713q;
    }

    /* renamed from: n */
    public synchronized void mo65624n(@C0359n0 C22072c cVar, @C0359n0 ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f56717u = 0;
            this.f56714r = cVar;
            this.f56713q = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f56705i = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f56705i.order(ByteOrder.LITTLE_ENDIAN);
            this.f56716t = false;
            Iterator<C22071b> it = cVar.f56662e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f56651g == 3) {
                        this.f56716t = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f56718v = highestOneBit;
            int i2 = cVar.f56663f;
            this.f56720x = i2 / highestOneBit;
            int i3 = cVar.f56664g;
            this.f56719w = i3 / highestOneBit;
            this.f56711o = this.f56704h.mo65629b(i2 * i3);
            this.f56712p = this.f56704h.mo65631d(this.f56720x * this.f56719w);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    /* renamed from: o */
    public int mo65625o() {
        return this.f56714r.f56670m;
    }

    /* renamed from: p */
    public int mo65626p() {
        return this.f56705i.limit() + this.f56711o.length + (this.f56712p.length * 4);
    }

    @C0354l
    /* renamed from: q */
    public final int mo65658q(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f56718v + i; i9++) {
            byte[] bArr = this.f56711o;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f56702f[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f56718v + i11; i12++) {
            byte[] bArr2 = this.f56711o;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f56702f[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: r */
    public final void mo65659r(C22071b bVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        C22071b bVar2 = bVar;
        int[] iArr = this.f56712p;
        int i6 = bVar2.f56648d;
        int i7 = this.f56718v;
        int i8 = i6 / i7;
        int i9 = bVar2.f56646b / i7;
        int i10 = bVar2.f56647c / i7;
        int i11 = bVar2.f56645a / i7;
        if (this.f56713q == 0) {
            z = true;
        } else {
            z = false;
        }
        int i12 = this.f56720x;
        int i13 = this.f56719w;
        byte[] bArr = this.f56711o;
        int[] iArr2 = this.f56702f;
        Boolean bool = this.f56721y;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (bVar2.f56649e) {
                if (i15 >= i8) {
                    int i18 = i17 + 1;
                    i = i8;
                    if (i18 == 2) {
                        i15 = 4;
                    } else if (i18 == 3) {
                        i14 = 4;
                        i17 = i18;
                        i15 = 2;
                    } else if (i18 == 4) {
                        i17 = i18;
                        i15 = 1;
                        i14 = 2;
                    }
                    i17 = i18;
                } else {
                    i = i8;
                }
                i2 = i15 + i14;
            } else {
                i = i8;
                i2 = i15;
                i15 = i16;
            }
            int i19 = i15 + i9;
            if (i7 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i16 * i7 * bVar2.f56647c;
                if (z3) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = i9;
                        int i27 = iArr2[bArr[i24] & 255];
                        if (i27 != 0) {
                            iArr[i25] = i27;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i26;
                    }
                } else {
                    i5 = i9;
                    int i28 = ((i22 - i21) * i7) + i24;
                    int i29 = i21;
                    while (true) {
                        i4 = i10;
                        if (i29 >= i22) {
                            break;
                        }
                        int q = mo65658q(i24, i28, bVar2.f56647c);
                        if (q != 0) {
                            iArr[i29] = q;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i29++;
                        i10 = i4;
                    }
                    bool = bool2;
                    i16++;
                    i9 = i5;
                    i8 = i;
                    i10 = i4;
                    i15 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i16++;
            i9 = i5;
            i8 = i;
            i10 = i4;
            i15 = i3;
        }
        Boolean bool3 = bool;
        if (this.f56721y == null) {
            if (bool3 == null) {
                z2 = false;
            } else {
                z2 = bool3.booleanValue();
            }
            this.f56721y = Boolean.valueOf(z2);
        }
    }

    public synchronized int read(@C0363p0 byte[] bArr) {
        C22072c d = mo65662u().mo65655r(bArr).mo65641d();
        this.f56714r = d;
        if (bArr != null) {
            mo65619i(d, bArr);
        }
        return this.f56717u;
    }

    /* renamed from: s */
    public final void mo65660s(C22071b bVar) {
        boolean z;
        boolean z2;
        C22071b bVar2 = bVar;
        int[] iArr = this.f56712p;
        int i = bVar2.f56648d;
        int i2 = bVar2.f56646b;
        int i3 = bVar2.f56647c;
        int i4 = bVar2.f56645a;
        if (this.f56713q == 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = this.f56720x;
        byte[] bArr = this.f56711o;
        int[] iArr2 = this.f56702f;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f56647c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i14 = iArr2[b3];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                C22071b bVar3 = bVar;
                i = i13;
            }
            int i15 = i;
            i6++;
            bVar2 = bVar;
        }
        Boolean bool = this.f56721y;
        if ((bool == null || !bool.booleanValue()) && (this.f56721y != null || !z || b == -1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f56721y = Boolean.valueOf(z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65661t(com.bumptech.glide.gifdecoder.C22071b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f56705i
            int r3 = r1.f56654j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            com.bumptech.glide.gifdecoder.c r1 = r0.f56714r
            int r2 = r1.f56663f
            int r1 = r1.f56664g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f56647c
            int r1 = r1.f56648d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f56711o
            if (r1 == 0) goto L_0x0022
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002a
        L_0x0022:
            com.bumptech.glide.gifdecoder.a$a r1 = r0.f56704h
            byte[] r1 = r1.mo65629b(r2)
            r0.f56711o = r1
        L_0x002a:
            byte[] r1 = r0.f56711o
            short[] r3 = r0.f56708l
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0036
            short[] r3 = new short[r4]
            r0.f56708l = r3
        L_0x0036:
            short[] r3 = r0.f56708l
            byte[] r5 = r0.f56709m
            if (r5 != 0) goto L_0x0040
            byte[] r5 = new byte[r4]
            r0.f56709m = r5
        L_0x0040:
            byte[] r5 = r0.f56709m
            byte[] r6 = r0.f56710n
            if (r6 != 0) goto L_0x004c
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f56710n = r6
        L_0x004c:
            byte[] r6 = r0.f56710n
            int r7 = r28.mo65665x()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = r13
        L_0x005f:
            if (r14 >= r9) goto L_0x0069
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x005f
        L_0x0069:
            byte[] r14 = r0.f56706j
            r15 = -1
            r23 = r7
            r21 = r11
            r24 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r25 = r20
            r26 = r25
            r22 = r15
        L_0x0082:
            if (r13 >= r2) goto L_0x014a
            if (r16 != 0) goto L_0x0093
            int r16 = r28.mo65664w()
            if (r16 > 0) goto L_0x0091
            r3 = 3
            r0.f56717u = r3
            goto L_0x014a
        L_0x0091:
            r17 = 0
        L_0x0093:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r0 = r22
            r15 = r23
            r22 = r7
            r7 = r26
        L_0x00ad:
            if (r4 < r15) goto L_0x0134
            r23 = r11
            r11 = r19 & r24
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c1
            r24 = r12
            r15 = r22
            r8 = r23
            r11 = r8
            r0 = -1
            goto L_0x00ad
        L_0x00c1:
            if (r11 != r10) goto L_0x00d7
            r18 = r4
            r26 = r7
            r21 = r8
            r7 = r22
            r11 = r23
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r22 = r0
            r23 = r15
            r15 = -1
            goto L_0x0146
        L_0x00d7:
            r26 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00eb
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r23
            r4 = r26
            goto L_0x00ad
        L_0x00eb:
            if (r11 < r8) goto L_0x00f4
            byte r7 = (byte) r7
            r6[r25] = r7
            int r25 = r25 + 1
            r7 = r0
            goto L_0x00f5
        L_0x00f4:
            r7 = r11
        L_0x00f5:
            if (r7 < r9) goto L_0x0100
            byte r21 = r5[r7]
            r6[r25] = r21
            int r25 = r25 + 1
            short r7 = r3[r7]
            goto L_0x00f5
        L_0x0100:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0107:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r25 <= 0) goto L_0x0114
            int r25 = r25 + -1
            byte r27 = r6[r25]
            r1[r20] = r27
            goto L_0x0107
        L_0x0114:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012b
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r24
            if (r0 != 0) goto L_0x012b
            if (r8 >= r6) goto L_0x012b
            int r15 = r15 + 1
            int r24 = r24 + r8
        L_0x012b:
            r0 = r11
            r11 = r23
            r4 = r26
            r6 = r27
            goto L_0x00ad
        L_0x0134:
            r26 = r4
            r21 = r8
            r23 = r15
            r18 = r26
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r15 = -1
            r26 = r7
            r7 = r22
            r22 = r0
        L_0x0146:
            r0 = r28
            goto L_0x0082
        L_0x014a:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.C22075f.mo65661t(com.bumptech.glide.gifdecoder.b):void");
    }

    @C0359n0
    /* renamed from: u */
    public final C22073d mo65662u() {
        if (this.f56707k == null) {
            this.f56707k = new C22073d();
        }
        return this.f56707k;
    }

    /* renamed from: v */
    public final Bitmap mo65663v() {
        Bitmap.Config config;
        Boolean bool = this.f56721y;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f56722z;
        }
        Bitmap c = this.f56704h.mo65630c(this.f56720x, this.f56719w, config);
        c.setHasAlpha(true);
        return c;
    }

    /* renamed from: w */
    public final int mo65664w() {
        int x = mo65665x();
        if (x <= 0) {
            return x;
        }
        ByteBuffer byteBuffer = this.f56705i;
        byteBuffer.get(this.f56706j, 0, Math.min(x, byteBuffer.remaining()));
        return x;
    }

    /* renamed from: x */
    public final int mo65665x() {
        return this.f56705i.get() & 255;
    }

    /* renamed from: y */
    public final Bitmap mo65666y(C22071b bVar, C22071b bVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f56712p;
        int i3 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f56715s;
            if (bitmap2 != null) {
                this.f56704h.mo65628a(bitmap2);
            }
            this.f56715s = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f56651g == 3 && this.f56715s == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i2 = bVar2.f56651g) > 0) {
            if (i2 == 2) {
                if (!bVar.f56650f) {
                    C22072c cVar = this.f56714r;
                    int i4 = cVar.f56669l;
                    if (bVar.f56655k == null || cVar.f56667j != bVar.f56652h) {
                        i3 = i4;
                    }
                }
                int i5 = bVar2.f56648d;
                int i6 = this.f56718v;
                int i7 = i5 / i6;
                int i8 = bVar2.f56646b / i6;
                int i9 = bVar2.f56647c / i6;
                int i10 = bVar2.f56645a / i6;
                int i11 = this.f56720x;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f56720x;
                }
            } else if (i2 == 3 && (bitmap = this.f56715s) != null) {
                int i16 = this.f56720x;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f56719w);
            }
        }
        mo65661t(bVar);
        if (bVar.f56649e || this.f56718v != 1) {
            mo65659r(bVar);
        } else {
            mo65660s(bVar);
        }
        if (this.f56716t && ((i = bVar.f56651g) == 0 || i == 1)) {
            if (this.f56715s == null) {
                this.f56715s = mo65663v();
            }
            Bitmap bitmap3 = this.f56715s;
            int i17 = this.f56720x;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f56719w);
        }
        Bitmap v = mo65663v();
        int i18 = this.f56720x;
        v.setPixels(iArr, 0, i18, 0, 0, i18, this.f56719w);
        return v;
    }

    public C22075f(@C0359n0 C22068a.C22069a aVar, C22072c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo65624n(cVar, byteBuffer, i);
    }

    public C22075f(@C0359n0 C22068a.C22069a aVar) {
        this.f56703g = new int[256];
        this.f56722z = Bitmap.Config.ARGB_8888;
        this.f56704h = aVar;
        this.f56714r = new C22072c();
    }
}
