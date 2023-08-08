package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import androidx.annotation.C0359n0;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.h */
public class C22122h extends C22112b<AssetFileDescriptor> {
    public C22122h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @C0359n0
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo65784a() {
        return AssetFileDescriptor.class;
    }

    /* renamed from: g */
    public void mo65790c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* renamed from: h */
    public AssetFileDescriptor mo65794f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
