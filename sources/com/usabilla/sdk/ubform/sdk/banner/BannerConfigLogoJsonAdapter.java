package com.usabilla.sdk.ubform.sdk.banner;

import com.squareup.moshi.C35384h;
import com.squareup.moshi.C35407q;
import com.squareup.moshi.C35410s;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.C35393c;
import java.lang.reflect.Constructor;
import kotlin.C11076d0;
import kotlin.collections.C10930d1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigLogoJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigLogo;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "a", "Lcom/squareup/moshi/q;", "writer", "value_", "Lkotlin/d2;", "b", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "", "c", "intAdapter", "Ljava/lang/reflect/Constructor;", "d", "Ljava/lang/reflect/Constructor;", "constructorRef", "Lcom/squareup/moshi/s;", "moshi", "<init>", "(Lcom/squareup/moshi/s;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class BannerConfigLogoJsonAdapter extends C35384h<BannerConfigLogo> {
    @C12579k

    /* renamed from: a */
    public final JsonReader.C35351b f27236a;
    @C12579k

    /* renamed from: b */
    public final C35384h<String> f27237b;
    @C12579k

    /* renamed from: c */
    public final C35384h<Integer> f27238c;
    @C12580l

    /* renamed from: d */
    public volatile Constructor<BannerConfigLogo> f27239d;

    public BannerConfigLogoJsonAdapter(@C12579k C35410s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "moshi");
        JsonReader.C35351b a = JsonReader.C35351b.m145735a("assetName", "height", "width", "leftMargin", "topMargin", "rightMargin", "bottomMargin");
        Intrinsics.checkNotNullExpressionValue(a, "of(\"assetName\", \"height\", \"width\",\n      \"leftMargin\", \"topMargin\", \"rightMargin\", \"bottomMargin\")");
        this.f27236a = a;
        C35384h<String> g = sVar.mo106089g(String.class, C10930d1.m40892k(), "assetName");
        Intrinsics.checkNotNullExpressionValue(g, "moshi.adapter(String::class.java,\n      emptySet(), \"assetName\")");
        this.f27237b = g;
        C35384h<Integer> g2 = sVar.mo106089g(Integer.TYPE, C10930d1.m40892k(), "height");
        Intrinsics.checkNotNullExpressionValue(g2, "moshi.adapter(Int::class.java, emptySet(), \"height\")");
        this.f27238c = g2;
    }

    @C12579k
    /* renamed from: a */
    public BannerConfigLogo fromJson(@C12579k JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Intrinsics.checkNotNullParameter(jsonReader2, "reader");
        Integer num = 0;
        jsonReader.mo105873b();
        Integer num2 = num;
        Integer num3 = num2;
        Integer num4 = num3;
        Integer num5 = num4;
        int i = -1;
        String str = null;
        Integer num6 = num5;
        while (jsonReader.mo105877g()) {
            switch (jsonReader2.mo105893x(this.f27236a)) {
                case -1:
                    jsonReader.mo105867D();
                    jsonReader.mo105868E();
                    break;
                case 0:
                    str = this.f27237b.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    num = this.f27238c.fromJson(jsonReader2);
                    if (num != null) {
                        i &= -3;
                        break;
                    } else {
                        JsonDataException z = C35393c.m145827z("height", "height", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z, "unexpectedNull(\"height\", \"height\",\n              reader)");
                        throw z;
                    }
                case 2:
                    num6 = this.f27238c.fromJson(jsonReader2);
                    if (num6 != null) {
                        i &= -5;
                        break;
                    } else {
                        JsonDataException z2 = C35393c.m145827z("width", "width", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z2, "unexpectedNull(\"width\", \"width\", reader)");
                        throw z2;
                    }
                case 3:
                    num2 = this.f27238c.fromJson(jsonReader2);
                    if (num2 != null) {
                        i &= -9;
                        break;
                    } else {
                        JsonDataException z3 = C35393c.m145827z("leftMargin", "leftMargin", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z3, "unexpectedNull(\"leftMargin\",\n              \"leftMargin\", reader)");
                        throw z3;
                    }
                case 4:
                    num3 = this.f27238c.fromJson(jsonReader2);
                    if (num3 != null) {
                        i &= -17;
                        break;
                    } else {
                        JsonDataException z4 = C35393c.m145827z("topMargin", "topMargin", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z4, "unexpectedNull(\"topMargin\",\n              \"topMargin\", reader)");
                        throw z4;
                    }
                case 5:
                    num4 = this.f27238c.fromJson(jsonReader2);
                    if (num4 != null) {
                        i &= -33;
                        break;
                    } else {
                        JsonDataException z5 = C35393c.m145827z("rightMargin", "rightMargin", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z5, "unexpectedNull(\"rightMargin\",\n              \"rightMargin\", reader)");
                        throw z5;
                    }
                case 6:
                    num5 = this.f27238c.fromJson(jsonReader2);
                    if (num5 != null) {
                        i &= -65;
                        break;
                    } else {
                        JsonDataException z6 = C35393c.m145827z("bottomMargin", "bottomMargin", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z6, "unexpectedNull(\"bottomMargin\",\n              \"bottomMargin\", reader)");
                        throw z6;
                    }
            }
        }
        jsonReader.mo105875d();
        if (i == -128) {
            return new BannerConfigLogo(str, num.intValue(), num6.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue());
        }
        Constructor<BannerConfigLogo> constructor = this.f27239d;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = BannerConfigLogo.class.getDeclaredConstructor(new Class[]{String.class, cls, cls, cls, cls, cls, cls, cls, C35393c.f86952c});
            this.f27239d = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "BannerConfigLogo::class.java.getDeclaredConstructor(String::class.java,\n          Int::class.javaPrimitiveType, Int::class.javaPrimitiveType, Int::class.javaPrimitiveType,\n          Int::class.javaPrimitiveType, Int::class.javaPrimitiveType, Int::class.javaPrimitiveType,\n          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {\n          this.constructorRef = it }");
        }
        BannerConfigLogo newInstance = constructor.newInstance(new Object[]{str, num, num6, num2, num3, num4, num5, Integer.valueOf(i), null});
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInstance(\n          assetName,\n          height,\n          width,\n          leftMargin,\n          topMargin,\n          rightMargin,\n          bottomMargin,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    /* renamed from: b */
    public void toJson(@C12579k C35407q qVar, @C12580l BannerConfigLogo bannerConfigLogo) {
        Intrinsics.checkNotNullParameter(qVar, "writer");
        if (bannerConfigLogo != null) {
            qVar.mo106040c();
            qVar.mo106045n("assetName");
            this.f27237b.toJson(qVar, bannerConfigLogo.mo20575j());
            qVar.mo106045n("height");
            this.f27238c.toJson(qVar, Integer.valueOf(bannerConfigLogo.getHeight()));
            qVar.mo106045n("width");
            this.f27238c.toJson(qVar, Integer.valueOf(bannerConfigLogo.getWidth()));
            qVar.mo106045n("leftMargin");
            this.f27238c.toJson(qVar, Integer.valueOf(bannerConfigLogo.mo20578m()));
            qVar.mo106045n("topMargin");
            this.f27238c.toJson(qVar, Integer.valueOf(bannerConfigLogo.mo20580o()));
            qVar.mo106045n("rightMargin");
            this.f27238c.toJson(qVar, Integer.valueOf(bannerConfigLogo.mo20579n()));
            qVar.mo106045n("bottomMargin");
            this.f27238c.toJson(qVar, Integer.valueOf(bannerConfigLogo.mo20577l()));
            qVar.mo106044i();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BannerConfigLogo");
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
