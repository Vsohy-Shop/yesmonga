package com.urbanairship.android.layout.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.material.button.MaterialButton;
import com.urbanairship.android.layout.C35625g;
import com.urbanairship.android.layout.model.ButtonModel;
import com.urbanairship.android.layout.model.C35800g;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.android.layout.util.C35921m;
import com.urbanairship.android.layout.util.C35922n;
import com.urbanairship.android.layout.util.ViewExtensionsKt;
import com.urbanairship.android.layout.widget.C36026n;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016¨\u0006\u0011"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/LabelButtonView;", "Lcom/google/android/material/button/MaterialButton;", "Lcom/urbanairship/android/layout/view/a;", "Lcom/urbanairship/android/layout/widget/n;", "", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/d2;", "onMeasure", "Lkotlinx/coroutines/flow/e;", "e", "Landroid/content/Context;", "context", "Lcom/urbanairship/android/layout/model/g;", "model", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/g;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class LabelButtonView extends MaterialButton implements C35977a, C36026n {

    /* renamed from: com.urbanairship.android.layout.view.LabelButtonView$a */
    public static final class C35938a implements ButtonModel.C35732a {

        /* renamed from: a */
        public final /* synthetic */ LabelButtonView f88851a;

        public C35938a(LabelButtonView labelButtonView) {
            this.f88851a = labelButtonView;
        }

        /* renamed from: e */
        public void mo107040e() {
            C35916j.m148093k(this.f88851a);
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            LabelButtonView labelButtonView = this.f88851a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            labelButtonView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88851a.setEnabled(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelButtonView(@C12579k Context context, @C12579k C35800g gVar) {
        super(context, (AttributeSet) null, C35625g.C35628c.borderlessButtonStyle);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(gVar, C40045d.f102104u);
        setAllCaps(false);
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.END);
        setMinHeight(0);
        setMinimumHeight(0);
        setInsetTop(0);
        setInsetBottom(0);
        C35916j.m148087e(this, gVar);
        C35922n.m148121a(gVar.mo107031R(), new C11300l<String, C11079d2>(this) {
            final /* synthetic */ LabelButtonView this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C11079d2.f28267a;
            }

            public final void invoke(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "it");
                this.this$0.setContentDescription(str);
            }
        });
        gVar.mo106988H(new C35938a(this));
    }

    @C12579k
    /* renamed from: e */
    public C11907e<C11079d2> mo107595e() {
        return ViewExtensionsKt.m148030e(this, 0, 1, (Object) null);
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z2 = false;
        }
        if (z || z2) {
            int a = (int) C35921m.m148111a(getContext(), 12);
            if (z2) {
                i3 = a;
            } else {
                i3 = 0;
            }
            if (z) {
                i4 = a;
            }
            setPadding(i3, i4, i3, i4);
        } else {
            setPadding(0, 0, 0, 0);
        }
        super.onMeasure(i, i2);
    }
}
