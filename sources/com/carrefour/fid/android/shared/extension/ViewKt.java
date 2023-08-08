package com.carrefour.fid.android.shared.extension;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.C0349j;
import androidx.constraintlayout.motion.widget.C16881f;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.google.android.material.appbar.AppBarLayout;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.Arrays;
import java.util.List;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\ncom/carrefour/fid/android/shared/extension/ViewKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,379:1\n314#2,11:380\n*S KotlinDebug\n*F\n+ 1 View.kt\ncom/carrefour/fid/android/shared/extension/ViewKt\n*L\n245#1:380,11\n*E\n"})
public final class ViewKt {

    /* renamed from: a */
    public static final float f70389a = 1.0f;

    /* renamed from: b */
    public static final double f70390b = 1.2d;

    /* renamed from: c */
    public static final long f70391c = 300;

    /* renamed from: com.carrefour.fid.android.shared.extension.ViewKt$a */
    public static final class C28733a extends C18019a {

        /* renamed from: d */
        public final /* synthetic */ String f70392d;

        public C28733a(String str) {
            this.f70392d = str;
        }

        /* renamed from: g */
        public void mo19938g(@C12579k View view, @C12579k C18065l0 l0Var) {
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            Intrinsics.checkNotNullParameter(l0Var, C28531e0.f69094x);
            super.mo19938g(view, l0Var);
            l0Var.mo52607d1(this.f70392d);
            l0Var.mo52538G1(this.f70392d);
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.extension.ViewKt$b */
    public static final class C28734b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C12072o<C11079d2> f70393a;

        public C28734b(C12072o<? super C11079d2> oVar) {
            this.f70393a = oVar;
        }

        public final void run() {
            C12072o<C11079d2> oVar = this.f70393a;
            Result.C10852a aVar = Result.f28060a;
            oVar.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.extension.ViewKt$c */
    public static final class C28735c extends Animation {

        /* renamed from: a */
        public final /* synthetic */ View f70394a;

        /* renamed from: b */
        public final /* synthetic */ int f70395b;

        public C28735c(View view, int i) {
            this.f70394a = view;
            this.f70395b = i;
        }

        public void applyTransformation(float f, @C12580l Transformation transformation) {
            boolean z;
            ViewGroup.LayoutParams layoutParams = this.f70394a.getLayoutParams();
            int i = this.f70395b;
            layoutParams.height = i - ((int) (((float) i) * f));
            if (f == 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f70394a.setVisibility(8);
            }
            this.f70394a.requestLayout();
        }

        public boolean willChangeBounds() {
            return true;
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.extension.ViewKt$d */
    public static final class C28736d extends Animation {

        /* renamed from: a */
        public final /* synthetic */ View f70396a;

        /* renamed from: b */
        public final /* synthetic */ int f70397b;

        /* renamed from: c */
        public final /* synthetic */ int f70398c;

        public C28736d(View view, int i, int i2) {
            this.f70396a = view;
            this.f70397b = i;
            this.f70398c = i2;
        }

        public void applyTransformation(float f, @C12580l Transformation transformation) {
            boolean z;
            int i;
            ViewGroup.LayoutParams layoutParams = this.f70396a.getLayoutParams();
            if (f == 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = -2;
            } else {
                int i2 = this.f70397b;
                i = ((int) (((float) (this.f70398c - i2)) * f)) + i2;
            }
            layoutParams.height = i;
            this.f70396a.requestLayout();
        }

        public boolean willChangeBounds() {
            return true;
        }
    }

    @C0349j
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: A */
    public static final View.OnTouchListener m118976A(C12074o0 o0Var, C11300l<? super MotionEvent, Boolean> lVar, C11300l<? super MotionEvent, C11079d2> lVar2) {
        return new C28776q0(o0Var, lVar, lVar2);
    }

    /* renamed from: B */
    public static final void m118977B(C12074o0 o0Var, C11300l lVar, View view) {
        Intrinsics.checkNotNullParameter(o0Var, "$scope");
        Intrinsics.checkNotNullParameter(lVar, "$emitter");
        if (C12079p0.m48270k(o0Var)) {
            lVar.invoke(C11079d2.f28267a);
        }
    }

    /* renamed from: C */
    public static final boolean m118978C(C12074o0 o0Var, C11300l lVar, C11300l lVar2, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(o0Var, "$scope");
        Intrinsics.checkNotNullParameter(lVar, "$handled");
        Intrinsics.checkNotNullParameter(lVar2, "$emitter");
        if (!C12079p0.m48270k(o0Var)) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(motionEvent, "motionEvent");
        if (!((Boolean) lVar.invoke(motionEvent)).booleanValue()) {
            return false;
        }
        lVar2.invoke(motionEvent);
        return true;
    }

    /* renamed from: D */
    public static final void m118979D(View view) {
        ViewParent parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        view.measure(View.MeasureSpec.makeMeasureSpec(((View) parent).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (view.getMeasuredHeight() < 1) {
            view.getLayoutParams().height = 1;
        }
        view.setVisibility(0);
    }

    /* renamed from: E */
    public static final void m118980E(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.invalidate();
        view.requestLayout();
    }

    /* renamed from: F */
    public static final void m118981F(@C12579k View view, boolean z, long j) {
        List list;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Float valueOf = Float.valueOf(180.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        if (z) {
            list = CollectionsKt__CollectionsKt.m40448L(valueOf, valueOf2);
        } else {
            list = CollectionsKt__CollectionsKt.m40448L(valueOf2, valueOf);
        }
        float[] N5 = CollectionsKt___CollectionsKt.m40542N5(list);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C16881f.f43375i, Arrays.copyOf(N5, N5.length));
        ofFloat.setDuration(j);
        ofFloat.start();
    }

    /* renamed from: G */
    public static /* synthetic */ void m118982G(View view, boolean z, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 300;
        }
        m118981F(view, z, j);
    }

    /* renamed from: H */
    public static final void m118983H(@C12579k View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, i2, i3, i4);
            view.requestLayout();
        }
    }

    /* renamed from: I */
    public static final void m118984I(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.requestFocus();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        InputMethodManager e = C28775q.m119097e(context);
        if (e != null) {
            e.showSoftInput(view, 0);
        }
    }

    @C0349j
    @C12579k
    /* renamed from: J */
    public static final C11907e<MotionEvent> m118985J(@C12579k View view, @C12579k C11300l<? super MotionEvent, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "handled");
        return C11909g.m47500w(new ViewKt$touches$1(view, lVar, (C11045c<? super ViewKt$touches$1>) null));
    }

    /* renamed from: K */
    public static /* synthetic */ C11907e m118986K(View view, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = C28757h.f70418a;
        }
        return m118985J(view, lVar);
    }

    /* renamed from: L */
    public static final void m118987L(@C12579k View view, @C12579k LifecycleCoroutineScope lifecycleCoroutineScope, int i, long j) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        C11723c2 unused = C12038j.m48061f(lifecycleCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ViewKt$verticalSlideView$1(view, i, j, (C11045c<? super ViewKt$verticalSlideView$1>) null), 3, (Object) null);
        view.getLayoutParams().height = view.getLayoutParams().height;
        m118980E(view);
    }

    /* renamed from: g */
    public static final void m118994g(@C12579k View view, @C12579k String str) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(str, "description");
        C18196h2.m82474B1(view, new C28733a(str));
    }

    @C12580l
    /* renamed from: h */
    public static final Object m118995h(@C12579k View view, @C12579k C11045c<? super C11079d2> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        C28734b bVar = new C28734b(pVar);
        pVar.mo24529C(new ViewKt$awaitAnimationFrame$2$1(view, bVar));
        view.postOnAnimation(bVar);
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (y == C11063b.m42612h()) {
            return y;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r3 = (android.view.ViewGroup) r3;
     */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m118996i(@org.jetbrains.annotations.C12579k android.view.View r3, boolean r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r3.setEnabled(r4)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0023
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            if (r0 < 0) goto L_0x0023
            r1 = 0
        L_0x0015:
            android.view.View r2 = r3.getChildAt(r1)
            if (r2 == 0) goto L_0x001e
            m118996i(r2, r4)
        L_0x001e:
            if (r1 == r0) goto L_0x0023
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.extension.ViewKt.m118996i(android.view.View, boolean):void");
    }

    @C12579k
    /* renamed from: j */
    public static final C11907e<C11079d2> m118997j(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C11909g.m47500w(new ViewKt$clicks$1(view, (C11045c<? super ViewKt$clicks$1>) null));
    }

    /* renamed from: k */
    public static final void m118998k(@C12579k View view, boolean z, double d, @C12580l C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!z || view.getVisibility() != 0) {
            view.setVisibility(8);
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        int measuredHeight = view.getMeasuredHeight();
        C28735c w = m119010w(view, measuredHeight);
        AnimationKt.m118730d(w, (long) (((double) (((float) measuredHeight) / view.getContext().getResources().getDisplayMetrics().density)) * d));
        AnimationKt.m118728b(w, aVar);
        view.startAnimation(w);
    }

    /* renamed from: l */
    public static /* synthetic */ void m118999l(View view, boolean z, double d, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            d = 1.2d;
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        m118998k(view, z, d, aVar);
    }

    /* renamed from: m */
    public static final void m119000m(@C12579k AppBarLayout appBarLayout, @C12579k LifecycleCoroutineScope lifecycleCoroutineScope, int i, long j, @C12580l C11289a<C11079d2> aVar) {
        AppBarLayout appBarLayout2 = appBarLayout;
        Intrinsics.checkNotNullParameter(appBarLayout, "<this>");
        LifecycleCoroutineScope lifecycleCoroutineScope2 = lifecycleCoroutineScope;
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        C11723c2 unused = C12038j.m48061f(lifecycleCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ViewKt$collapseView$1(appBarLayout, i, j, aVar, (C11045c<? super ViewKt$collapseView$1>) null), 3, (Object) null);
        appBarLayout.getLayoutParams().height = appBarLayout.getLayoutParams().height;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m119001n(AppBarLayout appBarLayout, LifecycleCoroutineScope lifecycleCoroutineScope, int i, long j, C11289a aVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            aVar = null;
        }
        m119000m(appBarLayout, lifecycleCoroutineScope, i, j, aVar);
    }

    /* renamed from: o */
    public static final int m119002o(float f) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getSystem().displayMetrics");
        return C11409d.m43851L0(f * (((float) displayMetrics.densityDpi) / 160.0f));
    }

    @C11395k(message = "This function is wrong. Use convertDpToPixel(dp: Float) instead")
    /* renamed from: p */
    public static final int m119003p(@C12579k Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return i * (context.getResources().getDisplayMetrics().densityDpi / 160);
    }

    /* renamed from: q */
    public static final int m119004q(int i) {
        return C11409d.m43851L0(((float) i) / (((float) Resources.getSystem().getDisplayMetrics().densityDpi) / 160.0f));
    }

    /* renamed from: r */
    public static final void m119005r(@C12579k View view, boolean z, double d, @C12580l C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!z || view.getVisibility() == 0) {
            view.setVisibility(0);
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        m118979D(view);
        int measuredHeight = view.getMeasuredHeight();
        int max = Integer.max(0, view.getLayoutParams().height);
        C28736d x = m119011x(view, max, measuredHeight);
        AnimationKt.m118730d(x, (long) (((double) (((float) (measuredHeight - max)) / view.getContext().getResources().getDisplayMetrics().density)) * d));
        AnimationKt.m118728b(x, aVar);
        view.startAnimation(x);
    }

    /* renamed from: s */
    public static /* synthetic */ void m119006s(View view, boolean z, double d, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            d = 1.2d;
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        m119005r(view, z, d, aVar);
    }

    @C0349j
    @C12579k
    /* renamed from: t */
    public static final C28744a0<Boolean> m119007t(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return InitialValueFlowKt.m118854a(C11909g.m47500w(new ViewKt$focusChanges$1(view, (C11045c<? super ViewKt$focusChanges$1>) null)), Boolean.valueOf(view.hasFocus()));
    }

    @C0349j
    /* renamed from: u */
    public static final View.OnFocusChangeListener m119008u(C12074o0 o0Var, C11300l<? super Boolean, C11079d2> lVar) {
        return new C28772o0(o0Var, lVar);
    }

    /* renamed from: v */
    public static final void m119009v(C12074o0 o0Var, C11300l lVar, View view, boolean z) {
        Intrinsics.checkNotNullParameter(o0Var, "$scope");
        Intrinsics.checkNotNullParameter(lVar, "$emitter");
        if (C12079p0.m48270k(o0Var)) {
            lVar.invoke(Boolean.valueOf(z));
        }
    }

    /* renamed from: w */
    public static final C28735c m119010w(View view, int i) {
        return new C28735c(view, i);
    }

    /* renamed from: x */
    public static final C28736d m119011x(View view, int i, int i2) {
        return new C28736d(view, i, i2);
    }

    /* renamed from: y */
    public static final void m119012y(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.clearFocus();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        InputMethodManager e = C28775q.m119097e(context);
        if (e != null) {
            e.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: z */
    public static final View.OnClickListener m119013z(C12074o0 o0Var, C11300l<? super C11079d2, C11079d2> lVar) {
        return new C28774p0(o0Var, lVar);
    }
}
