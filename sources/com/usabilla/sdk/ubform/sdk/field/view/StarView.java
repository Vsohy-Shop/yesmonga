package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.C0507a;
import androidx.core.graphics.drawable.C17549d;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.customViews.AccessibilityStarComponent;
import com.usabilla.sdk.ubform.customViews.CheckableImageView;
import com.usabilla.sdk.ubform.sdk.field.contract.C9986j;
import com.usabilla.sdk.ubform.sdk.field.model.StarModel;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10025i;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010J\u001a\u00020\u0002¢\u0006\u0004\bK\u0010LJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002XD¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\n8\u0002XD¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8\u0002XD¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\n8\u0002XD¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010(\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010'R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00104\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u00103R\u001d\u00107\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b5\u0010!\u001a\u0004\b6\u00103R\u0016\u0010:\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002XD¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0002¢\u0006\f\n\u0004\b@\u0010!\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006M"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/StarView;", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldView;", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/i;", "Lcom/usabilla/sdk/ubform/sdk/field/contract/j$b;", "Landroid/graphics/drawable/Drawable;", "getCheckedBackground", "getUncheckedBackground", "Lkotlin/d2;", "j", "c", "", "startScale", "endScale", "Landroid/view/animation/ScaleAnimation;", "v", "x", "u", "", "resource", "w", "", "E0", "J", "animationOffset", "F0", "F", "animationScaleSmall", "G0", "animationScaleBig", "H0", "pivot", "Landroid/view/animation/AnimationSet;", "I0", "Lkotlin/z;", "getAnimationBounce", "()Landroid/view/animation/AnimationSet;", "animationBounce", "J0", "getStarMargin", "()I", "starMargin", "K0", "getStarIconHeight", "starIconHeight", "", "Lcom/usabilla/sdk/ubform/customViews/CheckableImageView;", "L0", "Ljava/util/List;", "stars", "M0", "getCustomFullStar", "()Landroid/graphics/drawable/Drawable;", "customFullStar", "N0", "getCustomEmptyStar", "customEmptyStar", "O0", "I", "value", "", "P0", "Ljava/lang/String;", "starTag", "Lcom/usabilla/sdk/ubform/customViews/AccessibilityStarComponent;", "Q0", "getComponent", "()Lcom/usabilla/sdk/ubform/customViews/AccessibilityStarComponent;", "component", "Landroid/view/View$OnClickListener;", "R0", "Landroid/view/View$OnClickListener;", "starsClickListener", "Landroid/content/Context;", "context", "presenter", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/i;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class StarView extends FieldView<C10025i> implements C9986j.C9988b {

    /* renamed from: E0 */
    public final long f27567E0 = 100;

    /* renamed from: F0 */
    public final float f27568F0 = 1.0f;

    /* renamed from: G0 */
    public final float f27569G0 = 1.1f;

    /* renamed from: H0 */
    public final float f27570H0 = 0.5f;
    @C12579k

    /* renamed from: I0 */
    public final C11677z f27571I0 = C10864b0.m38748c(new StarView$animationBounce$2(this));
    @C12579k

    /* renamed from: J0 */
    public final C11677z f27572J0 = C10864b0.m38748c(new StarView$starMargin$2(this));
    @C12579k

    /* renamed from: K0 */
    public final C11677z f27573K0 = C10864b0.m38748c(new StarView$starIconHeight$2(this));
    @C12579k

    /* renamed from: L0 */
    public final List<CheckableImageView> f27574L0 = new ArrayList();
    @C12579k

    /* renamed from: M0 */
    public final C11677z f27575M0;
    @C12579k

    /* renamed from: N0 */
    public final C11677z f27576N0;

    /* renamed from: O0 */
    public int f27577O0;
    @C12579k

    /* renamed from: P0 */
    public final String f27578P0;
    @C12579k

    /* renamed from: Q0 */
    public final C11677z f27579Q0;
    @C12579k

    /* renamed from: R0 */
    public final View.OnClickListener f27580R0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarView(@C12579k Context context, @C12579k C10025i iVar) {
        super(context, iVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(iVar, "presenter");
        this.f27575M0 = C10864b0.m38748c(new StarView$customFullStar$2(this, context));
        this.f27576N0 = C10864b0.m38748c(new StarView$customEmptyStar$2(this, context));
        this.f27577O0 = -1;
        this.f27578P0 = "gfpStar%d";
        this.f27579Q0 = C10864b0.m38748c(new StarView$component$2(context));
        this.f27580R0 = new C10035c(this);
    }

    private final AnimationSet getAnimationBounce() {
        return (AnimationSet) this.f27571I0.getValue();
    }

    private final Drawable getCheckedBackground() {
        Drawable customFullStar = getCustomFullStar();
        return customFullStar == null ? mo21106w(C9747c.C9755h.ub_star_full) : customFullStar;
    }

    private final AccessibilityStarComponent getComponent() {
        return (AccessibilityStarComponent) this.f27579Q0.getValue();
    }

    private final Drawable getCustomEmptyStar() {
        return (Drawable) this.f27576N0.getValue();
    }

    private final Drawable getCustomFullStar() {
        return (Drawable) this.f27575M0.getValue();
    }

    private final int getStarIconHeight() {
        return ((Number) this.f27573K0.getValue()).intValue();
    }

    private final int getStarMargin() {
        return ((Number) this.f27572J0.getValue()).intValue();
    }

    private final Drawable getUncheckedBackground() {
        Drawable customEmptyStar = getCustomEmptyStar();
        return customEmptyStar == null ? mo21106w(C9747c.C9755h.ub_star_empty) : customEmptyStar;
    }

    /* renamed from: t */
    public static final /* synthetic */ C10025i m37888t(StarView starView) {
        return (C10025i) starView.getFieldPresenter();
    }

    /* renamed from: y */
    public static final void m37889y(StarView starView, View view) {
        Intrinsics.checkNotNullParameter(starView, "this$0");
        starView.f27580R0.onClick(view);
        starView.getComponent().sendAccessibilityEvent(16384);
    }

    /* renamed from: z */
    public static final void m37890z(StarView starView, View view) {
        Intrinsics.checkNotNullParameter(starView, "this$0");
        if (view != null) {
            CheckableImageView checkableImageView = (CheckableImageView) view;
            if (checkableImageView.isChecked()) {
                if (starView.f27574L0.indexOf(checkableImageView) != CollectionsKt__CollectionsKt.m40443G(starView.f27574L0)) {
                    List<CheckableImageView> list = starView.f27574L0;
                    if (!list.get(list.indexOf(checkableImageView) + 1).isChecked()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            starView.f27577O0 = starView.f27574L0.indexOf(checkableImageView) + 1;
            ((C10025i) starView.getFieldPresenter()).mo21037i0(starView.f27574L0.indexOf(checkableImageView) + 1);
            starView.mo21104u();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.usabilla.sdk.ubform.customViews.CheckableImageView");
    }

    /* renamed from: c */
    public void mo20831c() {
        if (mo21128l()) {
            this.f27577O0 = ((C10025i) getFieldPresenter()).mo20868d();
        }
    }

    /* renamed from: j */
    public void mo20835j() {
        this.f27577O0 = ((C10025i) getFieldPresenter()).mo20868d();
        getRootView().addView(getComponent());
        mo21107x();
        mo21104u();
    }

    /* renamed from: u */
    public final void mo21104u() {
        String obj;
        String obj2;
        int i = 0;
        for (Object next : this.f27574L0) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            CheckableImageView checkableImageView = (CheckableImageView) next;
            String str = null;
            if (i2 <= this.f27577O0) {
                checkableImageView.setChecked(true);
                checkableImageView.startAnimation(getAnimationBounce());
                Drawable customFullStar = getCustomFullStar();
                if (!(customFullStar == null || (obj2 = customFullStar.toString()) == null)) {
                    str = Intrinsics.stringPlus(obj2, Integer.valueOf(i));
                }
                if (str == null) {
                    C11368t0 t0Var = C11368t0.f28504a;
                    str = String.format(this.f27578P0, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                }
                checkableImageView.setTag(str);
                checkableImageView.setImageDrawable(getCheckedBackground());
            } else {
                checkableImageView.setChecked(false);
                Drawable customEmptyStar = getCustomEmptyStar();
                if (!(customEmptyStar == null || (obj = customEmptyStar.toString()) == null)) {
                    str = Intrinsics.stringPlus(obj, Integer.valueOf(i));
                }
                if (str == null) {
                    C11368t0 t0Var2 = C11368t0.f28504a;
                    str = String.format(this.f27578P0, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                }
                checkableImageView.setTag(str);
                checkableImageView.setImageDrawable(getUncheckedBackground());
            }
            i = i2;
        }
    }

    /* renamed from: v */
    public final ScaleAnimation mo21105v(float f, float f2) {
        float f3 = this.f27570H0;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, f3, 1, f3);
        scaleAnimation.setDuration(this.f27567E0);
        return scaleAnimation;
    }

    /* renamed from: w */
    public final Drawable mo21106w(int i) {
        Drawable b = C0507a.m2346b(getContext(), i);
        Intrinsics.checkNotNull(b);
        Intrinsics.checkNotNullExpressionValue(b, "getDrawable(context, resource)!!");
        int accent = ((StarModel) ((C10025i) getFieldPresenter()).mo20826p()).mo20976g().getColors().getAccent();
        Drawable r = C17549d.m80456r(b);
        C17549d.m80452n(r, accent);
        Intrinsics.checkNotNullExpressionValue(r, "wrappedDrawable");
        return r;
    }

    /* renamed from: x */
    public final void mo21107x() {
        String obj;
        int numberOfStars = getComponent().getNumberOfStars();
        if (numberOfStars > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
                String str = null;
                CheckableImageView checkableImageView = new CheckableImageView(context, (CheckableImageView.C9768a) null, 2, (DefaultConstructorMarker) null);
                setGravity(17);
                checkableImageView.setAdjustViewBounds(true);
                checkableImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                Drawable customEmptyStar = getCustomEmptyStar();
                if (!(customEmptyStar == null || (obj = customEmptyStar.toString()) == null)) {
                    str = Intrinsics.stringPlus(obj, Integer.valueOf(i));
                }
                if (str == null) {
                    C11368t0 t0Var = C11368t0.f28504a;
                    str = String.format(this.f27578P0, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                }
                checkableImageView.setTag(str);
                checkableImageView.setImageDrawable(getUncheckedBackground());
                checkableImageView.setOnClickListener(new C10034b(this));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(getStarMargin(), getStarMargin(), getStarMargin(), getStarMargin());
                C11079d2 d2Var = C11079d2.f28267a;
                checkableImageView.setLayoutParams(layoutParams);
                checkableImageView.setImportantForAccessibility(2);
                this.f27574L0.add(checkableImageView);
                getComponent().mo19941e(checkableImageView, new LinearLayout.LayoutParams(-2, getStarIconHeight()));
                if (i2 >= numberOfStars) {
                    break;
                }
                i = i2;
            }
        }
        getComponent().setDescendantFocusability(393216);
    }
}
