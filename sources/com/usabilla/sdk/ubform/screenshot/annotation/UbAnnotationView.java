package com.usabilla.sdk.ubform.screenshot.annotation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.view.C0543g;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.screenshot.annotation.C9887a;
import com.usabilla.sdk.ubform.screenshot.annotation.paint.UbPaintPlugin;
import com.usabilla.sdk.ubform.screenshot.annotation.view.UbAnnotationCanvasView;
import com.usabilla.sdk.ubform.sdk.form.model.UbColors;
import com.usabilla.sdk.ubform.sdk.form.model.UbFonts;
import com.usabilla.sdk.ubform.sdk.form.model.UbImages;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.form.model.theme.unity.UsabillaThemeUnity;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.utils.behavior.C10114a;
import com.usabilla.sdk.ubform.utils.behavior.C10115b;
import com.usabilla.sdk.ubform.utils.ext.C10129c;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.C10976s;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001\u0013B1\b\u0007\u0012\u0006\u0010_\u001a\u00020^\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010`\u0012\b\b\u0002\u0010b\u001a\u00020\f\u0012\b\b\u0002\u0010)\u001a\u00020%¢\u0006\u0004\bc\u0010dJ\u001c\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\tH\u0002J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0014\u0010\u0016\u001a\u00020\n2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u001d\u001a\u00020\n2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n0\u001aJ\u0006\u0010\u001e\u001a\u00020\u0011J\u0010\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010!\u001a\u00020\nJ\u0006\u0010\"\u001a\u00020\u001bJ\u0006\u0010$\u001a\u00020#R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b'\u0010(R.\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00108\u001a\b\u0012\u0004\u0012\u00020\n018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003098\u0016X\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8VX\u0002¢\u0006\f\n\u0004\b\u0016\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010F\u001a\u00020\u00078VX\u0002¢\u0006\f\n\u0004\b\u0019\u0010@\u001a\u0004\bD\u0010ER(\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR#\u0010Q\u001a\n N*\u0004\u0018\u00010?0?8BX\u0002¢\u0006\f\n\u0004\bO\u0010@\u001a\u0004\bP\u0010BR#\u0010V\u001a\n N*\u0004\u0018\u00010R0R8BX\u0002¢\u0006\f\n\u0004\bS\u0010@\u001a\u0004\bT\u0010UR#\u0010Y\u001a\n N*\u0004\u0018\u00010R0R8BX\u0002¢\u0006\f\n\u0004\bW\u0010@\u001a\u0004\bX\u0010UR\u0014\u0010]\u001a\u00020Z8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006f"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/screenshot/annotation/UbAnnotationView;", "Landroid/widget/LinearLayout;", "Lcom/usabilla/sdk/ubform/screenshot/annotation/a;", "Lcom/usabilla/sdk/ubform/screenshot/annotation/d;", "plugin", "Landroid/util/TypedValue;", "selectableItemBackground", "Landroid/widget/ImageView;", "k", "Landroid/view/View;", "Lkotlin/d2;", "i", "", "icon", "Landroid/graphics/drawable/Drawable;", "m", "view", "Landroid/graphics/Bitmap;", "n", "a", "Lcom/usabilla/sdk/ubform/screenshot/annotation/UbAnnotationMenu;", "menu", "e", "Lcom/usabilla/sdk/ubform/screenshot/annotation/UbAnnotationFlowCommand;", "flowCommand", "f", "Lkotlin/Function1;", "", "undoListener", "o", "getBitmapFromPreview", "drawable", "setImageDrawable", "q", "p", "Lcom/usabilla/sdk/ubform/utils/behavior/a;", "getBehaviorBuilder", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "getTheme", "()Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "theme", "b", "Lkotlin/jvm/functions/l;", "getOnPluginSelectedCallback", "()Lkotlin/jvm/functions/l;", "setOnPluginSelectedCallback", "(Lkotlin/jvm/functions/l;)V", "onPluginSelectedCallback", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/a;", "getOnPluginFinishedCallback", "()Lkotlin/jvm/functions/a;", "setOnPluginFinishedCallback", "(Lkotlin/jvm/functions/a;)V", "onPluginFinishedCallback", "", "d", "Ljava/util/List;", "getAnnotationPlugins", "()Ljava/util/List;", "annotationPlugins", "Lcom/usabilla/sdk/ubform/screenshot/annotation/view/UbAnnotationCanvasView;", "Lkotlin/z;", "getMainDrawingView", "()Lcom/usabilla/sdk/ubform/screenshot/annotation/view/UbAnnotationCanvasView;", "mainDrawingView", "getImagePreview", "()Landroid/widget/ImageView;", "imagePreview", "g", "Lcom/usabilla/sdk/ubform/screenshot/annotation/d;", "getCurrentAnnotationPlugin", "()Lcom/usabilla/sdk/ubform/screenshot/annotation/d;", "setCurrentAnnotationPlugin", "(Lcom/usabilla/sdk/ubform/screenshot/annotation/d;)V", "currentAnnotationPlugin", "kotlin.jvm.PlatformType", "v", "getPreviewContainer", "previewContainer", "Landroid/view/ViewGroup;", "w", "getPluginsContainer", "()Landroid/view/ViewGroup;", "pluginsContainer", "x", "getMenuContainer", "menuContainer", "Ljava/lang/Runnable;", "y", "Ljava/lang/Runnable;", "boundsRunnable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;)V", "z", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class UbAnnotationView extends LinearLayout implements C9887a {
    @Deprecated

    /* renamed from: E0 */
    public static final long f27130E0 = 100;
    @C12579k

    /* renamed from: z */
    public static final C9885a f27131z = new C9885a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final UbInternalTheme f27132a;
    @C12579k

    /* renamed from: b */
    public C11300l<? super UbAnnotationFlowCommand, C11079d2> f27133b;
    @C12579k

    /* renamed from: c */
    public C11289a<C11079d2> f27134c;
    @C12579k

    /* renamed from: d */
    public final List<C9893d<?>> f27135d;
    @C12579k

    /* renamed from: e */
    public final C11677z f27136e;
    @C12579k

    /* renamed from: f */
    public final C11677z f27137f;
    @C12580l

    /* renamed from: g */
    public C9893d<?> f27138g;
    @C12579k

    /* renamed from: v */
    public final C11677z f27139v;
    @C12579k

    /* renamed from: w */
    public final C11677z f27140w;
    @C12579k

    /* renamed from: x */
    public final C11677z f27141x;
    @C12579k

    /* renamed from: y */
    public final Runnable f27142y;

    /* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.UbAnnotationView$a */
    public static final class C9885a {
        public /* synthetic */ C9885a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9885a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbAnnotationView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, (UbInternalTheme) null, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final ViewGroup getMenuContainer() {
        return (ViewGroup) this.f27141x.getValue();
    }

    private final ViewGroup getPluginsContainer() {
        return (ViewGroup) this.f27140w.getValue();
    }

    private final UbAnnotationCanvasView getPreviewContainer() {
        return (UbAnnotationCanvasView) this.f27139v.getValue();
    }

    /* renamed from: j */
    public static final void m37081j(UbAnnotationView ubAnnotationView) {
        Intrinsics.checkNotNullParameter(ubAnnotationView, "this$0");
        ubAnnotationView.getMainDrawingView().setScreenshotBounds(ubAnnotationView.getImagePreviewBounds());
    }

    /* renamed from: l */
    public static final void m37082l(UbAnnotationView ubAnnotationView, ImageView imageView, C9893d dVar, View view) {
        Intrinsics.checkNotNullParameter(ubAnnotationView, "this$0");
        Intrinsics.checkNotNullParameter(imageView, "$this_apply");
        Intrinsics.checkNotNullParameter(dVar, "$plugin");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        ubAnnotationView.mo20395b(context, dVar);
    }

    /* renamed from: a */
    public void mo20394a() {
        this.f27134c.invoke();
        getPluginsContainer().setVisibility(0);
        int childCount = getMenuContainer().getChildCount() - 1;
        View childAt = getMenuContainer().getChildAt(childCount);
        getPluginsContainer().startAnimation(C10129c.m38329a(0.0f, 1.0f));
        childAt.startAnimation(C10129c.m38330b(0.0f, 1.0f, 0));
        getMenuContainer().removeViewAt(childCount);
    }

    /* renamed from: b */
    public void mo20395b(@C12579k Context context, @C12579k C9893d<?> dVar) {
        C9887a.C9888a.m37127d(this, context, dVar);
    }

    /* renamed from: c */
    public void mo20396c(@C12579k Context context) {
        C9887a.C9888a.m37124a(this, context);
    }

    /* renamed from: d */
    public void mo20397d(@C12579k View view, @C12579k Rect rect) {
        C9887a.C9888a.m37126c(this, view, rect);
    }

    /* renamed from: e */
    public void mo20398e(@C12579k UbAnnotationMenu<?> ubAnnotationMenu) {
        Intrinsics.checkNotNullParameter(ubAnnotationMenu, C0543g.f1415f);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        View a = ubAnnotationMenu.mo20390a(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        C11079d2 d2Var = C11079d2.f28267a;
        a.setLayoutParams(layoutParams);
        getMenuContainer().addView(a);
        getPluginsContainer().setVisibility(8);
        getPluginsContainer().startAnimation(C10129c.m38329a(1.0f, 0.0f));
        a.startAnimation(C10129c.m38330b(1.0f, 0.0f, 100));
    }

    /* renamed from: f */
    public void mo20399f(@C12579k UbAnnotationFlowCommand ubAnnotationFlowCommand) {
        Intrinsics.checkNotNullParameter(ubAnnotationFlowCommand, "flowCommand");
        this.f27133b.invoke(ubAnnotationFlowCommand);
    }

    @C12579k
    public List<C9893d<?>> getAnnotationPlugins() {
        return this.f27135d;
    }

    @C12579k
    public final C10114a getBehaviorBuilder() {
        C10114a aVar = new C10114a(C10115b.C10116a.f27829a);
        ArrayList<C9898h> arrayList = new ArrayList<>();
        for (Object next : getAnnotationPlugins()) {
            if (next instanceof C9898h) {
                arrayList.add(next);
            }
        }
        for (C9898h hVar : arrayList) {
            if (hVar.mo20472e()) {
                aVar.mo21558a(hVar.mo20473j(), Integer.valueOf(getMainDrawingView().mo20505c(hVar.mo20473j())));
            } else {
                aVar.mo21558a(hVar.mo20473j(), (Object) null);
            }
        }
        return aVar;
    }

    @C12579k
    public final Bitmap getBitmapFromPreview() {
        UbAnnotationCanvasView previewContainer = getPreviewContainer();
        Intrinsics.checkNotNullExpressionValue(previewContainer, "previewContainer");
        Bitmap n = mo20413n(previewContainer);
        if (n != null) {
            return n;
        }
        throw new IllegalStateException("No Bitmap Found on ImageView");
    }

    @C12580l
    public C9893d<?> getCurrentAnnotationPlugin() {
        return this.f27138g;
    }

    @C12579k
    public ImageView getImagePreview() {
        Object value = this.f27137f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-imagePreview>(...)");
        return (ImageView) value;
    }

    @C12579k
    public Rect getImagePreviewBounds() {
        return C9887a.C9888a.m37125b(this);
    }

    @C12579k
    public UbAnnotationCanvasView getMainDrawingView() {
        Object value = this.f27136e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-mainDrawingView>(...)");
        return (UbAnnotationCanvasView) value;
    }

    @C12579k
    public final C11289a<C11079d2> getOnPluginFinishedCallback() {
        return this.f27134c;
    }

    @C12579k
    public final C11300l<UbAnnotationFlowCommand, C11079d2> getOnPluginSelectedCallback() {
        return this.f27133b;
    }

    @C12579k
    public final UbInternalTheme getTheme() {
        return this.f27132a;
    }

    /* renamed from: i */
    public final void mo20410i(View view) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(C9747c.C9754g.ub_plugin_icon_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C9747c.C9754g.ub_plugin_icon_padding);
        view.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        view.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
    }

    /* renamed from: k */
    public final ImageView mo20411k(C9893d<?> dVar, TypedValue typedValue) {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(mo20412m(dVar.getIcon()));
        imageView.setBackgroundResource(typedValue.resourceId);
        imageView.setOnClickListener(new C9897g(this, imageView, dVar));
        mo20410i(imageView);
        imageView.setSelected(true);
        return imageView;
    }

    /* renamed from: m */
    public final Drawable mo20412m(int i) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        Drawable t = C10133g.m38358t(context, i, C11078d1.m42659a(16842913, Integer.valueOf(this.f27132a.getColors().getAccent())), C11078d1.m42659a(-16842913, Integer.valueOf(this.f27132a.getColors().getText())));
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Resource " + i + " not found");
    }

    /* renamed from: n */
    public final Bitmap mo20413n(View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        Rect imagePreviewBounds = getImagePreviewBounds();
        Bitmap createBitmap2 = Bitmap.createBitmap(imagePreviewBounds.width(), imagePreviewBounds.height(), createBitmap.getConfig());
        new Canvas(createBitmap2).drawBitmap(createBitmap, imagePreviewBounds, new Rect(0, 0, imagePreviewBounds.width(), imagePreviewBounds.height()), (Paint) null);
        createBitmap.recycle();
        return createBitmap2;
    }

    /* renamed from: o */
    public final void mo20414o(@C12579k C11300l<? super Boolean, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "undoListener");
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843868, typedValue, true);
        for (C9893d dVar : getAnnotationPlugins()) {
            if (dVar.mo20455b() == UbAnnotationFlowCommand.DONE_AND_UNDO) {
                dVar.mo20456c(lVar);
            }
            getPluginsContainer().addView(mo20411k(dVar, typedValue));
        }
    }

    /* renamed from: p */
    public final boolean mo20415p() {
        if (getCurrentAnnotationPlugin() == null) {
            return false;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        mo20396c(context);
        return true;
    }

    /* renamed from: q */
    public final void mo20416q() {
        UbAnnotationFlowCommand ubAnnotationFlowCommand;
        C9893d<?> currentAnnotationPlugin;
        C9893d<?> currentAnnotationPlugin2 = getCurrentAnnotationPlugin();
        if (currentAnnotationPlugin2 == null) {
            ubAnnotationFlowCommand = null;
        } else {
            ubAnnotationFlowCommand = currentAnnotationPlugin2.mo20455b();
        }
        if (ubAnnotationFlowCommand == UbAnnotationFlowCommand.DONE_AND_UNDO && (currentAnnotationPlugin = getCurrentAnnotationPlugin()) != null) {
            currentAnnotationPlugin.mo20462h();
        }
    }

    public void setCurrentAnnotationPlugin(@C12580l C9893d<?> dVar) {
        this.f27138g = dVar;
    }

    public final void setImageDrawable(@C12580l Drawable drawable) {
        getMainDrawingView().mo20510g();
        getImagePreview().removeCallbacks(this.f27142y);
        getImagePreview().setImageDrawable(drawable);
        getImagePreview().post(this.f27142y);
    }

    public final void setOnPluginFinishedCallback(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f27134c = aVar;
    }

    public final void setOnPluginSelectedCallback(@C12579k C11300l<? super UbAnnotationFlowCommand, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f27133b = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbAnnotationView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, (UbInternalTheme) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbAnnotationView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (UbInternalTheme) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UbAnnotationView(Context context, AttributeSet attributeSet, int i, UbInternalTheme ubInternalTheme, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new UbInternalTheme((UsabillaThemeUnity) null, (UbColors) null, (UbColors) null, (UbFonts) null, (UbImages) null, false, 63, (DefaultConstructorMarker) null) : ubInternalTheme);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public UbAnnotationView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i, @C12579k UbInternalTheme ubInternalTheme) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(ubInternalTheme, C10108c.f27794S);
        this.f27132a = ubInternalTheme;
        this.f27133b = UbAnnotationView$onPluginSelectedCallback$1.f27144f;
        this.f27134c = UbAnnotationView$onPluginFinishedCallback$1.f27143f;
        this.f27135d = C10976s.m41419k(new UbPaintPlugin(ubInternalTheme.getColors()));
        this.f27136e = C10864b0.m38748c(new UbAnnotationView$mainDrawingView$2(this));
        this.f27137f = C10864b0.m38748c(new UbAnnotationView$imagePreview$2(this));
        this.f27139v = C10864b0.m38748c(new UbAnnotationView$previewContainer$2(this));
        this.f27140w = C10864b0.m38748c(new UbAnnotationView$pluginsContainer$2(this));
        this.f27141x = C10864b0.m38748c(new UbAnnotationView$menuContainer$2(this));
        this.f27142y = new C9896f(this);
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View.inflate(context, C9747c.C9759l.ub_view_annotation, this);
    }
}
