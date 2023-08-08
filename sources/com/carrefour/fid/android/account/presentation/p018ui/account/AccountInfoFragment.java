package com.carrefour.fid.android.account.presentation.p018ui.account;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.content.res.C0507a;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.databinding.C13216c;
import com.carrefour.fid.android.account.presentation.p018ui.account.C13384f;
import com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.CivilityTitle;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.C28936j;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0016\u0010\u0019\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0002R\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/account/AccountInfoFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/account/databinding/c;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "onPause", "initHeader", "initUi", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/AccountInfoViewModel$a;", "uiState", "g1", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/AccountInfoViewModel$b;", "uiEvent", "Z0", "Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "accountInfo", "a1", "", "Lcom/carrefour/fid/android/domain/models/account/Address;", "listAddress", "Y0", "initListeners", "h1", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/AccountInfoViewModel;", "f", "Lkotlin/z;", "X0", "()Lcom/carrefour/fid/android/account/presentation/viewmodels/account/AccountInfoViewModel;", "viewModel", "Lcom/carrefour/fid/android/shared/util/j;", "g", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAccountInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountInfoFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/account/AccountInfoFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n56#2,10:256\n183#3,6:266\n168#3,7:272\n1#4:279\n766#5:280\n857#5,2:281\n1855#5,2:283\n*S KotlinDebug\n*F\n+ 1 AccountInfoFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/account/AccountInfoFragment\n*L\n38#1:256,10\n51#1:266,6\n52#1:272,7\n200#1:280\n200#1:281,2\n200#1:283,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.AccountInfoFragment */
public final class AccountInfoFragment extends C13389i<C13216c> {
    @C12579k

    /* renamed from: f */
    public final C11677z f32721f;
    @Inject

    /* renamed from: g */
    public C28936j f32722g;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.account.AccountInfoFragment$a */
    public /* synthetic */ class C13320a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        static {
            /*
                com.carrefour.fid.android.domain.models.account.CivilityTitle[] r0 = com.carrefour.fid.android.domain.models.account.CivilityTitle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.carrefour.fid.android.domain.models.account.CivilityTitle r2 = com.carrefour.fid.android.domain.models.account.CivilityTitle.MR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.carrefour.fid.android.domain.models.account.CivilityTitle r3 = com.carrefour.fid.android.domain.models.account.CivilityTitle.MRS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                com.carrefour.fid.android.domain.models.AddressCategory[] r0 = com.carrefour.fid.android.domain.models.AddressCategory.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.AddressCategory r3 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.carrefour.fid.android.domain.models.AddressCategory r1 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.p018ui.account.AccountInfoFragment.C13320a.<clinit>():void");
        }
    }

    public AccountInfoFragment() {
        super(C133191.f32723a);
        AccountInfoFragment$special$$inlined$viewModels$default$1 accountInfoFragment$special$$inlined$viewModels$default$1 = new AccountInfoFragment$special$$inlined$viewModels$default$1(this);
        this.f32721f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(AccountInfoViewModel.class), new AccountInfoFragment$special$$inlined$viewModels$default$2(accountInfoFragment$special$$inlined$viewModels$default$1), new AccountInfoFragment$special$$inlined$viewModels$default$3(accountInfoFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: b1 */
    public static final void m57662b1(AccountInfoFragment accountInfoFragment, View view) {
        Intrinsics.checkNotNullParameter(accountInfoFragment, "this$0");
        FragmentKt.m118823k(accountInfoFragment, C13384f.f32774a.mo31756d());
    }

    /* renamed from: c1 */
    public static final void m57663c1(AccountInfoFragment accountInfoFragment, View view) {
        Intrinsics.checkNotNullParameter(accountInfoFragment, "this$0");
        FragmentKt.m118823k(accountInfoFragment, C13384f.f32774a.mo31755c());
    }

    /* renamed from: d1 */
    public static final void m57664d1(AccountInfoFragment accountInfoFragment, View view) {
        Intrinsics.checkNotNullParameter(accountInfoFragment, "this$0");
        FragmentKt.m118823k(accountInfoFragment, C13384f.f32774a.mo31757e());
    }

    /* renamed from: e1 */
    public static final void m57665e1(AccountInfoFragment accountInfoFragment, View view) {
        Intrinsics.checkNotNullParameter(accountInfoFragment, "this$0");
        accountInfoFragment.mo31642X0().sendIntent(new AccountInfoViewModel.C13567c.C13568a(AddressCategory.DELIVERY));
    }

    /* renamed from: f1 */
    public static final void m57666f1(AccountInfoFragment accountInfoFragment, View view) {
        Intrinsics.checkNotNullParameter(accountInfoFragment, "this$0");
        accountInfoFragment.mo31642X0().sendIntent(new AccountInfoViewModel.C13567c.C13568a(AddressCategory.BILLING));
    }

    /* renamed from: X0 */
    public final AccountInfoViewModel mo31642X0() {
        return (AccountInfoViewModel) this.f32721f.getValue();
    }

    /* renamed from: Y0 */
    public final void mo31643Y0(List<Address> list) {
        TextView textView = ((C13216c) getBinding()).f32424t;
        int i = C13144b.C13163s.account_info_add_address;
        textView.setText(getString(i));
        Intrinsics.checkNotNullExpressionValue(textView, "handleAddresses$lambda$6");
        String string = getString(C13144b.C13163s.account_info_bill_address_add_accessibility);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.accou…ddress_add_accessibility)");
        ViewKt.m152121c(textView, string, false, 2, (Object) null);
        TextView textView2 = ((C13216c) getBinding()).f32425u;
        textView2.setText(getString(i));
        Intrinsics.checkNotNullExpressionValue(textView2, "handleAddresses$lambda$7");
        String string2 = getString(C13144b.C13163s.account_info_delivery_address_add_accessibility);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.accou…ddress_add_accessibility)");
        ViewKt.m152121c(textView2, string2, false, 2, (Object) null);
        ArrayList<Address> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((Address) next).mo116695T()) {
                arrayList.add(next);
            }
        }
        for (Address address : arrayList) {
            String w = address.mo116722w();
            String[] stringArray = getResources().getStringArray(C13144b.C13147c.list_country);
            Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray(R.array.list_country)");
            String A = address.mo116676A(stringArray);
            int i2 = C13320a.$EnumSwitchMapping$1[address.mo116683H().ordinal()];
            if (i2 == 1) {
                TextView textView3 = ((C13216c) getBinding()).f32425u;
                textView3.setText(getString(C13144b.C13163s.general_modify));
                Intrinsics.checkNotNullExpressionValue(textView3, "handleAddresses$lambda$11$lambda$9");
                String string3 = getString(C13144b.C13163s.account_info_delivery_address_modify_accessibility);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.accou…ess_modify_accessibility)");
                ViewKt.m152121c(textView3, string3, false, 2, (Object) null);
                ((C13216c) getBinding()).f32415k.setText(w);
                ((C13216c) getBinding()).f32414j.setText(A);
                ((C13216c) getBinding()).f32415k.setVisibility(0);
                ((C13216c) getBinding()).f32414j.setVisibility(0);
            } else if (i2 == 2) {
                TextView textView4 = ((C13216c) getBinding()).f32424t;
                textView4.setText(getString(C13144b.C13163s.general_modify));
                Intrinsics.checkNotNullExpressionValue(textView4, "handleAddresses$lambda$11$lambda$10");
                String string4 = getString(C13144b.C13163s.account_info_bill_address_modify_accessibility);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.accou…ess_modify_accessibility)");
                ViewKt.m152121c(textView4, string4, false, 2, (Object) null);
                ((C13216c) getBinding()).f32411g.setText(w);
                ((C13216c) getBinding()).f32410f.setText(A);
                ((C13216c) getBinding()).f32411g.setVisibility(0);
                ((C13216c) getBinding()).f32410f.setVisibility(0);
            }
        }
    }

    /* renamed from: Z0 */
    public final void mo31644Z0(AccountInfoViewModel.C13564b bVar) {
        AccountInfoViewModel.C13564b bVar2 = bVar;
        if (Intrinsics.areEqual((Object) bVar2, (Object) AccountInfoViewModel.C13564b.C13565a.f33066a)) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(C13144b.C13163s.general_error_parameters_server_not_responding_02);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…server_not_responding_02)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (bVar2 instanceof AccountInfoViewModel.C13564b.C13566b) {
            AccountInfoViewModel.C13564b.C13566b bVar3 = (AccountInfoViewModel.C13564b.C13566b) bVar2;
            AddressCategory h = bVar3.mo32212h();
            AddressCategory addressCategory = AddressCategory.DELIVERY;
            if (h == addressCategory) {
                C13384f.C13386b bVar4 = C13384f.f32774a;
                Address g = bVar3.mo32211g();
                FragmentKt.m118823k(this, bVar4.mo31754a(addressCategory, C13144b.C13154j.accountInfoFragment, bVar3.mo32214i(), g, bVar3.mo32215j()));
                return;
            }
            C13384f.C13386b bVar5 = C13384f.f32774a;
            AddressCategory addressCategory2 = AddressCategory.BILLING;
            Address g2 = bVar3.mo32211g();
            FragmentKt.m118823k(this, bVar5.mo31754a(addressCategory2, C13144b.C13154j.accountInfoFragment, bVar3.mo32214i(), g2, bVar3.mo32215j()));
        }
    }

    /* renamed from: a1 */
    public final void mo31645a1(AccountInfo accountInfo) {
        int i;
        String str;
        TextView textView = ((C13216c) getBinding()).f32420p;
        CivilityTitle p = accountInfo.mo116661p();
        if (p == null) {
            i = -1;
        } else {
            i = C13320a.$EnumSwitchMapping$0[p.ordinal()];
        }
        boolean z = true;
        if (i == -1) {
            str = new String();
        } else if (i == 1) {
            str = getString(C13144b.C13163s.account_info_mr);
        } else if (i == 2) {
            str = getString(C13144b.C13163s.account_info_mrs);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = null;
        textView.setText(StringsKt__IndentKt.trimMargin$default(str + " " + accountInfo.mo116664s() + " " + accountInfo.mo116667u() + "\n            ", (String) null, 1, (Object) null));
        mo31643Y0(accountInfo.mo116668v());
        String r = accountInfo.mo116663r();
        if (r.length() != 0) {
            z = false;
        }
        if (!z) {
            str2 = r;
        }
        if (str2 != null) {
            ((C13216c) getBinding()).f32417m.setText(str2);
        }
    }

    /* renamed from: g1 */
    public final void mo31646g1(AccountInfoViewModel.C13562a aVar) {
        AccountInfo j = aVar.mo32200j();
        if (j != null) {
            mo31645a1(j);
        }
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f32722g;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    /* renamed from: h1 */
    public final void mo31648h1() {
        TextView textView = ((C13216c) getBinding()).f32419o;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.modifyDataText");
        String string = getString(C13144b.C13163s.account_info_personal_data_modify_accessibility);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.accou…ata_modify_accessibility)");
        ViewKt.m152121c(textView, string, false, 2, (Object) null);
        TextView textView2 = ((C13216c) getBinding()).f32426v;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.updateEmailText");
        String string2 = getString(C13144b.C13163s.account_info_email_modify_accessibility);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.accou…ail_modify_accessibility)");
        ViewKt.m152121c(textView2, string2, false, 2, (Object) null);
        TextView textView3 = ((C13216c) getBinding()).f32427w;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.updatePasswordText");
        String string3 = getString(C13144b.C13163s.account_info_password_modify_accessibility);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.accou…ord_modify_accessibility)");
        ViewKt.m152121c(textView3, string3, false, 2, (Object) null);
    }

    public final void initHeader() {
        getFragmentUtil().mo32776b(this);
        ((C13216c) getBinding()).f32406b.setContent(C8553b.m31049c(1803988285, true, new AccountInfoFragment$initHeader$1(this)));
    }

    public final void initListeners() {
        ((C13216c) getBinding()).f32419o.setOnClickListener(new C13379a(this));
        ((C13216c) getBinding()).f32426v.setOnClickListener(new C13380b(this));
        ((C13216c) getBinding()).f32427w.setOnClickListener(new C13381c(this));
    }

    public final void initUi() {
        C19232h activity = getActivity();
        if (activity != null) {
            TextView textView = ((C13216c) getBinding()).f32419o;
            int i = C13144b.C13152h.arrow_right;
            textView.setCompoundDrawablesWithIntrinsicBounds(C0507a.m2346b(activity, i), (Drawable) null, (Drawable) null, (Drawable) null);
            ((C13216c) getBinding()).f32426v.setCompoundDrawablesWithIntrinsicBounds(C0507a.m2346b(activity, i), (Drawable) null, (Drawable) null, (Drawable) null);
            ((C13216c) getBinding()).f32427w.setCompoundDrawablesWithIntrinsicBounds(C0507a.m2346b(activity, i), (Drawable) null, (Drawable) null, (Drawable) null);
            ((C13216c) getBinding()).f32424t.setCompoundDrawablesWithIntrinsicBounds(C0507a.m2346b(activity, i), (Drawable) null, (Drawable) null, (Drawable) null);
            ((C13216c) getBinding()).f32425u.setCompoundDrawablesWithIntrinsicBounds(C0507a.m2346b(activity, i), (Drawable) null, (Drawable) null, (Drawable) null);
            ((C13216c) getBinding()).f32425u.setOnClickListener(new C13382d(this));
            ((C13216c) getBinding()).f32424t.setOnClickListener(new C13383e(this));
        }
    }

    public void onPause() {
        FragmentKt.m118832t(this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        FragmentKt.m118814b(this);
        mo31642X0().sendIntent(AccountInfoViewModel.C13567c.C13569b.f33075a);
        mo31642X0().sendScreenView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        initHeader();
        initUi();
        initListeners();
        mo31648h1();
        AccountInfoViewModel X0 = mo31642X0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new AccountInfoFragment$onViewCreated$$inlined$processEvent$1(this, X0, (C11045c) null, this), 3, (Object) null);
        AccountInfoViewModel X02 = mo31642X0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new AccountInfoFragment$onViewCreated$$inlined$processState$1(this, X02, (C11045c) null, this), 3, (Object) null);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f32722g = jVar;
    }
}
