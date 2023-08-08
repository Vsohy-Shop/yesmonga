package com.squareup.moshi;

import android.support.p002v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import okio.ByteString;
import okio.C12500m;
import okio.C12507o;
import okio.C12510p0;
import okio.C12516r0;

/* renamed from: com.squareup.moshi.o */
public final class C35404o implements C12510p0 {

    /* renamed from: X */
    public static final ByteString f87020X = ByteString.f30387c;

    /* renamed from: v */
    public static final ByteString f87021v = ByteString.m50362X("[]{}\"'/#");

    /* renamed from: w */
    public static final ByteString f87022w = ByteString.m50362X("'\\");

    /* renamed from: x */
    public static final ByteString f87023x = ByteString.m50362X("\"\\");

    /* renamed from: y */
    public static final ByteString f87024y = ByteString.m50362X("\r\n");

    /* renamed from: z */
    public static final ByteString f87025z = ByteString.m50362X("*");

    /* renamed from: a */
    public final C12507o f87026a;

    /* renamed from: b */
    public final C12500m f87027b;

    /* renamed from: c */
    public final C12500m f87028c;

    /* renamed from: d */
    public ByteString f87029d;

    /* renamed from: e */
    public int f87030e;

    /* renamed from: f */
    public long f87031f;

    /* renamed from: g */
    public boolean f87032g;

    public C35404o(C12507o oVar) {
        this(oVar, new C12500m(), f87021v, 0);
    }

    /* renamed from: a */
    public final void mo106059a(long j) throws IOException {
        ByteString byteString;
        while (true) {
            long j2 = this.f87031f;
            if (j2 < j && this.f87029d != (byteString = f87020X)) {
                if (j2 == this.f87027b.mo27362c0()) {
                    if (this.f87031f <= 0) {
                        this.f87026a.mo27293f2(1);
                    } else {
                        return;
                    }
                }
                long d2 = this.f87027b.mo27291d2(this.f87029d, this.f87031f);
                if (d2 == -1) {
                    this.f87031f = this.f87027b.mo27362c0();
                } else {
                    byte D = this.f87027b.mo27330D(d2);
                    ByteString byteString2 = this.f87029d;
                    ByteString byteString3 = f87021v;
                    if (byteString2 == byteString3) {
                        if (D == 34) {
                            this.f87029d = f87023x;
                            this.f87031f = d2 + 1;
                        } else if (D == 35) {
                            this.f87029d = f87024y;
                            this.f87031f = d2 + 1;
                        } else if (D == 39) {
                            this.f87029d = f87022w;
                            this.f87031f = d2 + 1;
                        } else if (D != 47) {
                            if (D != 91) {
                                if (D != 93) {
                                    if (D != 123) {
                                        if (D != 125) {
                                        }
                                    }
                                }
                                int i = this.f87030e - 1;
                                this.f87030e = i;
                                if (i == 0) {
                                    this.f87029d = byteString;
                                }
                                this.f87031f = d2 + 1;
                            }
                            this.f87030e++;
                            this.f87031f = d2 + 1;
                        } else {
                            long j3 = 2 + d2;
                            this.f87026a.mo27293f2(j3);
                            long j4 = d2 + 1;
                            byte D2 = this.f87027b.mo27330D(j4);
                            if (D2 == 47) {
                                this.f87029d = f87024y;
                                this.f87031f = j3;
                            } else if (D2 == 42) {
                                this.f87029d = f87025z;
                                this.f87031f = j3;
                            } else {
                                this.f87031f = j4;
                            }
                        }
                    } else if (byteString2 == f87022w || byteString2 == f87023x) {
                        if (D == 92) {
                            long j5 = d2 + 2;
                            this.f87026a.mo27293f2(j5);
                            this.f87031f = j5;
                        } else {
                            if (this.f87030e > 0) {
                                byteString = byteString3;
                            }
                            this.f87029d = byteString;
                            this.f87031f = d2 + 1;
                        }
                    } else if (byteString2 == f87025z) {
                        long j6 = 2 + d2;
                        this.f87026a.mo27293f2(j6);
                        long j7 = d2 + 1;
                        if (this.f87027b.mo27330D(j7) == 47) {
                            this.f87031f = j6;
                            this.f87029d = byteString3;
                        } else {
                            this.f87031f = j7;
                        }
                    } else if (byteString2 == f87024y) {
                        this.f87031f = d2 + 1;
                        this.f87029d = byteString3;
                    } else {
                        throw new AssertionError();
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo106060b() throws IOException {
        this.f87032g = true;
        while (this.f87029d != f87020X) {
            mo106059a(PlaybackStateCompat.f473O0);
            this.f87026a.skip(this.f87031f);
        }
    }

    public void close() throws IOException {
        this.f87032g = true;
    }

    public long read(C12500m mVar, long j) throws IOException {
        if (this.f87032g) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            if (!this.f87028c.mo27275J2()) {
                long read = this.f87028c.read(mVar, j);
                long j2 = j - read;
                if (this.f87027b.mo27275J2()) {
                    return read;
                }
                long read2 = read(mVar, j2);
                if (read2 != -1) {
                    return read + read2;
                }
                return read;
            }
            mo106059a(j);
            long j3 = this.f87031f;
            if (j3 != 0) {
                long min = Math.min(j, j3);
                mVar.write(this.f87027b, min);
                this.f87031f -= min;
                return min;
            } else if (this.f87029d == f87020X) {
                return -1;
            } else {
                throw new AssertionError();
            }
        }
    }

    public C12516r0 timeout() {
        return this.f87026a.timeout();
    }

    public C35404o(C12507o oVar, C12500m mVar, ByteString byteString, int i) {
        this.f87031f = 0;
        this.f87032g = false;
        this.f87026a = oVar;
        this.f87027b = oVar.mo27292e();
        this.f87028c = mVar;
        this.f87029d = byteString;
        this.f87030e = i;
    }
}
