package com.carrefour.fid.android.account.presentation.viewmodels.account;

import androidx.autofill.C0861a;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.presentation.analytics.C13290d;
import com.carrefour.fid.android.account.presentation.analytics.C13291e;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0003\u0011\u0018\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0006\u001a\u00020\u0005H\u0001J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/viewmodels/account/AccountInfoViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/AccountInfoViewModel$a;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/AccountInfoViewModel$c;", "Lcom/carrefour/fid/android/account/presentation/analytics/d;", "Lkotlin/d2;", "sendScreenView", "intent", "h0", "(Lcom/carrefour/fid/android/account/presentation/viewmodels/account/AccountInfoViewModel$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "f0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/AddressCategory;", "category", "g0", "(Lcom/carrefour/fid/android/domain/models/AddressCategory;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "a", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/account/presentation/analytics/e;", "analytics", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/account/presentation/analytics/e;)V", "b", "c", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAccountInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountInfoViewModel.kt\ncom/carrefour/fid/android/account/presentation/viewmodels/account/AccountInfoViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n533#2,6:92\n533#2,6:98\n*S KotlinDebug\n*F\n+ 1 AccountInfoViewModel.kt\ncom/carrefour/fid/android/account/presentation/viewmodels/account/AccountInfoViewModel\n*L\n72#1:92,6\n75#1:98,6\n*E\n"})
public final class AccountInfoViewModel extends BaseMVIViewModel<C13562a, C13567c> implements C13290d {
    @C12579k

    /* renamed from: a */
    public final C37878e f33059a;

    /* renamed from: b */
    public final /* synthetic */ C13291e f33060b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$a */
    public static final class C13562a implements C28505u.C28509d {
        @C12579k

        /* renamed from: d */
        public static final C13563a f33061d = new C13563a((DefaultConstructorMarker) null);

        /* renamed from: e */
        public static final int f33062e = 8;
        @C12579k

        /* renamed from: f */
        public static final C13562a f33063f = new C13562a((AccountInfo) null, (Throwable) null);
        @C12580l

        /* renamed from: b */
        public final AccountInfo f33064b;
        @C12580l

        /* renamed from: c */
        public final Throwable f33065c;

        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$a$a */
        public static final class C13563a {
            public /* synthetic */ C13563a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C13562a mo32204a() {
                return C13562a.f33063f;
            }

            public C13563a() {
            }
        }

        public C13562a(@C12580l AccountInfo accountInfo, @C12580l Throwable th) {
            this.f33064b = accountInfo;
            this.f33065c = th;
        }

        /* renamed from: i */
        public static /* synthetic */ C13562a m58140i(C13562a aVar, AccountInfo accountInfo, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                accountInfo = aVar.f33064b;
            }
            if ((i & 2) != 0) {
                th = aVar.f33065c;
            }
            return aVar.mo32198h(accountInfo, th);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13562a)) {
                return false;
            }
            C13562a aVar = (C13562a) obj;
            return Intrinsics.areEqual((Object) this.f33064b, (Object) aVar.f33064b) && Intrinsics.areEqual((Object) this.f33065c, (Object) aVar.f33065c);
        }

        @C12580l
        /* renamed from: f */
        public final AccountInfo mo32196f() {
            return this.f33064b;
        }

        @C12580l
        /* renamed from: g */
        public final Throwable mo32197g() {
            return this.f33065c;
        }

        @C12579k
        /* renamed from: h */
        public final C13562a mo32198h(@C12580l AccountInfo accountInfo, @C12580l Throwable th) {
            return new C13562a(accountInfo, th);
        }

        public int hashCode() {
            AccountInfo accountInfo = this.f33064b;
            int i = 0;
            int hashCode = (accountInfo == null ? 0 : accountInfo.hashCode()) * 31;
            Throwable th = this.f33065c;
            if (th != null) {
                i = th.hashCode();
            }
            return hashCode + i;
        }

        @C12580l
        /* renamed from: j */
        public final AccountInfo mo32200j() {
            return this.f33064b;
        }

        @C12580l
        /* renamed from: k */
        public final Throwable mo32201k() {
            return this.f33065c;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            AccountInfo accountInfo = this.f33064b;
            Throwable th = this.f33065c;
            return "UIState(accountInfoModel=" + accountInfo + ", errorEvent=" + th + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$b */
    public interface C13564b extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$b$a */
        public static final class C13565a implements C13564b {
            @C12579k

            /* renamed from: a */
            public static final C13565a f33066a = new C13565a();

            /* renamed from: b */
            public static final int f33067b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$b$b */
        public static final class C13566b implements C13564b {

            /* renamed from: e */
            public static final int f33068e = 8;
            @C12579k

            /* renamed from: a */
            public final AddressCategory f33069a;
            @C12579k

            /* renamed from: b */
            public final Address f33070b;
            @C12579k

            /* renamed from: c */
            public final Address f33071c;
            @C12579k

            /* renamed from: d */
            public final String f33072d;

            public C13566b(@C12579k AddressCategory addressCategory, @C12579k Address address, @C12579k Address address2, @C12579k String str) {
                Intrinsics.checkNotNullParameter(addressCategory, "category");
                Intrinsics.checkNotNullParameter(address, "billingAddress");
                Intrinsics.checkNotNullParameter(address2, "deliveryAddress");
                Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
                this.f33069a = addressCategory;
                this.f33070b = address;
                this.f33071c = address2;
                this.f33072d = str;
            }

            /* renamed from: f */
            public static /* synthetic */ C13566b m58147f(C13566b bVar, AddressCategory addressCategory, Address address, Address address2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    addressCategory = bVar.f33069a;
                }
                if ((i & 2) != 0) {
                    address = bVar.f33070b;
                }
                if ((i & 4) != 0) {
                    address2 = bVar.f33071c;
                }
                if ((i & 8) != 0) {
                    str = bVar.f33072d;
                }
                return bVar.mo32209e(addressCategory, address, address2, str);
            }

            @C12579k
            /* renamed from: a */
            public final AddressCategory mo32205a() {
                return this.f33069a;
            }

            @C12579k
            /* renamed from: b */
            public final Address mo32206b() {
                return this.f33070b;
            }

            @C12579k
            /* renamed from: c */
            public final Address mo32207c() {
                return this.f33071c;
            }

            @C12579k
            /* renamed from: d */
            public final String mo32208d() {
                return this.f33072d;
            }

            @C12579k
            /* renamed from: e */
            public final C13566b mo32209e(@C12579k AddressCategory addressCategory, @C12579k Address address, @C12579k Address address2, @C12579k String str) {
                Intrinsics.checkNotNullParameter(addressCategory, "category");
                Intrinsics.checkNotNullParameter(address, "billingAddress");
                Intrinsics.checkNotNullParameter(address2, "deliveryAddress");
                Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
                return new C13566b(addressCategory, address, address2, str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13566b)) {
                    return false;
                }
                C13566b bVar = (C13566b) obj;
                return this.f33069a == bVar.f33069a && Intrinsics.areEqual((Object) this.f33070b, (Object) bVar.f33070b) && Intrinsics.areEqual((Object) this.f33071c, (Object) bVar.f33071c) && Intrinsics.areEqual((Object) this.f33072d, (Object) bVar.f33072d);
            }

            @C12579k
            /* renamed from: g */
            public final Address mo32211g() {
                return this.f33070b;
            }

            @C12579k
            /* renamed from: h */
            public final AddressCategory mo32212h() {
                return this.f33069a;
            }

            public int hashCode() {
                return (((((this.f33069a.hashCode() * 31) + this.f33070b.hashCode()) * 31) + this.f33071c.hashCode()) * 31) + this.f33072d.hashCode();
            }

            @C12579k
            /* renamed from: i */
            public final Address mo32214i() {
                return this.f33071c;
            }

            @C12579k
            /* renamed from: j */
            public final String mo32215j() {
                return this.f33072d;
            }

            @C12579k
            public String toString() {
                AddressCategory addressCategory = this.f33069a;
                Address address = this.f33070b;
                Address address2 = this.f33071c;
                String str = this.f33072d;
                return "RedirectToUserUpdate(category=" + addressCategory + ", billingAddress=" + address + ", deliveryAddress=" + address2 + ", phone=" + str + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$c */
    public interface C13567c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$c$a */
        public static final class C13568a implements C13567c {

            /* renamed from: b */
            public static final int f33073b = 0;
            @C12579k

            /* renamed from: a */
            public final AddressCategory f33074a;

            public C13568a(@C12579k AddressCategory addressCategory) {
                Intrinsics.checkNotNullParameter(addressCategory, "category");
                this.f33074a = addressCategory;
            }

            /* renamed from: c */
            public static /* synthetic */ C13568a m58157c(C13568a aVar, AddressCategory addressCategory, int i, Object obj) {
                if ((i & 1) != 0) {
                    addressCategory = aVar.f33074a;
                }
                return aVar.mo32218b(addressCategory);
            }

            @C12579k
            /* renamed from: a */
            public final AddressCategory mo32217a() {
                return this.f33074a;
            }

            @C12579k
            /* renamed from: b */
            public final C13568a mo32218b(@C12579k AddressCategory addressCategory) {
                Intrinsics.checkNotNullParameter(addressCategory, "category");
                return new C13568a(addressCategory);
            }

            @C12579k
            /* renamed from: d */
            public final AddressCategory mo32219d() {
                return this.f33074a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13568a) && this.f33074a == ((C13568a) obj).f33074a;
            }

            public int hashCode() {
                return this.f33074a.hashCode();
            }

            @C12579k
            public String toString() {
                AddressCategory addressCategory = this.f33074a;
                return "AddressClicked(category=" + addressCategory + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$c$b */
        public static final class C13569b implements C13567c {
            @C12579k

            /* renamed from: a */
            public static final C13569b f33075a = new C13569b();

            /* renamed from: b */
            public static final int f33076b = 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public AccountInfoViewModel(@C12579k C37878e eVar, @C12579k C13291e eVar2) {
        super(C13562a.f33061d.mo32204a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(eVar2, "analytics");
        this.f33059a = eVar;
        this.f33060b = eVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32191f0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$fetchUserInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$fetchUserInfo$1 r0 = (com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$fetchUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$fetchUserInfo$1 r0 = new com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$fetchUserInfo$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel r0 = (com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x004e
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.user.e r6 = r5.f33059a
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m172966invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r0 = r5
        L_0x004e:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r6)
            r2 = 0
            if (r1 == 0) goto L_0x0062
            com.carrefour.fid.android.shared.base.u$d r4 = r0.getCurrentState()
            com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$a r4 = (com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel.C13562a) r4
            com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$a r1 = com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel.C13562a.m58140i(r4, r2, r1, r3, r2)
            r0.publishState(r1)
        L_0x0062:
            boolean r1 = kotlin.Result.m38710j(r6)
            if (r1 == 0) goto L_0x0077
            com.carrefour.fid.android.domain.models.account.AccountInfo r6 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r6
            com.carrefour.fid.android.shared.base.u$d r1 = r0.getCurrentState()
            com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$a r1 = (com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel.C13562a) r1
            com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$a r6 = r1.mo32198h(r6, r2)
            r0.publishState(r6)
        L_0x0077:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel.mo32191f0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32192g0(com.carrefour.fid.android.domain.models.AddressCategory r36, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r37
            boolean r2 = r1 instanceof com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$onAddressClicked$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$onAddressClicked$1 r2 = (com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$onAddressClicked$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$onAddressClicked$1 r2 = new com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$onAddressClicked$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x0043
            if (r4 != r5) goto L_0x003b
            java.lang.Object r3 = r2.L$1
            com.carrefour.fid.android.domain.models.AddressCategory r3 = (com.carrefour.fid.android.domain.models.AddressCategory) r3
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel r2 = (com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x005b
        L_0x003b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0043:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.user.e r1 = r0.f33059a
            com.carrefour.fid.android.domain.interactors.user.e$a r4 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r2.L$0 = r0
            r6 = r36
            r2.L$1 = r6
            r2.label = r5
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0059
            return r3
        L_0x0059:
            r2 = r0
            r3 = r6
        L_0x005b:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r1)
            if (r4 == 0) goto L_0x0066
            com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$b$a r4 = com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel.C13564b.C13565a.f33066a
            r2.emitEvent(r4)
        L_0x0066:
            boolean r4 = kotlin.Result.m38710j(r1)
            if (r4 == 0) goto L_0x014b
            com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
            java.util.List r4 = r1.mo116668v()
            int r6 = r4.size()
            java.util.ListIterator r4 = r4.listIterator(r6)
        L_0x007a:
            boolean r6 = r4.hasPrevious()
            r7 = 0
            r8 = 0
            if (r6 == 0) goto L_0x009d
            java.lang.Object r6 = r4.previous()
            r9 = r6
            com.carrefour.fid.android.domain.models.account.Address r9 = (com.carrefour.fid.android.domain.models.account.Address) r9
            boolean r10 = r9.mo116695T()
            if (r10 == 0) goto L_0x0099
            com.carrefour.fid.android.domain.models.AddressCategory r9 = r9.mo116683H()
            com.carrefour.fid.android.domain.models.AddressCategory r10 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            if (r9 != r10) goto L_0x0099
            r9 = r5
            goto L_0x009a
        L_0x0099:
            r9 = r7
        L_0x009a:
            if (r9 == 0) goto L_0x007a
            goto L_0x009e
        L_0x009d:
            r6 = r8
        L_0x009e:
            com.carrefour.fid.android.domain.models.account.Address r6 = (com.carrefour.fid.android.domain.models.account.Address) r6
            if (r6 != 0) goto L_0x00cf
            com.carrefour.fid.android.domain.models.account.Address r6 = new com.carrefour.fid.android.domain.models.account.Address
            r9 = r6
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
            com.carrefour.fid.android.domain.models.AddressCategory r23 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 1040383(0xfdfff, float:1.457887E-39)
            r33 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31, r32, r33)
        L_0x00cf:
            java.util.List r4 = r1.mo116668v()
            int r9 = r4.size()
            java.util.ListIterator r4 = r4.listIterator(r9)
        L_0x00db:
            boolean r9 = r4.hasPrevious()
            if (r9 == 0) goto L_0x00fc
            java.lang.Object r9 = r4.previous()
            r10 = r9
            com.carrefour.fid.android.domain.models.account.Address r10 = (com.carrefour.fid.android.domain.models.account.Address) r10
            boolean r11 = r10.mo116695T()
            if (r11 == 0) goto L_0x00f8
            com.carrefour.fid.android.domain.models.AddressCategory r10 = r10.mo116683H()
            com.carrefour.fid.android.domain.models.AddressCategory r11 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING
            if (r10 != r11) goto L_0x00f8
            r10 = r5
            goto L_0x00f9
        L_0x00f8:
            r10 = r7
        L_0x00f9:
            if (r10 == 0) goto L_0x00db
            goto L_0x00fd
        L_0x00fc:
            r9 = r8
        L_0x00fd:
            com.carrefour.fid.android.domain.models.account.Address r9 = (com.carrefour.fid.android.domain.models.account.Address) r9
            if (r9 != 0) goto L_0x012f
            com.carrefour.fid.android.domain.models.account.Address r9 = new com.carrefour.fid.android.domain.models.account.Address
            r10 = r9
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
            com.carrefour.fid.android.domain.models.AddressCategory r24 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 1040383(0xfdfff, float:1.457887E-39)
            r34 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32, r33, r34)
        L_0x012f:
            java.util.List r1 = r1.mo116671x()
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r1)
            com.carrefour.fid.android.domain.models.account.Phone r1 = (com.carrefour.fid.android.domain.models.account.Phone) r1
            com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$b$b r4 = new com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel$b$b
            if (r1 == 0) goto L_0x0141
            java.lang.String r8 = r1.mo116741e()
        L_0x0141:
            if (r8 != 0) goto L_0x0145
            java.lang.String r8 = ""
        L_0x0145:
            r4.<init>(r3, r9, r6, r8)
            r2.emitEvent(r4)
        L_0x014b:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.account.AccountInfoViewModel.mo32192g0(com.carrefour.fid.android.domain.models.AddressCategory, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: h0 */
    public Object processIntent(@C12579k C13567c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (Intrinsics.areEqual((Object) cVar, (Object) C13567c.C13569b.f33075a)) {
            Object f0 = mo32191f0(cVar2);
            if (f0 == C11063b.m42612h()) {
                return f0;
            }
            return C11079d2.f28267a;
        } else if (!(cVar instanceof C13567c.C13568a)) {
            return C11079d2.f28267a;
        } else {
            Object g0 = mo32192g0(((C13567c.C13568a) cVar).mo32219d(), cVar2);
            if (g0 == C11063b.m42612h()) {
                return g0;
            }
            return C11079d2.f28267a;
        }
    }

    public void sendScreenView() {
        this.f33060b.sendScreenView();
    }
}
