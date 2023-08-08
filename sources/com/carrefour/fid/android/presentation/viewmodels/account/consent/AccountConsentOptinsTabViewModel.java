package com.carrefour.fid.android.presentation.viewmodels.account.consent;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.domain.interactors.consent.C37629a;
import com.carrefour.fid.android.domain.interactors.consent.C37631c;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.consent.ConsentName;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import com.carrefour.fid.android.loyalty.domain.interactors.FidelityHasCardFidUseCase;
import com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.p045di.annotation.C28659c;
import com.carrefour.fid.android.shared.p046io.NetWorkResponseThrowable;
import com.carrefour.fid.android.shared.p046io.ResponseThrowable;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11661u0;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
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
@C11076d0(mo22515d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B;\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\b\b\u0001\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b;\u0010<J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0014J\u0013\u0010\t\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\f\u001a\u00020\u0005H\u0002J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109\u0002\u0004\n\u0002\b\u0019¨\u0006="}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountConsentOptinsTabViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/a$a;", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/a$b;", "intent", "Lkotlin/d2;", "m0", "(Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/a$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "onCleared", "l0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "k0", "o0", "", "Lcom/carrefour/fid/android/domain/models/consent/ConsentOptIn;", "updatedConsentOptIns", "p0", "", "errorEvent", "", "getErrorMessageRes", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountConsentOptinsTabViewModel$a;", "partialState", "n0", "Lcom/carrefour/fid/android/domain/interactors/consent/a;", "a", "Lcom/carrefour/fid/android/domain/interactors/consent/a;", "getConsentsUseCase", "Lcom/carrefour/fid/android/domain/interactors/consent/c;", "b", "Lcom/carrefour/fid/android/domain/interactors/consent/c;", "updateConsentUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "c", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityHasCardFidUseCase;", "d", "Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityHasCardFidUseCase;", "cardFidUseCase", "Lkotlinx/coroutines/o0;", "e", "Lkotlinx/coroutines/o0;", "appScope", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/e;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/e;", "analyticsViewModel", "Lkotlinx/coroutines/c2;", "g", "Lkotlinx/coroutines/c2;", "saveConsentsJob", "h", "Ljava/util/List;", "initialConsentState", "Lcom/carrefour/fid/android/shared/base/u$c;", "i", "Lcom/carrefour/fid/android/shared/base/u$c;", "reducer", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/consent/a;Lcom/carrefour/fid/android/domain/interactors/consent/c;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityHasCardFidUseCase;Lkotlinx/coroutines/o0;Lcom/carrefour/fid/android/presentation/viewmodels/account/consent/e;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountConsentOptinsTabViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountConsentOptinsTabViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountConsentOptinsTabViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n288#2,2:185\n288#2:187\n1747#2,3:188\n289#2:191\n1549#2:192\n1620#2,2:193\n288#2,2:195\n1622#2:197\n*S KotlinDebug\n*F\n+ 1 AccountConsentOptinsTabViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountConsentOptinsTabViewModel\n*L\n98#1:185,2\n156#1:187\n157#1:188,3\n156#1:191\n162#1:192\n162#1:193,2\n163#1:195,2\n162#1:197\n*E\n"})
public final class AccountConsentOptinsTabViewModel extends BaseMVIViewModel<C25774a.C25775a, C25774a.C25777b> {

    /* renamed from: j */
    public static final int f63098j = 8;
    @C12579k

    /* renamed from: a */
    public final C37629a f63099a;
    @C12579k

    /* renamed from: b */
    public final C37631c f63100b;
    @C12579k

    /* renamed from: c */
    public final C37878e f63101c;
    @C12579k

    /* renamed from: d */
    public final FidelityHasCardFidUseCase f63102d;
    @C12579k

    /* renamed from: e */
    public final C12074o0 f63103e;
    @C12579k

    /* renamed from: f */
    public final C25786e f63104f;
    @C12580l

    /* renamed from: g */
    public C11723c2 f63105g;
    @C12580l

    /* renamed from: h */
    public List<ConsentOptIn> f63106h;
    @C12579k

    /* renamed from: i */
    public final C28505u.C28508c<C25774a.C25775a, C25763a> f63107i = new C25767b(this);

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$1", mo22502f = "AccountConsentOptinsTabViewModel.kt", mo22503i = {}, mo22504l = {69}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$1 */
    public static final class C257621 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;
        final /* synthetic */ AccountConsentOptinsTabViewModel this$0;

        {
            this.this$0 = r1;
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C257621(this.this$0, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object obj2;
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                AccountConsentOptinsTabViewModel accountConsentOptinsTabViewModel = this.this$0;
                accountConsentOptinsTabViewModel.publishState(C25774a.C25775a.m110566m(AccountConsentOptinsTabViewModel.m110532e0(accountConsentOptinsTabViewModel), (Integer) null, (List) null, false, false, true, (AccountInfo) null, 47, (Object) null));
                C37878e h0 = this.this$0.f63101c;
                C37878e.C37879a aVar = C37878e.C37879a.f94997a;
                this.label = 1;
                obj2 = h0.m172966invokegIAlus(aVar, this);
                if (obj2 == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
                obj2 = ((Result) obj).mo21858l();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AccountConsentOptinsTabViewModel accountConsentOptinsTabViewModel2 = this.this$0;
            Throwable e = Result.m38705e(obj2);
            if (e == null) {
                accountConsentOptinsTabViewModel2.publishState(C25774a.C25775a.m110566m(AccountConsentOptinsTabViewModel.m110532e0(accountConsentOptinsTabViewModel2), (Integer) null, (List) null, false, false, false, (AccountInfo) obj2, 15, (Object) null));
            } else {
                accountConsentOptinsTabViewModel2.publishState(C25774a.C25775a.m110566m(AccountConsentOptinsTabViewModel.m110532e0(accountConsentOptinsTabViewModel2), C11064a.m42620f(accountConsentOptinsTabViewModel2.getErrorMessageRes(e)), (List) null, false, false, false, (AccountInfo) null, 46, (Object) null));
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C257621) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$a */
    public interface C25763a extends C28505u.C28509d {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$a$a */
        public static final class C25764a implements C25763a {

            /* renamed from: c */
            public static final int f63108c = 8;
            @C12579k

            /* renamed from: b */
            public final List<ConsentOptIn> f63109b;

            public C25764a(@C12579k List<ConsentOptIn> list) {
                Intrinsics.checkNotNullParameter(list, "consentOptIns");
                this.f63109b = list;
            }

            /* renamed from: g */
            public static /* synthetic */ C25764a m110544g(C25764a aVar, List<ConsentOptIn> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = aVar.f63109b;
                }
                return aVar.mo74804f(list);
            }

            @C12579k
            /* renamed from: e */
            public final List<ConsentOptIn> mo74802e() {
                return this.f63109b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25764a) && Intrinsics.areEqual((Object) this.f63109b, (Object) ((C25764a) obj).f63109b);
            }

            @C12579k
            /* renamed from: f */
            public final C25764a mo74804f(@C12579k List<ConsentOptIn> list) {
                Intrinsics.checkNotNullParameter(list, "consentOptIns");
                return new C25764a(list);
            }

            @C12579k
            /* renamed from: h */
            public final List<ConsentOptIn> mo74805h() {
                return this.f63109b;
            }

            public int hashCode() {
                return this.f63109b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C25765b.m110548a(this);
            }

            @C12579k
            public String toString() {
                List<ConsentOptIn> list = this.f63109b;
                return "Consents(consentOptIns=" + list + ")";
            }
        }

        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$a$b */
        public static final class C25765b {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m110548a(@C12579k C25763a aVar) {
                return C28505u.C28509d.C28510a.m118428a(aVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$a$c */
        public static final class C25766c implements C25763a {

            /* renamed from: c */
            public static final int f63110c = 8;
            @C12579k

            /* renamed from: b */
            public final Throwable f63111b;

            public C25766c(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                this.f63111b = th;
            }

            /* renamed from: g */
            public static /* synthetic */ C25766c m110549g(C25766c cVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = cVar.f63111b;
                }
                return cVar.mo74810f(th);
            }

            @C12579k
            /* renamed from: e */
            public final Throwable mo74808e() {
                return this.f63111b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C25766c) && Intrinsics.areEqual((Object) this.f63111b, (Object) ((C25766c) obj).f63111b);
            }

            @C12579k
            /* renamed from: f */
            public final C25766c mo74810f(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                return new C25766c(th);
            }

            @C12579k
            /* renamed from: h */
            public final Throwable mo74811h() {
                return this.f63111b;
            }

            public int hashCode() {
                return this.f63111b.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C25765b.m110548a(this);
            }

            @C12579k
            public String toString() {
                Throwable th = this.f63111b;
                return "ErrorEvent(throwable=" + th + ")";
            }
        }
    }

    @C11363r0({"SMAP\nAccountConsentOptinsTabViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountConsentOptinsTabViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountConsentOptinsTabViewModel$reducer$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n766#2:185\n857#2,2:186\n*S KotlinDebug\n*F\n+ 1 AccountConsentOptinsTabViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/consent/AccountConsentOptinsTabViewModel$reducer$1\n*L\n56#1:185\n56#1:186,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$b */
    public static final class C25767b implements C28505u.C28508c<C25774a.C25775a, C25763a> {

        /* renamed from: a */
        public final /* synthetic */ AccountConsentOptinsTabViewModel f63112a;

        public C25767b(AccountConsentOptinsTabViewModel accountConsentOptinsTabViewModel) {
            this.f63112a = accountConsentOptinsTabViewModel;
        }

        @C12579k
        /* renamed from: b */
        public final C25774a.C25775a mo32307a(@C12579k C25774a.C25775a aVar, @C12579k C25763a aVar2) {
            boolean z;
            C25763a aVar3 = aVar2;
            C25774a.C25775a aVar4 = aVar;
            Intrinsics.checkNotNullParameter(aVar4, "previousState");
            Intrinsics.checkNotNullParameter(aVar3, "partialState");
            C25774a.C25775a m = C25774a.C25775a.m110566m(aVar4, (Integer) null, (List) null, false, false, false, (AccountInfo) null, 62, (Object) null);
            if (aVar3 instanceof C25763a.C25766c) {
                return C25774a.C25775a.m110566m(m, Integer.valueOf(this.f63112a.getErrorMessageRes(((C25763a.C25766c) aVar3).mo74811h())), (List) null, false, false, false, (AccountInfo) null, 62, (Object) null);
            }
            if (!(aVar3 instanceof C25763a.C25764a)) {
                throw new NoWhenBranchMatchedException();
            } else if (m.mo74839q()) {
                return C25774a.C25775a.m110566m(m, (Integer) null, ((C25763a.C25764a) aVar3).mo74805h(), false, false, false, (AccountInfo) null, 61, (Object) null);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object next : ((C25763a.C25764a) aVar3).mo74805h()) {
                    ConsentOptIn consentOptIn = (ConsentOptIn) next;
                    if (consentOptIn.mo117326h() == ConsentName.OPTIN_CARREFOUR_SMS && consentOptIn.mo117326h() == ConsentName.OPTIN_FID_SMS) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                return C25774a.C25775a.m110566m(m, (Integer) null, arrayList, false, false, false, (AccountInfo) null, 61, (Object) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public AccountConsentOptinsTabViewModel(@C12579k C37629a aVar, @C12579k C37631c cVar, @C12579k C37878e eVar, @C12579k FidelityHasCardFidUseCase fidelityHasCardFidUseCase, @C28659c @C12579k C12074o0 o0Var, @C12579k C25786e eVar2) {
        super(C25774a.C25775a.f63131i.mo74841a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "getConsentsUseCase");
        Intrinsics.checkNotNullParameter(cVar, "updateConsentUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(fidelityHasCardFidUseCase, "cardFidUseCase");
        Intrinsics.checkNotNullParameter(o0Var, "appScope");
        Intrinsics.checkNotNullParameter(eVar2, "analyticsViewModel");
        this.f63099a = aVar;
        this.f63100b = cVar;
        this.f63101c = eVar;
        this.f63102d = fidelityHasCardFidUseCase;
        this.f63103e = o0Var;
        this.f63104f = eVar2;
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new C257621(this, (C11045c<? super C257621>) null), 3, (Object) null);
    }

    /* renamed from: e0 */
    public static final /* synthetic */ C25774a.C25775a m110532e0(AccountConsentOptinsTabViewModel accountConsentOptinsTabViewModel) {
        return (C25774a.C25775a) accountConsentOptinsTabViewModel.getCurrentState();
    }

    public final int getErrorMessageRes(Throwable th) {
        if (th instanceof NetWorkResponseThrowable) {
            return R.string.general_error_no_network_message;
        }
        if (th instanceof ResponseThrowable) {
            return R.string.general_error_server_not_responding_message;
        }
        return R.string.checkout_error_message_default;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74795k0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$fetchConsents$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$fetchConsents$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$fetchConsents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$fetchConsents$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$fetchConsents$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel) r0
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0063
        L_0x0033:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x003b:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.shared.base.u$d r14 = r13.getCurrentState()
            r4 = r14
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r4 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 55
            r12 = 0
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r14 = com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a.m110566m(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.publishState(r14)
            com.carrefour.fid.android.domain.interactors.consent.a r14 = r13.f63099a
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r14 = r14.m172965invokeIoAF18A(r0)
            if (r14 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r0 = r13
        L_0x0063:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r14)
            if (r1 != 0) goto L_0x008d
            java.util.List r14 = (java.util.List) r14
            com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$a$a r1 = new com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$a$a
            r1.<init>(r14)
            r0.mo74798n0(r1)
            com.carrefour.fid.android.shared.base.u$d r1 = r0.getCurrentState()
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r2 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 55
            r10 = 0
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r1 = com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a.m110566m(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.publishState(r1)
            r0.f63106h = r14
            goto L_0x00c0
        L_0x008d:
            com.carrefour.fid.android.shared.base.u$d r14 = r0.getCurrentState()
            r2 = r14
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r2 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a) r2
            int r14 = r0.getErrorMessageRes(r1)
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r14)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r14 = com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a.m110566m(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.publishState(r14)
            com.carrefour.fid.android.shared.base.u$d r14 = r0.getCurrentState()
            r1 = r14
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r1 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a) r1
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 55
            r9 = 0
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r14 = com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a.m110566m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.publishState(r14)
        L_0x00c0:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel.mo74795k0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74796l0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$getFidCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$getFidCard$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$getFidCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$getFidCard$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$getFidCard$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel) r0
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0063
        L_0x0033:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x003b:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.shared.base.u$d r14 = r13.getCurrentState()
            r4 = r14
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r4 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 0
            r11 = 47
            r12 = 0
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r14 = com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a.m110566m(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.publishState(r14)
            com.carrefour.fid.android.loyalty.domain.interactors.FidelityHasCardFidUseCase r14 = r13.f63102d
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r14 = r14.m173037invokeIoAF18A(r0)
            if (r14 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r0 = r13
        L_0x0063:
            java.lang.Throwable r3 = kotlin.Result.m38705e(r14)
            if (r3 != 0) goto L_0x0086
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r4 = r14.booleanValue()
            com.carrefour.fid.android.shared.base.u$d r14 = r0.getCurrentState()
            r1 = r14
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r1 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a) r1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 43
            r9 = 0
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r14 = com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a.m110566m(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.publishState(r14)
            goto L_0x00a6
        L_0x0086:
            com.carrefour.fid.android.shared.base.u$d r14 = r0.getCurrentState()
            r4 = r14
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r4 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 47
            r12 = 0
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r14 = com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a.m110566m(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.publishState(r14)
            com.carrefour.fid.android.shared.util.i r1 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r2 = "Error when getting fid card"
            r4 = 0
            r5 = 4
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r1, r2, r3, r4, r5, r6)
        L_0x00a6:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel.mo74796l0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processIntent(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25777b r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$processIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$processIntent$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$processIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$processIntent$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$processIntent$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r7)
            goto L_0x005f
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel r6 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel) r6
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0053
        L_0x003c:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$b$a r7 = com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25777b.C25778a.f63141a
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0062
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.mo74796l0(r0)
            if (r6 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r6 = r5
        L_0x0053:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r6.mo74795k0(r0)
            if (r6 != r1) goto L_0x005f
            return r1
        L_0x005f:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        L_0x0062:
            boolean r7 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25777b.C25779b
            if (r7 == 0) goto L_0x006f
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$b$b r6 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25777b.C25779b) r6
            java.util.List r6 = r6.mo74844d()
            r5.mo74800p0(r6)
        L_0x006f:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel.processIntent(com.carrefour.fid.android.presentation.viewmodels.account.consent.a$b, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: n0 */
    public final void mo74798n0(C25763a aVar) {
        reduceAndPublishState(this.f63107i, aVar);
    }

    /* renamed from: o0 */
    public final void mo74799o0() {
        C11723c2 c2Var = this.f63105g;
        if (c2Var != null) {
            C11723c2.C11724a.m46184b(c2Var, (CancellationException) null, 1, (Object) null);
        }
        this.f63105g = C12038j.m48061f(this.f63103e, (CoroutineContext) null, (CoroutineStart) null, new AccountConsentOptinsTabViewModel$saveConsents$1(this, (C11045c<? super AccountConsentOptinsTabViewModel$saveConsents$1>) null), 3, (Object) null);
    }

    public void onCleared() {
        Object obj;
        boolean z;
        mo74799o0();
        this.f63104f.mo74856f(((C25774a.C25775a) getCurrentState()).mo74836n());
        Iterator it = ((C25774a.C25775a) getCurrentState()).mo74836n().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ConsentOptIn) obj).mo117326h() == ConsentName.OPTIN_FID_POST) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        ConsentOptIn consentOptIn = (ConsentOptIn) obj;
        if (consentOptIn != null && consentOptIn.mo117325g()) {
            this.f63104f.mo74855e(consentOptIn.mo117324f().mo117315r());
        }
        super.onCleared();
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0050 A[EDGE_INSN: B:46:0x0050->B:21:0x0050 ?: BREAK  , SYNTHETIC] */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74800p0(java.util.List<com.carrefour.fid.android.domain.models.consent.ConsentOptIn> r14) {
        /*
            r13 = this;
            java.util.List<com.carrefour.fid.android.domain.models.consent.ConsentOptIn> r0 = r13.f63106h
            if (r0 == 0) goto L_0x00d4
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r0.next()
            r5 = r1
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r5 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r5
            r6 = r14
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L_0x002c
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x002c
        L_0x002a:
            r5 = r4
            goto L_0x004c
        L_0x002c:
            java.util.Iterator r6 = r6.iterator()
        L_0x0030:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x002a
            java.lang.Object r7 = r6.next()
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r7 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r7
            com.carrefour.fid.android.domain.models.consent.ConsentName r8 = r5.mo117326h()
            com.carrefour.fid.android.domain.models.consent.ConsentName r7 = r7.mo117326h()
            if (r8 != r7) goto L_0x0048
            r7 = r3
            goto L_0x0049
        L_0x0048:
            r7 = r4
        L_0x0049:
            if (r7 == 0) goto L_0x0030
            r5 = r3
        L_0x004c:
            if (r5 == 0) goto L_0x000a
            goto L_0x0050
        L_0x004f:
            r1 = r2
        L_0x0050:
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r1 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r1
            if (r1 != 0) goto L_0x0056
            goto L_0x00d4
        L_0x0056:
            com.carrefour.fid.android.shared.base.u$d r0 = r13.getCurrentState()
            com.carrefour.fid.android.presentation.viewmodels.account.consent.a$a r0 = (com.carrefour.fid.android.presentation.viewmodels.account.consent.C25774a.C25775a) r0
            java.util.List r0 = r0.mo74836n()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C10978t.m41495Y(r0, r5)
            r1.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0071:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00cc
            java.lang.Object r5 = r0.next()
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r5 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r5
            r6 = r14
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0084:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r7 = r6.next()
            r8 = r7
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r8 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r8
            com.carrefour.fid.android.domain.models.consent.ConsentName r8 = r8.mo117326h()
            com.carrefour.fid.android.domain.models.consent.ConsentName r9 = r5.mo117326h()
            if (r8 != r9) goto L_0x009d
            r8 = r3
            goto L_0x009e
        L_0x009d:
            r8 = r4
        L_0x009e:
            if (r8 == 0) goto L_0x0084
            goto L_0x00a2
        L_0x00a1:
            r7 = r2
        L_0x00a2:
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r7 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r7
            if (r7 == 0) goto L_0x00c8
            r8 = 0
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r9 = r7.mo117324f()
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r6 = r5.mo117324f()
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r7 = r7.mo117324f()
            if (r6 == r7) goto L_0x00b7
            r10 = r3
            goto L_0x00b8
        L_0x00b7:
            r10 = r4
        L_0x00b8:
            r11 = 1
            r12 = 0
            r6 = r5
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r6 = com.carrefour.fid.android.domain.models.consent.ConsentOptIn.m156405e(r6, r7, r8, r9, r10, r11)
            if (r6 != 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r5 = r6
        L_0x00c8:
            r1.add(r5)
            goto L_0x0071
        L_0x00cc:
            com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$a$a r14 = new com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel$a$a
            r14.<init>(r1)
            r13.mo74798n0(r14)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.consent.AccountConsentOptinsTabViewModel.mo74800p0(java.util.List):void");
    }
}
