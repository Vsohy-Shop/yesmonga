package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.C0359n0;

/* renamed from: com.google.android.material.shape.h */
public class C31522h {

    /* renamed from: a */
    public View f76351a;

    /* renamed from: b */
    public C31525j f76352b;

    /* renamed from: c */
    public ScrollView f76353c;

    /* renamed from: d */
    public final int[] f76354d = new int[2];

    /* renamed from: e */
    public final int[] f76355e = new int[2];

    /* renamed from: f */
    public final ViewTreeObserver.OnScrollChangedListener f76356f = new C31523a();

    /* renamed from: com.google.android.material.shape.h$a */
    public class C31523a implements ViewTreeObserver.OnScrollChangedListener {
        public C31523a() {
        }

        public void onScrollChanged() {
            C31522h.this.mo90708e();
        }
    }

    public C31522h(View view, C31525j jVar, ScrollView scrollView) {
        this.f76351a = view;
        this.f76352b = jVar;
        this.f76353c = scrollView;
    }

    /* renamed from: a */
    public void mo90704a(ScrollView scrollView) {
        this.f76353c = scrollView;
    }

    /* renamed from: b */
    public void mo90705b(C31525j jVar) {
        this.f76352b = jVar;
    }

    /* renamed from: c */
    public void mo90706c(@C0359n0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f76356f);
    }

    /* renamed from: d */
    public void mo90707d(@C0359n0 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f76356f);
    }

    /* renamed from: e */
    public void mo90708e() {
        ScrollView scrollView = this.f76353c;
        if (scrollView != null) {
            if (scrollView.getChildCount() != 0) {
                this.f76353c.getLocationInWindow(this.f76354d);
                this.f76353c.getChildAt(0).getLocationInWindow(this.f76355e);
                int top = (this.f76351a.getTop() - this.f76354d[1]) + this.f76355e[1];
                int height = this.f76351a.getHeight();
                int height2 = this.f76353c.getHeight();
                if (top < 0) {
                    this.f76352b.mo90780p0(Math.max(0.0f, Math.min(1.0f, (((float) top) / ((float) height)) + 1.0f)));
                    this.f76351a.invalidate();
                    return;
                }
                int i = top + height;
                if (i > height2) {
                    this.f76352b.mo90780p0(Math.max(0.0f, Math.min(1.0f, 1.0f - (((float) (i - height2)) / ((float) height)))));
                    this.f76351a.invalidate();
                } else if (this.f76352b.mo90799z() != 1.0f) {
                    this.f76352b.mo90780p0(1.0f);
                    this.f76351a.invalidate();
                }
            } else {
                throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
            }
        }
    }
}
