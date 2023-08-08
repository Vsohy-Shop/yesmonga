package com.usabilla.sdk.ubform.p007db.campaign;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.urbanairship.automation.actions.CancelSchedulesAction;
import com.usabilla.sdk.ubform.eventengine.C9831a;
import com.usabilla.sdk.ubform.eventengine.TargetingOptionsModel;
import com.usabilla.sdk.ubform.net.parser.C9876c;
import com.usabilla.sdk.ubform.utils.ext.ExtensionDbKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.db.campaign.CampaignDaoImpl */
public final class CampaignDaoImpl implements C9779a {
    @C12579k

    /* renamed from: a */
    public final SQLiteDatabase f26792a;
    @C12579k

    /* renamed from: b */
    public final C9876c f26793b;

    public CampaignDaoImpl(@C12579k SQLiteDatabase sQLiteDatabase, @C12579k C9876c cVar) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "db");
        Intrinsics.checkNotNullParameter(cVar, "parser");
        this.f26792a = sQLiteDatabase;
        this.f26793b = cVar;
    }

    @C12579k
    /* renamed from: a */
    public C11907e<Integer> mo20019a() {
        return ExtensionDbKt.m38298a(this.f26792a, CampaignDaoImpl$deleteAll$1.f26801f);
    }

    @C12579k
    /* renamed from: b */
    public C11907e<List<C9831a>> mo20020b() {
        return C11909g.m47494u(new CampaignDaoImpl$getAll$$inlined$map$1(ExtensionDbKt.m38298a(this.f26792a, CampaignDaoImpl$getAll$1.f26802f), this), new CampaignDaoImpl$getAll$3(this, (C11045c<? super CampaignDaoImpl$getAll$3>) null));
    }

    @C12579k
    /* renamed from: c */
    public C11907e<Integer> mo20021c(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, CancelSchedulesAction.f23548l);
        return ExtensionDbKt.m38298a(this.f26792a, new CampaignDaoImpl$delete$1(list, this));
    }

    @C12579k
    /* renamed from: d */
    public C11907e<Integer> mo20022d(@C12579k List<C9831a> list) {
        Intrinsics.checkNotNullParameter(list, "campaigns");
        return ExtensionDbKt.m38298a(this.f26792a, new CampaignDaoImpl$updateTargetingOptions$1(list, this));
    }

    @C12579k
    /* renamed from: e */
    public C11907e<Integer> mo20023e(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        return ExtensionDbKt.m38298a(this.f26792a, new CampaignDaoImpl$updateTimesShown$1(str, i));
    }

    @C12579k
    /* renamed from: f */
    public C11907e<Integer> mo20024f(@C12579k List<C9831a> list) {
        Intrinsics.checkNotNullParameter(list, "campaigns");
        return ExtensionDbKt.m38298a(this.f26792a, new CampaignDaoImpl$update$1(this, list));
    }

    /* renamed from: k */
    public final int mo20025k(SQLiteDatabase sQLiteDatabase, List<C9831a> list, List<String> list2) {
        boolean z;
        ArrayList<C9831a> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (true ^ list2.contains(((C9831a) next).mo20210n())) {
                arrayList.add(next);
            }
        }
        ArrayList<ContentValues> arrayList2 = new ArrayList<>(C10978t.m41495Y(arrayList, 10));
        for (C9831a aVar : arrayList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", aVar.mo20210n());
            contentValues.put("status", aVar.mo20211o());
            contentValues.put("formId", aVar.mo20209m());
            C9876c cVar = this.f26793b;
            TargetingOptionsModel t = aVar.mo20216t();
            Intrinsics.checkNotNull(t);
            contentValues.put(CampaignTable.f26814n, cVar.mo20341c(t).toString());
            contentValues.put(CampaignTable.f26810j, aVar.mo20215s());
            contentValues.put(CampaignTable.f26811k, aVar.mo20213q());
            contentValues.put(CampaignTable.f26812l, aVar.mo20214r());
            contentValues.put(CampaignTable.f26813m, aVar.mo20208l().mo20707q());
            arrayList2.add(contentValues);
        }
        if (arrayList2.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (ContentValues insert : arrayList2) {
            if (sQLiteDatabase.insert("campaigns", (String) null, insert) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (i = i + 1) < 0) {
                CollectionsKt__CollectionsKt.m40458V();
            }
        }
        return i;
    }

    /* renamed from: l */
    public final int mo20026l(SQLiteDatabase sQLiteDatabase, List<String> list, List<String> list2) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : list2) {
            if (true ^ list.contains((String) next)) {
                arrayList.add(next);
            }
        }
        int i = 0;
        for (String str : arrayList) {
            i += sQLiteDatabase.delete("campaigns", "id = ?", new String[]{str});
        }
        return i;
    }

    /* renamed from: m */
    public final int mo20027m(SQLiteDatabase sQLiteDatabase, List<C9831a> list, List<Pair<String, String>> list2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object next : list2) {
            Pair pair = (Pair) next;
            Iterable<C9831a> iterable = list;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (C9831a n : iterable) {
                arrayList2.add(n.mo20210n());
            }
            if (arrayList2.contains(pair.mo21849e())) {
                arrayList.add(next);
            }
        }
        Iterable<C9831a> iterable2 = list;
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(iterable2, 10));
        for (C9831a aVar : iterable2) {
            arrayList3.add(C11078d1.m42659a(aVar.mo20210n(), aVar.mo20214r()));
        }
        ArrayList<Pair> arrayList4 = new ArrayList<>();
        Iterator it = CollectionsKt___CollectionsKt.m40622d6(arrayList, arrayList3).iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            Pair pair2 = (Pair) next2;
            if (Intrinsics.checkNotNullParameter((String) ((Pair) pair2.mo21849e()).mo21851f(), "date") < Intrinsics.checkNotNullParameter((String) ((Pair) pair2.mo21851f()).mo21851f(), "date")) {
                z2 = false;
            }
            if (z2) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(C10978t.m41495Y(arrayList4, 10));
        for (Pair e : arrayList4) {
            arrayList5.add((String) ((Pair) e.mo21849e()).mo21849e());
        }
        ArrayList<ContentValues> arrayList6 = new ArrayList<>(C10978t.m41495Y(iterable2, 10));
        for (C9831a aVar2 : iterable2) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", aVar2.mo20210n());
            contentValues.put("status", aVar2.mo20211o());
            contentValues.put("formId", aVar2.mo20209m());
            if (!arrayList5.contains(aVar2.mo20210n())) {
                C9876c cVar = this.f26793b;
                TargetingOptionsModel t = aVar2.mo20216t();
                Intrinsics.checkNotNull(t);
                contentValues.put(CampaignTable.f26814n, cVar.mo20341c(t).toString());
            }
            contentValues.put(CampaignTable.f26810j, aVar2.mo20215s());
            contentValues.put(CampaignTable.f26811k, aVar2.mo20213q());
            contentValues.put(CampaignTable.f26812l, aVar2.mo20214r());
            contentValues.put(CampaignTable.f26813m, aVar2.mo20208l().mo20707q());
            arrayList6.add(contentValues);
        }
        if (arrayList6.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (ContentValues contentValues2 : arrayList6) {
            if (sQLiteDatabase.update("campaigns", contentValues2, "id = ? ", new String[]{contentValues2.getAsString("id")}) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (i = i + 1) < 0) {
                CollectionsKt__CollectionsKt.m40458V();
            }
        }
        return i;
    }
}
