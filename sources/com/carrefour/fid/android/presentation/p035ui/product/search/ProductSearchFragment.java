package com.carrefour.fid.android.presentation.p035ui.product.search;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.C0302g;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.core.p057io.SearchHistoryEmptyThrowable;
import com.carrefour.fid.android.core.type.SearchType;
import com.carrefour.fid.android.databinding.C36702g3;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.models.C38529u;
import com.carrefour.fid.android.presentation.models.C38530v;
import com.carrefour.fid.android.presentation.p035ui.product.search.C25576m;
import com.carrefour.fid.android.presentation.p035ui.product.search.adapter.C25557b;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27264a;
import com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchViewModel;
import com.carrefour.fid.android.product.C27607e;
import com.carrefour.fid.android.shared.base.C28502s;
import com.carrefour.fid.android.shared.constant.C28513a;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.presentation.components.decoration.C28852a;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.transition.C31756l;
import dagger.hilt.android.C10164b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\bC\u0010DJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0019\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0019\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\b\u0010\u0013\u001a\u00020\u0003H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\u001a\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u0002070?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006G"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/search/ProductSearchFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/g3;", "Lkotlin/d2;", "initHeader", "initListener", "k1", "Lcom/carrefour/fid/android/presentation/models/u;", "results", "n1", "", "isLoading", "m1", "(Ljava/lang/Boolean;)V", "", "throwable", "l1", "isSearchWithListAvailable", "o1", "f1", "u1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onDestroyView", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchViewModel;", "f", "Lkotlin/z;", "j1", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchViewModel;", "productSearchViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;", "i1", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;", "t1", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;)V", "productSearchAnalyticsViewModel", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "v", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "g1", "()Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "s1", "(Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;)V", "appPreferencesStorage", "Lcom/carrefour/fid/android/presentation/ui/product/search/m;", "w", "Landroidx/navigation/m;", "h1", "()Lcom/carrefour/fid/android/presentation/ui/product/search/m;", "navArgs", "", "x", "Ljava/lang/String;", "currentSearchBarText", "Lcom/carrefour/fid/android/presentation/ui/product/search/adapter/b$a;", "y", "Lcom/carrefour/fid/android/presentation/ui/product/search/adapter/b$a;", "productSearchCallback", "Landroidx/activity/result/g;", "z", "Landroidx/activity/result/g;", "requestPermission", "<init>", "()V", "X", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSearchFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/ProductSearchFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,314:1\n106#2,15:315\n42#3,3:330\n1#4:333\n2624#5,3:334\n262#6,2:337\n262#6,2:339\n262#6,2:341\n*S KotlinDebug\n*F\n+ 1 ProductSearchFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/ProductSearchFragment\n*L\n56#1:315,15\n64#1:330,3\n258#1:334,3\n267#1:337,2\n282#1:339,2\n284#1:341,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.ProductSearchFragment */
public final class ProductSearchFragment extends C25571h<C36702g3> {

    /* renamed from: E0 */
    public static final int f62780E0 = 3;
    @C12579k

    /* renamed from: X */
    public static final C25525a f62781X = new C25525a((DefaultConstructorMarker) null);

    /* renamed from: Y */
    public static final int f62782Y = 8;
    @C12579k

    /* renamed from: Z */
    public static final String f62783Z = "ProductSearchFragment";
    @C12579k

    /* renamed from: f */
    public final C11677z f62784f;
    @Inject

    /* renamed from: g */
    public C27264a f62785g;
    @Inject

    /* renamed from: v */
    public AppPreferencesStorage f62786v;
    @C12579k

    /* renamed from: w */
    public final C19766m f62787w = new C19766m(C11342l0.m43547d(C25576m.class), new ProductSearchFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: x */
    public String f62788x = "";
    @C12579k

    /* renamed from: y */
    public final C25557b.C25558a f62789y = new C25530f(this);
    @C12579k

    /* renamed from: z */
    public final C0302g<String> f62790z = FragmentKt.m118833u(this, new ProductSearchFragment$requestPermission$1(this), new ProductSearchFragment$requestPermission$2(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.ProductSearchFragment$a */
    public static final class C25525a {
        public /* synthetic */ C25525a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25525a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.ProductSearchFragment$b */
    public /* synthetic */ class C25526b implements C19426h0, C11379z {
        public C25526b() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l Throwable th) {
            ProductSearchFragment.this.mo74328l1(th);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductSearchFragment.this, ProductSearchFragment.class, "handleProductSearchError", "handleProductSearchError(Ljava/lang/Throwable;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.ProductSearchFragment$c */
    public /* synthetic */ class C25527c implements C19426h0, C11379z {
        public C25527c() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l Boolean bool) {
            ProductSearchFragment.this.mo74329m1(bool);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductSearchFragment.this, ProductSearchFragment.class, "handleProductSearchLoading", "handleProductSearchLoading(Ljava/lang/Boolean;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.ProductSearchFragment$d */
    public /* synthetic */ class C25528d implements C19426h0, C11379z {
        public C25528d() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l C38529u uVar) {
            ProductSearchFragment.this.mo74330n1(uVar);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductSearchFragment.this, ProductSearchFragment.class, "handleProductSearchResult", "handleProductSearchResult(Lcom/carrefour/fid/android/presentation/models/SuggestionListModel;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.ProductSearchFragment$e */
    public /* synthetic */ class C25529e implements C19426h0, C11379z {
        public C25529e() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l Boolean bool) {
            ProductSearchFragment.this.mo74331o1(bool);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ProductSearchFragment.this, ProductSearchFragment.class, "handleSearchWithList", "handleSearchWithList(Ljava/lang/Boolean;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.ProductSearchFragment$f */
    public static final class C25530f implements C25557b.C25558a {

        /* renamed from: a */
        public final /* synthetic */ ProductSearchFragment f62796a;

        public C25530f(ProductSearchFragment productSearchFragment) {
            this.f62796a = productSearchFragment;
        }

        /* renamed from: a */
        public final void mo74308a(@C12579k C38530v vVar) {
            boolean z;
            Intrinsics.checkNotNullParameter(vVar, C28513a.f68684v);
            if (StringsKt__StringsKt.trim(vVar.mo122184k()).toString().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f62796a.mo74326j1().mo79244s0(vVar);
                C27264a i1 = this.f62796a.mo74323i1();
                i1.mo79298f(vVar);
                i1.mo79299g();
                C19736g.m91827a(this.f62796a).mo58130W(R.id.product_list_search_graph, new C27607e(vVar.mo122184k()).mo80218f());
            }
        }
    }

    public ProductSearchFragment() {
        super(C255241.f62791a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new ProductSearchFragment$special$$inlined$viewModels$default$2(new ProductSearchFragment$special$$inlined$viewModels$default$1(this)));
        this.f62784f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ProductSearchViewModel.class), new ProductSearchFragment$special$$inlined$viewModels$default$3(b), new ProductSearchFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new ProductSearchFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: T0 */
    public static final /* synthetic */ C36702g3 m110031T0(ProductSearchFragment productSearchFragment) {
        return (C36702g3) productSearchFragment.getBinding();
    }

    /* renamed from: p1 */
    public static final void m110043p1(ProductSearchFragment productSearchFragment, Button button, View view) {
        ProductSearchFragment productSearchFragment2 = productSearchFragment;
        Button button2 = button;
        Intrinsics.checkNotNullParameter(productSearchFragment2, "this$0");
        Intrinsics.checkNotNullParameter(button2, "$this_apply");
        String string = productSearchFragment2.getString(R.string.general_research);
        String string2 = productSearchFragment2.getString(R.string.delete_search_ad_text);
        String string3 = productSearchFragment2.getString(R.string.no);
        String string4 = productSearchFragment2.getString(R.string.yes);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_research)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.delete_search_ad_text)");
        FragmentKt.m118838z(productSearchFragment2, string, string2, (String) null, (C11289a) null, string4, false, new ProductSearchFragment$initListener$1$1$1(productSearchFragment2, button2), string3, (C11289a) null, (C11289a) null, (Drawable) null, 0, 3884, (Object) null);
    }

    /* renamed from: q1 */
    public static final void m110044q1(ProductSearchFragment productSearchFragment, View view) {
        Intrinsics.checkNotNullParameter(productSearchFragment, "this$0");
        productSearchFragment.mo74323i1().mo79296d();
        FragmentKt.m118823k(productSearchFragment, C25578n.f62855a.mo74456a());
    }

    /* renamed from: r1 */
    public static final boolean m110045r1(View view, MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: f1 */
    public final void mo74320f1() {
        C25557b bVar;
        TextView textView = ((C36702g3) getBinding()).f90891j;
        textView.setVisibility(0);
        textView.setText(getString(R.string.product_search_subtitle_empty));
        ((C36702g3) getBinding()).f90883b.setVisibility(8);
        RecyclerView.Adapter adapter = ((C36702g3) getBinding()).f90885d.getAdapter();
        if (adapter instanceof C25557b) {
            bVar = (C25557b) adapter;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            ProductSearchViewModel j1 = mo74326j1();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            bVar.mo74397o(j1.mo79247v0(requireContext));
        }
    }

    @C12579k
    /* renamed from: g1 */
    public final AppPreferencesStorage mo74321g1() {
        AppPreferencesStorage appPreferencesStorage = this.f62786v;
        if (appPreferencesStorage != null) {
            return appPreferencesStorage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appPreferencesStorage");
        return null;
    }

    /* renamed from: h1 */
    public final C25576m mo74322h1() {
        return (C25576m) this.f62787w.getValue();
    }

    @C12579k
    /* renamed from: i1 */
    public final C27264a mo74323i1() {
        C27264a aVar = this.f62785g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productSearchAnalyticsViewModel");
        return null;
    }

    public final void initHeader() {
        ((C36702g3) getBinding()).f90886e.setContent(C8553b.m31049c(966426362, true, new ProductSearchFragment$initHeader$1(this)));
    }

    public final void initListener() {
        Button button = ((C36702g3) getBinding()).f90883b;
        button.setVisibility(8);
        button.setOnClickListener(new C25574k(this, button));
        ((C36702g3) getBinding()).f90884c.setOnClickListener(new C25575l(this));
    }

    /* renamed from: j1 */
    public final ProductSearchViewModel mo74326j1() {
        return (ProductSearchViewModel) this.f62784f.getValue();
    }

    /* renamed from: k1 */
    public final void mo74327k1() {
        mo74323i1().mo79295c();
        C19736g.m91827a(this).mo58152q0();
    }

    /* renamed from: l1 */
    public final void mo74328l1(Throwable th) {
        if (th != null) {
            if (th instanceof SearchHistoryEmptyThrowable) {
                C28935i iVar = C28935i.f70940a;
                String message = ((SearchHistoryEmptyThrowable) th).getMessage();
                Intrinsics.checkNotNull(message, "null cannot be cast to non-null type kotlin.String");
                C28935i.m119704b(iVar, message, (Throwable) null, 0, 6, (Object) null);
            } else {
                C28935i iVar2 = C28935i.f70940a;
                String message2 = th.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                C28935i.m119705e(iVar2, message2, th, 0, 4, (Object) null);
            }
            mo74320f1();
        }
    }

    /* renamed from: m1 */
    public final void mo74329m1(Boolean bool) {
        int i;
        ProgressBar progressBar = ((C36702g3) getBinding()).f90889h;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressBarProductSearch");
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        if (r3 != true) goto L_0x00a9;
     */
    /* renamed from: n1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74330n1(com.carrefour.fid.android.presentation.models.C38529u r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00bd
            java.util.List r0 = r7.mo122169g()
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 == 0) goto L_0x001a
            goto L_0x00bd
        L_0x001a:
            androidx.viewbinding.b r0 = r6.getBinding()
            com.carrefour.fid.android.databinding.g3 r0 = (com.carrefour.fid.android.databinding.C36702g3) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f90885d
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            boolean r3 = r0 instanceof com.carrefour.fid.android.presentation.p035ui.product.search.adapter.C25557b
            if (r3 == 0) goto L_0x002d
            com.carrefour.fid.android.presentation.ui.product.search.adapter.b r0 = (com.carrefour.fid.android.presentation.p035ui.product.search.adapter.C25557b) r0
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            com.carrefour.fid.android.presentation.models.SuggestionType r3 = r7.mo122170h()
            com.carrefour.fid.android.presentation.models.SuggestionType r4 = com.carrefour.fid.android.presentation.models.SuggestionType.HISTORY
            if (r3 != r4) goto L_0x0057
            androidx.viewbinding.b r1 = r6.getBinding()
            com.carrefour.fid.android.databinding.g3 r1 = (com.carrefour.fid.android.databinding.C36702g3) r1
            android.widget.TextView r1 = r1.f90891j
            r1.setVisibility(r2)
            r3 = 2131953568(0x7f1307a0, float:1.954361E38)
            java.lang.String r3 = r6.getString(r3)
            r1.setText(r3)
            androidx.viewbinding.b r1 = r6.getBinding()
            com.carrefour.fid.android.databinding.g3 r1 = (com.carrefour.fid.android.databinding.C36702g3) r1
            android.widget.Button r1 = r1.f90883b
            r1.setVisibility(r2)
            goto L_0x00b3
        L_0x0057:
            androidx.viewbinding.b r3 = r6.getBinding()
            com.carrefour.fid.android.databinding.g3 r3 = (com.carrefour.fid.android.databinding.C36702g3) r3
            android.widget.TextView r3 = r3.f90891j
            r4 = 8
            r3.setVisibility(r4)
            androidx.viewbinding.b r3 = r6.getBinding()
            com.carrefour.fid.android.databinding.g3 r3 = (com.carrefour.fid.android.databinding.C36702g3) r3
            android.widget.Button r3 = r3.f90883b
            r3.setVisibility(r4)
            if (r0 == 0) goto L_0x00a9
            java.util.List r3 = r0.getList()
            if (r3 == 0) goto L_0x00a9
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0088
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0088
        L_0x0086:
            r3 = r1
            goto L_0x00a6
        L_0x0088:
            java.util.Iterator r3 = r3.iterator()
        L_0x008c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r3.next()
            com.carrefour.fid.android.presentation.models.v r4 = (com.carrefour.fid.android.presentation.models.C38530v) r4
            com.carrefour.fid.android.presentation.models.SuggestionType r4 = r4.mo122185l()
            com.carrefour.fid.android.presentation.models.SuggestionType r5 = com.carrefour.fid.android.presentation.models.SuggestionType.SUGGESTION
            if (r4 != r5) goto L_0x00a2
            r4 = r1
            goto L_0x00a3
        L_0x00a2:
            r4 = r2
        L_0x00a3:
            if (r4 == 0) goto L_0x008c
            r3 = r2
        L_0x00a6:
            if (r3 != r1) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r1 = r2
        L_0x00aa:
            if (r1 == 0) goto L_0x00b3
            com.carrefour.fid.android.presentation.viewmodels.product.search.a r1 = r6.mo74323i1()
            r1.mo79300h()
        L_0x00b3:
            if (r0 == 0) goto L_0x00bc
            java.util.List r7 = r7.mo122169g()
            r0.mo74397o(r7)
        L_0x00bc:
            return
        L_0x00bd:
            r6.mo74320f1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.product.search.ProductSearchFragment.mo74330n1(com.carrefour.fid.android.presentation.models.u):void");
    }

    /* renamed from: o1 */
    public final void mo74331o1(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.FALSE)) {
            Group group = ((C36702g3) getBinding()).f90888g;
            Intrinsics.checkNotNullExpressionValue(group, "binding.productSearchWithListViewGroup");
            group.setVisibility(8);
        } else if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            Group group2 = ((C36702g3) getBinding()).f90888g;
            Intrinsics.checkNotNullExpressionValue(group2, "binding.productSearchWithListViewGroup");
            group2.setVisibility(0);
        }
    }

    public void onDestroyView() {
        ProductSearchViewModel j1 = mo74326j1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C28502s.C28503a.m118425a(j1, viewLifecycleOwner, (Boolean) null, 2, (Object) null);
        super.onDestroyView();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new ProductSearchFragment$onViewCreated$1(this));
        mo74323i1().mo79299g();
        view.setOnTouchListener(new C25573j());
        FragmentExtensionKt.m58757h(this);
        initHeader();
        initListener();
        if (mo74322h1().mo74441g()) {
            setSharedElementEnterTransition(new C31756l());
        }
        RecyclerView recyclerView = ((C36702g3) getBinding()).f90885d;
        Bundle bundle2 = null;
        recyclerView.setItemAnimator((RecyclerView.C20069l) null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new C25557b(this.f62789y, (List) null, 2, (DefaultConstructorMarker) null));
        recyclerView.mo59589n(new C28852a(1, false, 0, 6, (DefaultConstructorMarker) null));
        ((C36702g3) getBinding()).f90889h.setVisibility(8);
        ProductSearchViewModel j1 = mo74326j1();
        j1.mo83418c0().mo57491k(getViewLifecycleOwner(), new C25526b());
        j1.mo83419d0().mo57491k(getViewLifecycleOwner(), new C25527c());
        j1.mo79249x0().mo57491k(getViewLifecycleOwner(), new C25528d());
        j1.mo79250y0().mo57491k(getViewLifecycleOwner(), new C25529e());
        j1.mo79245t0();
        if (this.f62788x.length() >= 3) {
            j1.mo79241E0(this.f62788x);
        } else {
            j1.mo79240D0();
        }
        C19232h requireActivity = requireActivity();
        if (requireActivity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) requireActivity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null && bottomNavActivity.mo121083A1() >= 2) {
            ProductSearchViewModel j12 = mo74326j1();
            Bundle arguments = getArguments();
            if (arguments != null) {
                C25576m.C25577a aVar = C25576m.f62851c;
                Intrinsics.checkNotNullExpressionValue(arguments, "it");
                bundle2 = aVar.mo74446a(arguments).mo74440f();
            }
            j12.mo79242F0(bundle2);
        }
        mo74323i1().mo79294b(SearchType.EVENT_SEARCH_CLASSIC);
    }

    /* renamed from: s1 */
    public final void mo74332s1(@C12579k AppPreferencesStorage appPreferencesStorage) {
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "<set-?>");
        this.f62786v = appPreferencesStorage;
    }

    /* renamed from: t1 */
    public final void mo74333t1(@C12579k C27264a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f62785g = aVar;
    }

    /* renamed from: u1 */
    public final void mo74334u1() {
        String string = getString(R.string.scan_bar_dialog_title);
        String string2 = getString(R.string.scan_bar_dialog_message);
        Drawable h = FragmentKt.m118820h(this, R.drawable.background_search_bar, (Integer) null, 2, (Object) null);
        String string3 = getString(R.string.general_refuse);
        String string4 = getString(R.string.ok_uppercase);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.scan_bar_dialog_title)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.scan_bar_dialog_message)");
        FragmentKt.m118838z(this, string, string2, string3, ProductSearchFragment$showPermissionExplanationDialog$1.f62797f, string4, false, new ProductSearchFragment$showPermissionExplanationDialog$2(this), (String) null, (C11289a) null, (C11289a) null, h, 0, 2976, (Object) null);
    }
}
