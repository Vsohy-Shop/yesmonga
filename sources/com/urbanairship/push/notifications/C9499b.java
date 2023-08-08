package com.urbanairship.push.notifications;

import android.app.Notification;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.annotation.C0324b1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.core.app.C17075f2;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.C9645d0;
import com.urbanairship.util.C9669o0;

/* renamed from: com.urbanairship.push.notifications.b */
public class C9499b implements C9524n {

    /* renamed from: g */
    public static final int f25928g = 100;
    @C0324b1

    /* renamed from: b */
    public int f25929b;
    @C0375v

    /* renamed from: c */
    public int f25930c;
    @C0375v

    /* renamed from: d */
    public int f25931d;
    @C0354l

    /* renamed from: e */
    public int f25932e;
    @C0359n0

    /* renamed from: f */
    public String f25933f;

    public C9499b(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions) {
        this.f25929b = context.getApplicationInfo().labelRes;
        int i = airshipConfigOptions.f87151x;
        this.f25930c = i;
        this.f25931d = airshipConfigOptions.f87152y;
        this.f25932e = airshipConfigOptions.f87153z;
        String str = airshipConfigOptions.f87122A;
        if (str != null) {
            this.f25933f = str;
        } else {
            this.f25933f = C9524n.f26024a;
        }
        if (i == 0) {
            this.f25930c = context.getApplicationInfo().icon;
        }
        this.f25929b = context.getApplicationInfo().labelRes;
    }

    /* renamed from: a */
    public void mo19264a(@C0359n0 Context context, @C0359n0 Notification notification, @C0359n0 C9510g gVar) {
    }

    @C0359n0
    /* renamed from: b */
    public C9525o mo19265b(@C0359n0 Context context, @C0359n0 C9510g gVar) {
        if (C9669o0.m36224e(gVar.mo19313a().mo19171f())) {
            return C9525o.m35730a();
        }
        PushMessage a = gVar.mo19313a();
        C17075f2.C17092g T = new C17075f2.C17092g(context, gVar.mo19314b()).mo51364P(mo19274k(context, a)).mo51363O(a.mo19171f()).mo51346D(true).mo51384e0(a.mo19163J()).mo51358J(a.mo19178l(mo19268e())).mo51414t0(a.mo19177k(context, mo19273j())).mo51396k0(a.mo19185t()).mo51352G(a.mo19173h()).mo51353G0(a.mo19156C()).mo51368T(-1);
        int h = mo19271h();
        if (h != 0) {
            T.mo51380c0(BitmapFactory.decodeResource(context.getResources(), h));
        }
        if (a.mo19154A() != null) {
            T.mo51341A0(a.mo19154A());
        }
        if (Build.VERSION.SDK_INT < 26) {
            mo19267d(context, a, T);
        }
        return C9525o.m35731d(mo19275l(context, T, gVar).mo51389h());
    }

    @C0359n0
    /* renamed from: c */
    public C9510g mo19266c(@C0359n0 Context context, @C0359n0 PushMessage pushMessage) {
        return C9510g.m35656f(pushMessage).mo19319g(C9523m.m35725b(pushMessage.mo19183r(mo19269f()), C9524n.f26024a)).mo19320h(pushMessage.mo19184s(), mo19272i(context, pushMessage)).mo19318f();
    }

    /* renamed from: d */
    public final void mo19267d(@C0359n0 Context context, @C0359n0 PushMessage pushMessage, @C0359n0 C17075f2.C17092g gVar) {
        int i;
        if (pushMessage.mo19192y(context) != null) {
            gVar.mo51421x0(pushMessage.mo19192y(context));
            i = 2;
        } else {
            i = 3;
        }
        gVar.mo51368T(i);
    }

    @C0354l
    /* renamed from: e */
    public int mo19268e() {
        return this.f25932e;
    }

    @C0359n0
    /* renamed from: f */
    public String mo19269f() {
        return this.f25933f;
    }

    @C0324b1
    /* renamed from: g */
    public int mo19270g() {
        return this.f25929b;
    }

    @C0375v
    /* renamed from: h */
    public int mo19271h() {
        return this.f25931d;
    }

    /* renamed from: i */
    public int mo19272i(@C0359n0 Context context, @C0359n0 PushMessage pushMessage) {
        if (pushMessage.mo19184s() != null) {
            return 100;
        }
        return C9645d0.m36136e();
    }

    @C0375v
    /* renamed from: j */
    public int mo19273j() {
        return this.f25930c;
    }

    @C0363p0
    /* renamed from: k */
    public String mo19274k(@C0359n0 Context context, @C0359n0 PushMessage pushMessage) {
        if (pushMessage.mo19155B() != null) {
            return pushMessage.mo19155B();
        }
        int i = this.f25929b;
        if (i != 0) {
            return context.getString(i);
        }
        return null;
    }

    @C0359n0
    /* renamed from: l */
    public C17075f2.C17092g mo19275l(@C0359n0 Context context, @C0359n0 C17075f2.C17092g gVar, @C0359n0 C9510g gVar2) {
        PushMessage a = gVar2.mo19313a();
        gVar.mo51403o(new C9529q(context, gVar2).mo19374b(mo19268e()).mo19375c(mo19271h()).mo19376d(a.mo19177k(context, mo19273j())));
        gVar.mo51403o(new C9531s(context, gVar2));
        gVar.mo51403o(new C9498a(context, gVar2));
        gVar.mo51403o(new C9530r(context, a).mo19381f(new C17075f2.C17087e().mo51319A(gVar2.mo19313a().mo19171f())));
        return gVar;
    }

    /* renamed from: m */
    public void mo19276m(@C0354l int i) {
        this.f25932e = i;
    }

    /* renamed from: n */
    public void mo19277n(@C0359n0 String str) {
        this.f25933f = str;
    }

    /* renamed from: o */
    public void mo19278o(@C0324b1 int i) {
        this.f25929b = i;
    }

    /* renamed from: p */
    public void mo19279p(@C0375v int i) {
        this.f25931d = i;
    }

    /* renamed from: q */
    public void mo19280q(@C0375v int i) {
        this.f25930c = i;
    }
}
