package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31532m;

/* renamed from: com.google.android.material.timepicker.d */
public class C31707d extends ConstraintLayout {

    /* renamed from: d */
    public static final String f77187d = "skip";

    /* renamed from: a */
    public final Runnable f77188a;

    /* renamed from: b */
    public int f77189b;

    /* renamed from: c */
    public C31525j f77190c;

    /* renamed from: com.google.android.material.timepicker.d$a */
    public class C31708a implements Runnable {
        public C31708a() {
        }

        public void run() {
            C31707d.this.mo91985y();
        }
    }

    public C31707d(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: x */
    public static boolean m128591x(View view) {
        return "skip".equals(view.getTag());
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(C18196h2.m82480D());
        }
        mo91986z();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        mo91985y();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        mo91986z();
    }

    public void setBackgroundColor(@C0354l int i) {
        this.f77190c.mo90777o0(ColorStateList.valueOf(i));
    }

    /* renamed from: u */
    public final Drawable mo91983u() {
        C31525j jVar = new C31525j();
        this.f77190c = jVar;
        jVar.mo90772l0(new C31532m(0.5f));
        this.f77190c.mo90777o0(ColorStateList.valueOf(-1));
        return this.f77190c;
    }

    @C0366r
    /* renamed from: v */
    public int mo91984v() {
        return this.f77189b;
    }

    /* renamed from: w */
    public void mo91874w(@C0366r int i) {
        this.f77189b = i;
        mo91985y();
    }

    /* renamed from: y */
    public void mo91985y() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m128591x(getChildAt(i2))) {
                i++;
            }
        }
        C16934c cVar = new C16934c();
        cVar.mo50824H(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = C31076a.C31084h.circle_center;
            if (id != i4 && !m128591x(childAt)) {
                cVar.mo50834M(childAt.getId(), i4, this.f77189b, f);
                f += 360.0f / ((float) (childCount - i));
            }
        }
        cVar.mo50900r(this);
    }

    /* renamed from: z */
    public final void mo91986z() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f77188a);
            handler.post(this.f77188a);
        }
    }

    public C31707d(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C31707d(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C31076a.C31087k.material_radial_view_group, this);
        C18196h2.m82502I1(this, mo91983u());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31076a.C31091o.RadialViewGroup, i, 0);
        this.f77189b = obtainStyledAttributes.getDimensionPixelSize(C31076a.C31091o.RadialViewGroup_materialCircleRadius, 0);
        this.f77188a = new C31708a();
        obtainStyledAttributes.recycle();
    }
}
