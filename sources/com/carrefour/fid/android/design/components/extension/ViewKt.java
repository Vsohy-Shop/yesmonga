package com.carrefour.fid.android.design.components.extension;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.C0319a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.usabilla.sdk.ubform.net.C9851c;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ViewKt {

    /* renamed from: com.carrefour.fid.android.design.components.extension.ViewKt$a */
    public static final class C37101a extends C18019a {

        /* renamed from: d */
        public final /* synthetic */ String f92886d;

        /* renamed from: e */
        public final /* synthetic */ boolean f92887e;

        public C37101a(String str, boolean z) {
            this.f92886d = str;
            this.f92887e = z;
        }

        /* renamed from: g */
        public void mo19938g(@C12579k View view, @C12579k C18065l0 l0Var) {
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            Intrinsics.checkNotNullParameter(l0Var, C28531e0.f69094x);
            super.mo19938g(view, l0Var);
            l0Var.mo52607d1(this.f92886d);
            if (this.f92887e) {
                l0Var.mo52556N0(C18065l0.C18066a.f46673j);
                l0Var.mo52596a1(false);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.extension.ViewKt$b */
    public static final class C37102b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f92888a;

        /* renamed from: b */
        public final /* synthetic */ View f92889b;

        public C37102b(C11289a<C11079d2> aVar, View view) {
            this.f92888a = aVar;
            this.f92889b = view;
        }

        public void onAnimationEnd(@C12580l Animation animation) {
            C11289a<C11079d2> aVar = this.f92888a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(@C12580l Animation animation) {
        }

        public void onAnimationStart(@C12580l Animation animation) {
            View view = this.f92889b;
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.extension.ViewKt$c */
    public static final class C37103c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ View f92890a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Integer, C11079d2> f92891b;

        public C37103c(View view, C11300l<? super Integer, C11079d2> lVar) {
            this.f92890a = view;
            this.f92891b = lVar;
        }

        public void onGlobalLayout() {
            this.f92890a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f92891b.invoke(Integer.valueOf(this.f92890a.getHeight()));
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.extension.ViewKt$d */
    public static final class C37104d extends C18019a {

        /* renamed from: d */
        public final /* synthetic */ String f92892d;

        /* renamed from: e */
        public final /* synthetic */ String f92893e;

        public C37104d(String str, String str2) {
            this.f92892d = str;
            this.f92893e = str2;
        }

        /* renamed from: g */
        public void mo19938g(@C12579k View view, @C12579k C18065l0 l0Var) {
            boolean z;
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            Intrinsics.checkNotNullParameter(l0Var, C28531e0.f69094x);
            super.mo19938g(view, l0Var);
            boolean z2 = true;
            if (this.f92892d.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                l0Var.mo52607d1(this.f92892d);
            }
            if (this.f92893e.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                l0Var.mo52598b(new C18065l0.C18066a(16, this.f92893e));
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.extension.ViewKt$e */
    public static final class C37105e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ View f92894a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Integer, C11079d2> f92895b;

        public C37105e(View view, C11300l<? super Integer, C11079d2> lVar) {
            this.f92894a = view;
            this.f92895b = lVar;
        }

        public void onGlobalLayout() {
            this.f92894a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f92895b.invoke(Integer.valueOf(this.f92894a.getWidth()));
        }
    }

    /* renamed from: b */
    public static final void m152120b(@C12579k View view, @C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(str, "description");
        C18196h2.m82474B1(view, new C37101a(str, z));
    }

    /* renamed from: c */
    public static /* synthetic */ void m152121c(View view, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        m152120b(view, str, z);
    }

    /* renamed from: d */
    public static final void m152122d(@C12579k View view, @C12580l @C0319a Integer num, boolean z, @C12580l C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.clearAnimation();
        if (view.getVisibility() != 0 || z) {
            if (view.getVisibility() == 8) {
                view.setVisibility(4);
            }
            view.post(new C37119j(view, num, aVar));
        } else if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m152123e(View view, Integer num, boolean z, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        m152122d(view, num, z, aVar);
    }

    /* renamed from: f */
    public static final void m152124f(View view, Integer num, C11289a aVar) {
        int i;
        Intrinsics.checkNotNullParameter(view, "$this_fadeIn");
        Context context = view.getContext();
        if (num != null) {
            i = num.intValue();
        } else {
            i = C36896b.C36897a.ds_fade_in_short;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
        loadAnimation.setAnimationListener(new C37102b(aVar, view));
        view.startAnimation(loadAnimation);
    }

    /* renamed from: g */
    public static final void m152125g(@C12579k View view, @C12580l @C0319a Integer num, int i, boolean z, @C12580l C11289a<C11079d2> aVar) {
        int i2;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.clearAnimation();
        if (z) {
            view.setVisibility(i);
        } else if (i == 8 && view.getVisibility() == 4) {
            view.setVisibility(8);
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        } else if (view.getVisibility() == i) {
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        Context context = view.getContext();
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = C36896b.C36897a.ds_fade_out_short;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i2);
        Intrinsics.checkNotNullExpressionValue(loadAnimation, "fadeOut$lambda$2");
        C37107b.m152139a(loadAnimation, new ViewKt$fadeOut$1$1(view, i, aVar));
        view.startAnimation(loadAnimation);
    }

    /* renamed from: h */
    public static /* synthetic */ void m152126h(View view, Integer num, int i, boolean z, C11289a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 2) != 0) {
            i = 8;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            aVar = null;
        }
        m152125g(view, num, i, z, aVar);
    }

    @C12580l
    /* renamed from: i */
    public static final ViewGroup m152127i(@C12580l View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (((FrameLayout) view).getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    public static final void m152128j(@C12579k View view, @C12579k C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "function");
        if (view.getHeight() == 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C37103c(view, lVar));
        } else {
            lVar.invoke(Integer.valueOf(view.getHeight()));
        }
    }

    /* renamed from: k */
    public static final void m152129k(@C12579k View view, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(str, "contentDescription");
        Intrinsics.checkNotNullParameter(str2, "doubleTapDescription");
        C18196h2.m82474B1(view, new C37104d(str, str2));
    }

    /* renamed from: l */
    public static /* synthetic */ void m152130l(View view, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        m152129k(view, str, str2);
    }

    /* renamed from: m */
    public static final void m152131m(@C12579k View view, @C12579k Runnable runnable) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        view.animate().translationY((float) (view.getHeight() * 2)).setDuration(250).setInterpolator(new AccelerateInterpolator(2.0f)).withEndAction(runnable).start();
    }

    /* renamed from: n */
    public static final void m152132n(@C12579k View view, @C12579k Runnable runnable) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        view.animate().translationY(0.0f).setDuration(250).setInterpolator(new DecelerateInterpolator(2.0f)).withEndAction(runnable).start();
    }

    /* renamed from: o */
    public static final void m152133o(@C12579k View view, @C12579k C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "function");
        if (view.getWidth() == 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C37105e(view, lVar));
        } else {
            lVar.invoke(Integer.valueOf(view.getWidth()));
        }
    }
}
