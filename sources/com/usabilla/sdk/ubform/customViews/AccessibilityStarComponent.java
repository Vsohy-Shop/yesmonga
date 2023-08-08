package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\u0006H\u0002R?\u0010\u0015\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\u000e\b\u0001\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e0\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b#\u0010$¨\u0006*"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/AccessibilityStarComponent;", "Landroid/widget/FrameLayout;", "", "getAccessibilityClassName", "", "eventType", "Lkotlin/d2;", "sendAccessibilityEvent", "Lcom/usabilla/sdk/ubform/customViews/CheckableImageView;", "star", "Landroid/view/ViewGroup$LayoutParams;", "layoutParameters", "e", "f", "", "", "kotlin.jvm.PlatformType", "a", "Lkotlin/z;", "getStarLabels", "()[Ljava/lang/String;", "starLabels", "b", "I", "selectedStarIndex", "c", "getNumberOfStars", "()I", "numberOfStars", "Landroid/view/accessibility/AccessibilityManager;", "d", "getManager", "()Landroid/view/accessibility/AccessibilityManager;", "manager", "Landroid/widget/LinearLayout;", "getComponent", "()Landroid/widget/LinearLayout;", "component", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class AccessibilityStarComponent extends FrameLayout {
    @C12579k

    /* renamed from: a */
    public final C11677z f26733a = C10864b0.m38748c(new AccessibilityStarComponent$starLabels$2(this));

    /* renamed from: b */
    public int f26734b = -1;

    /* renamed from: c */
    public final int f26735c = 5;
    @C12579k

    /* renamed from: d */
    public final C11677z f26736d;
    @C12579k

    /* renamed from: e */
    public final C11677z f26737e;

    /* renamed from: com.usabilla.sdk.ubform.customViews.AccessibilityStarComponent$a */
    public static final class C9766a extends C18019a {

        /* renamed from: d */
        public final /* synthetic */ AccessibilityStarComponent f26738d;

        public C9766a(AccessibilityStarComponent accessibilityStarComponent) {
            this.f26738d = accessibilityStarComponent;
        }

        /* renamed from: g */
        public void mo19938g(@C12580l View view, @C12580l C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            if (l0Var != null) {
                l0Var.mo52598b(C18065l0.C18066a.f46682s);
            }
            if (l0Var != null) {
                l0Var.mo52598b(C18065l0.C18066a.f46681r);
            }
        }

        /* renamed from: j */
        public boolean mo19939j(@C12580l View view, int i, @C12580l Bundle bundle) {
            if (i == 4096) {
                AccessibilityStarComponent accessibilityStarComponent = this.f26738d;
                accessibilityStarComponent.f26734b = Math.min(accessibilityStarComponent.f26734b + 1, this.f26738d.getNumberOfStars() - 1);
                this.f26738d.getComponent().setContentDescription(this.f26738d.getStarLabels()[this.f26738d.f26734b]);
                this.f26738d.getComponent().getChildAt(this.f26738d.f26734b).callOnClick();
                return true;
            } else if (i != 8192) {
                return super.mo19939j(view, i, bundle);
            } else {
                AccessibilityStarComponent accessibilityStarComponent2 = this.f26738d;
                accessibilityStarComponent2.f26734b = Math.max(accessibilityStarComponent2.f26734b - 1, 0);
                this.f26738d.getComponent().setContentDescription(this.f26738d.getStarLabels()[this.f26738d.f26734b]);
                this.f26738d.getComponent().getChildAt(this.f26738d.f26734b).callOnClick();
                return true;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccessibilityStarComponent(@C12579k Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f26736d = C10864b0.m38748c(new AccessibilityStarComponent$manager$2(context));
        this.f26737e = C10864b0.m38748c(new AccessibilityStarComponent$component$2(context, this));
        setFocusable(true);
        removeAllViews();
        addView(getComponent());
        mo19942f();
        setContentDescription(context.getString(C9747c.C9761n.ub_element_mood_select_rating, new Object[]{5}));
    }

    /* access modifiers changed from: private */
    public final LinearLayout getComponent() {
        return (LinearLayout) this.f26737e.getValue();
    }

    private final AccessibilityManager getManager() {
        return (AccessibilityManager) this.f26736d.getValue();
    }

    /* access modifiers changed from: private */
    public final String[] getStarLabels() {
        return (String[]) this.f26733a.getValue();
    }

    /* renamed from: e */
    public final void mo19941e(@C12579k CheckableImageView checkableImageView, @C12579k ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(checkableImageView, "star");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParameters");
        getComponent().addView(checkableImageView, layoutParams);
    }

    /* renamed from: f */
    public final void mo19942f() {
        C18196h2.m82474B1(this, new C9766a(this));
    }

    @C12579k
    public CharSequence getAccessibilityClassName() {
        String name = SeekBar.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "SeekBar::class.java.name");
        return name;
    }

    public final int getNumberOfStars() {
        return this.f26735c;
    }

    public void sendAccessibilityEvent(int i) {
        C11079d2 d2Var;
        if (getManager().isEnabled()) {
            getManager().interrupt();
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
            if (i == 16384) {
                obtain.getText().add(getComponent().getContentDescription());
            } else if (i != 32768) {
                super.sendAccessibilityEvent(i);
            } else {
                CharSequence contentDescription = getComponent().getContentDescription();
                if (contentDescription == null) {
                    d2Var = null;
                } else {
                    LinearLayout component = getComponent();
                    component.announceForAccessibility(getContext().getString(C9747c.C9761n.ub_element_mood_select_rating, new Object[]{Integer.valueOf(getNumberOfStars())}) + ". " + contentDescription);
                    d2Var = C11079d2.f28267a;
                }
                if (d2Var == null) {
                    getComponent().announceForAccessibility(Intrinsics.stringPlus(getContext().getString(C9747c.C9761n.ub_element_mood_select_rating, new Object[]{Integer.valueOf(getNumberOfStars())}), "."));
                }
            }
            getManager().sendAccessibilityEvent(obtain);
        }
    }
}
