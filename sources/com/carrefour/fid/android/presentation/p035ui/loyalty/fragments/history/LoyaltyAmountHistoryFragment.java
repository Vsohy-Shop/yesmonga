package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.history;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.C16934c;
import androidx.core.content.C17318d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.SwipeRefreshLayoutKt;
import com.carrefour.fid.android.databinding.C36741k2;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.loyalty.presentation.models.OperationHistoryModel;
import com.carrefour.fid.android.loyalty.presentation.models.TransactionsModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.history.LoyaltyAmountHistoryViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.history.mvi.LoyaltyAmountHistory;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.loyalty.adapters.C24225c;
import com.carrefour.fid.android.presentation.p035ui.loyalty.adapters.C24228e;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.p046io.NetWorkResponseThrowable;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.utils.C22698a;
import com.carrefour.fid.android.widget.C22841b;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bK\u0010LJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u001c\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0002J\"\u0010\u0018\u001a\u00020\u00032\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0012\u0010$\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u001a\u0010)\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016J\b\u0010*\u001a\u00020\u0003H\u0016R\u001b\u00100\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b@\u0010AR>\u0010G\u001a*\u0012\u0004\u0012\u00020?\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00130Cj\u0014\u0012\u0004\u0012\u00020?\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u0013`D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006M"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/history/LoyaltyAmountHistoryFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/k2;", "Lkotlin/d2;", "o1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UiEvent;", "uiEvent", "n1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/mvi/LoyaltyAmountHistory$UIState;", "uiState", "p1", "initListener", "", "historyImage", "historyWording", "e1", "b1", "groupPosition", "i1", "", "Lcom/carrefour/fid/android/loyalty/presentation/models/OperationHistoryModel;", "cardOperationHistory", "Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionsModel;", "cardTransactions", "d1", "h1", "loyaltyBalance", "g1", "q1", "s1", "j1", "", "isVisible", "r1", "", "exception", "m1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/history/c;", "f", "Landroidx/navigation/m;", "k1", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/history/c;", "args", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/LoyaltyAmountHistoryViewModel;", "g", "Lkotlin/z;", "l1", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/history/LoyaltyAmountHistoryViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/loyalty/adapters/c;", "v", "Lcom/carrefour/fid/android/presentation/ui/loyalty/adapters/c;", "mAdapter", "Lcom/carrefour/fid/android/presentation/ui/loyalty/adapters/e;", "w", "Lcom/carrefour/fid/android/presentation/ui/loyalty/adapters/e;", "mExpandableListAdapter", "", "x", "Ljava/lang/String;", "headerDateTitle", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "y", "Ljava/util/HashMap;", "listDate", "z", "Z", "isExpendable", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLoyaltyAmountHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyAmountHistoryFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/history/LoyaltyAmountHistoryFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n42#2,3:303\n106#3,15:306\n168#4,7:321\n183#4,6:328\n75#5,2:334\n75#5,2:336\n75#5,2:338\n75#5,2:344\n75#5,2:346\n766#6:340\n857#6,2:341\n1054#6:343\n*S KotlinDebug\n*F\n+ 1 LoyaltyAmountHistoryFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/history/LoyaltyAmountHistoryFragment\n*L\n45#1:303,3\n46#1:306,15\n71#1:321,7\n72#1:328,6\n135#1:334,2\n140#1:336,2\n145#1:338,2\n238#1:344,2\n242#1:346,2\n203#1:340\n203#1:341,2\n204#1:343\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.history.LoyaltyAmountHistoryFragment */
public final class LoyaltyAmountHistoryFragment extends C24516a<C36741k2> {

    /* renamed from: X */
    public static final int f61025X = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f61026f = new C19766m(C11342l0.m43547d(C24518c.class), new LoyaltyAmountHistoryFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: g */
    public final C11677z f61027g;

    /* renamed from: v */
    public C24225c f61028v;

    /* renamed from: w */
    public C24228e f61029w;

    /* renamed from: x */
    public String f61030x;
    @C12579k

    /* renamed from: y */
    public HashMap<String, List<String>> f61031y;

    /* renamed from: z */
    public boolean f61032z;

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LoyaltyAmountHistoryFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/history/LoyaltyAmountHistoryFragment\n*L\n1#1,328:1\n204#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.history.LoyaltyAmountHistoryFragment$a */
    public static final class C24495a<T> implements Comparator {
        public final int compare(T t, T t2) {
            C28932h.C28933a aVar = C28932h.f70914a;
            return C11006g.m42424l(aVar.mo84230U(((OperationHistoryModel) t2).getLoyaltyTransactionDate()), aVar.mo84230U(((OperationHistoryModel) t).getLoyaltyTransactionDate()));
        }
    }

    public LoyaltyAmountHistoryFragment() {
        super(C244941.f61033a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C24512x4d8bd80e(new C24511x4d8bd80d(this)));
        this.f61027g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(LoyaltyAmountHistoryViewModel.class), new C24513x4d8bd80f(b), new C24514x4d8bd810((C11289a) null, b), new C24515x4d8bd811(this, b));
        this.f61031y = new HashMap<>();
    }

    /* renamed from: S0 */
    public static final /* synthetic */ C36741k2 m107349S0(LoyaltyAmountHistoryFragment loyaltyAmountHistoryFragment) {
        return (C36741k2) loyaltyAmountHistoryFragment.getBinding();
    }

    /* renamed from: c1 */
    public static final boolean m107358c1(ExpandableListView expandableListView, View view, int i, long j) {
        C22841b bVar = C22841b.f58414a;
        Intrinsics.checkNotNullExpressionValue(expandableListView, C16934c.f44493V1);
        bVar.mo67303a(expandableListView, i);
        return false;
    }

    /* renamed from: f1 */
    public static /* synthetic */ void m107359f1(LoyaltyAmountHistoryFragment loyaltyAmountHistoryFragment, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = R.drawable.ic_fidelite_teasing;
        }
        if ((i3 & 2) != 0) {
            i2 = R.string.loyalty_history_teasing;
        }
        loyaltyAmountHistoryFragment.mo71646e1(i, i2);
    }

    /* renamed from: b1 */
    public final void mo71644b1() {
        String str;
        C24228e eVar = null;
        ArrayList x = C28932h.C28933a.m119658x(C28932h.f70914a, 0, 1, (Object) null);
        Object obj = x.get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "lastMonth[NUMBER_ZERO]");
        String str2 = (String) obj;
        this.f61030x = str2;
        HashMap<String, List<String>> hashMap = this.f61031y;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerDateTitle");
            str2 = null;
        }
        hashMap.put(str2, x);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        LoyaltyAmountHistoryFragment$bindExpandableListView$1 loyaltyAmountHistoryFragment$bindExpandableListView$1 = new LoyaltyAmountHistoryFragment$bindExpandableListView$1(this);
        LoyaltyAmountHistoryFragment$bindExpandableListView$2 loyaltyAmountHistoryFragment$bindExpandableListView$2 = new LoyaltyAmountHistoryFragment$bindExpandableListView$2(this);
        String str3 = this.f61030x;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerDateTitle");
            str = null;
        } else {
            str = str3;
        }
        this.f61029w = new C24228e(requireContext, loyaltyAmountHistoryFragment$bindExpandableListView$1, loyaltyAmountHistoryFragment$bindExpandableListView$2, str, this.f61031y, x);
        ExpandableListView expandableListView = ((C36741k2) getBinding()).f91119c;
        int right = expandableListView.getRight();
        Context context = expandableListView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        expandableListView.setIndicatorBounds(right + ViewKt.m119003p(context, 130), expandableListView.getWidth());
        expandableListView.bringToFront();
        expandableListView.setBackground(C17318d.m79726i(expandableListView.getContext(), R.drawable.loyaty_date_background));
        expandableListView.setOnGroupClickListener(new C24517b());
        C24228e eVar2 = this.f61029w;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mExpandableListAdapter");
        } else {
            eVar = eVar2;
        }
        expandableListView.setAdapter(eVar);
    }

    /* renamed from: d1 */
    public final void mo71645d1(List<OperationHistoryModel> list, TransactionsModel transactionsModel) {
        boolean z;
        boolean z2;
        if (transactionsModel != null) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            C24225c cVar = null;
            if (z) {
                m107359f1(this, 0, 0, 3, (Object) null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((OperationHistoryModel) next).getLoyaltyTransactionDate().length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            this.f61028v = new C24225c(CollectionsKt___CollectionsKt.m40675p5(arrayList, new C24495a()));
            RecyclerView recyclerView = ((C36741k2) getBinding()).f91124h;
            C24225c cVar2 = this.f61028v;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                cVar = cVar2;
            }
            recyclerView.setAdapter(cVar);
            ((C36741k2) getBinding()).f91120d.setVisibility(8);
            ((C36741k2) getBinding()).f91134r.setVisibility(8);
            mo71647g1(transactionsModel);
        }
    }

    /* renamed from: e1 */
    public final void mo71646e1(int i, int i2) {
        C36741k2 k2Var = (C36741k2) getBinding();
        k2Var.f91124h.setVisibility(8);
        k2Var.f91131o.setVisibility(8);
        k2Var.f91120d.setVisibility(0);
        k2Var.f91134r.setVisibility(0);
        k2Var.f91120d.setImageResource(i);
        k2Var.f91134r.setText(getString(i2));
    }

    /* renamed from: g1 */
    public final void mo71647g1(TransactionsModel transactionsModel) {
        C36741k2 k2Var = (C36741k2) getBinding();
        if (transactionsModel.getTransactions().isEmpty()) {
            k2Var.f91131o.setVisibility(8);
            return;
        }
        k2Var.f91131o.setVisibility(0);
        RecyclerView recyclerView = k2Var.f91124h;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "loyaltyHistoryRecyclerView");
        ViewKt.m118983H(recyclerView, 0, 0, 0, 0);
        k2Var.f91129m.setText(C28782t.m119105b(Double.valueOf(C22698a.f58147a.mo67072a(String.valueOf(transactionsModel.getBalances().getBalance())))));
        ImageView imageView = k2Var.f91130n;
        Intrinsics.checkNotNullExpressionValue(imageView, "transactionsExpendable");
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(imageView), new LoyaltyAmountHistoryFragment$bindTransactionsUI$1$1(this, (C11045c<? super LoyaltyAmountHistoryFragment$bindTransactionsUI$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C24496xc41ae36((C11045c) null));
        TextView textView = k2Var.f91133q;
        Intrinsics.checkNotNullExpressionValue(textView, "transactionsMoreDetails");
        C11907e<C11079d2> f12 = C11909g.m47448f1(ViewKt.m118997j(textView), new LoyaltyAmountHistoryFragment$bindTransactionsUI$1$2(this, (C11045c<? super LoyaltyAmountHistoryFragment$bindTransactionsUI$1$2>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f12, new C24497xc41ae37((C11045c) null));
    }

    /* renamed from: h1 */
    public final void mo71648h1() {
        C36741k2 k2Var = (C36741k2) getBinding();
        String e = mo71652k1().mo71688e();
        k2Var.f91118b.setVisibility(0);
        k2Var.f91122f.setText(C28782t.m119105b(Double.valueOf(C22698a.f58147a.mo67072a(e))));
        mo71653l1().sendIntent(new LoyaltyAmountHistory.UserAction.CheckBalanceReceived(e));
    }

    /* renamed from: i1 */
    public final void mo71649i1(int i) {
        C22841b bVar = C22841b.f58414a;
        ExpandableListView expandableListView = ((C36741k2) getBinding()).f91119c;
        Intrinsics.checkNotNullExpressionValue(expandableListView, "binding.expandableHistoryDate");
        bVar.mo67303a(expandableListView, i);
        ((C36741k2) getBinding()).f91119c.collapseGroup(i);
    }

    public final void initListener() {
        C36741k2 k2Var = (C36741k2) getBinding();
        SwipeRefreshLayout swipeRefreshLayout = k2Var.f91127k;
        Intrinsics.checkNotNullExpressionValue(swipeRefreshLayout, "refreshLoyaltyHistory");
        C11907e<C11079d2> f1 = C11909g.m47448f1(SwipeRefreshLayoutKt.m148925e(swipeRefreshLayout), new LoyaltyAmountHistoryFragment$initListener$1$1(this, (C11045c<? super LoyaltyAmountHistoryFragment$initListener$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C24498x8bc9e57b((C11045c) null));
        NotificationComponent notificationComponent = k2Var.f91126j;
        Intrinsics.checkNotNullExpressionValue(notificationComponent, "loyaltyNegativeAmountNotification");
        C11907e<C11079d2> f12 = C11909g.m47448f1(ViewKt.m118997j(notificationComponent), new LoyaltyAmountHistoryFragment$initListener$1$2(this, (C11045c<? super LoyaltyAmountHistoryFragment$initListener$1$2>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f12, new C24499x8bc9e57c((C11045c) null));
        NotificationComponent notificationComponent2 = k2Var.f91126j;
        Intrinsics.checkNotNullExpressionValue(notificationComponent2, "loyaltyNegativeAmountNotification");
        C11907e<C11079d2> f13 = C11909g.m47448f1(ViewKt.m118997j(notificationComponent2), new LoyaltyAmountHistoryFragment$initListener$1$3(this, (C11045c<? super LoyaltyAmountHistoryFragment$initListener$1$3>) null));
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner3, f13, new C24500x8bc9e57d((C11045c) null));
    }

    /* renamed from: j1 */
    public final void mo71651j1() {
        C36741k2 k2Var = (C36741k2) getBinding();
        ShimmerFrameLayout shimmerFrameLayout = k2Var.f91123g;
        shimmerFrameLayout.mo36997h();
        shimmerFrameLayout.setVisibility(8);
        k2Var.f91124h.setVisibility(0);
    }

    /* renamed from: k1 */
    public final C24518c mo71652k1() {
        return (C24518c) this.f61026f.getValue();
    }

    /* renamed from: l1 */
    public final LoyaltyAmountHistoryViewModel mo71653l1() {
        return (LoyaltyAmountHistoryViewModel) this.f61027g.getValue();
    }

    /* renamed from: m1 */
    public final void mo71654m1(Throwable th) {
        if (th instanceof NetWorkResponseThrowable) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.general_error_no_network_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…error_no_network_message)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            return;
        }
        NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
        String string2 = getString(R.string.general_error_server_not_responding_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gener…r_not_responding_message)");
        FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    /* renamed from: n1 */
    public final void mo71655n1(LoyaltyAmountHistory.UiEvent uiEvent) {
        if (uiEvent instanceof LoyaltyAmountHistory.UiEvent.ErrorHistory) {
            mo71646e1(R.drawable.ic_ic_fidelite_nondispo, R.string.loyalty_history_unavailable);
            mo71654m1(((LoyaltyAmountHistory.UiEvent.ErrorHistory) uiEvent).getThrowable());
        }
    }

    /* renamed from: o1 */
    public final void mo71656o1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.loyalty_my_hystory);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, LoyaltyAmountHistoryFragment$initToolbar$1$1.f61042f, 1, (Object) null);
        }
    }

    public void onResume() {
        super.onResume();
        ((C36741k2) getBinding()).f91127k.setRefreshing(false);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo71656o1();
        mo71648h1();
        initListener();
        mo71644b1();
        LoyaltyAmountHistoryViewModel l1 = mo71653l1();
        l1.sendIntent(new LoyaltyAmountHistory.UserAction.GetCardOperation((String) null, 1, (DefaultConstructorMarker) null));
        l1.sendScreenView();
        LoyaltyAmountHistoryViewModel l12 = mo71653l1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C24506x8ddf4ace(this, l12, (C11045c) null, this), 3, (Object) null);
        LoyaltyAmountHistoryViewModel l13 = mo71653l1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C24501xace79a97(this, l13, (C11045c) null, this), 3, (Object) null);
    }

    /* renamed from: p1 */
    public final void mo71657p1(LoyaltyAmountHistory.UIState uIState) {
        if (uIState.isNegativeAmount()) {
            mo71659r1(true);
        }
        if (uIState.isLoading()) {
            mo71660s1();
        } else {
            mo71651j1();
        }
        if (uIState.getTransactionsModel() != null) {
            mo71645d1(uIState.getOperationHistoryModel(), uIState.getTransactionsModel());
        }
    }

    /* renamed from: q1 */
    public final void mo71658q1() {
        C36741k2 k2Var = (C36741k2) getBinding();
        String str = null;
        if (this.f61032z) {
            TextView textView = k2Var.f91133q;
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.loyalty_transaction_less);
            }
            textView.setText(str);
            k2Var.f91130n.setImageResource(R.drawable.arrow_picker_up);
            k2Var.f91132p.setVisibility(0);
        } else {
            TextView textView2 = k2Var.f91133q;
            Context context2 = getContext();
            if (context2 != null) {
                str = context2.getString(R.string.loyalty_transaction_more);
            }
            textView2.setText(str);
            k2Var.f91130n.setImageResource(R.drawable.checkout_arrow_picker);
            k2Var.f91132p.setVisibility(8);
        }
        this.f61032z = !this.f61032z;
    }

    /* renamed from: r1 */
    public final void mo71659r1(boolean z) {
        ((C36741k2) getBinding()).f91126j.setVisibility(z ? 0 : 8);
    }

    /* renamed from: s1 */
    public final void mo71660s1() {
        C36741k2 k2Var = (C36741k2) getBinding();
        ShimmerFrameLayout shimmerFrameLayout = k2Var.f91123g;
        shimmerFrameLayout.mo36996g();
        shimmerFrameLayout.setVisibility(0);
        k2Var.f91120d.setVisibility(8);
        k2Var.f91134r.setVisibility(8);
        k2Var.f91124h.setVisibility(8);
        k2Var.f91131o.setVisibility(8);
    }
}
