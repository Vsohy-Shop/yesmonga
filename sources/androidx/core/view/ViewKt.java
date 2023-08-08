package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0372t0;
import androidx.annotation.C0376v0;
import androidx.exifinterface.media.C19135a;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import kotlin.sequences.C11563q;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.C12579k;

public final class ViewKt {

    /* renamed from: androidx.core.view.ViewKt$a */
    public static final class C18013a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f46525a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<View, C11079d2> f46526b;

        public C18013a(View view, C11300l<? super View, C11079d2> lVar) {
            this.f46525a = view;
            this.f46526b = lVar;
        }

        public void onViewAttachedToWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            this.f46525a.removeOnAttachStateChangeListener(this);
            this.f46526b.invoke(view);
        }

        public void onViewDetachedFromWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        }
    }

    /* renamed from: androidx.core.view.ViewKt$b */
    public static final class C18014b implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f46527a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<View, C11079d2> f46528b;

        public C18014b(View view, C11300l<? super View, C11079d2> lVar) {
            this.f46527a = view;
            this.f46528b = lVar;
        }

        public void onViewAttachedToWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        }

        public void onViewDetachedFromWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            this.f46527a.removeOnAttachStateChangeListener(this);
            this.f46528b.invoke(view);
        }
    }

    /* renamed from: androidx.core.view.ViewKt$c */
    public static final class C18015c implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l f46529a;

        public C18015c(C11300l lVar) {
            this.f46529a = lVar;
        }

        public void onLayoutChange(@C12579k View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            view.removeOnLayoutChangeListener(this);
            this.f46529a.invoke(view);
        }
    }

    /* renamed from: androidx.core.view.ViewKt$d */
    public static final class C18016d implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C11300l<View, C11079d2> f46530a;

        public C18016d(C11300l<? super View, C11079d2> lVar) {
            this.f46530a = lVar;
        }

        public void onLayoutChange(@C12579k View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
            view.removeOnLayoutChangeListener(this);
            this.f46530a.invoke(view);
        }
    }

    /* renamed from: androidx.core.view.ViewKt$e */
    public static final class C18017e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C11300l<View, C11079d2> f46531a;

        /* renamed from: b */
        public final /* synthetic */ View f46532b;

        public C18017e(C11300l<? super View, C11079d2> lVar, View view) {
            this.f46531a = lVar;
            this.f46532b = view;
        }

        public final void run() {
            this.f46531a.invoke(this.f46532b);
        }
    }

    /* renamed from: androidx.core.view.ViewKt$f */
    public static final class C18018f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C11289a<C11079d2> f46533a;

        public C18018f(C11289a<C11079d2> aVar) {
            this.f46533a = aVar;
        }

        public final void run() {
            this.f46533a.invoke();
        }
    }

    /* renamed from: A */
    public static final void m81824A(@C12579k View view, @C12579k C11300l<? super ViewGroup.LayoutParams, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            lVar.invoke(layoutParams);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @C11314h(name = "updateLayoutParamsTyped")
    /* renamed from: B */
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void m81825B(View view, C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.reifiedOperationMarker(1, C19135a.f48928d5);
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: C */
    public static final void m81826C(@C12579k View view, @C0372t0 int i, @C0372t0 int i2, @C0372t0 int i3, @C0372t0 int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    /* renamed from: D */
    public static /* synthetic */ void m81827D(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(17)
    /* renamed from: E */
    public static final void m81828E(@C12579k View view, @C0372t0 int i, @C0372t0 int i2, @C0372t0 int i3, @C0372t0 int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: F */
    public static /* synthetic */ void m81829F(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: b */
    public static final void m81831b(@C12579k View view, @C12579k C11300l<? super View, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        if (C18196h2.m82521O0(view)) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new C18013a(view, lVar));
        }
    }

    /* renamed from: c */
    public static final void m81832c(@C12579k View view, @C12579k C11300l<? super View, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        if (!C18196h2.m82521O0(view)) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new C18014b(view, lVar));
        }
    }

    /* renamed from: d */
    public static final void m81833d(@C12579k View view, @C12579k C11300l<? super View, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        if (!C18196h2.m82539U0(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new C18015c(lVar));
        } else {
            lVar.invoke(view);
        }
    }

    /* renamed from: e */
    public static final void m81834e(@C12579k View view, @C12579k C11300l<? super View, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        view.addOnLayoutChangeListener(new C18016d(lVar));
    }

    @C12579k
    /* renamed from: f */
    public static final C18024a2 m81835f(@C12579k View view, @C12579k C11300l<? super View, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        C18024a2 a = C18024a2.m81875a(view, new C18017e(lVar, view));
        Intrinsics.checkNotNullExpressionValue(a, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return a;
    }

    @C12579k
    /* renamed from: g */
    public static final Bitmap m81836g(@C12579k View view, @C12579k Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (C18196h2.m82539U0(view)) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-((float) view.getScrollX()), -((float) view.getScrollY()));
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    /* renamed from: h */
    public static /* synthetic */ Bitmap m81837h(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return m81836g(view, config);
    }

    @C12579k
    /* renamed from: i */
    public static final C11559m<View> m81838i(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C11563q.m44902b(new ViewKt$allViews$1(view, (C11045c<? super ViewKt$allViews$1>) null));
    }

    @C12579k
    /* renamed from: j */
    public static final C11559m<ViewParent> m81839j(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return SequencesKt__SequencesKt.m44595l(view.getParent(), ViewKt$ancestors$1.f46534a);
    }

    /* renamed from: k */
    public static final int m81840k(@C12579k View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    /* renamed from: l */
    public static final int m81841l(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return C18353r0.m83081b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    /* renamed from: m */
    public static final int m81842m(@C12579k View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    /* renamed from: n */
    public static final int m81843n(@C12579k View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    /* renamed from: o */
    public static final int m81844o(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return C18353r0.m83082c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    /* renamed from: p */
    public static final int m81845p(@C12579k View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    /* renamed from: q */
    public static final boolean m81846q(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static final boolean m81847r(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static final boolean m81848s(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: t */
    public static final Runnable m81849t(@C12579k View view, long j, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "action");
        C18018f fVar = new C18018f(aVar);
        view.postDelayed(fVar, j);
        return fVar;
    }

    @C0376v0(16)
    @C12579k
    /* renamed from: u */
    public static final Runnable m81850u(@C12579k View view, long j, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "action");
        C18375t3 t3Var = new C18375t3(aVar);
        C18130c.m82297a(view, t3Var, j);
        return t3Var;
    }

    /* renamed from: v */
    public static final void m81851v(C11289a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$action");
        aVar.invoke();
    }

    /* renamed from: w */
    public static final void m81852w(@C12579k View view, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: x */
    public static final void m81853x(@C12579k View view, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: y */
    public static final void m81854y(@C12579k View view, @C0372t0 int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i, i, i, i);
    }

    /* renamed from: z */
    public static final void m81855z(@C12579k View view, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }
}
