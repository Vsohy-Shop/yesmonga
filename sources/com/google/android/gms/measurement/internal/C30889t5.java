package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.measurement.C41855a5;
import com.google.android.gms.internal.measurement.C41927e5;
import com.google.android.gms.internal.measurement.C41945f5;
import com.google.android.gms.internal.measurement.C41955ff;
import com.google.android.gms.internal.measurement.C41963g5;
import com.google.android.gms.internal.measurement.C41981h5;
import com.google.android.gms.internal.measurement.C41999i5;
import com.google.android.gms.internal.measurement.C42026je;
import com.google.android.gms.internal.measurement.C42035k5;
import com.google.android.gms.internal.measurement.C42122p5;
import com.google.android.gms.internal.measurement.C42139q5;
import com.google.android.gms.internal.measurement.C42223v4;
import com.google.android.gms.internal.measurement.C42240w4;
import com.google.android.gms.internal.measurement.C42257x4;
import com.google.android.gms.internal.measurement.C42274y4;
import com.google.android.gms.internal.measurement.C42291z4;
import com.google.firebase.crashlytics.C32648f;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.t5 */
public final class C30889t5 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzaw f73960a;

    /* renamed from: b */
    public final /* synthetic */ String f73961b;

    /* renamed from: c */
    public final /* synthetic */ C30949y5 f73962c;

    public C30889t5(C30949y5 y5Var, zzaw zzaw, String str) {
        this.f73962c = y5Var;
        this.f73960a = zzaw;
        this.f73961b = str;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C30870ra raVar;
        C41927e5 e5Var;
        C41963g5 g5Var;
        String str;
        Bundle bundle;
        C30693d6 d6Var;
        long j;
        String str2;
        C30859r rVar;
        byte[] bArr;
        C30822na naVar;
        this.f73962c.f74111n.mo87367e();
        C30879s7 d0 = this.f73962c.f74111n.mo87366d0();
        zzaw zzaw = this.f73960a;
        String str3 = this.f73961b;
        d0.mo86866h();
        C30731g5.m123742t();
        C40843u.m166202l(zzaw);
        C40843u.m166198h(str3);
        if (!d0.f74136a.mo87130z().mo87070B(str3, C30742h3.f73517W)) {
            d0.f74136a.mo86903d().mo87488q().mo87464b("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        } else if ("_iap".equals(zzaw.f74163a) || "_iapx".equals(zzaw.f74163a)) {
            C41927e5 B = C41945f5.m169867B();
            d0.f74119b.mo87360W().mo87226e0();
            C30693d6 R = d0.f74119b.mo87360W().mo87214R(str3);
            if (R == null) {
                d0.f74136a.mo86903d().mo87488q().mo87464b("Log and bundle not available. package_name", str3);
                bArr = new byte[0];
                naVar = d0.f74119b;
            } else if (!R.mo86963M()) {
                d0.f74136a.mo86903d().mo87488q().mo87464b("Log and bundle disabled. package_name", str3);
                bArr = new byte[0];
                naVar = d0.f74119b;
            } else {
                C41963g5 S1 = C41981h5.m170105S1();
                S1.mo136856j0(1);
                S1.mo136846c0("android");
                if (!TextUtils.isEmpty(R.mo86994i0())) {
                    S1.mo136801C(R.mo86994i0());
                }
                if (!TextUtils.isEmpty(R.mo86998k0())) {
                    S1.mo136804E((String) C40843u.m166202l(R.mo86998k0()));
                }
                if (!TextUtils.isEmpty(R.mo87000l0())) {
                    S1.mo136806F((String) C40843u.m166202l(R.mo87000l0()));
                }
                if (R.mo86966P() != -2147483648L) {
                    S1.mo136808G((int) R.mo86966P());
                }
                S1.mo136838Y(R.mo86978a0());
                S1.mo136823P(R.mo86975Y());
                String n0 = R.mo87004n0();
                String g0 = R.mo86990g0();
                if (!TextUtils.isEmpty(n0)) {
                    S1.mo136834V(n0);
                } else if (!TextUtils.isEmpty(g0)) {
                    S1.mo136799B(g0);
                }
                C42026je.m170421b();
                if (d0.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73499G0)) {
                    S1.mo136862r0(R.mo86986e0());
                }
                C30738h V = d0.f74119b.mo87359V(str3);
                S1.mo136817L(R.mo86974X());
                if (d0.f74136a.mo87123o() && d0.f74136a.mo87130z().mo87071C(S1.mo136870z0()) && V.mo87142i(zzah.AD_STORAGE) && !TextUtils.isEmpty((CharSequence) null)) {
                    S1.mo136821O((String) null);
                }
                S1.mo136816K(V.mo87140h());
                if (V.mo87142i(zzah.AD_STORAGE) && R.mo86962L()) {
                    Pair n = d0.f74119b.mo87368e0().mo87062n(R.mo86994i0(), V);
                    if (R.mo86962L() && !TextUtils.isEmpty((CharSequence) n.first)) {
                        try {
                            S1.mo136857k0(C30879s7.m124163e((String) n.first, Long.toString(zzaw.f74166d)));
                            Object obj = n.second;
                            if (obj != null) {
                                S1.mo136842a0(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e) {
                            d0.f74136a.mo86903d().mo87488q().mo87464b("Resettable device id encryption failed", e.getMessage());
                            bArr = new byte[0];
                            naVar = d0.f74119b;
                        } catch (Throwable th) {
                            d0.f74119b.mo87360W().mo87227f0();
                            throw th;
                        }
                    }
                }
                d0.f74136a.mo87098A().mo86873k();
                S1.mo136820N(Build.MODEL);
                d0.f74136a.mo87098A().mo86873k();
                S1.mo136844b0(Build.VERSION.RELEASE);
                S1.mo136863s0((int) d0.f74136a.mo87098A().mo87403p());
                S1.mo136868x0(d0.f74136a.mo87098A().mo87404q());
                try {
                    if (V.mo87142i(zzah.ANALYTICS_STORAGE) && R.mo86996j0() != null) {
                        S1.mo136802D(C30879s7.m124163e((String) C40843u.m166202l(R.mo86996j0()), Long.toString(zzaw.f74166d)));
                    }
                    if (!TextUtils.isEmpty(R.mo87002m0())) {
                        S1.mo136832U((String) C40843u.m166202l(R.mo87002m0()));
                    }
                    String i0 = R.mo86994i0();
                    List c0 = d0.f74119b.mo87360W().mo87224c0(i0);
                    Iterator it = c0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            raVar = null;
                            break;
                        }
                        raVar = (C30870ra) it.next();
                        if ("_lte".equals(raVar.f73924c)) {
                            break;
                        }
                    }
                    if (raVar == null || raVar.f73926e == null) {
                        C30870ra raVar2 = new C30870ra(i0, "auto", "_lte", d0.f74136a.mo86900a().mo134768a(), 0L);
                        c0.add(raVar2);
                        d0.f74119b.mo87360W().mo87241x(raVar2);
                    }
                    C30846pa g02 = d0.f74119b.mo87370g0();
                    g02.f74136a.mo86903d().mo87493v().mo87463a("Checking account type status for ad personalization signals");
                    if (g02.f74136a.mo87098A().mo87406s()) {
                        String i02 = R.mo86994i0();
                        C40843u.m166202l(i02);
                        if (R.mo86962L() && g02.f74119b.mo87364a0().mo87570B(i02)) {
                            g02.f74136a.mo86903d().mo87488q().mo87463a("Turning off ad personalization due to account type");
                            Iterator it2 = c0.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if ("_npa".equals(((C30870ra) it2.next()).f73924c)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            c0.add(new C30870ra(i02, "auto", "_npa", g02.f74136a.mo86900a().mo134768a(), 1L));
                        }
                    }
                    C42139q5[] q5VarArr = new C42139q5[c0.size()];
                    for (int i = 0; i < c0.size(); i++) {
                        C42122p5 E = C42139q5.m170743E();
                        E.mo137213E(((C30870ra) c0.get(i)).f73924c);
                        E.mo137214F(((C30870ra) c0.get(i)).f73925d);
                        d0.f74119b.mo87370g0().mo87426K(E, ((C30870ra) c0.get(i)).f73926e);
                        q5VarArr[i] = (C42139q5) E.mo137180s();
                    }
                    S1.mo136825Q0(Arrays.asList(q5VarArr));
                    C30911v3 b = C30911v3.m124271b(zzaw);
                    d0.f74136a.mo87110N().mo87550z(b.f74021d, d0.f74119b.mo87360W().mo87213Q(str3));
                    d0.f74136a.mo87110N().mo87502B(b, d0.f74136a.mo87130z().mo87081n(str3));
                    Bundle bundle2 = b.f74021d;
                    bundle2.putLong("_c", 1);
                    d0.f74136a.mo86903d().mo87488q().mo87463a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString(C32648f.f79204c, zzaw.f74165c);
                    if (d0.f74136a.mo87110N().mo87521U(S1.mo136870z0())) {
                        d0.f74136a.mo87110N().mo87504D(bundle2, "_dbg", 1L);
                        d0.f74136a.mo87110N().mo87504D(bundle2, "_r", 1L);
                    }
                    C30859r V2 = d0.f74119b.mo87360W().mo87218V(str3, zzaw.f74163a);
                    if (V2 == null) {
                        g5Var = S1;
                        d6Var = R;
                        e5Var = B;
                        str = str3;
                        bundle = bundle2;
                        str2 = null;
                        rVar = new C30859r(str3, zzaw.f74163a, 0, 0, 0, zzaw.f74166d, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j = 0;
                    } else {
                        d6Var = R;
                        e5Var = B;
                        str = str3;
                        bundle = bundle2;
                        g5Var = S1;
                        str2 = null;
                        long j2 = V2.f73890f;
                        rVar = V2.mo87453c(zzaw.f74166d);
                        j = j2;
                    }
                    d0.f74119b.mo87360W().mo87234q(rVar);
                    C30847q qVar = new C30847q(d0.f74136a, zzaw.f74165c, str, zzaw.f74163a, zzaw.f74166d, j, bundle);
                    C42223v4 F = C42240w4.m171015F();
                    F.mo137365L(qVar.f73865d);
                    F.mo137361H(qVar.f73863b);
                    F.mo137364K(qVar.f73866e);
                    C30871s sVar = new C30871s(qVar.f73867f);
                    while (sVar.hasNext()) {
                        String b2 = sVar.next();
                        C42291z4 F2 = C41855a5.m169601F();
                        F2.mo137491I(b2);
                        Object f0 = qVar.f73867f.mo87637f0(b2);
                        if (f0 != null) {
                            d0.f74119b.mo87370g0().mo87425J(F2, f0);
                            F.mo137357D(F2);
                        }
                    }
                    C41963g5 g5Var2 = g5Var;
                    g5Var2.mo136827R0(F);
                    C41999i5 B2 = C42035k5.m170447B();
                    C42257x4 B3 = C42274y4.m171164B();
                    B3.mo137450x(rVar.f73887c);
                    B3.mo137449A(zzaw.f74163a);
                    B2.mo137030x(B3);
                    g5Var2.mo136852g0(B2);
                    g5Var2.mo136818L0(d0.f74119b.mo87357T().mo86887m(d6Var.mo86994i0(), Collections.emptyList(), g5Var2.mo136807F0(), Long.valueOf(F.mo137355B()), Long.valueOf(F.mo137355B())));
                    if (F.mo137369R()) {
                        g5Var2.mo136861q0(F.mo137355B());
                        g5Var2.mo136826R(F.mo137355B());
                    }
                    long b0 = d6Var.mo86980b0();
                    int i2 = (b0 > 0 ? 1 : (b0 == 0 ? 0 : -1));
                    if (i2 != 0) {
                        g5Var2.mo136854h0(b0);
                    }
                    long d02 = d6Var.mo86984d0();
                    if (d02 != 0) {
                        g5Var2.mo136855i0(d02);
                    } else if (i2 != 0) {
                        g5Var2.mo136855i0(b0);
                    }
                    String c = d6Var.mo86981c();
                    C41955ff.m169896b();
                    String str4 = str;
                    if (d0.f74136a.mo87130z().mo87070B(str4, C30742h3.f73554q0) && c != null) {
                        g5Var2.mo136860o0(c);
                    }
                    d6Var.mo86987f();
                    g5Var2.mo136810H((int) d6Var.mo86982c0());
                    d0.f74136a.mo87130z().mo87084q();
                    g5Var2.mo136865v0(76003);
                    g5Var2.mo136864u0(d0.f74136a.mo86900a().mo134768a());
                    g5Var2.mo136859m0(true);
                    if (d0.f74136a.mo87130z().mo87070B(str2, C30742h3.f73562u0)) {
                        d0.f74119b.mo87371h(g5Var2.mo136870z0(), g5Var2);
                    }
                    C41927e5 e5Var2 = e5Var;
                    e5Var2.mo136711x(g5Var2);
                    C30693d6 d6Var2 = d6Var;
                    d6Var2.mo86954D(g5Var2.mo136813I0());
                    d6Var2.mo86952B(g5Var2.mo136811H0());
                    d0.f74119b.mo87360W().mo87233p(d6Var2);
                    d0.f74119b.mo87360W().mo87232o();
                    d0.f74119b.mo87360W().mo87227f0();
                    try {
                        return d0.f74119b.mo87370g0().mo87428O(((C41945f5) e5Var2.mo137180s()).mo136762g());
                    } catch (IOException e2) {
                        d0.f74136a.mo86903d().mo87489r().mo87465c("Data loss. Failed to bundle and serialize. appId", C30899u3.m124186z(str4), e2);
                        return str2;
                    }
                } catch (SecurityException e3) {
                    d0.f74136a.mo86903d().mo87488q().mo87464b("app instance id encryption failed", e3.getMessage());
                    byte[] bArr2 = new byte[0];
                    d0.f74119b.mo87360W().mo87227f0();
                    return bArr2;
                }
            }
            naVar.mo87360W().mo87227f0();
            return bArr;
        } else {
            d0.f74136a.mo86903d().mo87488q().mo87465c("Generating a payload for this event is not available. package_name, event_name", str3, zzaw.f74163a);
            return null;
        }
    }
}
