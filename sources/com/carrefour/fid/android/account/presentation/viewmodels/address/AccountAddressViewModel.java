package com.carrefour.fid.android.account.presentation.viewmodels.address;

import com.carrefour.fid.android.account.domain.events.C13239a;
import com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetVerificationDQEAddressUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13285a;
import com.carrefour.fid.android.account.presentation.analytics.C13287b;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13645a;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.urbanairship.push.notifications.C9527p;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004BC\b\u0007\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010J\u001a\u00020I\u0012\b\b\u0001\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\t\u0010\u0006\u001a\u00020\u0005H\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0001J\u0011\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0001J\u0011\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0001J\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0001J\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001f\u001a\u00020\u0005H\u0002J+\u0010!\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0016\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010'H\u0002J\b\u0010)\u001a\u00020\bH\u0002J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0002R\u0014\u00100\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010BR\u0018\u0010H\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010G\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/viewmodels/address/AccountAddressViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/a$c;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/a$d;", "Lcom/carrefour/fid/android/account/presentation/analytics/a;", "Lkotlin/d2;", "L", "z", "", "isAddressDelivery", "C", "I", "k", "intent", "m0", "(Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/a$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/account/Address;", "address", "", "telephone", "h0", "(Lcom/carrefour/fid/android/domain/models/account/Address;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/AddressCategory;", "category", "billing", "delivery", "phone", "j0", "deliveryAddress", "billingAddress", "k0", "i0", "autoSave", "q0", "(Lcom/carrefour/fid/android/domain/models/account/Address;Ljava/lang/String;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/account/presentation/models/DQEAddressModel;", "dqeAddress", "o0", "(Lcom/carrefour/fid/android/account/presentation/models/DQEAddressModel;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Pair;", "g0", "l0", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/a$a;", "partialState", "n0", "Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetDQEAddressSuggestionsUseCase;", "a", "Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetDQEAddressSuggestionsUseCase;", "getDQEAddressSuggestionsUseCase", "Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetVerificationDQEAddressUseCase;", "b", "Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetVerificationDQEAddressUseCase;", "getVerificationDQEAddressUseCase", "Lcom/carrefour/fid/android/account/domain/interactors/address/UpdateAndCheckUserAddressUseCase;", "c", "Lcom/carrefour/fid/android/account/domain/interactors/address/UpdateAndCheckUserAddressUseCase;", "updateUserAddressUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "d", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "clearServiceSelectionUseCase", "Lcom/carrefour/fid/android/account/domain/events/a;", "e", "Lcom/carrefour/fid/android/account/domain/events/a;", "addressTunnelDataProvider", "g", "Lcom/carrefour/fid/android/domain/models/account/Address;", "initialAddress", "h", "filledDeliveryAddress", "i", "Lcom/carrefour/fid/android/account/presentation/models/DQEAddressModel;", "selectedAddress", "Lcom/carrefour/fid/android/account/presentation/analytics/b;", "analytics", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetDQEAddressSuggestionsUseCase;Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetVerificationDQEAddressUseCase;Lcom/carrefour/fid/android/account/domain/interactors/address/UpdateAndCheckUserAddressUseCase;Lcom/carrefour/fid/android/domain/interactors/service/a;Lcom/carrefour/fid/android/account/domain/events/a;Lcom/carrefour/fid/android/account/presentation/analytics/b;Lkotlinx/coroutines/CoroutineDispatcher;)V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAccountAddressViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountAddressViewModel.kt\ncom/carrefour/fid/android/account/presentation/viewmodels/address/AccountAddressViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,275:1\n1549#2:276\n1620#2,3:277\n*S KotlinDebug\n*F\n+ 1 AccountAddressViewModel.kt\ncom/carrefour/fid/android/account/presentation/viewmodels/address/AccountAddressViewModel\n*L\n76#1:276\n76#1:277,3\n*E\n"})
public final class AccountAddressViewModel extends BaseMVIViewModel<C13645a.C13658c, C13645a.C13665d> implements C13285a {
    @C12579k

    /* renamed from: a */
    public final GetDQEAddressSuggestionsUseCase f33166a;
    @C12579k

    /* renamed from: b */
    public final GetVerificationDQEAddressUseCase f33167b;
    @C12579k

    /* renamed from: c */
    public final UpdateAndCheckUserAddressUseCase f33168c;
    @C12579k

    /* renamed from: d */
    public final C37811a f33169d;
    @C12579k

    /* renamed from: e */
    public final C13239a f33170e;

    /* renamed from: f */
    public final /* synthetic */ C13287b f33171f;
    @C12579k

    /* renamed from: g */
    public Address f33172g = new Address((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, AddressCategory.DELIVERY, 0, false, 0.0d, 0.0d, (Boolean) null, (String) null, 1040383, (DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: h */
    public Address f33173h;
    @C12580l

    /* renamed from: i */
    public DQEAddressModel f33174i;

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$a */
    public /* synthetic */ class C13631a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.domain.models.AddressCategory[] r0 = com.carrefour.fid.android.domain.models.AddressCategory.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.AddressCategory r1 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.AddressCategory r1 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel.C13631a.<clinit>():void");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @javax.inject.Inject
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AccountAddressViewModel(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase r33, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.account.domain.interactors.address.dqe.GetVerificationDQEAddressUseCase r34, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase r35, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.service.C37811a r36, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.account.domain.events.C13239a r37, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.account.presentation.analytics.C13287b r38, @com.carrefour.fid.android.shared.p045di.annotation.C28672p @org.jetbrains.annotations.C12579k kotlinx.coroutines.CoroutineDispatcher r39) {
        /*
            r32 = this;
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            java.lang.String r0 = "getDQEAddressSuggestionsUseCase"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "getVerificationDQEAddressUseCase"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "updateUserAddressUseCase"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "clearServiceSelectionUseCase"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "addressTunnelDataProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "analytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "dispatcher"
            r2 = r39
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$e r1 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13645a.C13658c.C13664e.f33243b
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r32
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f33166a = r7
            r6.f33167b = r8
            r6.f33168c = r9
            r6.f33169d = r10
            r6.f33170e = r11
            r6.f33171f = r12
            com.carrefour.fid.android.domain.models.account.Address r0 = new com.carrefour.fid.android.domain.models.account.Address
            r7 = r0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            com.carrefour.fid.android.domain.models.AddressCategory r21 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 1040383(0xfdfff, float:1.457887E-39)
            r31 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r29, r30, r31)
            r6.f33172g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel.<init>(com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase, com.carrefour.fid.android.account.domain.interactors.address.dqe.GetVerificationDQEAddressUseCase, com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase, com.carrefour.fid.android.domain.interactors.service.a, com.carrefour.fid.android.account.domain.events.a, com.carrefour.fid.android.account.presentation.analytics.b, kotlinx.coroutines.CoroutineDispatcher):void");
    }

    /* renamed from: p0 */
    public static /* synthetic */ Object m58322p0(AccountAddressViewModel accountAddressViewModel, DQEAddressModel dQEAddressModel, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dQEAddressModel = null;
        }
        return accountAddressViewModel.mo32387o0(dQEAddressModel, cVar);
    }

    /* renamed from: C */
    public void mo31584C(boolean z) {
        this.f33171f.mo31584C(z);
    }

    /* renamed from: I */
    public void mo31585I(boolean z) {
        this.f33171f.mo31585I(z);
    }

    /* renamed from: L */
    public void mo31586L() {
        this.f33171f.mo31586L();
    }

    /* renamed from: g0 */
    public final Pair<Address, String> mo32379g0() {
        C13645a.C13658c cVar = (C13645a.C13658c) getCurrentState();
        if (cVar instanceof C13645a.C13658c.C13659a) {
            return C13645a.f33197a.mo32404d(cVar);
        }
        emitEvent(new C13645a.C13653b.C13655b(new Throwable("Inappropriate state " + cVar)));
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32380h0(com.carrefour.fid.android.domain.models.account.Address r5, java.lang.String r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$getDQESuggestions$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$getDQESuggestions$1 r0 = (com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$getDQESuggestions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$getDQESuggestions$1 r0 = new com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$getDQESuggestions$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel r5 = (com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel) r5
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x005c
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$f r7 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$f
            r7.<init>(r5, r6)
            r4.mo32386n0(r7)
            com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase r6 = r4.f33166a
            java.lang.String r5 = r5.mo116677B()
            java.lang.String r5 = com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase.C13255a.m57421b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.mo31448a(r5, r0)
            if (r6 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r5 = r4
        L_0x005c:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r6)
            if (r7 != 0) goto L_0x0099
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r7 = 4
            java.util.List r6 = kotlin.collections.CollectionsKt___CollectionsKt.m40497E5(r6, r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.C10978t.m41495Y(r6, r0)
            r7.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x007c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r6.next()
            com.carrefour.fid.android.account.domain.models.DQEAddressDomain r0 = (com.carrefour.fid.android.account.domain.models.DQEAddressDomain) r0
            com.carrefour.fid.android.account.presentation.models.DQEAddressModel r0 = com.carrefour.fid.android.account.domain.extension.C13244b.m57382c(r0)
            r7.add(r0)
            goto L_0x007c
        L_0x0090:
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$c r6 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$c
            r6.<init>(r7)
            r5.mo32386n0(r6)
            goto L_0x00aa
        L_0x0099:
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$b r6 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$b
            r6.<init>(r7)
            r5.emitEvent(r6)
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e r6 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e
            r7 = 0
            r6.<init>(r7)
            r5.mo32386n0(r6)
        L_0x00aa:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel.mo32380h0(com.carrefour.fid.android.domain.models.account.Address, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: i0 */
    public final void mo32381i0() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = null;
        mo32386n0(new C13645a.C13646a.C13651e(false, 1, (DefaultConstructorMarker) null));
        if (this.f33173h != null) {
            Address address = this.f33173h;
            if (address != null) {
                str = address.mo116677B();
            } else {
                str = null;
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            Address address2 = this.f33173h;
            if (address2 != null) {
                str3 = address2.mo116694S();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            Address address3 = this.f33173h;
            if (address3 != null) {
                str5 = address3.mo116684I();
            } else {
                str5 = null;
            }
            if (str5 == null) {
                str6 = "";
            } else {
                str6 = str5;
            }
            Address address4 = this.f33173h;
            if (address4 != null) {
                str8 = address4.mo116685J();
            }
            if (str8 == null) {
                str7 = "";
            } else {
                str7 = str8;
            }
            publishState(new C13645a.C13658c.C13661b(str2, str4, str6, str7, (String) null, false, false, (List) null, C9527p.f26031b, (DefaultConstructorMarker) null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$b} */
    /* JADX WARNING: type inference failed for: r2v5, types: [com.carrefour.fid.android.shared.base.u$d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32382j0(com.carrefour.fid.android.domain.models.AddressCategory r29, com.carrefour.fid.android.domain.models.account.Address r30, com.carrefour.fid.android.domain.models.account.Address r31, java.lang.String r32) {
        /*
            r28 = this;
            r0 = r28
            if (r30 != 0) goto L_0x002c
            com.carrefour.fid.android.domain.models.account.Address r26 = new com.carrefour.fid.android.domain.models.account.Address
            r1 = r26
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.carrefour.fid.android.domain.models.AddressCategory r15 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 1040383(0xfdfff, float:1.457887E-39)
            r25 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r23, r24, r25)
            goto L_0x002e
        L_0x002c:
            r1 = r30
        L_0x002e:
            if (r31 != 0) goto L_0x0058
            com.carrefour.fid.android.domain.models.account.Address r27 = new com.carrefour.fid.android.domain.models.account.Address
            r2 = r27
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            com.carrefour.fid.android.domain.models.AddressCategory r16 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 1040383(0xfdfff, float:1.457887E-39)
            r26 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r24, r25, r26)
            goto L_0x005a
        L_0x0058:
            r2 = r31
        L_0x005a:
            com.carrefour.fid.android.shared.base.u$d r3 = r28.getCurrentState()
            boolean r3 = r3 instanceof com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13645a.C13658c.C13664e
            if (r3 != 0) goto L_0x006f
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$c r1 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$c
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r1.<init>(r2)
            r0.mo32386n0(r1)
            return
        L_0x006f:
            int[] r3 = com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel.C13631a.$EnumSwitchMapping$0
            int r4 = r29.ordinal()
            r4 = r3[r4]
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == r7) goto L_0x00b8
            if (r4 != r6) goto L_0x00b2
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$b r4 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$b
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 255(0xff, float:3.57E-43)
            r18 = 0
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.publishState(r4)
            java.lang.String r4 = r2.mo116722w()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x00a0
            r4 = r7
            goto L_0x00a1
        L_0x00a0:
            r4 = r5
        L_0x00a1:
            if (r4 == 0) goto L_0x00db
            r0.f33173h = r2
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$c r4 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$c
            boolean r2 = r0.mo32383k0(r2, r1)
            r4.<init>(r2)
            r0.emitEvent(r4)
            goto L_0x00db
        L_0x00b2:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x00b8:
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$d r1 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$d
            r8 = r1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 16383(0x3fff, float:2.2957E-41)
            r24 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.publishState(r1)
            r1 = r2
        L_0x00db:
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e r2 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e
            r4 = 0
            r2.<init>(r5, r7, r4)
            r0.mo32386n0(r2)
            r0.f33172g = r1
            com.carrefour.fid.android.domain.models.AddressCategory r2 = r1.mo116683H()
            int r2 = r2.ordinal()
            r2 = r3[r2]
            java.lang.String r3 = ""
            if (r2 == r7) goto L_0x0121
            if (r2 != r6) goto L_0x011b
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$b r2 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$b
            java.lang.String r9 = r1.mo116677B()
            java.lang.String r10 = r1.mo116694S()
            java.lang.String r11 = r1.mo116684I()
            java.lang.String r12 = r1.mo116685J()
            if (r32 != 0) goto L_0x010c
            r13 = r3
            goto L_0x010e
        L_0x010c:
            r13 = r32
        L_0x010e:
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 224(0xe0, float:3.14E-43)
            r18 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x016e
        L_0x011b:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x0121:
            java.lang.String r4 = r1.mo116677B()
            java.lang.String r5 = r1.mo116694S()
            java.lang.String r6 = r1.mo116684I()
            java.lang.String r7 = r1.mo116685J()
            if (r32 != 0) goto L_0x0135
            r8 = r3
            goto L_0x0137
        L_0x0135:
            r8 = r32
        L_0x0137:
            java.lang.String r9 = r1.mo116682G()
            java.lang.String r10 = r1.mo116686K()
            java.lang.String r11 = r1.mo116689N()
            java.lang.String r2 = r1.mo116687L()
            if (r2 != 0) goto L_0x014c
            r19 = r3
            goto L_0x014e
        L_0x014c:
            r19 = r2
        L_0x014e:
            java.lang.String r13 = r1.mo116688M()
            boolean r12 = r1.mo116692Q()
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$d r1 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$c$d
            r2 = r1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 14336(0x3800, float:2.0089E-41)
            r18 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x016e:
            r0.publishState(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel.mo32382j0(com.carrefour.fid.android.domain.models.AddressCategory, com.carrefour.fid.android.domain.models.account.Address, com.carrefour.fid.android.domain.models.account.Address, java.lang.String):void");
    }

    /* renamed from: k */
    public void mo31587k(boolean z) {
        this.f33171f.mo31587k(z);
    }

    /* renamed from: k0 */
    public final boolean mo32383k0(Address address, Address address2) {
        if (!Intrinsics.areEqual((Object) address.mo116677B(), (Object) address2.mo116677B()) || !Intrinsics.areEqual((Object) address.mo116694S(), (Object) address2.mo116694S()) || !Intrinsics.areEqual((Object) address.mo116684I(), (Object) address2.mo116684I()) || !Intrinsics.areEqual((Object) address.mo116685J(), (Object) address2.mo116685J())) {
            return false;
        }
        return true;
    }

    /* renamed from: l0 */
    public final boolean mo32384l0() {
        C13645a.C13658c cVar = (C13645a.C13658c) getCurrentState();
        if (cVar instanceof C13645a.C13658c.C13661b) {
            return ((C13645a.C13658c.C13661b) cVar).isLoading();
        }
        if (cVar instanceof C13645a.C13658c.C13663d) {
            return ((C13645a.C13658c.C13663d) cVar).isLoading();
        }
        if (Intrinsics.areEqual((Object) cVar, (Object) C13645a.C13658c.C13664e.f33243b)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12580l
    /* renamed from: m0 */
    public Object processIntent(@C12579k C13645a.C13665d dVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (Intrinsics.areEqual((Object) dVar, (Object) C13645a.C13665d.C13666a.f33245a)) {
            mo32386n0(C13645a.C13646a.C13647a.f33199b);
        } else if (dVar instanceof C13645a.C13665d.C13667b) {
            C13645a.C13665d.C13667b bVar = (C13645a.C13665d.C13667b) dVar;
            mo32382j0(bVar.mo32503h(), bVar.mo32502g(), bVar.mo32505i(), bVar.mo32506j());
        } else if (dVar instanceof C13645a.C13665d.C13668c) {
            C13645a.C13665d.C13668c cVar2 = (C13645a.C13665d.C13668c) dVar;
            Object h0 = mo32380h0(cVar2.mo32511e(), cVar2.mo32513f(), cVar);
            if (h0 == C11063b.m42612h()) {
                return h0;
            }
            return C11079d2.f28267a;
        } else if (dVar instanceof C13645a.C13665d.C13671f) {
            C13645a.C13665d.C13671f fVar = (C13645a.C13665d.C13671f) dVar;
            Object q0 = mo32388q0(fVar.mo32527f(), fVar.mo32529h(), fVar.mo32528g(), cVar);
            if (q0 == C11063b.m42612h()) {
                return q0;
            }
            return C11079d2.f28267a;
        } else if (dVar instanceof C13645a.C13665d.C13669d) {
            C13645a.C13665d.C13669d dVar2 = (C13645a.C13665d.C13669d) dVar;
            this.f33174i = dVar2.mo32518d();
            mo32386n0(new C13645a.C13646a.C13648b(dVar2.mo32518d()));
        } else if (dVar instanceof C13645a.C13665d.C13670e) {
            mo32381i0();
        }
        return C11079d2.f28267a;
    }

    /* renamed from: n0 */
    public final void mo32386n0(C13645a.C13646a aVar) {
        reduceAndPublishState(C13645a.f33197a.mo32402b(), aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32387o0(com.carrefour.fid.android.account.presentation.models.DQEAddressModel r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$saveAddress$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$saveAddress$1 r0 = (com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$saveAddress$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$saveAddress$1 r0 = new com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$saveAddress$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel r7 = (com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0074
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            kotlin.C11661u0.m45747n(r8)
            kotlin.Pair r8 = r6.mo32379g0()
            if (r8 != 0) goto L_0x0047
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0047:
            java.lang.Object r2 = r8.mo21846a()
            com.carrefour.fid.android.domain.models.account.Address r2 = (com.carrefour.fid.android.domain.models.account.Address) r2
            java.lang.Object r8 = r8.mo21847b()
            java.lang.String r8 = (java.lang.String) r8
            boolean r4 = r6.mo32384l0()
            if (r4 != 0) goto L_0x0061
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e r4 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e
            r4.<init>(r3)
            r6.mo32386n0(r4)
        L_0x0061:
            com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase r4 = r6.f33168c
            com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$a r5 = new com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$a
            r5.<init>(r2, r7, r8)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r4.m172727invokegIAlus(r5, r0)
            if (r8 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r7 = r6
        L_0x0074:
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e r0 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e
            r1 = 0
            r0.<init>(r1)
            r7.mo32386n0(r0)
            java.lang.Throwable r0 = kotlin.Result.m38705e(r8)
            if (r0 == 0) goto L_0x008b
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$b r1 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$b
            r1.<init>(r0)
            r7.emitEvent(r1)
        L_0x008b:
            boolean r0 = kotlin.Result.m38710j(r8)
            if (r0 == 0) goto L_0x009b
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r8.booleanValue()
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$a r8 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13645a.C13653b.C13654a.f33210a
            r7.emitEvent(r8)
        L_0x009b:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel.mo32387o0(com.carrefour.fid.android.account.presentation.models.DQEAddressModel, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32388q0(com.carrefour.fid.android.domain.models.account.Address r41, java.lang.String r42, boolean r43, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r44) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r42
            r3 = r43
            r4 = r44
            boolean r5 = r4 instanceof com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$validateUserInput$1
            if (r5 == 0) goto L_0x001d
            r5 = r4
            com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$validateUserInput$1 r5 = (com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$validateUserInput$1) r5
            int r6 = r5.label
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.label = r6
            goto L_0x0022
        L_0x001d:
            com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$validateUserInput$1 r5 = new com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel$validateUserInput$1
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r4 = r5.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r7 = r5.label
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 0
            r12 = 0
            r13 = 1
            if (r7 == 0) goto L_0x00a7
            if (r7 == r13) goto L_0x0092
            if (r7 == r10) goto L_0x0071
            if (r7 == r9) goto L_0x0053
            if (r7 != r8) goto L_0x004b
            java.lang.Object r1 = r5.L$3
            com.carrefour.fid.android.domain.models.account.Address r1 = (com.carrefour.fid.android.domain.models.account.Address) r1
            java.lang.Object r2 = r5.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel r3 = (com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel) r3
            kotlin.C11661u0.m45747n(r4)
            goto L_0x01f8
        L_0x004b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0053:
            boolean r1 = r5.Z$0
            java.lang.Object r2 = r5.L$4
            com.carrefour.fid.android.domain.models.account.Address r2 = (com.carrefour.fid.android.domain.models.account.Address) r2
            java.lang.Object r3 = r5.L$3
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r7 = r5.L$2
            java.lang.Object r9 = r5.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r5.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel r10 = (com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel) r10
            kotlin.C11661u0.m45747n(r4)
            kotlin.Result r4 = (kotlin.Result) r4
            r4.mo21858l()
            goto L_0x01d1
        L_0x0071:
            boolean r1 = r5.Z$0
            java.lang.Object r2 = r5.L$3
            com.carrefour.fid.android.domain.models.account.Address r2 = (com.carrefour.fid.android.domain.models.account.Address) r2
            java.lang.Object r3 = r5.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r7 = r5.L$1
            com.carrefour.fid.android.domain.models.account.Address r7 = (com.carrefour.fid.android.domain.models.account.Address) r7
            java.lang.Object r10 = r5.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel r10 = (com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel) r10
            kotlin.C11661u0.m45747n(r4)
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r4 = r4.mo21858l()
            r14 = r7
            r7 = r4
            r4 = r2
            r2 = r3
            goto L_0x0123
        L_0x0092:
            java.lang.Object r1 = r5.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r5.L$1
            com.carrefour.fid.android.domain.models.account.Address r2 = (com.carrefour.fid.android.domain.models.account.Address) r2
            java.lang.Object r3 = r5.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel r3 = (com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel) r3
            kotlin.C11661u0.m45747n(r4)
            r39 = r2
            r2 = r1
            r1 = r39
            goto L_0x00fa
        L_0x00a7:
            kotlin.C11661u0.m45747n(r4)
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$f r4 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$f
            r4.<init>(r1, r2)
            r0.mo32386n0(r4)
            com.carrefour.fid.android.domain.models.account.Address r4 = r0.f33172g
            java.lang.String r7 = r4.mo116722w()
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00c0
            r7 = r13
            goto L_0x00c1
        L_0x00c0:
            r7 = r12
        L_0x00c1:
            if (r7 == 0) goto L_0x00d2
            com.carrefour.fid.android.domain.models.AddressCategory r7 = r41.mo116683H()
            com.carrefour.fid.android.domain.models.AddressCategory r14 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            if (r7 != r14) goto L_0x00cd
            r7 = r13
            goto L_0x00ce
        L_0x00cd:
            r7 = r12
        L_0x00ce:
            r0.mo31584C(r7)
            goto L_0x00e0
        L_0x00d2:
            com.carrefour.fid.android.domain.models.AddressCategory r7 = r41.mo116683H()
            com.carrefour.fid.android.domain.models.AddressCategory r14 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            if (r7 != r14) goto L_0x00dc
            r7 = r13
            goto L_0x00dd
        L_0x00dc:
            r7 = r12
        L_0x00dd:
            r0.mo31587k(r7)
        L_0x00e0:
            com.carrefour.fid.android.domain.models.AddressCategory r7 = r41.mo116683H()
            com.carrefour.fid.android.domain.models.AddressCategory r14 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING
            if (r7 != r14) goto L_0x010b
            if (r3 == 0) goto L_0x00f9
            r5.L$0 = r0
            r5.L$1 = r1
            r5.L$2 = r2
            r5.label = r13
            java.lang.Object r3 = r0.mo32387o0(r11, r5)
            if (r3 != r6) goto L_0x00f9
            return r6
        L_0x00f9:
            r3 = r0
        L_0x00fa:
            com.carrefour.fid.android.account.domain.events.a r3 = r3.f33170e
            com.carrefour.fid.android.domain.models.account.a r4 = new com.carrefour.fid.android.domain.models.account.a
            java.lang.String r2 = com.carrefour.fid.android.domain.models.account.C37948b.m155948b(r2)
            r4.<init>(r1, r2, r11)
            r3.mo31416b(r4)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x010b:
            com.carrefour.fid.android.account.domain.interactors.address.dqe.GetVerificationDQEAddressUseCase r7 = r0.f33167b
            r5.L$0 = r0
            r5.L$1 = r1
            r5.L$2 = r2
            r5.L$3 = r4
            r5.Z$0 = r3
            r5.label = r10
            java.lang.Object r7 = r7.m172730invokegIAlus(r1, r5)
            if (r7 != r6) goto L_0x0120
            return r6
        L_0x0120:
            r10 = r0
            r14 = r1
            r1 = r3
        L_0x0123:
            java.lang.Throwable r3 = kotlin.Result.m38705e(r7)
            if (r3 == 0) goto L_0x0139
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$b r15 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$b
            r15.<init>(r3)
            r10.emitEvent(r15)
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e r3 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e
            r3.<init>(r12)
            r10.mo32386n0(r3)
        L_0x0139:
            boolean r3 = kotlin.Result.m38710j(r7)
            if (r3 == 0) goto L_0x0232
            r3 = r7
            java.util.List r3 = (java.util.List) r3
            r15 = r3
            java.util.Collection r15 = (java.util.Collection) r15
            int r15 = r15.size()
            if (r15 != r13) goto L_0x0210
            java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r3)
            com.carrefour.fid.android.account.domain.models.DQEAddressDomain r15 = (com.carrefour.fid.android.account.domain.models.DQEAddressDomain) r15
            com.carrefour.fid.android.account.presentation.models.DQEAddressModel r15 = com.carrefour.fid.android.account.domain.extension.C13244b.m57382c(r15)
            java.lang.String r19 = r15.mo31628j()
            java.lang.String r20 = r15.mo31634p()
            java.lang.String r18 = r15.mo31629k()
            double r33 = r15.mo31632n()
            double r31 = r15.mo31633o()
            java.lang.String r36 = r15.mo31630l()
            r15 = 0
            r16 = 0
            r17 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r35 = 0
            r37 = 327623(0x4ffc7, float:4.59098E-40)
            r38 = 0
            com.carrefour.fid.android.domain.models.account.Address r14 = com.carrefour.fid.android.domain.models.account.Address.m155867v(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r36, r37, r38)
            com.carrefour.fid.android.domain.models.AddressCategory r15 = r14.mo116683H()
            com.carrefour.fid.android.domain.models.AddressCategory r13 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            if (r15 != r13) goto L_0x01d6
            if (r1 == 0) goto L_0x01d6
            java.lang.String r13 = r4.mo116722w()
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x01a7
            r13 = 1
            goto L_0x01a8
        L_0x01a7:
            r13 = r12
        L_0x01a8:
            if (r13 == 0) goto L_0x01d6
            java.lang.String r4 = r4.mo116725y()
            java.lang.String r13 = r14.mo116725y()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r13)
            if (r4 != 0) goto L_0x01d6
            com.carrefour.fid.android.domain.interactors.service.a r4 = r10.f33169d
            r5.L$0 = r10
            r5.L$1 = r2
            r5.L$2 = r7
            r5.L$3 = r3
            r5.L$4 = r14
            r5.Z$0 = r1
            r5.label = r9
            java.lang.Object r4 = r4.m172965invokeIoAF18A(r5)
            if (r4 != r6) goto L_0x01cf
            return r6
        L_0x01cf:
            r9 = r2
            r2 = r14
        L_0x01d1:
            r14 = r2
            r4 = r3
            r2 = r9
        L_0x01d4:
            r3 = r10
            goto L_0x01d8
        L_0x01d6:
            r4 = r3
            goto L_0x01d4
        L_0x01d8:
            if (r1 == 0) goto L_0x01f9
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r4)
            com.carrefour.fid.android.account.domain.models.DQEAddressDomain r1 = (com.carrefour.fid.android.account.domain.models.DQEAddressDomain) r1
            com.carrefour.fid.android.account.presentation.models.DQEAddressModel r1 = com.carrefour.fid.android.account.domain.extension.C13244b.m57382c(r1)
            r5.L$0 = r3
            r5.L$1 = r2
            r5.L$2 = r7
            r5.L$3 = r14
            r5.L$4 = r11
            r5.label = r8
            java.lang.Object r1 = r3.mo32387o0(r1, r5)
            if (r1 != r6) goto L_0x01f7
            return r6
        L_0x01f7:
            r1 = r14
        L_0x01f8:
            r14 = r1
        L_0x01f9:
            com.carrefour.fid.android.account.domain.events.a r1 = r3.f33170e
            com.carrefour.fid.android.domain.models.account.a r4 = new com.carrefour.fid.android.domain.models.account.a
            java.lang.String r2 = com.carrefour.fid.android.domain.models.account.C37948b.m155948b(r2)
            r4.<init>(r14, r2, r11)
            r1.mo31416b(r4)
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e r1 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e
            r1.<init>(r12)
            r3.mo32386n0(r1)
            goto L_0x0232
        L_0x0210:
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e r1 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$a$e
            r1.<init>(r12)
            r10.mo32386n0(r1)
            kotlin.Pair r1 = r10.mo32379g0()
            if (r1 == 0) goto L_0x0232
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$d r2 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.a$b$d
            java.lang.Object r3 = r1.mo21849e()
            com.carrefour.fid.android.domain.models.account.Address r3 = (com.carrefour.fid.android.domain.models.account.Address) r3
            java.lang.Object r1 = r1.mo21851f()
            java.lang.String r1 = (java.lang.String) r1
            r2.<init>(r3, r1)
            r10.emitEvent(r2)
        L_0x0232:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.address.AccountAddressViewModel.mo32388q0(com.carrefour.fid.android.domain.models.account.Address, java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: z */
    public void mo31588z() {
        this.f33171f.mo31588z();
    }
}
