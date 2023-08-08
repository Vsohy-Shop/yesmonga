package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14880y2;
import com.google.android.material.color.C31234i;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C11354n;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.contentsquare.android.sdk.b */
public abstract class C14193b implements C14475k6 {

    /* renamed from: com.contentsquare.android.sdk.b$b */
    public static final class C14195b extends C14193b {

        /* renamed from: a */
        public final boolean f35074a;

        /* renamed from: b */
        public final byte[] f35075b;

        /* renamed from: c */
        public int f35076c;

        /* renamed from: d */
        public final int f35077d;

        /* renamed from: e */
        public int f35078e;

        /* renamed from: f */
        public int f35079f;

        /* renamed from: g */
        public int f35080g;

        public C14195b(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f35074a = z;
            this.f35075b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f35076c = arrayOffset;
            this.f35077d = arrayOffset;
            this.f35078e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: A */
        public final void mo34552A(int i) {
            mo34611t(i);
            if ((i & 3) != 0) {
                throw C14394h5.m62031i();
            }
        }

        /* renamed from: B */
        public final void mo34553B(int i) {
            mo34611t(i);
            if ((i & 7) != 0) {
                throw C14394h5.m62031i();
            }
        }

        /* renamed from: C */
        public final boolean mo34554C() {
            return this.f35076c == this.f35078e;
        }

        /* renamed from: D */
        public final byte mo34555D() {
            int i = this.f35076c;
            if (i != this.f35078e) {
                byte[] bArr = this.f35075b;
                this.f35076c = i + 1;
                return bArr[i];
            }
            throw C14394h5.m62033k();
        }

        /* renamed from: E */
        public final int mo34556E() {
            mo34611t(4);
            return mo34557F();
        }

        /* renamed from: F */
        public final int mo34557F() {
            int i = this.f35076c;
            byte[] bArr = this.f35075b;
            this.f35076c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
        }

        /* renamed from: G */
        public final long mo34558G() {
            mo34611t(8);
            return mo34559H();
        }

        /* renamed from: H */
        public final long mo34559H() {
            int i = this.f35076c;
            byte[] bArr = this.f35075b;
            this.f35076c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: R0 */
        public void mo34560R0(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C14846x2) {
                C14846x2 x2Var = (C14846x2) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 0) {
                    do {
                        x2Var.mo36802w(mo34582f());
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                } else if (c == 2) {
                    int d = this.f35076c + mo34578d();
                    while (this.f35076c < d) {
                        x2Var.mo36802w(mo34578d());
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo34582f()));
                        if (!mo34554C()) {
                            i = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i;
                } else if (c2 == 2) {
                    int d2 = this.f35076c + mo34578d();
                    while (this.f35076c < d2) {
                        list.add(Integer.valueOf(mo34578d()));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            }
        }

        /* renamed from: S0 */
        public String mo34561S0() {
            return mo34609s(false);
        }

        /* renamed from: T0 */
        public void mo34562T0(List<C14719t0> list) {
            int i;
            if (C14710sf.m63426c(this.f35079f) == 2) {
                do {
                    list.add(mo34602p());
                    if (!mo34554C()) {
                        i = this.f35076c;
                    } else {
                        return;
                    }
                } while (mo34578d() == this.f35079f);
                this.f35076c = i;
                return;
            }
            throw C14394h5.m62028f();
        }

        /* renamed from: U0 */
        public void mo34563U0(List<Float> list) {
            int i;
            int i2;
            if (list instanceof C14382gf) {
                C14382gf gfVar = (C14382gf) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 2) {
                    int d = mo34578d();
                    mo34552A(d);
                    int i3 = this.f35076c + d;
                    while (this.f35076c < i3) {
                        gfVar.mo35387h(Float.intBitsToFloat(mo34557F()));
                    }
                } else if (c == 5) {
                    do {
                        gfVar.mo35387h(mo34572a());
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 2) {
                    int d2 = mo34578d();
                    mo34552A(d2);
                    int i4 = this.f35076c + d2;
                    while (this.f35076c < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(mo34557F())));
                    }
                } else if (c2 == 5) {
                    do {
                        list.add(Float.valueOf(mo34572a()));
                        if (!mo34554C()) {
                            i = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i;
                } else {
                    throw C14394h5.m62028f();
                }
            }
        }

        /* renamed from: V */
        public void mo34564V(List<Boolean> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof C14444j7) {
                C14444j7 j7Var = (C14444j7) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 0) {
                    do {
                        j7Var.mo35631k(mo34577c1());
                        if (!mo34554C()) {
                            i3 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i3;
                    return;
                } else if (c == 2) {
                    i = this.f35076c + mo34578d();
                    while (this.f35076c < i) {
                        j7Var.mo35631k(mo34578d() != 0);
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo34577c1()));
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                    return;
                } else if (c2 == 2) {
                    i = this.f35076c + mo34578d();
                    while (this.f35076c < i) {
                        list.add(Boolean.valueOf(mo34578d() != 0));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            }
            mo34613v(i);
        }

        /* renamed from: V0 */
        public void mo34565V0(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C14846x2) {
                C14846x2 x2Var = (C14846x2) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 0) {
                    do {
                        x2Var.mo36802w(mo34608s());
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                } else if (c == 2) {
                    int d = this.f35076c + mo34578d();
                    while (this.f35076c < d) {
                        x2Var.mo36802w(C14231c.m61081g(mo34578d()));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo34608s()));
                        if (!mo34554C()) {
                            i = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i;
                } else if (c2 == 2) {
                    int d2 = this.f35076c + mo34578d();
                    while (this.f35076c < d2) {
                        list.add(Integer.valueOf(C14231c.m61081g(mo34578d())));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            }
        }

        /* renamed from: W */
        public void mo34566W(List<Long> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof C14871y) {
                C14871y yVar = (C14871y) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 0) {
                    do {
                        yVar.mo36876k(mo34594l());
                        if (!mo34554C()) {
                            i3 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i3;
                    return;
                } else if (c == 2) {
                    i = this.f35076c + mo34578d();
                    while (this.f35076c < i) {
                        yVar.mo36876k(mo34580e());
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 0) {
                    do {
                        list.add(Long.valueOf(mo34594l()));
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                    return;
                } else if (c2 == 2) {
                    i = this.f35076c + mo34578d();
                    while (this.f35076c < i) {
                        list.add(Long.valueOf(mo34580e()));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            }
            mo34613v(i);
        }

        /* renamed from: W0 */
        public <T> void mo34567W0(List<T> list, C14398h8<T> h8Var, C14787v2 v2Var) {
            int i;
            if (C14710sf.m63426c(this.f35079f) == 2) {
                int i2 = this.f35079f;
                do {
                    list.add(mo34616y(h8Var, v2Var));
                    if (!mo34554C()) {
                        i = this.f35076c;
                    } else {
                        return;
                    }
                } while (mo34578d() == i2);
                this.f35076c = i;
                return;
            }
            throw C14394h5.m62028f();
        }

        /* renamed from: X0 */
        public void mo34568X0(List<Long> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof C14871y) {
                C14871y yVar = (C14871y) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 0) {
                    do {
                        yVar.mo36876k(mo34588i());
                        if (!mo34554C()) {
                            i3 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i3;
                    return;
                } else if (c == 2) {
                    i = this.f35076c + mo34578d();
                    while (this.f35076c < i) {
                        yVar.mo36876k(mo34580e());
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 0) {
                    do {
                        list.add(Long.valueOf(mo34588i()));
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                    return;
                } else if (c2 == 2) {
                    i = this.f35076c + mo34578d();
                    while (this.f35076c < i) {
                        list.add(Long.valueOf(mo34580e()));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            }
            mo34613v(i);
        }

        /* renamed from: Y */
        public int mo34569Y() {
            mo34615x(0);
            return mo34578d();
        }

        @Deprecated
        /* renamed from: Y0 */
        public <T> void mo34570Y0(List<T> list, C14398h8<T> h8Var, C14787v2 v2Var) {
            int i;
            if (C14710sf.m63426c(this.f35079f) == 3) {
                int i2 = this.f35079f;
                do {
                    list.add(mo34614w(h8Var, v2Var));
                    if (!mo34554C()) {
                        i = this.f35076c;
                    } else {
                        return;
                    }
                } while (mo34578d() == i2);
                this.f35076c = i;
                return;
            }
            throw C14394h5.m62028f();
        }

        /* renamed from: Z0 */
        public void mo34571Z0(List<Integer> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof C14846x2) {
                C14846x2 x2Var = (C14846x2) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 0) {
                    do {
                        x2Var.mo36802w(mo34569Y());
                        if (!mo34554C()) {
                            i3 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i3;
                    return;
                } else if (c == 2) {
                    i = this.f35076c + mo34578d();
                    while (this.f35076c < i) {
                        x2Var.mo36802w(mo34578d());
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo34569Y()));
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                    return;
                } else if (c2 == 2) {
                    i = this.f35076c + mo34578d();
                    while (this.f35076c < i) {
                        list.add(Integer.valueOf(mo34578d()));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            }
            mo34613v(i);
        }

        /* renamed from: a */
        public float mo34572a() {
            mo34615x(5);
            return Float.intBitsToFloat(mo34556E());
        }

        /* renamed from: a1 */
        public void mo34573a1(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C14846x2) {
                C14846x2 x2Var = (C14846x2) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 0) {
                    do {
                        x2Var.mo36802w(mo34590j());
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                } else if (c == 2) {
                    int d = this.f35076c + mo34578d();
                    while (this.f35076c < d) {
                        x2Var.mo36802w(mo34578d());
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo34590j()));
                        if (!mo34554C()) {
                            i = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i;
                } else if (c2 == 2) {
                    int d2 = this.f35076c + mo34578d();
                    while (this.f35076c < d2) {
                        list.add(Integer.valueOf(mo34578d()));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            }
        }

        /* renamed from: b */
        public long mo34574b() {
            mo34615x(0);
            return C14231c.m61077b(mo34580e());
        }

        /* renamed from: b1 */
        public void mo34575b1(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C14871y) {
                C14871y yVar = (C14871y) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 1) {
                    do {
                        yVar.mo36876k(mo34596m());
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                } else if (c == 2) {
                    int d = mo34578d();
                    mo34553B(d);
                    int i3 = this.f35076c + d;
                    while (this.f35076c < i3) {
                        yVar.mo36876k(mo34559H());
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 1) {
                    do {
                        list.add(Long.valueOf(mo34596m()));
                        if (!mo34554C()) {
                            i = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i;
                } else if (c2 == 2) {
                    int d2 = mo34578d();
                    mo34553B(d2);
                    int i4 = this.f35076c + d2;
                    while (this.f35076c < i4) {
                        list.add(Long.valueOf(mo34559H()));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            }
        }

        /* renamed from: c */
        public int mo34576c() {
            mo34615x(5);
            return mo34556E();
        }

        /* renamed from: c1 */
        public boolean mo34577c1() {
            mo34615x(0);
            return mo34578d() != 0;
        }

        /* renamed from: d */
        public final int mo34578d() {
            byte b;
            int i = this.f35076c;
            int i2 = this.f35078e;
            if (i2 != i) {
                byte[] bArr = this.f35075b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f35076c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) mo34584g();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ C11354n.f28471b;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << DateTimeFieldType.f30624Y);
                        if (b4 >= 0) {
                            b = b4 ^ C11354n.f28471b;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << DateTimeFieldType.f30608J0);
                            if (b5 < 0) {
                                b = b5 ^ C11354n.f28471b;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << C31234i.C31240f.f75184f)) ^ C11354n.f28471b;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw C14394h5.m62029g();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f35076c = i4;
                    return b;
                }
            } else {
                throw C14394h5.m62033k();
            }
        }

        /* renamed from: d1 */
        public void mo34579d1(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C14846x2) {
                C14846x2 x2Var = (C14846x2) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 2) {
                    int d = mo34578d();
                    mo34552A(d);
                    int i3 = this.f35076c + d;
                    while (this.f35076c < i3) {
                        x2Var.mo36802w(mo34557F());
                    }
                } else if (c == 5) {
                    do {
                        x2Var.mo36802w(mo34598n());
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 2) {
                    int d2 = mo34578d();
                    mo34552A(d2);
                    int i4 = this.f35076c + d2;
                    while (this.f35076c < i4) {
                        list.add(Integer.valueOf(mo34557F()));
                    }
                } else if (c2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo34598n()));
                        if (!mo34554C()) {
                            i = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i;
                } else {
                    throw C14394h5.m62028f();
                }
            }
        }

        /* renamed from: e */
        public long mo34580e() {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f35076c;
            int i3 = this.f35078e;
            if (i3 != i2) {
                byte[] bArr = this.f35075b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f35076c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return mo34584g();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ C11354n.f28471b;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << DateTimeFieldType.f30624Y);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ C11354n.f28471b);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << DateTimeFieldType.f30608J0);
                            if (b5 < 0) {
                                b = b5 ^ C11354n.f28471b;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw C14394h5.m62029g();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f35076c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f35076c = i;
                    return j;
                }
            } else {
                throw C14394h5.m62033k();
            }
        }

        /* renamed from: e1 */
        public double mo34581e1() {
            mo34615x(1);
            return Double.longBitsToDouble(mo34558G());
        }

        /* renamed from: f */
        public int mo34582f() {
            mo34615x(0);
            return mo34578d();
        }

        /* renamed from: f1 */
        public void mo34583f1(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C14871y) {
                C14871y yVar = (C14871y) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 1) {
                    do {
                        yVar.mo36876k(mo34597m1());
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                } else if (c == 2) {
                    int d = mo34578d();
                    mo34553B(d);
                    int i3 = this.f35076c + d;
                    while (this.f35076c < i3) {
                        yVar.mo36876k(mo34559H());
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 1) {
                    do {
                        list.add(Long.valueOf(mo34597m1()));
                        if (!mo34554C()) {
                            i = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i;
                } else if (c2 == 2) {
                    int d2 = mo34578d();
                    mo34553B(d2);
                    int i4 = this.f35076c + d2;
                    while (this.f35076c < i4) {
                        list.add(Long.valueOf(mo34559H()));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            }
        }

        /* renamed from: g */
        public final long mo34584g() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte D = mo34555D();
                j |= ((long) (D & Byte.MAX_VALUE)) << i;
                if ((D & C11354n.f28471b) == 0) {
                    return j;
                }
            }
            throw C14394h5.m62029g();
        }

        /* renamed from: g1 */
        public int mo34585g1() {
            if (mo34554C()) {
                return Integer.MAX_VALUE;
            }
            int d = mo34578d();
            this.f35079f = d;
            if (d == this.f35080g) {
                return Integer.MAX_VALUE;
            }
            return C14710sf.m63424a(d);
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo34586h() {
            /*
                r3 = this;
                int r0 = r3.f35080g
                int r1 = r3.f35079f
                int r1 = com.contentsquare.android.sdk.C14710sf.m63424a(r1)
                r2 = 4
                int r1 = com.contentsquare.android.sdk.C14710sf.m63425b(r1, r2)
                r3.f35080g = r1
            L_0x000f:
                int r1 = r3.mo34585g1()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.mo34589i1()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f35079f
                int r2 = r3.f35080g
                if (r1 != r2) goto L_0x0027
                r3.f35080g = r0
                return
            L_0x0027:
                com.contentsquare.android.sdk.h5 r0 = com.contentsquare.android.sdk.C14394h5.m62031i()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14193b.C14195b.mo34586h():void");
        }

        /* renamed from: h1 */
        public <T> T mo34587h1(C14398h8<T> h8Var, C14787v2 v2Var) {
            mo34615x(2);
            return mo34616y(h8Var, v2Var);
        }

        /* renamed from: i */
        public long mo34588i() {
            mo34615x(0);
            return mo34580e();
        }

        /* renamed from: i1 */
        public boolean mo34589i1() {
            int i;
            int i2;
            if (mo34554C() || (i = this.f35079f) == this.f35080g) {
                return false;
            }
            int c = C14710sf.m63426c(i);
            if (c != 0) {
                if (c == 1) {
                    i2 = 8;
                } else if (c == 2) {
                    i2 = mo34578d();
                } else if (c == 3) {
                    mo34586h();
                    return true;
                } else if (c == 5) {
                    i2 = 4;
                } else {
                    throw C14394h5.m62028f();
                }
                mo34617z(i2);
                return true;
            }
            mo34604q();
            return true;
        }

        /* renamed from: j */
        public int mo34590j() {
            mo34615x(0);
            return mo34578d();
        }

        @Deprecated
        /* renamed from: j1 */
        public <T> T mo34591j1(C14398h8<T> h8Var, C14787v2 v2Var) {
            mo34615x(3);
            return mo34614w(h8Var, v2Var);
        }

        /* renamed from: k */
        public String mo34592k() {
            return mo34609s(true);
        }

        /* renamed from: k1 */
        public void mo34593k1(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C14871y) {
                C14871y yVar = (C14871y) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 0) {
                    do {
                        yVar.mo36876k(mo34574b());
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                } else if (c == 2) {
                    int d = this.f35076c + mo34578d();
                    while (this.f35076c < d) {
                        yVar.mo36876k(C14231c.m61077b(mo34580e()));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 0) {
                    do {
                        list.add(Long.valueOf(mo34574b()));
                        if (!mo34554C()) {
                            i = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i;
                } else if (c2 == 2) {
                    int d2 = this.f35076c + mo34578d();
                    while (this.f35076c < d2) {
                        list.add(Long.valueOf(C14231c.m61077b(mo34580e())));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            }
        }

        /* renamed from: l */
        public long mo34594l() {
            mo34615x(0);
            return mo34580e();
        }

        /* renamed from: l1 */
        public <K, V> void mo34595l1(Map<K, V> map, C14880y2.C14881a<K, V> aVar, C14787v2 v2Var) {
            mo34615x(2);
            int d = mo34578d();
            mo34611t(d);
            int i = this.f35078e;
            this.f35078e = this.f35076c + d;
            try {
                throw null;
            } catch (Throwable th) {
                this.f35078e = i;
                throw th;
            }
        }

        /* renamed from: m */
        public long mo34596m() {
            mo34615x(1);
            return mo34558G();
        }

        /* renamed from: m1 */
        public long mo34597m1() {
            mo34615x(1);
            return mo34558G();
        }

        /* renamed from: n */
        public int mo34598n() {
            mo34615x(5);
            return mo34556E();
        }

        /* renamed from: n1 */
        public void mo34599n1(List<String> list) {
            mo34612u(list, false);
        }

        /* renamed from: o */
        public int mo34600o() {
            return this.f35079f;
        }

        /* renamed from: o1 */
        public void mo34601o1(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C14846x2) {
                C14846x2 x2Var = (C14846x2) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 2) {
                    int d = mo34578d();
                    mo34552A(d);
                    int i3 = this.f35076c + d;
                    while (this.f35076c < i3) {
                        x2Var.mo36802w(mo34557F());
                    }
                } else if (c == 5) {
                    do {
                        x2Var.mo36802w(mo34576c());
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 2) {
                    int d2 = mo34578d();
                    mo34552A(d2);
                    int i4 = this.f35076c + d2;
                    while (this.f35076c < i4) {
                        list.add(Integer.valueOf(mo34557F()));
                    }
                } else if (c2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo34576c()));
                        if (!mo34554C()) {
                            i = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i;
                } else {
                    throw C14394h5.m62028f();
                }
            }
        }

        /* renamed from: p */
        public C14719t0 mo34602p() {
            mo34615x(2);
            int d = mo34578d();
            if (d == 0) {
                return C14719t0.f36442b;
            }
            mo34611t(d);
            C14719t0 X = this.f35074a ? C14719t0.m63430X(this.f35075b, this.f35076c, d) : C14719t0.m63436q(this.f35075b, this.f35076c, d);
            this.f35076c += d;
            return X;
        }

        /* renamed from: p1 */
        public void mo34603p1(List<String> list) {
            mo34612u(list, true);
        }

        /* renamed from: q */
        public final void mo34604q() {
            int i = this.f35078e;
            int i2 = this.f35076c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f35075b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f35076c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            mo34606r();
        }

        @Deprecated
        /* renamed from: q1 */
        public <T> T mo34605q1(Class<T> cls, C14787v2 v2Var) {
            mo34615x(3);
            return mo34614w(C14599od.m62876d().mo36104a(cls), v2Var);
        }

        /* renamed from: r */
        public final void mo34606r() {
            int i = 0;
            while (i < 10) {
                if (mo34555D() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C14394h5.m62029g();
        }

        /* renamed from: r1 */
        public <T> T mo34607r1(Class<T> cls, C14787v2 v2Var) {
            mo34615x(2);
            return mo34616y(C14599od.m62876d().mo36104a(cls), v2Var);
        }

        /* renamed from: s */
        public String mo34609s(boolean z) {
            mo34615x(2);
            int d = mo34578d();
            if (d == 0) {
                return "";
            }
            mo34611t(d);
            if (z) {
                byte[] bArr = this.f35075b;
                int i = this.f35076c;
                if (!C14553ne.m62727n(bArr, i, i + d)) {
                    throw C14394h5.m62027e();
                }
            }
            String str = new String(this.f35075b, this.f35076c, d, C14566o3.f36057b);
            this.f35076c += d;
            return str;
        }

        /* renamed from: s1 */
        public void mo34610s1(List<Double> list) {
            int i;
            int i2;
            if (list instanceof C14177a8) {
                C14177a8 a8Var = (C14177a8) list;
                int c = C14710sf.m63426c(this.f35079f);
                if (c == 1) {
                    do {
                        a8Var.mo34512h(mo34581e1());
                        if (!mo34554C()) {
                            i2 = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i2;
                } else if (c == 2) {
                    int d = mo34578d();
                    mo34553B(d);
                    int i3 = this.f35076c + d;
                    while (this.f35076c < i3) {
                        a8Var.mo34512h(Double.longBitsToDouble(mo34559H()));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            } else {
                int c2 = C14710sf.m63426c(this.f35079f);
                if (c2 == 1) {
                    do {
                        list.add(Double.valueOf(mo34581e1()));
                        if (!mo34554C()) {
                            i = this.f35076c;
                        } else {
                            return;
                        }
                    } while (mo34578d() == this.f35079f);
                    this.f35076c = i;
                } else if (c2 == 2) {
                    int d2 = mo34578d();
                    mo34553B(d2);
                    int i4 = this.f35076c + d2;
                    while (this.f35076c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(mo34559H())));
                    }
                } else {
                    throw C14394h5.m62028f();
                }
            }
        }

        /* renamed from: t */
        public final void mo34611t(int i) {
            if (i < 0 || i > this.f35078e - this.f35076c) {
                throw C14394h5.m62033k();
            }
        }

        /* renamed from: u */
        public void mo34612u(List<String> list, boolean z) {
            int i;
            int i2;
            if (C14710sf.m63426c(this.f35079f) != 2) {
                throw C14394h5.m62028f();
            } else if (!(list instanceof C14308ec) || z) {
                do {
                    list.add(mo34609s(z));
                    if (!mo34554C()) {
                        i = this.f35076c;
                    } else {
                        return;
                    }
                } while (mo34578d() == this.f35079f);
                this.f35076c = i;
            } else {
                C14308ec ecVar = (C14308ec) list;
                do {
                    ecVar.mo35080q0(mo34602p());
                    if (!mo34554C()) {
                        i2 = this.f35076c;
                    } else {
                        return;
                    }
                } while (mo34578d() == this.f35079f);
                this.f35076c = i2;
            }
        }

        /* renamed from: v */
        public final void mo34613v(int i) {
            if (this.f35076c != i) {
                throw C14394h5.m62033k();
            }
        }

        /* renamed from: w */
        public final <T> T mo34614w(C14398h8<T> h8Var, C14787v2 v2Var) {
            int i = this.f35080g;
            this.f35080g = C14710sf.m63425b(C14710sf.m63424a(this.f35079f), 4);
            try {
                T a = h8Var.mo35210a();
                h8Var.mo35221i(a, this, v2Var);
                h8Var.mo35216e(a);
                if (this.f35079f == this.f35080g) {
                    return a;
                }
                throw C14394h5.m62031i();
            } finally {
                this.f35080g = i;
            }
        }

        /* renamed from: x */
        public final void mo34615x(int i) {
            if (C14710sf.m63426c(this.f35079f) != i) {
                throw C14394h5.m62028f();
            }
        }

        /* renamed from: y */
        public final <T> T mo34616y(C14398h8<T> h8Var, C14787v2 v2Var) {
            int d = mo34578d();
            mo34611t(d);
            int i = this.f35078e;
            int i2 = this.f35076c + d;
            this.f35078e = i2;
            try {
                T a = h8Var.mo35210a();
                h8Var.mo35221i(a, this, v2Var);
                h8Var.mo35216e(a);
                if (this.f35076c == i2) {
                    return a;
                }
                throw C14394h5.m62031i();
            } finally {
                this.f35078e = i;
            }
        }

        /* renamed from: z */
        public final void mo34617z(int i) {
            mo34611t(i);
            this.f35076c += i;
        }

        /* renamed from: s */
        public int mo34608s() {
            mo34615x(0);
            return C14231c.m61081g(mo34578d());
        }
    }

    public C14193b() {
    }

    /* renamed from: b */
    public static C14193b m60853b(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C14195b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
