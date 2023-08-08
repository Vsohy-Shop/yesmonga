package com.skydoves.landscapist;

import android.graphics.drawable.Drawable;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0007\n\u0002\b\u0003*\u0001\u0000\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"com/skydoves/landscapist/DrawablePainter$callback$2$a", "a", "()Lcom/skydoves/landscapist/DrawablePainter$callback$2$a;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class DrawablePainter$callback$2 extends Lambda implements C11289a<C35312a> {
    final /* synthetic */ DrawablePainter this$0;

    /* renamed from: com.skydoves.landscapist.DrawablePainter$callback$2$a */
    public static final class C35312a implements Drawable.Callback {

        /* renamed from: a */
        public final /* synthetic */ DrawablePainter f86775a;

        public C35312a(DrawablePainter drawablePainter) {
            this.f86775a = drawablePainter;
        }

        public void invalidateDrawable(@C12579k Drawable drawable) {
            Intrinsics.checkNotNullParameter(drawable, "d");
            DrawablePainter drawablePainter = this.f86775a;
            drawablePainter.mo105749t(drawablePainter.mo105748s() + 1);
        }

        public void scheduleDrawable(@C12579k Drawable drawable, @C12579k Runnable runnable, long j) {
            Intrinsics.checkNotNullParameter(drawable, "d");
            Intrinsics.checkNotNullParameter(runnable, "what");
            DrawablePainterKt.m145575b().postAtTime(runnable, j);
        }

        public void unscheduleDrawable(@C12579k Drawable drawable, @C12579k Runnable runnable) {
            Intrinsics.checkNotNullParameter(drawable, "d");
            Intrinsics.checkNotNullParameter(runnable, "what");
            DrawablePainterKt.m145575b().removeCallbacks(runnable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawablePainter$callback$2(DrawablePainter drawablePainter) {
        super(0);
        this.this$0 = drawablePainter;
    }

    @C12579k
    /* renamed from: a */
    public final C35312a invoke() {
        return new C35312a(this.this$0);
    }
}
