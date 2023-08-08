package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource;
import androidx.room.C20295e0;
import androidx.room.C20400v1;
import androidx.room.RoomDatabase;
import androidx.sqlite.p031db.C20489i;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.paging.a */
public abstract class C20355a<T> extends PositionalDataSource<T> {

    /* renamed from: a */
    public final C20400v1 f52513a;

    /* renamed from: b */
    public final String f52514b;

    /* renamed from: c */
    public final String f52515c;

    /* renamed from: d */
    public final RoomDatabase f52516d;

    /* renamed from: e */
    public final C20295e0.C20299c f52517e;

    /* renamed from: f */
    public final boolean f52518f;

    /* renamed from: g */
    public final AtomicBoolean f52519g;

    /* renamed from: androidx.room.paging.a$a */
    public class C20356a extends C20295e0.C20299c {
        public C20356a(String[] strArr) {
            super(strArr);
        }

        /* renamed from: c */
        public void mo61047c(@C0359n0 Set<String> set) {
            C20355a.this.invalidate();
        }
    }

    public C20355a(@C0359n0 RoomDatabase roomDatabase, @C0359n0 C20489i iVar, boolean z, @C0359n0 String... strArr) {
        this(roomDatabase, C20400v1.m95184g(iVar), z, strArr);
    }

    @C0359n0
    /* renamed from: a */
    public abstract List<T> mo61142a(@C0359n0 Cursor cursor);

    /* renamed from: b */
    public int mo61143b() {
        mo61149h();
        C20400v1 d = C20400v1.m95183d(this.f52514b, this.f52513a.mo61232a());
        d.mo61236f(this.f52513a);
        Cursor H = this.f52516d.mo60895H(d);
        try {
            if (H.moveToFirst()) {
                return H.getInt(0);
            }
            H.close();
            d.release();
            return 0;
        } finally {
            H.close();
            d.release();
        }
    }

    /* renamed from: c */
    public final C20400v1 mo61144c(int i, int i2) {
        C20400v1 d = C20400v1.m95183d(this.f52515c, this.f52513a.mo61232a() + 2);
        d.mo61236f(this.f52513a);
        d.mo60790S2(d.mo61232a() - 1, (long) i2);
        d.mo60790S2(d.mo61232a(), (long) i);
        return d;
    }

    /* renamed from: d */
    public boolean mo61145d() {
        mo61149h();
        this.f52516d.mo60912p().mo61027r();
        return C20355a.super.isInvalid();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61146e(@androidx.annotation.C0359n0 androidx.paging.PositionalDataSource.LoadInitialParams r7, @androidx.annotation.C0359n0 androidx.paging.PositionalDataSource.LoadInitialCallback<T> r8) {
        /*
            r6 = this;
            r6.mo61149h()
            java.util.List r0 = java.util.Collections.emptyList()
            androidx.room.RoomDatabase r1 = r6.f52516d
            r1.mo60905e()
            r1 = 0
            int r2 = r6.mo61143b()     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0035
            int r0 = computeInitialLoadPosition(r7, r2)     // Catch:{ all -> 0x004a }
            int r7 = computeInitialLoadSize(r7, r0, r2)     // Catch:{ all -> 0x004a }
            androidx.room.v1 r7 = r6.mo61144c(r0, r7)     // Catch:{ all -> 0x004a }
            androidx.room.RoomDatabase r3 = r6.f52516d     // Catch:{ all -> 0x0033 }
            android.database.Cursor r1 = r3.mo60895H(r7)     // Catch:{ all -> 0x0033 }
            java.util.List r3 = r6.mo61142a(r1)     // Catch:{ all -> 0x0033 }
            androidx.room.RoomDatabase r4 = r6.f52516d     // Catch:{ all -> 0x0033 }
            r4.mo60901O()     // Catch:{ all -> 0x0033 }
            r5 = r3
            r3 = r7
            r7 = r0
            r0 = r5
            goto L_0x0037
        L_0x0033:
            r8 = move-exception
            goto L_0x004c
        L_0x0035:
            r7 = 0
            r3 = r1
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            androidx.room.RoomDatabase r1 = r6.f52516d
            r1.mo60908k()
            if (r3 == 0) goto L_0x0046
            r3.release()
        L_0x0046:
            r8.onResult(r0, r7, r2)
            return
        L_0x004a:
            r8 = move-exception
            r7 = r1
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            androidx.room.RoomDatabase r0 = r6.f52516d
            r0.mo60908k()
            if (r7 == 0) goto L_0x005b
            r7.release()
        L_0x005b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.paging.C20355a.mo61146e(androidx.paging.PositionalDataSource$LoadInitialParams, androidx.paging.PositionalDataSource$LoadInitialCallback):void");
    }

    @C0359n0
    /* renamed from: f */
    public List<T> mo61147f(int i, int i2) {
        C20400v1 c = mo61144c(i, i2);
        if (this.f52518f) {
            this.f52516d.mo60905e();
            Cursor cursor = null;
            try {
                cursor = this.f52516d.mo60895H(c);
                List<T> a = mo61142a(cursor);
                this.f52516d.mo60901O();
                return a;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
                this.f52516d.mo60908k();
                c.release();
            }
        } else {
            Cursor H = this.f52516d.mo60895H(c);
            try {
                return mo61142a(H);
            } finally {
                H.close();
                c.release();
            }
        }
    }

    /* renamed from: g */
    public void mo61148g(@C0359n0 PositionalDataSource.LoadRangeParams loadRangeParams, @C0359n0 PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(mo61147f(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    /* renamed from: h */
    public final void mo61149h() {
        if (this.f52519g.compareAndSet(false, true)) {
            this.f52516d.mo60912p().mo61013c(this.f52517e);
        }
    }

    public C20355a(@C0359n0 RoomDatabase roomDatabase, @C0359n0 C20489i iVar, boolean z, boolean z2, @C0359n0 String... strArr) {
        this(roomDatabase, C20400v1.m95184g(iVar), z, z2, strArr);
    }

    public C20355a(@C0359n0 RoomDatabase roomDatabase, @C0359n0 C20400v1 v1Var, boolean z, @C0359n0 String... strArr) {
        this(roomDatabase, v1Var, z, true, strArr);
    }

    public C20355a(@C0359n0 RoomDatabase roomDatabase, @C0359n0 C20400v1 v1Var, boolean z, boolean z2, @C0359n0 String... strArr) {
        this.f52519g = new AtomicBoolean(false);
        this.f52516d = roomDatabase;
        this.f52513a = v1Var;
        this.f52518f = z;
        this.f52514b = "SELECT COUNT(*) FROM ( " + v1Var.mo61233b() + " )";
        this.f52515c = "SELECT * FROM ( " + v1Var.mo61233b() + " ) LIMIT ? OFFSET ?";
        this.f52517e = new C20356a(strArr);
        if (z2) {
            mo61149h();
        }
    }
}
