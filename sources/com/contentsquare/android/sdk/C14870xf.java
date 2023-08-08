package com.contentsquare.android.sdk;

import android.content.Context;
import com.contentsquare.android.sdk.C14223bc;
import com.contentsquare.android.sdk.C14228bf;
import com.contentsquare.android.sdk.C14283e;
import com.contentsquare.android.sdk.C14313eg;
import com.contentsquare.android.sdk.C14342fb;
import com.contentsquare.android.sdk.C14375gb;
import com.contentsquare.android.sdk.C14439j3;
import com.contentsquare.android.sdk.C14479ka;
import com.contentsquare.android.sdk.C14497l8;
import com.contentsquare.android.sdk.C14613p8;
import com.contentsquare.android.sdk.C14655qe;
import com.contentsquare.android.sdk.C14659r0;
import com.contentsquare.android.sdk.C14685rc;
import com.contentsquare.android.sdk.C14883y4;
import com.contentsquare.android.sdk.C14928zb;

/* renamed from: com.contentsquare.android.sdk.xf */
public class C14870xf {

    /* renamed from: a */
    public final C14476k7 f36889a;

    /* renamed from: b */
    public C14803vc f36890b;

    /* renamed from: c */
    public final C14872y0 f36891c;

    /* renamed from: d */
    public final C14795v7 f36892d;

    /* renamed from: e */
    public final C14771u6 f36893e;

    public C14870xf(Context context, C14872y0 y0Var, C14795v7 v7Var, C14476k7 k7Var) {
        this(k7Var, y0Var, v7Var, C14549na.m62703a(context).mo35983c());
    }

    /* renamed from: a */
    public C14283e.C14284a mo36862a() {
        C14283e.C14284a aVar = new C14283e.C14284a(this.f36889a);
        C14466k4 c = this.f36893e.mo36561c();
        if (c != null) {
            aVar.mo34996c(c.mo35709a());
        }
        aVar.mo34997d(this.f36892d.mo36632c());
        return aVar;
    }

    /* renamed from: b */
    public <T extends C14439j3.C14440a> T mo36863b(int i) {
        T d = mo36865d(i);
        d.mo35598c(this.f36889a.mo35761k());
        d.mo35596a(this.f36889a.mo35757g());
        d.mo35605k(this.f36889a.mo35771u());
        C14476k7 k7Var = this.f36889a;
        d.mo35599d(k7Var.mo35753c(k7Var.mo35759i()));
        d.mo35609o(this.f36891c.mo36894p());
        d.mo35607m(this.f36891c.mo36893o());
        C14803vc vcVar = this.f36890b;
        if (vcVar != null) {
            String c = vcVar.mo34688c();
            if (!C14358g3.m61811e(c)) {
                d.mo35601g(c);
            }
        }
        return d;
    }

    /* renamed from: c */
    public void mo36864c(C14803vc vcVar) {
        this.f36890b = vcVar;
    }

    /* renamed from: d */
    public final <T extends C14439j3.C14440a> T mo36865d(int i) {
        if (i == 0) {
            return new C14685rc.C14686a();
        }
        if (i == 1) {
            return new C14928zb.C14929a();
        }
        if (i == 2) {
            return new C14479ka.C14480a();
        }
        if (i == 4) {
            return new C14313eg.C14314a();
        }
        if (i == 6) {
            return new C14497l8.C14498a();
        }
        if (i == 21) {
            return new C14883y4.C14884a();
        }
        switch (i) {
            case 8:
                return new C14659r0.C14660a();
            case 9:
                return new C14613p8.C14614a();
            case 10:
                return new C14655qe.C14656a();
            default:
                switch (i) {
                    case 16:
                        return new C14228bf.C14229a();
                    case 17:
                        return new C14342fb.C14343a();
                    case 18:
                        return new C14223bc.C14224a();
                    case 19:
                        return new C14375gb.C14376a();
                    default:
                        T aVar = new C14342fb.C14343a();
                        aVar.mo35188x(1);
                        aVar.mo35187w("EventsBuildersFactory.builderFor was called with an invalid type");
                        return aVar;
                }
        }
    }

    public C14870xf(C14476k7 k7Var, C14872y0 y0Var, C14795v7 v7Var, C14771u6 u6Var) {
        this.f36889a = k7Var;
        this.f36891c = y0Var;
        this.f36892d = v7Var;
        this.f36893e = u6Var;
    }
}
