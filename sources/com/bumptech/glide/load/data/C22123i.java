package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0359n0;
import com.carrefour.fid.android.shared.constant.C28515a1;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.i */
public class C22123i extends C22129l<ParcelFileDescriptor> {
    public C22123i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @C0359n0
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo65784a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: g */
    public void mo65785c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* renamed from: h */
    public ParcelFileDescriptor mo65786f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, C28515a1.f68703k);
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
