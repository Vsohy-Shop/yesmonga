package com.skydoves.landscapist.palette;

import android.util.LruCache;
import androidx.palette.graphics.C19868b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/util/LruCache;", "", "Landroidx/palette/graphics/b;", "a", "()Landroid/util/LruCache;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class BitmapPalette$Companion$cache$2 extends Lambda implements C11289a<LruCache<Object, C19868b>> {

    /* renamed from: f */
    public static final BitmapPalette$Companion$cache$2 f86843f = new BitmapPalette$Companion$cache$2();

    public BitmapPalette$Companion$cache$2() {
        super(0);
    }

    @C12579k
    /* renamed from: a */
    public final LruCache<Object, C19868b> invoke() {
        return new LruCache<>(20);
    }
}
