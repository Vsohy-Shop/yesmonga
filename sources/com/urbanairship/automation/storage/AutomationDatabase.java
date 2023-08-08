package com.urbanairship.automation.storage;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;
import androidx.room.C20316h;
import androidx.room.C20319h2;
import androidx.room.C20366s1;
import androidx.room.RoomDatabase;
import androidx.room.migration.C20343b;
import androidx.sqlite.p031db.C20466f;
import com.urbanairship.config.C9061a;
import com.urbanairship.json.C9334f;
import java.io.File;

@C20316h(entities = {C8954h.class, C8956j.class}, version = 4)
@C20319h2({C8945d.class, C9334f.class})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class AutomationDatabase extends RoomDatabase {

    /* renamed from: q */
    public static final C20343b f23949q = new C8933a(1, 2);

    /* renamed from: r */
    public static final C20343b f23950r = new C8934b(2, 3);

    /* renamed from: s */
    public static final C20343b f23951s = new C8935c(3, 4);

    /* renamed from: com.urbanairship.automation.storage.AutomationDatabase$a */
    public class C8933a extends C20343b {
        public C8933a(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo17636a(@C0359n0 C20466f fVar) {
            fVar.mo60782s0("ALTER TABLE schedules  ADD COLUMN campaigns TEXT");
        }
    }

    /* renamed from: com.urbanairship.automation.storage.AutomationDatabase$b */
    public class C8934b extends C20343b {
        public C8934b(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo17636a(@C0359n0 C20466f fVar) {
            fVar.mo60782s0("ALTER TABLE schedules  ADD COLUMN frequencyConstraintIds TEXT");
        }
    }

    /* renamed from: com.urbanairship.automation.storage.AutomationDatabase$c */
    public class C8935c extends C20343b {
        public C8935c(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo17636a(@C0359n0 C20466f fVar) {
            fVar.mo60782s0("ALTER TABLE schedules  ADD COLUMN reportingContext TEXT");
        }
    }

    /* renamed from: Q */
    public static AutomationDatabase m33208Q(@C0359n0 Context context, @C0359n0 C9061a aVar) {
        return C20366s1.m95111a(context, AutomationDatabase.class, new File(C17318d.m79730m(context), aVar.mo17958a().f87128a + "_in-app-automation").getAbsolutePath()).mo60923c(f23949q, f23950r, f23951s).mo60936p().mo60926f();
    }

    /* renamed from: R */
    public abstract C8937a mo17635R();
}
