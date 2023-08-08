package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.content.C17312b;
import androidx.core.p027os.C17781e;
import androidx.core.p027os.OperationCanceledException;
import androidx.loader.content.C19547c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: androidx.loader.content.b */
public class C19546b extends C19544a<Cursor> {

    /* renamed from: r */
    public final C19547c<Cursor>.a f49967r = new C19547c.C19548a();

    /* renamed from: s */
    public Uri f49968s;

    /* renamed from: t */
    public String[] f49969t;

    /* renamed from: u */
    public String f49970u;

    /* renamed from: v */
    public String[] f49971v;

    /* renamed from: w */
    public String f49972w;

    /* renamed from: x */
    public Cursor f49973x;

    /* renamed from: y */
    public C17781e f49974y;

    public C19546b(@C0359n0 Context context) {
        super(context);
    }

    /* renamed from: D */
    public void mo57774D() {
        super.mo57774D();
        synchronized (this) {
            C17781e eVar = this.f49974y;
            if (eVar != null) {
                eVar.mo52219a();
            }
        }
    }

    /* renamed from: N */
    public void mo57803f(Cursor cursor) {
        if (!mo57819l()) {
            Cursor cursor2 = this.f49973x;
            this.f49973x = cursor;
            if (mo57820m()) {
                super.mo57803f(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    @C0363p0
    /* renamed from: O */
    public String[] mo57791O() {
        return this.f49969t;
    }

    @C0363p0
    /* renamed from: P */
    public String mo57792P() {
        return this.f49970u;
    }

    @C0363p0
    /* renamed from: Q */
    public String[] mo57793Q() {
        return this.f49971v;
    }

    @C0363p0
    /* renamed from: R */
    public String mo57794R() {
        return this.f49972w;
    }

    @C0359n0
    /* renamed from: S */
    public Uri mo57795S() {
        return this.f49968s;
    }

    /* renamed from: T */
    public Cursor mo57779I() {
        Cursor a;
        synchronized (this) {
            if (!mo57778H()) {
                this.f49974y = new C17781e();
            } else {
                throw new OperationCanceledException();
            }
        }
        try {
            a = C17312b.m79712a(mo57816i().getContentResolver(), this.f49968s, this.f49969t, this.f49970u, this.f49971v, this.f49972w, this.f49974y);
            if (a != null) {
                a.getCount();
                a.registerContentObserver(this.f49967r);
            }
            synchronized (this) {
                this.f49974y = null;
            }
            return a;
        } catch (RuntimeException e) {
            a.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.f49974y = null;
                throw th;
            }
        }
    }

    /* renamed from: U */
    public void mo57780J(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: V */
    public void mo57798V(@C0363p0 String[] strArr) {
        this.f49969t = strArr;
    }

    /* renamed from: W */
    public void mo57799W(@C0363p0 String str) {
        this.f49970u = str;
    }

    /* renamed from: X */
    public void mo57800X(@C0363p0 String[] strArr) {
        this.f49971v = strArr;
    }

    /* renamed from: Y */
    public void mo57801Y(@C0363p0 String str) {
        this.f49972w = str;
    }

    /* renamed from: Z */
    public void mo57802Z(@C0359n0 Uri uri) {
        this.f49968s = uri;
    }

    @Deprecated
    /* renamed from: g */
    public void mo57784g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo57784g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f49968s);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f49969t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f49970u);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f49971v));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f49972w);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f49973x);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f49982h);
    }

    /* renamed from: r */
    public void mo57804r() {
        super.mo57804r();
        mo57806t();
        Cursor cursor = this.f49973x;
        if (cursor != null && !cursor.isClosed()) {
            this.f49973x.close();
        }
        this.f49973x = null;
    }

    /* renamed from: s */
    public void mo57805s() {
        Cursor cursor = this.f49973x;
        if (cursor != null) {
            mo57803f(cursor);
        }
        if (mo57807A() || this.f49973x == null) {
            mo57815h();
        }
    }

    /* renamed from: t */
    public void mo57806t() {
        mo57811b();
    }

    public C19546b(@C0359n0 Context context, @C0359n0 Uri uri, @C0363p0 String[] strArr, @C0363p0 String str, @C0363p0 String[] strArr2, @C0363p0 String str2) {
        super(context);
        this.f49968s = uri;
        this.f49969t = strArr;
        this.f49970u = str;
        this.f49971v = strArr2;
        this.f49972w = str2;
    }
}
