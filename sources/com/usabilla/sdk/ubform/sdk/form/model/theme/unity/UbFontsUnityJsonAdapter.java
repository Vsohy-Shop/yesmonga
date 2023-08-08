package com.usabilla.sdk.ubform.sdk.form.model.theme.unity;

import com.squareup.moshi.C35384h;
import com.squareup.moshi.C35407q;
import com.squareup.moshi.C35410s;
import com.squareup.moshi.C35431v;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.C35393c;
import com.urbanairship.iam.C9168d0;
import java.lang.reflect.Constructor;
import kotlin.C11076d0;
import kotlin.collections.C10930d1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import unity.ForceToBoolean;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbFontsUnityJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/usabilla/sdk/ubform/sdk/form/model/theme/unity/UbFontsUnity;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/q;", "writer", "value_", "Lkotlin/d2;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "nullableStringAdapter", "Lcom/squareup/moshi/h;", "", "booleanAtForceToBooleanAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/s;", "moshi", "<init>", "(Lcom/squareup/moshi/s;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class UbFontsUnityJsonAdapter extends C35384h<UbFontsUnity> {
    @C12579k
    @ForceToBoolean
    private final C35384h<Boolean> booleanAtForceToBooleanAdapter;
    @C12580l
    private volatile Constructor<UbFontsUnity> constructorRef;
    @C12579k
    private final C35384h<Integer> intAdapter;
    @C12579k
    private final C35384h<String> nullableStringAdapter;
    @C12579k
    private final JsonReader.C35351b options;

    public UbFontsUnityJsonAdapter(@C12579k C35410s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "moshi");
        JsonReader.C35351b a = JsonReader.C35351b.m145735a("regular", C9168d0.f24882G0, "titleSize", "textSize", "miniSize");
        Intrinsics.checkNotNullExpressionValue(a, "of(\"regular\", \"bold\", \"titleSize\",\n      \"textSize\", \"miniSize\")");
        this.options = a;
        C35384h<String> g = sVar.mo106089g(String.class, C10930d1.m40892k(), "regular");
        Intrinsics.checkNotNullExpressionValue(g, "moshi.adapter(String::class.java,\n      emptySet(), \"regular\")");
        this.nullableStringAdapter = g;
        C35384h<Boolean> g2 = sVar.mo106089g(Boolean.TYPE, C35431v.m146021h(UbFontsUnityJsonAdapter.class, "booleanAtForceToBooleanAdapter"), C9168d0.f24882G0);
        Intrinsics.checkNotNullExpressionValue(g2, "moshi.adapter(Boolean::class.java, Types.getFieldJsonQualifierAnnotations(javaClass,\n      \"booleanAtForceToBooleanAdapter\"), \"bold\")");
        this.booleanAtForceToBooleanAdapter = g2;
        C35384h<Integer> g3 = sVar.mo106089g(Integer.TYPE, C10930d1.m40892k(), "titleSize");
        Intrinsics.checkNotNullExpressionValue(g3, "moshi.adapter(Int::class.java, emptySet(), \"titleSize\")");
        this.intAdapter = g3;
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("UbFontsUnity");
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @C12579k
    public UbFontsUnity fromJson(@C12579k JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Intrinsics.checkNotNullParameter(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        Integer num = 0;
        jsonReader.mo105873b();
        Integer num2 = num;
        Integer num3 = num2;
        int i = -1;
        String str = null;
        while (jsonReader.mo105877g()) {
            int x = jsonReader2.mo105893x(this.options);
            if (x == -1) {
                jsonReader.mo105867D();
                jsonReader.mo105868E();
            } else if (x == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (x == 1) {
                bool = this.booleanAtForceToBooleanAdapter.fromJson(jsonReader2);
                if (bool != null) {
                    i &= -3;
                } else {
                    JsonDataException z = C35393c.m145827z(C9168d0.f24882G0, C9168d0.f24882G0, jsonReader2);
                    Intrinsics.checkNotNullExpressionValue(z, "unexpectedNull(\"bold\", \"bold\", reader)");
                    throw z;
                }
            } else if (x == 2) {
                num = this.intAdapter.fromJson(jsonReader2);
                if (num != null) {
                    i &= -5;
                } else {
                    JsonDataException z2 = C35393c.m145827z("titleSize", "titleSize", jsonReader2);
                    Intrinsics.checkNotNullExpressionValue(z2, "unexpectedNull(\"titleSize\",\n              \"titleSize\", reader)");
                    throw z2;
                }
            } else if (x == 3) {
                num2 = this.intAdapter.fromJson(jsonReader2);
                if (num2 != null) {
                    i &= -9;
                } else {
                    JsonDataException z3 = C35393c.m145827z("textSize", "textSize", jsonReader2);
                    Intrinsics.checkNotNullExpressionValue(z3, "unexpectedNull(\"textSize\",\n              \"textSize\", reader)");
                    throw z3;
                }
            } else if (x == 4) {
                num3 = this.intAdapter.fromJson(jsonReader2);
                if (num3 != null) {
                    i &= -17;
                } else {
                    JsonDataException z4 = C35393c.m145827z("miniSize", "miniSize", jsonReader2);
                    Intrinsics.checkNotNullExpressionValue(z4, "unexpectedNull(\"miniSize\",\n              \"miniSize\", reader)");
                    throw z4;
                }
            } else {
                continue;
            }
        }
        jsonReader.mo105875d();
        if (i == -32) {
            return new UbFontsUnity(str, bool.booleanValue(), num.intValue(), num2.intValue(), num3.intValue());
        }
        Constructor<UbFontsUnity> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = UbFontsUnity.class.getDeclaredConstructor(new Class[]{String.class, Boolean.TYPE, cls, cls, cls, cls, C35393c.f86952c});
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "UbFontsUnity::class.java.getDeclaredConstructor(String::class.java,\n          Boolean::class.javaPrimitiveType, Int::class.javaPrimitiveType,\n          Int::class.javaPrimitiveType, Int::class.javaPrimitiveType, Int::class.javaPrimitiveType,\n          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }");
        }
        UbFontsUnity newInstance = constructor.newInstance(new Object[]{str, bool, num, num2, num3, Integer.valueOf(i), null});
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInstance(\n          regular,\n          bold,\n          titleSize,\n          textSize,\n          miniSize,\n          mask0,\n          /* DefaultConstructorMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(@C12579k C35407q qVar, @C12580l UbFontsUnity ubFontsUnity) {
        Intrinsics.checkNotNullParameter(qVar, "writer");
        if (ubFontsUnity != null) {
            qVar.mo106040c();
            qVar.mo106045n("regular");
            this.nullableStringAdapter.toJson(qVar, ubFontsUnity.getRegular());
            qVar.mo106045n(C9168d0.f24882G0);
            this.booleanAtForceToBooleanAdapter.toJson(qVar, Boolean.valueOf(ubFontsUnity.getBold()));
            qVar.mo106045n("titleSize");
            this.intAdapter.toJson(qVar, Integer.valueOf(ubFontsUnity.getTitleSize()));
            qVar.mo106045n("textSize");
            this.intAdapter.toJson(qVar, Integer.valueOf(ubFontsUnity.getTextSize()));
            qVar.mo106045n("miniSize");
            this.intAdapter.toJson(qVar, Integer.valueOf(ubFontsUnity.getMiniSize()));
            qVar.mo106044i();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
