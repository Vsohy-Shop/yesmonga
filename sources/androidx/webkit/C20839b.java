package androidx.webkit;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.C20912p1;
import java.io.FileNotFoundException;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.webkit.b */
public class C20839b extends ContentProvider {

    /* renamed from: a */
    public DropDataContentProviderBoundaryInterface f53900a;

    /* renamed from: a */
    public final DropDataContentProviderBoundaryInterface mo62572a() {
        if (this.f53900a == null) {
            DropDataContentProviderBoundaryInterface dropDataProvider = C20912p1.m96946d().getDropDataProvider();
            this.f53900a = dropDataProvider;
            dropDataProvider.onCreate();
        }
        return this.f53900a;
    }

    @C0363p0
    public Bundle call(@C0359n0 String str, @C0363p0 String str2, @C0363p0 Bundle bundle) {
        return mo62572a().call(str, str2, bundle);
    }

    public int delete(@C0359n0 Uri uri, @C0363p0 String str, @C0363p0 String[] strArr) {
        throw new UnsupportedOperationException("delete method is not supported.");
    }

    @C0363p0
    public String getType(@C0359n0 Uri uri) {
        return mo62572a().getType(uri);
    }

    @C0363p0
    public Uri insert(@C0359n0 Uri uri, @C0363p0 ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert method is not supported.");
    }

    public boolean onCreate() {
        return true;
    }

    @C0363p0
    public ParcelFileDescriptor openFile(@C0359n0 Uri uri, @C0359n0 String str) throws FileNotFoundException {
        return mo62572a().openFile(this, uri);
    }

    @C0363p0
    public Cursor query(@C0359n0 Uri uri, @C0363p0 String[] strArr, @C0363p0 String str, @C0363p0 String[] strArr2, @C0363p0 String str2) {
        return mo62572a().query(uri, strArr, str, strArr2, str2);
    }

    public int update(@C0359n0 Uri uri, @C0363p0 ContentValues contentValues, @C0363p0 String str, @C0363p0 String[] strArr) {
        throw new UnsupportedOperationException("update method is not supported.");
    }
}
