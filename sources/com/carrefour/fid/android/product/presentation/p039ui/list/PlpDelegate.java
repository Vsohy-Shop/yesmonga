package com.carrefour.fid.android.product.presentation.p039ui.list;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13796h;
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.FirebaseProductDimension;
import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.list.ProductCardListLoader;
import com.carrefour.fid.android.domain.exceptions.BasketClosedStoreThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketExpiredFacilityStoreIdThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketThrowable;
import com.carrefour.fid.android.domain.exceptions.CategoryLimitationExceededThrowable;
import com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable;
import com.carrefour.fid.android.domain.exceptions.ShoppingListThrowable;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.domain.models.offer.CategoryLimit;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.analytics.C27633c;
import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.product.presentation.mapper.C27642b;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.product.presentation.models.extensions.C27657a;
import com.carrefour.fid.android.product.presentation.models.extensions.C27661d;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import com.carrefour.fid.android.product.presentation.models.extensions.C27668i;
import com.carrefour.fid.android.product.presentation.models.listable.C27680a;
import com.carrefour.fid.android.product.presentation.models.listable.C27682b;
import com.carrefour.fid.android.product.presentation.models.listable.C27683c;
import com.carrefour.fid.android.product.presentation.models.listable.C27685e;
import com.carrefour.fid.android.product.presentation.models.listable.C27686f;
import com.carrefour.fid.android.product.presentation.p039ui.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel;
import com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28494o;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.carrefour.fid.android.shared.p046io.RequireSignInThrowable;
import com.carrefour.fid.android.shared.paging.C28850b;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.shared.util.C28936j;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nPlpDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlpDelegate.kt\ncom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,689:1\n106#2,15:690\n1603#3,9:705\n1855#3:714\n1856#3:716\n1612#3:717\n1559#3:718\n1590#3,4:719\n1855#3,2:723\n1#4:715\n168#5,7:725\n*S KotlinDebug\n*F\n+ 1 PlpDelegate.kt\ncom/carrefour/fid/android/product/presentation/ui/list/PlpDelegate\n*L\n90#1:690,15\n182#1:705,9\n182#1:714\n182#1:716\n182#1:717\n213#1:718\n213#1:719,4\n397#1:723,2\n182#1:715\n543#1:725,7\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate */
public final class PlpDelegate {

    /* renamed from: p */
    public static final int f67862p = 8;
    @C12579k

    /* renamed from: a */
    public final Fragment f67863a;
    @C12579k

    /* renamed from: b */
    public final C28500r f67864b;
    @C12579k

    /* renamed from: c */
    public final ProductListSource f67865c;
    @C12579k

    /* renamed from: d */
    public final C28796c f67866d;
    @C12579k

    /* renamed from: e */
    public final PlpProductAnalytics f67867e;
    @C12580l

    /* renamed from: f */
    public final C11304p<Integer, Integer, C11079d2> f67868f;
    @C12579k

    /* renamed from: g */
    public final C28936j f67869g;
    @C12579k

    /* renamed from: h */
    public final C11677z f67870h;
    @C12580l

    /* renamed from: i */
    public C28045e f67871i;
    @C12579k

    /* renamed from: j */
    public List<C37133a> f67872j;
    @C12579k

    /* renamed from: k */
    public final List<String> f67873k;
    @C12579k

    /* renamed from: l */
    public List<? extends C27670g> f67874l;

    /* renamed from: m */
    public boolean f67875m;
    @C12579k

    /* renamed from: n */
    public final C27686f f67876n;
    @C12579k

    /* renamed from: o */
    public final C27680a f67877o;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$a */
    public static final class C28011a extends RecyclerView.C20085t {

        /* renamed from: a */
        public final /* synthetic */ PlpDelegate f67878a;

        public C28011a(PlpDelegate plpDelegate) {
            this.f67878a = plpDelegate;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.carrefour.fid.android.design.components.widgets.productcard.list.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo30662b(@org.jetbrains.annotations.C12579k androidx.recyclerview.widget.RecyclerView r2, int r3, int r4) {
            /*
                r1 = this;
                java.lang.String r0 = "recyclerView"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                super.mo30662b(r2, r3, r4)
                androidx.recyclerview.widget.RecyclerView$o r2 = r2.getLayoutManager()
                boolean r3 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
                r4 = 0
                if (r3 == 0) goto L_0x0014
                androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
                goto L_0x0015
            L_0x0014:
                r2 = r4
            L_0x0015:
                r3 = -1
                if (r2 == 0) goto L_0x001d
                int r2 = r2.mo59435y2()
                goto L_0x001e
            L_0x001d:
                r2 = r3
            L_0x001e:
                if (r2 == r3) goto L_0x00f1
                com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate r3 = r1.f67878a
                com.carrefour.fid.android.product.presentation.ui.list.e r3 = r3.f67871i
                if (r3 == 0) goto L_0x0035
                java.util.List r3 = r3.mo60667k()
                if (r3 == 0) goto L_0x0035
                java.lang.Object r3 = kotlin.collections.CollectionsKt___CollectionsKt.m40559R2(r3, r2)
                r4 = r3
                com.carrefour.fid.android.design.components.widgets.productcard.list.a r4 = (com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a) r4
            L_0x0035:
                boolean r3 = r4 instanceof com.carrefour.fid.android.product.presentation.models.listable.C27682b
                if (r3 == 0) goto L_0x006b
                com.carrefour.fid.android.product.presentation.models.listable.b r4 = (com.carrefour.fid.android.product.presentation.models.listable.C27682b) r4
                com.carrefour.fid.android.domain.models.criteo.e r2 = r4.mo80422e()
                java.util.List r2 = r2.mo117432a()
                int r3 = r4.mo80424f()
                java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40559R2(r2, r3)
                com.carrefour.fid.android.domain.models.criteo.n r2 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r2
                if (r2 == 0) goto L_0x005a
                java.lang.String r2 = r2.mo117557m()
                if (r2 == 0) goto L_0x005a
                com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate r3 = r1.f67878a
                r3.mo81510p(r2)
            L_0x005a:
                com.carrefour.fid.android.domain.models.criteo.e r2 = r4.mo80422e()
                java.lang.String r2 = r2.mo117434c()
                if (r2 == 0) goto L_0x00f1
                com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate r3 = r1.f67878a
                r3.mo81510p(r2)
                goto L_0x00f1
            L_0x006b:
                boolean r3 = r4 instanceof com.carrefour.fid.android.product.presentation.models.listable.C27683c
                if (r3 == 0) goto L_0x00a0
                com.carrefour.fid.android.product.presentation.models.listable.c r4 = (com.carrefour.fid.android.product.presentation.models.listable.C27683c) r4
                com.carrefour.fid.android.domain.models.criteo.f r2 = r4.mo80432e()
                java.util.List r2 = r2.mo117432a()
                int r3 = r4.mo80434f()
                java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40559R2(r2, r3)
                com.carrefour.fid.android.domain.models.criteo.n r2 = (com.carrefour.fid.android.domain.models.criteo.C38012n) r2
                if (r2 == 0) goto L_0x0090
                java.lang.String r2 = r2.mo117557m()
                if (r2 == 0) goto L_0x0090
                com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate r3 = r1.f67878a
                r3.mo81510p(r2)
            L_0x0090:
                com.carrefour.fid.android.domain.models.criteo.f r2 = r4.mo80432e()
                java.lang.String r2 = r2.mo117434c()
                if (r2 == 0) goto L_0x00f1
                com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate r3 = r1.f67878a
                r3.mo81510p(r2)
                goto L_0x00f1
            L_0x00a0:
                boolean r3 = r4 instanceof com.carrefour.fid.android.product.presentation.models.listable.C27684d
                if (r3 == 0) goto L_0x00c2
                com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate r2 = r1.f67878a
                boolean r2 = r2.f67875m
                if (r2 != 0) goto L_0x00f1
                com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate r2 = r1.f67878a
                com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics r2 = r2.f67867e
                com.carrefour.fid.android.product.presentation.models.listable.d r4 = (com.carrefour.fid.android.product.presentation.models.listable.C27684d) r4
                java.lang.String r3 = r4.mo80447i()
                r2.mo80235l(r3)
                com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate r2 = r1.f67878a
                r3 = 1
                r2.f67875m = r3
                goto L_0x00f1
            L_0x00c2:
                boolean r3 = r4 instanceof com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent.C37338a
                if (r3 == 0) goto L_0x00f1
                com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate r3 = r1.f67878a
                java.util.List r3 = r3.f67874l
                java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40559R2(r3, r2)
                com.carrefour.fid.android.product.presentation.models.g r2 = (com.carrefour.fid.android.product.presentation.models.C27670g) r2
                if (r2 == 0) goto L_0x00f1
                com.carrefour.fid.android.domain.models.product.plp.b r2 = com.carrefour.fid.android.product.presentation.models.extensions.C27668i.m116407a(r2)
                if (r2 == 0) goto L_0x00f1
                com.carrefour.fid.android.domain.models.product.plp.c r2 = r2.mo118842j()
                if (r2 == 0) goto L_0x00f1
                com.carrefour.fid.android.domain.models.criteo.n r2 = r2.mo118886w()
                if (r2 == 0) goto L_0x00f1
                java.lang.String r2 = r2.mo117557m()
                if (r2 == 0) goto L_0x00f1
                com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate r3 = r1.f67878a
                r3.mo81510p(r2)
            L_0x00f1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.list.PlpDelegate.C28011a.mo30662b(androidx.recyclerview.widget.RecyclerView, int, int):void");
        }
    }

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$b */
    public static final class C28012b implements C27686f.C27687a {

        /* renamed from: a */
        public final /* synthetic */ PlpDelegate f67879a;

        public C28012b(PlpDelegate plpDelegate) {
            this.f67879a = plpDelegate;
        }

        /* renamed from: a */
        public void mo80450a(@C12579k C38115c cVar, int i) {
            String str;
            String k;
            C38115c cVar2 = cVar;
            Intrinsics.checkNotNullParameter(cVar2, "product");
            PlpOffer i2 = C27662e.m116389i(cVar);
            if (i2 != null) {
                this.f67879a.f67866d.mo83838n(C19736g.m91827a(this.f67879a.f67863a), i2.mo118819v(), !cVar.mo118860K());
                C38012n w = cVar.mo118886w();
                if (!(w == null || (k = w.mo117555k()) == null)) {
                    this.f67879a.mo81509o().sendIntent(new PlpViewModel.C28181c.C28189h(k));
                }
                PlpProductAnalytics b = this.f67879a.f67867e;
                String D = cVar.mo118853D();
                String A = cVar.mo118850A();
                ProductCategory v = cVar.mo118885v();
                if (v != null) {
                    str = v.mo117297q();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                b.mo80238o(new C27633c(D, A, str, (String) null, String.valueOf((float) C27661d.m116376c(i2)), (Integer) null, C27662e.m116383c(cVar), (String) null, (String) null, this.f67879a.mo81506H(cVar2, i2).mo32724a(), FirebaseProductDimension.CLASSIC.mo32726q(), C16717v.C16720c.f42235v, (DefaultConstructorMarker) null), i);
            }
        }

        /* renamed from: b */
        public void mo80451b(@C12579k C37133a aVar, @C12579k C38115c cVar, int i) {
            Intrinsics.checkNotNullParameter(aVar, "debouncerState");
            Intrinsics.checkNotNullParameter(cVar, "product");
            this.f67879a.f67872j.add(aVar);
            PlpOffer i2 = C27662e.m116389i(cVar);
            if (i2 != null) {
                this.f67879a.mo81509o().sendIntent(new PlpViewModel.C28181c.C28188g(i2, i));
                this.f67879a.f67867e.mo80229f(cVar, 0, i);
            }
        }

        /* renamed from: c */
        public void mo80452c(@C12579k C37133a aVar, @C12579k C38115c cVar, boolean z, int i) {
            String str;
            Intrinsics.checkNotNullParameter(aVar, "debouncerState");
            Intrinsics.checkNotNullParameter(cVar, "product");
            this.f67879a.f67872j.add(aVar);
            PlpViewModel h = this.f67879a.mo81509o();
            C38012n w = cVar.mo118886w();
            if (w != null) {
                str = w.mo117558n();
            } else {
                str = null;
            }
            h.sendIntent(new PlpViewModel.C28181c.C28190i(cVar, z, str));
            this.f67879a.f67867e.mo80231h(cVar, i, !z);
        }

        /* renamed from: g */
        public void mo80453g(@C12579k C37133a aVar, @C12579k C38115c cVar, int i, int i2) {
            String str;
            Intrinsics.checkNotNullParameter(aVar, "debouncerState");
            Intrinsics.checkNotNullParameter(cVar, "product");
            this.f67879a.f67872j.add(aVar);
            PlpOffer i3 = C27662e.m116389i(cVar);
            if (i3 != null) {
                PlpViewModel h = this.f67879a.mo81509o();
                C38012n w = cVar.mo118886w();
                if (w != null) {
                    str = w.mo117554j();
                } else {
                    str = null;
                }
                h.sendIntent(new PlpViewModel.C28181c.C28182a(i3, i, i2, str));
                if (i == 0) {
                    this.f67879a.f67867e.mo80227d(cVar, 1, i2);
                }
            }
        }
    }

    public PlpDelegate(@C12579k Fragment fragment, @C12579k C28500r rVar, @C12579k ProductListSource productListSource, @C12579k C28796c cVar, @C12579k PlpProductAnalytics plpProductAnalytics, @C12580l C11304p<? super Integer, ? super Integer, C11079d2> pVar, @C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(rVar, "screen");
        Intrinsics.checkNotNullParameter(productListSource, "source");
        Intrinsics.checkNotNullParameter(cVar, "navigator");
        Intrinsics.checkNotNullParameter(plpProductAnalytics, "analytics");
        Intrinsics.checkNotNullParameter(jVar, "fragmentUtil");
        this.f67863a = fragment;
        this.f67864b = rVar;
        this.f67865c = productListSource;
        this.f67866d = cVar;
        this.f67867e = plpProductAnalytics;
        this.f67868f = pVar;
        this.f67869g = jVar;
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new PlpDelegate$special$$inlined$viewModels$default$2(new PlpDelegate$special$$inlined$viewModels$default$1(fragment)));
        this.f67870h = FragmentViewModelLazyKt.m89923h(fragment, C11342l0.m43547d(PlpViewModel.class), new PlpDelegate$special$$inlined$viewModels$default$3(b), new PlpDelegate$special$$inlined$viewModels$default$4((C11289a) null, b), new PlpDelegate$special$$inlined$viewModels$default$5(fragment, b));
        this.f67872j = new ArrayList();
        this.f67873k = new ArrayList();
        this.f67874l = CollectionsKt__CollectionsKt.m40441E();
        this.f67876n = new C28012b(this);
        this.f67877o = new PlpDelegate$criteoTrackingCallbacks$1(this);
    }

    /* renamed from: w */
    public static /* synthetic */ void m117446w(PlpDelegate plpDelegate, Lifecycle.State state, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            state = Lifecycle.State.STARTED;
        }
        plpDelegate.mo81516v(state, pVar);
    }

    /* renamed from: A */
    public final void mo81499A(BaseMVIViewModel<?, ?> baseMVIViewModel, C11300l<? super PlpViewModel.C28170a, C11079d2> lVar) {
        mo81516v(Lifecycle.State.RESUMED, new PlpDelegate$processEvent$1(baseMVIViewModel, lVar, (C11045c<? super PlpDelegate$processEvent$1>) null));
    }

    /* renamed from: B */
    public final <S extends C28505u.C28509d, I extends C28505u.C28507b> void mo81500B(@C12579k BaseMVIViewModel<S, I> baseMVIViewModel, @C12579k C11300l<? super S, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(baseMVIViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lVar, "action");
        Fragment fragment = this.f67863a;
        C19499w viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new PlpDelegate$processState$$inlined$processState$1(fragment, baseMVIViewModel, lVar, (C11045c) null), 3, (Object) null);
    }

    /* renamed from: C */
    public final void mo81501C() {
        C28850b q;
        C28045e eVar = this.f67871i;
        if (!(eVar == null || (q = eVar.mo81609q()) == null)) {
            q.mo83964d();
        }
        C28045e eVar2 = this.f67871i;
        if (eVar2 != null) {
            mo81509o().sendIntent(new PlpViewModel.C28181c.C28187f(this.f67865c, eVar2.mo81609q().mo83961a()));
        }
    }

    /* renamed from: D */
    public final void mo81502D() {
        for (C37133a a : this.f67872j) {
            a.mo112751a(true);
        }
        this.f67872j.clear();
    }

    /* renamed from: E */
    public final void mo81503E() {
        if (this.f67865c instanceof ProductListSource.Search) {
            C28500r.C28501a.m118419a(this.f67864b, Integer.valueOf(C27609f.C27617h.ic_search_empty), (Integer) null, Integer.valueOf(C27609f.C27627r.search_result_empty), (Integer) null, false, false, (C11289a) null, 122, (Object) null);
        } else {
            C28500r.C28501a.m118419a(this.f67864b, Integer.valueOf(C27609f.C27617h.ic_rayons_pb), (Integer) null, Integer.valueOf(C27609f.C27627r.unavailable_products_department), (Integer) null, false, false, (C11289a) null, 122, (Object) null);
        }
        this.f67864b.showEmpty();
    }

    /* renamed from: F */
    public final void mo81504F(PlpViewModel.C28174b.C28177c cVar) {
        String str;
        if (cVar.mo81961h() instanceof NetworkException) {
            str = this.f67863a.getString(C27609f.C27627r.general_error_no_network_message);
        } else {
            str = this.f67863a.getString(C27609f.C27627r.general_error_parameters_server_not_responding_01);
        }
        String str2 = str;
        Intrinsics.checkNotNullExpressionValue(str2, "when (uiState.error) {\n …_responding_01)\n        }");
        C28500r.C28501a.m118421c(this.f67864b, new MessageComponent.C37154a(C17318d.m79726i(this.f67863a.requireContext(), C27609f.C27617h.ds_il_empty_list), str2, "", this.f67863a.getString(C27609f.C27627r.general_try_again), (String) null, (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), new PlpDelegate$showErrorView$1(this), (C11289a) null, (C11289a) null, 12, (Object) null);
        this.f67864b.showMessageErrorView(false);
    }

    /* renamed from: G */
    public final void mo81505G(C28045e eVar) {
        eVar.mo81612t();
    }

    /* renamed from: H */
    public final C13796h mo81506H(C38115c cVar, PlpOffer plpOffer) {
        PlpOffer.ChannelType channelType;
        if (cVar.mo118855F().size() > 1) {
            return C13796h.C13801e.f33603b;
        }
        if (cVar.mo118855F().size() == 1) {
            if (plpOffer != null) {
                channelType = plpOffer.mo118815s();
            } else {
                channelType = null;
            }
            if (channelType == PlpOffer.ChannelType.HOME_DELIVERY_NAL) {
                return C13796h.C13799c.f33601b;
            }
        }
        return C13796h.C13798b.f33600b;
    }

    /* renamed from: I */
    public final C37369a mo81507I(C27670g gVar, int i) {
        C37369a cVar;
        C27670g gVar2 = gVar;
        int i2 = i;
        if (gVar2 instanceof C27670g.C27676f) {
            Resources resources = this.f67863a.getResources();
            C27670g.C27676f fVar = (C27670g.C27676f) gVar2;
            Intrinsics.checkNotNullExpressionValue(resources, "resources");
            return C27642b.m116299b(fVar, resources, new PlpDelegate$toListable$1(this, gVar2, i2), new PlpDelegate$toListable$2(this, gVar2, i2), new PlpDelegate$toListable$3(this, gVar2, i2), new PlpDelegate$toListable$4(gVar2, this, i2), new PlpDelegate$toListable$5(gVar2, this), new PlpDelegate$toListable$6(gVar2, this), new PlpDelegate$toListable$7(this, gVar2), false, false, this.f67865c instanceof ProductListSource.MixingBottomSheet, new PlpDelegate$toListable$8(gVar2, this), 768, (Object) null);
        }
        if (gVar2 instanceof C27670g.C27671a) {
            C27670g.C27671a aVar = (C27670g.C27671a) gVar2;
            cVar = new C27682b(aVar.mo80368e(), aVar.mo80370f());
        } else if (gVar2 instanceof C27670g.C27672b) {
            C27670g.C27672b bVar = (C27670g.C27672b) gVar2;
            cVar = new C27683c(bVar.mo80376e(), bVar.mo80378f());
        } else if (gVar2 instanceof C27670g.C27673c) {
            return C27685e.m116479a((C27670g.C27673c) gVar2);
        } else {
            if (gVar2 instanceof C27670g.C27674d) {
                String s = C11342l0.m43547d(gVar.getClass()).mo22848s();
                throw new IllegalStateException(s + " should not be used here");
            } else if (gVar2 instanceof C27670g.C27675e) {
                String s2 = C11342l0.m43547d(gVar.getClass()).mo22848s();
                throw new IllegalStateException(s2 + " should not be used here");
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return cVar;
    }

    /* renamed from: J */
    public final List<C37369a> mo81508J(List<? extends C27670g> list, boolean z) {
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            arrayList.add(mo81507I((C27670g) next, i2));
            i = i2;
        }
        if (z) {
            return CollectionsKt___CollectionsKt.m40723z4(arrayList, new ProductCardListLoader.C37367a());
        }
        return arrayList;
    }

    /* renamed from: o */
    public final PlpViewModel mo81509o() {
        return (PlpViewModel) this.f67870h.getValue();
    }

    /* renamed from: p */
    public final void mo81510p(String str) {
        if (!this.f67873k.contains(str)) {
            mo81509o().sendIntent(new PlpViewModel.C28181c.C28189h(str));
            this.f67873k.add(str);
        }
    }

    /* renamed from: q */
    public final void mo81511q(PlpViewModel.C28170a aVar) {
        if (aVar instanceof PlpViewModel.C28170a.C28173c) {
            PlpViewModel.C28170a.C28173c cVar = (PlpViewModel.C28170a.C28173c) aVar;
            QuantityBackDropFragment.C28089a.m117643b(QuantityBackDropFragment.f68038Z, cVar.mo81954j().mo118819v().mo118136f(), Integer.valueOf(cVar.mo81955k()), cVar.mo81953i(), this.f67867e, (BasketType) null, cVar.mo81951h(), (C38115c) null, 80, (Object) null).show(this.f67863a.requireActivity().mo57175g0(), (String) null);
        } else if (aVar instanceof PlpViewModel.C28170a.C28172b) {
            PlpViewModel.C28170a.C28172b bVar = (PlpViewModel.C28170a.C28172b) aVar;
            this.f67866d.mo83838n(C19736g.m91827a(this.f67863a), bVar.mo81941f(), bVar.mo81939e());
        } else if (aVar instanceof PlpViewModel.C28170a.C28171a) {
            mo81513s((PlpViewModel.C28170a.C28171a) aVar);
        }
    }

    /* renamed from: r */
    public final void mo81512r(PlpViewModel.C28174b.C28180f fVar) {
        C11304p<Integer, Integer, C11079d2> pVar = this.f67868f;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(fVar.mo81973m()), Integer.valueOf(fVar.mo81974n()));
        }
        this.f67874l = fVar.mo81971k();
        List<C37369a> J = mo81508J(fVar.mo81971k(), fVar.mo81972l());
        C28045e eVar = this.f67871i;
        if (eVar != null) {
            eVar.mo60670n(J);
        }
        PlpProductAnalytics plpProductAnalytics = this.f67867e;
        ArrayList arrayList = new ArrayList();
        for (C27670g a : fVar.mo81971k()) {
            C38114b a2 = C27668i.m116407a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        plpProductAnalytics.mo80237n(arrayList, this.f67865c);
    }

    /* renamed from: s */
    public final void mo81513s(PlpViewModel.C28170a.C28171a aVar) {
        boolean z;
        mo81502D();
        Throwable d = aVar.mo81932d();
        if (d instanceof RequireSignInThrowable) {
            this.f67866d.mo83841q(this.f67863a);
        } else if (d instanceof CategoryLimitationExceededThrowable) {
            Fragment fragment = this.f67863a;
            NotificationComponent.Variant variant = NotificationComponent.Variant.WARNING;
            CategoryLimit a = ((CategoryLimitationExceededThrowable) aVar.mo81932d()).mo114268a();
            Context requireContext = this.f67863a.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "fragment.requireContext()");
            FragmentKt.m118811B(fragment, variant, C27657a.m116359a(a, requireContext), (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (d instanceof BasketItemQuantityExceededThrowable) {
            C28935i iVar = C28935i.f70940a;
            String message = aVar.mo81932d().getMessage();
            Intrinsics.checkNotNull(message, "null cannot be cast to non-null type kotlin.String");
            C28935i.m119706i(iVar, message, (Throwable) null, 0, 6, (Object) null);
            Fragment fragment2 = this.f67863a;
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string = fragment2.getString(C27609f.C27627r.fec_basket_module_product_quantity_excecced);
            Intrinsics.checkNotNullExpressionValue(string, "fragment.getString(R.str…roduct_quantity_excecced)");
            FragmentKt.m118811B(fragment2, variant2, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (d instanceof BasketThrowable) {
            Fragment fragment3 = this.f67863a;
            NotificationComponent.Variant variant3 = NotificationComponent.Variant.ERROR;
            String string2 = fragment3.getString(((BasketThrowable) aVar.mo81932d()).mo114267a().mo114265q());
            Intrinsics.checkNotNullExpressionValue(string2, "fragment.getString(event…rowable.error.resourceId)");
            FragmentKt.m118811B(fragment3, variant3, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (d instanceof ShoppingListThrowable) {
            C28935i iVar2 = C28935i.f70940a;
            String message2 = aVar.mo81932d().getMessage();
            Intrinsics.checkNotNull(message2, "null cannot be cast to non-null type kotlin.String");
            Throwable cause = aVar.mo81932d().getCause();
            if (cause == null) {
                cause = aVar.mo81932d();
            }
            C28935i.m119705e(iVar2, message2, cause, 0, 4, (Object) null);
            Fragment fragment4 = this.f67863a;
            NotificationComponent.Variant variant4 = NotificationComponent.Variant.WARNING;
            String string3 = fragment4.getString(C27609f.C27627r.general_error_parameters_server_not_responding_03);
            Intrinsics.checkNotNullExpressionValue(string3, "fragment.getString(R.str…server_not_responding_03)");
            FragmentKt.m118811B(fragment4, variant4, string3, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else {
            if (d instanceof BasketClosedStoreThrowable) {
                z = true;
            } else {
                z = d instanceof BasketExpiredFacilityStoreIdThrowable;
            }
            if (z) {
                C19232h activity = this.f67863a.getActivity();
                if (activity != null) {
                    String string4 = this.f67863a.getString(C27609f.C27627r.basket_error_closed_store);
                    Intrinsics.checkNotNullExpressionValue(string4, "fragment.getString(R.str…asket_error_closed_store)");
                    ActivityKt.m118689B(activity, true, string4);
                }
                FragmentKt.m118835w(this.f67863a, (String) null, new PlpDelegate$handleProductListError$1(this), 1, (Object) null);
                this.f67866d.mo83826b(this.f67863a);
            } else if (d instanceof RequireServiceSelectionThrowable) {
                FragmentKt.m118835w(this.f67863a, (String) null, new PlpDelegate$handleProductListError$2(this), 1, (Object) null);
                this.f67866d.mo83826b(this.f67863a);
            } else if (d instanceof NetworkException) {
                C28935i iVar3 = C28935i.f70940a;
                String message3 = aVar.mo81932d().getMessage();
                Intrinsics.checkNotNull(message3, "null cannot be cast to non-null type kotlin.String");
                Throwable cause2 = aVar.mo81932d().getCause();
                if (cause2 == null) {
                    cause2 = aVar.mo81932d();
                }
                C28935i.m119705e(iVar3, message3, cause2, 0, 4, (Object) null);
                Fragment fragment5 = this.f67863a;
                NotificationComponent.Variant variant5 = NotificationComponent.Variant.ERROR;
                String string5 = fragment5.getString(C27609f.C27627r.general_error_no_network_message);
                Intrinsics.checkNotNullExpressionValue(string5, "fragment.getString(R.str…error_no_network_message)");
                FragmentKt.m118811B(fragment5, variant5, string5, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            } else {
                C28935i iVar4 = C28935i.f70940a;
                String message4 = aVar.mo81932d().getMessage();
                Intrinsics.checkNotNull(message4, "null cannot be cast to non-null type kotlin.String");
                Throwable cause3 = aVar.mo81932d().getCause();
                if (cause3 == null) {
                    cause3 = aVar.mo81932d();
                }
                C28935i.m119705e(iVar4, message4, cause3, 0, 4, (Object) null);
                Fragment fragment6 = this.f67863a;
                NotificationComponent.Variant variant6 = NotificationComponent.Variant.ERROR;
                String string6 = fragment6.getString(C27609f.C27627r.general_error_parameters_server_not_responding_03);
                Intrinsics.checkNotNullExpressionValue(string6, "fragment.getString(R.str…server_not_responding_03)");
                FragmentKt.m118811B(fragment6, variant6, string6, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            }
        }
    }

    /* renamed from: t */
    public final void mo81514t(PlpViewModel.C28174b bVar) {
        boolean z;
        this.f67864b.hideLoading();
        this.f67864b.hideErrorView();
        this.f67864b.hideEmpty();
        if (Intrinsics.areEqual((Object) bVar, (Object) PlpViewModel.C28174b.C28178d.f68251b)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) bVar, (Object) PlpViewModel.C28174b.C28179e.f68253b);
        }
        if (z) {
            this.f67864b.showLoading();
        } else if (Intrinsics.areEqual((Object) bVar, (Object) PlpViewModel.C28174b.C28176b.f68247b)) {
            mo81503E();
        } else if (bVar instanceof PlpViewModel.C28174b.C28177c) {
            mo81504F((PlpViewModel.C28174b.C28177c) bVar);
        } else if (bVar instanceof PlpViewModel.C28174b.C28180f) {
            mo81512r((PlpViewModel.C28174b.C28180f) bVar);
        }
    }

    /* renamed from: u */
    public final void mo81515u(RecyclerView recyclerView) {
        recyclerView.mo59613r(new C28011a(this));
    }

    /* renamed from: v */
    public final void mo81516v(Lifecycle.State state, C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        C19499w viewLifecycleOwner = this.f67863a.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new PlpDelegate$launchAndRepeatWithViewLifecycle$1(this, state, pVar, (C11045c<? super PlpDelegate$launchAndRepeatWithViewLifecycle$1>) null), 3, (Object) null);
    }

    /* renamed from: x */
    public final void mo81517x() {
        mo81509o().sendIntent(PlpViewModel.C28181c.C28186e.f68273a);
    }

    /* renamed from: y */
    public final void mo81518y() {
        C28850b q;
        C28045e eVar = this.f67871i;
        if (eVar != null && (q = eVar.mo81609q()) != null) {
            q.mo83964d();
        }
    }

    /* renamed from: z */
    public final void mo81519z(@C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "productList");
        this.f67867e.mo80224a(this.f67865c);
        this.f67867e.mo80225b();
        Resources resources = this.f67863a.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "fragment.resources");
        Resources.Theme theme = this.f67863a.requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "fragment.requireContext().theme");
        C27686f fVar = this.f67876n;
        C27680a aVar = this.f67877o;
        PlpDelegate$onViewCreated$appViewBinder$1 plpDelegate$onViewCreated$appViewBinder$1 = new PlpDelegate$onViewCreated$appViewBinder$1(this);
        PlpDelegate$onViewCreated$appViewBinder$2 plpDelegate$onViewCreated$appViewBinder$2 = new PlpDelegate$onViewCreated$appViewBinder$2(this);
        C19499w viewLifecycleOwner = this.f67863a.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        C28048f fVar2 = new C28048f(recyclerView, resources, theme, fVar, aVar, plpDelegate$onViewCreated$appViewBinder$1, plpDelegate$onViewCreated$appViewBinder$2, C19501x.m90847a(viewLifecycleOwner));
        Context requireContext = this.f67863a.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "fragment.requireContext()");
        C28045e a = C28050g.m117552a(recyclerView, requireContext, fVar2);
        this.f67871i = a;
        recyclerView.setAdapter(a);
        mo81515u(recyclerView);
        C28045e eVar = this.f67871i;
        if (eVar != null) {
            mo81505G(eVar);
        }
        mo81500B(mo81509o(), new PlpDelegate$onViewCreated$2(this));
        mo81499A(mo81509o(), new PlpDelegate$onViewCreated$3(this));
        C28045e eVar2 = this.f67871i;
        if (eVar2 != null) {
            mo81509o().sendIntent(new PlpViewModel.C28181c.C28184c(this.f67865c, eVar2.mo81609q().mo83961a()));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlpDelegate(Fragment fragment, C28500r rVar, ProductListSource productListSource, C28796c cVar, PlpProductAnalytics plpProductAnalytics, C11304p pVar, C28936j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, rVar, productListSource, cVar, plpProductAnalytics, (i & 32) != 0 ? null : pVar, jVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlpDelegate(C28494o oVar, ProductListSource productListSource, C28796c cVar, PlpProductAnalytics plpProductAnalytics, C11304p pVar, C28936j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, productListSource, cVar, plpProductAnalytics, (i & 16) != 0 ? null : pVar, jVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PlpDelegate(@C12579k C28494o<?> oVar, @C12579k ProductListSource productListSource, @C12579k C28796c cVar, @C12579k PlpProductAnalytics plpProductAnalytics, @C12580l C11304p<? super Integer, ? super Integer, C11079d2> pVar, @C12579k C28936j jVar) {
        this(oVar, oVar, productListSource, cVar, plpProductAnalytics, pVar, jVar);
        Intrinsics.checkNotNullParameter(oVar, "fragment");
        Intrinsics.checkNotNullParameter(productListSource, "source");
        Intrinsics.checkNotNullParameter(cVar, "navigator");
        Intrinsics.checkNotNullParameter(plpProductAnalytics, "analytics");
        Intrinsics.checkNotNullParameter(jVar, "fragmentUtil");
    }
}
