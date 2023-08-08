package com.contentsquare.android.sdk;

import android.app.Application;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.contentsquare.android.sdk.C14322f4;
import com.contentsquare.android.sdk.C14342fb;
import com.contentsquare.android.sdk.C14439j3;
import com.contentsquare.android.sdk.C14497l8;
import com.contentsquare.android.sdk.C14613p8;
import com.contentsquare.android.sdk.C14655qe;
import com.contentsquare.android.sdk.C14659r0;

/* renamed from: com.contentsquare.android.sdk.f6 */
public class C14326f6 implements C14322f4.C14324b {

    /* renamed from: a */
    public final C14779ud f35376a;

    /* renamed from: b */
    public final C14453jf f35377b;

    /* renamed from: c */
    public final C14870xf f35378c;

    /* renamed from: d */
    public final Application f35379d;

    /* renamed from: e */
    public C14322f4 f35380e;

    /* renamed from: f */
    public final C14265d3<C14439j3.C14440a> f35381f;

    public C14326f6() {
        this(C14600oe.m62882k().mo36108a(), new C14779ud(), new C14322f4(C14600oe.m62882k().mo36108a(), new C14779ud(), new C14772u7()), C14600oe.m62882k().mo36110d(), C14600oe.m62882k().mo36111e());
    }

    /* renamed from: a */
    public void mo35131a(C14522m7 m7Var) {
        this.f35377b.mo35674c("onGestureDetected() called with result [%s]", m7Var);
        if (!mo35137g(m7Var)) {
            mo35138h(m7Var);
        }
    }

    /* renamed from: b */
    public void mo35132b(MotionEvent motionEvent, ViewGroup viewGroup) {
        String str;
        C14453jf jfVar;
        if (motionEvent.getPointerCount() > 1) {
            this.f35377b.mo35676e("event with multiple pointers skipped");
            return;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f35380e.mo35118d();
            this.f35380e.mo35127m(motionEvent, viewGroup);
            jfVar = this.f35377b;
            str = "processed MotionEvent.ACTION_DOWN event type";
        } else if (action == 1) {
            this.f35380e.mo35129o(motionEvent);
            C14322f4 f4Var = new C14322f4(this.f35379d, this.f35376a, new C14772u7());
            this.f35380e = f4Var;
            f4Var.mo35123i(this);
            jfVar = this.f35377b;
            str = "processed MotionEvent.ACTION_UP event type";
        } else if (action != 2) {
            C14322f4 f4Var2 = new C14322f4(this.f35379d, this.f35376a, new C14772u7());
            this.f35380e = f4Var2;
            f4Var2.mo35123i(this);
            this.f35377b.mo35681l("received unhandled event type: %s", motionEvent.toString());
            return;
        } else {
            this.f35380e.mo35126l(motionEvent);
            jfVar = this.f35377b;
            str = "processed MotionEvent.ACTION_MOVE event type";
        }
        jfVar.mo35676e(str);
    }

    /* renamed from: c */
    public final C14613p8.C14614a mo35133c(C14522m7 m7Var) {
        return ((C14613p8.C14614a) this.f35378c.mo36863b(9)).mo36154v(m7Var.f35925c.mo34853a()).mo36155w(m7Var.f35926d).mo36156x((int) m7Var.f35927e).mo36157y((int) m7Var.f35928f);
    }

    /* renamed from: d */
    public final C14655qe.C14656a mo35134d(C14522m7 m7Var) {
        return ((C14655qe.C14656a) this.f35378c.mo36863b(10)).mo36277v(m7Var.f35925c.mo34853a()).mo36278w(m7Var.f35926d).mo36279x((int) m7Var.f35927e).mo36280y((int) m7Var.f35928f);
    }

    /* renamed from: e */
    public final C14659r0.C14660a mo35135e(C14522m7 m7Var) {
        return ((C14659r0.C14660a) this.f35378c.mo36863b(8)).mo36286v(m7Var.f35925c.mo34853a());
    }

    /* renamed from: f */
    public final C14497l8.C14498a mo35136f(C14522m7 m7Var) {
        return ((C14497l8.C14498a) this.f35378c.mo36863b(6)).mo35822w(m7Var.f35925c.mo34853a()).mo35821v(m7Var.f35923a);
    }

    /* renamed from: g */
    public final boolean mo35137g(C14522m7 m7Var) {
        return m7Var.mo35905a().booleanValue();
    }

    /* renamed from: h */
    public void mo35138h(C14522m7 m7Var) {
        Object obj;
        this.f35377b.mo35674c("processGestureResult() called with result [%s]", m7Var);
        if (m7Var != null && m7Var.f35925c != null) {
            int i = m7Var.f35924b;
            if (i == -1) {
                obj = null;
            } else if (i != 6) {
                switch (i) {
                    case 8:
                        obj = mo35135e(m7Var);
                        break;
                    case 9:
                        obj = mo35133c(m7Var);
                        break;
                    case 10:
                        obj = mo35134d(m7Var);
                        break;
                    default:
                        C14342fb.C14343a aVar = (C14342fb.C14343a) this.f35378c.mo36863b(17);
                        aVar.mo35188x(1);
                        aVar.mo35186v(false);
                        aVar.mo35187w("GestureProcessor: Failed to get event for type: " + m7Var.f35924b);
                        obj = aVar;
                        break;
                }
            } else {
                obj = mo35136f(m7Var);
            }
            if (obj != null) {
                this.f35381f.mo34827b(obj);
                this.f35377b.mo35674c("message sent to the reservoir: [ %s ]", obj);
            }
        }
    }

    public C14326f6(Application application, C14779ud udVar, C14322f4 f4Var, C14870xf xfVar, C14265d3<C14439j3.C14440a> d3Var) {
        this.f35377b = new C14453jf("GestureProcessor");
        this.f35379d = application;
        this.f35376a = udVar;
        this.f35380e = f4Var;
        this.f35378c = xfVar;
        f4Var.mo35123i(this);
        this.f35381f = d3Var;
    }
}
