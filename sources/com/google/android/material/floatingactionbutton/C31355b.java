package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C18001r;
import com.google.android.material.animation.C31093a;
import com.google.android.material.animation.C31094b;
import com.google.android.material.animation.C31100h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.floatingactionbutton.b */
public abstract class C31355b implements C31376f {

    /* renamed from: a */
    public final Context f75619a;
    @C0359n0

    /* renamed from: b */
    public final ExtendedFloatingActionButton f75620b;

    /* renamed from: c */
    public final ArrayList<Animator.AnimatorListener> f75621c = new ArrayList<>();

    /* renamed from: d */
    public final C31354a f75622d;
    @C0363p0

    /* renamed from: e */
    public C31100h f75623e;
    @C0363p0

    /* renamed from: f */
    public C31100h f75624f;

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    public class C31356a extends Property<ExtendedFloatingActionButton, Float> {
        public C31356a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(C31093a.m124647a(0.0f, 1.0f, (((float) Color.alpha(extendedFloatingActionButton.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton.f75565f1.getColorForState(extendedFloatingActionButton.getDrawableState(), C31355b.this.f75620b.f75565f1.getDefaultColor())))));
        }

        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.f75565f1.getColorForState(extendedFloatingActionButton.getDrawableState(), C31355b.this.f75620b.f75565f1.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (C31093a.m124647a(0.0f, ((float) Color.alpha(colorForState)) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.mo89591X(extendedFloatingActionButton.f75565f1);
            } else {
                extendedFloatingActionButton.mo89591X(valueOf);
            }
        }
    }

    public C31355b(@C0359n0 ExtendedFloatingActionButton extendedFloatingActionButton, C31354a aVar) {
        this.f75620b = extendedFloatingActionButton;
        this.f75619a = extendedFloatingActionButton.getContext();
        this.f75622d = aVar;
    }

    /* renamed from: a */
    public final C31100h mo89762a() {
        C31100h hVar = this.f75624f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f75623e == null) {
            this.f75623e = C31100h.m124662d(this.f75619a, mo89652g());
        }
        return (C31100h) C18001r.m81775l(this.f75623e);
    }

    @C0363p0
    /* renamed from: c */
    public C31100h mo89763c() {
        return this.f75624f;
    }

    /* renamed from: e */
    public final void mo89764e(@C0359n0 Animator.AnimatorListener animatorListener) {
        this.f75621c.remove(animatorListener);
    }

    @C0346i
    /* renamed from: f */
    public void mo89657f() {
        this.f75622d.mo89760b();
    }

    /* renamed from: h */
    public final void mo89765h(@C0359n0 Animator.AnimatorListener animatorListener) {
        this.f75621c.add(animatorListener);
    }

    @C0346i
    /* renamed from: i */
    public void mo89653i() {
        this.f75622d.mo89760b();
    }

    /* renamed from: j */
    public final void mo89766j(@C0363p0 C31100h hVar) {
        this.f75624f = hVar;
    }

    /* renamed from: k */
    public AnimatorSet mo89654k() {
        return mo89768o(mo89762a());
    }

    @C0359n0
    /* renamed from: l */
    public final List<Animator.AnimatorListener> mo89767l() {
        return this.f75621c;
    }

    @C0359n0
    /* renamed from: o */
    public AnimatorSet mo89768o(@C0359n0 C31100h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.mo87862j("opacity")) {
            arrayList.add(hVar.mo87857f("opacity", this.f75620b, View.ALPHA));
        }
        if (hVar.mo87862j("scale")) {
            arrayList.add(hVar.mo87857f("scale", this.f75620b, View.SCALE_Y));
            arrayList.add(hVar.mo87857f("scale", this.f75620b, View.SCALE_X));
        }
        if (hVar.mo87862j("width")) {
            arrayList.add(hVar.mo87857f("width", this.f75620b, ExtendedFloatingActionButton.f75548k1));
        }
        if (hVar.mo87862j("height")) {
            arrayList.add(hVar.mo87857f("height", this.f75620b, ExtendedFloatingActionButton.f75549l1));
        }
        if (hVar.mo87862j("paddingStart")) {
            arrayList.add(hVar.mo87857f("paddingStart", this.f75620b, ExtendedFloatingActionButton.f75550m1));
        }
        if (hVar.mo87862j("paddingEnd")) {
            arrayList.add(hVar.mo87857f("paddingEnd", this.f75620b, ExtendedFloatingActionButton.f75551n1));
        }
        if (hVar.mo87862j("labelOpacity")) {
            arrayList.add(hVar.mo87857f("labelOpacity", this.f75620b, new C31356a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C31094b.m124650a(animatorSet, arrayList);
        return animatorSet;
    }

    @C0346i
    public void onAnimationStart(Animator animator) {
        this.f75622d.mo89761c(animator);
    }
}
