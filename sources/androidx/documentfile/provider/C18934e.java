package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import java.util.ArrayList;

@C0376v0(21)
/* renamed from: androidx.documentfile.provider.e */
public class C18934e extends C18930a {

    /* renamed from: c */
    public Context f48190c;

    /* renamed from: d */
    public Uri f48191d;

    public C18934e(@C0363p0 C18930a aVar, Context context, Uri uri) {
        super(aVar);
        this.f48190c = context;
        this.f48191d = uri;
    }

    /* renamed from: w */
    public static void m88577w(@C0363p0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    @C0363p0
    /* renamed from: x */
    public static Uri m88578x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo55724a() {
        return C18931b.m88527a(this.f48190c, this.f48191d);
    }

    /* renamed from: b */
    public boolean mo55725b() {
        return C18931b.m88528b(this.f48190c, this.f48191d);
    }

    @C0363p0
    /* renamed from: c */
    public C18930a mo55726c(String str) {
        Uri x = m88578x(this.f48190c, this.f48191d, "vnd.android.document/directory", str);
        if (x != null) {
            return new C18934e(this, this.f48190c, x);
        }
        return null;
    }

    @C0363p0
    /* renamed from: d */
    public C18930a mo55727d(String str, String str2) {
        Uri x = m88578x(this.f48190c, this.f48191d, str, str2);
        if (x != null) {
            return new C18934e(this, this.f48190c, x);
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo55728e() {
        try {
            return DocumentsContract.deleteDocument(this.f48190c.getContentResolver(), this.f48191d);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public boolean mo55729f() {
        return C18931b.m88530d(this.f48190c, this.f48191d);
    }

    @C0363p0
    /* renamed from: k */
    public String mo55731k() {
        return C18931b.m88532f(this.f48190c, this.f48191d);
    }

    @C0363p0
    /* renamed from: m */
    public String mo55733m() {
        return C18931b.m88534h(this.f48190c, this.f48191d);
    }

    /* renamed from: n */
    public Uri mo55734n() {
        return this.f48191d;
    }

    /* renamed from: o */
    public boolean mo55735o() {
        return C18931b.m88535i(this.f48190c, this.f48191d);
    }

    /* renamed from: q */
    public boolean mo55736q() {
        return C18931b.m88536j(this.f48190c, this.f48191d);
    }

    /* renamed from: r */
    public boolean mo55737r() {
        return C18931b.m88537k(this.f48190c, this.f48191d);
    }

    /* renamed from: s */
    public long mo55738s() {
        return C18931b.m88538l(this.f48190c, this.f48191d);
    }

    /* renamed from: t */
    public long mo55739t() {
        return C18931b.m88539m(this.f48190c, this.f48191d);
    }

    /* renamed from: u */
    public C18930a[] mo55740u() {
        ContentResolver contentResolver = this.f48190c.getContentResolver();
        Uri uri = this.f48191d;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            while (cursor.moveToNext()) {
                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f48191d, cursor.getString(0)));
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(e);
        } catch (Throwable th) {
            m88577w((AutoCloseable) null);
            throw th;
        }
        m88577w(cursor);
        Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        C18930a[] aVarArr = new C18930a[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            aVarArr[i] = new C18934e(this, this.f48190c, uriArr[i]);
        }
        return aVarArr;
    }

    /* renamed from: v */
    public boolean mo55741v(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.f48190c.getContentResolver(), this.f48191d, str);
            if (renameDocument != null) {
                this.f48191d = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
