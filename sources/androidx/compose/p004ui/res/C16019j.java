package androidx.compose.p004ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.C0375v;
import androidx.compose.p004ui.graphics.vector.C15340c;
import androidx.compose.p004ui.graphics.vector.compat.C15344a;
import androidx.compose.p004ui.graphics.vector.compat.C15346c;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.res.C16012e;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.xmlpull.v1.XmlPullParserException;

@C11363r0({"SMAP\nVectorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n76#2:154\n83#3,3:155\n1114#4,6:158\n1#5:164\n*S KotlinDebug\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n*L\n49#1:154\n53#1:155,3\n53#1:158,6\n*E\n"})
/* renamed from: androidx.compose.ui.res.j */
public final class C16019j {
    @C12579k
    /* renamed from: a */
    public static final C16012e.C16013a m71860a(@C12580l Resources.Theme theme, @C12579k Resources resources, @C12579k XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(resources, "res");
        Intrinsics.checkNotNullParameter(xmlResourceParser, "parser");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C15344a aVar = new C15344a(xmlResourceParser, 0, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullExpressionValue(asAttributeSet, "attrs");
        C15340c.C15341a a = C15346c.m66956a(aVar, resources, theme, asAttributeSet);
        int i2 = 0;
        while (!C15346c.m66961f(xmlResourceParser)) {
            i2 = C15346c.m66964i(aVar, resources, asAttributeSet, theme, a, i2);
            xmlResourceParser.next();
        }
        return new C16012e.C16013a(a.mo43184f(), i);
    }

    /* renamed from: b */
    public static /* synthetic */ C16012e.C16013a m71861b(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i, int i2, Object obj) throws XmlPullParserException {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return m71860a(theme, resources, xmlResourceParser, i);
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public static final C15340c m71862c(@C12579k C15340c.C15343b bVar, @C0375v int i, @C12580l C8592o oVar, int i2) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        oVar.mo14918M(44534090);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(44534090, i2, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Resources a = C16017h.m71854a(oVar, 0);
        Resources.Theme theme = ((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g())).getTheme();
        Object[] objArr = {Integer.valueOf(i), a, theme, a.getConfiguration()};
        oVar.mo14918M(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z |= oVar.mo15006n0(objArr[i3]);
        }
        Object N = oVar.mo14921N();
        if (z || N == C8592o.f23032a.mo16277a()) {
            N = m71863d(bVar, theme, a, i);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C15340c cVar = (C15340c) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return cVar;
    }

    @C12579k
    /* renamed from: d */
    public static final C15340c m71863d(@C12579k C15340c.C15343b bVar, @C12580l Resources.Theme theme, @C12579k Resources resources, int i) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(resources, "res");
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        XmlResourceParser xml = resources.getXml(i);
        Intrinsics.checkNotNullExpressionValue(xml, "vectorResource$lambda$1");
        C15346c.m66968m(xml);
        C11079d2 d2Var = C11079d2.f28267a;
        Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(resId).apply { seekToStartTag() }");
        return m71860a(theme, resources, xml, typedValue.changingConfigurations).mo45996f();
    }

    /* renamed from: e */
    public static /* synthetic */ C15340c m71864e(C15340c.C15343b bVar, Resources.Theme theme, Resources resources, int i, int i2, Object obj) throws XmlPullParserException {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return m71863d(bVar, theme, resources, i);
    }
}
