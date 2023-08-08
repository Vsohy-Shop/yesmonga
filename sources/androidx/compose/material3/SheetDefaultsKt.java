package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.nestedscroll.C15448b;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16509w;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,410:1\n83#2,3:411\n1114#3,6:414\n154#4:420\n154#4:421\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n*L\n404#1:411,3\n404#1:414,6\n409#1:420\n410#1:421\n*E\n"})
public final class SheetDefaultsKt {

    /* renamed from: a */
    public static final float f19640a = C16483g.m74435M((float) 22);

    /* renamed from: b */
    public static final float f19641b = C16483g.m74435M((float) 640);

    /* renamed from: androidx.compose.material3.SheetDefaultsKt$a */
    public static final class C8089a implements C15446a {

        /* renamed from: a */
        public final /* synthetic */ SheetState f19642a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Float, C11079d2> f19643b;

        /* renamed from: c */
        public final /* synthetic */ Orientation f19644c;

        public C8089a(SheetState sheetState, C11300l<? super Float, C11079d2> lVar, Orientation orientation) {
            this.f19642a = sheetState;
            this.f19643b = lVar;
            this.f19644c = orientation;
        }

        @C12580l
        /* renamed from: a */
        public Object mo7455a(long j, long j2, @C12579k C11045c<? super C16509w> cVar) {
            this.f19643b.invoke(C11064a.m42619e(mo11851f(j2)));
            return C16509w.m74740b(j2);
        }

        @C11314h(name = "offsetToFloat")
        /* renamed from: c */
        public final float mo11849c(long j) {
            return this.f19644c == Orientation.Horizontal ? C15094f.m64880p(j) : C15094f.m64882r(j);
        }

        /* renamed from: d */
        public final long mo11850d(float f) {
            float f2;
            Orientation orientation = this.f19644c;
            if (orientation == Orientation.Horizontal) {
                f2 = f;
            } else {
                f2 = 0.0f;
            }
            if (orientation != Orientation.Vertical) {
                f = 0.0f;
            }
            return C15096g.m64898a(f2, f);
        }

        @C11314h(name = "velocityToFloat")
        /* renamed from: f */
        public final float mo11851f(long j) {
            return this.f19644c == Orientation.Horizontal ? C16509w.m74750l(j) : C16509w.m74752n(j);
        }

        /* renamed from: g */
        public long mo7456g(long j, long j2, int i) {
            if (C15448b.m68343g(i, C15448b.f38435b.mo43964a())) {
                return mo11850d(this.f19642a.mo11862j().mo12108l(mo11849c(j2)));
            }
            return C15094f.f37256b.mo42248e();
        }

        /* renamed from: m */
        public long mo7457m(long j, int i) {
            float c = mo11849c(j);
            if (c >= 0.0f || !C15448b.m68343g(i, C15448b.f38435b.mo43964a())) {
                return C15094f.f37256b.mo42248e();
            }
            return mo11850d(this.f19642a.mo11862j().mo12108l(c));
        }

        @C12580l
        /* renamed from: o */
        public Object mo7922o(long j, @C12579k C11045c<? super C16509w> cVar) {
            float f = mo11851f(j);
            float o = this.f19642a.mo11867o();
            if (f >= 0.0f || o <= this.f19642a.mo11862j().mo12117u()) {
                j = C16509w.f40916b.mo47915a();
            } else {
                this.f19643b.invoke(C11064a.m42619e(f));
            }
            return C16509w.m74740b(j);
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C15446a m26130a(@C12579k SheetState sheetState, @C12579k Orientation orientation, @C12579k C11300l<? super Float, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(lVar, "onFling");
        return new C8089a(sheetState, lVar, orientation);
    }

    /* renamed from: c */
    public static final float m26132c() {
        return f19641b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material3.C8251n0
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.SheetState m26133d(boolean r14, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.material3.SheetValue, java.lang.Boolean> r15, @org.jetbrains.annotations.C12580l androidx.compose.material3.SheetValue r16, boolean r17, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r18, int r19, int r20) {
        /*
            r7 = r18
            r0 = 1032784200(0x3d8f0948, float:0.06984192)
            r7.mo14918M(r0)
            r1 = r20 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000f
            r1 = r2
            goto L_0x0010
        L_0x000f:
            r1 = r14
        L_0x0010:
            r3 = r20 & 2
            if (r3 == 0) goto L_0x0017
            androidx.compose.material3.SheetDefaultsKt$rememberSheetState$1 r3 = androidx.compose.material3.SheetDefaultsKt$rememberSheetState$1.f19645f
            goto L_0x0018
        L_0x0017:
            r3 = r15
        L_0x0018:
            r4 = r20 & 4
            if (r4 == 0) goto L_0x001f
            androidx.compose.material3.SheetValue r4 = androidx.compose.material3.SheetValue.Hidden
            goto L_0x0021
        L_0x001f:
            r4 = r16
        L_0x0021:
            r5 = r20 & 8
            if (r5 == 0) goto L_0x0027
            r5 = r2
            goto L_0x0029
        L_0x0027:
            r5 = r17
        L_0x0029:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x0037
            r6 = -1
            java.lang.String r8 = "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:391)"
            r9 = r19
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r9, r6, r8)
        L_0x0037:
            r0 = 2
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r6[r2] = r8
            r8 = 1
            r6[r8] = r3
            androidx.compose.material3.SheetState$Companion r9 = androidx.compose.material3.SheetState.f19646d
            androidx.compose.runtime.saveable.e r9 = r9.mo11873a(r1, r3)
            r10 = 0
            r11 = 4
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
            r12[r2] = r13
            r12[r8] = r4
            r12[r0] = r3
            r0 = 3
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            r12[r0] = r8
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r7.mo14918M(r0)
            r0 = r2
        L_0x0065:
            if (r2 >= r11) goto L_0x0071
            r8 = r12[r2]
            boolean r8 = r7.mo15006n0(r8)
            r0 = r0 | r8
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0071:
            java.lang.Object r2 = r18.mo14921N()
            if (r0 != 0) goto L_0x007f
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r2 != r0) goto L_0x0087
        L_0x007f:
            androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1 r2 = new androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
            r2.<init>(r1, r4, r3, r5)
            r7.mo14893C(r2)
        L_0x0087:
            r18.mo15002m0()
            r3 = r2
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r5 = 72
            r8 = 4
            r0 = r6
            r1 = r9
            r2 = r10
            r4 = r18
            r6 = r8
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.material3.SheetState r0 = (androidx.compose.material3.SheetState) r0
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00a5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00a5:
            r18.mo15002m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SheetDefaultsKt.m26133d(boolean, kotlin.jvm.functions.l, androidx.compose.material3.SheetValue, boolean, androidx.compose.runtime.o, int, int):androidx.compose.material3.SheetState");
    }
}
