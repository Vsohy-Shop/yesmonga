package com.google.zxing.pdf417.decoder;

import com.google.zxing.C34762l;

/* renamed from: com.google.zxing.pdf417.decoder.g */
public final class C34844g extends C34843f {

    /* renamed from: d */
    public final boolean f84628d;

    public C34844g(C34837c cVar, boolean z) {
        super(cVar);
        this.f84628d = z;
    }

    /* renamed from: g */
    public void mo103123g(C34835a aVar) {
        C34762l lVar;
        C34762l lVar2;
        boolean z;
        boolean z2;
        C34838d[] d = mo103119d();
        mo103129m();
        mo103128l(d, aVar);
        C34837c a = mo103116a();
        if (this.f84628d) {
            lVar = a.mo103061h();
        } else {
            lVar = a.mo103062i();
        }
        if (this.f84628d) {
            lVar2 = a.mo103055b();
        } else {
            lVar2 = a.mo103056c();
        }
        int e = mo103120e((int) lVar2.mo102884d());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int e2 = mo103120e((int) lVar.mo102884d()); e2 < e; e2++) {
            C34838d dVar = d[e2];
            if (dVar != null) {
                int c = dVar.mo103065c() - i;
                if (c == 0) {
                    i2++;
                } else {
                    if (c == 1) {
                        i3 = Math.max(i3, i2);
                        i = dVar.mo103065c();
                    } else if (c < 0 || dVar.mo103065c() >= aVar.mo103048c() || c > e2) {
                        d[e2] = null;
                    } else {
                        if (i3 > 2) {
                            c *= i3 - 2;
                        }
                        if (c >= e2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        for (int i4 = 1; i4 <= c && !z; i4++) {
                            if (d[e2 - i4] != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        if (z) {
                            d[e2] = null;
                        } else {
                            i = dVar.mo103065c();
                        }
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo103124h(C34835a aVar) {
        C34762l lVar;
        C34762l lVar2;
        C34837c a = mo103116a();
        if (this.f84628d) {
            lVar = a.mo103061h();
        } else {
            lVar = a.mo103062i();
        }
        if (this.f84628d) {
            lVar2 = a.mo103055b();
        } else {
            lVar2 = a.mo103056c();
        }
        int e = mo103120e((int) lVar2.mo102884d());
        C34838d[] d = mo103119d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int e2 = mo103120e((int) lVar.mo102884d()); e2 < e; e2++) {
            C34838d dVar = d[e2];
            if (dVar != null) {
                dVar.mo103072j();
                int c = dVar.mo103065c() - i;
                if (c == 0) {
                    i2++;
                } else {
                    if (c == 1) {
                        i3 = Math.max(i3, i2);
                        i = dVar.mo103065c();
                    } else if (dVar.mo103065c() >= aVar.mo103048c()) {
                        d[e2] = null;
                    } else {
                        i = dVar.mo103065c();
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: i */
    public C34835a mo103125i() {
        C34838d[] d = mo103119d();
        C34836b bVar = new C34836b();
        C34836b bVar2 = new C34836b();
        C34836b bVar3 = new C34836b();
        C34836b bVar4 = new C34836b();
        for (C34838d dVar : d) {
            if (dVar != null) {
                dVar.mo103072j();
                int e = dVar.mo103067e() % 30;
                int c = dVar.mo103065c();
                if (!this.f84628d) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    bVar2.mo103053c((e * 3) + 1);
                } else if (i == 1) {
                    bVar4.mo103053c(e / 3);
                    bVar3.mo103053c(e % 3);
                } else if (i == 2) {
                    bVar.mo103053c(e + 1);
                }
            }
        }
        if (bVar.mo103052b().length == 0 || bVar2.mo103052b().length == 0 || bVar3.mo103052b().length == 0 || bVar4.mo103052b().length == 0 || bVar.mo103052b()[0] <= 0 || bVar2.mo103052b()[0] + bVar3.mo103052b()[0] < 3 || bVar2.mo103052b()[0] + bVar3.mo103052b()[0] > 90) {
            return null;
        }
        C34835a aVar = new C34835a(bVar.mo103052b()[0], bVar2.mo103052b()[0], bVar3.mo103052b()[0], bVar4.mo103052b()[0]);
        mo103128l(d, aVar);
        return aVar;
    }

    /* renamed from: j */
    public int[] mo103126j() {
        int c;
        C34835a i = mo103125i();
        if (i == null) {
            return null;
        }
        mo103124h(i);
        int c2 = i.mo103048c();
        int[] iArr = new int[c2];
        for (C34838d dVar : mo103119d()) {
            if (dVar != null && (c = dVar.mo103065c()) < c2) {
                iArr[c] = iArr[c] + 1;
            }
        }
        return iArr;
    }

    /* renamed from: k */
    public boolean mo103127k() {
        return this.f84628d;
    }

    /* renamed from: l */
    public final void mo103128l(C34838d[] dVarArr, C34835a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C34838d dVar = dVarArr[i];
            if (dVar != null) {
                int e = dVar.mo103067e() % 30;
                int c = dVar.mo103065c();
                if (c > aVar.mo103048c()) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f84628d) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != aVar.mo103046a()) {
                                dVarArr[i] = null;
                            }
                        } else if (e / 3 != aVar.mo103047b() || e % 3 != aVar.mo103049d()) {
                            dVarArr[i] = null;
                        }
                    } else if ((e * 3) + 1 != aVar.mo103050e()) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo103129m() {
        for (C34838d dVar : mo103119d()) {
            if (dVar != null) {
                dVar.mo103072j();
            }
        }
    }

    public String toString() {
        return "IsLeft: " + this.f84628d + 10 + super.toString();
    }
}
