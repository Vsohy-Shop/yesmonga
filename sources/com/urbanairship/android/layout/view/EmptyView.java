package com.urbanairship.android.layout.view;

import android.content.Context;
import android.view.View;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.model.C35797d;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/EmptyView;", "Landroid/view/View;", "Lcom/urbanairship/android/layout/view/a;", "Landroid/content/Context;", "context", "Lcom/urbanairship/android/layout/model/d;", "model", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/d;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class EmptyView extends View implements C35977a {

    /* renamed from: com.urbanairship.android.layout.view.EmptyView$a */
    public static final class C35932a implements BaseModel.C35725a {

        /* renamed from: a */
        public final /* synthetic */ EmptyView f88844a;

        public C35932a(EmptyView emptyView) {
            this.f88844a = emptyView;
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            EmptyView emptyView = this.f88844a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            emptyView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88844a.setEnabled(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyView(@C12579k Context context, @C12579k C35797d dVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(dVar, C40045d.f102104u);
        C35916j.m148085c(this, dVar);
        dVar.mo106988H(new C35932a(this));
    }
}
