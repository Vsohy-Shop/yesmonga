package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.content.res.C17455f;
import androidx.core.provider.C17866h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.core.provider.e */
public class C17857e {

    /* renamed from: a */
    public static final Comparator<byte[]> f46226a = new C17856d();

    @C0376v0(16)
    /* renamed from: androidx.core.provider.e$a */
    public static class C17858a {
        @C0373u
        /* renamed from: a */
        public static Cursor m81351a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    public static List<byte[]> m81344b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m81345c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static List<List<byte[]>> m81346d(C17859f fVar, Resources resources) {
        if (fVar.mo52266b() != null) {
            return fVar.mo52266b();
        }
        return C17455f.m80137c(resources, fVar.mo52267c());
    }

    @C0359n0
    /* renamed from: e */
    public static C17866h.C17868b m81347e(@C0359n0 Context context, @C0359n0 C17859f fVar, @C0363p0 CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo f = m81348f(context.getPackageManager(), fVar, context.getResources());
        if (f == null) {
            return C17866h.C17868b.m81380a(1, (C17866h.C17869c[]) null);
        }
        return C17866h.C17868b.m81380a(0, m81350h(context, fVar, f.authority, cancellationSignal));
    }

    @C0363p0
    @C0344h1
    /* renamed from: f */
    public static ProviderInfo m81348f(@C0359n0 PackageManager packageManager, @C0359n0 C17859f fVar, @C0363p0 Resources resources) throws PackageManager.NameNotFoundException {
        String f = fVar.mo52270f();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(f, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + f);
        } else if (resolveContentProvider.packageName.equals(fVar.mo52271g())) {
            List<byte[]> b = m81344b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b, f46226a);
            List<List<byte[]>> d = m81346d(fVar, resources);
            for (int i = 0; i < d.size(); i++) {
                ArrayList arrayList = new ArrayList(d.get(i));
                Collections.sort(arrayList, f46226a);
                if (m81345c(b, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + f + ", but package was not " + fVar.mo52271g());
        }
    }

    /* renamed from: g */
    public static /* synthetic */ int m81349g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    @C0344h1
    @C0359n0
    /* renamed from: h */
    public static C17866h.C17869c[] m81350h(Context context, C17859f fVar, String str, CancellationSignal cancellationSignal) {
        int i;
        int i2;
        int i3;
        Uri uri;
        int i4;
        boolean z;
        int i5;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i6 = 0;
            cursor = C17858a.m81351a(context.getContentResolver(), build, new String[]{"_id", C17866h.C17867a.f46252a, C17866h.C17867a.f46253b, C17866h.C17867a.f46254c, C17866h.C17867a.f46255d, C17866h.C17867a.f46256e, C17866h.C17867a.f46257f}, "query = ?", new String[]{fVar.mo52272h()}, (String) null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex(C17866h.C17867a.f46257f);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex(C17866h.C17867a.f46252a);
                int columnIndex4 = cursor.getColumnIndex(C17866h.C17867a.f46253b);
                int columnIndex5 = cursor.getColumnIndex(C17866h.C17867a.f46255d);
                int columnIndex6 = cursor.getColumnIndex(C17866h.C17867a.f46256e);
                while (cursor.moveToNext()) {
                    if (columnIndex != -1) {
                        i = cursor.getInt(columnIndex);
                    } else {
                        i = i6;
                    }
                    if (columnIndex4 != -1) {
                        i2 = cursor.getInt(columnIndex4);
                    } else {
                        i2 = i6;
                    }
                    if (columnIndex3 == -1) {
                        i3 = i;
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i3 = i;
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    if (columnIndex5 != -1) {
                        i4 = cursor.getInt(columnIndex5);
                    } else {
                        i4 = 400;
                    }
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i5 = i3;
                        z = false;
                    } else {
                        i5 = i3;
                        z = true;
                    }
                    arrayList2.add(C17866h.C17869c.m81383a(uri, i2, i4, z, i5));
                    i6 = 0;
                }
                arrayList = arrayList2;
            }
            return (C17866h.C17869c[]) arrayList.toArray(new C17866h.C17869c[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
