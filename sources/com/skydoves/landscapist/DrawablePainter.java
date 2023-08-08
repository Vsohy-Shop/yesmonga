package com.skydoves.landscapist;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15208f0;
import androidx.compose.p004ui.graphics.C15214g0;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8616s1;
import androidx.compose.runtime.C8700z0;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class DrawablePainter extends Painter implements C8616s1 {
    @C12579k

    /* renamed from: g */
    public final Drawable f86772g;
    @C12579k

    /* renamed from: v */
    public final C8700z0 f86773v = C8539f2.m30981g(0, (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: w */
    public final C11677z f86774w = C10864b0.m38748c(new DrawablePainter$callback$2(this));

    /* renamed from: com.skydoves.landscapist.DrawablePainter$a */
    public /* synthetic */ class C35311a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DrawablePainter(@C12579k Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f86772g = drawable;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    /* renamed from: a */
    public boolean mo42942a(float f) {
        this.f86772g.setAlpha(C11479u.m44334I(C11409d.m43851L0(f * ((float) 255)), 0, 255));
        return true;
    }

    /* renamed from: b */
    public boolean mo42943b(@C12580l C15249k2 k2Var) {
        this.f86772g.setColorFilter(k2Var == null ? null : C15214g0.m65963d(k2Var));
        return true;
    }

    /* renamed from: c */
    public boolean mo42944c(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Drawable drawable = this.f86772g;
        int i = C35311a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i2);
    }

    /* renamed from: d */
    public void mo8797d() {
        this.f86772g.setCallback(mo105746q());
        this.f86772g.setVisible(true, true);
        Drawable drawable = this.f86772g;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    /* renamed from: e */
    public void mo8799e() {
        mo8800g();
    }

    /* renamed from: g */
    public void mo8800g() {
        Drawable drawable = this.f86772g;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        this.f86772g.setVisible(false, false);
        this.f86772g.setCallback((Drawable.Callback) null);
    }

    /* renamed from: l */
    public long mo42949l() {
        if (this.f86772g.getIntrinsicWidth() < 0 || this.f86772g.getIntrinsicHeight() < 0) {
            return C15104m.f37280b.mo42316a();
        }
        return C15106n.m65033a((float) this.f86772g.getIntrinsicWidth(), (float) this.f86772g.getIntrinsicHeight());
    }

    /* renamed from: n */
    public void mo42951n(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        C15118b2 c = eVar.mo42683q5().mo42705c();
        mo105748s();
        mo105747r().setBounds(0, 0, C11409d.m43851L0(C15104m.m65023t(eVar.mo42718b())), C11409d.m43851L0(C15104m.m65016m(eVar.mo42718b())));
        try {
            c.mo42422E();
            mo105747r().draw(C15208f0.m65929d(c));
        } finally {
            c.mo42443q();
        }
    }

    /* renamed from: q */
    public final Drawable.Callback mo105746q() {
        return (Drawable.Callback) this.f86774w.getValue();
    }

    @C12579k
    /* renamed from: r */
    public final Drawable mo105747r() {
        return this.f86772g;
    }

    /* renamed from: s */
    public final int mo105748s() {
        return ((Number) this.f86773v.getValue()).intValue();
    }

    /* renamed from: t */
    public final void mo105749t(int i) {
        this.f86773v.setValue(Integer.valueOf(i));
    }
}
