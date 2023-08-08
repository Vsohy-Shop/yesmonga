package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.C0376v0;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import androidx.fragment.C19144a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.actions.C35491d;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.net.C9851c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;B%\b\u0017\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010>\u001a\u00020\u001b¢\u0006\u0004\b:\u0010?B!\b\u0010\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\b:\u0010BJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0014H\u0001J\"\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bH\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bH\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\u0019\u0010*\u001a\u00028\u0000\"\n\b\u0000\u0010)*\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0010H\u0002R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006C"}, mo22516d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lkotlin/d2;", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "Landroid/view/View;", "child", "", "drawingTime", "", "drawChild", "view", "startViewTransition", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "removeViewAt", "removeViewInLayout", "removeView", "start", "count", "removeViews", "removeViewsInLayout", "removeAllViewsInLayout", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "v", "a", "", "Ljava/util/List;", "disappearingFragmentChildren", "b", "transitioningFragmentViews", "c", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "d", "Z", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "fragment_release"}, mo22517k = 1, mo22518mv = {1, 6, 0})
public final class FragmentContainerView extends FrameLayout {
    @C12579k

    /* renamed from: a */
    public final List<View> f49213a;
    @C12579k

    /* renamed from: b */
    public final List<View> f49214b;
    @C12580l

    /* renamed from: c */
    public View.OnApplyWindowInsetsListener f49215c;

    /* renamed from: d */
    public boolean f49216d;

    @C0376v0(20)
    /* renamed from: androidx.fragment.app.FragmentContainerView$a */
    public static final class C19165a {
        @C12579k

        /* renamed from: a */
        public static final C19165a f49217a = new C19165a();

        @C12579k
        /* renamed from: a */
        public final WindowInsets mo56781a(@C12579k View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @C12579k View view, @C12579k WindowInsets windowInsets) {
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            Intrinsics.checkNotNullParameter(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FragmentContainerView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final void mo56763a(View view) {
        if (this.f49214b.contains(view)) {
            this.f49213a.add(view);
        }
    }

    public void addView(@C12579k View view, int i, @C12580l ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "child");
        if (FragmentManager.m89693Q0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @C0376v0(20)
    @C12579k
    public WindowInsets dispatchApplyWindowInsets(@C12579k WindowInsets windowInsets) {
        C18436z4 z4Var;
        Intrinsics.checkNotNullParameter(windowInsets, "insets");
        C18436z4 K = C18436z4.m83374K(windowInsets);
        Intrinsics.checkNotNullExpressionValue(K, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f49215c;
        if (onApplyWindowInsetsListener != null) {
            C19165a aVar = C19165a.f49217a;
            Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            z4Var = C18436z4.m83374K(aVar.mo56781a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            z4Var = C18196h2.m82582g1(this, K);
        }
        Intrinsics.checkNotNullExpressionValue(z4Var, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!z4Var.mo53120A()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C18196h2.m82616p(getChildAt(i), z4Var);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f49216d) {
            for (View drawChild : this.f49213a) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(@C12579k Canvas canvas, @C12579k View view, long j) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "child");
        if (!this.f49216d || !(!this.f49213a.isEmpty()) || !this.f49213a.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f49214b.remove(view);
        if (this.f49213a.remove(view)) {
            this.f49216d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return FragmentManager.m89711u0(this).mo56900r0(getId());
    }

    @C0376v0(20)
    @C12579k
    public WindowInsets onApplyWindowInsets(@C12579k WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(childAt, C40383c.f102945c);
                mo56763a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeView(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        mo56763a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        Intrinsics.checkNotNullExpressionValue(childAt, C40383c.f102945c);
        mo56763a(childAt);
        super.removeViewAt(i);
    }

    public void removeViewInLayout(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        mo56763a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            Intrinsics.checkNotNullExpressionValue(childAt, C40383c.f102945c);
            mo56763a(childAt);
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            Intrinsics.checkNotNullExpressionValue(childAt, C40383c.f102945c);
            mo56763a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    @C11314h(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f49216d = z;
    }

    public void setLayoutTransition(@C12580l LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(@C12579k View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, C40852x.C40853a.f103958a);
        this.f49215c = onApplyWindowInsetsListener;
    }

    public void startViewTransition(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        if (view.getParent() == this) {
            this.f49214b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@C12579k Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f49213a = new ArrayList();
        this.f49214b = new ArrayList();
        this.f49216d = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public FragmentContainerView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f49213a = new ArrayList();
        this.f49214b = new ArrayList();
        this.f49216d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = C19144a.C19148d.FragmentContainerView;
            Intrinsics.checkNotNullExpressionValue(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(C19144a.C19148d.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = C35491d.f87525c;
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@C12579k Context context, @C12579k AttributeSet attributeSet, @C12579k FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        this.f49213a = new ArrayList();
        this.f49214b = new ArrayList();
        this.f49216d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = C19144a.C19148d.FragmentContainerView;
        Intrinsics.checkNotNullExpressionValue(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C19144a.C19148d.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(C19144a.C19148d.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment r0 = fragmentManager.mo56900r0(id);
        if (classAttribute != null && r0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = fragmentManager.mo56801G0().mo56932a(context.getClassLoader(), classAttribute);
            Intrinsics.checkNotNullExpressionValue(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.mo56909u().mo57213Q(true).mo57220j(this, a, string).mo57055t();
        }
        fragmentManager.mo56893o1(this);
    }
}
