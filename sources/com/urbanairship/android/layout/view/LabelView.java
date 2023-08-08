package com.urbanairship.android.layout.view;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.model.C35801h;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.android.layout.util.C35922n;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/LabelView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/urbanairship/android/layout/view/a;", "Landroid/content/Context;", "context", "Lcom/urbanairship/android/layout/model/h;", "model", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/h;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class LabelView extends AppCompatTextView implements C35977a {

    /* renamed from: com.urbanairship.android.layout.view.LabelView$a */
    public static final class C35940a implements BaseModel.C35725a {

        /* renamed from: a */
        public final /* synthetic */ LabelView f88852a;

        public C35940a(LabelView labelView) {
            this.f88852a = labelView;
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            LabelView labelView = this.f88852a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            labelView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88852a.setEnabled(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelView(@C12579k Context context, @C12579k C35801h hVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(hVar, C40045d.f102104u);
        C35916j.m148088f(this, hVar);
        C35916j.m148085c(this, hVar);
        C35922n.m148121a(hVar.mo107214K(), new C11300l<String, C11079d2>(this) {
            final /* synthetic */ LabelView this$0;

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
        hVar.mo106988H(new C35940a(this));
    }
}
