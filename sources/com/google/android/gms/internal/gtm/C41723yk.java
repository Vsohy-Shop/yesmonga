package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.yk */
public final class C41723yk<T> implements C41315hl<T> {

    /* renamed from: a */
    public final C41627uk f105311a;

    /* renamed from: b */
    public final C41724yl<?, ?> f105312b;

    /* renamed from: c */
    public final boolean f105313c;

    /* renamed from: d */
    public final C41697xi<?> f105314d;

    public C41723yk(C41724yl<?, ?> ylVar, C41697xi<?> xiVar, C41627uk ukVar) {
        this.f105312b = ylVar;
        this.f105313c = xiVar.mo136054i(ukVar);
        this.f105314d = xiVar;
        this.f105311a = ukVar;
    }

    /* renamed from: k */
    public static <T> C41723yk<T> m168898k(C41724yl<?, ?> ylVar, C41697xi<?> xiVar, C41627uk ukVar) {
        return new C41723yk<>(ylVar, xiVar, ukVar);
    }

    /* renamed from: a */
    public final int mo135455a(T t) {
        int hashCode = this.f105312b.mo135042d(t).hashCode();
        if (this.f105313c) {
            return (hashCode * 53) + this.f105314d.mo136047b(t).f104470a.hashCode();
        }
        return hashCode;
    }

    /* renamed from: b */
    public final int mo135456b(T t) {
        C41724yl<?, ?> ylVar = this.f105312b;
        int b = ylVar.mo135040b(ylVar.mo135042d(t));
        if (this.f105313c) {
            return b + this.f105314d.mo136047b(t).mo135107b();
        }
        return b;
    }

    /* renamed from: c */
    public final void mo135457c(T t) {
        this.f105312b.mo135051m(t);
        this.f105314d.mo136051f(t);
    }

    /* renamed from: d */
    public final void mo135458d(T t, T t2) {
        C41363jl.m167831f(this.f105312b, t, t2);
        if (this.f105313c) {
            C41363jl.m167830e(this.f105314d, t, t2);
        }
    }

    /* renamed from: e */
    public final boolean mo135459e(T t, T t2) {
        if (!this.f105312b.mo135042d(t).equals(this.f105312b.mo135042d(t2))) {
            return false;
        }
        if (this.f105313c) {
            return this.f105314d.mo136047b(t).equals(this.f105314d.mo136047b(t2));
        }
        return true;
    }

    /* renamed from: f */
    public final T mo135460f() {
        return this.f105311a.mo135627f().mo135374w();
    }

    /* renamed from: g */
    public final boolean mo135461g(T t) {
        return this.f105314d.mo136047b(t).mo135118k();
    }

    /* renamed from: h */
    public final void mo135462h(T t, C41168bi biVar) throws IOException {
        Iterator<Map.Entry<?, Object>> f = this.f105314d.mo136047b(t).mo135112f();
        while (f.hasNext()) {
            Map.Entry next = f.next();
            C41145aj ajVar = (C41145aj) next.getKey();
            if (ajVar.mo135028f() == zzyf.MESSAGE) {
                ajVar.mo135029h();
                ajVar.mo135030o();
                if (next instanceof C41698xj) {
                    biVar.mo135078I(ajVar.zza(), ((C41698xj) next).mo136056a().mo135034b());
                } else {
                    biVar.mo135078I(ajVar.zza(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        C41724yl<?, ?> ylVar = this.f105312b;
        ylVar.mo135055r(ylVar.mo135042d(t), biVar);
    }

    /* renamed from: i */
    public final void mo135463i(T t, byte[] bArr, int i, int i2, C41167bh bhVar) throws IOException {
        C41410lj ljVar = (C41410lj) t;
        C41748zl zlVar = ljVar.zzc;
        if (zlVar == C41748zl.m168947c()) {
            zlVar = C41748zl.m168949e();
            ljVar.zzc = zlVar;
        }
        C41169bj<C41337ij> C = ((C41313hj) t).mo135451C();
        Object obj = null;
        while (i < i2) {
            int j = C41191ch.m167284j(bArr, i, bhVar);
            int i3 = bhVar.f104464a;
            if (i3 == 11) {
                int i4 = 0;
                zztd zztd = null;
                while (j < i2) {
                    j = C41191ch.m167284j(bArr, j, bhVar);
                    int i5 = bhVar.f104464a;
                    int i6 = i5 & 7;
                    int i7 = i5 >>> 3;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (obj != null) {
                                C41361jj jjVar = (C41361jj) obj;
                                j = C41191ch.m167278d(C41219dl.m167407a().mo135299b(jjVar.f104717c.getClass()), bArr, j, i2, bhVar);
                                C.mo135116i(jjVar.f104718d, bhVar.f104466c);
                            } else if (i6 == 2) {
                                j = C41191ch.m167275a(bArr, j, bhVar);
                                zztd = (zztd) bhVar.f104466c;
                            }
                        }
                    } else if (i6 == 0) {
                        j = C41191ch.m167284j(bArr, j, bhVar);
                        i4 = bhVar.f104464a;
                        obj = this.f105314d.mo136049d(bhVar.f104467d, this.f105311a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    j = C41191ch.m167288n(i5, bArr, j, i2, bhVar);
                }
                if (zztd != null) {
                    zlVar.mo136131h((i4 << 3) | 2, zztd);
                }
                i = j;
            } else if ((i3 & 7) == 2) {
                Object d = this.f105314d.mo136049d(bhVar.f104467d, this.f105311a, i3 >>> 3);
                if (d != null) {
                    C41361jj jjVar2 = (C41361jj) d;
                    i = C41191ch.m167278d(C41219dl.m167407a().mo135299b(jjVar2.f104717c.getClass()), bArr, j, i2, bhVar);
                    C.mo135116i(jjVar2.f104718d, bhVar.f104466c);
                } else {
                    i = C41191ch.m167283i(i3, bArr, j, i2, zlVar, bhVar);
                }
                obj = d;
            } else {
                i = C41191ch.m167288n(i3, bArr, j, i2, bhVar);
            }
        }
        if (i != i2) {
            throw zzvk.m169000g();
        }
    }

    /* renamed from: j */
    public final void mo135464j(T t, C41291gl glVar, C41673wi wiVar) throws IOException {
        boolean z;
        C41724yl<?, ?> ylVar = this.f105312b;
        C41697xi<?> xiVar = this.f105314d;
        Object c = ylVar.mo135041c(t);
        C41169bj<?> c2 = xiVar.mo136048c(t);
        while (glVar.mo135268d() != Integer.MAX_VALUE) {
            int e = glVar.mo135270e();
            if (e != 11) {
                if ((e & 7) == 2) {
                    Object d = xiVar.mo136049d(wiVar, this.f105311a, e >>> 3);
                    if (d != null) {
                        xiVar.mo136052g(glVar, d, wiVar, c2);
                    } else {
                        z = ylVar.mo136114p(c, glVar);
                    }
                } else {
                    z = glVar.mo135236A();
                }
                if (!z) {
                    ylVar.mo135052n(t, c);
                    return;
                }
            } else {
                Object obj = null;
                int i = 0;
                zztd zztd = null;
                while (true) {
                    try {
                        if (glVar.mo135268d() == Integer.MAX_VALUE) {
                            break;
                        }
                        int e2 = glVar.mo135270e();
                        if (e2 == 16) {
                            i = glVar.mo135285p();
                            obj = xiVar.mo136049d(wiVar, this.f105311a, i);
                        } else if (e2 == 26) {
                            if (obj != null) {
                                xiVar.mo136052g(glVar, obj, wiVar, c2);
                            } else {
                                zztd = glVar.mo135291v();
                            }
                        } else if (!glVar.mo135236A()) {
                            break;
                        }
                    } catch (Throwable th) {
                        ylVar.mo135052n(t, c);
                        throw th;
                    }
                }
                if (glVar.mo135270e() != 12) {
                    throw zzvk.m168995b();
                } else if (zztd != null) {
                    if (obj != null) {
                        xiVar.mo136053h(zztd, obj, wiVar, c2);
                    } else {
                        ylVar.mo135049k(c, i, zztd);
                    }
                }
            }
        }
        ylVar.mo135052n(t, c);
    }
}
