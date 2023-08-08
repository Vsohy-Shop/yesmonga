package com.carrefour.fid.android.domain.models.slot.extension;

import android.content.Context;
import com.carrefour.fid.android.core.constants.C36187r;
import com.carrefour.fid.android.domain.C37479b;
import com.carrefour.fid.android.domain.models.slot.C38180a;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotPartOfDay;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.util.C28932h;
import com.urbanairship.iam.events.C9175a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.collections.C10983u0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;

@C11363r0({"SMAP\nSlot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slot.kt\ncom/carrefour/fid/android/domain/models/slot/extension/SlotKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,160:1\n1855#2,2:161\n288#2,2:163\n288#2,2:165\n766#2:167\n857#2,2:168\n1549#2:171\n1620#2,3:172\n1864#2,3:176\n215#3:170\n216#3:175\n*S KotlinDebug\n*F\n+ 1 Slot.kt\ncom/carrefour/fid/android/domain/models/slot/extension/SlotKt\n*L\n29#1:161,2\n115#1:163,2\n124#1:165,2\n142#1:167\n142#1:168,2\n147#1:171\n147#1:172,3\n155#1:176,3\n146#1:170\n146#1:175\n*E\n"})
public final class SlotKt {
    @C12579k

    /* renamed from: a */
    public static final String f96730a = "yyyy-MM-dd";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.carrefour.fid.android.domain.models.slot.Slot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.carrefour.fid.android.domain.models.slot.Slot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.carrefour.fid.android.domain.models.slot.Slot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.carrefour.fid.android.domain.models.slot.Slot} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.slot.Slot m158328a(@org.jetbrains.annotations.C12579k java.util.Collection<? extends java.util.List<com.carrefour.fid.android.domain.models.slot.Slot>> r2, @org.jetbrains.annotations.C12580l java.lang.Integer r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            if (r3 == 0) goto L_0x000e
            int r3 = r3.intValue()
            goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40628f2(r2, r3)
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            if (r2 == 0) goto L_0x0034
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r2.next()
            r1 = r0
            com.carrefour.fid.android.domain.models.slot.Slot r1 = (com.carrefour.fid.android.domain.models.slot.Slot) r1
            boolean r1 = m158339l(r1)
            if (r1 == 0) goto L_0x001e
            r3 = r0
        L_0x0032:
            com.carrefour.fid.android.domain.models.slot.Slot r3 = (com.carrefour.fid.android.domain.models.slot.Slot) r3
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.slot.extension.SlotKt.m158328a(java.util.Collection, java.lang.Integer):com.carrefour.fid.android.domain.models.slot.Slot");
    }

    @C12580l
    /* renamed from: b */
    public static final String m158329b(@C12579k Collection<? extends List<Slot>> collection, @C12580l Integer num) {
        int i;
        Slot slot;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Iterable iterable = collection;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        List list = (List) CollectionsKt___CollectionsKt.m40628f2(iterable, i);
        if (list == null || (slot = (Slot) CollectionsKt___CollectionsKt.m40479B2(list)) == null) {
            return null;
        }
        return slot.mo119504p();
    }

    @C12579k
    /* renamed from: c */
    public static final SlotPartOfDay m158330c(@C12579k Collection<? extends List<Slot>> collection, @C12580l Integer num) {
        int i;
        Object obj;
        SlotPartOfDay f;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Iterable iterable = collection;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        List list = (List) CollectionsKt___CollectionsKt.m40628f2(iterable, i);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (m158339l((Slot) obj)) {
                    break;
                }
            }
            Slot slot = (Slot) obj;
            if (!(slot == null || (f = m158333f(slot)) == null)) {
                return f;
            }
        }
        return SlotPartOfDay.MORNING;
    }

    @C12580l
    /* renamed from: d */
    public static final Integer m158331d(@C12579k Collection<String> collection, @C12579k String str) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(str, "slotDate");
        int i = 0;
        for (Object next : collection) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            if (Intrinsics.areEqual((Object) (String) next, (Object) str)) {
                return Integer.valueOf(i);
            }
            i = i2;
        }
        return null;
    }

    @C12579k
    /* renamed from: e */
    public static final List<Pair<Date, Integer>> m158332e(@C12580l List<Slot> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            CollectionsKt___CollectionsKt.m40675p5(list, C11006g.m42420h(SlotKt$getMapOfSlotByDay$1.f96731f, SlotKt$getMapOfSlotByDay$2.f96732f));
        }
        if (list != null) {
            for (Slot p : list) {
                Date p2 = m158343p(p.mo119504p());
                if (p2 != null) {
                    Integer num = (Integer) linkedHashMap.get(p2);
                    if (num == null) {
                        num = 0;
                    }
                    Intrinsics.checkNotNullExpressionValue(num, "slotsMap[date] ?: 0");
                    linkedHashMap.put(p2, Integer.valueOf(num.intValue() + 1));
                }
            }
        }
        return C10983u0.m41513J1(linkedHashMap);
    }

    @C12579k
    /* renamed from: f */
    public static final SlotPartOfDay m158333f(@C12579k Slot slot) {
        Intrinsics.checkNotNullParameter(slot, "<this>");
        Calendar instance = Calendar.getInstance();
        instance.setTime(DateTime.m51195N2(slot.mo119504p()).mo28744O0());
        int i = instance.get(11);
        SlotPartOfDay slotPartOfDay = SlotPartOfDay.EVENING;
        if (i < slotPartOfDay.mo119548q()) {
            slotPartOfDay = SlotPartOfDay.AFTERNOON;
            if (i < slotPartOfDay.mo119548q()) {
                slotPartOfDay = SlotPartOfDay.MORNING;
                if (i < slotPartOfDay.mo119548q()) {
                    throw new Throwable("Can't manage part or the day for " + slot);
                }
            }
        }
        return slotPartOfDay;
    }

    @C12579k
    /* renamed from: g */
    public static final String m158334g(@C12579k Slot slot) {
        boolean z;
        Intrinsics.checkNotNullParameter(slot, "<this>");
        if (slot.mo119507s().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || slot.mo119507s().length() < 2) {
            return "1A";
        }
        return StringsKt___StringsKt.takeLast(slot.mo119507s(), 2);
    }

    /* renamed from: h */
    public static final boolean m158335h(@C12579k Slot slot) {
        Intrinsics.checkNotNullParameter(slot, "<this>");
        return Intrinsics.areEqual((Object) slot.mo119510u(), (Object) C36187r.f89352c);
    }

    /* renamed from: i */
    public static final boolean m158336i(@C12579k Collection<? extends List<Slot>> collection, @C12580l Integer num) {
        int i;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Iterable iterable = collection;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        List list = (List) CollectionsKt___CollectionsKt.m40628f2(iterable, i);
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static final boolean m158337j(@C12579k Slot slot) {
        Intrinsics.checkNotNullParameter(slot, "<this>");
        return Intrinsics.areEqual((Object) slot.mo119508t(), (Object) "-1");
    }

    /* renamed from: k */
    public static final boolean m158338k(@C12579k Slot slot) {
        Intrinsics.checkNotNullParameter(slot, "<this>");
        return Intrinsics.areEqual((Object) slot.mo119510u(), (Object) C36187r.f89351b);
    }

    /* renamed from: l */
    public static final boolean m158339l(@C12579k Slot slot) {
        Intrinsics.checkNotNullParameter(slot, "<this>");
        if (!Intrinsics.areEqual((Object) slot.mo119510u(), (Object) C36187r.f89350a) || !Intrinsics.areEqual((Object) slot.mo119514x(), (Object) Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static final boolean m158340m(@C12579k Collection<? extends List<Slot>> collection, @C12580l Integer num, @C12579k SlotPartOfDay slotPartOfDay) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(slotPartOfDay, "slotPartOfDay");
        return !m158347t(collection, num, slotPartOfDay).isEmpty();
    }

    @C12579k
    /* renamed from: n */
    public static final String m158341n(@C12579k Slot slot, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(slot, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        try {
            Date O0 = DateTime.m51195N2(slot.mo119504p()).mo28744O0();
            String string = context.getString(C37479b.C37490k.order_withdrawal_date, new Object[]{new SimpleDateFormat("EEEE dd MMMM", Locale.FRANCE).format(O0), new SimpleDateFormat("HH:mm", Locale.FRANCE).format(O0)});
            Intrinsics.checkNotNullExpressionValue(string, "{\n    val start = DateTi…CE).format(start)\n    )\n}");
            return string;
        } catch (Exception unused) {
            return new String();
        }
    }

    @C12579k
    /* renamed from: o */
    public static final String m158342o(@C12579k Slot slot, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(slot, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        try {
            Date O0 = DateTime.m51195N2(slot.mo119504p()).mo28744O0();
            String string = context.getString(C37479b.C37490k.order_withdrawal_date, new Object[]{new SimpleDateFormat(C28932h.f70939z, Locale.FRANCE).format(O0), new SimpleDateFormat("HH:mm", Locale.FRANCE).format(O0)});
            Intrinsics.checkNotNullExpressionValue(string, "{\n    val start = DateTi…CE).format(start)\n    )\n}");
            return string;
        } catch (Exception unused) {
            return new String();
        }
    }

    @C12580l
    /* renamed from: p */
    public static final Date m158343p(@C12579k String str) {
        Object obj;
        Intrinsics.checkNotNullParameter(str, "slotDate");
        try {
            Result.C10852a aVar = Result.f28060a;
            obj = Result.m38702b(new SimpleDateFormat("yyyy-MM-dd", Locale.FRANCE).parse(str));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        if (Result.m38709i(obj)) {
            obj = null;
        }
        return (Date) obj;
    }

    @C12579k
    /* renamed from: q */
    public static final String m158344q(@C12579k Slot slot, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(slot, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        try {
            Date O0 = DateTime.m51195N2(slot.mo119504p()).mo28744O0();
            Date O02 = DateTime.m51195N2(slot.mo119505q()).mo28744O0();
            String string = context.getString(C37479b.C37490k.slot_date_time, new Object[]{new SimpleDateFormat(C28932h.f70939z, Locale.FRANCE).format(O0), new SimpleDateFormat("HH:mm", Locale.FRANCE).format(O0), new SimpleDateFormat("HH:mm", Locale.FRANCE).format(O02)});
            Intrinsics.checkNotNullExpressionValue(string, "{\n    val start = DateTi…ANCE).format(end)\n    )\n}");
            return string;
        } catch (Exception unused) {
            return new String();
        }
    }

    @C12580l
    /* renamed from: r */
    public static final String m158345r(@C12579k Slot slot, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(slot, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.FRANCE);
            return context.getString(C37479b.C37490k.store_hour_concat, new Object[]{simpleDateFormat.format(DateTime.m51195N2(slot.mo119504p()).mo28744O0()), simpleDateFormat.format(DateTime.m51195N2(slot.mo119505q()).mo28744O0())});
        } catch (Exception unused) {
            return null;
        }
    }

    @C12580l
    /* renamed from: s */
    public static final C38180a m158346s(@C12579k Map<String, ? extends List<Slot>> map, @C12579k String str) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
        for (Map.Entry next : map.entrySet()) {
            String str2 = (String) next.getKey();
            Iterable iterable = (List) next.getValue();
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    Slot slot = (Slot) it.next();
                    if (Intrinsics.areEqual((Object) slot.mo119508t(), (Object) str)) {
                        return new C38180a(slot, str2);
                    }
                    arrayList.add(C11079d2.f28267a);
                }
            }
        }
        return null;
    }

    @C12579k
    /* renamed from: t */
    public static final List<Slot> m158347t(@C12579k Collection<? extends List<Slot>> collection, @C12580l Integer num, @C12580l SlotPartOfDay slotPartOfDay) {
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Iterable iterable = collection;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        List list = (List) CollectionsKt___CollectionsKt.m40628f2(iterable, i);
        if (list == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (m158333f((Slot) next) == slotPartOfDay) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
