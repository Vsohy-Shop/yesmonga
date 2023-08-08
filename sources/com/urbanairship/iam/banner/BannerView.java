package com.urbanairship.iam.banner;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0322b;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C17586h0;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;
import androidx.core.view.C18414x1;
import androidx.core.view.C18436z4;
import com.urbanairship.android.layout.util.C35923o;
import com.urbanairship.automation.C8978x;
import com.urbanairship.iam.C9139b;
import com.urbanairship.iam.assets.Assets;
import com.urbanairship.iam.banner.BannerDismissLayout;
import com.urbanairship.iam.view.C9247a;
import com.urbanairship.iam.view.C9248b;
import com.urbanairship.iam.view.C9254e;
import com.urbanairship.iam.view.InAppButtonLayout;
import com.urbanairship.iam.view.MediaView;
import com.usabilla.sdk.ubform.sdk.banner.BannerFragment;

public class BannerView extends FrameLayout implements InAppButtonLayout.ButtonClickListener, View.OnClickListener, BannerDismissLayout.Listener {

    /* renamed from: y */
    public static final float f24791y = 0.2f;
    @C0363p0

    /* renamed from: a */
    public final Assets f24792a;
    @C0359n0

    /* renamed from: b */
    public final C9156c f24793b;
    @C0359n0

    /* renamed from: c */
    public final C35923o f24794c;
    @C0322b

    /* renamed from: d */
    public int f24795d;
    @C0322b

    /* renamed from: e */
    public int f24796e;

    /* renamed from: f */
    public boolean f24797f = false;

    /* renamed from: g */
    public boolean f24798g = false;

    /* renamed from: v */
    public boolean f24799v = false;
    @C0363p0

    /* renamed from: w */
    public View f24800w;
    @C0363p0

    /* renamed from: x */
    public C9150d f24801x;

    /* renamed from: com.urbanairship.iam.banner.BannerView$a */
    public class C9147a extends C35923o {
        public C9147a(long j) {
            super(j);
        }

        /* renamed from: c */
        public void mo18316c() {
            BannerView.this.mo18306h(true);
            C9150d c = BannerView.this.f24801x;
            if (c != null) {
                c.mo18318a(BannerView.this);
            }
        }
    }

    /* renamed from: com.urbanairship.iam.banner.BannerView$b */
    public class C9148b implements C18414x1 {
        public C9148b() {
        }

        /* renamed from: a */
        public C18436z4 mo1193a(View view, C18436z4 z4Var) {
            for (int i = 0; i < BannerView.this.getChildCount(); i++) {
                C18196h2.m82616p(BannerView.this.getChildAt(i), new C18436z4(z4Var));
            }
            return z4Var;
        }
    }

    /* renamed from: com.urbanairship.iam.banner.BannerView$c */
    public class C9149c extends AnimatorListenerAdapter {
        public C9149c() {
        }

        public void onAnimationEnd(Animator animator) {
            BannerView.this.mo18310l();
        }
    }

    /* renamed from: com.urbanairship.iam.banner.BannerView$d */
    public interface C9150d {
        @C0353k0
        /* renamed from: a */
        void mo18318a(@C0359n0 BannerView bannerView);

        @C0353k0
        /* renamed from: b */
        void mo18319b(@C0359n0 BannerView bannerView);

        @C0353k0
        /* renamed from: c */
        void mo18320c(@C0359n0 BannerView bannerView, @C0359n0 C9139b bVar);

        @C0353k0
        /* renamed from: d */
        void mo18321d(@C0359n0 BannerView bannerView);
    }

    public BannerView(@C0359n0 Context context, @C0359n0 C9156c cVar, @C0363p0 Assets assets) {
        super(context);
        this.f24793b = cVar;
        this.f24792a = assets;
        this.f24794c = new C9147a(cVar.mo18349v());
        C18196h2.m82559a2(this, new C9148b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    @androidx.annotation.C0347i0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getContentLayout() {
        /*
            r3 = this;
            com.urbanairship.iam.banner.c r0 = r3.f24793b
            java.lang.String r0 = r0.mo18353z()
            int r1 = r0.hashCode()
            r2 = 4266497(0x411a01, float:5.978636E-39)
            if (r1 == r2) goto L_0x001f
            r2 = 1939617666(0x739c3782, float:2.4753544E31)
            if (r1 == r2) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "media_left"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x001f:
            java.lang.String r1 = "media_right"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0029
            r0 = 0
            goto L_0x002a
        L_0x0029:
            r0 = -1
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            int r0 = com.urbanairship.automation.C8978x.C8989k.ua_iam_banner_content_left_media
            return r0
        L_0x002f:
            int r0 = com.urbanairship.automation.C8978x.C8989k.ua_iam_banner_content_right_media
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.banner.BannerView.getContentLayout():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    @androidx.annotation.C0347i0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getLayout() {
        /*
            r3 = this;
            com.urbanairship.iam.banner.c r0 = r3.f24793b
            java.lang.String r0 = r0.mo18352y()
            int r1 = r0.hashCode()
            r2 = -1383228885(0xffffffffad8d9a2b, float:-1.6098308E-11)
            if (r1 == r2) goto L_0x001f
            r2 = 115029(0x1c155, float:1.6119E-40)
            if (r1 == r2) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "top"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0029
            r0 = 0
            goto L_0x002a
        L_0x001f:
            java.lang.String r1 = "bottom"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = -1
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            int r0 = com.urbanairship.automation.C8978x.C8989k.ua_iam_banner_bottom
            return r0
        L_0x002f:
            int r0 = com.urbanairship.automation.C8978x.C8989k.ua_iam_banner_top
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.banner.BannerView.getLayout():int");
    }

    /* renamed from: G */
    public void mo18300G(@C0359n0 View view, @C0359n0 C9139b bVar) {
        C9150d dVar = this.f24801x;
        if (dVar != null) {
            dVar.mo18320c(this, bVar);
        }
        mo18306h(true);
    }

    /* renamed from: a */
    public void mo18289a(@C0359n0 View view, int i) {
        if (i != 0) {
            if (i == 1) {
                getTimer().mo107584e();
            }
        } else if (this.f24798g) {
            getTimer().mo107583d();
        }
    }

    /* renamed from: b */
    public void mo18290b(@C0359n0 View view) {
        C9150d dVar = this.f24801x;
        if (dVar != null) {
            dVar.mo18321d(this);
        }
        mo18306h(false);
    }

    @C0376v0(api = 19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public void mo18301e() {
        this.f24799v = true;
        View view = this.f24800w;
        if (view != null) {
            mo18302f(view);
        }
    }

    /* renamed from: f */
    public final void mo18302f(@C0359n0 View view) {
        int i;
        int i2;
        int identifier;
        int identifier2;
        this.f24800w.setFitsSystemWindows(false);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843760, 16843759});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (!z2 || (identifier2 = getResources().getIdentifier("status_bar_height", BannerFragment.f27308Y, "android")) <= 0) {
            i = 0;
        } else {
            i = getResources().getDimensionPixelSize(identifier2);
        }
        if (!z || (identifier = getResources().getIdentifier(BannerFragment.f27307X, BannerFragment.f27308Y, "android")) <= 0) {
            i2 = 0;
        } else {
            i2 = getResources().getDimensionPixelSize(identifier);
        }
        C18196h2.m82571d2(this.f24800w, 0, i, 0, i2);
    }

    @C0359n0
    /* renamed from: g */
    public final Drawable mo18303g() {
        int i;
        int B = C17586h0.m80563B(this.f24793b.mo18348u(), Math.round(((float) Color.alpha(this.f24793b.mo18348u())) * 0.2f));
        if (C9156c.f24820X.equals(this.f24793b.mo18352y())) {
            i = 12;
        } else {
            i = 3;
        }
        return C9247a.m34735b(getContext()).mo18600c(this.f24793b.mo18342o()).mo18602e(B).mo18601d(this.f24793b.mo18344r(), i).mo18599a();
    }

    @C0359n0
    public C9156c getDisplayContent() {
        return this.f24793b;
    }

    @C0359n0
    public C35923o getTimer() {
        return this.f24794c;
    }

    @C0353k0
    /* renamed from: h */
    public void mo18306h(boolean z) {
        this.f24797f = true;
        getTimer().mo107584e();
        if (!z || this.f24800w == null || this.f24796e == 0) {
            mo18310l();
            return;
        }
        clearAnimation();
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), this.f24796e);
        loadAnimator.setTarget(this.f24800w);
        loadAnimator.addListener(new C9149c());
        loadAnimator.start();
    }

    @C0353k0
    @C0359n0
    /* renamed from: i */
    public View mo18307i(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        int i;
        BannerDismissLayout bannerDismissLayout = (BannerDismissLayout) layoutInflater.inflate(getLayout(), viewGroup, false);
        bannerDismissLayout.setPlacement(this.f24793b.mo18352y());
        bannerDismissLayout.setListener(this);
        ViewStub viewStub = (ViewStub) bannerDismissLayout.findViewById(C8978x.C8986h.banner_content);
        viewStub.setLayoutResource(getContentLayout());
        viewStub.inflate();
        LinearLayout linearLayout = (LinearLayout) bannerDismissLayout.findViewById(C8978x.C8986h.banner);
        C18196h2.m82502I1(linearLayout, mo18303g());
        if (this.f24793b.mo18344r() > 0.0f) {
            if (C9156c.f24820X.equals(this.f24793b.mo18352y())) {
                i = 12;
            } else {
                i = 3;
            }
            C9248b.m34742a(linearLayout, this.f24793b.mo18344r(), i);
        }
        if (!this.f24793b.mo18341n().isEmpty()) {
            linearLayout.setClickable(true);
            linearLayout.setOnClickListener(this);
        }
        TextView textView = (TextView) bannerDismissLayout.findViewById(C8978x.C8986h.heading);
        if (this.f24793b.mo18350w() != null) {
            C9254e.m34749c(textView, this.f24793b.mo18350w());
        } else {
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) bannerDismissLayout.findViewById(C8978x.C8986h.body);
        if (this.f24793b.mo18343p() != null) {
            C9254e.m34749c(textView2, this.f24793b.mo18343p());
        } else {
            textView2.setVisibility(8);
        }
        MediaView mediaView = (MediaView) bannerDismissLayout.findViewById(C8978x.C8986h.media);
        if (this.f24793b.mo18351x() != null) {
            C9254e.m34753g(mediaView, this.f24793b.mo18351x(), this.f24792a);
        } else {
            mediaView.setVisibility(8);
        }
        InAppButtonLayout inAppButtonLayout = (InAppButtonLayout) bannerDismissLayout.findViewById(C8978x.C8986h.buttons);
        if (this.f24793b.mo18346t().isEmpty()) {
            inAppButtonLayout.setVisibility(8);
        } else {
            inAppButtonLayout.setButtons(this.f24793b.mo18345s(), this.f24793b.mo18346t());
            inAppButtonLayout.setButtonClickListener(this);
        }
        View findViewById = bannerDismissLayout.findViewById(C8978x.C8986h.banner_pull);
        Drawable mutate = C17549d.m80456r(findViewById.getBackground()).mutate();
        C17549d.m80452n(mutate, this.f24793b.mo18348u());
        C18196h2.m82502I1(findViewById, mutate);
        return bannerDismissLayout;
    }

    @C0353k0
    @C0346i
    /* renamed from: j */
    public void mo18308j() {
        this.f24798g = false;
        getTimer().mo107584e();
    }

    @C0353k0
    @C0346i
    /* renamed from: k */
    public void mo18309k() {
        this.f24798g = true;
        if (!this.f24797f) {
            getTimer().mo107583d();
        }
    }

    @C0353k0
    /* renamed from: l */
    public final void mo18310l() {
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
            this.f24800w = null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C18196h2.m82642v1(this);
    }

    public void onClick(@C0359n0 View view) {
        C9150d dVar = this.f24801x;
        if (dVar != null) {
            dVar.mo18319b(this);
        }
        mo18306h(true);
    }

    public void onWindowVisibilityChanged(int i) {
        if (i == 0 && !this.f24797f && this.f24800w == null) {
            View i2 = mo18307i(LayoutInflater.from(getContext()), this);
            this.f24800w = i2;
            if (this.f24799v) {
                mo18302f(i2);
            }
            addView(this.f24800w);
            if (this.f24795d != 0) {
                Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), this.f24795d);
                loadAnimator.setTarget(this.f24800w);
                loadAnimator.start();
            }
            mo18309k();
        }
    }

    public void setAnimations(@C0322b int i, @C0322b int i2) {
        this.f24795d = i;
        this.f24796e = i2;
    }

    public void setListener(@C0363p0 C9150d dVar) {
        this.f24801x = dVar;
    }
}
