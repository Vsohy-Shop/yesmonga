package com.bumptech.glide.provider;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.provider.b */
public final class C22546b {

    /* renamed from: a */
    public final List<ImageHeaderParser> f57761a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo66674a(@C0359n0 ImageHeaderParser imageHeaderParser) {
        this.f57761a.add(imageHeaderParser);
    }

    @C0359n0
    /* renamed from: b */
    public synchronized List<ImageHeaderParser> mo66675b() {
        return this.f57761a;
    }
}
