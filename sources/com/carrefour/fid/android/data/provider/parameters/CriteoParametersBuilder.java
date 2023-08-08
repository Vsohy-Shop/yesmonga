package com.carrefour.fid.android.data.provider.parameters;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.service.C37824l;
import com.carrefour.fid.android.domain.models.criteo.CriteoEventType;
import com.carrefour.fid.android.domain.models.criteo.CriteoPageType;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.constant.C28607x;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.carrefour.fid.android.shared.util.type.HashType;
import com.google.firebase.installations.local.C33093b;
import com.urbanairship.iam.events.C9175a;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class CriteoParametersBuilder {

    /* renamed from: h */
    public static final int f90324h = 8;
    @C12579k

    /* renamed from: a */
    public final Context f90325a;
    @C12579k

    /* renamed from: b */
    public final AppEnvironment f90326b;
    @C12579k

    /* renamed from: c */
    public final LoginRepository f90327c;
    @C12579k

    /* renamed from: d */
    public final AccountRepository f90328d;
    @C12579k

    /* renamed from: e */
    public final C37824l f90329e;

    /* renamed from: f */
    public final boolean f90330f;
    @C12579k

    /* renamed from: g */
    public final HashMap<String, String> f90331g = new HashMap<>();

    public CriteoParametersBuilder(@C12579k Context context, @C12579k AppEnvironment appEnvironment, @C12579k LoginRepository loginRepository, @C12579k AccountRepository accountRepository, @C12579k C37824l lVar, boolean z) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(lVar, "getStoreRefUseCase");
        this.f90325a = context;
        this.f90326b = appEnvironment;
        this.f90327c = loginRepository;
        this.f90328d = accountRepository;
        this.f90329e = lVar;
        this.f90330f = z;
    }

    @C12579k
    /* renamed from: a */
    public final CriteoParametersBuilder mo111454a(@C12580l Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            this.f90331g.put(C28534f.f69157h0, String.valueOf(Boolean.compare(bool.booleanValue(), false)));
        }
        return this;
    }

    @C12579k
    /* renamed from: b */
    public final CriteoParametersBuilder mo111455b() {
        this.f90331g.put(C28534f.f69159i0, "1");
        return this;
    }

    @C12579k
    /* renamed from: c */
    public final CriteoParametersBuilder mo111456c(@C12580l List<String> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f90331g.put("category", CollectionsKt___CollectionsKt.m40639h3(list, ">", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null));
        }
        return this;
    }

    @C12579k
    /* renamed from: d */
    public final CriteoParametersBuilder mo111457d() {
        this.f90331g.put(C28534f.f69163k0, this.f90327c.mo31352d());
        return this;
    }

    @C12579k
    /* renamed from: e */
    public final CriteoParametersBuilder mo111458e(@C12579k CriteoEventType criteoEventType) {
        Intrinsics.checkNotNullParameter(criteoEventType, "eventType");
        this.f90331g.put(C28534f.f69171o0, criteoEventType.mo117334q());
        return this;
    }

    @C12579k
    /* renamed from: f */
    public final CriteoParametersBuilder mo111459f(@C12580l List<String> list) {
        if (list != null) {
            this.f90331g.put("item", CollectionsKt___CollectionsKt.m40639h3(list, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null));
        }
        return this;
    }

    @C12579k
    /* renamed from: g */
    public final CriteoParametersBuilder mo111460g(@C12580l String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f90331g.put(C28534f.f69179s0, str);
        }
        return this;
    }

    @C12579k
    /* renamed from: h */
    public final CriteoParametersBuilder mo111461h(@C12580l List<Double> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f90331g.put(C28534f.f69181t0, CollectionsKt___CollectionsKt.m40639h3(list, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null));
        }
        return this;
    }

    @C12579k
    /* renamed from: i */
    public final CriteoParametersBuilder mo111462i(@C12580l Integer num) {
        if (num != null) {
            num.intValue();
            this.f90331g.put(C28534f.f69183u0, String.valueOf(num));
        }
        return this;
    }

    @C12579k
    /* renamed from: j */
    public final CriteoParametersBuilder mo111463j(@C12579k CriteoPageType criteoPageType) {
        Intrinsics.checkNotNullParameter(criteoPageType, "pageType");
        this.f90331g.put(C28534f.f69185v0, criteoPageType.mo117366q());
        return this;
    }

    @C12579k
    /* renamed from: k */
    public final CriteoParametersBuilder mo111464k(@C12580l Integer num) {
        if (num != null) {
            this.f90331g.put(C28534f.f69187w0, String.valueOf((num.intValue() / 10) + 1));
        }
        return this;
    }

    @C12579k
    /* renamed from: l */
    public final CriteoParametersBuilder mo111465l(@C12580l List<Double> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f90331g.put("price", CollectionsKt___CollectionsKt.m40639h3(list, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null));
        }
        return this;
    }

    @C12579k
    /* renamed from: m */
    public final CriteoParametersBuilder mo111466m(@C12580l List<Integer> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f90331g.put("quantity", CollectionsKt___CollectionsKt.m40639h3(list, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null));
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111467n(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder$addRegionId$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder$addRegionId$1 r0 = (com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder$addRegionId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder$addRegionId$1 r0 = new com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder$addRegionId$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r1 = r0.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.L$1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r0 = (com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x005d
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0043:
            kotlin.C11661u0.m45747n(r6)
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r5.f90331g
            com.carrefour.fid.android.domain.interactors.service.l r6 = r5.f90329e
            r0.L$0 = r5
            r0.L$1 = r2
            java.lang.String r4 = "regionId"
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m172965invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r0 = r5
            r1 = r4
        L_0x005d:
            boolean r3 = kotlin.Result.m38709i(r6)
            if (r3 == 0) goto L_0x0064
            r6 = 0
        L_0x0064:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x006a
            java.lang.String r6 = "6"
        L_0x006a:
            r2.put(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder.mo111467n(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: o */
    public final CriteoParametersBuilder mo111468o(@C12580l String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f90331g.put(C28534f.f69116C0, str);
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111469p(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder$addUserEmail$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder$addUserEmail$1 r0 = (com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder$addUserEmail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder$addUserEmail$1 r0 = new com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder$addUserEmail$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r1 = r0.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.L$1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder r0 = (com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder) r0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0057
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003d:
            kotlin.C11661u0.m45747n(r7)
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r6.f90331g
            com.carrefour.fid.android.account.data.repositories.AccountRepository r7 = r6.f90328d
            r0.L$0 = r6
            r0.L$1 = r2
            java.lang.String r4 = "email"
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r7 = r7.mo31329n(r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r0 = r6
            r1 = r4
        L_0x0057:
            com.carrefour.fid.android.domain.models.account.AccountInfo r7 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r7
            r3 = 0
            if (r7 == 0) goto L_0x0061
            java.lang.String r7 = r7.mo116663r()
            goto L_0x0062
        L_0x0061:
            r7 = r3
        L_0x0062:
            com.carrefour.fid.android.shared.util.type.HashType r4 = com.carrefour.fid.android.shared.util.type.HashType.MD5
            r5 = 2
            java.lang.String r7 = com.carrefour.fid.android.shared.extension.StringKt.m118899H(r7, r4, r3, r5, r3)
            r2.put(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.provider.parameters.CriteoParametersBuilder.mo111469p(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: q */
    public final CriteoParametersBuilder mo111470q(boolean z) {
        String str;
        if (z) {
            str = Settings.Secure.getString(this.f90325a.getContentResolver(), "android_id");
        } else {
            str = UUID.randomUUID().toString();
        }
        this.f90331g.put(C28534f.f69114B0, StringKt.m118899H(str, HashType.SHA_ONE, (String) null, 2, (Object) null));
        return this;
    }

    @C12579k
    /* renamed from: r */
    public final HashMap<String, String> mo111471r() {
        HashMap<String, String> hashMap = this.f90331g;
        if (this.f90330f) {
            hashMap.put("User-Agent", C28607x.f69977A);
        } else {
            hashMap.put(C28534f.f69189x0, this.f90326b.mo84179s());
            hashMap.put(C28534f.f69173p0, C28534f.f69175q0);
        }
        hashMap.put(C28534f.f69167m0, C28534f.f69169n0);
        return hashMap;
    }
}
