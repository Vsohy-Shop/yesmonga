package com.google.zxing.common.detector;

import com.google.zxing.C34762l;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34710b;

/* renamed from: com.google.zxing.common.detector.c */
public final class C34715c {

    /* renamed from: h */
    public static final int f84073h = 10;

    /* renamed from: i */
    public static final int f84074i = 1;

    /* renamed from: a */
    public final C34710b f84075a;

    /* renamed from: b */
    public final int f84076b;

    /* renamed from: c */
    public final int f84077c;

    /* renamed from: d */
    public final int f84078d;

    /* renamed from: e */
    public final int f84079e;

    /* renamed from: f */
    public final int f84080f;

    /* renamed from: g */
    public final int f84081g;

    public C34715c(C34710b bVar) throws NotFoundException {
        this(bVar, 10, bVar.mo102674o() / 2, bVar.mo102670k() / 2);
    }

    /* renamed from: a */
    public final C34762l[] mo102701a(C34762l lVar, C34762l lVar2, C34762l lVar3, C34762l lVar4) {
        float c = lVar.mo102883c();
        float d = lVar.mo102884d();
        float c2 = lVar2.mo102883c();
        float d2 = lVar2.mo102884d();
        float c3 = lVar3.mo102883c();
        float d3 = lVar3.mo102884d();
        float c4 = lVar4.mo102883c();
        float d4 = lVar4.mo102884d();
        if (c < ((float) this.f84077c) / 2.0f) {
            return new C34762l[]{new C34762l(c4 - 1.0f, d4 + 1.0f), new C34762l(c2 + 1.0f, d2 + 1.0f), new C34762l(c3 - 1.0f, d3 - 1.0f), new C34762l(c + 1.0f, d - 1.0f)};
        }
        return new C34762l[]{new C34762l(c4 + 1.0f, d4 + 1.0f), new C34762l(c2 + 1.0f, d2 - 1.0f), new C34762l(c3 - 1.0f, d3 + 1.0f), new C34762l(c - 1.0f, d - 1.0f)};
    }

    /* renamed from: b */
    public final boolean mo102702b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f84075a.mo102666h(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f84075a.mo102666h(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: c */
    public C34762l[] mo102703c() throws NotFoundException {
        int i = this.f84078d;
        int i2 = this.f84079e;
        int i3 = this.f84081g;
        int i4 = this.f84080f;
        boolean z = false;
        int i5 = 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        while (true) {
            if (!z6) {
                break;
            }
            boolean z7 = false;
            boolean z8 = true;
            while (true) {
                if ((z8 || !z2) && i2 < this.f84077c) {
                    z8 = mo102702b(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z2 = true;
                        z7 = true;
                    } else if (!z2) {
                        i2++;
                    }
                }
            }
            if (i2 < this.f84077c) {
                boolean z9 = true;
                while (true) {
                    if ((z9 || !z3) && i4 < this.f84076b) {
                        z9 = mo102702b(i, i2, i4, true);
                        if (z9) {
                            i4++;
                            z3 = true;
                            z7 = true;
                        } else if (!z3) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.f84076b) {
                    boolean z10 = true;
                    while (true) {
                        if ((z10 || !z4) && i >= 0) {
                            z10 = mo102702b(i3, i4, i, false);
                            if (z10) {
                                i--;
                                z4 = true;
                                z7 = true;
                            } else if (!z4) {
                                i--;
                            }
                        }
                    }
                    if (i >= 0) {
                        z6 = z7;
                        boolean z11 = true;
                        while (true) {
                            if ((z11 || !z5) && i3 >= 0) {
                                z11 = mo102702b(i, i2, i3, true);
                                if (z11) {
                                    i3--;
                                    z6 = true;
                                    z5 = true;
                                } else if (!z5) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 < 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        z = true;
        if (!z) {
            int i6 = i2 - i;
            C34762l lVar = null;
            int i7 = 1;
            C34762l lVar2 = null;
            while (lVar2 == null && i7 < i6) {
                lVar2 = mo102704d((float) i, (float) (i4 - i7), (float) (i + i7), (float) i4);
                i7++;
            }
            if (lVar2 != null) {
                int i8 = 1;
                C34762l lVar3 = null;
                while (lVar3 == null && i8 < i6) {
                    lVar3 = mo102704d((float) i, (float) (i3 + i8), (float) (i + i8), (float) i3);
                    i8++;
                }
                if (lVar3 != null) {
                    int i9 = 1;
                    C34762l lVar4 = null;
                    while (lVar4 == null && i9 < i6) {
                        lVar4 = mo102704d((float) i2, (float) (i3 + i9), (float) (i2 - i9), (float) i3);
                        i9++;
                    }
                    if (lVar4 != null) {
                        while (lVar == null && i5 < i6) {
                            lVar = mo102704d((float) i2, (float) (i4 - i5), (float) (i2 - i5), (float) i4);
                            i5++;
                        }
                        if (lVar != null) {
                            return mo102701a(lVar, lVar2, lVar4, lVar3);
                        }
                        throw NotFoundException.m141229a();
                    }
                    throw NotFoundException.m141229a();
                }
                throw NotFoundException.m141229a();
            }
            throw NotFoundException.m141229a();
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: d */
    public final C34762l mo102704d(float f, float f2, float f3, float f4) {
        int c = C34713a.m141632c(C34713a.m141630a(f, f2, f3, f4));
        float f5 = (float) c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < c; i++) {
            float f8 = (float) i;
            int c2 = C34713a.m141632c((f8 * f6) + f);
            int c3 = C34713a.m141632c((f8 * f7) + f2);
            if (this.f84075a.mo102666h(c2, c3)) {
                return new C34762l((float) c2, (float) c3);
            }
        }
        return null;
    }

    public C34715c(C34710b bVar, int i, int i2, int i3) throws NotFoundException {
        this.f84075a = bVar;
        int k = bVar.mo102670k();
        this.f84076b = k;
        int o = bVar.mo102674o();
        this.f84077c = o;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f84078d = i5;
        int i6 = i2 + i4;
        this.f84079e = i6;
        int i7 = i3 - i4;
        this.f84081g = i7;
        int i8 = i3 + i4;
        this.f84080f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= k || i6 >= o) {
            throw NotFoundException.m141229a();
        }
    }
}
