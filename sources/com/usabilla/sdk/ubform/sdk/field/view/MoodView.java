package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.customViews.CheckableImageView;
import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.sdk.field.contract.C9968d;
import com.usabilla.sdk.ubform.sdk.field.model.common.Option;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10018d;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import com.usabilla.sdk.ubform.sdk.form.model.MoodAmount;
import com.usabilla.sdk.ubform.sdk.form.model.ThemeImages;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001<B\u0017\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00108\u001a\u00020\u0002¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002R\u001e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001b\u0010'\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118BX\u0002¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u00104¨\u0006="}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/MoodView;", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldView;", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/d;", "Lcom/usabilla/sdk/ubform/sdk/field/contract/d$b;", "", "padding", "Lkotlin/d2;", "setCardInternalPadding", "j", "c", "Lcom/usabilla/sdk/ubform/sdk/form/model/ThemeImages;", "images", "Lcom/usabilla/sdk/ubform/sdk/form/model/MoodAmount;", "amount", "setMoodIconBackgroundResources", "accessibilityLabels", "setAccessibilityLabels", "", "Lcom/usabilla/sdk/ubform/customViews/CheckableImageView;", "s", "Landroid/view/View;", "view", "v", "w", "", "startScale", "endScale", "Landroid/view/animation/ScaleAnimation;", "u", "Landroid/graphics/drawable/Drawable;", "E0", "Ljava/util/List;", "moodBackgroundsOn", "F0", "moodBackgroundsOff", "G0", "Lkotlin/z;", "getMaxSpacing", "()I", "maxSpacing", "H0", "getMoods", "()Ljava/util/List;", "moods", "Landroid/view/animation/AnimationSet;", "I0", "getAnimationBounce", "()Landroid/view/animation/AnimationSet;", "animationBounce", "Landroid/widget/LinearLayout;", "J0", "getContainer", "()Landroid/widget/LinearLayout;", "container", "Landroid/content/Context;", "context", "presenter", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/d;)V", "K0", "a", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class MoodView extends FieldView<C10018d> implements C9968d.C9970b {
    @C12579k

    /* renamed from: K0 */
    public static final C10027a f27525K0 = new C10027a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: L0 */
    public static final int f27526L0 = 102;
    @Deprecated

    /* renamed from: M0 */
    public static final long f27527M0 = 100;
    @Deprecated

    /* renamed from: N0 */
    public static final float f27528N0 = 1.0f;
    @Deprecated

    /* renamed from: O0 */
    public static final float f27529O0 = 1.1f;
    @Deprecated

    /* renamed from: P0 */
    public static final float f27530P0 = 0.5f;
    @C12579k

    /* renamed from: E0 */
    public List<? extends Drawable> f27531E0 = CollectionsKt__CollectionsKt.m40441E();
    @C12579k

    /* renamed from: F0 */
    public List<? extends Drawable> f27532F0 = CollectionsKt__CollectionsKt.m40441E();
    @C12579k

    /* renamed from: G0 */
    public final C11677z f27533G0 = C10864b0.m38748c(new MoodView$maxSpacing$2(this));
    @C12579k

    /* renamed from: H0 */
    public final C11677z f27534H0 = C10864b0.m38748c(new MoodView$moods$2(this));
    @C12579k

    /* renamed from: I0 */
    public final C11677z f27535I0 = C10864b0.m38748c(new MoodView$animationBounce$2(this));
    @C12579k

    /* renamed from: J0 */
    public final C11677z f27536J0;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.view.MoodView$a */
    public static final class C10027a {
        public /* synthetic */ C10027a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C10027a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoodView(@C12579k Context context, @C12579k C10018d dVar) {
        super(context, dVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(dVar, "presenter");
        this.f27536J0 = C10864b0.m38748c(new MoodView$container$2(context, this));
    }

    private final AnimationSet getAnimationBounce() {
        return (AnimationSet) this.f27535I0.getValue();
    }

    private final LinearLayout getContainer() {
        return (LinearLayout) this.f27536J0.getValue();
    }

    /* access modifiers changed from: private */
    public final int getMaxSpacing() {
        return ((Number) this.f27533G0.getValue()).intValue();
    }

    private final List<CheckableImageView> getMoods() {
        return (List) this.f27534H0.getValue();
    }

    /* renamed from: q */
    public static final /* synthetic */ C10018d m37810q(MoodView moodView) {
        return (C10018d) moodView.getFieldPresenter();
    }

    /* renamed from: t */
    public static final void m37812t(MoodView moodView, View view) {
        Intrinsics.checkNotNullParameter(moodView, "this$0");
        Intrinsics.checkNotNullExpressionValue(view, C9851c.f26937h);
        moodView.mo21051v(view);
    }

    /* renamed from: c */
    public void mo20831c() {
        if (mo21128l()) {
            ArrayList<CheckableImageView> arrayList = new ArrayList<>();
            for (Object next : getMoods()) {
                if (((CheckableImageView) next).isChecked()) {
                    arrayList.add(next);
                }
            }
            for (CheckableImageView checked : arrayList) {
                checked.setChecked(false);
            }
        }
    }

    /* renamed from: j */
    public void mo20835j() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = getTitleLabel().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, 0, 0, 0);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_mood_icon_height));
        for (CheckableImageView addView : getMoods()) {
            getContainer().addView(addView, layoutParams2);
        }
        mo21052w();
        getRootView().addView(getContainer());
    }

    /* renamed from: s */
    public final List<CheckableImageView> mo21049s() {
        Iterable C = ((C10018d) getFieldPresenter()).mo20841C();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(C, 10));
        int i = 0;
        for (Object next : C) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            int parseInt = Integer.parseInt(((Option) next).mo21006b());
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
            CheckableImageView checkableImageView = new CheckableImageView(context, (CheckableImageView.C9768a) null, 2, (DefaultConstructorMarker) null);
            checkableImageView.setImageDrawable((Drawable) this.f27531E0.get(i));
            checkableImageView.setChecked(true);
            checkableImageView.setAdjustViewBounds(true);
            checkableImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            checkableImageView.setTag(Integer.valueOf(parseInt));
            checkableImageView.setOnClickListener(new C10033a(this));
            arrayList.add(checkableImageView);
            i = i2;
        }
        return arrayList;
    }

    public void setAccessibilityLabels(int i) {
        String[] stringArray = getResources().getStringArray(i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray(accessibilityLabels)");
        int i2 = 0;
        for (Object next : getMoods()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            ((CheckableImageView) next).setContentDescription(stringArray[i2]);
            i2 = i3;
        }
    }

    public void setCardInternalPadding(int i) {
        setPadding(i, i, i, 0);
    }

    public void setMoodIconBackgroundResources(@C12579k ThemeImages themeImages, @C12579k MoodAmount moodAmount) {
        Drawable.ConstantState constantState;
        Drawable newDrawable;
        Intrinsics.checkNotNullParameter(themeImages, "images");
        Intrinsics.checkNotNullParameter(moodAmount, "amount");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        List<Drawable> selectedMoods = themeImages.selectedMoods(context, moodAmount);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
        List<Drawable> unselectedMoods = themeImages.unselectedMoods(context2, moodAmount);
        this.f27531E0 = selectedMoods;
        if (selectedMoods.size() == unselectedMoods.size()) {
            this.f27532F0 = unselectedMoods;
            return;
        }
        Iterable<Drawable> iterable = selectedMoods;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (Drawable drawable : iterable) {
            Drawable drawable2 = null;
            if (!(drawable == null || (constantState = drawable.getConstantState()) == null || (newDrawable = constantState.newDrawable()) == null)) {
                newDrawable.mutate().setAlpha(102);
                drawable2 = newDrawable;
            }
            arrayList.add(drawable2);
        }
        this.f27532F0 = arrayList;
    }

    /* renamed from: u */
    public final ScaleAnimation mo21050u(float f, float f2) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        return scaleAnimation;
    }

    /* renamed from: v */
    public final void mo21051v(View view) {
        view.startAnimation(getAnimationBounce());
        int i = 0;
        for (Object next : getMoods()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            CheckableImageView checkableImageView = (CheckableImageView) next;
            if (!Intrinsics.areEqual(checkableImageView.getTag(), view.getTag())) {
                checkableImageView.setChecked(false);
                checkableImageView.setImageDrawable((Drawable) this.f27532F0.get(i));
            } else {
                checkableImageView.setChecked(true);
                checkableImageView.setImageDrawable((Drawable) this.f27531E0.get(i));
            }
            i = i2;
        }
        C10018d dVar = (C10018d) getFieldPresenter();
        Object tag = view.getTag();
        if (tag != null) {
            dVar.mo21029i0(((Integer) tag).intValue());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    /* renamed from: w */
    public final void mo21052w() {
        int Y = ((C10018d) getFieldPresenter()).mo20842Y();
        if (Y >= 0) {
            for (CheckableImageView checkableImageView : getMoods()) {
                checkableImageView.setChecked(false);
                if (Intrinsics.areEqual(checkableImageView.getTag(), (Object) Integer.valueOf(Y))) {
                    checkableImageView.callOnClick();
                }
            }
        }
    }
}
