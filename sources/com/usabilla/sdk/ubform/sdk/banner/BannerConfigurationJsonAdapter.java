package com.usabilla.sdk.ubform.sdk.banner;

import androidx.core.app.C17075f2;
import com.squareup.moshi.C35384h;
import com.squareup.moshi.C35407q;
import com.squareup.moshi.C35410s;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.C35393c;
import java.lang.reflect.Constructor;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10930d1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006("}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigurationJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfiguration;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "a", "Lcom/squareup/moshi/q;", "writer", "value_", "Lkotlin/d2;", "b", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/squareup/moshi/JsonReader$b;", "options", "", "Lcom/squareup/moshi/h;", "booleanAdapter", "c", "nullableStringAdapter", "", "d", "intAdapter", "e", "nullableIntAdapter", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigLogo;", "f", "bannerConfigLogoAdapter", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigNavigation;", "g", "bannerConfigNavigationAdapter", "Ljava/lang/reflect/Constructor;", "h", "Ljava/lang/reflect/Constructor;", "constructorRef", "Lcom/squareup/moshi/s;", "moshi", "<init>", "(Lcom/squareup/moshi/s;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class BannerConfigurationJsonAdapter extends C35384h<BannerConfiguration> {
    @C12579k

    /* renamed from: a */
    public final JsonReader.C35351b f27295a;
    @C12579k

    /* renamed from: b */
    public final C35384h<Boolean> f27296b;
    @C12579k

    /* renamed from: c */
    public final C35384h<String> f27297c;
    @C12579k

    /* renamed from: d */
    public final C35384h<Integer> f27298d;
    @C12579k

    /* renamed from: e */
    public final C35384h<Integer> f27299e;
    @C12579k

    /* renamed from: f */
    public final C35384h<BannerConfigLogo> f27300f;
    @C12579k

    /* renamed from: g */
    public final C35384h<BannerConfigNavigation> f27301g;
    @C12580l

    /* renamed from: h */
    public volatile Constructor<BannerConfiguration> f27302h;

    public BannerConfigurationJsonAdapter(@C12579k C35410s sVar) {
        C35410s sVar2 = sVar;
        Intrinsics.checkNotNullParameter(sVar2, "moshi");
        JsonReader.C35351b a = JsonReader.C35351b.m145735a("enableClickThrough", "contourBgAssetName", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "cornerRadius", "maxHeight", "maxWidth", "componentsDistance", "logo", C17075f2.f45106r0);
        Intrinsics.checkNotNullExpressionValue(a, "of(\"enableClickThrough\",\n      \"contourBgAssetName\", \"leftMargin\", \"topMargin\", \"rightMargin\", \"bottomMargin\", \"leftPadding\",\n      \"topPadding\", \"rightPadding\", \"bottomPadding\", \"cornerRadius\", \"maxHeight\", \"maxWidth\",\n      \"componentsDistance\", \"logo\", \"navigation\")");
        this.f27295a = a;
        C35384h<Boolean> g = sVar2.mo106089g(Boolean.TYPE, C10930d1.m40892k(), "enableClickThrough");
        Intrinsics.checkNotNullExpressionValue(g, "moshi.adapter(Boolean::class.java, emptySet(),\n      \"enableClickThrough\")");
        this.f27296b = g;
        C35384h<String> g2 = sVar2.mo106089g(String.class, C10930d1.m40892k(), "contourBgAssetName");
        Intrinsics.checkNotNullExpressionValue(g2, "moshi.adapter(String::class.java,\n      emptySet(), \"contourBgAssetName\")");
        this.f27297c = g2;
        C35384h<Integer> g3 = sVar2.mo106089g(Integer.TYPE, C10930d1.m40892k(), "leftMargin");
        Intrinsics.checkNotNullExpressionValue(g3, "moshi.adapter(Int::class.java, emptySet(),\n      \"leftMargin\")");
        this.f27298d = g3;
        C35384h<Integer> g4 = sVar2.mo106089g(Integer.class, C10930d1.m40892k(), "maxHeight");
        Intrinsics.checkNotNullExpressionValue(g4, "moshi.adapter(Int::class.javaObjectType,\n      emptySet(), \"maxHeight\")");
        this.f27299e = g4;
        C35384h<BannerConfigLogo> g5 = sVar2.mo106089g(BannerConfigLogo.class, C10930d1.m40892k(), "logo");
        Intrinsics.checkNotNullExpressionValue(g5, "moshi.adapter(BannerConfigLogo::class.java, emptySet(), \"logo\")");
        this.f27300f = g5;
        C35384h<BannerConfigNavigation> g6 = sVar2.mo106089g(BannerConfigNavigation.class, C10930d1.m40892k(), C17075f2.f45106r0);
        Intrinsics.checkNotNullExpressionValue(g6, "moshi.adapter(BannerConfigNavigation::class.java, emptySet(), \"navigation\")");
        this.f27301g = g6;
    }

    @C12579k
    /* renamed from: a */
    public BannerConfiguration fromJson(@C12579k JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Intrinsics.checkNotNullParameter(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        Integer num = 0;
        jsonReader.mo105873b();
        Integer num2 = num;
        Integer num3 = num2;
        Integer num4 = num3;
        Integer num5 = num4;
        Integer num6 = num5;
        Integer num7 = num6;
        Integer num8 = num7;
        Integer num9 = num8;
        int i = -1;
        String str = null;
        Integer num10 = null;
        Integer num11 = null;
        BannerConfigLogo bannerConfigLogo = null;
        BannerConfigNavigation bannerConfigNavigation = null;
        Integer num12 = num9;
        while (jsonReader.mo105877g()) {
            switch (jsonReader2.mo105893x(this.f27295a)) {
                case -1:
                    jsonReader.mo105867D();
                    jsonReader.mo105868E();
                    break;
                case 0:
                    bool = this.f27296b.fromJson(jsonReader2);
                    if (bool != null) {
                        i &= -2;
                        break;
                    } else {
                        JsonDataException z = C35393c.m145827z("enableClickThrough", "enableClickThrough", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z, "unexpectedNull(\"enableClickThrough\", \"enableClickThrough\", reader)");
                        throw z;
                    }
                case 1:
                    str = this.f27297c.fromJson(jsonReader2);
                    break;
                case 2:
                    num = this.f27298d.fromJson(jsonReader2);
                    if (num != null) {
                        i &= -5;
                        break;
                    } else {
                        JsonDataException z2 = C35393c.m145827z("leftMargin", "leftMargin", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z2, "unexpectedNull(\"leftMargin\",\n              \"leftMargin\", reader)");
                        throw z2;
                    }
                case 3:
                    num12 = this.f27298d.fromJson(jsonReader2);
                    if (num12 != null) {
                        i &= -9;
                        break;
                    } else {
                        JsonDataException z3 = C35393c.m145827z("topMargin", "topMargin", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z3, "unexpectedNull(\"topMargin\",\n              \"topMargin\", reader)");
                        throw z3;
                    }
                case 4:
                    num2 = this.f27298d.fromJson(jsonReader2);
                    if (num2 != null) {
                        i &= -17;
                        break;
                    } else {
                        JsonDataException z4 = C35393c.m145827z("rightMargin", "rightMargin", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z4, "unexpectedNull(\"rightMargin\",\n              \"rightMargin\", reader)");
                        throw z4;
                    }
                case 5:
                    num3 = this.f27298d.fromJson(jsonReader2);
                    if (num3 != null) {
                        i &= -33;
                        break;
                    } else {
                        JsonDataException z5 = C35393c.m145827z("bottomMargin", "bottomMargin", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z5, "unexpectedNull(\"bottomMargin\",\n              \"bottomMargin\", reader)");
                        throw z5;
                    }
                case 6:
                    num4 = this.f27298d.fromJson(jsonReader2);
                    if (num4 != null) {
                        i &= -65;
                        break;
                    } else {
                        JsonDataException z6 = C35393c.m145827z("leftPadding", "leftPadding", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z6, "unexpectedNull(\"leftPadding\",\n              \"leftPadding\", reader)");
                        throw z6;
                    }
                case 7:
                    num5 = this.f27298d.fromJson(jsonReader2);
                    if (num5 != null) {
                        i &= -129;
                        break;
                    } else {
                        JsonDataException z7 = C35393c.m145827z("topPadding", "topPadding", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z7, "unexpectedNull(\"topPadding\",\n              \"topPadding\", reader)");
                        throw z7;
                    }
                case 8:
                    num6 = this.f27298d.fromJson(jsonReader2);
                    if (num6 != null) {
                        i &= -257;
                        break;
                    } else {
                        JsonDataException z8 = C35393c.m145827z("rightPadding", "rightPadding", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z8, "unexpectedNull(\"rightPadding\",\n              \"rightPadding\", reader)");
                        throw z8;
                    }
                case 9:
                    num7 = this.f27298d.fromJson(jsonReader2);
                    if (num7 != null) {
                        i &= -513;
                        break;
                    } else {
                        JsonDataException z9 = C35393c.m145827z("bottomPadding", "bottomPadding", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z9, "unexpectedNull(\"bottomPadding\",\n              \"bottomPadding\", reader)");
                        throw z9;
                    }
                case 10:
                    num8 = this.f27298d.fromJson(jsonReader2);
                    if (num8 != null) {
                        i &= -1025;
                        break;
                    } else {
                        JsonDataException z10 = C35393c.m145827z("cornerRadius", "cornerRadius", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z10, "unexpectedNull(\"cornerRadius\",\n              \"cornerRadius\", reader)");
                        throw z10;
                    }
                case 11:
                    num10 = this.f27299e.fromJson(jsonReader2);
                    i &= -2049;
                    break;
                case 12:
                    num11 = this.f27299e.fromJson(jsonReader2);
                    i &= -4097;
                    break;
                case 13:
                    num9 = this.f27298d.fromJson(jsonReader2);
                    if (num9 != null) {
                        i &= -8193;
                        break;
                    } else {
                        JsonDataException z11 = C35393c.m145827z("componentsDistance", "componentsDistance", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z11, "unexpectedNull(\"componentsDistance\", \"componentsDistance\", reader)");
                        throw z11;
                    }
                case 14:
                    bannerConfigLogo = this.f27300f.fromJson(jsonReader2);
                    if (bannerConfigLogo != null) {
                        i &= -16385;
                        break;
                    } else {
                        JsonDataException z12 = C35393c.m145827z("logo", "logo", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z12, "unexpectedNull(\"logo\",\n              \"logo\", reader)");
                        throw z12;
                    }
                case 15:
                    bannerConfigNavigation = this.f27301g.fromJson(jsonReader2);
                    if (bannerConfigNavigation != null) {
                        i &= -32769;
                        break;
                    } else {
                        JsonDataException z13 = C35393c.m145827z(C17075f2.f45106r0, C17075f2.f45106r0, jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z13, "unexpectedNull(\"navigation\", \"navigation\", reader)");
                        throw z13;
                    }
            }
        }
        jsonReader.mo105875d();
        if (i == -65534) {
            boolean booleanValue = bool.booleanValue();
            int intValue = num.intValue();
            int intValue2 = num12.intValue();
            int intValue3 = num2.intValue();
            int intValue4 = num3.intValue();
            int intValue5 = num4.intValue();
            int intValue6 = num5.intValue();
            int intValue7 = num6.intValue();
            int intValue8 = num7.intValue();
            int intValue9 = num8.intValue();
            int intValue10 = num9.intValue();
            if (bannerConfigLogo == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.usabilla.sdk.ubform.sdk.banner.BannerConfigLogo");
            } else if (bannerConfigNavigation != null) {
                return new BannerConfiguration(booleanValue, str, intValue, intValue2, intValue3, intValue4, intValue5, intValue6, intValue7, intValue8, intValue9, num10, num11, intValue10, bannerConfigLogo, bannerConfigNavigation);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.usabilla.sdk.ubform.sdk.banner.BannerConfigNavigation");
            }
        } else {
            Constructor<BannerConfiguration> constructor = this.f27302h;
            if (constructor == null) {
                Class cls = Integer.TYPE;
                Class<Integer> cls2 = Integer.class;
                constructor = BannerConfiguration.class.getDeclaredConstructor(new Class[]{Boolean.TYPE, String.class, cls, cls, cls, cls, cls, cls, cls, cls, cls, cls2, cls2, cls, BannerConfigLogo.class, BannerConfigNavigation.class, cls, C35393c.f86952c});
                this.f27302h = constructor;
                C11079d2 d2Var = C11079d2.f28267a;
                Intrinsics.checkNotNullExpressionValue(constructor, "BannerConfiguration::class.java.getDeclaredConstructor(Boolean::class.javaPrimitiveType,\n          String::class.java, Int::class.javaPrimitiveType, Int::class.javaPrimitiveType,\n          Int::class.javaPrimitiveType, Int::class.javaPrimitiveType, Int::class.javaPrimitiveType,\n          Int::class.javaPrimitiveType, Int::class.javaPrimitiveType, Int::class.javaPrimitiveType,\n          Int::class.javaPrimitiveType, Int::class.javaObjectType, Int::class.javaObjectType,\n          Int::class.javaPrimitiveType, BannerConfigLogo::class.java,\n          BannerConfigNavigation::class.java, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
            }
            BannerConfiguration newInstance = constructor.newInstance(new Object[]{bool, str, num, num12, num2, num3, num4, num5, num6, num7, num8, num10, num11, num9, bannerConfigLogo, bannerConfigNavigation, Integer.valueOf(i), null});
            Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInstance(\n          enableClickThrough,\n          contourBgAssetName,\n          leftMargin,\n          topMargin,\n          rightMargin,\n          bottomMargin,\n          leftPadding,\n          topPadding,\n          rightPadding,\n          bottomPadding,\n          cornerRadius,\n          maxHeight,\n          maxWidth,\n          componentsDistance,\n          logo,\n          navigation,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
            return newInstance;
        }
    }

    /* renamed from: b */
    public void toJson(@C12579k C35407q qVar, @C12580l BannerConfiguration bannerConfiguration) {
        Intrinsics.checkNotNullParameter(qVar, "writer");
        if (bannerConfiguration != null) {
            qVar.mo106040c();
            qVar.mo106045n("enableClickThrough");
            this.f27296b.toJson(qVar, Boolean.valueOf(bannerConfiguration.mo20666f()));
            qVar.mo106045n("contourBgAssetName");
            this.f27297c.toJson(qVar, bannerConfiguration.mo20663d());
            qVar.mo106045n("leftMargin");
            this.f27298d.toJson(qVar, Integer.valueOf(bannerConfiguration.mo20667g()));
            qVar.mo106045n("topMargin");
            this.f27298d.toJson(qVar, Integer.valueOf(bannerConfiguration.mo20675o()));
            qVar.mo106045n("rightMargin");
            this.f27298d.toJson(qVar, Integer.valueOf(bannerConfiguration.mo20673m()));
            qVar.mo106045n("bottomMargin");
            this.f27298d.toJson(qVar, Integer.valueOf(bannerConfiguration.mo20660a()));
            qVar.mo106045n("leftPadding");
            this.f27298d.toJson(qVar, Integer.valueOf(bannerConfiguration.mo20668h()));
            qVar.mo106045n("topPadding");
            this.f27298d.toJson(qVar, Integer.valueOf(bannerConfiguration.mo20676p()));
            qVar.mo106045n("rightPadding");
            this.f27298d.toJson(qVar, Integer.valueOf(bannerConfiguration.mo20674n()));
            qVar.mo106045n("bottomPadding");
            this.f27298d.toJson(qVar, Integer.valueOf(bannerConfiguration.mo20661b()));
            qVar.mo106045n("cornerRadius");
            this.f27298d.toJson(qVar, Integer.valueOf(bannerConfiguration.mo20665e()));
            qVar.mo106045n("maxHeight");
            this.f27299e.toJson(qVar, bannerConfiguration.mo20670j());
            qVar.mo106045n("maxWidth");
            this.f27299e.toJson(qVar, bannerConfiguration.mo20671k());
            qVar.mo106045n("componentsDistance");
            this.f27298d.toJson(qVar, Integer.valueOf(bannerConfiguration.mo20662c()));
            qVar.mo106045n("logo");
            this.f27300f.toJson(qVar, bannerConfiguration.mo20669i());
            qVar.mo106045n(C17075f2.f45106r0);
            this.f27301g.toJson(qVar, bannerConfiguration.mo20672l());
            qVar.mo106044i();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BannerConfiguration");
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
