package com.bumptech.glide.load.model;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22098a;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.util.C22614a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.model.c */
public class C22292c implements C22098a<ByteBuffer> {

    /* renamed from: a */
    public static final String f57292a = "ByteBufferEncoder";

    /* renamed from: c */
    public boolean mo65770a(@C0359n0 ByteBuffer byteBuffer, @C0359n0 File file, @C0359n0 C22277f fVar) {
        try {
            C22614a.m102579f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
