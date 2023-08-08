package com.carrefour.fid.android.catalogs.domain.utils;

import com.carrefour.fid.android.domain.models.service.models.C38147b;
import com.carrefour.fid.android.domain.models.service.models.C38154g;
import com.carrefour.fid.android.domain.models.service.models.C38157h;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.shared.util.C28932h;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u000e\u0010\u0013J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004J\u0016\u0010\u0017\u001a\u00020\t2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/domain/utils/StoreUtils;", "", "Lcom/carrefour/fid/android/domain/models/service/models/h;", "openingPattern", "", "Lcom/carrefour/fid/android/domain/models/service/models/b;", "getCurrentDayTime", "Ljava/util/ArrayList;", "buildListOfOpenings", "", "checkStoreOpeningDate", "(Lcom/carrefour/fid/android/domain/models/service/models/h;)Ljava/lang/Boolean;", "hourRange", "", "isStoreOpen", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "Lcom/carrefour/fid/android/design/components/widgets/s1;", "getTimeRange", "(Lcom/carrefour/fid/android/domain/models/service/models/l;)Ljava/lang/Boolean;", "getOpeningHourValid", "Lcom/carrefour/fid/android/domain/models/service/models/g;", "openingExceptionalPattern", "isExceptionalClosing", "<init>", "()V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nStoreUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreUtils.kt\ncom/carrefour/fid/android/catalogs/domain/utils/StoreUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n766#2:121\n857#2,2:122\n*S KotlinDebug\n*F\n+ 1 StoreUtils.kt\ncom/carrefour/fid/android/catalogs/domain/utils/StoreUtils\n*L\n96#1:121\n96#1:122,2\n*E\n"})
public final class StoreUtils {
    @C12579k
    public static final StoreUtils INSTANCE = new StoreUtils();

    private StoreUtils() {
    }

    private final ArrayList<List<C38147b>> buildListOfOpenings(C38157h hVar) {
        ArrayList<List<C38147b>> arrayList = new ArrayList<>();
        arrayList.add(hVar.mo119327t());
        arrayList.add(hVar.mo119324q());
        arrayList.add(hVar.mo119330v());
        arrayList.add(hVar.mo119331w());
        arrayList.add(hVar.mo119329u());
        arrayList.add(hVar.mo119323p());
        arrayList.add(hVar.mo119326s());
        return arrayList;
    }

    private final Boolean checkStoreOpeningDate(C38157h hVar) {
        boolean z;
        List<C38147b> currentDayTime = getCurrentDayTime(hVar);
        if (currentDayTime == null) {
            return null;
        }
        if (INSTANCE.isStoreOpen(currentDayTime) == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private final List<C38147b> getCurrentDayTime(C38157h hVar) {
        ArrayList<List<C38147b>> buildListOfOpenings = buildListOfOpenings(hVar);
        int i = Calendar.getInstance().get(7) - 1;
        if (buildListOfOpenings.size() > i) {
            return buildListOfOpenings.get(i);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0011  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.domain.models.service.models.C38157h getOpeningHourValid(@org.jetbrains.annotations.C12580l java.util.List<com.carrefour.fid.android.domain.models.service.models.C38157h> r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0067
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x000b:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0067
            java.lang.Object r1 = r11.next()
            com.carrefour.fid.android.domain.models.service.models.h r1 = (com.carrefour.fid.android.domain.models.service.models.C38157h) r1
            com.carrefour.fid.android.shared.util.h$a r2 = com.carrefour.fid.android.shared.util.C28932h.f70914a
            java.lang.String r3 = r1.mo119321n()
            java.util.Date r3 = r2.mo84222M(r3)
            java.lang.String r4 = r1.mo119322o()
            java.util.Date r2 = r2.mo84222M(r4)
            com.carrefour.fid.android.shared.util.i r4 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r5 = r1.mo119321n()
            java.lang.String r6 = r1.mo119322o()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = " "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119704b(r4, r5, r6, r7, r8, r9)
            boolean r4 = r0.after(r3)
            if (r4 == 0) goto L_0x005a
            boolean r4 = r0.before(r2)
            if (r4 != 0) goto L_0x0066
        L_0x005a:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r3 != 0) goto L_0x0066
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x000b
        L_0x0066:
            return r1
        L_0x0067:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.domain.utils.StoreUtils.getOpeningHourValid(java.util.List):com.carrefour.fid.android.domain.models.service.models.h");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r5 == null) goto L_0x0032;
     */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.carrefour.fid.android.design.components.widgets.C37399s1 getTimeRange(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.service.models.C38163l r8) {
        /*
            r7 = this;
            java.lang.String r0 = "null cannot be cast to non-null type java.util.Date"
            java.lang.String r1 = "store"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.util.List r8 = r8.mo119363G()
            com.carrefour.fid.android.domain.models.service.models.h r8 = r7.getOpeningHourValid(r8)
            r1 = 0
            if (r8 == 0) goto L_0x005a
            com.carrefour.fid.android.catalogs.domain.utils.StoreUtils r2 = INSTANCE
            java.util.List r8 = r2.getCurrentDayTime(r8)
            if (r8 == 0) goto L_0x005a
            com.carrefour.fid.android.design.components.widgets.s1 r2 = new com.carrefour.fid.android.design.components.widgets.s1     // Catch:{ ParseException -> 0x005a }
            com.carrefour.fid.android.shared.util.h$a r3 = com.carrefour.fid.android.shared.util.C28932h.f70914a     // Catch:{ ParseException -> 0x005a }
            java.text.SimpleDateFormat r4 = r3.mo84250t()     // Catch:{ ParseException -> 0x005a }
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r8)     // Catch:{ ParseException -> 0x005a }
            com.carrefour.fid.android.domain.models.service.models.b r5 = (com.carrefour.fid.android.domain.models.service.models.C38147b) r5     // Catch:{ ParseException -> 0x005a }
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x0032
            java.lang.String r5 = r5.mo119254e()     // Catch:{ ParseException -> 0x005a }
            if (r5 != 0) goto L_0x0033
        L_0x0032:
            r5 = r6
        L_0x0033:
            java.util.Date r4 = r4.parse(r5)     // Catch:{ ParseException -> 0x005a }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)     // Catch:{ ParseException -> 0x005a }
            java.text.SimpleDateFormat r3 = r3.mo84250t()     // Catch:{ ParseException -> 0x005a }
            java.lang.Object r8 = kotlin.collections.CollectionsKt___CollectionsKt.m40677q3(r8)     // Catch:{ ParseException -> 0x005a }
            com.carrefour.fid.android.domain.models.service.models.b r8 = (com.carrefour.fid.android.domain.models.service.models.C38147b) r8     // Catch:{ ParseException -> 0x005a }
            if (r8 == 0) goto L_0x004e
            java.lang.String r8 = r8.mo119256f()     // Catch:{ ParseException -> 0x005a }
            if (r8 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r6 = r8
        L_0x004e:
            java.util.Date r8 = r3.parse(r6)     // Catch:{ ParseException -> 0x005a }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r0)     // Catch:{ ParseException -> 0x005a }
            r2.<init>(r4, r8)     // Catch:{ ParseException -> 0x005a }
            r1 = r2
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.domain.utils.StoreUtils.getTimeRange(com.carrefour.fid.android.domain.models.service.models.l):com.carrefour.fid.android.design.components.widgets.s1");
    }

    public final boolean isExceptionalClosing(@C12580l List<C38154g> list) {
        ArrayList arrayList;
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(new Date());
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list) {
                if (Intrinsics.areEqual((Object) ((C38154g) next).mo119302l(), (Object) "0")) {
                    arrayList2.add(next);
                }
            }
            arrayList = new ArrayList();
            for (Object next2 : arrayList2) {
                if (Intrinsics.areEqual((Object) ((C38154g) next2).mo119299i(), (Object) format)) {
                    arrayList.add(next2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return false;
        }
        return true;
    }

    @C12580l
    public final Boolean isStoreOpen(@C12579k C38163l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "store");
        if (isExceptionalClosing(lVar.mo119362F())) {
            return Boolean.FALSE;
        }
        C38157h openingHourValid = getOpeningHourValid(lVar.mo119363G());
        if (openingHourValid != null) {
            return INSTANCE.checkStoreOpeningDate(openingHourValid);
        }
        return null;
    }

    private final int isStoreOpen(List<C38147b> list) {
        Calendar instance = Calendar.getInstance();
        C28932h.C28933a aVar = C28932h.f70914a;
        String format = aVar.mo84250t().format(instance.getTime());
        String str = null;
        String f = (list == null || !(list.isEmpty() ^ true)) ? null : ((C38147b) CollectionsKt___CollectionsKt.m40653k3(list)).mo119256f();
        if (f != null) {
            Date parse = aVar.mo84250t().parse(f);
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            Date parse2 = aVar.mo84250t().parse(format);
            Intrinsics.checkNotNull(parse2, "null cannot be cast to non-null type java.util.Date");
            if (parse2.getTime() > parse.getTime()) {
                return 1;
            }
        }
        if (list != null && (true ^ list.isEmpty())) {
            str = ((C38147b) CollectionsKt___CollectionsKt.m40706w2(list)).mo119254e();
        }
        if (str == null) {
            return -1;
        }
        Date parse3 = aVar.mo84250t().parse(str);
        Intrinsics.checkNotNull(parse3, "null cannot be cast to non-null type java.util.Date");
        Date parse4 = aVar.mo84250t().parse(format);
        Intrinsics.checkNotNull(parse4, "null cannot be cast to non-null type java.util.Date");
        return parse4.getTime() > parse3.getTime() ? 0 : -1;
    }
}
