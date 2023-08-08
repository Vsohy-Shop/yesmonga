package com.urbanairship;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;
import androidx.room.C20316h;
import androidx.room.C20366s1;
import androidx.room.RoomDatabase;
import androidx.room.migration.C20343b;
import androidx.sqlite.p031db.C20466f;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.io.File;

@C20316h(entities = {C36065r.class}, version = 2)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class PreferenceDataDatabase extends RoomDatabase {

    /* renamed from: q */
    public static final String f87247q = "com.urbanairship.databases";

    /* renamed from: r */
    public static final String f87248r = "ua_preferences.db";

    /* renamed from: s */
    public static final String f87249s = "preferences";

    /* renamed from: t */
    public static final String f87250t = "preferences_new";

    /* renamed from: u */
    public static final String f87251u = "_id";

    /* renamed from: v */
    public static final String f87252v = "value";

    /* renamed from: w */
    public static final C20343b f87253w = new C35439a(1, 2);

    /* renamed from: com.urbanairship.PreferenceDataDatabase$a */
    public class C35439a extends C20343b {
        public C35439a(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo17636a(C20466f fVar) {
            fVar.mo60782s0("CREATE TABLE preferences_new (_id TEXT PRIMARY KEY NOT NULL, value TEXT);");
            fVar.mo60782s0("INSERT INTO preferences_new (_id, value) SELECT _id, value FROM preferences");
            fVar.mo60782s0("DROP TABLE preferences");
            fVar.mo60782s0("ALTER TABLE preferences_new RENAME TO preferences");
        }
    }

    /* renamed from: Q */
    public static PreferenceDataDatabase m146150Q(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions) {
        return C20366s1.m95111a(context, PreferenceDataDatabase.class, new File(new File(C17318d.m79730m(context), "com.urbanairship.databases"), airshipConfigOptions.f87128a + C32920e.f79928l + f87248r).getAbsolutePath()).mo60923c(f87253w).mo60936p().mo60926f();
    }

    @C0344h1
    /* renamed from: R */
    public static PreferenceDataDatabase m146151R(@C0359n0 Context context) {
        return C20366s1.m95113c(context, PreferenceDataDatabase.class).mo60925e().mo60926f();
    }

    /* renamed from: S */
    public boolean mo106198S(@C0359n0 Context context) {
        if (mo60913s().getDatabaseName() == null || context.getDatabasePath(mo60913s().getDatabaseName()).exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public abstract C36066s mo106199T();
}
