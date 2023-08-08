package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.C0359n0;
import com.carrefour.fid.android.shared.constant.C28515a1;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.a */
public final class C22111a extends C22129l<AssetFileDescriptor> {
    public C22111a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @C0359n0
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo65784a() {
        return AssetFileDescriptor.class;
    }

    /* renamed from: g */
    public void mo65785c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* renamed from: h */
    public AssetFileDescriptor mo65786f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, C28515a1.f68703k);
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
