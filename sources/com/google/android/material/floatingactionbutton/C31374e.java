package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.content.C17318d;
import androidx.core.util.C18001r;
import com.google.android.material.C31076a;
import com.google.android.material.ripple.C31511b;
import com.google.android.material.shadow.C31514c;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import java.util.ArrayList;

@C0376v0(21)
/* renamed from: com.google.android.material.floatingactionbutton.e */
public class C31374e extends C31360d {

    /* renamed from: com.google.android.material.floatingactionbutton.e$a */
    public static class C31375a extends C31525j {
        public C31375a(C31534o oVar) {
            super(oVar);
        }

        public boolean isStateful() {
            return true;
        }
    }

    public C31374e(FloatingActionButton floatingActionButton, C31514c cVar) {
        super(floatingActionButton, cVar);
    }

    /* renamed from: A */
    public void mo89792A() {
    }

    /* renamed from: C */
    public void mo89794C() {
        mo89831i0();
    }

    /* renamed from: E */
    public void mo89796E(int[] iArr) {
    }

    /* renamed from: F */
    public void mo89797F(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C31360d.f75659S, mo89864m0(f, f3));
        stateListAnimator.addState(C31360d.f75660T, mo89864m0(f, f2));
        stateListAnimator.addState(C31360d.f75661U, mo89864m0(f, f2));
        stateListAnimator.addState(C31360d.f75662V, mo89864m0(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f75690w, "elevation", new float[]{f}).setDuration(0));
        if (i <= 24) {
            FloatingActionButton floatingActionButton = this.f75690w;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f75690w, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C31360d.f75644D);
        stateListAnimator.addState(C31360d.f75663W, animatorSet);
        stateListAnimator.addState(C31360d.f75664X, mo89864m0(0.0f, 0.0f));
        this.f75690w.setStateListAnimator(stateListAnimator);
        if (mo89820c0()) {
            mo89831i0();
        }
    }

    /* renamed from: N */
    public boolean mo89805N() {
        return false;
    }

    /* renamed from: Y */
    public void mo89816Y(@C0363p0 ColorStateList colorStateList) {
        Drawable drawable = this.f75670c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C31511b.m127405d(colorStateList));
        } else {
            super.mo89816Y(colorStateList);
        }
    }

    /* renamed from: c0 */
    public boolean mo89820c0() {
        return this.f75691x.mo89753c() || !mo89823e0();
    }

    /* renamed from: g0 */
    public void mo89827g0() {
    }

    @C0359n0
    /* renamed from: l */
    public C31525j mo89836l() {
        return new C31375a((C31534o) C18001r.m81775l(this.f75668a));
    }

    @C0359n0
    /* renamed from: l0 */
    public C31357c mo89863l0(int i, ColorStateList colorStateList) {
        Context context = this.f75690w.getContext();
        C31357c cVar = new C31357c((C31534o) C18001r.m81775l(this.f75668a));
        cVar.mo89779f(C17318d.m79723f(context, C31076a.C31081e.design_fab_stroke_top_outer_color), C17318d.m79723f(context, C31076a.C31081e.design_fab_stroke_top_inner_color), C17318d.m79723f(context, C31076a.C31081e.design_fab_stroke_end_inner_color), C17318d.m79723f(context, C31076a.C31081e.design_fab_stroke_end_outer_color));
        cVar.mo89778e((float) i);
        cVar.mo89776d(colorStateList);
        return cVar;
    }

    @C0359n0
    /* renamed from: m0 */
    public final Animator mo89864m0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f75690w, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f75690w, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C31360d.f75644D);
        return animatorSet;
    }

    /* renamed from: n */
    public float mo89838n() {
        return this.f75690w.getElevation();
    }

    /* renamed from: s */
    public void mo89843s(@C0359n0 Rect rect) {
        if (this.f75691x.mo89753c()) {
            super.mo89843s(rect);
        } else if (!mo89823e0()) {
            int sizeDimension = (this.f75678k - this.f75690w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: x */
    public void mo89848x(ColorStateList colorStateList, @C0363p0 PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C31525j l = mo89836l();
        this.f75669b = l;
        l.setTintList(colorStateList);
        if (mode != null) {
            this.f75669b.setTintMode(mode);
        }
        this.f75669b.mo90750Z(this.f75690w.getContext());
        if (i > 0) {
            this.f75671d = mo89863l0(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) C18001r.m81775l(this.f75671d), (Drawable) C18001r.m81775l(this.f75669b)});
        } else {
            this.f75671d = null;
            drawable = this.f75669b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C31511b.m127405d(colorStateList2), drawable, (Drawable) null);
        this.f75670c = rippleDrawable;
        this.f75672e = rippleDrawable;
    }
}
