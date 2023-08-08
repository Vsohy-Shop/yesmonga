package com.carrefour.fid.android.domain.models.account.extension;

import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.Phone;
import com.carrefour.fid.android.domain.models.account.UserCards;
import java.util.Iterator;
import java.util.List;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAccountInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountInfo.kt\ncom/carrefour/fid/android/domain/models/account/extension/AccountInfoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1#2:46\n1789#3,3:47\n288#3,2:50\n288#3,2:52\n288#3,2:54\n*S KotlinDebug\n*F\n+ 1 AccountInfo.kt\ncom/carrefour/fid/android/domain/models/account/extension/AccountInfoKt\n*L\n19#1:47,3\n32#1:50,2\n37#1:52,2\n42#1:54,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.models.account.extension.a */
public final class C37949a {
    @C12580l
    /* renamed from: a */
    public static final Address m155955a(@C12579k AccountInfo accountInfo) {
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
    public static final Address m155956b(@C12579k AccountInfo accountInfo) {
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
    public static final UserCards m155957c(@C12579k List<UserCards> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        Object w2 = CollectionsKt___CollectionsKt.m40706w2(list);
        UserCards userCards = w2;
        for (UserCards userCards2 : CollectionsKt___CollectionsKt.m40588X1(list, 1)) {
            UserCards userCards3 = (UserCards) userCards;
            userCards = m155958d(userCards2.mo116761i()) > m155958d(userCards3.mo116761i()) ? userCards2 : userCards3;
        }
        return (UserCards) userCards;
    }

    /* renamed from: d */
    public static final long m155958d(String str) {
        Object obj;
        Object obj2;
        long j = 0L;
        if (str.length() >= 13) {
            try {
                Result.C10852a aVar = Result.f28060a;
                obj2 = Result.m38702b(Long.valueOf(Long.parseLong(str) / ((long) 1000)));
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj2 = Result.m38702b(C11661u0.m45734a(th));
            }
            if (!Result.m38709i(obj2)) {
                j = obj2;
            }
            return ((Number) j).longValue();
        }
        try {
            Result.C10852a aVar3 = Result.f28060a;
            obj = Result.m38702b(Long.valueOf(Long.parseLong(str)));
        } catch (Throwable th2) {
            Result.C10852a aVar4 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th2));
        }
        if (!Result.m38709i(obj)) {
            j = obj;
        }
        return ((Number) j).longValue();
    }

    @C12579k
    /* renamed from: e */
    public static final String m155959e(@C12579k AccountInfo accountInfo) {
        Object obj;
        String e;
        Intrinsics.checkNotNullParameter(accountInfo, "<this>");
        Iterator it = accountInfo.mo116671x().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Phone) obj).mo116743f()) {
                break;
            }
        }
        Phone phone = (Phone) obj;
        if (phone != null && (e = phone.mo116741e()) != null) {
            return e;
        }
        Phone phone2 = (Phone) CollectionsKt___CollectionsKt.m40479B2(accountInfo.mo116671x());
        if (phone2 != null) {
            return phone2.mo116741e();
        }
        return "";
    }
}
