package androidx.sqlite.p031db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.p031db.C20492k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.sqlite.db.framework.g */
public final class C20479g extends C20478f implements C20492k {
    @C12579k

    /* renamed from: b */
    public final SQLiteStatement f52795b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20479g(@C12579k SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        Intrinsics.checkNotNullParameter(sQLiteStatement, "delegate");
        this.f52795b = sQLiteStatement;
    }

    public void execute() {
        this.f52795b.execute();
    }

    /* renamed from: h2 */
    public long mo60797h2() {
        return this.f52795b.executeInsert();
    }

    @C12580l
    /* renamed from: m1 */
    public String mo60798m1() {
        return this.f52795b.simpleQueryForString();
    }

    /* renamed from: q2 */
    public long mo60799q2() {
        return this.f52795b.simpleQueryForLong();
    }

    /* renamed from: y0 */
    public int mo60802y0() {
        return this.f52795b.executeUpdateDelete();
    }
}
