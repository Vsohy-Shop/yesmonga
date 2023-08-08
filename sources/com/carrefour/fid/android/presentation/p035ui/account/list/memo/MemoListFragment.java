package com.carrefour.fid.android.presentation.p035ui.account.list.memo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.core.type.C36368a;
import com.carrefour.fid.android.databinding.C36811r2;
import com.carrefour.fid.android.design.components.type.CheckboxState;
import com.carrefour.fid.android.design.components.widgets.CheckboxComponent;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.list.C37263c;
import com.carrefour.fid.android.design.components.widgets.list.C37264d;
import com.carrefour.fid.android.design.components.widgets.list.ListItemRecyclerView;
import com.carrefour.fid.android.presentation.models.C38495l;
import com.carrefour.fid.android.presentation.p035ui.account.list.C22947b;
import com.carrefour.fid.android.presentation.p035ui.product.search.result.ProductSearchWithListResultFragment;
import com.carrefour.fid.android.presentation.viewmodels.account.list.memo.C25835a;
import com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewSpecialEvent;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27280k;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.p046io.EmptyListThrowable;
import com.carrefour.fid.android.shared.p046io.RequireSignInThrowable;
import com.carrefour.fid.android.shared.p046io.SearchWithListResultThrowable;
import com.carrefour.fid.android.shared.util.events.C28928c;
import com.carrefour.fid.android.shared.util.events.EventLiveData;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00052\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J8\u0010\u001c\u001a\u00020\u00052.\u0010\u001b\u001a*\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00130\u0018j\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0013`\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u001a\u0010'\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0005H\u0014R\"\u00102\u001a\u00020+8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010@\u001a\u00020;8BX\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006I"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/list/memo/MemoListFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/r2;", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel$c;", "state", "Lkotlin/d2;", "i1", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel$d;", "event", "h1", "initHeader", "d1", "", "throwable", "a1", "", "isLoading", "b1", "(Ljava/lang/Boolean;)V", "", "Lcom/carrefour/fid/android/presentation/models/l;", "list", "c1", "Z0", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "resultMap", "e1", "k1", "Landroid/view/ViewStub;", "emptyLayout", "errorMessageLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onPause", "j1", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/a;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/a;", "W0", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/a;", "l1", "(Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/a;)V", "accountListStoreMemoAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/k;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/k;", "Y0", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/search/k;", "m1", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/search/k;)V", "productSearchWithListRecommendationResultsAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel;", "v", "Lkotlin/z;", "X0", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/list/memo/MemoListViewModel;", "listViewModel", "Landroidx/compose/runtime/z0;", "w", "Landroidx/compose/runtime/z0;", "shouldRequestFocus", "<init>", "()V", "x", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nMemoListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoListFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/list/memo/MemoListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n106#2,15:404\n168#3,7:419\n183#3,6:426\n262#4,2:432\n262#4,2:434\n262#4,2:436\n262#4,2:438\n262#4,2:444\n1549#5:440\n1620#5,3:441\n*S KotlinDebug\n*F\n+ 1 MemoListFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/list/memo/MemoListFragment\n*L\n83#1:404,15\n130#1:419,7\n131#1:426,6\n231#1:432,2\n236#1:434,2\n268#1:436,2\n286#1:438,2\n360#1:444,2\n322#1:440\n322#1:441,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.memo.MemoListFragment */
public final class MemoListFragment extends C22981a<C36811r2> {
    @C12579k

    /* renamed from: x */
    public static final C22967a f58605x = new C22967a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f58606y = 8;
    @C12579k

    /* renamed from: z */
    public static final String f58607z = "AccountListStoreMemoFragment";
    @Inject

    /* renamed from: f */
    public C25835a f58608f;
    @Inject

    /* renamed from: g */
    public C27280k f58609g;
    @C12579k

    /* renamed from: v */
    public final C11677z f58610v;
    @C12579k

    /* renamed from: w */
    public final C8700z0<Boolean> f58611w = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.memo.MemoListFragment$a */
    public static final class C22967a {
        public /* synthetic */ C22967a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ MemoListFragment m103397b(C22967a aVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            return aVar.mo67555a(bundle);
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final MemoListFragment mo67555a(@C12580l Bundle bundle) {
            MemoListFragment memoListFragment = new MemoListFragment();
            memoListFragment.setArguments(bundle);
            return memoListFragment;
        }

        public C22967a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.memo.MemoListFragment$b */
    public /* synthetic */ class C22968b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MemoListViewSpecialEvent.values().length];
            try {
                iArr[MemoListViewSpecialEvent.MemoAdded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.memo.MemoListFragment$c */
    public static final class C22969c implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f58613a;

        public C22969c(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f58613a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f58613a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f58613a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public MemoListFragment() {
        super(C229661.f58612a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new MemoListFragment$special$$inlined$viewModels$default$2(new MemoListFragment$special$$inlined$viewModels$default$1(this)));
        this.f58610v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(MemoListViewModel.class), new MemoListFragment$special$$inlined$viewModels$default$3(b), new MemoListFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new MemoListFragment$special$$inlined$viewModels$default$5(this, b));
    }

    @C12579k
    @C11384m
    /* renamed from: f1 */
    public static final MemoListFragment m103379f1(@C12580l Bundle bundle) {
        return f58605x.mo67555a(bundle);
    }

    /* renamed from: g1 */
    public static final void m103380g1(MemoListFragment memoListFragment, View view) {
        Intrinsics.checkNotNullParameter(memoListFragment, "this$0");
        ((C36811r2) memoListFragment.getBinding()).f91564b.setVisibility(8);
        memoListFragment.mo67535X0().sendIntent(MemoListViewModel.C25826e.C25831e.f63259b);
        memoListFragment.mo67534W0().mo75010g();
    }

    @C12579k
    /* renamed from: W0 */
    public final C25835a mo67534W0() {
        C25835a aVar = this.f58608f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountListStoreMemoAnalyticsViewModel");
        return null;
    }

    /* renamed from: X0 */
    public final MemoListViewModel mo67535X0() {
        return (MemoListViewModel) this.f58610v.getValue();
    }

    @C12579k
    /* renamed from: Y0 */
    public final C27280k mo67536Y0() {
        C27280k kVar = this.f58609g;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productSearchWithListRecommendationResultsAnalyticsViewModel");
        return null;
    }

    /* renamed from: Z0 */
    public final void mo67537Z0() {
        String string = getString(R.string.memo_popin_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.memo_popin_message)");
        FragmentKt.m118838z(this, string, new String(), getString(R.string.memo_popin_choice1), new MemoListFragment$handleDeleteAllClick$1(this), getString(R.string.memo_popin_choice2), false, new MemoListFragment$handleDeleteAllClick$2(this), getString(R.string.general_cancel), MemoListFragment$handleDeleteAllClick$3.f58622f, (C11289a) null, (Drawable) null, 0, 3616, (Object) null);
    }

    /* renamed from: a1 */
    public final void mo67538a1(Throwable th) {
        Throwable th2 = th;
        if (th2 != null) {
            ((C36811r2) getBinding()).f91564b.setVisibility(8);
            ((C36811r2) getBinding()).f91565c.setVisibility(8);
            ComposeView composeView = ((C36811r2) getBinding()).f91567e;
            Intrinsics.checkNotNullExpressionValue(composeView, "binding.memoListInput");
            composeView.setVisibility(0);
            ComposeView composeView2 = ((C36811r2) getBinding()).f91567e;
            Intrinsics.checkNotNullExpressionValue(composeView2, "binding.memoListInput");
            ViewKt.m119012y(composeView2);
            if (th2 instanceof RequireSignInThrowable) {
                ComposeView composeView3 = ((C36811r2) getBinding()).f91567e;
                Intrinsics.checkNotNullExpressionValue(composeView3, "binding.memoListInput");
                composeView3.setVisibility(8);
                hideErrorView();
                C28500r.C28501a.m118419a(this, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(R.string.shopping_my_list_memos_login_button), true, false, new MemoListFragment$handleMemoListError$1(this), 39, (Object) null);
                showEmpty();
                mo67534W0().mo75013j();
            } else if (th2 instanceof EmptyListThrowable) {
                hideErrorView();
                C28500r.C28501a.m118419a(this, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(R.string.shopping_list_memo_button), true, false, new MemoListFragment$handleMemoListError$2(this), 39, (Object) null);
                showEmpty();
            } else if (th2 instanceof SearchWithListResultThrowable) {
                hideEmpty();
                hideLoading();
                ComposeView composeView4 = ((C36811r2) getBinding()).f91567e;
                Intrinsics.checkNotNullExpressionValue(composeView4, "binding.memoListInput");
                composeView4.setVisibility(8);
                Drawable i = C17318d.m79726i(requireContext(), R.drawable.ic_basket_pb);
                String string = getString(R.string.search_with_list_result_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.search_with_list_result_error)");
                C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i, string, (String) null, (String) null, getString(R.string.general_try_again), (String) null, MessageComponent.Type.ERROR, 0, (Drawable) null, C22132b.f56831b, (DefaultConstructorMarker) null), (C11289a) null, (C11289a) null, (C11289a) null, 14, (Object) null);
                C28500r.C28501a.m118423e(this, false, 1, (Object) null);
                mo67534W0().mo75004a();
            } else {
                hideEmpty();
                ComposeView composeView5 = ((C36811r2) getBinding()).f91567e;
                Intrinsics.checkNotNullExpressionValue(composeView5, "binding.memoListInput");
                composeView5.setVisibility(8);
                Drawable i2 = C17318d.m79726i(requireContext(), R.drawable.ic_basket_pb);
                String string2 = getString(R.string.shopping_list_memo_error_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.shopping_list_memo_error_title)");
                C28500r.C28501a.m118421c(this, new MessageComponent.C37154a(i2, string2, (String) null, (String) null, getString(R.string.general_try_again), (String) null, (MessageComponent.Type) null, 0, (Drawable) null, 448, (DefaultConstructorMarker) null), (C11289a) null, (C11289a) null, (C11289a) null, 14, (Object) null);
                C28500r.C28501a.m118423e(this, false, 1, (Object) null);
                mo67534W0().mo75004a();
            }
        }
    }

    /* renamed from: b1 */
    public final void mo67539b1(Boolean bool) {
        if (bool == null) {
            return;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.FALSE)) {
            hideLoading();
        } else if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            hideErrorView();
            hideEmpty();
            showLoading();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c1 */
    public final void mo67540c1(List<C38495l> list) {
        CheckboxState checkboxState;
        if (list == null) {
            return;
        }
        if (list.isEmpty()) {
            mo67538a1(new EmptyListThrowable());
            return;
        }
        hideEmpty();
        hideErrorView();
        mo67534W0().mo75005b();
        ListItemRecyclerView listItemRecyclerView = ((C36811r2) getBinding()).f91565c;
        Iterable<C38495l> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C38495l lVar : iterable) {
            String Z = lVar.mo122102Z();
            C36368a X = lVar.mo122101X();
            C36368a.C36369a aVar = C36368a.C36369a.f89966c;
            if (Intrinsics.areEqual((Object) X, (Object) aVar)) {
                checkboxState = CheckboxState.CHECKED;
            } else {
                checkboxState = CheckboxState.UNCHECKED;
            }
            arrayList.add(new C37264d(new CheckboxComponent.C37150a(false, checkboxState, Z, Intrinsics.areEqual((Object) lVar.mo122101X(), (Object) aVar), (Integer) null, 17, (DefaultConstructorMarker) null), new MemoListFragment$handleMemoListResult$1$1$1(this, lVar), new MemoListFragment$handleMemoListResult$1$1$2(this, lVar)));
        }
        String string = getString(R.string.shopping_list_memo_delete_all);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.shopping_list_memo_delete_all)");
        listItemRecyclerView.setList(CollectionsKt___CollectionsKt.m40723z4(arrayList, new C37263c(string, new MemoListFragment$handleMemoListResult$1$2(this))));
        Intrinsics.checkNotNullExpressionValue(listItemRecyclerView, "handleMemoListResult$lambda$8");
        com.carrefour.fid.android.design.components.extension.ViewKt.m152123e(listItemRecyclerView, (Integer) null, false, (C11289a) null, 7, (Object) null);
        ComposeView composeView = ((C36811r2) getBinding()).f91567e;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.memoListInput");
        composeView.setVisibility(0);
        ((C36811r2) getBinding()).f91564b.setVisibility(0);
    }

    /* renamed from: d1 */
    public final void mo67541d1() {
        ComposeView composeView = ((C36811r2) getBinding()).f91567e;
        composeView.setContent(C8553b.m31049c(2020068162, true, new MemoListFragment$initMemoListInput$1$1(this, composeView)));
    }

    /* renamed from: e1 */
    public final void mo67542e1(HashMap<String, List<String>> hashMap) {
        C22947b.C22949b bVar = C22947b.f58565a;
        Bundle bundle = new Bundle();
        bundle.putSerializable(ProductSearchWithListResultFragment.f62914X, hashMap);
        C11079d2 d2Var = C11079d2.f28267a;
        FragmentKt.m118823k(this, bVar.mo67505b(bundle, 1));
    }

    @C12579k
    public ViewStub emptyLayout() {
        ViewStub viewStub = ((C36811r2) getBinding()).f91569g;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubAccountListStoreMemoEmpty");
        return viewStub;
    }

    @C12580l
    public ViewStub errorMessageLayout() {
        return ((C36811r2) getBinding()).f91570h;
    }

    /* renamed from: h1 */
    public final void mo67545h1(MemoListViewModel.C25825d dVar) {
        if (dVar instanceof MemoListViewModel.C25815a) {
            mo67542e1(((MemoListViewModel.C25815a) dVar).mo74929d());
        }
    }

    /* renamed from: i1 */
    public final void mo67546i1(MemoListViewModel.C25823c cVar) {
        mo67539b1(Boolean.valueOf(cVar.isLoading()));
        List<C38495l> n = cVar.mo74973n();
        if (n != null) {
            mo67540c1(n);
        }
        Throwable m = cVar.mo74972m();
        if (m != null) {
            mo67534W0().mo75009f();
            mo67538a1(m);
        }
        MemoListViewSpecialEvent p = cVar.mo74975p();
        if (p != null && C22968b.$EnumSwitchMapping$0[p.ordinal()] == 1) {
            mo67549k1();
        }
    }

    public final void initHeader() {
        FragmentExtensionKt.m58757h(this);
        ((C36811r2) getBinding()).f91566d.setContent(C8553b.m31049c(2022252244, true, new MemoListFragment$initHeader$1(this)));
    }

    /* renamed from: j1 */
    public void mo67548j1() {
        mo67535X0().sendIntent(MemoListViewModel.C25826e.C25830d.f63257b);
    }

    /* renamed from: k1 */
    public final void mo67549k1() {
        ((C36811r2) getBinding()).f91565c.mo59479G1(((C36811r2) getBinding()).f91565c.getList().size() - 1);
    }

    /* renamed from: l1 */
    public final void mo67550l1(@C12579k C25835a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f58608f = aVar;
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36811r2) getBinding()).f91568f;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerAccountListStoreMemo");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo67552m1(@C12579k C27280k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f58609g = kVar;
    }

    public void onPause() {
        ((C36811r2) getBinding()).f91567e.clearFocus();
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        FragmentExtensionKt.m58758i(requireActivity);
        mo67539b1(Boolean.TRUE);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        mo67534W0().mo75006c();
        mo67535X0().sendIntent(MemoListViewModel.C25826e.C25830d.f63257b);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        initHeader();
        mo67541d1();
        ((C36811r2) getBinding()).f91564b.setOnClickListener(new C22982b(this));
        C28928c<String> a = EventLiveData.f70863b.mo84199a(C36168a.f89273a);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        a.mo57491k(viewLifecycleOwner, new C22969c(new MemoListFragment$onViewCreated$2(this)));
        MemoListViewModel X0 = mo67535X0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new MemoListFragment$onViewCreated$$inlined$processState$1(this, X0, (C11045c) null, this), 3, (Object) null);
        MemoListViewModel X02 = mo67535X0();
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner3), (CoroutineContext) null, (CoroutineStart) null, new MemoListFragment$onViewCreated$$inlined$processEvent$1(this, X02, (C11045c) null, this), 3, (Object) null);
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo67548j1();
        return C11079d2.f28267a;
    }
}
