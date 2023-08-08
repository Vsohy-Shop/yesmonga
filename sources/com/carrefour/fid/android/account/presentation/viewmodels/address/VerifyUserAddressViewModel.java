package com.carrefour.fid.android.account.presentation.viewmodels.address;

import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.account.domain.events.C13239a;
import com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetVerificationDQEAddressUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13286a0;
import com.carrefour.fid.android.account.presentation.analytics.C13313z;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.C37947a;
import com.carrefour.fid.android.domain.models.account.C37948b;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.constant.C28513a;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B9\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200¢\u0006\u0004\b9\u0010:J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0001J\t\u0010\t\u001a\u00020\u0007H\u0001J\u001b\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0010J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J#\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/viewmodels/address/VerifyUserAddressViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/b$b;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/b$c;", "Lcom/carrefour/fid/android/account/presentation/analytics/z;", "", "eventLabel", "Lkotlin/d2;", "p", "V", "intent", "k0", "(Lcom/carrefour/fid/android/account/presentation/viewmodels/address/mvi/b$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "autoSave", "l0", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/account/presentation/models/DQEAddressModel;", "dqeAddress", "m0", "(Lcom/carrefour/fid/android/account/presentation/models/DQEAddressModel;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "o0", "Lcom/carrefour/fid/android/domain/models/account/Address;", "address", "telephone", "j0", "p0", "(Lcom/carrefour/fid/android/domain/models/account/Address;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "a", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetDQEAddressSuggestionsUseCase;", "b", "Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetDQEAddressSuggestionsUseCase;", "getDQEAddressSuggestionsUseCase", "Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetVerificationDQEAddressUseCase;", "c", "Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetVerificationDQEAddressUseCase;", "getVerificationDQEAddressUseCase", "Lcom/carrefour/fid/android/account/domain/interactors/address/UpdateAndCheckUserAddressUseCase;", "d", "Lcom/carrefour/fid/android/account/domain/interactors/address/UpdateAndCheckUserAddressUseCase;", "updateUserAddressUseCase", "Lcom/carrefour/fid/android/account/presentation/analytics/a0;", "e", "Lcom/carrefour/fid/android/account/presentation/analytics/a0;", "analytics", "Lcom/carrefour/fid/android/account/domain/events/a;", "f", "Lcom/carrefour/fid/android/account/domain/events/a;", "addressTunnelDataProvider", "", "Lcom/carrefour/fid/android/domain/models/AddressCategory;", "g", "Ljava/util/Set;", "addressesAlreadyStored", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetDQEAddressSuggestionsUseCase;Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetVerificationDQEAddressUseCase;Lcom/carrefour/fid/android/account/domain/interactors/address/UpdateAndCheckUserAddressUseCase;Lcom/carrefour/fid/android/account/presentation/analytics/a0;Lcom/carrefour/fid/android/account/domain/events/a;)V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nVerifyUserAddressViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyUserAddressViewModel.kt\ncom/carrefour/fid/android/account/presentation/viewmodels/address/VerifyUserAddressViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,194:1\n1549#2:195\n1620#2,3:196\n*S KotlinDebug\n*F\n+ 1 VerifyUserAddressViewModel.kt\ncom/carrefour/fid/android/account/presentation/viewmodels/address/VerifyUserAddressViewModel\n*L\n178#1:195\n178#1:196,3\n*E\n"})
public final class VerifyUserAddressViewModel extends BaseMVIViewModel<C13673b.C13678b, C13673b.C13679c> implements C13313z {
    @C12579k

    /* renamed from: a */
    public final C37878e f33175a;
    @C12579k

    /* renamed from: b */
    public final GetDQEAddressSuggestionsUseCase f33176b;
    @C12579k

    /* renamed from: c */
    public final GetVerificationDQEAddressUseCase f33177c;
    @C12579k

    /* renamed from: d */
    public final UpdateAndCheckUserAddressUseCase f33178d;
    @C12579k

    /* renamed from: e */
    public final C13286a0 f33179e;
    @C12579k

    /* renamed from: f */
    public final C13239a f33180f;
    @C12579k

    /* renamed from: g */
    public final Set<AddressCategory> f33181g = new LinkedHashSet();

    @C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$1", mo22502f = "VerifyUserAddressViewModel.kt", mo22503i = {}, mo22504l = {42}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nVerifyUserAddressViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyUserAddressViewModel.kt\ncom/carrefour/fid/android/account/presentation/viewmodels/address/VerifyUserAddressViewModel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,194:1\n1#2:195\n1549#3:196\n1620#3,3:197\n*S KotlinDebug\n*F\n+ 1 VerifyUserAddressViewModel.kt\ncom/carrefour/fid/android/account/presentation/viewmodels/address/VerifyUserAddressViewModel$1\n*L\n43#1:196\n43#1:197,3\n*E\n"})
    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$1 */
    public static final class C136321 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;
        final /* synthetic */ VerifyUserAddressViewModel this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C136321(this.this$0, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object obj2;
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C37878e e0 = this.this$0.f33175a;
                C37878e.C37879a aVar = C37878e.C37879a.f94997a;
                this.label = 1;
                obj2 = e0.m172966invokegIAlus(aVar, this);
                if (obj2 == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
                obj2 = ((Result) obj).mo21858l();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            VerifyUserAddressViewModel verifyUserAddressViewModel = this.this$0;
            if (Result.m38710j(obj2)) {
                Set d0 = verifyUserAddressViewModel.f33181g;
                Iterable<Address> v = ((AccountInfo) obj2).mo116668v();
                ArrayList arrayList = new ArrayList(C10978t.m41495Y(v, 10));
                for (Address H : v) {
                    arrayList.add(H.mo116683H());
                }
                d0.addAll(arrayList);
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C136321) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public VerifyUserAddressViewModel(@C12579k C37878e eVar, @C12579k GetDQEAddressSuggestionsUseCase getDQEAddressSuggestionsUseCase, @C12579k GetVerificationDQEAddressUseCase getVerificationDQEAddressUseCase, @C12579k UpdateAndCheckUserAddressUseCase updateAndCheckUserAddressUseCase, @C12579k C13286a0 a0Var, @C12579k C13239a aVar) {
        super(new C13673b.C13678b((Address) null, (String) null, (List) null, (C13673b.C13683d) null, false, 31, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(getDQEAddressSuggestionsUseCase, "getDQEAddressSuggestionsUseCase");
        Intrinsics.checkNotNullParameter(getVerificationDQEAddressUseCase, "getVerificationDQEAddressUseCase");
        Intrinsics.checkNotNullParameter(updateAndCheckUserAddressUseCase, "updateUserAddressUseCase");
        Intrinsics.checkNotNullParameter(a0Var, "analytics");
        Intrinsics.checkNotNullParameter(aVar, "addressTunnelDataProvider");
        this.f33175a = eVar;
        this.f33176b = getDQEAddressSuggestionsUseCase;
        this.f33177c = getVerificationDQEAddressUseCase;
        this.f33178d = updateAndCheckUserAddressUseCase;
        this.f33179e = a0Var;
        this.f33180f = aVar;
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new C136321(this, (C11045c<? super C136321>) null), 3, (Object) null);
    }

    /* renamed from: n0 */
    public static /* synthetic */ Object m58344n0(VerifyUserAddressViewModel verifyUserAddressViewModel, DQEAddressModel dQEAddressModel, boolean z, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dQEAddressModel = null;
        }
        return verifyUserAddressViewModel.mo32392m0(dQEAddressModel, z, cVar);
    }

    /* renamed from: V */
    public void mo31589V() {
        this.f33179e.mo31589V();
    }

    /* renamed from: j0 */
    public final void mo32389j0(Address address, String str) {
        this.f33180f.mo31416b(new C37947a(address, C37948b.m155948b(str), (DefaultConstructorMarker) null));
    }

    @C12580l
    /* renamed from: k0 */
    public Object processIntent(@C12579k C13673b.C13679c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (cVar instanceof C13673b.C13679c.C13681b) {
            C13673b.C13679c.C13681b bVar = (C13673b.C13679c.C13681b) cVar;
            Object p0 = mo32394p0(bVar.mo32563e(), bVar.mo32565f(), cVar2);
            if (p0 == C11063b.m42612h()) {
                return p0;
            }
            return C11079d2.f28267a;
        } else if (cVar instanceof C13673b.C13679c.C13680a) {
            Object l0 = mo32391l0(((C13673b.C13679c.C13680a) cVar).mo32556d(), cVar2);
            if (l0 == C11063b.m42612h()) {
                return l0;
            }
            return C11079d2.f28267a;
        } else {
            if (cVar instanceof C13673b.C13679c.C13682c) {
                publishState(C13673b.C13678b.m58489k((C13673b.C13678b) getCurrentState(), (Address) null, (String) null, (List) null, ((C13673b.C13679c.C13682c) cVar).mo32570d(), false, 23, (Object) null));
            }
            return C11079d2.f28267a;
        }
    }

    /* renamed from: l0 */
    public final Object mo32391l0(boolean z, C11045c<? super C11079d2> cVar) {
        C13673b.C13683d m = ((C13673b.C13678b) getCurrentState()).mo32552m();
        if (Intrinsics.areEqual((Object) m, (Object) C13673b.C13683d.C13684a.f33284a)) {
            mo31590p(C28513a.f68686x);
            Object o0 = mo32393o0(z, cVar);
            if (o0 == C11063b.m42612h()) {
                return o0;
            }
            return C11079d2.f28267a;
        }
        if (Intrinsics.areEqual((Object) m, (Object) C13673b.C13683d.C13685b.f33286a)) {
            mo31590p(C28513a.f68685w);
            emitEvent(C13673b.C13674a.C13677c.f33269a);
        } else if (m instanceof C13673b.C13683d.C13686c) {
            mo31590p(C28513a.f68684v);
            Object m0 = mo32392m0(((C13673b.C13683d.C13686c) m).mo32576d(), z, cVar);
            if (m0 == C11063b.m42612h()) {
                return m0;
            }
            return C11079d2.f28267a;
        } else if (m == null) {
            emitEvent(new C13673b.C13674a.C13676b(new Throwable("Without a VerificationChoice, we cannot save anything")));
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32392m0(com.carrefour.fid.android.account.presentation.models.DQEAddressModel r35, boolean r36, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r37) {
        /*
            r34 = this;
            r0 = r34
            r1 = r37
            boolean r2 = r1 instanceof com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$saveAddress$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$saveAddress$1 r2 = (com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$saveAddress$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$saveAddress$1 r2 = new com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$saveAddress$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0064
            if (r4 == r6) goto L_0x004b
            if (r4 != r5) goto L_0x0043
            java.lang.Object r3 = r2.L$3
            com.carrefour.fid.android.domain.models.account.Address r3 = (com.carrefour.fid.android.domain.models.account.Address) r3
            java.lang.Object r4 = r2.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel r2 = (com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0172
        L_0x0043:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004b:
            boolean r4 = r2.Z$0
            java.lang.Object r6 = r2.L$2
            com.carrefour.fid.android.domain.models.account.Address r6 = (com.carrefour.fid.android.domain.models.account.Address) r6
            java.lang.Object r7 = r2.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel r8 = (com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel) r8
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00e3
        L_0x0064:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.shared.base.u$d r1 = r34.getCurrentState()
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r1 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r1
            com.carrefour.fid.android.domain.models.account.Address r7 = r1.mo32542e()
            java.lang.String r1 = r1.mo32544f()
            if (r7 == 0) goto L_0x01ec
            if (r1 != 0) goto L_0x007b
            goto L_0x01ec
        L_0x007b:
            com.carrefour.fid.android.shared.base.u$d r4 = r34.getCurrentState()
            r8 = r4
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r8 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r8
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 1
            r14 = 15
            r15 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r4 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.m58489k(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.publishState(r4)
            if (r35 == 0) goto L_0x00c8
            java.lang.String r12 = r35.mo31628j()
            java.lang.String r13 = r35.mo31634p()
            java.lang.String r11 = r35.mo31629k()
            java.lang.String r29 = r35.mo31630l()
            r8 = 0
            r9 = 0
            r10 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 524231(0x7ffc7, float:7.34604E-40)
            r31 = 0
            com.carrefour.fid.android.domain.models.account.Address r4 = com.carrefour.fid.android.domain.models.account.Address.m155867v(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r29, r30, r31)
            goto L_0x00c9
        L_0x00c8:
            r4 = r7
        L_0x00c9:
            com.carrefour.fid.android.account.domain.interactors.address.dqe.GetVerificationDQEAddressUseCase r7 = r0.f33177c
            r2.L$0 = r0
            r2.L$1 = r1
            r2.L$2 = r4
            r8 = r36
            r2.Z$0 = r8
            r2.label = r6
            java.lang.Object r6 = r7.m172730invokegIAlus(r4, r2)
            if (r6 != r3) goto L_0x00de
            return r3
        L_0x00de:
            r7 = r1
            r1 = r6
            r6 = r4
            r4 = r8
            r8 = r0
        L_0x00e3:
            java.lang.Throwable r9 = kotlin.Result.m38705e(r1)
            if (r9 == 0) goto L_0x0108
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b r10 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b
            r10.<init>(r9)
            r8.emitEvent(r10)
            com.carrefour.fid.android.shared.base.u$d r9 = r8.getCurrentState()
            r10 = r9
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r10 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r10
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 15
            r17 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r9 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.m58489k(r10, r11, r12, r13, r14, r15, r16, r17)
            r8.publishState(r9)
        L_0x0108:
            boolean r9 = kotlin.Result.m38710j(r1)
            if (r9 == 0) goto L_0x01e9
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r9)
            com.carrefour.fid.android.account.domain.models.DQEAddressDomain r9 = (com.carrefour.fid.android.account.domain.models.DQEAddressDomain) r9
            if (r9 == 0) goto L_0x01da
            com.carrefour.fid.android.account.presentation.models.DQEAddressModel r9 = com.carrefour.fid.android.account.domain.extension.C13244b.m57382c(r9)
            if (r9 != 0) goto L_0x0121
            goto L_0x01da
        L_0x0121:
            double r28 = r9.mo31632n()
            double r26 = r9.mo31633o()
            java.lang.String r31 = r9.mo31630l()
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
            r23 = 0
            r24 = 0
            r25 = 0
            r30 = 0
            r32 = 327679(0x4ffff, float:4.59176E-40)
            r33 = 0
            r5 = r9
            r9 = r6
            com.carrefour.fid.android.domain.models.account.Address r9 = com.carrefour.fid.android.domain.models.account.Address.m155867v(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31, r32, r33)
            if (r4 == 0) goto L_0x01bf
            com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase r4 = r8.f33178d
            com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$a r10 = new com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$a
            r10.<init>(r6, r5, r7)
            r2.L$0 = r8
            r2.L$1 = r7
            r2.L$2 = r1
            r2.L$3 = r9
            r1 = 2
            r2.label = r1
            java.lang.Object r1 = r4.m172727invokegIAlus(r10, r2)
            if (r1 != r3) goto L_0x016f
            return r3
        L_0x016f:
            r4 = r7
            r2 = r8
            r3 = r9
        L_0x0172:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r1)
            if (r5 == 0) goto L_0x0196
            com.carrefour.fid.android.shared.base.u$d r6 = r2.getCurrentState()
            r7 = r6
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r7 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 15
            r14 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r6 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.m58489k(r7, r8, r9, r10, r11, r12, r13, r14)
            r2.publishState(r6)
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b r6 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b
            r6.<init>(r5)
            r2.emitEvent(r6)
        L_0x0196:
            boolean r5 = kotlin.Result.m38710j(r1)
            if (r5 == 0) goto L_0x01bc
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r5 = r1
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r5 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 15
            r12 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r1 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.m58489k(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.publishState(r1)
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$a r1 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13674a.C13675a.f33265a
            r2.emitEvent(r1)
        L_0x01bc:
            r8 = r2
            r9 = r3
            r7 = r4
        L_0x01bf:
            r8.mo32389j0(r9, r7)
            com.carrefour.fid.android.shared.base.u$d r1 = r8.getCurrentState()
            r9 = r1
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r9 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r9
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 15
            r16 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r1 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.m58489k(r9, r10, r11, r12, r13, r14, r15, r16)
            r8.publishState(r1)
            goto L_0x01e9
        L_0x01da:
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b r1 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "Address unknown for DQE"
            r2.<init>(r3)
            r1.<init>(r2)
            r8.emitEvent(r1)
        L_0x01e9:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x01ec:
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b r1 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r3 = "Address and Telephone cannot be null before saving them."
            r2.<init>(r3)
            r1.<init>(r2)
            r0.emitEvent(r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel.mo32392m0(com.carrefour.fid.android.account.presentation.models.DQEAddressModel, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32393o0(boolean r16, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            boolean r2 = r1 instanceof com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$saveNonDQEAddress$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$saveNonDQEAddress$1 r2 = (com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$saveNonDQEAddress$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$saveNonDQEAddress$1 r2 = new com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$saveNonDQEAddress$1
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x0046
            if (r4 != r5) goto L_0x003e
            java.lang.Object r3 = r2.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.L$1
            com.carrefour.fid.android.domain.models.account.Address r4 = (com.carrefour.fid.android.domain.models.account.Address) r4
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel r2 = (com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x008f
        L_0x003e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0046:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.shared.base.u$d r1 = r15.getCurrentState()
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r1 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r1
            com.carrefour.fid.android.domain.models.account.Address r4 = r1.mo32542e()
            java.lang.String r1 = r1.mo32544f()
            if (r4 == 0) goto L_0x00f8
            if (r1 != 0) goto L_0x005d
            goto L_0x00f8
        L_0x005d:
            com.carrefour.fid.android.shared.base.u$d r6 = r15.getCurrentState()
            r7 = r6
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r7 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 15
            r14 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r6 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.m58489k(r7, r8, r9, r10, r11, r12, r13, r14)
            r15.publishState(r6)
            if (r16 == 0) goto L_0x00db
            com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase r6 = r0.f33178d
            com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$a r7 = new com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase$a
            r8 = 0
            r7.<init>(r4, r8, r1)
            r2.L$0 = r0
            r2.L$1 = r4
            r2.L$2 = r1
            r2.label = r5
            java.lang.Object r2 = r6.m172727invokegIAlus(r7, r2)
            if (r2 != r3) goto L_0x008c
            return r3
        L_0x008c:
            r3 = r1
            r1 = r2
            r2 = r0
        L_0x008f:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r1)
            if (r5 == 0) goto L_0x00b3
            com.carrefour.fid.android.shared.base.u$d r6 = r2.getCurrentState()
            r7 = r6
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r7 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 15
            r14 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r6 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.m58489k(r7, r8, r9, r10, r11, r12, r13, r14)
            r2.publishState(r6)
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b r6 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b
            r6.<init>(r5)
            r2.emitEvent(r6)
        L_0x00b3:
            boolean r5 = kotlin.Result.m38710j(r1)
            if (r5 == 0) goto L_0x00d9
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r5 = r1
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r5 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 15
            r12 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r1 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.m58489k(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.publishState(r1)
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$a r1 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13674a.C13675a.f33265a
            r2.emitEvent(r1)
        L_0x00d9:
            r1 = r3
            goto L_0x00dc
        L_0x00db:
            r2 = r0
        L_0x00dc:
            r2.mo32389j0(r4, r1)
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r3 = r1
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r3 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 15
            r10 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r1 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.m58489k(r3, r4, r5, r6, r7, r8, r9, r10)
            r2.publishState(r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x00f8:
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b r1 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r3 = "Address and Telephone cannot be null before saving them."
            r2.<init>(r3)
            r1.<init>(r2)
            r15.emitEvent(r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel.mo32393o0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: p */
    public void mo31590p(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "eventLabel");
        this.f33179e.mo31590p(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32394p0(com.carrefour.fid.android.domain.models.account.Address r13, java.lang.String r14, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$setUserInput$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$setUserInput$1 r0 = (com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$setUserInput$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$setUserInput$1 r0 = new com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel$setUserInput$1
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r13 = r0.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel r13 = (com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel) r13
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r14 = r15.mo21858l()
            goto L_0x006a
        L_0x0033:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003b:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.shared.base.u$d r15 = r12.getCurrentState()
            r4 = r15
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r4 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r4
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 12
            r11 = 0
            r5 = r13
            r6 = r14
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r14 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.m58489k(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.publishState(r14)
            com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase r14 = r12.f33176b
            java.lang.String r13 = r13.mo116677B()
            java.lang.String r13 = com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase.C13255a.m57421b(r13)
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r14 = r14.mo31448a(r13, r0)
            if (r14 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r13 = r12
        L_0x006a:
            java.lang.Throwable r15 = kotlin.Result.m38705e(r14)
            if (r15 != 0) goto L_0x00c1
            java.util.List r14 = (java.util.List) r14
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r7 = new java.util.ArrayList
            r15 = 10
            int r15 = kotlin.collections.C10978t.m41495Y(r14, r15)
            r7.<init>(r15)
            java.util.Iterator r14 = r14.iterator()
        L_0x0083:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0097
            java.lang.Object r15 = r14.next()
            com.carrefour.fid.android.account.domain.models.DQEAddressDomain r15 = (com.carrefour.fid.android.account.domain.models.DQEAddressDomain) r15
            com.carrefour.fid.android.account.presentation.models.DQEAddressModel r15 = com.carrefour.fid.android.account.domain.extension.C13244b.m57382c(r15)
            r7.add(r15)
            goto L_0x0083
        L_0x0097:
            com.carrefour.fid.android.shared.base.u$d r14 = r13.getCurrentState()
            r4 = r14
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r4 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r4
            boolean r14 = r7.isEmpty()
            r14 = r14 ^ r3
            if (r14 == 0) goto L_0x00b1
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$d$c r14 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$d$c
            java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r7)
            com.carrefour.fid.android.account.presentation.models.DQEAddressModel r15 = (com.carrefour.fid.android.account.presentation.models.DQEAddressModel) r15
            r14.<init>(r15)
            goto L_0x00b3
        L_0x00b1:
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$d$b r14 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13683d.C13685b.f33286a
        L_0x00b3:
            r8 = r14
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 3
            r11 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r14 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.m58489k(r4, r5, r6, r7, r8, r9, r10, r11)
            r13.publishState(r14)
            goto L_0x00df
        L_0x00c1:
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b r14 = new com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$a$b
            r14.<init>(r15)
            r13.emitEvent(r14)
            com.carrefour.fid.android.shared.base.u$d r14 = r13.getCurrentState()
            r0 = r14
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r0 = (com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b) r0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 15
            r7 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.b$b r14 = com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13673b.C13678b.m58489k(r0, r1, r2, r3, r4, r5, r6, r7)
            r13.publishState(r14)
        L_0x00df:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.address.VerifyUserAddressViewModel.mo32394p0(com.carrefour.fid.android.domain.models.account.Address, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
