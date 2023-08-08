package com.skydoves.landscapist;

import android.os.Handler;
import android.os.Looper;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroid/os/Handler;", "a", "()Landroid/os/Handler;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class DrawablePainterKt$MAIN_HANDLER$2 extends Lambda implements C11289a<Handler> {

    /* renamed from: f */
    public static final DrawablePainterKt$MAIN_HANDLER$2 f86777f = new DrawablePainterKt$MAIN_HANDLER$2();

    public DrawablePainterKt$MAIN_HANDLER$2() {
        super(0);
    }

    @C12579k
    /* renamed from: a */
    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
