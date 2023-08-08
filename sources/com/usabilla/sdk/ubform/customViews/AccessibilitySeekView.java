package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import com.urbanairship.iam.events.C9175a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0002R\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00028\u00008$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/AccessibilitySeekView;", "Landroid/widget/ProgressBar;", "V", "Landroid/widget/FrameLayout;", "", "getAccessibilityClassName", "", "eventType", "Lkotlin/d2;", "sendAccessibilityEvent", "a", "Landroid/view/accessibility/AccessibilityManager;", "Lkotlin/z;", "getManager", "()Landroid/view/accessibility/AccessibilityManager;", "manager", "", "getDescriptionString", "()Ljava/lang/String;", "descriptionString", "getView", "()Landroid/widget/ProgressBar;", "view", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public abstract class AccessibilitySeekView<V extends ProgressBar> extends FrameLayout {
    @C12579k

    /* renamed from: a */
    public final C11677z f26731a;

    /* renamed from: com.usabilla.sdk.ubform.customViews.AccessibilitySeekView$a */
    public static final class C9765a extends C18019a {

        /* renamed from: d */
        public final /* synthetic */ AccessibilitySeekView<V> f26732d;

        public C9765a(AccessibilitySeekView<V> accessibilitySeekView) {
            this.f26732d = accessibilitySeekView;
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
                this.f26732d.getView().setProgress(this.f26732d.getView().getProgress() + 1);
                return true;
            } else if (i != 8192) {
                return super.mo19939j(view, i, bundle);
            } else {
                this.f26732d.getView().setProgress(this.f26732d.getView().getProgress() - 1);
                return true;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public AccessibilitySeekView(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final AccessibilityManager getManager() {
        return (AccessibilityManager) this.f26731a.getValue();
    }

    /* renamed from: a */
    public final void mo19933a() {
        C18196h2.m82474B1(this, new C9765a(this));
    }

    @C12579k
    public CharSequence getAccessibilityClassName() {
        String name = SeekBar.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "SeekBar::class.java.name");
        return name;
    }

    @C12579k
    public abstract String getDescriptionString();

    @C12579k
    public abstract V getView();

    public void sendAccessibilityEvent(int i) {
        if (i != 16384) {
            super.sendAccessibilityEvent(i);
        } else if (getManager().isEnabled()) {
            getManager().interrupt();
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
            obtain.getText().add(getView().getContentDescription());
            getManager().sendAccessibilityEvent(obtain);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public AccessibilitySeekView(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccessibilitySeekView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public AccessibilitySeekView(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f26731a = C10864b0.m38748c(new AccessibilitySeekView$manager$2(context));
        setFocusable(true);
        setImportantForAccessibility(1);
        mo19933a();
    }
}
