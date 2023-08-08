package com.urbanairship.automation.storage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.C36071u;
import com.urbanairship.automation.C8814b;
import com.urbanairship.automation.storage.C8947f;
import com.urbanairship.config.C9061a;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9329d;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.storage.g */
public class C8950g {

    /* renamed from: d */
    public static final String f24001d = "com.urbanairship.iam.data.SCHEDULED_MESSAGES";

    /* renamed from: a */
    public final Context f24002a;

    /* renamed from: b */
    public final C9061a f24003b;

    /* renamed from: c */
    public final C36071u f24004c;

    /* renamed from: com.urbanairship.automation.storage.g$a */
    public class C8951a implements C8953c {

        /* renamed from: a */
        public final /* synthetic */ C8937a f24005a;

        public C8951a(C8937a aVar) {
            this.f24005a = aVar;
        }

        /* renamed from: a */
        public void mo17683a(@C0359n0 C8954h hVar, @C0359n0 List<C8956j> list) {
            hVar.f24020k = "actions";
            C36059m.m148419o("Saving migrated action schedule: %s triggers: %s", hVar, list);
            this.f24005a.mo17653q(new C8946e(hVar, list));
        }
    }

    /* renamed from: com.urbanairship.automation.storage.g$b */
    public static class C8952b implements C8953c {

        /* renamed from: a */
        public final Set<String> f24007a;

        /* renamed from: b */
        public final Set<String> f24008b;

        /* renamed from: c */
        public final C8937a f24009c;

        public /* synthetic */ C8952b(C8937a aVar, Set set, C8951a aVar2) {
            this(aVar, set);
        }

        /* renamed from: a */
        public void mo17683a(@C0359n0 C8954h hVar, @C0359n0 List<C8956j> list) {
            hVar.f24020k = "in_app_message";
            if (this.f24007a.contains(hVar.f24011b)) {
                hVar.f24021l = C9323b.m35017y().mo18825i(hVar.f24021l.mo18749A()).mo18823g("source", InAppMessage.f24674L0).mo18817a().mo17264q();
            }
            String m = hVar.f24021l.mo18749A().mo18801A("message_id").mo18770m(hVar.f24011b);
            if ("app-defined".equals(hVar.f24021l.mo18749A().mo18801A("source").mo18750B())) {
                hVar.f24013d = C9323b.m35017y().mo18825i(hVar.f24013d).mo18823g("com.urbanairship.original_schedule_id", hVar.f24011b).mo18823g("com.urbanairship.original_message_id", m).mo18817a();
                m = mo17684b(m);
            }
            hVar.f24011b = m;
            for (C8956j jVar : list) {
                jVar.f24047g = m;
            }
            this.f24008b.add(m);
            JsonValue k = hVar.f24021l.mo18749A().mo18812k("audience");
            if (k != null) {
                try {
                    hVar.f24030u = C8814b.m32733a(k);
                } catch (JsonException e) {
                    C36059m.m148411g(e, "Unable to schedule due to audience JSON", new Object[0]);
                    return;
                }
            }
            C36059m.m148419o("Saving migrated message schedule: %s triggers: %s", hVar, list);
            this.f24009c.mo17653q(new C8946e(hVar, list));
        }

        /* renamed from: b */
        public final String mo17684b(String str) {
            int i = 0;
            String str2 = str;
            while (this.f24008b.contains(str2)) {
                i++;
                str2 = str + "#" + i;
            }
            return str2;
        }

        public C8952b(@C0359n0 C8937a aVar, @C0359n0 Set<String> set) {
            this.f24009c = aVar;
            this.f24007a = set;
            this.f24008b = new HashSet();
        }
    }

    /* renamed from: com.urbanairship.automation.storage.g$c */
    public interface C8953c {
        /* renamed from: a */
        void mo17683a(@C0359n0 C8954h hVar, @C0359n0 List<C8956j> list);
    }

    public C8950g(@C0359n0 Context context, @C0359n0 C9061a aVar, @C0359n0 C36071u uVar) {
        this.f24002a = context.getApplicationContext();
        this.f24003b = aVar;
        this.f24004c = uVar;
    }

    /* renamed from: a */
    public final void mo17677a(@C0363p0 Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (SQLException e) {
                C36059m.m148411g(e, "Failed to close cursor.", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public void mo17678b(@C0359n0 C8937a aVar) {
        C8947f fVar = new C8947f(this.f24002a, this.f24003b.mo17958a().f87128a, "ua_automation.db");
        if (fVar.mo19631c(this.f24002a)) {
            C36059m.m148419o("Migrating actions automation database.", new Object[0]);
            mo17680d(fVar, new C8951a(aVar));
        }
        C8947f fVar2 = new C8947f(this.f24002a, this.f24003b.mo17958a().f87128a, "in-app");
        if (fVar2.mo19631c(this.f24002a)) {
            C36059m.m148419o("Migrating in-app message database.", new Object[0]);
            mo17680d(fVar2, new C8952b(aVar, this.f24004c.mo107845h(f24001d).mo18749A().mo18816w(), (C8951a) null));
            this.f24004c.mo107859x(f24001d);
        }
    }

    /* renamed from: c */
    public final void mo17679c(@C0359n0 Cursor cursor, @C0359n0 C8953c cVar) {
        C8954h hVar;
        JsonException e;
        ArrayList arrayList = new ArrayList();
        cursor.moveToFirst();
        C8954h hVar2 = null;
        String str = null;
        while (!cursor.isAfterLast()) {
            String string = cursor.getString(cursor.getColumnIndex(C8947f.C8948a.f23973b));
            if (!C9669o0.m36223d(str, string)) {
                if (hVar2 != null) {
                    cVar.mo17683a(hVar2, arrayList);
                }
                arrayList.clear();
                hVar2 = null;
                str = string;
            }
            boolean z = false;
            if (hVar2 == null) {
                try {
                    hVar = new C8954h();
                    try {
                        hVar.f24011b = cursor.getString(cursor.getColumnIndex(C8947f.C8948a.f23973b));
                        hVar.f24013d = JsonValue.m34960C(cursor.getString(cursor.getColumnIndex(C8947f.C8948a.f23974c))).mo18749A();
                        hVar.f24022m = cursor.getInt(cursor.getColumnIndex(C8947f.C8948a.f23990s));
                        hVar.f24014e = cursor.getInt(cursor.getColumnIndex(C8947f.C8948a.f23976e));
                        hVar.f24015f = cursor.getInt(cursor.getColumnIndex(C8947f.C8948a.f23977f));
                        hVar.f24012c = cursor.getString(cursor.getColumnIndex(C8947f.C8948a.f23978g));
                        hVar.f24018i = cursor.getLong(cursor.getColumnIndex(C8947f.C8948a.f23981j));
                        hVar.f24017h = cursor.getLong(cursor.getColumnIndex(C8947f.C8948a.f23980i));
                        hVar.f24016g = cursor.getLong(cursor.getColumnIndex(C8947f.C8948a.f23979h));
                        hVar.f24023n = cursor.getInt(cursor.getColumnIndex(C8947f.C8948a.f23987p));
                        hVar.f24024o = cursor.getLong(cursor.getColumnIndex(C8947f.C8948a.f23988q));
                        hVar.f24026q = cursor.getInt(cursor.getColumnIndex(C8947f.C8948a.f23985n));
                        hVar.f24029t = cursor.getString(cursor.getColumnIndex(C8947f.C8948a.f23986o));
                        hVar.f24019j = cursor.getLong(cursor.getColumnIndex(C8947f.C8948a.f23982k));
                        hVar.f24028s = cursor.getLong(cursor.getColumnIndex(C8947f.C8948a.f23983l));
                        hVar.f24027r = mo17682f(JsonValue.m34960C(cursor.getString(cursor.getColumnIndex(C8947f.C8948a.f23984m))));
                        hVar.f24021l = JsonValue.m34960C(cursor.getString(cursor.getColumnIndex(C8947f.C8948a.f23975d)));
                        hVar2 = hVar;
                    } catch (JsonException e2) {
                        e = e2;
                        C36059m.m148411g(e, "Failed to parse schedule entry.", new Object[0]);
                        hVar2 = hVar;
                    }
                } catch (JsonException e3) {
                    hVar = hVar2;
                    e = e3;
                    C36059m.m148411g(e, "Failed to parse schedule entry.", new Object[0]);
                    hVar2 = hVar;
                }
            }
            if (cursor.getColumnIndex(C8947f.C8949b.f23995c) != -1) {
                C8956j jVar = new C8956j();
                jVar.f24047g = hVar2.f24011b;
                jVar.f24042b = cursor.getInt(cursor.getColumnIndex(C8947f.C8949b.f23995c));
                jVar.f24043c = cursor.getDouble(cursor.getColumnIndex(C8947f.C8949b.f23999g));
                jVar.f24046f = cursor.getDouble(cursor.getColumnIndex(C8947f.C8949b.f23998f));
                jVar.f24044d = mo17681e(cursor.getString(cursor.getColumnIndex(C8947f.C8949b.f23997e)));
                if (cursor.getInt(cursor.getColumnIndex(C8947f.C8949b.f24000h)) == 1) {
                    z = true;
                }
                jVar.f24045e = z;
                arrayList.add(jVar);
            }
            cursor.moveToNext();
        }
        if (hVar2 != null) {
            cVar.mo17683a(hVar2, arrayList);
        }
    }

    /* renamed from: d */
    public final void mo17680d(@C0359n0 C8947f fVar, @C0363p0 C8953c cVar) {
        Cursor cursor = null;
        try {
            cursor = fVar.mo17676t();
            if (cursor != null) {
                mo17679c(cursor, cVar);
            }
        } catch (Exception e) {
            C36059m.m148411g(e, "Error when migrating database.", new Object[0]);
        } catch (Throwable th) {
            mo17677a((Cursor) null);
            fVar.mo17675s();
            fVar.mo19630b();
            fVar.mo19633e(this.f24002a);
            throw th;
        }
        mo17677a(cursor);
        fVar.mo17675s();
        fVar.mo19630b();
        fVar.mo19633e(this.f24002a);
    }

    @C0363p0
    /* renamed from: e */
    public final C9329d mo17681e(String str) {
        try {
            JsonValue C = JsonValue.m34960C(str);
            if (!C.mo18780w()) {
                return C9329d.m35055d(C);
            }
            return null;
        } catch (JsonException e) {
            C36059m.m148411g(e, "Failed to parse JSON predicate.", new Object[0]);
            return null;
        }
    }

    /* renamed from: f */
    public final List<String> mo17682f(JsonValue jsonValue) {
        ArrayList arrayList = new ArrayList();
        if (jsonValue.mo18776t()) {
            Iterator<JsonValue> it = jsonValue.mo18784z().iterator();
            while (it.hasNext()) {
                JsonValue next = it.next();
                if (next.mo18769l() != null) {
                    arrayList.add(next.mo18769l());
                }
            }
        } else {
            String l = jsonValue.mo18769l();
            if (l != null) {
                arrayList.add(l);
            }
        }
        return arrayList;
    }
}
