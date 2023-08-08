package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.window.core.C20994d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.C10861c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20994d
/* renamed from: androidx.window.embedding.y */
public class C21029y extends C21013m {

    /* renamed from: a */
    public final int f54227a;

    /* renamed from: b */
    public final int f54228b;

    /* renamed from: c */
    public final float f54229c;

    /* renamed from: d */
    public final int f54230d;

    @C0376v0(30)
    /* renamed from: androidx.window.embedding.y$a */
    public static final class C21030a {
        @C12579k

        /* renamed from: a */
        public static final C21030a f54231a = new C21030a();

        @C12579k
        @C0373u
        /* renamed from: a */
        public final Rect mo62891a(@C12579k WindowMetrics windowMetrics) {
            Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
            Rect a = windowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(a, "windowMetrics.bounds");
            return a;
        }
    }

    @C10861c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.window.embedding.y$b */
    public @interface C21031b {
    }

    public C21029y() {
        this(0, 0, 0.0f, 0, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final boolean mo62886a(@C12579k WindowMetrics windowMetrics) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(windowMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect a = C21030a.f54231a.mo62891a(windowMetrics);
        if (this.f54227a == 0 || a.width() >= this.f54227a) {
            z = true;
        } else {
            z = false;
        }
        if (this.f54228b == 0 || Math.min(a.width(), a.height()) >= this.f54228b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final int mo62887b() {
        return this.f54230d;
    }

    /* renamed from: c */
    public final int mo62888c() {
        return this.f54228b;
    }

    /* renamed from: d */
    public final int mo62889d() {
        return this.f54227a;
    }

    /* renamed from: e */
    public final float mo62890e() {
        return this.f54229c;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21029y)) {
            return false;
        }
        C21029y yVar = (C21029y) obj;
        if (this.f54227a != yVar.f54227a || this.f54228b != yVar.f54228b) {
            return false;
        }
        if (this.f54229c == yVar.f54229c) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f54230d == yVar.f54230d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f54227a * 31) + this.f54228b) * 31) + Float.hashCode(this.f54229c)) * 31) + this.f54230d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21029y(int i, int i2, float f, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0.5f : f, (i4 & 8) != 0 ? 3 : i3);
    }

    public C21029y(int i, int i2, float f, int i3) {
        this.f54227a = i;
        this.f54228b = i2;
        this.f54229c = f;
        this.f54230d = i3;
    }
}
