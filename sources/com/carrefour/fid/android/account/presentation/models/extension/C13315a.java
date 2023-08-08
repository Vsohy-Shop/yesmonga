package com.carrefour.fid.android.account.presentation.models.extension;

import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.CivilityTitle;
import com.carrefour.fid.android.domain.models.account.Phone;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAccountInfoModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountInfoModel.kt\ncom/carrefour/fid/android/account/presentation/models/extension/AccountInfoModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n288#2,2:87\n288#2,2:89\n288#2,2:91\n288#2,2:93\n*S KotlinDebug\n*F\n+ 1 AccountInfoModel.kt\ncom/carrefour/fid/android/account/presentation/models/extension/AccountInfoModelKt\n*L\n10#1:87,2\n32#1:89,2\n76#1:91,2\n80#1:93,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.models.extension.a */
public final class C13315a {

    /* renamed from: com.carrefour.fid.android.account.presentation.models.extension.a$a */
    public /* synthetic */ class C13316a {
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
                com.carrefour.fid.android.account.core.type.CivilityTitle[] r0 = com.carrefour.fid.android.account.core.type.CivilityTitle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.account.core.type.CivilityTitle r3 = com.carrefour.fid.android.account.core.type.CivilityTitle.MR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.carrefour.fid.android.account.core.type.CivilityTitle r1 = com.carrefour.fid.android.account.core.type.CivilityTitle.MRS     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.models.extension.C13315a.C13316a.<clinit>():void");
        }
    }

    @C12580l
    /* renamed from: a */
    public static final Address m57642a(@C12579k AccountInfo accountInfo) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(accountInfo, "<this>");
        Iterator it = accountInfo.mo116668v().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Address address = (Address) obj;
            if (address.mo116683H() != AddressCategory.BILLING || !address.mo116695T()) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (Address) obj;
    }

    @C12580l
    /* renamed from: b */
    public static final Address m57643b(@C12579k AccountInfo accountInfo) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(accountInfo, "<this>");
        Iterator it = accountInfo.mo116668v().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Address address = (Address) obj;
            if (address.mo116683H() != AddressCategory.DELIVERY || !address.mo116695T()) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (Address) obj;
    }

    @C12580l
    /* renamed from: c */
    public static final Phone m57644c(@C12579k AccountInfo accountInfo) {
        Object obj;
        Intrinsics.checkNotNullParameter(accountInfo, "<this>");
        Iterator it = accountInfo.mo116671x().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (m57651j((Phone) obj)) {
                break;
            }
        }
        return (Phone) obj;
    }

    /* renamed from: d */
    public static final boolean m57645d(@C12579k AccountInfo accountInfo, @C12580l Address address) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(accountInfo, "<this>");
        if (address == null) {
            return false;
        }
        if (address.mo116677B().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (address.mo116684I().length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return false;
        }
        if (address.mo116694S().length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m57646e(@C12579k AccountInfo accountInfo, @C12580l Address address) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(accountInfo, "<this>");
        if (address == null) {
            return false;
        }
        if (address.mo116677B().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (address.mo116684I().length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return false;
        }
        if (address.mo116694S().length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && m57644c(accountInfo) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m57647f(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.account.AccountInfo r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.carrefour.fid.android.domain.models.account.Address r0 = m57643b(r2)
            r1 = 0
            if (r0 != 0) goto L_0x000d
            goto L_0x0037
        L_0x000d:
            com.carrefour.fid.android.domain.models.account.Address r0 = m57643b(r2)
            boolean r0 = m57645d(r2, r0)
            if (r0 != 0) goto L_0x0018
            goto L_0x0037
        L_0x0018:
            com.carrefour.fid.android.domain.models.account.Address r2 = m57643b(r2)
            r0 = 1
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = r2.mo116685J()
            if (r2 == 0) goto L_0x0032
            int r2 = r2.length()
            if (r2 != 0) goto L_0x002d
            r2 = r0
            goto L_0x002e
        L_0x002d:
            r2 = r1
        L_0x002e:
            if (r2 != r0) goto L_0x0032
            r2 = r0
            goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            if (r2 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r1 = r0
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.models.extension.C13315a.m57647f(com.carrefour.fid.android.domain.models.account.AccountInfo):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m57648g(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.account.AccountInfo r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.carrefour.fid.android.domain.models.account.Address r0 = m57643b(r3)
            r1 = 0
            if (r0 != 0) goto L_0x000d
            goto L_0x003e
        L_0x000d:
            com.carrefour.fid.android.domain.models.account.Address r0 = m57643b(r3)
            boolean r0 = m57646e(r3, r0)
            if (r0 != 0) goto L_0x0018
            goto L_0x003e
        L_0x0018:
            com.carrefour.fid.android.domain.models.account.Address r0 = m57643b(r3)
            r2 = 1
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r0.mo116685J()
            if (r0 == 0) goto L_0x0032
            int r0 = r0.length()
            if (r0 != 0) goto L_0x002d
            r0 = r2
            goto L_0x002e
        L_0x002d:
            r0 = r1
        L_0x002e:
            if (r0 != r2) goto L_0x0032
            r0 = r2
            goto L_0x0033
        L_0x0032:
            r0 = r1
        L_0x0033:
            if (r0 == 0) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            com.carrefour.fid.android.domain.models.account.Phone r3 = m57649h(r3)
            if (r3 != 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.models.extension.C13315a.m57648g(com.carrefour.fid.android.domain.models.account.AccountInfo):boolean");
    }

    @C12580l
    /* renamed from: h */
    public static final Phone m57649h(@C12579k AccountInfo accountInfo) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(accountInfo, "<this>");
        Iterator it = accountInfo.mo116671x().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Phone phone = (Phone) obj;
            if (!m57651j(phone) || !StringKt.m118905N(phone.mo116741e())) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (Phone) obj;
    }

    /* renamed from: i */
    public static final boolean m57650i(@C12579k AccountInfo accountInfo) {
        Intrinsics.checkNotNullParameter(accountInfo, "<this>");
        if (accountInfo.mo116661p() == CivilityTitle.MR) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m57651j(@C12579k Phone phone) {
        boolean z;
        Intrinsics.checkNotNullParameter(phone, "<this>");
        if (!phone.mo116743f()) {
            return false;
        }
        if (phone.mo116741e().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: k */
    public static final CivilityTitle m57652k(@C12579k com.carrefour.fid.android.account.core.type.CivilityTitle civilityTitle) {
        Intrinsics.checkNotNullParameter(civilityTitle, "<this>");
        int i = C13316a.$EnumSwitchMapping$1[civilityTitle.ordinal()];
        if (i == 1) {
            return CivilityTitle.MR;
        }
        if (i == 2) {
            return CivilityTitle.MRS;
        }
        throw new NoWhenBranchMatchedException();
    }

    @C12579k
    /* renamed from: l */
    public static final com.carrefour.fid.android.account.core.type.CivilityTitle m57653l(@C12579k CivilityTitle civilityTitle) {
        Intrinsics.checkNotNullParameter(civilityTitle, "<this>");
        int i = C13316a.$EnumSwitchMapping$0[civilityTitle.ordinal()];
        if (i == 1) {
            return com.carrefour.fid.android.account.core.type.CivilityTitle.MR;
        }
        if (i == 2) {
            return com.carrefour.fid.android.account.core.type.CivilityTitle.MRS;
        }
        throw new NoWhenBranchMatchedException();
    }
}
