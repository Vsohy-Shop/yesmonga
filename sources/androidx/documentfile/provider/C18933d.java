package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;

@C0376v0(19)
/* renamed from: androidx.documentfile.provider.d */
public class C18933d extends C18930a {

    /* renamed from: c */
    public Context f48188c;

    /* renamed from: d */
    public Uri f48189d;

    public C18933d(@C0363p0 C18930a aVar, Context context, Uri uri) {
        super(aVar);
        this.f48188c = context;
        this.f48189d = uri;
    }

    /* renamed from: a */
    public boolean mo55724a() {
        return C18931b.m88527a(this.f48188c, this.f48189d);
    }

    /* renamed from: b */
    public boolean mo55725b() {
        return C18931b.m88528b(this.f48188c, this.f48189d);
    }

    /* renamed from: c */
    public C18930a mo55726c(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public C18930a mo55727d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public boolean mo55728e() {
        try {
            return DocumentsContract.deleteDocument(this.f48188c.getContentResolver(), this.f48189d);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    public boolean mo55729f() {
        return C18931b.m88530d(this.f48188c, this.f48189d);
    }

    @C0363p0
    /* renamed from: k */
    public String mo55731k() {
        return C18931b.m88532f(this.f48188c, this.f48189d);
    }

    @C0363p0
    /* renamed from: m */
    public String mo55733m() {
        return C18931b.m88534h(this.f48188c, this.f48189d);
    }

    /* renamed from: n */
    public Uri mo55734n() {
        return this.f48189d;
    }

    /* renamed from: o */
    public boolean mo55735o() {
        return C18931b.m88535i(this.f48188c, this.f48189d);
    }

    /* renamed from: q */
    public boolean mo55736q() {
        return C18931b.m88536j(this.f48188c, this.f48189d);
    }

    /* renamed from: r */
    public boolean mo55737r() {
        return C18931b.m88537k(this.f48188c, this.f48189d);
    }

    /* renamed from: s */
    public long mo55738s() {
        return C18931b.m88538l(this.f48188c, this.f48189d);
    }

    /* renamed from: t */
    public long mo55739t() {
        return C18931b.m88539m(this.f48188c, this.f48189d);
    }

    /* renamed from: u */
    public C18930a[] mo55740u() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: v */
    public boolean mo55741v(String str) {
        throw new UnsupportedOperationException();
    }
}
