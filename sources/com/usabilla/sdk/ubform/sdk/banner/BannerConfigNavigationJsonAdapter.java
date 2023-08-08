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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigNavigationJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/usabilla/sdk/ubform/sdk/banner/BannerConfigNavigation;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "a", "Lcom/squareup/moshi/q;", "writer", "value_", "Lkotlin/d2;", "b", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "", "c", "intAdapter", "d", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "e", "Ljava/lang/reflect/Constructor;", "constructorRef", "Lcom/squareup/moshi/s;", "moshi", "<init>", "(Lcom/squareup/moshi/s;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class BannerConfigNavigationJsonAdapter extends C35384h<BannerConfigNavigation> {
    @C12579k

    /* renamed from: a */
    public final JsonReader.C35351b f27253a;
    @C12579k

    /* renamed from: b */
    public final C35384h<String> f27254b;
    @C12579k

    /* renamed from: c */
    public final C35384h<Integer> f27255c;
    @C12579k

    /* renamed from: d */
    public final C35384h<Integer> f27256d;
    @C12580l

    /* renamed from: e */
    public volatile Constructor<BannerConfigNavigation> f27257e;

    public BannerConfigNavigationJsonAdapter(@C12579k C35410s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "moshi");
        JsonReader.C35351b a = JsonReader.C35351b.m145735a("continueButtonBgAssetName", "continueButtonTextColor", "cancelButtonBgAssetName", "cancelButtonTextColor", "marginBetween", "marginLeft", "marginRight");
        Intrinsics.checkNotNullExpressionValue(a, "of(\"continueButtonBgAssetName\",\n      \"continueButtonTextColor\", \"cancelButtonBgAssetName\", \"cancelButtonTextColor\",\n      \"marginBetween\", \"marginLeft\", \"marginRight\")");
        this.f27253a = a;
        C35384h<String> g = sVar.mo106089g(String.class, C10930d1.m40892k(), "continueButtonBgAssetName");
        Intrinsics.checkNotNullExpressionValue(g, "moshi.adapter(String::class.java,\n      emptySet(), \"continueButtonBgAssetName\")");
        this.f27254b = g;
        C35384h<Integer> g2 = sVar.mo106089g(Integer.TYPE, C10930d1.m40892k(), "marginBetween");
        Intrinsics.checkNotNullExpressionValue(g2, "moshi.adapter(Int::class.java, emptySet(),\n      \"marginBetween\")");
        this.f27255c = g2;
        C35384h<Integer> g3 = sVar.mo106089g(Integer.class, C10930d1.m40892k(), "marginLeft");
        Intrinsics.checkNotNullExpressionValue(g3, "moshi.adapter(Int::class.javaObjectType,\n      emptySet(), \"marginLeft\")");
        this.f27256d = g3;
    }

    @C12579k
    /* renamed from: a */
    public BannerConfigNavigation fromJson(@C12579k JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Intrinsics.checkNotNullParameter(jsonReader2, "reader");
        jsonReader.mo105873b();
        int i = -1;
        Integer num = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (jsonReader.mo105877g()) {
            switch (jsonReader2.mo105893x(this.f27253a)) {
                case -1:
                    jsonReader.mo105867D();
                    jsonReader.mo105868E();
                    break;
                case 0:
                    str = this.f27254b.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    str2 = this.f27254b.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str3 = this.f27254b.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 3:
                    str4 = this.f27254b.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 4:
                    num = this.f27255c.fromJson(jsonReader2);
                    if (num != null) {
                        i &= -129;
                        break;
                    } else {
                        JsonDataException z = C35393c.m145827z("marginBetween", "marginBetween", jsonReader2);
                        Intrinsics.checkNotNullExpressionValue(z, "unexpectedNull(\"marginBetween\",\n              \"marginBetween\", reader)");
                        throw z;
                    }
                case 5:
                    num2 = this.f27256d.fromJson(jsonReader2);
                    i &= -257;
                    break;
                case 6:
                    num3 = this.f27256d.fromJson(jsonReader2);
                    i &= -513;
                    break;
            }
        }
        jsonReader.mo105875d();
        if (i == -924) {
            return new BannerConfigNavigation(str, str2, (String) null, str3, str4, (String) null, 0, num.intValue(), num2, num3, 100, (DefaultConstructorMarker) null);
        }
        Constructor<BannerConfigNavigation> constructor = this.f27257e;
        if (constructor == null) {
            Class<String> cls = String.class;
            Class cls2 = Integer.TYPE;
            Class<Integer> cls3 = Integer.class;
            constructor = BannerConfigNavigation.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, cls, cls, cls2, cls2, cls3, cls3, cls2, C35393c.f86952c});
            this.f27257e = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "BannerConfigNavigation::class.java.getDeclaredConstructor(String::class.java,\n          String::class.java, String::class.java, String::class.java, String::class.java,\n          String::class.java, Int::class.javaPrimitiveType, Int::class.javaPrimitiveType,\n          Int::class.javaObjectType, Int::class.javaObjectType, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        BannerConfigNavigation newInstance = constructor.newInstance(new Object[]{str, str2, null, str3, str4, null, 0, num, num2, num3, Integer.valueOf(i), null});
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInstance(\n          continueButtonBgAssetName,\n          continueButtonTextColor,\n          /* continueButtonMessage */ null,\n          cancelButtonBgAssetName,\n          cancelButtonTextColor,\n          /* cancelButtonMessage */ null,\n          /* buttonCornerRadius */ 0,\n          marginBetween,\n          marginLeft,\n          marginRight,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    /* renamed from: b */
    public void toJson(@C12579k C35407q qVar, @C12580l BannerConfigNavigation bannerConfigNavigation) {
        Intrinsics.checkNotNullParameter(qVar, "writer");
        if (bannerConfigNavigation != null) {
            qVar.mo106040c();
            qVar.mo106045n("continueButtonBgAssetName");
            this.f27254b.toJson(qVar, bannerConfigNavigation.mo20616u());
            qVar.mo106045n("continueButtonTextColor");
            this.f27254b.toJson(qVar, bannerConfigNavigation.mo20619x());
            qVar.mo106045n("cancelButtonBgAssetName");
            this.f27254b.toJson(qVar, bannerConfigNavigation.mo20611p());
            qVar.mo106045n("cancelButtonTextColor");
            this.f27254b.toJson(qVar, bannerConfigNavigation.mo20613s());
            qVar.mo106045n("marginBetween");
            this.f27255c.toJson(qVar, Integer.valueOf(bannerConfigNavigation.mo20620y()));
            qVar.mo106045n("marginLeft");
            this.f27256d.toJson(qVar, bannerConfigNavigation.mo20621z());
            qVar.mo106045n("marginRight");
            this.f27256d.toJson(qVar, bannerConfigNavigation.mo20592A());
            qVar.mo106044i();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BannerConfigNavigation");
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
