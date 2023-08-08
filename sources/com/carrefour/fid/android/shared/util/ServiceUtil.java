package com.carrefour.fid.android.shared.util;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.C37396r1;
import com.carrefour.fid.android.design.components.widgets.C37399s1;
import com.carrefour.fid.android.domain.models.service.models.C38147b;
import com.carrefour.fid.android.domain.models.service.models.C38154g;
import com.carrefour.fid.android.domain.models.service.models.C38157h;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.C38166m;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.util.C28932h;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.Regex;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nServiceUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceUtil.kt\ncom/carrefour/fid/android/shared/util/ServiceUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n288#2,2:214\n766#2:216\n857#2,2:217\n766#2:219\n857#2,2:220\n766#2:223\n857#2,2:224\n1#3:222\n*S KotlinDebug\n*F\n+ 1 ServiceUtil.kt\ncom/carrefour/fid/android/shared/util/ServiceUtil\n*L\n74#1:214,2\n81#1:216\n81#1:217,2\n83#1:219\n83#1:220,2\n148#1:223\n148#1:224,2\n*E\n"})
public final class ServiceUtil {
    @C12579k

    /* renamed from: a */
    public static final ServiceUtil f70805a = new ServiceUtil();
    @C12579k

    /* renamed from: b */
    public static final SimpleDateFormat f70806b = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

    /* renamed from: c */
    public static final int f70807c = 8;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/util/ServiceUtil$OpeningStatus;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum OpeningStatus {
        BEFORE,
        OPEN,
        AFTER,
        UNKNOWN
    }

    @C12579k
    /* renamed from: a */
    public final C37396r1 mo84119a(@C12579k C38163l lVar) {
        Object obj;
        Object obj2;
        String str;
        String str2 = "";
        Intrinsics.checkNotNullParameter(lVar, "store");
        C38147b c = mo84121c(lVar);
        try {
            Result.C10852a aVar = Result.f28060a;
            SimpleDateFormat t = C28932h.f70914a.mo84250t();
            if (c == null || (str = c.mo119254e()) == null) {
                str = str2;
            }
            Date parse = t.parse(str);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            obj = Result.m38702b(parse);
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        Date date = null;
        if (Result.m38709i(obj)) {
            obj = null;
        }
        Date date2 = (Date) obj;
        try {
            Result.C10852a aVar3 = Result.f28060a;
            SimpleDateFormat t2 = C28932h.f70914a.mo84250t();
            if (c != null) {
                String f = c.mo119256f();
                if (f != null) {
                    str2 = f;
                }
            }
            Date parse2 = t2.parse(str2);
            Intrinsics.checkNotNull(parse2, "null cannot be cast to non-null type java.util.Date");
            obj2 = Result.m38702b(parse2);
        } catch (Throwable th2) {
            Result.C10852a aVar4 = Result.f28060a;
            obj2 = Result.m38702b(C11661u0.m45734a(th2));
        }
        if (!Result.m38709i(obj2)) {
            date = obj2;
        }
        Date date3 = date;
        String E = lVar.mo119361E();
        Boolean valueOf = Boolean.valueOf(mo84135q(lVar));
        if (date2 == null) {
            date2 = new Date();
        }
        if (date3 == null) {
            date3 = new Date();
        }
        return new C37396r1(E, valueOf, new C37399s1(date2, date3));
    }

    /* renamed from: b */
    public final List<C38147b> mo84120b(C38157h hVar) {
        List<List<C38147b>> i = mo84127i(hVar);
        int i2 = Calendar.getInstance().get(7) - 1;
        if (i.size() > i2) {
            return i.get(i2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r2 == null) goto L_0x003a;
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.domain.models.service.models.C38147b mo84121c(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.service.models.C38163l r5) {
        /*
            r4 = this;
            java.lang.String r0 = "store"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.carrefour.fid.android.domain.models.service.models.h r5 = r4.mo84130l(r5)
            r0 = 0
            if (r5 != 0) goto L_0x000d
            return r0
        L_0x000d:
            java.util.List r5 = r4.mo84127i(r5)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r2 = 7
            int r1 = r1.get(r2)
            int r1 = r1 + -1
            int r2 = r5.size()
            if (r2 <= r1) goto L_0x004f
            java.lang.Object r5 = r5.get(r1)
            java.util.List r5 = (java.util.List) r5
            com.carrefour.fid.android.domain.models.service.models.b r1 = new com.carrefour.fid.android.domain.models.service.models.b     // Catch:{ ParseException -> 0x004f }
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r5)     // Catch:{ ParseException -> 0x004f }
            com.carrefour.fid.android.domain.models.service.models.b r2 = (com.carrefour.fid.android.domain.models.service.models.C38147b) r2     // Catch:{ ParseException -> 0x004f }
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r2.mo119254e()     // Catch:{ ParseException -> 0x004f }
            if (r2 != 0) goto L_0x003b
        L_0x003a:
            r2 = r3
        L_0x003b:
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40677q3(r5)     // Catch:{ ParseException -> 0x004f }
            com.carrefour.fid.android.domain.models.service.models.b r5 = (com.carrefour.fid.android.domain.models.service.models.C38147b) r5     // Catch:{ ParseException -> 0x004f }
            if (r5 == 0) goto L_0x004b
            java.lang.String r5 = r5.mo119256f()     // Catch:{ ParseException -> 0x004f }
            if (r5 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r3 = r5
        L_0x004b:
            r1.<init>(r2, r3)     // Catch:{ ParseException -> 0x004f }
            return r1
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.util.ServiceUtil.mo84121c(com.carrefour.fid.android.domain.models.service.models.l):com.carrefour.fid.android.domain.models.service.models.b");
    }

    @C12580l
    /* renamed from: d */
    public final C38163l mo84122d(@C12579k C38166m mVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(mVar, "storeFacility");
        Iterator it = mVar.mo119402d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((C38163l) obj).mo119357A(), (Object) "PE")) {
                break;
            }
        }
        return (C38163l) obj;
    }

    @C12579k
    /* renamed from: e */
    public final String mo84123e(@C12580l StoreService storeService) {
        String str;
        boolean z;
        if (storeService != null) {
            str = storeService.mo119163G();
        } else {
            str = null;
        }
        if (str == null || C11622t.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "0261-150-6";
        }
        return f70805a.mo84124f(FacilityServiceId.m157958b(str));
    }

    @C12579k
    /* renamed from: f */
    public final String mo84124f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        if (C11622t.isBlank(str)) {
            return "0261-150-6";
        }
        return new Regex("-(294|308|309|310)-").mo23336m(str, "-150-");
    }

    @C12580l
    /* renamed from: g */
    public final String mo84125g(@C12579k C38163l lVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(lVar, "store");
        Iterator it = lVar.mo119367K().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!C11622t.isBlank(((StoreService) obj).mo119169M())) {
                break;
            }
        }
        StoreService storeService = (StoreService) obj;
        if (storeService != null) {
            return storeService.mo119169M();
        }
        return null;
    }

    @C12579k
    /* renamed from: h */
    public final List<C38154g> mo84126h(@C12579k C38163l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "store");
        ArrayList arrayList = new ArrayList();
        for (Object next : lVar.mo119362F()) {
            if (C28932h.C28933a.m119656d(C28932h.f70914a, ((C38154g) next).mo119299i(), 0, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: i */
    public final List<List<C38147b>> mo84127i(@C12579k C38157h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "openingPattern");
        List i = C10976s.m41417i();
        i.add(hVar.mo119324q());
        i.add(hVar.mo119330v());
        i.add(hVar.mo119331w());
        i.add(hVar.mo119329u());
        i.add(hVar.mo119323p());
        i.add(hVar.mo119326s());
        i.add(hVar.mo119327t());
        return C10976s.m41409a(i);
    }

    @C12579k
    /* renamed from: j */
    public final OpeningStatus mo84128j(@C12579k List<C38147b> list) {
        Intrinsics.checkNotNullParameter(list, "hourRange");
        Calendar instance = Calendar.getInstance();
        C28932h.C28933a aVar = C28932h.f70914a;
        String format = aVar.mo84250t().format(instance.getTime());
        if (!list.isEmpty()) {
            String f = list.get(CollectionsKt__CollectionsKt.m40443G(list)).mo119256f();
            if (f == null) {
                return OpeningStatus.UNKNOWN;
            }
            String e = list.get(0).mo119254e();
            if (e == null) {
                return OpeningStatus.UNKNOWN;
            }
            Date parse = aVar.mo84250t().parse(e);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            Date parse2 = aVar.mo84250t().parse(f);
            Intrinsics.checkNotNull(parse2, "null cannot be cast to non-null type java.util.Date");
            Date parse3 = aVar.mo84250t().parse(format);
            Intrinsics.checkNotNull(parse3, "null cannot be cast to non-null type java.util.Date");
            if (parse3.getTime() < parse.getTime()) {
                return OpeningStatus.BEFORE;
            }
            if (parse3.getTime() > parse.getTime() && parse3.getTime() < parse2.getTime()) {
                return OpeningStatus.OPEN;
            }
            if (parse3.getTime() > parse2.getTime()) {
                return OpeningStatus.AFTER;
            }
        }
        return OpeningStatus.UNKNOWN;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r5 == null) goto L_0x002e;
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.design.components.widgets.C37399s1 mo84129k(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.service.models.C38163l r8) {
        /*
            r7 = this;
            java.lang.String r0 = "null cannot be cast to non-null type java.util.Date"
            java.lang.String r1 = "store"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            com.carrefour.fid.android.domain.models.service.models.h r8 = r7.mo84130l(r8)
            r1 = 0
            if (r8 == 0) goto L_0x0056
            com.carrefour.fid.android.shared.util.ServiceUtil r2 = f70805a
            java.util.List r8 = r2.mo84120b(r8)
            if (r8 == 0) goto L_0x0056
            com.carrefour.fid.android.design.components.widgets.s1 r2 = new com.carrefour.fid.android.design.components.widgets.s1     // Catch:{ ParseException -> 0x0056 }
            com.carrefour.fid.android.shared.util.h$a r3 = com.carrefour.fid.android.shared.util.C28932h.f70914a     // Catch:{ ParseException -> 0x0056 }
            java.text.SimpleDateFormat r4 = r3.mo84250t()     // Catch:{ ParseException -> 0x0056 }
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r8)     // Catch:{ ParseException -> 0x0056 }
            com.carrefour.fid.android.domain.models.service.models.b r5 = (com.carrefour.fid.android.domain.models.service.models.C38147b) r5     // Catch:{ ParseException -> 0x0056 }
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x002e
            java.lang.String r5 = r5.mo119254e()     // Catch:{ ParseException -> 0x0056 }
            if (r5 != 0) goto L_0x002f
        L_0x002e:
            r5 = r6
        L_0x002f:
            java.util.Date r4 = r4.parse(r5)     // Catch:{ ParseException -> 0x0056 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)     // Catch:{ ParseException -> 0x0056 }
            java.text.SimpleDateFormat r3 = r3.mo84250t()     // Catch:{ ParseException -> 0x0056 }
            java.lang.Object r8 = kotlin.collections.CollectionsKt___CollectionsKt.m40677q3(r8)     // Catch:{ ParseException -> 0x0056 }
            com.carrefour.fid.android.domain.models.service.models.b r8 = (com.carrefour.fid.android.domain.models.service.models.C38147b) r8     // Catch:{ ParseException -> 0x0056 }
            if (r8 == 0) goto L_0x004a
            java.lang.String r8 = r8.mo119256f()     // Catch:{ ParseException -> 0x0056 }
            if (r8 != 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r6 = r8
        L_0x004a:
            java.util.Date r8 = r3.parse(r6)     // Catch:{ ParseException -> 0x0056 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r0)     // Catch:{ ParseException -> 0x0056 }
            r2.<init>(r4, r8)     // Catch:{ ParseException -> 0x0056 }
            r1 = r2
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.util.ServiceUtil.mo84129k(com.carrefour.fid.android.domain.models.service.models.l):com.carrefour.fid.android.design.components.widgets.s1");
    }

    @C12580l
    /* renamed from: l */
    public final C38157h mo84130l(@C12579k C38163l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "store");
        List<C38157h> G = lVar.mo119363G();
        Date date = new Date();
        for (C38157h next : G) {
            C28932h.C28933a aVar = C28932h.f70914a;
            Date M = aVar.mo84222M(next.mo119321n());
            Date M2 = aVar.mo84222M(next.mo119322o());
            boolean z = false;
            if (date.compareTo(M) >= 0 && date.compareTo(M2) <= 0) {
                z = true;
                continue;
            }
            if (z) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: m */
    public final boolean mo84131m(@C12579k C38163l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "store");
        String format = f70806b.format(new Date());
        ArrayList arrayList = new ArrayList();
        for (Object next : lVar.mo119362F()) {
            if (Intrinsics.areEqual((Object) ((C38154g) next).mo119302l(), (Object) "0")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (Intrinsics.areEqual((Object) ((C38154g) next2).mo119299i(), (Object) format)) {
                arrayList2.add(next2);
            }
        }
        return !arrayList2.isEmpty();
    }

    /* renamed from: n */
    public final boolean mo84132n(@C12579k StoreService storeService) {
        Intrinsics.checkNotNullParameter(storeService, "storeService");
        StoreServiceType T = storeService.mo119176T();
        if (T == null || (!Intrinsics.areEqual((Object) T, (Object) StoreServiceType.H1h3.INSTANCE) && !Intrinsics.areEqual((Object) T, (Object) StoreServiceType.Clcv.INSTANCE))) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo84133o(@C12579k StoreService storeService) {
        Intrinsics.checkNotNullParameter(storeService, "storeService");
        StoreServiceType T = storeService.mo119176T();
        if (T == null || !Intrinsics.areEqual((Object) T, (Object) StoreServiceType.Drive.INSTANCE)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo84134p(@C12579k StoreService storeService) {
        Intrinsics.checkNotNullParameter(storeService, "storeService");
        StoreServiceType T = storeService.mo119176T();
        if (T == null || !Intrinsics.areEqual((Object) T, (Object) StoreServiceType.H1h3.INSTANCE)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final boolean mo84135q(@C12579k C38163l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "store");
        C38157h l = mo84130l(lVar);
        if (l == null) {
            return false;
        }
        List<List<C38147b>> i = mo84127i(l);
        int i2 = Calendar.getInstance().get(7) - 1;
        if (i.size() <= i2 || mo84128j(i.get(i2)) != OpeningStatus.OPEN) {
            return false;
        }
        return true;
    }
}
