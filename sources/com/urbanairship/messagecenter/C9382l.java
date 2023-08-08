package com.urbanairship.messagecenter;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.sqlite.p031db.C20466f;
import com.carrefour.fid.android.core.extension.C36306e;
import com.urbanairship.p005db.C9104a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.messagecenter.l */
public class C9382l extends C9104a {

    /* renamed from: c */
    public static final String f25659c = "richpush_new";

    /* renamed from: d */
    public static final String f25660d = "index_richpush_message_id";

    public C9382l(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: b */
    public void mo18109b(@C0359n0 C20466f fVar) {
        mo19038d(fVar, f25659c);
        fVar.mo60782s0("DELETE FROM richpush WHERE _id NOT IN (SELECT MIN(_id) FROM richpush GROUP BY message_id)");
        fVar.mo60782s0("UPDATE richpush SET unread_orig = 0 WHERE unread_orig IS NULL");
        fVar.mo60782s0("UPDATE richpush SET unread = 0 WHERE unread IS NULL");
        fVar.mo60782s0("UPDATE richpush SET deleted = 0 WHERE deleted IS NULL");
        fVar.mo60782s0("INSERT INTO richpush_new (_id, message_id, message_url, message_body_url, message_read_url, title, extra, unread, unread_orig, deleted, timestamp, raw_message_object, expiration_timestamp) SELECT _id, message_id, message_url, message_body_url, message_read_url, title, extra, unread, unread_orig, deleted, timestamp, raw_message_object, expiration_timestamp FROM richpush");
        mo19040f(fVar);
        mo19039e(fVar);
    }

    /* renamed from: c */
    public void mo18110c(@C0359n0 C20466f fVar, @C0359n0 Exception exc) {
        fVar.mo60782s0("DROP TABLE IF EXISTS richpush_new");
        fVar.mo60782s0("DROP TABLE IF EXISTS richpush");
        mo19038d(fVar, MessageDatabase.f25518r);
        mo19039e(fVar);
    }

    /* renamed from: d */
    public final void mo19038d(@C0359n0 C20466f fVar, @C0359n0 String str) {
        fVar.mo60782s0("CREATE TABLE " + str + C36306e.f89637a + "_id" + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " + "message_id" + " TEXT, " + "message_url" + " TEXT, " + "message_body_url" + " TEXT, " + "message_read_url" + " TEXT, " + "title" + " TEXT, " + "extra" + " TEXT, " + "unread" + " INTEGER NOT NULL, " + MessageDatabase.f25507A + " INTEGER NOT NULL, " + MessageDatabase.f25508B + " INTEGER NOT NULL, " + "timestamp" + " TEXT, " + MessageDatabase.f25510D + " TEXT, " + MessageDatabase.f25511E + " TEXT );");
    }

    /* renamed from: e */
    public final void mo19039e(@C0359n0 C20466f fVar) {
        fVar.mo60782s0("CREATE UNIQUE INDEX IF NOT EXISTS `index_richpush_message_id` ON `richpush` (`message_id`)");
    }

    /* renamed from: f */
    public final void mo19040f(@C0359n0 C20466f fVar) {
        fVar.mo60782s0("DROP TABLE richpush");
        fVar.mo60782s0("ALTER TABLE richpush_new RENAME TO richpush");
    }
}
