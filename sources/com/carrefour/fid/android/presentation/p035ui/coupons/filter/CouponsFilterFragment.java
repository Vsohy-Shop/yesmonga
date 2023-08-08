package com.carrefour.fid.android.presentation.p035ui.coupons.filter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36870x1;
import com.carrefour.fid.android.design.components.widgets.filter.C37228d;
import com.carrefour.fid.android.design.components.widgets.filter.FilterItemRecyclerView;
import com.carrefour.fid.android.presentation.models.CouponsFilter;
import com.carrefour.fid.android.presentation.models.FilterResult;
import com.carrefour.fid.android.presentation.models.FilterSection;
import com.carrefour.fid.android.presentation.viewmodels.coupons.filter.CouponsFilterViewModel;
import com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.C26249b;
import com.carrefour.fid.android.shared.extension.C28775q;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.button.MaterialButton;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0013\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/coupons/filter/CouponsFilterFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/x1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "initHeader", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/mvi/b$b;", "uiState", "b1", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/mvi/b$a;", "uiEvent", "X0", "", "Lcom/carrefour/fid/android/presentation/models/CouponsFilter;", "list", "a1", "Lcom/carrefour/fid/android/presentation/ui/coupons/filter/c;", "f", "Landroidx/navigation/m;", "V0", "()Lcom/carrefour/fid/android/presentation/ui/coupons/filter/c;", "args", "Lcom/carrefour/fid/android/presentation/viewmodels/coupons/filter/CouponsFilterViewModel;", "g", "Lkotlin/z;", "W0", "()Lcom/carrefour/fid/android/presentation/viewmodels/coupons/filter/CouponsFilterViewModel;", "viewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCouponsFilterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsFilterFragment.kt\ncom/carrefour/fid/android/presentation/ui/coupons/filter/CouponsFilterFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,136:1\n42#2,3:137\n106#3,15:140\n168#4,7:155\n183#4,6:162\n1549#5:168\n1620#5,2:169\n1622#5:190\n125#6:171\n152#6,3:172\n125#6:175\n152#6,3:176\n125#6:179\n152#6,3:180\n515#7:183\n500#7,6:184\n*S KotlinDebug\n*F\n+ 1 CouponsFilterFragment.kt\ncom/carrefour/fid/android/presentation/ui/coupons/filter/CouponsFilterFragment\n*L\n33#1:137,3\n35#1:140,15\n43#1:155,7\n44#1:162,6\n102#1:168\n102#1:169,2\n102#1:190\n112#1:171\n112#1:172,3\n117#1:175\n117#1:176,3\n122#1:179\n122#1:180,3\n127#1:183\n127#1:184,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.filter.CouponsFilterFragment */
public final class CouponsFilterFragment extends C23814f<C36870x1> {

    /* renamed from: v */
    public static final int f59898v = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f59899f = new C19766m(C11342l0.m43547d(C23810c.class), new CouponsFilterFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: g */
    public final C11677z f59900g;

    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.filter.CouponsFilterFragment$a */
    public /* synthetic */ class C23797a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.presentation.models.FilterSection[] r0 = com.carrefour.fid.android.presentation.models.FilterSection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.presentation.models.FilterSection r1 = com.carrefour.fid.android.presentation.models.FilterSection.COUPONS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.presentation.models.FilterSection r1 = com.carrefour.fid.android.presentation.models.FilterSection.DEPARTMENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.presentation.models.FilterSection r1 = com.carrefour.fid.android.presentation.models.FilterSection.BRAND_SIZE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.coupons.filter.CouponsFilterFragment.C23797a.<clinit>():void");
        }
    }

    public CouponsFilterFragment() {
        super(C237961.f59901a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new CouponsFilterFragment$special$$inlined$viewModels$default$2(new CouponsFilterFragment$special$$inlined$viewModels$default$1(this)));
        this.f59900g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(CouponsFilterViewModel.class), new CouponsFilterFragment$special$$inlined$viewModels$default$3(b), new CouponsFilterFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new CouponsFilterFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: Y0 */
    public static final void m105480Y0(CouponsFilterFragment couponsFilterFragment, View view) {
        Intrinsics.checkNotNullParameter(couponsFilterFragment, "this$0");
        couponsFilterFragment.mo69709W0().sendIntent(C26249b.C26253c.C26256c.f64201b);
    }

    /* renamed from: Z0 */
    public static final void m105481Z0(CouponsFilterFragment couponsFilterFragment, View view) {
        Intrinsics.checkNotNullParameter(couponsFilterFragment, "this$0");
        couponsFilterFragment.mo69709W0().sendIntent(C26249b.C26253c.C26254a.f64195b);
    }

    /* renamed from: V0 */
    public final C23810c mo69708V0() {
        return (C23810c) this.f59899f.getValue();
    }

    /* renamed from: W0 */
    public final CouponsFilterViewModel mo69709W0() {
        return (CouponsFilterViewModel) this.f59900g.getValue();
    }

    /* renamed from: X0 */
    public final void mo69710X0(C26249b.C26250a aVar) {
        C19456p0 i;
        if (aVar instanceof C26249b.C26250a.C26251a) {
            NavController a = C19736g.m91827a(this);
            NavBackStackEntry O = a.mo58115O();
            if (!(O == null || (i = O.mo58069i()) == null)) {
                C26249b.C26250a.C26251a aVar2 = (C26249b.C26250a.C26251a) aVar;
                i.mo57656q(C23812d.f59917a, new FilterResult(aVar2.mo76340f(), aVar2.mo76338e()));
            }
            a.mo58156s0();
        }
    }

    /* renamed from: a1 */
    public final void mo69711a1(List<CouponsFilter> list) {
        String str;
        String str2;
        boolean z;
        Map map;
        boolean z2;
        String str3;
        String str4;
        String str5;
        FilterItemRecyclerView filterItemRecyclerView = ((C36870x1) getBinding()).f91893e;
        Iterable<CouponsFilter> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (CouponsFilter couponsFilter : iterable) {
            Context context = getContext();
            if (context != null) {
                Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
                str = C28775q.m119096d(context, "coupons_filter_sub_group_" + couponsFilter.mo121452h().mo121625q());
            } else {
                str = null;
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            FilterSection h = couponsFilter.mo121452h();
            int[] iArr = C23797a.$EnumSwitchMapping$0;
            int i = iArr[h.ordinal()];
            if (i == 1) {
                z = false;
            } else if (i == 2 || i == 3) {
                z = true;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = iArr[couponsFilter.mo121452h().ordinal()];
            if (i2 == 1) {
                Map<String, String> g = couponsFilter.mo121451g();
                ArrayList arrayList2 = new ArrayList(g.size());
                for (Map.Entry next : g.entrySet()) {
                    Object key = next.getKey();
                    Context context2 = getContext();
                    if (context2 != null) {
                        Intrinsics.checkNotNullExpressionValue(context2, C9175a.f24932Y);
                        str3 = C28775q.m119096d(context2, "coupon_content_" + next.getValue());
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList2.add(C11078d1.m42659a(key, str3));
                }
                map = C10977s0.m41426B0(arrayList2);
            } else if (i2 == 2) {
                Map<String, String> g2 = couponsFilter.mo121451g();
                ArrayList arrayList3 = new ArrayList(g2.size());
                for (Map.Entry next2 : g2.entrySet()) {
                    Object key2 = next2.getKey();
                    Context context3 = getContext();
                    if (context3 != null) {
                        Intrinsics.checkNotNullExpressionValue(context3, C9175a.f24932Y);
                        str4 = C28775q.m119096d(context3, "coupon_category_" + next2.getValue());
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    arrayList3.add(C11078d1.m42659a(key2, str4));
                }
                map = C10977s0.m41426B0(arrayList3);
            } else if (i2 == 3) {
                Map<String, String> g3 = couponsFilter.mo121451g();
                ArrayList arrayList4 = new ArrayList(g3.size());
                for (Map.Entry next3 : g3.entrySet()) {
                    Object key3 = next3.getKey();
                    Context context4 = getContext();
                    if (context4 != null) {
                        Intrinsics.checkNotNullExpressionValue(context4, C9175a.f24932Y);
                        String lowerCase = ((String) next3.getValue()).toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        str5 = C28775q.m119096d(context4, "coupon_brand_size_" + lowerCase);
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = "";
                    }
                    arrayList4.add(C11078d1.m42659a(key3, str5));
                }
                map = C10977s0.m41426B0(arrayList4);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((CharSequence) entry.getValue()).length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            arrayList.add(new C37228d(str2, z, 0, linkedHashMap, couponsFilter.mo121450f(), new CouponsFilterFragment$renderFilterContent$1$5(this, couponsFilter), 4, (DefaultConstructorMarker) null));
        }
        filterItemRecyclerView.setList(arrayList);
    }

    /* renamed from: b1 */
    public final void mo69712b1(C26249b.C26252b bVar) {
        boolean z;
        List<CouponsFilter> m = bVar.mo76352m();
        if (m == null) {
            m = CollectionsKt__CollectionsKt.m40441E();
        }
        mo69711a1(m);
        MaterialButton materialButton = ((C36870x1) getBinding()).f91890b;
        int size = bVar.mo76351l().size();
        if (size > 0) {
            z = true;
        } else {
            z = false;
        }
        materialButton.setEnabled(z);
        materialButton.setText(getString(R.string.filter_apply, Integer.valueOf(size)));
    }

    public final void initHeader() {
        ((C36870x1) getBinding()).f91891c.setContent(C8553b.m31049c(916544784, true, new CouponsFilterFragment$initHeader$1(this)));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentExtensionKt.m58757h(this);
        initHeader();
        CouponsFilterViewModel W0 = mo69709W0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new CouponsFilterFragment$onViewCreated$$inlined$processState$1(this, W0, (C11045c) null, this), 3, (Object) null);
        CouponsFilterViewModel W02 = mo69709W0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new CouponsFilterFragment$onViewCreated$$inlined$processEvent$1(this, W02, (C11045c) null, this), 3, (Object) null);
        mo69709W0().sendIntent(new C26249b.C26253c.C26255b(ArraysKt___ArraysKt.m39955kz(mo69708V0().mo69731g()), ArraysKt___ArraysKt.m39955kz(mo69708V0().mo69732h()), mo69708V0().mo69734i()));
        ((C36870x1) getBinding()).f91895g.setOnClickListener(new C23808a(this));
        ((C36870x1) getBinding()).f91890b.setOnClickListener(new C23809b(this));
    }
}
