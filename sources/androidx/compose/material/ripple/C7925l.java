package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.material.ripple.l */
public final class C7925l extends RippleDrawable {
    @C12579k

    /* renamed from: e */
    public static final C7926a f19049e = new C7926a((DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: f */
    public static Method f19050f;

    /* renamed from: g */
    public static boolean f19051g;

    /* renamed from: a */
    public final boolean f19052a;
    @C12580l

    /* renamed from: b */
    public C15240j2 f19053b;
    @C12580l

    /* renamed from: c */
    public Integer f19054c;

    /* renamed from: d */
    public boolean f19055d;

    /* renamed from: androidx.compose.material.ripple.l$a */
    public static final class C7926a {
        public /* synthetic */ C7926a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C7926a() {
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.compose.material.ripple.l$b */
    public static final class C7927b {
        @C12579k

        /* renamed from: a */
        public static final C7927b f19056a = new C7927b();

        @C0373u
        /* renamed from: a */
        public final void mo11072a(@C12579k RippleDrawable rippleDrawable, int i) {
            Intrinsics.checkNotNullParameter(rippleDrawable, "ripple");
            rippleDrawable.setRadius(i);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7925l(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1 = 0
            if (r5 == 0) goto L_0x0010
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            goto L_0x0011
        L_0x0010:
            r2 = r1
        L_0x0011:
            r4.<init>(r0, r1, r2)
            r4.f19052a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.C7925l.<init>(boolean):void");
    }

    /* renamed from: a */
    public final long mo11067a(long j, float f) {
        if (Build.VERSION.SDK_INT < 28) {
            f *= (float) 2;
        }
        return C15240j2.m66080w(j, C11479u.m44310A(f, 1.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    /* renamed from: b */
    public final void mo11068b(long j, float f) {
        boolean z;
        long a = mo11067a(j, f);
        C15240j2 j2Var = this.f19053b;
        if (j2Var == null) {
            z = false;
        } else {
            z = C15240j2.m66082y(j2Var.mo42833M(), a);
        }
        if (!z) {
            this.f19053b = C15240j2.m66071n(a);
            setColor(ColorStateList.valueOf(C15258l2.m66193r(a)));
        }
    }

    /* renamed from: c */
    public final void mo11069c(int i) {
        Integer num = this.f19054c;
        if (num == null || num.intValue() != i) {
            this.f19054c = Integer.valueOf(i);
            C7927b.f19056a.mo11072a(this, i);
        }
    }

    @C12579k
    public Rect getDirtyBounds() {
        if (!this.f19052a) {
            this.f19055d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        Intrinsics.checkNotNullExpressionValue(dirtyBounds, "super.getDirtyBounds()");
        this.f19055d = false;
        return dirtyBounds;
    }

    public boolean isProjected() {
        return this.f19055d;
    }
}
