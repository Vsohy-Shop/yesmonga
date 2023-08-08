package com.carrefour.fid.android.presentation.p035ui.product.search;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.C0263a;
import androidx.activity.result.C0302g;
import androidx.activity.result.contract.C0268b;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.p057io.SearchHistoryEmptyThrowable;
import com.carrefour.fid.android.core.type.SearchType;
import com.carrefour.fid.android.databinding.C36749l0;
import com.carrefour.fid.android.presentation.models.C38529u;
import com.carrefour.fid.android.presentation.models.C38530v;
import com.carrefour.fid.android.presentation.p035ui.product.search.adapter.C25557b;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26866c;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27264a;
import com.carrefour.fid.android.shared.constant.C28513a;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.presentation.components.decoration.C28852a;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b=\u0010>J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0017J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002R\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006A"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/search/AdditionalOrderProductSearchFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/l0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "initListener", "initHeader", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/c$a;", "uiEvent", "e1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/c$b;", "uiState", "l1", "f1", "Lcom/carrefour/fid/android/presentation/models/u;", "results", "i1", "", "isLoading", "h1", "", "throwable", "g1", "Lcom/carrefour/fid/android/presentation/ui/product/search/c;", "f", "Landroidx/navigation/m;", "b1", "()Lcom/carrefour/fid/android/presentation/ui/product/search/c;", "args", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderProductSearchViewModel;", "g", "Lkotlin/z;", "d1", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/AdditionalOrderProductSearchViewModel;", "viewModel", "Lkotlin/Function0;", "v", "Lkotlin/jvm/functions/a;", "scanAction", "Landroidx/activity/result/g;", "", "w", "Landroidx/activity/result/g;", "requestCameraPermissionLauncher", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;", "x", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;", "c1", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;", "m1", "(Lcom/carrefour/fid/android/presentation/viewmodels/product/search/a;)V", "productSearchAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/ui/product/search/adapter/b$a;", "y", "Lcom/carrefour/fid/android/presentation/ui/product/search/adapter/b$a;", "productSearchCallback", "<init>", "()V", "z", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAdditionalOrderProductSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdditionalOrderProductSearchFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/AdditionalOrderProductSearchFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,255:1\n42#2,3:256\n106#3,15:259\n183#4,6:274\n168#4,7:280\n262#5,2:287\n*S KotlinDebug\n*F\n+ 1 AdditionalOrderProductSearchFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/AdditionalOrderProductSearchFragment\n*L\n56#1:256,3\n58#1:259,15\n120#1:274,6\n121#1:280,7\n245#1:287,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.AdditionalOrderProductSearchFragment */
public final class AdditionalOrderProductSearchFragment extends C25570g<C36749l0> {

    /* renamed from: X */
    public static final int f62759X = 8;
    @C12579k

    /* renamed from: Y */
    public static final String f62760Y = "AdditionalOrderProductSearchFragment";

    /* renamed from: Z */
    public static final int f62761Z = 3;
    @C12579k

    /* renamed from: z */
    public static final C25500a f62762z = new C25500a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public final C19766m f62763f = new C19766m(C11342l0.m43547d(C25563c.class), new AdditionalOrderProductSearchFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: g */
    public final C11677z f62764g;
    @C12579k

    /* renamed from: v */
    public final C11289a<C11079d2> f62765v;
    @C12579k

    /* renamed from: w */
    public final C0302g<String> f62766w;
    @Inject

    /* renamed from: x */
    public C27264a f62767x;
    @C12579k

    /* renamed from: y */
    public final C25557b.C25558a f62768y;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.AdditionalOrderProductSearchFragment$a */
    public static final class C25500a {
        public /* synthetic */ C25500a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25500a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.AdditionalOrderProductSearchFragment$b */
    public /* synthetic */ class C25501b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.presentation.models.SuggestionType[] r0 = com.carrefour.fid.android.presentation.models.SuggestionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.presentation.models.SuggestionType r1 = com.carrefour.fid.android.presentation.models.SuggestionType.HISTORY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.presentation.models.SuggestionType r1 = com.carrefour.fid.android.presentation.models.SuggestionType.FREQUENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.presentation.models.SuggestionType r1 = com.carrefour.fid.android.presentation.models.SuggestionType.SUGGESTION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.product.search.AdditionalOrderProductSearchFragment.C25501b.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.AdditionalOrderProductSearchFragment$c */
    public static final class C25502c implements C25557b.C25558a {

        /* renamed from: a */
        public final /* synthetic */ AdditionalOrderProductSearchFragment f62770a;

        public C25502c(AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment) {
            this.f62770a = additionalOrderProductSearchFragment;
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
                this.f62770a.mo74297d1().sendIntent(new C26866c.C26870c.C26871a(vVar.mo122184k()));
            }
            C27264a c1 = this.f62770a.mo74296c1();
            c1.mo79298f(vVar);
            c1.mo79299g();
            FragmentKt.m118823k(this.f62770a, C25565d.f62827a.mo74422b(vVar.mo122184k(), this.f62770a.mo74295b1().mo74405e()));
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.AdditionalOrderProductSearchFragment$d */
    public static final class C25503d implements C0263a<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ AdditionalOrderProductSearchFragment f62771a;

        public C25503d(AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment) {
            this.f62771a = additionalOrderProductSearchFragment;
        }

        /* renamed from: b */
        public final void mo790a(Boolean bool) {
            Intrinsics.checkNotNullExpressionValue(bool, "isGranted");
            if (bool.booleanValue()) {
                this.f62771a.f62765v.invoke();
            }
        }
    }

    public AdditionalOrderProductSearchFragment() {
        super(C254991.f62769a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C25515xeb512368(new C25514xeb512367(this)));
        this.f62764g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AdditionalOrderProductSearchViewModel.class), new C25516xeb512369(b), new C25517xeb51236a((C11289a) null, b), new C25518xeb51236b(this, b));
        this.f62765v = new AdditionalOrderProductSearchFragment$scanAction$1(this);
        C0302g<String> registerForActivityResult = registerForActivityResult(new C0268b.C0289l(), new C25503d(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f62766w = registerForActivityResult;
        this.f62768y = new C25502c(this);
    }

    /* renamed from: T0 */
    public static final /* synthetic */ C36749l0 m110002T0(AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment) {
        return (C36749l0) additionalOrderProductSearchFragment.getBinding();
    }

    /* renamed from: j1 */
    public static final void m110010j1(AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment, View view) {
        AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment2 = additionalOrderProductSearchFragment;
        Intrinsics.checkNotNullParameter(additionalOrderProductSearchFragment, "this$0");
        C19232h activity = additionalOrderProductSearchFragment.getActivity();
        if (activity != null) {
            C13825a.m58775d(activity);
        }
        String string = additionalOrderProductSearchFragment.getString(R.string.general_research);
        String string2 = additionalOrderProductSearchFragment.getString(R.string.delete_search_ad_text);
        String string3 = additionalOrderProductSearchFragment.getString(R.string.no);
        String string4 = additionalOrderProductSearchFragment.getString(R.string.yes);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_research)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.delete_search_ad_text)");
        FragmentKt.m118838z(additionalOrderProductSearchFragment, string, string2, (String) null, (C11289a) null, string4, false, new AdditionalOrderProductSearchFragment$initListener$1$1$1(additionalOrderProductSearchFragment), string3, (C11289a) null, (C11289a) null, (Drawable) null, 0, 3884, (Object) null);
    }

    /* renamed from: k1 */
    public static final boolean m110011k1(View view, MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: b1 */
    public final C25563c mo74295b1() {
        return (C25563c) this.f62763f.getValue();
    }

    @C12579k
    /* renamed from: c1 */
    public final C27264a mo74296c1() {
        C27264a aVar = this.f62767x;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productSearchAnalyticsViewModel");
        return null;
    }

    /* renamed from: d1 */
    public final AdditionalOrderProductSearchViewModel mo74297d1() {
        return (AdditionalOrderProductSearchViewModel) this.f62764g.getValue();
    }

    /* renamed from: e1 */
    public final void mo74298e1(C26866c.C26867a aVar) {
        if (aVar instanceof C26866c.C26867a.C26868a) {
            mo74300g1(((C26866c.C26867a.C26868a) aVar).mo78013d());
        }
    }

    /* renamed from: f1 */
    public final void mo74299f1() {
        mo74296c1().mo79295c();
        C19736g.m91827a(this).mo58152q0();
    }

    /* renamed from: g1 */
    public final void mo74300g1(Throwable th) {
        if (th instanceof SearchHistoryEmptyThrowable) {
            C28935i iVar = C28935i.f70940a;
            String message = th.getMessage();
            Intrinsics.checkNotNull(message, "null cannot be cast to non-null type kotlin.String");
            C28935i.m119704b(iVar, message, (Throwable) null, 0, 6, (Object) null);
            return;
        }
        C28935i iVar2 = C28935i.f70940a;
        String message2 = th.getMessage();
        if (message2 == null) {
            message2 = "";
        }
        C28935i.m119705e(iVar2, message2, th, 0, 4, (Object) null);
    }

    /* renamed from: h1 */
    public final void mo74301h1(boolean z) {
        int i;
        ProgressBar progressBar = ((C36749l0) getBinding()).f91168f;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressBarProductSearch");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: i1 */
    public final void mo74302i1(C38529u uVar) {
        boolean z;
        C25557b bVar;
        Collection g = uVar.mo122169g();
        if (g == null || g.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i = C25501b.$EnumSwitchMapping$0[uVar.mo122170h().ordinal()];
            if (i == 1) {
                TextView textView = ((C36749l0) getBinding()).f91169g;
                textView.setVisibility(0);
                textView.setText(getString(R.string.product_search_subtitle));
                ((C36749l0) getBinding()).f91166d.setVisibility(0);
            } else if (i == 2) {
                TextView textView2 = ((C36749l0) getBinding()).f91169g;
                textView2.setVisibility(0);
                textView2.setText(getString(R.string.product_search_subtitle_empty));
                ((C36749l0) getBinding()).f91166d.setVisibility(8);
            } else if (i == 3) {
                ((C36749l0) getBinding()).f91169g.setVisibility(8);
                ((C36749l0) getBinding()).f91166d.setVisibility(8);
                mo74296c1().mo79300h();
            }
            RecyclerView.Adapter adapter = ((C36749l0) getBinding()).f91167e.getAdapter();
            if (adapter instanceof C25557b) {
                bVar = (C25557b) adapter;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.mo74397o(uVar.mo122169g());
            }
        }
    }

    public final void initHeader() {
        ((C36749l0) getBinding()).f91164b.setContent(C8553b.m31049c(-808979722, true, new AdditionalOrderProductSearchFragment$initHeader$1(this)));
    }

    public final void initListener() {
        Button button = ((C36749l0) getBinding()).f91166d;
        button.setVisibility(8);
        button.setOnClickListener(new C25555a(this));
    }

    /* renamed from: l1 */
    public final void mo74305l1(C26866c.C26869b bVar) {
        mo74301h1(bVar.mo78022i());
        C38529u j = bVar.mo78023j();
        if (j != null) {
            mo74302i1(j);
        }
    }

    /* renamed from: m1 */
    public final void mo74306m1(@C12579k C27264a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f62767x = aVar;
    }

    public void onDestroyView() {
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        FragmentExtensionKt.m58758i(requireActivity);
        super.onDestroyView();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new AdditionalOrderProductSearchFragment$onViewCreated$1(this));
        FragmentExtensionKt.m58757h(this);
        mo74296c1().mo79299g();
        view.setOnTouchListener(new C25562b());
        initHeader();
        initListener();
        RecyclerView recyclerView = ((C36749l0) getBinding()).f91167e;
        recyclerView.setItemAnimator((RecyclerView.C20069l) null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new C25557b(this.f62768y, (List) null, 2, (DefaultConstructorMarker) null));
        recyclerView.mo59589n(new C28852a(1, false, 0, 6, (DefaultConstructorMarker) null));
        ((C36749l0) getBinding()).f91168f.setVisibility(8);
        AdditionalOrderProductSearchViewModel d1 = mo74297d1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C25504x4aace5f1(this, d1, (C11045c) null, this), 3, (Object) null);
        AdditionalOrderProductSearchViewModel d12 = mo74297d1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C25509x2ba49628(this, d12, (C11045c) null, this), 3, (Object) null);
        mo74296c1().mo79294b(SearchType.EVENT_SEARCH_CLASSIC);
    }
}
