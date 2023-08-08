package com.urbanairship.android.layout.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import androidx.core.widget.NestedScrollView;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.model.C35808m;
import com.urbanairship.android.layout.property.Direction;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/ScrollLayoutView;", "Landroidx/core/widget/NestedScrollView;", "Lcom/urbanairship/android/layout/view/a;", "Landroid/content/Context;", "context", "Lcom/urbanairship/android/layout/model/m;", "model", "Lcom/urbanairship/android/layout/environment/p;", "viewEnvironment", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/m;Lcom/urbanairship/android/layout/environment/p;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class ScrollLayoutView extends NestedScrollView implements C35977a {

    /* renamed from: com.urbanairship.android.layout.view.ScrollLayoutView$a */
    public static final class C35964a implements BaseModel.C35725a {

        /* renamed from: a */
        public final /* synthetic */ ScrollLayoutView f88904a;

        public C35964a(ScrollLayoutView scrollLayoutView) {
            this.f88904a = scrollLayoutView;
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            ScrollLayoutView scrollLayoutView = this.f88904a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            scrollLayoutView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88904a.setEnabled(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollLayoutView(@C12579k Context context, @C12579k C35808m mVar, @C12579k C35614p pVar) {
        super(context);
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(mVar, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        setFillViewport(false);
        setClipToOutline(true);
        C35916j.m148085c(this, mVar);
        View h = mVar.mo107239L().mo106993h(context, pVar);
        if (mVar.mo107238K() == Direction.VERTICAL) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
        }
        h.setLayoutParams(layoutParams);
        addView(h);
        mVar.mo106988H(new C35964a(this));
        C18196h2.m82559a2(this, new C35987j(h));
    }

    /* renamed from: e0 */
    public static final C18436z4 m148204e0(View view, View view2, C18436z4 z4Var) {
        Intrinsics.checkNotNullParameter(view, "$contentView");
        Intrinsics.checkNotNullParameter(view2, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(z4Var, "insets");
        return C18196h2.m82616p(view, z4Var);
    }
}
