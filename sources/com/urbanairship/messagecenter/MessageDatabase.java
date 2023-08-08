package com.urbanairship.messagecenter;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.content.C17318d;
import androidx.room.C20316h;
import androidx.room.C20366s1;
import androidx.room.RoomDatabase;
import androidx.room.migration.C20343b;
import androidx.sqlite.p031db.framework.C20477e;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.p005db.C9105b;
import java.io.File;

@C20316h(entities = {C9383m.class}, version = 5)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class MessageDatabase extends RoomDatabase {

    /* renamed from: A */
    public static final String f25507A = "unread_orig";

    /* renamed from: B */
    public static final String f25508B = "deleted";

    /* renamed from: C */
    public static final String f25509C = "timestamp";

    /* renamed from: D */
    public static final String f25510D = "raw_message_object";

    /* renamed from: E */
    public static final String f25511E = "expiration_timestamp";

    /* renamed from: F */
    public static final String f25512F = "com.urbanairship.databases";

    /* renamed from: G */
    public static final C20343b f25513G = new C9382l(1, 5);

    /* renamed from: H */
    public static final C20343b f25514H = new C9382l(2, 5);

    /* renamed from: I */
    public static final C20343b f25515I = new C9382l(3, 5);

    /* renamed from: J */
    public static final C20343b f25516J = new C9382l(4, 5);

    /* renamed from: q */
    public static final String f25517q = "ua_richpush.db";

    /* renamed from: r */
    public static final String f25518r = "richpush";

    /* renamed from: s */
    public static final String f25519s = "_id";

    /* renamed from: t */
    public static final String f25520t = "message_id";

    /* renamed from: u */
    public static final String f25521u = "message_url";

    /* renamed from: v */
    public static final String f25522v = "message_body_url";

    /* renamed from: w */
    public static final String f25523w = "message_read_url";

    /* renamed from: x */
    public static final String f25524x = "title";

    /* renamed from: y */
    public static final String f25525y = "extra";

    /* renamed from: z */
    public static final String f25526z = "unread";

    /* renamed from: Q */
    public static MessageDatabase m35119Q(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions) {
        String absolutePath = new File(new File(C17318d.m79730m(context), "com.urbanairship.databases"), airshipConfigOptions.f87128a + C32920e.f79928l + f25517q).getAbsolutePath();
        return C20366s1.m95111a(context, MessageDatabase.class, absolutePath).mo60937q(new C9105b.C9106a(new C20477e(), true)).mo60923c(f25513G, f25514H, f25515I, f25516J).mo60934n().mo60926f();
    }

    @C0344h1
    /* renamed from: R */
    public static MessageDatabase m35120R(@C0359n0 Context context) {
        return C20366s1.m95113c(context, MessageDatabase.class).mo60925e().mo60926f();
    }

    /* renamed from: S */
    public abstract C9378j mo18895S();
}
