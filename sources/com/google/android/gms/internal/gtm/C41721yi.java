package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.yi */
public final class C41721yi extends C41697xi<C41337ij> {
    /* renamed from: a */
    public final int mo136046a(Map.Entry<?, ?> entry) {
        return ((C41337ij) entry.getKey()).f104680b;
    }

    /* renamed from: b */
    public final C41169bj<C41337ij> mo136047b(Object obj) {
        return ((C41313hj) obj).zza;
    }

    /* renamed from: c */
    public final C41169bj<C41337ij> mo136048c(Object obj) {
        return ((C41313hj) obj).mo135451C();
    }

    /* renamed from: d */
    public final Object mo136049d(C41673wi wiVar, C41627uk ukVar, int i) {
        return wiVar.mo135788c(ukVar, i);
    }

    /* renamed from: e */
    public final <UT, UB> UB mo136050e(C41291gl glVar, Object obj, C41673wi wiVar, C41169bj<C41337ij> bjVar, UB ub, C41724yl<UT, UB> ylVar) throws IOException {
        Object obj2;
        Object e;
        C41361jj jjVar = (C41361jj) obj;
        C41337ij ijVar = jjVar.f104718d;
        int i = ijVar.f104680b;
        zzye zzye = ijVar.f104681c;
        if (zzye != zzye.ENUM) {
            switch (zzye.ordinal()) {
                case 0:
                    obj2 = Double.valueOf(glVar.zza());
                    break;
                case 1:
                    obj2 = Float.valueOf(glVar.zzb());
                    break;
                case 2:
                    obj2 = Long.valueOf(glVar.mo135286q());
                    break;
                case 3:
                    obj2 = Long.valueOf(glVar.mo135290u());
                    break;
                case 4:
                    obj2 = Integer.valueOf(glVar.mo135276h());
                    break;
                case 5:
                    obj2 = Long.valueOf(glVar.mo135289t());
                    break;
                case 6:
                    obj2 = Integer.valueOf(glVar.mo135284o());
                    break;
                case 7:
                    obj2 = Boolean.valueOf(glVar.mo135260Y());
                    break;
                case 8:
                    obj2 = glVar.mo135253R();
                    break;
                case 9:
                    obj2 = glVar.mo135252Q(jjVar.f104717c.getClass(), wiVar);
                    break;
                case 10:
                    obj2 = glVar.mo135248M(jjVar.f104717c.getClass(), wiVar);
                    break;
                case 11:
                    obj2 = glVar.mo135291v();
                    break;
                case 12:
                    obj2 = Integer.valueOf(glVar.mo135285p());
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 14:
                    obj2 = Integer.valueOf(glVar.mo135279j());
                    break;
                case 15:
                    obj2 = Long.valueOf(glVar.mo135287r());
                    break;
                case 16:
                    obj2 = Integer.valueOf(glVar.mo135280k());
                    break;
                case 17:
                    obj2 = Long.valueOf(glVar.mo135288s());
                    break;
                default:
                    obj2 = null;
                    break;
            }
        } else {
            int h = glVar.mo135276h();
            C41506pj<?> pjVar = jjVar.f104718d.f104679a;
            if (zzyl.m169016q(h) == null) {
                return C41363jl.m167829d(i, h, ub, ylVar);
            }
            obj2 = Integer.valueOf(h);
        }
        jjVar.mo135518a();
        int ordinal = jjVar.f104718d.f104681c.ordinal();
        if ((ordinal == 9 || ordinal == 10) && (e = bjVar.mo135110e(jjVar.f104718d)) != null) {
            obj2 = C41650vj.m168605g(e, obj2);
        }
        bjVar.mo135116i(jjVar.f104718d, obj2);
        return ub;
    }

    /* renamed from: f */
    public final void mo136051f(Object obj) {
        ((C41313hj) obj).zza.mo135113g();
    }

    /* renamed from: g */
    public final void mo136052g(C41291gl glVar, Object obj, C41673wi wiVar, C41169bj<C41337ij> bjVar) throws IOException {
        C41361jj jjVar = (C41361jj) obj;
        bjVar.mo135116i(jjVar.f104718d, glVar.mo135248M(jjVar.f104717c.getClass(), wiVar));
    }

    /* renamed from: h */
    public final void mo136053h(zztd zztd, Object obj, C41673wi wiVar, C41169bj<C41337ij> bjVar) throws IOException {
        byte[] bArr;
        C41361jj jjVar = (C41361jj) obj;
        C41627uk w = jjVar.f104717c.mo135627f().mo135374w();
        int i = zztd.mo136144i();
        if (i == 0) {
            bArr = C41650vj.f105171c;
        } else {
            byte[] bArr2 = new byte[i];
            zztd.mo136145k(bArr2, 0, 0, i);
            bArr = bArr2;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray()) {
            C41215dh dhVar = new C41215dh(wrap, true);
            C41219dl.m167407a().mo135299b(w.getClass()).mo135464j(w, dhVar, wiVar);
            bjVar.mo135116i(jjVar.f104718d, w);
            if (dhVar.mo135268d() != Integer.MAX_VALUE) {
                throw zzvk.m168995b();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    /* renamed from: i */
    public final boolean mo136054i(C41627uk ukVar) {
        return ukVar instanceof C41313hj;
    }

    /* renamed from: j */
    public final void mo136055j(C41168bi biVar, Map.Entry<?, ?> entry) throws IOException {
        C41337ij ijVar = (C41337ij) entry.getKey();
        zzye zzye = zzye.DOUBLE;
        switch (ijVar.f104681c.ordinal()) {
            case 0:
                biVar.mo135098r(ijVar.f104680b, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                biVar.mo135070A(ijVar.f104680b, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                biVar.mo135075F(ijVar.f104680b, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                biVar.mo135092k(ijVar.f104680b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                biVar.mo135073D(ijVar.f104680b, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                biVar.mo135105y(ijVar.f104680b, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                biVar.mo135103w(ijVar.f104680b, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                biVar.mo135094n(ijVar.f104680b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                biVar.mo135088g(ijVar.f104680b, (String) entry.getValue());
                return;
            case 9:
                biVar.mo135072C(ijVar.f104680b, entry.getValue(), C41219dl.m167407a().mo135299b(entry.getValue().getClass()));
                return;
            case 10:
                biVar.mo135077H(ijVar.f104680b, entry.getValue(), C41219dl.m167407a().mo135299b(entry.getValue().getClass()));
                return;
            case 11:
                biVar.mo135096p(ijVar.f104680b, (zztd) entry.getValue());
                return;
            case 12:
                biVar.mo135090i(ijVar.f104680b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                biVar.mo135073D(ijVar.f104680b, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                biVar.mo135079J(ijVar.f104680b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                biVar.mo135081L(ijVar.f104680b, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                biVar.mo135083b(ijVar.f104680b, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                biVar.mo135085d(ijVar.f104680b, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
