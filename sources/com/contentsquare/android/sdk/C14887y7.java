package com.contentsquare.android.sdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.contentsquare.android.sdk.C14446j9;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.y7 */
public class C14887y7 {

    /* renamed from: e */
    public static C14887y7 f36930e;

    /* renamed from: a */
    public final C14326f6 f36931a;

    /* renamed from: b */
    public String f36932b;

    /* renamed from: c */
    public C14250c9 f36933c;

    /* renamed from: d */
    public final C14453jf f36934d;

    /* renamed from: com.contentsquare.android.sdk.y7$a */
    public class C14888a implements C14446j9.C14447a {

        /* renamed from: a */
        public final /* synthetic */ String f36935a;

        public C14888a(String str) {
            this.f36935a = str;
        }

        /* renamed from: b */
        public void mo35644b(View view) {
            if (view.getClass().getName().contains(this.f36935a)) {
                C14887y7.this.f36933c = new C14691s0(view);
            }
        }

        /* renamed from: c */
        public void mo35645c(ViewGroup viewGroup) {
        }
    }

    public C14887y7() {
        this(new C14326f6());
    }

    /* renamed from: a */
    public static C14887y7 m64154a() {
        if (f36930e == null) {
            f36930e = new C14887y7();
        }
        return f36930e;
    }

    /* renamed from: b */
    public final void mo36930b(Activity activity, String str) {
        ViewGroup viewGroup;
        this.f36934d.mo35674c("findView: %s", str);
        this.f36933c = null;
        Window window = activity.getWindow();
        if (window != null && (viewGroup = (ViewGroup) window.getDecorView()) != null) {
            C14446j9.m62208a(new C14888a(str)).mo35643b(viewGroup);
        }
    }

    /* renamed from: c */
    public void mo36931c(String str, JSONObject jSONObject) {
        C14549na d;
        Activity a;
        if (!((this.f36933c != null && str.equals(this.f36932b)) || (d = C14549na.m62704d()) == null || (a = d.mo35984e().mo36415a()) == null)) {
            this.f36932b = str;
            mo36930b(a, str);
        }
        C14250c9 c9Var = this.f36933c;
        if (c9Var != null) {
            this.f36931a.mo35138h(C14547n8.m62701b(jSONObject, c9Var));
        }
    }

    public C14887y7(C14326f6 f6Var) {
        this.f36934d = new C14453jf("BridgeEventProcessor");
        this.f36931a = f6Var;
    }
}
