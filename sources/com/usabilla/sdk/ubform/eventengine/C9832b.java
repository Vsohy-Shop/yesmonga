package com.usabilla.sdk.ubform.eventengine;

import com.usabilla.sdk.ubform.Logger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.eventengine.b */
public final class C9832b {

    /* renamed from: com.usabilla.sdk.ubform.eventengine.b$a */
    public static final class C9833a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Long.valueOf(Intrinsics.checkNotNullParameter(((C9831a) t).mo20213q(), "date")), Long.valueOf(Intrinsics.checkNotNullParameter(((C9831a) t2).mo20213q(), "date")));
        }
    }

    @C12579k
    /* renamed from: a */
    public final List<C9831a> mo20221a(@C12579k C9827Event event, @C12579k List<C9831a> list) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(list, "campaigns");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C9831a) next).mo20218u(event)) {
                arrayList.add(next);
            }
        }
        return CollectionsKt___CollectionsKt.m40675p5(arrayList, new C9833a());
    }

    @C12579k
    /* renamed from: b */
    public final List<C9831a> mo20222b(@C12579k C9827Event event, @C12579k List<C9831a> list, @C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(list, "campaigns");
        Intrinsics.checkNotNullParameter(map, "activeStatuses");
        ArrayList<C9831a> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((C9831a) next).mo20220w(event, map)) {
                arrayList.add(next);
            }
        }
        for (C9831a n : arrayList) {
            Logger.Companion companion = Logger.f26647a;
            companion.logInfo("Campaign " + n.mo20210n() + " has been triggered!");
        }
        return arrayList;
    }
}
