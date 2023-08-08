package com.contentsquare.android.sdk;

import android.app.Application;
import android.content.Context;
import com.contentsquare.android.sdk.C14191ag;

/* renamed from: com.contentsquare.android.sdk.na */
public class C14549na {

    /* renamed from: a */
    public static C14453jf f36014a = new C14453jf("ContentsquareModule");

    /* renamed from: b */
    public static C14549na f36015b;

    /* renamed from: c */
    public static C14771u6 f36016c;

    /* renamed from: d */
    public static C14213b7 f36017d;

    /* renamed from: e */
    public static C14267d5 f36018e;

    /* renamed from: f */
    public static C14601of f36019f;

    /* renamed from: g */
    public static C14534me f36020g;

    /* renamed from: h */
    public static C14709se f36021h;

    /* renamed from: i */
    public static C14191ag f36022i;

    /* renamed from: j */
    public static C14174a7 f36023j;

    public C14549na(Context context) {
        Application application = (Application) context;
        f36021h = new C14709se(application);
        f36017d = new C14213b7(context);
        C14771u6 u6Var = new C14771u6(f36017d);
        f36016c = u6Var;
        C14213b7 b7Var = f36017d;
        f36018e = new C14267d5(b7Var, new C14320f3(application, b7Var, u6Var));
        f36019f = new C14601of(f36017d);
        f36020g = new C14534me();
        f36022i = new C14191ag(new C14191ag.C14192a(), f36017d);
        f36023j = new C14174a7(context);
    }

    /* renamed from: a */
    public static C14549na m62703a(Context context) {
        if (f36015b == null) {
            f36015b = new C14549na(context);
        } else {
            f36014a.mo35676e("ContentsquareModule was already initialized.");
        }
        return f36015b;
    }

    /* renamed from: d */
    public static C14549na m62704d() {
        return f36015b;
    }

    /* renamed from: b */
    public C14534me mo35982b() {
        return f36020g;
    }

    /* renamed from: c */
    public C14771u6 mo35983c() {
        return f36016c;
    }

    /* renamed from: e */
    public C14709se mo35984e() {
        return f36021h;
    }

    /* renamed from: f */
    public C14174a7 mo35985f() {
        return f36023j;
    }

    /* renamed from: g */
    public C14213b7 mo35986g() {
        return f36017d;
    }

    /* renamed from: h */
    public C14601of mo35987h() {
        return f36019f;
    }

    /* renamed from: i */
    public C14267d5 mo35988i() {
        return f36018e;
    }
}
