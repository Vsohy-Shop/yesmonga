package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import androidx.annotation.C0359n0;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.m */
public class C22130m extends C22112b<InputStream> {
    public C22130m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @C0359n0
    /* renamed from: a */
    public Class<InputStream> mo65784a() {
        return InputStream.class;
    }

    /* renamed from: g */
    public void mo65790c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: h */
    public InputStream mo65794f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
