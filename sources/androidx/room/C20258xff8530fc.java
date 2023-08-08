package androidx.room;

import androidx.sqlite.p031db.C20466f;
import kotlin.C11076d0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 7, 1}, mo22520xi = 48)
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1 */
public /* synthetic */ class C20258xff8530fc extends MutablePropertyReference1Impl {

    /* renamed from: a */
    public static final C20258xff8530fc f52245a = new C20258xff8530fc();

    public C20258xff8530fc() {
        super(C20466f.class, "version", "getVersion()I", 0);
    }

    /* renamed from: K1 */
    public void mo22735K1(@C12580l Object obj, @C12580l Object obj2) {
        ((C20466f) obj).mo60785u2(((Number) obj2).intValue());
    }

    @C12580l
    public Object get(@C12580l Object obj) {
        return Integer.valueOf(((C20466f) obj).getVersion());
    }
}
