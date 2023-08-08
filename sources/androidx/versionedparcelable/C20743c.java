package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.versionedparcelable.c */
public class C20743c {

    /* renamed from: a */
    public static final String f53590a = "a";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static <T extends C20749g> T m96394a(InputStream inputStream) {
        return new C20746f(inputStream, (OutputStream) null).mo62208g0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public static <T extends C20749g> T m96395b(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).mo62131a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @C0363p0
    /* renamed from: c */
    public static <T extends C20749g> T m96396c(@C0359n0 Bundle bundle, @C0359n0 String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C20743c.class.getClassLoader());
            return m96395b(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @C0363p0
    /* renamed from: d */
    public static <T extends C20749g> List<T> m96397d(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(C20743c.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList("a").iterator();
            while (it.hasNext()) {
                arrayList.add(m96395b((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m96398e(@C0359n0 Bundle bundle, @C0359n0 String str, @C0363p0 C20749g gVar) {
        if (gVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", m96401h(gVar));
            bundle.putParcelable(str, bundle2);
        }
    }

    /* renamed from: f */
    public static void m96399f(@C0359n0 Bundle bundle, @C0359n0 String str, @C0359n0 List<? extends C20749g> list) {
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (C20749g h : list) {
            arrayList.add(m96401h(h));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: g */
    public static void m96400g(C20749g gVar, OutputStream outputStream) {
        C20746f fVar = new C20746f((InputStream) null, outputStream);
        fVar.mo62224l1(gVar);
        fVar.mo62190a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: h */
    public static Parcelable m96401h(C20749g gVar) {
        return new ParcelImpl(gVar);
    }
}
