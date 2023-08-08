package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;

@Deprecated
/* renamed from: com.bumptech.glide.load.resource.bitmap.m0 */
public class C22428m0 extends VideoDecoder<ParcelFileDescriptor> {
    public C22428m0(Context context) {
        this(C22038b.m100356e(context).mo65480h());
    }

    public C22428m0(C22162e eVar) {
        super(eVar, new VideoDecoder.C22391g());
    }
}
