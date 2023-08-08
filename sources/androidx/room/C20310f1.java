package androidx.room;

import androidx.sqlite.p031db.C20488h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.room.f1 */
public final class C20310f1 implements C20488h {
    @C12579k

    /* renamed from: a */
    public final List<Object> f52443a = new ArrayList();

    /* renamed from: G0 */
    public void mo60788G0(int i, double d) {
        mo61066b(i, Double.valueOf(d));
    }

    /* renamed from: O3 */
    public void mo60789O3() {
        this.f52443a.clear();
    }

    /* renamed from: S2 */
    public void mo60790S2(int i, long j) {
        mo61066b(i, Long.valueOf(j));
    }

    @C12579k
    /* renamed from: a */
    public final List<Object> mo61065a() {
        return this.f52443a;
    }

    /* renamed from: a3 */
    public void mo60791a3(int i, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "value");
        mo61066b(i, bArr);
    }

    /* renamed from: b */
    public final void mo61066b(int i, Object obj) {
        int size;
        int i2 = i - 1;
        if (i2 >= this.f52443a.size() && (size = this.f52443a.size()) <= i2) {
            while (true) {
                this.f52443a.add((Object) null);
                if (size == i2) {
                    break;
                }
                size++;
            }
        }
        this.f52443a.set(i2, obj);
    }

    public void close() {
    }

    /* renamed from: u3 */
    public void mo60800u3(int i) {
        mo61066b(i, (Object) null);
    }

    /* renamed from: v2 */
    public void mo60801v2(int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        mo61066b(i, str);
    }
}
