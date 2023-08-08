package com.carrefour.fid.android.utils.initializer;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.startup.C20496b;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.airship.data.datasource.C13747e;
import com.carrefour.fid.android.core.p056di.providers.C36293a;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.shared.p045di.annotation.C28659c;
import com.carrefour.fid.android.tracking.C28994a;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11970i;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bJ\u0010HJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00070\u0006H\u0016J\u001b\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0002R0\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00102\u001a\u00020,8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b4\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010I\u001a\u00020A8\u0006@\u0006X.¢\u0006\u0018\n\u0004\b\u0017\u0010B\u0012\u0004\bG\u0010H\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, mo22516d2 = {"Lcom/carrefour/fid/android/utils/initializer/AudienceTrackingInitializer;", "Landroidx/startup/b;", "Lkotlin/d2;", "Landroid/content/Context;", "context", "e", "", "Ljava/lang/Class;", "dependencies", "n", "(Landroid/content/Context;Lkotlin/coroutines/c;)Ljava/lang/Object;", "o", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "p", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "audienceParams", "Lcom/carrefour/fid/android/airship/data/datasource/e;", "b", "Lcom/carrefour/fid/android/airship/data/datasource/e;", "h", "()Lcom/carrefour/fid/android/airship/data/datasource/e;", "s", "(Lcom/carrefour/fid/android/airship/data/datasource/e;)V", "audienceTrackingManager", "Lcom/carrefour/fid/android/tracking/a;", "c", "Lcom/carrefour/fid/android/tracking/a;", "g", "()Lcom/carrefour/fid/android/tracking/a;", "r", "(Lcom/carrefour/fid/android/tracking/a;)V", "audienceTrackingAdapter", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "d", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "k", "()Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "u", "(Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;)V", "getFavoritePhysicalStoreUseCase", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "l", "()Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "v", "(Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;)V", "loginRepository", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "f", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "()Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "q", "(Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;)V", "accountRepository", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "m", "()Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "w", "(Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;)V", "loyaltyPreferencesStorage", "Lkotlinx/coroutines/o0;", "Lkotlinx/coroutines/o0;", "i", "()Lkotlinx/coroutines/o0;", "t", "(Lkotlinx/coroutines/o0;)V", "getCoroutineScope$annotations", "()V", "coroutineScope", "<init>", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class AudienceTrackingInitializer implements C20496b<C11079d2> {

    /* renamed from: i */
    public static final int f58175i = 8;
    @C12579k

    /* renamed from: a */
    public final HashMap<String, String> f58176a = new HashMap<>();
    @Inject

    /* renamed from: b */
    public C13747e f58177b;
    @Inject

    /* renamed from: c */
    public C28994a f58178c;
    @Inject

    /* renamed from: d */
    public C37832c f58179d;
    @Inject

    /* renamed from: e */
    public LoginRepository f58180e;
    @Inject

    /* renamed from: f */
    public AccountRepository f58181f;
    @Inject

    /* renamed from: g */
    public LoyaltyPreferencesStorage f58182g;
    @Inject

    /* renamed from: h */
    public C12074o0 f58183h;

    @C28659c
    /* renamed from: j */
    public static /* synthetic */ void m102833j() {
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo55933a(Context context) {
        mo67103e(context);
        return C11079d2.f28267a;
    }

    @C12579k
    public List<Class<? extends C20496b<?>>> dependencies() {
        return new ArrayList();
    }

    /* renamed from: e */
    public void mo67103e(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36293a.f89629a.mo108299a(context).mo34001j(this);
        C11723c2 unused = C12038j.m48061f(mo67107i(), (CoroutineContext) null, (CoroutineStart) null, new AudienceTrackingInitializer$create$1(this, context, (C11045c<? super AudienceTrackingInitializer$create$1>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: f */
    public final AccountRepository mo67104f() {
        AccountRepository accountRepository = this.f58181f;
        if (accountRepository != null) {
            return accountRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountRepository");
        return null;
    }

    @C12579k
    /* renamed from: g */
    public final C28994a mo67105g() {
        C28994a aVar = this.f58178c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audienceTrackingAdapter");
        return null;
    }

    @C12579k
    /* renamed from: h */
    public final C13747e mo67106h() {
        C13747e eVar = this.f58177b;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audienceTrackingManager");
        return null;
    }

    @C12579k
    /* renamed from: i */
    public final C12074o0 mo67107i() {
        C12074o0 o0Var = this.f58183h;
        if (o0Var != null) {
            return o0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    @C12579k
    /* renamed from: k */
    public final C37832c mo67108k() {
        C37832c cVar = this.f58179d;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getFavoritePhysicalStoreUseCase");
        return null;
    }

    @C12579k
    /* renamed from: l */
    public final LoginRepository mo67109l() {
        LoginRepository loginRepository = this.f58180e;
        if (loginRepository != null) {
            return loginRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginRepository");
        return null;
    }

    @C12579k
    /* renamed from: m */
    public final LoyaltyPreferencesStorage mo67110m() {
        LoyaltyPreferencesStorage loyaltyPreferencesStorage = this.f58182g;
        if (loyaltyPreferencesStorage != null) {
            return loyaltyPreferencesStorage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loyaltyPreferencesStorage");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67111n(android.content.Context r10, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initAudienceTracking$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initAudienceTracking$1 r0 = (com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initAudienceTracking$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initAudienceTracking$1 r0 = new com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initAudienceTracking$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer r10 = (com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer) r10
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x0055
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.airship.data.datasource.e r11 = r9.mo67106h()
            r11.mo32672a(r10)
            com.carrefour.fid.android.domain.interactors.service.physicalstore.c r10 = r9.mo67108k()
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r11 = r10.m172965invokeIoAF18A(r0)
            if (r11 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r10 = r9
        L_0x0055:
            boolean r0 = kotlin.Result.m38709i(r11)
            r1 = 0
            if (r0 == 0) goto L_0x005d
            r11 = r1
        L_0x005d:
            com.carrefour.fid.android.domain.models.service.models.l r11 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r11
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r10.f58176a
            if (r11 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r3 = 0
        L_0x0065:
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "Favorite_store_chosen"
            r0.put(r3, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r10.f58176a
            java.lang.String r2 = ""
            if (r11 == 0) goto L_0x007a
            java.lang.String r3 = r11.mo119361E()
            if (r3 != 0) goto L_0x007b
        L_0x007a:
            r3 = r2
        L_0x007b:
            java.lang.String r4 = "Favorite_store_name"
            r0.put(r4, r3)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r10.f58176a
            if (r11 == 0) goto L_0x008c
            java.lang.String r11 = r11.mo119357A()
            if (r11 != 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r2 = r11
        L_0x008c:
            java.lang.String r11 = "Favorite_store_type"
            r0.put(r11, r2)
            kotlinx.coroutines.o0 r3 = r10.mo67107i()
            r4 = 0
            r5 = 0
            com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initAudienceTracking$2 r6 = new com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initAudienceTracking$2
            r6.<init>(r10, r1)
            r7 = 3
            r8 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r3, r4, r5, r6, r7, r8)
            r10.mo67113p()
            com.carrefour.fid.android.tracking.a r11 = r10.mo67105g()
            java.util.HashMap<java.lang.String, java.lang.String> r10 = r10.f58176a
            r11.mo32670e(r10)
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer.mo67111n(android.content.Context, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67112o(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initDataLoyalty$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initDataLoyalty$1 r0 = (com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initDataLoyalty$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initDataLoyalty$1 r0 = new com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer$initDataLoyalty$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.shared.util.i r0 = (com.carrefour.fid.android.shared.util.C28935i) r0
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00af
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003c:
            java.lang.Object r2 = r0.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer r5 = (com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer) r5
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0093
        L_0x004c:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer r2 = (com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer) r2
            kotlin.C11661u0.m45747n(r10)
            r5 = r2
            goto L_0x0068
        L_0x0055:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r10 = r9.mo67110m()
            r0.L$0 = r9
            r0.label = r5
            java.lang.Object r10 = r10.hasLoyaltyCard(r0)
            if (r10 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r5 = r9
        L_0x0068:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r5.f58176a
            java.lang.String r6 = java.lang.String.valueOf(r10)
            java.lang.String r7 = "Loyalty_attached"
            r2.put(r7, r6)
            if (r10 == 0) goto L_0x0096
            java.util.HashMap<java.lang.String, java.lang.String> r10 = r5.f58176a
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r2 = r5.mo67110m()
            r0.L$0 = r5
            r0.L$1 = r10
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r2 = r2.getLoyaltyCardNumber(r0)
            if (r2 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r4 = r10
            r10 = r2
            r2 = r7
        L_0x0093:
            r4.put(r2, r10)
        L_0x0096:
            com.carrefour.fid.android.shared.util.i r10 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r2 = r5.mo67110m()
            r0.L$0 = r10
            r4 = 0
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r0 = r2.hasLoyaltyCard(r0)
            if (r0 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            r8 = r0
            r0 = r10
            r10 = r8
        L_0x00af:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LOYALTY_ATTACHED "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119704b(r0, r1, r2, r3, r4, r5)
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer.mo67112o(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: p */
    public final void mo67113p() {
        if (C13181d.m57146e(mo67109l().mo31354f())) {
            Object unused = C11970i.m47708b((CoroutineContext) null, new AudienceTrackingInitializer$initPermanentDataUserLogged$1(this, (C11045c<? super AudienceTrackingInitializer$initPermanentDataUserLogged$1>) null), 1, (Object) null);
        }
    }

    /* renamed from: q */
    public final void mo67114q(@C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(accountRepository, "<set-?>");
        this.f58181f = accountRepository;
    }

    /* renamed from: r */
    public final void mo67115r(@C12579k C28994a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f58178c = aVar;
    }

    /* renamed from: s */
    public final void mo67116s(@C12579k C13747e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f58177b = eVar;
    }

    /* renamed from: t */
    public final void mo67117t(@C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<set-?>");
        this.f58183h = o0Var;
    }

    /* renamed from: u */
    public final void mo67118u(@C12579k C37832c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f58179d = cVar;
    }

    /* renamed from: v */
    public final void mo67119v(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "<set-?>");
        this.f58180e = loginRepository;
    }

    /* renamed from: w */
    public final void mo67120w(@C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "<set-?>");
        this.f58182g = loyaltyPreferencesStorage;
    }
}
