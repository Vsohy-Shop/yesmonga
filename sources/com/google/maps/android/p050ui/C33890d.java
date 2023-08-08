package com.google.maps.android.p050ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.C33802d;

/* renamed from: com.google.maps.android.ui.d */
public class C33890d {

    /* renamed from: j */
    public static final int f82237j = 1;

    /* renamed from: k */
    public static final int f82238k = 2;

    /* renamed from: l */
    public static final int f82239l = 3;

    /* renamed from: m */
    public static final int f82240m = 4;

    /* renamed from: n */
    public static final int f82241n = 5;

    /* renamed from: o */
    public static final int f82242o = 6;

    /* renamed from: p */
    public static final int f82243p = 7;

    /* renamed from: a */
    public final Context f82244a;

    /* renamed from: b */
    public ViewGroup f82245b;

    /* renamed from: c */
    public RotationLayout f82246c;

    /* renamed from: d */
    public TextView f82247d;

    /* renamed from: e */
    public View f82248e;

    /* renamed from: f */
    public int f82249f;

    /* renamed from: g */
    public float f82250g = 0.5f;

    /* renamed from: h */
    public float f82251h = 1.0f;

    /* renamed from: i */
    public C33888b f82252i;

    public C33890d(Context context) {
        this.f82244a = context;
        this.f82252i = new C33888b(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C33802d.C33813k.amu_text_bubble, (ViewGroup) null);
        this.f82245b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.f82246c = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(C33802d.C33810h.amu_text);
        this.f82247d = textView;
        this.f82248e = textView;
        mo98618n(1);
    }

    /* renamed from: c */
    public static int m136472c(int i) {
        if (i == 3) {
            return -3407872;
        }
        if (i == 4) {
            return -16737844;
        }
        if (i == 5) {
            return -10053376;
        }
        if (i != 6) {
            return i != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    /* renamed from: d */
    public static int m136473d(int i) {
        if (i == 3 || i == 4 || i == 5 || i == 6 || i == 7) {
            return C33802d.C33815m.amu_Bubble_TextAppearance_Light;
        }
        return C33802d.C33815m.amu_Bubble_TextAppearance_Dark;
    }

    /* renamed from: a */
    public float mo98607a() {
        return mo98611g(this.f82250g, this.f82251h);
    }

    /* renamed from: b */
    public float mo98608b() {
        return mo98611g(this.f82251h, this.f82250g);
    }

    /* renamed from: e */
    public Bitmap mo98609e() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f82245b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.f82245b.getMeasuredWidth();
        int measuredHeight = this.f82245b.getMeasuredHeight();
        this.f82245b.layout(0, 0, measuredWidth, measuredHeight);
        int i = this.f82249f;
        if (i == 1 || i == 3) {
            measuredHeight = this.f82245b.getMeasuredWidth();
            measuredWidth = this.f82245b.getMeasuredHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        int i2 = this.f82249f;
        if (i2 == 1) {
            canvas.translate((float) measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        } else if (i2 == 2) {
            canvas.rotate(180.0f, (float) (measuredWidth / 2), (float) (measuredHeight / 2));
        } else if (i2 == 3) {
            canvas.translate(0.0f, (float) measuredHeight);
            canvas.rotate(270.0f);
        }
        this.f82245b.draw(canvas);
        return createBitmap;
    }

    /* renamed from: f */
    public Bitmap mo98610f(CharSequence charSequence) {
        TextView textView = this.f82247d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return mo98609e();
    }

    /* renamed from: g */
    public final float mo98611g(float f, float f2) {
        int i = this.f82249f;
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            return 1.0f - f2;
        }
        if (i == 2) {
            return 1.0f - f;
        }
        if (i == 3) {
            return f2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public void mo98612h(Drawable drawable) {
        this.f82245b.setBackgroundDrawable(drawable);
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            this.f82245b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        this.f82245b.setPadding(0, 0, 0, 0);
    }

    /* renamed from: i */
    public void mo98613i(int i) {
        this.f82252i.mo98599a(i);
        mo98612h(this.f82252i);
    }

    /* renamed from: j */
    public void mo98614j(int i, int i2, int i3, int i4) {
        this.f82248e.setPadding(i, i2, i3, i4);
    }

    /* renamed from: k */
    public void mo98615k(int i) {
        this.f82246c.setViewRotation(i);
    }

    /* renamed from: l */
    public void mo98616l(View view) {
        TextView textView;
        this.f82246c.removeAllViews();
        this.f82246c.addView(view);
        this.f82248e = view;
        View findViewById = this.f82246c.findViewById(C33802d.C33810h.amu_text);
        if (findViewById instanceof TextView) {
            textView = (TextView) findViewById;
        } else {
            textView = null;
        }
        this.f82247d = textView;
    }

    /* renamed from: m */
    public void mo98617m(int i) {
        this.f82249f = ((i + 360) % 360) / 90;
    }

    /* renamed from: n */
    public void mo98618n(int i) {
        mo98613i(m136472c(i));
        mo98620p(this.f82244a, m136473d(i));
    }

    /* renamed from: o */
    public void mo98619o(int i) {
        mo98620p(this.f82244a, i);
    }

    /* renamed from: p */
    public void mo98620p(Context context, int i) {
        TextView textView = this.f82247d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }
}
