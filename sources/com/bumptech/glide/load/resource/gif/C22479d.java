package com.bumptech.glide.load.resource.gif;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22279h;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.util.C22614a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.gif.d */
public class C22479d implements C22279h<C22477c> {

    /* renamed from: a */
    public static final String f57633a = "GifEncoder";

    @C0359n0
    /* renamed from: b */
    public EncodeStrategy mo66238b(@C0359n0 C22277f fVar) {
        return EncodeStrategy.SOURCE;
    }

    /* renamed from: c */
    public boolean mo65770a(@C0359n0 C22270s<C22477c> sVar, @C0359n0 File file, @C0359n0 C22277f fVar) {
        try {
            C22614a.m102579f(sVar.get().mo66502f(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
