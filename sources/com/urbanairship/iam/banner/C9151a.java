package com.urbanairship.iam.banner;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.view.C18196h2;
import com.urbanairship.C36059m;
import com.urbanairship.C36064q;
import com.urbanairship.app.C36029a;
import com.urbanairship.app.C36038h;
import com.urbanairship.automation.C8978x;
import com.urbanairship.iam.C9139b;
import com.urbanairship.iam.C9163c0;
import com.urbanairship.iam.C9190h;
import com.urbanairship.iam.C9202i;
import com.urbanairship.iam.C9269z;
import com.urbanairship.iam.DisplayHandler;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.iam.banner.BannerView;
import com.urbanairship.util.C9640b0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.urbanairship.iam.banner.a */
public class C9151a extends C9269z {
    @C0359n0

    /* renamed from: m */
    public static final String f24805m = "com.urbanairship.iam.banner.BANNER_CONTAINER_ID";

    /* renamed from: n */
    public static final Map<Class, Integer> f24806n = new HashMap();

    /* renamed from: g */
    public final C9156c f24807g;

    /* renamed from: h */
    public final C36064q<Activity> f24808h = new C9152a();

    /* renamed from: i */
    public final C36029a f24809i = new C9153b();

    /* renamed from: j */
    public WeakReference<Activity> f24810j;

    /* renamed from: k */
    public WeakReference<BannerView> f24811k;

    /* renamed from: l */
    public DisplayHandler f24812l;

    /* renamed from: com.urbanairship.iam.banner.a$a */
    public class C9152a implements C36064q<Activity> {
        public C9152a() {
        }

        /* renamed from: a */
        public boolean apply(Activity activity) {
            try {
                if (C9151a.this.mo18326p(activity) != null) {
                    return true;
                }
                C36059m.m148409e("BannerAdapter - Unable to display in-app message. No view group found.", new Object[0]);
                return false;
            } catch (Exception e) {
                C36059m.m148409e("Failed to find container view.", e);
                return false;
            }
        }
    }

    /* renamed from: com.urbanairship.iam.banner.a$b */
    public class C9153b extends C36038h {
        public C9153b() {
        }

        public void onActivityPaused(@C0359n0 Activity activity) {
            if (C9151a.this.f24808h.apply(activity)) {
                C9151a.this.mo18329t(activity);
            }
        }

        public void onActivityResumed(@C0359n0 Activity activity) {
            if (C9151a.this.f24808h.apply(activity)) {
                C9151a.this.mo18330u(activity);
            }
        }

        public void onActivityStopped(@C0359n0 Activity activity) {
            if (C9151a.this.f24808h.apply(activity)) {
                C9151a.this.mo18331v(activity);
            }
        }
    }

    /* renamed from: com.urbanairship.iam.banner.a$c */
    public class C9154c implements BannerView.C9150d {
        public C9154c() {
        }

        /* renamed from: a */
        public void mo18318a(@C0359n0 BannerView bannerView) {
            C9151a.this.f24812l.mo18165c(C9163c0.m34352h(), bannerView.getTimer().mo107582b());
            C9151a.this.mo18333x(bannerView.getContext());
        }

        /* renamed from: b */
        public void mo18319b(@C0359n0 BannerView bannerView) {
            if (!C9151a.this.f24807g.mo18341n().isEmpty()) {
                C9190h.m34482b(C9151a.this.f24807g.mo18341n());
                C9151a.this.f24812l.mo18165c(C9163c0.m34351g(), bannerView.getTimer().mo107582b());
            }
            C9151a.this.mo18333x(bannerView.getContext());
        }

        /* renamed from: c */
        public void mo18320c(@C0359n0 BannerView bannerView, @C0359n0 C9139b bVar) {
            C9190h.m34481a(bVar);
            C9151a.this.f24812l.mo18165c(C9163c0.m34347a(bVar), bannerView.getTimer().mo107582b());
            C9151a.this.mo18333x(bannerView.getContext());
        }

        /* renamed from: d */
        public void mo18321d(@C0359n0 BannerView bannerView) {
            C9151a.this.f24812l.mo18165c(C9163c0.m34349c(), bannerView.getTimer().mo107582b());
            C9151a.this.mo18333x(bannerView.getContext());
        }
    }

    public C9151a(@C0359n0 InAppMessage inAppMessage, @C0359n0 C9156c cVar) {
        super(inAppMessage, cVar.mo18351x());
        this.f24807g = cVar;
    }

    @C0359n0
    /* renamed from: s */
    public static C9151a m34265s(@C0359n0 InAppMessage inAppMessage) {
        C9156c cVar = (C9156c) inAppMessage.mo18182n();
        if (cVar != null) {
            return new C9151a(inAppMessage, cVar);
        }
        throw new IllegalArgumentException("Invalid message for adapter: " + inAppMessage);
    }

    @C0353k0
    /* renamed from: b */
    public void mo18322b(@C0359n0 Context context, @C0359n0 DisplayHandler displayHandler) {
        C36059m.m148413i("BannerAdapter - Displaying in-app message.", new Object[0]);
        this.f24812l = displayHandler;
        C9202i.m34549m(context).mo18484e(this.f24809i);
        mo18324n(context);
    }

    @C0353k0
    @C0346i
    /* renamed from: d */
    public boolean mo18323d(@C0359n0 Context context) {
        if (!super.mo18323d(context)) {
            return false;
        }
        return !C9202i.m34549m(context).mo18486g(this.f24808h).isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r6 = r6.get(0);
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18324n(@androidx.annotation.C0359n0 android.content.Context r6) {
        /*
            r5 = this;
            com.urbanairship.iam.i r6 = com.urbanairship.iam.C9202i.m34549m(r6)
            com.urbanairship.q<android.app.Activity> r0 = r5.f24808h
            java.util.List r6 = r6.mo18486g(r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0011
            return
        L_0x0011:
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            android.app.Activity r6 = (android.app.Activity) r6
            android.view.ViewGroup r1 = r5.mo18326p(r6)
            if (r1 != 0) goto L_0x001f
            return
        L_0x001f:
            com.urbanairship.iam.banner.BannerView r2 = r5.mo18332w(r6, r1)
            r5.mo18334y(r2, r6, r1)
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x0046
            int r3 = r1.getId()
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            if (r3 != r4) goto L_0x0043
            float r3 = com.urbanairship.iam.view.C9254e.m34751e(r1)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r4
            r2.setZ(r3)
            r1.addView(r2, r0)
            goto L_0x0046
        L_0x0043:
            r1.addView(r2)
        L_0x0046:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r5.f24810j = r0
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r2)
            r5.f24811k = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.banner.C9151a.mo18324n(android.content.Context):void");
    }

    /* renamed from: o */
    public final int mo18325o(@C0359n0 Activity activity) {
        Bundle bundle;
        Map<Class, Integer> map = f24806n;
        synchronized (map) {
            Integer num = map.get(activity.getClass());
            if (num != null) {
                int intValue = num.intValue();
                return intValue;
            }
            ActivityInfo a = C9640b0.m36123a(activity.getClass());
            int i = 0;
            if (!(a == null || (bundle = a.metaData) == null)) {
                i = bundle.getInt("com.urbanairship.iam.banner.BANNER_CONTAINER_ID", 0);
            }
            map.put(activity.getClass(), Integer.valueOf(i));
            return i;
        }
    }

    @C0363p0
    /* renamed from: p */
    public ViewGroup mo18326p(@C0359n0 Activity activity) {
        View view;
        int o = mo18325o(activity);
        if (o != 0) {
            view = activity.findViewById(o);
        } else {
            view = null;
        }
        if (view == null) {
            view = activity.findViewById(16908290);
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @C0363p0
    @C0353k0
    /* renamed from: q */
    public final BannerView mo18327q() {
        WeakReference<BannerView> weakReference = this.f24811k;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @C0363p0
    @C0353k0
    /* renamed from: r */
    public final Activity mo18328r() {
        WeakReference<Activity> weakReference = this.f24810j;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @C0353k0
    /* renamed from: t */
    public final void mo18329t(@C0359n0 Activity activity) {
        BannerView q;
        if (activity == mo18328r() && (q = mo18327q()) != null) {
            q.mo18308j();
        }
    }

    @C0353k0
    /* renamed from: u */
    public final void mo18330u(@C0359n0 Activity activity) {
        BannerView q = mo18327q();
        if (q == null || !C18196h2.m82521O0(q)) {
            mo18324n(activity);
        } else if (activity == mo18328r()) {
            q.mo18309k();
        }
    }

    @C0353k0
    /* renamed from: v */
    public final void mo18331v(@C0359n0 Activity activity) {
        BannerView q;
        if (activity == mo18328r() && (q = mo18327q()) != null) {
            this.f24811k = null;
            this.f24810j = null;
            q.mo18306h(false);
            mo18324n(activity.getApplicationContext());
        }
    }

    @C0359n0
    /* renamed from: w */
    public BannerView mo18332w(@C0359n0 Activity activity, @C0359n0 ViewGroup viewGroup) {
        return new BannerView(activity, this.f24807g, mo18649e());
    }

    @C0353k0
    @C0346i
    /* renamed from: x */
    public void mo18333x(@C0359n0 Context context) {
        C9202i.m34549m(context).mo18480a(this.f24809i);
    }

    /* renamed from: y */
    public void mo18334y(@C0359n0 BannerView bannerView, @C0359n0 Activity activity, @C0359n0 ViewGroup viewGroup) {
        if (mo18328r() != activity) {
            if (C9156c.f24821Y.equals(this.f24807g.mo18352y())) {
                bannerView.setAnimations(C8978x.C8980b.ua_iam_slide_in_bottom, C8978x.C8980b.ua_iam_slide_out_bottom);
            } else {
                bannerView.setAnimations(C8978x.C8980b.ua_iam_slide_in_top, C8978x.C8980b.ua_iam_slide_out_top);
            }
        }
        bannerView.setListener(new C9154c());
    }
}
