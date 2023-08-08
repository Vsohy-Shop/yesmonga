package com.contentsquare.android.sdk;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import com.contentsquare.android.sdk.C14851x7;
import java.lang.ref.WeakReference;

/* renamed from: com.contentsquare.android.sdk.b8 */
public class C14215b8 implements C14803vc {

    /* renamed from: a */
    public final C14453jf f35114a = new C14453jf("GesturesInterceptor");

    /* renamed from: b */
    public final C14533md<C14210b5<MotionEvent>> f35115b;

    /* renamed from: c */
    public final C14326f6 f35116c;

    /* renamed from: d */
    public final C14534me f35117d;

    /* renamed from: e */
    public WeakReference<ViewGroup> f35118e = new WeakReference<>((Object) null);

    /* renamed from: f */
    public final C14325f5 f35119f = new C14216a();

    /* renamed from: g */
    public String f35120g;

    /* renamed from: h */
    public String f35121h;

    /* renamed from: i */
    public final C14663r3<Activity> f35122i;

    /* renamed from: j */
    public C14851x7.C14853b f35123j;

    /* renamed from: com.contentsquare.android.sdk.b8$a */
    public class C14216a implements C14325f5 {
        public C14216a() {
        }

        /* renamed from: a */
        public void mo34402a() {
            C14215b8.this.f35114a.mo35676e("update() called");
            C14210b5 c = C14215b8.this.f35115b.mo34977c();
            if (c.mo34659j()) {
                mo34694b((MotionEvent) c.mo34655g());
            }
        }

        /* renamed from: b */
        public final void mo34694b(MotionEvent motionEvent) {
            C14215b8.this.f35114a.mo35674c("consumeAndRecycle() called with event [%s]", motionEvent);
            ViewGroup viewGroup = C14215b8.this.f35118e.get();
            if (viewGroup != null) {
                C14215b8.this.f35116c.mo35132b(motionEvent, viewGroup);
            }
            motionEvent.recycle();
        }
    }

    public C14215b8(C14663r3<Activity> r3Var, C14533md<C14210b5<MotionEvent>> mdVar, C14326f6 f6Var, C14534me meVar) {
        this.f35122i = r3Var;
        this.f35115b = mdVar;
        this.f35116c = f6Var;
        this.f35117d = meVar;
    }

    /* renamed from: a */
    public ViewGroup mo34685a() {
        return this.f35118e.get();
    }

    /* renamed from: b */
    public final void mo34687b(Activity activity) {
        this.f35114a.mo35681l("attaching Glass", new Object[0]);
        Window window = activity.getWindow();
        if (window != null && (window.getDecorView() instanceof ViewGroup)) {
            this.f35118e = new WeakReference<>((ViewGroup) window.getDecorView());
            if (!this.f35122i.mo34386b(activity)) {
                this.f35117d.mo35925a(activity);
            }
        }
    }

    /* renamed from: c */
    public void mo34689c(String str) {
        this.f35121h = str;
    }

    /* renamed from: d */
    public void mo34690d(String str) {
        this.f35120g = str;
    }

    /* renamed from: e */
    public void mo34691e(Activity activity) {
        this.f35114a.mo35681l("detaching Glass", new Object[0]);
        if (activity.getWindow() != null) {
            this.f35117d.mo35927c(activity);
            this.f35118e = new WeakReference<>((Object) null);
        }
    }

    /* renamed from: j */
    public String mo34692j() {
        return this.f35121h;
    }

    /* renamed from: p */
    public void mo34693p() {
        if (this.f35123j == null) {
            this.f35123j = C14851x7.m64003a(this.f35115b, this.f35119f);
        }
    }

    /* renamed from: b */
    public void mo34686b() {
        C14851x7.C14853b bVar = this.f35123j;
        if (bVar != null) {
            bVar.close();
            this.f35123j = null;
        }
    }

    /* renamed from: c */
    public String mo34688c() {
        return this.f35120g;
    }
}
