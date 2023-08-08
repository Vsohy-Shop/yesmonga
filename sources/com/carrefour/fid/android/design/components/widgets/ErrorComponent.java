package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37061l;
import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/ErrorComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function0;", "Lkotlin/d2;", "listener", "setOnButtonClickListener", "", "message", "setErrorMessage", "Lcom/carrefour/fid/android/design/components/databinding/l;", "a", "Lcom/carrefour/fid/android/design/components/databinding/l;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ErrorComponent extends ConstraintLayout {

    /* renamed from: b */
    public static final int f93051b = 8;
    @C12579k

    /* renamed from: a */
    public final C37061l f93052a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ErrorComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: v */
    public static final void m152339v(C11289a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$listener");
        aVar.invoke();
    }

    public final void setErrorMessage(@C0324b1 int i) {
        this.f93052a.f92710b.setText(getContext().getString(i));
    }

    public final void setOnButtonClickListener(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40852x.C40853a.f103958a);
        this.f93052a.f92710b.setOnClickListener(new C37394r(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ErrorComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ErrorComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ErrorComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37061l d = C37061l.m152019d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f93052a = d;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C36896b.C36914r.ErrorComponent, 0, 0);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(C36896b.C36914r.ErrorComponent_image);
            if (drawable != null) {
                d.f92712d.setImageDrawable(drawable);
            }
            String string = obtainStyledAttributes.getString(C36896b.C36914r.ErrorComponent_description);
            if (string != null) {
                d.f92711c.setText(string);
            }
            String string2 = obtainStyledAttributes.getString(C36896b.C36914r.ErrorComponent_button_label);
            if (string2 != null) {
                d.f92710b.setText(string2);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
