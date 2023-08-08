package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.animation.C31094b;
import com.google.android.material.animation.C31095c;
import com.google.android.material.animation.C31096d;
import com.google.android.material.animation.C31097e;
import com.google.android.material.animation.C31100h;
import com.google.android.material.animation.C31101i;
import com.google.android.material.animation.C31102j;
import com.google.android.material.circularreveal.C31215a;
import com.google.android.material.circularreveal.C31217b;
import com.google.android.material.circularreveal.C31220c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.math.C31440a;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: f */
    public final Rect f77258f = new Rect();

    /* renamed from: g */
    public final RectF f77259g = new RectF();

    /* renamed from: h */
    public final RectF f77260h = new RectF();

    /* renamed from: i */
    public final int[] f77261i = new int[2];

    /* renamed from: j */
    public float f77262j;

    /* renamed from: k */
    public float f77263k;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C31729a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f77264a;

        /* renamed from: b */
        public final /* synthetic */ View f77265b;

        /* renamed from: c */
        public final /* synthetic */ View f77266c;

        public C31729a(boolean z, View view, View view2) {
            this.f77264a = z;
            this.f77265b = view;
            this.f77266c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f77264a) {
                this.f77265b.setVisibility(4);
                this.f77266c.setAlpha(1.0f);
                this.f77266c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f77264a) {
                this.f77265b.setVisibility(0);
                this.f77266c.setAlpha(0.0f);
                this.f77266c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public class C31730b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f77268a;

        public C31730b(View view) {
            this.f77268a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f77268a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    public class C31731c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C31220c f77270a;

        /* renamed from: b */
        public final /* synthetic */ Drawable f77271b;

        public C31731c(C31220c cVar, Drawable drawable) {
            this.f77270a = cVar;
            this.f77271b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f77270a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f77270a.setCircularRevealOverlayDrawable(this.f77271b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    public class C31732d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C31220c f77273a;

        public C31732d(C31220c cVar) {
            this.f77273a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            C31220c.C31225e revealInfo = this.f77273a.getRevealInfo();
            revealInfo.f75136c = Float.MAX_VALUE;
            this.f77273a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    public static class C31733e {
        @C0363p0

        /* renamed from: a */
        public C31100h f77275a;

        /* renamed from: b */
        public C31102j f77276b;
    }

    public FabTransformationBehavior() {
    }

    @C0359n0
    /* renamed from: M */
    public AnimatorSet mo92045M(@C0359n0 View view, @C0359n0 View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C31733e h0 = mo92067h0(view2.getContext(), z3);
        if (z3) {
            this.f77262j = view.getTranslationX();
            this.f77263k = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        mo92060a0(view, view2, z, z2, h0, arrayList, arrayList2);
        RectF rectF = this.f77259g;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        mo92065f0(view3, view4, z4, z2, h0, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        mo92059Z(view3, view4, z4, h0, arrayList);
        boolean z5 = z2;
        C31733e eVar = h0;
        mo92062c0(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        mo92061b0(view3, view4, z4, z5, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        mo92058Y(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        mo92057X(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C31094b.m124650a(animatorSet, arrayList);
        animatorSet.addListener(new C31729a(z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    @C0363p0
    /* renamed from: N */
    public final ViewGroup mo92047N(@C0359n0 View view) {
        View findViewById = view.findViewById(C31076a.C31084h.mtrl_child_content_container);
        if (findViewById != null) {
            return mo92068i0(findViewById);
        }
        if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
            return mo92068i0(((ViewGroup) view).getChildAt(0));
        }
        return mo92068i0(view);
    }

    /* renamed from: O */
    public final void mo92048O(@C0359n0 View view, @C0359n0 C31733e eVar, @C0359n0 C31101i iVar, @C0359n0 C31101i iVar2, float f, float f2, float f3, float f4, @C0359n0 RectF rectF) {
        float V = mo92055V(eVar, iVar, f, f3);
        float V2 = mo92055V(eVar, iVar2, f2, f4);
        Rect rect = this.f77258f;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f77259g;
        rectF2.set(rect);
        RectF rectF3 = this.f77260h;
        mo92056W(view, rectF3);
        rectF3.offset(V, V2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: P */
    public final void mo92049P(@C0359n0 View view, @C0359n0 RectF rectF) {
        mo92056W(view, rectF);
        rectF.offset(this.f77262j, this.f77263k);
    }

    @C0359n0
    /* renamed from: Q */
    public final Pair<C31101i, C31101i> mo92050Q(float f, float f2, boolean z, @C0359n0 C31733e eVar) {
        C31101i iVar;
        C31101i iVar2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            iVar2 = eVar.f77275a.mo87859h("translationXLinear");
            iVar = eVar.f77275a.mo87859h("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            iVar2 = eVar.f77275a.mo87859h("translationXCurveDownwards");
            iVar = eVar.f77275a.mo87859h("translationYCurveDownwards");
        } else {
            iVar2 = eVar.f77275a.mo87859h("translationXCurveUpwards");
            iVar = eVar.f77275a.mo87859h("translationYCurveUpwards");
        }
        return new Pair<>(iVar2, iVar);
    }

    /* renamed from: R */
    public final float mo92051R(@C0359n0 View view, @C0359n0 View view2, @C0359n0 C31102j jVar) {
        RectF rectF = this.f77259g;
        RectF rectF2 = this.f77260h;
        mo92049P(view, rectF);
        mo92056W(view2, rectF2);
        rectF2.offset(-mo92053T(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: S */
    public final float mo92052S(@C0359n0 View view, @C0359n0 View view2, @C0359n0 C31102j jVar) {
        RectF rectF = this.f77259g;
        RectF rectF2 = this.f77260h;
        mo92049P(view, rectF);
        mo92056W(view2, rectF2);
        rectF2.offset(0.0f, -mo92054U(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: T */
    public final float mo92053T(@C0359n0 View view, @C0359n0 View view2, @C0359n0 C31102j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f77259g;
        RectF rectF2 = this.f77260h;
        mo92049P(view, rectF);
        mo92056W(view2, rectF2);
        int i = jVar.f74446a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f74447b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f74447b;
    }

    /* renamed from: U */
    public final float mo92054U(@C0359n0 View view, @C0359n0 View view2, @C0359n0 C31102j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f77259g;
        RectF rectF2 = this.f77260h;
        mo92049P(view, rectF);
        mo92056W(view2, rectF2);
        int i = jVar.f74446a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f74448c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f74448c;
    }

    /* renamed from: V */
    public final float mo92055V(@C0359n0 C31733e eVar, @C0359n0 C31101i iVar, float f, float f2) {
        long c = iVar.mo87868c();
        long d = iVar.mo87869d();
        C31101i h = eVar.f77275a.mo87859h("expansion");
        return C31093a.m124647a(f, f2, iVar.mo87870e().getInterpolation(((float) (((h.mo87868c() + h.mo87869d()) + 17) - c)) / ((float) d)));
    }

    /* renamed from: W */
    public final void mo92056W(@C0359n0 View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f77261i;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: X */
    public final void mo92057X(View view, View view2, boolean z, boolean z2, @C0359n0 C31733e eVar, @C0359n0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup N;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof C31220c) || C31217b.f75118o != 0) && (N = mo92047N(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C31096d.f74431a.set(N, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(N, C31096d.f74431a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(N, C31096d.f74431a, new float[]{0.0f});
                }
                eVar.f77275a.mo87859h("contentFade").mo87867a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: Y */
    public final void mo92058Y(@C0359n0 View view, View view2, boolean z, boolean z2, @C0359n0 C31733e eVar, @C0359n0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C31220c) {
            C31220c cVar = (C31220c) view2;
            int g0 = mo92066g0(view);
            int i = 16777215 & g0;
            if (z) {
                if (!z2) {
                    cVar.setCircularRevealScrimColor(g0);
                }
                objectAnimator = ObjectAnimator.ofInt(cVar, C31220c.C31224d.f75132a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(cVar, C31220c.C31224d.f75132a, new int[]{g0});
            }
            objectAnimator.setEvaluator(C31095c.m124651b());
            eVar.f77275a.mo87859h("color").mo87867a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: Z */
    public final void mo92059Z(@C0359n0 View view, @C0359n0 View view2, boolean z, @C0359n0 C31733e eVar, @C0359n0 List<Animator> list) {
        float T = mo92053T(view, view2, eVar.f77276b);
        float U = mo92054U(view, view2, eVar.f77276b);
        Pair<C31101i, C31101i> Q = mo92050Q(T, U, z, eVar);
        C31101i iVar = (C31101i) Q.first;
        C31101i iVar2 = (C31101i) Q.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            T = this.f77262j;
        }
        fArr[0] = T;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            U = this.f77263k;
        }
        fArr2[0] = U;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo87867a(ofFloat);
        iVar2.mo87867a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: a0 */
    public final void mo92060a0(View view, @C0359n0 View view2, boolean z, boolean z2, @C0359n0 C31733e eVar, @C0359n0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float R = C18196h2.m82529R(view2) - C18196h2.m82529R(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-R);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-R});
        }
        eVar.f77275a.mo87859h("elevation").mo87867a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: b0 */
    public final void mo92061b0(@C0359n0 View view, View view2, boolean z, boolean z2, @C0359n0 C31733e eVar, float f, float f2, @C0359n0 List<Animator> list, @C0359n0 List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C31733e eVar2 = eVar;
        if (view4 instanceof C31220c) {
            C31220c cVar = (C31220c) view4;
            float R = mo92051R(view3, view4, eVar2.f77276b);
            float S = mo92052S(view3, view4, eVar2.f77276b);
            ((FloatingActionButton) view3).mo89686k(this.f77258f);
            float width = ((float) this.f77258f.width()) / 2.0f;
            C31101i h = eVar2.f77275a.mo87859h("expansion");
            if (z) {
                if (!z2) {
                    cVar.setRevealInfo(new C31220c.C31225e(R, S, width));
                }
                if (z2) {
                    width = cVar.getRevealInfo().f75136c;
                }
                animator = C31215a.m125752a(cVar, R, S, C31440a.m127027b(R, S, 0.0f, 0.0f, f, f2));
                animator.addListener(new C31732d(cVar));
                mo92064e0(view2, h.mo87868c(), (int) R, (int) S, width, list);
            } else {
                float f3 = cVar.getRevealInfo().f75136c;
                Animator a = C31215a.m125752a(cVar, R, S, width);
                int i = (int) R;
                int i2 = (int) S;
                View view5 = view2;
                mo92064e0(view5, h.mo87868c(), i, i2, f3, list);
                long c = h.mo87868c();
                long d = h.mo87869d();
                long i3 = eVar2.f77275a.mo87861i();
                mo92063d0(view5, c, d, i3, i, i2, width, list);
                animator = a;
            }
            h.mo87867a(animator);
            list.add(animator);
            list2.add(C31215a.m125754c(cVar));
        }
    }

    /* renamed from: c0 */
    public final void mo92062c0(View view, View view2, boolean z, boolean z2, @C0359n0 C31733e eVar, @C0359n0 List<Animator> list, @C0359n0 List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C31220c) && (view instanceof ImageView)) {
            C31220c cVar = (C31220c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C31097e.f74432b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C31097e.f74432b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C31730b(view2));
                eVar.f77275a.mo87859h("iconFade").mo87867a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new C31731c(cVar, drawable));
            }
        }
    }

    /* renamed from: d0 */
    public final void mo92063d0(View view, long j, long j2, long j3, int i, int i2, float f, @C0359n0 List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: e0 */
    public final void mo92064e0(View view, long j, int i, int i2, float f, @C0359n0 List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    @C0346i
    /* renamed from: f */
    public boolean mo51082f(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, @C0359n0 View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: f0 */
    public final void mo92065f0(@C0359n0 View view, @C0359n0 View view2, boolean z, boolean z2, @C0359n0 C31733e eVar, @C0359n0 List<Animator> list, List<Animator.AnimatorListener> list2, @C0359n0 RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C31733e eVar2 = eVar;
        List<Animator> list3 = list;
        float T = mo92053T(view3, view4, eVar2.f77276b);
        float U = mo92054U(view3, view4, eVar2.f77276b);
        Pair<C31101i, C31101i> Q = mo92050Q(T, U, z3, eVar2);
        C31101i iVar = (C31101i) Q.first;
        C31101i iVar2 = (C31101i) Q.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-T);
                view4.setTranslationY(-U);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            mo92048O(view2, eVar, iVar, iVar2, -T, -U, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-T});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-U});
        }
        iVar.mo87867a(objectAnimator2);
        iVar2.mo87867a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: g0 */
    public final int mo92066g0(@C0359n0 View view) {
        ColorStateList N = C18196h2.m82517N(view);
        if (N != null) {
            return N.getColorForState(view.getDrawableState(), N.getDefaultColor());
        }
        return 0;
    }

    @C0346i
    /* renamed from: h */
    public void mo51084h(@C0359n0 CoordinatorLayout.C16981g gVar) {
        if (gVar.f44902h == 0) {
            gVar.f44902h = 80;
        }
    }

    /* renamed from: h0 */
    public abstract C31733e mo92067h0(Context context, boolean z);

    @C0363p0
    /* renamed from: i0 */
    public final ViewGroup mo92068i0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
