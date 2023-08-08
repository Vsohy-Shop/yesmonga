package com.urbanairship.android.layout.view;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import com.urbanairship.android.layout.widget.ConstrainedFrameLayout;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0012\u0010!\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001fj\u0002` \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u001b\u0010\u0011\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006("}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/ModalView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "isOpaque", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "Landroid/view/View$OnClickListener;", "listener", "Lkotlin/d2;", "setOnClickOutsideListener", "w", "", "a", "Lkotlin/z;", "getWindowTouchSlop", "()I", "windowTouchSlop", "Lcom/urbanairship/android/layout/widget/ConstrainedFrameLayout;", "b", "Lcom/urbanairship/android/layout/widget/ConstrainedFrameLayout;", "modalFrame", "Landroid/view/View;", "c", "Landroid/view/View;", "containerView", "d", "Landroid/view/View$OnClickListener;", "clickOutsideListener", "Landroid/content/Context;", "context", "Lcom/urbanairship/android/layout/model/BaseModel;", "Lcom/urbanairship/android/layout/model/AnyModel;", "model", "Lcom/urbanairship/android/layout/d;", "presentation", "Lcom/urbanairship/android/layout/environment/p;", "viewEnvironment", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/BaseModel;Lcom/urbanairship/android/layout/d;Lcom/urbanairship/android/layout/environment/p;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class ModalView extends ConstraintLayout {
    @C12579k

    /* renamed from: a */
    public final C11677z f88884a;
    @C12580l

    /* renamed from: b */
    public ConstrainedFrameLayout f88885b;
    @C12580l

    /* renamed from: c */
    public View f88886c;
    @C12580l

    /* renamed from: d */
    public View.OnClickListener f88887d;

    /* JADX WARNING: type inference failed for: r10v0, types: [com.urbanairship.android.layout.model.BaseModel, com.urbanairship.android.layout.model.BaseModel<?, ?>, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ModalView(@org.jetbrains.annotations.C12579k android.content.Context r9, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.BaseModel<?, ?> r10, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.C35576d r11, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35614p r12) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "presentation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "viewEnvironment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r8.<init>(r9)
            com.urbanairship.android.layout.view.ModalView$windowTouchSlop$2 r0 = new com.urbanairship.android.layout.view.ModalView$windowTouchSlop$2
            r0.<init>(r9)
            kotlin.z r0 = kotlin.C10864b0.m38748c(r0)
            r8.f88884a = r0
            com.urbanairship.android.layout.property.l r11 = r11.mo106583f(r9)
            java.lang.String r0 = "presentation.getResolvedPlacement(context)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            com.urbanairship.android.layout.property.ConstrainedSize r0 = r11.mo107353h()
            java.lang.String r1 = "placement.size"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.urbanairship.android.layout.property.n r1 = r11.mo107351f()
            com.urbanairship.android.layout.property.k r2 = r11.mo107349d()
            com.urbanairship.android.layout.property.f r11 = r11.mo107352g()
            if (r11 == 0) goto L_0x004b
            int r11 = r11.mo107342d(r9)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x004c
        L_0x004b:
            r11 = 0
        L_0x004c:
            com.urbanairship.android.layout.widget.ConstrainedFrameLayout r3 = new com.urbanairship.android.layout.widget.ConstrainedFrameLayout
            r3.<init>(r9, r0)
            int r4 = android.view.View.generateViewId()
            r3.setId(r4)
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = new androidx.constraintlayout.widget.ConstraintLayout$b
            r5 = 0
            r4.<init>((int) r5, (int) r5)
            r3.setLayoutParams(r4)
            r4 = 16
            float r4 = com.urbanairship.android.layout.util.C35921m.m148111a(r9, r4)
            r3.setElevation(r4)
            r8.f88885b = r3
            android.view.View r10 = r10.mo106993h(r9, r12)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = -1
            r4.<init>(r5, r5)
            if (r1 == 0) goto L_0x007d
            int r1 = r1.mo107357b()
            goto L_0x007f
        L_0x007d:
            r1 = 17
        L_0x007f:
            r4.gravity = r1
            if (r2 == 0) goto L_0x0096
            int r1 = r2.mo107347d()
            int r5 = r2.mo107348e()
            int r6 = r2.mo107346c()
            int r7 = r2.mo107345b()
            r4.setMargins(r1, r5, r6, r7)
        L_0x0096:
            r10.setLayoutParams(r4)
            r8.f88886c = r10
            r3.addView(r10)
            r8.addView(r3)
            int r1 = r3.getId()
            com.urbanairship.android.layout.util.c r9 = com.urbanairship.android.layout.util.C35908c.m148057j(r9)
            com.urbanairship.android.layout.util.c r9 = r9.mo107556d(r1)
            com.urbanairship.android.layout.util.c r9 = r9.mo107564m(r0, r1)
            com.urbanairship.android.layout.util.c r9 = r9.mo107559g(r2, r1)
            androidx.constraintlayout.widget.c r9 = r9.mo107555c()
            java.lang.String r0 = "newBuilder(context)\n    …wId)\n            .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            r9.mo50900r(r8)
            if (r11 == 0) goto L_0x00ca
            int r9 = r11.intValue()
            r8.setBackgroundColor(r9)
        L_0x00ca:
            boolean r9 = r12.mo106644f()
            if (r9 == 0) goto L_0x00d8
            com.urbanairship.android.layout.view.f r9 = new com.urbanairship.android.layout.view.f
            r9.<init>(r10)
            androidx.core.view.C18196h2.m82559a2(r3, r9)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.view.ModalView.<init>(android.content.Context, com.urbanairship.android.layout.model.BaseModel, com.urbanairship.android.layout.d, com.urbanairship.android.layout.environment.p):void");
    }

    private final int getWindowTouchSlop() {
        return ((Number) this.f88884a.getValue()).intValue();
    }

    /* renamed from: v */
    public static final C18436z4 m148177v(View view, View view2, C18436z4 z4Var) {
        Intrinsics.checkNotNullParameter(view, "$container");
        Intrinsics.checkNotNullParameter(view2, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(z4Var, "insets");
        return C18196h2.m82616p(view, z4Var);
    }

    public boolean isOpaque() {
        return false;
    }

    public boolean onTouchEvent(@C12579k MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            return true;
        }
        if (action != 1 || !mo107620w(motionEvent) || (onClickListener = this.f88887d) == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
        return true;
    }

    public final void setOnClickOutsideListener(@C12580l View.OnClickListener onClickListener) {
        this.f88887d = onClickListener;
    }

    /* renamed from: w */
    public final boolean mo107620w(MotionEvent motionEvent) {
        Rect rect = new Rect();
        ConstrainedFrameLayout constrainedFrameLayout = this.f88885b;
        if (constrainedFrameLayout != null) {
            constrainedFrameLayout.getHitRect(rect);
        }
        rect.inset(-getWindowTouchSlop(), -getWindowTouchSlop());
        return !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }
}
