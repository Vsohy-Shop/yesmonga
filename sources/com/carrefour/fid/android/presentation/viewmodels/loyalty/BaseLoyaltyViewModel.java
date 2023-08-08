package com.carrefour.fid.android.presentation.viewmodels.loyalty;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.LiveData;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.shared.util.C28947q;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\"J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\n\u001a\u00020\u0004H\u0014J\u0013\u0010\r\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\tH\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001d8@X\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/BaseLoyaltyViewModel;", "Lcom/carrefour/fid/android/shared/base/p;", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/a;", "args", "Lkotlin/d2;", "k0", "(Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/lifecycle/w;", "owner", "", "clear", "r", "(Landroidx/lifecycle/w;Ljava/lang/Boolean;)V", "j0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "i0", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "d", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "e", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "Lcom/carrefour/fid/android/shared/util/q;", "Landroidx/navigation/b0;", "f", "Lcom/carrefour/fid/android/shared/util/q;", "singleNavigation", "Landroidx/lifecycle/LiveData;", "h0", "()Landroidx/lifecycle/LiveData;", "navigation", "<init>", "(Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
@C8567o(parameters = 0)
public final class BaseLoyaltyViewModel extends C28498p {

    /* renamed from: g */
    public static final int f64791g = 8;
    @C12579k

    /* renamed from: d */
    public final LoyaltyPreferencesStorage f64792d;
    @C12579k

    /* renamed from: e */
    public final LoginRepository f64793e;
    @C12579k

    /* renamed from: f */
    public final C28947q<C19693b0> f64794f = new C28947q<>();

    @Inject
    public BaseLoyaltyViewModel(@C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f64792d = loyaltyPreferencesStorage;
        this.f64793e = loginRepository;
    }

    public void clear() {
        super.clear();
        this.f64794f.mo57496r(null);
    }

    @C12579k
    /* renamed from: h0 */
    public final LiveData<C19693b0> mo77083h0() {
        return this.f64794f;
    }

    /* renamed from: i0 */
    public final boolean mo77084i0() {
        return C13181d.m57146e(this.f64793e.mo31354f());
    }

    /* renamed from: j0 */
    public final Object mo77085j0(C11045c<? super Boolean> cVar) {
        return this.f64792d.hasLoyaltyCard(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77086k0(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.C24237a r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.BaseLoyaltyViewModel$initNavigationToLoyalty$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.presentation.viewmodels.loyalty.BaseLoyaltyViewModel$initNavigationToLoyalty$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.BaseLoyaltyViewModel$initNavigationToLoyalty$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.BaseLoyaltyViewModel$initNavigationToLoyalty$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.BaseLoyaltyViewModel$initNavigationToLoyalty$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.BaseLoyaltyViewModel r11 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.BaseLoyaltyViewModel) r11
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0073
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            kotlin.C11661u0.m45747n(r12)
            boolean r12 = r11.mo70939f()
            if (r12 == 0) goto L_0x0044
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.b$c r11 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.C24283b.f60693a
            r11.mo71051a()
            goto L_0x0094
        L_0x0044:
            boolean r11 = r11.mo70940g()
            if (r11 == 0) goto L_0x0055
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.b$c r4 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.C24283b.f60693a
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 7
            r9 = 0
            com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.C24283b.C24286c.m106795c(r4, r5, r6, r7, r8, r9)
            goto L_0x0094
        L_0x0055:
            boolean r11 = r10.mo77084i0()
            if (r11 != 0) goto L_0x0067
            com.carrefour.fid.android.shared.util.q<androidx.navigation.b0> r11 = r10.f64794f
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.b$c r12 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.C24283b.f60693a
            androidx.navigation.b0 r12 = r12.mo71055g()
            r11.mo57496r(r12)
            goto L_0x0094
        L_0x0067:
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r12 = r10.mo77085j0(r0)
            if (r12 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r11 = r10
        L_0x0073:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0089
            com.carrefour.fid.android.shared.util.q<androidx.navigation.b0> r11 = r11.f64794f
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.b$c r12 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.C24283b.f60693a
            r0 = 0
            r1 = 0
            androidx.navigation.b0 r12 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.C24283b.C24286c.m106796e(r12, r0, r3, r1)
            r11.mo57496r(r12)
            goto L_0x0094
        L_0x0089:
            com.carrefour.fid.android.shared.util.q<androidx.navigation.b0> r11 = r11.f64794f
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.b$c r12 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.C24283b.f60693a
            androidx.navigation.b0 r12 = r12.mo71054f()
            r11.mo57496r(r12)
        L_0x0094:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.BaseLoyaltyViewModel.mo77086k0(com.carrefour.fid.android.presentation.ui.loyalty.fragments.a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: r */
    public void mo74786r(@C12579k C19499w wVar, @C12580l Boolean bool) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f64794f.mo57495q(wVar);
        mo77083h0().mo57495q(wVar);
        super.mo74786r(wVar, bool);
    }
}
