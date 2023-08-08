package com.urbanairship.android.layout.view;

import android.content.Context;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.model.C35793b;
import com.urbanairship.android.layout.model.RadioInputModel;
import com.urbanairship.android.layout.property.C35832e;
import com.urbanairship.android.layout.property.C35849p;
import com.urbanairship.android.layout.widget.CheckableView;
import com.urbanairship.android.layout.widget.ShapeButton;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¨\u0006\u000f"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/RadioInputView;", "Lcom/urbanairship/android/layout/widget/CheckableView;", "Lcom/urbanairship/android/layout/model/RadioInputModel;", "Lcom/urbanairship/android/layout/property/p;", "style", "Landroidx/appcompat/widget/SwitchCompat;", "d", "Lcom/urbanairship/android/layout/property/e;", "Lcom/urbanairship/android/layout/widget/ShapeButton;", "c", "Landroid/content/Context;", "context", "model", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/RadioInputModel;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class RadioInputView extends CheckableView<RadioInputModel> {

    /* renamed from: com.urbanairship.android.layout.view.RadioInputView$a */
    public static final class C35959a implements C35793b.C35794a {

        /* renamed from: a */
        public final /* synthetic */ RadioInputView f88895a;

        public C35959a(RadioInputView radioInputView) {
            this.f88895a = radioInputView;
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            RadioInputView radioInputView = this.f88895a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            radioInputView.setVisibility(i);
        }

        public void setChecked(boolean z) {
            this.f88895a.setCheckedInternal(z);
        }

        public void setEnabled(boolean z) {
            this.f88895a.setEnabled(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioInputView(@C12579k Context context, @C12579k RadioInputModel radioInputModel) {
        super(context, radioInputModel);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(radioInputModel, C40045d.f102104u);
        radioInputModel.mo106988H(new C35959a(this));
    }

    @C12579k
    /* renamed from: c */
    public ShapeButton mo107590c(@C12579k C35832e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "style");
        C35832e.C35833a b = eVar.mo107337d().mo107340b();
        Intrinsics.checkNotNullExpressionValue(b, "style.bindings.selected");
        C35832e.C35833a c = eVar.mo107337d().mo107341c();
        Intrinsics.checkNotNullExpressionValue(c, "style.bindings.unselected");
        return new RadioInputView$createCheckboxView$1(this, getContext(), b.mo107339c(), c.mo107339c(), b.mo107338b(), c.mo107338b());
    }

    @C12579k
    /* renamed from: d */
    public SwitchCompat mo107591d(@C12579k C35849p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "style");
        return new RadioInputView$createSwitchView$1(this, getContext());
    }
}
