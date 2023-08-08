package com.usabilla.sdk.ubform.customViews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageView;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u001b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0014R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/CheckableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/Checkable;", "", "isChecked", "Lkotlin/d2;", "setChecked", "toggle", "", "extraSpace", "", "onCreateDrawableState", "drawableStateChanged", "Lcom/usabilla/sdk/ubform/customViews/CheckableImageView$a;", "d", "Lcom/usabilla/sdk/ubform/customViews/CheckableImageView$a;", "checkChangedListener", "e", "[I", "checkedStateSet", "f", "Z", "checked", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/customViews/CheckableImageView$a;)V", "a", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@SuppressLint({"ViewConstructor"})
public final class CheckableImageView extends AppCompatImageView implements Checkable {
    @C12580l

    /* renamed from: d */
    public final C9768a f26752d;
    @C12579k

    /* renamed from: e */
    public final int[] f26753e;

    /* renamed from: f */
    public boolean f26754f;

    /* renamed from: com.usabilla.sdk.ubform.customViews.CheckableImageView$a */
    public interface C9768a {
        /* renamed from: a */
        void mo19952a(boolean z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckableImageView(Context context, C9768a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : aVar);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public boolean isChecked() {
        return this.f26754f;
    }

    @C12579k
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, this.f26753e);
        }
        Intrinsics.checkNotNullExpressionValue(onCreateDrawableState, "drawableState");
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (z != this.f26754f) {
            this.f26754f = z;
            refreshDrawableState();
            C9768a aVar = this.f26752d;
            if (aVar != null) {
                aVar.mo19952a(this.f26754f);
            }
        }
    }

    public void toggle() {
        setChecked(!this.f26754f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckableImageView(@C12579k Context context, @C12580l C9768a aVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f26752d = aVar;
        this.f26753e = new int[]{16842912};
    }
}
