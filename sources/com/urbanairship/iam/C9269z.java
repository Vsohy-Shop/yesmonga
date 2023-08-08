package com.urbanairship.iam;

import android.content.Context;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.iam.assets.Assets;
import com.urbanairship.util.C9642c0;

/* renamed from: com.urbanairship.iam.z */
public abstract class C9269z extends C9179f {

    /* renamed from: d */
    public final InAppMessage f25284d;

    /* renamed from: e */
    public final C9127a0 f25285e;

    /* renamed from: f */
    public Assets f25286f;

    public C9269z(@C0359n0 InAppMessage inAppMessage, @C0363p0 C9127a0 a0Var) {
        this.f25284d = inAppMessage;
        this.f25285e = a0Var;
    }

    /* renamed from: g */
    public static boolean m34810g(String str) {
        return UAirship.m146188Y().mo106206H().mo18743g(str, 2);
    }

    @C0346i
    /* renamed from: a */
    public void mo18457a(@C0359n0 Context context) {
    }

    /* renamed from: c */
    public int mo18458c(@C0359n0 Context context, @C0359n0 Assets assets) {
        this.f25286f = assets;
        C9127a0 a0Var = this.f25285e;
        if (a0Var == null || m34810g(a0Var.mo18215g()) || C9127a0.f24709d.equals(this.f25285e.mo18214f())) {
            return 0;
        }
        C36059m.m148409e("URL not allowed. Unable to load: %s", this.f25285e.mo18215g());
        return 2;
    }

    @C0346i
    /* renamed from: d */
    public boolean mo18323d(@C0359n0 Context context) {
        if (!super.mo18323d(context)) {
            return false;
        }
        C9127a0 a0Var = this.f25285e;
        if (a0Var == null) {
            return true;
        }
        Assets assets = this.f25286f;
        if (assets == null || !assets.mo18229e(a0Var.mo18215g()).exists()) {
            return C9642c0.m36130c().mo19605b(context);
        }
        return true;
    }

    @C0363p0
    /* renamed from: e */
    public Assets mo18649e() {
        return this.f25286f;
    }

    @C0359n0
    /* renamed from: f */
    public InAppMessage mo18650f() {
        return this.f25284d;
    }
}
