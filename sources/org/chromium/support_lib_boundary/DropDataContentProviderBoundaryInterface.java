package org.chromium.support_lib_boundary;

import android.content.ContentProvider;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.FileNotFoundException;

public interface DropDataContentProviderBoundaryInterface {
    Uri cache(byte[] bArr, String str, String str2);

    Bundle call(@C0359n0 String str, @C0363p0 String str2, @C0363p0 Bundle bundle);

    String[] getStreamTypes(@C0359n0 Uri uri, @C0359n0 String str);

    String getType(@C0359n0 Uri uri);

    boolean onCreate();

    void onDragEnd(boolean z);

    ParcelFileDescriptor openFile(@C0359n0 ContentProvider contentProvider, @C0359n0 Uri uri) throws FileNotFoundException;

    Cursor query(@C0359n0 Uri uri, @C0363p0 String[] strArr, @C0363p0 String str, @C0363p0 String[] strArr2, @C0363p0 String str2);

    void setClearCachedDataIntervalMs(int i);
}
