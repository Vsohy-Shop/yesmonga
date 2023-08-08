package com.usabilla.sdk.ubform.screenshot.annotation.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.C18196h2;
import androidx.vectordrawable.graphics.drawable.C20729i;
import com.google.firebase.crashlytics.C32648f;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.utils.ext.C10129c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.collections.C10953k0;
import kotlin.collections.C10978t;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u00106\u001a\u000205\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u00109\u001a\u00020\u0002¢\u0006\u0004\b:\u0010;J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0014J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J0\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u0012\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u0010#\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000bH\u0002R.\u0010+\u001a\u0004\u0018\u00010\u001d2\b\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010/R\u001b\u00103\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&¨\u0006<"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/screenshot/annotation/view/UbAnnotationCanvasView;", "Landroid/view/ViewGroup;", "", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/d2;", "onMeasure", "Lcom/usabilla/sdk/ubform/screenshot/annotation/view/UbAnnotationCanvasView$a;", "e", "Landroid/view/ViewGroup$LayoutParams;", "p", "", "checkLayoutParams", "f", "changed", "l", "t", "r", "b", "onLayout", "Landroid/view/View;", "child", "addView", "g", "", "tag", "c", "Landroid/graphics/drawable/Drawable;", "d", "Landroid/graphics/Rect;", "bounds", "h", "Lcom/usabilla/sdk/ubform/screenshot/annotation/view/UbDraftView;", "view", "isMoving", "i", "value", "a", "Landroid/graphics/Rect;", "getScreenshotBounds", "()Landroid/graphics/Rect;", "setScreenshotBounds", "(Landroid/graphics/Rect;)V", "screenshotBounds", "Landroid/widget/ImageView;", "Lkotlin/z;", "getTrashView", "()Landroid/widget/ImageView;", "trashView", "getTrashIconSize", "()I", "trashIconSize", "trashBounds", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class UbAnnotationCanvasView extends ViewGroup {
    @C12580l

    /* renamed from: a */
    public Rect f27194a;
    @C12579k

    /* renamed from: b */
    public final C11677z f27195b;
    @C12579k

    /* renamed from: c */
    public final C11677z f27196c;
    @C12580l

    /* renamed from: d */
    public Rect f27197d;

    /* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.view.UbAnnotationCanvasView$a */
    public static final class C9904a extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public final int f27198a;

        /* renamed from: b */
        public final int f27199b;

        public C9904a() {
            this(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final int mo20519a() {
            return this.f27198a;
        }

        /* renamed from: b */
        public final int mo20520b() {
            return this.f27199b;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C9904a(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? -2 : i, (i5 & 2) != 0 ? -2 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
        }

        public C9904a(int i, int i2, int i3, int i4) {
            super(i, i2);
            this.f27198a = i3;
            this.f27199b = i4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C9904a(@C12579k ViewGroup.LayoutParams layoutParams) {
            this(layoutParams.width, layoutParams.height, 0, 0);
            Intrinsics.checkNotNullParameter(layoutParams, C32648f.f79206e);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbAnnotationCanvasView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final int getTrashIconSize() {
        return ((Number) this.f27196c.getValue()).intValue();
    }

    private final ImageView getTrashView() {
        return (ImageView) this.f27195b.getValue();
    }

    public void addView(@C12580l View view) {
        UbDraftView ubDraftView;
        super.addView(view);
        if (view instanceof UbDraftView) {
            ubDraftView = (UbDraftView) view;
        } else {
            ubDraftView = null;
        }
        if (ubDraftView != null) {
            ubDraftView.setOnDraftMovingCallback(new UbAnnotationCanvasView$addView$1$1(this));
        }
    }

    /* renamed from: c */
    public final int mo20505c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        C11466l W1 = C11479u.m44378W1(0, getChildCount());
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
        Iterator it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((C10953k0) it).mo6374c()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (Intrinsics.areEqual(((View) next).getTag(), (Object) str)) {
                arrayList2.add(next);
            }
        }
        return arrayList2.size();
    }

    public boolean checkLayoutParams(@C12579k ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "p");
        return layoutParams instanceof C9904a;
    }

    /* renamed from: d */
    public final Drawable mo20507d() {
        C20729i e = C20729i.m96219e(getResources(), C9747c.C9755h.ub_ic_trash_open, getContext().getTheme());
        C20729i e2 = C20729i.m96219e(getResources(), C9747c.C9755h.ub_ic_trash_close, getContext().getTheme());
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16843518}, e);
        stateListDrawable.addState(new int[]{-16843518}, e2);
        return stateListDrawable;
    }

    @C12579k
    /* renamed from: e */
    public C9904a generateDefaultLayoutParams() {
        return new C9904a(-2, -2, 0, 0);
    }

    @C12579k
    /* renamed from: f */
    public C9904a generateLayoutParams(@C12579k ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "p");
        return new C9904a(layoutParams);
    }

    /* renamed from: g */
    public final void mo20510g() {
        C11466l W1 = C11479u.m44378W1(0, getChildCount());
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(W1, 10));
        Iterator it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((C10953k0) it).mo6374c()));
        }
        ArrayList<UbDraftView> arrayList2 = new ArrayList<>();
        for (Object next : arrayList) {
            if (next instanceof UbDraftView) {
                arrayList2.add(next);
            }
        }
        for (UbDraftView removeView : arrayList2) {
            removeView(removeView);
        }
    }

    @C12580l
    public final Rect getScreenshotBounds() {
        return this.f27194a;
    }

    /* renamed from: h */
    public final void mo20514h(Rect rect) {
        if (rect != null) {
            if (getTrashView().getParent() == null) {
                addView(getTrashView());
            }
            int trashIconSize = rect.right - getTrashIconSize();
            int trashIconSize2 = rect.bottom - getTrashIconSize();
            this.f27197d = new Rect(trashIconSize, trashIconSize2, rect.right, rect.bottom);
            getTrashView().setLayoutParams(new C9904a(0, 0, trashIconSize, trashIconSize2, 3, (DefaultConstructorMarker) null));
            return;
        }
        removeView(getTrashView());
    }

    /* renamed from: i */
    public final void mo20515i(UbDraftView ubDraftView, boolean z) {
        if (z) {
            boolean z2 = false;
            if (getTrashView().getVisibility() == 8) {
                getTrashView().setVisibility(0);
                getTrashView().startAnimation(C10129c.m38329a(0.0f, 1.0f));
            }
            Rect rect = this.f27197d;
            if (rect != null) {
                z2 = rect.intersect(ubDraftView.getRelativeBounds());
            }
            getTrashView().setActivated(z2);
            return;
        }
        if (getTrashView().isActivated()) {
            removeView(ubDraftView);
        }
        getTrashView().setVisibility(8);
        getTrashView().startAnimation(C10129c.m38329a(1.0f, 0.0f));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        C9904a aVar = (C9904a) layoutParams;
                        int paddingLeft = getPaddingLeft() + aVar.mo20519a();
                        int paddingTop = getPaddingTop() + aVar.mo20520b();
                        childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.usabilla.sdk.ubform.screenshot.annotation.view.UbAnnotationCanvasView.LayoutParams");
                    }
                }
                if (i6 < childCount) {
                    i5 = i6;
                } else {
                    return;
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int childCount = getChildCount();
        measureChildren(i, i2);
        if (childCount > 0) {
            int i5 = 0;
            i4 = 0;
            i3 = 0;
            while (true) {
                int i6 = i5 + 1;
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        C9904a aVar = (C9904a) layoutParams;
                        i4 = Math.max(i4, aVar.mo20519a() + childAt.getMeasuredWidth());
                        i3 = Math.max(i3, aVar.mo20520b() + childAt.getMeasuredHeight());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.usabilla.sdk.ubform.screenshot.annotation.view.UbAnnotationCanvasView.LayoutParams");
                    }
                }
                if (i6 >= childCount) {
                    break;
                }
                i5 = i6;
            }
        } else {
            i4 = 0;
            i3 = 0;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i4 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(i3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, 0));
    }

    public final void setScreenshotBounds(@C12580l Rect rect) {
        this.f27194a = rect;
        C18196h2.m82516M1(this, rect);
        mo20514h(rect);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbAnnotationCanvasView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UbAnnotationCanvasView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbAnnotationCanvasView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f27195b = C10864b0.m38748c(new UbAnnotationCanvasView$trashView$2(context, this));
        this.f27196c = C10864b0.m38748c(new UbAnnotationCanvasView$trashIconSize$2(this));
    }
}
