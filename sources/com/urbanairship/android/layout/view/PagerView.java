package com.urbanairship.android.layout.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.model.PagerModel;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.android.layout.widget.PagerRecyclerView;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0004B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/PagerView;", "Landroid/widget/FrameLayout;", "Lcom/urbanairship/android/layout/view/a;", "Lcom/urbanairship/android/layout/view/PagerView$a;", "a", "Lcom/urbanairship/android/layout/view/PagerView$a;", "getScrollListener", "()Lcom/urbanairship/android/layout/view/PagerView$a;", "setScrollListener", "(Lcom/urbanairship/android/layout/view/PagerView$a;)V", "scrollListener", "Lcom/urbanairship/android/layout/widget/PagerRecyclerView;", "b", "Lcom/urbanairship/android/layout/widget/PagerRecyclerView;", "view", "com/urbanairship/android/layout/view/PagerView$b", "c", "Lcom/urbanairship/android/layout/view/PagerView$b;", "modelListener", "Landroid/content/Context;", "context", "Lcom/urbanairship/android/layout/model/PagerModel;", "model", "Lcom/urbanairship/android/layout/environment/p;", "viewEnvironment", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/PagerModel;Lcom/urbanairship/android/layout/environment/p;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class PagerView extends FrameLayout implements C35977a {
    @C12580l

    /* renamed from: a */
    public C35957a f88891a;
    @C12579k

    /* renamed from: b */
    public final PagerRecyclerView f88892b;
    @C12579k

    /* renamed from: c */
    public final C35958b f88893c;

    /* renamed from: com.urbanairship.android.layout.view.PagerView$a */
    public interface C35957a {
        /* renamed from: a */
        void mo107588a(int i, boolean z);
    }

    /* renamed from: com.urbanairship.android.layout.view.PagerView$b */
    public static final class C35958b implements PagerModel.C35752b {

        /* renamed from: a */
        public final /* synthetic */ PagerView f88894a;

        public C35958b(PagerView pagerView) {
            this.f88894a = pagerView;
        }

        /* renamed from: d */
        public void mo107105d(int i) {
            if (i != -1) {
                this.f88894a.f88892b.mo107654b2(i);
            }
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            PagerView pagerView = this.f88894a;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            pagerView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88894a.setEnabled(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerView(@C12579k Context context, @C12579k PagerModel pagerModel, @C12579k C35614p pVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pagerModel, C40045d.f102104u);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        PagerRecyclerView pagerRecyclerView = new PagerRecyclerView(context, pagerModel, pVar);
        this.f88892b = pagerRecyclerView;
        C35958b bVar = new C35958b(this);
        this.f88893c = bVar;
        addView(pagerRecyclerView, -1, -1);
        C35916j.m148085c(this, pagerModel);
        pagerModel.mo106988H(bVar);
        pagerRecyclerView.setPagerScrollListener(new C35984g(this));
        C18196h2.m82559a2(this, new C35985h(this));
    }

    /* renamed from: c */
    public static final void m148183c(PagerView pagerView, int i, boolean z) {
        Intrinsics.checkNotNullParameter(pagerView, "this$0");
        C35957a aVar = pagerView.f88891a;
        if (aVar != null) {
            aVar.mo107588a(i, z);
        }
    }

    /* renamed from: d */
    public static final C18436z4 m148184d(PagerView pagerView, View view, C18436z4 z4Var) {
        Intrinsics.checkNotNullParameter(pagerView, "this$0");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(z4Var, "insets");
        return C18196h2.m82616p(pagerView.f88892b, z4Var);
    }

    @C12580l
    public final C35957a getScrollListener() {
        return this.f88891a;
    }

    public final void setScrollListener(@C12580l C35957a aVar) {
        this.f88891a = aVar;
    }
}
