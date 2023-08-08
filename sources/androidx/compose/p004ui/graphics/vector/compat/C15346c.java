package androidx.compose.p004ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.p004ui.graphics.C15110a2;
import androidx.compose.p004ui.graphics.C15225h4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15251k3;
import androidx.compose.p004ui.graphics.C15253k4;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.C15325u1;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.vector.C15340c;
import androidx.compose.p004ui.graphics.vector.C15349f;
import androidx.compose.p004ui.graphics.vector.C15380n;
import androidx.compose.p004ui.unit.C16483g;
import androidx.constraintlayout.motion.widget.C16881f;
import androidx.core.content.res.C17453d;
import androidx.core.content.res.C17483q;
import com.bumptech.glide.gifdecoder.C22073d;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@C11363r0({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,726:1\n174#2:727\n174#2:728\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n239#1:727\n240#1:728\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.compat.c */
public final class C15346c {

    /* renamed from: a */
    public static final int f37900a = 0;

    /* renamed from: b */
    public static final int f37901b = 1;

    /* renamed from: c */
    public static final int f37902c = 2;

    /* renamed from: d */
    public static final int f37903d = 0;

    /* renamed from: e */
    public static final int f37904e = 1;

    /* renamed from: f */
    public static final int f37905f = 2;

    /* renamed from: g */
    public static final int f37906g = 0;
    @C12579k

    /* renamed from: h */
    public static final String f37907h = "clip-path";
    @C12579k

    /* renamed from: i */
    public static final String f37908i = "group";
    @C12579k

    /* renamed from: j */
    public static final String f37909j = "path";

    @C12579k
    /* renamed from: a */
    public static final C15340c.C15341a m66956a(@C12579k C15344a aVar, @C12579k Resources resources, @C12580l Resources.Theme theme, @C12579k AttributeSet attributeSet) {
        long j;
        int i;
        C15344a aVar2 = aVar;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        Intrinsics.checkNotNullParameter(aVar2, "<this>");
        Intrinsics.checkNotNullParameter(resources2, "res");
        Intrinsics.checkNotNullParameter(attributeSet2, "attrs");
        C15345b bVar = C15345b.f37874a;
        TypedArray p = aVar2.mo43224p(resources2, theme2, attributeSet2, bVar.mo43235H());
        boolean i2 = aVar2.mo43217i(p, "autoMirrored", bVar.mo43240b(), false);
        float l = aVar2.mo43220l(p, "viewportWidth", bVar.mo43237J(), 0.0f);
        float l2 = aVar2.mo43220l(p, "viewportHeight", bVar.mo43236I(), 0.0f);
        if (l <= 0.0f) {
            throw new XmlPullParserException(p.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        } else if (l2 > 0.0f) {
            float f = aVar2.mo43213f(p, bVar.mo43238K(), 0.0f);
            float f2 = aVar2.mo43213f(p, bVar.mo43253o(), 0.0f);
            if (p.hasValue(bVar.mo43233F())) {
                TypedValue typedValue = new TypedValue();
                p.getValue(bVar.mo43233F(), typedValue);
                if (typedValue.type == 2) {
                    j = C15240j2.f37547b.mo42851u();
                } else {
                    ColorStateList j2 = aVar2.mo43218j(p, theme2, "tint", bVar.mo43233F());
                    if (j2 != null) {
                        j = C15258l2.m66177b(j2.getDefaultColor());
                    } else {
                        j = C15240j2.f37547b.mo42851u();
                    }
                }
            } else {
                j = C15240j2.f37547b.mo42851u();
            }
            long j3 = j;
            int h = aVar2.mo43215h(p, bVar.mo43234G(), -1);
            if (h == -1) {
                i = C15325u1.f37708b.mo43042z();
            } else if (h == 3) {
                i = C15325u1.f37708b.mo43015B();
            } else if (h == 5) {
                i = C15325u1.f37708b.mo43042z();
            } else if (h != 9) {
                switch (h) {
                    case 14:
                        i = C15325u1.f37708b.mo43033q();
                        break;
                    case 15:
                        i = C15325u1.f37708b.mo43038v();
                        break;
                    case 16:
                        i = C15325u1.f37708b.mo43036t();
                        break;
                    default:
                        i = C15325u1.f37708b.mo43042z();
                        break;
                }
            } else {
                i = C15325u1.f37708b.mo43041y();
            }
            int i3 = i;
            float M = C16483g.m74435M(f / resources.getDisplayMetrics().density);
            float M2 = C16483g.m74435M(f2 / resources.getDisplayMetrics().density);
            p.recycle();
            return new C15340c.C15341a((String) null, M, M2, l, l2, j3, i3, i2, 1, (DefaultConstructorMarker) null);
        } else {
            throw new XmlPullParserException(p.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: b */
    public static final int m66957b(int i, int i2) {
        if (i == 0) {
            return C15244j4.f37564b.mo42862a();
        }
        if (i == 1) {
            return C15244j4.f37564b.mo42863b();
        }
        if (i != 2) {
            return i2;
        }
        return C15244j4.f37564b.mo42864c();
    }

    /* renamed from: c */
    public static /* synthetic */ int m66958c(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = C15244j4.f37564b.mo42862a();
        }
        return m66957b(i, i2);
    }

    /* renamed from: d */
    public static final int m66959d(int i, int i2) {
        if (i == 0) {
            return C15253k4.f37575b.mo42880b();
        }
        if (i == 1) {
            return C15253k4.f37575b.mo42881c();
        }
        if (i != 2) {
            return i2;
        }
        return C15253k4.f37575b.mo42879a();
    }

    /* renamed from: e */
    public static /* synthetic */ int m66960e(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = C15253k4.f37575b.mo42880b();
        }
        return m66959d(i, i2);
    }

    /* renamed from: f */
    public static final boolean m66961f(@C12579k XmlPullParser xmlPullParser) {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() == 1) {
            return true;
        }
        if (xmlPullParser.getDepth() >= 1 || xmlPullParser.getEventType() != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static final C15421z1 m66962g(C17453d dVar) {
        if (!dVar.mo51886l()) {
            return null;
        }
        Shader f = dVar.mo51881f();
        if (f != null) {
            return C15110a2.m65150a(f);
        }
        return new C15225h4(C15258l2.m66177b(dVar.mo51880e()), (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public static final void m66963h(@C12579k C15344a aVar, @C12579k Resources resources, @C12580l Resources.Theme theme, @C12579k AttributeSet attributeSet, @C12579k C15340c.C15341a aVar2) {
        C15344a aVar3 = aVar;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Intrinsics.checkNotNullParameter(aVar3, "<this>");
        Intrinsics.checkNotNullParameter(resources2, "res");
        Intrinsics.checkNotNullParameter(attributeSet2, "attrs");
        Intrinsics.checkNotNullParameter(aVar2, "builder");
        C15345b bVar = C15345b.f37874a;
        TypedArray p = aVar3.mo43224p(resources2, theme, attributeSet2, bVar.mo43241c());
        String n = aVar3.mo43222n(p, bVar.mo43242d());
        if (n == null) {
            n = "";
        }
        List<C15349f> b = C15380n.m67237b(aVar3.mo43222n(p, bVar.mo43243e()));
        p.recycle();
        C15340c.C15341a.m66872b(aVar2, n, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, b, C22073d.f56678l, (Object) null);
    }

    /* renamed from: i */
    public static final int m66964i(@C12579k C15344a aVar, @C12579k Resources resources, @C12579k AttributeSet attributeSet, @C12580l Resources.Theme theme, @C12579k C15340c.C15341a aVar2, int i) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(resources, "res");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        Intrinsics.checkNotNullParameter(aVar2, "builder");
        int eventType = aVar.mo43223o().getEventType();
        if (eventType == 2) {
            String name = aVar.mo43223o().getName();
            if (name == null) {
                return i;
            }
            int hashCode = name.hashCode();
            if (hashCode != -1649314686) {
                if (hashCode != 3433509) {
                    if (hashCode != 98629247 || !name.equals("group")) {
                        return i;
                    }
                    m66966k(aVar, resources, theme, attributeSet, aVar2);
                    return i;
                } else if (!name.equals("path")) {
                    return i;
                } else {
                    m66967l(aVar, resources, theme, attributeSet, aVar2);
                    return i;
                }
            } else if (!name.equals("clip-path")) {
                return i;
            } else {
                m66963h(aVar, resources, theme, attributeSet, aVar2);
                return i + 1;
            }
        } else if (eventType != 3 || !Intrinsics.areEqual((Object) "group", (Object) aVar.mo43223o().getName())) {
            return i;
        } else {
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                aVar2.mo43185g();
            }
            return 0;
        }
    }

    /* renamed from: j */
    public static /* synthetic */ int m66965j(C15344a aVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, C15340c.C15341a aVar2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            theme = null;
        }
        return m66964i(aVar, resources, attributeSet, theme, aVar2, i);
    }

    /* renamed from: k */
    public static final void m66966k(@C12579k C15344a aVar, @C12579k Resources resources, @C12580l Resources.Theme theme, @C12579k AttributeSet attributeSet, @C12579k C15340c.C15341a aVar2) {
        C15344a aVar3 = aVar;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(resources, "res");
        Intrinsics.checkNotNullParameter(attributeSet2, "attrs");
        Intrinsics.checkNotNullParameter(aVar2, "builder");
        C15345b bVar = C15345b.f37874a;
        TypedArray p = aVar.mo43224p(resources, theme, attributeSet2, bVar.mo43244f());
        float l = aVar.mo43220l(p, C16881f.f43375i, bVar.mo43248j(), 0.0f);
        float g = aVar.mo43214g(p, bVar.mo43246h(), 0.0f);
        float g2 = aVar.mo43214g(p, bVar.mo43247i(), 0.0f);
        float l2 = aVar.mo43220l(p, "scaleX", bVar.mo43249k(), 1.0f);
        float l3 = aVar.mo43220l(p, "scaleY", bVar.mo43250l(), 1.0f);
        float l4 = aVar.mo43220l(p, "translateX", bVar.mo43251m(), 0.0f);
        float l5 = aVar.mo43220l(p, "translateY", bVar.mo43252n(), 0.0f);
        String n = aVar.mo43222n(p, bVar.mo43245g());
        if (n == null) {
            n = "";
        }
        p.recycle();
        aVar2.mo43181a(n, l, g, g2, l2, l3, l4, l5, C15380n.m67243h());
    }

    /* renamed from: l */
    public static final void m66967l(@C12579k C15344a aVar, @C12579k Resources resources, @C12580l Resources.Theme theme, @C12579k AttributeSet attributeSet, @C12579k C15340c.C15341a aVar2) throws IllegalArgumentException {
        int i;
        C15344a aVar3 = aVar;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Intrinsics.checkNotNullParameter(aVar3, "<this>");
        Intrinsics.checkNotNullParameter(resources2, "res");
        Intrinsics.checkNotNullParameter(attributeSet2, "attrs");
        Intrinsics.checkNotNullParameter(aVar2, "builder");
        C15345b bVar = C15345b.f37874a;
        TypedArray p = aVar3.mo43224p(resources2, theme, attributeSet2, bVar.mo43255q());
        if (C17483q.m80242r(aVar.mo43223o(), "pathData")) {
            String n = aVar3.mo43222n(p, bVar.mo43258t());
            if (n == null) {
                n = "";
            }
            String str = n;
            List<C15349f> b = C15380n.m67237b(aVar3.mo43222n(p, bVar.mo43259u()));
            C17453d k = aVar.mo43219k(p, theme, "fillColor", bVar.mo43257s(), 0);
            float l = aVar3.mo43220l(p, "fillAlpha", bVar.mo43256r(), 1.0f);
            int b2 = m66957b(aVar3.mo43221m(p, "strokeLineCap", bVar.mo43262x(), -1), C15244j4.f37564b.mo42862a());
            int d = m66959d(aVar3.mo43221m(p, "strokeLineJoin", bVar.mo43263y(), -1), C15253k4.f37575b.mo42879a());
            float l2 = aVar3.mo43220l(p, "strokeMiterLimit", bVar.mo43264z(), 1.0f);
            C17453d k2 = aVar.mo43219k(p, theme, "strokeColor", bVar.mo43261w(), 0);
            float l3 = aVar3.mo43220l(p, "strokeAlpha", bVar.mo43260v(), 1.0f);
            float l4 = aVar3.mo43220l(p, "strokeWidth", bVar.mo43228A(), 1.0f);
            float l5 = aVar3.mo43220l(p, "trimPathEnd", bVar.mo43229B(), 1.0f);
            float l6 = aVar3.mo43220l(p, "trimPathOffset", bVar.mo43231D(), 0.0f);
            float l7 = aVar3.mo43220l(p, "trimPathStart", bVar.mo43232E(), 0.0f);
            int m = aVar3.mo43221m(p, "fillType", bVar.mo43230C(), f37906g);
            p.recycle();
            C15421z1 g = m66962g(k);
            C15421z1 g2 = m66962g(k2);
            C15251k3.C15252a aVar4 = C15251k3.f37571b;
            if (m == 0) {
                i = aVar4.mo42874b();
            } else {
                i = aVar4.mo42873a();
            }
            aVar2.mo43182c(b, i, str, g, l, g2, l3, l4, b2, d, l2, l7, l5, l6);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    @C12579k
    /* renamed from: m */
    public static final XmlPullParser m66968m(@C12579k XmlPullParser xmlPullParser) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
