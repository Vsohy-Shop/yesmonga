package com.google.android.gms.internal.gtm;

import com.google.android.material.color.C31234i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.C11354n;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.android.gms.internal.gtm.dh */
public final class C41215dh extends C41263fh {

    /* renamed from: a */
    public final byte[] f104541a;

    /* renamed from: b */
    public int f104542b;

    /* renamed from: c */
    public int f104543c;

    /* renamed from: d */
    public int f104544d;

    /* renamed from: e */
    public int f104545e;

    public C41215dh(ByteBuffer byteBuffer, boolean z) {
        super((C41239eh) null);
        this.f104541a = byteBuffer.array();
        this.f104542b = byteBuffer.arrayOffset() + byteBuffer.position();
        this.f104543c = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[LOOP:0: B:18:0x002e->B:21:0x003b, LOOP_START] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo135236A() throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.mo135273f0()
            r1 = 0
            if (r0 != 0) goto L_0x0085
            int r0 = r7.f104544d
            int r2 = r7.f104545e
            if (r0 != r2) goto L_0x000f
            goto L_0x0085
        L_0x000f:
            r3 = r0 & 7
            r4 = 1
            if (r3 == 0) goto L_0x0059
            if (r3 == r4) goto L_0x0053
            r1 = 2
            if (r3 == r1) goto L_0x004b
            r1 = 4
            r5 = 3
            if (r3 == r5) goto L_0x0029
            r0 = 5
            if (r3 != r0) goto L_0x0024
            r7.mo135267c0(r1)
            return r4
        L_0x0024:
            com.google.android.gms.internal.gtm.zzvj r0 = com.google.android.gms.internal.gtm.zzvk.m168994a()
            throw r0
        L_0x0029:
            int r0 = r0 >>> r5
            int r0 = r0 << r5
            r0 = r0 | r1
            r7.f104545e = r0
        L_0x002e:
            int r0 = r7.mo135268d()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x003d
            boolean r0 = r7.mo135236A()
            if (r0 != 0) goto L_0x002e
        L_0x003d:
            int r0 = r7.f104544d
            int r1 = r7.f104545e
            if (r0 != r1) goto L_0x0046
            r7.f104545e = r2
            return r4
        L_0x0046:
            com.google.android.gms.internal.gtm.zzvk r0 = com.google.android.gms.internal.gtm.zzvk.m169000g()
            throw r0
        L_0x004b:
            int r0 = r7.mo135278i()
            r7.mo135267c0(r0)
            return r4
        L_0x0053:
            r0 = 8
            r7.mo135267c0(r0)
            return r4
        L_0x0059:
            int r0 = r7.f104543c
            int r2 = r7.f104542b
            int r0 = r0 - r2
            r3 = 10
            if (r0 < r3) goto L_0x0074
            byte[] r0 = r7.f104541a
            r5 = r1
        L_0x0065:
            if (r5 >= r3) goto L_0x0074
            int r6 = r2 + 1
            byte r2 = r0[r2]
            if (r2 < 0) goto L_0x0070
            r7.f104542b = r6
            goto L_0x007f
        L_0x0070:
            int r5 = r5 + 1
            r2 = r6
            goto L_0x0065
        L_0x0074:
            if (r1 >= r3) goto L_0x0080
            byte r0 = r7.mo135264b()
            if (r0 >= 0) goto L_0x007f
            int r1 = r1 + 1
            goto L_0x0074
        L_0x007f:
            return r4
        L_0x0080:
            com.google.android.gms.internal.gtm.zzvk r0 = com.google.android.gms.internal.gtm.zzvk.m168998e()
            throw r0
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41215dh.mo135236A():boolean");
    }

    /* renamed from: B */
    public final <T> T mo135237B(C41315hl<T> hlVar, C41673wi wiVar) throws IOException {
        mo135265b0(3);
        return mo135292w(hlVar, wiVar);
    }

    /* renamed from: C */
    public final void mo135238C(List<Boolean> list) throws IOException {
        int i;
        boolean z;
        int i2;
        boolean z2;
        if (list instanceof C41311hh) {
            C41311hh hhVar = (C41311hh) list;
            int i3 = this.f104544d & 7;
            if (i3 == 0) {
                do {
                    hhVar.mo135445h(mo135260Y());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else if (i3 == 2) {
                int i4 = this.f104542b + mo135278i();
                while (this.f104542b < i4) {
                    if (mo135278i() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hhVar.mo135445h(z2);
                }
                mo135295z(i4);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i5 = this.f104544d & 7;
            if (i5 == 0) {
                do {
                    list.add(Boolean.valueOf(mo135260Y()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else if (i5 == 2) {
                int i6 = this.f104542b + mo135278i();
                while (this.f104542b < i6) {
                    if (mo135278i() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list.add(Boolean.valueOf(z));
                }
                mo135295z(i6);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: D */
    public final void mo135239D(List<Float> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41193cj) {
            C41193cj cjVar = (C41193cj) list;
            int i3 = this.f104544d & 7;
            if (i3 == 2) {
                int i4 = mo135278i();
                mo135269d0(i4);
                int i5 = this.f104542b + i4;
                while (this.f104542b < i5) {
                    cjVar.mo135182h(Float.intBitsToFloat(mo135274g()));
                }
            } else if (i3 == 5) {
                do {
                    cjVar.mo135182h(zzb());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i6 = this.f104544d & 7;
            if (i6 == 2) {
                int i7 = mo135278i();
                mo135269d0(i7);
                int i8 = this.f104542b + i7;
                while (this.f104542b < i8) {
                    list.add(Float.valueOf(Float.intBitsToFloat(mo135274g())));
                }
            } else if (i6 == 5) {
                do {
                    list.add(Float.valueOf(zzb()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: E */
    public final void mo135240E(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            int i3 = this.f104544d & 7;
            if (i3 == 1) {
                do {
                    jkVar.mo135523i(mo135289t());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else if (i3 == 2) {
                int i4 = mo135278i();
                mo135271e0(i4);
                int i5 = this.f104542b + i4;
                while (this.f104542b < i5) {
                    jkVar.mo135523i(mo135282m());
                }
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i6 = this.f104544d & 7;
            if (i6 == 1) {
                do {
                    list.add(Long.valueOf(mo135289t()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else if (i6 == 2) {
                int i7 = mo135278i();
                mo135271e0(i7);
                int i8 = this.f104542b + i7;
                while (this.f104542b < i8) {
                    list.add(Long.valueOf(mo135282m()));
                }
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: F */
    public final <T> void mo135241F(List<T> list, C41315hl<T> hlVar, C41673wi wiVar) throws IOException {
        int i;
        int i2 = this.f104544d;
        if ((i2 & 7) == 3) {
            do {
                list.add(mo135292w(hlVar, wiVar));
                if (!mo135273f0()) {
                    i = this.f104542b;
                } else {
                    return;
                }
            } while (mo135278i() == i2);
            this.f104542b = i;
            return;
        }
        throw zzvk.m168994a();
    }

    /* renamed from: G */
    public final <T> T mo135242G(C41315hl<T> hlVar, C41673wi wiVar) throws IOException {
        mo135265b0(2);
        return mo135293x(hlVar, wiVar);
    }

    /* renamed from: H */
    public final void mo135243H(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            int i3 = this.f104544d & 7;
            if (i3 == 0) {
                do {
                    jkVar.mo135523i(mo135286q());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else if (i3 == 2) {
                int i4 = this.f104542b + mo135278i();
                while (this.f104542b < i4) {
                    jkVar.mo135523i(mo135275g0());
                }
                mo135295z(i4);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i5 = this.f104544d & 7;
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(mo135286q()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else if (i5 == 2) {
                int i6 = this.f104542b + mo135278i();
                while (this.f104542b < i6) {
                    list.add(Long.valueOf(mo135275g0()));
                }
                mo135295z(i6);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: I */
    public final void mo135244I(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            int i3 = this.f104544d & 7;
            if (i3 == 0) {
                do {
                    njVar.mo135665U(mo135276h());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else if (i3 == 2) {
                int i4 = this.f104542b + mo135278i();
                while (this.f104542b < i4) {
                    njVar.mo135665U(mo135278i());
                }
                mo135295z(i4);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i5 = this.f104544d & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(mo135276h()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else if (i5 == 2) {
                int i6 = this.f104542b + mo135278i();
                while (this.f104542b < i6) {
                    list.add(Integer.valueOf(mo135278i()));
                }
                mo135295z(i6);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: J */
    public final String mo135245J() throws IOException {
        return mo135277h0(true);
    }

    /* renamed from: K */
    public final <T> void mo135246K(List<T> list, C41315hl<T> hlVar, C41673wi wiVar) throws IOException {
        int i;
        int i2 = this.f104544d;
        if ((i2 & 7) == 2) {
            do {
                list.add(mo135293x(hlVar, wiVar));
                if (!mo135273f0()) {
                    i = this.f104542b;
                } else {
                    return;
                }
            } while (mo135278i() == i2);
            this.f104542b = i;
            return;
        }
        throw zzvk.m168994a();
    }

    /* renamed from: L */
    public final void mo135247L(List<zztd> list) throws IOException {
        int i;
        if ((this.f104544d & 7) == 2) {
            do {
                list.add(mo135291v());
                if (!mo135273f0()) {
                    i = this.f104542b;
                } else {
                    return;
                }
            } while (mo135278i() == this.f104544d);
            this.f104542b = i;
            return;
        }
        throw zzvk.m168994a();
    }

    /* renamed from: M */
    public final <T> T mo135248M(Class<T> cls, C41673wi wiVar) throws IOException {
        mo135265b0(2);
        return mo135293x(C41219dl.m167407a().mo135299b(cls), wiVar);
    }

    /* renamed from: N */
    public final void mo135249N(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            int i3 = this.f104544d & 7;
            if (i3 == 0) {
                do {
                    jkVar.mo135523i(mo135290u());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else if (i3 == 2) {
                int i4 = this.f104542b + mo135278i();
                while (this.f104542b < i4) {
                    jkVar.mo135523i(mo135275g0());
                }
                mo135295z(i4);
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i5 = this.f104544d & 7;
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(mo135290u()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else if (i5 == 2) {
                int i6 = this.f104542b + mo135278i();
                while (this.f104542b < i6) {
                    list.add(Long.valueOf(mo135275g0()));
                }
                mo135295z(i6);
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: O */
    public final void mo135250O(List<Double> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41601ti) {
            C41601ti tiVar = (C41601ti) list;
            int i3 = this.f104544d & 7;
            if (i3 == 1) {
                do {
                    tiVar.mo135866h(zza());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else if (i3 == 2) {
                int i4 = mo135278i();
                mo135271e0(i4);
                int i5 = this.f104542b + i4;
                while (this.f104542b < i5) {
                    tiVar.mo135866h(Double.longBitsToDouble(mo135282m()));
                }
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i6 = this.f104544d & 7;
            if (i6 == 1) {
                do {
                    list.add(Double.valueOf(zza()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else if (i6 == 2) {
                int i7 = mo135278i();
                mo135271e0(i7);
                int i8 = this.f104542b + i7;
                while (this.f104542b < i8) {
                    list.add(Double.valueOf(Double.longBitsToDouble(mo135282m())));
                }
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: P */
    public final void mo135251P(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            int i3 = this.f104544d & 7;
            if (i3 == 0) {
                do {
                    njVar.mo135665U(mo135285p());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else if (i3 == 2) {
                int i4 = this.f104542b + mo135278i();
                while (this.f104542b < i4) {
                    njVar.mo135665U(mo135278i());
                }
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i5 = this.f104544d & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(mo135285p()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else if (i5 == 2) {
                int i6 = this.f104542b + mo135278i();
                while (this.f104542b < i6) {
                    list.add(Integer.valueOf(mo135278i()));
                }
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: Q */
    public final <T> T mo135252Q(Class<T> cls, C41673wi wiVar) throws IOException {
        mo135265b0(3);
        return mo135292w(C41219dl.m167407a().mo135299b(cls), wiVar);
    }

    /* renamed from: R */
    public final String mo135253R() throws IOException {
        return mo135277h0(false);
    }

    /* renamed from: S */
    public final void mo135254S(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            int i3 = this.f104544d & 7;
            if (i3 == 2) {
                int i4 = mo135278i();
                mo135269d0(i4);
                int i5 = this.f104542b + i4;
                while (this.f104542b < i5) {
                    njVar.mo135665U(mo135274g());
                }
            } else if (i3 == 5) {
                do {
                    njVar.mo135665U(mo135284o());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i6 = this.f104544d & 7;
            if (i6 == 2) {
                int i7 = mo135278i();
                mo135269d0(i7);
                int i8 = this.f104542b + i7;
                while (this.f104542b < i8) {
                    list.add(Integer.valueOf(mo135274g()));
                }
            } else if (i6 == 5) {
                do {
                    list.add(Integer.valueOf(mo135284o()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: T */
    public final void mo135255T(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            int i3 = this.f104544d & 7;
            if (i3 == 0) {
                do {
                    njVar.mo135665U(mo135272f());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else if (i3 == 2) {
                int i4 = this.f104542b + mo135278i();
                while (this.f104542b < i4) {
                    njVar.mo135665U(mo135278i());
                }
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i5 = this.f104544d & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(mo135272f()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else if (i5 == 2) {
                int i6 = this.f104542b + mo135278i();
                while (this.f104542b < i6) {
                    list.add(Integer.valueOf(mo135278i()));
                }
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: U */
    public final void mo135256U(List<String> list) throws IOException {
        mo135262a(list, false);
    }

    /* renamed from: V */
    public final void mo135257V(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            int i3 = this.f104544d & 7;
            if (i3 == 0) {
                do {
                    jkVar.mo135523i(mo135288s());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else if (i3 == 2) {
                int i4 = this.f104542b + mo135278i();
                while (this.f104542b < i4) {
                    jkVar.mo135523i(C41672wh.m168668m(mo135275g0()));
                }
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i5 = this.f104544d & 7;
            if (i5 == 0) {
                do {
                    list.add(Long.valueOf(mo135288s()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else if (i5 == 2) {
                int i6 = this.f104542b + mo135278i();
                while (this.f104542b < i6) {
                    list.add(Long.valueOf(C41672wh.m168668m(mo135275g0())));
                }
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: W */
    public final void mo135258W(List<String> list) throws IOException {
        mo135262a(list, true);
    }

    /* renamed from: X */
    public final void mo135259X(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            int i3 = this.f104544d & 7;
            if (i3 == 2) {
                int i4 = mo135278i();
                mo135269d0(i4);
                int i5 = this.f104542b + i4;
                while (this.f104542b < i5) {
                    njVar.mo135665U(mo135274g());
                }
            } else if (i3 == 5) {
                do {
                    njVar.mo135665U(mo135279j());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i6 = this.f104544d & 7;
            if (i6 == 2) {
                int i7 = mo135278i();
                mo135269d0(i7);
                int i8 = this.f104542b + i7;
                while (this.f104542b < i8) {
                    list.add(Integer.valueOf(mo135274g()));
                }
            } else if (i6 == 5) {
                do {
                    list.add(Integer.valueOf(mo135279j()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: Y */
    public final boolean mo135260Y() throws IOException {
        mo135265b0(0);
        if (mo135278i() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final void mo135261Z(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41458nj) {
            C41458nj njVar = (C41458nj) list;
            int i3 = this.f104544d & 7;
            if (i3 == 0) {
                do {
                    njVar.mo135665U(mo135280k());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else if (i3 == 2) {
                int i4 = this.f104542b + mo135278i();
                while (this.f104542b < i4) {
                    njVar.mo135665U(C41672wh.m168667l(mo135278i()));
                }
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i5 = this.f104544d & 7;
            if (i5 == 0) {
                do {
                    list.add(Integer.valueOf(mo135280k()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else if (i5 == 2) {
                int i6 = this.f104542b + mo135278i();
                while (this.f104542b < i6) {
                    list.add(Integer.valueOf(C41672wh.m168667l(mo135278i())));
                }
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: a */
    public final void mo135262a(List<String> list, boolean z) throws IOException {
        int i;
        int i2;
        if ((this.f104544d & 7) != 2) {
            throw zzvk.m168994a();
        } else if ((list instanceof C41194ck) && !z) {
            C41194ck ckVar = (C41194ck) list;
            do {
                ckVar.mo135120E0(mo135291v());
                if (!mo135273f0()) {
                    i2 = this.f104542b;
                } else {
                    return;
                }
            } while (mo135278i() == this.f104544d);
            this.f104542b = i2;
        } else {
            do {
                list.add(mo135277h0(z));
                if (!mo135273f0()) {
                    i = this.f104542b;
                } else {
                    return;
                }
            } while (mo135278i() == this.f104544d);
            this.f104542b = i;
        }
    }

    /* renamed from: a0 */
    public final void mo135263a0(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C41362jk) {
            C41362jk jkVar = (C41362jk) list;
            int i3 = this.f104544d & 7;
            if (i3 == 1) {
                do {
                    jkVar.mo135523i(mo135287r());
                    if (!mo135273f0()) {
                        i2 = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i2;
            } else if (i3 == 2) {
                int i4 = mo135278i();
                mo135271e0(i4);
                int i5 = this.f104542b + i4;
                while (this.f104542b < i5) {
                    jkVar.mo135523i(mo135282m());
                }
            } else {
                throw zzvk.m168994a();
            }
        } else {
            int i6 = this.f104544d & 7;
            if (i6 == 1) {
                do {
                    list.add(Long.valueOf(mo135287r()));
                    if (!mo135273f0()) {
                        i = this.f104542b;
                    } else {
                        return;
                    }
                } while (mo135278i() == this.f104544d);
                this.f104542b = i;
            } else if (i6 == 2) {
                int i7 = mo135278i();
                mo135271e0(i7);
                int i8 = this.f104542b + i7;
                while (this.f104542b < i8) {
                    list.add(Long.valueOf(mo135282m()));
                }
            } else {
                throw zzvk.m168994a();
            }
        }
    }

    /* renamed from: b */
    public final byte mo135264b() throws IOException {
        int i = this.f104542b;
        if (i != this.f104543c) {
            byte[] bArr = this.f104541a;
            this.f104542b = i + 1;
            return bArr[i];
        }
        throw zzvk.m169002j();
    }

    /* renamed from: b0 */
    public final void mo135265b0(int i) throws IOException {
        if ((this.f104544d & 7) != i) {
            throw zzvk.m168994a();
        }
    }

    /* renamed from: c */
    public final int mo135266c() throws IOException {
        mo135294y(4);
        return mo135274g();
    }

    /* renamed from: c0 */
    public final void mo135267c0(int i) throws IOException {
        mo135294y(i);
        this.f104542b += i;
    }

    /* renamed from: d */
    public final int mo135268d() throws IOException {
        if (mo135273f0()) {
            return Integer.MAX_VALUE;
        }
        int i = mo135278i();
        this.f104544d = i;
        if (i == this.f104545e) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    /* renamed from: d0 */
    public final void mo135269d0(int i) throws IOException {
        mo135294y(i);
        if ((i & 3) != 0) {
            throw zzvk.m169000g();
        }
    }

    /* renamed from: e */
    public final int mo135270e() {
        return this.f104544d;
    }

    /* renamed from: e0 */
    public final void mo135271e0(int i) throws IOException {
        mo135294y(i);
        if ((i & 7) != 0) {
            throw zzvk.m169000g();
        }
    }

    /* renamed from: f */
    public final int mo135272f() throws IOException {
        mo135265b0(0);
        return mo135278i();
    }

    /* renamed from: f0 */
    public final boolean mo135273f0() {
        return this.f104542b == this.f104543c;
    }

    /* renamed from: g */
    public final int mo135274g() {
        int i = this.f104542b;
        byte[] bArr = this.f104541a;
        this.f104542b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0);
    }

    /* renamed from: g0 */
    public final long mo135275g0() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f104542b;
        int i2 = this.f104543c;
        if (i2 != i) {
            byte[] bArr = this.f104541a;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f104542b = i3;
                return (long) b2;
            } else if (i2 - i3 < 9) {
                return mo135283n();
            } else {
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
                                                    this.f104542b = i4;
                                                    return j;
                                                }
                                                throw zzvk.m168998e();
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f104542b = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f104542b = i4;
                    return j;
                }
                j = (long) b;
                this.f104542b = i4;
                return j;
            }
        } else {
            throw zzvk.m169002j();
        }
    }

    /* renamed from: h */
    public final int mo135276h() throws IOException {
        mo135265b0(0);
        return mo135278i();
    }

    /* renamed from: h0 */
    public final String mo135277h0(boolean z) throws IOException {
        mo135265b0(2);
        int i = mo135278i();
        if (i == 0) {
            return "";
        }
        mo135294y(i);
        if (z) {
            byte[] bArr = this.f104541a;
            int i2 = this.f104542b;
            if (!C41461nm.m168097f(bArr, i2, i2 + i)) {
                throw zzvk.m168997d();
            }
        }
        String str = new String(this.f104541a, this.f104542b, i, C41650vj.f105169a);
        this.f104542b += i;
        return str;
    }

    /* renamed from: i */
    public final int mo135278i() throws IOException {
        byte b;
        int i = this.f104542b;
        int i2 = this.f104543c;
        if (i2 != i) {
            byte[] bArr = this.f104541a;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f104542b = i3;
                return b2;
            } else if (i2 - i3 < 9) {
                return (int) mo135283n();
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
                                                    throw zzvk.m168998e();
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
                this.f104542b = i4;
                return b;
            }
        } else {
            throw zzvk.m169002j();
        }
    }

    /* renamed from: j */
    public final int mo135279j() throws IOException {
        mo135265b0(5);
        return mo135266c();
    }

    /* renamed from: k */
    public final int mo135280k() throws IOException {
        mo135265b0(0);
        return C41672wh.m168667l(mo135278i());
    }

    /* renamed from: l */
    public final long mo135281l() throws IOException {
        mo135294y(8);
        return mo135282m();
    }

    /* renamed from: m */
    public final long mo135282m() {
        int i = this.f104542b;
        byte[] bArr = this.f104541a;
        this.f104542b = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: n */
    public final long mo135283n() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte b = mo135264b();
            j |= ((long) (b & Byte.MAX_VALUE)) << i;
            if ((b & C11354n.f28471b) == 0) {
                return j;
            }
        }
        throw zzvk.m168998e();
    }

    /* renamed from: o */
    public final int mo135284o() throws IOException {
        mo135265b0(5);
        return mo135266c();
    }

    /* renamed from: p */
    public final int mo135285p() throws IOException {
        mo135265b0(0);
        return mo135278i();
    }

    /* renamed from: q */
    public final long mo135286q() throws IOException {
        mo135265b0(0);
        return mo135275g0();
    }

    /* renamed from: r */
    public final long mo135287r() throws IOException {
        mo135265b0(1);
        return mo135281l();
    }

    /* renamed from: s */
    public final long mo135288s() throws IOException {
        mo135265b0(0);
        return C41672wh.m168668m(mo135275g0());
    }

    /* renamed from: t */
    public final long mo135289t() throws IOException {
        mo135265b0(1);
        return mo135281l();
    }

    /* renamed from: u */
    public final long mo135290u() throws IOException {
        mo135265b0(0);
        return mo135275g0();
    }

    /* renamed from: v */
    public final zztd mo135291v() throws IOException {
        mo135265b0(2);
        int i = mo135278i();
        if (i == 0) {
            return zztd.f105744a;
        }
        mo135294y(i);
        zztd e0 = zztd.m168982e0(this.f104541a, this.f104542b, i);
        this.f104542b += i;
        return e0;
    }

    /* renamed from: w */
    public final <T> T mo135292w(C41315hl<T> hlVar, C41673wi wiVar) throws IOException {
        int i = this.f104545e;
        this.f104545e = ((this.f104544d >>> 3) << 3) | 4;
        try {
            T f = hlVar.mo135460f();
            hlVar.mo135464j(f, this, wiVar);
            hlVar.mo135457c(f);
            if (this.f104544d == this.f104545e) {
                return f;
            }
            throw zzvk.m169000g();
        } finally {
            this.f104545e = i;
        }
    }

    /* renamed from: x */
    public final <T> T mo135293x(C41315hl<T> hlVar, C41673wi wiVar) throws IOException {
        int i = mo135278i();
        mo135294y(i);
        int i2 = this.f104543c;
        int i3 = this.f104542b + i;
        this.f104543c = i3;
        try {
            T f = hlVar.mo135460f();
            hlVar.mo135464j(f, this, wiVar);
            hlVar.mo135457c(f);
            if (this.f104542b == i3) {
                return f;
            }
            throw zzvk.m169000g();
        } finally {
            this.f104543c = i2;
        }
    }

    /* renamed from: y */
    public final void mo135294y(int i) throws IOException {
        if (i < 0 || i > this.f104543c - this.f104542b) {
            throw zzvk.m169002j();
        }
    }

    /* renamed from: z */
    public final void mo135295z(int i) throws IOException {
        if (this.f104542b != i) {
            throw zzvk.m169002j();
        }
    }

    public final double zza() throws IOException {
        mo135265b0(1);
        return Double.longBitsToDouble(mo135281l());
    }

    public final float zzb() throws IOException {
        mo135265b0(5);
        return Float.intBitsToFloat(mo135266c());
    }
}
