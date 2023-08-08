package androidx.compose.p004ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.C0330d1;
import androidx.annotation.C0354l;
import androidx.core.content.res.C17453d;
import androidx.core.content.res.C17483q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.compose.ui.graphics.vector.compat.a */
public final class C15344a {
    @C12579k

    /* renamed from: a */
    public final XmlPullParser f37860a;

    /* renamed from: b */
    public int f37861b;

    public C15344a(@C12579k XmlPullParser xmlPullParser, int i) {
        Intrinsics.checkNotNullParameter(xmlPullParser, "xmlParser");
        this.f37860a = xmlPullParser;
        this.f37861b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C15344a m66901d(C15344a aVar, XmlPullParser xmlPullParser, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xmlPullParser = aVar.f37860a;
        }
        if ((i2 & 2) != 0) {
            i = aVar.f37861b;
        }
        return aVar.mo43210c(xmlPullParser, i);
    }

    @C12579k
    /* renamed from: a */
    public final XmlPullParser mo43208a() {
        return this.f37860a;
    }

    /* renamed from: b */
    public final int mo43209b() {
        return this.f37861b;
    }

    @C12579k
    /* renamed from: c */
    public final C15344a mo43210c(@C12579k XmlPullParser xmlPullParser, int i) {
        Intrinsics.checkNotNullParameter(xmlPullParser, "xmlParser");
        return new C15344a(xmlPullParser, i);
    }

    /* renamed from: e */
    public final int mo43211e() {
        return this.f37861b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15344a)) {
            return false;
        }
        C15344a aVar = (C15344a) obj;
        return Intrinsics.areEqual((Object) this.f37860a, (Object) aVar.f37860a) && this.f37861b == aVar.f37861b;
    }

    /* renamed from: f */
    public final float mo43213f(@C12579k TypedArray typedArray, int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i, f);
        mo43226r(typedArray.getChangingConfigurations());
        return dimension;
    }

    /* renamed from: g */
    public final float mo43214g(@C12579k TypedArray typedArray, int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        float f2 = typedArray.getFloat(i, f);
        mo43226r(typedArray.getChangingConfigurations());
        return f2;
    }

    /* renamed from: h */
    public final int mo43215h(@C12579k TypedArray typedArray, int i, int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        int i3 = typedArray.getInt(i, i2);
        mo43226r(typedArray.getChangingConfigurations());
        return i3;
    }

    public int hashCode() {
        return (this.f37860a.hashCode() * 31) + Integer.hashCode(this.f37861b);
    }

    /* renamed from: i */
    public final boolean mo43217i(@C12579k TypedArray typedArray, @C12579k String str, @C0330d1 int i, boolean z) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(str, "attrName");
        boolean e = C17483q.m80229e(typedArray, this.f37860a, str, i, z);
        mo43226r(typedArray.getChangingConfigurations());
        return e;
    }

    @C12580l
    /* renamed from: j */
    public final ColorStateList mo43218j(@C12579k TypedArray typedArray, @C12580l Resources.Theme theme, @C12579k String str, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(str, "attrName");
        ColorStateList g = C17483q.m80231g(typedArray, this.f37860a, theme, str, i);
        mo43226r(typedArray.getChangingConfigurations());
        return g;
    }

    @C12579k
    /* renamed from: k */
    public final C17453d mo43219k(@C12579k TypedArray typedArray, @C12580l Resources.Theme theme, @C12579k String str, @C0330d1 int i, @C0354l int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(str, "attrName");
        C17453d i3 = C17483q.m80233i(typedArray, this.f37860a, theme, str, i, i2);
        mo43226r(typedArray.getChangingConfigurations());
        Intrinsics.checkNotNullExpressionValue(i3, "result");
        return i3;
    }

    /* renamed from: l */
    public final float mo43220l(@C12579k TypedArray typedArray, @C12579k String str, @C0330d1 int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(str, "attrName");
        float j = C17483q.m80234j(typedArray, this.f37860a, str, i, f);
        mo43226r(typedArray.getChangingConfigurations());
        return j;
    }

    /* renamed from: m */
    public final int mo43221m(@C12579k TypedArray typedArray, @C12579k String str, @C0330d1 int i, int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(str, "attrName");
        int k = C17483q.m80235k(typedArray, this.f37860a, str, i, i2);
        mo43226r(typedArray.getChangingConfigurations());
        return k;
    }

    @C12580l
    /* renamed from: n */
    public final String mo43222n(@C12579k TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        String string = typedArray.getString(i);
        mo43226r(typedArray.getChangingConfigurations());
        return string;
    }

    @C12579k
    /* renamed from: o */
    public final XmlPullParser mo43223o() {
        return this.f37860a;
    }

    @C12579k
    /* renamed from: p */
    public final TypedArray mo43224p(@C12579k Resources resources, @C12580l Resources.Theme theme, @C12579k AttributeSet attributeSet, @C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(resources, "res");
        Intrinsics.checkNotNullParameter(attributeSet, "set");
        Intrinsics.checkNotNullParameter(iArr, "attrs");
        TypedArray s = C17483q.m80243s(resources, theme, attributeSet, iArr);
        Intrinsics.checkNotNullExpressionValue(s, "obtainAttributes(\n      …          attrs\n        )");
        mo43226r(s.getChangingConfigurations());
        return s;
    }

    /* renamed from: q */
    public final void mo43225q(int i) {
        this.f37861b = i;
    }

    /* renamed from: r */
    public final void mo43226r(int i) {
        this.f37861b = i | this.f37861b;
    }

    @C12579k
    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f37860a + ", config=" + this.f37861b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15344a(XmlPullParser xmlPullParser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
