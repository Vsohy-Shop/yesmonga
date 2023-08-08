package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.ListSaverKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C11363r0({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,369:1\n76#2:370\n102#2,2:371\n76#2:373\n102#2,2:374\n76#2:376\n102#2,2:377\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n253#1:370\n253#1:371,2\n259#1:373\n259#1:374,2\n274#1:376\n274#1:377,2\n*E\n"})
public final class TextFieldScrollerPosition {
    @C12579k

    /* renamed from: f */
    public static final C2755a f7214f = new C2755a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: g */
    public static final C8628e<TextFieldScrollerPosition, Object> f7215g = ListSaverKt.m31335a(TextFieldScrollerPosition$Companion$Saver$1.f7221f, TextFieldScrollerPosition$Companion$Saver$2.f7222f);
    @C12579k

    /* renamed from: a */
    public final C8700z0 f7216a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f7217b;
    @C12579k

    /* renamed from: c */
    public C15098i f7218c;

    /* renamed from: d */
    public long f7219d;
    @C12579k

    /* renamed from: e */
    public final C8700z0 f7220e;

    /* renamed from: androidx.compose.foundation.text.TextFieldScrollerPosition$a */
    public static final class C2755a {
        public /* synthetic */ C2755a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<TextFieldScrollerPosition, Object> mo9426a() {
            return TextFieldScrollerPosition.f7215g;
        }

        public C2755a() {
        }
    }

    public TextFieldScrollerPosition(@C12579k Orientation orientation, float f) {
        Intrinsics.checkNotNullParameter(orientation, "initialOrientation");
        this.f7216a = C8539f2.m30981g(Float.valueOf(f), (C8410b2) null, 2, (Object) null);
        this.f7217b = C8539f2.m30981g(Float.valueOf(0.0f), (C8410b2) null, 2, (Object) null);
        this.f7218c = C15098i.f37261e.mo42285a();
        this.f7219d = C16356n0.f40590b.mo47429a();
        this.f7220e = C8415c2.m30241j(orientation, C8415c2.m30254w());
    }

    /* renamed from: b */
    public final void mo9415b(float f, float f2, int i) {
        float f3;
        int i2;
        float d = mo9417d();
        float f4 = (float) i;
        float f5 = d + f4;
        if (f2 > f5 || (f < d && f2 - f > f4)) {
            f3 = f2 - f5;
        } else if (i2 >= 0 || f2 - f > f4) {
            f3 = 0.0f;
        } else {
            f3 = f - d;
        }
        mo9422i(mo9417d() + f3);
    }

    /* renamed from: c */
    public final float mo9416c() {
        return ((Number) this.f7217b.getValue()).floatValue();
    }

    /* renamed from: d */
    public final float mo9417d() {
        return ((Number) this.f7216a.getValue()).floatValue();
    }

    /* renamed from: e */
    public final int mo9418e(long j) {
        if (C16356n0.m73742n(j) != C16356n0.m73742n(this.f7219d)) {
            return C16356n0.m73742n(j);
        }
        if (C16356n0.m73737i(j) != C16356n0.m73737i(this.f7219d)) {
            return C16356n0.m73737i(j);
        }
        return C16356n0.m73740l(j);
    }

    @C12579k
    /* renamed from: f */
    public final Orientation mo9419f() {
        return (Orientation) this.f7220e.getValue();
    }

    /* renamed from: g */
    public final long mo9420g() {
        return this.f7219d;
    }

    /* renamed from: h */
    public final void mo9421h(float f) {
        this.f7217b.setValue(Float.valueOf(f));
    }

    /* renamed from: i */
    public final void mo9422i(float f) {
        this.f7216a.setValue(Float.valueOf(f));
    }

    /* renamed from: j */
    public final void mo9423j(@C12579k Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<set-?>");
        this.f7220e.setValue(orientation);
    }

    /* renamed from: k */
    public final void mo9424k(long j) {
        this.f7219d = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r0 == false) goto L_0x0037;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9425l(@org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.Orientation r5, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.geometry.C15098i r6, int r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "cursorRect"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r8 = r8 - r7
            float r8 = (float) r8
            r4.mo9421h(r8)
            float r0 = r6.mo42279t()
            androidx.compose.ui.geometry.i r1 = r4.f7218c
            float r1 = r1.mo42279t()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0021
            r0 = r1
            goto L_0x0022
        L_0x0021:
            r0 = r2
        L_0x0022:
            if (r0 == 0) goto L_0x0037
            float r0 = r6.mo42249B()
            androidx.compose.ui.geometry.i r3 = r4.f7218c
            float r3 = r3.mo42249B()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
            r0 = r1
            goto L_0x0035
        L_0x0034:
            r0 = r2
        L_0x0035:
            if (r0 != 0) goto L_0x0058
        L_0x0037:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r5 != r0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            if (r1 == 0) goto L_0x0044
            float r5 = r6.mo42249B()
            goto L_0x0048
        L_0x0044:
            float r5 = r6.mo42279t()
        L_0x0048:
            if (r1 == 0) goto L_0x004f
            float r0 = r6.mo42271j()
            goto L_0x0053
        L_0x004f:
            float r0 = r6.mo42283x()
        L_0x0053:
            r4.mo9415b(r5, r0, r7)
            r4.f7218c = r6
        L_0x0058:
            float r5 = r4.mo9417d()
            r6 = 0
            float r5 = kotlin.ranges.C11479u.m44331H(r5, r6, r8)
            r4.mo9422i(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollerPosition.mo9425l(androidx.compose.foundation.gestures.Orientation, androidx.compose.ui.geometry.i, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i & 2) != 0 ? 0.0f : f);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, (DefaultConstructorMarker) null);
    }
}
