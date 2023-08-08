package androidx.room;

import androidx.annotation.RestrictTo;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.t1 */
public final class C20369t1 {
    @C12579k

    /* renamed from: a */
    public static final C20369t1 f52536a = new C20369t1();
    @C12579k

    /* renamed from: b */
    public static final String f52537b = "room_master_table";
    @C12579k

    /* renamed from: c */
    public static final String f52538c = "room_master_table";
    @C12579k

    /* renamed from: d */
    public static final String f52539d = "id";
    @C12579k

    /* renamed from: e */
    public static final String f52540e = "identity_hash";
    @C12579k

    /* renamed from: f */
    public static final String f52541f = "42";
    @C12579k

    /* renamed from: g */
    public static final String f52542g = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";
    @C12579k

    /* renamed from: h */
    public static final String f52543h = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    @C12579k
    @C11384m
    /* renamed from: a */
    public static final String m95114a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C9874a.f27075t);
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
