package com.urbanairship.android.layout.widget;

import android.content.Context;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import androidx.recyclerview.widget.C20207r;
import androidx.recyclerview.widget.C20224y;
import androidx.recyclerview.widget.C20227z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.model.PagerModel;
import com.urbanairship.android.layout.view.PagerView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class PagerRecyclerView extends RecyclerView {

    /* renamed from: B2 */
    public final PagerModel f88957B2;

    /* renamed from: C2 */
    public final C35614p f88958C2;

    /* renamed from: D2 */
    public C36020k f88959D2;

    /* renamed from: E2 */
    public LinearLayoutManager f88960E2;

    /* renamed from: F2 */
    public C20227z f88961F2;

    /* renamed from: G2 */
    public boolean f88962G2 = false;
    @C0363p0

    /* renamed from: H2 */
    public PagerView.C35957a f88963H2 = null;

    /* renamed from: I2 */
    public final RecyclerView.C20085t f88964I2 = new C35993a();

    /* renamed from: com.urbanairship.android.layout.widget.PagerRecyclerView$a */
    public class C35993a extends RecyclerView.C20085t {

        /* renamed from: a */
        public int f88965a = 0;

        public C35993a() {
        }

        /* renamed from: a */
        public void mo30661a(@C0359n0 RecyclerView recyclerView, int i) {
            int i2;
            int displayedItemPosition = PagerRecyclerView.this.getDisplayedItemPosition();
            int i3 = -1;
            if (!(displayedItemPosition == -1 || displayedItemPosition == (i2 = this.f88965a))) {
                if (displayedItemPosition > i2) {
                    i3 = 1;
                }
                int abs = Math.abs(displayedItemPosition - i2);
                int i4 = 0;
                while (i4 < abs) {
                    i4++;
                    int i5 = this.f88965a + (i3 * i4);
                    if (PagerRecyclerView.this.f88963H2 != null) {
                        PagerRecyclerView.this.f88963H2.mo107588a(i5, PagerRecyclerView.this.f88962G2);
                    }
                }
            }
            this.f88965a = displayedItemPosition;
            if (i == 0) {
                boolean unused = PagerRecyclerView.this.f88962G2 = false;
            }
        }
    }

    /* renamed from: com.urbanairship.android.layout.widget.PagerRecyclerView$b */
    public static class C35994b extends C20227z {
        @C0363p0

        /* renamed from: h */
        public C20224y f88967h;
        @C0363p0

        /* renamed from: i */
        public C20224y f88968i;

        public C35994b() {
        }

        @C0363p0
        /* renamed from: n */
        private View m148251n(RecyclerView.C20076o oVar, C20224y yVar) {
            int Y = oVar.mo59922Y();
            View view = null;
            if (Y == 0) {
                return null;
            }
            int n = yVar.mo60705n() + (yVar.mo60706o() / 2);
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < Y; i2++) {
                View X = oVar.mo59919X(i2);
                int abs = Math.abs((yVar.mo60698g(X) + (yVar.mo60696e(X) / 2)) - n);
                if (abs < i) {
                    view = X;
                    i = abs;
                }
            }
            return view;
        }

        @C0359n0
        /* renamed from: o */
        private C20224y m148252o(@C0359n0 RecyclerView.C20076o oVar) {
            C20224y yVar = this.f88968i;
            if (yVar == null || yVar.mo60702k() != oVar) {
                this.f88968i = C20224y.m94588a(oVar);
            }
            return this.f88968i;
        }

        @C0359n0
        /* renamed from: q */
        private C20224y m148253q(@C0359n0 RecyclerView.C20076o oVar) {
            C20224y yVar = this.f88967h;
            if (yVar == null || yVar.mo60702k() != oVar) {
                this.f88967h = C20224y.m94590c(oVar);
            }
            return this.f88967h;
        }

        @C0363p0
        /* renamed from: h */
        public View mo60280h(RecyclerView.C20076o oVar) {
            if (oVar.mo59966q0() == 1) {
                return m148251n(oVar, m148253q(oVar));
            }
            return m148251n(oVar, m148252o(oVar));
        }

        public /* synthetic */ C35994b(C35993a aVar) {
            this();
        }
    }

    /* renamed from: com.urbanairship.android.layout.widget.PagerRecyclerView$c */
    public static class C35995c extends C35997d {

        /* renamed from: com.urbanairship.android.layout.widget.PagerRecyclerView$c$a */
        public static class C35996a extends C20207r {
            public C35996a(Context context) {
                super(context);
            }

            /* renamed from: u */
            public int mo60656u(View view, int i) {
                RecyclerView.C20076o e = mo59697e();
                if (e == null) {
                    return 0;
                }
                RecyclerView.C20081p pVar = (RecyclerView.C20081p) view.getLayoutParams();
                return mo60655t(e.mo59939g0(view) - pVar.leftMargin, e.mo59953j0(view) + pVar.rightMargin, e.getPaddingLeft(), e.mo59868B0() - e.getPaddingRight(), i);
            }
        }

        public C35995c(Context context, int i) {
            super(context, i);
        }

        /* renamed from: f2 */
        public void mo59403f2(RecyclerView recyclerView, RecyclerView.C20055b0 b0Var, int i) {
            C35996a aVar = new C35996a(recyclerView.getContext());
            aVar.mo59709q(i);
            mo59941g2(aVar);
        }

        /* renamed from: v */
        public boolean mo59428v() {
            return false;
        }
    }

    /* renamed from: com.urbanairship.android.layout.widget.PagerRecyclerView$d */
    public static class C35997d extends LinearLayoutManager {
        public C35997d(Context context, int i) {
            super(context, i, false);
            mo59915V1(false);
        }

        /* renamed from: S */
        public RecyclerView.C20081p mo59323S() {
            return new RecyclerView.C20081p(-1, -1);
        }
    }

    public PagerRecyclerView(@C0359n0 Context context, @C0359n0 PagerModel pagerModel, @C0359n0 C35614p pVar) {
        super(context);
        this.f88957B2 = pagerModel;
        this.f88958C2 = pVar;
        setId(pagerModel.mo107096P());
        mo107653Z1();
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public /* synthetic */ C18436z4 m148247a2(View view, C18436z4 z4Var) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C18196h2.m82616p(getChildAt(i), z4Var);
        }
        return z4Var;
    }

    /* renamed from: Z1 */
    public void mo107653Z1() {
        setHorizontalScrollBarEnabled(false);
        C35994b bVar = new C35994b((C35993a) null);
        this.f88961F2 = bVar;
        bVar.mo60274b(this);
        if (this.f88957B2.mo107095O().size() <= 1 || this.f88957B2.mo107097Q()) {
            this.f88960E2 = new C35995c(getContext(), 0);
        } else {
            this.f88960E2 = new C35997d(getContext(), 0);
        }
        setLayoutManager(this.f88960E2);
        mo59613r(this.f88964I2);
        C36020k kVar = new C36020k(this.f88957B2, this.f88958C2);
        this.f88959D2 = kVar;
        kVar.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY);
        this.f88959D2.mo107753o(this.f88957B2.mo107095O());
        setAdapter(this.f88959D2);
        C18196h2.m82559a2(this, new C36022l(this));
    }

    /* renamed from: b2 */
    public void mo107654b2(int i) {
        this.f88962G2 = true;
        mo59503O1(i);
    }

    public int getDisplayedItemPosition() {
        View h = this.f88961F2.mo60280h(this.f88960E2);
        if (h != null) {
            return mo59608p0(h);
        }
        return 0;
    }

    public void setPagerScrollListener(@C0363p0 PagerView.C35957a aVar) {
        this.f88963H2 = aVar;
    }
}
