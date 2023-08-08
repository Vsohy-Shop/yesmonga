package com.carrefour.fid.android.design.components.widgets.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.carrefour.fid.android.design.components.utils.C37135b;
import com.carrefour.fid.android.design.components.widgets.list.C37269i;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B3\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0014R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/list/ListItemComponent;", "Lcom/carrefour/fid/android/design/components/widgets/list/i;", "UIModelType", "Landroidx/constraintlayout/widget/ConstraintLayout;", "itemViewUIModel", "Lkotlin/d2;", "u", "(Lcom/carrefour/fid/android/design/components/widgets/list/i;)V", "onAttachedToWindow", "", "a", "Ljava/lang/Float;", "itemHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/Float;)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public abstract class ListItemComponent<UIModelType extends C37269i> extends ConstraintLayout {

    /* renamed from: b */
    public static final int f93444b = 0;
    @C12580l

    /* renamed from: a */
    public final Float f93445a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, (Float) null, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    public void onAttachedToWindow() {
        ConstraintLayout.C16926b bVar;
        super.onAttachedToWindow();
        if (getLayoutParams() == null) {
            if (this.f93445a != null) {
                bVar = new ConstraintLayout.C16926b(-1, C37135b.m152206a(this.f93445a.floatValue()));
            } else {
                bVar = new ConstraintLayout.C16926b(-1, -2);
            }
            setLayoutParams(bVar);
        } else if (this.f93445a != null) {
            getLayoutParams().height = C37135b.m152206a(this.f93445a.floatValue());
        }
    }

    /* renamed from: u */
    public abstract void mo113429u(@C12580l UIModelType uimodeltype);

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Float) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Float) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListItemComponent(Context context, AttributeSet attributeSet, int i, Float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i, @C12580l Float f) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93445a = f;
    }
}
