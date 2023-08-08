package androidx.sqlite.p031db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.p031db.C20488h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.sqlite.db.framework.f */
public class C20478f implements C20488h {
    @C12579k

    /* renamed from: a */
    public final SQLiteProgram f52794a;

    public C20478f(@C12579k SQLiteProgram sQLiteProgram) {
        Intrinsics.checkNotNullParameter(sQLiteProgram, "delegate");
        this.f52794a = sQLiteProgram;
    }

    /* renamed from: G0 */
    public void mo60788G0(int i, double d) {
        this.f52794a.bindDouble(i, d);
    }

    /* renamed from: O3 */
    public void mo60789O3() {
        this.f52794a.clearBindings();
    }

    /* renamed from: S2 */
    public void mo60790S2(int i, long j) {
        this.f52794a.bindLong(i, j);
    }

    /* renamed from: a3 */
    public void mo60791a3(int i, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "value");
        this.f52794a.bindBlob(i, bArr);
    }

    public void close() {
        this.f52794a.close();
    }

    /* renamed from: u3 */
    public void mo60800u3(int i) {
        this.f52794a.bindNull(i);
    }

    /* renamed from: v2 */
    public void mo60801v2(int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f52794a.bindString(i, str);
    }
}
