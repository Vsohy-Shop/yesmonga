package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import java.util.Locale;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Month$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1920:1\n92#2:1921\n75#3,5:1922\n80#3:1953\n84#3:2015\n75#4:1927\n76#4,11:1929\n75#4:1956\n76#4,11:1958\n89#4:2009\n89#4:2014\n76#5:1928\n76#5:1957\n460#6,13:1940\n460#6,13:1969\n50#6:1983\n49#6:1984\n50#6:1991\n49#6:1992\n36#6:1999\n473#6,3:2006\n473#6,3:2011\n79#7,2:1954\n81#7:1982\n85#7:2010\n1114#8,6:1985\n1114#8,6:1993\n1114#8,6:2000\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Month$1\n*L\n1449#1:1921\n1447#1:1922,5\n1447#1:1953\n1447#1:2015\n1447#1:1927\n1447#1:1929,11\n1454#1:1956\n1454#1:1958,11\n1454#1:2009\n1447#1:2014\n1447#1:1928\n1454#1:1957\n1447#1:1940,13\n1454#1:1969,13\n1479#1:1983\n1479#1:1984\n1505#1:1991\n1505#1:1992\n1510#1:1999\n1454#1:2006,3\n1447#1:2011,3\n1454#1:1954,2\n1454#1:1982\n1454#1:2010\n1479#1:1985,6\n1505#1:1993,6\n1510#1:2000,6\n*E\n"})
public final class DatePickerKt$Month$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C8186d0 $dateFormatter;
    final /* synthetic */ C11300l<Long, Boolean> $dateValidator;
    final /* synthetic */ Locale $defaultLocale;
    final /* synthetic */ C8700z0<C8238l> $endSelection;
    final /* synthetic */ C8266q $month;
    final /* synthetic */ C11300l<Long, C11079d2> $onDateSelected;
    final /* synthetic */ C8767m $rangeSelectionDrawModifier;
    final /* synthetic */ boolean $rangeSelectionEnabled;
    final /* synthetic */ C8700z0<C8238l> $startSelection;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ C8238l $today;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$1(C8767m mVar, C8266q qVar, C8238l lVar, C8700z0<C8238l> z0Var, C8700z0<C8238l> z0Var2, boolean z, int i, C8186d0 d0Var, Locale locale, C11300l<? super Long, C11079d2> lVar2, C8180c0 c0Var, StateData stateData, C11300l<? super Long, Boolean> lVar3) {
        super(2);
        this.$rangeSelectionDrawModifier = mVar;
        this.$month = qVar;
        this.$today = lVar;
        this.$startSelection = z0Var;
        this.$endSelection = z0Var2;
        this.$rangeSelectionEnabled = z;
        this.$$dirty = i;
        this.$dateFormatter = d0Var;
        this.$defaultLocale = locale;
        this.$onDateSelected = lVar2;
        this.$colors = c0Var;
        this.$stateData = stateData;
        this.$dateValidator = lVar3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: androidx.compose.runtime.k2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(@org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r35, int r36) {
        /*
            r34 = this;
            r0 = r34
            r13 = r35
            r1 = r36
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0017
            boolean r2 = r35.mo15011p()
            if (r2 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r35.mo14958a0()
            goto L_0x041a
        L_0x0017:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0026
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.Month.<anonymous> (DatePicker.kt:1444)"
            r4 = -1776200645(0xffffffff9621543b, float:-1.3032055E-25)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r1, r2, r3)
        L_0x0026:
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            float r2 = androidx.compose.material3.DatePickerKt.m25591K()
            r14 = 6
            float r3 = (float) r14
            float r2 = r2 * r3
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10118r(r1, r2)
            androidx.compose.ui.m r2 = r0.$rangeSelectionDrawModifier
            androidx.compose.ui.m r1 = r1.mo17224k3(r2)
            androidx.compose.foundation.layout.Arrangement r2 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r2 = r2.mo7629n()
            androidx.compose.material3.q r15 = r0.$month
            androidx.compose.material3.l r12 = r0.$today
            androidx.compose.runtime.z0<androidx.compose.material3.l> r11 = r0.$startSelection
            androidx.compose.runtime.z0<androidx.compose.material3.l> r10 = r0.$endSelection
            boolean r9 = r0.$rangeSelectionEnabled
            int r8 = r0.$$dirty
            androidx.compose.material3.d0 r7 = r0.$dateFormatter
            java.util.Locale r6 = r0.$defaultLocale
            kotlin.jvm.functions.l<java.lang.Long, kotlin.d2> r5 = r0.$onDateSelected
            androidx.compose.material3.c0 r4 = r0.$colors
            androidx.compose.material3.StateData r3 = r0.$stateData
            kotlin.jvm.functions.l<java.lang.Long, java.lang.Boolean> r14 = r0.$dateValidator
            r0 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r13.mo14918M(r0)
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r0 = r0.mo17072u()
            r16 = r4
            r4 = 6
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.ColumnKt.m9863b(r2, r0, r13, r4)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.mo14918M(r4)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r13.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r4 = r13.mo15032w(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p004ui.unit.LayoutDirection) r4
            r18 = r5
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r5 = r13.mo15032w(r5)
            androidx.compose.ui.platform.c4 r5 = (androidx.compose.p004ui.platform.C15863c4) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r19 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            r20 = r6
            kotlin.jvm.functions.a r6 = r19.mo44585a()
            kotlin.jvm.functions.q r1 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r1)
            r21 = r7
            androidx.compose.runtime.d r7 = r35.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x00ad
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00ad:
            r35.mo14938T()
            boolean r7 = r35.mo14997l()
            if (r7 == 0) goto L_0x00ba
            r13.mo14947W(r6)
            goto L_0x00bd
        L_0x00ba:
            r35.mo14888A()
        L_0x00bd:
            r35.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r35)
            kotlin.jvm.functions.p r7 = r19.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r0, r7)
            kotlin.jvm.functions.p r0 = r19.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r2, r0)
            kotlin.jvm.functions.p r0 = r19.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r4, r0)
            kotlin.jvm.functions.p r0 = r19.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r5, r0)
            r35.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r35)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r19 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r1.invoke(r0, r13, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.mo14918M(r0)
            androidx.compose.foundation.layout.ColumnScopeInstance r1 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            r1 = -713647587(0xffffffffd5769a1d, float:-1.69463607E13)
            r13.mo14918M(r1)
            r1 = r19
            r7 = r1
            r2 = 6
        L_0x0106:
            if (r7 >= r2) goto L_0x0402
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            r4 = 0
            r5 = 0
            r6 = 1
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10114n(r2, r4, r6, r5)
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$e r4 = r4.mo7629n()
            androidx.compose.ui.c$a r5 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r5 = r5.mo17070q()
            r6 = 693286680(0x2952b718, float:4.6788176E-14)
            r13.mo14918M(r6)
            r6 = 54
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.RowKt.m10071d(r4, r5, r13, r6)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.mo14918M(r5)
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r6 = r13.mo15032w(r6)
            androidx.compose.ui.unit.d r6 = (androidx.compose.p004ui.unit.C16479d) r6
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r13.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r0 = r13.mo15032w(r0)
            androidx.compose.ui.platform.c4 r0 = (androidx.compose.p004ui.platform.C15863c4) r0
            androidx.compose.ui.node.ComposeUiNode$Companion r23 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            r24 = r1
            kotlin.jvm.functions.a r1 = r23.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            r25 = r7
            androidx.compose.runtime.d r7 = r35.mo15017r()
            boolean r7 = r7 instanceof androidx.compose.runtime.C8428d
            if (r7 != 0) goto L_0x0166
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0166:
            r35.mo14938T()
            boolean r7 = r35.mo14997l()
            if (r7 == 0) goto L_0x0173
            r13.mo14947W(r1)
            goto L_0x0176
        L_0x0173:
            r35.mo14888A()
        L_0x0176:
            r35.mo14941U()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.Updater.m30180b(r35)
            kotlin.jvm.functions.p r7 = r23.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r1, r4, r7)
            kotlin.jvm.functions.p r4 = r23.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r1, r6, r4)
            kotlin.jvm.functions.p r4 = r23.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r1, r5, r4)
            kotlin.jvm.functions.p r4 = r23.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r1, r0, r4)
            r35.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r35)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r2.invoke(r0, r13, r1)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.mo14918M(r0)
            androidx.compose.foundation.layout.RowScopeInstance r1 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r1 = -1111255211(0xffffffffbdc39755, float:-0.09550349)
            r13.mo14918M(r1)
            r6 = r19
            r7 = r24
        L_0x01bd:
            r1 = 7
            if (r6 >= r1) goto L_0x03c8
            int r1 = r15.mo12917j()
            if (r7 < r1) goto L_0x036f
            int r1 = r15.mo12917j()
            int r2 = r15.mo12920m()
            int r1 = r1 + r2
            if (r7 < r1) goto L_0x01d3
            goto L_0x036f
        L_0x01d3:
            r1 = 382637385(0x16ce9549, float:3.3375307E-25)
            r13.mo14918M(r1)
            int r1 = r15.mo12917j()
            int r5 = r7 - r1
            long r1 = r15.mo12921n()
            r23 = r1
            long r0 = (long) r5
            r26 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r26
            long r0 = r23 + r0
            long r23 = r12.mo12763X()
            int r2 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x01f8
            r23 = 1
            goto L_0x01fa
        L_0x01f8:
            r23 = r19
        L_0x01fa:
            java.lang.Object r2 = r11.getValue()
            androidx.compose.material3.l r2 = (androidx.compose.material3.C8238l) r2
            if (r2 == 0) goto L_0x020d
            long r26 = r2.mo12763X()
            int r2 = (r0 > r26 ? 1 : (r0 == r26 ? 0 : -1))
            if (r2 != 0) goto L_0x020d
            r24 = 1
            goto L_0x020f
        L_0x020d:
            r24 = r19
        L_0x020f:
            java.lang.Object r2 = r10.getValue()
            androidx.compose.material3.l r2 = (androidx.compose.material3.C8238l) r2
            if (r2 == 0) goto L_0x0222
            long r26 = r2.mo12763X()
            int r2 = (r0 > r26 ? 1 : (r0 == r26 ? 0 : -1))
            if (r2 != 0) goto L_0x0222
            r26 = 1
            goto L_0x0224
        L_0x0222:
            r26 = r19
        L_0x0224:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            int r27 = r8 >> 12
            r27 = r27 & 14
            r28 = r10
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.mo14918M(r10)
            boolean r2 = r13.mo15006n0(r2)
            boolean r4 = r13.mo15006n0(r4)
            r2 = r2 | r4
            java.lang.Object r4 = r35.mo14921N()
            if (r2 != 0) goto L_0x024f
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r4 != r2) goto L_0x025b
        L_0x024f:
            androidx.compose.material3.DatePickerKt$Month$1$1$1$1$1$inRange$1$1 r2 = new androidx.compose.material3.DatePickerKt$Month$1$1$1$1$1$inRange$1$1
            r2.<init>(r3, r9, r0)
            androidx.compose.runtime.k2 r4 = androidx.compose.runtime.C8415c2.m30235d(r2)
            r13.mo14893C(r4)
        L_0x025b:
            r35.mo15002m0()
            r29 = r4
            androidx.compose.runtime.k2 r29 = (androidx.compose.runtime.C8578k2) r29
            java.lang.Object r2 = r29.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r30 = r2.booleanValue()
            r31 = r11
            r10 = r0
            r1 = r9
            r2 = r23
            r0 = r3
            r3 = r24
            r17 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4 = r26
            r32 = r0
            r0 = r18
            r18 = r9
            r9 = r5
            r5 = r30
            r22 = r12
            r30 = r15
            r15 = r20
            r12 = 1
            r20 = r6
            r6 = r35
            r33 = r25
            r25 = r21
            r21 = r7
            r7 = r27
            java.lang.String r1 = androidx.compose.material3.DatePickerKt.m25587G(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r2 = r25.mo12521d()
            java.lang.String r2 = androidx.compose.material3.C8260p.m27434c(r10, r2, r15)
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            if (r24 != 0) goto L_0x02ac
            if (r26 == 0) goto L_0x02a9
            goto L_0x02ac
        L_0x02a9:
            r4 = r19
            goto L_0x02ad
        L_0x02ac:
            r4 = r12
        L_0x02ad:
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.mo14918M(r6)
            boolean r6 = r13.mo15006n0(r0)
            boolean r5 = r13.mo15006n0(r5)
            r5 = r5 | r6
            java.lang.Object r6 = r35.mo14921N()
            if (r5 != 0) goto L_0x02ce
            androidx.compose.runtime.o$a r5 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r5.mo16277a()
            if (r6 != r5) goto L_0x02d6
        L_0x02ce:
            androidx.compose.material3.DatePickerKt$Month$1$1$1$1$1$1$1 r6 = new androidx.compose.material3.DatePickerKt$Month$1$1$1$1$1$1$1
            r6.<init>(r0, r10)
            r13.mo14893C(r6)
        L_0x02d6:
            r35.mo15002m0()
            r5 = r6
            kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            r7 = 1157296644(0x44faf204, float:2007.563)
            r13.mo14918M(r7)
            boolean r6 = r13.mo15006n0(r6)
            java.lang.Object r7 = r35.mo14921N()
            if (r6 != 0) goto L_0x02f8
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r7 != r6) goto L_0x030d
        L_0x02f8:
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            java.lang.Object r6 = r14.invoke(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r13.mo14893C(r7)
        L_0x030d:
            r35.mo15002m0()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            java.lang.Object r7 = r29.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r1 == 0) goto L_0x0338
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.String r1 = ", "
            r10.append(r1)
            r10.append(r2)
            java.lang.String r1 = r10.toString()
            r10 = r1
            goto L_0x0339
        L_0x0338:
            r10 = r2
        L_0x0339:
            androidx.compose.material3.DatePickerKt$Month$1$1$1$1$1$3 r1 = new androidx.compose.material3.DatePickerKt$Month$1$1$1$1$1$3
            r1.<init>(r9)
            r2 = 1633583293(0x615e80bd, float:2.5652836E20)
            androidx.compose.runtime.internal.a r11 = androidx.compose.runtime.internal.C8553b.m31048b(r13, r2, r12, r1)
            int r1 = r8 << 3
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r2 = 805306374(0x30000006, float:4.656616E-10)
            r26 = r1 | r2
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r24
            r5 = r6
            r6 = r23
            r23 = r8
            r8 = r10
            r9 = r16
            r24 = r28
            r10 = r11
            r27 = r31
            r11 = r35
            r28 = r12
            r12 = r26
            androidx.compose.material3.DatePickerKt.m25601g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r35.mo15002m0()
            r2 = 6
            goto L_0x03a9
        L_0x036f:
            r32 = r3
            r23 = r8
            r24 = r10
            r27 = r11
            r22 = r12
            r30 = r15
            r0 = r18
            r15 = r20
            r33 = r25
            r17 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r28 = 1
            r20 = r6
            r18 = r9
            r25 = r21
            r21 = r7
            r1 = 382636990(0x16ce93be, float:3.3374333E-25)
            r13.mo14918M(r1)
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            float r2 = androidx.compose.material3.DatePickerKt.m25591K()
            float r3 = androidx.compose.material3.DatePickerKt.m25591K()
            androidx.compose.ui.m r1 = androidx.compose.foundation.layout.SizeKt.m10123w(r1, r2, r3)
            r2 = 6
            androidx.compose.foundation.layout.C2428y0.m10726a(r1, r13, r2)
            r35.mo15002m0()
        L_0x03a9:
            int r7 = r21 + 1
            int r6 = r20 + 1
            r20 = r15
            r9 = r18
            r12 = r22
            r8 = r23
            r10 = r24
            r21 = r25
            r11 = r27
            r15 = r30
            r3 = r32
            r25 = r33
            r18 = r0
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            goto L_0x01bd
        L_0x03c8:
            r32 = r3
            r23 = r8
            r24 = r10
            r27 = r11
            r22 = r12
            r30 = r15
            r0 = r18
            r15 = r20
            r33 = r25
            r2 = 6
            r17 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r18 = r9
            r25 = r21
            r21 = r7
            r35.mo15002m0()
            r35.mo15002m0()
            r35.mo14896D()
            r35.mo15002m0()
            r35.mo15002m0()
            int r7 = r33 + 1
            r1 = r21
            r21 = r25
            r15 = r30
            r18 = r0
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            goto L_0x0106
        L_0x0402:
            r35.mo15002m0()
            r35.mo15002m0()
            r35.mo14896D()
            r35.mo15002m0()
            r35.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x041a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x041a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt$Month$1.invoke(androidx.compose.runtime.o, int):void");
    }
}
