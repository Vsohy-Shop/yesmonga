package com.urbanairship.iam.banner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.Keep;
import androidx.core.view.C18196h2;
import androidx.customview.widget.C18553d;

public class BannerDismissLayout extends FrameLayout {

    /* renamed from: f */
    public static final float f24773f = 0.4f;

    /* renamed from: g */
    public static final float f24774g = 0.1f;

    /* renamed from: v */
    public static final int f24775v = 24;

    /* renamed from: a */
    public float f24776a;

    /* renamed from: b */
    public String f24777b;

    /* renamed from: c */
    public C18553d f24778c;

    /* renamed from: d */
    public float f24779d;

    /* renamed from: e */
    public Listener f24780e;

    public interface Listener {
        /* renamed from: a */
        void mo18289a(@C0359n0 View view, int i);

        /* renamed from: b */
        void mo18290b(@C0359n0 View view);
    }

    /* renamed from: com.urbanairship.iam.banner.BannerDismissLayout$a */
    public class C9144a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ float f24781a;

        public C9144a(float f) {
            this.f24781a = f;
        }

        public boolean onPreDraw() {
            BannerDismissLayout.this.setYFraction(this.f24781a);
            BannerDismissLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.urbanairship.iam.banner.BannerDismissLayout$b */
    public class C9145b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ float f24783a;

        public C9145b(float f) {
            this.f24783a = f;
        }

        public boolean onPreDraw() {
            BannerDismissLayout.this.setXFraction(this.f24783a);
            BannerDismissLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    public BannerDismissLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void computeScroll() {
        super.computeScroll();
        C18553d dVar = this.f24778c;
        if (dVar != null && dVar.mo53513o(true)) {
            C18196h2.m82610n1(this);
        }
    }

    /* renamed from: f */
    public final void mo18278f(@C0359n0 Context context) {
        if (!isInEditMode()) {
            this.f24778c = C18553d.m83926q(this, new C9146c(this, (C9144a) null));
            this.f24779d = (float) ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
            this.f24776a = TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
        }
    }

    public float getMinFlingVelocity() {
        return this.f24779d;
    }

    @Keep
    public float getXFraction() {
        int width = getWidth();
        if (width == 0) {
            return 0.0f;
        }
        return getTranslationX() / ((float) width);
    }

    @Keep
    public float getYFraction() {
        int height = getHeight();
        if (height == 0) {
            return 0.0f;
        }
        return getTranslationY() / ((float) height);
    }

    public boolean onInterceptTouchEvent(@C0359n0 MotionEvent motionEvent) {
        View v;
        if (this.f24778c.mo53496W(motionEvent) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        if (this.f24778c.mo53479F() != 0 || motionEvent.getActionMasked() != 2 || !this.f24778c.mo53504f(2) || (v = this.f24778c.mo53518v((int) motionEvent.getX(), (int) motionEvent.getY())) == null || v.canScrollVertically(this.f24778c.mo53478E())) {
            return false;
        }
        this.f24778c.mo53502d(v, motionEvent.getPointerId(0));
        if (this.f24778c.mo53479F() == 1) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@C0359n0 MotionEvent motionEvent) {
        View v;
        this.f24778c.mo53486M(motionEvent);
        if (this.f24778c.mo53522z() == null && motionEvent.getActionMasked() == 2 && this.f24778c.mo53504f(2) && (v = this.f24778c.mo53518v((int) motionEvent.getX(), (int) motionEvent.getY())) != null && !v.canScrollVertically(this.f24778c.mo53478E())) {
            this.f24778c.mo53502d(v, motionEvent.getPointerId(0));
        }
        if (this.f24778c.mo53522z() != null) {
            return true;
        }
        return false;
    }

    public void setListener(@C0363p0 Listener listener) {
        synchronized (this) {
            this.f24780e = listener;
        }
    }

    public void setMinFlingVelocity(float f) {
        this.f24779d = f;
    }

    public void setPlacement(@C0359n0 String str) {
        this.f24777b = str;
    }

    @Keep
    public void setXFraction(float f) {
        if (getVisibility() == 0 && getHeight() == 0) {
            getViewTreeObserver().addOnPreDrawListener(new C9145b(f));
            return;
        }
        setTranslationX(f * ((float) getWidth()));
    }

    @Keep
    public void setYFraction(float f) {
        if (getVisibility() == 0 && getHeight() == 0) {
            getViewTreeObserver().addOnPreDrawListener(new C9144a(f));
            return;
        }
        setTranslationY(f * ((float) getHeight()));
    }

    public BannerDismissLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24777b = C9156c.f24821Y;
        mo18278f(context);
    }

    /* renamed from: com.urbanairship.iam.banner.BannerDismissLayout$c */
    public class C9146c extends C18553d.C18556c {

        /* renamed from: a */
        public int f24785a;

        /* renamed from: b */
        public int f24786b;

        /* renamed from: c */
        public float f24787c;

        /* renamed from: d */
        public View f24788d;

        /* renamed from: e */
        public boolean f24789e;

        public C9146c() {
            this.f24787c = 0.0f;
            this.f24789e = false;
        }

        /* renamed from: a */
        public int mo18293a(@C0359n0 View view, int i, int i2) {
            return view.getLeft();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo18294b(@androidx.annotation.C0359n0 android.view.View r2, int r3, int r4) {
            /*
                r1 = this;
                com.urbanairship.iam.banner.BannerDismissLayout r2 = com.urbanairship.iam.banner.BannerDismissLayout.this
                java.lang.String r2 = r2.f24777b
                int r4 = r2.hashCode()
                r0 = -1383228885(0xffffffffad8d9a2b, float:-1.6098308E-11)
                if (r4 == r0) goto L_0x001f
                r0 = 115029(0x1c155, float:1.6119E-40)
                if (r4 == r0) goto L_0x0015
                goto L_0x0029
            L_0x0015:
                java.lang.String r4 = "top"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0029
                r2 = 0
                goto L_0x002a
            L_0x001f:
                java.lang.String r4 = "bottom"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0029
                r2 = 1
                goto L_0x002a
            L_0x0029:
                r2 = -1
            L_0x002a:
                if (r2 == 0) goto L_0x0040
                float r2 = (float) r3
                int r3 = r1.f24785a
                float r3 = (float) r3
                com.urbanairship.iam.banner.BannerDismissLayout r4 = com.urbanairship.iam.banner.BannerDismissLayout.this
                float r4 = r4.f24776a
                float r3 = r3 - r4
                float r2 = java.lang.Math.max(r2, r3)
                int r2 = java.lang.Math.round(r2)
                return r2
            L_0x0040:
                float r2 = (float) r3
                int r3 = r1.f24785a
                float r3 = (float) r3
                com.urbanairship.iam.banner.BannerDismissLayout r4 = com.urbanairship.iam.banner.BannerDismissLayout.this
                float r4 = r4.f24776a
                float r3 = r3 + r4
                float r2 = java.lang.Math.min(r2, r3)
                int r2 = java.lang.Math.round(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.banner.BannerDismissLayout.C9146c.mo18294b(android.view.View, int, int):int");
        }

        /* renamed from: i */
        public void mo18295i(@C0359n0 View view, int i) {
            this.f24788d = view;
            this.f24785a = view.getTop();
            this.f24786b = view.getLeft();
            this.f24787c = 0.0f;
            this.f24789e = false;
        }

        /* renamed from: j */
        public void mo18296j(int i) {
            if (this.f24788d != null) {
                synchronized (this) {
                    if (BannerDismissLayout.this.f24780e != null) {
                        BannerDismissLayout.this.f24780e.mo18289a(this.f24788d, i);
                    }
                    if (i == 0) {
                        if (this.f24789e) {
                            if (BannerDismissLayout.this.f24780e != null) {
                                BannerDismissLayout.this.f24780e.mo18290b(this.f24788d);
                            }
                            BannerDismissLayout.this.removeView(this.f24788d);
                        }
                        this.f24788d = null;
                    }
                }
            }
        }

        @SuppressLint({"NewApi"})
        /* renamed from: k */
        public void mo18297k(@C0359n0 View view, int i, int i2, int i3, int i4) {
            int height = BannerDismissLayout.this.getHeight();
            int abs = Math.abs(i2 - this.f24785a);
            if (height > 0) {
                this.f24787c = ((float) abs) / ((float) height);
            }
            BannerDismissLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo18298l(@C0359n0 View view, float f, float f2) {
            int i;
            boolean z;
            float abs = Math.abs(f2);
            if (!C9156c.f24820X.equals(BannerDismissLayout.this.f24777b) ? this.f24785a <= view.getTop() : this.f24785a >= view.getTop()) {
                if (this.f24787c >= 0.4f || abs > BannerDismissLayout.this.f24779d || this.f24787c > 0.1f) {
                    z = true;
                } else {
                    z = false;
                }
                this.f24789e = z;
            }
            if (this.f24789e) {
                if (C9156c.f24820X.equals(BannerDismissLayout.this.f24777b)) {
                    i = -view.getHeight();
                } else {
                    i = view.getHeight() + BannerDismissLayout.this.getHeight();
                }
                BannerDismissLayout.this.f24778c.mo53495V(this.f24786b, i);
            } else {
                BannerDismissLayout.this.f24778c.mo53495V(this.f24786b, this.f24785a);
            }
            BannerDismissLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo18299m(@C0359n0 View view, int i) {
            return this.f24788d == null;
        }

        public /* synthetic */ C9146c(BannerDismissLayout bannerDismissLayout, C9144a aVar) {
            this();
        }
    }

    @C0376v0(21)
    public BannerDismissLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f24777b = C9156c.f24821Y;
        mo18278f(context);
    }
}
