package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.C0387a;

public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a */
    public final C0754o f1928a;

    public AppCompatSeekBar(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1928a.mo3546h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1928a.mo3550l();
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1928a.mo3545g(canvas);
    }

    public AppCompatSeekBar(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.seekBarStyle);
    }

    public AppCompatSeekBar(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0705c1.m3421a(this, getContext());
        C0754o oVar = new C0754o(this);
        this.f1928a = oVar;
        oVar.mo3534c(attributeSet, i);
    }
}
