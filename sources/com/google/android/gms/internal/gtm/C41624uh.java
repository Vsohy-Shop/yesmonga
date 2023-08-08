package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11354n;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.android.gms.internal.gtm.uh */
public final class C41624uh extends C41672wh {

    /* renamed from: f */
    public final InputStream f105071f;

    /* renamed from: g */
    public final byte[] f105072g;

    /* renamed from: h */
    public int f105073h;

    /* renamed from: i */
    public int f105074i;

    /* renamed from: j */
    public int f105075j;

    /* renamed from: k */
    public int f105076k;

    /* renamed from: l */
    public int f105077l;

    /* renamed from: m */
    public int f105078m = Integer.MAX_VALUE;

    public /* synthetic */ C41624uh(InputStream inputStream, int i, C41600th thVar) {
        super((C41648vh) null);
        C41650vj.m168604f(inputStream, "input");
        this.f105071f = inputStream;
        this.f105072g = new byte[4096];
        this.f105073h = 0;
        this.f105075j = 0;
        this.f105077l = 0;
    }

    /* renamed from: a */
    public final int mo135834a() {
        return this.f105077l + this.f105075j;
    }

    /* renamed from: b */
    public final int mo135835b(int i) throws zzvk {
        if (i >= 0) {
            int i2 = i + this.f105077l + this.f105075j;
            int i3 = this.f105078m;
            if (i2 <= i3) {
                this.f105078m = i2;
                mo135923v();
                return i3;
            }
            throw zzvk.m169002j();
        }
        throw zzvk.m168999f();
    }

    /* renamed from: c */
    public final int mo135836c() throws IOException {
        if (mo135842i()) {
            this.f105076k = 0;
            return 0;
        }
        int p = mo135917p();
        this.f105076k = p;
        if ((p >>> 3) != 0) {
            return p;
        }
        throw zzvk.m168996c();
    }

    /* renamed from: d */
    public final zztd mo135837d() throws IOException {
        int p = mo135917p();
        int i = this.f105073h;
        int i2 = this.f105075j;
        if (p <= i - i2 && p > 0) {
            zztd W = zztd.m168979W(this.f105072g, i2, p);
            this.f105075j += p;
            return W;
        } else if (p == 0) {
            return zztd.f105744a;
        } else {
            byte[] z = mo135927z(p);
            if (z != null) {
                return zztd.m168978Q(z);
            }
            int i3 = this.f105075j;
            int i4 = this.f105073h;
            int i5 = i4 - i3;
            this.f105077l += i4;
            this.f105075j = 0;
            this.f105073h = 0;
            List<byte[]> u = mo135922u(p - i5);
            byte[] bArr = new byte[p];
            System.arraycopy(this.f105072g, i3, bArr, 0, i5);
            for (byte[] next : u) {
                int length = next.length;
                System.arraycopy(next, 0, bArr, i5, length);
                i5 += length;
            }
            return zztd.m168981Y(bArr);
        }
    }

    /* renamed from: e */
    public final String mo135838e() throws IOException {
        int p = mo135917p();
        if (p > 0) {
            int i = this.f105073h;
            int i2 = this.f105075j;
            if (p <= i - i2) {
                String str = new String(this.f105072g, i2, p, C41650vj.f105169a);
                this.f105075j += p;
                return str;
            }
        }
        if (p == 0) {
            return "";
        }
        if (p > this.f105073h) {
            return new String(mo135926y(p, false), C41650vj.f105169a);
        }
        mo135924w(p);
        String str2 = new String(this.f105072g, this.f105075j, p, C41650vj.f105169a);
        this.f105075j += p;
        return str2;
    }

    /* renamed from: f */
    public final String mo135839f() throws IOException {
        byte[] bArr;
        int p = mo135917p();
        int i = this.f105075j;
        int i2 = this.f105073h;
        if (p <= i2 - i && p > 0) {
            bArr = this.f105072g;
            this.f105075j = i + p;
        } else if (p == 0) {
            return "";
        } else {
            i = 0;
            if (p <= i2) {
                mo135924w(p);
                bArr = this.f105072g;
                this.f105075j = p;
            } else {
                bArr = mo135926y(p, false);
            }
        }
        return C41461nm.m168095d(bArr, i, p);
    }

    /* renamed from: g */
    public final void mo135840g(int i) throws zzvk {
        if (this.f105076k != i) {
            throw zzvk.m168995b();
        }
    }

    /* renamed from: h */
    public final void mo135841h(int i) {
        this.f105078m = i;
        mo135923v();
    }

    /* renamed from: i */
    public final boolean mo135842i() throws IOException {
        if (this.f105075j != this.f105073h || mo135925x(1)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo135843j() throws IOException {
        return mo135919r() != 0;
    }

    /* renamed from: k */
    public final boolean mo135844k(int i) throws IOException {
        int c;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f105073h - this.f105075j >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f105072g;
                    int i4 = this.f105075j;
                    this.f105075j = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzvk.m168998e();
            }
            while (i3 < 10) {
                if (mo135915n() < 0) {
                    i3++;
                }
            }
            throw zzvk.m168998e();
            return true;
        } else if (i2 == 1) {
            mo135921t(8);
            return true;
        } else if (i2 == 2) {
            mo135921t(mo135917p());
            return true;
        } else if (i2 == 3) {
            do {
                c = mo135836c();
                if (c == 0 || !mo135844k(c)) {
                    mo135840g(((i >>> 3) << 3) | 4);
                }
                c = mo135836c();
                break;
            } while (!mo135844k(c));
            mo135840g(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo135921t(4);
                return true;
            }
            throw zzvk.m168994a();
        }
    }

    /* renamed from: n */
    public final byte mo135915n() throws IOException {
        if (this.f105075j == this.f105073h) {
            mo135924w(1);
        }
        byte[] bArr = this.f105072g;
        int i = this.f105075j;
        this.f105075j = i + 1;
        return bArr[i];
    }

    /* renamed from: o */
    public final int mo135916o() throws IOException {
        int i = this.f105075j;
        if (this.f105073h - i < 4) {
            mo135924w(4);
            i = this.f105075j;
        }
        byte[] bArr = this.f105072g;
        this.f105075j = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo135917p() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f105075j
            int r1 = r5.f105073h
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f105072g
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f105075j = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.f105075j = r1
            return r0
        L_0x006c:
            long r0 = r5.mo135920s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41624uh.mo135917p():int");
    }

    /* renamed from: q */
    public final long mo135918q() throws IOException {
        int i = this.f105075j;
        if (this.f105073h - i < 8) {
            mo135924w(8);
            i = this.f105075j;
        }
        byte[] bArr = this.f105072g;
        this.f105075j = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: r */
    public final long mo135919r() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f105075j;
        int i2 = this.f105073h;
        if (i2 != i) {
            byte[] bArr = this.f105072g;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f105075j = i3;
                return (long) b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ C11354n.f28471b;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << DateTimeFieldType.f30624Y);
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ C11354n.f28471b);
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << DateTimeFieldType.f30608J0);
                        if (b5 < 0) {
                            b = b5 ^ C11354n.f28471b;
                        } else {
                            i5 = i4 + 1;
                            long j5 = (((long) bArr[i4]) << 28) ^ ((long) b5);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i6 = i5 + 1;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i6 + 1;
                                    j5 = j6 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i5 + 1;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i6 + 1;
                                            j2 = (j6 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i6 = i5 + 1;
                                                if (((long) bArr[i5]) >= 0) {
                                                    j = j2;
                                                    i4 = i6;
                                                    this.f105075j = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f105075j = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f105075j = i4;
                    return j;
                }
                j = (long) b;
                this.f105075j = i4;
                return j;
            }
        }
        return mo135920s();
    }

    /* renamed from: s */
    public final long mo135920s() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte n = mo135915n();
            j |= ((long) (n & Byte.MAX_VALUE)) << i;
            if ((n & C11354n.f28471b) == 0) {
                return j;
            }
        }
        throw zzvk.m168998e();
    }

    /* renamed from: t */
    public final void mo135921t(int i) throws IOException {
        int i2 = this.f105073h;
        int i3 = this.f105075j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f105075j = i3 + i;
        } else if (i >= 0) {
            int i5 = this.f105077l;
            int i6 = i5 + i3;
            int i7 = this.f105078m;
            if (i6 + i <= i7) {
                this.f105077l = i6;
                this.f105073h = 0;
                this.f105075j = 0;
                while (i4 < i) {
                    try {
                        long j = (long) (i - i4);
                        long skip = this.f105071f.skip(j);
                        int i8 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i8 < 0 || skip > j) {
                            String valueOf = String.valueOf(this.f105071f.getClass());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        } else if (i8 == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (zzvk e) {
                        e.mo136160k();
                        throw e;
                    } catch (Throwable th) {
                        this.f105077l += i4;
                        mo135923v();
                        throw th;
                    }
                }
                this.f105077l += i4;
                mo135923v();
                if (i4 < i) {
                    int i9 = this.f105073h;
                    int i10 = i9 - this.f105075j;
                    this.f105075j = i9;
                    mo135924w(1);
                    while (true) {
                        int i11 = i - i10;
                        int i12 = this.f105073h;
                        if (i11 > i12) {
                            i10 += i12;
                            this.f105075j = i12;
                            mo135924w(1);
                        } else {
                            this.f105075j = i11;
                            return;
                        }
                    }
                }
            } else {
                mo135921t((i7 - i5) - i3);
                throw zzvk.m169002j();
            }
        } else {
            throw zzvk.m168999f();
        }
    }

    /* renamed from: u */
    public final List<byte[]> mo135922u(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f105071f.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.f105077l += read;
                    i2 += read;
                } else {
                    throw zzvk.m169002j();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: v */
    public final void mo135923v() {
        int i = this.f105073h + this.f105074i;
        this.f105073h = i;
        int i2 = this.f105077l + i;
        int i3 = this.f105078m;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f105074i = i4;
            this.f105073h = i - i4;
            return;
        }
        this.f105074i = 0;
    }

    /* renamed from: w */
    public final void mo135924w(int i) throws IOException {
        if (mo135925x(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.f105077l) - this.f105075j) {
            throw zzvk.m169001i();
        }
        throw zzvk.m169002j();
    }

    /* renamed from: x */
    public final boolean mo135925x(int i) throws IOException {
        int i2 = this.f105075j;
        int i3 = this.f105073h;
        if (i2 + i > i3) {
            int i4 = this.f105077l;
            if (i > (Integer.MAX_VALUE - i4) - i2 || i4 + i2 + i > this.f105078m) {
                return false;
            }
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.f105072g;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i4 = this.f105077l + i2;
                this.f105077l = i4;
                i3 = this.f105073h - i2;
                this.f105073h = i3;
                this.f105075j = 0;
            }
            try {
                int read = this.f105071f.read(this.f105072g, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
                if (read == 0 || read < -1 || read > 4096) {
                    String valueOf = String.valueOf(this.f105071f.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 91);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f105073h += read;
                    mo135923v();
                    if (this.f105073h >= i) {
                        return true;
                    }
                    return mo135925x(i);
                }
            } catch (zzvk e) {
                e.mo136160k();
                throw e;
            }
        } else {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: y */
    public final byte[] mo135926y(int i, boolean z) throws IOException {
        byte[] z2 = mo135927z(i);
        if (z2 != null) {
            return z2;
        }
        int i2 = this.f105075j;
        int i3 = this.f105073h;
        int i4 = i3 - i2;
        this.f105077l += i3;
        this.f105075j = 0;
        this.f105073h = 0;
        List<byte[]> u = mo135922u(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f105072g, i2, bArr, 0, i4);
        for (byte[] next : u) {
            int length = next.length;
            System.arraycopy(next, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* renamed from: z */
    public final byte[] mo135927z(int i) throws IOException {
        if (i == 0) {
            return C41650vj.f105171c;
        }
        if (i >= 0) {
            int i2 = this.f105077l;
            int i3 = this.f105075j;
            int i4 = i2 + i3 + i;
            if (-2147483647 + i4 <= 0) {
                int i5 = this.f105078m;
                if (i4 <= i5) {
                    int i6 = this.f105073h - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.f105071f.available()) {
                                return null;
                            }
                        } catch (zzvk e) {
                            e.mo136160k();
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f105072g, this.f105075j, bArr, 0, i6);
                    this.f105077l += this.f105073h;
                    this.f105075j = 0;
                    this.f105073h = 0;
                    while (i6 < i) {
                        try {
                            int read = this.f105071f.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f105077l += read;
                                i6 += read;
                            } else {
                                throw zzvk.m169002j();
                            }
                        } catch (zzvk e2) {
                            e2.mo136160k();
                            throw e2;
                        }
                    }
                    return bArr;
                }
                mo135921t((i5 - i2) - i3);
                throw zzvk.m169002j();
            }
            throw zzvk.m169001i();
        }
        throw zzvk.m168999f();
    }
}
