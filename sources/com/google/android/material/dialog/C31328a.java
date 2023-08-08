package com.google.android.material.dialog;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.dialog.a */
public class C31328a implements View.OnTouchListener {
    @C0359n0

    /* renamed from: a */
    public final Dialog f75500a;

    /* renamed from: b */
    public final int f75501b;

    /* renamed from: c */
    public final int f75502c;

    /* renamed from: d */
    public final int f75503d;

    public C31328a(@C0359n0 Dialog dialog, @C0359n0 Rect rect) {
        this.f75500a = dialog;
        this.f75501b = rect.left;
        this.f75502c = rect.top;
        this.f75503d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(@C0359n0 View view, @C0359n0 MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f75501b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f75502c + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f75503d;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f75500a.onTouchEvent(obtain);
    }
}
