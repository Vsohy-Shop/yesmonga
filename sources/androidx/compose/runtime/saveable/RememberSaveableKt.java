package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.C8665r;
import java.util.Arrays;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,200:1\n76#2:201\n83#3,3:202\n1114#4,6:205\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n81#1:201\n83#1:202,3\n83#1:205,6\n*E\n"})
public final class RememberSaveableKt {

    /* renamed from: a */
    public static final int f23085a = 36;

    /* renamed from: b */
    public static final <T> C8628e<C8700z0<T>, C8700z0<Object>> m31341b(C8628e<T, ? extends Object> eVar) {
        Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.m31375a(new RememberSaveableKt$mutableStateSaver$1$1(eVar), new RememberSaveableKt$mutableStateSaver$1$2(eVar));
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public static final <T> C8700z0<T> m31342c(@C12579k Object[] objArr, @C12579k C8628e<T, ? extends Object> eVar, @C12580l String str, @C12579k C11289a<? extends C8700z0<T>> aVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(objArr, "inputs");
        Intrinsics.checkNotNullParameter(eVar, "stateSaver");
        Intrinsics.checkNotNullParameter(aVar, "init");
        oVar.mo14918M(-202053668);
        if ((i2 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-202053668, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:136)");
        }
        C8700z0<T> z0Var = (C8700z0) m31343d(Arrays.copyOf(objArr, objArr.length), m31341b(eVar), str2, aVar, oVar, (i & 896) | 8 | (i & 7168), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return z0Var;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [kotlin.jvm.functions.a<? extends T>, kotlin.jvm.functions.a, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m31343d(@org.jetbrains.annotations.C12579k java.lang.Object[] r5, @org.jetbrains.annotations.C12580l androidx.compose.runtime.saveable.C8628e<T, ? extends java.lang.Object> r6, @org.jetbrains.annotations.C12580l java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<? extends T> r8, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r9, int r10, int r11) {
        /*
            java.lang.String r0 = "inputs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 441892779(0x1a56bfab, float:4.440899E-23)
            r9.mo14918M(r0)
            r1 = r11 & 2
            if (r1 == 0) goto L_0x0018
            androidx.compose.runtime.saveable.e r6 = androidx.compose.runtime.saveable.SaverKt.m31376b()
        L_0x0018:
            r11 = r11 & 4
            r1 = 0
            if (r11 == 0) goto L_0x001e
            r7 = r1
        L_0x001e:
            boolean r11 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r11 == 0) goto L_0x002a
            r11 = -1
            java.lang.String r2 = "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:65)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r10, r11, r2)
        L_0x002a:
            r10 = 1059366469(0x3f24a645, float:0.6431621)
            r9.mo14918M(r10)
            r10 = 0
            if (r7 == 0) goto L_0x003c
            int r11 = r7.length()
            if (r11 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r11 = r10
            goto L_0x003d
        L_0x003c:
            r11 = 1
        L_0x003d:
            if (r11 != 0) goto L_0x0040
            goto L_0x0053
        L_0x0040:
            int r7 = androidx.compose.runtime.ComposablesKt.m29515j(r9, r10)
            int r11 = f23085a
            int r11 = kotlin.text.C11600b.m45172a(r11)
            java.lang.String r7 = java.lang.Integer.toString(r7, r11)
            java.lang.String r11 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)
        L_0x0053:
            r9.mo15002m0()
            java.lang.String r11 = "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r11)
            androidx.compose.runtime.i1 r11 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.m31373b()
            java.lang.Object r11 = r9.mo15032w(r11)
            androidx.compose.runtime.saveable.c r11 = (androidx.compose.runtime.saveable.C8624c) r11
            int r0 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r9.mo14918M(r0)
            int r0 = r5.length
            r2 = r10
            r3 = r2
        L_0x0073:
            if (r2 >= r0) goto L_0x007f
            r4 = r5[r2]
            boolean r4 = r9.mo15006n0(r4)
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L_0x0073
        L_0x007f:
            java.lang.Object r5 = r9.mo14921N()
            if (r3 != 0) goto L_0x008d
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r5 != r0) goto L_0x00a4
        L_0x008d:
            if (r11 == 0) goto L_0x0099
            java.lang.Object r5 = r11.mo8713f(r7)
            if (r5 == 0) goto L_0x0099
            java.lang.Object r1 = r6.mo16407b(r5)
        L_0x0099:
            if (r1 != 0) goto L_0x00a0
            java.lang.Object r5 = r8.invoke()
            goto L_0x00a1
        L_0x00a0:
            r5 = r1
        L_0x00a1:
            r9.mo14893C(r5)
        L_0x00a4:
            r9.mo15002m0()
            if (r11 == 0) goto L_0x00b9
            androidx.compose.runtime.k2 r6 = androidx.compose.runtime.C8415c2.m30251t(r6, r9, r10)
            androidx.compose.runtime.k2 r8 = androidx.compose.runtime.C8415c2.m30251t(r5, r9, r10)
            androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1 r0 = new androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1
            r0.<init>(r11, r7, r6, r8)
            androidx.compose.runtime.EffectsKt.m29890b(r11, r7, r0, r9, r10)
        L_0x00b9:
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x00c2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00c2:
            r9.mo15002m0()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.RememberSaveableKt.m31343d(java.lang.Object[], androidx.compose.runtime.saveable.e, java.lang.String, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):java.lang.Object");
    }

    /* renamed from: e */
    public static final void m31344e(C8624c cVar, Object obj) {
        String str;
        if (obj != null && !cVar.mo8708a(obj)) {
            if (obj instanceof C8665r) {
                C8665r rVar = (C8665r) obj;
                if (rVar.mo15298a() == C8415c2.m30243l() || rVar.mo15298a() == C8415c2.m30254w() || rVar.mo15298a() == C8415c2.m30250s()) {
                    str = "MutableState containing " + rVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            throw new IllegalArgumentException(str);
        }
    }
}
