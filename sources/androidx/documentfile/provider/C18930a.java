package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.File;

/* renamed from: androidx.documentfile.provider.a */
public abstract class C18930a {

    /* renamed from: b */
    public static final String f48183b = "DocumentFile";
    @C0363p0

    /* renamed from: a */
    public final C18930a f48184a;

    public C18930a(@C0363p0 C18930a aVar) {
        this.f48184a = aVar;
    }

    @C0359n0
    /* renamed from: h */
    public static C18930a m88505h(@C0359n0 File file) {
        return new C18932c((C18930a) null, file);
    }

    @C0363p0
    /* renamed from: i */
    public static C18930a m88506i(@C0359n0 Context context, @C0359n0 Uri uri) {
        return new C18933d((C18930a) null, context, uri);
    }

    @C0363p0
    /* renamed from: j */
    public static C18930a m88507j(@C0359n0 Context context, @C0359n0 Uri uri) {
        return new C18934e((C18930a) null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    /* renamed from: p */
    public static boolean m88508p(@C0359n0 Context context, @C0363p0 Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    /* renamed from: a */
    public abstract boolean mo55724a();

    /* renamed from: b */
    public abstract boolean mo55725b();

    @C0363p0
    /* renamed from: c */
    public abstract C18930a mo55726c(@C0359n0 String str);

    @C0363p0
    /* renamed from: d */
    public abstract C18930a mo55727d(@C0359n0 String str, @C0359n0 String str2);

    /* renamed from: e */
    public abstract boolean mo55728e();

    /* renamed from: f */
    public abstract boolean mo55729f();

    @C0363p0
    /* renamed from: g */
    public C18930a mo55730g(@C0359n0 String str) {
        for (C18930a aVar : mo55740u()) {
            if (str.equals(aVar.mo55731k())) {
                return aVar;
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: k */
    public abstract String mo55731k();

    @C0363p0
    /* renamed from: l */
    public C18930a mo55732l() {
        return this.f48184a;
    }

    @C0363p0
    /* renamed from: m */
    public abstract String mo55733m();

    @C0359n0
    /* renamed from: n */
    public abstract Uri mo55734n();

    /* renamed from: o */
    public abstract boolean mo55735o();

    /* renamed from: q */
    public abstract boolean mo55736q();

    /* renamed from: r */
    public abstract boolean mo55737r();

    /* renamed from: s */
    public abstract long mo55738s();

    /* renamed from: t */
    public abstract long mo55739t();

    @C0359n0
    /* renamed from: u */
    public abstract C18930a[] mo55740u();

    /* renamed from: v */
    public abstract boolean mo55741v(@C0359n0 String str);
}
