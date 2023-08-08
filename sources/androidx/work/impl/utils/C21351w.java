package androidx.work.impl.utils;

import androidx.sqlite.p031db.C20456b;
import androidx.sqlite.p031db.C20489i;
import androidx.work.C21412v;
import androidx.work.WorkInfo;
import androidx.work.impl.model.C21212b0;
import com.urbanairship.automation.actions.CancelSchedulesAction;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "RawQueries")
/* renamed from: androidx.work.impl.utils.w */
public final class C21351w {
    /* renamed from: a */
    public static final void m98480a(StringBuilder sb, int i) {
        if (i > 0) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add("?");
            }
            sb.append(CollectionsKt___CollectionsKt.m40639h3(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null));
        }
    }

    @C12579k
    /* renamed from: b */
    public static final C20489i m98481b(@C12579k C21412v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List<WorkInfo.State> j = vVar.mo63849j();
        Intrinsics.checkNotNullExpressionValue(j, "states");
        String str = " AND";
        String str2 = " WHERE";
        if (!j.isEmpty()) {
            List<WorkInfo.State> j2 = vVar.mo63849j();
            Intrinsics.checkNotNullExpressionValue(j2, "states");
            Iterable<WorkInfo.State> iterable = j2;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (WorkInfo.State state : iterable) {
                Intrinsics.checkNotNull(state);
                arrayList2.add(Integer.valueOf(C21212b0.m98017j(state)));
            }
            sb.append(str2 + " state IN (");
            m98480a(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str2 = str;
        }
        List<UUID> i = vVar.mo63848i();
        Intrinsics.checkNotNullExpressionValue(i, CancelSchedulesAction.f23548l);
        if (!i.isEmpty()) {
            List<UUID> i2 = vVar.mo63848i();
            Intrinsics.checkNotNullExpressionValue(i2, CancelSchedulesAction.f23548l);
            Iterable<UUID> iterable2 = i2;
            ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (UUID uuid : iterable2) {
                arrayList3.add(uuid.toString());
            }
            sb.append(str2 + " id IN (");
            m98480a(sb, vVar.mo63848i().size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str2 = str;
        }
        List<String> k = vVar.mo63850k();
        Intrinsics.checkNotNullExpressionValue(k, "tags");
        if (!k.isEmpty()) {
            sb.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            m98480a(sb, vVar.mo63850k().size());
            sb.append("))");
            List<String> k2 = vVar.mo63850k();
            Intrinsics.checkNotNullExpressionValue(k2, "tags");
            arrayList.addAll(k2);
        } else {
            str = str2;
        }
        List<String> l = vVar.mo63851l();
        Intrinsics.checkNotNullExpressionValue(l, "uniqueWorkNames");
        if (!l.isEmpty()) {
            sb.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            m98480a(sb, vVar.mo63851l().size());
            sb.append("))");
            List<String> l2 = vVar.mo63851l();
            Intrinsics.checkNotNullExpressionValue(l2, "uniqueWorkNames");
            arrayList.addAll(l2);
        }
        sb.append(";");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return new C20456b(sb2, arrayList.toArray(new Object[0]));
    }
}
